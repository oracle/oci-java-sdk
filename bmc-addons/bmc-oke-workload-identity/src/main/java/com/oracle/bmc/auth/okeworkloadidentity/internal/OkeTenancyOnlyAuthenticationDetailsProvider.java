/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.okeworkloadidentity.internal;

import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.auth.ProvidesCustomRequestSigner;
import com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider;
import com.oracle.bmc.http.signing.RequestSigner;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.InputStream;
import java.net.URI;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Resource Principals V2 using public/private key to sign the request. This class provides the authentication based on
 * public/private key.
 */
public class OkeTenancyOnlyAuthenticationDetailsProvider
        implements BasicAuthenticationDetailsProvider,
                RefreshableOnNotAuthenticatedProvider<String>, ProvidesCustomRequestSigner {

    /**
     * Returns the keyId used to sign requests. For this provider, this is a no-op and nothing is done.
     *
     * @return always return null
     */
    @Override
    public String getKeyId() {
        return null;
    }

    /**
     * Returns a new InputStream to the private key. This stream should be
     * closed by the caller, implementations should return new streams each
     * time. For this provider, this is a no-op and nothing is done.
     *
     * @return always return null
     */
    @Override
    public InputStream getPrivateKey() {
        return null;
    }

    /**
     * Returns the optional pass phrase for the (encrypted) private key. For this provider, this is a no-op and nothing is done.
     *
     * @return The always return null
     * @deprecated Use getPassphraseCharacters instead
     */
    @Override
    public String getPassPhrase() {
        return null;
    }

    /**
     * Returns the optional pass phrase for the (encrypted) private key, as a character array. For this provider, this is a no-op and nothing is done.
     *
     * @return always return null
     */
    @Override
    public char[] getPassphraseCharacters() {
        return null;
    }

    /**
     * Refreshes the authentication data used by the provider. For this provider, this is a no-op and nothing is done.
     *
     * @return always null
     */
    @Override
    public String refresh() {
        return null;
    }

    @Override
    public RequestSigner getCustomRequestSigner() {
        return NoOpRequestSigner.INSTANCE;
    }

    private static enum NoOpRequestSigner implements RequestSigner {
        INSTANCE;

        @Override
        @Nonnull
        public Map<String, String> signRequest(
                @Nonnull URI uri,
                @Nonnull String httpMethod,
                @Nonnull Map<String, List<String>> headers,
                @Nullable Object body) {
            return Collections.unmodifiableMap(new HashMap<>());
        }
    }
}
