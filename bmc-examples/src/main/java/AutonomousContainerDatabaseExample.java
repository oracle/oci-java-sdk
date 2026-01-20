/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.Subnet;
import com.oracle.bmc.core.model.Vcn;
import com.oracle.bmc.database.Database;
import com.oracle.bmc.database.DatabaseClient;
import com.oracle.bmc.database.DatabaseWaiters;
import com.oracle.bmc.database.model.AutonomousContainerDatabase;
import com.oracle.bmc.database.model.AutonomousExadataInfrastructure;
import com.oracle.bmc.database.model.CreateAutonomousContainerDatabaseDetails;
import com.oracle.bmc.database.model.LaunchAutonomousExadataInfrastructureDetails;
import com.oracle.bmc.database.model.UpdateAutonomousContainerDatabaseDetails;
import com.oracle.bmc.database.requests.CreateAutonomousContainerDatabaseRequest;
import com.oracle.bmc.database.requests.DeleteAutonomousDatabaseRequest;
import com.oracle.bmc.database.requests.GetAutonomousContainerDatabaseRequest;
import com.oracle.bmc.database.requests.GetAutonomousExadataInfrastructureRequest;
import com.oracle.bmc.database.requests.LaunchAutonomousExadataInfrastructureRequest;
import com.oracle.bmc.database.requests.RestartAutonomousContainerDatabaseRequest;
import com.oracle.bmc.database.requests.TerminateAutonomousExadataInfrastructureRequest;
import com.oracle.bmc.database.requests.UpdateAutonomousContainerDatabaseRequest;
import com.oracle.bmc.database.responses.CreateAutonomousContainerDatabaseResponse;
import com.oracle.bmc.database.responses.GetAutonomousContainerDatabaseResponse;
import com.oracle.bmc.database.responses.GetAutonomousExadataInfrastructureResponse;
import com.oracle.bmc.database.responses.LaunchAutonomousExadataInfrastructureResponse;
import com.oracle.bmc.database.responses.UpdateAutonomousContainerDatabaseResponse;
import com.oracle.bmc.waiter.ExponentialBackoffDelayStrategy;
import com.oracle.bmc.waiter.MaxTimeTerminationStrategy;

import java.io.IOException;

/**
 * This class provides an example of how one can use Autonomous Container Database APIs. It will
 * first create an Autonomous Exadata Infrastructure (AEI) instance, the Exadata DB system within
 * which the Autonomous Container Database exists. It then shows how to perform each of the 5
 * Autonomous Container Database APIs. It will:
 *
 * <ul>
 *   <li>Create an Autonomous Container Database using the AEI ID.
 *   <li>GET the Autonomous Container Database that's just created.
 *   <li>Update the displayName of this Autonomous Container Database.
 *   <li>Restart the newly updated Autonomous Container Database.
 *   <li>Delete this Autonomous Container Database.
 *   <li>Clean up the AEI intance.
 * </ul>
 */
public class AutonomousContainerDatabaseExample {

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     *     <ul>
     *       <li>The OCID of the compartment
     *       <li>The availability domain where the DB system and Container Database will be launched
     *           and operated.
     *     </ul>
     *
     * @throws Exception
     */
    private static final String CONFIG_LOCATION = "~/.oci/config";

    private static final String CONFIG_PROFILE = "DEFAULT";
    private static final String shape = "Exadata.Quarter2.92";

    public static void main(String[] args) throws Exception {

        if (args.length != 2) {
            throw new IllegalArgumentException(
                    String.format(
                            "Unexpected number of arguments. Expected 2, got %s", args.length));
        }
        final String compartmentId = args[0];
        final String availabilityDomain = args[1];

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);
        final DatabaseClient dbClient = DatabaseClient.builder().build(provider);
        final VirtualNetworkClient virtualNetworkClient =
                VirtualNetworkClient.builder().build(provider);

        // An AEI ID is required for createAutonomousContainerDatabse
        AutonomousExadataInfrastructure autonomousExadataInfrastructure =
                createAEI(compartmentId, availabilityDomain, dbClient, virtualNetworkClient);
        String autonomousExadataInfrastructureId = autonomousExadataInfrastructure.getId();

        // Creating an Autonomous Container Database and wait for it to reach Available state
        CreateAutonomousContainerDatabaseDetails createPodRequest =
                createContainerDatabaseRequest(autonomousExadataInfrastructureId, compartmentId);
        AutonomousContainerDatabase pod = createContainerDatabase(dbClient, createPodRequest);
        pod = waitToBecomeAvailable(dbClient, pod.getId());

        // Get Autonomous Container Database
        pod =
                dbClient.getAutonomousContainerDatabase(
                                GetAutonomousContainerDatabaseRequest.builder()
                                        .autonomousContainerDatabaseId(pod.getId())
                                        .build())
                        .getAutonomousContainerDatabase();

        // Update Autonomous Container Datatbase and wait for it to reach Available state
        UpdateAutonomousContainerDatabaseDetails updateContainerDatabaseDetails =
                UpdateAutonomousContainerDatabaseDetails.builder()
                        .displayName("updatedContainerDatabaseJavaSDKExample")
                        .build();
        AutonomousContainerDatabase updatedContainerDatabase =
                updateContainerDatabase(dbClient, updateContainerDatabaseDetails, pod.getId());
        updatedContainerDatabase =
                waitToBecomeAvailable(dbClient, updatedContainerDatabase.getId());

        // Restart Autonomous Container Datatbase and wait for it to reach Available state
        updatedContainerDatabase =
                restartContainerDatabase(dbClient, updatedContainerDatabase.getId());
        updatedContainerDatabase =
                waitToBecomeAvailable(dbClient, updatedContainerDatabase.getId());

        // Delete Autonomous Container Datatbase
        deleteContainerDatabase(dbClient, updatedContainerDatabase.getId());

        // Terminate the Autonomous Exadata Infrastructure as resource cleanup
        terminateAutonomousExadataInfrastructure(dbClient, autonomousExadataInfrastructureId);
    }

    /*
     * The following are the private helper methods
     */
    private static AutonomousExadataInfrastructure createAEI(
            String compartmentId,
            String availabilityDomain,
            DatabaseClient dbClient,
            VirtualNetworkClient virtualNetworkClient)
            throws Exception {

        Vcn vcn = null;
        Subnet subnet = null;
        GetAutonomousExadataInfrastructureResponse getAutonomousExadataInfrastructureResponse;

        try {
            vcn =
                    DatabaseExampleHelper.createVcn(
                            virtualNetworkClient, compartmentId, "11.0.0.0/16");
            subnet =
                    DatabaseExampleHelper.createSubnet(
                            virtualNetworkClient, vcn, availabilityDomain, "11.0.0.0/24");

            LaunchAutonomousExadataInfrastructureDetails
                    launchAutonomousExadataInfrastructureDetails =
                            LaunchAutonomousExadataInfrastructureDetails.builder()
                                    .availabilityDomain(availabilityDomain)
                                    .compartmentId(compartmentId)
                                    .displayName("test_exa")
                                    .shape(shape)
                                    .subnetId(subnet.getId())
                                    .licenseModel(
                                            LaunchAutonomousExadataInfrastructureDetails
                                                    .LicenseModel.LicenseIncluded)
                                    .build();

            LaunchAutonomousExadataInfrastructureResponse
                    launchAutonomousExadataInfrastructureResponse =
                            dbClient.launchAutonomousExadataInfrastructure(
                                    LaunchAutonomousExadataInfrastructureRequest.builder()
                                            .launchAutonomousExadataInfrastructureDetails(
                                                    launchAutonomousExadataInfrastructureDetails)
                                            .build());

            System.out.println(
                    "Launching Exadata DB System: "
                            + launchAutonomousExadataInfrastructureResponse
                                    .getAutonomousExadataInfrastructure()
                                    .toString());
            System.out.println("===========================");

            DatabaseWaiters waiters = dbClient.getWaiters();
            getAutonomousExadataInfrastructureResponse =
                    waiters.forAutonomousExadataInfrastructure(
                                    GetAutonomousExadataInfrastructureRequest.builder()
                                            .autonomousExadataInfrastructureId(
                                                    launchAutonomousExadataInfrastructureResponse
                                                            .getAutonomousExadataInfrastructure()
                                                            .getId())
                                            .build(),
                                    AutonomousExadataInfrastructure.LifecycleState.Available,
                                    new MaxTimeTerminationStrategy(21600L * 1000),
                                    new ExponentialBackoffDelayStrategy(900L * 1000))
                            .execute();

        } finally {
            if (subnet != null) {
                DatabaseExampleHelper.deleteSubnet(virtualNetworkClient, subnet);
            }

            if (vcn != null) {
                DatabaseExampleHelper.deleteVcn(virtualNetworkClient, vcn);
            }
        }

        return getAutonomousExadataInfrastructureResponse.getAutonomousExadataInfrastructure();
    }

    private static void terminateAutonomousExadataInfrastructure(
            DatabaseClient dbClient, String autonomousExadataInfrastructureId) throws Exception {

        dbClient.terminateAutonomousExadataInfrastructure(
                TerminateAutonomousExadataInfrastructureRequest.builder()
                        .autonomousExadataInfrastructureId(autonomousExadataInfrastructureId)
                        .build());
        dbClient.getWaiters()
                .forAutonomousExadataInfrastructure(
                        GetAutonomousExadataInfrastructureRequest.builder()
                                .autonomousExadataInfrastructureId(
                                        autonomousExadataInfrastructureId)
                                .build(),
                        AutonomousExadataInfrastructure.LifecycleState.Terminated)
                .execute();

        System.out.println("Terminated Exadata DB system");
    }

    private static CreateAutonomousContainerDatabaseDetails createContainerDatabaseRequest(
            String autonomousExadataInfrastructureId, String compartmentId) {
        return CreateAutonomousContainerDatabaseDetails.builder()
                .autonomousExadataInfrastructureId(autonomousExadataInfrastructureId)
                .compartmentId(compartmentId)
                .displayName("containerDatabaseJavaSDKExample")
                .patchModel(CreateAutonomousContainerDatabaseDetails.PatchModel.ReleaseUpdates)
                .build();
    }

    private static AutonomousContainerDatabase createContainerDatabase(
            DatabaseClient dbClient, CreateAutonomousContainerDatabaseDetails createPodRequest) {

        CreateAutonomousContainerDatabaseResponse response =
                dbClient.createAutonomousContainerDatabase(
                        CreateAutonomousContainerDatabaseRequest.builder()
                                .createAutonomousContainerDatabaseDetails(createPodRequest)
                                .build());

        return response.getAutonomousContainerDatabase();
    }

    private static AutonomousContainerDatabase waitToBecomeAvailable(
            DatabaseClient dbClient, String containerDatabaseId) throws Exception {
        DatabaseWaiters waiters = dbClient.getWaiters();
        GetAutonomousContainerDatabaseResponse response =
                waiters.forAutonomousContainerDatabase(
                                GetAutonomousContainerDatabaseRequest.builder()
                                        .autonomousContainerDatabaseId(containerDatabaseId)
                                        .build(),
                                AutonomousContainerDatabase.LifecycleState.Available)
                        .execute();

        return response.getAutonomousContainerDatabase();
    }

    private static AutonomousContainerDatabase updateContainerDatabase(
            DatabaseClient dbClient,
            UpdateAutonomousContainerDatabaseDetails updateContainerDatabaseDetails,
            String containDatabaseId) {
        UpdateAutonomousContainerDatabaseResponse response =
                dbClient.updateAutonomousContainerDatabase(
                        UpdateAutonomousContainerDatabaseRequest.builder()
                                .autonomousContainerDatabaseId(containDatabaseId)
                                .updateAutonomousContainerDatabaseDetails(
                                        updateContainerDatabaseDetails)
                                .build());
        return response.getAutonomousContainerDatabase();
    }

    private static AutonomousContainerDatabase restartContainerDatabase(
            DatabaseClient dbClient, String containerDatabaseId) throws Exception {

        dbClient.restartAutonomousContainerDatabase(
                RestartAutonomousContainerDatabaseRequest.builder()
                        .autonomousContainerDatabaseId(containerDatabaseId)
                        .build());

        return waitToBecomeAvailable(dbClient, containerDatabaseId);
    }

    private static void deleteContainerDatabase(DatabaseClient dbClient, String containerDatabaseId)
            throws Exception {

        dbClient.deleteAutonomousDatabase(
                DeleteAutonomousDatabaseRequest.builder()
                        .autonomousDatabaseId(containerDatabaseId)
                        .build());

        DatabaseWaiters waiters = dbClient.getWaiters();
        GetAutonomousContainerDatabaseResponse response =
                waiters.forAutonomousContainerDatabase(
                                GetAutonomousContainerDatabaseRequest.builder()
                                        .autonomousContainerDatabaseId(containerDatabaseId)
                                        .build(),
                                AutonomousContainerDatabase.LifecycleState.Terminated)
                        .execute();

        dbClient.close();
    }
}
