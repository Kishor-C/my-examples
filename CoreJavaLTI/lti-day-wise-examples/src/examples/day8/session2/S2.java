package examples.day8.session2;
//You are using Java
//You are using Java
import java.util.*;

class DotException extends Exception{
 public String toString(){
     return "DotException: Invalid Dot usage";
 }
}

class AtTheRateException extends Exception{
 public String toString(){
     return "AtTheRateException: Invalid @ usage";
 }
}

class DomainException extends Exception {
 public String toString(){
     return "DomainException: Invalid Domain";
 }
}

class S2{
 public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     boolean valid = false;
     
     try{
         String email = scan.nextLine();
         int countDot = 0;
         int countAt = 0;
         for(int i=0;i<email.length();i++)
         {
             if(email.charAt(i) == '.')
                 countDot++;
             if(email.charAt(i) == '@')
                 countAt++;
         }
         
         if(countDot != 1)
             throw new DotException();

         if(countAt != 1)
             throw new AtTheRateException();
             
         if(!(email.endsWith(".in") || email.endsWith(".com") || email.endsWith(".net") || email.endsWith(".biz")))
             throw new DomainException();
             
         valid = true;
     }catch(DotException e){
         System.out.println(e);
     }catch(AtTheRateException e){
         System.out.println(e);
     }catch(DomainException e){
         System.out.println(e);
     }
     if(valid)
         System.out.println("Valid email address");
     else
         System.out.println("Invalid email address");
 }
}