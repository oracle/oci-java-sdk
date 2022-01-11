/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import static org.junit.Assert.assertEquals;

import com.google.common.collect.ImmutableList;
import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.helper.EnvironmentVariablesHelper;
import com.oracle.bmc.http.CompositeClientConfigurator;
import com.oracle.bmc.util.CircuitBreakerUtils;
import org.glassfish.jersey.client.JerseyClient;
import org.glassfish.jersey.internal.InternalProperties;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class RestClientFactoryTest {
    @Test
    public void isJacksonFeatureRegistered() {
        // The SDK uses the JerseyClient
        final JerseyClient client =
                (JerseyClient)
                        RestClientFactory.createClient(
                                null,
                                null,
                                ClientConfiguration.builder()
                                        .circuitBreakerConfiguration(
                                                CircuitBreakerConfiguration.builder().build())
                                        .build(),
                                new CompositeClientConfigurator(ImmutableList.of()));

        assertEquals(
                "JacksonFeature",
                client.getConfiguration().getProperty(InternalProperties.JSON_FEATURE));
    }

    @Test
    public void validateCircuitBreakerInitialized() {
        RestClient client =
                RestClientFactoryBuilder.builder()
                        .build()
                        .create(
                                null,
                                null,
                                ClientConfiguration.builder()
                                        .circuitBreakerConfiguration(
                                                CircuitBreakerConfiguration.builder().build())
                                        .build());
        Assert.assertNotNull(client.circuitBreaker);
    }

    @Test
    public void validateDefaultCircuitBreakerIsSet() {
        RestClient client =
                RestClientFactoryBuilder.builder()
                        .build()
                        .create(
                                null,
                                null,
                                ClientConfiguration.builder().build(),
                                false,
                                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER);
        Assert.assertNotNull(client.circuitBreaker);
    }

    @Test
    public void validateDefaultCircuitBreakerIsNotSetWhenEnvVariableIsFalse() throws Exception {
        Map<String, String> newEnvMap = new HashMap<>();
        newEnvMap.put("OCI_SDK_DEFAULT_CIRCUITBREAKER_ENABLED", "False");
        EnvironmentVariablesHelper.setEnvironmentVariable(newEnvMap);
        RestClient client =
                RestClientFactoryBuilder.builder()
                        .build()
                        .create(null, null, ClientConfiguration.builder().build());
        Assert.assertNull(client.circuitBreaker);
    }
}
