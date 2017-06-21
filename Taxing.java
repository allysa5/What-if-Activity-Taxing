import java.util.Scanner;
public class Taxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  fname, lname, taxcode;
		int cnumber;
		double taxamtNRM, taxamtNPF, taxamtBIZ, salesamt, totalamtdue;
		
		double NRM = .06;
		double NPF = .00;
		double BIZ = .45;
		totalamtdue = 0.0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your customer number?");
		cnumber = keyboard.nextInt();
		
		System.out.println("Please enter your fname?");
		fname = keyboard.next();
		
		System.out.println("Please enter your lname?");
		lname = keyboard.next();
		
		System.out.println("Please enter sales amount");
		salesamt = keyboard.nextDouble();
		
		System.out.println("Please enter your tax code?");
		taxcode = keyboard.next();
		
		if(taxcode.equals("NRM")){
			totalamtdue = salesamt * (1 + NRM);
		}else if(taxcode.equals("NPF")){
			totalamtdue = salesamt * (1 + NPF);
		}else if(taxcode.equals("BIZ")){
			totalamtdue = salesamt * (1 + BIZ);
				System.out.println(totalamtdue);
				
		}
		System.out.println(lname);
		System.out.println(salesamt);
		System.out.println(taxcode);
		System.out.println(totalamtdue);
		System.out.printf("customer: %s sales: %s taxcode: %s total due: %s",lname, salesamt, taxcode,  totalamtdue);
	}
	
}
