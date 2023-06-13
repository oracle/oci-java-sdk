/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.http.client.StandardClientProperties;
import com.oracle.bmc.http.client.jersey.JerseyClientProperties;
import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.ObjectStorageClient;
import com.oracle.bmc.objectstorage.model.CreateMultipartUploadDetails;
import com.oracle.bmc.objectstorage.requests.CreateMultipartUploadRequest;
import com.oracle.bmc.objectstorage.requests.GetNamespaceRequest;
import com.oracle.bmc.objectstorage.responses.CreateMultipartUploadResponse;
import com.oracle.bmc.objectstorage.responses.GetNamespaceResponse;

/**
 * This class provides example of creating MultipartUpload for clients that do not buffer requests into memory
 * when using Jersey default HttpUrlConnector. It expects two arguments: 1) bucket name and 2) object name
 */
public class NonBufferingRequestsForHttpUrlConnectorProviderExample {

    public static void main(final String[] args) throws Exception {

        if (args.length != 2) {
            throw new IllegalArgumentException(
                    String.format(
                            "Unexpected number of arguments. Expected 2, got %s", args.length));
        }

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file "~/.oci/config", and a profile in that config with the name "DEFAULT".
        // Make changes to the following line if needed and use
        // ConfigFileReader.parse(CONFIG_LOCATION, profile);
        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider authenticationDetailsProvider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        ObjectStorage client = ObjectStorageClient.builder().clientConfigurator(builder -> {
            builder.property(JerseyClientProperties.USE_APACHE_CONNECTOR, false);
            builder.property(StandardClientProperties.BUFFER_REQUEST, false);
        }).build(authenticationDetailsProvider);

        GetNamespaceRequest namespaceRequest = GetNamespaceRequest.builder().build();
        GetNamespaceResponse namespaceResponse =
                client.getNamespace(namespaceRequest);
        String namespaceName = namespaceResponse.getValue();
        System.out.println("Using namespace: " + namespaceName);

        final String bucketName = args[0];
        final String objectName = args[1];

        CreateMultipartUploadResponse createResponse =
                client.createMultipartUpload(
                        CreateMultipartUploadRequest.builder()
                                .namespaceName(namespaceName)
                                .bucketName(bucketName)
                                .createMultipartUploadDetails(
                                        CreateMultipartUploadDetails.builder()
                                                .contentType("application/json")
                                                .object(objectName)
                                                .build())
                                .build());

        String uploadId = createResponse.getMultipartUpload().getUploadId();
        System.out.println("uploadId: " + uploadId);

        client.close();
    }
}