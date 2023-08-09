import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		for(int i=0; i<n; i++) {
			String sen = scanner.nextLine();
			StringTokenizer st =  new StringTokenizer(sen, " ");

			StringBuffer sb2 = new StringBuffer();
			while(st.hasMoreTokens()) {
				StringBuffer sb = new StringBuffer();
				sb.append(st.nextToken());
				sb.reverse();
				sb2.append(sb+" ");
			}
			System.out.println(sb2);
		}
		scanner.close();
	}
}//
