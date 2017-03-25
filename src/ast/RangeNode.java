package ast;

public class RangeNode extends AbstractNode {

	public String direction;
	
	public RangeNode(String d) {
		direction = d;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " (" + direction + ")";
	}
	
}
