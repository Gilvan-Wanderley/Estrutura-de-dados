import dataStructure.LinkedList;
import dataStructure.Queue;
import dataStructure.Stack;
import dataStructure.Tree;

public class App {
    public static void main(String[] args) throws Exception {
        tree();
    }
    public static void tree(){
        Tree<Integer> tree = new Tree<Integer>(37);
        tree.insert(11);
        tree.insert(66);
        tree.insert(8);
        tree.insert(17);
        tree.insert(42);
        tree.insert(72);

        tree.BFS();
        // tree.posOrder();
        // tree.inOrder();
        // tree.preOrder();
        // System.out.println(tree.root.data);
        // System.out.println(tree.root.left.data);
        // System.out.println(tree.root.right.data);
    }

    public static void queue(){
        Queue queue = new Queue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        queue.dequeue();
        queue.print();
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
