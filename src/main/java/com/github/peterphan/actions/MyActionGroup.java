package com.github.peterphan.actions;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import org.jetbrains.annotations.NotNull;


public class MyActionGroup extends DefaultActionGroup  {

  public MyActionGroup() {
    super();
    getTemplatePresentation().setText("My Action group");
  }

  @Override
  public void update(@NotNull AnActionEvent e) {
    super.update(e);
    e.getPresentation().setEnabledAndVisible(
        true
    );
  }
}
