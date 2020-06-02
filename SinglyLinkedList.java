public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList(){
        this.head = null;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }  

    public void remove(){
        if (head == null){
            return;
        }else{
            Node runner = head;
            while(runner.next.next != null){
                runner = runner.next;
            }
            runner.next = null;
        }
    }

    public void printValues(){
        if(head == null){
            return;
        }else{
            Node runner = head;
            while(runner != null){
                System.out.println(runner.value);
                runner = runner.next;
            }
        }
        return;
    }

    public Node find(int value){
        if(head == null){
            return null;
        }else{
            Node runner = head;
            while(runner != null){
                if(runner.value == value) return runner;
                runner = runner.next;
            }
        }
        return null;
    }

    public void removeAt(int index){
        if(head == null){
            return;
        }else{
            //Get the node at the index before the one we want to remove
            Node runner = head;
            for(int i = 0; i < index-1; i++){
                runner = runner.next;
            }
            //Store the location of the node after the one we want to remove
            Node afterIndex = runner.next.next;
            //Point the node at index before to the node at index after
            runner.next = afterIndex;
        }
    }
}