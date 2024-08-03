class tax
{
	public static void main(String arg[])
	{
		int j;
		j=100000;
                 int i;
                 i=j-250000;
           System.out.println("taxincome="+i);
		if(i>-250000)
		{
			if(i<=250000)
			{
				System.out.println("no tax paid");
			}
			else if(i>250000 && i<500000)
			{
				int tax1=(i*10)/100;
				System.out.println("tax:" +tax1);
			}
			else if(i>500000 && i<1000000)
			{
				int tax2=(i*20)/100;
				System.out.println("tax:" +tax2);
			}
			else
			{
				int tax3=(i*30)/100;
				System.out.println("tax:" +tax3);
			}
		}
		else if(j<0)
		{
			System.out.println("please enter the positive income");
		}
               else 
		{
			System.out.println("please enter valid input");
		}

	}
}
