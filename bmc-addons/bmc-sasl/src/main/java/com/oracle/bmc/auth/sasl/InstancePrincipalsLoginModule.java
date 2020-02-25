/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth.sasl;

import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider;
import java.util.Map;

/**
 * A {@link javax.security.auth.spi.LoginModule} that will use Instance Principals to fill the {@link javax.security.auth.Subject} credentials.
 * An <i>intent</i> parameter has to be specified - this service specific and is documented on a per-service basis.
 * <pre>{@code com.oracle.bmc.auth.sasl.InstancePrincipalsLoginModule required intent="<intent>";}</pre>
 */
public class InstancePrincipalsLoginModule extends OciLoginModule {
    @Override
    protected BasicAuthenticationDetailsProvider loadAuthenticationProvider(
            Map<String, ?> options) {
        return InstancePrincipalsAuthenticationDetailsProvider.builder().build();
    }
}
