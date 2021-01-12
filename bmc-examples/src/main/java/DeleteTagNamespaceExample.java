/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.identity.Identity;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.TagNamespaceSummary;
import com.oracle.bmc.identity.requests.DeleteTagNamespaceRequest;
import com.oracle.bmc.identity.requests.ListTagNamespacesRequest;
import com.oracle.bmc.identity.responses.DeleteTagNamespaceResponse;

import java.util.List;

/*
 * Example Class to show the usage of Delete Tag API.
 * This sample will do following things:
 * 1) Get the tag namespace id using the provided name, this should exist in tenancy root compartment
 * 2) Delete the tagNamespace
 * 3) Get the status of work request
 */
public class DeleteTagNamespaceExample {

    public static void main(String[] args) throws Exception {

        // TODO: Fill in this value
        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        // TODO: Provide the tag namespace name to be deleted
        String tagNamespaceName = "CHANGE_ME";

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

        DeleteTagNamespaceResponse deleteTagNamespaceResponse =
                identityClient.deleteTagNamespace(
                        DeleteTagNamespaceRequest.builder()
                                .tagNamespaceId(tagNamespace.getId())
                                .build());

        System.out.println("\n Tag Namespace has been deleted -->");
        System.out.println(deleteTagNamespaceResponse.getOpcRequestId());
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
