import java.util.Scanner;
class fibonacci{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int num=s.nextInt();
		int i;
		int a=0,b=1,c=0;
		for (i=1;i<=num;i++){
			System.out.print(c+" ");
			a=b;
			b=c;
			c=a+b;
		}
	}
}