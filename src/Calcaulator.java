import java.util.Scanner;
public class Calcaulator {

	
	
	public static void main(String[] args) {
		Scanner scan =new Scanner ( System.in);
		Scanner keyboard = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		String firstname;
		String lastname;
		String again;
		String Login;
	    float  grade;
	    float StudentID;
	   double firstnum; 
       double secondnum; 
       double thirdnum;
       double fourthnum;
       double fifthnum;
       double average;
       
       
        System.out.println("Hello User");
        System.out.println("Lets start with your first name,");
    	firstname = input.next();
    	System.out.println("Last name please");
    	lastname= input.next();
    	System.out.println("ID please");
    	StudentID = input.nextInt();
    	System.out.println("Login please");
    	Login = input.next();
    	System.out.println("Grade please");
    	grade = input.nextInt();
    	
    	System.out.println("Your Information " + firstname);
    	System.out.println(String.format("Name : %15s",firstname ));
    	System.out.println(String.format("Name : %15s",lastname  ));
    	System.out.println(String.format("Name : %15f",StudentID ));
    	System.out.println(String.format("Name : %15s",Login     ));
    	System.out.println(String.format("Name : %15s",grade     ));
    	
    	
    System.out.println("Give me five numbers and il give you the average");
    System.out.println("Dont be shy");
    System.out.println("First one");
 	firstnum =input.nextDouble();
 	System.out.println("Second");
 	secondnum =input.nextDouble();
 	System.out.println("Third");
 	thirdnum =input.nextDouble();
 	System.out.println("Fourth");
    fourthnum =input.nextDouble();
    System.out.println("Last One");
    fifthnum = input.nextDouble();

    average = (firstnum + secondnum + thirdnum + fourthnum + fifthnum)/5;
    System.out.println(String.format("%10s %5.2f","First Number  : ",firstnum  ));
    System.out.println(String.format("%10s %5.2f","Second Number : ",secondnum ));
    System.out.println(String.format("%10s %5.2f","Third Number  : ",thirdnum  ));
    System.out.println(String.format("%10s %5.2f","Fourth Number : ",fourthnum ));
    System.out.println(String.format("%10s %5.2f","Final Number  : ",fifthnum  ));
    System.out.println(String.format("Your Average : %10f",average ));
    System.out.println("THANK YOU FOR YOUR TIME AND INFORMATION");
    System.out.println("GOODBYE MASTER" + firstname);
    
    
	
	
    input.close();
    
}
}
