
class University {

    String university_name;
    int ranking;

    void display(){
        System.out.println("University ->\t\t"+university_name);
        System.out.print("University ranking ->\t"+ranking);

    }

}

class Faculty extends University{

    String faculty_name;

    void Details() {
        
        super.display();
        System.out.print("\nFaculty name ->\t\t"+faculty_name);
    }
}

class Department extends Faculty {

    String department_name;
    String chairman;

    void Details() {

        System.out.print("\nDepartment name ->\t"+department_name);
        System.out.print("\nChairman name ->\t"+chairman);
    }
 
    void Display() {
        super.Details();
        this.Details();

    }
}

public class P2_University{
    public static void main(String[] args){

        Department d = new Department();
        d.department_name = "Computer Science";
        d.chairman = "Arman Rasool Faridi";

        d.ranking = 16;
        d.faculty_name = "Faculty of Science";
        d.university_name = "Aligarh Muslim University";
        d.Display();




    }
}
    