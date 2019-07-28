public class SwitchDemo
{
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		
		
		System.out.println(Please choose Addition ,Subtraction Multiplication);
		String operation = args[2];
		
		switch(operation)
		{
			case "Addition":
				System.out.println(a+b);
			break;
			
			case "Subtraction":
				System.out.println(a-b);
			break;
			
			
			default:
				System.out.println("The expression you have chosen is not availble");
		}
	}
}