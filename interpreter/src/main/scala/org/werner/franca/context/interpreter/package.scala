/*
 * Copyright 2019 Werner Schram
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package org.werner.franca.context

import org.werner.franca.lingua.{IntKeyboardInput, PartialState, PrintInt, StaticValue}
import org.werner.franca.lingua.operation.Add

import scala.io.StdIn

package object interpreter {
  def addIsInterpretable(add: Add): Int =
      Interpreter.int(add.state1) + Interpreter.int(add.state2)

  def staticValueIsInterpretable[T](state: StaticValue[T]) = state.value

  def intKeyboardInputIsInterpretable: Int =
    StdIn.readInt()

  implicit def printIntIsInterpretable(printInt: PrintInt): Unit = {
      val result = Interpreter.int(printInt.partialState)
      println(result)
  }
}
