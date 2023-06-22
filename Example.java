//Example for Local varible,static,instace variable
class Example{
static int b=5;
int c=7;
public static void main(String args[]){
int a=1;
System.out.println(a); //Loacal vaibale-declared inside the body of method
System.out.println(b);  //static variable
display();  //calling a method
Example.display();//calling method using class name
Example obj=new Example();  //object creation
System.out.println(obj.c); //instance variable
}
public static void display()
{
System.out.println(b);
} 

}

