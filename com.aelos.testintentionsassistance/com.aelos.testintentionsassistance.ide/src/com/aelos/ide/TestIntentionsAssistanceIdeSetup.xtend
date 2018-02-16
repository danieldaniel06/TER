/*
 * generated by Xtext 2.11.0.RC2
 */
package com.aelos.ide

import com.google.inject.Guice
import com.aelos.TestIntentionsAssistanceRuntimeModule
import com.aelos.TestIntentionsAssistanceStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class TestIntentionsAssistanceIdeSetup extends TestIntentionsAssistanceStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new TestIntentionsAssistanceRuntimeModule, new TestIntentionsAssistanceIdeModule))
	}
	
}