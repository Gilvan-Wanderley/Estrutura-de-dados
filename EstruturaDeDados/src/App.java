import dataStructure.LinkedList;
import dataStructure.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        stack();
    }

    public static void stack(){
        Stack stack = new Stack("0");
        stack.push("1");
        stack.print();
        stack.pop();
        stack.print();
    }

    public static void linkedList(){
        LinkedList list = new LinkedList("1");
        list.append("2");
        list.append("3");
        list.preprend("0");
        list.remove(2);
        list.print();
    }
}
