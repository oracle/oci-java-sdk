/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.objectstorage.ObjectStorageClient;
import com.oracle.bmc.objectstorage.model.BucketSummary;
import com.oracle.bmc.objectstorage.model.CreateBucketDetails;
import com.oracle.bmc.objectstorage.model.UpdateBucketDetails;
import com.oracle.bmc.objectstorage.requests.CreateBucketRequest;
import com.oracle.bmc.objectstorage.requests.DeleteBucketRequest;
import com.oracle.bmc.objectstorage.requests.GetBucketRequest;
import com.oracle.bmc.objectstorage.requests.GetNamespaceRequest;
import com.oracle.bmc.objectstorage.requests.ListBucketsRequest;
import com.oracle.bmc.objectstorage.requests.UpdateBucketRequest;
import com.oracle.bmc.objectstorage.responses.CreateBucketResponse;
import com.oracle.bmc.objectstorage.responses.GetBucketResponse;
import com.oracle.bmc.objectstorage.responses.UpdateBucketResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class provides a basic example of how to tag buckets in Object Storage.
 */
public class ObjectStorageBucketTaggingExample {
    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     * <ul>
     *   <li>The first argument is the OCID of the compartment where we'll create a bucket</li>
     *   <li>The second is the name of bucket to create</li>
     *   <li>The third is the name (not OCID) of the tag namespace to use in defined tags</li>
     *   <li>The fourth is the name of a tag in the tag namespace to use defined tags</li>
     * </ul>
     */
    public static void main(String[] args) throws Exception {
        if (args.length != 4) {
            throw new IllegalArgumentException(
                    "Unexpected number of arguments received. Consult the script header comments for expected arguments");
        }

        final String compartmentId = args[0];
        final String bucketName = args[1];
        final String tagNamespace = args[2];
        final String tagName = args[3];

        final ConfigFileReader.ConfigFile configFile =
                ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);
        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);
        ObjectStorageClient objectStorageClient = new ObjectStorageClient(provider);
        objectStorageClient.setRegion(Region.US_PHOENIX_1);

        String namespace =
                objectStorageClient.getNamespace(GetNamespaceRequest.builder().build()).getValue();

        /*
         We can assign tags to a bucket at creation time. Like other taggable resources, we can
         assign freeform and defined tags to a bucket. Freeform tags are a dictionary of
         string-to-string, where the key is the tag name and the value is the tag value.

         Defined tags are a dictionary where the key is the tag namespace (string) and the value is another dictionary. In
         this second dictionary, the key is the tag name (string) and the value is the tag value. The tag names have to
         correspond to the name of a tag within the specified namespace (and the namespace must exist).
        */
        Map<String, String> freeformTags = new HashMap<>();
        freeformTags.put("free", "form");
        freeformTags.put("another", "item");

        Map<String, Object> definedTagsMap = new HashMap<>();
        definedTagsMap.put(tagName, "value at create");

        Map<String, Map<String, Object>> definedTags = new HashMap<>();
        definedTags.put(tagNamespace, definedTagsMap);

        CreateBucketResponse createBucketResponse =
                objectStorageClient.createBucket(
                        CreateBucketRequest.builder()
                                .namespaceName(namespace)
                                .createBucketDetails(
                                        CreateBucketDetails.builder()
                                                .name(bucketName)
                                                .compartmentId(compartmentId)
                                                .publicAccessType(
                                                        CreateBucketDetails.PublicAccessType
                                                                .ObjectRead)
                                                .freeformTags(freeformTags)
                                                .definedTags(definedTags)
                                                .build())
                                .build());
        System.out.println("Created a bucket with tags:\n " + createBucketResponse.getBucket());
        System.out.println("=========================\n");

        // Tags come back when retrieving the bucket
        GetBucketResponse getBucketResponse =
                objectStorageClient.getBucket(
                        GetBucketRequest.builder()
                                .namespaceName(namespace)
                                .bucketName(bucketName)
                                .build());
        System.out.println("Retrieved bucket with tags:\n " + getBucketResponse.getBucket());
        System.out.println("=========================\n");

        /*
         Unlike other resources (e.g. instances, VCNs, and block volumes), when listing buckets
         tags are not returned by default. Instead, you need to provide a value to the fields
         parameter when listing buckets in order to have those tags returned.

         Here we can see the result of providing and not providing that parameter.
        */
        for (BucketSummary bucket :
                objectStorageClient
                        .getPaginators()
                        .listBucketsRecordIterator(
                                ListBucketsRequest.builder()
                                        .compartmentId(compartmentId)
                                        .namespaceName(namespace)
                                        .build())) {
            if (bucket.getName().equals(bucketName)) {
                System.out.println("Bucket summary without tags:\n " + bucket);
                System.out.println("=========================\n");
                break;
            }
        }

        List<ListBucketsRequest.Fields> fields = new ArrayList<>();
        fields.add(ListBucketsRequest.Fields.Tags);
        for (BucketSummary bucket :
                objectStorageClient
                        .getPaginators()
                        .listBucketsRecordIterator(
                                ListBucketsRequest.builder()
                                        .compartmentId(compartmentId)
                                        .namespaceName(namespace)
                                        .fields(fields)
                                        .build())) {
            if (bucket.getName().equals(bucketName)) {
                System.out.println("Bucket summary with tags:\n " + bucket);
                System.out.println("=========================\n");
                break;
            }
        }

        /*
         We can also update tags on a bucket. Note that this is a total replacement for any
         previously set freeform or defined tags.
        */
        Map<String, String> updateFreeformTags = new HashMap<>();
        updateFreeformTags.put("new", "freeform");
        Map<String, Object> updateDefinedTagsMap = new HashMap<>();
        updateDefinedTagsMap.put(tagName, "replaced");
        Map<String, Map<String, Object>> updateDefinedTags = new HashMap<>();
        updateDefinedTags.put(tagNamespace, updateDefinedTagsMap);

        UpdateBucketResponse updateBucketResponse =
                objectStorageClient.updateBucket(
                        UpdateBucketRequest.builder()
                                .namespaceName(namespace)
                                .bucketName(bucketName)
                                .updateBucketDetails(
                                        UpdateBucketDetails.builder()
                                                .name(bucketName)
                                                .freeformTags(updateFreeformTags)
                                                .definedTags(updateDefinedTags)
                                                .build())
                                .build());
        System.out.println("Updated a bucket with new tags:\n " + updateBucketResponse.getBucket());
        System.out.println("=========================\n");

        // We can also clear tags from a bucket by passing empty dicts to the tag parameters
        updateBucketResponse =
                objectStorageClient.updateBucket(
                        UpdateBucketRequest.builder()
                                .namespaceName(namespace)
                                .bucketName(bucketName)
                                .updateBucketDetails(
                                        UpdateBucketDetails.builder()
                                                .name(bucketName)
                                                .freeformTags(new HashMap<String, String>())
                                                .definedTags(
                                                        new HashMap<String, Map<String, Object>>())
                                                .build())
                                .build());
        System.out.println("Cleared tags on the bucket:\n " + updateBucketResponse.getBucket());
        System.out.println("=========================\n");

        // Clean up
        objectStorageClient.deleteBucket(
                DeleteBucketRequest.builder()
                        .namespaceName(namespace)
                        .bucketName(bucketName)
                        .build());
        System.out.println("Deleted bucket");
    }
}
