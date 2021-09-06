import java.util.Scanner;
class  Aptitude$Test
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String[] que=new String[4];
		que[0]="1) What is the average of first five multiples of 12?\n A. 36\tB. 38\tC. 40\tD. 42\n";
		que[1]="2) What is the difference in the place value of 5 in the numeral 754853?\n A. 49500\tB. 49950\tC. 45000\tD. 49940\n";
		que[2]="3) What is the compound interest on Rs. 2500 for 2 years at rate of interest 4% per annum?\n A.180\tB.204\tC.210\tD.220\n";
		que[3]="4) How many times the hands of a clock coincide in a day?\n A.24\tB.21\tC.23\tD.22\n";
		char[] ans=new char[]{'A','B','B','D'};
		int c1=0,c2=0,c3=0,c4=0;
		for(int i=0;i<que.length;i++)
		{
			System.out.println(que[i]);
			System.out.println("Do you want to attempt this question??\t1.Yes\t2.Skip ");
			int c=sc.nextInt();
			if(c==1)
			{
				++c3;
				System.out.print("\nSelect option: ");
				char ch=sc.next().charAt(0);
				if(ch==ans[i])
				{
					System.out.println("--------------------------------");
					System.out.println("\tCorrect..!!");++c1;
					System.out.println("--------------------------------\n");
				}
				else
				{
					System.out.println("--------------------------------");
					System.out.println("\tWrong..!!");++c2;
					System.out.println("--------------------------------\n");
				}
			}
			else
			{
				++c4;
				System.out.println();
			}
		}
		System.out.println("\tAttempted Questions: "+c3);
		System.out.println("\tNot attempted Questions: "+c4);
		System.out.println("\tCorrect Answer: "+c1);
		System.out.println("\tWrong Answer: "+c2);
		double per=(c1/4.0)*100;
		System.out.println("\tPercentage: "+per);
		
		if(per>=80.0)
		{
			System.out.println("\n\tScore is Excellent");
		}
		else if((per>=70.0)&&(per<=79.99))
		{
			System.out.println("\n\tScore is Very Good");
		}
		else if((per>=60.0)&&(per<=69.99))
		{
			System.out.println("\n\tScore is Good");
		}
		else if((per>=50.0)&&(per<=59.99))
		{
			System.out.println("\n\tScore is poor");
		}
		else if((per>=40.0)&&(per<=49.99))
		{
			System.out.println("\n\tScore is bad");
		}
	}
}