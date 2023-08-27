/* Write a java program to print person details in the format as shown below: 

Person Details:
 ____________ 
First Name: Vijay 
Last Name: Raghav
Gender: M
Age: 20 
Weight: 85.55 */
class Person{

    String fName ;
    String lName;
    char gen;
    int age;
    int weight;

    Person(String fName ,String lName, char gen, int age, int weight){
        this.fName = fName;
        this.lName = lName;
        this.gen = gen;
        this.age = age;
        this.weight = weight;
    }
    void show(){
        System.out.println("PERSON DETAILS :");
        System.out.println("_______________");
        System.out.println("First Name : "+fName + "\nLast name : "+lName+ "\nGender : "+gen+"\nAge : "+age+"\nWeight : "+weight);
        System.out.println();

    }

}

public class ten {
    public static void main(String[] args) {
        Person p1 = new Person("Tarun", "Dammu", 'M', 23, 70);
        Person p2 = new Person("Prema", "Singanal", 'F', 22, 55);

        p1.show();
        p2.show();
    }
    
}
