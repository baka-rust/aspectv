
import ast.AbstractNode;
import ast.CompoundIdentifierNode;
import ast.EntityNode;
import ast.IdentifierNode;
import ast.IfStatementNode;
import ast.LibraryNode;
import ast.PortDeclarationNode;
import ast.PortListNode;
import ast.ProcessNode;
import ast.SensitivityListNode;
import ast.UseNode;

public class BuildASTVisitor extends aspectvBaseVisitor<AbstractNode> {

	@Override
	public AbstractNode visitDesign_file(aspectvParser.Design_fileContext context) {
		AbstractNode n = new AbstractNode();
		n.adoptChildren(visitChildren(context));
		return n;
	}
	
	@Override
	public AbstractNode visitEntity_declaration(aspectvParser.Entity_declarationContext context) {
		EntityNode n = new EntityNode();
		n.adoptChildren(visitChildren(context));
		return n;
	}
	
	@Override
	public AbstractNode visitIdentifier(aspectvParser.IdentifierContext context) {
		IdentifierNode n = new IdentifierNode(context.getText());
		return n;
	}
	
	@Override
	public AbstractNode visitIf_statement(aspectvParser.If_statementContext context) {
		IfStatementNode n = new IfStatementNode();
		n.adoptChildren(visitChildren(context));
		return n;
	}
	
	@Override
	public AbstractNode visitInterface_port_declaration(aspectvParser.Interface_port_declarationContext context) {
		PortDeclarationNode n = new PortDeclarationNode(context.getChild(2).getText());
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
	public AbstractNode visitPort_list(aspectvParser.Port_listContext context) {
		PortListNode n = new PortListNode();
		n.adoptChildren(visitChildren(context));
		return n;
	}
	
	@Override
	public AbstractNode visitProcess_statement(aspectvParser.Process_statementContext context) {
		ProcessNode n = new ProcessNode();
		n.adoptChildren(visitChildren(context));
		return n;
	}
	
	@Override
	public AbstractNode visitSelected_name(aspectvParser.Selected_nameContext context) {
		if (context.getChildCount() > 1) {
			CompoundIdentifierNode n = new CompoundIdentifierNode();
			n.adoptChildren(visitChildren(context));
			return n;
		}
		return visitChildren(context);
	}
	
	@Override
	public AbstractNode visitSensitivity_list(aspectvParser.Sensitivity_listContext context) {
		SensitivityListNode n = new SensitivityListNode();
		n.adoptChildren(visitChildren(context));
		return n;
	}
	
	@Override
	public AbstractNode visitSuffix(aspectvParser.SuffixContext context) {
		if (!context.getText().isEmpty()) {
			IdentifierNode n = new IdentifierNode(context.getText());
			return n;
		}
		return visitChildren(context);
	}
	
	@Override
	public AbstractNode visitUse_clause(aspectvParser.Use_clauseContext context) {
		UseNode n = new UseNode();
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
