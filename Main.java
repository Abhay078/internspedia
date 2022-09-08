import java.util.*;

public class Main
{
    static void temperature(float C){
    double far= ((C*9.0/5.0)+32.0);
    double kelvin=(C+273.15);
    System.out.println("Given Celsius is equal to "+far+ " Fahrenheit");
    System.out.println("Given Celsius is equal to "+kelvin+ " Kelvin");
}
	public static void main(String[] args) {
		System.out.println("Enter the temperature in Celsius");
		Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat();
		temperature(a);
	}
}
