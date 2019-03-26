/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.ObjectStorageClient;
import com.oracle.bmc.objectstorage.model.CreateBucketDetails;
import com.oracle.bmc.objectstorage.model.ObjectLifecycleRule;
import com.oracle.bmc.objectstorage.model.ObjectNameFilter;
import com.oracle.bmc.objectstorage.model.PutObjectLifecyclePolicyDetails;
import com.oracle.bmc.objectstorage.requests.CreateBucketRequest;
import com.oracle.bmc.objectstorage.requests.DeleteBucketRequest;
import com.oracle.bmc.objectstorage.requests.DeleteObjectLifecyclePolicyRequest;
import com.oracle.bmc.objectstorage.requests.GetNamespaceRequest;
import com.oracle.bmc.objectstorage.requests.GetObjectLifecyclePolicyRequest;
import com.oracle.bmc.objectstorage.requests.PutObjectLifecyclePolicyRequest;
import com.oracle.bmc.objectstorage.responses.GetNamespaceResponse;

import java.util.Arrays;
import java.util.Collections;

/**
 * This class provides an example of using object lifecycle policies in the Java SDK.
 * Lifecycle policies are an object storage featuring enabling automatic archival and deletion of objects after they
 * reach a desired age.
 *
 * This example will start by retrieving your object storage namespace, then it will create a new bucket (continuing if
 * the bucket exists), write a lifecycle policy to the bucket, retrieve the policy, delete the policy, and delete the
 * bucket.  If you pass this example the name of a bucket that already exists, a policy will be active on the bucket
 * briefly and your old objects may be archived.  Deleting a policy immediately cancels its execution.
 */
public class ObjectLifecyclePolicyExample {

    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     * <ul>
     *   <li>The first argument is the OCID of the compartment where we'll create a bucket</li>
     *   <li>The second is the name of the bucket to create</li>
     *   <li>The third parameter controls how many years to wait before objects will be archived.  The API also accepts
     *            time periods specified in days</li>
     * </ul>
     */
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            throw new IllegalArgumentException(
                    "Unexpected number of arguments received. Consult the script header comments for expected arguments");
        }
        final String compartmentId = args[0];
        final String bucketName = args[1];
        final Long yearsToWaitBeforeArchival = Long.parseLong(args[2]);

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(CONFIG_LOCATION, CONFIG_PROFILE);
        final ObjectStorage client = new ObjectStorageClient(provider);
        client.setRegion(Region.US_PHOENIX_1);

        System.out.println("Fetching namespace");
        final GetNamespaceResponse namespaceResponse =
                client.getNamespace(GetNamespaceRequest.builder().build());
        final String namespaceName = namespaceResponse.getValue();
        System.out.println("Using namespace: " + namespaceName);

        // Create a bucket to enable the lifecycle policy on
        final CreateBucketDetails createBucketDetails =
                CreateBucketDetails.builder()
                        .compartmentId(compartmentId)
                        .name(bucketName)
                        .storageTier(CreateBucketDetails.StorageTier.Standard)
                        .build();
        final CreateBucketRequest createBucketRequest =
                CreateBucketRequest.builder()
                        .namespaceName(namespaceName)
                        .createBucketDetails(createBucketDetails)
                        .build();
        System.out.println("Creating bucket: " + bucketName);
        try {
            client.createBucket(createBucketRequest);
            System.out.println("Created bucket");
        } catch (BmcException bmce) {
            if (bmce.getStatusCode() == 409) {
                System.out.println("-----");
                System.out.println(
                        "Got 409 " + bmce.getServiceCode() + " attempting to create the bucket.");
                System.out.println(
                        "Either the bucket already exists, or we don't have permissions to create bucket.");
                System.out.println("Attempting to proceed with object lifecycle policy creation.");
                System.out.println(
                        "If object lifecycle policy creation fails with 404 NotFound/NotAuthorized, then ");
                System.out.println(
                        "that means you have a permissions error and aren't authorized to use the bucket.");
                System.out.println("-----");
            } else {
                throw bmce;
            }
        }

        final ObjectLifecycleRule objectLifecycleRule =
                ObjectLifecycleRule.builder()
                        .name("archive-objects-after-" + yearsToWaitBeforeArchival + "-years-rule")
                        // Use the action "DELETE" to delete objects instead of archiving them.
                        .action("ARCHIVE")
                        .timeAmount(yearsToWaitBeforeArchival)
                        // Allowed time units are days and years.
                        .timeUnit(ObjectLifecycleRule.TimeUnit.Years)
                        .isEnabled(true)
                        // Use an ObjectNameFilter to filter objects by name before applying the rule.  For example,
                        // this ObjectNameFilter would exclude all objects ending with .log
                        // and only archive objects whose names start with "/data/".
                        .objectNameFilter(
                                ObjectNameFilter.builder()
                                        .exclusionPatterns(Collections.singletonList("*.log"))
                                        .inclusionPatterns(Collections.singletonList("/data/*"))
                                        .build())
                        .build();
        final PutObjectLifecyclePolicyDetails objectLifecyclePolicyDetails =
                PutObjectLifecyclePolicyDetails.builder()
                        // Multiple rules are allowed.  You may, for example, archive objects after 30 days and delete them
                        // after 120 days.  If an object matches both rules, it will be deleted.
                        .items(Arrays.asList(objectLifecycleRule))
                        .build();
        final PutObjectLifecyclePolicyRequest putObjectLifecyclePolicyRequest =
                PutObjectLifecyclePolicyRequest.builder()
                        .namespaceName(namespaceName)
                        .bucketName(bucketName)
                        .putObjectLifecyclePolicyDetails(objectLifecyclePolicyDetails)
                        .build();
        System.out.println("Writing object lifecycle policy");
        try {
            client.putObjectLifecyclePolicy(putObjectLifecyclePolicyRequest);
            System.out.println("Wrote object lifecycle policy");
        } catch (BmcException bmce) {
            if (bmce.getStatusCode() == 404) {
                System.out.println("-----");
                System.out.println(
                        "Your user does not have permissions to create new object lifecycle policies.");
                System.out.println(
                        "Please see the object lifecycle policy authorization documentation:");
                System.out.println(
                        "https://docs.cloud.oracle.com/iaas/Content/Object/Tasks/usinglifecyclepolicies.htm");
                System.out.println("-----");
                System.exit(-1);
            } else {
                throw bmce;
            }
        }

        System.out.println("Retrieving object lifecycle policy");
        final GetObjectLifecyclePolicyRequest getObjectLifecyclePolicyRequest =
                GetObjectLifecyclePolicyRequest.builder()
                        .namespaceName(namespaceName)
                        .bucketName(bucketName)
                        .build();
        // Read a policy from the response object returned by this call
        client.getObjectLifecyclePolicy(getObjectLifecyclePolicyRequest);
        System.out.println("Retrieved object lifecycle policy");

        // Overwriting or deleting a lifecycle policy immediately cancels any in-progress execution of the old policy.
        final DeleteObjectLifecyclePolicyRequest deleteObjectLifecyclePolicyRequest =
                DeleteObjectLifecyclePolicyRequest.builder()
                        .namespaceName(namespaceName)
                        .bucketName(bucketName)
                        .build();
        System.out.println("Deleting object lifecycle policy");
        client.deleteObjectLifecyclePolicy(deleteObjectLifecyclePolicyRequest);
        System.out.println("Deleted object lifecycle policy");

        final DeleteBucketRequest deleteBucketRequest =
                DeleteBucketRequest.builder()
                        .namespaceName(namespaceName)
                        .bucketName(bucketName)
                        .build();
        System.out.println("Deleting bucket");
        client.deleteBucket(deleteBucketRequest);
        System.out.println("Deleted bucket");
    }
}
