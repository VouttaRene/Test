package Aufgabe;

public class BinarySearchTree {
	
	int insertValue = 42;

	Node node27 = new Node(27, null, null);
	Node node35 = new Node(35, null, null);
	Node node29 = new Node(29, node27, null);
	Node node33 = new Node(33, null, node35);
	Node node32 = new Node(32, node29, node33);
	Node node41 = new Node(41, node32, null);
	
	Node node81 = new Node(81, null, null);
	Node node64 = new Node(64, null, null);
	Node node76 = new Node(76, null, node81);
	Node node99 = new Node(99, null, null);
	Node node74 = new Node(74, node64, node76);
	Node node95 = new Node(95, null, node99);
	Node node86 = new Node(86, node74, node95);
	
	Node node45 = new Node(45, node41, node86);
	
	public void executeBinarySearchTree() {
		System.out.println("---BINARY SEARCH TREE TRAVERSALS---\n");
		//Pre-Order
		System.out.println("Pre-Order:");
		preOrder(node45);
		//In-Order
		System.out.println("\n\nIn-Order:");
		inOrder(node45);
		//Post-Order
		System.out.println("\n\nPost-Order:");
		postOrder(node45);
		System.out.println("\n\n---BINARY SEARCH TREE SEARCH RESULT---\n");
		//Insert 42
		addRec(insertValue);
		//Locate 42
		System.out.println("Value " + insertValue + " exists in the given binary search tree: " + containsNode(insertValue));
	}//executeBinarySearchTree
	
	private void preOrder(Node node) {
		if(node == null) return;
		System.out.print(node.value + " ");
		preOrder(node.leftNode);
		preOrder(node.rightNode);
	}//preOrder
	
	private void inOrder(Node node) {
		if(node == null) return;
		inOrder(node.leftNode);
		System.out.print(node.value + " ");
		inOrder(node.rightNode);
	}//inOrder
	
	private void postOrder(Node node) {
		if(node == null) return;
		postOrder(node.leftNode);
		postOrder(node.rightNode);
		System.out.print(node.value + " ");
	}//postOrder
	
	private void addRec(int value) {
		addNodeRec(node45, value);
		System.out.println("Inserted value " + value + ".");
	}//addRec
	
	private Node addNodeRec(Node currentNode, int value) {
		if(currentNode == null) return new Node(value, null, null);
		if(value < currentNode.value)
			currentNode.leftNode = addNodeRec(currentNode.leftNode, value);
		else if(value > currentNode.value)
			currentNode.rightNode = addNodeRec(currentNode.rightNode, value);
		else
			return currentNode;
		
		return currentNode;
	}//addNodeRec
	
	private boolean containsNode(int value) {
		return containsNodeRec(node45, value);
	}//containsNode
	
	private boolean containsNodeRec(Node currentNode, int value) {
		if(currentNode == null) 
			return false;
		if(value == currentNode.value)
			return true;
		
		if(value < currentNode.value)
			return containsNodeRec(currentNode.leftNode, value);
		else
			return containsNodeRec(currentNode.rightNode, value);
					
	}//containsNodeRec	
}//BinarySearchTree
