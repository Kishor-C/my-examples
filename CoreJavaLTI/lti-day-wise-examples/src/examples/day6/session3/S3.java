package examples.day6.session3;
//You are using Java
//You are using Java
import java.util.*;

class Movie{
 private String title;
 private int releaseYear;
 private double rating;
 
 Movie(){
     this("",0,0.0);
 }
 
 Movie(String title,int releaseYear, double rating){
     this.title = title;
     this.releaseYear = releaseYear;
     this.rating = rating;
 }
 
 public void setTitle(String title){
     this.title = title;
 }
 
 public String getTitle(){
     return title;
 }
 
 public void setReleaseYear(int releaseYear){
     this.releaseYear = releaseYear;
 }
 
 public int getReleaseYear(){
     return releaseYear;
 }
 
 public void setRating(double rating){
     this.rating = rating;
 }
 
 public double getRating(){
     return this.rating;
 }
 
 public String toString(){
     return "Title: "+title+", Release Year: "+releaseYear+", Rating: "+rating;
 }
}

class MovieComparator implements Comparator<Movie>{
 public int compare(Movie m1, Movie m2){
     if(m1.getRating() == m2.getRating())
         return 0;
     else if(m1.getRating() > m2.getRating())
         return 1;
     else
         return -1;
 }   
}

class S3{
 public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     
     int N = scan.nextInt();
     scan.nextLine();
     ArrayList<Movie> list = new ArrayList<Movie>();
     Movie movie;
     
     for(int i=1;i<=N;i++){
         movie = new Movie();
         movie.setTitle(scan.nextLine());
         movie.setReleaseYear(scan.nextInt());
         movie.setRating(scan.nextDouble());
         scan.nextLine();
         list.add(movie);
     }
     
     Collections.sort(list,new MovieComparator());
     
     list.forEach(System.out::println);
     scan.close();
 }
}




