/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.http.client.HttpRequest;
import com.oracle.bmc.http.client.RequestInterceptor;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.http.signing.SigningStrategy;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/** Filter that injects authentication headers into the request. */
public class AuthnClientFilter implements RequestInterceptor {

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
    public void intercept(HttpRequest request) {
        RequestSigner chosenRequestSigner = this.defaultRequestSigner;

        SigningStrategy perOperationSigningStrategy =
                (SigningStrategy) request.attribute(SIGNING_STRATEGY_PROPERTY_NAME);
        if (perOperationSigningStrategy != null
                && requestSigners.containsKey(perOperationSigningStrategy)) {
            chosenRequestSigner = requestSigners.get(perOperationSigningStrategy);
            // removing this property from the context, now that we have processed it
            request.removeAttribute(SIGNING_STRATEGY_PROPERTY_NAME);
        }

        Map<String, List<String>> oldHeaders = request.headers();
        Map<String, String> authHeaders =
                chosenRequestSigner.signRequest(
                        request.uri(), request.method().name(), oldHeaders, request.body());

        Set<String> oldHeaderNamesLowerCase =
                oldHeaders.keySet().stream()
                        .map(s -> s.toLowerCase(Locale.ROOT))
                        .collect(Collectors.toSet());

        for (Map.Entry<String, String> e : authHeaders.entrySet()) {
            if (!oldHeaderNamesLowerCase.contains(e.getKey().toLowerCase(Locale.ROOT))) {
                request.header(e.getKey(), e.getValue());
            }
        }
    }
}
