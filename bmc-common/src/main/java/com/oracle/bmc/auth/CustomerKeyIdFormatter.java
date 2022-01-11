/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import javax.annotation.Nonnull;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Formatter used to create the correct 'keyId' needed for signing requests.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CustomerKeyIdFormatter {

    /**
     * Creates a keyId from the individual components.
     *
     * @param tenantId
     *            The tenantId
     * @param userId
     *            The userId
     * @param fingerprint
     *            The fingerprint
     * @return The keyId used to sign requests
     */
    public static String createKeyId(String tenantId, String userId, String fingerprint) {
        return String.format("%s/%s/%s", tenantId, userId, fingerprint);
    }

    /**
     * Creates a keyId from an {@link AuthenticationDetailsProvider}.
     *
     * @param provider
     *            The provider
     * @return The keyId used to sign requests
     */
    public static String createKeyId(@Nonnull AuthenticationDetailsProvider provider) {
        return createKeyId(provider.getTenantId(), provider.getUserId(), provider.getFingerprint());
    }
}
