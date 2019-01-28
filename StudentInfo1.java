                               
package student.info;        
    

public class StudentInfo1{
    //public String college;
    public String college;
    //public String major;
    public String term;
    public String year;
    
    private String academicProgram;
    private String major;
    private String idNumber;
    private String firstName;
    private String lastName;
    

    //CONSTRUCTOR: to initialized objects when called
    public StudentInfo1(String college, String term, String year){
        
        //this.college = college;
        this.college = college;
        //this.major = major;
        this.term = term;
        this.year = year;
    }
    
    
    //get>> accessor: returns its value
    //set>> mutators: sets value of the priv. field
    

    //college, major
    public String getAcademicProgram(){
        return academicProgram;
    }
    public void setAcademicProgram(String academicProgram){
        this.academicProgram = academicProgram;
    }
    
    public String getMajor(){
        return major;
    }
    public void setMajor(String major){
        this.major = major;
    }
    

    //idNumber, firstName, lastName
    public String getIdNumber(){
        return idNumber;
        
    }
    public void setIdNumber(String idNum){
        this.idNumber = idNum;
    }
    
    
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }  
    
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void print(){
        System.out.println("  ");
        System.out.println("UNIVERSITY OF THE CORDILLERAS");
        System.out.println(college);
        System.out.println( term +", " +  year);
        
        System.out.println("STUDENT INFO ");
        System.out.println("ID NUMBER: " +idNumber);
        
        System.out.println("NAME: " +lastName + ", " + firstName);
        System.out.println( "ACADEMIC PROGRAM: " +academicProgram + major);
     
    }
}




