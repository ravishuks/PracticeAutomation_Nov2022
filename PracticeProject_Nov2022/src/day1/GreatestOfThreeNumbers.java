package day1;

public class GreatestOfThreeNumbers {

	public static void main(String[] args) {

		int firstNum;
		int secondNum;
		int thirdNum;
		int forthNum;
		
		firstNum = 30;
		secondNum= 3;
		thirdNum= 30;
		
		if (firstNum >= secondNum && firstNum >= thirdNum  ) 
		{
			System.out.println("The largest number is : " + firstNum);
		} 
		
		else if (secondNum >= firstNum && secondNum >= thirdNum)
		{
		
			System.out.println("The largest number is : " + secondNum);
		}
		else if (thirdNum>= firstNum || thirdNum >= secondNum) 
		{
				System.out.println("The largest number is : " + thirdNum);
				
		}
		
		

	}

}
