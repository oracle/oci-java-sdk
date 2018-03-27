/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;

public class RegionTest {
    @Test
    public void validRegion() {
        assertEquals(Region.US_PHOENIX_1, Region.fromRegionCodeOrId("phx"));

        assertEquals(Region.US_ASHBURN_1, Region.fromRegionCodeOrId("iad"));
        assertEquals(Region.EU_FRANKFURT_1, Region.fromRegionCodeOrId("fra"));
        assertEquals(Region.EU_FRANKFURT_1, Region.fromRegionCodeOrId("eu-frankfurt-1"));
        assertEquals(Region.UK_LONDON_1, Region.fromRegionCodeOrId("lhr"));
        assertEquals(Region.UK_LONDON_1, Region.fromRegionCodeOrId("uk-london-1"));
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
