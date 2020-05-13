/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc;

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
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.base.Optional;
import com.oracle.bmc.model.RegionSchema;
import com.oracle.bmc.util.internal.FileUtils;
import com.oracle.bmc.util.internal.NameUtils;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static com.oracle.bmc.Region.register;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegionTest {

    private static final Service TEST_SERVICE =
            Services.serviceBuilder()
                    .serviceEndpointPrefix("foobar")
                    .serviceName("RegionTest")
                    .build();

    private static void setEnvironmentVariable(Map<String, String> newEnvMap) throws Exception {
        try {
            Class<?> processEnvironmentClass = Class.forName("java.lang.ProcessEnvironment");
            Field theEnvironmentField = processEnvironmentClass.getDeclaredField("theEnvironment");
            theEnvironmentField.setAccessible(true);
            Map<String, String> env = (Map<String, String>) theEnvironmentField.get(null);
            env.putAll(newEnvMap);
            Field theCaseInsensitiveEnvironmentField =
                    processEnvironmentClass.getDeclaredField("theCaseInsensitiveEnvironment");
            theCaseInsensitiveEnvironmentField.setAccessible(true);
            Map<String, String> caseSensitiveEnvMap =
                    (Map<String, String>) theCaseInsensitiveEnvironmentField.get(null);
            caseSensitiveEnvMap.putAll(newEnvMap);
        } catch (NoSuchFieldException e) {
            Class[] classes = Collections.class.getDeclaredClasses();
            Map<String, String> env = System.getenv();
            for (Class cl : classes) {
                if ("java.util.Collections$UnmodifiableMap".equals(cl.getName())) {
                    Field field = cl.getDeclaredField("m");
                    field.setAccessible(true);
                    Object obj = field.get(env);
                    Map<String, String> map = (Map<String, String>) obj;
                    map.clear();
                    map.putAll(newEnvMap);
                }
            }
        }
    }

    @BeforeClass
    public static void init() throws Exception {
        String regionBlob =
                "{ \"realmKey\" : \"OC7\",\"realmDomainComponent\" : \"oraclensrcloud.com\",\"regionKey\" : \"SDO\",\"regionIdentifier\" : \"us-sandiego-1\"}";
        Map<String, String> newEnvMap = new HashMap<>();
        newEnvMap.put("OCI_REGION_METADATA", regionBlob);
        setEnvironmentVariable(newEnvMap);
    }

    @Before
    public void reset() {
        Region.setInstanceMetadataServiceClientConfig(
                new ClientConfig()
                        .property(ClientProperties.CONNECT_TIMEOUT, 10000)
                        .property(ClientProperties.READ_TIMEOUT, 60000));
        Region.hasUsedInstanceMetadataService = false;
    }

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
        Region.setInstanceMetadataServiceClientConfig(
                new ClientConfig()
                        .property(ClientProperties.CONNECT_TIMEOUT, 1000)
                        .property(ClientProperties.READ_TIMEOUT, 5000));
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

    @Test(timeout = 10000)
    public void invalidRegion() {
        Region.setInstanceMetadataServiceClientConfig(
                new ClientConfig()
                        .property(ClientProperties.CONNECT_TIMEOUT, 1000)
                        .property(ClientProperties.READ_TIMEOUT, 5000));

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

    @Test(timeout = 10000, expected = IllegalArgumentException.class)
    public void invalidRegionName() {
        Region.setInstanceMetadataServiceClientConfig(
                new ClientConfig()
                        .property(ClientProperties.CONNECT_TIMEOUT, 1000)
                        .property(ClientProperties.READ_TIMEOUT, 5000));

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

    @Test
    public void checkIfValidRegionSchema() {
        RegionSchema regionSchema =
                new RegionSchema("OC6", "oraclensrcloud.com", "FRD", "us-florida-1");
        Assert.assertTrue(RegionSchema.isValid(regionSchema));
    }

    @Test
    public void checkIfInValidRealm() {
        RegionSchema regionSchema =
                new RegionSchema(null, "oraclensrcloud.com", "FRD", "us-florida-1");
        Assert.assertFalse(RegionSchema.isValid(regionSchema));
    }

    @Test
    public void checkIfEmptyRealm() {
        RegionSchema regionSchema =
                new RegionSchema("", "oraclensrcloud.com", "FRD", "us-florida-1");
        Assert.assertFalse(RegionSchema.isValid(regionSchema));
    }

    @Test
    public void testExistingRegionFromSDK() {

        Region region = Region.fromRegionCodeOrId("phx");
        assertSame(Region.US_PHOENIX_1, region);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEnvEmptyDomain() throws Exception {
        Region.setInstanceMetadataServiceClientConfig(
                new ClientConfig()
                        .property(ClientProperties.CONNECT_TIMEOUT, 1000)
                        .property(ClientProperties.READ_TIMEOUT, 5000));

        String regionBlob =
                "{ \"realmKey\" : \"OC1\",\"realmDomainComponent\" : \"\",\"regionKey\" : \"MSW\",\"regionIdentifier\" : \"us-moscow-1\"}";
        Map<String, String> newEnvMap = new HashMap<>();
        newEnvMap.put("OCI_REGION_METADATA", regionBlob);
        setEnvironmentVariable(newEnvMap);
        Region.fromRegionCodeOrId("MSW");
    }

    @Test
    public void testExistingEnvRegion() {

        Region region = Region.fromRegionCodeOrId("SDO");
        Region US_SAN_DIEGO_TST =
                Region.register(
                        "us-sandiego-1", Realm.register("OC7", "oraclensrcloud.com"), "SDO");
        assertSame(US_SAN_DIEGO_TST, region);
    }

    @Test
    public void testExistingDuplicateEnv() throws Exception {
        String regionBlob =
                "{ \"realmKey\" : \"OC7\",\"realmDomainComponent\" : \"oraclensrcloud.com\",\"regionKey\" : \"SDO\",\"regionIdentifier\" : \"us-sandiego-1\"}";
        Map<String, String> newEnvMap = new HashMap<>();
        newEnvMap.put("OCI_REGION_METADATA", regionBlob);
        setEnvironmentVariable(newEnvMap);
        int count = Region.values().length;
        Region.fromRegionCodeOrId("SDO");
        int afterCheckEnvCount = Region.values().length;
        assertSame(count, afterCheckEnvCount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewEnvRegion() throws Exception {
        Region.setInstanceMetadataServiceClientConfig(
                new ClientConfig()
                        .property(ClientProperties.CONNECT_TIMEOUT, 1000)
                        .property(ClientProperties.READ_TIMEOUT, 5000));

        String regionBlob =
                "{ \"realmKey\" : \"OC6\",\"realmDomainComponent\" : \"oraclensrcloud.com\",\"regionKey\" : \"DBI\",\"regionIdentifier\" : \"us-dubai-1\"}";
        Map<String, String> newEnvMap = new HashMap<>();
        newEnvMap.put("OCI_REGION_METADATA", regionBlob);
        setEnvironmentVariable(newEnvMap);
        Region.fromRegionCodeOrId("DBI");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEnvEmptyRealm() throws Exception {
        Region.setInstanceMetadataServiceClientConfig(
                new ClientConfig()
                        .property(ClientProperties.CONNECT_TIMEOUT, 1000)
                        .property(ClientProperties.READ_TIMEOUT, 5000));

        String regionBlob =
                "{ \"realmKey\" : \"\",\"realmDomainComponent\" : \"oraclensrcloud.com\",\"regionKey\" : \"BRN\",\"regionIdentifier\" : \"us-berlin-1\"}";
        Map<String, String> newEnvMap = new HashMap<>();
        newEnvMap.put("OCI_REGION_METADATA", regionBlob);
        setEnvironmentVariable(newEnvMap);
        Region.fromRegionCodeOrId("BRN");
    }

    @Test
    public void testValidConfigFile() {

        File file = new File(FileUtils.expandUserHome("~/.oci/regions-config.json"));
        if (file.exists()) {
            Region region = Region.fromRegionCodeOrId("ATL");
            Region US_ATLANTA_TST =
                    register("ap-atlanta-1", Realm.register("OC6", "oraclecloud.com"), "atl");
            assertSame(US_ATLANTA_TST, region);
        }
    }

    // tests that the all-region lookup is fast as long as it's not querying IMDS

    @Test(timeout = 5000L)
    public void testValues() {
        Region.values();
    }

    // individual region lookups still contact IMDS and are slow if IMDS can't be reached

    @Test(timeout = 10000, expected = IllegalArgumentException.class)
    public void testValueOf() {
        // if IMDS can't be reached, this test takes >15 seconds
        Region.setInstanceMetadataServiceClientConfig(
                new ClientConfig()
                        .property(ClientProperties.CONNECT_TIMEOUT, 1000)
                        .property(ClientProperties.READ_TIMEOUT, 5000));
        Region.valueOf("unknown");
    }

    @Ignore
    @Test(timeout = 10000, expected = IllegalArgumentException.class)
    public void testFromRegionCode() {
        // if IMDS can't be reached, this test takes >15 seconds
        Region.setInstanceMetadataServiceClientConfig(
                new ClientConfig()
                        .property(ClientProperties.CONNECT_TIMEOUT, 1000)
                        .property(ClientProperties.READ_TIMEOUT, 5000));
        Region.fromRegionCode("unknown");
    }

    @Ignore
    @Test(timeout = 10000, expected = IllegalArgumentException.class)
    public void testFromRegionCodeOrId() {
        // if IMDS can't be reached, this test takes >15 seconds
        Region.setInstanceMetadataServiceClientConfig(
                new ClientConfig()
                        .property(ClientProperties.CONNECT_TIMEOUT, 1000)
                        .property(ClientProperties.READ_TIMEOUT, 5000));
        Region.fromRegionCodeOrId("unknown");
    }

    @Ignore
    @Test(timeout = 10000, expected = IllegalArgumentException.class)
    public void testFromRegionId() {
        // if IMDS can't be reached, this test takes >15 seconds
        Region.setInstanceMetadataServiceClientConfig(
                new ClientConfig()
                        .property(ClientProperties.CONNECT_TIMEOUT, 1000)
                        .property(ClientProperties.READ_TIMEOUT, 5000));
        Region.fromRegionId("unknown");
    }

    @Ignore
    @Test(timeout = 10000)
    public void testFormatDefaultRegionEndpoint() {
        // if IMDS can't be reached, this test takes >15 seconds
        Region.setInstanceMetadataServiceClientConfig(
                new ClientConfig()
                        .property(ClientProperties.CONNECT_TIMEOUT, 1000)
                        .property(ClientProperties.READ_TIMEOUT, 5000));
        Service svc =
                Services.serviceBuilder()
                        .serviceName("test")
                        .serviceEndpointPrefix("test")
                        .serviceEndpointTemplate("https://test.{region}.{secondLevelDomain}")
                        .build();
        Region.formatDefaultRegionEndpoint(svc, "unknown");
    }

    // tests that the region lookups don't fail, even when IMDS is not available

    @Test(timeout = 10000)
    public void testValues_Imds() {
        // if IMDS can't be reached, this test takes >15 seconds
        Region.setInstanceMetadataServiceClientConfig(
                new ClientConfig()
                        .property(ClientProperties.CONNECT_TIMEOUT, 1000)
                        .property(ClientProperties.READ_TIMEOUT, 5000));
        Region.registerFromInstanceMetadataService();
        Region.values();
    }

    // individual region lookups are fast if told to skip IMDS

    @Test(timeout = 5000L, expected = IllegalArgumentException.class)
    public void testValueOf_SkipImds() {
        Region.skipInstanceMetadataService();
        Region.valueOf("unknown");
    }

    @Test(timeout = 5000L, expected = IllegalArgumentException.class)
    public void testFromRegionCode_SkipImds() {
        Region.skipInstanceMetadataService();
        Region.fromRegionCode("unknown");
    }

    @Test(timeout = 5000L, expected = IllegalArgumentException.class)
    public void testFromRegionCodeOrId_SkipImds() {
        Region.skipInstanceMetadataService();
        Region.fromRegionCodeOrId("unknown");
    }

    @Test(timeout = 5000L, expected = IllegalArgumentException.class)
    public void testFromRegionId_SkipImds() {
        Region.skipInstanceMetadataService();
        Region.fromRegionId("unknown");
    }

    @Test(timeout = 5000L)
    public void testFormatDefaultRegionEndpoint_SkipImds() {
        Region.skipInstanceMetadataService();
        Service svc =
                Services.serviceBuilder()
                        .serviceName("test")
                        .serviceEndpointPrefix("test")
                        .serviceEndpointTemplate("https://test.{region}.{secondLevelDomain}")
                        .build();
        Region.formatDefaultRegionEndpoint(svc, "unknown");
    }
}
