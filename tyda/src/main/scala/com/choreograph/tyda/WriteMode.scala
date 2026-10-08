package com.choreograph.tyda

/** Controls how a write behaves when the destination path already contains
  * data.
  */
enum WriteMode {

  /** Fail if the destination path already exists. */
  case ErrorIfExists

  /** Delete everything under the destination path before writing. */
  case Overwrite
}
