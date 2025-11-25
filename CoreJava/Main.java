import java.util.*;
class AgeInvalidException extends Exception  {
    AgeInvalidException(){ super("Age is Invalid"); }
    AgeInvalidException(String err) { super(err); }
}
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        try { 
            int age = scan.nextInt(); // age = abc
            validateAge(age); // validateAge(17);
            System.out.println(age+" is valid");
        } catch(AgeInvalidException e) { // e = new AgeInvalidException(".....")
            System.out.println(e); // classname: message
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally block executes");
        }
        System.out.println("END of the program");
    }
    public static void validateAge(int age) throws AgeInvalidException{
        if(age < 18) {
            //throw new AgeInvalidException(); // message = Age is Invalid
            throw new AgeInvalidException(age+" is invalid because < 18"); // message = 15 is invalid because < 18
        }
        System.out.println("validateAge completes execution...");
    }
}