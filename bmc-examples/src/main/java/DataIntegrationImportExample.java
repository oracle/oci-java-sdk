/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import java.io.IOException;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.dataintegration.DataIntegrationClient;
import com.oracle.bmc.dataintegration.model.CreateImportRequestDetails;
import com.oracle.bmc.dataintegration.model.ImportConflictResolution;
import com.oracle.bmc.dataintegration.model.ImportRequest;
import com.oracle.bmc.dataintegration.requests.CreateImportRequestRequest;
import com.oracle.bmc.dataintegration.requests.GetImportRequestRequest;
import com.oracle.bmc.dataintegration.responses.CreateImportRequestResponse;
import com.oracle.bmc.dataintegration.responses.GetImportRequestResponse;
import com.oracle.bmc.responses.BmcResponse;

/**
 * This class provides an example of how to use Import operation using DIS SDK
 *
 * <p><br>
 * This class makes the following assumptions:
 *
 * <ul>
 *   <li>Workspace is already created in DIS
 *   <li>Input bucket and zip file are already created in Object Storage
 *   <li>Config file required to authenticate to OCI SDK is already present, refer: <a
 *       href="https://docs.oracle.com/en-us/iaas/Content/API/Concepts/sdkconfig.htm#SDK_and_CLI_Configuration_File">OCI
 *       Docs</a>
 * </ul>
 */
public class DataIntegrationImportExample {

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

            ImportConflictResolution importConflictResolution =
                    ImportConflictResolution.builder()
                            .importConflictResolutionType(
                                    ImportConflictResolution.ImportConflictResolutionType.Retain)
                            .build();

            CreateImportRequestDetails createImportRequestDetails =
                    CreateImportRequestDetails.builder()
                            .bucketName(OBJECT_STORAGE_BUCKET_NAME)
                            .fileName("Project.project.zip") // Name of the file which is to be
                            // imported
                            .objectStorageTenancyId(TENANCY_OCID)
                            .objectStorageRegion(OCI_REGION)
                            .objectKeyForImport(
                                    null) // Key of the aggregator, null if importing directly into
                            // workspace(eg. project import)
                            .importConflictResolution(importConflictResolution)
                            .build();

            CreateImportRequestRequest createImportRequestRequest =
                    CreateImportRequestRequest.builder()
                            .workspaceId(WORKSPACE_OCID)
                            .createImportRequestDetails(createImportRequestDetails)
                            .build();

            CreateImportRequestResponse importRequestResponse =
                    dataIntegrationClient.createImportRequest(createImportRequestRequest);
            System.out.println("=================== CREATED IMPORT REQUEST ===================");
            pollForStatus(dataIntegrationClient, importRequestResponse, WORKSPACE_OCID);
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
            BmcResponse response,
            String WORKSPACE_OCID)
            throws InterruptedException {
        long multiplier = 1L;
        long baseTimeoutValue = 30000L; // 30 seconds
        String importRequestKey =
                ((CreateImportRequestResponse) response).getImportRequest().getKey();
        while (true) {
            System.out.println("=================== POLLING FOR IMPORT STATUS ===================");
            GetImportRequestRequest importRequest =
                    GetImportRequestRequest.builder()
                            .workspaceId(WORKSPACE_OCID)
                            .importRequestKey(importRequestKey)
                            .build();
            GetImportRequestResponse importResponse =
                    dataIntegrationClient.getImportRequest(importRequest);
            ImportRequest.Status importStatus = importResponse.getImportRequest().getStatus();
            if (importStatus.equals(ImportRequest.Status.Failed)
                    || importStatus.equals(ImportRequest.Status.Terminated)
                    || importStatus.equals(ImportRequest.Status.Successful)) {
                System.out.println(
                        "=================== IMPORT JOB ENDED WITH STATUS = "
                                + importStatus.getValue()
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
