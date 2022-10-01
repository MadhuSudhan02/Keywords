class Addition{
    int a=5 ,b= 3 , c ;
    int add ()
    {
       c= a+b ;
        System.out.println("the addition of a and b is");
        return c ;
    }
}
class Teacher extends Addition {
    void display(){
        System.out.println("teacher teached addition today");
        System.out.println(super.add());
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Teacher obj = new Teacher() ;
        obj.display();
    }

}
