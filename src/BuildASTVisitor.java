
import ast.AbstractNode;
import ast.LibraryNode;

public class BuildASTVisitor extends aspectvBaseVisitor<AbstractNode> {

	@Override
	public AbstractNode visitDesign_file(aspectvParser.Design_fileContext context) {
		AbstractNode n = new AbstractNode();
		n.adoptChildren(visitChildren(context));
		return n;
	}
	
	@Override
	public AbstractNode visitLibrary_clause(aspectvParser.Library_clauseContext context) {
		LibraryNode n = new LibraryNode();
		n.adoptChildren(visitChildren(context));
		return n;
	}
	
	@Override
	protected AbstractNode aggregateResult(AbstractNode aggregate, AbstractNode nextResult) {
		if (aggregate == null)
			return nextResult;
		
		if (nextResult != null)
			aggregate.addSibling(nextResult);
			
		return aggregate;
	}
	
}
