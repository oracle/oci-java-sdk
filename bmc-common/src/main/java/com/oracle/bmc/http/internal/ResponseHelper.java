/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Objects;
import javax.ws.rs.ProcessingException;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.oracle.bmc.Options;
import com.oracle.bmc.ServiceDetails;
import com.oracle.bmc.http.ApacheUtils;
import com.oracle.bmc.io.internal.AutoCloseableContentLengthVerifyingInputStream;
import com.oracle.bmc.io.internal.ContentLengthVerifyingInputStream;
import com.oracle.bmc.io.internal.WrappedResponseInputStream;
import com.oracle.bmc.model.BmcException;
import javax.annotation.Nonnull;

/**
 * A {@code BmcException} exception is thrown in response to failures from a
 * REST endpoint. It contains the status code of the HTTP response as well as an
 * application code and message describing the problem.
 */
public class ResponseHelper {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ResponseHelper.class);
    private static final ObjectReader STRING_READER =
            com.oracle.bmc.http.Serialization.getObjectMapper().readerFor(String.class);
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
     *            The response received
     */
    public static void throwIfNotSuccessful(@Nonnull Response response) {
        throwIfNotSuccessful(response, ServiceDetails.UNKNOWN_SERVICE_DETAILS);
    }

    /**
     * Throws BmcException if the response status is not in the family
     * Family.SUCCESSFUL, or is not Status.NOT_MODIFIED.
     *
     * @param response
     *            The response received.
     * @param serviceDetails
     *            The service details of the response
     */
    public static void throwIfNotSuccessful(
            @Nonnull Response response, @Nonnull ServiceDetails serviceDetails) {
        if (response == null) {
            throw new java.lang.NullPointerException("response is marked non-null but is null");
        }
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
                            opcRequestId,
                            serviceDetails);
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
                            opcRequestId,
                            serviceDetails);
                } else {
                    throw new BmcException(
                            response.getStatus(),
                            errorCodeAndMessage.getCode(),
                            errorCodeAndMessage.getMessage(),
                            opcRequestId,
                            serviceDetails,
                            errorCodeAndMessage.getOriginalMessage(),
                            errorCodeAndMessage.getOriginalMessageTemplate(),
                            errorCodeAndMessage.getMessageArguments());
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

                throw new BmcException(status, "Unknown", message, opcRequestId, e, serviceDetails);
            }
        }
    }

    /**
     * Simple response handler that just cleans up the response, assuming
     * no entity needs to be read out.
     *
     * @param response the response
     */
    public static void readWithoutEntity(@Nonnull final Response response) {
        if (response == null) {
            throw new java.lang.NullPointerException("response is marked non-null but is null");
        }
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
    public static <T> T readEntity(@Nonnull final Response response, GenericType<T> entityType) {
        if (response == null) {
            throw new java.lang.NullPointerException("response is marked non-null but is null");
        }
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
    public static <T> T readEntity(@Nonnull final Response response, Class<T> entityType)
            throws BmcException {
        if (response == null) {
            throw new java.lang.NullPointerException("response is marked non-null but is null");
        }
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
                                HeaderUtils.getHeadersWithName(
                                        response.getStringHeaders(), HttpHeaders.CONTENT_LENGTH);
                        // If the Content-Length header is present and Content-Encoding header is not present in the response,
                        // verify that the length of the input stream matches it
                        if (contentLengthHeader.isPresent()
                                && response.getHeaders().get(HttpHeaders.CONTENT_ENCODING)
                                        == null) {
                            long contentLength =
                                    HeaderUtils.toValue(
                                            HttpHeaders.CONTENT_LENGTH,
                                            contentLengthHeader.get().get(0),
                                            Long.class);
                            if (contentLength > 0) {
                                if (Options.getShouldAutoCloseResponseInputStream()) {
                                    inputStream =
                                            new AutoCloseableContentLengthVerifyingInputStream(
                                                    inputStream, contentLength);
                                } else {
                                    inputStream =
                                            new ContentLengthVerifyingInputStream(
                                                    inputStream, contentLength);
                                }
                            }
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
                LOG.debug("Exception while closing response", t);
            }
        }
    }

    /**
     * Closes a {@link Response} silently if a {@link Response} is not buffered or is not backed by an unconsumed stream
     * (e.g., for responses with no body).
     *
     * @param response the response to close
     */
    public static void closeResponseSilentlyIfNotBuffered(@Nonnull final Response response) {
        if (response == null) {
            throw new java.lang.NullPointerException("response is marked non-null but is null");
        }
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

    /**
     * Sets the boolean value to indicate if the SDK should auto-close the InputStream stream returned from the
     * response once the stream has been read until the content-length of the stream
     * Note : This has been added to automatically release connections from the connection pool when using
     * the Apache Connector since the Apache Connector uses connection pooling by default
     * @deprecated use Options.shouldAutoCloseResponseInputStream instead
     */
    @Deprecated
    public static void shouldAutoCloseResponseInputStream(final boolean shouldAutoClose) {
        Options.shouldAutoCloseResponseInputStream(shouldAutoClose);
    }

    @JsonDeserialize(builder = ErrorCodeAndMessage.Builder.class)
    public static final class ErrorCodeAndMessage {
        private final String code;
        private final String message;

        private final String originalMessage;

        private final String originalMessageTemplate;

        private final Map<String, String> messageArguments;

        @JsonPOJOBuilder(withPrefix = "")
        public static class Builder {
            private String code;
            private String message;

            private String originalMessage;

            private String originalMessageTemplate;

            private Map<String, String> messageArguments;

            Builder() {}

            /**
             * @return {@code this}.
             */
            public ResponseHelper.ErrorCodeAndMessage.Builder code(final String code) {
                this.code = code;
                return this;
            }

            /**
             * @return {@code this}.
             */
            public ResponseHelper.ErrorCodeAndMessage.Builder message(final String message) {
                this.message = message;
                return this;
            }

            public ResponseHelper.ErrorCodeAndMessage.Builder originalMessage(
                    final String originalMessage) {
                this.originalMessage = originalMessage;
                return this;
            }

            public ResponseHelper.ErrorCodeAndMessage.Builder originalMessageTemplate(
                    final String originalMessageTemplate) {
                this.originalMessageTemplate = originalMessageTemplate;
                return this;
            }

            public ResponseHelper.ErrorCodeAndMessage.Builder messageArguments(
                    final Map<String, String> messageArguments) {
                this.messageArguments = messageArguments;
                return this;
            }

            public ResponseHelper.ErrorCodeAndMessage build() {
                return new ResponseHelper.ErrorCodeAndMessage(
                        this.code,
                        this.message,
                        this.originalMessage,
                        this.originalMessageTemplate,
                        this.messageArguments);
            }

            @java.lang.Override
            public java.lang.String toString() {
                return "ResponseHelper.ErrorCodeAndMessage.Builder(code="
                        + this.code
                        + ", message="
                        + this.message
                        + ")";
            }
        }

        @java.beans.ConstructorProperties({
            "code",
            "message",
            "originalMessage",
            "originalMessageTemplate",
            "messageArguments"
        })
        ErrorCodeAndMessage(
                final String code,
                final String message,
                final String originalMessage,
                final String originalMessageTemplate,
                final Map<String, String> messageArguments) {
            this.code = code;
            this.message = message;
            this.originalMessage = originalMessage;
            this.originalMessageTemplate = originalMessageTemplate;
            this.messageArguments = messageArguments;
        }

        public static ResponseHelper.ErrorCodeAndMessage.Builder builder() {
            return new ResponseHelper.ErrorCodeAndMessage.Builder();
        }

        public String getCode() {
            return this.code;
        }

        public String getMessage() {
            return this.message;
        }

        public String getOriginalMessage() {
            return this.originalMessage;
        }

        public String getOriginalMessageTemplate() {
            return this.originalMessageTemplate;
        }

        public Map<String, String> getMessageArguments() {
            return this.messageArguments;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object o) {
            if (o == this) return true;
            if (!(o instanceof ResponseHelper.ErrorCodeAndMessage)) return false;
            final ResponseHelper.ErrorCodeAndMessage other = (ResponseHelper.ErrorCodeAndMessage) o;
            final java.lang.Object this$code = this.getCode();
            final java.lang.Object other$code = other.getCode();
            if (!Objects.equals(this$code, other$code)) return false;
            final java.lang.Object this$message = this.getMessage();
            final java.lang.Object other$message = other.getMessage();
            if (!Objects.equals(this$message, other$message)) return false;
            if (!Objects.equals(this$message, other$message)) return false;
            final java.lang.Object this$originalMessage = this.getOriginalMessage();
            final java.lang.Object other$originalMessage = other.getOriginalMessage();
            if (!Objects.equals(this$originalMessage, other$originalMessage)) return false;
            final java.lang.Object this$originalMessageTemplate = this.getOriginalMessageTemplate();
            final java.lang.Object other$originalMessageTemplate =
                    other.getOriginalMessageTemplate();
            if (!Objects.equals(this$originalMessageTemplate, other$originalMessageTemplate))
                return false;
            final java.lang.Object this$messageArguments = this.getMessageArguments();
            final java.lang.Object other$messageArguments = other.getMessageArguments();
            if (!Objects.equals(this$messageArguments, other$messageArguments)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final java.lang.Object $code = this.getCode();
            result = result * PRIME + ($code == null ? 43 : $code.hashCode());
            final java.lang.Object $message = this.getMessage();
            result = result * PRIME + ($message == null ? 43 : $message.hashCode());
            final java.lang.Object $originalMessage = this.getOriginalMessage();
            result = result * PRIME + ($originalMessage == null ? 43 : $originalMessage.hashCode());
            final java.lang.Object $originalMessageTemplate = this.getOriginalMessageTemplate();
            result =
                    result * PRIME
                            + ($originalMessageTemplate == null
                                    ? 43
                                    : $originalMessageTemplate.hashCode());
            final java.lang.Object $messageArguments = this.getMessageArguments();
            result =
                    result * PRIME
                            + ($messageArguments == null ? 43 : $messageArguments.hashCode());
            return result;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return "ResponseHelper.ErrorCodeAndMessage(code="
                    + this.getCode()
                    + ", message="
                    + this.getMessage()
                    + ", originalMessage="
                    + this.getOriginalMessage()
                    + ", originalMessageTemplate="
                    + this.getOriginalMessageTemplate()
                    + ", templateArguments="
                    + this.getMessageArguments()
                    + ")";
        }
    }
}
