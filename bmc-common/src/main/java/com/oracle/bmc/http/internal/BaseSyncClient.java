/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.common.ClientBuilderBase;
import com.oracle.bmc.common.InternalBuilderAccess;
import com.oracle.bmc.requests.BmcRequest;
import com.oracle.bmc.responses.BmcResponse;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.function.Supplier;

public class BaseSyncClient extends BaseClient {
    private final com.oracle.bmc.retrier.RetryConfiguration retryConfiguration;

    private static CircuitBreakerConfiguration circuitBreakerConfiguration(
            ClientBuilderBase<?, ?> builder, CircuitBreakerConfiguration defaultCircuitBreaker) {
        CircuitBreakerConfiguration circuitBreakerConfiguration =
                CircuitBreakerUtils.getUserDefinedCircuitBreakerConfiguration(
                        InternalBuilderAccess.getConfiguration(builder));
        if (circuitBreakerConfiguration == null) {
            return defaultCircuitBreaker;
        } else {
            return circuitBreakerConfiguration;
        }
    }

    protected BaseSyncClient(
            ClientBuilderBase<?, ?> builder,
            AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            CircuitBreakerConfiguration defaultCircuitBreaker) {
        super(
                builder,
                authenticationDetailsProvider,
                circuitBreakerConfiguration(builder, defaultCircuitBreaker));

        this.retryConfiguration = clientConfigurationToUse.getRetryConfiguration();
    }

    @Override
    protected <
                    REQ extends BmcRequest<?>,
                    RESP extends BmcResponse,
                    RESP_BUILDER extends BmcResponse.Builder<RESP>>
            ClientCall<REQ, RESP, RESP_BUILDER> clientCall(
                    REQ request, Supplier<RESP_BUILDER> responseBuilder) {
        return super.clientCall(request, responseBuilder).retryConfiguration(retryConfiguration);
    }
}
