/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.http.client.jersey3.Jersey3ClientProperty;
import com.oracle.bmc.identity.Identity;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.AvailabilityDomain;
import com.oracle.bmc.identity.requests.ListAvailabilityDomainsRequest;

import org.glassfish.jersey.logging.LoggingFeature;

import java.util.List;
import java.util.logging.Level;

import static org.glassfish.jersey.logging.LoggingFeature.LOGGING_FEATURE_LOGGER_LEVEL_CLIENT;
import static org.glassfish.jersey.logging.LoggingFeature.LOGGING_FEATURE_VERBOSITY_CLIENT;

public class JerseyClientLoggingExample {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            throw new IllegalArgumentException("Exactly one argument required: <compartmentId>");
        }

        String compartmentId = args[0];

        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        Identity identityClient =
                IdentityClient.builder()
                        .clientConfigurator(builder -> {
                            builder.property(Jersey3ClientProperty.create(LOGGING_FEATURE_VERBOSITY_CLIENT), LoggingFeature.Verbosity.PAYLOAD_ANY);
                            builder.property(Jersey3ClientProperty.create(LOGGING_FEATURE_LOGGER_LEVEL_CLIENT), Level.INFO.getName());})
                        .build(provider);

        List<AvailabilityDomain> availabilityDomains =
                identityClient
                        .listAvailabilityDomains(
                                ListAvailabilityDomainsRequest.builder()
                                        .compartmentId(compartmentId)
                                        .build())
                        .getItems();

        for (AvailabilityDomain ad : availabilityDomains) {
            System.out.println(ad.getName());
        }

        identityClient.close();
    }
}