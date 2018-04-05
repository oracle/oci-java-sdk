/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.CreateVcnDetails;
import com.oracle.bmc.core.model.UpdateVcnDetails;
import com.oracle.bmc.core.model.Vcn;
import com.oracle.bmc.core.requests.CreateVcnRequest;
import com.oracle.bmc.core.requests.GetVcnRequest;
import com.oracle.bmc.core.requests.UpdateVcnRequest;
import com.oracle.bmc.core.responses.CreateVcnResponse;
import com.oracle.bmc.core.responses.GetVcnResponse;
import com.oracle.bmc.core.responses.UpdateVcnResponse;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.CreateTagDetails;
import com.oracle.bmc.identity.model.CreateTagNamespaceDetails;
import com.oracle.bmc.identity.model.Tag;
import com.oracle.bmc.identity.model.TagNamespace;
import com.oracle.bmc.identity.model.TagNamespaceSummary;
import com.oracle.bmc.identity.model.TagSummary;
import com.oracle.bmc.identity.model.UpdateTagDetails;
import com.oracle.bmc.identity.model.UpdateTagNamespaceDetails;
import com.oracle.bmc.identity.requests.CreateTagNamespaceRequest;
import com.oracle.bmc.identity.requests.CreateTagRequest;
import com.oracle.bmc.identity.requests.GetTagNamespaceRequest;
import com.oracle.bmc.identity.requests.GetTagRequest;
import com.oracle.bmc.identity.requests.ListTagNamespacesRequest;
import com.oracle.bmc.identity.requests.ListTagsRequest;
import com.oracle.bmc.identity.requests.UpdateTagNamespaceRequest;
import com.oracle.bmc.identity.requests.UpdateTagRequest;
import com.oracle.bmc.identity.responses.CreateTagNamespaceResponse;
import com.oracle.bmc.identity.responses.CreateTagResponse;
import com.oracle.bmc.identity.responses.UpdateTagNamespaceResponse;
import com.oracle.bmc.identity.responses.UpdateTagResponse;
import com.oracle.bmc.model.BmcException;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

/**
 * This class provides an example on how to use tagging in the Java SDK to manage tags and tag namespaces, as
 * well as how to apply freeform and defined tags to a resource.
 */
public class TaggingExample {
    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     * <ul>
     *   <li>The OCID of the compartment where a VCN will be created for tagging.</li>
     * </ul>
     */
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "This example expects one argument: a compartment OCID");
        }

        final String compartmentId = args[0];

        final ConfigFileReader.ConfigFile configFile =
                ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);
        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);
        final IdentityClient identityClient = new IdentityClient(provider);
        final VirtualNetworkClient virtualNetworkClient = new VirtualNetworkClient(provider);

        identityClient.setRegion(Region.US_PHOENIX_1);
        virtualNetworkClient.setRegion(Region.US_PHOENIX_1);

        SecureRandom rnd = SecureRandom.getInstance("SHA1PRNG");
        final String exampleNamespaceName = "examplens_" + rnd.nextInt(1000000);

        // Create a namespace
        CreateTagNamespaceResponse createTagNamespaceResponse =
                identityClient.createTagNamespace(
                        CreateTagNamespaceRequest.builder()
                                .createTagNamespaceDetails(
                                        CreateTagNamespaceDetails.builder()
                                                .compartmentId(compartmentId)
                                                .name(exampleNamespaceName)
                                                .description("Java SDK example tag namespace")
                                                .build())
                                .build());
        final String tagNamespaceId = createTagNamespaceResponse.getTagNamespace().getId();

        System.out.printf(
                "Created tag namespace: %s\n", createTagNamespaceResponse.getTagNamespace());

        // Create a tag
        final String tagOneName = "tagone_" + rnd.nextInt(1000000);
        CreateTagResponse createTagOneResponse =
                identityClient.createTag(
                        CreateTagRequest.builder()
                                .tagNamespaceId(tagNamespaceId)
                                .createTagDetails(
                                        CreateTagDetails.builder()
                                                .name(tagOneName)
                                                .description("Java SDK example tag one")
                                                .build())
                                .build());

        System.out.printf("Created tag: %s\n", createTagOneResponse.getTag());

        // Create another tag
        final String tagTwoName = "tagtwo_" + rnd.nextInt(1000000);
        CreateTagResponse createTagTwoResponse =
                identityClient.createTag(
                        CreateTagRequest.builder()
                                .tagNamespaceId(tagNamespaceId)
                                .createTagDetails(
                                        CreateTagDetails.builder()
                                                .name(tagTwoName)
                                                .description("Java SDK example tag two")
                                                .build())
                                .build());

        System.out.printf("Created tag: %s\n", createTagTwoResponse.getTag());

        // We can retire a tag by using the update tag operation
        UpdateTagResponse updateTagOneResponse =
                identityClient.updateTag(
                        UpdateTagRequest.builder()
                                .tagNamespaceId(tagNamespaceId)
                                .tagName(tagOneName)
                                .updateTagDetails(
                                        UpdateTagDetails.builder().isRetired(true).build())
                                .build());
        System.out.printf("Updated tag (retired): %s\n", updateTagOneResponse.getTag());

        // We can retrieve individual tags and namespaces
        TagNamespace tagNamespace =
                identityClient
                        .getTagNamespace(
                                GetTagNamespaceRequest.builder()
                                        .tagNamespaceId(tagNamespaceId)
                                        .build())
                        .getTagNamespace();
        Tag tagOne =
                identityClient
                        .getTag(
                                GetTagRequest.builder()
                                        .tagNamespaceId(tagNamespaceId)
                                        .tagName(tagOneName)
                                        .build())
                        .getTag();
        Tag tagTwo =
                identityClient
                        .getTag(
                                GetTagRequest.builder()
                                        .tagNamespaceId(tagNamespaceId)
                                        .tagName(tagTwoName)
                                        .build())
                        .getTag();

        /*
         We can list tags and namespaces. These operations are paginated and take a "page" parameter to allow you
         to get the next batch of items from the server
        */
        for (TagNamespaceSummary tagNamespaceSummary :
                identityClient
                        .getPaginators()
                        .listTagNamespacesRecordIterator(
                                ListTagNamespacesRequest.builder()
                                        .compartmentId(compartmentId)
                                        .build())) {
            System.out.println("TagNamespace: " + tagNamespaceSummary.getName());
        }
        for (TagSummary tagInNamespace :
                identityClient
                        .getPaginators()
                        .listTagsRecordIterator(
                                ListTagsRequest.builder().tagNamespaceId(tagNamespaceId).build())) {
            System.out.println("Tag: " + tagInNamespace.getName());
        }

        // We can also reactivate a tag using the update tag operation
        updateTagOneResponse =
                identityClient.updateTag(
                        UpdateTagRequest.builder()
                                .tagNamespaceId(tagNamespaceId)
                                .tagName(tagOneName)
                                .updateTagDetails(
                                        UpdateTagDetails.builder().isRetired(false).build())
                                .build());
        System.out.println("Updated tag (reactivated): " + updateTagOneResponse.getTag());

        Map<String, String> freeformTags = new HashMap<>();
        freeformTags.put("free", "form");
        freeformTags.put("another", "item");

        Map<String, Object> definedTagsMap = new HashMap<>();
        definedTagsMap.put(tagOneName, "hello");
        definedTagsMap.put(tagTwoName, "world");

        Map<String, Map<String, Object>> definedTags = new HashMap<>();
        definedTags.put(tagNamespace.getName(), definedTagsMap);

        /*
         We can assign freeform and defined tags at creation time. Freeform tags are a dictionary of string-to-string,
         where the key is the tag name and the value is the tag value.

         Defined tags are a dictionary where the key is the tag namespace (string) and the value is another dictionary. In
         this second dictionary, the key is the tag name (string) and the value is the tag value. The tag names have to
         correspond to the name of a tag within the specified namespace (and the namespace must exist).

         Resources where we can create/update tags will have the freeform_tags and defined_tags attributes. Consult the API
         documentation to see what these are (https://oracle-cloud-infrastructure-python-sdk.readthedocs.io/en/latest/api/index.html)
        */
        String vcnId;
        int numTries = 0;
        while (true) {
            try {
                CreateVcnResponse createVcnResponse =
                        virtualNetworkClient.createVcn(
                                CreateVcnRequest.builder()
                                        .createVcnDetails(
                                                CreateVcnDetails.builder()
                                                        .cidrBlock("10.0.0.0/16")
                                                        .compartmentId(compartmentId)
                                                        .displayName("Java SDK tagging example VCN")
                                                        .dnsLabel("vnc" + rnd.nextInt(1000000))
                                                        .freeformTags(freeformTags)
                                                        .definedTags(definedTags)
                                                        .build())
                                        .build());
                vcnId = createVcnResponse.getVcn().getId();
                GetVcnResponse getVcnResponse =
                        virtualNetworkClient
                                .getWaiters()
                                .forVcn(
                                        GetVcnRequest.builder().vcnId(vcnId).build(),
                                        Vcn.LifecycleState.Available)
                                .execute();
                System.out.println("Created VCN with tags: " + getVcnResponse.getVcn());
                break;
            } catch (BmcException e) {
                if (e.getStatusCode() == 404) {
                    System.out.println("Retrying on 404: " + e.getMessage());
                    numTries++;
                    if (numTries >= 3) {
                        // If we can't get it in 3 tries, something else may be going on
                        throw e;
                    } else {
                        Thread.sleep(2000L);
                    }
                } else {
                    throw e;
                }
            }
        }

        /*
          We can also update tags on a resource. Note that this is a total replacement for any previously set freeform or defined tags.

          Resources where we can create/update tags will have the freeform_tags and defined_tags attributes. Consult the API
          documentation to see what these are (https://oracle-cloud-infrastructure-python-sdk.readthedocs.io/en/latest/api/index.html)
        */
        Map<String, String> updateFreeformTags = new HashMap<>();
        updateFreeformTags.put("total", "replace");

        Map<String, Object> updateDefinedTagsMap = new HashMap<>();
        updateDefinedTagsMap.put(tagTwoName, "also replaced");

        Map<String, Map<String, Object>> updatedDefinedTags = new HashMap<>();
        updatedDefinedTags.put(tagNamespace.getName(), updateDefinedTagsMap);

        UpdateVcnResponse updateVcnResponse =
                virtualNetworkClient.updateVcn(
                        UpdateVcnRequest.builder()
                                .vcnId(vcnId)
                                .updateVcnDetails(
                                        UpdateVcnDetails.builder()
                                                .freeformTags(updateFreeformTags)
                                                .definedTags(updatedDefinedTags)
                                                .build())
                                .build());
        System.out.println("Updated tags on VCN: " + updateVcnResponse.getVcn());

        // We can also totally remove tags on a resource by passing in an empty dictionary for those tagging parameters
        updateVcnResponse =
                virtualNetworkClient.updateVcn(
                        UpdateVcnRequest.builder()
                                .vcnId(vcnId)
                                .updateVcnDetails(
                                        UpdateVcnDetails.builder()
                                                .freeformTags(new HashMap<String, String>())
                                                .definedTags(
                                                        new HashMap<String, Map<String, Object>>())
                                                .build())
                                .build());
        System.out.println("Removed tags from VCN: " + updateVcnResponse.getVcn());

        // Previously we saw retiring a tag. We can also retire a tag namespace - this will also retire any tags in that namespace
        UpdateTagNamespaceResponse updateTagNamespaceResponse =
                identityClient.updateTagNamespace(
                        UpdateTagNamespaceRequest.builder()
                                .tagNamespaceId(tagNamespaceId)
                                .updateTagNamespaceDetails(
                                        UpdateTagNamespaceDetails.builder().isRetired(true).build())
                                .build());
        System.out.println(
                "Updated tag namespace (retired): " + updateTagNamespaceResponse.getTagNamespace());
        System.out.println(
                "Tags in namespace: "
                        + identityClient
                                .listTags(
                                        ListTagsRequest.builder()
                                                .tagNamespaceId(tagNamespaceId)
                                                .build())
                                .getItems());

        /*
          We can also reactivate a namespace. Note that this doesn't reactivate the tags in that namespace - those tags will need
          to be reactivated individually
        */
        updateTagNamespaceResponse =
                identityClient.updateTagNamespace(
                        UpdateTagNamespaceRequest.builder()
                                .tagNamespaceId(tagNamespaceId)
                                .updateTagNamespaceDetails(
                                        UpdateTagNamespaceDetails.builder()
                                                .isRetired(false)
                                                .build())
                                .build());
        System.out.println(
                "Updated tag namespace (reactivated): "
                        + updateTagNamespaceResponse.getTagNamespace());
        System.out.println(
                "Tags in namespace: "
                        + identityClient
                                .listTags(
                                        ListTagsRequest.builder()
                                                .tagNamespaceId(tagNamespaceId)
                                                .build())
                                .getItems());

        identityClient.updateTagNamespace(
                UpdateTagNamespaceRequest.builder()
                        .tagNamespaceId(tagNamespaceId)
                        .updateTagNamespaceDetails(
                                UpdateTagNamespaceDetails.builder().isRetired(true).build())
                        .build());
    }
}
