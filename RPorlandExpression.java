package code;

import java.util.List;
import java.util.Stack;

public class RPorlandExpression {
    public static double evalue(List<String> exp){
        Stack<Double> st = new Stack<Double>();
        for(String c : exp){
            if("+-*/".contains(c)){
                if(st.size()<2)return -1;
                int index = "+-*/".indexOf(c);
                double b = st.pop();
                double a = st.pop();
                if(index == 0)st.push(a+b);
                else if(index == 1)st.push(a-b);
                else if(index == 2)st.push(a*b);
                else st.push(a/b);
            }else {
                st.push(Double.parseDouble(c));
            }
        }
        if(st.size()!=1)return -1;
        else return st.peek();
    }
}
