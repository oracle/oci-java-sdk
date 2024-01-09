/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.internal.ConfigFileDelegationTokenUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(PowerMockRunner.class)
@PrepareForTest({
    ResourcePrincipalAuthenticationDetailsProvider.class,
    InstancePrincipalsAuthenticationDetailsProvider.class
})
public class ConfigFileAuthenticationDetailsProviderTest {

    @Test
    public void loadConfigFileResourcePrincipalAuthenticationDetailsProviderFromConfigFileTest()
            throws IOException {
        PowerMockito.mockStatic(ResourcePrincipalAuthenticationDetailsProvider.class);
        ResourcePrincipalAuthenticationDetailsProvider mockRp =
                PowerMockito.mock(ResourcePrincipalAuthenticationDetailsProvider.class);
        ResourcePrincipalAuthenticationDetailsProvider
                        .ResourcePrincipalAuthenticationDetailsProviderBuilder
                mockRpBuilder =
                        PowerMockito.mock(
                                ResourcePrincipalAuthenticationDetailsProvider
                                        .ResourcePrincipalAuthenticationDetailsProviderBuilder
                                        .class);
        PowerMockito.when(ResourcePrincipalAuthenticationDetailsProvider.builder())
                .thenReturn(mockRpBuilder);
        PowerMockito.when(mockRpBuilder.build()).thenReturn(mockRp);

        final ConfigFileReader.ConfigFile configFile =
                ConfigFileReader.parse(
                        "src/test/resources/unit_test_config_resource_principal", "DEFAULT");
        final ConfigFileAuthenticationDetailsProvider configFileAuthenticationDetailsProvider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        assertTrue(
                configFileAuthenticationDetailsProvider.delegate
                        instanceof
                        ConfigFileAuthenticationDetailsProvider
                                .ConfigFileResourcePrincipalAuthenticationDetailsProvider);
        assertEquals(
                ConfigFileDelegationTokenUtils.parseAndGetToken(configFile),
                "test_delegation_token_resource_principal");
    }

    @Test
    public void loadConfigFileInstancePrincipalAuthenticationDetailsProviderFromConfigFileTest()
            throws IOException {

        PowerMockito.mockStatic(InstancePrincipalsAuthenticationDetailsProvider.class);
        InstancePrincipalsAuthenticationDetailsProvider mockIp =
                PowerMockito.mock(InstancePrincipalsAuthenticationDetailsProvider.class);
        InstancePrincipalsAuthenticationDetailsProvider
                        .InstancePrincipalsAuthenticationDetailsProviderBuilder
                mockIpBuilder =
                        PowerMockito.mock(
                                InstancePrincipalsAuthenticationDetailsProvider
                                        .InstancePrincipalsAuthenticationDetailsProviderBuilder
                                        .class);
        PowerMockito.when(InstancePrincipalsAuthenticationDetailsProvider.builder())
                .thenReturn(mockIpBuilder);
        PowerMockito.when(mockIpBuilder.build()).thenReturn(mockIp);

        final ConfigFileReader.ConfigFile configFile =
                ConfigFileReader.parse(
                        "src/test/resources/unit_test_config_instance_principal", "DEFAULT");
        final ConfigFileAuthenticationDetailsProvider configFileAuthenticationDetailsProvider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        assertTrue(
                configFileAuthenticationDetailsProvider.delegate
                        instanceof
                        ConfigFileAuthenticationDetailsProvider
                                .ConfigFileInstancePrincipalAuthenticationDetailsProvider);
        assertEquals(
                ConfigFileDelegationTokenUtils.parseAndGetToken(configFile),
                "test_delegation_token_instance_principal");
    }
}
