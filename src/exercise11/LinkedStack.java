package exercise11;

public class LinkedStack {
    private Node topNode;

    public boolean isEmpty() {
        return topNode==null;
    }

    public void push(String data) {
      Node newNode = new Node(data);
        if (isEmpty()){
          topNode = newNode;
          } else{
            
          }
    }

    public String pop() {
        // Pop element from stack
        return null;
    }

    @Override
    public String toString() {
        return NodeUtils.createNodeTraversalString(topNode);
    }
}
