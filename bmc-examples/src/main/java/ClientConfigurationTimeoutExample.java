/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.AvailabilityDomain;
import com.oracle.bmc.identity.requests.ListAvailabilityDomainsRequest;
import com.oracle.bmc.identity.responses.ListAvailabilityDomainsResponse;

/**
 * A sample to demonstrate how to configure connection timeout and read timeout using client
 * configuration.
 */
public class ClientConfigurationTimeoutExample {

    private static final int CONNECTION_TIMEOUT_IN_MILLISECONDS = 20000;
    private static final int READ_TIMEOUT_IN_MILLISECONDS = 30000;

    public static void main(String[] args) throws Exception {

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();
        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        ClientConfiguration clientConfiguration =
                ClientConfiguration.builder()
                        .connectionTimeoutMillis(CONNECTION_TIMEOUT_IN_MILLISECONDS)
                        .readTimeoutMillis(READ_TIMEOUT_IN_MILLISECONDS)
                        .build();

        System.out.println(
                "Connection timeout set to " + CONNECTION_TIMEOUT_IN_MILLISECONDS + "ms");
        System.out.println("Read timeout set to " + READ_TIMEOUT_IN_MILLISECONDS + "ms");

        // final IdentityClient identityClient = new IdentityClient(provider, clientConfiguration);
        final IdentityClient identityClient =
                IdentityClient.builder().configuration(clientConfiguration).build(provider);

        // TODO: Pass in the compartment ID as an argument, or enter the value directly here (if
        // known)
        final String compartmentId = args[0];
        System.out.println(compartmentId);

        final ListAvailabilityDomainsRequest request =
                ListAvailabilityDomainsRequest.builder().compartmentId(compartmentId).build();
        ListAvailabilityDomainsResponse listAvailabilityDomainsResponse =
                identityClient.listAvailabilityDomains(request);
        for (AvailabilityDomain domain : listAvailabilityDomainsResponse.getItems()) {
            System.out.println(domain.toString());
        }
        identityClient.close();
    }
}
