//Method overloading  - same method name number of arguments or type should be differnet
class Overload{

public static void main(String args[]){


Overload.sum(5,2);
Overload.sum(5.3,1.0);

}

public static void sum(int a,int b)
{
System.out.println(a+b);
}
public static void sum(double a,double b)
{
System.out.println(a+b);
}






}