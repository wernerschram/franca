package org.werner.franca.lingua.operation

import org.werner.franca.lingua.{Operation2, PartialState}

case class Add[I1<:PartialState[Int], I2<:PartialState[Int]](state1: I1, state2: I2) extends Operation2[Int, Int, Int](state1, state2) {
  override def interpretedResult: Int = state1.interpretedResult + state2.interpretedResult
}

