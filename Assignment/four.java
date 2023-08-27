
// Write a java program to instantiate student object and display student details.

class Student{
    int id ;
    String name;
    double cgpa;
    Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    void show(){
        System.out.println("Student id : "+id+ " Student name : "+name+ " Student cgpa : "+cgpa);
    }

}
public class four {
    public static void main(String[] args) {

        Student s1 = new Student(1,"Tarun",8.6);
        Student s2 = new Student(2, "Nandhan", 9.8);
        Student s3 = new Student(3, "Ajay", 8.8);
        Student s4 = new Student(4, "Sagar", 8.3);
        s1.show();
        s2.show();
        s3.show();
        s4.show();
       
    }
    
}
