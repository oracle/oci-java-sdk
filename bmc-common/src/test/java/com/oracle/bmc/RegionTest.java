/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import com.oracle.bmc.internal.GuavaUtils;
import com.oracle.bmc.helper.EnvironmentVariablesHelper;
import com.oracle.bmc.model.RegionSchema;
import com.oracle.bmc.model.internal.JsonConverter;
import com.oracle.bmc.util.internal.FileUtils;
import com.oracle.bmc.util.internal.NameUtils;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
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

    private static final String REGION_ID_WITH_DOT = "some.customerdomain.com";

    @BeforeClass
    public static void init() throws Exception {

        Map<String, String> newEnvMap = new HashMap<>();

        String regionBlob =
                "{ \"realmKey\" : \"UCX\",\"realmDomainComponent\" : \"oracle-foobar.com\",\"regionKey\" : \"ABV\",\"regionIdentifier\" : \"us-abv-1\"}";
        newEnvMap.put("OCI_REGION_METADATA", regionBlob);
        EnvironmentVariablesHelper.setEnvironmentVariable(newEnvMap);
    }

    @Before
    public void reset() {
        Region.setInstanceMetadataServiceClientConfig(
                new ClientConfig()
                        .property(ClientProperties.CONNECT_TIMEOUT, 10000)
                        .property(ClientProperties.READ_TIMEOUT, 60000));
        Region.hasUsedInstanceMetadataService = false;
        Region.skipInstanceMetadataService();
    }

    @Test
    public void testAllRegions() {
        try {
            File file = new File("src/test/resources/regions.json");
            assertTrue("File regions.json not found.", file.isFile());

            String content =
                    new String(
                            Files.readAllBytes(Paths.get("src/test/resources/regions.json")),
                            StandardCharsets.UTF_8);
            assertFalse("Failed to read contents from regions.json.", content.isEmpty());

            RegionSchema[] regionSchemas =
                    JsonConverter.jsonBlobToObject(content, RegionSchema[].class);
            assertTrue(
                    "Failed to read regionSchemas.",
                    regionSchemas != null && regionSchemas.length != 0);

            ArrayList<String> regionIds = new ArrayList<String>();
            for (Region r : Region.values()) {
                regionIds.add(r.getRegionId());
            }
            for (RegionSchema regionSchema : regionSchemas) {
                assertTrue(
                        "Found invalid region schema.",
                        regionSchema != null && RegionSchema.isValid(regionSchema));
                assertTrue(
                        String.format(
                                "Region %s not registered.", regionSchema.getRegionIdentifier()),
                        regionIds.contains(regionSchema.getRegionIdentifier()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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
        final Optional<String> actualEndpoint =
                GuavaUtils.adaptFromGuava(region.getEndpoint(TEST_SERVICE));
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
            final Optional<String> endpoint =
                    GuavaUtils.adaptFromGuava(newRegion.getEndpoint(TEST_SERVICE));
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
                if (field.getName() == "regionFromImds") {
                    continue;
                }
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
                new RegionSchema("RTC", "foobar-oraclecloud.com", "YTE", "us-yte-1");
        Assert.assertTrue(RegionSchema.isValid(regionSchema));
    }

    @Test
    public void checkIfInValidRealm() {
        RegionSchema regionSchema =
                new RegionSchema(null, "foobar-oraclecloud.com", "YTE", "us-yte-1");
        Assert.assertFalse(RegionSchema.isValid(regionSchema));
    }

    @Test
    public void checkIfEmptyRealm() {
        RegionSchema regionSchema =
                new RegionSchema("", "foobar-oraclecloud.com", "YTE", "us-yte-1");
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
                "{ \"realmKey\" : \"YCX\",\"realmDomainComponent\" : \"\",\"regionKey\" : \"MSW\",\"regionIdentifier\" : \"us-moscow-1\"}";
        Map<String, String> newEnvMap = new HashMap<>();
        newEnvMap.put("OCI_REGION_METADATA", regionBlob);
        EnvironmentVariablesHelper.setEnvironmentVariable(newEnvMap);
        Region.fromRegionCodeOrId("MSW");
    }

    @Test
    public void testExistingEnvRegion() {

        Region region = Region.fromRegionCodeOrId("ABV");
        Region US_SAN_DIEGO_TST =
                Region.register("us-abv-1", Realm.register("UCX", "oracle-foobar.com"), "ABV");
        assertSame(US_SAN_DIEGO_TST, region);
    }

    @Test
    public void testExistingDefaultRealmEnvRegion() throws Exception {
        String realmDomainComponentFromEnv = "oraclevaporcloud.space";
        Region.defaultRealmEnvVar = realmDomainComponentFromEnv;
        String regionId = "dummy-region-from-default-realm-env-var";
        Region region = Region.fromRegionCodeOrId(regionId);
        String regionId2 = "dummy-region-from-default-realm-env-var-2";
        Region region2 = Region.fromRegionCodeOrId(regionId);
        assertNotNull(region);
        assertSame(region.getRegionId(), regionId);
        assertSame(region.getRealm().getSecondLevelDomain(), realmDomainComponentFromEnv);
        assertNotNull(region);
        assertSame(region2.getRegionId(), regionId);
        assertSame(region2.getRealm().getSecondLevelDomain(), realmDomainComponentFromEnv);
        Region.defaultRealmEnvVar = null;
    }

    @Test
    public void testExistingDuplicateEnv() throws Exception {
        String regionBlob =
                "{ \"realmKey\" : \"UCX\",\"realmDomainComponent\" : \"oracle-foobar.com\",\"regionKey\" : \"ABV\",\"regionIdentifier\" : \"us-abv-1\"}";
        Map<String, String> newEnvMap = new HashMap<>();
        newEnvMap.put("OCI_REGION_METADATA", regionBlob);
        EnvironmentVariablesHelper.setEnvironmentVariable(newEnvMap);
        int count = Region.values().length;
        Region.fromRegionCodeOrId("ABV");
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
                "{ \"realmKey\" : \"RTC\",\"realmDomainComponent\" : \"oracle-cloudfoobar.com\",\"regionKey\" : \"HHH\",\"regionIdentifier\" : \"us-hhh-1\"}";
        Map<String, String> newEnvMap = new HashMap<>();
        newEnvMap.put("OCI_REGION_METADATA", regionBlob);
        EnvironmentVariablesHelper.setEnvironmentVariable(newEnvMap);
        Region.fromRegionCodeOrId("HHH");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEnvEmptyRealm() throws Exception {
        Region.setInstanceMetadataServiceClientConfig(
                new ClientConfig()
                        .property(ClientProperties.CONNECT_TIMEOUT, 1000)
                        .property(ClientProperties.READ_TIMEOUT, 5000));

        String regionBlob =
                "{ \"realmKey\" : \"\",\"realmDomainComponent\" : \"foobar-oraclecloud.com\",\"regionKey\" : \"BRN\",\"regionIdentifier\" : \"us-berlin-1\"}";
        Map<String, String> newEnvMap = new HashMap<>();
        newEnvMap.put("OCI_REGION_METADATA", regionBlob);
        EnvironmentVariablesHelper.setEnvironmentVariable(newEnvMap);
        Region.fromRegionCodeOrId("BRN");
    }

    @Test
    public void testValidConfigFile() {

        File file = new File(FileUtils.expandUserHome("~/.oci/regions-config.json"));
        if (file.exists()) {
            Region region = Region.fromRegionCodeOrId("ATL");
            Region US_ATLANTA_TST =
                    register("ap-atl-1", Realm.register("RTC", "foobar-oraclecloud.com"), "atl");
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

    @Test
    @Ignore("This test can be run when METADATA_SERVICE_BASE_URL is reachable")
    public void testMultithreaded_Imds() {
        try {
            Region.setInstanceMetadataServiceClientConfig(
                    new ClientConfig()
                            .property(ClientProperties.CONNECT_TIMEOUT, 100)
                            .property(ClientProperties.READ_TIMEOUT, 500));
            Region.hasUsedInstanceMetadataService = false;
            final ConcurrentMap<String, Boolean> resultMap = new ConcurrentHashMap<>();
            Thread t1 =
                    new Thread(
                            () -> {
                                boolean flag = Region.registerFromInstanceMetadataService();
                                resultMap.put("t1", flag);
                                System.out.println(
                                        "Flag: "
                                                + flag
                                                + "\nThread1: "
                                                + Arrays.toString(Region.values()));
                            });
            t1.setName("first-thread");
            Thread t2 =
                    new Thread(
                            () -> {
                                boolean flag = Region.registerFromInstanceMetadataService();
                                resultMap.put("t2", flag);
                                System.out.println(
                                        "Flag: "
                                                + flag
                                                + "\nThread2: "
                                                + Arrays.toString(Region.values()));
                            });
            t2.setName("second-thread");
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            Set<Boolean> set = new HashSet<>(resultMap.values());
            Assert.assertFalse(set.isEmpty());
            Assert.assertEquals(1, set.size());
            Assert.assertEquals(true, set.iterator().next());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testImdsRetriesWithDealyAndJitter() {
        try {
            Region.hasUsedInstanceMetadataService = false;
            final ConcurrentMap<String, Boolean> resultMap = new ConcurrentHashMap<>();
            Thread thread =
                    new Thread(
                            () -> {
                                boolean flag = Region.registerFromInstanceMetadataService();
                                resultMap.put("t1", flag);
                                System.out.println(
                                        "Flag: "
                                                + flag
                                                + "\nThread1: "
                                                + Arrays.toString(Region.values()));
                            });
            thread.setName("retry-thread");
            thread.start();
            thread.join();
            Set<Boolean> set = new HashSet<>(resultMap.values());
            Assert.assertFalse(set.isEmpty());
            Assert.assertEquals(1, set.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
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

    @Test
    public void
            testEndpointForDottedRegionWithEndpointServiceNameAndEndpointTemplateAndEndpointPrefix() {
        final Service SERVICE =
                Services.serviceBuilder()
                        .serviceName("objectstorage")
                        .serviceEndpointPrefix("objectstorage")
                        .endpointServiceName("test")
                        .serviceEndpointTemplate("https://{region}.bar.com")
                        .build();
        String endpoint = Region.formatDefaultRegionEndpoint(SERVICE, REGION_ID_WITH_DOT);
        assertEquals("https://test.some.customerdomain.com", endpoint);
    }

    @Test
    public void testEndpointForDottedRegionWithEndpointServiceNameAndWithEndpointPrefix() {
        final Service SERVICE =
                Services.serviceBuilder()
                        .serviceName("analytics")
                        .serviceEndpointPrefix("analytics")
                        .endpointServiceName("test")
                        .build();
        String endpoint = Region.formatDefaultRegionEndpoint(SERVICE, REGION_ID_WITH_DOT);
        assertEquals("https://test.some.customerdomain.com", endpoint);
    }

    @Test
    public void
            testEndpointForDottedRegionWithoutEndpointServiceNameAndWithEndpointPrefixAndEndpointTemplate() {
        final Service SERVICE =
                Services.serviceBuilder()
                        .serviceName("blockstorage")
                        .serviceEndpointPrefix("iaas")
                        .serviceEndpointTemplate("https://iaas.{region}.{secondLevelDomain}")
                        .build();
        String endpoint = Region.formatDefaultRegionEndpoint(SERVICE, REGION_ID_WITH_DOT);
        assertEquals("https://iaas.some.customerdomain.com", endpoint);
    }

    @Test
    public void
            testEndpointForDottedRegionWithoutEndpointServiceNameAndEndpointTemplateAndWithEndpointPrefix() {
        final Service SERVICE =
                Services.serviceBuilder()
                        .serviceName("identity")
                        .serviceEndpointPrefix("iam")
                        .build();
        String endpoint = Region.formatDefaultRegionEndpoint(SERVICE, REGION_ID_WITH_DOT);
        assertEquals("https://iam.some.customerdomain.com", endpoint);
    }

    @Test(expected = IllegalArgumentException.class)
    public void
            testEndpointForDottedRegionWithoutEndpointServiceNameAndEndpointTemplateAndWithBlankEndpointPrefix() {
        final Service SERVICE =
                Services.serviceBuilder()
                        .serviceName("datascience")
                        .serviceEndpointPrefix("")
                        .build();
        Region.formatDefaultRegionEndpoint(SERVICE, REGION_ID_WITH_DOT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEndpointForDottedRegionWithIncorrectEndpointTemplate() {
        // Service endpoint template with single slash
        Service SERVICE =
                Services.serviceBuilder()
                        .serviceName("bds")
                        .serviceEndpointPrefix("iaas")
                        .serviceEndpointTemplate("https:/iaas.{region}.{secondLevelDomain}")
                        .build();
        Region.formatDefaultRegionEndpoint(SERVICE, REGION_ID_WITH_DOT);

        // Service endpoint template with no dots
        SERVICE =
                Services.serviceBuilder()
                        .serviceName("core")
                        .serviceEndpointPrefix("iaas")
                        .serviceEndpointTemplate("https://iaas{region}{secondLevelDomain}")
                        .build();
        Region.formatDefaultRegionEndpoint(SERVICE, REGION_ID_WITH_DOT);
    }
}
