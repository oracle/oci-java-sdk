/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.ObjectStorageClient;
import com.oracle.bmc.objectstorage.requests.GetObjectRequest;
import com.oracle.bmc.objectstorage.responses.GetObjectResponse;
import com.oracle.bmc.objectstorage.transfer.DownloadConfiguration;
import com.oracle.bmc.objectstorage.transfer.DownloadManager;

/**
 * Example of using the DownloadManager to download objects.
 *
 * <p>DownloadManager can be configured to control how/when it does parallel uploads, and manages
 * the underlying get requests and possible retries.
 *
 * <p>Clients construct a GetObjectRequest similar to what they normally would.
 */
public class DownloadManagerExample {

    public static void main(String[] args) throws Exception {
        if (args.length != 4) {
            throw new IllegalArgumentException(
                    "Syntax: java "
                            + DownloadManagerExample.class.getName()
                            + " <namespaceName> <bucketName> <objectName> <outputFileName>");
        }

        String namespaceName = args[0];
        String bucketName = args[1];
        String objectName = args[2];
        String outputFileName = args[3];

        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final ConfigFileAuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        ObjectStorage client =
                ObjectStorageClient.builder().region(Region.US_PHOENIX_1).build(provider);

        // configure download settings as desired
        DownloadConfiguration downloadConfiguration =
                DownloadConfiguration.builder()
                        .parallelDownloads(3)
                        .maxRetries(3)
                        .multipartDownloadThresholdInBytes(6 * 1024 * 1024)
                        .partSizeInBytes(4 * 1024 * 1024)
                        .build();

        DownloadManager downloadManager = new DownloadManager(client, downloadConfiguration);

        GetObjectRequest request =
                GetObjectRequest.builder()
                        .namespaceName(namespaceName)
                        .bucketName(bucketName)
                        .objectName(objectName)
                        .build();

        // download request and print result
        GetObjectResponse response = downloadManager.getObject(request);
        System.out.println("Content length: " + response.getContentLength() + " bytes");

        // use the stream contents; make sure to close the stream, e.g. by using try-with-resources
        try (final InputStream stream = response.getInputStream();
                final OutputStream outputStream = new FileOutputStream(outputFileName)) {
            // use fileStream
            byte[] buf = new byte[8192];
            int bytesRead;
            while ((bytesRead = stream.read(buf)) > 0) {
                outputStream.write(buf, 0, bytesRead);
            }
        } // try-with-resources automatically closes streams
        System.out.println("File size: " + new File(outputFileName).length() + " bytes");

        // or even simpler, if targetting a file:
        response = downloadManager.downloadObjectToFile(request, new File(outputFileName));
        System.out.println("Content length: " + response.getContentLength() + " bytes");
        System.out.println("File size: " + new File(outputFileName).length() + " bytes");
    }
}
