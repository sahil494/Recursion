class reversearray
{
public static void main(String[] args) 
{
int[] arr={0,1,2,3,4,5,6,7,8};
int length=arr.length;
int[] revarray=reversearray(arr,0,length-1);
for(int i:revarray)
System.out.print(i+" ");
}
public static int[] reversearray(int[] a,int i,int j)
{
if(i<j)
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
reversearray(a, i+1, j-1);
}
return a;
}
}