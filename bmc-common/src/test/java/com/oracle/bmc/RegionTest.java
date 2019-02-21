/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc;

import com.google.common.base.Optional;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertFalse;

import java.util.HashSet;
import java.util.Set;

public class RegionTest {

    private static final Service TEST_SERVICE =
            Services.serviceBuilder()
                    .serviceEndpointPrefix("foobar")
                    .serviceName("RegionTest")
                    .build();

    @Test
    public void validRegion() {
        for (Region region : Region.values()) {
            assertEquals(region, Region.fromRegionId(region.getRegionId()));
            assertEquals(region, Region.fromRegionCode(region.getRegionCode()));
            assertEquals(region, Region.fromRegionCodeOrId(region.getRegionId()));
            assertEquals(region, Region.fromRegionCodeOrId(region.getRegionCode()));
        }
    }

    @Test
    public void regionalEndpoint_withOc1RegionEnumAndId_endpointsShouldBeEqual() {
        final String expectedEndpoint = "https://foobar.us-phoenix-1.oraclecloud.com";
        final Region oc1Region = Region.US_PHOENIX_1;
        assertEquals(expectedEndpoint, Region.formatDefaultRegionEndpoint(TEST_SERVICE, oc1Region));
        assertEquals(
                expectedEndpoint,
                Region.formatDefaultRegionEndpoint(TEST_SERVICE, oc1Region.getRegionId()));
    }

    @Test
    public void regionalEndpoint_withOc2RegionEnumId_endpointsShouldBeEqual() {
        final String expectedEndpoint = "https://foobar.us-luke-1.oraclegovcloud.com";
        final Region oc2Region = Region.US_LUKE_1;
        assertEquals(
                "Endpoint from OC2 Region enum should be equal",
                expectedEndpoint,
                Region.formatDefaultRegionEndpoint(TEST_SERVICE, oc2Region));
        assertEquals(
                "Endpoint from OC2 Region ID should be equal",
                expectedEndpoint,
                Region.formatDefaultRegionEndpoint(TEST_SERVICE, oc2Region.getRegionId()));
    }

    @Test
    public void regionalEndpoint_withOc3RegionEnumAndId_endpointsShouldBeEqual() {
        final String expectedEndpoint = "https://foobar.us-gov-chicago-1.oraclegovcloud.com";
        final Region oc3Region = Region.US_GOV_CHICAGO_1;
        assertEquals(
                "Endpoint from OC3 Region enum should be equal",
                expectedEndpoint,
                Region.formatDefaultRegionEndpoint(TEST_SERVICE, oc3Region));
        assertEquals(
                "Endpoint from OC3 Region ID should be equal",
                expectedEndpoint,
                Region.formatDefaultRegionEndpoint(TEST_SERVICE, oc3Region.getRegionId()));
    }

    @Test
    public void regionalEndpoint_withTorontoRegionEnum_andRegionString() {
        final String expectedEndpoint = "https://foobar.ca-toronto-1.oraclecloud.com";
        final Region region = Region.CA_TORONTO_1;
        final Optional<String> actualEndpoint = region.getEndpoint(TEST_SERVICE);
        assertTrue(actualEndpoint.isPresent());
        assertEquals(expectedEndpoint, actualEndpoint.get());
        assertEquals(
                expectedEndpoint,
                Region.formatDefaultRegionEndpoint(TEST_SERVICE, region.getRegionId()));
    }

    @Test
    public void regionalEndpoint_withUnknownRegionString_defaultsToOc1() {
        assertEquals(
                "https://foobar.us-foobar-1.oraclecloud.com",
                Region.formatDefaultRegionEndpoint(TEST_SERVICE, "us-foobar-1"));
    }

    @Test
    public void noDuplicateRegionId() {
        Set<String> regionIds = new HashSet<>();
        for (Region region : Region.values()) {
            assertFalse(regionIds.contains(region.getRegionId()));
            regionIds.add(region.getRegionId());
        }
    }

    @Test
    public void noDuplicateRegionCode() {
        Set<String> regionCodes = new HashSet<>();
        for (Region region : Region.values()) {
            assertFalse(regionCodes.contains(region.getRegionCode()));
            regionCodes.add(region.getRegionCode());
        }
    }

    @Test
    public void invalidRegion() {
        try {
            assertNotNull(Region.fromRegionCodeOrId(("foo")));
            fail("should have thrown");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("foo"));
        }
    }
}
