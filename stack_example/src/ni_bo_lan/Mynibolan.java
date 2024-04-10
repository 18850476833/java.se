package ni_bo_lan;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2024-04-10
 * Time: 20:26
 */
public class Mynibolan implements Inibolan{
    @Override
    public boolean IsMath(String x) {
        if(x.equals("+") || x.equals("-") || x.equals("*") || x.equals("/") ){
            return false;
        }
        return true;
    }

    @Override
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < tokens.length ; i++){
            if(IsMath(tokens[i])){
                stack.push(Integer.parseInt(tokens[i]));
            }else{
                int l1 = stack.pop();
                int l2 = stack.pop();
                switch(tokens[i]){
                    case "+":
                        stack.push(l2 + l1);
                        break;
                    case "-":
                        stack.push(l2 - l1);
                        break;
                    case "*":
                        stack.push(l2 * l1);
                        break;
                    case "/":
                        if(l1 == 0){
                            stack.push(0);
                        }else{
                            stack.push(l2 / l1);
                        }
                        break;
                }
            }
        }
        int ret = stack.pop();
        return ret;
    }
}
