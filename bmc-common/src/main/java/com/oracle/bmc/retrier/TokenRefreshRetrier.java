/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.retrier;

import com.oracle.bmc.Options;
import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;
import com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider;
import com.oracle.bmc.waiter.DelayStrategy;
import com.oracle.bmc.waiter.FixedTimeDelayStrategy;
import com.oracle.bmc.waiter.MaxAttemptsTerminationStrategy;
import com.oracle.bmc.waiter.TerminationStrategy;
import javax.annotation.Nonnull;
import javax.ws.rs.core.Response;

/**
 * A custom retrier that refreshes tokens and retries the operation in case of authentication failures. This retrier
 * will make at max 2 attempts with no delay between the retried requests.
 */
public class TokenRefreshRetrier extends BmcGenericRetrier {
    private static TerminationStrategy TOKEN_REFRESH_TERMINATION_STRATEGY =
            new MaxAttemptsTerminationStrategy(2);
    private static DelayStrategy TOKEN_REFRESH_DELAY_STRATEGY = new FixedTimeDelayStrategy(0L);

    /**
     * Creates a retry configuration for token refresh retrier based on the provided authentication details provider.
     *
     * If token refresh retrier is enabled, the created retry configuration will have a termination strategy that allows
     * for a maximum of 2 attempts, a delay strategy with no delay between attempts, and a retry condition that checks
     * for authentication failures and refreshes the token if necessary.
     *
     * If token refresh retrier is disabled, the created retry configuration will have a retry condition that always returns false.
     *
     * By default, the token refresh retries are enabled.
     * You have the flexibility to disable these retries if needed. This can be achieved by setting the system property.
     * <pre>
     * System.setProperty("oci.javasdk.token.refresh.enabled", "false");
     * </pre>
     *
     * @param authenticationDetailsProvider the authentication details provider used to determine the retry configuration
     * @return the created retry configuration
     */
    private static RetryConfiguration createTokenRefreshRetryConfiguration(
            @Nonnull final AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
        if (authenticationDetailsProvider == null) {
            throw new java.lang.NullPointerException(
                    "authenticationDetailsProvider is marked non-null but is null");
        }
        final RetryConfiguration.Builder tokenRefreshRetryConfigurationBuilder =
                RetryConfiguration.builder();

        if (Options.isTokenRefreshRetrierEnabled()) {
            tokenRefreshRetryConfigurationBuilder
                    .terminationStrategy(TOKEN_REFRESH_TERMINATION_STRATEGY)
                    .delayStrategy(TOKEN_REFRESH_DELAY_STRATEGY)
                    .retryCondition(
                            e -> {
                                if ((e.getStatusCode()
                                                        == Response.Status.UNAUTHORIZED
                                                                .getStatusCode()
                                                || DefaultRetryCondition.isProcessingException(e))
                                        && authenticationDetailsProvider
                                                instanceof RefreshableOnNotAuthenticatedProvider) {
                                    ((RefreshableOnNotAuthenticatedProvider)
                                                    authenticationDetailsProvider)
                                            .refresh();
                                    return true;
                                }
                                return false;
                            });
        } else {
            // Added to disable the DefaultRetryCondition() from RetryConfiguration
            tokenRefreshRetryConfigurationBuilder.retryCondition(
                    e -> {
                        return false;
                    });
        }

        return tokenRefreshRetryConfigurationBuilder.build();
    }

    /**
     * Create a new instance.
     * @param authenticationDetailsProvider The authentication provider used by the client.
     */
    public TokenRefreshRetrier(
            @Nonnull final AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
        super(createTokenRefreshRetryConfiguration(authenticationDetailsProvider));
        if (authenticationDetailsProvider == null) {
            throw new java.lang.NullPointerException(
                    "authenticationDetailsProvider is marked non-null but is null");
        }
    }
}
