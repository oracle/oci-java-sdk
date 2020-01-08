/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.internal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DefaultEndpointConfigurationTest {

    @Test
    public void allVariables_allFilledIn() {
        String endpoint =
                DefaultEndpointConfiguration.builder(
                                "https://{serviceEndpointPrefix}.{region}.{secondLevelDomain}")
                        .secondLevelDomain("oraclecloud.com")
                        .serviceEndpointPrefix("objectstorage")
                        .regionId("us-phoenix-1")
                        .build();
        assertEquals("https://objectstorage.us-phoenix-1.oraclecloud.com", endpoint);
    }

    @Test
    public void allVariables_noneFilledIn() {
        String endpoint =
                DefaultEndpointConfiguration.builder(
                                "https://{serviceEndpointPrefix}.{region}.{secondLevelDomain}")
                        .build();
        assertEquals("https://{serviceEndpointPrefix}.{region}.{secondLevelDomain}", endpoint);
    }

    @Test
    public void someVariables_noSecondLevelDomain() {
        String endpoint =
                DefaultEndpointConfiguration.builder(
                                "https://{serviceEndpointPrefix}.{region}.oracle.com")
                        .secondLevelDomain("oraclecloud.com")
                        .serviceEndpointPrefix("objectstorage")
                        .regionId("us-phoenix-1")
                        .build();
        assertEquals("https://objectstorage.us-phoenix-1.oracle.com", endpoint);
    }

    @Test
    public void someVariables_noServiceName_noSecondLevelDomain() {
        String endpoint =
                DefaultEndpointConfiguration.builder("https://foobar.{region}.oci.oracle.com")
                        .secondLevelDomain("oraclecloud.com")
                        .serviceEndpointPrefix("objectstorage")
                        .regionId("us-phoenix-1")
                        .build();
        assertEquals("https://foobar.us-phoenix-1.oci.oracle.com", endpoint);
    }
}
