package composite;

public class TreeTest {

	public static void main(String[] args) {
		Tree tree=new Tree("A");
		 TreeNode nodeb=new TreeNode("B");
		 TreeNode nodec=new TreeNode("C");
		 nodeb.add(nodec);
		 tree.root.add(nodeb);
		 System.out.println("Tree build finished");
	}

}
