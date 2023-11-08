package Tree;
class Binary{
	int item;
	Node left,right;
	public Binary(int key) {
		item = key;
		left = right = null;
	}
}

public class Binary_Tree {
	Node root;
	Binary_Tree (){
		root = null;
	}
    void inorder(Node node) {
    	if(node == null)
    		return;
    	inorder(node.left);
    	System.out.print(node.item+"->");
    	inorder(node.right);
    }
	    void preorder(Node node) {
	    	if(node == null)
	    		return;
	    	System.out.print(node.item+"->");
	    	preorder(node.left);
	    	preorder(node.right);
	    }
	    	void postorder(Node node) {
	       	 if(node==null)
	       		 return;
	       	 postorder(node.left);
	       	 postorder(node.right);
	       	 System.out.print(node.item+"->");
	        }
	public static void main(String[] args) {
		 Binary_Tree tree = new Binary_Tree();
		 tree.root = new Node(1);
		 tree.root.left = new Node(12);
		 tree.root.right = new Node(13);
		 tree.root.left.left = new Node(6);
		 tree.root.left.right = new Node(10);
		 tree.root.left.left.left = new Node(2);
		 tree.root.left.left.right = new Node(3);
		 tree.root.right.left = new Node(8);
		 tree.root.right.right = new Node(9);
		 //tree.root.right.left.left= new Node(30);
		 //tree.root.right.right.right = new Node(60);
		 System.out.println("Inorder traversal");
		 tree.inorder(tree.root);
		 System.out.println("\nPreorder traversal");
		 tree.preorder(tree.root);
		 System.out.println("\nPreorder traversal");
		 tree.postorder(tree.root);
		 
	}

}