/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.sasl;

import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import java.io.IOException;
import java.util.Map;

/**
 * A {@link javax.security.auth.spi.LoginModule} that will use User Principals to fill the {@link
 * javax.security.auth.Subject} credentials. Possible parameters are:
 *
 * <ul>
 *   <li>config: the path the your OCI SDK configuration file - if not specified the configuration
 *       will be looked in <i>~/.oci/config</i>
 *   <li>profile: the profile to use inside the config - if not specified <i>DEFAULT</i> profile
 *       will be used
 *   <li>intent: the intent of the authentication - this service specific and is documented on a
 *       per-service basis
 * </ul>
 *
 * <pre>
 * {@code com.oracle.bmc.auth.sasl.UserPrincipalsLoginModule required config="<optionalConfigPath>" profile="<optionalProfile>" intent="<intent>";}
 * </pre>
 */
public class UserPrincipalsLoginModule extends OciLoginModule {

    private static final String CONFIG_CONFIG = "config";
    private static final String PROFILE_CONFIG = "profile";

    private static final String DEFAULT_PROFILE = "DEFAULT";

    @Override
    protected BasicAuthenticationDetailsProvider loadAuthenticationProvider(
            Map<String, ?> options) {
        final String config = (String) options.get(CONFIG_CONFIG);
        final String profile = (String) options.get(PROFILE_CONFIG);

        try {
            if (config == null && profile == null) {
                return new ConfigFileAuthenticationDetailsProvider(DEFAULT_PROFILE);
            } else if (config == null) {
                return new ConfigFileAuthenticationDetailsProvider(profile);
            } else {
                return new ConfigFileAuthenticationDetailsProvider(config, profile);
            }
        } catch (IOException exc) {
            throw new RuntimeException(exc);
        }
    }
}
