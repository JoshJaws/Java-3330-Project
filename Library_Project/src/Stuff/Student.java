package Stuff;
import librarypackage.SSN;
import java.util.Date;


//Students can only have 1 professor and have all the capabilities of a member
public class Student extends Member {
    Professor advisor;

    Student() {
        super();
    }
    Student(String name, String address, Date dob, String email, SSN ssn) {
        super(name, address, dob, email, ssn);
    }
    public void assignAdvisor(Professor professor) {
        this.advisor = professor;
    }
}