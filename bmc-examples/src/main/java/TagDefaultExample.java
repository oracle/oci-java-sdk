/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.identity.Identity;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.Compartment;
import com.oracle.bmc.identity.model.CreateCompartmentDetails;
import com.oracle.bmc.identity.model.CreateTagDefaultDetails;
import com.oracle.bmc.identity.model.CreateTagDetails;
import com.oracle.bmc.identity.model.CreateTagNamespaceDetails;
import com.oracle.bmc.identity.model.Tag;
import com.oracle.bmc.identity.model.TagDefault;
import com.oracle.bmc.identity.model.TagDefaultSummary;
import com.oracle.bmc.identity.model.TagNamespace;
import com.oracle.bmc.identity.model.TagNamespaceSummary;
import com.oracle.bmc.identity.model.TagSummary;
import com.oracle.bmc.identity.model.UpdateTagDefaultDetails;
import com.oracle.bmc.identity.requests.CreateCompartmentRequest;
import com.oracle.bmc.identity.requests.CreateTagDefaultRequest;
import com.oracle.bmc.identity.requests.CreateTagNamespaceRequest;
import com.oracle.bmc.identity.requests.CreateTagRequest;
import com.oracle.bmc.identity.requests.DeleteTagDefaultRequest;
import com.oracle.bmc.identity.requests.GetTagDefaultRequest;
import com.oracle.bmc.identity.requests.GetTagNamespaceRequest;
import com.oracle.bmc.identity.requests.ListTagDefaultsRequest;
import com.oracle.bmc.identity.requests.ListTagNamespacesRequest;
import com.oracle.bmc.identity.requests.ListTagsRequest;
import com.oracle.bmc.identity.requests.UpdateTagDefaultRequest;
import com.oracle.bmc.identity.responses.GetTagNamespaceResponse;
import com.oracle.bmc.identity.responses.ListTagDefaultsResponse;
import com.oracle.bmc.model.BmcException;
import net.jodah.failsafe.Failsafe;
import net.jodah.failsafe.RetryPolicy;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/*
 * Example Class to show the usage of Tag Default API.
 * This sample will do following things:
 * 1) Get the tag namespace id using the provided name, this should exist in tenancy root compartment
 * 2) Get the tag definition id using the provided name and tag namespace id
 * 3) Create the tag default using tag definition id and tenancy id
 * 4) List the tag defaults for compartment
 * 5) Update the tag default
 * 6) Delete the tag default
 */
public class TagDefaultExample {

    public static void main(String[] args) throws Exception {

        // TODO: Fill in this value
        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        // TODO: Provide the tag namespace name from root compartment and tag definition name, tag definition must exist in tag namespace
        String tagNamespaceName = "CHANGE_ME";
        String tagDefinitionName = "CHANGE_ME";

        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

        final String tenantId = provider.getTenantId();
        Identity identityClient = new IdentityClient(provider);
        String compartmentId = provider.getTenantId();

        // Get the tagnamespace of given name from tenancy
        TagNamespaceSummary tagNamespace =
                getTagNamespace(identityClient, tenantId, tagNamespaceName);

        TagSummary tag =
                getTagDefinition(identityClient, tenantId, tagNamespace, tagDefinitionName);

        // Create Tag Defaults in compartment
        TagDefault tagDefault =
                createTagDefault(identityClient, compartmentId, tag.getId(), "value");

        // List all Tag Defaults within root compartment
        System.out.println("ListTagDefaults from Compartment : " + compartmentId + "\n");
        ListTagDefaultsResponse listTagDefaultsresponse =
                identityClient.listTagDefaults(
                        ListTagDefaultsRequest.builder()
                                .compartmentId(compartmentId)
                                .limit(10)
                                .build());

        System.out.println("ListTagDefaults Response for : " + compartmentId + "\n");
        for (TagDefaultSummary tagDefaults : listTagDefaultsresponse.getItems()) {
            System.out.println(tagDefaults);
        }

        //Updating the tag default created in sample, setting value to updated_value.
        updateTagDefault(identityClient, tagDefault.getId(), "updated_value");

        //Get the updated tag default.
        TagDefault updtedTagDefault = getTagDefault(identityClient, tagDefault.getId());

        System.out.println("Updated TagDefault details for : " + updtedTagDefault.getId() + "\n");
        System.out.println(updtedTagDefault);

        //Delete the tag default.
        deleteTagDefault(identityClient, tagDefault.getId());
    }

    public static Compartment createCompartment(Identity client, String compartmentId) {

        Random random = new Random();

        CreateCompartmentDetails createCompartmentDetails =
                CreateCompartmentDetails.builder()
                        .compartmentId(compartmentId)
                        .description("Sample Compartment")
                        .name("SampleCompartment" + random.nextInt(100))
                        .build();

        CreateCompartmentRequest createCompartmentRequest =
                CreateCompartmentRequest.builder()
                        .createCompartmentDetails(createCompartmentDetails)
                        .build();
        Compartment compartment =
                client.createCompartment(createCompartmentRequest).getCompartment();
        return compartment;
    }

    public static TagDefault createTagDefault(
            Identity client, String compartmentId, String tagDefinitionId, String value) {

        CreateTagDefaultDetails createTagDefaultDetails =
                CreateTagDefaultDetails.builder()
                        .compartmentId(compartmentId)
                        .tagDefinitionId(tagDefinitionId)
                        .value(value)
                        .build();

        try {
            TagDefault tagDefault =
                    client.createTagDefault(
                                    CreateTagDefaultRequest.builder()
                                            .createTagDefaultDetails(createTagDefaultDetails)
                                            .build())
                            .getTagDefault();

            if (tagDefault == null) {
                throw new RuntimeException(
                        "TagDefault creation fails with " + createTagDefaultDetails.toString());
            }

            System.out.println("TagDefault " + tagDefault + " created successfully");
            return tagDefault;
        } catch (Exception ex) {
            throw new RuntimeException("TagDefault creation fails with error:" + ex.getMessage());
        }
    }

    public static TagDefault updateTagDefault(Identity client, String tagDefaultId, String value) {

        UpdateTagDefaultDetails updateTagDefaultDetails =
                UpdateTagDefaultDetails.builder().value(value).build();

        try {
            TagDefault tagDefault =
                    client.updateTagDefault(
                                    UpdateTagDefaultRequest.builder()
                                            .tagDefaultId(tagDefaultId)
                                            .updateTagDefaultDetails(updateTagDefaultDetails)
                                            .build())
                            .getTagDefault();

            if (tagDefault == null) {
                throw new RuntimeException(
                        "TagDefault update fails with " + updateTagDefaultDetails.toString());
            }

            System.out.println("TagDefault" + tagDefault + " updated successfully");
            return tagDefault;
        } catch (Exception ex) {
            throw new RuntimeException("TagDefault update fails with error:" + ex.getMessage());
        }
    }

    public static TagDefault getTagDefault(Identity client, String tagDefaultId) {

        GetTagDefaultRequest tagDefaultRequest =
                GetTagDefaultRequest.builder().tagDefaultId(tagDefaultId).build();

        try {
            TagDefault tagDefault = client.getTagDefault(tagDefaultRequest).getTagDefault();

            System.out.println("TagDefaultId" + tagDefault.getId() + " retrieved successfully");
            return tagDefault;
        } catch (Exception ex) {
            throw new RuntimeException("Tag update fails with error:" + ex.getMessage());
        }
    }

    public static boolean deleteTagDefault(Identity client, String tagDefaultId) {

        DeleteTagDefaultRequest deleteTagDefaultRequest =
                DeleteTagDefaultRequest.builder().tagDefaultId(tagDefaultId).build();

        try {
            client.deleteTagDefault(deleteTagDefaultRequest);

            System.out.println("TagDefaultId" + tagDefaultId + " deleted successfully");
            return Boolean.TRUE;
        } catch (Exception ex) {
            throw new RuntimeException("Tag update fails with error:" + ex.getMessage());
        }
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

    public static TagSummary getTagDefinition(
            Identity client,
            String tenantId,
            TagNamespaceSummary tagNamespace,
            String tagDefinitionName) {
        // Get list of tags in provided tag-namespace
        List<TagSummary> tagLists =
                client.listTags(
                                ListTagsRequest.builder()
                                        .tagNamespaceId(tagNamespace.getId())
                                        .build())
                        .getItems();

        // Find the tag with given name
        for (TagSummary tag : tagLists) {
            if (tag.getName().equalsIgnoreCase(tagDefinitionName)) {
                return tag;
            }
        }

        throw new RuntimeException("Tag " + tagDefinitionName + " does not exist");
    }
}
