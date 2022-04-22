package com.github.peterphan.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

public class TestAction extends AnAction {

    public TestAction() {
        super("TEST");
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        System.out.println("abc");
    }


}
