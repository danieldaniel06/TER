/*
 * generated by Xtext 2.13.0
 */
package com.aelos.xtext.testintentionsassistance.ui.tests;

import com.aelos.xtext.testintentionsassistance.ui.internal.TestintentionsassistanceActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class TestintentionsAssistanceUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return TestintentionsassistanceActivator.getInstance().getInjector("com.aelos.xtext.testintentionsassistance.TestintentionsAssistance");
	}

}