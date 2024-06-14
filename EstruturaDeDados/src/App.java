import dataStructure.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList("1");
        list.append("2");
        list.append("3");
        list.preprend("0");
        list.remove(2);
        list.print();
    }
}
