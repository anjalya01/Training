class Constructor{

String name;
int id;
Constructor()
{
System.out.println("Default Constructor");
}

Constructor(int id1,String name1)
{
id=id1;
name=name1;
}
void display(){

System.out.println(id+","+name);
}
public static void main(String args[]){


Constructor obj=new Constructor();
Constructor obj1=new Constructor(1,"anjaly");
obj1.display();







}


}