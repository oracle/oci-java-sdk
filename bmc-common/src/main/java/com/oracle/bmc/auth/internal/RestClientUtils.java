/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth.internal;

import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.oracle.bmc.auth.X509CertificateSupplier;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.internal.RestClient;
import com.oracle.bmc.http.internal.RestClientFactory;
import com.oracle.bmc.http.internal.RestClientFactoryBuilder;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.http.signing.internal.Constants;
import com.oracle.bmc.http.signing.internal.KeySupplier;
import com.oracle.bmc.http.signing.internal.RequestSignerImpl;

import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPrivateKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Utilities for {@link RestClient}.
 */
public class RestClientUtils {
    static RestClient createRestClient(
            String endpoint,
            ClientConfigurator clientConfigurator,
            final String tenancyId,
            final X509CertificateSupplier leafCertificateSupplier) {
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

        return createRestClient(endpoint, clientConfigurator, keySupplier, keyIdSupplier);
    }

    static RestClient createRestClient(
            String endpoint,
            ClientConfigurator clientConfigurator,
            final X509FederationClient federationClient) {
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

        return createRestClient(endpoint, clientConfigurator, keySupplier, keyIdSupplier);
    }

    private static RestClient createRestClient(
            String endpoint,
            ClientConfigurator clientConfigurator,
            KeySupplier<RSAPrivateKey> keySupplier,
            Supplier<String> keyIdSupplier) {

        // for the federation endpoint, do not sign the HOST header right now
        List<String> genericHeaders = removeHostHeader(Constants.GENERIC_HEADERS);
        List<String> allHeaders = removeHostHeader(Constants.ALL_HEADERS);
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
                RestClientFactoryBuilder.builder().clientConfigurator(clientConfigurator).build();
        RestClient restClient = restClientFactory.create(requestSigner);
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
