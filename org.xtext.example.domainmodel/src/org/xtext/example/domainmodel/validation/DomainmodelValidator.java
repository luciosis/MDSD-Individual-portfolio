/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.domainmodel.validation;

import java.util.HashSet;
import org.eclipse.xtext.validation.Check;
import org.xtext.example.domainmodel.domainmodel.Model;
import org.xtext.example.domainmodel.domainmodel.Intent;
import org.xtext.example.domainmodel.domainmodel.Agent;
import org.xtext.example.domainmodel.domainmodel.DomainmodelPackage;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class DomainmodelValidator extends AbstractDomainmodelValidator {
	
	protected static String ISSUE_CODE_PREFIX = "org.example.intents.";
	
	public static String HIERARCHY_CYCLE = ISSUE_CODE_PREFIX + "HierchyCycle";
	@Check
	public void checkIntentNoCycleInHierachy(Model model) {
		HashSet<Intent> viewedIntents = new HashSet<Intent>();
		for(Agent agent : model.getAgent()) {
			if(agent instanceof Intent) {
				Intent intent = (Intent) agent; 
				if (intent.getSuperType()== null) {
					return ; // nothing to check
				}
				viewedIntents.add(intent);
				Intent current = intent.getSuperType();
				while (current != null) {
				if (viewedIntents.contains(current)) {
					error("cycle in hierarchy of intent '"+current.getName()+"'", DomainmodelPackage.Literals.MODEL__AGENT, HIERARCHY_CYCLE, current.getSuperType().getName());
				return ;
				}
				viewedIntents.add(current);
				current = current.getSuperType();
				}
			}
		}
	}
}