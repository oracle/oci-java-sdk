/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.oracle.bmc.auth.internal.FederationClient;
import com.oracle.bmc.auth.internal.X509FederationClient;
import com.oracle.bmc.http.ClientConfigurator;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.github.tomakehurst.wiremock.client.WireMock.verify;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
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

        public String exposedAutoDetectEndpointUsingMetadataUrl() {
            return this.autoDetectEndpointUsingMetadataUrl();
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

        public String exposedAutoDetectEndpointUsingMetadataUrl() {
            return this.autoDetectEndpointUsingMetadataUrl();
        }

        protected String getDisableDefaultCircuitBreakerOverride() {
            return " "; // or whatever value you want for a specific test
        }
    }

    @Mock SessionKeySupplier mockSessionKeySupplier;
    TestFederationClientBuilder builder;
    TestFederationClientBuilderWithNoEnvVariableSet builderWithNoEnvVariableSet;

    @Rule public WireMockRule mockMetadata = new WireMockRule(wireMockConfig().dynamicPort());

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

    @Test
    public void testMetadataClientConfiguratorUsedForRegionLookup() {
        ClientConfigurator metadataConfigurator =
                httpClientBuilder ->
                        httpClientBuilder.registerRequestInterceptor(
                                0, request -> request.header("X-Test-Metadata", "configured"));

        stubFor(
                get(urlEqualTo("/opc/v2/instance/region"))
                        .withHeader("X-Test-Metadata", equalTo("configured"))
                        .willReturn(aResponse().withStatus(200).withBody("us-ashburn-1")));

        builder = new TestFederationClientBuilder();
        builder.metadataBaseUrl("http://localhost:" + mockMetadata.port() + "/opc/v2/")
                .federationClientMetadataConfigurator(metadataConfigurator)
                .detectEndpointRetries(0)
                .timeoutForEachRetry(1);

        String endpoint = builder.exposedAutoDetectEndpointUsingMetadataUrl();

        assertNotNull(endpoint);
        assertTrue(endpoint.contains("auth"));
        verify(
                2,
                getRequestedFor(urlEqualTo("/opc/v2/instance/region"))
                        .withHeader("X-Test-Metadata", equalTo("configured")));
    }
}
