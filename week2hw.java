import java.util.*;

public class week2hw
{
	public static void main(String[]arvg)
	{
		int a;
		System.out.println("please input an integer");
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		
		System.out.println(a%2==0?"此數為偶數":"此數為奇數");

		float b;
		System.out.println("please input the temperature(℃)");
		Scanner input1=new Scanner(System.in);
		b=input.nextFloat()*9/5+32;
		System.out.println("此溫度轉成℉為"+b);
	}
}