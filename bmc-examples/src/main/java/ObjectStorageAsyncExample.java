/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;

import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.objectstorage.ObjectStorageAsync;
import com.oracle.bmc.objectstorage.ObjectStorageAsyncClient;
import com.oracle.bmc.objectstorage.model.BucketSummary;
import com.oracle.bmc.objectstorage.requests.GetNamespaceRequest;
import com.oracle.bmc.objectstorage.requests.GetObjectRequest;
import com.oracle.bmc.objectstorage.requests.ListBucketsRequest;
import com.oracle.bmc.objectstorage.requests.ListBucketsRequest.Builder;
import com.oracle.bmc.objectstorage.responses.GetNamespaceResponse;
import com.oracle.bmc.objectstorage.responses.GetObjectResponse;
import com.oracle.bmc.objectstorage.responses.ListBucketsResponse;
import com.oracle.bmc.responses.AsyncHandler;

public class ObjectStorageAsyncExample {

    public static void main(String[] args) throws Exception {

        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);
        ObjectStorageAsync client =
                ObjectStorageAsyncClient.builder().region(Region.US_PHOENIX_1).build(provider);

        ResponseHandler<GetNamespaceRequest, GetNamespaceResponse> namespaceHandler =
                new ResponseHandler<>();
        client.getNamespace(GetNamespaceRequest.builder().build(), namespaceHandler);
        GetNamespaceResponse namespaceResponse = namespaceHandler.waitForCompletion();

        String namespaceName = namespaceResponse.getValue();
        System.out.println("Using namespace: " + namespaceName);

        Builder listBucketsBuilder =
                ListBucketsRequest.builder()
                        .namespaceName(namespaceName)
                        .compartmentId(provider.getTenantId());

        String nextToken = null;
        do {
            listBucketsBuilder.page(nextToken);
            ResponseHandler<ListBucketsRequest, ListBucketsResponse> listBucketsHandler =
                    new ResponseHandler<>();
            client.listBuckets(listBucketsBuilder.build(), listBucketsHandler);
            ListBucketsResponse listBucketsResponse = listBucketsHandler.waitForCompletion();
            for (BucketSummary bucket : listBucketsResponse.getItems()) {
                System.out.println("Found bucket: " + bucket.getName());
            }
            nextToken = listBucketsResponse.getOpcNextPage();
        } while (nextToken != null);

        // fetch the uploaded file from object storage
        String bucketName = null;
        String objectName = null;
        ResponseHandler<GetObjectRequest, GetObjectResponse> objectHandler =
                new ResponseHandler<>();
        GetObjectRequest getObjectRequest =
                GetObjectRequest.builder()
                        .namespaceName(namespaceName)
                        .bucketName(bucketName)
                        .objectName(objectName)
                        .build();
        client.getObject(getObjectRequest, objectHandler);
        GetObjectResponse getResponse = objectHandler.waitForCompletion();

        // stream contents should match the file uploaded
        try (final InputStream fileStream = getResponse.getInputStream()) {
            // use fileStream
        } // try-with-resources automatically closes fileStream

        client.close();
    }

    private static class ResponseHandler<IN, OUT> implements AsyncHandler<IN, OUT> {
        private OUT item;
        private Throwable failed = null;
        private CountDownLatch latch = new CountDownLatch(1);

        private OUT waitForCompletion() throws Exception {
            latch.await();
            if (failed != null) {
                if (failed instanceof Exception) {
                    throw (Exception) failed;
                }
                throw (Error) failed;
            }
            return item;
        }

        @Override
        public void onSuccess(IN request, OUT response) {
            item = response;
            latch.countDown();
        }

        @Override
        public void onError(IN request, Throwable error) {
            failed = error;
            latch.countDown();
        }
    }
}
