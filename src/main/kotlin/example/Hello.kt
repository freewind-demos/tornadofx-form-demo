package example

import tornadofx.*

class HelloWorld : View() {
    override val root = form {
        fieldset("Account Information") {
            field("Username") {
                textfield()
            }
            field("Password") {
                passwordfield()
                text()
            }
        }
        fieldset("Personal Information") {
            field("Realname") {
                textfield()
            }
            field("Phone") {
                textfield()
            }
            field(forceLabelIndent = true) {
                button("Save")
            }

        }
    }
}

class HelloWorldStyle : Stylesheet() {
    init {
        root {
            prefWidth = 400.px
            prefHeight = 400.px
        }
    }
}

class HelloWorldApp : App(HelloWorld::class, HelloWorldStyle::class)

fun main(args: Array<String>) {
    launch<HelloWorldApp>()
}