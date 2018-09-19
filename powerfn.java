import java.util.*;
class powerfn
{

static int power(int x,int y)
{
if(y==0)
{
return 1;
}
else if(y%2==0)
{
return power(x,y/2)*power(x,y/2);
}
else
{
return x*power(x,y/2)*power(x,y/2);
}
}

public static void main(String args[])
{
int x,y;
Scanner obj=new Scanner(System.in);
x=obj.nextInt();
y=obj.nextInt();
System.out.println(power(x,y));
}

}