package com.github.peterphan.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.peterphan.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
