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

package org.werner.franca.lingua
case class Add(override val state1: PartialState[Int], override val state2: PartialState[Int]) extends Operation2[Int, Int, Int](state1, state2)
case object IntKeyboardInput extends PartialState[Int]
case class PrintInt(state: PartialState[Int]) extends Operation1[Unit, Int](state)
case class StaticValue[T](value: T) extends PartialState[T]
