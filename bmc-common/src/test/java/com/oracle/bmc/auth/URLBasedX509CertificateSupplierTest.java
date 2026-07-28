/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.oracle.bmc.http.ClientConfigurator;
import org.junit.Rule;
import org.junit.Test;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.github.tomakehurst.wiremock.client.WireMock.verify;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.junit.Assert.assertNotNull;

public class URLBasedX509CertificateSupplierTest {

    @Rule
    public WireMockRule mockService =
            new WireMockRule(
                    wireMockConfig().jettyAcceptors(10).containerThreads(25).dynamicPort());

    @Test
    public void testClientConfiguratorUsedForHttpResourceFetches() throws Exception {
        String certificateBody =
                new String(Files.readAllBytes(Paths.get("src/test/resources/cert.pem")));
        String keyBody = new String(Files.readAllBytes(Paths.get("src/test/resources/key.pem")));

        stubFor(
                get(urlEqualTo("/cert.pem"))
                        .withHeader("X-Test-Configurator", equalTo("configured"))
                        .willReturn(aResponse().withStatus(200).withBody(certificateBody)));
        stubFor(
                get(urlEqualTo("/key.pem"))
                        .withHeader("X-Test-Configurator", equalTo("configured"))
                        .willReturn(aResponse().withStatus(200).withBody(keyBody)));

        ClientConfigurator clientConfigurator =
                httpClientBuilder ->
                        httpClientBuilder.registerRequestInterceptor(
                                0, request -> request.header("X-Test-Configurator", "configured"));

        URLBasedX509CertificateSupplier supplier =
                new URLBasedX509CertificateSupplier(
                        new URL("http://localhost:" + mockService.port() + "/cert.pem"),
                        new URL("http://localhost:" + mockService.port() + "/key.pem"),
                        (char[]) null,
                        clientConfigurator);

        assertNotNull(supplier.getCertificateAndKeyPair().getCertificate());
        assertNotNull(supplier.getCertificateAndKeyPair().getPrivateKey());

        verify(
                getRequestedFor(urlEqualTo("/cert.pem"))
                        .withHeader("X-Test-Configurator", equalTo("configured")));
        verify(
                getRequestedFor(urlEqualTo("/key.pem"))
                        .withHeader("X-Test-Configurator", equalTo("configured")));
    }
}
