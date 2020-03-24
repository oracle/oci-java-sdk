/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

import static org.junit.Assert.assertEquals;

import com.google.common.collect.ImmutableList;
import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.http.CompositeClientConfigurator;
import org.glassfish.jersey.client.JerseyClient;
import org.glassfish.jersey.internal.InternalProperties;
import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.client.Client;

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
    public void validateCircuitBreakerIsSetToNullWhenNotConfigured() {
        RestClient client =
                RestClientFactoryBuilder.builder()
                        .build()
                        .create(null, null, ClientConfiguration.builder().build());
        Assert.assertNull(client.circuitBreaker);
    }
}
