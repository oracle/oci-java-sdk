/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.database.DatabaseClient;
import com.oracle.bmc.database.model.AutonomousDatabase;
import com.oracle.bmc.database.model.AutonomousDatabasePeerSummary;
import com.oracle.bmc.database.model.CreateAutonomousDatabaseBase;
import com.oracle.bmc.database.model.CreateAutonomousDatabaseDetails;
import com.oracle.bmc.database.model.CreateCrossRegionDisasterRecoveryDetails;
import com.oracle.bmc.database.model.DisasterRecoveryConfiguration;
import com.oracle.bmc.database.requests.CreateAutonomousDatabaseRequest;
import com.oracle.bmc.database.requests.DeleteAutonomousDatabaseRequest;
import com.oracle.bmc.database.requests.GetAutonomousDatabaseRequest;
import com.oracle.bmc.database.requests.ListAutonomousDatabasePeersRequest;
import com.oracle.bmc.database.requests.SwitchoverAutonomousDatabaseRequest;
import com.oracle.bmc.database.responses.CreateAutonomousDatabaseResponse;
import com.oracle.bmc.database.responses.DeleteAutonomousDatabaseResponse;
import com.oracle.bmc.database.responses.GetAutonomousDatabaseResponse;
import com.oracle.bmc.database.responses.ListAutonomousDatabasePeersResponse;
import com.oracle.bmc.database.responses.SwitchoverAutonomousDatabaseResponse;

/** See also: AutonomousDataWarehouseExample */
public class AutonomousDatabaseCrossRegionDisasterRecoveryExample {
    public static void main(String[] args) throws Exception {
        final String profile = "DEFAULT";

        if (args.length != 2) {
            throw new IllegalArgumentException(
                    String.format(
                            "Unexpected number of arguments.  Expected 3, got %s", args.length));
        }

        // get values from arguments
        final String compartmentId = args[0];
        final String password = args[1];

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(configurationFilePath, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        final DatabaseClient dbClientPhoenix =
                DatabaseClient.builder().region(Region.US_PHOENIX_1).build(provider);
        final DatabaseClient dbClientAshburn =
                DatabaseClient.builder().region(Region.US_ASHBURN_1).build(provider);

        System.out.println(
                "Example - Creating a database, then enabling Cross Region Disaster Recovery, and performing a switchover");
        CreateAutonomousDatabaseDetails createAutonomousDatabaseCloneDetails =
                CreateAutonomousDatabaseDetails.builder()
                        .compartmentId(compartmentId)
                        .adminPassword(password)
                        .computeCount(4f)
                        .computeModel(CreateAutonomousDatabaseBase.ComputeModel.Ecpu)
                        .dataStorageSizeInGBs(20)
                        .dbName("exampleCloneAdb")
                        .dbWorkload(CreateAutonomousDatabaseBase.DbWorkload.Oltp)
                        .build();

        CreateAutonomousDatabaseResponse createAutonomousDatabaseResponse =
                dbClientPhoenix.createAutonomousDatabase(
                        CreateAutonomousDatabaseRequest.builder()
                                .createAutonomousDatabaseDetails(
                                        createAutonomousDatabaseCloneDetails)
                                .build());

        AutonomousDatabase autonomousDatabaseAdgSource =
                waitForInstanceToBecomeAvailable(
                        dbClientPhoenix, createAutonomousDatabaseResponse.getAutonomousDatabase());

        // Create the cross region disaster recovery peer, using Autonomous Data Guard disaster
        // recovery
        CreateCrossRegionDisasterRecoveryDetails createCrossRegionDisasterRecoveryDetails =
                CreateCrossRegionDisasterRecoveryDetails.builder()
                        .compartmentId(compartmentId)
                        .remoteDisasterRecoveryType(
                                DisasterRecoveryConfiguration.DisasterRecoveryType.BackupBased)
                        .sourceId(autonomousDatabaseAdgSource.getId())
                        .build();

        // note: this is peer is being created in Ashburn and not Phoenix
        createAutonomousDatabaseResponse =
                dbClientAshburn.createAutonomousDatabase(
                        CreateAutonomousDatabaseRequest.builder()
                                .createAutonomousDatabaseDetails(
                                        createCrossRegionDisasterRecoveryDetails)
                                .build());

        AutonomousDatabase autonomousDatabaseAdgPeer =
                waitForInstanceToBecomeAvailable(
                        dbClientAshburn, createAutonomousDatabaseResponse.getAutonomousDatabase());

        System.out.printf(
                "For %s database, the role is %s%n",
                autonomousDatabaseAdgSource.getId(), autonomousDatabaseAdgSource.getRole());

        System.out.printf(
                "For %s database, the role is %s%n",
                autonomousDatabaseAdgPeer.getId(), autonomousDatabaseAdgPeer.getRole());

        // let's also list the peers of each database
        ListAutonomousDatabasePeersResponse listAutonomousDatabasePeersResponse =
                dbClientPhoenix.listAutonomousDatabasePeers(
                        ListAutonomousDatabasePeersRequest.builder()
                                .autonomousDatabaseId(autonomousDatabaseAdgSource.getId())
                                .build());

        System.out.printf(
                "%s database has the following peers:%n", autonomousDatabaseAdgSource.getId());
        listAutonomousDatabasePeersResponse.getAutonomousDatabasePeerCollection().getItems()
                .stream()
                .map(AutonomousDatabasePeerSummary::getId)
                .forEach(System.out::println);
        System.out.println();

        listAutonomousDatabasePeersResponse =
                dbClientAshburn.listAutonomousDatabasePeers(
                        ListAutonomousDatabasePeersRequest.builder()
                                .autonomousDatabaseId(autonomousDatabaseAdgPeer.getId())
                                .build());

        System.out.printf(
                "%s database has the following peers:%n", autonomousDatabaseAdgPeer.getId());
        listAutonomousDatabasePeersResponse.getAutonomousDatabasePeerCollection().getItems()
                .stream()
                .map(AutonomousDatabasePeerSummary::getId)
                .forEach(System.out::println);
        System.out.println();

        // now let's perform a switchover from PHX to IAD
        SwitchoverAutonomousDatabaseResponse switchoverAutonomousDatabaseResponse =
                dbClientAshburn.switchoverAutonomousDatabase(
                        SwitchoverAutonomousDatabaseRequest.builder()
                                .peerDbId(autonomousDatabaseAdgSource.getId())
                                .autonomousDatabaseId(autonomousDatabaseAdgPeer.getId())
                                .build());
        System.out.printf(
                "The switchover work request is %s%n",
                switchoverAutonomousDatabaseResponse.getOpcWorkRequestId());

        // wait for both instances to become available again
        autonomousDatabaseAdgSource =
                waitForInstanceToBecomeAvailable(dbClientPhoenix, autonomousDatabaseAdgSource);
        autonomousDatabaseAdgPeer =
                waitForInstanceToBecomeAvailable(dbClientAshburn, autonomousDatabaseAdgPeer);

        System.out.printf(
                "For %s database, the role is %s%n",
                autonomousDatabaseAdgSource.getId(), autonomousDatabaseAdgSource.getRole());

        System.out.printf(
                "For %s database, the role is %s%n",
                autonomousDatabaseAdgPeer.getId(), autonomousDatabaseAdgPeer.getRole());

        System.out.println("Cleaning up all the resources created during this example:");
        DeleteAutonomousDatabaseResponse deleteAutonomousDatabaseResponse =
                dbClientPhoenix.deleteAutonomousDatabase(
                        DeleteAutonomousDatabaseRequest.builder()
                                .autonomousDatabaseId(autonomousDatabaseAdgSource.getId())
                                .build());
        System.out.println(deleteAutonomousDatabaseResponse.getOpcWorkRequestId());
        waitForInstanceToBecomeTerminated(dbClientPhoenix, autonomousDatabaseAdgSource);
        deleteAutonomousDatabaseResponse =
                dbClientAshburn.deleteAutonomousDatabase(
                        DeleteAutonomousDatabaseRequest.builder()
                                .autonomousDatabaseId(autonomousDatabaseAdgPeer.getId())
                                .build());
        System.out.println(deleteAutonomousDatabaseResponse.getOpcWorkRequestId());
        waitForInstanceToBecomeTerminated(dbClientAshburn, autonomousDatabaseAdgPeer);
        System.out.println("All resources created during this example have been cleaned up!");
    }

    private static AutonomousDatabase waitForInstanceToBecomeAvailable(
            DatabaseClient dbClient, AutonomousDatabase autonomousDatabase) throws Exception {
        final GetAutonomousDatabaseResponse response =
                dbClient.getWaiters()
                        .forAutonomousDatabase(
                                GetAutonomousDatabaseRequest.builder()
                                        .autonomousDatabaseId(autonomousDatabase.getId())
                                        .build(),
                                AutonomousDatabase.LifecycleState.Available,
                                AutonomousDatabase.LifecycleState.Standby)
                        .execute();

        return response.getAutonomousDatabase();
    }

    private static AutonomousDatabase waitForInstanceToBecomeTerminated(
            DatabaseClient dbClient, AutonomousDatabase autonomousDatabase) throws Exception {
        final GetAutonomousDatabaseResponse response =
                dbClient.getWaiters()
                        .forAutonomousDatabase(
                                GetAutonomousDatabaseRequest.builder()
                                        .autonomousDatabaseId(autonomousDatabase.getId())
                                        .build(),
                                AutonomousDatabase.LifecycleState.Terminated)
                        .execute();

        return response.getAutonomousDatabase();
    }
}
