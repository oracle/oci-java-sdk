/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
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

    static final String JSON_CONTENT_TYPE = "application/json";

    public static final ImmutableList<String> GENERIC_HEADERS =
            ImmutableList.of(DATE, REQUEST_TARGET, HOST);
    public static final ImmutableList<String> BODY_HEADERS =
            ImmutableList.of(CONTENT_LENGTH, CONTENT_TYPE, X_CONTENT_SHA256);
    public static final ImmutableList<String> ALL_HEADERS =
            ImmutableList.<String>builder().addAll(GENERIC_HEADERS).addAll(BODY_HEADERS).build();

    public static final ImmutableMap<String, List<String>> REQUIRED_SIGNING_HEADERS =
            createHeadersToSignMap(
                    GENERIC_HEADERS, GENERIC_HEADERS, GENERIC_HEADERS, ALL_HEADERS, ALL_HEADERS);

    public static final ImmutableMap<String, List<String>> REQUIRED_OBJECTSTORAGE_SIGNING_HEADERS =
            createHeadersToSignMap(
                    GENERIC_HEADERS,
                    GENERIC_HEADERS,
                    GENERIC_HEADERS,
                    GENERIC_HEADERS, // PUT is special cased for object storage
                    ALL_HEADERS);

    /**
     * Creates a map of headers to sign for each HTTP method.
     * @param getHeaders headers for GET requests
     * @param headHeaders headers for HEAD requests
     * @param deleteHeaders headers for DELETE requests
     * @param putHeaders headers for PUT requests
     * @param postHeaders headers for POST requests
     * @return A new immutable map of headers
     */
    public static ImmutableMap<String, List<String>> createHeadersToSignMap(
            List<String> getHeaders,
            List<String> headHeaders,
            List<String> deleteHeaders,
            List<String> putHeaders,
            List<String> postHeaders) {
        return ImmutableMap.<String, List<String>>builder()
                .put("get", getHeaders)
                .put("head", headHeaders)
                .put("delete", deleteHeaders)
                .put("put", putHeaders)
                .put("post", postHeaders)
                .build();
    }

    static final String DATE_FORMAT = "EEE, dd MMM yyyy HH:mm:ss z";
}
