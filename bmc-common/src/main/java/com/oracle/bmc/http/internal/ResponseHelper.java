/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

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

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.common.base.Optional;
import com.oracle.bmc.io.internal.ContentLengthVerifyingInputStream;
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
        if (Status.Family.SUCCESSFUL.equals(response.getStatusInfo().getFamily())) {
            return;
        }
        if (response.getStatus() == Status.NOT_MODIFIED.getStatusCode()) {
            return;
        }

        String opcRequestId = response.getHeaderString(OPC_REQUEST_ID_HEADER);

        // synchronized for async handlers where both an AsyncHandler and a Future might try to
        // handle the response
        synchronized (response) {

            // If the response Content-Type is not application/json, then don't bother parsing the response body.
            if (!MediaType.APPLICATION_JSON_TYPE.equals(response.getMediaType())) {
                String responseBody = "Cannot read response body!";
                try {
                    responseBody = response.readEntity(String.class);
                } catch (ProcessingException e) {
                    // Unable to read the response body. This is non-fatal so swallow the error and proceed.
                    LOG.warn("Unable to read response body", e);
                }

                throw new BmcException(
                        response.getStatus(),
                        "Unknown",
                        String.format(
                                "Unexpected Content-Type: %s instead of %s. Response body: %s",
                                response.getMediaType(),
                                MediaType.APPLICATION_JSON_TYPE,
                                responseBody),
                        opcRequestId);
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
                    isBuffered = response.bufferEntity();
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
                throw new BmcException(
                        response.getStatus(),
                        "Unknown",
                        isBuffered
                                ? "Unable to parse error response: "
                                        + response.readEntity(String.class)
                                : "Unable to parse error response.",
                        opcRequestId,
                        e);
            }
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

                return response.readEntity(entityType);
            }
        }
        if (response.getStatus() == Status.NOT_MODIFIED.getStatusCode()) {
            return null;
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
                        InputStream inputStream = rawInputStream;

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
                                            rawInputStream, contentLength);
                        }
                        return (T) inputStream;
                    } finally {
                        response.getHeaders().addAll(HttpHeaders.CONTENT_TYPE, contentType);
                    }
                }

                // buffer entity so it can be reread during client parsing (ex, async requests reading
                // through both an AsyncHandler and through the returned Future)
                response.bufferEntity();

                T entity = response.readEntity(entityType);
                if (MediaType.APPLICATION_JSON_TYPE.equals(response.getMediaType())
                        && entityType == String.class) {
                    // HACK alert, if the entry is a string, and it's mime was
                    // application/json, jackson's provider won't deserialize it since
                    // the default provider takes precedence. Need to explicitly remove
                    // outer quotes.
                    // TODO: figure out how to do this through providers
                    return (T) ((String) entity).replaceAll("\"", "");
                }
                return entity;
            }
        }
        if (response.getStatus() == Status.NOT_MODIFIED.getStatusCode()) {
            return null;
        }
        throw new IllegalStateException(
                "Attempted to read entity from unsuccessful response, should have called throwIfNotSuccessful first");
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
