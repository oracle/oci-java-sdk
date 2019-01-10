/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.ObjectStorageClient;
import com.oracle.bmc.objectstorage.model.CopyObjectDetails;
import com.oracle.bmc.objectstorage.model.CreateBucketDetails;
import com.oracle.bmc.objectstorage.model.WorkRequest;
import com.oracle.bmc.objectstorage.requests.CopyObjectRequest;
import com.oracle.bmc.objectstorage.requests.CreateBucketRequest;
import com.oracle.bmc.objectstorage.requests.GetNamespaceRequest;
import com.oracle.bmc.objectstorage.requests.GetWorkRequestRequest;
import com.oracle.bmc.objectstorage.requests.HeadObjectRequest;
import com.oracle.bmc.objectstorage.requests.PutObjectRequest;
import com.oracle.bmc.objectstorage.responses.CopyObjectResponse;
import com.oracle.bmc.objectstorage.responses.GetNamespaceResponse;
import com.oracle.bmc.objectstorage.responses.GetWorkRequestResponse;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

public class CopyObjectExample {

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     * <ul>
     *   <li>The first argument is the OCID of the compartment.</li>
     *   <li>The second is the name of source bucket to create</li>
     *   <li>The third is the name of source object to copy from</li>
     *   <li>The fourth is the name of destination bucket to create</li>
     *   <li>The fifth is the name of destination object to copy to</li>
     * </ul>
     */
    public static void main(String[] args) throws Exception {

        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        if (args.length != 5) {
            throw new IllegalArgumentException(
                    "Unexpected number of arguments received. Consult the script header comments for expected arguments");
        }

        final String compartmentId = args[0];
        final String sourceBucket = args[1];
        final String sourceObject = args[2];
        final String destBucket = args[3];
        final String destObject = args[4];

        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

        ObjectStorage client = new ObjectStorageClient(provider);
        client.setRegion(Region.US_PHOENIX_1);

        System.out.println("Getting the namespace.");
        GetNamespaceResponse namespaceResponse =
                client.getNamespace(GetNamespaceRequest.builder().build());
        String namespaceName = namespaceResponse.getValue();

        System.out.println("Creating the source bucket.");
        CreateBucketDetails createSourceBucketDetails =
                CreateBucketDetails.builder()
                        .compartmentId(compartmentId)
                        .name(sourceBucket)
                        .build();
        CreateBucketRequest createSourceBucketRequest =
                CreateBucketRequest.builder()
                        .namespaceName(namespaceName)
                        .createBucketDetails(createSourceBucketDetails)
                        .build();
        client.createBucket(createSourceBucketRequest);

        System.out.println("Creating the source object");
        PutObjectRequest putObjectRequest =
                PutObjectRequest.builder()
                        .namespaceName(namespaceName)
                        .bucketName(sourceBucket)
                        .objectName(sourceObject)
                        .contentLength(4L)
                        .putObjectBody(
                                new ByteArrayInputStream("data".getBytes(StandardCharsets.UTF_8)))
                        .build();
        client.putObject(putObjectRequest);

        System.out.println("Creating the destination bucket.");
        client.setRegion(Region.US_ASHBURN_1);
        CreateBucketDetails createDestBucketDetails =
                CreateBucketDetails.builder().compartmentId(compartmentId).name(destBucket).build();
        CreateBucketRequest createDestBucketRequest =
                CreateBucketRequest.builder()
                        .namespaceName(namespaceName)
                        .createBucketDetails(createDestBucketDetails)
                        .build();
        client.createBucket(createDestBucketRequest);

        System.out.println("Copy the object.");
        client.setRegion(Region.US_PHOENIX_1);
        CopyObjectDetails copyObjectDetails =
                CopyObjectDetails.builder()
                        .sourceObjectName(sourceObject)
                        .destinationRegion(Region.US_ASHBURN_1.getRegionId())
                        .destinationNamespace(namespaceName)
                        .destinationBucket(destBucket)
                        .destinationObjectName(destObject)
                        .build();
        CopyObjectRequest copyObjectRequest =
                CopyObjectRequest.builder()
                        .namespaceName(namespaceName)
                        .bucketName(sourceBucket)
                        .copyObjectDetails(copyObjectDetails)
                        .build();
        CopyObjectResponse copyObjectResponse = client.copyObject(copyObjectRequest);

        System.out.println("Wait for copy to finish.");
        GetWorkRequestRequest getWorkRequestRequest =
                GetWorkRequestRequest.builder()
                        .workRequestId(copyObjectResponse.getOpcWorkRequestId())
                        .build();
        GetWorkRequestResponse getWorkRequestResponse =
                client.getWaiters().forWorkRequest(getWorkRequestRequest).execute();
        WorkRequest.Status status = getWorkRequestResponse.getWorkRequest().getStatus();
        System.out.println("Work request is now in " + status + " state.");

        if (status == WorkRequest.Status.Completed) {
            System.out.println("Verify that the object has been copied.");
            client.setRegion(Region.US_ASHBURN_1);
            HeadObjectRequest headObjectRequest =
                    HeadObjectRequest.builder()
                            .namespaceName(namespaceName)
                            .bucketName(destBucket)
                            .objectName(destObject)
                            .build();
            client.headObject(headObjectRequest);
        }

        client.close();
    }
}
