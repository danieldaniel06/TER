/*
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package com.aelos.xtext.architecture.ide.contentassist.antlr;

import com.aelos.xtext.architecture.ide.contentassist.antlr.internal.InternalArchitectureParser;
import com.aelos.xtext.architecture.services.ArchitectureGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ArchitectureParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ArchitectureGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ArchitectureGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAbstractModelAccess().getAlternatives_1(), "rule__AbstractModel__Alternatives_1");
			builder.put(grammarAccess.getAtomicTypeAccess().getAlternatives(), "rule__AtomicType__Alternatives");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getDomainDeclarationAccess().getGroup(), "rule__DomainDeclaration__Group__0");
			builder.put(grammarAccess.getAbstractModelAccess().getGroup(), "rule__AbstractModel__Group__0");
			builder.put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
			builder.put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getComponentAccess().getGroup(), "rule__Component__Group__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_5(), "rule__Component__Group_5__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_5_0(), "rule__Component__Group_5_0__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_9(), "rule__Component__Group_9__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_9_0(), "rule__Component__Group_9_0__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_11(), "rule__Component__Group_11__0");
			builder.put(grammarAccess.getArchitectureAccess().getGroup(), "rule__Architecture__Group__0");
			builder.put(grammarAccess.getArchitectureAccess().getGroup_2(), "rule__Architecture__Group_2__0");
			builder.put(grammarAccess.getBindingAccess().getGroup(), "rule__Binding__Group__0");
			builder.put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
			builder.put(grammarAccess.getOperationAccess().getGroup(), "rule__Operation__Group__0");
			builder.put(grammarAccess.getOperationAccess().getGroup_3(), "rule__Operation__Group_3__0");
			builder.put(grammarAccess.getOperationAccess().getGroup_3_0(), "rule__Operation__Group_3_0__0");
			builder.put(grammarAccess.getModelAccess().getPackageAssignment(), "rule__Model__PackageAssignment");
			builder.put(grammarAccess.getDomainDeclarationAccess().getNameAssignment_1(), "rule__DomainDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getDomainDeclarationAccess().getElementsAssignment_3(), "rule__DomainDeclaration__ElementsAssignment_3");
			builder.put(grammarAccess.getAbstractModelAccess().getImpAssignment_0(), "rule__AbstractModel__ImpAssignment_0");
			builder.put(grammarAccess.getAbstractModelAccess().getCompAssignment_1_0(), "rule__AbstractModel__CompAssignment_1_0");
			builder.put(grammarAccess.getAbstractModelAccess().getArchAssignment_1_1(), "rule__AbstractModel__ArchAssignment_1_1");
			builder.put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
			builder.put(grammarAccess.getComponentAccess().getNameAssignment_1(), "rule__Component__NameAssignment_1");
			builder.put(grammarAccess.getComponentAccess().getOpsAssignment_5_0_0(), "rule__Component__OpsAssignment_5_0_0");
			builder.put(grammarAccess.getComponentAccess().getOpsAssignment_5_1(), "rule__Component__OpsAssignment_5_1");
			builder.put(grammarAccess.getComponentAccess().getOpsReqAssignment_9_0_0(), "rule__Component__OpsReqAssignment_9_0_0");
			builder.put(grammarAccess.getComponentAccess().getOpsReqAssignment_9_1(), "rule__Component__OpsReqAssignment_9_1");
			builder.put(grammarAccess.getComponentAccess().getOperationsAssignment_11_0(), "rule__Component__OperationsAssignment_11_0");
			builder.put(grammarAccess.getArchitectureAccess().getVarsAssignment_2_1(), "rule__Architecture__VarsAssignment_2_1");
			builder.put(grammarAccess.getArchitectureAccess().getBindAssignment_3(), "rule__Architecture__BindAssignment_3");
			builder.put(grammarAccess.getBindingAccess().getProviderAssignment_1(), "rule__Binding__ProviderAssignment_1");
			builder.put(grammarAccess.getBindingAccess().getProMemberAssignment_3(), "rule__Binding__ProMemberAssignment_3");
			builder.put(grammarAccess.getBindingAccess().getReceiverAssignment_5(), "rule__Binding__ReceiverAssignment_5");
			builder.put(grammarAccess.getBindingAccess().getRecMemberAssignment_7(), "rule__Binding__RecMemberAssignment_7");
			builder.put(grammarAccess.getVariableAccess().getNameAssignment_0(), "rule__Variable__NameAssignment_0");
			builder.put(grammarAccess.getVariableAccess().getTypeAssignment_2(), "rule__Variable__TypeAssignment_2");
			builder.put(grammarAccess.getOperationAccess().getNameAssignment_1(), "rule__Operation__NameAssignment_1");
			builder.put(grammarAccess.getOperationAccess().getArgAssignment_3_0_0(), "rule__Operation__ArgAssignment_3_0_0");
			builder.put(grammarAccess.getOperationAccess().getArgAssignment_3_1(), "rule__Operation__ArgAssignment_3_1");
			builder.put(grammarAccess.getOperationAccess().getTypeAssignment_6(), "rule__Operation__TypeAssignment_6");
			builder.put(grammarAccess.getAtomicTypeAccess().getAtomTypeAssignment_0(), "rule__AtomicType__AtomTypeAssignment_0");
			builder.put(grammarAccess.getAtomicTypeAccess().getCompTypeAssignment_1(), "rule__AtomicType__CompTypeAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ArchitectureGrammarAccess grammarAccess;

	@Override
	protected InternalArchitectureParser createParser() {
		InternalArchitectureParser result = new InternalArchitectureParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ArchitectureGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ArchitectureGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
