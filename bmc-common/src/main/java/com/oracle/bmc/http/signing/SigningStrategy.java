/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.signing;

import com.google.common.collect.ImmutableMap;
import com.oracle.bmc.InternalSdk;
import com.oracle.bmc.http.signing.internal.Constants;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * Enum for the various signing strategies used by OCI.
 */
@InternalSdk
@RequiredArgsConstructor
@Getter
public enum SigningStrategy {
    /**
     * Standard signing strategy.
     */
    STANDARD(Constants.REQUIRED_SIGNING_HEADERS, false),

    @Deprecated
    /**
     * Modified strategy specific to Object Storage.
     * @deprecated use EXCLUDE_BODY instead; Object Storage has migrated to using STANDARD, with EXCLUDE_BODY as a per-operation override.  We therefore do not want to maintain a service-specific signing strategy.
     */
    OBJECT_STORAGE(Constants.REQUIRED_OBJECTSTORAGE_SIGNING_HEADERS, true),

    /**
     * A strategy that does not sign the body.
     */
    EXCLUDE_BODY(Constants.REQUIRED_EXCLUDE_BODY_SIGNING_HEADERS, true);

    /**
     * The Map of headers (by HTTP method) to sign.
     */
    private final ImmutableMap<String, List<String>> headersToSign;
    /**
     * Flag to indicate whether a PUT requests require content-* headers
     * to be signed.
     */
    private final boolean skipContentHeadersForStreamingPutRequests;
}
