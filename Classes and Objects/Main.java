public class Main{
    public static void main(String[] args){

        Dog d1 = new Dog("Tommy", "Brown"); //A dog obj is created 

        d1.barks();                                    //Barks methode is called


Car c1 = new Car();    //Car object using default constructor
                       //It has not any values given yet 
c1.name = "Toyota";
c1.model = "Unknown";
c1.year = 2024;
c1.Engine ="V8 Engine";
                       //car object is complete

Car c2 = new Car("Maruti","Unknown",2025,"V6 Engine");
                        //Car object using parameterized constructor
                        //Here values are given when object is bieng created and constructor is called.


c2. carInfo();





    }
}