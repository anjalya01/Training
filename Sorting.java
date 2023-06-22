class Sorting{

public static void main(String args[]){

int a[]={5,8,1,2};
int temp=0;
int n=a.length;
System.out.print("Numbers before Swap: ");
for(int i:a)
{
System.out.print(i);
}

for(int i=0;i<n-1;i++)
{
for(int j=0;j<n-i-1;j++)
{

if(a[j]>a[j+1])
{
temp=a[j+1];
a[j+1]=a[j];
a[j]=temp;
}

}
}
System.out.println();
System.out.print("Numbers After Swap: ");
for(int i:a){
System.out.print(i);
}

}
}