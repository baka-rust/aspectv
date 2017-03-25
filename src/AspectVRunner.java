import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import aspectv.BasicVisitor;
import aspectv.GenerativeVisitor;
import ast.AbstractNode;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class AspectVRunner {
	public static void main(String[] args) throws Exception {
		File file = new File("test.vhd");
		
		try (FileInputStream fis = new FileInputStream(file)) {
			ANTLRInputStream input = new ANTLRInputStream(fis);
			
			aspectvLexer lexer = new aspectvLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			aspectvParser parser = new aspectvParser(tokens);
			
			ParseTree tree = parser.design_file(); // design_file is the first non-terminal
			
			System.out.println("Parse Tree:");
			System.out.println(tree.toStringTree(parser));
			
			System.out.println("\nAbstract Syntax Tree:");
			BuildASTVisitor visitor = new BuildASTVisitor();
			AbstractNode root = visitor.visit(tree);
			root.printTree(0);
			
			System.out.println("\nAST Test Visitor: ");
			BasicVisitor bv = new BasicVisitor();
			bv.defaultVisit(root);
			
			System.out.println("\nGeneration: \n");
			GenerativeVisitor gv = new GenerativeVisitor();
			gv.defaultVisit(root);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
