import java.util.Scanner;

public class Faq 
{
	public static void main(String []args)
	{
		char response;	
		String [] ques = new String[10];		
		int i=1;
		int no = 2;
		
		String q1 = "Do JAVA support multithreading ? \nAnswer : Yes, JAVA supports it.";
		ques[i] = q1;
		i++;
		String q2 = "Can main function be declared outside the class in JAVA ? \nAnswer : No, main function should be declared inside a class.";
		ques[i] = q2;
		i++;
	
		do
		{
			System.out.println("\nTo view list of question and answer press v. \nTo submit a new question press n. \nTo exit press e \n");		
			Scanner user_input = new Scanner(System.in);
			response = user_input.next().charAt(0);;
			
			
			if (response=='n')
			{	
				System.out.println("\nEnter your Question \n");	
				Scanner user_in = new Scanner(System.in);
				
				ques[i] = user_in.nextLine();
				i++;
				System.out.println("\nYour question is entered successfully \n");
				no++;
			}
			
			else if (response=='v')
			{		
				System.out.println("\nThe questions are- \n");
				for (i=1; i<=no; i++)
				{
					System.out.println("Question-"+i+": "+ ques[i] + "\n");
				}
			}
			
			else if (response != 'e')
			{
				System.out.println("Invalid Option, Try again-");
			}	
		
		}while(response != 'e');
	}
}