package com.github.godmoonlight.stylemerge.services

import com.intellij.openapi.project.Project
import com.github.godmoonlight.stylemerge.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
