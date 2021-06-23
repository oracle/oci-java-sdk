/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.retrier;

import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.waiter.FixedTimeDelayStrategy;
import com.oracle.bmc.waiter.MaxAttemptsTerminationStrategy;
import org.junit.Test;

import java.util.function.Supplier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class BmcGenericRetrierTest {

    private static final RetryConfiguration CUSTOM_RETRY_CONFIGURATION =
            RetryConfiguration.builder()
                    .terminationStrategy(new MaxAttemptsTerminationStrategy(2))
                    .delayStrategy(new FixedTimeDelayStrategy(0L))
                    .build();

    private Supplier<String> setupMockRequest(int httpStatusCode, final String serviceCode) {
        // First invocation throws exception
        // Second invocation returns success
        final Supplier<String> request = mock(Supplier.class);
        doThrow(new BmcException(httpStatusCode, serviceCode, "bar", "baz"))
                .doReturn("success")
                .when(request)
                .get();
        return request;
    }

    @Test
    public void defaultRetrierFailure() {
        final Supplier<String> request = setupMockRequest(500, "InternalServerError");

        final BmcGenericRetrier defaultRetrier =
                new BmcGenericRetrier(RetryConfiguration.NO_RETRY_CONFIGURATION);
        try {
            defaultRetrier.execute(request, Supplier::get);
            fail("Should have thrown");
        } catch (BmcException e) {
            assertEquals(500, e.getStatusCode());
        }

        verify(request, times(1)).get();
    }

    @Test
    public void defaultRetrierSuccess() {
        final Supplier<String> request = mock(Supplier.class);
        doReturn("success").when(request).get();

        final BmcGenericRetrier defaultRetrier =
                new BmcGenericRetrier(RetryConfiguration.NO_RETRY_CONFIGURATION);
        defaultRetrier.execute(request, Supplier::get);

        verify(request, times(1)).get();
    }

    @Test
    public void retryForInternalServerError() {
        final Supplier<String> request = setupMockRequest(500, "InternalServerError");
        final BmcGenericRetrier retrier = new BmcGenericRetrier(CUSTOM_RETRY_CONFIGURATION);
        retrier.execute(request, Supplier::get);

        verify(request, times(2)).get();
    }

    @Test
    public void retryForProcessingException() {
        final Supplier<String> request =
                setupMockRequest(-1, "Processing Exception while communicating to");
        final BmcGenericRetrier retrier = new BmcGenericRetrier(CUSTOM_RETRY_CONFIGURATION);
        retrier.execute(request, Supplier::get);

        verify(request, times(2)).get();
    }

    @Test
    public void noRetryForInvalidParameter() {
        final Supplier<String> request = setupMockRequest(400, "InvalidParameter");
        final BmcGenericRetrier retrier = new BmcGenericRetrier(CUSTOM_RETRY_CONFIGURATION);
        try {
            retrier.execute(request, Supplier::get);
            fail("Should have thrown");
        } catch (BmcException e) {
            assertEquals(400, e.getStatusCode());
        }

        verify(request, times(1)).get();
    }

    @Test
    public void retryForIncorrectState() {
        final Supplier<String> request = setupMockRequest(409, "IncorrectState");
        final BmcGenericRetrier retrier = new BmcGenericRetrier(CUSTOM_RETRY_CONFIGURATION);
        retrier.execute(request, Supplier::get);

        verify(request, times(2)).get();
    }

    @Test
    public void noRetryForNotAuthorizedOrResourceAlreadyExists() {
        final Supplier<String> request =
                setupMockRequest(409, "NotAuthorizedOrResourceAlreadyExists");
        final BmcGenericRetrier retrier = new BmcGenericRetrier(CUSTOM_RETRY_CONFIGURATION);
        try {
            retrier.execute(request, Supplier::get);
            fail("Should have thrown");
        } catch (BmcException e) {
            assertEquals(409, e.getStatusCode());
        }

        verify(request, times(1)).get();
    }
}
