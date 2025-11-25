package com.examples.session3;

//You are using Java
//You are using Java

import java.util.*;

class Transaction{
 private int transactionId;
 private double amount;
 
 Transaction(){
     this(0,0.0);
 }
 
 Transaction(int transactionId,double amount){
     this.transactionId = transactionId;
     this.amount = amount;
 }
 
 public void setTransactionId(int transactionId){
     this.transactionId = transactionId;
 }
 
 public int getTransactionId(){
     return this.transactionId;
 }
 
 public void setAmount(double amount){
     this.amount = amount;
 }
 
 public double getAmount(){
     return this.amount;
 }
 
 public String getTransactionInfo(){
     return "Transaction ID: "+transactionId+"\nAmount: $"+amount;
 }
}

class PeerToPeerTransaction extends Transaction {
 private String recipient;


 public void setRecipient(String recipient){
     this.recipient = recipient;
 }
 
 public String getRecipient(){
     return this.recipient;
 }
 
 public String getTransactionInfo(){
     String retVal = "Peer-to-Peer Transaction:\n"+super.getTransactionInfo();
     retVal = retVal + "\nRecipient: "+recipient;
     return retVal;
 }
}

class OnlinePurchaseTransaction extends Transaction{
 private String merchant;
 

 public void setMerchant(String merchant){
     this.merchant = merchant;
 }
 
 public String getMerchant(){
     return this.merchant;
 }
 
 public String getTransactionInfo(){
     String retVal = "Online Purchase Transaction:\n"+super.getTransactionInfo();
     retVal = retVal + "\nMerchant: "+merchant;
     return retVal;
 }
}

class BillPaymentTransaction extends Transaction {
 private String billType;
 
 public void setBillType(String billType){
     this.billType = billType;
 }
 
 public String getBillType(){
     return this.billType;
 }
 
 public String getTransactionInfo(){
     String retVal = "Bill Payment Transaction:\n"+super.getTransactionInfo();
     retVal = retVal + "\nBill Type: "+billType;
     return retVal;
 }
}

class S2{
 public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     int transactionId = scan.nextInt();
     double amount = scan.nextDouble();
     scan.nextLine();
     String recipient = scan.nextLine();
     String merchant = scan.nextLine();
     String billType = scan.nextLine();
     
     PeerToPeerTransaction p = new PeerToPeerTransaction();
     p.setTransactionId(transactionId);
     p.setAmount(amount);
     p.setRecipient(recipient);
     
     OnlinePurchaseTransaction o = new OnlinePurchaseTransaction();
     o.setTransactionId(transactionId);
     o.setAmount(amount);
     o.setMerchant(merchant);
     
     BillPaymentTransaction b = new BillPaymentTransaction();
     b.setTransactionId(transactionId);
     b.setAmount(amount);
     b.setBillType(billType);
     
     System.out.println(p.getTransactionInfo()+"\n");
     System.out.println(o.getTransactionInfo()+"\n");
     System.out.println(b.getTransactionInfo());
     scan.close();
     
 }
}