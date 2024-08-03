import java.util.*;
class righttriangle
{
 public static void main(String arg[])
{
 int rows,i,j;
 Scanner sc=new Scanner(System.in);
System.out.println("enter no.of.rows");
rows=sc .nextInt();
for(i=0;i<rows;i++)
{
for(j=0;j<i;j++)
{
System.out.print(" * ");
}
System.out.println();
}
}
}