/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.ssl.SSLInitializationException;
import org.glassfish.jersey.apache.connector.ApacheConnectorProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.junit.Test;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

public class ApacheConnectorPropertiesClientConfigDecoratorTest {
    @Test
    public void sslInitializationExceptionPropagates() {
        final SSLInitializationException expected =
                new SSLInitializationException("Unable to initialize SSL", null);
        final ClientConfig clientConfig =
                new ClientConfig().connectorProvider(new ApacheConnectorProvider());
        final ApacheConnectorPropertiesClientConfigDecorator decorator =
                new ApacheConnectorPropertiesClientConfigDecorator(
                        ApacheConnectorProperties.builder().build()) {
                    @Override
                    SSLConnectionSocketFactory getSslConnectionSocketFactory() {
                        throw expected;
                    }
                };

        try {
            decorator.customizeClientConfig(clientConfig);
            fail("Expected SSLInitializationException");
        } catch (SSLInitializationException actual) {
            assertSame(expected, actual);
        }
    }
}
