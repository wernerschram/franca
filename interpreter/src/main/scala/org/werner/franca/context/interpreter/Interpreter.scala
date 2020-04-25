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

package org.werner.franca.context.interpreter

import org.werner.franca.lingua.operation.Add
import org.werner.franca.lingua.{IntKeyboardInput, PrintInt, StaticValue}

object Interpreter {
  val intMapping: Map[Class[_], Object => Int] = Map(
    classOf[Add] -> (state => addIsInterpretable(state.asInstanceOf[Add])),
    IntKeyboardInput.getClass -> (_ => intKeyboardInputIsInterpretable),
    classOf[StaticValue[Int]] -> (state => staticValueIsInterpretable(state.asInstanceOf[StaticValue[Int]])),
  )

  val unitMapping: Map[Class[_], Object => Unit] = Map(
    classOf[PrintInt] -> (state => printIntIsInterpretable(state.asInstanceOf[PrintInt]))
  )

  def int(state: Object): Int = intMapping(state.getClass).apply(state)

  def unit(state: Object): Unit = unitMapping(state.getClass).apply(state)

}
