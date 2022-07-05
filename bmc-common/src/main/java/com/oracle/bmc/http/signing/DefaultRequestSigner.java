/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.signing;

import com.oracle.bmc.InternalSdk;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory;

/**
 * Class that exposes a way to create a {@link RequestSigner} for use with OCI.
 * The returned signers implement signing strategies outlined by <a href=
 * "https://docs.cloud.oracle.com/Content/API/Concepts/signingrequests.htm">the
 * signing guidelines</a>.
 * <p>
 * This is only exposed so clients can write REST calls directly against OCI
 * without using the SDK provided clients, but this class may change without
 * notice -- users are encouraged to use the SDK provided clients.
 */
@InternalSdk
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

    private DefaultRequestSigner() {}
}
