class OneDArray{
public static void main(String args[]){
int a[]=new int[5];

a[0]=1;
a[1]=2;
a[2]=3;
a[3]=4;
a[4]=5;
for(int i=0;i<a.length;i++){   //a.length 
System.out.println(a[i]);
}

//For Each
int b[]={10,20,30};
for(int i:b){
System.out.println(i);
}

}
}