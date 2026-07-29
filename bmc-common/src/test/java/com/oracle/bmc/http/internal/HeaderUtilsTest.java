/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HeaderUtilsTest {

    @Test
    public void testSensitiveHeadersAreRedacted() {
        List<String> sensitiveHeaders =
                Arrays.asList(
                        "Authorization",
                        "Proxy-Authorization",
                        "opc-obo-token",
                        "security-context",
                        "delegation-token",
                        "idcs-access-token",
                        "X-Api-Key",
                        "X-Authorization-Token",
                        "x-token-custom",
                        "x-key-secret",
                        "client_secret",
                        "service_private_key",
                        "opc_delegation_token",
                        "private_key");

        for (String header : sensitiveHeaders) {
            Assert.assertEquals(
                    header,
                    Collections.singletonList(HeaderUtils.REDACTED_VALUE),
                    HeaderUtils.sanitizeHeaderValues(header, Collections.singletonList("secret")));
        }
    }

    @Test
    public void testSafeHeadersAreNotRedacted() {
        List<String> safeHeaders =
                Arrays.asList(
                        "date",
                        "opc-request-id",
                        "content-type",
                        "tokenization-status",
                        "x-key",
                        "x-keyring-name");

        for (String header : safeHeaders) {
            List<String> values = Collections.singletonList("safe-value");
            Assert.assertEquals(header, values, HeaderUtils.sanitizeHeaderValues(header, values));
        }
    }

    @Test
    public void testSanitizeHeadersRedactsValuesAndPreservesOrder() {
        Map<String, List<String>> headers = new LinkedHashMap<>();
        headers.put("date", Collections.singletonList("Fri, 15 May 2026 00:00:00 GMT"));
        headers.put("Authorization", Collections.singletonList("secret"));
        headers.put("tokenization-status", Collections.singletonList("complete"));

        Map<String, List<String>> result = HeaderUtils.sanitizeHeaders(headers);

        Assert.assertEquals(
                Arrays.asList("date", "Authorization", "tokenization-status"),
                Arrays.asList(result.keySet().toArray(new String[0])));
        Assert.assertEquals(
                Collections.singletonList(HeaderUtils.REDACTED_VALUE), result.get("Authorization"));
        Assert.assertEquals(
                Collections.singletonList("Fri, 15 May 2026 00:00:00 GMT"), result.get("date"));
        Assert.assertEquals(
                Collections.singletonList("complete"), result.get("tokenization-status"));
    }

    @Test
    public void testNullAndEmptyInputs() {
        List<String> values = Collections.singletonList("value");

        Assert.assertFalse(HeaderUtils.isSensitiveHeader(null));
        Assert.assertEquals(values, HeaderUtils.sanitizeHeaderValues(null, values));
        Assert.assertNull(HeaderUtils.sanitizeHeaderValues("Authorization", null));
        Assert.assertNull(HeaderUtils.sanitizeHeaders(null));
        Assert.assertTrue(HeaderUtils.sanitizeHeaders(Collections.emptyMap()).isEmpty());
    }

    @Test
    public void testMultipleSensitiveValuesAreAllRedacted() {
        List<String> result =
                HeaderUtils.sanitizeHeaderValues(
                        "Authorization", Arrays.asList("secret1", "secret2"));

        Assert.assertEquals(
                Arrays.asList(HeaderUtils.REDACTED_VALUE, HeaderUtils.REDACTED_VALUE), result);
    }
}
