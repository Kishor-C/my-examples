package com.oracle;

import java.util.Hashtable;
import java.util.Scanner;

import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;

import weblogic.jndi.WLInitialContextFactory;

public class MySender {

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
			// Open the session to send or receive messages
			QueueSession session = con.createQueueSession(false, Session.AUTO_ACKNOWLEDGE); // 2 arguments - 1)transaction 2) delivery-notify
			// sender to send message
			QueueSender sender = session.createSender(queue); // takes the queue >> MY_Q
			// create a message - TextMessage, ObjectMessage, MapMessage & so on
			TextMessage msg = session.createTextMessage();
			System.out.println("Enter a message:-");
			Scanner scan = new Scanner(System.in);
			msg.setText(scan.nextLine()); // keyboard input is set as a body of the message
			sender.send(msg); // sends message to MY_Q present inside MY_CF
			// close all the resources in LIFO order
			scan.close();
			session.close();
			con.close();
		} catch(Exception e) { 
			e.printStackTrace();
		}
	}

}
