/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.Subnet;
import com.oracle.bmc.core.model.Vcn;
import com.oracle.bmc.database.DatabaseClient;
import com.oracle.bmc.database.model.CreateDatabaseDetails;
import com.oracle.bmc.database.model.CreateDbHomeDetails;
import com.oracle.bmc.database.model.DbSystem;
import com.oracle.bmc.database.model.LaunchDbSystemDetails;
import com.oracle.bmc.database.model.UpdateDbSystemDetails;
import com.oracle.bmc.database.requests.GetDbSystemRequest;
import com.oracle.bmc.database.requests.LaunchDbSystemRequest;
import com.oracle.bmc.database.requests.TerminateDbSystemRequest;
import com.oracle.bmc.database.requests.UpdateDbSystemRequest;
import com.oracle.bmc.database.responses.GetDbSystemResponse;
import com.oracle.bmc.database.responses.LaunchDbSystemResponse;
import com.oracle.bmc.database.responses.UpdateDbSystemResponse;
import com.oracle.bmc.waiter.ExponentialBackoffDelayStrategy;
import com.oracle.bmc.waiter.MaxTimeTerminationStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * This class provides a basic example of how to launch a DB system with Exadata shape using the Java SDK. This will cover:
 * <p></p>
 * <ul>
 *   <li>Create a VCN and subnets needed for the DB system and its related resources</li>
 *   <li>
 *     Launch a DB system with Exadata shape and sparse disk group option. See:
 *       <a href="https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaoverview.htm">overview</a>
 *       for more information
 * </ul>
 * <p></p>
 * Resources created by this class will be removed when this example is done.
 * <p></p>
 * This class also makes assumptions on the following database parameters:
 * <p></p>
 * <ul>
 *   <li>DB system shape</li>
 *   <li>Core count</li>
 *   <li>DB edition</li>
 *   <li>DB version</li>
 *   <li>CIDR block for VCN</li>
 * </ul>
 */
public class LaunchExaDbSystemWithNsgExample {
    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";
    private static final String DB_SYSTEM_SHAPE = "Exadata.Quarter2.92";
    private static final String DB_VERSION = "12.1.0.2";
    private static final String DATABASE_ADMIN_PASSWORD = "DBaaS12345_#";
    private static DatabaseClient databaseClient = null;

    private static final long MAX_WAIT_IN_HOURS = 6;
    private static final long DELAY_INTERVAL_IN_MINS = 15;

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     *             <ul>
     *             <li>The OCID of the compartment which owns the DB system</li>
     *             <li>The availability domain where the DB system will be launched</li>
     *             <li>Sparse DiskGroup option: True, if Sparse Diskgroup is configured for Exadata dbsystem, False, if Sparse diskgroup was not configured.</li>
     *             <li>Database admin password</li>
     *             <li>Full path to SSH public key file</li>
     *             </ul>
     */
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new IllegalAccessException(
                    "This example expects 2 arguments: a compartment OCID, availability domain for the VCN ");
        }
        final String compartmentId = args[0];
        final String availabilityDomain = args[1];
        final String adminPassword = DATABASE_ADMIN_PASSWORD;

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);
        databaseClient = new DatabaseClient(provider);
        final VirtualNetworkClient virtualNetworkClient = new VirtualNetworkClient(provider);

        Vcn vcn = null;
        Subnet subnet = null;
        Subnet backupSubnet = null;
        String dbSystemId = null;

        try {
            vcn =
                    DatabaseExampleHelper.createVcn(
                            virtualNetworkClient, compartmentId, "10.0.0.0/16");
            subnet =
                    DatabaseExampleHelper.createSubnet(
                            virtualNetworkClient, vcn, availabilityDomain, "10.0.0.0/24");
            backupSubnet =
                    DatabaseExampleHelper.createSubnet(
                            virtualNetworkClient, vcn, availabilityDomain, "10.0.1.0/24");

            List<String> nsgIds =
                    DatabaseExampleHelper.createNSGs(
                            virtualNetworkClient, vcn.getId(), compartmentId);
            List<String> backupNetworkNsgIds =
                    DatabaseExampleHelper.createNSGs(
                            virtualNetworkClient, vcn.getId(), compartmentId);

            LaunchDbSystemDetails launchDbSystemDetails =
                    LaunchDbSystemDetails.builder()
                            .availabilityDomain(availabilityDomain)
                            .compartmentId(compartmentId)
                            .displayName("testdb")
                            .hostname("javasdk-host")
                            .shape(DB_SYSTEM_SHAPE)
                            .cpuCoreCount(2)
                            .timeZone("US/Pacific")
                            .dbHome(
                                    CreateDbHomeDetails.builder()
                                            .dbVersion(DB_VERSION)
                                            .displayName("java sdk example db home")
                                            .database(
                                                    CreateDatabaseDetails.builder()
                                                            .adminPassword(adminPassword)
                                                            .dbName("testdb")
                                                            .build())
                                            .build())
                            .databaseEdition(
                                    LaunchDbSystemDetails.DatabaseEdition
                                            .EnterpriseEditionExtremePerformance)
                            .subnetId(subnet.getId())
                            .backupSubnetId(backupSubnet.getId())
                            .nsgIds(nsgIds)
                            .backupNetworkNsgIds(backupNetworkNsgIds)
                            .sshPublicKeys(
                                    Arrays.asList(
                                            "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDokoG4lDsCN/E9F7KsaVZmYYKZMdljJwxjwsoyFdTTQop0TH0lMSDiZeZ3w/8wsZ5esR5uiW/WS5RMBxrfy1/z12qHbOP8vTLCZ19X33UDS8yhEarDldmBbeQ5penrjHM54+lLBTKolGfXvszbUP8ohsN/If7nfn2caUNRiE9Ep9T+xIr/ElmSyq9qrBbUdg0ltz3yIbkmv7SwgxW+NZSD2mhmfYJJDWq5QpJqc3lcNSCU/0f1mQGm754qI7wJKGEhSEOJkBvS7YrfDRINtNABaKGIDUCijwp+dl7btRaxBDwiF/+zHrX43ZEypVcbgVnOcxtz3E/CgxRHZ1plfEpd dhshshah@dhshshah-Mac"))
                            .build();

            LaunchDbSystemResponse launchDbSystemResponse =
                    databaseClient.launchDbSystem(
                            LaunchDbSystemRequest.builder()
                                    .launchDbSystemDetails(launchDbSystemDetails)
                                    .build());

            System.out.println("Launched Exadata DB System");
            System.out.println("===========================");
            System.out.println(launchDbSystemResponse.getDbSystem().toString());

            GetDbSystemResponse getDbSystemResponse =
                    databaseClient
                            .getWaiters()
                            .forDbSystem(
                                    GetDbSystemRequest.builder()
                                            .dbSystemId(
                                                    launchDbSystemResponse.getDbSystem().getId())
                                            .build(),
                                    DbSystem.LifecycleState.Provisioning,
                                    new MaxTimeTerminationStrategy(
                                            TimeUnit.HOURS.toMillis(MAX_WAIT_IN_HOURS)),
                                    new ExponentialBackoffDelayStrategy(
                                            TimeUnit.MINUTES.toMillis(DELAY_INTERVAL_IN_MINS)))
                            .execute();

            System.out.println("Exadata DB System is in Provisioning state");
            System.out.println("===========================");
            System.out.println(getDbSystemResponse.getDbSystem().toString());
            System.out.println(
                    "With sparse disk group option: "
                            + getDbSystemResponse.getDbSystem().getSparseDiskgroup());

            dbSystemId = getDbSystemResponse.getDbSystem().getId();
            System.out.println("Launched DB System : " + dbSystemId);

            List<String> updateNsgIds =
                    DatabaseExampleHelper.createNSGs(
                            virtualNetworkClient, vcn.getId(), compartmentId);

            UpdateDbSystemDetails updateDbSystemDetails =
                    UpdateDbSystemDetails.builder().nsgIds(updateNsgIds).build();
            UpdateDbSystemRequest updateDbSystemRequest =
                    UpdateDbSystemRequest.builder()
                            .dbSystemId(dbSystemId)
                            .updateDbSystemDetails(updateDbSystemDetails)
                            .build();

            UpdateDbSystemResponse updateDbSystemResponse =
                    databaseClient.updateDbSystem(updateDbSystemRequest);

            System.out.println(
                    "DbSystem : "
                            + dbSystemId
                            + " updated. "
                            + updateDbSystemResponse.getDbSystem().getNsgIds());

        } catch (Exception e) {
            System.out.println("Exception " + e.getMessage());
        } finally {
            System.out.println("Begin terminating DbSystems");
            terminateDBSystem(dbSystemId);
            if (subnet != null) {
                DatabaseExampleHelper.deleteSubnet(virtualNetworkClient, subnet);
            }

            if (backupSubnet != null) {
                DatabaseExampleHelper.deleteSubnet(virtualNetworkClient, backupSubnet);
            }

            if (vcn != null) {
                DatabaseExampleHelper.deleteVcn(virtualNetworkClient, vcn);
            }
        }
    }

    private static void terminateDBSystem(String dbSystemId) throws Exception {
        /*
           Once we're done with the DB system, we can terminate it and wait for it to be terminated.
        */
        databaseClient.terminateDbSystem(
                TerminateDbSystemRequest.builder().dbSystemId(dbSystemId).build());
        databaseClient
                .getWaiters()
                .forDbSystem(
                        GetDbSystemRequest.builder().dbSystemId(dbSystemId).build(),
                        DbSystem.LifecycleState.Terminated)
                .execute();
        System.out.println("Terminated Exadata DB system : " + dbSystemId);
    }
}
