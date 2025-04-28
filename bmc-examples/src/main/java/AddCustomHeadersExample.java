/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.http.Priorities;
import com.oracle.bmc.identity.Identity;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.AvailabilityDomain;
import com.oracle.bmc.identity.requests.ListAvailabilityDomainsRequest;

import java.util.List;

public class AddCustomHeadersExample {
    public static void main(String[] args) throws Exception {

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);
        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        // Adding custom headers per-client
        Identity identityClient =
                IdentityClient.builder()
                        .region(com.oracle.bmc.Region.US_PHOENIX_1)
                        .clientConfigurator(
                                builder -> {
                                    builder.registerRequestInterceptor(
                                            Priorities.HEADER_DECORATOR,
                                            request -> {
                                                request.header("my-header", "my-value");
                                            });
                                })
                        .build(provider);

        // Adding custom headers per-request
        List<AvailabilityDomain> availabilityDomains =
                identityClient
                        .listAvailabilityDomains(
                                ListAvailabilityDomainsRequest.builder()
                                        .invocationCallback(
                                                request -> {
                                                    request.header(
                                                            "my-custom-header", "my-custom-value");
                                                })
                                        .compartmentId(provider.getTenantId())
                                        .build())
                        .getItems();

        System.out.println("List of domains: " + availabilityDomains);

        identityClient.close();
    }
}
