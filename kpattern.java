import java.util.*;
class kpattern
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int k=1;
System.out.print("enter the value: ");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(k*k+" ");
k++;
}
System.out.println();
}
}
}