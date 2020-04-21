/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.identity.Identity;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.Tag;
import com.oracle.bmc.identity.model.TagNamespaceSummary;
import com.oracle.bmc.identity.model.UpdateTagDetails;
import com.oracle.bmc.identity.model.WorkRequest;
import com.oracle.bmc.identity.requests.DeleteTagRequest;
import com.oracle.bmc.identity.requests.GetWorkRequestRequest;
import com.oracle.bmc.identity.requests.ListTagNamespacesRequest;
import com.oracle.bmc.identity.requests.UpdateTagRequest;

import java.util.List;

/*
 * Example Class to show the usage of Delete Tag API.
 * This sample will do following things:
 * 1) Get the tag namespace id using the provided name, this should exist in tenancy root compartment
 * 2) Delete the tag
 * 3) Get the status of work request
 */
public class DeleteTagExample {

    public static void main(String[] args) throws Exception {

        // TODO: Fill in this value
        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        // TODO: Provide the tag name to be deleted and tagNamespace name in which this tag belongs to.
        String tagNamespaceName = "CHANGE_ME";
        String tagName = "CHANGE_ME";

        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

        final String tenantId = provider.getTenantId();
        Identity identityClient = new IdentityClient(provider);

        // Get the tagnamespace of given name from tenancy
        TagNamespaceSummary tagNamespace =
                getTagNamespace(identityClient, tenantId, tagNamespaceName);

        UpdateTagDetails updateTagDetails = UpdateTagDetails.builder().isRetired(true).build();
        Tag retiredTag =
                identityClient
                        .updateTag(
                                UpdateTagRequest.builder()
                                        .tagNamespaceId(tagNamespace.getId())
                                        .tagName(tagName)
                                        .updateTagDetails(updateTagDetails)
                                        .build())
                        .getTag();

        System.out.println("\n Tag has been retired -->");
        System.out.println(retiredTag);

        String opcWorkRequestId =
                identityClient
                        .deleteTag(
                                DeleteTagRequest.builder()
                                        .tagNamespaceId(tagNamespace.getId())
                                        .tagName(tagName)
                                        .build())
                        .getOpcWorkRequestId();

        WorkRequest workRequest =
                identityClient
                        .getWorkRequest(
                                GetWorkRequestRequest.builder()
                                        .workRequestId(opcWorkRequestId)
                                        .build())
                        .getWorkRequest();

        System.out.println(
                "\nDelete Tag work request status : " + workRequest.getStatus() + " -->");
        System.out.println(workRequest);
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
}
