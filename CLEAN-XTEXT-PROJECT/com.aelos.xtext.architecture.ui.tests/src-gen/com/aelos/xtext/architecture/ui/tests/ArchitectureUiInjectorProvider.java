/*
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package com.aelos.xtext.architecture.ui.tests;

import com.aelos.xtext.architecture.ui.internal.ArchitectureActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class ArchitectureUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return ArchitectureActivator.getInstance().getInjector("com.aelos.xtext.architecture.Architecture");
	}

}