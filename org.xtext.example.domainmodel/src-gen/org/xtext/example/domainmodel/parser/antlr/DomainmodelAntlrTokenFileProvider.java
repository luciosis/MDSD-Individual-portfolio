/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.domainmodel.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DomainmodelAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.tokens");
	}
}