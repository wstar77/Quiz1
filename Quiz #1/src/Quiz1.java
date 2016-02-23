import java.util.Scanner;
public class Quiz1 {

	public static void main (String[] args) {
		Scanner user_input = new Scanner( System.in );
		
		
		int att;
		System.out.print("Enter QB attempts: ");
		att = user_input.nextInt();
		
		int com;
		System.out.print("Enter QB completions: ");
		com = user_input.nextInt();
		
		int yds;
		System.out.print("Enter QB yards: ");
		yds = user_input.nextInt();
		
		int td;
		System.out.print("Enter QB touchdowns: ");
		td = user_input.nextInt();
		
		int in;
		System.out.print("Enter QB interceptions: ");
		in = user_input.nextInt();
		
		double result = b(yds, att);
		System.out.println(result);
		
		double resultpr = (((a(com, att) + b(yds, att) + c(td, att) + d(in, att)) / 6) * 100);
		System.out.println(resultpr);
		
	}	
		
	public static double a(double com, double att) {
		double result1 = (((com / att) - .3) * 5);
		
		return result1;
		
		
	}
	
	public static double b(double yds, double att) {
		double result2 = (((yds / att) - 3) * .25);
		
		return result2;
	
	}
	
	public static double c(double td, double att) {
		double result3 = ((td / att) * 20);
		
		return result3;
		
	}
	
	public static double d(double in, double att) {
		double result4 = (2.375 - ((in / att) * 25));
		
		return result4;
		
	}
	
	
		
	}	

	
