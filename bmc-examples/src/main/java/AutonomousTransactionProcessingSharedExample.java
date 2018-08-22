/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.database.DatabaseClient;
import com.oracle.bmc.database.DatabaseWaiters;
import com.oracle.bmc.database.model.AutonomousDatabase;
import com.oracle.bmc.database.model.CreateAutonomousDatabaseDetails;
import com.oracle.bmc.database.model.UpdateAutonomousDatabaseDetails;
import com.oracle.bmc.database.requests.CreateAutonomousDatabaseRequest;
import com.oracle.bmc.database.requests.DeleteAutonomousDatabaseRequest;
import com.oracle.bmc.database.requests.GetAutonomousDatabaseRequest;
import com.oracle.bmc.database.requests.StartAutonomousDatabaseRequest;
import com.oracle.bmc.database.requests.StopAutonomousDatabaseRequest;
import com.oracle.bmc.database.requests.UpdateAutonomousDatabaseRequest;
import com.oracle.bmc.database.responses.CreateAutonomousDatabaseResponse;
import com.oracle.bmc.database.responses.GetAutonomousDatabaseResponse;
import com.oracle.bmc.database.responses.UpdateAutonomousDatabaseResponse;

import java.util.Random;

public class AutonomousTransactionProcessingSharedExample {

    public static void main(String[] args) throws Exception {
        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        // TODO: Fill in these values
        String compartmentId = args[0];

        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

        DatabaseClient dbClient = new DatabaseClient(provider);
        dbClient.setRegion(Region.US_PHOENIX_1);

        // Create
        CreateAutonomousDatabaseDetails createRequest = createAtpRequest(compartmentId);

        System.out.println(
                "Creating Autonomous Transaction Processing Shared with request : "
                        + createRequest);
        AutonomousDatabase atpShared = createATP(dbClient, createRequest);
        System.out.println("ATP Shared instance is provisioning : " + atpShared);

        atpShared = waitForInstanceToBecomeAvailable(dbClient, atpShared.getId());
        System.out.println("Instance is provisioned:" + atpShared);

        // Get
        atpShared =
                dbClient.getAutonomousDatabase(
                                GetAutonomousDatabaseRequest.builder()
                                        .autonomousDatabaseId(atpShared.getId())
                                        .build())
                        .getAutonomousDatabase();
        System.out.println("GET request returned :" + atpShared);

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

        dbClient.close();
    }

    public static AutonomousDatabase createATP(
            DatabaseClient dbClient, CreateAutonomousDatabaseDetails request) {

        CreateAutonomousDatabaseResponse response =
                dbClient.createAutonomousDatabase(
                        CreateAutonomousDatabaseRequest.builder()
                                .createAutonomousDatabaseDetails(request)
                                .build());

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
                .licenseModel(CreateAutonomousDatabaseDetails.LicenseModel.LicenseIncluded)
                .build();
    }

    private static UpdateAutonomousDatabaseDetails scaleAtpRequest() {
        return UpdateAutonomousDatabaseDetails.builder()
                .cpuCoreCount(2)
                .dataStorageSizeInTBs(2)
                .build();
    }

    private static UpdateAutonomousDatabaseDetails updateDisplayNameAtpRequest() {
        return UpdateAutonomousDatabaseDetails.builder().displayName("newDisplayName").build();
    }
}
