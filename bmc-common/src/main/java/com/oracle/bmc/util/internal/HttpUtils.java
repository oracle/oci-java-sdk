/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util.internal;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Nonnull;

import com.oracle.bmc.http.internal.HttpDateUtils;
import com.oracle.bmc.http.internal.WrappedWebTarget;

/**
 * Utility functions related to HTTP calls.
 * <p>
 * Note, the overloading performed in this class is to allow for compile time validation
 * of the args passed in (vs. taking a generic Object and throwing an exception if the class
 * isn't supported at runtime).
 */
public enum HttpUtils {
    ; // prevent instantiation

    /**
     * Escape a URL path segment string.
     * @param pathSegment path segment to escape
     * @return escaped path segment
     */
    public static String urlPathSegmentEscape(String pathSegment) {
        try {
            String encoded = URLEncoder.encode(pathSegment, "UTF-8");
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < encoded.length()) {
                char ch = encoded.charAt(i);
                if (ch == '+') {
                    // .replaceAll("\\+", "%20")
                    sb.append("%20");
                    ++i;
                    continue;
                }

                if (ch == '%' && i + 2 < encoded.length()) {
                    char ch2 = encoded.charAt(i + 1);
                    char ch3 = encoded.charAt(i + 2);
                    if (ch2 == '2') {
                        switch (ch3) {
                            case '1':
                                // .replaceAll("%21", "!")
                                sb.append("!");
                                i += 3;
                                continue;
                            case '7':
                                // .replaceAll("%27", "'")
                                sb.append("'");
                                i += 3;
                                continue;
                            case '8':
                                // .replaceAll("%28", "(")
                                sb.append("(");
                                i += 3;
                                continue;
                            case '9':
                                // .replaceAll("%29", ")")
                                sb.append(")");
                                i += 3;
                                continue;
                            case 'B':
                                // .replaceAll("%2B", "+")
                                sb.append("+");
                                i += 3;
                                continue;
                        }
                    } else if (ch2 == '3' && ch3 == 'A') {
                        // .replaceAll("%3A", ":")
                        sb.append(":");
                        i += 3;
                        continue;
                    } else if (ch2 == '4' && ch3 == '0') {
                        // .replaceAll("%40", "@")
                        sb.append("@");
                        i += 3;
                        continue;
                    } else if (ch2 == '7' && ch3 == 'E') {
                        // .replaceAll("%7E", "~")
                        sb.append("~");
                        i += 3;
                        continue;
                    }
                }

                sb.append(ch);
                ++i;
            }
            return sb.toString();
        } catch (UnsupportedEncodingException uee) {
            throw new RuntimeException(uee);
        }
    }

    /**
     * Encodes a path segment.
     *
     * @param pathSegment The path segment to encode.
     * @return The encoded path segment.
     */
    public static String encodePathSegment(@Nonnull String pathSegment) {
        // empty path segments can change the request and are not allowed.
        // (whitespace-only path segments are OK as they'll get encoded)
        // ex: "GET /foo/{someFooId}" becomes "GET /foo/" if you have an empty
        // {someFooId} path segment, which makes it look like a "list foo"
        // request instead, which is not right.  swagger also requires all path
        // params be non-null/empty
        if (pathSegment.isEmpty()) {
            throw new IllegalArgumentException("Cannot provide empty path segment");
        }
        return urlPathSegmentEscape(pathSegment);
    }

    /**
     * Encodes a path segment.
     *
     * @param pathSegment The path segment to encode.
     * @return The encoded path segment.
     */
    public static String encodePathSegment(@Nonnull Number pathSegment) {
        return encodePathSegment(pathSegment.toString());
    }

    /**
     * Encodes a path segment.
     *
     * @param pathSegment The path segment to encode.
     * @return The encoded path segment.
     */
    public static String encodePathSegment(@Nonnull Boolean pathSegment) {
        return encodePathSegment(pathSegment.toString());
    }

    /**
     * Encodes a path segment.
     *
     * @param pathSegment The path segment to encode.
     * @return The encoded path segment.
     */
    public static String encodePathSegment(@Nonnull Character pathSegment) {
        return encodePathSegment(pathSegment.toString());
    }

    /**
     * Encodes a path segment.
     *
     * @param pathSegment The path segment to encode.
     * @return The encoded path segment.
     */
    public static String encodePathSegment(@Nonnull UUID pathSegment) {
        return encodePathSegment(pathSegment.toString());
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
            return urlPathSegmentEscape((String) queryParam);
        }
        return queryParam;
    }

    /**
     * Attempts to encode a query param if it is a {@link Map}. Each key is prefixed with the value passed as
     * {@code prefix}. If a value is a {@link Collection}, then the "{prefix}{key}={item}" output is repeated for each
     * item in the collection, where "{item}" is encoded using {@link HttpUtils#attemptEncodeQueryParam(Object)}.
     * If the value is not a collection, then the output is simply "{prefix}{key}={value}", where the value is again
     * encoded.
     * <p>
     * Note: this should be called much lower in the HTTP stack (currently being
     * called through the generated code), so it can encode the serialized values.
     *
     * @param target target instance
     * @param prefix prefix for each key
     * @param queryParam The map query parameter to encode.
     * @return a new target instance
     */
    public static WrappedWebTarget encodeMapQueryParam(
            WrappedWebTarget target, String prefix, Map<String, ?> queryParam) {
        if (prefix == null) {
            prefix = "";
        }
        if (queryParam != null) {
            for (Map.Entry<String, ?> e : queryParam.entrySet()) {
                target = encodeMapQueryParamValue(target, prefix + e.getKey(), e.getValue());
            }
        }
        return target;
    }

    /**
     * Attempts to encode a query parameter which is described by a list of values for that parameter and a
     * {@link com.oracle.bmc.util.internal.CollectionFormatType} which describes how the values should appear
     * in the query string (e.g. as multiple parameters, as a single parameter with a given delimiter).
     *
     * @param target target instance
     * @param queryParamName the name of the query parameter as it should appear in the query string
     * @param values the values for the query parameter. An empty or null list will result in no action being taken
     * on the target instance. Additionally, any null values inside the list will be ignored
     * @param collectionFormatType describes how entries should appear in the query string, for example as multiple
     * parameters with the name query string parameter name/key, or as a single parameter with its values separated
     * by a delimiter character (comma, space, tab or pipe)
     * @return a new target instance
     */
    public static <T> WrappedWebTarget encodeCollectionFormatQueryParam(
            WrappedWebTarget target,
            String queryParamName,
            List<T> values,
            CollectionFormatType collectionFormatType) {

        Validate.notBlank(queryParamName, "a non-blank queryParamName must be provided");

        if (values != null && !values.isEmpty()) {
            final List<Object> valuesToUse = new ArrayList<>();
            for (T v : values) {
                if (v == null) {
                    continue;
                }

                if (v instanceof Enum) {
                    final Object rawValue = ReflectionUtils.invokeGetter(v, "getValue");
                    if (rawValue != null) {
                        valuesToUse.add((String) rawValue);
                    } else {
                        throw new IllegalArgumentException(
                                String.format(
                                        "Could not get the correct value for enum %s",
                                        v.getClass().getCanonicalName()));
                    }
                } else {
                    valuesToUse.add(v);
                }
            }

            if (valuesToUse.isEmpty()) {
                return target;
            }

            if (collectionFormatType == CollectionFormatType.CommaSeparated) {
                target =
                        target.queryParam(
                                queryParamName,
                                attemptEncodeQueryParam(StringUtils.join(valuesToUse, ",")));
            } else if (collectionFormatType == CollectionFormatType.PipeSeparated) {
                target =
                        target.queryParam(
                                queryParamName,
                                attemptEncodeQueryParam(StringUtils.join(valuesToUse, "|")));
            } else if (collectionFormatType == CollectionFormatType.SpaceSeparated) {
                target =
                        target.queryParam(
                                queryParamName,
                                attemptEncodeQueryParam(StringUtils.join(valuesToUse, " ")));
            } else if (collectionFormatType == CollectionFormatType.TabSeparated) {
                target =
                        target.queryParam(
                                queryParamName,
                                attemptEncodeQueryParam(StringUtils.join(valuesToUse, "\t")));
            } else if (collectionFormatType == CollectionFormatType.Multi) {
                final Object[] encodedValuesToUse = new Object[valuesToUse.size()];
                for (int i = 0; i < valuesToUse.size(); i++) {
                    encodedValuesToUse[i] = attemptEncodeQueryParam(valuesToUse.get(i));
                }
                target = target.queryParam(queryParamName, encodedValuesToUse);
            } else {
                throw new IllegalArgumentException(
                        String.format("Unknown collection format type: %s", collectionFormatType));
            }
        }

        return target;
    }

    private static WrappedWebTarget encodeMapQueryParamValue(
            WrappedWebTarget target, String prefixedKey, Object value) {
        String name = attemptEncodeQueryParam(prefixedKey).toString();
        if (value instanceof Collection) {
            Collection<?> c = (Collection<?>) value;
            for (Object v : c) {
                target = target.queryParam(name, attemptEncodeQueryParam(v));
            }
        } else {
            target = target.queryParam(name, attemptEncodeQueryParam(value));
        }
        return target;
    }
}
