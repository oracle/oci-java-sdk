/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey;

import com.oracle.bmc.http.client.Options;
import com.oracle.bmc.http.client.HttpResponse;
import com.oracle.bmc.http.client.jersey.io.internal.AutoCloseableContentLengthVerifyingInputStream;
import com.oracle.bmc.http.client.jersey.io.internal.ContentLengthVerifyingInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

class JerseyHttpResponse implements HttpResponse {
    private static final Logger log = LoggerFactory.getLogger(JerseyHttpResponse.class);

    private final Response response;
    private boolean bodyConsumed = false;

    JerseyHttpResponse(Response response) {
        this.response = response;
    }

    @Override
    public int status() {
        return response.getStatus();
    }

    @Override
    public Map<String, List<String>> headers() {
        return response.getStringHeaders();
    }

    @Override
    public String header(String name) {
        return response.getHeaderString(name);
    }

    @Override
    public CompletionStage<InputStream> streamBody() {
        bodyConsumed = true;

        // If we want an InputStream, then we don't care about the content type.
        // This will also allow us to process invalid content types like "text" (instead of
        // "text/plain").
        List<Object> contentType = response.getHeaders().remove(HttpHeaders.CONTENT_TYPE);
        log.debug(
                "Entity type is InputStream, ignoring contentType {} and processing as stream",
                contentType);
        try {
            // NOTE: do not buffer InputStreams (namely object storage) as those might be very large
            final InputStream rawInputStream = response.readEntity(InputStream.class);
            // Wrap the input stream to ensure that it gets closed.
            InputStream inputStream = new WrappedResponseInputStream(rawInputStream, response);

            String contentLengthStr = header("Content-Length");
            // If the Content-Length header is present and Content-Encoding header is not present in
            // the response,
            // verify that the length of the input stream matches it
            if (contentLengthStr != null && header(HttpHeaders.CONTENT_ENCODING) == null) {
                long contentLength = Long.parseLong(contentLengthStr);
                if (contentLength > 0) {
                    if (Options.getShouldAutoCloseResponseInputStream()) {
                        if (JerseyHttpRequest.isExtraStreamLogsEnabled) {
                            log.warn(
                                    "Wrapping response stream into auto closeable stream, to disable this, please "
                                            + "use Options.shouldAutoCloseResponseInputStream(false)");
                        }
                        inputStream =
                                new AutoCloseableContentLengthVerifyingInputStream(
                                        inputStream, contentLength);
                    } else {
                        inputStream =
                                new ContentLengthVerifyingInputStream(inputStream, contentLength);
                    }
                }
            }

            return CompletableFuture.completedFuture(inputStream);
        } catch (Exception e) {
            return failedFuture(e);
        } finally {
            if (contentType != null) {
                response.getHeaders().addAll(HttpHeaders.CONTENT_TYPE, contentType);
            }
        }
    }

    @Override
    public <T> CompletionStage<T> body(Class<T> type) {
        bodyConsumed = true;
        try {
            return CompletableFuture.completedFuture(readEntitySync(new GenericType<>(type)));
        } catch (Exception e) {
            return failedFuture(e);
        }
    }

    @Override
    public <T> CompletionStage<List<T>> listBody(Class<T> type) {
        bodyConsumed = true;
        GenericType<List<T>> listType =
                new GenericType<>(new SimpleParameterizedType(List.class, type));
        try {
            return CompletableFuture.completedFuture(readEntitySync(listType));
        } catch (Exception e) {
            return failedFuture(e);
        }
    }

    private <T> T readEntitySync(GenericType<T> type) {
        // buffer entity so it can be reread during client parsing (ex, async requests reading
        // through both an AsyncHandler and through the returned Future)
        // todo: is this still necessary?
        // todo: can we do this async?
        response.bufferEntity();
        return response.readEntity(type);
    }

    @Override
    public CompletionStage<String> textBody() {
        bodyConsumed = true;
        return CompletableFuture.completedFuture(response.readEntity(String.class));
    }

    @Override
    public void close() {
        if (!bodyConsumed && response.hasEntity()) {
            try {
                response.readEntity(InputStream.class).close();
            } catch (IOException ignored) {
            }
        }
        // todo: is this correct? we still need to keep an inputstream returned by body() available
        response.close();
    }

    private static <T> CompletableFuture<T> failedFuture(Throwable failure) {
        CompletableFuture<T> future = new CompletableFuture<>();
        future.completeExceptionally(failure);
        return future;
    }

    private static final class SimpleParameterizedType implements ParameterizedType {
        private final Class<?> rawType;
        private final Type contentType;

        SimpleParameterizedType(Class<?> rawType, Type contentType) {
            this.rawType = rawType;
            this.contentType = contentType;
        }

        @Override
        public Type[] getActualTypeArguments() {
            return new Type[] {contentType};
        }

        @Override
        public Type getRawType() {
            return rawType;
        }

        @Override
        public Type getOwnerType() {
            return null;
        }
    }
}
