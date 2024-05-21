/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.signing;

import com.oracle.bmc.ClientRuntime;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.http.internal.AuthnClientFilter;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.core.HttpHeaders;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Filter that adds authentication and User-Agent headers to a request.
 */
@Priority(Priorities.AUTHENTICATION)
public class RequestSigningFilter extends AuthnClientFilter {

    /**
     * Create a new RequestSigningFilter instance
     *
     * @param requestSigner the request signer instance
     * @param requestSigners the strategies used to sign requests, per signing strategy
     */
    public RequestSigningFilter(
            @Nonnull final RequestSigner requestSigner,
            @Nonnull final Map<SigningStrategy, RequestSigner> requestSigners) {
        super(requestSigner, requestSigners);
        if (requestSigner == null) {
            throw new java.lang.NullPointerException(
                    "requestSigner is marked non-null but is null");
        }
        if (requestSigners == null) {
            throw new java.lang.NullPointerException(
                    "requestSigners is marked non-null but is null");
        }
    }

    /**
     * Create a new RequestSigningFilter instance
     *
     * @param requestSigner the request signer instance
     */
    public RequestSigningFilter(@Nonnull final RequestSigner requestSigner) {
        this(requestSigner, Collections.unmodifiableMap(new HashMap<>()));
    }

    /**
     * Create a new RequestSigningFilter instance from an existing authentication details provider
     *
     * @param authenticationDetailsProvider the authentication details provider to use
     * @return a new RequestSigningFilter instance
     */
    public static RequestSigningFilter fromAuthProvider(
            @Nonnull final BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        if (authenticationDetailsProvider == null) {
            throw new java.lang.NullPointerException(
                    "authenticationDetailsProvider is marked non-null but is null");
        }
        return new RequestSigningFilter(
                DefaultRequestSigner.createRequestSigner(authenticationDetailsProvider));
    }

    /**
     * Create a new RequestSigningFilter instance from a config file
     *
     * @param configurationFilePath the path of the config file
     * @param profile the profile to use
     * @return a new RequestSigningFilter instance
     * @throws IOException if the config file could not be read
     */
    public static RequestSigningFilter fromConfigFile(
            @Nonnull final String configurationFilePath, @Nullable final String profile)
            throws IOException {
        if (configurationFilePath == null) {
            throw new java.lang.NullPointerException(
                    "configurationFilePath is marked non-null but is null");
        }
        return fromAuthProvider(
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile));
    }

    /**
     * Filter method called before a request has been dispatched to a client
     * transport layer.
     * <p>
     * Filters in the filter chain are ordered according to their {@code javax.annotation.Priority}
     * class-level annotation value.
     *
     * @param requestContext request context.
     * @throws IOException if an I/O exception occurs.
     */
    @Override
    public void filter(@Nonnull ClientRequestContext requestContext) throws IOException {
        if (requestContext == null) {
            throw new java.lang.NullPointerException(
                    "requestContext is marked non-null but is null");
        }
        super.filter(requestContext);

        requestContext
                .getHeaders()
                .putSingle(
                        HttpHeaders.USER_AGENT,
                        ClientRuntime.getRuntime().getUserAgent() + " RequestSigningFilter");
    }
}
