/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import org.glassfish.jersey.logging.LoggingFeature;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import javax.ws.rs.client.Client;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class AbstractFederationClientAuthenticationDetailsProviderBuilderTest {

    @Test
    public void registerExtraIMDSLoggingIfEnabled_shouldRegisterPayloadLoggingWhenFlagIsEnabled() {
        Client client = mock(Client.class);
        ArgumentCaptor<Object> featureCaptor = ArgumentCaptor.forClass(Object.class);

        Assert.assertTrue(
                AbstractFederationClientAuthenticationDetailsProviderBuilder
                        .registerExtraImdsLoggingIfEnabled(client, "true"));

        verify(client).register(featureCaptor.capture());
        Assert.assertTrue(featureCaptor.getValue() instanceof LoggingFeature);
        Assert.assertEquals(
                LoggingFeature.Verbosity.PAYLOAD_TEXT,
                AbstractFederationClientAuthenticationDetailsProviderBuilder
                        .EXTRA_IMDS_LOGGING_VERBOSITY);
    }

    @Test
    public void registerExtraIMDSLoggingIfEnabled_shouldNotRegisterLoggingWhenFlagIsDisabled() {
        Client client = mock(Client.class);

        Assert.assertFalse(
                AbstractFederationClientAuthenticationDetailsProviderBuilder
                        .registerExtraImdsLoggingIfEnabled(client, "false"));

        verify(client, never()).register(org.mockito.Matchers.any());
    }
}
