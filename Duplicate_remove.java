import java.util.*;
class Duplicate_remove 
{
  public String removeDups(String s)
{
    if ( s.length() <= 1 ) return s;
    if( s.substring(1,2).equals(s.substring(0,1)) ) return removeDups(s.substring(1));
    else return s.substring(0,1) + removeDups(s.substring(1));
}  
  public static void main(String[] args) {
    Duplicate_remove m=new Duplicate_remove();
    int n,i;
    String num;
    Scanner o=new Scanner(System.in);
    System.out.println("enter the string");
    num=o.nextLine();
    String a=m.removeDups(num);
    System.out.println("String is: "+a);
    
  }
}