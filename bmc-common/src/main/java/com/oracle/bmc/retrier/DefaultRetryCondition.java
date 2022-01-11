/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.retrier;

import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.Multimap;
import com.oracle.bmc.circuitbreaker.CallNotAllowedException;
import com.oracle.bmc.model.BmcException;
import lombok.NonNull;

/**
 * Class that represents the conditions documented in
 * https://docs.cloud.oracle.com/iaas/Content/API/References/apierrors.htm for which the operation may be retried.
 */
public class DefaultRetryCondition implements RetryCondition {
    // List of retryable errors from https://docs.cloud.oracle.com/iaas/Content/API/References/apierrors.htm
    private static final Multimap<Integer, String> RETRYABLE_SERVICE_ERRORS =
            ImmutableSetMultimap.<Integer, String>builder().put(409, "IncorrectState").build();

    private static final String PROCESSING_EXCEPTION_MSG = ".*processing(\\s)+exception.*";

    @Override
    public boolean shouldBeRetried(@NonNull final BmcException exception) {
        return exception.isClientSide()
                || exception.isTimeout()
                || exception.getStatusCode() == 429
                || exception.getStatusCode() == 500
                || exception.getStatusCode() == 502
                || exception.getStatusCode() == 503
                || exception.getStatusCode() == 504
                || RETRYABLE_SERVICE_ERRORS.containsEntry(
                        exception.getStatusCode(), exception.getServiceCode())
                || isProcessingException(exception)
                || exception.getCause() instanceof CallNotAllowedException;
    }

    public static boolean isProcessingException(final BmcException exception) {
        return exception.getStatusCode() == -1
                && exception.getMessage().toLowerCase().matches(PROCESSING_EXCEPTION_MSG);
    }
}
