import java.util.Scanner;
public class ak
{
 public static int revnum(int num)
 {
 int rev=0;
 while(num!=0)
{
 int rem=num%10;
 rev=rev*10+rem;
 num=num/10;
 }
 return rev;
 }
 public static boolean check(int num)
 {
 int rev= revnum(num);
 if(num==rev)
 return true;
 else
 return false;
 }
 public static void add(int num)
 {
 if(check(num)) {
 System.out.println("palindrome");
 }
 else
 {
 while(!check(num))
 {
 int rev=revnum(num);
 int sum=num+rev;
 System.out.println(num+"+"+rev+"="+sum);
 num=sum;
 }
 }
 }
 public static void main(String[] args)
 {
 Scanner input=new Scanner(System.in);
 int num=input.nextInt();
 add(num);
 }
}