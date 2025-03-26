/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.retrier;

import com.oracle.bmc.circuitbreaker.CallNotAllowedException;
import com.oracle.bmc.model.BmcException;

import javax.annotation.Nonnull;

/**
 * Class that may retry for the conditions documented in
 * https://docs.oracle.com/iaas/Content/API/References/apierrors.htm and when the CircuitBreaker is OPEN.
 */
public class RetryOnOpenCircuitBreakerDefaultRetryCondition extends DefaultRetryCondition {

    @Override
    public boolean shouldBeRetried(@Nonnull final BmcException exception) {
        if (exception == null) {
            throw new NullPointerException("exception is marked non-null but is null");
        }
        return super.shouldBeRetried(exception)
                || exception.getCause() instanceof CallNotAllowedException;
    }
}
