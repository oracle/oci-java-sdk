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
import com.oracle.bmc.database.model.CreateAutonomousDatabaseBase;
import com.oracle.bmc.database.model.CreateAutonomousDatabaseDetails;
import com.oracle.bmc.database.model.ResourcePoolSummary;
import com.oracle.bmc.database.model.UpdateAutonomousDatabaseDetails;
import com.oracle.bmc.database.requests.CreateAutonomousDatabaseRequest;
import com.oracle.bmc.database.requests.DeleteAutonomousDatabaseRequest;
import com.oracle.bmc.database.requests.GetAutonomousDatabaseRequest;
import com.oracle.bmc.database.requests.UpdateAutonomousDatabaseRequest;
import com.oracle.bmc.database.responses.CreateAutonomousDatabaseResponse;
import com.oracle.bmc.database.responses.DeleteAutonomousDatabaseResponse;
import com.oracle.bmc.database.responses.GetAutonomousDatabaseResponse;
import com.oracle.bmc.database.responses.UpdateAutonomousDatabaseResponse;

/** See also: AutonomousDataWarehouseExample */
public class AutonomousDatabaseResourcePoolExample {
    public static void main(String[] args) throws Exception {
        final String profile = "DEFAULT";

        if (args.length != 2) {
            throw new IllegalArgumentException(
                    String.format(
                            "Unexpected number of arguments.  Expected 2, got %s", args.length));
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

        System.out.println(
                "Example 3 - creating a resource pool, having a database join the pool, then disabling resource pool");
        CreateAutonomousDatabaseDetails createAutonomousDatabaseDetailsWithResourcePool =
                CreateAutonomousDatabaseDetails.builder()
                        .compartmentId(compartmentId)
                        .adminPassword(password)
                        .computeCount(4f)
                        .computeModel(CreateAutonomousDatabaseBase.ComputeModel.Ecpu)
                        .dataStorageSizeInTBs(1)
                        .dbName("examplePoolAdb")
                        .dbWorkload(CreateAutonomousDatabaseBase.DbWorkload.Oltp)
                        .resourcePoolSummary(
                                ResourcePoolSummary.builder()
                                        .poolSize(128)
                                        .build()) // pool has 128 ECPU of which this ADB will use 4
                        .build();

        CreateAutonomousDatabaseResponse createAutonomousDatabaseResponse =
                dbClientPhoenix.createAutonomousDatabase(
                        CreateAutonomousDatabaseRequest.builder()
                                .createAutonomousDatabaseDetails(
                                        createAutonomousDatabaseDetailsWithResourcePool)
                                .build());

        System.out.printf(
                "Created %s database, now waiting for it to become available...%n",
                createAutonomousDatabaseResponse.getAutonomousDatabase().getId());

        // waiting for the instance to become available in order to perform other operations
        AutonomousDatabase autonomousDatabasePoolLeader =
                waitForInstanceToBecomeAvailable(
                        dbClientPhoenix, createAutonomousDatabaseResponse.getAutonomousDatabase());

        System.out.printf(
                "For %s database, pool size is %s%n",
                autonomousDatabasePoolLeader.getId(),
                autonomousDatabasePoolLeader.getResourcePoolSummary().getPoolSize());

        // Let's create another database that we can add to the pool
        CreateAutonomousDatabaseDetails createAutonomousDatabaseDetails =
                CreateAutonomousDatabaseDetails.builder()
                        .compartmentId(compartmentId)
                        .adminPassword(password)
                        .computeCount(4f)
                        .computeModel(CreateAutonomousDatabaseBase.ComputeModel.Ecpu)
                        .dataStorageSizeInTBs(1)
                        .dbName("examplePoolMemberAdb")
                        .dbWorkload(CreateAutonomousDatabaseBase.DbWorkload.Oltp)
                        .build();

        createAutonomousDatabaseResponse =
                dbClientPhoenix.createAutonomousDatabase(
                        CreateAutonomousDatabaseRequest.builder()
                                .createAutonomousDatabaseDetails(createAutonomousDatabaseDetails)
                                .build());

        System.out.printf(
                "Created %s database, now waiting for it to become available...%n",
                createAutonomousDatabaseResponse.getAutonomousDatabase().getId());

        // waiting for the instance to become available in order to perform other operations
        AutonomousDatabase autonomousDatabasePoolMember =
                waitForInstanceToBecomeAvailable(
                        dbClientPhoenix, createAutonomousDatabaseResponse.getAutonomousDatabase());

        UpdateAutonomousDatabaseDetails updateAutonomousDatabaseDetails =
                UpdateAutonomousDatabaseDetails.builder()
                        .resourcePoolLeaderId(autonomousDatabasePoolLeader.getId())
                        .build();

        UpdateAutonomousDatabaseResponse updateAutonomousDatabaseResponse =
                dbClientPhoenix.updateAutonomousDatabase(
                        UpdateAutonomousDatabaseRequest.builder()
                                .autonomousDatabaseId(autonomousDatabasePoolMember.getId())
                                .updateAutonomousDatabaseDetails(updateAutonomousDatabaseDetails)
                                .build());

        System.out.printf(
                "The work request to join the resource pool is %s%n",
                updateAutonomousDatabaseResponse.getOpcWorkRequestId());

        autonomousDatabasePoolMember =
                waitForInstanceToBecomeAvailable(
                        dbClientPhoenix, updateAutonomousDatabaseResponse.getAutonomousDatabase());

        System.out.printf(
                "%s database is in a resource pool lead by %s%n",
                autonomousDatabasePoolMember.getId(),
                autonomousDatabasePoolMember.getResourcePoolLeaderId());

        System.out.println("Cleaning up all the resource pool member created during this example:");
        DeleteAutonomousDatabaseResponse deleteAutonomousDatabaseResponse =
                dbClientPhoenix.deleteAutonomousDatabase(
                        DeleteAutonomousDatabaseRequest.builder()
                                .autonomousDatabaseId(autonomousDatabasePoolMember.getId())
                                .build());
        System.out.println(deleteAutonomousDatabaseResponse.getOpcWorkRequestId());
        waitForInstanceToBecomeTerminated(dbClientPhoenix, autonomousDatabasePoolMember);

        System.out.println("Disabling resource pool on the leader:");
        updateAutonomousDatabaseDetails =
                UpdateAutonomousDatabaseDetails.builder()
                        .resourcePoolSummary(ResourcePoolSummary.builder().build())
                        .build();

        updateAutonomousDatabaseResponse =
                dbClientPhoenix.updateAutonomousDatabase(
                        UpdateAutonomousDatabaseRequest.builder()
                                .autonomousDatabaseId(autonomousDatabasePoolLeader.getId())
                                .updateAutonomousDatabaseDetails(updateAutonomousDatabaseDetails)
                                .build());

        System.out.printf(
                "The work request to disable the resource pool is %s%n",
                updateAutonomousDatabaseResponse.getOpcWorkRequestId());

        autonomousDatabasePoolLeader =
                waitForInstanceToBecomeAvailable(
                        dbClientPhoenix, updateAutonomousDatabaseResponse.getAutonomousDatabase());

        System.out.println("Cleaning up all the resource pool leader created during this example:");
        deleteAutonomousDatabaseResponse =
                dbClientPhoenix.deleteAutonomousDatabase(
                        DeleteAutonomousDatabaseRequest.builder()
                                .autonomousDatabaseId(autonomousDatabasePoolLeader.getId())
                                .build());
        System.out.println(deleteAutonomousDatabaseResponse.getOpcWorkRequestId());
        waitForInstanceToBecomeTerminated(dbClientPhoenix, autonomousDatabasePoolLeader);
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
                                AutonomousDatabase.LifecycleState.Available)
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
