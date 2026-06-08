public class Dog{   
    String name;
    static int legs=4;
    static int tail=1;
    String color;

//Constructor to initialize properties
Dog(String name,String color){

    this.name=name;
    this.color=color;
}



    void eat(){
        System.out.println("eating.....");
    }

    void barks(){
        System.out.println("bhow bhow bhow");
    }

}
