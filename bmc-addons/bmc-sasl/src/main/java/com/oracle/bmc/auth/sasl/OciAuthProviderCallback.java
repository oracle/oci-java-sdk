/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.sasl;

import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import java.io.IOException;
import javax.security.auth.Subject;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.UnsupportedCallbackException;

/**
 * Callback to handle in the SASL callback handler used when creating a {@link
 * javax.security.sasl.SaslClient} using the OCI SASL mechanism. Here's the code for a possible
 * {@link CallbackHandler}:
 *
 * <pre>{@code
 * public class OciSaslClientCallBackHandler implements CallbackHandler {
 *
 *     private final Subject subject;
 *
 *     public OciSaslClientCallBackHandler(Subject subject) {
 *         this.subject = subject;
 *     }
 *
 *     @Override
 *     public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
 *         for (Callback callback : callbacks) {
 *             if (callback instanceof OciAuthProviderCallback) {
 *                 BasicAuthenticationDetailsProvider authProvider =
 *                         subject.getPrivateCredentials(BasicAuthenticationDetailsProvider.class).iterator().next();
 *                 ((OciAuthProviderCallback) callback).authProvider(authProvider);
 *             } else if (callback instanceof NameCallback) {
 *                 String intent = subject.getPublicCredentials(String.class).iterator().next();
 *                 ((NameCallback) callback).setName(intent);
 *             } else {
 *                 throw new UnsupportedCallbackException(callback, "Unrecognized SASL ClientCallback");
 *             }
 *         }
 *     }
 * }
 * }</pre>
 */
public class OciAuthProviderCallback implements Callback {
    private BasicAuthenticationDetailsProvider authProvider;

    /** Gets the associated {@link BasicAuthenticationDetailsProvider} */
    public BasicAuthenticationDetailsProvider authProvider() {
        return authProvider;
    }

    /** Sets the provided {@link BasicAuthenticationDetailsProvider} */
    public void authProvider(BasicAuthenticationDetailsProvider authProvider) {
        this.authProvider = authProvider;
    }
}
