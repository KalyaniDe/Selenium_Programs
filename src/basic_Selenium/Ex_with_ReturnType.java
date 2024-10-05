package basic_Selenium;

public class Ex_with_ReturnType {

	public static void main(String[] args) {
		
		int num1 = 100;
		int num2 = addition(10,20);
		
		int num3 = multiplication(num1,num2);
		System.out.println(num3);
		
		String s1 = "kalyani";
		String s2 = convertStringToUpperCase(s1);
		System.out.println(s2);
	}
	public static String convertStringToUpperCase(String str1)
	{
		String str2 = str1.toUpperCase();
		return str2;	
	}
	public static int multiplication(int a,int b)
	{
		int mul= a*b;
		return mul;
	}
    public static int addition(int a, int b)
    {
    	int sum = a+b;
    	return sum;
    }
}
