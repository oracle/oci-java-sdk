/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.signing;

import java.net.URI;
import java.util.List;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/** Main entry point for signing a request */
public interface RequestSigner {

    /**
     * Sign a request.
     *
     * @param uri the request uri
     * @param httpMethod the request method
     * @param headers the request headers
     * @param body the request body (if this is a PUT or POST method)
     * @return a map that contains the signature <code>Authorization</code> header, and any headers
     *     that were signed when generating the signature. You MUST include the exact values of the
     *     returned headers when making requests.
     */
    @Nonnull
    Map<String, String> signRequest(
            @Nonnull URI uri,
            @Nonnull String httpMethod,
            @Nonnull Map<String, List<String>> headers,
            @Nullable Object body);
}
