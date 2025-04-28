/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.database.DatabaseClient;
import com.oracle.bmc.database.DatabaseWaiters;
import com.oracle.bmc.database.model.AutonomousDatabase;
import com.oracle.bmc.database.model.CreateAutonomousDatabaseBase;
import com.oracle.bmc.database.model.CreateAutonomousDatabaseCloneDetails;
import com.oracle.bmc.database.model.CreateAutonomousDatabaseDetails;
import com.oracle.bmc.database.model.UpdateAutonomousDatabaseDetails;
import com.oracle.bmc.database.requests.CreateAutonomousDatabaseRequest;
import com.oracle.bmc.database.requests.DeleteAutonomousDatabaseRequest;
import com.oracle.bmc.database.requests.GetAutonomousDatabaseRequest;
import com.oracle.bmc.database.requests.ListAutonomousDbPreviewVersionsRequest;
import com.oracle.bmc.database.requests.StartAutonomousDatabaseRequest;
import com.oracle.bmc.database.requests.StopAutonomousDatabaseRequest;
import com.oracle.bmc.database.requests.UpdateAutonomousDatabaseRequest;
import com.oracle.bmc.database.responses.CreateAutonomousDatabaseResponse;
import com.oracle.bmc.database.responses.GetAutonomousDatabaseResponse;
import com.oracle.bmc.database.responses.ListAutonomousDbPreviewVersionsResponse;
import com.oracle.bmc.database.responses.UpdateAutonomousDatabaseResponse;
import com.oracle.bmc.database.responses.GenerateAutonomousDatabaseWalletResponse;
import com.oracle.bmc.database.requests.GenerateAutonomousDatabaseWalletRequest;
import com.oracle.bmc.database.model.GenerateAutonomousDatabaseWalletDetails;

import java.io.InputStream;
import java.util.Random;
import java.util.zip.ZipInputStream;
import java.util.Arrays;

public class AutonomousTransactionProcessingSharedExample {

    public static void main(String[] args) throws Exception {
        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        if (args.length != 2) {
            throw new IllegalArgumentException(
                    String.format(
                            "Unexpected number of arguments.  Expected 2, got %s. Compartment Id and custom password are required for this example",
                            args.length));
        }

        String compartmentId = args[0];
        String password = args[1];
        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(configurationFilePath, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        DatabaseClient dbClient =
                DatabaseClient.builder().region(Region.US_PHOENIX_1).build(provider);

        // Create
        CreateAutonomousDatabaseDetails createRequest = createAtpRequest(compartmentId);

        CreateAutonomousDatabaseDetails createFreeRequest = createFreeTierAtpRequest(compartmentId);

        System.out.println(
                "Creating Autonomous Transaction Processing Shared with request : "
                        + createRequest);
        AutonomousDatabase atpShared = createATP(dbClient, createRequest);
        System.out.println("ATP Shared instance is provisioning : " + atpShared);

        System.out.println(
                "Creating Free Autonomous Transaction Processing Shared with request : "
                        + createFreeRequest);
        AutonomousDatabase freeAtpShared = createATP(dbClient, createFreeRequest);
        System.out.println("Free ATP Shared instance is provisioning : " + freeAtpShared);

        atpShared = waitForInstanceToBecomeAvailable(dbClient, atpShared.getId());
        freeAtpShared = waitForInstanceToBecomeAvailable(dbClient, freeAtpShared.getId());

        System.out.println("Instance is provisioned:" + atpShared);
        System.out.println("Free Instance is provisioned:" + freeAtpShared);

        // Clone
        CreateAutonomousDatabaseCloneDetails createAutonomousDatabaseCloneDetails =
                createAtpCloneRequest(compartmentId, atpShared.getId());
        System.out.println(
                "Creating Autonomous Transaction Processing Clone with request : "
                        + createAutonomousDatabaseCloneDetails);
        AutonomousDatabase clonedAtp = createATP(dbClient, createAutonomousDatabaseCloneDetails);
        atpShared = waitForInstanceToBecomeAvailable(dbClient, clonedAtp.getId());
        System.out.println("Instance is provisioned:" + clonedAtp);

        // Get
        atpShared =
                dbClient.getAutonomousDatabase(
                                GetAutonomousDatabaseRequest.builder()
                                        .autonomousDatabaseId(atpShared.getId())
                                        .build())
                        .getAutonomousDatabase();
        System.out.println("GET request returned :" + atpShared);

        // Get Preview Versions
        ListAutonomousDbPreviewVersionsResponse listAutonomousDbPreviewVersionsResponse =
                dbClient.listAutonomousDbPreviewVersions(
                        ListAutonomousDbPreviewVersionsRequest.builder()
                                .compartmentId(compartmentId)
                                .build());
        System.out.println(
                "ListAutonomousDbPreviewVersions returned :"
                        + listAutonomousDbPreviewVersionsResponse.getItems());

        // Scale
        UpdateAutonomousDatabaseDetails updateRequest = scaleAtpRequest();
        System.out.println(
                "Updating Autonomous Transaction Processing Shared with request : "
                        + updateRequest);
        AutonomousDatabase updatedAtpShared = updateATP(dbClient, updateRequest, atpShared.getId());
        System.out.println("ATP Shared instance is scaling : " + updatedAtpShared);

        updatedAtpShared = waitForInstanceToBecomeAvailable(dbClient, atpShared.getId());
        System.out.println("Instance is updated:" + updatedAtpShared);

        // Update Display Name
        updateRequest = updateDisplayNameAtpRequest();
        System.out.println(
                "Updating Autonomous Transaction Processing Shared with request : "
                        + updateRequest);
        updatedAtpShared = updateATP(dbClient, updateRequest, updatedAtpShared.getId());

        System.out.println("Instance is updated:" + updatedAtpShared);

        // Update WhitelistIps
        updateRequest = whiteListIpChangeAtpRequest();
        System.out.println(
                "Updating Autonomous Transaction Processing Shared with request : "
                        + updateRequest);
        updatedAtpShared = updateATP(dbClient, updateRequest, atpShared.getId());
        System.out.println(
                "ATP Shared instance whiteListIp is being changed : " + updatedAtpShared);

        updatedAtpShared = waitForInstanceToBecomeAvailable(dbClient, atpShared.getId());
        System.out.println("Instance is updated:" + updatedAtpShared);

        // Update LicenseType Change
        updateRequest = licenseTypeChangeAtpRequest();
        System.out.println(
                "Updating Autonomous Transaction Processing Shared with request : "
                        + updateRequest);
        updatedAtpShared = updateATP(dbClient, updateRequest, atpShared.getId());
        System.out.println(
                "ATP Shared instance LicenseType is being changed : " + updatedAtpShared);

        updatedAtpShared = waitForInstanceToBecomeAvailable(dbClient, atpShared.getId());
        System.out.println("Instance is updated:" + updatedAtpShared);

        // Stop
        System.out.println(
                "Stopping Autonomous Transaction Processing Shared : " + updatedAtpShared);
        atpShared =
                dbClient.stopAutonomousDatabase(
                                StopAutonomousDatabaseRequest.builder()
                                        .autonomousDatabaseId(updatedAtpShared.getId())
                                        .build())
                        .getAutonomousDatabase();
        atpShared = waitForInstanceToBeStopped(dbClient, atpShared.getId());
        System.out.println("Stopped Autonomous Transaction Processing Shared : " + atpShared);

        // Start
        System.out.println("Starting Autonomous Transaction Processing Shared : " + atpShared);
        atpShared =
                dbClient.startAutonomousDatabase(
                                StartAutonomousDatabaseRequest.builder()
                                        .autonomousDatabaseId(updatedAtpShared.getId())
                                        .build())
                        .getAutonomousDatabase();
        atpShared = waitForInstanceToBecomeAvailable(dbClient, atpShared.getId());
        System.out.println("Started Autonomous Transaction Processing Shared : " + atpShared);

        System.out.println("Downloading wallet for  : " + atpShared);
        GenerateAutonomousDatabaseWalletDetails atpWalletDetails = createAtpWalletDetails(password);
        GenerateAutonomousDatabaseWalletResponse atpWalletResponse =
                generateATPWallet(dbClient, atpWalletDetails, atpShared.getId());
        System.out.println(
                "Autonomous database downloaded wallet content length is : "
                        + atpWalletResponse.getContentLength());
        ZipInputStream zin = new ZipInputStream(atpWalletResponse.getInputStream());

        // Delete
        System.out.println("Deleting Autonomous Transaction Processing Shared : " + atpShared);
        dbClient.deleteAutonomousDatabase(
                DeleteAutonomousDatabaseRequest.builder()
                        .autonomousDatabaseId(updatedAtpShared.getId())
                        .build());
        DatabaseWaiters waiter = dbClient.getWaiters();
        GetAutonomousDatabaseResponse response =
                waiter.forAutonomousDatabase(
                                GetAutonomousDatabaseRequest.builder()
                                        .autonomousDatabaseId(atpShared.getId())
                                        .build(),
                                AutonomousDatabase.LifecycleState.Terminated)
                        .execute();

        // Delete Free Tier Database
        System.out.println(
                "Deleting Free Autonomous Transaction Processing Shared : " + freeAtpShared);
        dbClient.deleteAutonomousDatabase(
                DeleteAutonomousDatabaseRequest.builder()
                        .autonomousDatabaseId(freeAtpShared.getId())
                        .build());
        waiter = dbClient.getWaiters();
        response =
                waiter.forAutonomousDatabase(
                                GetAutonomousDatabaseRequest.builder()
                                        .autonomousDatabaseId(freeAtpShared.getId())
                                        .build(),
                                AutonomousDatabase.LifecycleState.Terminated)
                        .execute();

        dbClient.close();
    }

    public static AutonomousDatabase createATP(
            DatabaseClient dbClient, CreateAutonomousDatabaseBase request) {

        CreateAutonomousDatabaseResponse response =
                dbClient.createAutonomousDatabase(
                        CreateAutonomousDatabaseRequest.builder()
                                .createAutonomousDatabaseDetails(request)
                                .build());

        System.out.println("Opc-work-request-id is " + response.getOpcWorkRequestId());

        return response.getAutonomousDatabase();
    }

    private static AutonomousDatabase waitForInstanceToBecomeAvailable(
            DatabaseClient dbClient, String id) throws Exception {

        DatabaseWaiters waiter = dbClient.getWaiters();
        GetAutonomousDatabaseResponse response =
                waiter.forAutonomousDatabase(
                                GetAutonomousDatabaseRequest.builder()
                                        .autonomousDatabaseId(id)
                                        .build(),
                                AutonomousDatabase.LifecycleState.Available)
                        .execute();

        return response.getAutonomousDatabase();
    }

    private static AutonomousDatabase updateATP(
            DatabaseClient dbClient, UpdateAutonomousDatabaseDetails updateRequest, String id) {
        UpdateAutonomousDatabaseResponse response =
                dbClient.updateAutonomousDatabase(
                        UpdateAutonomousDatabaseRequest.builder()
                                .updateAutonomousDatabaseDetails(updateRequest)
                                .autonomousDatabaseId(id)
                                .build());

        return response.getAutonomousDatabase();
    }

    private static AutonomousDatabase waitForInstanceToBeStopped(DatabaseClient dbClient, String id)
            throws Exception {
        DatabaseWaiters waiter = dbClient.getWaiters();
        GetAutonomousDatabaseResponse response =
                waiter.forAutonomousDatabase(
                                GetAutonomousDatabaseRequest.builder()
                                        .autonomousDatabaseId(id)
                                        .build(),
                                AutonomousDatabase.LifecycleState.Stopped)
                        .execute();

        return response.getAutonomousDatabase();
    }

    private static CreateAutonomousDatabaseDetails createAtpRequest(String compartmentId) {
        Random rand = new Random();
        return CreateAutonomousDatabaseDetails.builder()
                .cpuCoreCount(1)
                .dataStorageSizeInTBs(1)
                .displayName("javaSdkExample")
                .adminPassword("DBaaS12345_#")
                .dbName("javaSdkExam" + rand.nextInt(500))
                .compartmentId(compartmentId)
                .dbWorkload(CreateAutonomousDatabaseDetails.DbWorkload.Oltp)
                .isAutoScalingEnabled(Boolean.FALSE)
                .licenseModel(CreateAutonomousDatabaseDetails.LicenseModel.LicenseIncluded)
                .isPreviewVersionWithServiceTermsAccepted(Boolean.FALSE)
                .build();
    }

    private static CreateAutonomousDatabaseDetails createFreeTierAtpRequest(String compartmentId) {
        Random rand = new Random();
        return CreateAutonomousDatabaseDetails.builder()
                .cpuCoreCount(1)
                .dataStorageSizeInTBs(1)
                .displayName("javaSdkExample")
                .adminPassword("DBaaS12345_#")
                .dbName("javaSdkExam" + rand.nextInt(500))
                .compartmentId(compartmentId)
                .dbWorkload(CreateAutonomousDatabaseDetails.DbWorkload.Oltp)
                .isAutoScalingEnabled(Boolean.FALSE)
                .licenseModel(CreateAutonomousDatabaseDetails.LicenseModel.LicenseIncluded)
                .isPreviewVersionWithServiceTermsAccepted(Boolean.FALSE)
                .isFreeTier(Boolean.TRUE)
                .build();
    }

    private static CreateAutonomousDatabaseCloneDetails createAtpCloneRequest(
            String compartmentId, String sourceId) {
        Random rand = new Random();
        return CreateAutonomousDatabaseCloneDetails.builder()
                .cpuCoreCount(1)
                .dataStorageSizeInTBs(1)
                .displayName("javaSdkExample")
                .adminPassword("DBaaS12345_#")
                .dbName("javaSdkExam" + rand.nextInt(500))
                .compartmentId(compartmentId)
                .dbWorkload(CreateAutonomousDatabaseDetails.DbWorkload.Oltp)
                .licenseModel(CreateAutonomousDatabaseDetails.LicenseModel.LicenseIncluded)
                .sourceId(sourceId)
                .cloneType(CreateAutonomousDatabaseCloneDetails.CloneType.Metadata)
                .build();
    }

    private static UpdateAutonomousDatabaseDetails scaleAtpRequest() {
        return UpdateAutonomousDatabaseDetails.builder()
                .cpuCoreCount(2)
                .dataStorageSizeInTBs(2)
                .isAutoScalingEnabled(Boolean.TRUE)
                .build();
    }

    private static UpdateAutonomousDatabaseDetails whiteListIpChangeAtpRequest() {
        return UpdateAutonomousDatabaseDetails.builder()
                .whitelistedIps(Arrays.asList("1.1.1.1/28", "3.3.3.3"))
                .build();
    }

    private static UpdateAutonomousDatabaseDetails licenseTypeChangeAtpRequest() {
        return UpdateAutonomousDatabaseDetails.builder()
                .licenseModel(UpdateAutonomousDatabaseDetails.LicenseModel.LicenseIncluded)
                .build();
    }

    private static GenerateAutonomousDatabaseWalletResponse generateATPWallet(
            DatabaseClient dbClient,
            GenerateAutonomousDatabaseWalletDetails atpWalletDetails,
            String atpId) {
        return dbClient.generateAutonomousDatabaseWallet(
                GenerateAutonomousDatabaseWalletRequest.builder()
                        .generateAutonomousDatabaseWalletDetails(atpWalletDetails)
                        .autonomousDatabaseId(atpId)
                        .build());
    }

    private static GenerateAutonomousDatabaseWalletDetails createAtpWalletDetails(String password) {
        return GenerateAutonomousDatabaseWalletDetails.builder().password(password).build();
    }

    private static UpdateAutonomousDatabaseDetails updateDisplayNameAtpRequest() {
        return UpdateAutonomousDatabaseDetails.builder().displayName("newDisplayName").build();
    }
}
