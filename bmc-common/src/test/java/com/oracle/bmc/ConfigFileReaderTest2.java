package com.oracle.bmc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.oracle.bmc.ConfigFileReader.ConfigFile;

public class ConfigFileReaderTest2 {

  private static File CONFIG_FILE;
  
  @BeforeClass
  public static void beforeClass() {
    CONFIG_FILE = new File("./src/test/resources/oci.config");
    assertTrue(CONFIG_FILE.isFile());
  }

  private ConfigFile configFile;
  @Before
  public void before() throws IOException {
    this.configFile = ConfigFileReader.parse(CONFIG_FILE.getAbsolutePath());
    assertNotNull(configFile);
  }
  
  @Test
  public void testProfileNames() {
    Set<String> actualProfileNames = configFile.getProfileNames();
    List<String> expectedProfileNames = ExpectedConfigValues2.getExpectedProfileNames();;
    assertEquals(expectedProfileNames.size(), configFile.getProfileNames().size());
    actualProfileNames.forEach(pname -> assertTrue(expectedProfileNames.contains(pname)));
  }
  @Test
  public void testDefaultConfig() throws IOException {
    assertDefaultProfile(configFile);
  }
  
  @Test
  public void testAshburnOverrideConfig() throws IOException {
    assertAshburnOverridsDefault(configFile);
  }

  private void assertAshburnOverridsDefault(ConfigFile configFileProfiles) {
    Map<String, String> profileKeys = configFileProfiles.getProfileKeys("ASHBURN");
    Map<String, String> expectedMap = ExpectedConfigValues2.createDefaultExpectedMap();

    // override region
    expectedMap.put("region", "us-ashburn-1");
    assertEquals(expectedMap, profileKeys);
  }

  private void assertDefaultProfile(ConfigFile configFileProfiles) {
    Map<String, String> profileKeys = configFileProfiles.getProfileKeys("DEFAULT");
    Map<String, String> expectedMap = ExpectedConfigValues2.createDefaultExpectedMap();
    assertEquals(expectedMap, profileKeys);
  }

  
  
  
}
