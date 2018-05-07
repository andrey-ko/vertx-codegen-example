package org.andreyko.vertx.codegen.example;

import io.vertx.codegen.annotations.*;
import io.vertx.core.*;

@ProxyGen
@VertxGen
public interface IGtfsLookup {
  void myMethod(Handler<AsyncResult<String>> resultHandler);
}