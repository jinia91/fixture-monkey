/*
 * Fixture Monkey
 *
 * Copyright (c) 2021-present NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.fixturemonkey.kotlin.test

import com.navercorp.fixturemonkey.kotlin.spec.JavaObject

class PrimaryConstructor(
    val intValue: Int,
    val stringValue: String,
)

class IntValue(
    val intValue: Int,
)

class Nested(
    val nested: IntValue,
)

data class DataValue(
    val intValue: Int,
    val stringValue: String,
)

class VarValue(
    var intValue: Int,
    var stringValue: String,
)

class NullableValue(
    val intValue: Int,
    val stringValue: String?,
)

class DefaultValue(
    val intValue: Int,
    val stringValue: String = "default_value",
)

class SecondaryConstructor(
    val intValue: Int,
    val stringValue: String,
)

interface InterfaceClass {
    fun test()
}

class KotlinClassWithJavaClass(val javaObject: JavaObject)

class MapValue(val map: Map<String, String>)
