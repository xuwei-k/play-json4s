/*
 * Copyright 2013 Toshiyuki Takahashi
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
package com.github.tototoshi.play2.json4s.test.native

import scala.text.Document
import com.github.tototoshi.play2.json4s.core._
import com.github.tototoshi.play2.json4s.test.core.{ Helpers => CoreHelpers }

trait Helpers extends CoreHelpers[Document] with MethodsImport[Document]

object Helpers extends Helpers {
  val methods = org.json4s.native.JsonMethods
}



