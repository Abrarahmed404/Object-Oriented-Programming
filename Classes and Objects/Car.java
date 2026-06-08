class Car {

    String name;
    String model;
    int year;
    String Engine;

                      //A constructor which will initialize the properties of objects
    Car(String name, String model,int year,String Engine){
        this.name=name;
        this.model=model;
        this.year=year;
        this.Engine=Engine;
    }

    Car(){
        
    }

                //The car will start if you insert key (parameterized Method)
    public void start(int key){
        if (key==1) {
            System.out.println("Engine Started....");
        }
        else
            System.out.println("Not started!");
    }



}
