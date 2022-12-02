import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prjct {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter C1:");
		float c1 = sc.nextFloat();
		
		System.out.println("Enter C2");
		float c2 = sc.nextFloat();
		
		 detectOil();
	}
	
	public static void detectOil() {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("magnetometer value m:");
		float m = sc.nextInt();
		System.out.println("Enter GPS values");
		float x = sc.nextFloat();
		float y = sc.nextFloat();
		float z = sc.nextFloat();
		
		// printing decide ranges
		System.out.println("Decide ranges:");
		System.out.println(m-2+" "+m+" "+m+2);
		
		// creating list
		List<Float> list = new ArrayList();
		list.add(x);
		list.add(y);
		list.add(x);
		// x y z values added to the list	
	}

}