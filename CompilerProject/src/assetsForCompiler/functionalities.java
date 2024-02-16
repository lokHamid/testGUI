package assetsForCompiler;
import java.util.Scanner;

public class functionalities {
	
	void print(Variable obj_X) {
		System.out.println(obj_X.value);
	}
	
	String read() {
		try (Scanner scan = new Scanner(System.in)) {
			return(scan.nextLine());
		}
	}
}
