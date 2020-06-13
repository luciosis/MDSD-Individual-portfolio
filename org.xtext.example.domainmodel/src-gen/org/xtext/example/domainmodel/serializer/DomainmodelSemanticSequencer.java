/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.domainmodel.serializer;

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
import org.xtext.example.domainmodel.domainmodel.Declaration;
import org.xtext.example.domainmodel.domainmodel.DomainmodelPackage;
import org.xtext.example.domainmodel.domainmodel.Entity;
import org.xtext.example.domainmodel.domainmodel.EntityExample;
import org.xtext.example.domainmodel.domainmodel.Intent;
import org.xtext.example.domainmodel.domainmodel.IsFollowUp;
import org.xtext.example.domainmodel.domainmodel.Model;
import org.xtext.example.domainmodel.domainmodel.Question;
import org.xtext.example.domainmodel.domainmodel.QuestionEntity;
import org.xtext.example.domainmodel.domainmodel.Reference;
import org.xtext.example.domainmodel.domainmodel.Sysvariable;
import org.xtext.example.domainmodel.domainmodel.Training;
import org.xtext.example.domainmodel.domainmodel.TrainingRef;
import org.xtext.example.domainmodel.services.DomainmodelGrammarAccess;

@SuppressWarnings("all")
public class DomainmodelSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DomainmodelGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DomainmodelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DomainmodelPackage.DECLARATION:
				sequence_Declaration(context, (Declaration) semanticObject); 
				return; 
			case DomainmodelPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case DomainmodelPackage.ENTITY_EXAMPLE:
				sequence_EntityExample(context, (EntityExample) semanticObject); 
				return; 
			case DomainmodelPackage.INTENT:
				sequence_Intent(context, (Intent) semanticObject); 
				return; 
			case DomainmodelPackage.IS_FOLLOW_UP:
				sequence_IsFollowUp(context, (IsFollowUp) semanticObject); 
				return; 
			case DomainmodelPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case DomainmodelPackage.QUESTION:
				sequence_Question(context, (Question) semanticObject); 
				return; 
			case DomainmodelPackage.QUESTION_ENTITY:
				sequence_QuestionEntity(context, (QuestionEntity) semanticObject); 
				return; 
			case DomainmodelPackage.REFERENCE:
				sequence_Reference(context, (Reference) semanticObject); 
				return; 
			case DomainmodelPackage.SYSVARIABLE:
				sequence_Sysvariable(context, (Sysvariable) semanticObject); 
				return; 
			case DomainmodelPackage.TRAINING:
				sequence_Training(context, (Training) semanticObject); 
				return; 
			case DomainmodelPackage.TRAINING_REF:
				sequence_TrainingRef(context, (TrainingRef) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Declaration returns Declaration
	 *
	 * Constraint:
	 *     (trainingstring=STRING reference=Reference)
	 */
	protected void sequence_Declaration(ISerializationContext context, Declaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.DECLARATION__TRAININGSTRING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.DECLARATION__TRAININGSTRING));
			if (transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.DECLARATION__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.DECLARATION__REFERENCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDeclarationAccess().getTrainingstringSTRINGTerminalRuleCall_1_0(), semanticObject.getTrainingstring());
		feeder.accept(grammarAccess.getDeclarationAccess().getReferenceReferenceParserRuleCall_3_0(), semanticObject.getReference());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EntityExample returns EntityExample
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_EntityExample(ISerializationContext context, EntityExample semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.ENTITY_EXAMPLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.ENTITY_EXAMPLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEntityExampleAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Agent returns Entity
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (name=ID example+=EntityExample+)
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Agent returns Intent
	 *     Intent returns Intent
	 *
	 * Constraint:
	 *     (name=ID superType=[Intent|ID]? isFollowUp=IsFollowUp? question+=Question+ training=Training)
	 */
	protected void sequence_Intent(ISerializationContext context, Intent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IsFollowUp returns IsFollowUp
	 *
	 * Constraint:
	 *     intent=[Intent|ID]
	 */
	protected void sequence_IsFollowUp(ISerializationContext context, IsFollowUp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.IS_FOLLOW_UP__INTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.IS_FOLLOW_UP__INTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIsFollowUpAccess().getIntentIntentIDTerminalRuleCall_1_0_1(), semanticObject.eGet(DomainmodelPackage.Literals.IS_FOLLOW_UP__INTENT, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     agent+=Agent+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     QuestionEntity returns QuestionEntity
	 *
	 * Constraint:
	 *     withEntity=Reference
	 */
	protected void sequence_QuestionEntity(ISerializationContext context, QuestionEntity semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.QUESTION_ENTITY__WITH_ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.QUESTION_ENTITY__WITH_ENTITY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getQuestionEntityAccess().getWithEntityReferenceParserRuleCall_0(), semanticObject.getWithEntity());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Question returns Question
	 *
	 * Constraint:
	 *     (questionEntity=QuestionEntity prompt=STRING)
	 */
	protected void sequence_Question(ISerializationContext context, Question semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.QUESTION__QUESTION_ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.QUESTION__QUESTION_ENTITY));
			if (transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.QUESTION__PROMPT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.QUESTION__PROMPT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getQuestionAccess().getQuestionEntityQuestionEntityParserRuleCall_0_0(), semanticObject.getQuestionEntity());
		feeder.accept(grammarAccess.getQuestionAccess().getPromptSTRINGTerminalRuleCall_2_0(), semanticObject.getPrompt());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Reference returns Reference
	 *
	 * Constraint:
	 *     (entity=[Entity|ID] | sysvar=Sysvariable)
	 */
	protected void sequence_Reference(ISerializationContext context, Reference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sysvariable returns Sysvariable
	 *
	 * Constraint:
	 *     (
	 *         value='number' | 
	 *         value='date-time' | 
	 *         value='date' | 
	 *         value='duration' | 
	 *         value='address' | 
	 *         value='email' | 
	 *         value='phone-number' | 
	 *         value='date-period' | 
	 *         value='time-period' | 
	 *         value='url' | 
	 *         value='any' | 
	 *         value='color' | 
	 *         value='language'
	 *     )
	 */
	protected void sequence_Sysvariable(ISerializationContext context, Sysvariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TrainingRef returns TrainingRef
	 *
	 * Constraint:
	 *     (phrase=STRING declaration=Declaration)
	 */
	protected void sequence_TrainingRef(ISerializationContext context, TrainingRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.TRAINING_REF__PHRASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.TRAINING_REF__PHRASE));
			if (transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.TRAINING_REF__DECLARATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.TRAINING_REF__DECLARATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTrainingRefAccess().getPhraseSTRINGTerminalRuleCall_0_0(), semanticObject.getPhrase());
		feeder.accept(grammarAccess.getTrainingRefAccess().getDeclarationDeclarationParserRuleCall_1_0(), semanticObject.getDeclaration());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Training returns Training
	 *
	 * Constraint:
	 *     trainingref+=TrainingRef+
	 */
	protected void sequence_Training(ISerializationContext context, Training semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}