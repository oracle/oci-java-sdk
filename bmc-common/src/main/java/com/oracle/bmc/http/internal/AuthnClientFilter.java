/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

import java.io.IOException;
import java.util.Map;

import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;

import com.oracle.bmc.http.signing.RequestSigner;

import com.oracle.bmc.http.signing.SigningStrategy;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Filter that injects authentication headers into the request.
 */
@Priority(Priorities.AUTHENTICATION)
@RequiredArgsConstructor
public class AuthnClientFilter implements ClientRequestFilter {

    public static final String SIGNING_STRATEGY_PROPERTY_NAME =
            "x-obmcs-internal-signing-strategy-name";

    private final RequestSigner defaultRequestSigner;
    private final Map<SigningStrategy, RequestSigner> requestSigners;

    @Override
    public void filter(@NonNull ClientRequestContext clientRequestContext) throws IOException {
        RequestSigner chosenRequestSigner = this.defaultRequestSigner;

        SigningStrategy perOperationSigningStrategy =
                (SigningStrategy) clientRequestContext.getProperty(SIGNING_STRATEGY_PROPERTY_NAME);
        if (perOperationSigningStrategy != null
                && requestSigners.containsKey(perOperationSigningStrategy)) {
            chosenRequestSigner = requestSigners.get(perOperationSigningStrategy);
            // removing this property from the context, now that we have processed it
            clientRequestContext.setProperty(SIGNING_STRATEGY_PROPERTY_NAME, null);
        }

        Map<String, String> authHeaders =
                chosenRequestSigner.signRequest(
                        clientRequestContext.getUri(),
                        clientRequestContext.getMethod(),
                        clientRequestContext.getStringHeaders(),
                        clientRequestContext.getEntity());

        for (Map.Entry<String, String> e : authHeaders.entrySet()) {
            clientRequestContext.getHeaders().putSingle(e.getKey(), e.getValue());
        }
    }
}
