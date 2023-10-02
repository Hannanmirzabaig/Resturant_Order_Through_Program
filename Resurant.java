package Night_session_Test;
import java.util.Scanner;
public class Resturant {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	
	System.out.println("==========(MENNU DETAILS)==========");
	System.out.println(" Burger===========25RS      Enter 1 to order");
	System.out.println(" Pizza============150Rs     Enter 2 to order");
	System.out.println(" Salad============10Rs      Enter 3 to order");
	System.out.println(" Veg Thali========60Rs      Enter 4 to order");
	System.out.println(" Chicken Chilli===60Rs      Enter 5 to order");
	System.out.println(" Chicken biryani==150Rs     Enter 6 to order");
	System.out.println("enter the number");
	int n=sc.nextInt();
	switch(n) {
	case 1:
		
		System.out.println("You Select Burger");
		System.out.println("Plz Enter Number Of Burger Item");
		int x=sc.nextInt();
		System.out.println("==================================");
		System.out.println("You Select "+x+" Burger Item");
		System.out.println("Now Your Total bill is "+(x*24)+"Rs");
		System.out.println("==================================");
		
	 break;
		
	case 2:
		
		System.out.println("You Select Pizza");
		System.out.println("Plz Enter Number Of Pizza Item");
		int y=sc.nextInt();
		System.out.println("==================================");
		System.out.println("You Select "+y+" Pizza Items");
		System.out.println("Now Your Total bill is "+(y*150)+"Rs");
		System.out.println("==================================");
		
		break;
		
	case 3:
		
		System.out.println("You Select Salad");
		System.out.println("Plz Enter Number Of Salad Item");
		int z=sc.nextInt();
		System.out.println("==================================");
		System.out.println("You Select "+ z+" Salad Item");
		System.out.println("Now Your Total bill is "+(z*10)+"Rs");
		System.out.println("==================================");
		break;
		
	case 4:
		System.out.println("You Select Veg Thali");
		System.out.println("Plz Enter Number Of Veg Thali");
		int a=sc.nextInt();
		System.out.println("==================================");
		System.out.println("You Select "+a+" Veg Thali");
		System.out.println("Now Your Total bill is "+(a*100)+"Rs");
		System.out.println("==================================");
		break;
		
	case 5:
		System.out.println("You Select Chicken Chilli");
		System.out.println("Plz Enter Number Of Chicken Chilli Items");
		int b=sc.nextInt();
		System.out.println("==================================");
		System.out.println("You Select "+b+" Chicken Chilli Items");
		System.out.println("Now Your Total bill is "+(b*60)+"Rs");
		System.out.println("==================================");
		break;
		
	case 6:
		System.out.println("You Select Chicken Biryani");
		System.out.println("Plz Enter Number Of Chicken Biryani Items");
		int c=sc.nextInt();
		System.out.println("==================================");
		System.out.println("You Select "+c+" Chicken Biryani Items");
		System.out.println("Now Your Total bill is "+(c*150)+"Rs");
		System.out.println("==================================");
		
		break;
		default:
			System.out.println("plz enter valid number");
		
	
	
	}
	
	}
	
	
	
	

}
