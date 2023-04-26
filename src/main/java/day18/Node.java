package day18;

public class Node {
    private int num;
    private Node rightNum;
    private Node leftNum;

    public Node(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Node getRightNum() {
        return rightNum;
    }

    public void setRightNum(Node rightNum) {
        this.rightNum = rightNum;
    }

    public Node getLeftNum() {
        return leftNum;
    }

    public void setLeftNum(Node leftNum) {
        this.leftNum = leftNum;
    }
}
