package lab1;
import java.util.Scanner;
public class Calculator {

public static void main(String [] args)
{
	
	int a,b;

 	Scanner Sc=new Scanner(System.in);
 	Calculator calc=new Calculator();
    Calc_func cal_func= new Calc_func();
    a=Sc.nextInt();
    b=Sc.nextInt();
    int cal_value;
    
    cal_value = Calc_func.plus(a);
    
    System.out.println("Increment a = " +cal_value+"\n");
    cal_value = Calc_func.minus(b);
    System.out.println("Decrement b = " +cal_value  +"\n");
    cal_value = cal_func.plus(a,b);
    System.out.println("a + b = " +cal_value  +"\n");
    cal_value =cal_func.minus(a,b);
    System.out.println("a - b = " +cal_value  +"\n");
    cal_value =cal_func.mul(a,b);
    System.out.println("a * b = " +cal_value  +"\n");
    cal_value =cal_func.div(a,b);
    System.out.println("a / b = " +cal_value  +"(floor)\n");
    cal_value =cal_func.mod(a,b);
    System.out.println("a % b = " +cal_value  +"\n");
    cal_value=cal_func.mod(a);
    System.out.println("Last digit of a = " +cal_value  +"\n");
    
    
	 
}
	
	
	
	
	
	
	
	

}
