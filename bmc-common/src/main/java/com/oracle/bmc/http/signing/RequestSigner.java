/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.signing;

import java.net.URI;
import java.util.List;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Main entry point for signing a request
 */
public interface RequestSigner {

    /**
     * Sign a request.
     *
     * @param uri
     *            the request uri
     * @param httpMethod
     *            the request method
     * @param headers
     *            the request headers
     * @param body
     *            the request body (if this is a PUT or POST method)
     * @return a map that contains the signature <code>Authorization</code>
     *         header, and any headers that were signed when generating the
     *         signature. You MUST include the exact values of the returned
     *         headers when making requests.
     */
    @Nonnull
    Map<String, String> signRequest(
            @Nonnull URI uri,
            @Nonnull String httpMethod,
            @Nonnull Map<String, List<String>> headers,
            @Nullable Object body);
}
