// Generated from aspectv.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link aspectvParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface aspectvVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link aspectvParser#abstract_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstract_literal(aspectvParser.Abstract_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#access_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_type_definition(aspectvParser.Access_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#across_aspect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcross_aspect(aspectvParser.Across_aspectContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#actual_designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActual_designator(aspectvParser.Actual_designatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#actual_parameter_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActual_parameter_part(aspectvParser.Actual_parameter_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#actual_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActual_part(aspectvParser.Actual_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#adding_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdding_operator(aspectvParser.Adding_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#aggregate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate(aspectvParser.AggregateContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#alias_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_declaration(aspectvParser.Alias_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#alias_designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_designator(aspectvParser.Alias_designatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#alias_indication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_indication(aspectvParser.Alias_indicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#allocator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocator(aspectvParser.AllocatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#architecture_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArchitecture_body(aspectvParser.Architecture_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#architecture_declarative_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArchitecture_declarative_part(aspectvParser.Architecture_declarative_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#architecture_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArchitecture_statement(aspectvParser.Architecture_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#architecture_statement_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArchitecture_statement_part(aspectvParser.Architecture_statement_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#array_nature_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_nature_definition(aspectvParser.Array_nature_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#array_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_type_definition(aspectvParser.Array_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#assertion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertion(aspectvParser.AssertionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#assertion_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertion_statement(aspectvParser.Assertion_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#association_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociation_element(aspectvParser.Association_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#association_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociation_list(aspectvParser.Association_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#attribute_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_declaration(aspectvParser.Attribute_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#attribute_designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_designator(aspectvParser.Attribute_designatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#attribute_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_specification(aspectvParser.Attribute_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#base_unit_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_unit_declaration(aspectvParser.Base_unit_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#binding_indication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinding_indication(aspectvParser.Binding_indicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#block_configuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_configuration(aspectvParser.Block_configurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#block_declarative_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_declarative_item(aspectvParser.Block_declarative_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#block_declarative_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_declarative_part(aspectvParser.Block_declarative_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#block_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_header(aspectvParser.Block_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#block_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_specification(aspectvParser.Block_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#block_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement(aspectvParser.Block_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#block_statement_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement_part(aspectvParser.Block_statement_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#branch_quantity_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch_quantity_declaration(aspectvParser.Branch_quantity_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#break_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_element(aspectvParser.Break_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#break_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_list(aspectvParser.Break_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#break_selector_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_selector_clause(aspectvParser.Break_selector_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(aspectvParser.Break_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_statement(aspectvParser.Case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#case_statement_alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_statement_alternative(aspectvParser.Case_statement_alternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoice(aspectvParser.ChoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#choices}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoices(aspectvParser.ChoicesContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#component_configuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_configuration(aspectvParser.Component_configurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#component_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_declaration(aspectvParser.Component_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#component_instantiation_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_instantiation_statement(aspectvParser.Component_instantiation_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#component_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_specification(aspectvParser.Component_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#composite_nature_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposite_nature_definition(aspectvParser.Composite_nature_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#composite_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposite_type_definition(aspectvParser.Composite_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#concurrent_assertion_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurrent_assertion_statement(aspectvParser.Concurrent_assertion_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#concurrent_break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurrent_break_statement(aspectvParser.Concurrent_break_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#concurrent_procedure_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurrent_procedure_call_statement(aspectvParser.Concurrent_procedure_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#concurrent_signal_assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurrent_signal_assignment_statement(aspectvParser.Concurrent_signal_assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(aspectvParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#condition_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_clause(aspectvParser.Condition_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#conditional_signal_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_signal_assignment(aspectvParser.Conditional_signal_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#conditional_waveforms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_waveforms(aspectvParser.Conditional_waveformsContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#configuration_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfiguration_declaration(aspectvParser.Configuration_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#configuration_declarative_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfiguration_declarative_item(aspectvParser.Configuration_declarative_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#configuration_declarative_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfiguration_declarative_part(aspectvParser.Configuration_declarative_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#configuration_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfiguration_item(aspectvParser.Configuration_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#configuration_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfiguration_specification(aspectvParser.Configuration_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#constant_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_declaration(aspectvParser.Constant_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#constrained_array_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrained_array_definition(aspectvParser.Constrained_array_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#constrained_nature_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrained_nature_definition(aspectvParser.Constrained_nature_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(aspectvParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#context_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContext_clause(aspectvParser.Context_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#context_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContext_item(aspectvParser.Context_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#delay_mechanism}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelay_mechanism(aspectvParser.Delay_mechanismContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#design_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesign_file(aspectvParser.Design_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#design_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesign_unit(aspectvParser.Design_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignator(aspectvParser.DesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection(aspectvParser.DirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#disconnection_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisconnection_specification(aspectvParser.Disconnection_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#discrete_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscrete_range(aspectvParser.Discrete_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#element_association}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_association(aspectvParser.Element_associationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#element_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_declaration(aspectvParser.Element_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#element_subnature_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_subnature_definition(aspectvParser.Element_subnature_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#element_subtype_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_subtype_definition(aspectvParser.Element_subtype_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#entity_aspect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_aspect(aspectvParser.Entity_aspectContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#entity_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_class(aspectvParser.Entity_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#entity_class_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_class_entry(aspectvParser.Entity_class_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#entity_class_entry_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_class_entry_list(aspectvParser.Entity_class_entry_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#entity_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_declaration(aspectvParser.Entity_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#entity_declarative_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_declarative_item(aspectvParser.Entity_declarative_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#entity_declarative_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_declarative_part(aspectvParser.Entity_declarative_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#entity_designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_designator(aspectvParser.Entity_designatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#entity_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_header(aspectvParser.Entity_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#entity_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_name_list(aspectvParser.Entity_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#entity_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_specification(aspectvParser.Entity_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#entity_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_statement(aspectvParser.Entity_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#entity_statement_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_statement_part(aspectvParser.Entity_statement_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#entity_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_tag(aspectvParser.Entity_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#enumeration_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeration_literal(aspectvParser.Enumeration_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#enumeration_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeration_type_definition(aspectvParser.Enumeration_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#exit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_statement(aspectvParser.Exit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(aspectvParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(aspectvParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#file_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_declaration(aspectvParser.File_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#file_logical_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_logical_name(aspectvParser.File_logical_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#file_open_information}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_open_information(aspectvParser.File_open_informationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#file_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_type_definition(aspectvParser.File_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#formal_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_parameter_list(aspectvParser.Formal_parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#formal_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_part(aspectvParser.Formal_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#free_quantity_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFree_quantity_declaration(aspectvParser.Free_quantity_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#generate_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_statement(aspectvParser.Generate_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#generation_scheme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneration_scheme(aspectvParser.Generation_schemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#generic_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_clause(aspectvParser.Generic_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#generic_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_list(aspectvParser.Generic_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#generic_map_aspect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_map_aspect(aspectvParser.Generic_map_aspectContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#group_constituent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_constituent(aspectvParser.Group_constituentContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#group_constituent_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_constituent_list(aspectvParser.Group_constituent_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#group_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_declaration(aspectvParser.Group_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#group_template_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_template_declaration(aspectvParser.Group_template_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#guarded_signal_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuarded_signal_specification(aspectvParser.Guarded_signal_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(aspectvParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_list(aspectvParser.Identifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(aspectvParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#index_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_constraint(aspectvParser.Index_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#index_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_specification(aspectvParser.Index_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#index_subtype_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_subtype_definition(aspectvParser.Index_subtype_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#instantiated_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstantiated_unit(aspectvParser.Instantiated_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#instantiation_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstantiation_list(aspectvParser.Instantiation_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#interface_constant_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_constant_declaration(aspectvParser.Interface_constant_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#interface_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_declaration(aspectvParser.Interface_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#interface_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_element(aspectvParser.Interface_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#interface_file_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_file_declaration(aspectvParser.Interface_file_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#interface_signal_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_signal_list(aspectvParser.Interface_signal_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#interface_port_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_port_list(aspectvParser.Interface_port_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#interface_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_list(aspectvParser.Interface_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#interface_quantity_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_quantity_declaration(aspectvParser.Interface_quantity_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#interface_port_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_port_declaration(aspectvParser.Interface_port_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#interface_signal_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_signal_declaration(aspectvParser.Interface_signal_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#interface_terminal_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_terminal_declaration(aspectvParser.Interface_terminal_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#interface_variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_variable_declaration(aspectvParser.Interface_variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#iteration_scheme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_scheme(aspectvParser.Iteration_schemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#label_colon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_colon(aspectvParser.Label_colonContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#library_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibrary_clause(aspectvParser.Library_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#library_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibrary_unit(aspectvParser.Library_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(aspectvParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#logical_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_name(aspectvParser.Logical_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#logical_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_name_list(aspectvParser.Logical_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#logical_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_operator(aspectvParser.Logical_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(aspectvParser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#signal_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal_mode(aspectvParser.Signal_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#multiplying_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplying_operator(aspectvParser.Multiplying_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(aspectvParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#name_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_part(aspectvParser.Name_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#name_attribute_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_attribute_part(aspectvParser.Name_attribute_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#name_function_call_or_indexed_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_function_call_or_indexed_part(aspectvParser.Name_function_call_or_indexed_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#name_slice_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_slice_part(aspectvParser.Name_slice_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#selected_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelected_name(aspectvParser.Selected_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#nature_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNature_declaration(aspectvParser.Nature_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#nature_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNature_definition(aspectvParser.Nature_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#nature_element_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNature_element_declaration(aspectvParser.Nature_element_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#next_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext_statement(aspectvParser.Next_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_literal(aspectvParser.Numeric_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#object_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_declaration(aspectvParser.Object_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#opts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpts(aspectvParser.OptsContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#package_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body(aspectvParser.Package_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#package_body_declarative_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body_declarative_item(aspectvParser.Package_body_declarative_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#package_body_declarative_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body_declarative_part(aspectvParser.Package_body_declarative_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#package_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_declaration(aspectvParser.Package_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#package_declarative_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_declarative_item(aspectvParser.Package_declarative_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#package_declarative_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_declarative_part(aspectvParser.Package_declarative_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#parameter_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_specification(aspectvParser.Parameter_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#physical_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhysical_literal(aspectvParser.Physical_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#physical_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhysical_type_definition(aspectvParser.Physical_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#port_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_clause(aspectvParser.Port_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#port_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_list(aspectvParser.Port_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#port_map_aspect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_map_aspect(aspectvParser.Port_map_aspectContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(aspectvParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#primary_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_unit(aspectvParser.Primary_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#procedural_declarative_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedural_declarative_item(aspectvParser.Procedural_declarative_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#procedural_declarative_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedural_declarative_part(aspectvParser.Procedural_declarative_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#procedural_statement_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedural_statement_part(aspectvParser.Procedural_statement_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#procedure_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_call(aspectvParser.Procedure_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#procedure_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_call_statement(aspectvParser.Procedure_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#process_declarative_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcess_declarative_item(aspectvParser.Process_declarative_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#process_declarative_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcess_declarative_part(aspectvParser.Process_declarative_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#process_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcess_statement(aspectvParser.Process_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#process_statement_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcess_statement_part(aspectvParser.Process_statement_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#qualified_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_expression(aspectvParser.Qualified_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#quantity_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantity_declaration(aspectvParser.Quantity_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#quantity_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantity_list(aspectvParser.Quantity_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#quantity_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantity_specification(aspectvParser.Quantity_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(aspectvParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#explicit_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_range(aspectvParser.Explicit_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#range_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_constraint(aspectvParser.Range_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#record_nature_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_nature_definition(aspectvParser.Record_nature_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#record_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_type_definition(aspectvParser.Record_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(aspectvParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#relational_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_operator(aspectvParser.Relational_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#report_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReport_statement(aspectvParser.Report_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(aspectvParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#scalar_nature_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar_nature_definition(aspectvParser.Scalar_nature_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#scalar_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar_type_definition(aspectvParser.Scalar_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#secondary_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondary_unit(aspectvParser.Secondary_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#secondary_unit_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondary_unit_declaration(aspectvParser.Secondary_unit_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#selected_signal_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelected_signal_assignment(aspectvParser.Selected_signal_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#selected_waveforms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelected_waveforms(aspectvParser.Selected_waveformsContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#sensitivity_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSensitivity_clause(aspectvParser.Sensitivity_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#sensitivity_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSensitivity_list(aspectvParser.Sensitivity_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#sequence_of_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_of_statements(aspectvParser.Sequence_of_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#sequential_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequential_statement(aspectvParser.Sequential_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#shift_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expression(aspectvParser.Shift_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#shift_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_operator(aspectvParser.Shift_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#signal_assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal_assignment_statement(aspectvParser.Signal_assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#signal_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal_declaration(aspectvParser.Signal_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#signal_kind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal_kind(aspectvParser.Signal_kindContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#signal_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal_list(aspectvParser.Signal_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature(aspectvParser.SignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expression(aspectvParser.Simple_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#simple_simultaneous_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_simultaneous_statement(aspectvParser.Simple_simultaneous_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#simultaneous_alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimultaneous_alternative(aspectvParser.Simultaneous_alternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#simultaneous_case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimultaneous_case_statement(aspectvParser.Simultaneous_case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#simultaneous_if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimultaneous_if_statement(aspectvParser.Simultaneous_if_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#simultaneous_procedural_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimultaneous_procedural_statement(aspectvParser.Simultaneous_procedural_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#simultaneous_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimultaneous_statement(aspectvParser.Simultaneous_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#simultaneous_statement_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimultaneous_statement_part(aspectvParser.Simultaneous_statement_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#source_aspect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_aspect(aspectvParser.Source_aspectContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#source_quantity_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_quantity_declaration(aspectvParser.Source_quantity_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#step_limit_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep_limit_specification(aspectvParser.Step_limit_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#subnature_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubnature_declaration(aspectvParser.Subnature_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#subnature_indication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubnature_indication(aspectvParser.Subnature_indicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#subprogram_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_body(aspectvParser.Subprogram_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#subprogram_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_declaration(aspectvParser.Subprogram_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#subprogram_declarative_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_declarative_item(aspectvParser.Subprogram_declarative_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#subprogram_declarative_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_declarative_part(aspectvParser.Subprogram_declarative_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#subprogram_kind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_kind(aspectvParser.Subprogram_kindContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#subprogram_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_specification(aspectvParser.Subprogram_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#procedure_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_specification(aspectvParser.Procedure_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#function_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_specification(aspectvParser.Function_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#subprogram_statement_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_statement_part(aspectvParser.Subprogram_statement_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#subtype_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtype_declaration(aspectvParser.Subtype_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#subtype_indication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtype_indication(aspectvParser.Subtype_indicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuffix(aspectvParser.SuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget(aspectvParser.TargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(aspectvParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#terminal_aspect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminal_aspect(aspectvParser.Terminal_aspectContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#terminal_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminal_declaration(aspectvParser.Terminal_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#through_aspect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrough_aspect(aspectvParser.Through_aspectContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#timeout_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeout_clause(aspectvParser.Timeout_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#tolerance_aspect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTolerance_aspect(aspectvParser.Tolerance_aspectContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_declaration(aspectvParser.Type_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_definition(aspectvParser.Type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#unconstrained_array_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnconstrained_array_definition(aspectvParser.Unconstrained_array_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#unconstrained_nature_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnconstrained_nature_definition(aspectvParser.Unconstrained_nature_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#use_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_clause(aspectvParser.Use_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#variable_assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_assignment_statement(aspectvParser.Variable_assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(aspectvParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#wait_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWait_statement(aspectvParser.Wait_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#waveform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaveform(aspectvParser.WaveformContext ctx);
	/**
	 * Visit a parse tree produced by {@link aspectvParser#waveform_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaveform_element(aspectvParser.Waveform_elementContext ctx);
}