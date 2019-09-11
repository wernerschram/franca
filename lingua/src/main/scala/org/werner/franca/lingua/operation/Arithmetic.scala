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

package org.werner.franca.lingua.operation

import org.werner.franca.lingua.{Operation2, PartialState}

case class Add[I1 <: PartialState[Int], I2 <: PartialState[Int]](state1: I1, state2: I2)
    extends Operation2[Int, Int, Int](state1, state2)
