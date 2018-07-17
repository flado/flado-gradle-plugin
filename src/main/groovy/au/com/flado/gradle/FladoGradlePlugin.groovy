package au.com.flado.gradle

import org.gradle.api.Project
import org.gradle.api.Plugin
import org.gradle.api.tasks.testing.Test

class FladoGradlePlugin implements Plugin<Project> {

  def cl = getClass().getClassLoader();

  void apply(Project project) {

    project.configure(project) {

      apply from: cl.getResource('repositories.gradle')
      apply from: cl.getResource('idea.gradle')
      apply from: cl.getResource('bom.gradle')
      apply from: cl.getResource('boot.gradle')
      apply from: cl.getResource('java-build.gradle')
      apply from: cl.getResource('maven.gradle')  // 'maven.gradle' must be applied last so that uploadAchives generates the correct POM

    }

  }
}
