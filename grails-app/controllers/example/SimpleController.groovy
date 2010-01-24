package example

class SimpleController {

  def index = { }

  def save = {SimpleCommand command ->

    println params

    println command

    [command:command]
  }
}

class SimpleCommand {

  String name

  String toString() {
    "Simple Command [name = $name ]"
  }

}
