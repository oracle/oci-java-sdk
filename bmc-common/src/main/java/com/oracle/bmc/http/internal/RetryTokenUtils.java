/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import java.util.UUID;

/**
 * Utility class that adds the opc-retry-token header to the request
 */
public class RetryTokenUtils {
    private static final String OPC_RETRY_TOKEN_HEADER = "opc-retry-token";

    private RetryTokenUtils() {}

    public static void addRetryToken(WrappedInvocationBuilder ib) {

        boolean isOpcRetryTokenAlreadySet = ib.getHeaders().containsKey(OPC_RETRY_TOKEN_HEADER);

        if (isOpcRetryTokenAlreadySet) {
            return;
        }

        ib.header(OPC_RETRY_TOKEN_HEADER, generateRetryToken());
    }

    private static String generateRetryToken() {
        return UUID.randomUUID().toString();
    }
}
