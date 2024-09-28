import java.util.Objects;

/**
 * Created by kristofer on 7/13/20.
 */
public class TreeOneZero {
    Node root;

    private Node addRecursive(Node current, Integer value){
        Node newNode = new Node(value);
       if(root == null){
           root = newNode;
           return root;
       }
       current = root;
       while (true){
           if(newNode.value < current.value){
               if(current.left == null){
                   current.left = newNode;
                   return root;
               }
               current = current.left;
           } else if(value > current.value){
               if(current.right == null){
                   current.right = newNode;
                   return root;
               }
               current = current.right;
           } else {
               return current;
           }
       }
    }

    public void add(Integer value){
        this.root = addRecursive(root, value);
    }
}
