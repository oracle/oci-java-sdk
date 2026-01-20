/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.retrier;

import com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider;
import com.oracle.bmc.http.client.Options;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.waiter.FixedTimeDelayStrategy;
import com.oracle.bmc.waiter.MaxAttemptsTerminationStrategy;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.function.Supplier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Options.class})
@PowerMockIgnore({
    "jdk.internal.reflect.*",
})
public class TokenRefreshRetrierTest {

    private static final RetryConfiguration CUSTOM_RETRY_CONFIGURATION =
            RetryConfiguration.builder()
                    .terminationStrategy(new MaxAttemptsTerminationStrategy(2))
                    .delayStrategy(new FixedTimeDelayStrategy(0L))
                    .build();

    @Before
    public void setUp() {
        PowerMockito.mockStatic(Options.class);
    }

    private Supplier<String> setupMockRequest(int httpStatusCode, final String serviceCode) {
        final Supplier<String> request = mock(Supplier.class);
        doThrow(new BmcException(httpStatusCode, serviceCode, "bar", "baz")).when(request).get();
        return request;
    }

    /**
     * Verifies that by default, the TokenRefreshRetrier will perform up to 2 retries before failing
     * with 401 error.
     */
    @Test
    public void enabledDefaultTokenRefreshRetries() {
        when(Options.isTokenRefreshRetrierEnabled()).thenReturn(true);
        final Supplier<String> request = setupMockRequest(401, "Unauthorized");
        final InstancePrincipalsAuthenticationDetailsProvider mockProvider =
                mock(InstancePrincipalsAuthenticationDetailsProvider.class);
        final BmcGenericRetrier defaultRetrier = new BmcGenericRetrier(CUSTOM_RETRY_CONFIGURATION);
        try {
            defaultRetrier.execute(
                    request,
                    retryRequest -> {
                        final TokenRefreshRetrier tokenRefreshRetrier =
                                new TokenRefreshRetrier(mockProvider);
                        return tokenRefreshRetrier.execute(retryRequest, Supplier::get);
                    });
            fail("Should have thrown");
        } catch (BmcException e) {
            assertEquals(401, e.getStatusCode());
        }

        verify(request, times(2)).get();
    }

    /**
     * Ensures that setting the system property 'oci.javasdk.token.refresh.enabled' to false
     * disables the TokenRefreshRetrier from performing any additional retries after the initial 401
     * failure.
     */
    @Test
    public void disabledTokenRefreshRetries() {
        when(Options.isTokenRefreshRetrierEnabled()).thenReturn(false);
        final Supplier<String> request = setupMockRequest(401, "Unauthorized");
        final InstancePrincipalsAuthenticationDetailsProvider mockProvider =
                mock(InstancePrincipalsAuthenticationDetailsProvider.class);
        final BmcGenericRetrier defaultRetrier = new BmcGenericRetrier(CUSTOM_RETRY_CONFIGURATION);

        try {
            defaultRetrier.execute(
                    request,
                    retryRequest -> {
                        final TokenRefreshRetrier tokenRefreshRetrier =
                                new TokenRefreshRetrier(mockProvider);
                        return tokenRefreshRetrier.execute(retryRequest, Supplier::get);
                    });
            fail("Should have thrown");
        } catch (BmcException e) {
            assertEquals(401, e.getStatusCode());
        }
        verify(request, times(1)).get();
    }

    /**
     * Verifies that by default, the TokenRefreshRetrier will perform up to 4 retries before failing
     * with Processing Exception.
     */
    @Test
    public void enabledTokenRefreshRetriesForProcessingException() {
        when(Options.isTokenRefreshRetrierEnabled()).thenReturn(true);
        final Supplier<String> request =
                setupMockRequest(-1, "Processing exception while communicating to");
        final InstancePrincipalsAuthenticationDetailsProvider mockProvider =
                mock(InstancePrincipalsAuthenticationDetailsProvider.class);
        final BmcGenericRetrier defaultRetrier = new BmcGenericRetrier(CUSTOM_RETRY_CONFIGURATION);

        try {
            defaultRetrier.execute(
                    request,
                    retryRequest -> {
                        final TokenRefreshRetrier tokenRefreshRetrier =
                                new TokenRefreshRetrier(mockProvider);
                        return tokenRefreshRetrier.execute(retryRequest, Supplier::get);
                    });
            fail("Should have thrown");
        } catch (BmcException e) {
            assertEquals(-1, e.getStatusCode());
        }
        // 2(Token retries) + 2(Custom retries)
        verify(request, times(4)).get();
    }

    /**
     * Ensures that setting the system property 'oci.javasdk.token.refresh.enabled' to false
     * disables the TokenRefreshRetrier from performing any additional retries after the initial
     * Processing exception.
     */
    @Test
    public void disabledTokenRefreshRetriesForProcessingException() {
        when(Options.isTokenRefreshRetrierEnabled()).thenReturn(false);
        final Supplier<String> request =
                setupMockRequest(-1, "Processing exception while communicating to");
        final InstancePrincipalsAuthenticationDetailsProvider mockProvider =
                mock(InstancePrincipalsAuthenticationDetailsProvider.class);
        final BmcGenericRetrier defaultRetrier = new BmcGenericRetrier(CUSTOM_RETRY_CONFIGURATION);

        try {
            defaultRetrier.execute(
                    request,
                    retryRequest -> {
                        final TokenRefreshRetrier tokenRefreshRetrier =
                                new TokenRefreshRetrier(mockProvider);
                        return tokenRefreshRetrier.execute(retryRequest, Supplier::get);
                    });
            fail("Should have thrown");
        } catch (BmcException e) {
            assertEquals(-1, e.getStatusCode());
        }
        verify(request, times(1)).get();
    }
}
