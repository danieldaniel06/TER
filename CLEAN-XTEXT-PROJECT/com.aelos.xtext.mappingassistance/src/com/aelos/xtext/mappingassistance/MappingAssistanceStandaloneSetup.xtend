/*
 * generated by Xtext 2.13.0
 */
package com.aelos.xtext.mappingassistance


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class MappingAssistanceStandaloneSetup extends MappingAssistanceStandaloneSetupGenerated {

	def static void doSetup() {
		new MappingAssistanceStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
