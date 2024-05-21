/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider;
import com.oracle.bmc.util.StreamUtils;
import com.oracle.bmc.util.internal.StringUtils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Resource Principals V2 using public/private key to sign the request. This class provides the authentication based on
 * public/private key.
 */
public class KeyPairAuthenticationDetailProvider
        implements BasicAuthenticationDetailsProvider,
                RefreshableOnNotAuthenticatedProvider<String> {

    final private String resourceId;
    final private InputStream privateKeyStream;
    final private char[] passphrase;
    final private String tenancyId;
    final private String ociResourcePrincipalVersion;

    /**
     * Constructor of KeyPairAuthenticationDetailProvider
     *
     * @param resourceId resource id of the resource
     * @param privateKeyStream private key stream to sign the sign the request
     * @param passphrase passphrase for the private key
     */
    public KeyPairAuthenticationDetailProvider(
            final String resourceId, final InputStream privateKeyStream, final char[] passphrase) {
        this(resourceId, privateKeyStream, passphrase, null);
    }

    /**
     * Constructor of KeyPairAuthenticationDetailProvider
     *
     * @param resourceId resource id of the resource
     * @param privateKeyStream private key stream to sign the sign the request
     * @param passphrase passphrase for the private key
     * @param tenancyId tenancy id of the resource
     */
    public KeyPairAuthenticationDetailProvider(
            final String resourceId,
            final InputStream privateKeyStream,
            final char[] passphrase,
            final String tenancyId) {
        this(resourceId, privateKeyStream, passphrase, tenancyId, null);
    }

    /**
     * Constructor of KeyPairAuthenticationDetailProvider
     *
     * @param resourceId resource id of the resource
     * @param privateKeyStream private key stream to sign the sign the request
     * @param passphrase passphrase for the private key
     * @param tenancyId tenancy id of the resource
     * @param ociResourcePrincipalVersion resource principal version
     */
    public KeyPairAuthenticationDetailProvider(
            final String resourceId,
            final InputStream privateKeyStream,
            final char[] passphrase,
            final String tenancyId,
            final String ociResourcePrincipalVersion) {
        this.resourceId = resourceId;
        this.privateKeyStream = privateKeyStream;
        this.passphrase = passphrase;
        this.tenancyId = tenancyId;
        this.ociResourcePrincipalVersion = ociResourcePrincipalVersion;
    }

    /**
     * Returns the keyId used to sign requests.
     *
     * @return The keyId.
     */
    @Override
    public String getKeyId() {
        if (tenancyId != null) {
            if (StringUtils.isNotBlank(ociResourcePrincipalVersion)
                    && ociResourcePrincipalVersion.equals("2.1.1")) {
                return "resource/v2.1.1/" + this.tenancyId + "/" + this.resourceId;
            }
            if (StringUtils.isNotBlank(ociResourcePrincipalVersion)
                    && ociResourcePrincipalVersion.equals("2.1.2")) {
                return "resource/v2.1.2/" + this.tenancyId + "/" + this.resourceId;
            }
        }
        return "resource/v2.1/" + this.resourceId;
    }

    /**
     * Returns a new InputStream to the private key. This stream should be
     * closed by the caller, implementations should return new streams each
     * time.
     *
     * @return A new InputStream.
     */
    @Override
    public InputStream getPrivateKey() {
        try {
            return new ByteArrayInputStream(StreamUtils.toByteArray(this.privateKeyStream));
        } catch (IOException ex) {
            throw new IllegalStateException("Unable to read private key stream.", ex);
        }
    }

    /**
     * Returns the optional pass phrase for the (encrypted) private key.
     *
     * @return The pass phrase, or null if not applicable
     * deprecated Use getPassphraseCharacters instead
     */
    @Override
    public String getPassPhrase() {
        return this.passphrase.toString();
    }

    /**
     * Returns the optional pass phrase for the (encrypted) private key, as a character array.
     *
     * @return The pass phrase as character array, or null if not applicable
     */
    @Override
    public char[] getPassphraseCharacters() {
        return this.passphrase;
    }

    /**
     * Refreshes the authentication data used by the provider
     *
     * @return the refreshed authentication data
     */
    @Override
    public String refresh() {
        return resourceId;
    }
}
