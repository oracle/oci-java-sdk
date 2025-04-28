/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.objectstorage.ObjectStorageClient;
import com.oracle.bmc.objectstorage.model.CreateBucketDetails;
import com.oracle.bmc.objectstorage.model.UpdateBucketDetails;
import com.oracle.bmc.objectstorage.requests.CreateBucketRequest;
import com.oracle.bmc.objectstorage.requests.GetNamespaceRequest;
import com.oracle.bmc.objectstorage.requests.UpdateBucketRequest;
import com.oracle.bmc.objectstorage.responses.CreateBucketResponse;
import com.oracle.bmc.objectstorage.responses.UpdateBucketResponse;

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class ObjectStorageUpdateBucketKmsKeyExample {

    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     *     <ul>
     *       <li>The first argument is the OCID of the compartment where we'll create a bucket
     *       <li>The second is the name of the bucket to create
     *       <li>The third is the kmsKey OCID used to create the bucket
     *       <li>The forth is the kmsKey OCID used to update the bucket kmsKeyId
     *     </ul>
     */
    public static void main(String[] args) throws Exception {
        if (args.length != 4) {
            throw new IllegalArgumentException(
                    "Unexpected number of arguments received. Consult the script header comments for expected arguments");
        }
        final String compartmentId = args[0];
        final String bucketName = args[1];
        final String kmsKeyOcid = args[2];
        final String kmsKeyUpdateOcid = args[3];

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);
        ObjectStorageClient objectStorageClient =
                ObjectStorageClient.builder().region(Region.US_PHOENIX_1).build(provider);

        final String namespace =
                objectStorageClient.getNamespace(GetNamespaceRequest.builder().build()).getValue();

        // create bucket with kmsKeyId
        final CreateBucketDetails createBucketDetails =
                CreateBucketDetails.builder()
                        .compartmentId(compartmentId)
                        .name(bucketName)
                        .kmsKeyId(kmsKeyOcid)
                        .build();
        final CreateBucketResponse createResponse =
                objectStorageClient.createBucket(
                        CreateBucketRequest.builder()
                                .namespaceName(namespace)
                                .createBucketDetails(createBucketDetails)
                                .build());
        System.out.println("Created a bucket with kmsKey:\n " + createResponse.getBucket());

        // update bucket kmsKeyId to a new kmsKeyId
        final UpdateBucketDetails updateBucketkmsKeyId =
                UpdateBucketDetails.builder()
                        .namespace(namespace)
                        .name(bucketName)
                        .kmsKeyId(kmsKeyUpdateOcid)
                        .build();
        UpdateBucketResponse updateResponse =
                objectStorageClient.updateBucket(
                        UpdateBucketRequest.builder()
                                .namespaceName(namespace)
                                .bucketName(bucketName)
                                .updateBucketDetails(updateBucketkmsKeyId)
                                .build());
        System.out.println("Updated kmsKeyId of a to " + updateResponse.getBucket().getKmsKeyId());

        // update bucket metadata without touching kmsKeyId
        Map<String, String> metadata = new HashMap<>();
        metadata.put("a", "b");
        final UpdateBucketDetails updateBucketMetadata =
                UpdateBucketDetails.builder()
                        .namespace(namespace)
                        .name(bucketName)
                        .metadata(Collections.unmodifiableMap(metadata))
                        .build();
        updateResponse =
                objectStorageClient.updateBucket(
                        UpdateBucketRequest.builder()
                                .namespaceName(namespace)
                                .bucketName(bucketName)
                                .updateBucketDetails(updateBucketMetadata)
                                .build());
        System.out.println(
                "Update bucket without touching kmsKeyId "
                        + updateResponse.getBucket().getKmsKeyId());

        // remove kmsKeyId from bucket
        final UpdateBucketDetails removeBucketKmsKeyId =
                UpdateBucketDetails.builder()
                        .namespace(namespace)
                        .name(bucketName)
                        .kmsKeyId(
                                "") // "" means remove the current kmsKeyId of the bucket if it has
                        // one
                        .build();
        updateResponse =
                objectStorageClient.updateBucket(
                        UpdateBucketRequest.builder()
                                .namespaceName(namespace)
                                .bucketName(bucketName)
                                .updateBucketDetails(removeBucketKmsKeyId)
                                .build());
        System.out.println(
                "Removed kmsKey from a bucket, now the kmsKey is "
                        + updateResponse.getBucket().getKmsKeyId());
    }
}
