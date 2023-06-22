class StringTest{

public static void main(String args[]){

String s="hello";  //literals
System.out.println(s);
String s1=new String("Welcome");  //new operator
System.out.println(s1);


//methods

System.out.println(s1.length());
System.out.println(s1.charAt(0));
System.out.println(s1.substring(3));
System.out.println(s1.substring(3,5));
System.out.println(s1.equals(s));
System.out.println(s1.toUpperCase());
System.out.println(s1.toLowerCase());
System.out.println(s1.isEmpty());
System.out.println(s1.concat(s));
System.out.println(s1.replace('W','M'));
System.out.println(s1.contains("comes"));
System.out.println(s1.equalsIgnoreCase("Welcome"));

}


}