/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc;

import com.google.common.base.Optional;
import com.oracle.bmc.util.internal.NameUtils;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
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
        final String regionId = "baz";
        try {
            assertNotNull(Region.fromRegionCodeOrId(regionId));
            fail("should have thrown");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains(regionId));
            final Region newRegion = Region.register(regionId, Realm.OC1);
            final Optional<String> endpoint = newRegion.getEndpoint(TEST_SERVICE);
            assertTrue(endpoint.isPresent());
            assertEquals("https://foobar.baz.oraclecloud.com", endpoint.get());
        }
    }

    @Test
    public void validRegionName() {
        assertSame(Region.CA_TORONTO_1, Region.valueOf("CA_TORONTO_1"));
        assertSame(Region.US_PHOENIX_1, Region.valueOf("US_PHOENIX_1"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidRegionName() {
        Region.valueOf("foobar");
    }

    @Test
    public void serializeAndDeserialize() throws IOException, ClassNotFoundException {
        final File tempFile = File.createTempFile("test", ".data");
        tempFile.deleteOnExit();

        final FileOutputStream outputFile = new FileOutputStream(tempFile.getPath());
        final ObjectOutputStream out = new ObjectOutputStream(outputFile);
        final Region unknownRegion = Region.register("foobar", Realm.OC1);

        out.writeObject(Region.US_PHOENIX_1);
        out.writeObject(unknownRegion);

        out.close();
        outputFile.close();

        final FileInputStream inputFile = new FileInputStream(tempFile.getPath());
        final ObjectInputStream in = new ObjectInputStream(inputFile);

        final Region region1 = (Region) in.readObject();
        final Region region2 = (Region) in.readObject();

        in.close();
        inputFile.close();

        assertEquals(Region.US_PHOENIX_1, region1);
        assertEquals(unknownRegion, region2);
    }

    @Test
    public void registerKnownRegion() {
        int regionCount = Region.values().length;
        final Region existingRegion =
                Region.register(Region.US_PHOENIX_1.getRegionId(), Region.US_PHOENIX_1.getRealm());

        assertSame(Region.US_PHOENIX_1, existingRegion);
        assertEquals(Region.US_PHOENIX_1.getRegionId(), existingRegion.getRegionId());
        assertEquals(Region.US_PHOENIX_1.getRealm(), existingRegion.getRealm());
        assertEquals(regionCount, Region.values().length);
        assertSame(
                existingRegion,
                Region.valueOf(
                        NameUtils.canonicalizeForEnumTypes(Region.US_PHOENIX_1.getRegionId())));
        assertSame(
                existingRegion,
                Region.register(Region.US_PHOENIX_1.getRegionId(), Region.US_PHOENIX_1.getRealm()));
        assertEquals(regionCount, Region.values().length);
    }

    @Test
    public void registerNewRegion() {
        final String newRegionId = "us-foo-1";
        int regionCount = Region.values().length;
        final Region newRegion = Region.register(newRegionId, Realm.OC3);

        assertEquals(newRegionId, newRegion.getRegionId());
        assertEquals(Realm.OC3, newRegion.getRealm());
        assertEquals(regionCount + 1, Region.values().length);
        assertSame(newRegion, Region.valueOf(NameUtils.canonicalizeForEnumTypes(newRegionId)));
        assertSame(newRegion, Region.register(newRegionId, Realm.OC3));
        assertEquals(regionCount + 1, Region.values().length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void existingRegionsAreImmutable() {
        Region.register(Region.US_PHOENIX_1.getRegionId(), Realm.OC3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void newRegionsAreImmutable() {
        final String newRegionId = "us-foo-2";
        Region.register(newRegionId, Realm.OC3);
        Region.register(newRegionId, Realm.OC2);
    }

    @Test
    // Check that the region names follow enum naming convention (if the regionId is us-phoenix-1, then the name of the
    // region object should be US-PHOENIX-1). This allows for forward compatibility when registering new regions.
    public void knownRegionsFollowNamingGuidelines() throws IllegalAccessException {
        final Field[] declaredFields = Region.class.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.getType() == Region.class
                    && Modifier.isStatic(field.getModifiers())
                    && Modifier.isPublic(field.getModifiers())) {
                final Region region = (Region) field.get(null);
                assertEquals(
                        field.getName(), NameUtils.canonicalizeForEnumTypes(region.getRegionId()));
            }
        }
    }

    @Test
    public void stableOrderingOfRegionValues() {
        final List<Region> regionList = new ArrayList<>(Arrays.asList(Region.values()));
        assertEquals(regionList, Arrays.asList(Region.values()));

        // register region xxx
        regionList.add(Region.register("xxx", Realm.OC1));
        assertEquals(regionList, Arrays.asList(Region.values()));

        // register region yyy
        regionList.add(Region.register("yyy", Realm.OC2));
        assertEquals(regionList, Arrays.asList(Region.values()));

        // register region zzz
        regionList.add(Region.register("zzz", Realm.OC3));
        assertEquals(regionList, Arrays.asList(Region.values()));
    }
}
