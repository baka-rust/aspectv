package ast;

public class AbstractLiteralNode extends AbstractNode {

	public String value;
	
	public AbstractLiteralNode(String v) {
		value = v;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " (" + value + ")";
	}
	
}
