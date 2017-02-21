package aspectv;

import ast.AbstractNode;
import ast.Importish;

public class BasicVisitor extends ReflectiveVisitor {
	
	public void visit(Importish n) {
		System.out.println("Visited importish node " + n.toString());
		visitChildren((AbstractNode)n);
	}
	
}
