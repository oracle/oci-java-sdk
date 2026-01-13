/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import com.oracle.bmc.auth.internal.FederationClient;
import com.oracle.bmc.auth.internal.X509FederationClient;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TestAbstractFederationClientAuthenticationDetailsProviderBuilder {

    class TestFederationClientBuilder
            extends AbstractFederationClientAuthenticationDetailsProviderBuilder<
                    TestFederationClientBuilder, AbstractAuthenticationDetailsProvider> {
        @Override
        protected AbstractAuthenticationDetailsProvider buildProvider(
                SessionKeySupplier sessionKeySupplierToUse) {
            return null;
        }

        public FederationClient exposedCreateFederationClient(
                SessionKeySupplier sessionKeySupplier) {
            return this.createFederationClient(sessionKeySupplier);
        }

        protected String getDisableDefaultCircuitBreakerOverride() {
            return "true";
        }
    }

    class TestFederationClientBuilderWithNoEnvVariableSet
            extends AbstractFederationClientAuthenticationDetailsProviderBuilder<
                    TestFederationClientBuilderWithNoEnvVariableSet,
                    AbstractAuthenticationDetailsProvider> {

        @Override
        protected AbstractAuthenticationDetailsProvider buildProvider(
                SessionKeySupplier sessionKeySupplierToUse) {
            return null; // Not relevant for this test
        }

        public FederationClient exposedCreateFederationClient(
                SessionKeySupplier sessionKeySupplier) {
            return this.createFederationClient(sessionKeySupplier);
        }

        protected String getDisableDefaultCircuitBreakerOverride() {
            return " "; // or whatever value you want for a specific test
        }
    }

    @Mock SessionKeySupplier mockSessionKeySupplier;
    TestFederationClientBuilder builder;
    TestFederationClientBuilderWithNoEnvVariableSet builderWithNoEnvVariableSet;

    @Test
    public void testCreateFederationClient_DefaultConfig() {
        MockitoAnnotations.initMocks(this);
        builderWithNoEnvVariableSet = new TestFederationClientBuilderWithNoEnvVariableSet();
        builderWithNoEnvVariableSet
                .federationEndpoint("https://auth.example.com")
                .tenancyId("ocid1.tenancy.oc1..exampleuniqueID")
                .leafCertificateSupplier(Mockito.mock(X509CertificateSupplier.class));
        FederationClient client =
                builderWithNoEnvVariableSet.exposedCreateFederationClient(mockSessionKeySupplier);
        assertNotNull(client);
        assertTrue(client instanceof X509FederationClient);
    }

    @Test
    public void testCreateFederationClient_NoCircuitBreakerConfig() {
        MockitoAnnotations.initMocks(this);
        builder = new TestFederationClientBuilder();
        builder.federationEndpoint("https://auth.example.com")
                .tenancyId("ocid1.tenancy.oc1..exampleuniqueID")
                .leafCertificateSupplier(Mockito.mock(X509CertificateSupplier.class));
        FederationClient client = builder.exposedCreateFederationClient(mockSessionKeySupplier);
        assertNotNull(client);
        assertTrue(client instanceof X509FederationClient);
    }
}
