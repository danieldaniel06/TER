/**
 * generated by Xtext 2.13.0
 */
package com.aelos.xtext.mappingassistance.validation;

import com.aelos.xtext.mappingassistance.mappingAssistance.Mapping;
import com.aelos.xtext.mappingassistance.mappingAssistance.MappingAssistancePackage;
import com.aelos.xtext.mappingassistance.mappingAssistance.Variable;
import com.aelos.xtext.mappingassistance.validation.AbstractMappingAssistanceValidator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class MappingAssistanceValidator extends AbstractMappingAssistanceValidator {
  @Check
  public void checkMappingSameType(final Mapping map) {
    int x = 0;
    EList<Variable> _nameVarMode = map.getNameVarMode();
    for (final Variable varmod : _nameVarMode) {
      {
        boolean _equals = varmod.getType().getLiteral().equals(map.getNameVarTest().get(x).getType().getLiteral());
        boolean _not = (!_equals);
        if (_not) {
          this.error("the variables must have the same Type", MappingAssistancePackage.Literals.MAPPING__NAME_VAR_MODE);
        }
        x++;
      }
    }
  }
}