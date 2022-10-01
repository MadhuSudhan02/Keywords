
class Student {
    String name , course ;
    int roll_number ;
    float fee ;
    Student(String name ,String course ,int roll_number)
    {
        this.name=name  ;
        this.course=course ;
        this.roll_number=roll_number ;
    }
    Student(String name ,String course ,int roll_number, float fee)
    {
        this(name,course,roll_number) ;
        this.fee=fee ;
    }
    void display(){
        System.out.println(name + " " + course + " " + roll_number + " " + fee);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Student obj = new Student("Madhu" ,"Java",21) ;
        Student obj2 = new Student("Ram",    "Python" ,17,60000f) ;
        obj.display();
        obj2.display();
    }
}

