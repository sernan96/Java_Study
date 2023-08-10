package Main;
import java.util.Scanner;
import java.io.*;
import java.util.Stack;
public class Main {
	public static void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character>stl = new Stack<>();
		Stack<Character>str = new Stack<>();
		char[] s = br.readLine().toCharArray();
		int stl_size=0, str_size=0;
		for(char x:s) {//stl 스택저장
			stl.push(x);
			stl_size++;
		}

		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			char[] menu = br.readLine().toCharArray();
			if(menu[0]=='L' && stl_size != 0) {
			    str.push(stl.peek());
			    stl.pop();
			    stl_size--;
			    str_size++;
			} else if(menu[0]=='D' && str_size != 0) {
			    stl.push(str.peek());
			    str.pop();
			    stl_size++;
			    str_size--;
			} else if(menu[0]=='B' && stl_size != 0) {
			    stl.pop();
			    stl_size--;
			} else if(menu[0]=='P') {
			    stl.push(menu[2]);
			    stl_size++;
			}	
		}
		StringBuilder sb = new StringBuilder(stl_size + str_size);
		if(stl_size!=0) {
			for(int i1=0; i1<stl_size; i1++) {
				sb.append(stl.peek());
				stl.pop();
			}
			sb = sb.reverse();
		}
		if(str_size!=0) {
			for(int i1=0; i1<str_size; i1++) {
				sb.append(str.peek());
				str.pop();
			}
		}
		System.out.println(sb);

	}
}
/*﻿
생각해본 풀이
1. L 커서를 왼쪽으로 한 칸 옮김 (커서가 문장의 맨 앞이면 무시됨)

=> if(stl.empty()==false) 일때 stl.pop + str.push

2. D 커서를 오른쪽으로 한 칸 옮김 (커서가 문장의 맨 앞이면 무시됨)

=> if(str.empty()==false) 일때 stl.push + str.pop

3. B커서 왼쪽에 있는 문자를 삭제함 (커서가 문장의 맨 앞이면 무시됨)

삭제로 인해 커서는 한 칸 왼쪽으로 이동한 것처럼 나타나지만, 실제로 커서의 오른쪽에 있던 문자는 그대로임

=> if(stl.empty()==false) 일때 stl.pop

4. P $ $라는 문자를 커서 왼쪽에 추가함

=>stl.push($)

﻿*/
