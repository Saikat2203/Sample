import java.util.*;


public class BillingSystemMain 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int q = 0;	
		boolean run = true;
		
		double sum = 0;
		
		//KeyValue arr[] = new KeyValue[2];
		int teaQuant = 0;
		
		while (run)
		{
			
			
			System.out.println("****Welcome to Snack Centre****");
			System.out.println("1. Tea (Rs. 10)");
			System.out.println("2. Green Tea (Rs. 15)");
			System.out.println("3. Samosa (Rs. 20)");
			System.out.println("4. Sandwich (Rs. 50)");
			System.out.println("5. Generate Bill & Exit");
			System.out.print("Enter your choice: ");
			int n = sc.nextInt();
			if (n != 5)
			{	
				System.out.print("Enter quantity: ");
				q = sc.nextInt();
			}
			
			BillingSystem b1 = new BillingSystem(q);
			
			switch(n)
			{
			case 1:
				sum = sum + b1.tea();
				teaQuant += q;
				//KeyValue kV = new KeyValue("Tea " , q);
				System.out.println("Tea     "+ q + "    " + sum);
				break;
				
			case 2:
				sum = sum + b1.greenTea();
				
				System.out.println("Green Tea     "+ q + "    " + sum);
				break;
				
			case 3:
				sum = sum + b1.samosa();
				System.out.println("Samosa     "+ q + "    " + sum);
				break;
				
			case 4:
				sum = sum + b1.sandwich();
				System.out.println("Sandwich     "+ q + "    " + sum);
				break;
				
			case 5:
				System.out.println("*****BILL*****");
				run = false;
				break;
			}			
		}
		System.out.println("----------------");
		System.out.println("Total = " + sum);
		System.out.println("Tea = " + teaQuant);
		
		sc.close();
	}

}
