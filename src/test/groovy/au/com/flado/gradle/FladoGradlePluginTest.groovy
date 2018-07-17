package au.com.flado.gradle

import org.junit.Test
import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project
import static org.junit.Assert.*

class FladoGradlePluginTest {

    @Test
    public void fladoGradlePluginConfigTest() {
        Project project = ProjectBuilder.builder().build()

        //apply this plugin
        //project.pluginManager.apply 'au.com.flado.gradle'

        //check build repos on project instance
        // assertEquals('https://nexus/content/groups/public/', project.repositories.maven.url.toString())

        //  assertEquals('1.8', project.sourceCompatibility.toString())
        //  assertEquals('1.8', project.targetCompatibility.toString())

        //TODO: other checks for plugin configuration
    }
}

