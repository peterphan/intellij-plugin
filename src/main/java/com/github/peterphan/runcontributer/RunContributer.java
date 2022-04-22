package com.github.peterphan.runcontributer;

import com.intellij.execution.lineMarker.RunLineMarkerContributor;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RunContributer extends RunLineMarkerContributor {

    @Nullable
    @Override
    public Info getInfo(@NotNull PsiElement e) {
        return new Info(null, null,
                ActionManager.getInstance().getAction("PPHAN.Test.Action"),
                ActionManager.getInstance().getAction("PPHAN.AnotherTest.Action"));
    }

}
