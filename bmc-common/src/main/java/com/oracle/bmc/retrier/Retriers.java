/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.retrier;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.stream.Stream;
import javax.annotation.Nullable;

import com.oracle.bmc.InternalSdk;
import com.oracle.bmc.requests.BmcRequest;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

/**
 * Group of utility methods to configure the SDK retry behavior
 */
@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Retriers {
    private static volatile RetryConfiguration DEFAULT_RETRY_CONFIGURATION =
            RetryConfiguration.NO_RETRY_CONFIGURATION;
    private static volatile boolean SEND_OPC_RETRY_TOKEN = true;

    /**
     * Setter for the default retry configuration used in the SDK. This can be overriden by setting
     * a retry configuration on the client (via {@link com.oracle.bmc.ClientConfiguration}) or the request (via
     * {@link com.oracle.bmc.requests.BmcRequest#setRetryConfiguration(RetryConfiguration)})
     * @param retryConfiguration the {@link RetryConfiguration} to use
     */
    public static void setDefaultRetryConfiguration(
            @NonNull final RetryConfiguration retryConfiguration) {
        LOG.info("Setting default retry configuration to {}", retryConfiguration);
        DEFAULT_RETRY_CONFIGURATION = retryConfiguration;
    }

    /**
     * Sets whether the SDK should automatically send the opc-retry-token header
     * @param shouldSendOpcRetryToken if {@code true}, then the SDK will automatically send the opc-retry-token header
     */
    public static void shouldSendOpcRetryToken(boolean shouldSendOpcRetryToken) {
        LOG.info("Setting shouldSendOpcRetryToken to {}", shouldSendOpcRetryToken);
        SEND_OPC_RETRY_TOKEN = shouldSendOpcRetryToken;
    }

    /**
     * Gets whether the SDK is automatically sending the opc-retry-token header
     * @return {@code true} if the SDK automatically sends the opc-retry-token header, else {@code false}
     */
    public static boolean shouldSendOpcRetryToken() {
        return SEND_OPC_RETRY_TOKEN;
    }

    /**
     * Choose the desired retry configuration and use it to create the retrier.
     * @param requestRetryConfiguration the retry configuration set on the request object
     * @param clientRetryConfiguration the retry configuration set on the client object
     * @return The retrier based on the appropriate retry configuration
     */
    public static BmcGenericRetrier createPreferredRetrier(
            @Nullable final RetryConfiguration requestRetryConfiguration,
            @Nullable final RetryConfiguration clientRetryConfiguration) {
        final RetryConfiguration preferredRetryConfiguration =
                Stream.of(
                                requestRetryConfiguration,
                                clientRetryConfiguration,
                                DEFAULT_RETRY_CONFIGURATION)
                        .filter(Objects::nonNull)
                        .findFirst()
                        .get();
        LOG.debug("Using retry configuration: {}", preferredRetryConfiguration);
        return new BmcGenericRetrier(preferredRetryConfiguration);
    }

    /**
     * Try to reset the {@link InputStream} for the next retry, if supported.
     *
     * If the stream supports {@link InputStream#mark(int)} and {@link InputStream#reset()}, we reset the stream so it
     * starts at the beginning (or wherever the stream has been marked using {@link InputStream#mark(int)}.
     *
     * Note that this means that if the caller has used {@link InputStream#mark(int)} and the mark does not represent
     * the place in the stream where retries should commence (if retries are requested and necessary), then incorrect
     * data may be processed.
     *
     * If the stream does not support {@link InputStream#mark(int)} and {@link InputStream#reset()}, then retries
     * will not work. Therefore, those streams should be wrapped in a {@link java.io.BufferedInputStream} before
     * they are sent here.
     *
     * @param body
     */
    @InternalSdk
    public static void tryResetStreamForRetry(InputStream body) {
        tryResetStreamForRetry(body, false);
    }

    /**
     * Try to reset the {@link InputStream} for the next retry, if supported. If not supported, fail if requested.
     *
     * If the stream supports {@link InputStream#mark(int)} and {@link InputStream#reset()}, we reset the stream so it
     * starts at the beginning (or wherever the stream has been marked using {@link InputStream#mark(int)}.
     *
     * Note that this means that if the caller has used {@link InputStream#mark(int)} and the mark does not represent
     * the place in the stream where retries should commence (if retries are requested and necessary), then incorrect
     * data may be processed.
     *
     * If the stream does not support {@link InputStream#mark(int)} and {@link InputStream#reset()}, then retries
     * will not work. Therefore, those streams should be wrapped in a {@link java.io.BufferedInputStream} before
     * they are sent here.
     *
     * @param body
     * @param failIfUnsupported if true, fail if unsupported
     */
    @InternalSdk
    public static void tryResetStreamForRetry(InputStream body, boolean failIfUnsupported) {
        if (body.markSupported()) {
            LOG.debug("mark/reset is supported, resetting stream {}", body.getClass().getName());
            try {
                body.reset();
            } catch (IOException ioe) {
                throw new RuntimeException("Failed to reset stream for next retry");
            }
        } else {
            if (failIfUnsupported) {
                throw new RuntimeException(
                        String.format(
                                "Stream {} does not support mark/reset, retries do not work",
                                body.getClass().getName()));
            } else {
                LOG.warn(
                        "Stream {} does not support mark/reset, retries will not work",
                        body.getClass().getName());
            }
        }
    }

    /**
     * Wrap the input stream in the request so retries can work.
     *
     * Note: The stream in the request may be wrapped in a {@link com.oracle.bmc.io.internal.KeepOpenInputStream},
     * which prevents a call to {@code close()} from actually closing the stream (this is necessary, since a closed
     * stream would not be able to serve in a potentially required retry). If this method
     * ({@code wrapBodyInputStreamIfNecessary}) is called on request with a stream, you have to enclose it in a
     * {@code try-finally} block that calls {@link com.oracle.bmc.io.internal.KeepOpenInputStream#closeStream(InputStream)}.
     *
     * Example:
     *
     * <pre>
     * <code>try {
     *     request = Retriers.wrapBodyInputStreamIfNecessary(
     *         request, MyRequest.builder());
     *     ...
     * } finally {
     *     com.oracle.bmc.io.internal.KeepOpenInputStream.closeStream(
     *         request.getBody$());
     * }
     * </code>
     * </pre>
     *
     * @param request request being handled
     * @param builder builder for the request
     * @param <T> type of the request
     * @return request with the input stream wrapped
     */
    @InternalSdk
    public static <T extends BmcRequest<InputStream>> T wrapBodyInputStreamIfNecessary(
            T request, BmcRequest.Builder<T, InputStream> builder) {
        final java.io.InputStream body = request.getBody$();
        final java.io.InputStream wrappedStream;
        final RetryConfiguration retryConfiguration = request.getRetryConfiguration();

        if (body instanceof java.io.FileInputStream
                && com.oracle.bmc.io.internal.ResettableFileInputStream.canBeWrapped(
                        (java.io.FileInputStream) body)) {
            LOG.debug("Wrapping FileInputStream in a ResettableFileInputStream");
            wrappedStream =
                    new com.oracle.bmc.io.internal.KeepOpenInputStream(
                            new com.oracle.bmc.io.internal.ResettableFileInputStream(
                                    (java.io.FileInputStream) body));
        } else if (!body.markSupported()) {
            LOG.warn(
                    "stream does not support mark/reset or is a FileInputStream that doesn't allow changing the position, buffering in memory!");
            wrappedStream =
                    new com.oracle.bmc.io.internal.KeepOpenInputStream(
                            new java.io.BufferedInputStream(body));
        } else {
            wrappedStream = new com.oracle.bmc.io.internal.KeepOpenInputStream(body);
        }

        request = builder.copy(request).body$(wrappedStream).build();
        // mark the current position of the stream so we can rewind to it if a retry is necessary
        // The markLimit = retryConfiguration.getRetryOptions().getMarkReadLimit() reads from the requests retryConfiguration
        // The markLimit = Integer.MAX_VALUE guarantees that we can read at least that many bytes before we cannot rewind anymore.
        if (retryConfiguration != null && retryConfiguration.getRetryOptions() != null) {
            wrappedStream.mark(retryConfiguration.getRetryOptions().getMarkReadLimit());
        } else wrappedStream.mark(Integer.MAX_VALUE);

        return request;
    }
}
