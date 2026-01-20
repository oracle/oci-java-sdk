/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.internal.parameterizedendpoints;

import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParameterizedEndpointUtilTest {

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

        optionsMap.put(ParameterizedEndpointUtil.DUAL_STACK_OPTION, false);
        assertEquals(
                "https://testservice.region.oci.secondLevelDomain.com",
                ParameterizedEndpointUtil.INSTANCE.getEndpointWithPopulatedServiceParameters(
                        ENDPOINT_WITH_DUAL_STACK_OPTION, requiredParametersMap, optionsMap));
    }
}
