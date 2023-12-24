public class circular {
    public Node head;
    public Node tail;
    int size; 

    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
        }
        node.next = head;
        tail.next = node;
        tail = node;
    }

    public void display(){
        Node node =  head;
        if(head != null){
            do{
                System.out.print(node.value + " -> ");
                node = node.next;
            }
            while(node != head);
            System.out.println("null");
        }
    }

    public class Node{
        int value;
        Node next;

        public Node(int value){
            this.value= value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        circular list = new circular();
        list.insert(12);
        list.insert(3);
        list.insert(14);
        list.insert(5);
        list.display();
    }
}
