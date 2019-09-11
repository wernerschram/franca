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

import org.werner.franca.context.Interpretable
import org.werner.franca.lingua.PartialState

object Interpreter {
  def apply[R, T<:PartialState[R]](state: T)(implicit interpreter: Interpretable[R, T]): R =
    interpreter.execute(state)

  def int[T<:PartialState[Int]](state: T)(implicit interpreter: Interpretable[Int, T]): Int =
    apply[Int, T](state)

}
