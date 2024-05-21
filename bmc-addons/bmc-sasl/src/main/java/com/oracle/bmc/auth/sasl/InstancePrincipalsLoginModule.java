/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.sasl;

import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider;
import java.util.Map;
import com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider.InstancePrincipalsAuthenticationDetailsProviderBuilder;

/**
 * A {@link javax.security.auth.spi.LoginModule} that will use Instance Principals to fill the {@link javax.security.auth.Subject} credentials.
 * An <i>intent</i> parameter has to be specified - this service specific and is documented on a per-service basis.
 * <pre>{@code com.oracle.bmc.auth.sasl.InstancePrincipalsLoginModule required intent="<intent>";}</pre>
 */
public class InstancePrincipalsLoginModule extends OciLoginModule {

    private static final String METADATA_URL = "metadataBaseUrl";

    @Override
    protected BasicAuthenticationDetailsProvider loadAuthenticationProvider(
            Map<String, ?> options) {

        final InstancePrincipalsAuthenticationDetailsProviderBuilder builder =
                InstancePrincipalsAuthenticationDetailsProvider.builder();

        if (options.containsKey(METADATA_URL)) {
            builder.metadataBaseUrl((String) options.get(METADATA_URL));
        }
        return builder.build();
    }
}
