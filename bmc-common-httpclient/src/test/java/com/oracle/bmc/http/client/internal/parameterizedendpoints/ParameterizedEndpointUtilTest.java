/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.internal.parameterizedendpoints;

import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParameterizedEndpointUtilTest {
    private static final Set<Character> ALLOWED_HOST_PARAMETER_CHARACTERS = allowedHostCharacters();

    @Test
    public void testIsEndpointParameterized() {
        assertTrue(
                ParameterizedEndpointUtil.INSTANCE.isEndpointParameterized(
                        "https://{service}namespace.example.com"));
        assertTrue(
                ParameterizedEndpointUtil.INSTANCE.isEndpointParameterized(
                        "https://{service+Dot}example.com"));
        assertFalse(
                ParameterizedEndpointUtil.INSTANCE.isEndpointParameterized("https://example.com"));
    }

    @Test
    public void testRemoveAllParametersFromEndpoint() {
        String endpoint = "https://{service}namespace.example.com";
        String expected = "https://namespace.example.com";
        assertEquals(
                expected,
                ParameterizedEndpointUtil.INSTANCE.removeAllParametersFromEndpoint(endpoint));

        endpoint = "https://{service+Dot}example.com";
        expected = "https://example.com";
        assertEquals(
                expected,
                ParameterizedEndpointUtil.INSTANCE.removeAllParametersFromEndpoint(endpoint));
    }

    @Test
    public void testGetEndpointWithPopulatedServiceParameters_NoParameters() {
        String endpoint = "https://example.com";
        Map<String, Object> requiredParametersMap = new HashMap<>();
        assertEquals(
                endpoint,
                ParameterizedEndpointUtil.INSTANCE.getEndpointWithPopulatedServiceParameters(
                        endpoint, requiredParametersMap, Collections.emptyMap()));
    }

    @Test
    public void testGetEndpointWithPopulatedServiceParameters_EmptyRequiredParametersMap() {
        String endpoint = "https://{service+Dot}example.com";
        Map<String, Object> requiredParametersMap = new HashMap<>();
        String expected = "https://example.com";
        assertEquals(
                expected,
                ParameterizedEndpointUtil.INSTANCE.getEndpointWithPopulatedServiceParameters(
                        endpoint, requiredParametersMap, Collections.emptyMap()));
    }

    @Test
    public void testGetEndpointWithPopulatedServiceParameters_ValidParameters() {
        String endpoint = "https://{namespace+Dot}{service}.example.com";
        Map<String, Object> requiredParametersMap = new HashMap<>();
        requiredParametersMap.put("service", "my-service");
        requiredParametersMap.put("namespace", "my-namespace");
        String expected = "https://my-namespace.my-service.example.com";
        assertEquals(
                expected,
                ParameterizedEndpointUtil.INSTANCE.getEndpointWithPopulatedServiceParameters(
                        endpoint, requiredParametersMap, Collections.emptyMap()));
    }

    @Test
    public void testGetEndpointWithPopulatedServiceParameters_ValidHostParameterCharacters() {
        assertHostParameterAccepted(
                "namespace_name", "https://namespace_name.objectstorage.example.com");
        assertHostParameterAccepted(
                "namespace-name", "https://namespace-name.objectstorage.example.com");
        assertHostParameterAccepted(
                "namespace.name", "https://namespace.name.objectstorage.example.com");
    }

    @Test
    public void testGetEndpointWithPopulatedServiceParameters_AllAsciiHostParameterCharacters() {
        for (char ch = 0; ch < 128; ch++) {
            if (isAllowedHostParameterCharacter(ch)) {
                assertHostParameterAccepted(
                        "namespace" + ch + "name",
                        "https://namespace" + ch + "name.objectstorage.example.com");
            } else {
                assertHostParameterRejected("namespace" + ch + "name", "ASCII " + (int) ch);
            }
        }
    }

    @Test
    public void testGetEndpointWithPopulatedServiceParameters_InvalidHostParameterCharacters() {
        assertHostParameterRejected("my-namespace/objectstorage");
        assertHostParameterRejected("my-namespace?query");
        assertHostParameterRejected("my-namespace#fragment");
        assertHostParameterRejected("user@my-namespace");
        assertHostParameterRejected("my-namespace:443");
        assertHostParameterRejected("my-namespace%2eexample");
        assertHostParameterRejected("my namespace");
        assertHostParameterRejected("");
        assertHostParameterRejected("-namespace");
        assertHostParameterRejected("namespace-");
        assertHostParameterRejected("namespace.-example");
    }

    @Test
    public void
            testGetEndpointWithPopulatedServiceParameters_RejectsUnsafeObjectStorageNamespace() {
        String endpoint =
                "https://{namespaceName+Dot}objectstorage.us-phoenix-1.oci.customer-oci.com";
        Map<String, Object> requiredParametersMap = new HashMap<>();
        requiredParametersMap.put("namespaceName", "namespace/objectstorage");

        try {
            ParameterizedEndpointUtil.INSTANCE.getEndpointWithPopulatedServiceParameters(
                    endpoint, requiredParametersMap, Collections.emptyMap());
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("namespaceName"));
            return;
        }
        throw new AssertionError("Expected unsafe Object Storage namespace to be rejected");
    }

    @Test
    public void testGetEndpointWithPopulatedServiceParameters_InvalidParameterType() {
        String endpoint = "https://{service+Dot}example.com";
        Map<String, Object> requiredParametersMap = new HashMap<>();
        requiredParametersMap.put("service", 123); // not a string
        String expected = "https://example.com";
        assertEquals(
                expected,
                ParameterizedEndpointUtil.INSTANCE.getEndpointWithPopulatedServiceParameters(
                        endpoint, requiredParametersMap, Collections.emptyMap()));
    }

    @Test
    public void testGetEndpointWithPopulatedServiceParameters_MissingParameter() {
        String endpoint = "https://{namespace+Dot}{service}.example.com";
        Map<String, Object> requiredParametersMap = new HashMap<>();
        requiredParametersMap.put("service", "my-service");
        String expected = "https://my-service.example.com";
        assertEquals(
                expected,
                ParameterizedEndpointUtil.INSTANCE.getEndpointWithPopulatedServiceParameters(
                        endpoint, requiredParametersMap, Collections.emptyMap()));
    }

    private static final String ENDPOINT_WITH_INVALID_OPTION =
            "https://testservice.{dualStack ? ds. : }region.oci.secondLevelDomain.com";
    private static final String ENDPOINT_WITH_DUAL_STACK_OPTION =
            "https://testservice.{"
                    + ParameterizedEndpointUtil.DUAL_STACK_OPTION
                    + "?ds.:}region.oci.secondLevelDomain.com";

    @Test
    public void testGetEndpointWithPopulatedServiceParameters_InvalidOption() {
        Map<String, Object> requiredParametersMap = Collections.emptyMap();
        Map<String, Boolean> optionsMap = new HashMap<>();
        optionsMap.put(ParameterizedEndpointUtil.DUAL_STACK_OPTION, true);

        assertEquals(
                "https://testservice.region.oci.secondLevelDomain.com",
                ParameterizedEndpointUtil.INSTANCE.getEndpointWithPopulatedServiceParameters(
                        ENDPOINT_WITH_INVALID_OPTION, requiredParametersMap, optionsMap));

        optionsMap.put(ParameterizedEndpointUtil.DUAL_STACK_OPTION, false);
        assertEquals(
                "https://testservice.region.oci.secondLevelDomain.com",
                ParameterizedEndpointUtil.INSTANCE.getEndpointWithPopulatedServiceParameters(
                        ENDPOINT_WITH_INVALID_OPTION, requiredParametersMap, optionsMap));
    }

    @Test
    public void testGetEndpointWithPopulatedServiceParameters_KnownOption() {
        Map<String, Object> requiredParametersMap = Collections.emptyMap();
        Map<String, Boolean> optionsMap = new HashMap<>();
        optionsMap.put(ParameterizedEndpointUtil.DUAL_STACK_OPTION, true);

        assertEquals(
                "https://testservice.ds.region.oci.secondLevelDomain.com",
                ParameterizedEndpointUtil.INSTANCE.getEndpointWithPopulatedServiceParameters(
                        ENDPOINT_WITH_DUAL_STACK_OPTION, requiredParametersMap, optionsMap));

        assertEquals(
                "https://testservice.ds.region.oci.secondLevelDomain.com",
                ParameterizedEndpointUtil.INSTANCE.getEndpointWithPopulatedServiceParameters(
                        "https://testservice.{dualStack?ds.:}region.{dualStack?oci.:}secondLevelDomain.com",
                        requiredParametersMap,
                        optionsMap));
        assertEquals(
                "https://testservice.ds.oci.region.secondLevelDomain.com",
                ParameterizedEndpointUtil.INSTANCE.getEndpointWithPopulatedServiceParameters(
                        "https://testservice.{dualStack?ds.oci.:}region.secondLevelDomain.com",
                        requiredParametersMap,
                        optionsMap));

        optionsMap.put(ParameterizedEndpointUtil.DUAL_STACK_OPTION, false);
        assertEquals(
                "https://testservice.region.oci.secondLevelDomain.com",
                ParameterizedEndpointUtil.INSTANCE.getEndpointWithPopulatedServiceParameters(
                        ENDPOINT_WITH_DUAL_STACK_OPTION, requiredParametersMap, optionsMap));
    }

    private void assertHostParameterRejected(String namespaceName) {
        assertHostParameterRejected(namespaceName, namespaceName);
    }

    private void assertHostParameterRejected(String namespaceName, String description) {
        String endpoint = "https://{namespaceName+Dot}objectstorage.example.com";
        Map<String, Object> requiredParametersMap = new HashMap<>();
        requiredParametersMap.put("namespaceName", namespaceName);
        try {
            ParameterizedEndpointUtil.INSTANCE.getEndpointWithPopulatedServiceParameters(
                    endpoint, requiredParametersMap, Collections.emptyMap());
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("namespaceName"));
            return;
        }
        throw new AssertionError("Expected host parameter to be rejected: " + description);
    }

    private void assertHostParameterAccepted(String namespaceName, String expectedEndpoint) {
        String endpoint = "https://{namespaceName+Dot}objectstorage.example.com";
        Map<String, Object> requiredParametersMap = new HashMap<>();
        requiredParametersMap.put("namespaceName", namespaceName);
        assertEquals(
                expectedEndpoint,
                ParameterizedEndpointUtil.INSTANCE.getEndpointWithPopulatedServiceParameters(
                        endpoint, requiredParametersMap, Collections.emptyMap()));
    }

    private boolean isAllowedHostParameterCharacter(char ch) {
        return ALLOWED_HOST_PARAMETER_CHARACTERS.contains(ch);
    }

    private static Set<Character> allowedHostCharacters() {
        Set<Character> allowedCharacters = new HashSet<>();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            allowedCharacters.add(ch);
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            allowedCharacters.add(ch);
        }
        for (char ch = '0'; ch <= '9'; ch++) {
            allowedCharacters.add(ch);
        }
        allowedCharacters.add('_');
        allowedCharacters.add('-');
        allowedCharacters.add('.');
        return Collections.unmodifiableSet(allowedCharacters);
    }
}
