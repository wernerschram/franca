package org.werner.franca.lingua

import org.scalatest.{Matchers, WordSpec}
import org.werner.franca.lingua.operation.Add

class InterpretSpec extends WordSpec with Matchers {
  "a franca.lingua application" should {
    "be able to produce the result of a simple sum: (2+6)+4" in {
      Add(Add(StaticValue(2), StaticValue(6)), StaticValue(4)).interpretedResult shouldBe 12
    }
  }
}
