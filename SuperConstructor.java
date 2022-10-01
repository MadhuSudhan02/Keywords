
class Cloth {
    int quantity ;
    String cloth_name ;
    Cloth(String cloth_name , int quantity)
    {
        this.cloth_name=cloth_name ;
        this.quantity=quantity ;
    }
}
class Customer extends Cloth {
float price ;
Customer (String cloth_name ,int quatity ,float price){
    super (cloth_name , quatity ) ;
    this.price=price ;
}
void display(){
    System.out.println(cloth_name + " " + quantity + " " + price);
}
}
public class SuperConstructor {
    public static void main(String[] args) {
        Customer obj= new Customer("pant",6 ,700) ;
        Customer obj1= new Customer("Shirt",6 ,700) ;
        Customer obj2= new Customer("jacket",6 ,700) ;
        obj.display();
        obj1.display();
        obj2.display();
    }
}
