package org.werner.franca.lingua

abstract class Operation1[R, T1](state1: PartialState[T1]) extends PartialState[R]
abstract class Operation2[R, T1, T2](state1: PartialState[T1], state2: PartialState[R]) extends PartialState[R]
