/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.sasl;

import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.auth.ResourcePrincipalAuthenticationDetailsProvider;
import java.util.Map;

/**
 * A {@link javax.security.auth.spi.LoginModule} that will use Resource Principals to fill the
 * {@link javax.security.auth.Subject} credentials. An intent parameter has to be specified - this
 * service specific and is documented on a per-service basis.
 *
 * <pre>{@code com.oracle.bmc.auth.sasl.ResourcePrincipalsLoginModule required intent="<intent>";}
 * </pre>
 */
public class ResourcePrincipalsLoginModule extends OciLoginModule {
    @Override
    protected BasicAuthenticationDetailsProvider loadAuthenticationProvider(
            Map<String, ?> options) {
        return ResourcePrincipalAuthenticationDetailsProvider.builder().build();
    }
}
