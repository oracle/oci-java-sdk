/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.auth.SessionTokenAuthenticationDetailsProvider;
import com.oracle.bmc.database.DatabaseClient;
import com.oracle.bmc.database.model.AutonomousDatabase;
import com.oracle.bmc.database.model.CreateAutonomousDatabaseBase;
import com.oracle.bmc.database.model.CreateAutonomousDatabaseDetails;
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
public class AutonomousDatabasePrivateEndpointExample {
    public static void main(String[] args) throws Exception {
        final String profile = "DEFAULT";

        if (args.length != 3) {
            throw new IllegalArgumentException(
                    String.format(
                            "Unexpected number of arguments.  Expected 3, got %s", args.length));
        }

        // get values from arguments
        final String compartmentId = args[0];
        final String password = args[1];
        final String subnetId = args[2];

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
                "Example - Creating a database with fairly minimal parameters and enabling Private Endpoint");
        CreateAutonomousDatabaseDetails createAutonomousDatabaseDetails =
                CreateAutonomousDatabaseDetails.builder()
                        .compartmentId(compartmentId)
                        .adminPassword(password)
                        .computeCount(4f)
                        .computeModel(CreateAutonomousDatabaseBase.ComputeModel.Ecpu)
                        .dataStorageSizeInTBs(1)
                        .dbName("exampleAdb")
                        .dbWorkload(CreateAutonomousDatabaseBase.DbWorkload.Oltp)
                        .build();

        CreateAutonomousDatabaseResponse createAutonomousDatabaseResponse =
                dbClientPhoenix.createAutonomousDatabase(
                        CreateAutonomousDatabaseRequest.builder()
                                .createAutonomousDatabaseDetails(createAutonomousDatabaseDetails)
                                .build());

        System.out.printf(
                "Created %s database, now waiting for it to become available...%n",
                createAutonomousDatabaseResponse.getAutonomousDatabase().getId());

        // waiting for the instance to become available in order to perform other operations
        AutonomousDatabase autonomousDatabase =
                waitForInstanceToBecomeAvailable(
                        dbClientPhoenix, createAutonomousDatabaseResponse.getAutonomousDatabase());

        // let's enable private endpoint within the subnet id given and the host name prefix set to
        // "hostname-prefix"
        UpdateAutonomousDatabaseDetails updateAutonomousDatabaseDetails =
                UpdateAutonomousDatabaseDetails.builder()
                        .subnetId(subnetId)
                        .privateEndpointLabel("hostname-prefix")
                        .build();

        UpdateAutonomousDatabaseResponse updateAutonomousDatabaseResponse =
                dbClientPhoenix.updateAutonomousDatabase(
                        UpdateAutonomousDatabaseRequest.builder()
                                .autonomousDatabaseId(autonomousDatabase.getId())
                                .updateAutonomousDatabaseDetails(updateAutonomousDatabaseDetails)
                                .build());

        System.out.printf(
                "Work request id to enable private endpoint %s%n",
                updateAutonomousDatabaseResponse.getOpcWorkRequestId());

        autonomousDatabase =
                waitForInstanceToBecomeAvailable(
                        dbClientPhoenix, updateAutonomousDatabaseResponse.getAutonomousDatabase());

        System.out.printf(
                "For %s database, the subnet id is %s and the host name prefix is %s%n",
                autonomousDatabase.getId(),
                autonomousDatabase.getSubnetId(),
                autonomousDatabase.getPrivateEndpointLabel());

        System.out.println("Cleaning up all the resources created during this example:");
        DeleteAutonomousDatabaseResponse deleteAutonomousDatabaseResponse =
                dbClientPhoenix.deleteAutonomousDatabase(
                        DeleteAutonomousDatabaseRequest.builder()
                                .autonomousDatabaseId(autonomousDatabase.getId())
                                .build());
        System.out.println(deleteAutonomousDatabaseResponse.getOpcWorkRequestId());
        waitForInstanceToBecomeTerminated(dbClientPhoenix, autonomousDatabase);
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
