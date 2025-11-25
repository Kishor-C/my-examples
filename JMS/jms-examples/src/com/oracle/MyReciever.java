package com.oracle;

import java.util.Hashtable;
import java.util.Scanner;

import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueReceiver;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;

import weblogic.jndi.WLInitialContextFactory;
public class MyReciever {

	public static void main(String[] args) {
		try { 
			// Hashtable provides location of the server & which server is used for communication
			Hashtable<String, String> env = new Hashtable<>();
			env.put(Context.PROVIDER_URL, "t3://localhost:7001");      // location of the server
			env.put(Context.INITIAL_CONTEXT_FACTORY, WLInitialContextFactory.class.getName());      //fully-qualified string of the class
			
			Context ctx = new InitialContext(env);       // Context helps in initializing the environment
			
			// Lookup for Connection factory & destination object
			QueueConnectionFactory qcf = (QueueConnectionFactory)ctx.lookup("MY_CF"); // since lookup returns Object we need to typecast
			Queue queue = (Queue)ctx.lookup("MY_Q");
			// Connect to the container & start the connection
			QueueConnection con = qcf.createQueueConnection();
			con.start(); // since connection is used by multiple threads, we use start() 
			// Open the session to send or recieve messages
			QueueSession session = con.createQueueSession(false, Session.AUTO_ACKNOWLEDGE); // 2 arguments - 1)transaction 2) delivery-notify
			
			// Create receiver
			QueueReceiver receiver = session.createReceiver(queue); // receives from MY_Q
			TextMessage msg = (TextMessage)receiver.receive(60000); // wait for 60s if sender has not sent the message
			
			// Object -> id, name, phone, persist=yes
			// jdbc / jpa / hibernate -> object -> 
			System.out.println("Message Received is: "+msg.getText());
			// close all the resources in LIFO order
			session.close();
			con.close();
		} catch(Exception e) { 
			e.printStackTrace();
		}


	}

}
