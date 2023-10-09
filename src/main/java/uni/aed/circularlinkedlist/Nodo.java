package uni.aed.circularlinkedlist;

public class Nodo {
        Object data;
        Nodo next;
        Nodo prev;

        public Nodo(Object data) {
            this.data = data;
            this.next = this; // Default to pointing to itself
            this.prev = this; // Default to pointing to itself
        }
}
