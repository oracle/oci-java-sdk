/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.signing.internal;

import java.util.List;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

class Constants {

    // Headers
    static final String AUTHORIZATION_HEADER = "authorization";

    /**
     * Custom date to be used for request signing in ajax request
     *
     * @see <a href=
     *      "https://github.com/joyent/node-http-signature/issues/4">x-date</a>
     */
    static final String CUSTOM_DATE_HEADER = "x-date";

    // Signing
    static final String REQUEST_TARGET = "(request-target)";
    static final String DATE = "date";
    static final String CONTENT_LENGTH = "content-length";
    static final String CONTENT_TYPE = "content-type";
    static final String X_CONTENT_SHA256 = "x-content-sha256";
    static final String HOST = "host";

    static final String JSON_CONTENT_TYPE = "application/json";

    static final ImmutableList<String> GENERIC_HEADERS =
            ImmutableList.of(DATE, REQUEST_TARGET, HOST);
    static final ImmutableList<String> BODY_HEADERS =
            ImmutableList.of(CONTENT_LENGTH, CONTENT_TYPE, X_CONTENT_SHA256);
    static final ImmutableList<String> ALL_HEADERS =
            ImmutableList.<String>builder().addAll(GENERIC_HEADERS).addAll(BODY_HEADERS).build();

    static final ImmutableMap<String, List<String>> REQUIRED_SIGNING_HEADERS =
            ImmutableMap.<String, List<String>>builder()
                    .put("get", GENERIC_HEADERS)
                    .put("head", GENERIC_HEADERS)
                    .put("delete", GENERIC_HEADERS)
                    .put("put", ALL_HEADERS)
                    .put("post", ALL_HEADERS)
                    .put("options", ImmutableList.<String>of())
                    .build();

    static final ImmutableMap<String, List<String>> REQUIRED_OBJECTSTORAGE_SIGNING_HEADERS =
            ImmutableMap.<String, List<String>>builder()
                    .put("get", GENERIC_HEADERS)
                    .put("head", GENERIC_HEADERS)
                    .put("delete", GENERIC_HEADERS)
                    .put("put", GENERIC_HEADERS)
                    .put("post", GENERIC_HEADERS)
                    .put("options", ImmutableList.<String>of())
                    .build();

    static final String DATE_FORMAT = "EEE, dd MMM yyyy HH:mm:ss z";
}
