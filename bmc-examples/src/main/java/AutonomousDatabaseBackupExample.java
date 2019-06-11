/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.database.DatabaseClient;
import com.oracle.bmc.database.DatabaseWaiters;
import com.oracle.bmc.database.model.AutonomousDatabaseBackup;
import com.oracle.bmc.database.model.CreateAutonomousDatabaseBackupDetails;
import com.oracle.bmc.database.requests.CreateAutonomousDatabaseBackupRequest;
import com.oracle.bmc.database.requests.GetAutonomousDatabaseBackupRequest;
import com.oracle.bmc.database.responses.CreateAutonomousDatabaseBackupResponse;
import com.oracle.bmc.database.responses.GetAutonomousDatabaseBackupResponse;

/**
 * Example class to show the usage of Create, Get, and Delete of Autonomous Database Backups.
 * This example assumes that an Autonomous Database is already in Available state.
 */
public class AutonomousDatabaseBackupExample {
    public static void main(String[] args) throws Exception {
        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        if (args.length != 1) {
            throw new Exception("This example expects 1 argument: An Autonomous Database OCID");
        }

        String autonomousDatabaseId = args[0];

        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

        DatabaseClient dbClient = new DatabaseClient(provider);
        dbClient.setRegion(Region.US_PHOENIX_1);

        // Create
        CreateAutonomousDatabaseBackupDetails createAutonomousDatabaseBackupDetails =
                createAutonomousDatabaseBackupDetails(autonomousDatabaseId);

        System.out.println(
                "Creating Autonomous Database Backup with request: "
                        + createAutonomousDatabaseBackupDetails);
        AutonomousDatabaseBackup autonomousDatabaseBackup =
                createAutonomousDatabaseBackup(dbClient, createAutonomousDatabaseBackupDetails);
        System.out.println(
                "Autonomous Database Backup is being created: " + autonomousDatabaseBackup);

        autonomousDatabaseBackup =
                waitForInstanceToBecomeActive(dbClient, autonomousDatabaseBackup.getId());
        System.out.println(
                "Autonomous Database Backup has been created: " + autonomousDatabaseBackup);

        // Get
        System.out.println("Getting Autonomous Database Backup: " + autonomousDatabaseBackup);
        autonomousDatabaseBackup =
                dbClient.getAutonomousDatabaseBackup(
                                GetAutonomousDatabaseBackupRequest.builder()
                                        .autonomousDatabaseBackupId(
                                                autonomousDatabaseBackup.getId())
                                        .build())
                        .getAutonomousDatabaseBackup();
        System.out.println("Get request returned: " + autonomousDatabaseBackup);

        dbClient.close();
    }

    private static CreateAutonomousDatabaseBackupDetails createAutonomousDatabaseBackupDetails(
            String autonomousDatabaseId) {
        return CreateAutonomousDatabaseBackupDetails.builder()
                .displayName("javaSdkExample")
                .autonomousDatabaseId(autonomousDatabaseId)
                .build();
    }

    private static AutonomousDatabaseBackup createAutonomousDatabaseBackup(
            DatabaseClient dbClient,
            CreateAutonomousDatabaseBackupDetails createAutonomousDatabaseBackupDetails) {
        CreateAutonomousDatabaseBackupResponse response =
                dbClient.createAutonomousDatabaseBackup(
                        CreateAutonomousDatabaseBackupRequest.builder()
                                .createAutonomousDatabaseBackupDetails(
                                        createAutonomousDatabaseBackupDetails)
                                .build());

        return response.getAutonomousDatabaseBackup();
    }

    private static AutonomousDatabaseBackup waitForInstanceToBecomeActive(
            DatabaseClient dbClient, String autonomousDatabaseBackupId) throws Exception {
        DatabaseWaiters waiters = dbClient.getWaiters();
        GetAutonomousDatabaseBackupResponse response =
                waiters.forAutonomousDatabaseBackup(
                                GetAutonomousDatabaseBackupRequest.builder()
                                        .autonomousDatabaseBackupId(autonomousDatabaseBackupId)
                                        .build(),
                                AutonomousDatabaseBackup.LifecycleState.Active)
                        .execute();

        return response.getAutonomousDatabaseBackup();
    }
}
