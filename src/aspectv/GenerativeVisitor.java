package aspectv;

import java.io.PrintStream;

import ast.AbstractNode;
import ast.IdentifierNode;
import ast.LibraryNode;

public class GenerativeVisitor extends ReflectiveVisitor {

	private static PrintStream output;
	
	public GenerativeVisitor() {
		output = System.out;
	}
	
	public void visit(LibraryNode n) {
		//System.out.println(((IdentifierNode)(n.firstChild)).value);
		String libraryRef = ((IdentifierNode)(n.firstChild)).value;
		output.printf("library %s;\n", libraryRef);
		visitChildren((AbstractNode)n);
	}
	
}
