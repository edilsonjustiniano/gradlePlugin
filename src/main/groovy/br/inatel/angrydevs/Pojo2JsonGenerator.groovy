package br.inatel.angrydevs

import org.gradle.api.Plugin
import org.gradle.api.Project

class Pojo2JsonGenerator implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task('angry') {
            doLast {
                new Sample().sayHello()
                println 'We are angry Devs'
            }
        }
    }
}
