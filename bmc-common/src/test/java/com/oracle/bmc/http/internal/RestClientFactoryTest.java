/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import java.util.Arrays;
import java.util.Collections;

import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.circuitbreaker.internal.JaxRsCircuitBreakerImpl;
import com.oracle.bmc.http.CompositeClientConfigurator;
import com.oracle.bmc.util.CircuitBreakerUtils;
import org.glassfish.jersey.client.JerseyClient;
import org.glassfish.jersey.internal.InternalProperties;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
                                new CompositeClientConfigurator(
                                        Collections.unmodifiableList(Arrays.asList())));

        assertEquals(
                "JacksonFeature",
                client.getConfiguration().getProperty(InternalProperties.JSON_FEATURE));
    }

    @Test
    public void validateCircuitBreakerSetUsingCircuitBreakerConfigurationInClientConfiguration() {
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
    public void
            validateCircuitBreakerNotSetUsingCircuitBreakerConfigurationInClientConfiguration() {
        RestClient client =
                RestClientFactoryBuilder.builder()
                        .build()
                        .create(
                                null,
                                null,
                                ClientConfiguration.builder()
                                        .circuitBreakerConfiguration(
                                                CircuitBreakerUtils
                                                        .getNoCircuitBreakerConfiguration())
                                        .build());
        Assert.assertNull(client.circuitBreaker);
    }

    @Test
    public void validateCircuitBreakerSetUsingCircuitBreakerInClientConfiguration() {
        RestClient client =
                RestClientFactoryBuilder.builder()
                        .build()
                        .create(
                                null,
                                null,
                                ClientConfiguration.builder()
                                        .circuitBreaker(
                                                new JaxRsCircuitBreakerImpl(
                                                        CircuitBreakerConfiguration.builder()
                                                                .build()))
                                        .build());
        Assert.assertNotNull(client.circuitBreaker);
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateExceptionWhenBothCircuitBreakerAndCircuitBreakerConfigSet() {
        RestClient client =
                RestClientFactoryBuilder.builder()
                        .build()
                        .create(
                                null,
                                null,
                                ClientConfiguration.builder()
                                        .circuitBreaker(
                                                new JaxRsCircuitBreakerImpl(
                                                        CircuitBreakerConfiguration.builder()
                                                                .build()))
                                        .circuitBreakerConfiguration(
                                                CircuitBreakerConfiguration.builder().build())
                                        .build());
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
                                null,
                                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);
        Assert.assertNotNull(client.circuitBreaker);
    }

    @Test
    public void validateNoCircuitBreakerIsSet() {
        RestClient client =
                RestClientFactoryBuilder.builder()
                        .build()
                        .create(
                                null,
                                null,
                                ClientConfiguration.builder().build(),
                                false,
                                null,
                                CircuitBreakerUtils.getNoCircuitBreakerConfiguration());
        Assert.assertNull(client.circuitBreaker);
    }
}
