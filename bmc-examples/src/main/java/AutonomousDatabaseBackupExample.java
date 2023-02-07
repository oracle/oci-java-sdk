/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
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
 * Example class to show the usage of Create, Get, and Delete of Autonomous Database Backups. This
 * example assumes that an Autonomous Database is already in Available state.
 */
public class AutonomousDatabaseBackupExample {
    public static void main(String[] args) throws Exception {
        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        if (args.length != 1) {
            throw new Exception("This example expects 1 argument: An Autonomous Database OCID");
        }

        String autonomousDatabaseId = args[0];

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
