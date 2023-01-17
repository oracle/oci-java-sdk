/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.graalvm;

import com.oracle.bmc.Region;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.client.internal.RFC3339DateFormat;
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
import com.oracle.bmc.identity.requests.ListTagNamespacesRequest;
import com.oracle.bmc.identity.requests.ListTagsRequest;
import com.oracle.bmc.identity.requests.UpdateTagNamespaceRequest;
import com.oracle.bmc.identity.requests.UpdateTagRequest;
import com.oracle.bmc.identity.responses.CreateTagNamespaceResponse;
import com.oracle.bmc.identity.responses.CreateTagResponse;
import com.oracle.bmc.identity.responses.ListTagsResponse;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.util.internal.StringUtils;
import net.jodah.failsafe.Failsafe;
import net.jodah.failsafe.RetryPolicy;

import java.util.AbstractMap;
import javax.annotation.Nonnull;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class TaggingResourceHelper {

    private static final String D_TAG_NAMESPACE_LEVEL_1 = "java_sdk_tag_ns_001";
    private static final String D_TAG_NAMESPACE_LEVEL_2 = "java_sdk_tag_ns_002";
    private static final String D_TAG_NAME_1 = "java_sdk_tag_01";
    private static final String D_TAG_NAME_2 = "java_sdk_tag_02";
    private static final String D_TAG_NAME_3 = "java_sdk_tag_03";
    private static final Map.Entry<String, String> F_TAG_PAIR_1 =
            new AbstractMap.SimpleImmutableEntry<>("tag1", "value1");
    private static final Map.Entry<String, String> F_TAG_PAIR_2 =
            new AbstractMap.SimpleImmutableEntry<>("tag2", "value2");

    private String tagNamespaceId1;
    private Map<String, String> freeformTags;
    private Map<String, Map<String, Object>> definedTags;
    private static final RetryPolicy RETRY_POLICY =
            new RetryPolicy()
                    .retryOn(BmcException.class)
                    .withDelay(5, TimeUnit.SECONDS)
                    .withMaxRetries(3);

    public TaggingResourceHelper(
            @Nonnull BasicAuthenticationDetailsProvider authProvider,
            ClientConfigurator configurator,
            String tenantId) {
        if (authProvider == null) {
            throw new NullPointerException("authProvider is marked non-null but is null");
        }
        Failsafe.with(RETRY_POLICY)
                .run(
                        () -> {
                            initialize(authProvider, configurator, tenantId);
                        });
    }

    public void assertDefinedTags(final Map<String, Map<String, Object>> actual) {
        assertNotNull("Defined tags should not be null", actual);
        assertEquals("Defined tags should contain only 1 entry set", 1, actual.size());

        assertTrue(
                String.format(
                        "The defined tag with key [%s] should be defined", D_TAG_NAMESPACE_LEVEL_1),
                actual.containsKey(D_TAG_NAMESPACE_LEVEL_1));
        final Map<String, Object> value = actual.get(D_TAG_NAMESPACE_LEVEL_1);
        final Map<String, Object> expect = definedTags.get(D_TAG_NAMESPACE_LEVEL_1);

        assertEquals("The number of values should be equal", expect.size(), value.size());
        assertTrue(
                String.format(
                        "The defined tag attribute with key [%s] should be defined", D_TAG_NAME_1),
                value.containsKey(D_TAG_NAME_1));
        assertEquals(
                String.format(
                        "The defined tag attribute value with key [%s] should be equal",
                        D_TAG_NAME_1),
                expect.get(D_TAG_NAME_1).toString(),
                value.get(D_TAG_NAME_1));
        assertTrue(
                String.format(
                        "The defined tag attribute with key [%s] should be defined", D_TAG_NAME_2),
                value.containsKey(D_TAG_NAME_2));
        assertEquals(
                String.format(
                        "The defined tag attribute value with key [%s] should be equal",
                        D_TAG_NAME_2),
                expect.get(D_TAG_NAME_2).toString(),
                value.get(D_TAG_NAME_2));
        assertTrue(
                String.format(
                        "The defined tag attribute with key [%s] should be defined", D_TAG_NAME_3),
                value.containsKey(D_TAG_NAME_3));

        final Object actualTag3Value = value.get(D_TAG_NAME_3);
        final String assertMsg =
                String.format(
                        "The defined tag attribute value with key [%s] should be equal",
                        D_TAG_NAME_3);
        if (actualTag3Value instanceof Date) {
            assertEquals(assertMsg, expect.get(D_TAG_NAME_3), actualTag3Value);
        } else if (actualTag3Value instanceof String) {
            final String expectedDate =
                    RFC3339DateFormat.formatRfc3339(
                            (Date) expect.get(D_TAG_NAME_3), true /* Do include millis */);
            assertEquals(assertMsg, expectedDate, value.get(D_TAG_NAME_3));
        } else {
            fail(
                    String.format(
                            "Unknown type [%s] for value of [key: %s]",
                            actualTag3Value.getClass().getCanonicalName(), D_TAG_NAME_3));
        }
    }

    public void assertFreeformTags(final Map<String, String> actual) {
        assertNotNull("FreeformTags should not be null", actual);
        assertEquals("FreeformTags should have size of 2", 2, actual.size());

        assertTrue(
                "FreeformTags should contain key: " + F_TAG_PAIR_1.getKey(),
                actual.containsKey(F_TAG_PAIR_1.getKey()));
        assertEquals(
                "FreeformTags should contain value: " + F_TAG_PAIR_1.getValue(),
                F_TAG_PAIR_1.getValue(),
                actual.get(F_TAG_PAIR_1.getKey()));

        assertTrue(
                "FreeformTags should contain key: " + F_TAG_PAIR_2.getKey(),
                actual.containsKey(F_TAG_PAIR_2.getKey()));
        assertEquals(
                "FreeformTags should contain value: " + F_TAG_PAIR_2.getValue(),
                F_TAG_PAIR_2.getValue(),
                actual.get(F_TAG_PAIR_2.getKey()));
    }

    /**
     * Performs tagging interactions on an existing resource:
     *
     * <p>- Update a resource to have tags - Doing an update with null tags preserves tags -
     * Clearing tags on a resource by providing empty maps
     *
     * @param freeformTagsForUpdate the freeform tags we'll update on the resource
     * @param definedTagsForUpdate the defined tags we'll update on the resource
     * @param updateTagsOnResourceFunction a function which can take a tagging input and updates the
     *     the resource with those tags. This function returns the response from the update
     * @param getFreeformTagsFromUpdateResponseFunction a function which can get the freeform tags
     *     from the response from updating a resource
     * @param getDefinedTagsFromUpdateResponseFunction a function which can get the defined tags
     *     from the response from updating a resource
     * @param getResourceSupplier a supplier which can retrieve a resource. This supplier returns a
     *     response from a get service call
     * @param getFreeformTagsFromGetResponseFunction a function which can get the freeform tags from
     *     the response from geting a resource
     * @param getDefinedTagsFromGetResponseFunction a function which can get the defined tags from
     *     the response from getting a resource
     */
    public <T, U> void doTaggingInteractionsOnExistingResource(
            final Map<String, String> freeformTagsForUpdate,
            final Map<String, Map<String, Object>> definedTagsForUpdate,
            final Function<TaggingInput, T> updateTagsOnResourceFunction,
            final Function<T, Map<String, String>> getFreeformTagsFromUpdateResponseFunction,
            final Function<T, Map<String, Map<String, Object>>>
                    getDefinedTagsFromUpdateResponseFunction,
            final Supplier<U> getResourceSupplier,
            final Function<U, Map<String, String>> getFreeformTagsFromGetResponseFunction,
            final Function<U, Map<String, Map<String, Object>>>
                    getDefinedTagsFromGetResponseFunction) {

        final TaggingInput updateWithTags =
                new TaggingInput(freeformTagsForUpdate, definedTagsForUpdate);
        T updateResponse = updateTagsOnResourceFunction.apply(updateWithTags);
        assertEquals(
                "Expected defined tags to be changed after update",
                definedTagsForUpdate,
                getDefinedTagsFromUpdateResponseFunction.apply(updateResponse));
        assertEquals(
                "Expected freeform tags to be changed after update",
                freeformTagsForUpdate,
                getFreeformTagsFromUpdateResponseFunction.apply(updateResponse));

        U getResponse = getResourceSupplier.get();
        assertEquals(
                "Expected updated defined tags to be in get response after update",
                definedTagsForUpdate,
                getDefinedTagsFromGetResponseFunction.apply(getResponse));
        assertEquals(
                "Expected updated freeform tags to be in get response after update",
                freeformTagsForUpdate,
                getFreeformTagsFromGetResponseFunction.apply(getResponse));

        final TaggingInput updateWithNullTags = new TaggingInput(null, null);
        updateResponse = updateTagsOnResourceFunction.apply(updateWithNullTags);
        assertEquals(
                "Expected defined tags to not be changed if passed as null in an update",
                definedTagsForUpdate,
                getDefinedTagsFromUpdateResponseFunction.apply(updateResponse));
        assertEquals(
                "Expected freeform tags to not be changed if passed as null in an update",
                freeformTagsForUpdate,
                getFreeformTagsFromUpdateResponseFunction.apply(updateResponse));
        getResponse = getResourceSupplier.get();
        assertEquals(
                "Get resource response: Expected defined tags to not be changed if passed as null in an update",
                definedTagsForUpdate,
                getDefinedTagsFromGetResponseFunction.apply(getResponse));
        assertEquals(
                "Get resource response: Expected freeform tags to not be changed if passed as null in an update",
                freeformTagsForUpdate,
                getFreeformTagsFromGetResponseFunction.apply(getResponse));

        final TaggingInput updateToClearTags = new TaggingInput(new HashMap<>(), new HashMap<>());
        updateResponse = updateTagsOnResourceFunction.apply(updateToClearTags);
        assertTrue(
                "Expected defined tags after clearing tags to be an empty map in the update response",
                getDefinedTagsFromUpdateResponseFunction.apply(updateResponse).isEmpty());
        assertTrue(
                "Expected freeform tags after clearing tags to be an empty map in the update response",
                getFreeformTagsFromUpdateResponseFunction.apply(updateResponse).isEmpty());

        getResponse = getResourceSupplier.get();
        assertTrue(
                "Expected defined tags after clearing tags to be an empty map in the get response",
                getDefinedTagsFromUpdateResponseFunction.apply(updateResponse).isEmpty());
        assertTrue(
                "Expected freeform tags after clearing tags to be an empty map in the get response",
                getFreeformTagsFromUpdateResponseFunction.apply(updateResponse).isEmpty());
    }

    public Map<String, Map<String, Object>> updatedDefinedTags() {
        final Map<String, Map<String, Object>> updatedDefinedTags = new HashMap<>();
        for (Map.Entry<String, Map<String, Object>> namespaceAndTags :
                getDefinedTags().entrySet()) {
            updatedDefinedTags.put(namespaceAndTags.getKey(), new HashMap<>());
            int counter = 0;
            for (Map.Entry<String, Object> tagValues : namespaceAndTags.getValue().entrySet()) {
                updatedDefinedTags
                        .get(namespaceAndTags.getKey())
                        .put(tagValues.getKey(), String.format("Updated value: %d", counter));
                counter++;
            }
        }
        return updatedDefinedTags;
    }

    public Map<String, String> updatedFreeformTags() {
        final Map<String, String> updatedFreeformTags = new HashMap<>();
        updatedFreeformTags.put("integTag1", "integTagValue");
        updatedFreeformTags.put("integTag2", "another value");
        return updatedFreeformTags;
    }

    private void initialize(
            BasicAuthenticationDetailsProvider authProvider,
            ClientConfigurator configurator,
            String tenantId) {
        try (IdentityClient identity = new IdentityClient(authProvider, null, configurator)) {
            Optional<Region> testRegion = BaseTest.getTestRegion();

            if (testRegion.isPresent()) {
                identity.setRegion(testRegion.get());
            } else {
                identity.setEndpoint(BaseTest.getTestEndpoint(IdentityClient.SERVICE));
            }

            // Create tag namespaces and tags
            tagNamespaceId1 =
                    createTagNamespace(
                            authProvider,
                            identity,
                            D_TAG_NAMESPACE_LEVEL_1,
                            "Java SDK Tag Namespace Level 1.",
                            tenantId);

            createTag(identity, tagNamespaceId1, D_TAG_NAME_1);
            createTag(identity, tagNamespaceId1, D_TAG_NAME_2);
            createTag(identity, tagNamespaceId1, D_TAG_NAME_3);

            freeformTags =
                    new HashMap<String, String>() {
                        {
                            put(F_TAG_PAIR_1.getKey(), F_TAG_PAIR_1.getValue());
                            put(F_TAG_PAIR_2.getKey(), F_TAG_PAIR_2.getValue());
                        }
                    };

            definedTags =
                    new HashMap<String, Map<String, Object>>() {
                        {
                            put(
                                    D_TAG_NAMESPACE_LEVEL_1,
                                    new HashMap<String, Object>() {
                                        {
                                            /*
                                             * TODO: Have an open question about the "10". Core Services appears to be permissive in that
                                             * it takes it and coerces to a number, but Object Storage expects a string:
                                             *
                                             * The value of the 'java_sdk_tag_04' entry in the 'definedTags.java_sdk_tag_ns_0003'
                                             * field must be a JSON string (it was a 'NUMBER')
                                             *
                                             * Object Storage is technically correct: https://docs.cloud.oracle.com/Content/Identity/Concepts/taggingoverview.htm#Concepts
                                             * but this behaviour does differ between different services
                                             */
                                            put(D_TAG_NAME_1, "10");
                                            put(D_TAG_NAME_2, "JavaSDK");
                                            put(D_TAG_NAME_3, new Date());
                                        }
                                    });
                        }
                    };

            createTagNamespace(
                    authProvider,
                    identity,
                    D_TAG_NAMESPACE_LEVEL_2,
                    "Java SDK Tag Namespace Level 2.",
                    tenantId);
        }
    }

    private void createTag(IdentityClient identity, String tagNamespaceId, String name) {
        ListTagsRequest listTagsRequest =
                ListTagsRequest.builder().tagNamespaceId(tagNamespaceId).build();

        ListTagsResponse listTagsResponse = identity.listTags(listTagsRequest);

        assertNotNull(listTagsResponse);
        assertTrue(StringUtils.isNotBlank(listTagsResponse.getOpcRequestId()));

        Optional<TagSummary> anyTag =
                listTagsResponse.getItems().stream()
                        .filter(tagSummary -> tagSummary.getName().equals(name))
                        .findAny();
        if (anyTag.isPresent()) {
            // tag has been created
            if (anyTag.get().getIsRetired()) {
                identity.updateTag(
                        UpdateTagRequest.builder()
                                .tagName(name)
                                .tagNamespaceId(tagNamespaceId)
                                .updateTagDetails(
                                        UpdateTagDetails.builder().isRetired(false).build())
                                .build());
            }
            return;
        }

        CreateTagDetails createTagDetails =
                CreateTagDetails.builder().name(name).description(name).build();

        CreateTagRequest createTagRequest =
                CreateTagRequest.builder()
                        .createTagDetails(createTagDetails)
                        .tagNamespaceId(tagNamespaceId)
                        .build();

        CreateTagResponse createTagResponse = identity.createTag(createTagRequest);

        assertNotNull(createTagResponse);
        assertTrue(StringUtils.isNotBlank(createTagResponse.getOpcRequestId()));

        Tag tag = createTagResponse.getTag();

        assertNotNull(tag);
        assertNotNull(tag.getId());
        assertEquals(name, tag.getName());
        assertEquals(tagNamespaceId, tag.getTagNamespaceId());
    }

    private String createTagNamespace(
            BasicAuthenticationDetailsProvider authProvider,
            IdentityClient identity,
            String name,
            String description,
            String tenantId) {

        TagNamespaceSummary tagNamespaceSummary = null;

        for (TagNamespaceSummary tagNamespace :
                identity.getPaginators()
                        .listTagNamespacesRecordIterator(
                                ListTagNamespacesRequest.builder()
                                        .compartmentId(tenantId)
                                        .build())) {
            if (tagNamespace.getName().equals(name)
                    && tagNamespace.getCompartmentId().equals(tenantId)) {
                tagNamespaceSummary = tagNamespace;
                break;
            }
        }

        if (tagNamespaceSummary != null) {
            if (tagNamespaceSummary.getIsRetired()) {
                // namespace is retired, need to unretire it
                identity.updateTagNamespace(
                        UpdateTagNamespaceRequest.builder()
                                .tagNamespaceId(tagNamespaceSummary.getId())
                                .updateTagNamespaceDetails(
                                        UpdateTagNamespaceDetails.builder()
                                                .isRetired(false)
                                                .build())
                                .build());
            }
            return tagNamespaceSummary.getId();
        }

        CreateTagNamespaceDetails.Builder createTagNamespaceDetailsBuilder =
                CreateTagNamespaceDetails.builder()
                        .compartmentId(tenantId)
                        .name(name)
                        .description(description);

        if (name.equals(D_TAG_NAMESPACE_LEVEL_2)) {
            createTagNamespaceDetailsBuilder.freeformTags(freeformTags).definedTags(definedTags);
        }

        CreateTagNamespaceDetails createTagNamespaceDetails =
                createTagNamespaceDetailsBuilder.build();

        CreateTagNamespaceRequest createTagNamespaceRequest =
                CreateTagNamespaceRequest.builder()
                        .createTagNamespaceDetails(createTagNamespaceDetails)
                        .build();

        CreateTagNamespaceResponse createTagNamespaceResponse =
                identity.createTagNamespace(createTagNamespaceRequest);

        assertNotNull(createTagNamespaceResponse);
        assertTrue(StringUtils.isNotBlank(createTagNamespaceResponse.getOpcRequestId()));

        TagNamespace tagNamespace = createTagNamespaceResponse.getTagNamespace();

        assertNotNull(tagNamespace);
        assertNotNull(tagNamespace.getId());
        assertEquals(createTagNamespaceDetails.getCompartmentId(), tagNamespace.getCompartmentId());
        assertEquals(createTagNamespaceDetails.getName(), tagNamespace.getName());
        assertEquals(createTagNamespaceDetails.getDescription(), tagNamespace.getDescription());

        return tagNamespace.getId();
    }

    public String getTagNamespaceId1() {
        return this.tagNamespaceId1;
    }

    public Map<String, String> getFreeformTags() {
        return this.freeformTags;
    }

    public Map<String, Map<String, Object>> getDefinedTags() {
        return this.definedTags;
    }

    public static class TaggingInput {
        private Map<String, String> freeformTags;
        private Map<String, Map<String, Object>> definedTags;

        public TaggingInput(
                final Map<String, String> freeformTags,
                final Map<String, Map<String, Object>> definedTags) {

            // Shallow copies are OK here since we'll just be reading these
            if (freeformTags != null) {
                this.freeformTags = new HashMap<>(freeformTags);
            } else {
                this.freeformTags = null;
            }

            if (definedTags != null) {
                this.definedTags = new HashMap<>(definedTags);
            } else {
                this.definedTags = null;
            }
        }

        public Map<String, String> getFreeformTags() {
            return this.freeformTags;
        }

        public Map<String, Map<String, Object>> getDefinedTags() {
            return this.definedTags;
        }
    }
}
