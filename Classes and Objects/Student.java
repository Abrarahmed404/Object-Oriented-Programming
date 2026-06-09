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
        System.out.println(" Name: " + name + "\n StudentId: " + studentId + "\n GPA: " + gpa);
        
        }
        
        
    public char calculateGrade(){
        
        if(gpa >= 3.7)
         return 'A';
      
        else if(gpa >= 3.0)
         return 'B';
      
       else if(gpa >= 2.0)
         return 'C';
      
       else if(gpa >= 1.0)
        return 'D';
       
       else
        return 'F';
        
    }
    
    
    public void getGradeLetter(){
        
        switch(calculateGrade()){
        
          case 'A':
            System.out.println("Congratulations you have got A Grade");
              break;
              
          case 'B':
            System.out.println("Congratulations you have got B Grade");
              break;
              
          case 'C':
            System.out.println("You have got C Grade");
              break;
              
          case 'D':
            System.out.println("D Grade");
              break;
              
          case 'F':
            System.out.println("Unfortunately You are Fail");
            
        }
            
   }
        
        
        
        
}        
