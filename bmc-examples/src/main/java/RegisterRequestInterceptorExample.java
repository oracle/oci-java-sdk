/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.http.Priorities;
import com.oracle.bmc.http.client.HttpRequest;
import com.oracle.bmc.http.client.RequestInterceptor;
import com.oracle.bmc.identity.Identity;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.AvailabilityDomain;
import com.oracle.bmc.identity.model.Region;
import com.oracle.bmc.identity.requests.ListAvailabilityDomainsRequest;
import com.oracle.bmc.identity.requests.ListRegionsRequest;
import com.oracle.bmc.identity.responses.ListRegionsResponse;

import java.util.List;

public class RegisterRequestInterceptorExample {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            throw new IllegalArgumentException("Exactly one argument required: <compartmentId>");
        }

        String compartmentId = args[0];

        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        requestInterceptorSingleRequest(provider);
        requestInterceptorInClientForAllRequests(compartmentId, provider);
    }

    private static void requestInterceptorSingleRequest(AuthenticationDetailsProvider provider)
            throws Exception {
        Identity identityClient = IdentityClient.builder().build(provider);

        ListRegionsRequest listRegionsRequest =
                ListRegionsRequest.builder()
                        .invocationCallback(
                                request ->
                                        System.out.println(
                                                "Request has been made: " + request.uri()))
                        .build();

        ListRegionsResponse response = identityClient.listRegions(listRegionsRequest);
        System.out.println("List of regions: " + response.getItems());
        identityClient.close();
    }

    private static void requestInterceptorInClientForAllRequests(
            String compartmentId, AuthenticationDetailsProvider provider) throws Exception {
        Identity identityClient =
                IdentityClient.builder()
                        .clientConfigurator(
                                builder -> {
                                    builder.registerRequestInterceptor(
                                            Priorities.AUTHENTICATION,
                                            new RequestInterceptor() {
                                                int requestCount = 0;

                                                @Override
                                                public void intercept(HttpRequest request) {
                                                    System.out.println(
                                                            "Request "
                                                                    + ++requestCount
                                                                    + " has been made: "
                                                                    + request.uri());
                                                }
                                            });
                                })
                        .build(provider);

        List<AvailabilityDomain> availabilityDomains =
                identityClient
                        .listAvailabilityDomains(
                                ListAvailabilityDomainsRequest.builder()
                                        .compartmentId(compartmentId)
                                        .build())
                        .getItems();

        List<Region> regions =
                identityClient.listRegions(ListRegionsRequest.builder().build()).getItems();

        System.out.println("List of domains: " + availabilityDomains);
        System.out.println("List of regions: " + regions);
        identityClient.close();
    }
}
