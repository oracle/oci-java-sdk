/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.retrier;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.oracle.bmc.circuitbreaker.CallNotAllowedException;
import com.oracle.bmc.http.client.Options;
import com.oracle.bmc.model.BmcException;
import jakarta.annotation.Nonnull;

/**
 * Class that represents the conditions documented in
 * https://docs.oracle.com/iaas/Content/API/References/apierrors.htm for which the operation may be
 * retried.
 */
public class DefaultRetryCondition implements RetryCondition {
    // List of retryable errors from
    // https://docs.oracle.com/iaas/Content/API/References/apierrors.htm
    private static final Map<Integer, Set<String>> RETRYABLE_SERVICE_ERRORS;

    static {
        Map<Integer, Set<String>> temp = new HashMap<>();
        temp.put(409, Collections.unmodifiableSet(new HashSet<>(Arrays.asList("IncorrectState"))));
        RETRYABLE_SERVICE_ERRORS = Collections.unmodifiableMap(temp);
    }

    private static final String PROCESSING_EXCEPTION_MSG =
            "[.|\\s\\S]*processing(\\s)+exception[.|\\s\\S]*";

    /**
     * Check if the operation should be retried based on the given {@link BmcException}. The
     * operation will be retried if:
     *
     * <ul>
     *   <li>The exception is client-side and not caused by a {@link CallNotAllowedException}.
     *   <li>The exception is a timeout.
     *   <li>The HTTP status code is 429, 500, 502, 503, or 504.
     *   <li>The HTTP status code and service code are in the {@link #RETRYABLE_SERVICE_ERRORS} map.
     *   <li>The exception is a "processing exception" and token refresh retry is enabled.
     * </ul>
     *
     * @param exception The exception from the previous unsuccessful operation.
     * @return {@code true} if the operation should be retried, else {@code false}.
     */
    @Override
    public boolean shouldBeRetried(@Nonnull final BmcException exception) {
        if (exception == null) {
            throw new java.lang.NullPointerException("exception is marked non-null but is null");
        }
        return (exception.isClientSide()
                        && !(exception.getCause() instanceof CallNotAllowedException))
                || exception.isTimeout()
                || exception.getStatusCode() == 429
                || exception.getStatusCode() == 500
                || exception.getStatusCode() == 502
                || exception.getStatusCode() == 503
                || exception.getStatusCode() == 504
                || (RETRYABLE_SERVICE_ERRORS.containsKey(exception.getStatusCode())
                        && RETRYABLE_SERVICE_ERRORS
                                .get(exception.getStatusCode())
                                .contains(exception.getServiceCode()))
                || (Options.isTokenRefreshRetrierEnabled() && isProcessingException(exception));
    }

    public static boolean isProcessingException(final BmcException exception) {
        return exception.getStatusCode() == -1
                && exception.getMessage().toLowerCase().matches(PROCESSING_EXCEPTION_MSG);
    }
}
