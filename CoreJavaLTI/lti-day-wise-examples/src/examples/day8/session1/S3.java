package examples.day8.session1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class S3 {
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        try{
            System.out.println(scan.nextInt());
        }catch(InputMismatchException e){
            System.out.println(e);
        }
        scan.close();
    }

}
