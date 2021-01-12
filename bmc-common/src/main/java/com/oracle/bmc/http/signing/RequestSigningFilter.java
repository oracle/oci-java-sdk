/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.signing;

import com.google.common.collect.ImmutableMap;
import com.oracle.bmc.ClientRuntime;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.http.internal.AuthnClientFilter;
import lombok.NonNull;

import javax.annotation.Nullable;
import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.core.HttpHeaders;
import java.io.IOException;
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
            @NonNull final RequestSigner requestSigner,
            @NonNull final Map<SigningStrategy, RequestSigner> requestSigners) {
        super(requestSigner, requestSigners);
    }

    /**
     * Create a new RequestSigningFilter instance
     *
     * @param requestSigner the request signer instance
     */
    public RequestSigningFilter(@NonNull final RequestSigner requestSigner) {
        this(requestSigner, ImmutableMap.of());
    }

    /**
     * Create a new RequestSigningFilter instance from an existing authentication details provider
     *
     * @param authenticationDetailsProvider the authentication details provider to use
     * @return a new RequestSigningFilter instance
     */
    public static RequestSigningFilter fromAuthProvider(
            @NonNull final BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
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
            @NonNull final String configurationFilePath, @Nullable final String profile)
            throws IOException {
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
    public void filter(@NonNull ClientRequestContext requestContext) throws IOException {
        super.filter(requestContext);

        requestContext
                .getHeaders()
                .putSingle(
                        HttpHeaders.USER_AGENT,
                        ClientRuntime.getRuntime().getUserAgent() + "; RequestSigningFilter");
    }
}
