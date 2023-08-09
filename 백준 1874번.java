package Main;
import java.util.Scanner;
import java.util.Stack;
public class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();
		StringBuffer sb = new StringBuffer(); //+,-저장
		int limit =sc.nextInt(), max=0, min=limit, cnt=0;
		for(int i=0; i<limit; i++) {
			int n= sc.nextInt();
			if(n>max) {
				for(int j=max+1; j<=n; j++) {
					
					st.push(j);
					sb.append("+").append("\n");

				}
				sb.append("-").append("\n");
				st.pop();
				max=n;
			}
			else {
				if(st.peek()==n) {
					sb.append("-").append("\n");
					st.pop();
				}
				else {
					System.out.println("NO");
					return;
				}
			}		
			
		}
		sc.close();
		System.out.println(sb);
	}
}
//순서대로 스택에 넣어주다가 원하는 수가 나온다면 빼주고 다시 넣어주다가 빼주고
//가능한지 안한지의 판단기준은 최대 다음의 숫자입력
