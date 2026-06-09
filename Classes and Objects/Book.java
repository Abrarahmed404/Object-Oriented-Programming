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

System.out.println("Title = "+title+"\nAuthor = "+author 
+ "\nISBN = "+ ISBN  + "\nEdition = " + edition);
 }
 

}
