/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.InternalSdk;
import com.oracle.bmc.model.Range;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;

/** Utilities to deal with header values. */
public class HeaderUtils {
    public static final String REDACTED_VALUE = "REDACTED";

    /** Exact header names that are well-known credential carriers. */
    private static final Set<String> SENSITIVE_HEADERS =
            Collections.unmodifiableSet(
                    new HashSet<>(
                            Arrays.asList(
                                    "authorization",
                                    "proxy-authorization",
                                    "opc-obo-token",
                                    "x-api-key",
                                    "cookie",
                                    "set-cookie",
                                    "security-context",
                                    "password",
                                    "passphrase")));

    private static final String HEADER_DELIMITER = "-";
    private static final String HEADER_NAME_DELIMITER_REGEX = "[-_]+";

    /** Pattern rules for wildcard-style header families and credential-like suffixes. */
    private static final List<Pattern> SENSITIVE_HEADER_PATTERNS =
            Collections.unmodifiableList(
                    Arrays.asList(
                            Pattern.compile("^x-token(?:-|$).*"),
                            Pattern.compile("^x-authorization(?:-|$).*"),
                            Pattern.compile("^x-key-.*"),
                            credentialSuffixPattern("access-token"),
                            credentialSuffixPattern("refresh-token"),
                            credentialSuffixPattern("id-token"),
                            credentialSuffixPattern("security-token"),
                            credentialSuffixPattern("session-token"),
                            credentialSuffixPattern("delegation-token"),
                            credentialSuffixPattern("client-secret"),
                            credentialSuffixPattern("private-key")));

    /**
     * Matches exact credential names and delimited suffixes, for example "access-token" and
     * "idcs-access-token", without matching unrelated names like "tokenization-status".
     *
     * @param normalizedCredentialName The normalized credential name.
     * @return The credential suffix pattern.
     */
    private static Pattern credentialSuffixPattern(String normalizedCredentialName) {
        return Pattern.compile("(?:^|.*-)" + Pattern.quote(normalizedCredentialName) + "$");
    }

    /**
     * See {@link <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.8">HTTP/1.1
     * documentation</a>}.
     */
    public static final String AUTHORIZATION_HEADER_NAME = "Authorization";

    /** A {@code String} constant representing "application/json"" media type. */
    public static final String MEDIA_TYPE_APPLICATION_JSON = "application/json";

    /**
     * Deserialize a header value to its desired type if possible.
     *
     * @param headerName The header name.
     * @param value The header value.
     * @param clazz The class to convert to.
     * @return A new class instance.
     */
    @SuppressWarnings("unchecked")
    @InternalSdk(backwardCompatibilityRequired = true)
    public static <T> T toValue(String headerName, String value, Class<T> clazz) {
        if (clazz == String.class) {
            return (T) value;
        }
        if (clazz == Integer.class) {
            return (T) Integer.valueOf(value);
        }
        if (clazz == Long.class) {
            return (T) Long.valueOf(value);
        }
        if (clazz == Float.class) {
            return (T) Float.valueOf(value);
        }
        if (clazz == Double.class) {
            return (T) Double.valueOf(value);
        }
        if (clazz == Boolean.class) {
            return (T) Boolean.valueOf(value);
        }
        if (clazz == Date.class) {
            return (T) HttpDateUtils.parse(headerName, value);
        }
        if (clazz == Range.class) {
            return (T) Range.parse(value);
        }
        if (clazz == BigDecimal.class) {
            return (T) new BigDecimal(value);
        }
        if (clazz.isEnum()) {
            try {
                return clazz.cast(
                        clazz.getDeclaredMethod("create", String.class).invoke(null, value));
            } catch (IllegalAccessException
                    | InvocationTargetException
                    | NoSuchMethodException
                    | IllegalArgumentException e) {
                throw new IllegalArgumentException(
                        "Could not create enum '" + clazz.getName() + "', value '" + value + "'",
                        e);
            }
        }
        throw new IllegalArgumentException("Unknown header type: " + clazz);
    }

    /**
     * Checks whether the given header name should be treated as sensitive.
     *
     * @param headerName The header name.
     * @return true if the header is sensitive, false otherwise.
     */
    public static boolean isSensitiveHeader(String headerName) {
        if (headerName == null) {
            return false;
        }
        String normalizedHeaderName = normalizeHeaderName(headerName);
        return isExactSensitiveHeader(normalizedHeaderName)
                || matchesSensitiveHeaderPattern(normalizedHeaderName);
    }

    /**
     * Normalizes common generated-name variants consistently, for example client_secret to
     * client-secret.
     *
     * @param headerName The header name.
     * @return The normalized header name.
     */
    private static String normalizeHeaderName(String headerName) {
        return headerName
                .toLowerCase(Locale.ROOT)
                .replaceAll(HEADER_NAME_DELIMITER_REGEX, HEADER_DELIMITER);
    }

    private static boolean isExactSensitiveHeader(String normalizedHeaderName) {
        return SENSITIVE_HEADERS.contains(normalizedHeaderName);
    }

    private static boolean matchesSensitiveHeaderPattern(String normalizedHeaderName) {
        for (Pattern pattern : SENSITIVE_HEADER_PATTERNS) {
            if (pattern.matcher(normalizedHeaderName).matches()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Redacts header values when the header name is sensitive.
     *
     * @param headerName The header name.
     * @param values The header values.
     * @return The redacted values if the header is sensitive, otherwise the original values.
     */
    public static List<String> sanitizeHeaderValues(String headerName, List<String> values) {
        if (!isSensitiveHeader(headerName) || values == null) {
            return values;
        }
        List<String> redactedValues = new ArrayList<>(values.size());
        for (int i = 0; i < values.size(); i++) {
            redactedValues.add(REDACTED_VALUE);
        }
        return redactedValues;
    }

    /**
     * Redacts sensitive header values in the given header map.
     *
     * @param headers The header map.
     * @return A sanitized header map, or null when the input is null.
     */
    public static Map<String, List<String>> sanitizeHeaders(Map<String, List<String>> headers) {
        if (headers == null) {
            return null;
        }
        Map<String, List<String>> sanitizedHeaders = new LinkedHashMap<>();
        for (Entry<String, List<String>> entry : headers.entrySet()) {
            sanitizedHeaders.put(
                    entry.getKey(), sanitizeHeaderValues(entry.getKey(), entry.getValue()));
        }
        return sanitizedHeaders;
    }
}
