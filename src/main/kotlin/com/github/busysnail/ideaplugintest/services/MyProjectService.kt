package com.github.busysnail.ideaplugintest.services

import com.intellij.openapi.project.Project
import com.github.busysnail.ideaplugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
