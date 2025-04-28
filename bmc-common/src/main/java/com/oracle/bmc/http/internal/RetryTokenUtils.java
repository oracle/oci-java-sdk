/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.InternalSdk;
import com.oracle.bmc.http.client.HttpRequest;
import com.oracle.bmc.retrier.Retriers;

import java.util.UUID;

/** Utility class that adds the opc-retry-token header to the request */
public class RetryTokenUtils {
    @InternalSdk public static final String OPC_RETRY_TOKEN_HEADER = "opc-retry-token";

    private RetryTokenUtils() {}

    public static void addRetryToken(HttpRequest httpRequest) {

        if (!Retriers.shouldSendOpcRetryToken()) {
            return;
        }

        final boolean isOpcRetryTokenAlreadySet =
                httpRequest.headers().keySet().stream()
                        .anyMatch(
                                headerName -> headerName.equalsIgnoreCase(OPC_RETRY_TOKEN_HEADER));

        if (isOpcRetryTokenAlreadySet) {
            return;
        }

        httpRequest.header(OPC_RETRY_TOKEN_HEADER, generateRetryToken());
    }

    private static String generateRetryToken() {
        return UUID.randomUUID().toString();
    }
}
