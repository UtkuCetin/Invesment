import java.util.Scanner;
 public class Invesment{
 	public static void main(String[] args){
 		
 		Scanner scan = new Scanner(System.in);
 		
 		double total1,total2,total3;
 		
 		System.out.print("Please enter your initial budget: ");
 		int budget = scan.nextInt();
 		
 		System.out.print("Please enter your prediction about the change in currency rate for U.S. dollar: ");	
 		double rate1 = scan.nextDouble();
 		
 		System.out.print("Please enter your prediction about the change in currency rate for euro: ");
 		double rate2 = scan.nextDouble();
 		
 		
 		total1= budget*(double)(100+rate1)/100;
 		total1*= (double)(100+rate1)/100;
 		total1*= (double)(100+rate1)/100;
 		total1*= (double)(100+rate1)/100;
 		total1*= (double)(100+rate1)/100;
 		total1*= (double)(100+rate1)/100;
 		
 		total2= budget*(double)(100+rate2)/100;
 		total2*= (double)(100+rate2)/100;
 		total2*= (double)(100+rate2)/100;
 		total2*= (double)(100+rate2)/100;
 		total2*= (double)(100+rate2)/100;
 		total2*= (double)(100+rate2)/100;
 		
 		total3=(total1/2)+(total2/2);
 		
 		System.out.println("If you purchase U.S. dollars with all your money, then you will get " + total1 + " at the end of the 6 months.");
 		System.out.println("If you purchase euros with all your money, then you will get " + total2 + " at the end of the 6 months.");
 		System.out.println("If you split your money and purchase euros and dollars, then you will get " + total3 + " at the end of the 6 months.");
 		
 		
 		
 	} 
 }
