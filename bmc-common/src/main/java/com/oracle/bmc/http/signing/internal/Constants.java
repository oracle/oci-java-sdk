/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.signing.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.oracle.bmc.InternalSdk;

public class Constants {

    // Headers
    static final String AUTHORIZATION_HEADER = "authorization";

    // Signing
    static final String REQUEST_TARGET = "(request-target)";
    static final String DATE = "date";
    static final String CONTENT_LENGTH = "content-length";
    static final String CONTENT_TYPE = "content-type";
    static final String X_CONTENT_SHA256 = "x-content-sha256";

    @InternalSdk(backwardCompatibilityRequired = true)
    public static final String HOST = "host";

    // Optional
    public static final String CROSS_TENANCY_REQUEST_HEADER_NAME = "x-cross-tenancy-request";
    static final String X_SUBSCRIPTION = "x-subscription";
    public static final String OPC_OBO_TOKEN = "opc-obo-token";

    static final String JSON_CONTENT_TYPE = "application/json";

    @InternalSdk(backwardCompatibilityRequired = true)
    public static final List<String> GENERIC_HEADERS_LIST =
            Collections.unmodifiableList(Arrays.asList(DATE, REQUEST_TARGET, HOST));

    /**
     * This field will be removed soon, when Guava is removed as a dependency.
     * @deprecated Use GENERIC_HEADERS_LIST instead
     */
    @Deprecated
    @InternalSdk(backwardCompatibilityRequired = true)
    public static final com.google.common /*Guava will be removed soon*/.collect.ImmutableList<
                    String>
            GENERIC_HEADERS =
                    com.google.common /*Guava will be removed soon*/.collect.ImmutableList.copyOf(
                            GENERIC_HEADERS_LIST);

    public static final List<String> BODY_HEADERS_LIST =
            Collections.unmodifiableList(
                    Arrays.asList(CONTENT_LENGTH, CONTENT_TYPE, X_CONTENT_SHA256));

    /**
     * This field will be removed soon, when Guava is removed as a dependency.
     * @deprecated use BODY_HEADERS_LIST instead
     */
    @Deprecated
    public static final com.google.common /*Guava will be removed soon*/.collect.ImmutableList<
                    String>
            BODY_HEADERS =
                    com.google.common /*Guava will be removed soon*/.collect.ImmutableList.copyOf(
                            BODY_HEADERS_LIST);

    public static final List<String> ALL_HEADERS_LIST;

    static {
        List<String> tempAllHeaders = new ArrayList<>(GENERIC_HEADERS_LIST);
        tempAllHeaders.addAll(BODY_HEADERS_LIST);
        ALL_HEADERS_LIST = Collections.unmodifiableList(tempAllHeaders);
    }

    /**
     * This field will be removed soon, when Guava is removed as a dependency.
     * @deprecated use ALL_HEADERS_LIST instead
     */
    @Deprecated
    public static final com.google.common /*Guava will be removed soon*/.collect.ImmutableList<
                    String>
            ALL_HEADERS =
                    com.google.common /*Guava will be removed soon*/.collect.ImmutableList.copyOf(
                            ALL_HEADERS_LIST);

    public static final Map<String, List<String>> REQUIRED_SIGNING_HEADERS_MAP =
            createHeadersToSignForVerbMap(
                    GENERIC_HEADERS_LIST,
                    GENERIC_HEADERS_LIST,
                    GENERIC_HEADERS_LIST,
                    ALL_HEADERS_LIST,
                    ALL_HEADERS_LIST,
                    ALL_HEADERS_LIST);

    /**
     * This field will be removed soon, when Guava is removed as a dependency.
     * @deprecated use REQUIRED_SIGNING_HEADERS_MAP instead
     */
    @Deprecated
    public static final com.google.common /*Guava will be removed soon*/.collect.ImmutableMap<
                    String, List<String>>
            REQUIRED_SIGNING_HEADERS =
                    com.google.common /*Guava will be removed soon*/.collect.ImmutableMap.copyOf(
                            REQUIRED_SIGNING_HEADERS_MAP);

    /**
     * A signing strategy that signs headers and body, except for PUT, where bodies are not signed
     * @deprecated use REQUIRED_EXCLUDE_BODY_SIGNING_HEADERS_MAP instead; Object Storage has migrated to using STANDARD, with EXCLUDE_BODY as a per-operation override.  We therefore do not want to maintain a service-specific signing strategy.
     */
    @Deprecated
    public static final Map<String, List<String>> REQUIRED_OBJECTSTORAGE_SIGNING_HEADERS_MAP =
            createHeadersToSignForVerbMap(
                    GENERIC_HEADERS_LIST,
                    GENERIC_HEADERS_LIST,
                    GENERIC_HEADERS_LIST,
                    GENERIC_HEADERS_LIST, // PUT is special cased for object storage
                    ALL_HEADERS,
                    ALL_HEADERS);

    /**
     * This field will be removed soon, when Guava is removed as a dependency.
     * @deprecated use REQUIRED_EXCLUDE_BODY_SIGNING_HEADERS_MAP instead
     */
    @Deprecated
    public static final com.google.common /*Guava will be removed soon*/.collect.ImmutableMap<
                    String, List<String>>
            REQUIRED_OBJECTSTORAGE_SIGNING_HEADERS =
                    com.google.common /*Guava will be removed soon*/.collect.ImmutableMap.copyOf(
                            REQUIRED_OBJECTSTORAGE_SIGNING_HEADERS_MAP);

    /**
     * A signing strategy that signs headers only.
     */
    public static final Map<String, List<String>> REQUIRED_EXCLUDE_BODY_SIGNING_HEADERS_MAP =
            createHeadersToSignForVerbMap(
                    GENERIC_HEADERS_LIST,
                    GENERIC_HEADERS_LIST,
                    GENERIC_HEADERS_LIST,
                    GENERIC_HEADERS_LIST,
                    GENERIC_HEADERS_LIST,
                    GENERIC_HEADERS_LIST);

    /**
     * This field will be removed soon, when Guava is removed as a dependency.
     * @deprecated use REQUIRED_EXCLUDE_BODY_SIGNING_HEADERS_MAP instead
     */
    @Deprecated
    public static final com.google.common /*Guava will be removed soon*/.collect.ImmutableMap<
                    String, List<String>>
            REQUIRED_EXCLUDE_BODY_SIGNING_HEADERS =
                    com.google.common /*Guava will be removed soon*/.collect.ImmutableMap.copyOf(
                            REQUIRED_EXCLUDE_BODY_SIGNING_HEADERS_MAP);

    /**
     * Headers included in the signature if they are set.
     */
    public static final List<String> OPTIONAL_HEADERS_NAMES =
            Collections.unmodifiableList(
                    Arrays.asList(
                            OPC_OBO_TOKEN, CROSS_TENANCY_REQUEST_HEADER_NAME, X_SUBSCRIPTION));

    public static final Map<String, List<String>> OPTIONAL_SIGNING_HEADERS_MAP =
            createHeadersToSignForVerbMap(
                    OPTIONAL_HEADERS_NAMES,
                    OPTIONAL_HEADERS_NAMES,
                    OPTIONAL_HEADERS_NAMES,
                    OPTIONAL_HEADERS_NAMES,
                    OPTIONAL_HEADERS_NAMES,
                    OPTIONAL_HEADERS_NAMES);

    /**
     * This field will be removed soon, when Guava is removed as a dependency.
     * @deprecated use OPTIONAL_SIGNING_HEADERS_MAP instead
     */
    @Deprecated
    public static final com.google.common /*Guava will be removed soon*/.collect.ImmutableMap<
                    String, List<String>>
            OPTIONAL_SIGNING_HEADERS =
                    com.google.common /*Guava will be removed soon*/.collect.ImmutableMap.copyOf(
                            OPTIONAL_SIGNING_HEADERS_MAP);

    /**
     * Creates a map of headers to sign for each HTTP method.
     * @param getHeaders headers for GET requests
     * @param headHeaders headers for HEAD requests
     * @param deleteHeaders headers for DELETE requests
     * @param putHeaders headers for PUT requests
     * @param postHeaders headers for POST requests
     * @param patchHeaders headers for PATCH requests
     * @return A new immutable map of headers
     * @deprecated use createHeadersToSignForVerbMap instead
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    @Deprecated
    public static com.google.common /*Guava will be removed soon*/.collect.ImmutableMap<
                    String, List<String>>
            createHeadersToSignMap(
                    List<String> getHeaders,
                    List<String> headHeaders,
                    List<String> deleteHeaders,
                    List<String> putHeaders,
                    List<String> postHeaders,
                    List<String> patchHeaders) {
        return com.google.common /*Guava will be removed soon*/.collect.ImmutableMap.copyOf(
                createHeadersToSignForVerbMap(
                        getHeaders,
                        headHeaders,
                        deleteHeaders,
                        putHeaders,
                        postHeaders,
                        patchHeaders));
    }

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
    @InternalSdk(backwardCompatibilityRequired = true)
    public static Map<String, List<String>> createHeadersToSignForVerbMap(
            List<String> getHeaders,
            List<String> headHeaders,
            List<String> deleteHeaders,
            List<String> putHeaders,
            List<String> postHeaders,
            List<String> patchHeaders) {
        Map<String, List<String>> headers = new HashMap<>();
        headers.put("get", getHeaders);
        headers.put("head", headHeaders);
        headers.put("delete", deleteHeaders);
        headers.put("put", putHeaders);
        headers.put("post", postHeaders);
        headers.put("patch", patchHeaders);
        return Collections.unmodifiableMap(headers);
    }

    static final String DATE_FORMAT = "EEE, dd MMM yyyy HH:mm:ss z";
}
