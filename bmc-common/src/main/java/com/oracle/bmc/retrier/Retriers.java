/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.retrier;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.stream.Stream;

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
}
