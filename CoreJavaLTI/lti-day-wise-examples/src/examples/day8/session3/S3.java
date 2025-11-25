package examples.day8.session3;


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
class DomainException extends Exception{
    public String toString(){
        return "DomainException: Invalid Domain";
    }
}


class Main{
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        boolean valid=false;
        try{
            String email=sc.next();
            int dot=0; int at=0;
            for(int i=0;i<email.length();i++){
                if(email.charAt(i)=='.') dot++;
                if(email.charAt(i)=='@') at++;
            }
            if(dot!=1)
            throw new DotException();
            if(at!=1)    
            throw new AtTheRateException();   
            if(!(email.endsWith(".net") || email.endsWith(".com") || email.endsWith(".net") || email.endsWith(".biz")))
            throw new DomainException();
            valid=true;
        
        }catch(DotException im){
            System.out.println(im);
        }catch(AtTheRateException il){
            System.out.println(il);
        }catch(DomainException il){
            System.out.println(il);
        }
        if(valid)
        System.out.println("Valid email address");
        else
        System.out.println("Invalid email address");
    }
    
   }

