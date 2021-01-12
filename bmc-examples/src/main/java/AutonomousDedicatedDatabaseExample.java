/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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

/*
 * Example Class to show the usage of Create, Stop , Start of Autonomous Dedicated Database
 * This Example assumes that an Autonomous Container Database is already in available state.
 */
public class AutonomousDedicatedDatabaseExample {

    public static void main(String[] args) throws Exception {
        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        if (args.length != 1) {
            throw new Exception(
                    "This example expects 1 argument:  A Container Database System OCID");
        }

        String containerDatabaseId = args[0];

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(configurationFilePath, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        DatabaseClient dbClient = new DatabaseClient(provider);
        dbClient.setRegion(Region.US_PHOENIX_1);

        // Create
        CreateAutonomousDatabaseDetails createAutonomousDatabaseDetails =
                createAutoDatabaseRequest(containerDatabaseId);

        System.out.println(
                "Creating Autonomous Dedicated Database with request : "
                        + createAutonomousDatabaseDetails);
        AutonomousDatabase autonomousDatabase =
                createAutonomousDatabase(dbClient, createAutonomousDatabaseDetails);
        System.out.println("Autonomous Dedicated Database is provisioning : " + autonomousDatabase);

        autonomousDatabase = waitForInstanceToBecomeAvailable(dbClient, autonomousDatabase.getId());
        System.out.println("Autonomous Dedicated Database is provisioned:" + autonomousDatabase);

        // Get
        GetAutonomousDatabaseRequest getAutonomousDatabaseRequest =
                GetAutonomousDatabaseRequest.builder()
                        .autonomousDatabaseId(autonomousDatabase.getId())
                        .build();

        autonomousDatabase =
                dbClient.getAutonomousDatabase(getAutonomousDatabaseRequest)
                        .getAutonomousDatabase();
        System.out.println("GET request returned :" + autonomousDatabase);

        // Scale
        UpdateAutonomousDatabaseDetails updateRequest = scaleAutonomousDatabaseRequest();
        System.out.println(
                "Updating Autonomous Dedicated Database Shared with request : " + updateRequest);
        AutonomousDatabase updateAutonomousDedicatedDatabase =
                updateAutonomousDedicatedDatabase(
                        dbClient, updateRequest, autonomousDatabase.getId());
        System.out.println(
                "Autonomous Dedicated Database is scaling : " + updateAutonomousDedicatedDatabase);

        updateAutonomousDedicatedDatabase =
                waitForInstanceToBecomeAvailable(dbClient, autonomousDatabase.getId());
        System.out.println(
                "Autonomous Dedicated Database is updated:" + updateAutonomousDedicatedDatabase);

        // Update Display Name
        updateRequest = updateAutonomousDBDisplayNameRequest();
        System.out.println(
                "Updating Autonomous Dedicated Database with request : " + updateRequest);
        updateAutonomousDedicatedDatabase =
                updateAutonomousDedicatedDatabase(
                        dbClient, updateRequest, updateAutonomousDedicatedDatabase.getId());

        System.out.println(
                "Autonomous Dedicated Database is updated:" + updateAutonomousDedicatedDatabase);

        // Stop
        System.out.println(
                "Stopping Autonomous Dedicated Database : " + updateAutonomousDedicatedDatabase);
        autonomousDatabase =
                dbClient.stopAutonomousDatabase(
                                StopAutonomousDatabaseRequest.builder()
                                        .autonomousDatabaseId(autonomousDatabase.getId())
                                        .build())
                        .getAutonomousDatabase();

        autonomousDatabase = waitForInstanceToBeStopped(dbClient, autonomousDatabase.getId());
        System.out.println("Stopped Autonomous Dedicated Database: " + autonomousDatabase);

        // Start
        System.out.println("Starting Autonomous Dedicated Database : " + autonomousDatabase);
        autonomousDatabase =
                dbClient.startAutonomousDatabase(
                                StartAutonomousDatabaseRequest.builder()
                                        .autonomousDatabaseId(
                                                updateAutonomousDedicatedDatabase.getId())
                                        .build())
                        .getAutonomousDatabase();
        autonomousDatabase = waitForInstanceToBecomeAvailable(dbClient, autonomousDatabase.getId());
        System.out.println("Started Autonomous Dedicated Database : " + autonomousDatabase);

        // Delete
        System.out.println("Deleting Autonomous Dedicated Database : " + autonomousDatabase);
        dbClient.deleteAutonomousDatabase(
                DeleteAutonomousDatabaseRequest.builder()
                        .autonomousDatabaseId(updateAutonomousDedicatedDatabase.getId())
                        .build());
        DatabaseWaiters waiter = dbClient.getWaiters();
        GetAutonomousDatabaseResponse response =
                waiter.forAutonomousDatabase(
                                getAutonomousDatabaseRequest,
                                AutonomousDatabase.LifecycleState.Terminated)
                        .execute();

        dbClient.close();
    }

    public static AutonomousDatabase createAutonomousDatabase(
            DatabaseClient dbClient, CreateAutonomousDatabaseBase request) {

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

    private static AutonomousDatabase updateAutonomousDedicatedDatabase(
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

    private static CreateAutonomousDatabaseDetails createAutoDatabaseRequest(
            String autonomousContainerDatabaseId) {
        Random rand = new Random();
        return CreateAutonomousDatabaseDetails.builder()
                .cpuCoreCount(1)
                .dataStorageSizeInTBs(1)
                .displayName("javaSdkExample")
                .adminPassword("DBaaS12345_#")
                .dbName("javaSdkExam" + rand.nextInt(500))
                .autonomousContainerDatabaseId(autonomousContainerDatabaseId)
                .isDedicated(Boolean.TRUE)
                .dbWorkload(CreateAutonomousDatabaseDetails.DbWorkload.Oltp)
                .licenseModel(CreateAutonomousDatabaseDetails.LicenseModel.LicenseIncluded)
                .build();
    }

    private static UpdateAutonomousDatabaseDetails scaleAutonomousDatabaseRequest() {
        return UpdateAutonomousDatabaseDetails.builder()
                .cpuCoreCount(2)
                .dataStorageSizeInTBs(2)
                .build();
    }

    private static UpdateAutonomousDatabaseDetails updateAutonomousDBDisplayNameRequest() {
        return UpdateAutonomousDatabaseDetails.builder().displayName("newDisplayName").build();
    }
}
