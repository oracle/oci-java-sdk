/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.signing;

import com.oracle.bmc.InternalSdk;
import com.oracle.bmc.http.signing.internal.Constants;

import java.util.List;
import java.util.Map;

/**
 * Enum for the various signing strategies used by OCI.
 */
@InternalSdk
public enum SigningStrategy {
    /**
     * Standard signing strategy.
     */
    STANDARD(Constants.REQUIRED_SIGNING_HEADERS, Constants.OPTIONAL_SIGNING_HEADERS, false),

    @Deprecated
    /**
     * Modified strategy specific to Object Storage.
     * @deprecated use EXCLUDE_BODY instead; Object Storage has migrated to using STANDARD, with EXCLUDE_BODY as a per-operation override.  We therefore do not want to maintain a service-specific signing strategy.
     */
    OBJECT_STORAGE(
            Constants.REQUIRED_OBJECTSTORAGE_SIGNING_HEADERS,
            Constants.OPTIONAL_SIGNING_HEADERS,
            true),

    /**
     * A strategy that does not sign the body.
     */
    EXCLUDE_BODY(
            Constants.REQUIRED_EXCLUDE_BODY_SIGNING_HEADERS,
            Constants.OPTIONAL_SIGNING_HEADERS,
            true);

    /**
     * The Map of headers (by HTTP method) to sign.
     */
    private final Map<String, List<String>> headersToSign;

    /**
     * The Map of headers (by HTTP method) to sign, if they are set.
     */
    private final Map<String, List<String>> optionalHeadersToSign;

    /**
     * Flag to indicate whether a PUT requests require content-* headers
     * to be signed.
     */
    private final boolean skipContentHeadersForStreamingPutRequests;

    @java.beans.ConstructorProperties({
        "headersToSign",
        "optionalHeadersToSign",
        "skipContentHeadersForStreamingPutRequests"
    })
    SigningStrategy(
            final Map<String, List<String>> headersToSign,
            final Map<String, List<String>> optionalHeadersToSign,
            final boolean skipContentHeadersForStreamingPutRequests) {
        this.headersToSign = headersToSign;
        this.optionalHeadersToSign = optionalHeadersToSign;
        this.skipContentHeadersForStreamingPutRequests = skipContentHeadersForStreamingPutRequests;
    }

    /**
     * The Map of headers (by HTTP method) to sign.
     */
    public com.google.common /*Guava will be removed soon*/.collect.ImmutableMap<
                    String, List<String>>
            getHeadersToSign() {
        return com.google.common /*Guava will be removed soon*/.collect.ImmutableMap.copyOf(
                this.headersToSign);
    }

    /**
     * The Map of headers (by HTTP method) to sign, if they are set.
     */
    public com.google.common /*Guava will be removed soon*/.collect.ImmutableMap<
                    String, List<String>>
            getOptionalHeadersToSign() {
        return com.google.common /*Guava will be removed soon*/.collect.ImmutableMap.copyOf(
                this.optionalHeadersToSign);
    }

    /**
     * Flag to indicate whether a PUT requests require content-* headers
     * to be signed.
     */
    public boolean isSkipContentHeadersForStreamingPutRequests() {
        return this.skipContentHeadersForStreamingPutRequests;
    }
}
