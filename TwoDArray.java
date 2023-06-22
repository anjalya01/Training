class TwoDArray{
public static void main(String args[]){
int j,i;
 int a[][]=new int[2][2];

a[0][0]=1;
a[0][1]=2;
a[1][0]=3;
a[1][1]=4;
int b[][]={{10,20},{30,40}};

for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
System.out.print(" "+a[i][j]);


//System.out.print(" "+b[i][j]);  
}
System.out.println("");
}
	 	
}
}