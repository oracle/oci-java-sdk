/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.signing;

import java.util.List;

import com.google.common.collect.ImmutableMap;
import com.oracle.bmc.InternalSdk;
import com.oracle.bmc.http.signing.internal.Constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

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
    /**
     * Modified strategy specific to Object Storage.
     */
    OBJECT_STORAGE(Constants.REQUIRED_OBJECTSTORAGE_SIGNING_HEADERS, true);

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
