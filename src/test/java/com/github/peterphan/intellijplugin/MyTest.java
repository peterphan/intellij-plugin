package com.github.peterphan.intellijplugin;

import com.intellij.ide.highlighter.JavaFileType;
import com.intellij.testFramework.fixtures.LightJavaCodeInsightFixtureTestCase;


public class MyTest extends LightJavaCodeInsightFixtureTestCase {

  public void test() {
    // Fails due to java.lang.AssertionError: JNA library is not available
    myFixture.configureByText(JavaFileType.INSTANCE, "public clas<caret>s");
  }

}
