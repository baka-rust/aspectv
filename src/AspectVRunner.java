import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class AspectVRunner {
	public static void main(String[] args) throws Exception {
		File file = new File("test.vhd");
		
		try (FileInputStream fis = new FileInputStream(file)) {
			ANTLRInputStream input = new ANTLRInputStream(fis);
			
			vhdlLexer lexer = new vhdlLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			vhdlParser parser = new vhdlParser(tokens);
			
			ParseTree tree = parser.design_file(); // design_file is the first non-terminal
			
			System.out.println("Generated Tree:\n");
			System.out.println(tree.toStringTree(parser));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
