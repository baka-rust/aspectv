package ast;

import aspectv.ReflectiveVisitor;

public class AbstractNode {

	public AbstractNode firstChild;
	public AbstractNode nextSibling;
	
	public AbstractNode() {
		firstChild = null;
		nextSibling = null;
	}
	
	public void accept(ReflectiveVisitor visitor) {
		visitor.dispatch(this);
	}
	
	public void adoptChildren(AbstractNode n) {
		if (firstChild == null) {
			firstChild = n;
		} else {
			//TODO: adoption cases where node already has first child
		}
	}
	
	public void addSibling(AbstractNode n) {
		if (nextSibling == null) {
			nextSibling = n;
			return;
		}
		
		AbstractNode currentNode = this;
		while (currentNode.nextSibling != null) {
			currentNode = currentNode.nextSibling;
		}
		currentNode.nextSibling = n;
	}
	
	private void treePrint(int indent) {
		for (int i = 0; i < indent; i++) {
			System.out.print("\t");
		}
		System.out.println(this.toString());
	}
	
	public void printTree(int indent) {
		this.treePrint(indent);
		if (this.firstChild != null) {
			this.firstChild.printTree(indent + 1);
		}
		if (this.nextSibling != null) {
			this.nextSibling.printTree(indent);
		}
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
	
	
}
