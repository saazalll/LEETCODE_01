class Node{
    int val; //for the data (instance data member)
    Node next; //for the next node reference
    //constructor
    Node(int val){ //local variable
        this.val = val; // instance var=local var
    }
}
class MyLinkedList {
    int size; //total no. of nodes
    Node head; // head contains the ref. of the 1st node


    public MyLinkedList() {
        size = 0;
        
    }
            //tc O(N)
    public int get(int index) {
        if(index<0 || index>=size){
            return -1;
        }
        else{
            Node temp = head;
            for(int i = 0; i<index; i++){
                temp = temp.next;    
            }
            return temp.val;
        }
        
    }
        //tc O(1)
    public void addAtHead(int val) {
        //create new node
        Node node = new Node(val);
        size++;
        // no linked list exist
        if(head == null){
            head = node;
        }
        else{
            node.next = head;
            head = node;
        }
    }
        //tc O(n)
    public void addAtTail(int val) {
        //create a new node
        Node node = new Node(val);
        size++;
        // no linked list exist
        if(head == null){
            head = node;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = node; // link at end
        }

        
    }
        // tcO(n)
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size){
            return; //invalid index
        }
        if(index == 0){
            addAtHead(val);
        }
        else if(index == size){
            addAtTail(val);
        }
        else{
            Node node = new Node(val);
            Node temp = head;
            //add at middle
            for(int i = 0; i<index-1;i++){
                temp = temp.next;   
            }
            node.next = temp.next;
            temp.next = node;
            size++;

        }
        
        
    }
        // tc O(n)
    public void deleteAtIndex(int index) {
        if(index<0 || index >= size){
            return;
        }
        //no linked list exists
        if(head == null){
            return;
        }
        if(index == 0){
            head = head.next;


        }
        else{
            Node temp = head;
            for(int i = 0; i<index-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        size --;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */