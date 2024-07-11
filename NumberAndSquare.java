import java.util.*;
public class NumberAndSquare
{
public static void  main(String arg[])
{
Scanner sc=new Scanner(System.in);
int lower=sc.nextInt();
int upper=sc.nextInt();
for(int i=lower;i<=upper;i++)
{
System.out.print("("+i+","+i*i+")"+" ");
}
}
}