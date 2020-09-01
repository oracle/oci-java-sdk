/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.auth.X509CertificateSupplier;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.internal.RestClient;
import com.oracle.bmc.http.internal.RestClientFactory;
import com.oracle.bmc.http.internal.RestClientFactoryBuilder;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.http.signing.SigningStrategy;
import com.oracle.bmc.http.signing.internal.Constants;
import com.oracle.bmc.http.signing.internal.KeySupplier;
import com.oracle.bmc.http.signing.internal.RequestSignerImpl;

import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPrivateKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Utilities for {@link RestClient}.
 */
public class RestClientUtils {
    static RestClient createRestClient(
            String endpoint,
            ClientConfigurator clientConfigurator,
            List<ClientConfigurator> additionalClientConfigurators,
            final String tenancyId,
            final X509CertificateSupplier leafCertificateSupplier,
            CircuitBreakerConfiguration circuitBreakerConfiguration) {
        // load the leaf certificate details dynamically on each invocation in case it has changed, ex, rotated.
        // NOTE: because the signer calls both of these independently, there is an edge case where the certificate
        // has been rotated and the private key and keyId won't match -- that should be taken care of by a retry
        // of the service call.
        KeySupplier<RSAPrivateKey> keySupplier =
                new KeySupplier<RSAPrivateKey>() {
                    @Override
                    public Optional<RSAPrivateKey> getKey(String keyId) {
                        return Optional.of(
                                leafCertificateSupplier.getCertificateAndKeyPair().getPrivateKey());
                    }
                };
        Supplier<String> keyIdSupplier =
                new Supplier<String>() {
                    @Override
                    public String get() {
                        return keyIdForX509Request(
                                tenancyId,
                                leafCertificateSupplier
                                        .getCertificateAndKeyPair()
                                        .getCertificate());
                    }
                };

        return createRestClient(
                endpoint,
                clientConfigurator,
                additionalClientConfigurators,
                keySupplier,
                keyIdSupplier,
                circuitBreakerConfiguration);
    }

    static RestClient createRestClient(
            String endpoint,
            ClientConfigurator clientConfigurator,
            List<ClientConfigurator> additionalClientConfigurators,
            final X509FederationClient federationClient,
            CircuitBreakerConfiguration circuitBreakerConfiguration) {
        // load the leaf certificate details dynamically on each invocation in case it has changed, ex, rotated.
        // NOTE: because the signer calls both of these independently, there is an edge case where the certificate
        // has been rotated and the private key and keyId won't match -- that should be taken care of by a retry
        // of the service call.
        KeySupplier<RSAPrivateKey> keySupplier =
                new KeySupplier<RSAPrivateKey>() {
                    @Override
                    public Optional<RSAPrivateKey> getKey(String keyId) {
                        return Optional.of(
                                federationClient
                                        .getLeafCertificateSupplier()
                                        .getCertificateAndKeyPair()
                                        .getPrivateKey());
                    }
                };
        Supplier<String> keyIdSupplier =
                new Supplier<String>() {
                    @Override
                    public String get() {
                        return keyIdForX509Request(
                                federationClient.getTenancyId(),
                                federationClient
                                        .getLeafCertificateSupplier()
                                        .getCertificateAndKeyPair()
                                        .getCertificate());
                    }
                };

        return createRestClient(
                endpoint,
                clientConfigurator,
                additionalClientConfigurators,
                keySupplier,
                keyIdSupplier,
                circuitBreakerConfiguration);
    }

    private static RestClient createRestClient(
            String endpoint,
            ClientConfigurator clientConfigurator,
            List<ClientConfigurator> additionalClientConfigurators,
            KeySupplier<RSAPrivateKey> keySupplier,
            Supplier<String> keyIdSupplier,
            CircuitBreakerConfiguration circuitBreakerConfiguration) {

        // for the federation endpoint, do not sign the HOST header right now
        List<String> genericHeaders = removeHostHeader(Constants.GENERIC_HEADERS);
        List<String> allHeaders = removeHostHeader(Constants.ALL_HEADERS);
        ClientConfiguration clientConfiguration = null;

        Map<String, List<String>> headersToSign =
                Constants.createHeadersToSignMap(
                        genericHeaders,
                        genericHeaders,
                        genericHeaders,
                        allHeaders,
                        allHeaders,
                        allHeaders);

        RequestSignerImpl.SigningConfiguration signingConfiguration =
                new RequestSignerImpl.SigningConfiguration(
                        headersToSign, Constants.OPTIONAL_SIGNING_HEADERS, false);

        RequestSigner requestSigner =
                new RequestSignerImpl(keySupplier, signingConfiguration, keyIdSupplier);

        RestClientFactory restClientFactory =
                RestClientFactoryBuilder.builder()
                        .clientConfigurator(clientConfigurator)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .build();

        if (circuitBreakerConfiguration != null) {
            clientConfiguration =
                    ClientConfiguration.builder()
                            .circuitBreakerConfiguration(circuitBreakerConfiguration)
                            .build();
        }

        RestClient restClient =
                restClientFactory.create(
                        requestSigner,
                        Collections.<SigningStrategy, RequestSigner>emptyMap(),
                        clientConfiguration);
        restClient.setEndpoint(endpoint);
        return restClient;
    }

    private static List<String> removeHostHeader(List<String> headers) {
        List<String> copy = new ArrayList<>();
        for (String header : headers) {
            if (!header.equals(Constants.HOST)) {
                copy.add(header);
            }
        }
        return copy;
    }

    private static String keyIdForX509Request(String tenancyId, X509Certificate certificate) {
        return String.format("%s/fed-x509/%s", tenancyId, AuthUtils.getFingerPrint(certificate));
    }
}
