package org.andreyko.vertx.codegen.example;

import io.vertx.codegen.annotations.*
import io.vertx.core.json.*

@DataObject(generateConverter = true)
open class Info() {
  
  constructor(json: JsonObject) : this() {
    InfoConverter.fromJson(json, this)
  }
  
  fun toJson(): JsonObject {
    val json = JsonObject()
    InfoConverter.toJson(this, json)
    return json
  }
}