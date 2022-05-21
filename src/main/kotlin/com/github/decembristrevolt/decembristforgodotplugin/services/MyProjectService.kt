package com.github.decembristrevolt.decembristforgodotplugin.services

import com.intellij.openapi.project.Project
import com.github.decembristrevolt.decembristforgodotplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
