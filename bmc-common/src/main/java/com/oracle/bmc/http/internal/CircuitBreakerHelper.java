/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.InternalSdk;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.circuitbreaker.NoCircuitBreakerConfiguration;
import com.oracle.bmc.circuitbreaker.OciCircuitBreaker;
import com.oracle.bmc.circuitbreaker.internal.resilience4j.OciCircuitBreakerImpl;
import com.oracle.bmc.http.client.HttpClient;
import com.oracle.bmc.model.BmcException;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.function.Predicate;

@InternalSdk
public class CircuitBreakerHelper {
    private CircuitBreakerHelper() {
        // prevent instantiation
    }

    public static OciCircuitBreaker makeCircuitBreaker(
            HttpClient httpClient,
            @Nullable CircuitBreakerConfiguration circuitBreakerConfiguration) {
        Objects.requireNonNull(httpClient, "httpClient");
        if (circuitBreakerConfiguration == null
                || circuitBreakerConfiguration instanceof NoCircuitBreakerConfiguration) {
            return null;
        }
        Predicate<Throwable> recordExceptionPredicate =
                e -> {
                    if (e instanceof Exception
                            && circuitBreakerConfiguration.isRecordProcessingFailures()
                            && httpClient.isProcessingException((Exception) e)) {
                        return true;
                    }

                    if (!(e instanceof BmcException)) {
                        return false;
                    }
                    int statusCode = ((BmcException) e).getStatusCode();
                    if (statusCode == 409
                            && ((BmcException) e).getServiceCode().equals("IncorrectState")) {
                        return true;
                    }
                    if (circuitBreakerConfiguration.getRecordHttpStatuses().contains(statusCode)) {
                        return true;
                    }
                    return false;
                };

        return new OciCircuitBreakerImpl(circuitBreakerConfiguration, recordExceptionPredicate);
    }
}
