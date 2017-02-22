package ast;

public class IdentifierNode extends AbstractNode {

	public String value;
	
	public IdentifierNode(String v) {
		value = v;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " (" + value + ")";
	}
	
}
