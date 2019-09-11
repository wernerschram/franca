package org.werner.franca.examples.interpret

import org.werner.franca.lingua.operation.Add
import org.werner.franca.lingua.{IntKeyboardInput, StaticValue}

object Main extends App {
  val r = Add(Add(StaticValue(2), IntKeyboardInput), StaticValue(4))
  println("started")
  println(r.interpretedResult)
}
