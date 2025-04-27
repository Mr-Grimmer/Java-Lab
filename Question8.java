public class Question8 {
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node last;

    public void add(int data) {
        Node newNode = new Node(data);
        if (last == null) {
            last = newNode;
            last.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    public int sumOfEven() {
        if (last == null) return 0;
        int sum = 0;
        Node temp = last.next;
        do {
            if (temp.data % 2 == 0) {
                sum += temp.data;
            }
            temp = temp.next;
        } while (temp != last.next);
        return sum;
    }

    public static void main(String[] args) {
        Question8 list = new Question8();
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(3);

        System.out.println("Sum of even numbers: " + list.sumOfEven());
    }
}
