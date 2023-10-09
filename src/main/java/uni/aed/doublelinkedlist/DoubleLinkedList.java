package uni.aed.doublelinkedlist;

public class DoubleLinkedList {
    
   Nodo head;

    // Insert data at a specific position
    public void addAt(int position, Object data) {
       Nodo newNode = new Nodo(data);

        // Inserting at the start
        if (position == 0) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            return;
        }

        Nodo current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        // If position is out of bounds
        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }

        newNode.next = current.next;
        newNode.prev = current;
        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;
    }

    // Delete node at a specific position
    public void deleteAtPosition(int position) {
        if (head == null) return;

        // Deleting the head node
        if (position == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        Nodo current = head;
        for (int i = 0; i < position && current != null; i++) {
            current = current.next;
        }

        // If position is out of bounds or current node is null
        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        }
    }

    // Display the list
    public void display() {
        Nodo current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void addFirst(Object data) {
        Nodo newNode = new Nodo(data);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    // Add node at the end of the list
    public void addLast(Object data) {
        Nodo newNode = new Nodo(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Nodo current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    // Delete the first node with the given value
    public void remove(Object data) {
        if (head == null) return;
        if (head.data.equals(data)) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }
        Nodo current = head;
        while (current != null && !current.data.equals(data)) {
            current = current.next;
        }
        if (current == null) return;
        if (current.next != null) {
            current.next.prev = current.prev;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }
    }

    // Return the number of elements in the list
    public int size() {
        int count = 0;
        Nodo current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return head == null;
    }
    
    public void clear(){
        head = null;
    }
    
    public Nodo getAt(int index) {
        Nodo current = head;
        int count = 0;
        while (current != null && count != index) {
            current = current.next;
            count++;
        }
        return current;
    }

    public void swapNodes(int i, int j) {
        Nodo nodeI = getAt(i);
        Nodo nodeJ = getAt(j);
        
        Object tempData = nodeI.data;
        nodeI.data = nodeJ.data;
        nodeJ.data = tempData;
    }
    
    
    public void heapify(DoubleLinkedList list, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        Object largestValue = list.getAt(largest).data;
        Object leftValue = left < n ? list.getAt(left).data : null;
        Object rightValue = right < n ? list.getAt(right).data : null;

        if (leftValue != null && Integer.parseInt((String) leftValue) > Integer.parseInt((String) largestValue)) {
            largest = left;
            largestValue = leftValue;
        }

        if (rightValue != null && Integer.parseInt((String) rightValue) > Integer.parseInt((String) largestValue)) {
            largest = right;
         }

        if (largest != i) {
            list.swapNodes(i, largest);
            heapify(list, n, largest);
        }
    }

    public  void heapSort(DoubleLinkedList list) {
        int n = list.size();
        System.out.println(n);
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(list, n, i);
        }
        
        System.out.println(list.draw_tree(list));
  
        for (int i = n - 1; i > 0; i--) {          
            list.swapNodes(0, i);
            heapify(list, i, 0);
          
        }   
    }
    
    public String draw_tree(DoubleLinkedList list) {
        return draw_tree(list, 0, 0) ; 
                
    }

    public String draw_tree(DoubleLinkedList list, int level, int index) {
        if (index >= list.size()) {
            return "";
        }

        String indent = "-|-".repeat(level) + list.getAt(index).data + "\n";
  

        int left_child = 2 * index + 1;
        int right_child = 2 * index + 2;

        String leftTree = draw_tree(list, level + 1, left_child);
        String rightTree = draw_tree(list, level + 1, right_child);
    
        return indent + leftTree + rightTree;
    }
    
    
    @Override
    public String toString(){
        Nodo actual=head;
        String lista="";
        while(actual!=null){
            if(actual.prev==null)
                lista="null<-"+actual.data+"->"+actual.next.data;
            else if(actual.next==null)
                lista=lista+"||"+actual.prev.data+"<-"+ actual.data+"->null";
            else
                lista=lista+"||"+actual.prev.data+"<-"+actual.data+"->"+ actual.next.data;
            actual=actual.next;
        }
        return lista;
    }
    
}
