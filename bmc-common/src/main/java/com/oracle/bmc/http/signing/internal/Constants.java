/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.signing.internal;

import java.util.List;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

public class Constants {

    // Headers
    static final String AUTHORIZATION_HEADER = "authorization";

    // Signing
    static final String REQUEST_TARGET = "(request-target)";
    static final String DATE = "date";
    static final String CONTENT_LENGTH = "content-length";
    static final String CONTENT_TYPE = "content-type";
    static final String X_CONTENT_SHA256 = "x-content-sha256";
    public static final String HOST = "host";

    // Optional
    public static final String CROSS_TENANCY_REQUEST_HEADER_NAME = "x-cross-tenancy-request";
    static final String X_SUBSCRIPTION = "x-subscription";
    public static final String OPC_OBO_TOKEN = "opc-obo-token";

    static final String JSON_CONTENT_TYPE = "application/json";

    public static final ImmutableList<String> GENERIC_HEADERS =
            ImmutableList.of(DATE, REQUEST_TARGET, HOST);
    public static final ImmutableList<String> BODY_HEADERS =
            ImmutableList.of(CONTENT_LENGTH, CONTENT_TYPE, X_CONTENT_SHA256);
    public static final ImmutableList<String> ALL_HEADERS =
            ImmutableList.<String>builder().addAll(GENERIC_HEADERS).addAll(BODY_HEADERS).build();

    public static final ImmutableMap<String, List<String>> REQUIRED_SIGNING_HEADERS =
            createHeadersToSignMap(
                    GENERIC_HEADERS,
                    GENERIC_HEADERS,
                    GENERIC_HEADERS,
                    ALL_HEADERS,
                    ALL_HEADERS,
                    ALL_HEADERS);

    @Deprecated
    /**
     * A signing strategy that signs headers and body, except for PUT, where bodies are not signed
     * @deprecated use REQUIRED_EXCLUDE_BODY_SIGNING_HEADERS instead; Object Storage has migrated to using STANDARD, with EXCLUDE_BODY as a per-operation override.  We therefore do not want to maintain a service-specific signing strategy.
     */
    public static final ImmutableMap<String, List<String>> REQUIRED_OBJECTSTORAGE_SIGNING_HEADERS =
            createHeadersToSignMap(
                    GENERIC_HEADERS,
                    GENERIC_HEADERS,
                    GENERIC_HEADERS,
                    GENERIC_HEADERS, // PUT is special cased for object storage
                    ALL_HEADERS,
                    ALL_HEADERS);

    /**
     * A signing strategy that signs headers only.
     */
    public static final ImmutableMap<String, List<String>> REQUIRED_EXCLUDE_BODY_SIGNING_HEADERS =
            createHeadersToSignMap(
                    GENERIC_HEADERS,
                    GENERIC_HEADERS,
                    GENERIC_HEADERS,
                    GENERIC_HEADERS,
                    GENERIC_HEADERS,
                    GENERIC_HEADERS);

    /**
     * Headers included in the signature if they are set.
     */
    public static final ImmutableList<String> OPTIONAL_HEADERS_NAMES =
            ImmutableList.of(OPC_OBO_TOKEN, CROSS_TENANCY_REQUEST_HEADER_NAME, X_SUBSCRIPTION);

    public static final ImmutableMap<String, List<String>> OPTIONAL_SIGNING_HEADERS =
            createHeadersToSignMap(
                    OPTIONAL_HEADERS_NAMES,
                    OPTIONAL_HEADERS_NAMES,
                    OPTIONAL_HEADERS_NAMES,
                    OPTIONAL_HEADERS_NAMES,
                    OPTIONAL_HEADERS_NAMES,
                    OPTIONAL_HEADERS_NAMES);

    /**
     * Creates a map of headers to sign for each HTTP method.
     * @param getHeaders headers for GET requests
     * @param headHeaders headers for HEAD requests
     * @param deleteHeaders headers for DELETE requests
     * @param putHeaders headers for PUT requests
     * @param postHeaders headers for POST requests
     * @param patchHeaders headers for PATCH requests
     * @return A new immutable map of headers
     */
    public static ImmutableMap<String, List<String>> createHeadersToSignMap(
            List<String> getHeaders,
            List<String> headHeaders,
            List<String> deleteHeaders,
            List<String> putHeaders,
            List<String> postHeaders,
            List<String> patchHeaders) {
        return ImmutableMap.<String, List<String>>builder()
                .put("get", getHeaders)
                .put("head", headHeaders)
                .put("delete", deleteHeaders)
                .put("put", putHeaders)
                .put("post", postHeaders)
                .put("patch", patchHeaders)
                .build();
    }

    static final String DATE_FORMAT = "EEE, dd MMM yyyy HH:mm:ss z";
}
