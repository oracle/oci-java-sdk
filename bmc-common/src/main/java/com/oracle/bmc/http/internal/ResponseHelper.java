/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.common.base.Optional;
import com.oracle.bmc.io.internal.ContentLengthVerifyingInputStream;
import com.oracle.bmc.io.internal.WrappedResponseInputStream;
import com.oracle.bmc.model.BmcException;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;

/**
 * A {@code BmcException} exception is thrown in response to failures from a
 * REST endpoint. It contains the status code of the HTTP response as well as an
 * application code and message describing the problem.
 */
@Getter
@Slf4j
public class ResponseHelper {
    private static final ObjectReader STRING_READER = new ObjectMapper().readerFor(String.class);
    private static final int MAX_RESPONSE_BUFFER_BYTES = 4096;
    private static final String OPC_REQUEST_ID_HEADER = "opc-request-id";
    private static final Map<Integer, String> DEFAULT_ERROR_MESSAGES = new HashMap<>();

    // mostly here for HEAD requests which wouldn't have a body to parse a nice message from.
    static {
        DEFAULT_ERROR_MESSAGES.put(
                Status.NOT_FOUND.getStatusCode(),
                "The resource does not exist or the request was not authorized");
        DEFAULT_ERROR_MESSAGES.put(
                Status.PRECONDITION_FAILED.getStatusCode(), "Precondition failed");
    }

    /**
     * Throws BmcException if the response status is not in the family
     * Family.SUCCESSFUL, or is not Status.NOT_MODIFIED.
     *
     * @param response
     *            The response received.
     */
    public static void throwIfNotSuccessful(@NonNull Response response) {
        // synchronized for async handlers where both an AsyncHandler and a Future might try to
        // handle the response
        synchronized (response) {
            if (Status.Family.SUCCESSFUL.equals(response.getStatusInfo().getFamily())) {
                return;
            }
            if (response.getStatus() == Status.NOT_MODIFIED.getStatusCode()) {
                return;
            }

            String opcRequestId = response.getHeaderString(OPC_REQUEST_ID_HEADER);

            // If the response Content-Type is not application/json, then don't bother parsing the response body.
            if (!typeEqual(MediaType.APPLICATION_JSON_TYPE, response.getMediaType())) {
                String responseBody = "Cannot read response body!";
                try {
                    responseBody = response.readEntity(String.class);
                } catch (ProcessingException e) {
                    // Unable to read the response body. This is non-fatal so swallow the error and proceed.
                    LOG.warn("Unable to read response body", e);
                }

                try {
                    throw new BmcException(
                            response.getStatus(),
                            "Unknown",
                            String.format(
                                    "Unexpected Content-Type: %s instead of %s. Response body: %s",
                                    response.getMediaType(),
                                    MediaType.APPLICATION_JSON_TYPE,
                                    responseBody),
                            opcRequestId);
                } finally {
                    // Ensure that the response entity is closed so that the connection isn't left in use.  This is
                    // especially important for customers using the ApacheConnectorProvider.
                    closeResponseSilently(response);
                }
            }

            boolean isBuffered = false;
            try {
                /*
                 * Try to buffer the response for error logging in case parsing
                 * fails. Ideally we would be able to specify "first X bytes" (to
                 * avoid OOMs on large responses) but response buffering in JAX-RS
                 * seems to be all-or-nothing unless we adopt a bit more complexity
                 * by handing the parsing ourselves.
                 */
                if (response.getLength() < MAX_RESPONSE_BUFFER_BYTES) {
                    try {
                        isBuffered = response.bufferEntity();
                    } catch (IllegalStateException e) {
                        // bufferEntity will throw ISE if the response is closed already
                        LOG.info(
                                "Unable to buffer response entity as the response has already been closed",
                                e);
                    }
                }
                final ErrorCodeAndMessage errorCodeAndMessage =
                        response.readEntity(ErrorCodeAndMessage.class);
                if (errorCodeAndMessage == null) {
                    String message = DEFAULT_ERROR_MESSAGES.get(response.getStatus());
                    throw new BmcException(
                            response.getStatus(),
                            "Unknown",
                            message != null
                                    ? message
                                    : "Detailed exception information not available",
                            opcRequestId);
                } else {
                    throw new BmcException(
                            response.getStatus(),
                            errorCodeAndMessage.getCode(),
                            errorCodeAndMessage.getMessage(),
                            opcRequestId);
                }
            } catch (ProcessingException e) {
                // NOTE: for async paths, this means the first invocation will be the only one that gets
                // the original message.
                String message =
                        isBuffered
                                ? "Unable to parse error response: "
                                        + response.readEntity(String.class)
                                : "Unable to parse error response.";
                int status = response.getStatus();

                // if there's a processing exception, we cannot assume that the response has been closed,
                // so close it now after the response has been read out.
                closeResponseSilently(response);

                throw new BmcException(status, "Unknown", message, opcRequestId, e);
            }
        }
    }

    /**
     * Simple response handler that just cleans up the response, assuming
     * no entity needs to be read out.
     *
     * @param response the response
     */
    public static void readWithoutEntity(@NonNull final Response response) {
        // synchronized for async handlers where both an AsyncHandler and a Future might try to
        // handle the response
        synchronized (response) {
            closeResponseSilently(response);
        }
    }

    /**
     * Reads an entity out of the given response if its status code is 2xx or 304.
     * Must call {@link #throwIfNotSuccessful(Response)} first.
     *
     * @param response
     *            the response
     * @param entityType
     *            the type of the entity to read
     * @return the entity (if the response's status code was 2xx)
     */
    public static <T> T readEntity(@NonNull final Response response, GenericType<T> entityType) {
        // synchronized for async handlers where both an AsyncHandler and a Future might try to
        // handle the response
        synchronized (response) {
            if (response.getStatusInfo().getFamily().equals(Status.Family.SUCCESSFUL)) {
                // buffer entity so it can be reread during client parsing (ex, async requests reading
                // through both an AsyncHandler and through the returned Future)
                response.bufferEntity();

                // NOTE: readEntity will take care of closing the response
                return response.readEntity(entityType);
            }

            if (response.getStatus() == Status.NOT_MODIFIED.getStatusCode()) {
                // close response when not modified
                closeResponseSilently(response);
                return null;
            }
        }
        throw new IllegalStateException(
                "Attempted to read entity from unsuccessful response, should have called throwIfNotSuccessful first");
    }

    /**
     * Reads an entity out of the given response if its status code is 2xx or 304.
     * Must call {@link #throwIfNotSuccessful(Response)} first.
     *
     * @param response
     *            the response
     * @param entityType
     *            the type of the entity to read
     * @return the entity (if the response's status code was 2xx), or null if 304
     */
    public static <T> T readEntity(@NonNull final Response response, Class<T> entityType)
            throws BmcException {
        // synchronized for async handlers where both an AsyncHandler and a Future might try to
        // handle the response
        synchronized (response) {
            if (response.getStatusInfo().getFamily().equals(Status.Family.SUCCESSFUL)) {
                if (entityType == InputStream.class) {
                    // If we want an InputStream, then we don't care about the content type.
                    // This will also allow us to process invalid content types like "text" (instead of "text/plain").
                    List<Object> contentType =
                            response.getHeaders().remove(HttpHeaders.CONTENT_TYPE);
                    LOG.debug(
                            "Entity type is InputStream, ignoring contentType {} and processing as stream",
                            contentType);
                    try {
                        // NOTE: do not buffer InputStreams (namely object storage) as those might be very large
                        final InputStream rawInputStream = response.readEntity(InputStream.class);
                        // Wrap the input stream to ensure that it gets closed.
                        InputStream inputStream =
                                new WrappedResponseInputStream(rawInputStream, response);

                        Optional<List<String>> contentLengthHeader =
                                HeaderUtils.get(
                                        response.getStringHeaders(), HttpHeaders.CONTENT_LENGTH);
                        // If the Content-Length header is present, verify that the length of the input stream matches it
                        if (contentLengthHeader.isPresent()) {
                            long contentLength =
                                    HeaderUtils.toValue(
                                            HttpHeaders.CONTENT_LENGTH,
                                            contentLengthHeader.get().get(0),
                                            Long.class);

                            inputStream =
                                    new ContentLengthVerifyingInputStream(
                                            inputStream, contentLength);
                        }

                        return entityType.cast(inputStream);
                    } finally {
                        if (contentType != null) {
                            response.getHeaders().addAll(HttpHeaders.CONTENT_TYPE, contentType);
                        }
                    }
                }

                // buffer entity so it can be reread during client parsing (ex, async requests reading
                // through both an AsyncHandler and through the returned Future)
                response.bufferEntity();

                T entity = response.readEntity(entityType);
                T entityAsJsonString = readResponseAsJsonString(entity, response, entityType);
                if (entityAsJsonString != null) {
                    return entityAsJsonString;
                }
                return entity;
            }

            if (response.getStatus() == Status.NOT_MODIFIED.getStatusCode()) {
                // close response when not modified
                closeResponseSilently(response);
                return null;
            }
        }
        throw new IllegalStateException(
                "Attempted to read entity from unsuccessful response, should have called throwIfNotSuccessful first");
    }

    /**
     * Closes a given {@link Response} and ignores any thrown exceptions. Closing a response is idempotent, so there
     * is no harm in closing a {@link Response} once the response has been fully processed to ensure that the client
     * connection is not left in use.
     *
     * @param response the response to close
     */
    public static void closeResponseSilently(final Response response) {
        synchronized (response) {
            try {
                response.close();
            } catch (Throwable t) {
                LOG.info("Exception while closing response", t);
            }
        }
    }

    /**
     * Closes a {@link Response} silently if a {@link Response} is not buffered or is not backed by an unconsumed stream
     * (e.g., for responses with no body).
     *
     * @param response the response to close
     */
    public static void closeResponseSilentlyIfNotBuffered(@NonNull final Response response) {
        synchronized (response) {
            /*
             * Ensure that the entity has been buffered.  A status of true asserts that the entity is backed
             * by a stream and has been read + closed.  Also, default to true for the case that the response has either
             * already been buffered or is not backed by an unconsumed stream.
             */
            boolean isResponseAlreadyClosed = true;
            try {
                isResponseAlreadyClosed = response.bufferEntity();
            } catch (IllegalStateException ex) {
                /*
                 * It's possible for bufferEntity to throw an IllegalStateException if the underlying
                 * stream is already closed. If this is the case, assume that the entity has already been buffered
                 * and closed by readEntity() above as that is the contract defined by bufferEntity().
                 */
                LOG.trace("Exception while buffering the entity before closing the response", ex);
            }

            if (!isResponseAlreadyClosed) {
                closeResponseSilently(response);
            }
        }
    }

    private static boolean typeEqual(MediaType m1, MediaType m2) {
        if (m1 == m2) {
            return true;
        } else if (m1 == null || m2 == null) {
            return false;
        }
        return m1.getSubtype().equalsIgnoreCase(m2.getSubtype())
                && m1.getType().equalsIgnoreCase(m2.getType());
    }

    /**
     * Attempt to read responses that are actually json encoded strings, but would otherwise fail to read correctly because
     * of how the Jersey client is configured.
     */
    private static <T> T readResponseAsJsonString(
            T entity, Response response, Class<T> entityType) {
        // HACK alert, if the entry is a string, and it's mime was
        // application/json, jackson's provider won't deserialize it since
        // the default provider takes presidence. Need to explicitly deserialize the
        // String as a JSON encoded string
        // TODO: figure out how to do this through providers
        String contentType = response.getHeaderString(HttpHeaders.CONTENT_TYPE);
        if (contentType == null) {
            return null;
        }
        if (!javax.ws.rs.core.MediaType.APPLICATION_JSON.equalsIgnoreCase(contentType)) {
            return null;
        }
        if (!(entityType == String.class)) {
            return null;
        }

        String stringEntity = (String) entity;
        // double check it looks like a JSON encoded string
        if (stringEntity.startsWith("\"") && stringEntity.endsWith("\"")) {
            try {
                return entityType.cast(STRING_READER.readValue(stringEntity));
            } catch (IOException e) {
                LOG.error("Unable to extract string response", e);
            }
        }
        return null;
    }

    @Value
    @JsonDeserialize(builder = ErrorCodeAndMessage.Builder.class)
    @Builder(builderClassName = "Builder")
    public static class ErrorCodeAndMessage {

        String code;
        String message;

        @JsonPOJOBuilder(withPrefix = "")
        public static class Builder {}
    }
}
