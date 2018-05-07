package org.andreyko.vertx.codegen.example;

import io.vertx.codegen.annotations.*;
import io.vertx.core.*;

@ProxyGen
@VertxGen
interface IGtfsLookup {
  fun info(resultHandler: Handler<AsyncResult<Info>>)
}