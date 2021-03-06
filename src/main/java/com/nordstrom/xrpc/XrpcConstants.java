package com.nordstrom.xrpc;

import com.nordstrom.xrpc.server.XrpcConnectionContext;
import com.nordstrom.xrpc.server.XrpcRequest;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.util.AttributeKey;
import java.nio.charset.Charset;

public class XrpcConstants {
  public static final AttributeKey<XrpcRequest> XRPC_REQUEST = AttributeKey.valueOf("XrpcRequest");
  public static final AttributeKey<Boolean> XRPC_RATE_LIMIT = AttributeKey.valueOf("XrpcRateLimit");
  public static final AttributeKey<XrpcConnectionContext> CONNECTION_CONTEXT =
      AttributeKey.valueOf("XrpcConnectionContext");
  public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
  public static final ByteBuf RATE_LIMIT_RESPONSE =
      Unpooled.directBuffer()
          .writeBytes(
              "This response is being send due to too many requests being sent to the server"
                  .getBytes(DEFAULT_CHARSET));
}
