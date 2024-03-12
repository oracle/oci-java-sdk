/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import java.io.IOException;
import java.util.Collections;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.dataintegration.DataIntegrationClient;
import com.oracle.bmc.dataintegration.model.CreateExportRequestDetails;
import com.oracle.bmc.dataintegration.model.ExportRequest;
import com.oracle.bmc.dataintegration.requests.CreateExportRequestRequest;
import com.oracle.bmc.dataintegration.requests.GetExportRequestRequest;
import com.oracle.bmc.dataintegration.responses.CreateExportRequestResponse;
import com.oracle.bmc.dataintegration.responses.GetExportRequestResponse;

/**
 * This class provides an example of how to use Export operation using DIS SDK
 *
 * <p><br>
 * This class makes the following assumptions:
 *
 * <ul>
 *   <li>Workspace is already created in DIS with the required objects to be exported
 *   <li>Object Storage Bucket where the zip file will be exported. Ensure that logged in user has
 *       read/write access to the bucket
 *   <li>Config file required to authenticate to OCI SDK is already present, refer: <a
 *       href="https://docs.oracle.com/en-us/iaas/Content/API/Concepts/sdkconfig.htm#SDK_and_CLI_Configuration_File">OCI
 *       Docs</a>
 * </ul>
 */
public class DataIntegrationExportExample {
    public static void main(String[] args) {
        final String CONFIG_PROFILE = "DEFAULT";

        if (args.length != 4) {
            throw new IllegalArgumentException(
                    String.format(
                            "Unexpected number of arguments.  Expected 4, got %s", args.length));
        }

        // Below-mentioned fields are required to run the example successfully. Customize as per
        // your setup
        final String TENANCY_OCID = args[0];
        final String OCI_REGION = args[1];
        final String WORKSPACE_OCID = args[2];
        final String OBJECT_STORAGE_BUCKET_NAME = args[3];

        try {
            System.out.println("=================== STARTED EXECUTION ===================");

            // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
            // config file
            // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes
            // to
            // the following
            // line if needed and use ConfigFileReader.parse(configurationFilePath, profile);

            final ConfigFileReader.ConfigFile configFile =
                    ConfigFileReader.parseDefault(CONFIG_PROFILE);
            final AuthenticationDetailsProvider provider =
                    new ConfigFileAuthenticationDetailsProvider(configFile);

            DataIntegrationClient dataIntegrationClient =
                    DataIntegrationClient.builder().build(provider);

            System.out.println(
                    "=================== AUTHENTICATED AND CREATED DIS CLIENT ===================");

            CreateExportRequestDetails createExportRequestDetails =
                    CreateExportRequestDetails.builder()
                            .bucketName(OBJECT_STORAGE_BUCKET_NAME)
                            .fileName("Project.project.zip") // Name of the exported file
                            .objectKeys(
                                    Collections.singletonList(
                                            "<object_key_to_be_exported>")) // Key of the object to
                            // be exported
                            .objectStorageRegion(OCI_REGION)
                            .objectStorageTenancyId(TENANCY_OCID)
                            .build();

            CreateExportRequestRequest createExportRequestRequest =
                    CreateExportRequestRequest.builder()
                            .workspaceId(WORKSPACE_OCID)
                            .createExportRequestDetails(createExportRequestDetails)
                            .build();

            CreateExportRequestResponse exportRequestResponse =
                    dataIntegrationClient.createExportRequest(createExportRequestRequest);
            System.out.println("=================== CREATED EXPORT REQUEST ===================");
            pollForStatus(dataIntegrationClient, exportRequestResponse, WORKSPACE_OCID);
        } catch (IOException ioException) {
            System.out.println("Failed to create oci session");
        } catch (InterruptedException e) {
            System.out.println("Failed while polling for status");
            throw new RuntimeException(e);
        }
    }

    /**
     * Polls the status of the export request and exits when the status reaches a terminal state
     *
     * @param dataIntegrationClient DIS client object
     * @param response Export Response object
     * @throws InterruptedException Throws error when wait is interrupted
     */
    private static void pollForStatus(
            DataIntegrationClient dataIntegrationClient,
            CreateExportRequestResponse response,
            String WORKSPACE_OCID)
            throws InterruptedException {
        long multiplier = 1L;
        long baseTimeoutValue = 30000L; // 30 seconds
        String exportRequestKey = response.getExportRequest().getKey();
        while (true) {
            System.out.println("=================== POLLING FOR EXPORT STATUS ===================");
            GetExportRequestRequest exportRequest =
                    GetExportRequestRequest.builder()
                            .workspaceId(WORKSPACE_OCID)
                            .exportRequestKey(exportRequestKey)
                            .build();
            GetExportRequestResponse exportResponse =
                    dataIntegrationClient.getExportRequest(exportRequest);
            ExportRequest.Status exportStatus = exportResponse.getExportRequest().getStatus();
            if (exportStatus.equals(ExportRequest.Status.Failed)
                    || exportStatus.equals(ExportRequest.Status.Terminated)
                    || exportStatus.equals(ExportRequest.Status.Successful)) {
                System.out.println(
                        "=================== EXPORT JOB ENDED WITH STATUS = "
                                + exportStatus.getValue()
                                + " ===================");
                return;
            } else {
                // Exponential back-off while waiting, fails after 3 poll attempts
                long sleepTimout = multiplier * baseTimeoutValue;
                if (multiplier == 3L) {
                    return;
                }
                multiplier++;
                Thread.sleep(sleepTimout);
            }
        }
    }
}
