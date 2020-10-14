public class Main {
    public static void main(String[] argv) {
        String[] months = {"define","number","number1","=","10"};
        Tree tree = new Tree();
        for (int i = 0; i < months.length; i++)
            tree.insert(months[i]);
        tree.inorderTraversal();
        System.out.println();
    }
}