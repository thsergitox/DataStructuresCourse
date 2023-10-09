package uni.aed.linkedlist;

public class ListaEnlazada {
    Nodo head;
    
    public void addFirst(Object data){
        Nodo newNodo=new Nodo(data);
        newNodo.next=head;
        head=newNodo;
    }
    
    public void addLast(Object data){
        Nodo newNodo=new Nodo(data);
        if(head==null){
            head=newNodo;
            return;
        }
        Nodo current =head;
        while(current.next!=null)
            current=current.next;        
        current.next=newNodo;
    }
    public void remove(Object data) {
        if (head == null) return;
        if (head.data.equals(data)) {
            head = head.next;
            return;
        }
        Nodo current = head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }
    
    public void addAt(int position, Object data) {
        Nodo newNode = new Nodo(data);

        // Inserting at the start
        if (position == 0) {
            newNode.next = head;
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
        current.next = newNode;
    }
    
    public void clear(){
        head=null;     
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
    
    public void heapify(ListaEnlazada list, int n, int i) {
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

    public  void heapSort(ListaEnlazada list) {
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
        String lista="";
        Nodo current =head;
        while(current!=null){
            if(lista.length()==0)
                lista=""+current.data;
            else
                lista=lista +"->"+current.data;
            current=current.next;
        }
        return lista;        
    }
    
}
