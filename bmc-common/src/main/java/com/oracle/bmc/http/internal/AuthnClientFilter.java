/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

import java.io.IOException;
import java.util.Map;

import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;

import com.oracle.bmc.http.signing.RequestSigner;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Filter that injects authentication headers into the request.
 */
@Priority(Priorities.AUTHENTICATION)
@RequiredArgsConstructor
public class AuthnClientFilter implements ClientRequestFilter {
    private final RequestSigner requestSigner;

    @Override
    public void filter(@NonNull ClientRequestContext clientRequestContext) throws IOException {
        Map<String, String> authHeaders =
                requestSigner.signRequest(
                        clientRequestContext.getUri(),
                        clientRequestContext.getMethod(),
                        clientRequestContext.getStringHeaders(),
                        clientRequestContext.getEntity());

        for (Map.Entry<String, String> e : authHeaders.entrySet()) {
            clientRequestContext.getHeaders().putSingle(e.getKey(), e.getValue());
        }
    }
}
