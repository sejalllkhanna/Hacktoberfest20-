import java.util.Scanner;
import java.util.Stack;

public class StackBrackets {

	public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
		     while (sc.hasNext()) {
		     String s=sc.next();
           boolean is=true;
            Stack<Character> st = new Stack<>();
            for(int i=0;i<s.length();i++)
            {
                char ch =s.charAt(i);
            if( ch ==  '(' || ch =='{' || ch== '[')
            {
                st.push(ch);
                continue;
            }
            if(st.isEmpty())
            {
                is=false;
                break;
            }
            if(ch==')')
            {
                if(st.peek()=='(')
                {
                    st.pop();
                }
                else
                {
                    is=false;
                }
            }
             if(ch=='}')
            {
                if(st.peek()=='{')
                {
                    st.pop();
                }
                else
                {
                    is=false;
                }
            }
             if(ch==']')
            {
                if(st.peek()=='[')
                {
                    st.pop();
                }
                else
                {
                    is=false;
                }
            }
            }
            if(!st.isEmpty())
            {
                is=false;
            }
           System.out.println(is);
		}	

	}

}
