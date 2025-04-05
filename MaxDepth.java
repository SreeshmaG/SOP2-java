import java.util.Scanner;

class Node{
    int value;
    Node left;
    Node right;

    public Node(int value){
        this.value = value;
        this.left = null;
        this.right = null;
     }
}

public class BalanceTree{
    //Build the tree

     public static Node buildTree(Scanner scan){
    System.out.println("enter the value of the node");
    int value = scan.nextInt();
    if(value == -1){
        return null;
    }
    Node newNode = new Node(value);
    System.out.println("enter the left node of the value" + value);
    newNode.left = buildTree(scan);
    System.out.println("enter the value of the right node"+ value);
    newNode.right = buildTree(scan);

    return newNode;

   }

  public Node MaximumDepth(int root) {
            int count = 0;
            Node current = root;
            while (current != null) {              
                 current = current.leftChild; 
                 if(current.leftChild != null){
                    
                    MaximumDepth(current.leftchild)
                     }
                      else if(current.rightChild != null){
                              
                              MaximumDepth(current.leftChild)
                             }
                             }
                      count++;
                          
                     }
               return count;
                              
                           
     public static void  main(String[]args){
    Scanner scan = new Scanner(System.in);
    Node root = buildTree(scan);
    MaximumDepth(root);

    scan.close();

    }

