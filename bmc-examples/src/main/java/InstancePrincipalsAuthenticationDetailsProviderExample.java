/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.AvailabilityDomain;
import com.oracle.bmc.identity.requests.ListAvailabilityDomainsRequest;
import com.oracle.bmc.identity.responses.ListAvailabilityDomainsResponse;

public class InstancePrincipalsAuthenticationDetailsProviderExample {

    public static void main(String[] args) throws Exception {

        InstancePrincipalsAuthenticationDetailsProvider provider =
                InstancePrincipalsAuthenticationDetailsProvider.builder().build();

        IdentityClient identityClient = new IdentityClient(provider);

        // TODO: Pass in the compartment ID as an argument, or enter the value directly here (if known)
        String compartmentId = args[0];
        System.out.println(compartmentId);

        ListAvailabilityDomainsResponse listAvailabilityDomainsResponse =
                identityClient.listAvailabilityDomains(
                        ListAvailabilityDomainsRequest.builder()
                                .compartmentId(compartmentId)
                                .build());

        identityClient.close();

        for (AvailabilityDomain domain : listAvailabilityDomainsResponse.getItems()) {
            System.out.println(domain.toString());
        }
    }
}
