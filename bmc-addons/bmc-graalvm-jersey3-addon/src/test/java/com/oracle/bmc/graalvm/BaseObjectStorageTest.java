/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.graalvm;

import com.oracle.bmc.Region;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.ObjectStorageAsync;
import com.oracle.bmc.objectstorage.ObjectStorageAsyncClient;
import com.oracle.bmc.objectstorage.ObjectStorageClient;
import com.oracle.bmc.objectstorage.model.Bucket;
import com.oracle.bmc.objectstorage.model.BucketSummary;
import com.oracle.bmc.objectstorage.model.CreateBucketDetails;
import com.oracle.bmc.objectstorage.model.ObjectSummary;
import com.oracle.bmc.objectstorage.requests.CreateBucketRequest;
import com.oracle.bmc.objectstorage.requests.DeleteBucketRequest;
import com.oracle.bmc.objectstorage.requests.DeleteObjectRequest;
import com.oracle.bmc.objectstorage.requests.ListBucketsRequest;
import com.oracle.bmc.objectstorage.requests.ListObjectsRequest;
import com.oracle.bmc.objectstorage.responses.CreateBucketResponse;
import com.oracle.bmc.objectstorage.responses.ListBucketsResponse;
import com.oracle.bmc.objectstorage.responses.ListObjectsResponse;
import com.oracle.bmc.util.internal.StringUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public abstract class BaseObjectStorageTest extends BaseTest {
    protected static final Map<String, String> TEST_OBJECT_METADATA = new HashMap<>();

    static {
        TEST_OBJECT_METADATA.put("foo", "bar");
    }

    protected static final TestUserResource TEMP_USER =
            new TestUserResource(
                    ADMIN_AUTH_PROVIDER, getNonAdminPublicKey(), ADMIN_CONFIGURATOR, getTenantId());

    protected static ClientConfigurator CLIENT_CONFIGURATOR;
    protected static ObjectStorage CLIENT;
    protected static ObjectStorage ADMIN_CLIENT;
    protected static ObjectStorageAsync ASYNC_CLIENT;

    @BeforeAll
    public static void baseOneTimeSetUp() throws Exception {
        try {
            TEMP_USER.before();

            CLIENT_CONFIGURATOR = createUserConfigurator(TEMP_USER.getUserId());
            CLIENT =
                    new ObjectStorageClient(
                            createUserProvider(TEMP_USER.getUserId()), null, CLIENT_CONFIGURATOR);
            ADMIN_CLIENT =
                    new ObjectStorageClient(
                            ADMIN_AUTH_PROVIDER,
                            null,
                            createUserConfigurator(TEMP_USER.getUserId()));
            ASYNC_CLIENT =
                    new ObjectStorageAsyncClient(
                            createUserProvider(TEMP_USER.getUserId()),
                            null,
                            createUserConfigurator(TEMP_USER.getUserId()));

            Optional<Region> testRegion = BaseTest.getTestRegion();
            if (testRegion.isPresent()) {
                CLIENT.setRegion(testRegion.get());
                ADMIN_CLIENT.setRegion(testRegion.get());
                ASYNC_CLIENT.setRegion(testRegion.get());
            } else {
                String testEndpoint = getTestEndpoint(ObjectStorageClient.SERVICE);
                System.out.println(
                        "Using "
                                + testEndpoint
                                + " for "
                                + ObjectStorageClient.SERVICE.getServiceName());
                CLIENT.setEndpoint(testEndpoint);
                ADMIN_CLIENT.setEndpoint(testEndpoint);
                ASYNC_CLIENT.setEndpoint(testEndpoint);
            }
        } catch (Exception e) {
            // get better debug output
            e.printStackTrace();
            throw e;
        }
    }

    @AfterAll
    public static void baseOneTimeTearDown() throws Exception {
        if (CLIENT != null) {
            CLIENT.close();
        }
        if (ADMIN_CLIENT != null) {
            ADMIN_CLIENT.close();
        }
        if (ASYNC_CLIENT != null) {
            ASYNC_CLIENT.close();
        }

        TEMP_USER.after();
    }

    protected static void tryCleanup(String namespace) {
        // clear old buckets
        try {
            ListBucketsResponse listResponse =
                    CLIENT.listBuckets(
                            ListBucketsRequest.builder()
                                    .namespaceName(namespace)
                                    .compartmentId(getTestCompartmentId())
                                    .build());
            for (BucketSummary bucket : listResponse.getItems()) {
                if (bucket.getName().startsWith(getCrudPrefix())) {
                    ListObjectsResponse listObjectsResponse =
                            CLIENT.listObjects(
                                    ListObjectsRequest.builder()
                                            .namespaceName(namespace)
                                            .bucketName(bucket.getName())
                                            .build());

                    for (ObjectSummary object : listObjectsResponse.getListObjects().getObjects()) {
                        CLIENT.deleteObject(
                                DeleteObjectRequest.builder()
                                        .namespaceName(namespace)
                                        .bucketName(bucket.getName())
                                        .objectName(object.getName())
                                        .build());
                    }

                    CLIENT.deleteBucket(
                            DeleteBucketRequest.builder()
                                    .bucketName(bucket.getName())
                                    .namespaceName(namespace)
                                    .build());
                }
            }
        } catch (Exception e) {
            // ignore
        }
    }

    protected CreateBucketResponse createBucketAndVerifyResponse(
            String namespace, String bucketName, Map<String, String> initialMetadata) {
        return createBucketAndVerifyResponse(
                namespace,
                bucketName,
                initialMetadata,
                CreateBucketDetails.PublicAccessType.NoPublicAccess,
                CreateBucketDetails.StorageTier.Standard);
    }

    protected CreateBucketResponse createBucketAndVerifyResponse(
            final String namespace,
            final String bucketName,
            final Map<String, String> initialMetadata,
            final CreateBucketDetails.PublicAccessType pat,
            final CreateBucketDetails.StorageTier storageTier) {
        return createBucketAndVerifyResponse(
                namespace, bucketName, initialMetadata, pat, storageTier, b -> {});
    }

    protected CreateBucketResponse createBucketAndVerifyResponse(
            final String namespace,
            final String bucketName,
            final Map<String, String> initialMetadata,
            final CreateBucketDetails.PublicAccessType pat,
            final CreateBucketDetails.StorageTier storageTier,
            final com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
        final String compartmentId = getTestCompartmentId();

        // Build Request
        final CreateBucketDetails bucketDetails =
                CreateBucketDetails.builder()
                        .name(bucketName)
                        .metadata(initialMetadata)
                        .compartmentId(compartmentId)
                        .publicAccessType(pat)
                        .storageTier(storageTier)
                        .build();
        final CreateBucketRequest request =
                CreateBucketRequest.builder()
                        .namespaceName(namespace)
                        .createBucketDetails(bucketDetails)
                        .invocationCallback(invocationCallback)
                        .build();

        // Service Call
        final CreateBucketResponse response = CLIENT.createBucket(request);

        // Response Validation
        assertNotNull(response, "CreateBucketResponse should not be null");
        assertTrue(StringUtils.isNotBlank(response.getETag()), "ETag should not be blank");
        assertTrue(StringUtils.isNotBlank(response.getLocation()), "Location should not be blank");
        assertTrue(
                StringUtils.isBlank(response.getOpcClientRequestId()),
                "OpcClientRequestId should be blank");
        assertTrue(
                StringUtils.isNotBlank(response.getOpcRequestId()),
                "OpcRequestId should not be blank");

        final Bucket bucketFromResponse = response.getBucket();
        assertNotNull(bucketFromResponse, "Bucket should not be null");

        assertEquals(
                compartmentId,
                bucketFromResponse.getCompartmentId(),
                "CompartmentId should be equal");
        assertTrue(
                StringUtils.isNotBlank(bucketFromResponse.getCreatedBy()),
                "CreatedBy should not be blank");
        assertTrue(bucketFromResponse.getDefinedTags().isEmpty(), "DefinedTags should be empty");
        assertTrue(
                StringUtils.isNotBlank(bucketFromResponse.getEtag()), "Etag should not be blank");
        assertTrue(bucketFromResponse.getFreeformTags().isEmpty(), "FreeformTags should be empty");
        assertEquals(initialMetadata, bucketFromResponse.getMetadata(), "Metadata should be equal");
        assertEquals(namespace, bucketFromResponse.getNamespace(), "Namespace should be equal");
        assertEquals(
                Bucket.PublicAccessType.valueOf(pat.name()),
                bucketFromResponse.getPublicAccessType(),
                "PublicAccessType should be equal");
        assertEquals(bucketName, bucketFromResponse.getName(), "Bucket Name should be equal");
        assertEquals(
                Bucket.StorageTier.valueOf(storageTier.name()),
                bucketFromResponse.getStorageTier(),
                "StorageTier should be equal");
        assertNotNull(bucketFromResponse.getTimeCreated(), "TimeCreated should not be null");

        return response;
    }
}
