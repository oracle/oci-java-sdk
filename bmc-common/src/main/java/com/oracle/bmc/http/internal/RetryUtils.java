/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.retrier.BmcGenericRetrier;
import com.oracle.bmc.waiter.MaxAttemptsTerminationStrategy;
import com.oracle.bmc.waiter.TerminationStrategy;
import lombok.NonNull;

public class RetryUtils {
    private static final String OPC_CLIENT_RETRIES_HEADER = "opc-client-retries";

    /**
     * Sets the opc-client-retries header based on the retrier passed.
     * Service level retries will be disable if client level retries exist.
     * @param retrier used to determine if the SDK will send the opc-client-retries header as {@code true} or {@code false}.
     */
    public static void setClientRetriesHeader(
            @NonNull WrappedInvocationBuilder ib, @NonNull BmcGenericRetrier retrier) {
        if (ib.getHeaders() != null
                && ib.getHeaders().getFirst(OPC_CLIENT_RETRIES_HEADER) != null) {
            // OPC_CLIENT_RETRIES_HEADER is already set.
            return;
        }

        TerminationStrategy terminationStrategy =
                retrier.getWaiter().getWaiterConfiguration().getTerminationStrategy();
        boolean sendOpcClientRetries = false;

        if (terminationStrategy instanceof MaxAttemptsTerminationStrategy
                && ((MaxAttemptsTerminationStrategy) terminationStrategy).getMaxAttempts() > 1) {
            sendOpcClientRetries = true;
        }

        ib.header(OPC_CLIENT_RETRIES_HEADER, sendOpcClientRetries);
    }
}
