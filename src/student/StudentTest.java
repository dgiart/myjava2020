package student;
import java.util.Scanner;

class Student extends Person {
    //Fields


    public int getAge() {
        return age;
    }
    //Sets and Gets
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //Constructors
    public Student(){
        super();
        this.name="John Doe";
        this.age=33;

    }
    public Student(String name, int age) {
        if (age>0 && age<100) {
            setAge(age);
            setName(name);
        }
        else{
            if(age>100){
                System.out.println("Too old");
            }
            if(age<0){
                System.out.println("You have to be born first");
            }
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}

public class StudentTest {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a name");
//        String name=scan.nextLine();
//        if (!(name.equals("stop"))){
//            System.out.println(name.equals("stop"));
//            System.out.println(name);
//        }
//        else{
//            System.out.println("STOP!!!");
//        }
        Student jd=new Student();
        System.out.println(jd.toString());
        while(true){

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a name");
            String name=scan.nextLine();
            if (name.equals("stop")) break;
            System.out.println("Enter an age");
            int age=scan.nextInt();
            Student student=new Student(name,age);
            System.out.println(student.toString());
//            System.out.println("name: "+art.toString()+", age="+art.getAge());

        }




    }
}
