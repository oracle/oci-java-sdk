/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.signing;

import com.oracle.bmc.InternalSdk;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Class that exposes a way to create a {@link RequestSigner} for use with BMC.
 * The returned signers implement signing strategies outlined by <a href=
 * "https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/signingrequests.htm">the
 * signing guidelines</a>.
 * <p>
 * This is only exposed so clients can write REST calls directly against BMCS
 * without using the SDK provided clients, but this class may change without
 * notice -- users are encouraged to use the SDK provided clients.
 */
@InternalSdk
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DefaultRequestSigner {

    /**
     * Creates a new RequestSigner using the {@link SigningStrategy#STANDARD}.
     *
     * @param authProvider
     *            The auth details provider to use.
     * @return A new signer instance.
     */
    public static RequestSigner createRequestSigner(
            BasicAuthenticationDetailsProvider authProvider) {
        return createRequestSigner(authProvider, SigningStrategy.STANDARD);
    }

    /**
     * Creates a new RequestSigner using the given signing strategy.
     *
     * @param authProvider
     *            The auth details provider to use.
     * @param signingStrategy
     *            The strategy to use.
     * @return A new signer instance.
     */
    public static RequestSigner createRequestSigner(
            BasicAuthenticationDetailsProvider authProvider, SigningStrategy signingStrategy) {
        // default factory does not need the Service param
        return new DefaultRequestSignerFactory(signingStrategy)
                .createRequestSigner(null, authProvider);
    }
}
