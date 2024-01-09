/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.okeworkloadidentity;

import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AbstractFederationClientAuthenticationDetailsProviderBuilder;
import com.oracle.bmc.auth.AbstractRequestingAuthenticationDetailsProvider;
import com.oracle.bmc.auth.AuthCachingPolicy;
import com.oracle.bmc.auth.DefaultServiceAccountTokenProvider;
import com.oracle.bmc.auth.ProvidesConfigurableRefresh;
import com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider;
import com.oracle.bmc.auth.RegionProvider;
import com.oracle.bmc.auth.ServiceAccountTokenSupplier;
import com.oracle.bmc.auth.SessionKeySupplier;
import com.oracle.bmc.auth.SuppliedServiceAccountTokenProvider;
import com.oracle.bmc.auth.internal.FederationClient;
import com.oracle.bmc.auth.okeworkloadidentity.internal.OkeTenancyOnlyAuthenticationDetailsProvider;
import com.oracle.bmc.auth.okeworkloadidentity.internal.OkeWorkloadIdentityResourcePrincipalsFederationClient;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.client.StandardClientProperties;
import org.slf4j.Logger;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManagerFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of OkeWorkloadIdentityAuthenticationDetailsProvider. This provider can only be
 * used inside pods.
 *
 * <p>Also uses {@link AuthCachingPolicy} to disable caching (as the values for signing requests
 * will be rotated periodically).
 */
@AuthCachingPolicy(cacheKeyId = false, cachePrivateKey = false)
public class OkeWorkloadIdentityAuthenticationDetailsProvider
        extends AbstractRequestingAuthenticationDetailsProvider
        implements RegionProvider,
                RefreshableOnNotAuthenticatedProvider<String>,
                ProvidesConfigurableRefresh {

    /**
     * Returns the region where the java code using oke workload identity resource principal
     * authentication is running at
     *
     * @return Region object.
     */
    private final Region region;

    /** Default path for reading Kubernetes service account cert. */
    private static final String DEFAULT_KUBERNETES_SERVICE_ACCOUNT_CERT_PATH =
            "/var/run/secrets/kubernetes.io/serviceaccount/ca.crt";

    /** Environment variable of the path for Kubernetes service account cert. */
    private static final String KUBERNETES_SERVICE_ACCOUNT_CERT_PATH_ENV =
            "OCI_KUBERNETES_SERVICE_ACCOUNT_CERT_PATH";
    /**
     * Constructor of OkeWorkloadIdentityAuthenticationDetailsProvider.
     *
     * @param federationClient federation client implementation.
     * @param sessionKeySupplier session key supplier implementation.
     * @param region the region
     */
    private OkeWorkloadIdentityAuthenticationDetailsProvider(
            FederationClient federationClient,
            SessionKeySupplier sessionKeySupplier,
            Region region) {
        super(federationClient, sessionKeySupplier);
        this.region = region;
    }

    /**
     * Creates a new OkeWorkloadIdentityAuthenticationDetailsProvider.
     *
     * @return A new builder instance.
     */
    public static OkeWorkloadIdentityAuthenticationDetailsProvider
                    .OkeWorkloadIdentityAuthenticationDetailsProviderBuilder
            builder() {
        return new OkeWorkloadIdentityAuthenticationDetailsProvider
                .OkeWorkloadIdentityAuthenticationDetailsProviderBuilder();
    }

    /**
     * Refreshes the authentication data used by the provider
     *
     * @return the refreshed authentication data
     */
    @Override
    public String refresh() {
        return federationClient.refreshAndGetSecurityToken();
    }

    public Region getRegion() {
        return this.region;
    }

    @Override
    public String refreshAndGetSecurityTokenIfExpiringWithin(Duration time) {
        if (this.federationClient instanceof ProvidesConfigurableRefresh) {
            return ((ProvidesConfigurableRefresh) this.federationClient)
                    .refreshAndGetSecurityTokenIfExpiringWithin(time);
        }
        return this.federationClient.refreshAndGetSecurityToken();
    }

    @Override
    public String refreshAndGetSecurityTokenIfExpiringWithin(Duration time, boolean refreshKeys) {
        if (this.federationClient instanceof ProvidesConfigurableRefresh) {
            return ((ProvidesConfigurableRefresh) this.federationClient)
                    .refreshAndGetSecurityTokenIfExpiringWithin(time, refreshKeys);
        }
        return this.federationClient.refreshAndGetSecurityToken();
    }

    /** Builder for OkeWorkloadIdentityAuthenticationDetailsProviderBuilder. */
    public static class OkeWorkloadIdentityAuthenticationDetailsProviderBuilder
            extends AbstractFederationClientAuthenticationDetailsProviderBuilder<
                    OkeWorkloadIdentityAuthenticationDetailsProviderBuilder,
                    OkeWorkloadIdentityAuthenticationDetailsProvider> {

        /** The configuration for the circuit breaker. */
        private CircuitBreakerConfiguration circuitBreakerConfig;

        private ServiceAccountTokenSupplier serviceAccountTokenSupplier;

        public OkeWorkloadIdentityAuthenticationDetailsProviderBuilder() {
            this.serviceAccountTokenSupplier = new DefaultServiceAccountTokenProvider();
        }

        /**
         * Configures the tenancyId to use. Used for constructing
         * KeyPairAuthenticationDetailsProvider, it is not used by actual.
         *
         * @param tenancyId
         * @return OkeWorkloadIdentityAuthenticationDetailsProviderBuilder
         */
        public OkeWorkloadIdentityAuthenticationDetailsProviderBuilder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            return this;
        }

        /** Sets value for the circuit breaker configuration". */
        public OkeWorkloadIdentityAuthenticationDetailsProviderBuilder circuitBreakerConfig(
                CircuitBreakerConfiguration circuitBreakerConfig) {
            this.circuitBreakerConfig = circuitBreakerConfig;
            return this;
        }

        /** Sets value for the kubernetes service account token */
        public OkeWorkloadIdentityAuthenticationDetailsProviderBuilder token(String token) {
            this.serviceAccountTokenSupplier = new SuppliedServiceAccountTokenProvider(token);
            return this;
        }

        /** Sets value for the path of kubernetes service account token */
        public OkeWorkloadIdentityAuthenticationDetailsProviderBuilder tokenPath(String tokenPath) {
            this.serviceAccountTokenSupplier = new DefaultServiceAccountTokenProvider(tokenPath);
            return this;
        }

        /** Sets the kubernetes service account token supplier */
        public OkeWorkloadIdentityAuthenticationDetailsProviderBuilder tokenPath(
                ServiceAccountTokenSupplier serviceAccountTokenSupplier) {
            this.serviceAccountTokenSupplier = serviceAccountTokenSupplier;
            return this;
        }

        /**
         * Build a new OkeWorkloadIdentityAuthenticationDetailsProvider.
         *
         * @return A new provider instance.
         */
        public OkeWorkloadIdentityAuthenticationDetailsProvider build() {
            // autodetect region
            autoDetectEndpointUsingMetadataUrl();

            return super.build();
        }

        @Override
        protected FederationClient createFederationClient(SessionKeySupplier sessionKeySupplier) {
            OkeTenancyOnlyAuthenticationDetailsProvider provider =
                    new OkeTenancyOnlyAuthenticationDetailsProvider();

            // Set ca cert when talking to proxymux using https.
            SSLContext sslCtx;
            String kubernetesCaCertPath =
                    System.getenv(KUBERNETES_SERVICE_ACCOUNT_CERT_PATH_ENV) != null
                            ? System.getenv(KUBERNETES_SERVICE_ACCOUNT_CERT_PATH_ENV)
                            : DEFAULT_KUBERNETES_SERVICE_ACCOUNT_CERT_PATH;
            if (Files.exists(Paths.get(kubernetesCaCertPath))) {
                InputStream inputStream = null;
                try {
                    inputStream = new FileInputStream(Paths.get(kubernetesCaCertPath).toFile());
                    CertificateFactory certFactory = CertificateFactory.getInstance("X.509");
                    X509Certificate certificate =
                            (X509Certificate) certFactory.generateCertificate(inputStream);

                    KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                    keyStore.load(null, null);
                    TrustManagerFactory tmf =
                            TrustManagerFactory.getInstance(
                                    TrustManagerFactory.getDefaultAlgorithm());
                    keyStore.setCertificateEntry("ocp-cert", certificate);
                    tmf.init(keyStore);
                    sslCtx = SSLContext.getInstance("TLS");
                    sslCtx.init(null, tmf.getTrustManagers(), null);
                } catch (CertificateException e) {
                    throw new IllegalArgumentException(
                            "Invalid Kubernetes ca certification. Please contact OKE Foundation team for help.",
                            e);
                } catch (FileNotFoundException e) {
                    throw new IllegalArgumentException(
                            "Kubernetes service account ca cert doesn't exist.", e);
                } catch (KeyStoreException e) {
                    throw new IllegalArgumentException(
                            "Cannot create keystore based on Kubernetes ca cert. Please contact OKE Foundation team for help.",
                            e);
                } catch (IOException e) {
                    throw new IllegalArgumentException(
                            "Cannot load keystore. Please contact OKE Foundation team for help.",
                            e);
                } catch (NoSuchAlgorithmException e) {
                    throw new IllegalArgumentException(
                            "Cannot load keystore. Please contact OKE Foundation team for help.",
                            e);
                } catch (KeyManagementException e) {
                    throw new IllegalArgumentException(
                            "Failed to load ssl context when trying to request rpst token. Please contact OKE Foundation team for help.",
                            e);
                } finally {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        throw new RuntimeException(
                                "Kubernetes service account ca cert doesn't exist.", e);
                    }
                }
            } else {
                throw new IllegalArgumentException(
                        "Kubernetes service account ca cert doesn't exist.");
            }

            ClientConfigurator configurator =
                    builder -> {
                        builder.property(
                                StandardClientProperties.HOSTNAME_VERIFIER,
                                new javax.net.ssl.HostnameVerifier() {
                                    @Override
                                    public boolean verify(String s, SSLSession sslSession) {
                                        return true;
                                    }

                                    @Override
                                    public final String toString() {
                                        return "NO_OP";
                                    }
                                });
                        builder.property(StandardClientProperties.SSL_CONTEXT, sslCtx);
                        builder.property(StandardClientProperties.BUFFER_REQUEST, false);
                    };

            List<ClientConfigurator> additionalConfigurators = new ArrayList<>();
            if (this.federationClientConfigurator != null) {
                additionalConfigurators.add(this.federationClientConfigurator);
            }
            additionalConfigurators.addAll(this.additionalFederationClientConfigurators);

            // create federation client
            return new OkeWorkloadIdentityResourcePrincipalsFederationClient(
                    sessionKeySupplier,
                    serviceAccountTokenSupplier,
                    provider,
                    configurator,
                    circuitBreakerConfig,
                    additionalConfigurators);
        }

        @Override
        protected OkeWorkloadIdentityAuthenticationDetailsProvider buildProvider(
                SessionKeySupplier sessionKeySupplierToUse) {
            return new OkeWorkloadIdentityAuthenticationDetailsProvider(
                    federationClient, sessionKeySupplierToUse, region);
        }
    }
}
