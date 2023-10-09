package uni.aed.circularlinkedlist;

public class CircularLinkedList {
    Nodo head;

    public void clear(){
        head=null;     
    }
    
    // Insert data at a specific position
    public void addAt(int position, Object data) {
        Nodo newNode = new Nodo(data);

        if (head == null) {
            head = newNode;
            return;
        }

        if (position == 0) {
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev.next = newNode;
            head.prev = newNode;
            head = newNode;
            return;
        }

        Nodo current = head;
        for (int i = 0; i < position - 1 && current.next != head; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
    }

    // Add node at the beginning of the list
    public void addFirst(Object data) {
        addAt(0, data);
    }

    // Add node at the end of the list
    public void addLast(Object data) {
        addAt(size(), data);
    }

    // Delete node at a specific position
    public void deleteAtPosition(int position) {
        if (head == null) return;

        if (position == 0) {
            if (head.next == head) {  // Only one node in the list
                head = null;
                return;
            }
            head.prev.next = head.next;
            head.next.prev = head.prev;
            head = head.next;
            return;
        }

        Nodo current = head;
        for (int i = 0; i < position && current.next != head; i++) {
            current = current.next;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;
    }

    // Delete the first node with the given value
    public void remove(Object data) {
        if (head == null) return;

        if (head.data.equals(data)) {
            deleteAtPosition(0);
            return;
        }

        Nodo current = head.next;
        while (current != head && !current.data.equals(data)) {
            current = current.next;
        }

        if (current != head) {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    // Return the number of elements in the list
    public int size() {
        if (head == null) return 0;
        
        int count = 1;
        Nodo current = head.next;
        while (current != head) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return head == null;
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
    
    public void heapify(CircularLinkedList list, int n, int i) {
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

    public  void heapSort(CircularLinkedList list) {
        int n = list.size();
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(list, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            list.swapNodes(0, i);
            heapify(list, i, 0);
        }
    }
    
    @Override
    public String toString(){
        if (head == null) return "[]";

        StringBuilder result = new StringBuilder();
        Nodo current = head;
        do {
            result.append(current.data).append(" <-> ");
            current = current.next;
        } while (current != head);
        result.append(current.data); 

        return result.toString();

    }
    
}
