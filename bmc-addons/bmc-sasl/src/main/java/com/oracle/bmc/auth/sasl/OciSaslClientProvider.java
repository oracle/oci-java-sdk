/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.sasl;

import com.oracle.bmc.auth.sasl.OciSaslClient.OciSaslClientFactory;
import java.security.Provider;
import java.security.Security;

/**
 * Provider for the OCI Sasl Client.
 * Call the {@link #initialize()} method to register it as a security provider.
 * It is automatically called if using one of our {@link OciLoginModule}.
 */
public class OciSaslClientProvider extends Provider {

    private static final long serialVersionUID = 1L;

    private OciSaslClientProvider() {
        super("SASL/OCI Client Provider", 1.0, "SASL/OCI Provider for OCI Services");

        for (OciMechanism value : OciMechanism.values()) {
            put("SaslClientFactory." + value.mechanismName(), OciSaslClientFactory.class.getName());
        }
    }

    /**
     * Registers a new {@link OciSaslClientProvider} as a security provider.
     * That method is automatically called if using one of our {@link javax.security.auth.spi.LoginModule}.
     */
    public static void initialize() {
        Security.addProvider(new OciSaslClientProvider());
    }
}
