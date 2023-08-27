// create a Student class with the following fields regNo,name,sub1,sub2 and sub3 and total. Print the result passed or failed based on total marks securedt;

class Student{

    int regNo;
    String name;
    int sub1;
    int sub2;
    int sub3;
    int total = 0;

    Student(int regNo, String name, int sub1, int sub2, int sub3){
    this.regNo = regNo;
    this.name = name;
    this.sub1 = sub1;
    this.sub2 = sub2;
    this.sub3 = sub3;
    this.total = sub1+sub2+sub3;
    }
    void result(){
        if(total<105)
        {
            System.out.println("regNo : "+regNo+ " Name : "+ name+" Total marks : "+total);
            System.out.println(" Failed ");
        }
        else
        {
            System.out.println("regNo : "+regNo+ " Name : "+ name+" Total marks : "+total);
            System.out.println("Passed");
        }
        
    }

}
public class eight {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Tarun",79,67,46);
        Student s2 = new Student(2, "Nandhan", 10,26,45);
        s1.result();
        s2.result();

    }

    
}
