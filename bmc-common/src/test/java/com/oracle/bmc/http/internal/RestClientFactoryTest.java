/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

import static org.junit.Assert.assertEquals;

import com.google.common.collect.ImmutableList;
import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.http.CompositeClientConfigurator;
import org.glassfish.jersey.client.JerseyClient;
import org.glassfish.jersey.internal.InternalProperties;
import org.junit.Test;

public class RestClientFactoryTest {
    @Test
    public void isJacksonFeatureRegistered() {
        // The SDK uses the JerseyClient
        final JerseyClient client =
                (JerseyClient)
                        RestClientFactory.createClient(
                                null,
                                null,
                                ClientConfiguration.builder().build(),
                                new CompositeClientConfigurator(ImmutableList.of()));

        assertEquals(
                "JacksonFeature",
                client.getConfiguration().getProperty(InternalProperties.JSON_FEATURE));
    }
}
