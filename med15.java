import java.util.*;
class med15
{
	public static void main(String arg[]){
	int fact=1,i,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of n:");
	n=sc.nextInt();
	for(i=1;i<=n;i++){
	fact=fact*i;
}
	System.out.println(fact);
	}
}