class Reverse{

public static void main(String args[]){
int n=121,r,s=0;
while(n!=0)
{
r=n%10;
s=s*10+r;
n=n/10;

}
System.out.println(s);

}
}