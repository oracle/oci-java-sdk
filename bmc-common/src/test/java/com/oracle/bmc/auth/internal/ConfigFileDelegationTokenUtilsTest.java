/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import static org.junit.Assert.assertEquals;

import com.oracle.bmc.ConfigFileReader;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.IOException;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ConfigFileReader.class})
public class ConfigFileDelegationTokenUtilsTest {

    @Test
    public void loadDelegationTokenStringFromDelegationFileTest() throws IOException {
        PowerMockito.mockStatic(ConfigFileReader.class);
        ConfigFileReader.ConfigFile configFile =
                PowerMockito.mock(ConfigFileReader.ConfigFile.class);
        PowerMockito.when(configFile.get("delegation_token_file"))
                .thenReturn("src/test/resources/unit_test_delegation_token_file");

        assertEquals(
                ConfigFileDelegationTokenUtils.parseAndGetToken(configFile),
                "testdelegationToken123456789");
    }

    @Test
    public void loadEmptyStringFromNonExistingDelegationTokenFileTest() throws IOException {
        PowerMockito.mockStatic(ConfigFileReader.class);
        ConfigFileReader.ConfigFile configFile =
                PowerMockito.mock(ConfigFileReader.ConfigFile.class);
        PowerMockito.when(configFile.get("delegation_token_file"))
                .thenReturn("src/test/resources/unit_test_delegation_file_does_not_exist");

        assertEquals(ConfigFileDelegationTokenUtils.parseAndGetToken(configFile), "");
    }

    @Test
    public void loadDelegationTokenStringFromConfigFileTest() throws IOException {
        final ConfigFileReader.ConfigFile configFile =
                ConfigFileReader.parse(
                        "src/test/resources/unit_test_config_for_delegation_token", "DEFAULT");
        assertEquals(
                ConfigFileDelegationTokenUtils.parseAndGetToken(configFile),
                "test_delegation_token");
    }
}
