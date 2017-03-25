
import ast.AbstractLiteralNode;
import ast.AbstractNode;
import ast.ArchitectureNode;
import ast.AssociationNode;
import ast.ComponentDeclarationNode;
import ast.ComponentInstantiationNode;
import ast.CompoundIdentifierNode;
import ast.EntityNode;
import ast.IdentifierNode;
import ast.IfStatementNode;
import ast.LibraryNode;
import ast.PortDeclarationNode;
import ast.PortListNode;
import ast.PortMapNode;
import ast.ProcessNode;
import ast.RangeNode;
import ast.SensitivityListNode;
import ast.SignalAssignmentNode;
import ast.SignalDeclarationNode;
import ast.UseNode;

public class BuildASTVisitor extends aspectvBaseVisitor<AbstractNode> {

	@Override
	public AbstractNode visitAbstract_literal(aspectvParser.Abstract_literalContext context) {
		AbstractLiteralNode n = new AbstractLiteralNode(context.getText());
		n.adoptChildren(visitChildren(context));
		return n;
	}
	
	@Override
	public AbstractNode visitArchitecture_body(aspectvParser.Architecture_bodyContext context) {
		ArchitectureNode n = new ArchitectureNode();
		n.adoptChildren(visitChildren(context));
		return n;
	}
	
	@Override
	public AbstractNode visitAssociation_element(aspectvParser.Association_elementContext context) {
		AssociationNode n = new AssociationNode();
		n.adoptChildren(visitChildren(context));
		return n;
	}
	
	@Override
	public AbstractNode visitComponent_declaration(aspectvParser.Component_declarationContext context) {
		ComponentDeclarationNode n = new ComponentDeclarationNode();
		n.adoptChildren(visitChildren(context));
		return n;
	}
	
	@Override
	public AbstractNode visitComponent_instantiation_statement(aspectvParser.Component_instantiation_statementContext context) {
		ComponentInstantiationNode n = new ComponentInstantiationNode();
		n.adoptChildren(visitChildren(context));
		return n;
	}
	
	@Override
	public AbstractNode visitConditional_signal_assignment(aspectvParser.Conditional_signal_assignmentContext context) {
		SignalAssignmentNode n = new SignalAssignmentNode();
		n.adoptChildren(visitChildren(context));
		return n;
	}
	
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
	public AbstractNode visitExplicit_range(aspectvParser.Explicit_rangeContext context) {
		RangeNode n = new RangeNode(context.getChild(1).getText());
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
	public AbstractNode visitPort_map_aspect(aspectvParser.Port_map_aspectContext context) {
		PortMapNode n = new PortMapNode();
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
	public AbstractNode visitSignal_declaration(aspectvParser.Signal_declarationContext context) {
		SignalDeclarationNode n = new SignalDeclarationNode();
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
