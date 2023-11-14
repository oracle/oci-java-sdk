/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.auth.ResourcePrincipalAuthenticationDetailsProvider;
import com.oracle.bmc.auth.ResourcePrincipalsV3AuthenticationDetailsProvider;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.AvailabilityDomain;
import com.oracle.bmc.identity.requests.ListAvailabilityDomainsRequest;
import com.oracle.bmc.identity.responses.ListAvailabilityDomainsResponse;

/**
 * Example for nested resource principals v3.0 Can either be done via env variables, or
 * programmatically The following env variables are required for building the leaf resource:
 * OCI_RESOURCE_PRINCIPAL_VERSION_FOR_LEAF_RESOURCE - resource principals version for leaf resource
 * For version 1.1, the following env vars are required : 1.
 * OCI_RESOURCE_PRINCIPAL_RPT_ENDPOINT_FOR_LEAF_RESOURCE - RPT endpoint for leaf resource 2.
 * OCI_RESOURCE_PRINCIPAL_RPST_ENDPOINT_FOR_LEAF_RESOURCE - RPST endpoint for leaf resource
 *
 * <p>For version 2.1/2.1.1, the following env vars are required : 1.
 * OCI_RESOURCE_PRINCIPAL_RPT_ENDPOINT_FOR_LEAF_RESOURCE - RPT endpoint for leaf resource 2.
 * OCI_RESOURCE_PRINCIPAL_RPST_ENDPOINT_FOR_LEAF_RESOURCE - RPST endpoint for leaf resource 3.
 * OCI_RESOURCE_PRINCIPAL_RESOURCE_ID_FOR_LEAF_RESOURCE - resource id for leaf resource 4.
 * OCI_RESOURCE_PRINCIPAL_TENANCY_ID_FOR_LEAF_RESOURCE - tenancy id for leaf resource 5.
 * OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM_FOR_LEAF_RESOURCE - private PEM for leaf resource 6.
 * OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM_PASSPHRASE_FOR_LEAF_RESOURCE - private PEM passphrase for leaf
 * resource
 *
 * <p>For version 2.2, the following env vars are required : 1.
 * OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM_FOR_LEAF_RESOURCE - private PEM for leaf resource 2.
 * OCI_RESOURCE_PRINCIPAL_PRIVATE_PEM_PASSPHRASE_FOR_LEAF_RESOURCE - private PEM passphrase for leaf
 * resource 3. OCI_RESOURCE_PRINCIPAL_RPST_FOR_LEAF_RESOURCE - RPST endpoint for leaf resource 4.
 * OCI_RESOURCE_PRINCIPAL_REGION_FOR_LEAF_RESOURCE - region for leaf resource
 *
 * <p>For parent resource, following env vars are required : 1.
 * OCI_RESOURCE_PRINCIPAL_RPT_URL_FOR_PARENT_RESOURCE - RPT url for parent resource 2.
 * OCI_RESOURCE_PRINCIPAL_RPST_ENDPOINT_FOR_PARENT_RESOURCE - RPST endpoint for parent resource
 */
public class NestedResourcePrincipalsExample {

    public static void main(String[] args) throws Exception {

        // Build the leafAuthenticatioDetailsProvider - this is not required if using env variables

        final ResourcePrincipalAuthenticationDetailsProvider leafAuthenticatioDetailsProvider =
                ResourcePrincipalAuthenticationDetailsProvider.builder().build();

        final ResourcePrincipalAuthenticationDetailsProvider provider =
                ResourcePrincipalsV3AuthenticationDetailsProvider.builder()
                        .resourcePrincipalTokenUrlForParentResource("<resourcePrincipalTokenUrl>")
                        .federationEndpointForParentResource(
                                "<federationEndpointForParentResource>")
                        .build(leafAuthenticatioDetailsProvider);

        final IdentityClient identityClient = new IdentityClient(provider);

        System.out.println(
                "*******************List Availability Domains*********************************************");
        final ListAvailabilityDomainsResponse listAvailabilityDomainsResponse =
                identityClient.listAvailabilityDomains(
                        ListAvailabilityDomainsRequest.builder()
                                .compartmentId("<compartmentId>")
                                .build());

        for (AvailabilityDomain domain : listAvailabilityDomainsResponse.getItems()) {
            System.out.println(domain.toString());
        }
    }
}
