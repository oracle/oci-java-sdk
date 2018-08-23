/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.database.DatabaseClient;
import com.oracle.bmc.database.DatabaseWaiters;
import com.oracle.bmc.database.model.AutonomousDataWarehouse;
import com.oracle.bmc.database.model.CreateAutonomousDataWarehouseDetails;
import com.oracle.bmc.database.model.UpdateAutonomousDataWarehouseDetails;
import com.oracle.bmc.database.requests.CreateAutonomousDataWarehouseRequest;
import com.oracle.bmc.database.requests.DeleteAutonomousDataWarehouseRequest;
import com.oracle.bmc.database.requests.GetAutonomousDataWarehouseRequest;
import com.oracle.bmc.database.requests.StartAutonomousDataWarehouseRequest;
import com.oracle.bmc.database.requests.StopAutonomousDataWarehouseRequest;
import com.oracle.bmc.database.requests.UpdateAutonomousDataWarehouseRequest;
import com.oracle.bmc.database.responses.CreateAutonomousDataWarehouseResponse;
import com.oracle.bmc.database.responses.GetAutonomousDataWarehouseResponse;
import com.oracle.bmc.database.responses.UpdateAutonomousDataWarehouseResponse;

import java.util.Random;

public class AutonomousDatawarehouseExample {

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
        CreateAutonomousDataWarehouseDetails createRequest = createAdwRequest(compartmentId);

        System.out.println("Creating Autonomous Datawarehouse with request : " + createRequest);
        AutonomousDataWarehouse adw = createADW(dbClient, createRequest);
        System.out.println("ADW instance is provisioning : " + adw);

        adw = waitForInstanceToBecomeAvailable(dbClient, adw.getId());
        System.out.println("Instance is provisioned:" + adw);

        // Get
        adw =
                dbClient.getAutonomousDataWarehouse(
                                GetAutonomousDataWarehouseRequest.builder()
                                        .autonomousDataWarehouseId(adw.getId())
                                        .build())
                        .getAutonomousDataWarehouse();
        System.out.println("GET request returned :" + adw);

        // Scale
        UpdateAutonomousDataWarehouseDetails updateRequest = scaleAdwRequest();
        System.out.println("Updating Autonomous Datawarehouse with request : " + updateRequest);
        AutonomousDataWarehouse updatedAdw = updateADW(dbClient, updateRequest, adw.getId());
        System.out.println("ADW instance is scaling : " + updatedAdw);

        updatedAdw = waitForInstanceToBecomeAvailable(dbClient, adw.getId());
        System.out.println("Instance is updated:" + updatedAdw);

        // Update Display Name
        updateRequest = updateDisplayNameAdwRequest();
        System.out.println("Updating Autonomous Datawarehouse with request : " + updateRequest);
        updatedAdw = updateADW(dbClient, updateRequest, adw.getId());
        System.out.println("Instance is updated:" + updatedAdw);

        // Stop
        System.out.println("Stopping Autonomous Datawarehouse Shared : " + updatedAdw);
        adw =
                dbClient.stopAutonomousDataWarehouse(
                                StopAutonomousDataWarehouseRequest.builder()
                                        .autonomousDataWarehouseId(updatedAdw.getId())
                                        .build())
                        .getAutonomousDataWarehouse();
        adw = waitForInstanceToBeStopped(dbClient, adw.getId());
        System.out.println("Stopped Autonomous Datawarehouse Shared : " + adw);

        // Start
        System.out.println("Starting Autonomous Datawarehouse Shared : " + adw);
        adw =
                dbClient.startAutonomousDataWarehouse(
                                StartAutonomousDataWarehouseRequest.builder()
                                        .autonomousDataWarehouseId(updatedAdw.getId())
                                        .build())
                        .getAutonomousDataWarehouse();
        adw = waitForInstanceToBecomeAvailable(dbClient, adw.getId());
        System.out.println("Started Autonomous Datawarehouse Shared : " + adw);

        // Delete
        System.out.println("Deleting Autonomous Datawarehouse Shared : " + adw);
        dbClient.deleteAutonomousDataWarehouse(
                DeleteAutonomousDataWarehouseRequest.builder()
                        .autonomousDataWarehouseId(updatedAdw.getId())
                        .build());

        DatabaseWaiters waiter = dbClient.getWaiters();
        GetAutonomousDataWarehouseResponse response =
                waiter.forAutonomousDataWarehouse(
                                GetAutonomousDataWarehouseRequest.builder()
                                        .autonomousDataWarehouseId(adw.getId())
                                        .build(),
                                AutonomousDataWarehouse.LifecycleState.Terminated)
                        .execute();

        dbClient.close();
    }

    public static AutonomousDataWarehouse createADW(
            DatabaseClient dbClient, CreateAutonomousDataWarehouseDetails request) {

        CreateAutonomousDataWarehouseResponse response =
                dbClient.createAutonomousDataWarehouse(
                        CreateAutonomousDataWarehouseRequest.builder()
                                .createAutonomousDataWarehouseDetails(request)
                                .build());

        return response.getAutonomousDataWarehouse();
    }

    private static AutonomousDataWarehouse waitForInstanceToBecomeAvailable(
            DatabaseClient dbClient, String id) throws Exception {

        DatabaseWaiters waiter = dbClient.getWaiters();
        GetAutonomousDataWarehouseResponse response =
                waiter.forAutonomousDataWarehouse(
                                GetAutonomousDataWarehouseRequest.builder()
                                        .autonomousDataWarehouseId(id)
                                        .build(),
                                AutonomousDataWarehouse.LifecycleState.Available)
                        .execute();

        return response.getAutonomousDataWarehouse();
    }

    private static AutonomousDataWarehouse updateADW(
            DatabaseClient dbClient,
            UpdateAutonomousDataWarehouseDetails updateRequest,
            String adwId) {
        UpdateAutonomousDataWarehouseResponse response =
                dbClient.updateAutonomousDataWarehouse(
                        UpdateAutonomousDataWarehouseRequest.builder()
                                .updateAutonomousDataWarehouseDetails(updateRequest)
                                .autonomousDataWarehouseId(adwId)
                                .build());

        return response.getAutonomousDataWarehouse();
    }

    private static AutonomousDataWarehouse waitForInstanceToBeStopped(
            DatabaseClient dbClient, String id) throws Exception {
        DatabaseWaiters waiter = dbClient.getWaiters();
        GetAutonomousDataWarehouseResponse response =
                waiter.forAutonomousDataWarehouse(
                                GetAutonomousDataWarehouseRequest.builder()
                                        .autonomousDataWarehouseId(id)
                                        .build(),
                                AutonomousDataWarehouse.LifecycleState.Stopped)
                        .execute();

        return response.getAutonomousDataWarehouse();
    }

    private static CreateAutonomousDataWarehouseDetails createAdwRequest(String compartmentId) {
        Random rand = new Random();
        return CreateAutonomousDataWarehouseDetails.builder()
                .cpuCoreCount(1)
                .dataStorageSizeInTBs(1)
                .displayName("javaSdkExample")
                .adminPassword("DBaaS12345_#")
                .dbName("javaSdkExam" + rand.nextInt(500))
                .compartmentId(compartmentId)
                .licenseModel(CreateAutonomousDataWarehouseDetails.LicenseModel.LicenseIncluded)
                .build();
    }

    private static UpdateAutonomousDataWarehouseDetails scaleAdwRequest() {
        return UpdateAutonomousDataWarehouseDetails.builder()
                .cpuCoreCount(2)
                .dataStorageSizeInTBs(2)
                .build();
    }

    private static UpdateAutonomousDataWarehouseDetails updateDisplayNameAdwRequest() {
        return UpdateAutonomousDataWarehouseDetails.builder().displayName("newDisplayName").build();
    }
}
