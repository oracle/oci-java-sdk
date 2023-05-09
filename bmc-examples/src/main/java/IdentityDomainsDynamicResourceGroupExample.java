/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.ConfigFileReader.ConfigFile;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;

import com.oracle.bmc.identitydomains.IdentityDomainsClient;
import com.oracle.bmc.identitydomains.model.AttributeSets;
import com.oracle.bmc.identitydomains.model.DynamicResourceGroup;
import com.oracle.bmc.identitydomains.model.DynamicResourceGroupSearchRequest;
import com.oracle.bmc.identitydomains.model.Operations;
import com.oracle.bmc.identitydomains.model.PatchOp;
import com.oracle.bmc.identitydomains.model.Operations.Op;
import com.oracle.bmc.identitydomains.requests.CreateDynamicResourceGroupRequest;
import com.oracle.bmc.identitydomains.requests.DeleteDynamicResourceGroupRequest;
import com.oracle.bmc.identitydomains.requests.GetDynamicResourceGroupRequest;
import com.oracle.bmc.identitydomains.requests.ListDynamicResourceGroupsRequest;
import com.oracle.bmc.identitydomains.requests.PatchDynamicResourceGroupRequest;
import com.oracle.bmc.identitydomains.requests.PutDynamicResourceGroupRequest;
import com.oracle.bmc.identitydomains.requests.SearchDynamicResourceGroupsRequest;
import com.oracle.bmc.identitydomains.responses.CreateDynamicResourceGroupResponse;
import com.oracle.bmc.identitydomains.responses.GetDynamicResourceGroupResponse;
import com.oracle.bmc.identitydomains.responses.ListDynamicResourceGroupsResponse;
import com.oracle.bmc.identitydomains.responses.PatchDynamicResourceGroupResponse;
import com.oracle.bmc.identitydomains.responses.PutDynamicResourceGroupResponse;
import com.oracle.bmc.identitydomains.responses.SearchDynamicResourceGroupsResponse;

/**
 * This class provides an example of how to create an identity domain client based on the
 * <i>~/.oci/config</i> file and how to use the client to create/read/update/delete
 * DynamicResourceGroup instances. It will:
 *
 * <ul>
 *   <li>Create a new dynamic resource group
 *   <li>Get the dynamic resource group by id
 *   <li>Find the dynamic resource group by the displayName using LIST method
 *   <li>Find the dynamic resource group by the displayName using POST method
 *   <li>Update the dynamic resource group with PUT method
 *   <li>Update the dynamic resource group with PATCH method
 *   <li>Delete the dynamic resource group
 * </ul>
 */
public class IdentityDomainsDynamicResourceGroupExample {
    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    public static void main(String[] args) throws IOException {

        final ConfigFile configFile = ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);
        final IdentityDomainsClient identityDomainsClient =
                IdentityDomainsClient.builder().build(provider);

        /*
         * To find Domain URL, navigate to Identity > Domains in OCI console, choose relevant domain,
         * then in the overview page, find "Domain URL" under "Domain Information", click "Copy",
         * open ~/.oci/config in editor of your choice, create custom value "domain_endpoint",
         * paste the URL after the value name.
         * Should look like: domain_endpoint=https://idcs-...identity.oraclecloud.com
         * Further reading: https://docs.oracle.com/en-us/iaas/Content/Identity/domains/to-view-identity-domains.htm#view-identity-domains
         * OCI config docs: https://docs.oracle.com/en-us/iaas/Content/API/Concepts/sdkconfig.htm
         */
        final String DOMAIN_ENDPOINT = configFile.get("domain_endpoint");
        if (DOMAIN_ENDPOINT == null || DOMAIN_ENDPOINT.isEmpty()) {
            throw new IllegalArgumentException(
                    "Please specify domain_endpoint in your ~/.oci/config.");
        }
        identityDomainsClient.setEndpoint(DOMAIN_ENDPOINT);

        try {
            DynamicResourceGroup dynamicResourceGroup =
                    createDynamicResourceGroup(identityDomainsClient);

            getDynamicResourceGroupById(identityDomainsClient, dynamicResourceGroup.getId());

            findDynamicResourceGroupByDisplayName(
                    identityDomainsClient, dynamicResourceGroup.getDisplayName());

            findDynamicResourceGroupByDisplayNameUsingPost(
                    identityDomainsClient, dynamicResourceGroup.getDisplayName());

            replaceDynamicResourceGroup(identityDomainsClient, dynamicResourceGroup);

            updateDynamicResourceGroup(identityDomainsClient, dynamicResourceGroup);

            deleteDynamicResourceGroup(identityDomainsClient, dynamicResourceGroup);
        } catch (Exception e) {
            print(e.getMessage());
        } finally {
            identityDomainsClient.close();
        }
    }

    /**
     * Creates a new DynamicResourceGroup object.
     *
     * @param client the identity domain client
     * @return the created dynamic resource group
     */
    private static DynamicResourceGroup createDynamicResourceGroup(
            final IdentityDomainsClient client) {
        DynamicResourceGroup dynamicResourceGroupGroup =
                DynamicResourceGroup.builder()
                        .displayName("displayName" + System.currentTimeMillis())
                        .description("description")
                        .matchingRule(
                                "Any {Any {instance.id = 'ocid1.instance.oc1.iad..exampleuniqueid1',"
                                        + "instance.compartment.id = 'ocid1.compartment.oc1..exampleuniqueid2'}}")
                        .schemas(
                                Collections.singletonList(
                                        "urn:ietf:params:scim:schemas:oracle:idcs:DynamicResourceGroup"))
                        .build();
        final CreateDynamicResourceGroupResponse response =
                client.createDynamicResourceGroup(
                        CreateDynamicResourceGroupRequest.builder()
                                .dynamicResourceGroup(dynamicResourceGroupGroup)
                                .attributeSets(AttributeSets.Request)
                                .build());

        printDynamicResourceGroup(
                "Created dynamic resource group:", response.getDynamicResourceGroup());

        return response.getDynamicResourceGroup();
    }

    /**
     * Retrieves the DynamicResourceGroup by id with specified attributes.
     *
     * @param client the identity domain client
     * @param id the id of the DynamicResourceGroup
     */
    private static void getDynamicResourceGroupById(final IdentityDomainsClient client, String id) {
        String attributes = "displayName,description,matchingRule";
        GetDynamicResourceGroupResponse response =
                client.getDynamicResourceGroup(
                        GetDynamicResourceGroupRequest.builder()
                                .dynamicResourceGroupId(id)
                                .attributes(attributes)
                                .build());

        printDynamicResourceGroup(
                "Found dynamic resource group by id: ", response.getDynamicResourceGroup());
    }

    /**
     * Retrieves a list of dynamic resource groups by display name using LIST method.
     *
     * @param client the identity domain client
     * @param displayName the display name of the dynamic resource group
     */
    private static void findDynamicResourceGroupByDisplayName(
            final IdentityDomainsClient client, String displayName) {
        String attributes = "displayName,description,matchingRule";
        String filter = "displayName eq \"" + displayName + "\"";
        ListDynamicResourceGroupsResponse response =
                client.listDynamicResourceGroups(
                        ListDynamicResourceGroupsRequest.builder()
                                .filter(filter)
                                .attributes(attributes)
                                .build());
        DynamicResourceGroup dynamicResourceGroupGroup =
                response.getDynamicResourceGroups().getResources().get(0);

        printDynamicResourceGroup(
                "Found dynamic resource group by displayName: ", dynamicResourceGroupGroup);
    }

    /**
     * Retrieves a list of dynamic resource groups by display name using POST method.
     *
     * @param client the identity domain client
     * @param displayName the display name of the dynamic resource group
     */
    private static void findDynamicResourceGroupByDisplayNameUsingPost(
            final IdentityDomainsClient client, String displayName) {
        String[] attributes = new String[] {"displayName", "description", "matchingRule"};
        String filter = "displayName eq \"" + displayName + "\"";

        DynamicResourceGroupSearchRequest body =
                DynamicResourceGroupSearchRequest.builder()
                        .attributes(Arrays.asList(attributes))
                        .count(1)
                        .startIndex(1)
                        .filter(filter)
                        .schemas(
                                Collections.singletonList(
                                        "urn:ietf:params:scim:api:messages:2.0:SearchRequest"))
                        .build();
        SearchDynamicResourceGroupsResponse response =
                client.searchDynamicResourceGroups(
                        SearchDynamicResourceGroupsRequest.builder()
                                .dynamicResourceGroupSearchRequest(body)
                                .build());
        DynamicResourceGroup dynamicResourceGroupGroup =
                response.getDynamicResourceGroups().getResources().get(0);

        printDynamicResourceGroup(
                "Found dynamic group by displayName using POST: ", dynamicResourceGroupGroup);
    }

    /**
     * Replace a dynamic resource group with updated description.
     *
     * @param client the identity domain client
     * @param dynamicResourceGroupGroup the dynamic resourceGroup group needs to be updated
     */
    private static void replaceDynamicResourceGroup(
            final IdentityDomainsClient client, DynamicResourceGroup dynamicResourceGroupGroup) {
        DynamicResourceGroup updatedDynamicResourceGroup =
                DynamicResourceGroup.builder()
                        .copy(dynamicResourceGroupGroup)
                        .description("new description")
                        .idcsCreatedBy(null)
                        .idcsLastModifiedBy(null)
                        .schemas(
                                Collections.singletonList(
                                        "urn:ietf:params:scim:schemas:oracle:idcs:DynamicResourceGroup"))
                        .build();
        PutDynamicResourceGroupResponse response =
                client.putDynamicResourceGroup(
                        PutDynamicResourceGroupRequest.builder()
                                .dynamicResourceGroupId(dynamicResourceGroupGroup.getId())
                                .dynamicResourceGroup(updatedDynamicResourceGroup)
                                .build());
        printDynamicResourceGroup(
                "Replaced dynamic resource group (updated description): ",
                response.getDynamicResourceGroup());
    }

    /**
     * Updates a dynamic resource group using PATCH method.
     *
     * @param client the identity domain client
     * @param dynamicResourceGroupGroup the dynamic resourceGroup group needs to be updated
     */
    private static void updateDynamicResourceGroup(
            final IdentityDomainsClient client, DynamicResourceGroup dynamicResourceGroupGroup) {
        PatchOp patchBody =
                PatchOp.builder()
                        .operations(
                                Collections.singletonList(
                                        Operations.builder()
                                                .op(Op.Replace)
                                                .path("description")
                                                .value("updated description")
                                                .build()))
                        .schemas(
                                Collections.singletonList(
                                        "urn:ietf:params:scim:api:messages:2.0:PatchOp"))
                        .build();
        PatchDynamicResourceGroupResponse response =
                client.patchDynamicResourceGroup(
                        PatchDynamicResourceGroupRequest.builder()
                                .dynamicResourceGroupId(dynamicResourceGroupGroup.getId())
                                .patchOp(patchBody)
                                .build());
        printDynamicResourceGroup(
                "Updated dynamic resource group description: ", response.getDynamicResourceGroup());
    }

    /**
     * Deletes a dynamic resource group
     *
     * @param client the identity domain client
     * @param dynamicResourceGroupGroup the dynamic resourceGroup group needs to be deleted
     */
    private static void deleteDynamicResourceGroup(
            final IdentityDomainsClient client, DynamicResourceGroup dynamicResourceGroupGroup) {
        client.deleteDynamicResourceGroup(
                DeleteDynamicResourceGroupRequest.builder()
                        .dynamicResourceGroupId(dynamicResourceGroupGroup.getId())
                        .build());

        print("Deleted dynamic resource group: " + dynamicResourceGroupGroup.getDisplayName());
    }

    private static void print(String text) {
        System.out.println("-------------------------------------------------");
        System.out.println(text);
    }

    private static void printDynamicResourceGroup(
            String text, DynamicResourceGroup dynamicResourceGroupGroup) {
        print(text);
        System.out.println(
                "- DynamicResourceGroup display name: "
                        + dynamicResourceGroupGroup.getDisplayName());
        System.out.println("- Description: " + dynamicResourceGroupGroup.getDescription());
        System.out.println("- Ocid: " + dynamicResourceGroupGroup.getOcid());
        System.out.println("- Matching rule: " + dynamicResourceGroupGroup.getMatchingRule());
    }
}
