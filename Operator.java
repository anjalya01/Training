class Operator{

public static void main(String args[]){
int a=10,b=1;

//Arithematic operator
System.out.println("a="+a); 
System.out.println("b="+b);
System.out.println("sum="+(a+b));
System.out.println("difference="+(a-b));
System.out.println("division="+(a/b));
System.out.println("multiplication="+(a*b));
System.out.println("modular="+(a%b));


//unary operator
System.out.println(a++); //postfix a+1  first asighmnet then operation  
System.out.println(a); 
System.out.println(++a); //prefix  a+1  first operation then asighnmnet
System.out.println(a);
System.out.println("\n");
System.out.println(a--);
System.out.println(a); 
System.out.println(--a); 
System.out.println(a);

//Relational operator

System.out.println(a>b); //result will give boolean value like true or false
System.out.println(a>=b);
System.out.println(a<b);
System.out.println(a<=b);
System.out.println(a==b);
System.out.println(a!=b);

//Logical Operator

System.out.println(a<b && a!=b); //AND
System.out.println(a>b && a!=b);
System.out.println(a<b || a!=b); //OR
System.out.println(a>b || a!=b);
//Ternary operator

System.out.println(a>b?a:b);  //check a is greateer than b if it is true print a if not print b
System.out.println(a<b?a:b);

//Shorthand operaotor
System.out.println(a+=5); //a=a+5


}

}