/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import com.oracle.bmc.ConfigFileReader.ConfigFile;

public class ConfigFileReaderTest {

    @Test(expected = FileNotFoundException.class)
    public void noConfigFile() throws IOException {
        ConfigFileReader.parse("src/test/resources/does_not_exist");
    }

    @Test(expected = IllegalStateException.class)
    public void noDefaultProfile() throws IOException {
        ConfigFileReader.parse("src/test/resources/unit_test_no_default_config");
    }

    @Test(expected = IllegalArgumentException.class)
    public void noProfile() throws IOException {
        ConfigFileReader.parse("src/test/resources/unit_test_config", "foobar");
    }

    @Test
    public void defaultProfile() throws IOException {
        ConfigFile configFile = ConfigFileReader.parse("src/test/resources/unit_test_config");
        assertEquals("default_tenancy", configFile.get("tenancy"));
        assertEquals("default_user", configFile.get("user"));
        assertEquals("default_fingerprint", configFile.get("fingerprint"));
        assertEquals("default_key_file", configFile.get("key_file"));
        assertNull(configFile.get("pass_phrase"));
    }

    @Test
    public void overrideProfile() throws IOException {
        ConfigFile configFile =
                ConfigFileReader.parse("src/test/resources/unit_test_config", "OVERRIDE");
        assertEquals("default_tenancy", configFile.get("tenancy"));
        assertEquals("default_user", configFile.get("user"));
        assertEquals("default_fingerprint", configFile.get("fingerprint"));
        assertEquals("override_key_file", configFile.get("key_file"));
        assertEquals("override_pass_phrase", configFile.get("pass_phrase"));
    }
}
