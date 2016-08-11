/*
 * Copyright 2016 sadikovi
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

package com.github.sadikovi.hosvd

/** Tensor entry for 'i' row, 'j' column and 'k' layer with value 'value' */
case class TensorEntry(i: Int, j: Int, k: Int, value: Double)

/**
 * [[Tensor]] represents 3rd order rows x columns x layers tensor.
 */
abstract class Tensor {
  /** Number of rows in tensor */
  def numRows: Int

  /** Number of columns in tensor */
  def numCols: Int

  /** Number of layers in tensor */
  def numLayers: Int

  /**
   * Unfold current tensor with direction.
   * @param direction direction to unfold
   * @return unfolding result as instance of `UnfoldResult`
   */
  def unfold(direction: UnfoldDirection.Value): UnfoldResult
}
