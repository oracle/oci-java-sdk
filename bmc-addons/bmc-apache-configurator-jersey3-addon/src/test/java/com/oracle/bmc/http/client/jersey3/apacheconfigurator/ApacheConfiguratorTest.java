/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey3.apacheconfigurator;

import com.oracle.bmc.http.client.HttpClientBuilder;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.ssl.SSLInitializationException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

@RunWith(PowerMockRunner.class)
@PrepareForTest(SSLConnectionSocketFactory.class)
public class ApacheConfiguratorTest {
    @Test
    public void sslInitializationExceptionPropagates() {
        final SSLInitializationException expected =
                new SSLInitializationException("Unable to initialize SSL", null);
        PowerMockito.mockStatic(SSLConnectionSocketFactory.class);
        PowerMockito.when(SSLConnectionSocketFactory.getSocketFactory()).thenThrow(expected);

        try {
            new ApacheConfigurator().customizeClient(mock(HttpClientBuilder.class));
            fail("Expected SSLInitializationException");
        } catch (SSLInitializationException actual) {
            assertSame(expected, actual);
        }
    }
}
