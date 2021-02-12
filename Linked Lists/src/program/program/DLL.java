package program.program;


public class DLL {
    
    Node head;
    Node tail;
    int size;
    
    
    public DLL() {
        
        head = tail = null;
        size = 0;
    }
    
    public Node search(int x) {
        
        if (this.isEmpty())
            return null;
        
        Node temp = head;
        for (int i = 0; i < size ; i++) {
            if (temp.val == x) 
                return temp;
            
            temp = temp.next;
        }
        
        return null;
    }
    
    public void insert(int x) {

        Node N = new Node(x);

        if (isEmpty()) {
            head = tail = N;
            size++;
            return;
        }

            N.prev = null;
            N.next = head;
            head.prev = N;
            head = N;
            size++;
            return;
    }
    
    public boolean remove(int x) {

        if (isEmpty())
            return false;

        Node temp = search(x);

        if (temp == null)
            return false;

        if (temp.val == head.val) {
            head = head.next;
            head.prev = null;
            return true;

        } else if (temp.val == tail.val) {

                tail = tail.prev;
                tail.next = null;

                return true;

        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            }

        size --;
        return true;
        }



    public boolean isEmpty() {

        return size == 0;
    }


    @Override
    public String toString() {
        String str = "";
        Node temp = head;

        while (temp != null) {

            str += "{ " + temp.val + " } " ;
            temp = temp.next;
        }
        return str;
    }
}
