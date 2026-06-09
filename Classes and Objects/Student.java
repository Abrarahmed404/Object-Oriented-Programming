public class Student {

    private String name;
    private int studentId;
    private double gpa;
  

    Student(){
        
    }
    
    Student(String name, int studentId, double gpa){

        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
      
    }
    
    //Getter Methods
    public String getName(){
        return this.name;
    }
    
    public int getStudentId(){
        return this.studentId;
    }
    
    public double getGpa(){
        return this.gpa;
    }

    
    //Setter Methods
    public void setName(String name){
        this.name = name;
    }
    
    public void setStudentId(int id){
        studentId = id;
    }
    
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    
    public void displayInfo(){
        System.out.println();
        System.out.println("Student Information: ");
        System.out.println(" Name: " + this.name + "\n StudentId: " + studentId + "\n GPA: " + gpa);
        
        }
        
        
        
        
}        
