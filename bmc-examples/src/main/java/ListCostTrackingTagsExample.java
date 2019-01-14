/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.identity.Identity;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.*;
import com.oracle.bmc.identity.requests.*;
import com.oracle.bmc.identity.responses.GetTagNamespaceResponse;
import com.oracle.bmc.identity.responses.ListCostTrackingTagsResponse;
import com.oracle.bmc.model.BmcException;

import net.jodah.failsafe.Failsafe;
import net.jodah.failsafe.RetryPolicy;
import net.jodah.failsafe.function.Predicate;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class ListCostTrackingTagsExample {

    final static RetryPolicy RETRY_POLICY =
            new RetryPolicy()
                    .retryOn(new RetryPredicate())
                    .withDelay(1, TimeUnit.SECONDS)
                    .withMaxRetries(10);

    public static void main(String[] args) throws Exception {

        // TODO: Fill in this value
        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

        String compartmentId = provider.getTenantId();
        final String tenantId = provider.getTenantId();
        final Identity identityClient = new IdentityClient(provider);
        identityClient.setRegion(Region.US_ASHBURN_1);

        final TagNamespace tagNamespace1 =
                createTagNamespace(
                        identityClient,
                        tenantId,
                        "SDK-Sample-NS",
                        "Sample Tag Namespace in Tenancy");
        // If we create/update and then try to use tagNamespaces straight away, sometimes we can get a 404. To avoid this,
        // Following code will retry till it gets the newly created tagNamespace.
        final GetTagNamespaceRequest getTagNamespaceRequest =
                GetTagNamespaceRequest.builder().tagNamespaceId(tagNamespace1.getId()).build();

        GetTagNamespaceResponse getTagNamespaceResponse =
                Failsafe.with(RETRY_POLICY)
                        .get(
                                new Callable<GetTagNamespaceResponse>() {
                                    public GetTagNamespaceResponse call() {
                                        return identityClient.getTagNamespace(
                                                getTagNamespaceRequest);
                                    }
                                });

        final Tag tag1 =
                createTag(
                        identityClient,
                        tagNamespace1.getId(),
                        "SDK-Sample-CT-Tag",
                        "Sample Cost Tracking Tag",
                        true);

        // List all Cost Tracking Tags within tenancy
        System.out.println("ListCostTrackingTags from Tenancy : " + tenantId + "\n");
        ListCostTrackingTagsResponse response =
                identityClient.listCostTrackingTags(
                        ListCostTrackingTagsRequest.builder()
                                .compartmentId(tenantId)
                                .limit(10)
                                .build());

        System.out.println("ListCostTrackingTags Response for : " + tenantId + "\n");
        for (Tag tag : response.getItems()) {
            System.out.println(tag);
        }

        //Updating the tags created in sample, setting isCostTrackingTag flag to false.
        updateTag(identityClient, tagNamespace1.getId(), tag1.getName(), "Sample Tag", false);
    }

    public static TagNamespace createTagNamespace(
            Identity client, String compartmentId, String name, String description) {

        CreateTagNamespaceDetails createTagNamespaceDetails =
                CreateTagNamespaceDetails.builder()
                        .compartmentId(compartmentId)
                        .name(name)
                        .description(description)
                        .build();
        try {
            TagNamespace tagNamespace =
                    client.createTagNamespace(
                                    CreateTagNamespaceRequest.builder()
                                            .createTagNamespaceDetails(createTagNamespaceDetails)
                                            .build())
                            .getTagNamespace();

            if (tagNamespace == null) {
                throw new RuntimeException(
                        "TagNamespace creation fails with " + createTagNamespaceDetails.toString());
            }
            System.out.println(
                    "TagNamespace "
                            + createTagNamespaceDetails.getName()
                            + " created successfully");
            return tagNamespace;
        } catch (Exception ex) {
            throw new RuntimeException("TagNamespace creation fails with error:" + ex.getMessage());
        }
    }

    public static Tag createTag(
            Identity client,
            String tagNamespaceId,
            String name,
            String description,
            boolean isCostTracking) {

        CreateTagDetails createTagDetails =
                CreateTagDetails.builder()
                        .isCostTracking(isCostTracking)
                        .name(name)
                        .description(description)
                        .build();

        try {
            Tag tag =
                    client.createTag(
                                    CreateTagRequest.builder()
                                            .createTagDetails(createTagDetails)
                                            .tagNamespaceId(tagNamespaceId)
                                            .build())
                            .getTag();

            if (tag == null) {
                throw new RuntimeException(
                        "Tag creation fails with " + createTagDetails.toString());
            }

            System.out.println("Tag" + createTagDetails.getName() + " created successfully");
            return tag;
        } catch (Exception ex) {
            throw new RuntimeException("Tag creation fails with error:" + ex.getMessage());
        }
    }

    public static Tag updateTag(
            Identity client,
            String tagNamespaceId,
            String name,
            String description,
            boolean isCostTrackingTag) {

        UpdateTagDetails updateTagDetails =
                UpdateTagDetails.builder()
                        .isCostTracking(isCostTrackingTag)
                        .description(description)
                        .build();

        try {
            Tag tag =
                    client.updateTag(
                                    UpdateTagRequest.builder()
                                            .tagName(name)
                                            .tagNamespaceId(tagNamespaceId)
                                            .updateTagDetails(updateTagDetails)
                                            .build())
                            .getTag();

            if (tag == null) {
                throw new RuntimeException("Tag update fails with " + updateTagDetails.toString());
            }

            System.out.println("Tag" + tag + " updated successfully");
            return tag;
        } catch (Exception ex) {
            throw new RuntimeException("Tag update fails with error:" + ex.getMessage());
        }
    }

    private static class RetryPredicate implements Predicate<Throwable> {
        /**
         * Checks if the exception can be retried or not.
         *
         * @param e Exception object.
         * @return Returns true if the exception can be retried otherwise false.
         */
        public boolean test(Throwable e) {
            return e instanceof BmcException && ((BmcException) e).getStatusCode() == 404;
        }
    }
}
