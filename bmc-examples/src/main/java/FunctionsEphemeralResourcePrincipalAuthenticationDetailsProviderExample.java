/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.auth.ResourcePrincipalAuthenticationDetailsProvider;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.AvailabilityDomain;
import com.oracle.bmc.identity.model.Compartment;
import com.oracle.bmc.identity.requests.ListAvailabilityDomainsRequest;
import com.oracle.bmc.identity.requests.ListCompartmentsRequest;
import com.oracle.bmc.identity.responses.ListAvailabilityDomainsResponse;
import com.oracle.bmc.identity.responses.ListCompartmentsResponse;

/**
 * This sample only works when running inside a function launched by the OCI Functions service. The
 * {@link ResourcePrincipalAuthenticationDetailsProvider} builder expects the following environment
 * variables to be set:
 *
 * <ul>
 *   <li><b>OCI_RESOURCE_PRINCIPAL_VERSION</b>:
 *       <p>Under OCI Functions, this will contain the value {@code 2.2}
 *   <li><b>OCI_RESOURCE_PRINCIPAL_REGION</b>:
 *       <p>The OCI Functions service will set this to correspond to the local region (that is,
 *       where the function is currently executing).
 *   <li><b>OCI_RESOURCE_PRINCIPAL_RPST</b> and <b>OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM</b>:
 *       <p>These will be set to the location of files containing the token information for the
 *       current function invocation.
 * </ul>
 */
public class FunctionsEphemeralResourcePrincipalAuthenticationDetailsProviderExample {

    public static void main(String[] args) throws Exception {
        final ResourcePrincipalAuthenticationDetailsProvider provider =
                ResourcePrincipalAuthenticationDetailsProvider.builder().build();

        final IdentityClient identityClient = IdentityClient.builder().build(provider);

        // Load the compartment ID of the current function
        String compartmentId =
                provider.getStringClaim(
                        ResourcePrincipalAuthenticationDetailsProvider.ClaimKeys
                                .COMPARTMENT_ID_CLAIM_KEY);
        System.out.println(compartmentId);

        System.out.println(
                "*******************List Availability Domains*********************************************");
        final ListAvailabilityDomainsResponse listAvailabilityDomainsResponse =
                identityClient.listAvailabilityDomains(
                        ListAvailabilityDomainsRequest.builder()
                                .compartmentId(compartmentId)
                                .build());

        for (AvailabilityDomain domain : listAvailabilityDomainsResponse.getItems()) {
            System.out.println(domain.toString());
        }
        System.out.println(
                "*****************************************************************************************");
        System.out.println();

        // List all compartments within tenancy with Accessible compartment filter
        String nextPageToken = null;
        System.out.println(
                "*******************List Compartments with AccessLevel == Accessible***********************");
        do {
            ListCompartmentsResponse listCompartmentsResponse =
                    identityClient.listCompartments(
                            ListCompartmentsRequest.builder()
                                    .limit(3)
                                    .compartmentId(compartmentId)
                                    .accessLevel(ListCompartmentsRequest.AccessLevel.Accessible)
                                    .page(nextPageToken)
                                    .build());
            for (Compartment compartment : listCompartmentsResponse.getItems()) {
                System.out.println(compartment);
            }
            nextPageToken = listCompartmentsResponse.getOpcNextPage();

        } while (nextPageToken != null);

        System.out.println(
                "*****************************************************************************************");

        identityClient.close();
    }
}
