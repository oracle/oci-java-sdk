/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc;

import com.oracle.bmc.helper.EnvironmentVariablesHelper;
import com.oracle.bmc.internal.DeveloperToolConfiguration;
import com.oracle.bmc.util.internal.FileUtils;
import org.junit.*;

import java.io.*;
import java.util.*;

import static com.oracle.bmc.Region.register;
import static junit.framework.TestCase.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;

public class DeveloperToolConfigTest {

    @Before
    public void setup() {
        Region.resetDeveloperToolConfiguration();
    }

    @Test
    public void testDeveloperToolConfigFile_regionExists() {
        File file = new File(FileUtils.expandUserHome("~/.oci/developer-tool-configuration.json"));
        if (file.exists()) {
            Region region = Region.fromRegionCodeOrId("phx");
            Region US_PHOENIX_1 =
                    register("us-phx-1", Realm.register("RTC", "foobar-oraclecloud.com"), "phx");
            assertEquals(US_PHOENIX_1, region);
        }
    }

    @Test
    public void testDeveloperToolConfigFile_regionDoesNotExists() {
        try {
            File file =
                    new File(FileUtils.expandUserHome("~/.oci/developer-tool-configuration.json"));
            if (file.exists()) {
                Region.fromRegionCodeOrId("unknown");
            }
        } catch (Exception e) {
            assertEquals("IllegalArgumentException", e.getClass().getSimpleName());
            assertEquals(
                    "Unknown regionId unknown, region information not defined in DeveloperToolConfiguration configuration.",
                    e.getMessage());
        }
    }

    @Test
    public void testDeveloperToolConfigUsingEnvVar_regionExists() throws Exception {
        Map<String, String> newEnvMap = new HashMap<>();
        String developerToolConfigurationFile =
                "src/test/resources/developer-tool-configuration.json";
        newEnvMap.put("OCI_DEVELOPER_TOOL_CONFIGURATION_FILE_PATH", developerToolConfigurationFile);
        EnvironmentVariablesHelper.setEnvironmentVariable(newEnvMap);

        Region region = Region.fromRegionCodeOrId("phx");
        DeveloperToolConfiguration.resetAllowOnlyDevToolConfigRegionsStatus();
        Region US_PHOENIX_1 =
                register(
                        "us-phx-1",
                        Realm.register("RTC", "foobar-oraclecloud.com", true),
                        "phx",
                        true);
        assertSame(US_PHOENIX_1, region);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeveloperToolConfigUsingEnvVar_regionDoesNotExists() throws Exception {
        Map<String, String> newEnvMap = new HashMap<>();
        String developerToolConfigurationFile =
                "src/test/resources/developer-tool-configuration.json";
        newEnvMap.put("OCI_DEVELOPER_TOOL_CONFIGURATION_FILE_PATH", developerToolConfigurationFile);
        EnvironmentVariablesHelper.setEnvironmentVariable(newEnvMap);

        Region.fromRegionCodeOrId("unknown");
    }

    @Test
    public void testDeveloperToolConfigUsingEnvVar_RegisterNewRegion() throws Exception {
        Map<String, String> newEnvMap = new HashMap<>();
        String developerToolConfigurationFile =
                "src/test/resources/developer-tool-configuration.json";
        newEnvMap.put("OCI_DEVELOPER_TOOL_CONFIGURATION_FILE_PATH", developerToolConfigurationFile);
        EnvironmentVariablesHelper.setEnvironmentVariable(newEnvMap);

        assertEquals("phx", Region.fromRegionCodeOrId("phx").getRegionCode());
        Region.register(
                "new-phx-1", Realm.register("RTC1", "foobar-oraclecloud1.com", true), "nphx", true);
        assertEquals("nphx", Region.fromRegionCodeOrId("nphx").getRegionCode());
        assertTrue(
                Arrays.stream(Realm.values()).anyMatch(realm -> realm.getRealmId().equals("rtc1")));
        assertFalse(Arrays.stream(Region.values()).anyMatch(region -> region.equals("NEW_PHX_1")));
    }

    @Test
    public void testDeveloperToolConfigEnvVar_withoutRegionCoexist() throws Exception {

        Map<String, String> newEnvMap = new HashMap<>();
        String developerToolConfigurationFile =
                "src/test/resources/developer-tool-configuration.json";
        newEnvMap.put("OCI_DEVELOPER_TOOL_CONFIGURATION_FILE_PATH", developerToolConfigurationFile);
        EnvironmentVariablesHelper.setEnvironmentVariable(newEnvMap);
        DeveloperToolConfiguration.resetAllowOnlyDevToolConfigRegionsStatus();
        assertTrue(Region.isServiceEnabled("objectstorage"));
        assertEquals("phx", Region.fromRegionCodeOrId("phx").getRegionCode());
        assertFalse(
                Arrays.stream(Region.values())
                        .anyMatch(region -> region.equals(Region.US_CHICAGO_1)));
        assertFalse(Arrays.stream(Realm.values()).anyMatch(realm -> realm.equals(Realm.OC2)));
    }

    @Test
    public void testDeveloperToolConfigEnvVar_withRegionCoexistEnvVar() throws Exception {
        Map<String, String> newEnvMap = new HashMap<>();
        String developerToolConfigurationFile =
                "src/test/resources/developer-tool-configuration.json";
        newEnvMap.put("OCI_DEVELOPER_TOOL_CONFIGURATION_FILE_PATH", developerToolConfigurationFile);
        newEnvMap.put("OCI_ALLOW_ONLY_DEVELOPER_TOOL_CONFIGURATION_REGIONS", "true");
        EnvironmentVariablesHelper.setEnvironmentVariable(newEnvMap);
        assertTrue(Region.isServiceEnabled("objectstorage"));
        assertEquals("phx", Region.fromRegionCodeOrId("phx").getRegionCode());
        DeveloperToolConfiguration.resetAllowOnlyDevToolConfigRegionsStatus();
        assertTrue(DeveloperToolConfiguration.isDevToolConfigRegionCoexistEnabled());
        assertTrue(
                Arrays.stream(Region.values())
                        .anyMatch(region -> region.equals(Region.US_CHICAGO_1)));
        assertTrue(Arrays.stream(Realm.values()).anyMatch(realm -> realm.equals(Realm.OC2)));
    }

    @Test
    public void testDeveloperToolConfigEnvVar_withRegionCoexistConfigFile() throws Exception {
        Map<String, String> newEnvMap = new HashMap<>();
        String developerToolConfigurationFile =
                "src/test/resources/developer-tool-configuration-with-coexist.json";
        newEnvMap.put("OCI_DEVELOPER_TOOL_CONFIGURATION_FILE_PATH", developerToolConfigurationFile);
        EnvironmentVariablesHelper.setEnvironmentVariable(newEnvMap);
        assertTrue(Region.isServiceEnabled("objectstorage"));
        assertEquals("phx", Region.fromRegionCodeOrId("phx").getRegionCode());
        DeveloperToolConfiguration.resetAllowOnlyDevToolConfigRegionsStatus();
        assertTrue(DeveloperToolConfiguration.isDevToolConfigRegionCoexistEnabled());
        assertTrue(
                Arrays.stream(Region.values())
                        .anyMatch(region -> region.equals(Region.US_CHICAGO_1)));
        assertTrue(Arrays.stream(Realm.values()).anyMatch(realm -> realm.equals(Realm.OC2)));
    }
}
