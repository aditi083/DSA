public class Stack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 18;
    int ptr = -1;

    public Stack(){
        this(DEFAULT_SIZE);
    }

    public Stack(int size){
        this.data = new int[size];
    }
    
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }


    private boolean isFull() {
        return ptr == data.length - 1;
    }

    private boolean isEmpty() {
        return ptr == -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(34);
        stack.push(45);
        stack.push(18);
        stack.push(33);
        stack.push(79);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
