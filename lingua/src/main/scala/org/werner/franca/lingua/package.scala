package org.werner.franca

import org.werner.franca.lingua.operation.Add

import scala.io.StdIn

/*
 * Copyright 2018 Werner Schram
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package object lingua {
  abstract class ExternalContext[T] extends PartialState[T]

  case object IntKeyboardInput extends ExternalContext[Int] {
    override def interpretedResult: Int =
      StdIn.readInt()
  }

  case class StaticValue[T](value: T) extends PartialState[T] {
    override def interpretedResult: T = value
  }
}
