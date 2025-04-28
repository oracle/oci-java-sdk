/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.retrier;

import com.oracle.bmc.model.BmcException;
import jakarta.annotation.Nonnull;

/** Interface that defines the condition for which a retry may be attempted. */
@FunctionalInterface
public interface RetryCondition {
    /**
     * Check if the operation should be retried.
     *
     * @param exception The exception from the previous unsuccessful operation.
     * @return {@code true} if the operation should be retried, else {@code false}.
     */
    boolean shouldBeRetried(@Nonnull final BmcException exception);
}
