
package student.info;

public class StudentInfo {
    //3 private:idNumber, firstName, lastName
    //fields: college, academic Program and Major
    //^^variables
                                                                                                 
    public static void main(String[] args) {    //college, term, year
       StudentInfo1 Student1 = new StudentInfo1( "CITCS", "2nd Term", "SY 2018-2019");       
       
        //<object name>.<field/method name>;
       
       Student1.setIdNumber("18-3049-730");
       Student1.setFirstName("DENMARK RAY");
       Student1.setLastName("VELASQUEZ");
       Student1.setMajor("-NET SEC TRACK");
       Student1.setAcademicProgram("BSIT");
       
       Student1.print();
       
       
       
       StudentInfo1 Student2 = new StudentInfo1( "CITCS", "2nd Term", "SY 2018-2019");       
       //<object name>.<field/method name>;
       
       
       Student2.setIdNumber("14-3448-222");
       Student2.setFirstName("KATHY");
       Student2.setLastName("AUSTRIA");
       Student2.setMajor(" DIGITAL ARTS AND ANIMATION");
       Student2.college = ("COA");
       Student2.setAcademicProgram("BSIT");
       Student2.term = ("1st term");
       Student2.year = ("2002-2012");

       
      
       // System.out.println(Student2.college);
       Student2.print();
     
       
    }
}




