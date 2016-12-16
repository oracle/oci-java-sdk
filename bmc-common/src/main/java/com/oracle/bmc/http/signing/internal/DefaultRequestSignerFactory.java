/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.signing.internal;

import java.security.interfaces.RSAPrivateKey;

import com.oracle.bmc.OCID;
import com.oracle.bmc.Service;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.http.signing.RequestSignerFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * Factory class to create RequestSigner instances. Takes care to determining
 * what signing strategy to use.
 */
@Slf4j
public class DefaultRequestSignerFactory implements RequestSignerFactory {

    /**
     * Creates a new RequestSigner instance from the given provider and type of
     * service.
     *
     * @param service
     *            The service type.
     * @param authProvider
     *            The auth provider.
     * @return A new RequestSigner instance.
     */
    @Override
    public RequestSigner createRequestSigner(
            Service service, AuthenticationDetailsProvider authProvider) {
        KeySupplier<RSAPrivateKey> keySupplier =
                new PEMFileRSAPrivateKeySupplier(
                        authProvider.getPrivateKey(), authProvider.getPassPhrase());
        String keyId = createKeyId(authProvider);
        // object storage uses a different strategy
        if (service.getServiceName().equals("OBJECTSTORAGE")) {
            return new RequestSignerImpl(keySupplier, SigningStrategy.OBJECT_STORAGE, keyId);
        }
        return new RequestSignerImpl(keySupplier, SigningStrategy.STANDARD, keyId);
    }

    private static String createKeyId(AuthenticationDetailsProvider authProvider) {
        // currently just log a warning as the format is not published
        if (!OCID.isValid(authProvider.getTenantId())) {
            LOG.warn("tenantId '{}' does not match expected pattern", authProvider.getTenantId());
        }
        if (!OCID.isValid(authProvider.getUserId())) {
            LOG.warn("userId '{}' does not match expected pattern", authProvider.getUserId());
        }

        String keyId =
                String.format(
                        "%s/%s/%s",
                        authProvider.getTenantId(),
                        authProvider.getUserId(),
                        authProvider.getFingerprint());
        LOG.debug("Using keyId: {}", keyId);
        return keyId;
    }
}
