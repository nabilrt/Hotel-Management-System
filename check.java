package EvenOdd;
import java.util.Scanner;
public class check {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int check;
		boolean isEven=true;
		System.out.println("Enter a number to check if that number is even or odd:");
		check=input.nextInt();
		System.out.println("Welcome to the menu:");
		System.out.println("1-Even or odd");
		int x=input.nextInt();
		switch(x) {
		case 1:{
			if(check%2==0)
				{
				System.out.println("Is this number even?");
				System.out.println(isEven);
				System.out.println("Is this number odd?");
				isEven=false;
				System.out.println(isEven);
				}
			else
			{  
				System.out.println("Is this number odd?");
				System.out.println(isEven);
				isEven=false;
				System.out.println("Is this number even?");
				System.out.println(isEven);
			}
			break;
		}
		default:{
			System.out.println("Wrong Choice");
		}
		}

	}

}
