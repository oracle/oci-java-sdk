/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey.sse.internal;

import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.function.Function;

/**
 * Reader class for media type text/event-stream that implements {@link MessageBodyReader}. The
 * class provides functionality to deserialize data from an input stream in the text/event-stream
 * format.
 *
 * <p>The constructor takes in a function Function<InputStream, ?> containing the implementation of
 * said deserialization.
 *
 * @param <T> the type of the Java object to be deserialized from the text/event-stream data.
 */
@Provider
@Consumes("text/event-stream")
public class SseEventReader<T> implements MessageBodyReader<T> {

    private final Function<InputStream, ?> readFunction;

    public SseEventReader(Function<InputStream, ?> readFunction) {
        this.readFunction = readFunction;
    }

    @Override
    public boolean isReadable(
            Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return mediaType.isCompatible(MediaType.SERVER_SENT_EVENTS_TYPE);
    }

    @Override
    public T readFrom(
            Class<T> type,
            Type genericType,
            Annotation[] annotations,
            MediaType mediaType,
            MultivaluedMap<String, String> httpHeaders,
            InputStream entityStream)
            throws IOException {
        return (T) readFunction.apply(entityStream);
    }
}
