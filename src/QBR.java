import java.util.Scanner;

public class QBR {
	public static void main(String[] args){
		
		Scanner reader = new Scanner(System.in);
		
		double QBR;
		
		System.out.println("Please enter your number of passing attempts: ");
		double attempts = reader.nextInt();
		
		System.out.println("Please enter your number of completions: ");
		double completions = reader.nextInt();
		
		System.out.println("Please enter your number of passing yards: ");
		double passyards = reader.nextInt();
		
		System.out.println("Please enter your number of TD passes: ");
		double tdpasses = reader.nextInt();
		
		System.out.println("Please enter your number of interceptions: ");
		double interceptions = reader.nextInt();
		
		reader.close();
		double varA;
		double varB;
		double varC;
		double varD;
		
		
		varA = ((completions/attempts)-.3)*5;
		
		if(varA >= 2.375) {
			varA = 2.375;
		} else if (varA < 0 ) {
			varA = 0;
		} 
		
		varB = ((passyards/attempts)-3)*.25;
		if(varB >= 2.375) {
			varB = 2.375;
		} else if (varB < 0 ) {
			varB = 0;
		} 
		
		varC = (tdpasses/attempts)*20;
		if(varC >= 2.375) {
			varC = 2.375;
		} else if (varC < 0 ) {
			varC = 0;
		} 
		
		varD = 2.375 - ((interceptions/attempts)*25);
		if(varD >= 2.375) {
			varD = 2.375;
		} else if (varD < 0 ) {
			varD = 0;
		}
		
		QBR = ((varA+varB+varC+varD)/6)*100;
		System.out.println(QBR);
		
		System.out.println("Your Quarterback Rating is: " + QBR);
		
		
	}
}
