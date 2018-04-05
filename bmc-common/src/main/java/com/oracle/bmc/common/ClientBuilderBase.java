/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.common;

import com.oracle.bmc.Service;

/**
 * Base client builder.
 * @param <B> actual class of the builder
 */
public abstract class ClientBuilderBase<B extends ClientBuilderBase, C> {
    protected final Service service;
    protected com.oracle.bmc.ClientConfiguration configuration;
    protected com.oracle.bmc.http.ClientConfigurator clientConfigurator;
    protected java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators =
            new java.util.ArrayList<>();
    protected com.oracle.bmc.http.signing.RequestSignerFactory requestSignerFactory =
            new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                    com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
    protected String endpoint;

    public ClientBuilderBase(Service service) {
        this.service = service;
    }

    /**
     * Set the configuration. May be null.
     * @param configuration configuration. May be null.
     * @return this builder
     */
    public B configuration(com.oracle.bmc.ClientConfiguration configuration) {
        this.configuration = configuration;
        return (B) this;
    }

    /**
     * Set the client configurator. May be null.
     * @param clientConfigurator client configurator. May be null.
     * @return this builder
     */
    public B clientConfigurator(com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this.clientConfigurator = clientConfigurator;
        return (B) this;
    }

    /**
     * Add an additional client configurator to be run after the primary configurator.
     * @param additionalClientConfigurator the additional client configurator
     * @return this builder
     */
    public B additionalClientConfigurator(
            @lombok.NonNull com.oracle.bmc.http.ClientConfigurator additionalClientConfigurator) {
        if (additionalClientConfigurator == null) {
            throw new NullPointerException("additionalClientConfigurator");
        }
        this.additionalClientConfigurators.add(additionalClientConfigurator);
        return (B) this;
    }

    /**
     * Set the request signer factory. May be null.
     * @param requestSignerFactory request signer factory. May be null.
     * @return this builder
     */
    public B requestSignerFactory(
            com.oracle.bmc.http.signing.RequestSignerFactory requestSignerFactory) {
        if (requestSignerFactory == null) {
            this.requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        } else {
            this.requestSignerFactory = requestSignerFactory;
        }
        return (B) this;
    }

    /**
     * Set the endpoint for the client to be created.
     * @param endpoint endpoint
     * @return this builder
     */
    public B endpoint(String endpoint) {
        this.endpoint = endpoint;
        return (B) this;
    }

    /**
     * Set the authentication details provider. Once this is called, the builder can build the client.
     * @param authenticationDetailsProvider authentication details provider
     * @return a builder that can build the client
     */
    public abstract C build(
            @lombok.NonNull
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider);
}
