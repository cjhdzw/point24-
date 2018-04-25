package code;

import java.util.List;
import java.util.Stack;

public class BinaryTree{//构造二叉树
    String root;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(){
        root="";
        left=right=null;
    }

    public BinaryTree(String root, BinaryTree left, BinaryTree right){
        super();
        this.left=left;
        this.right=right;
        this.root=root;
    }

    static BinaryTree buildBTree(List<String> exp){
        Stack<BinaryTree> st=new Stack<BinaryTree>();
        for(String c:exp){
            if("+-*/".contains(c)){
                BinaryTree op = new BinaryTree(c,null,null);
                BinaryTree b = st.pop();
                BinaryTree a = st.pop();
                op.left = a;
                op.right = b;
                st.push(op);
            }else {
                st.push(new BinaryTree(c,null,null));
            }
        }
        return st.pop();
    }

    public void midVisit(StringBuffer buffer){
        if(left!=null){
            buffer.append("(");
            left.midVisit(buffer);
        }
        buffer.append(root);
        if(right!=null){
            right.midVisit(buffer);
            buffer.append(")");
        }
    }
}