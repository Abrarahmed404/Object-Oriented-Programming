  import java.io.*;
  
  public class WriteFile1{
    public static void main(String[] args){
    
    try{
          FileWriter f = new FileWriter("/home/abrar-ahmed/Desktop/kaffir.txt");
       try{ 
          f.write("Hello my name is abrar ahmed iam a sksjbdjcwgbfkujewhefewkg,ehgiuehwlgiuwlwhgvleiwu student");
          System.out.println("Somthing is written in File");
       }
       //finally block will run weather we get ecxeption or not during writing in the file
       finally{
          f.close();
          System.out.println("File is closed");
       } 
    }   
    //if we get exception while creating/selecting the file then it will be catch here
    catch(IOException i){
       System.out.println(i);   
    }
    }
  }

