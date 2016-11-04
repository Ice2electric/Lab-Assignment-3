import java.util.Scanner;

public class HelloUser {
	
	public static void main(String[] args) {
	Scanner scan =new Scanner ( System.in);
	Scanner keyboard = new Scanner(System.in);
	Scanner input = new Scanner(System.in);
	
	String again;
	
	String firstname;
	String  lastname;
	   int     grade;
	String StudentID;
	String     login;
	double schoolaverage;
	
	System.out.println("Hello User");
	System.out.println("What is your firstname?");
	firstname = input.nextLine();
	System.out.println("What is your lastname?");
	lastname = input.nextLine();
	System.out.println("What grade are you in?");
	grade = input.nextInt();
	System.out.println("What is your student ID ");
	StudentID = input.next();
	System.out.println("State your login");
	login = input.next();
	System.out.println("State your school average");
	schoolaverage = input.nextDouble();
	
	System.out.println(String.format("Your sum : %10f",firstname ));
	
	
	double firstnum;
	double secondnum;
	double sum;
	double diffrence;
	double product;
	System.out.println("Think of a number");
	firstnum =input.nextDouble();
	System.out.println("Think of another number");
	secondnum =input.nextDouble();
	
	sum = firstnum + secondnum;
	diffrence = firstnum - secondnum;
	product = firstnum * secondnum;
	System.out.println("\n" + firstname + " ? Thats a cool name! ");
	System.out.println("I did things with your two numbers" + firstname);
	System.out.println(String.format("Your sum : %10f",sum ));
	System.out.println(String.format("Your diffrence : %10f",diffrence ));
	System.out.println(String.format("Your product : %10f",product ));
	
	
	
	
	
	
	
	
	//ALWAYS Close Your Scanner 
	input.close();
}
	
}