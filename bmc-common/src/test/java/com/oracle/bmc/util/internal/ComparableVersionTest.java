/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util.internal;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.Assert.*;

public class ComparableVersionTest {
    // Tests for buildComparableVersion
    @Test
    public void testBuildComparableVersion_emptyVersion() {
        final String version = "";
        assertEquals(ComparableVersion.buildComparableVersion(version), Optional.empty());
    }

    @Test
    public void testBuildComparableVersion_nullVersion() {
        final String version = null;
        assertEquals(ComparableVersion.buildComparableVersion(version), Optional.empty());
    }

    @Test
    public void testBuildComparableVersion_nonNumericVersion() {
        final String version = "2.1.7a";
        assertTrue(ComparableVersion.buildComparableVersion(version).isPresent());
    }

    // Tests for parseVersion(..)/constructor of ComparableVersion method
    @Test
    public void testParseVersion_nonNumericVersionString() {
        String version = "1.a1.8";
        assertTrue(ComparableVersion.buildComparableVersion(version).isPresent());
    }

    @Test
    public void testParseVersion_emptyVersionString() {
        String version = "";
        assertThrows(IllegalArgumentException.class, () -> new ComparableVersion(version));
    }

    @Test
    public void testParseVersion_validVersionString_threeParts() {
        String version = "1.20.8";
        ComparableVersion testVerObj = new ComparableVersion(version);
        ArrayList<Integer> expected =
                new ArrayList<Integer>() {
                    {
                        add(1);
                        add(20);
                        add(8);
                    }
                };
        assertEquals(testVerObj.getItems(), expected);
    }

    @Test
    public void testParseVersion_validVersionString_onePart() {
        String version = "1";
        ComparableVersion testVerObj = new ComparableVersion(version);
        ArrayList<Integer> expected =
                new ArrayList<Integer>() {
                    {
                        add(1);
                    }
                };
        assertEquals(testVerObj.getItems(), expected);
    }
    // test for equals() method
    @Test
    public void testEquals_equal() {
        ComparableVersion v1 = new ComparableVersion("1.2.0");
        ComparableVersion v2 = new ComparableVersion("1.2.0");
        assertTrue(v1.equals(v2));
    }

    @Test
    public void testEquals_notEqual() {
        ComparableVersion v1 = new ComparableVersion("1.2.0");
        ComparableVersion v2 = new ComparableVersion("1.2.4");
        assertFalse(v1.equals(v2));
    }
    // Tests for compareTo(..) method
    @Test
    public void testCompare_versionIsLess_firstPart() {
        ComparableVersion v1 = new ComparableVersion("1.20.2");
        ComparableVersion v2 = new ComparableVersion("2.18.3");
        assertTrue(v1.compareTo(v2) < 0);
    }

    @Test
    public void testCompare_versionIsLes_secondPart() {
        ComparableVersion v1 = new ComparableVersion("1.18.2");
        ComparableVersion v2 = new ComparableVersion("1.20.3");
        assertTrue(v1.compareTo(v2) < 0);
    }

    @Test
    public void testCompare_versionIsLess_thirdPart() {
        ComparableVersion v1 = new ComparableVersion("2.20.0");
        ComparableVersion v2 = new ComparableVersion("2.20.2");
        assertTrue(v1.compareTo(v2) < 0);
    }

    @Test
    public void testCompare_versionIsGreater_firstPart() {
        ComparableVersion v1 = new ComparableVersion("1.20.2");
        ComparableVersion v2 = new ComparableVersion("0.20.2");
        assertTrue(v1.compareTo(v2) > 0);
    }

    @Test
    public void testCompare_versionIsGreater_secondPart() {
        ComparableVersion v1 = new ComparableVersion("1.24.2");
        ComparableVersion v2 = new ComparableVersion("1.20.2");
        assertTrue(v1.compareTo(v2) > 0);
    }

    @Test
    public void testCompare_versionIsGreater_thirdPart() {
        ComparableVersion v1 = new ComparableVersion("2.20.4");
        ComparableVersion v2 = new ComparableVersion("2.20.2");
        assertTrue(v1.compareTo(v2) > 0);
    }

    @Test
    public void testCompare_versionIsEqual_threePart() {
        ComparableVersion v1 = new ComparableVersion("2.20.2");
        ComparableVersion v2 = new ComparableVersion("2.20.2");
        assertTrue(v1.compareTo(v2) == 0);
    }

    @Test
    public void testCompare_versionIsEqual_OnePart() {
        ComparableVersion v1 = new ComparableVersion("2");
        ComparableVersion v2 = new ComparableVersion("2");
        assertTrue(v1.compareTo(v2) == 0);
    }

    @Test
    public void testCompare_versionIsEqual_twoPart() {
        ComparableVersion v1 = new ComparableVersion("2.50");
        ComparableVersion v2 = new ComparableVersion("2.50");
        assertTrue(v1.compareTo(v2) == 0);
    }

    @Test
    public void testCompare_versionIsEqual_threePart_preview() {
        ComparableVersion v1 = new ComparableVersion("2.20.2-preview1");
        ComparableVersion v2 = new ComparableVersion("2.20.2-preview1");
        assertTrue(v1.compareTo(v2) == 0);
    }

    @Test
    public void testCompare_versionIsEqual_threePart_snapshot() {
        ComparableVersion v1 = new ComparableVersion("2.20.2-SNAPSHOT");
        ComparableVersion v2 = new ComparableVersion("2.20.2-SNAPSHOT");
        assertTrue(v1.compareTo(v2) == 0);
    }

    @Test
    public void testCompare_versionIsEqual_threePart_previewSnapshot() {
        ComparableVersion v1 = new ComparableVersion("2.20.2-preview1-SNAPSHOT");
        ComparableVersion v2 = new ComparableVersion("2.20.2-preview1-SNAPSHOT");
        assertTrue(v1.compareTo(v2) == 0);
    }

    @Test
    public void testCompare_versionIsLess_lessParts() {
        ComparableVersion v1 = new ComparableVersion("2.50");
        ComparableVersion v2 = new ComparableVersion("2.50.5");
        assertTrue(v1.compareTo(v2) < 0);
    }

    @Test
    public void testCompare_versionIsGreater_lessParts() {
        ComparableVersion v1 = new ComparableVersion("2.50.5");
        ComparableVersion v2 = new ComparableVersion("2.50");
        assertTrue(v1.compareTo(v2) > 0);
    }

    @Test
    public void testCompare_versionIsEqual_lessParts() {
        ComparableVersion v1 = new ComparableVersion("2.50.0");
        ComparableVersion v2 = new ComparableVersion("2.50");
        assertEquals(0, v1.compareTo(v2));
    }

    @Test
    public void testCompare_versionIsEqual_lessPartsInThis() {
        ComparableVersion v1 = new ComparableVersion("2.50");
        ComparableVersion v2 = new ComparableVersion("2.50.0.0");
        assertEquals(0, v1.compareTo(v2));
    }

    @Test
    public void testCompare_snapshot_versionIsEqual_lessPartsInThis() {
        ComparableVersion v1 = new ComparableVersion("2.50-SNAPSHOT");
        ComparableVersion v2 = new ComparableVersion("2.50.0.0-SNAPSHOT");
        assertEquals(0, v1.compareTo(v2));
    }

    @Test
    public void testCompare_otherVersionIsNewer_equalButThisIsSnapshot() {
        ComparableVersion v1 = new ComparableVersion("2.50-SNAPSHOT");
        ComparableVersion v2 = new ComparableVersion("2.50.0.0");
        // snapshot comes before the release
        assertEquals(-1, v1.compareTo(v2));
    }

    @Test
    public void testCompare_thisVersionIsNewer_equalButOtherIsSnapshot() {
        ComparableVersion v1 = new ComparableVersion("2.50");
        ComparableVersion v2 = new ComparableVersion("2.50.0.0-SNAPSHOT");
        // release comes after the snapshot
        assertEquals(1, v1.compareTo(v2));
    }

    @Test
    public void testCompare_versionIsEqual_alpha() {
        ComparableVersion v1 = new ComparableVersion("2.50.ALPHA-3");
        ComparableVersion v2 = new ComparableVersion("2.50.ALPHA-3");
        assertEquals(0, v1.compareTo(v2));
    }

    @Test
    public void testCompare_thisVersionIsNewer_alpha() {
        ComparableVersion v1 = new ComparableVersion("2.50.ALPHA-4");
        ComparableVersion v2 = new ComparableVersion("2.50.ALPHA-3");
        assertEquals(1, v1.compareTo(v2));
    }
}
