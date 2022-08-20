import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		char[] stack = new char[50];
		int cnt = 0;
		
		while(n-- > 0) {
			String input = br.readLine();
			stack = input.toCharArray();
			
			for(int i = 0; i < stack.length; i++) {
				if(stack[i] == '(') {
					cnt++;
				}else if(stack[i] == ')' && cnt > 0) {
					cnt--;
				}else if(stack[i] == ')' && cnt <= 0) {
					cnt--;
					break;
				}
			}
			if(cnt == 0) {
				sb.append("YES\n");
			}else{
				sb.append("NO\n");
			}
			cnt = 0;
		}
		System.out.println(sb);
	}
}
