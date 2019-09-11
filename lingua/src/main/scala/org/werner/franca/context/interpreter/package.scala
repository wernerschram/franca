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

import org.werner.franca.lingua.{IntKeyboardInput, PartialState, StaticValue}
import org.werner.franca.lingua.operation.Add

import scala.io.StdIn

package object interpreter {
  implicit def addIsInterpretable[I1 <: PartialState[Int], I2 <: PartialState[Int]](
    implicit interpretable1: Interpretable[Int, I1],
    interpretable2: Interpretable[Int, I2]): Interpretable[Int, Add[I1, I2]] =
    add => interpretable1.execute(add.state1) + interpretable2.execute(add.state2)

  implicit def staticValueIsInterpretable[T]: Interpretable[T, StaticValue[T]] = state => state.value

  implicit def intKeyboardInputIsInterpretable: Interpretable[Int, IntKeyboardInput.type] =
    _ => StdIn.readInt()
}
