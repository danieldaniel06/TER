/*
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package com.aelos.xtext.mappingassistance.serializer;

import com.aelos.xtext.mappingassistance.mappingAssistance.AbstractModel;
import com.aelos.xtext.mappingassistance.mappingAssistance.Call;
import com.aelos.xtext.mappingassistance.mappingAssistance.Import;
import com.aelos.xtext.mappingassistance.mappingAssistance.MappingAssistancePackage;
import com.aelos.xtext.mappingassistance.mappingAssistance.Model;
import com.aelos.xtext.mappingassistance.mappingAssistance.Observer;
import com.aelos.xtext.mappingassistance.mappingAssistance.TestDriver;
import com.aelos.xtext.mappingassistance.services.MappingAssistanceGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MappingAssistanceSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MappingAssistanceGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MappingAssistancePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MappingAssistancePackage.ABSTRACT_MODEL:
				sequence_AbstractModel(context, (AbstractModel) semanticObject); 
				return; 
			case MappingAssistancePackage.CALL:
				sequence_Call(context, (Call) semanticObject); 
				return; 
			case MappingAssistancePackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case MappingAssistancePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case MappingAssistancePackage.OBSERVER:
				sequence_Observer(context, (Observer) semanticObject); 
				return; 
			case MappingAssistancePackage.TEST_DRIVER:
				sequence_TestDriver(context, (TestDriver) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AbstractModel returns AbstractModel
	 *
	 * Constraint:
	 *     (im+=Import+ testDr+=TestDriver obs+=Observer*)
	 */
	protected void sequence_AbstractModel(ISerializationContext context, AbstractModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Call returns Call
	 *
	 * Constraint:
	 *     (receiver=[Variable|ID] member+=[Operation|ID])
	 */
	protected void sequence_Call(ISerializationContext context, Call semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MappingAssistancePackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingAssistancePackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     function+=AbstractModel+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Observer returns Observer
	 *
	 * Constraint:
	 *     (name=ID serviceName1+=Call serviceName2+=Call (arg+=[Variable|ID]* arg+=[Variable|ID])*)
	 */
	protected void sequence_Observer(ISerializationContext context, Observer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TestDriver returns TestDriver
	 *
	 * Constraint:
<<<<<<< HEAD
	 *     (outVar+=[Variable|ID] tagetedservice+=Call (arg+=[Variable|ID]* arg+=[Variable|ID])*)*
=======
	 *     (outVar+=[Variable|ID] receiver=[Variable|ID] member+=[Operation|ID] (arg+=[Variable|ID]* arg+=[Variable|ID])*)+
>>>>>>> b067e7f7a0d0f905c61ea055d86ffae341dfaa23
	 */
	protected void sequence_TestDriver(ISerializationContext context, TestDriver semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
