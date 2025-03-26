/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.ObjectStorageClient;
import com.oracle.bmc.objectstorage.model.BucketSummary;
import com.oracle.bmc.objectstorage.model.CreateBucketDetails;
import com.oracle.bmc.objectstorage.requests.CreateBucketRequest;
import com.oracle.bmc.objectstorage.requests.GetNamespaceRequest;
import com.oracle.bmc.objectstorage.requests.ListBucketsRequest;
import com.oracle.bmc.objectstorage.responses.CreateBucketResponse;
import com.oracle.bmc.objectstorage.responses.GetNamespaceResponse;
import com.oracle.bmc.objectstorage.responses.ListBucketsResponse;

public class UseRealmSpecificEndpointsExample {

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "This example expects an argument for the bucket name to create a bucket");
        }

        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(configurationFilePath, profile);
        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        ObjectStorage client = new ObjectStorageClient(provider);
        client.setRegion(Region.ME_DUBAI_1);

        // Set useRealmSpecificEndpointTemplate to true to use an endpoint template defined for a specific realm
        client.useRealmSpecificEndpointTemplate(true);

        GetNamespaceResponse namespaceResponse =
                client.getNamespace(GetNamespaceRequest.builder().build());
        String namespaceName = namespaceResponse.getValue();
        System.out.println("Using namespace: " + namespaceName);

        String bucketName = args[0];
        CreateBucketResponse createBucketResponse =
                client.createBucket(
                        CreateBucketRequest.builder()
                                .namespaceName(namespaceName)
                                .createBucketDetails(
                                        CreateBucketDetails.builder()
                                                .compartmentId(provider.getTenantId())
                                                .name(bucketName)
                                                .build())
                                .build());
        System.out.println(
                "Created bucket with name " + createBucketResponse.getBucket().getName());

        ListBucketsRequest.Builder listBucketsBuilder =
                ListBucketsRequest.builder()
                        .namespaceName(namespaceName)
                        .compartmentId(provider.getTenantId());

        String nextToken = null;
        do {
            listBucketsBuilder.page(nextToken);
            ListBucketsResponse listBucketsResponse =
                    client.listBuckets(listBucketsBuilder.build());
            for (BucketSummary bucket : listBucketsResponse.getItems()) {
                System.out.println("Found bucket: " + bucket.getName());
            }
            nextToken = listBucketsResponse.getOpcNextPage();
        } while (nextToken != null);

        client.close();
    }
}
