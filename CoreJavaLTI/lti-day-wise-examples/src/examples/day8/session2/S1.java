package examples.day8.session2;

import java.util.*;

@SuppressWarnings("serial")
class InvalidQuantityException extends Exception{
	public InvalidQuantityException(String err) { super(err); }    
}

class Book{
    private String id;
    private String bookTitle;
    private String authorName;
    private float price;
    private int quantity;
    
    Book(){
        this("","","",0.0f,0);
    }
    
    Book(String id, String bookTitle, String authorName, float price, int quantity){
        this.id = id;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.quantity = quantity;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getId(){
        return id;
    }
    
    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }
    
    public String getBookTitle(){
        return bookTitle;
    }
    
    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }
    
    public String getAuthorName(){
        return authorName;
    }
    
    
    public void setPrice(float price){
        this.price = price;
    }
    
    public float getPrice(){
        return price;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public void purchase(int quantity) throws InvalidQuantityException{
        if(quantity > this.quantity)
            throw new InvalidQuantityException("InvalidQuantityException: Quantity not available");
            
        this.quantity = this.quantity - quantity;
    }
}

public class S1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        try{
            Book book = new Book();
            book.setId(scan.nextLine());
            book.setBookTitle(scan.nextLine());
            book.setAuthorName(scan.nextLine());
            book.setPrice(scan.nextFloat());
            book.setQuantity(scan.nextInt());
            book.purchase(scan.nextInt());
            System.out.println("Quantity Available : "+book.getQuantity());
            scan.close();
        }catch(InvalidQuantityException e){
            System.out.println(e.getMessage());
        }
    }
    
}

