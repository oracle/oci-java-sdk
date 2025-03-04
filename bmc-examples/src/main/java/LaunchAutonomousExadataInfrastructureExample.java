/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.Subnet;
import com.oracle.bmc.core.model.Vcn;
import com.oracle.bmc.database.DatabaseClient;
import com.oracle.bmc.database.model.AutonomousExadataInfrastructure;
import com.oracle.bmc.database.model.LaunchAutonomousExadataInfrastructureDetails;
import com.oracle.bmc.database.model.UpdateAutonomousExadataInfrastructureDetails;
import com.oracle.bmc.database.requests.GetAutonomousExadataInfrastructureRequest;
import com.oracle.bmc.database.requests.LaunchAutonomousExadataInfrastructureRequest;
import com.oracle.bmc.database.requests.TerminateAutonomousExadataInfrastructureRequest;
import com.oracle.bmc.database.requests.UpdateAutonomousExadataInfrastructureRequest;
import com.oracle.bmc.database.responses.GetAutonomousExadataInfrastructureResponse;
import com.oracle.bmc.database.responses.LaunchAutonomousExadataInfrastructureResponse;
import com.oracle.bmc.database.responses.UpdateAutonomousExadataInfrastructureResponse;
import com.oracle.bmc.waiter.ExponentialBackoffDelayStrategy;
import com.oracle.bmc.waiter.MaxTimeTerminationStrategy;

/**
 * This class provides a basic example of how to launch a DB system with Exadata shape using the
 * Java SDK. This will cover:
 *
 * <p>
 *
 * <ul>
 *   <li>Create a VCN and subnets needed for the DB system and its related resources
 *   <li>Launch a DB system with Exadata shape. See: <a
 *       href="https://docs.oracle.com/iaas/Content/Database/Concepts/exaoverview.htm">overview</a>
 *       and <a
 *       href="https://docs.oracle.com/iaas/Content/Database/Tasks/exalaunchingDB.htm">managing DB
 *       systems</a> for more information
 * </ul>
 *
 * <p>Resources created by this class will be removed when this example is done.
 *
 * <p>This class also makes assumptions on the following database parameters:
 *
 * <p>
 *
 * <ul>
 *   <li>OCID of the compartment
 *   <li>Availability Domain
 * </ul>
 */
public class LaunchAutonomousExadataInfrastructureExample {
    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";
    private static final String shape = "Exadata.Quarter2.92";

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     *     <ul>
     *       <li>The OCID of the compartment
     *       <li>The availability domain where the DB system will be launched
     *     </ul>
     */
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new IllegalAccessException(
                    "This example expects two arguments: "
                            + "a compartment OCID and availability domain");
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
        final DatabaseClient databaseClient = DatabaseClient.builder().build(provider);
        final VirtualNetworkClient virtualNetworkClient =
                VirtualNetworkClient.builder().build(provider);

        Vcn vcn = null;
        Subnet subnet = null;

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
                            databaseClient.launchAutonomousExadataInfrastructure(
                                    LaunchAutonomousExadataInfrastructureRequest.builder()
                                            .launchAutonomousExadataInfrastructureDetails(
                                                    launchAutonomousExadataInfrastructureDetails)
                                            .build());

            System.out.println("Launched Exadata DB System");
            System.out.println("===========================");
            System.out.println(
                    launchAutonomousExadataInfrastructureResponse
                            .getAutonomousExadataInfrastructure()
                            .toString());

            GetAutonomousExadataInfrastructureResponse getAutonomousExadataInfrastructureResponse =
                    databaseClient
                            .getWaiters()
                            .forAutonomousExadataInfrastructure(
                                    GetAutonomousExadataInfrastructureRequest.builder()
                                            .build()
                                            .builder()
                                            .autonomousExadataInfrastructureId(
                                                    launchAutonomousExadataInfrastructureResponse
                                                            .getAutonomousExadataInfrastructure()
                                                            .getId())
                                            .build(),
                                    AutonomousExadataInfrastructure.LifecycleState.Provisioning,
                                    new MaxTimeTerminationStrategy(21600L * 1000),
                                    new ExponentialBackoffDelayStrategy(900L * 1000))
                            .execute();

            System.out.println("Exadata DB System is in Provisioning state");
            System.out.println("===========================");

            UpdateAutonomousExadataInfrastructureDetails
                    updateAutonomousExadataInfrastructuresDetails =
                            UpdateAutonomousExadataInfrastructureDetails.builder()
                                    .displayName("new_test_exa")
                                    .build();

            UpdateAutonomousExadataInfrastructureRequest
                    updateAutonomousExadataInfrastructureRequest =
                            UpdateAutonomousExadataInfrastructureRequest.builder()
                                    .autonomousExadataInfrastructureId(
                                            launchAutonomousExadataInfrastructureResponse
                                                    .getAutonomousExadataInfrastructure()
                                                    .getId())
                                    .updateAutonomousExadataInfrastructuresDetails(
                                            updateAutonomousExadataInfrastructuresDetails)
                                    .build();

            UpdateAutonomousExadataInfrastructureResponse updateDbSystemResponse =
                    databaseClient.updateAutonomousExadataInfrastructure(
                            updateAutonomousExadataInfrastructureRequest);

            System.out.println(
                    "Display name "
                            + launchAutonomousExadataInfrastructureResponse
                                    .getAutonomousExadataInfrastructure()
                                    .getDisplayName()
                            + " updated to "
                            + updateDbSystemResponse
                                    .getAutonomousExadataInfrastructure()
                                    .getDisplayName());

            System.out.println(
                    getAutonomousExadataInfrastructureResponse
                            .getAutonomousExadataInfrastructure()
                            .toString());

            /*
               Once we're done with the DB system, we can terminate it and wait for it to be terminated.
            */
            databaseClient.terminateAutonomousExadataInfrastructure(
                    TerminateAutonomousExadataInfrastructureRequest.builder()
                            .autonomousExadataInfrastructureId(
                                    launchAutonomousExadataInfrastructureResponse
                                            .getAutonomousExadataInfrastructure()
                                            .getId())
                            .build());
            databaseClient
                    .getWaiters()
                    .forAutonomousExadataInfrastructure(
                            GetAutonomousExadataInfrastructureRequest.builder()
                                    .autonomousExadataInfrastructureId(
                                            launchAutonomousExadataInfrastructureResponse
                                                    .getAutonomousExadataInfrastructure()
                                                    .getId())
                                    .build(),
                            AutonomousExadataInfrastructure.LifecycleState.Terminated)
                    .execute();

            System.out.println("Terminated Exadata DB system");
        } finally {
            if (subnet != null) {
                DatabaseExampleHelper.deleteSubnet(virtualNetworkClient, subnet);
            }

            if (vcn != null) {
                DatabaseExampleHelper.deleteVcn(virtualNetworkClient, vcn);
            }
        }
    }
}
