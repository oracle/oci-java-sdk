/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class HeaderUtilsTest {

    @Test
    public void isSensitiveHeader_shouldMatchExactHeadersAndPatterns() {
        for (String headerName :
                Arrays.asList(
                        "Authorization",
                        "Proxy-Authorization",
                        "opc-obo-token",
                        "X-Api-Key",
                        "cookie",
                        "set-cookie",
                        "security-context",
                        "password",
                        "passphrase",
                        "x-token",
                        "x-token-value",
                        "x_authorization",
                        "x-key-id",
                        "access_token",
                        "idcs-access-token",
                        "refresh-token",
                        "id_token",
                        "security-token",
                        "session_token",
                        "delegation-token",
                        "oauth-client-secret",
                        "private_key")) {
            assertTrue(
                    headerName + " should be treated as sensitive",
                    HeaderUtils.isSensitiveHeader(headerName));
        }
    }

    @Test
    public void isSensitiveHeader_shouldNotMatchSafeNames() {
        for (String headerName :
                Arrays.asList(
                        "Content-Type",
                        "opc-request-id",
                        "opc-retry-token",
                        "tokenization-status",
                        "x-keyboard-layout",
                        "client-secret-version",
                        "private-key-format",
                        "x-authorized-by")) {
            assertFalse(
                    headerName + " should not be treated as sensitive",
                    HeaderUtils.isSensitiveHeader(headerName));
        }
    }

    @Test
    public void isSensitiveHeader_shouldHandleNullAndEmptyNames() {
        assertFalse(HeaderUtils.isSensitiveHeader(null));
        assertFalse(HeaderUtils.isSensitiveHeader(""));
    }

    @Test
    public void sanitizeHeaderValues_shouldRedactSensitiveValues() {
        List<String> redacted =
                HeaderUtils.sanitizeHeaderValues("Authorization", Arrays.asList("a", "b"));

        assertEquals(
                Arrays.asList(HeaderUtils.REDACTED_VALUE, HeaderUtils.REDACTED_VALUE), redacted);
    }

    @Test
    public void sanitizeHeaderValues_shouldReturnOriginalValuesForSafeOrNullInput() {
        List<String> values = Collections.singletonList("application/json");

        assertSame(values, HeaderUtils.sanitizeHeaderValues("Content-Type", values));
        assertNull(HeaderUtils.sanitizeHeaderValues("Authorization", null));
    }

    @Test
    public void sanitizeHeaders_shouldRedactSensitiveValuesAndPreserveOrder() {
        Map<String, List<String>> headers = new LinkedHashMap<>();
        headers.put("Authorization", Collections.singletonList("secret"));
        headers.put("Content-Type", Collections.singletonList("application/json"));
        headers.put("x-key-id", Arrays.asList("key-1", "key-2"));

        Map<String, List<String>> sanitizedHeaders = HeaderUtils.sanitizeHeaders(headers);

        assertEquals(
                Arrays.asList("Authorization", "Content-Type", "x-key-id"),
                new ArrayList<>(sanitizedHeaders.keySet()));
        assertEquals(
                Collections.singletonList(HeaderUtils.REDACTED_VALUE),
                sanitizedHeaders.get("Authorization"));
        assertEquals(
                Collections.singletonList("application/json"),
                sanitizedHeaders.get("Content-Type"));
        assertEquals(
                Arrays.asList(HeaderUtils.REDACTED_VALUE, HeaderUtils.REDACTED_VALUE),
                sanitizedHeaders.get("x-key-id"));
    }

    @Test
    public void sanitizeHeaders_shouldHandleNullInput() {
        assertNull(HeaderUtils.sanitizeHeaders(null));
    }
}
