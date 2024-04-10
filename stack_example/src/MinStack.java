import java.util.Stack;

class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minstack;

    public MinStack() {
        stack = new Stack<>();
        minstack = new Stack<>();
    }


    public void push(int val) {
        stack.push(val);
        if(minstack.empty()){
            minstack.push(val);
        }else{
            if(minstack.peek() >= val){
                //minstack.pop();
                minstack.push(val);
            }
        }
    }

    public void pop() {
        int val = stack.peek();
        stack.pop();
        if(!minstack.empty()){
            if(val == minstack.peek()){
                minstack.pop();
            }
        }

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        if(!minstack.empty()){
            return minstack.peek();
        }
        return -1;
    }
}