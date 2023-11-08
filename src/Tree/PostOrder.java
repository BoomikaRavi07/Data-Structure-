package Tree;

class tree{
	int item;
	Node left,right;
	public tree(int key) {
		item = key;
		left = right = null;
	}
}

public class PostOrder {
	Node root;
	PostOrder(){
		root = null;
	}
	void postorder(Node node) {
   	 if(node==null)
   		 return;
   	 postorder(node.left);
   	 postorder(node.right);
   	 System.out.print(node.item+"->");
    }
	public static void main(String[] args) {
		 PostOrder tree = new PostOrder();
		 tree.root = new Node(1);
		 tree.root.left = new Node(12);
		 tree.root.right = new Node(9);
		 tree.root.left.left = new Node(5);
		 tree.root.left.right = new Node(6);
		 System.out.println("Preorder traversal");
		 tree.postorder(tree.root);
	}

}
