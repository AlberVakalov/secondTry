package day18;

public class Task3 {
    public static void main(String[] args) {
    Node root = new Node(20);

    int[] numbers = {14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};
    for (int number : numbers){
        addNum(number, root);

    }
    dfs(root);
    }
    private static void dfs(Node node){
        if (node == null)
            return;

        dfs(node.getLeftNum());
        System.out.println(node.getNum() + " ");
        dfs(node.getRightNum());
    }

    private static void addNum(int inputNum, Node root){
        if(root == null)
            throw new IllegalArgumentException("Корень не может быть равен нулю");

        Node nextNode = root;
        Node current = null;
        while (nextNode != null){
            current = nextNode;

            if (inputNum >= current.getNum()){
                nextNode = current.getRightNum();
            } else
                nextNode = current.getLeftNum();
        }

        if (inputNum < current.getNum()){
            current.setLeftNum(new Node(inputNum));
        } else {
            current.setRightNum(new Node(inputNum));
        }

    }

}

