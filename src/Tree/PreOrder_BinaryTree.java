package Tree;

	class Tree{
		int item;
		Node left,right;
		public Tree(int key) {
			item = key;
			left = right = null;
		}
	}

	public class PreOrder_BinaryTree {
		Node root;
		PreOrder_BinaryTree(){
			root = null;
		}
	    void preorder(Node node) {
	    	if(node == null)
	    		return;
	    	System.out.print(node.item+"->");
	    	preorder(node.left);
	    	preorder(node.right);
	    }
		public static void main(String[] args) {
			 PreOrder_BinaryTree tree = new PreOrder_BinaryTree ();
			 tree.root = new Node(1);
			 tree.root.left = new Node(12);
			 tree.root.right = new Node(9);
			 tree.root.left.left = new Node(5);
			 tree.root.left.right = new Node(6);
			 System.out.println("Preorder traversal");
			 tree.preorder(tree.root);
		}

	}

