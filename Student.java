class Student{
int id;   //instance variable
String name;
static String college="vkcet";//Static variable
public static void main(String args[]){

Student s1=new Student();
s1.id=1;
s1.name="anjaly";
s1.display();
Student s2=new Student();
s2.id=2;
s2.name="linu";
s2.display();

}
public void display()
{
System.out.println(id+"\n"+name+"\n"+college);

}

}
