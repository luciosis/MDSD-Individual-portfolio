/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.domainmodel;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class DomainmodelStandaloneSetup extends DomainmodelStandaloneSetupGenerated {

	public static void doSetup() {
		new DomainmodelStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
