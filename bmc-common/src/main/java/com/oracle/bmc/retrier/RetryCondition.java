/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.retrier;

import com.oracle.bmc.model.BmcException;
import lombok.NonNull;

/**
 * Interface that defines the condition for which a retry may be attempted.
 */
@FunctionalInterface
public interface RetryCondition {
    /**
     * Check if the operation should be retried.
     * @param exception The exception from the previous unsuccessful operation.
     * @return {@code true} if the operation should be retried, else {@code false}.
     */
    boolean shouldBeRetried(@NonNull final BmcException exception);
}
