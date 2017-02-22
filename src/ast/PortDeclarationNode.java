package ast;

public class PortDeclarationNode extends AbstractNode {

	public String mode;
	
	public PortDeclarationNode(String m) {
		mode = m;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " (" + mode + ")";
	}
	
	
}
