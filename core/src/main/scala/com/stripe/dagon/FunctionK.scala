package com.stripe.dagon

/**
 * This is a Natural transformation.
 *
 * For any type X, this type can produce a function from T[X] to R[X].
 */
trait FunctionK[T[_], R[_]] {
  def apply[U]: T[U] => R[U]
}
