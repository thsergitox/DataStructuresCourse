package uni.aed.doublelinkedlist;

public class Tarea2 {
    Nodo root;
    
    public void add(int value) {
        if (root == null) {
            root = new Nodo(value);
            return;
        }

        int position = countNodes(root) + 1;
        String binaryPath = Integer.toBinaryString(position).substring(1); // Skip the leading 1

        Nodo current = root;
        for (char direction : binaryPath.toCharArray()) {
            if (direction == '0') {
                if (current.prev == null) {
                    current.prev = new Nodo(value);
                    return;
                }
                current = current.prev;
            } else {
                if (current.next == null) {
                    current.next = new Nodo(value);
                    return;
                }
                current = current.next;
            }
        }
    }

    private int countNodes(Nodo node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.prev) + countNodes(node.next);
    }


}
