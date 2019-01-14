/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc;

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
    public void regionalEndpoint_withRegionEnum_andRegionString_oc1() {
        String expectedEndpoint = "https://foobar.us-phoenix-1.oraclecloud.com";
        Region oc1Region = Region.US_PHOENIX_1;
        assertEquals(expectedEndpoint, Region.formatDefaultRegionEndpoint(TEST_SERVICE, oc1Region));
        assertEquals(
                expectedEndpoint,
                Region.formatDefaultRegionEndpoint(TEST_SERVICE, oc1Region.getRegionId()));
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
