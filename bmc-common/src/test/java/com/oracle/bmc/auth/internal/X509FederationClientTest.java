/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.oracle.bmc.auth.SessionKeySupplier;
import com.oracle.bmc.auth.X509CertificateSupplier;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.client.Options;
import com.oracle.bmc.http.client.Serializer;
import com.oracle.bmc.http.signing.internal.PEMFileRSAPrivateKeySupplier;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.util.CircuitBreakerUtils;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyPair;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPrivateKey;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static com.github.tomakehurst.wiremock.stubbing.Scenario.STARTED;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class X509FederationClientTest {

    private X509FederationClient clientUnderTest;
    private X509FederationClient.X509FederationRequest federationRequest;
    private boolean originalSyncRequestsAsyncCoreThreadTimeoutEnabled;

    @Rule
    public WireMockRule mockService =
            new WireMockRule(
                    wireMockConfig().jettyAcceptors(10).containerThreads(25).dynamicPort());

    @Before
    public void setUp() throws IOException {
        originalSyncRequestsAsyncCoreThreadTimeoutEnabled =
                Options.isSyncRequestsAsyncCoreThreadTimeoutEnabled();

        SessionKeySupplier sessionKeySupplier =
                new SessionKeySupplier() {
                    @Override
                    public KeyPair getKeyPair() {
                        return mock(KeyPair.class);
                    }

                    @Override
                    public void refreshKeys() {}
                };

        X509CertificateSupplier certificateSupplier =
                new X509CertificateSupplier() {
                    @Override
                    public X509Certificate getCertificate() {
                        return Objects.requireNonNull(getCertificateAndKeyPair()).getCertificate();
                    }

                    @Override
                    public RSAPrivateKey getPrivateKey() {
                        return Objects.requireNonNull(getCertificateAndKeyPair()).getPrivateKey();
                    }

                    @Override
                    public CertificateAndPrivateKeyPair getCertificateAndKeyPair() {
                        try {
                            InputStream fakeCert =
                                    Files.newInputStream(Paths.get("src/test/resources/cert.pem"));
                            CertificateFactory cf = CertificateFactory.getInstance("X.509");
                            Certificate certificate = cf.generateCertificate(fakeCert);

                            RSAPrivateKey privateKey =
                                    new PEMFileRSAPrivateKeySupplier(
                                                    Files.newInputStream(
                                                            Paths.get(
                                                                    "src/test/resources/key.pem")),
                                                    null)
                                            .supplyKey("unused")
                                            .orElse(null);
                            return new CertificateAndPrivateKeyPair(
                                    (X509Certificate) certificate, privateKey);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return null;
                    }
                };

        clientUnderTest =
                new X509FederationClient(
                        "http://localhost:" + mockService.port(),
                        "tenantId",
                        certificateSupplier,
                        sessionKeySupplier,
                        Collections.emptySet(),
                        mock(ClientConfigurator.class),
                        Collections.emptyList(),
                        CircuitBreakerUtils.getDefaultAuthClientCircuitBreakerConfiguration());

        federationRequest =
                new X509FederationClient.X509FederationRequest(
                        "publicKey",
                        "leafCertificate",
                        Collections.emptySet(),
                        "purpose",
                        "DEFAULT_FINGERPRINT");
    }

    @After
    public void tearDown() throws Exception {
        setSyncRequestsAsyncCoreThreadTimeoutEnabled(
                originalSyncRequestsAsyncCoreThreadTimeoutEnabled);
    }

    @Test
    public void testX509ClientRetriesWithFailure() {
        stubFor(post(urlEqualTo("/v1/x509")).willReturn(WireMock.serverError()));

        try {
            clientUnderTest.makeCall(federationRequest);
        } catch (BmcException e) {
            assertEquals(500, e.getStatusCode());
        }
        // Make sure the X509 client retries 3 times before it errors out
        verify(3, postRequestedFor(urlEqualTo("/v1/x509")));
    }

    @Test
    public void testX509ClientNoRetriesOn4xx() {
        stubFor(post(urlEqualTo("/v1/x509")).willReturn(WireMock.unauthorized()));

        try {
            clientUnderTest.makeCall(federationRequest);
        } catch (BmcException e) {
            assertEquals(401, e.getStatusCode());
        }
        // Make sure the X509 client does not retry on 401
        verify(1, postRequestedFor(urlEqualTo("/v1/x509")));
    }

    @Test
    public void testX509ClientSuccessAfterRetries() {

        stubFor(
                post(urlEqualTo("/v1/x509"))
                        .inScenario("Retry Scenario")
                        .whenScenarioStateIs(STARTED)
                        .willReturn(WireMock.serverError())
                        .willSetStateTo("Second Attempt"));
        stubFor(
                post(urlEqualTo("/v1/x509"))
                        .inScenario("Retry Scenario")
                        .whenScenarioStateIs("Second Attempt")
                        .willReturn(
                                aResponse()
                                        .withStatus(200)
                                        .withHeader("Content-Type", "application/json")
                                        .withBody("{\"token\" : \"abcdef\"}")));

        X509FederationClient.FederationResponseWrapper responseWrapper =
                clientUnderTest.makeCall(federationRequest);

        // Make sure the X509 client called the stub 2 times, 1 successful retry after 500 error
        verify(2, postRequestedFor(urlEqualTo("/v1/x509")));

        // Make sure the token is as expected
        assertEquals("abcdef", responseWrapper.token.getToken());
    }

    @Test
    public void constructorConfiguresAsyncCoreThreadTimeoutFromOptions() throws Exception {
        setSyncRequestsAsyncCoreThreadTimeoutEnabled(true);

        X509FederationClient federationClient =
                new X509FederationClient(
                        "http://localhost:" + mockService.port(),
                        "tenantId",
                        mock(X509CertificateSupplier.class),
                        mock(SessionKeySupplier.class),
                        Collections.emptySet(),
                        mock(ClientConfigurator.class),
                        Collections.emptyList(),
                        CircuitBreakerUtils.getDefaultAuthClientCircuitBreakerConfiguration());

        Object httpClient = getFieldValue(federationClient, "httpClient");
        Object jerseyClient = getFieldValue(httpClient, "client");
        Method getConfiguration = jerseyClient.getClass().getMethod("getConfiguration");
        Object configuration = getConfiguration.invoke(jerseyClient);
        Method getInstances = configuration.getClass().getMethod("getInstances");
        Collection<?> instances = (Collection<?>) getInstances.invoke(configuration);

        Object executorProvider =
                instances.stream()
                        .filter(
                                instance ->
                                        instance.getClass()
                                                .getName()
                                                .endsWith("DaemonClientAsyncExecutorProvider"))
                        .findFirst()
                        .orElse(null);

        assertNotNull("DaemonClientAsyncExecutorProvider was not registered", executorProvider);
        assertTrue(
                "DaemonClientAsyncExecutorProvider should allow core thread timeout",
                (Boolean) getFieldValue(executorProvider, "allowCoreThreadTimeOut"));
    }

    @Test
    public void jacksonCanDeserializeSecurityToken() throws IOException {
        final String strToken = "{\"token\" : \"abcdef\"}";
        // this line will fail on original code if Jackson is not at exactly the right version
        Serializer.getDefault().readValue(strToken, X509FederationClient.SecurityToken.class);
    }

    @Test
    public void jacksonCanRoundTripSecurityToken() throws IOException {
        final X509FederationClient.SecurityToken secToken =
                new X509FederationClient.SecurityToken("abcdef");
        final Serializer serializer = Serializer.getDefault();
        assertEquals(
                secToken.getToken(),
                serializer
                        .readValue(serializer.writeValueAsString(secToken), secToken.getClass())
                        .getToken());
    }

    private static void setSyncRequestsAsyncCoreThreadTimeoutEnabled(boolean enabled)
            throws Exception {
        Field field =
                Options.class.getDeclaredField("SYNC_REQUESTS_ASYNC_CORE_THREAD_TIMEOUT_ENABLED");
        field.setAccessible(true);
        field.setBoolean(null, enabled);
    }

    private static Object getFieldValue(Object object, String fieldName) throws Exception {
        Class<?> type = object.getClass();
        while (type != null) {
            try {
                Field field = type.getDeclaredField(fieldName);
                field.setAccessible(true);
                return field.get(object);
            } catch (NoSuchFieldException e) {
                type = type.getSuperclass();
            }
        }
        throw new NoSuchFieldException(fieldName);
    }
}
