public class Main{
    public static void main(String[] ahj){

        //A dog obj is created 
        Dog d1 = new Dog("Tommy", "Brown"); 

        //Barks methode is called
            d1.barks();                                    
        

        //Car object using default constructor
        Car c1 = new Car();   
        //It has not any values given yet 
        
            c1.name = "Toyota";
            c1.model = "Unknown";
            c1.year = 2024;
            c1.Engine ="V8 Engine";
        //car object is complete

        //Car object using parameterized constructor
        Car c2 = new Car("Maruti","Unknown",2025,"V6 Engine");
        //Here values are given when object is bieng created and constructor is called.
        
        
            c2. carInfo();
            System.out.println();

        
        Book b1 = new Book("Intersteller", "Erwin shrewdinger",22084, "7th");
        
        Book b2 = new Book("Lamed", "Abrar Ahmed",22076, "1st");

            b1.displayBook();
            System.out.println();
            b2.displayBook();


         //objects of Student class
        
        //using default constructor
      Student s1 = new Student();
      
           s1.setName("Abrar");
           s1.setStudentId(282086);
           s1.setGpa(3.69);
      
           s1.displayInfo();
      
      
      //using parameterized constructor
      Student s2 = new Student("Qadir", 282077, 3.75);
        
        
           s2.displayInfo();
    }
}
