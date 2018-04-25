package code;

import java.util.*;

public class Game {

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        double[]a={cin.nextDouble(),cin.nextDouble(),cin.nextDouble(),cin.nextDouble()};
        System.out.println(solve24(a));
    }
    public static String solve24(double []a){
        String []ops = "+ - * /".split("\\s+");
        Random rand = new Random();
        for(int i=0;i<10000;i++){
            List<String> exp = new Vector<String>();
            for(double v:a ){
                exp.add(Double.toString(v));
            }
            for(int j=0;j<3;j++){
                exp.add(ops[rand.nextInt(4)]);
            }
            Collections.shuffle(exp);
            if(Math.abs(RPorlandExpression.evalue(exp)-24.0)<1e-6){
                StringBuffer buffer = new StringBuffer();
                BinaryTree.buildBTree(exp).midVisit(buffer);
                return buffer.toString();
            }
        }
        return "No solution!!!";
    }
}
