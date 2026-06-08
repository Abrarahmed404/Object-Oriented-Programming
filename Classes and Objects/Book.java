public class Book {

    String title;
    String author;
    int ISBN;
    String edition;
    
    Book(String title, String author, int ISBN, String edition){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.edition = edition;
    }

 public void displayBook(){

System.out.println("Title = "+this.title+"\nAuthor = "+this.author 
+ "\nISBN = "+ this.ISBN  + "\nEdition = " + edition);
 }
 

}