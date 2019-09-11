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

import org.scalatest.{Matchers, WordSpec}
import org.werner.franca.context.interpreter._
import org.werner.franca.lingua.operation.Add

class InterpretSpec extends WordSpec with Matchers {
  "a franca.lingua application" should {
    "be able to produce the result of a simple sum: (2+6)+4" in {
      Interpreter.int(Add(Add(StaticValue(2), StaticValue(6)), StaticValue(4))) shouldBe 12
    }
  }
}
