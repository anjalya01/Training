class SumMethod{

static int a=5;
static int b=1;

public static void main(String args[]){

SumMethod.sum();  //calling Method
SumMethod.sub();
SumMethod.mul(5,6);   //actual arguments
SumMethod.div(10,2);
System.out.println("d="+SumMethod.div(10,2));
double d=SumMethod.div(5,2);
System.out.println(d);

}
//Method creation
public static void sum(){   
//int a=2;
//int b=3;
System.out.println("c="+(a+b));
}

//method using static variable

public static void sub(){   
System.out.println("c="+(a-b));
}
 //Argument passing inside the method

public static void mul(int a,int b)   //Formal Arguments
{   
System.out.println("c="+(a*b));
}
//return value using method

public static double div(int a,int b)
{
return a/b;
}
}