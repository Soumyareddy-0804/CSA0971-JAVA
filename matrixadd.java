import java.util.*;
class matrixadd
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int mat1[][]={{1,2},{5,3}};
int mat2[][]={{2,3},{4,1}};
int mat_sum[][]=new int[2][2];
int len=mat1.length;
for(int i=0;i<len;i++)
{
for(int j=0;j<len;j++)
{
mat_sum[i][j]=mat1[i][j]+mat2[i][j];
System.out.print("\n"+mat_sum[i][j]);
}
}
}
}
