import java.util.Scanner;

public class FarheneitToCelcius {


	public static void main(String[] args) {

		/* Your class should be named Solution.
		 * Read input as specified in the question.
		 * Print output as specified in the question.
		 */

		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();
		int e = sc.nextInt();
		int w = sc.nextInt();

		while(s <= e) {
			int c = ((s-32) * 5/9);
			System.out.println(s+" "+c);
			s = s + w;
		}

	}
}
