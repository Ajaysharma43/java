package day14;

import java.util.Stack;

public class test3 {
    static void printatbotton(Stack<Integer> st,int data)
    {
        if(st.isEmpty())
        {
            st.push(data);
            return;
        }
        int top = st.pop();
        printatbotton(st, data);
        st.push(top);
    }
    public static void main(String[]args)
    {
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(5);
        st.push(6);
        printatbotton(st, 7);
        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
