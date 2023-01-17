/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.http.signing.SigningStrategy;

import java.io.IOException;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.core.MultivaluedMap;

/**
 * Filter that injects authentication headers into the request.
 */
@Priority(Priorities.AUTHENTICATION)
public class AuthnClientFilter implements ClientRequestFilter {

    public static final String SIGNING_STRATEGY_PROPERTY_NAME =
            "x-obmcs-internal-signing-strategy-name";

    private final RequestSigner defaultRequestSigner;
    private final Map<SigningStrategy, RequestSigner> requestSigners;

    @java.beans.ConstructorProperties({"defaultRequestSigner", "requestSigners"})
    public AuthnClientFilter(
            final RequestSigner defaultRequestSigner,
            final Map<SigningStrategy, RequestSigner> requestSigners) {
        this.defaultRequestSigner = defaultRequestSigner;
        this.requestSigners = requestSigners;
    }

    @Override
    public void filter(@Nonnull ClientRequestContext clientRequestContext) throws IOException {
        if (clientRequestContext == null) {
            throw new java.lang.NullPointerException(
                    "clientRequestContext is marked non-null but is null");
        }
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
            if (!headers.containsKey(e.getKey())) {
                headers.putSingle(e.getKey(), e.getValue());
            }
        }
    }
}
