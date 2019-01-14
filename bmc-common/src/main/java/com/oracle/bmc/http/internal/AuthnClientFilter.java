/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

import java.io.IOException;
import java.util.Map;

import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.core.MultivaluedMap;

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
            clientRequestContext.removeProperty(SIGNING_STRATEGY_PROPERTY_NAME);
        }

        MultivaluedMap<String, String> stringHeaders = clientRequestContext.getStringHeaders();
        Map<String, String> authHeaders =
                chosenRequestSigner.signRequest(
                        clientRequestContext.getUri(),
                        clientRequestContext.getMethod(),
                        stringHeaders,
                        clientRequestContext.getEntity());

        MultivaluedMap<String, Object> headers = clientRequestContext.getHeaders();
        for (Map.Entry<String, String> e : authHeaders.entrySet()) {
            if (!headers.keySet().contains(e.getKey())) {
                headers.putSingle(e.getKey(), e.getValue());
            }
        }
    }
}
