/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
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
import com.oracle.bmc.identity.requests.ListCompartmentsRequest;
import com.oracle.bmc.identity.requests.ListTagNamespacesRequest;

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

        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

        final String tenantId = provider.getTenantId();
        Identity identityClient = new IdentityClient(provider);

        // Get the tagnamespace of given name from tenancy
        TagNamespaceSummary tagNamespace =
                getTagNamespace(identityClient, tenantId, tagNamespaceName);

        // Get the compartment of given name from tenancy
        Compartment compartment = getCompartment(identityClient, tenantId, targetCompartmentName);

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

    public static Compartment getCompartment(
            Identity client, String tenantId, String compartmentName) {

        IdentityPaginators paginators = client.getPaginators();

        // Get the compartment from tenancy of given name
        ListCompartmentsRequest listCompartmentsRequest =
                ListCompartmentsRequest.builder().compartmentId(tenantId).limit(1000).build();

        for (Compartment compartment :
                paginators.listCompartmentsRecordIterator(listCompartmentsRequest)) {
            if (compartment.getName().equalsIgnoreCase(compartmentName)) {
                return compartment;
            }
        }

        System.out.println(
                "Compartment " + compartmentName + "does not exist. Please check the name.");
        throw new RuntimeException("Compartment does not exist");
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
