/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.identity.Identity;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.IdentityPaginators;
import com.oracle.bmc.identity.model.ChangeTagNamespaceCompartmentDetail;
import com.oracle.bmc.identity.model.Compartment;
import com.oracle.bmc.identity.model.TagNamespace;
import com.oracle.bmc.identity.model.TagNamespaceSummary;
import com.oracle.bmc.identity.requests.ChangeTagNamespaceCompartmentRequest;
import com.oracle.bmc.identity.requests.GetTagNamespaceRequest;
import com.oracle.bmc.identity.requests.ListTagNamespacesRequest;

import shared.ExampleCompartmentHelper;

import java.util.List;

/*
 * Example Class to show the usage of Change Tag-Namespace Compartment API.
 * This sample will do following things:
 * 1) Get the tag namespace id using the provided name, this should exist in tenancy root compartment
 * 2) Get the target compartment id using the compartment name
 * 3) Move tag namespace to target compartment
 * 4) Move tag namespace back to root compartment
 */
public class ChangeTagNamespaceCompartmentExample {

    public static void main(String[] args) throws Exception {

        // TODO: Fill in this value
        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        // TODO: Provide the tag namespace name to be moved and target compartment name
        String tagNamespaceName = "CHANGE_ME";
        String targetCompartmentName = "CHANGE_ME";

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(configurationFilePath, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        final String tenantId = provider.getTenantId();
        Identity identityClient = new IdentityClient(provider);

        // Get the tagnamespace of given name from tenancy
        TagNamespaceSummary tagNamespace =
                getTagNamespace(identityClient, tenantId, tagNamespaceName);

        // Get the compartment of given name from tenancy
        Compartment compartment =
                ExampleCompartmentHelper.getCompartment(
                        identityClient, tenantId, targetCompartmentName);

        //Move Tag Namespace from root comapartment to new compartment
        changeTagNamespaceCompartment(identityClient, tagNamespace.getId(), compartment.getId());

        TagNamespace movedTagNamespace =
                identityClient
                        .getTagNamespace(
                                GetTagNamespaceRequest.builder()
                                        .tagNamespaceId(tagNamespace.getId())
                                        .build())
                        .getTagNamespace();

        System.out.println(
                "\nGetTagNamespace Response after Move for : "
                        + movedTagNamespace.getId()
                        + " -->");
        System.out.println(movedTagNamespace);

        //Move Tag Namespace back to root comapartment
        changeTagNamespaceCompartment(identityClient, tagNamespace.getId(), tenantId);
    }

    public static TagNamespaceSummary getTagNamespace(
            Identity client, String tenantId, String tagNamespaceName) {
        // Get the tagnamespaces in root compartment
        List<TagNamespaceSummary> tagNamespaceLists =
                client.listTagNamespaces(
                                ListTagNamespacesRequest.builder().compartmentId(tenantId).build())
                        .getItems();

        // Find the tag namespace with given name
        for (TagNamespaceSummary tagNamespace : tagNamespaceLists) {
            if (tagNamespace.getName().equalsIgnoreCase(tagNamespaceName)) {
                return tagNamespace;
            }
        }

        throw new RuntimeException("TagNamespace " + tagNamespaceName + " does not exist");
    }

    public static void changeTagNamespaceCompartment(
            Identity client, String tagNamespaceId, String compartmentId) {

        ChangeTagNamespaceCompartmentDetail changeTagNamespaceCompartmentDetail =
                ChangeTagNamespaceCompartmentDetail.builder().compartmentId(compartmentId).build();

        try {
            client.changeTagNamespaceCompartment(
                            ChangeTagNamespaceCompartmentRequest.builder()
                                    .changeTagNamespaceCompartmentDetail(
                                            changeTagNamespaceCompartmentDetail)
                                    .tagNamespaceId(tagNamespaceId)
                                    .build())
                    .getOpcRequestId();
            System.out.println(
                    "\nTagNamespace "
                            + tagNamespaceId
                            + " moved successfully to compartment "
                            + compartmentId);
            return;
        } catch (Exception ex) {
            throw new RuntimeException(
                    "Change TagNamespace compartment failed with error:" + ex.getMessage());
        }
    }
}
