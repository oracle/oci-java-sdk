/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import com.oracle.bmc.InternalSdk;
import com.oracle.bmc.auth.internal.AuthUtils;
import com.oracle.bmc.auth.internal.FederationClient;
import com.oracle.bmc.http.ClientConfigurator;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.KeyPair;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Base class for authentication details providers that make remote requests.
 */
@InternalSdk
public class AbstractRequestingAuthenticationDetailsProvider
        implements BasicAuthenticationDetailsProvider, RequestSignerCacheConfigurationProvider {
    protected final FederationClient federationClient;
    protected final CachingSessionKeySupplier sessionKeySupplier;
    private final RequestSignerCacheConfiguration requestSignerCacheConfiguration;

    public AbstractRequestingAuthenticationDetailsProvider(
            FederationClient federationClient, SessionKeySupplier sessionKeySupplier) {
        this(
                federationClient,
                sessionKeySupplier,
                RequestSignerCacheConfiguration.builder().build());
    }

    public AbstractRequestingAuthenticationDetailsProvider(
            FederationClient federationClient,
            SessionKeySupplier sessionKeySupplier,
            RequestSignerCacheConfiguration requestSignerCacheConfiguration) {
        this.federationClient = federationClient;
        this.sessionKeySupplier = new CachingSessionKeySupplier(sessionKeySupplier);
        this.requestSignerCacheConfiguration =
                requestSignerCacheConfiguration != null
                        ? requestSignerCacheConfiguration
                        : RequestSignerCacheConfiguration.builder().build();
    }

    /**
     * Base class for builders.
     * @param <B> builder class
     */
    protected abstract static class Builder<B extends Builder<B>> {
        protected Set<X509CertificateSupplier> intermediateCertificateSuppliers;
        protected SessionKeySupplier sessionKeySupplier;
        protected ClientConfigurator federationClientConfigurator;
        protected FederationClient federationClient;
        protected List<ClientConfigurator> additionalFederationClientConfigurators =
                new ArrayList<>();
        protected RequestSignerCacheConfiguration requestSignerCacheConfiguration =
                RequestSignerCacheConfiguration.builder().build();

        /**
         * Configures the custom SessionKeySupplier to use.
         */
        public B sessionKeySupplier(SessionKeySupplier sessionKeySupplier) {
            this.sessionKeySupplier = sessionKeySupplier;
            return (B) this;
        }

        /**
         * Configures the set of intermediate certificate suppliers to use, if any.
         */
        public B intermediateCertificateSuppliers(
                Set<X509CertificateSupplier> intermediateCertificateSuppliers) {
            this.intermediateCertificateSuppliers = intermediateCertificateSuppliers;
            return (B) this;
        }

        /**
         * Configures the ClientConfigurator to set on the REST client used by the
         * federation client, if any.
         */
        public B federationClientConfigurator(ClientConfigurator clientConfigurator) {
            this.federationClientConfigurator = clientConfigurator;
            return (B) this;
        }

        /**
         * Add an additional client configurator to be run after the primary configurator.
         * @param additionalClientConfigurator the additional client configurator
         * @return this builder
         */
        public B additionalFederationClientConfigurator(
                @javax.annotation.Nonnull ClientConfigurator additionalClientConfigurator) {
            if (additionalClientConfigurator == null) {
                throw new NullPointerException(
                        "additionalClientConfigurator is marked non-null but is null");
            }
            this.additionalFederationClientConfigurators.add(additionalClientConfigurator);
            return (B) this;
        }

        /**
         * Configures the request signer cache behaviour for providers built by this builder.
         *
         * <p>By default the temporary cache is disabled. Use this method to enable caching and set
         * optional TTLs via {@link RequestSignerCacheConfiguration}.
         *
         * @param requestSignerCacheConfiguration The cache configuration to apply.
         * @return this builder.
         */
        public B requestSignerCacheConfiguration(
                RequestSignerCacheConfiguration requestSignerCacheConfiguration) {
            if (requestSignerCacheConfiguration == null) {
                throw new NullPointerException("requestSignerCacheConfiguration cannot be null");
            }
            this.requestSignerCacheConfiguration = requestSignerCacheConfiguration;
            return (B) this;
        }

        protected RequestSignerCacheConfiguration getRequestSignerCacheConfiguration() {
            return requestSignerCacheConfiguration;
        }
    }

    @Override
    public String getKeyId() {
        return "ST$" + federationClient.getSecurityToken();
    }

    @Override
    public InputStream getPrivateKey() {
        return new ByteArrayInputStream(sessionKeySupplier.getPrivateKeyBytes());
    }

    @Deprecated
    @Override
    public String getPassPhrase() {
        return null;
    }
    /**
     * Returns the optional pass phrase for the (encrypted) private key, as a character array.
     *
     * @return The pass phrase as character array, or null if not applicable
     */
    @Override
    public char[] getPassphraseCharacters() {
        return null;
    }

    @Override
    public RequestSignerCacheConfiguration getRequestSignerCacheConfiguration() {
        return requestSignerCacheConfiguration;
    }

    /**
     * Helper class to cache the private key as bytes so we don't have to parse it every time.
     * The key only changes during calls to refresh.
     * <p>
     * All methods in this class that are called outside of this class should be synchronized.
     */
    protected static class CachingSessionKeySupplier implements SessionKeySupplier {
        private final SessionKeySupplier delegate;
        private RSAPrivateKey lastPrivateKey = null;
        private byte[] privateKeyBytes = null;

        protected CachingSessionKeySupplier(final SessionKeySupplier delegate) {
            this.delegate = delegate;
            Optional.ofNullable(delegate.getKeyPair())
                    .ifPresent(
                            keyPair ->
                                    this.setPrivateKeyBytes((RSAPrivateKey) keyPair.getPrivate()));
        }

        @Override
        public KeyPair getKeyPair() {
            return delegate.getKeyPair();
        }

        @Override
        @Deprecated
        public synchronized RSAPublicKey getPublicKey() {
            return delegate.getPublicKey();
        }

        @Override
        @Deprecated
        public synchronized RSAPrivateKey getPrivateKey() {
            return delegate.getPrivateKey();
        }

        @Override
        public synchronized void refreshKeys() {
            delegate.refreshKeys();
        }

        // private keys can be refreshed asynchronously, always update first
        protected synchronized byte[] getPrivateKeyBytes() {
            setPrivateKeyBytes((RSAPrivateKey) this.getKeyPair().getPrivate());
            return this.privateKeyBytes;
        }

        private void setPrivateKeyBytes(RSAPrivateKey privateKey) {
            // quick shallow ref check only
            if (privateKey != null && privateKey != lastPrivateKey) {
                lastPrivateKey = privateKey;
                this.privateKeyBytes = AuthUtils.toByteArrayFromRSAPrivateKey(privateKey);
            }
        }
    }
}
