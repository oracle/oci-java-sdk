/**
 * Copyright (c) 2016-2017 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.util.internal;

import static com.google.common.net.UrlEscapers.urlPathSegmentEscaper;

import java.util.Date;
import java.util.UUID;

import javax.annotation.Nonnull;

import com.oracle.bmc.http.internal.HttpDateUtils;

/**
 * Utility functions related to HTTP calls.
 * <p>
 * Note, the overloading performed in this class is to allow for compile time validation
 * of the args passed in (vs. taking a generic Object and throwing an exception if the class
 * isn't supported at runtime).
 */
public class HttpUtils {

    /**
     * Encodes a path segment.
     *
     * @param pathSegment The path segment to encode.
     * @return The encoded path segment.
     */
    public static String encodePathSegment(@Nonnull String pathSegment) {
        return urlPathSegmentEscaper().escape(pathSegment);
    }

    /**
     * Encodes a path segment.
     *
     * @param pathSegment The path segment to encode.
     * @return The encoded path segment.
     */
    public static String encodePathSegment(@Nonnull Number pathSegment) {
        return urlPathSegmentEscaper().escape(pathSegment.toString());
    }

    /**
     * Encodes a path segment.
     *
     * @param pathSegment The path segment to encode.
     * @return The encoded path segment.
     */
    public static String encodePathSegment(@Nonnull Boolean pathSegment) {
        return urlPathSegmentEscaper().escape(pathSegment.toString());
    }

    /**
     * Encodes a path segment.
     *
     * @param pathSegment The path segment to encode.
     * @return The encoded path segment.
     */
    public static String encodePathSegment(@Nonnull Character pathSegment) {
        return urlPathSegmentEscaper().escape(pathSegment.toString());
    }

    /**
     * Encodes a path segment.
     *
     * @param pathSegment The path segment to encode.
     * @return The encoded path segment.
     */
    public static String encodePathSegment(@Nonnull UUID pathSegment) {
        return urlPathSegmentEscaper().escape(pathSegment.toString());
    }

    /**
     * Attempts to encode a query param if it is a String.  This does not try
     * to encode non-String values as Jersey uses different serializers
     * for non-String values, so we can't assume what the string value would be.
     * <p>
     * Note: this should be called much lower in the HTTP stack (currently being
     * called through the generated code), so it can encode the serialized values.
     *
     * @param queryParam The query parameter to encode.
     * @return The encoded param, or the same value if it was not a String.
     */
    public static Object attemptEncodeQueryParam(Object queryParam) {
        if (queryParam instanceof Date) {
            return HttpDateUtils.format((Date) queryParam);
        }

        if (queryParam instanceof String) {
            // NOTE: DO NOT use UrlEscapers.urlFormParameterEscaper() here (which will
            // encode spaces to '+', as it does not play nicely with Jersey's "contextual"
            // encoding, in which it skips things (%xx) that look like they're encoded
            // but encodes the rest.  So, if we encode with 'urlFormParameterEscaper' here,
            // then it will encode a ' ' to '+', and then Jersey will turn that '+' into "%2B"
            return urlPathSegmentEscaper().escape((String) queryParam);
        }
        return queryParam;
    }
}
