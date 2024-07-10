import java.util.*;
class student
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("total users");
int total_users=sc.nextInt();
System.out.println("staff users");
int staff_users=sc.nextInt();
int non_staff=staff_users/3;
int student_users=total_users-(staff_users+non_staff);
System.out.println("student users"+student_users);
}
}