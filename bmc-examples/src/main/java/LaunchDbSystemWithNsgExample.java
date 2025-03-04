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
import com.oracle.bmc.database.DatabaseWaiters;
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
import com.oracle.bmc.util.internal.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * This class provides a basic example of how to launch a DB system with NSG rules using the Java
 * SDK. This will cover:
 *
 * <p>
 *
 * <ul>
 *   <li>Create a VCN and subnets needed for the DB system and its related resources
 *   <li>Launch a DB system with VM.Standard2.1 shape. See: <a
 *       href="https://docs.oracle.com/iaas/Content/Database/Concepts/overview.htm">overview</a> for
 *       more information
 * </ul>
 *
 * <p>Resources created by this class will be removed when this example is done.
 *
 * <p>This class also makes assumptions on the following database parameters:
 *
 * <p>
 *
 * <ul>
 *   <li>DB system shape
 *   <li>Core count
 *   <li>DB edition
 *   <li>DB version
 *   <li>CIDR block for VCN
 * </ul>
 */
public class LaunchDbSystemWithNsgExample {

    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";
    private static final String DATABASE_ADMIN_PASSWORD = "DBaaS12345_#";
    private static final String DB_VERSION = "12.1.0.2";
    private static final String vcnCidrBlock = "10.0.0.0/16";
    private static final String subnetCidrBlock = "10.0.1.0/24";
    private static int randomId = new Random().nextInt(999);

    private static final long MAX_WAIT_IN_HOURS = 4;
    private static final long DELAY_INTERVAL_IN_MINS = 1;

    private static DatabaseClient databaseClient = null;
    private static VirtualNetworkClient virtualNetworkClient = null;
    private static String compartmentId;
    private static String availabilityDomain;

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     *     <ul>
     *       <li>The OCID of the compartment which owns the DB system
     *       <li>The availability domain where the DB system will be launched
     *     </ul>
     */
    public static void main(String[] args) throws Exception {

        if (args.length != 2) {
            System.out.println(args.length);
            throw new Exception(
                    "This example expects 2 arguments: a compartment OCID, availability domain for the VCN ");
        }

        compartmentId = args[0];
        availabilityDomain = args[1];

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);
        databaseClient = DatabaseClient.builder().build(provider);
        virtualNetworkClient = VirtualNetworkClient.builder().build(provider);

        Vcn vcn = null;
        Subnet subnet = null;
        String dbSystemId = null;
        try {

            vcn =
                    DatabaseExampleHelper.createVcn(
                            virtualNetworkClient, compartmentId, vcnCidrBlock);

            subnet =
                    DatabaseExampleHelper.createSubnet(
                            virtualNetworkClient, vcn, availabilityDomain, subnetCidrBlock);

            List<String> createdNsgIds =
                    DatabaseExampleHelper.createNSGs(
                            virtualNetworkClient, vcn.getId(), compartmentId);
            LaunchDbSystemDetails dbSystem =
                    LaunchDbSystemDetails.builder()
                            .dbHome(
                                    CreateDbHomeDetails.builder()
                                            .dbVersion(DB_VERSION)
                                            .displayName("java sdk example db home")
                                            .database(
                                                    CreateDatabaseDetails.builder()
                                                            .adminPassword(DATABASE_ADMIN_PASSWORD)
                                                            .dbName("testdb")
                                                            .build())
                                            .build())
                            .cpuCoreCount(1)
                            .nodeCount(1)
                            .initialDataStorageSizeInGB(256)
                            .availabilityDomain(availabilityDomain)
                            .faultDomains(Arrays.asList("FAULT-DOMAIN-1"))
                            .compartmentId(compartmentId)
                            .databaseEdition(
                                    LaunchDbSystemDetails.DatabaseEdition
                                            .EnterpriseEditionExtremePerformance)
                            .displayName("dbs" + randomId)
                            .shape("VM.Standard2.1")
                            .subnetId(subnet.getId())
                            .hostname("host" + randomId)
                            .nsgIds(createdNsgIds)
                            .licenseModel(LaunchDbSystemDetails.LicenseModel.LicenseIncluded)
                            .sshPublicKeys(
                                    Arrays.asList(
                                            "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDokoG4lDsCN/E9F7KsaVZmYYKZMdljJwxjwsoyFdTTQop0TH0lMSDiZeZ3w/8wsZ5esR5uiW/WS5RMBxrfy1/z12qHbOP8vTLCZ19X33UDS8yhEarDldmBbeQ5penrjHM54+lLBTKolGfXvszbUP8ohsN/If7nfn2caUNRiE9Ep9T+xIr/ElmSyq9qrBbUdg0ltz3yIbkmv7SwgxW+NZSD2mhmfYJJDWq5QpJqc3lcNSCU/0f1mQGm754qI7wJKGEhSEOJkBvS7YrfDRINtNABaKGIDUCijwp+dl7btRaxBDwiF/+zHrX43ZEypVcbgVnOcxtz3E/CgxRHZ1plfEpd dhshshah@dhshshah-Mac"))
                            .build();

            LaunchDbSystemResponse launchDbSystemResponse =
                    databaseClient.launchDbSystem(
                            LaunchDbSystemRequest.builder()
                                    .launchDbSystemDetails(dbSystem)
                                    .build());
            DatabaseWaiters waiter = databaseClient.getWaiters();
            GetDbSystemResponse getDbSystemResponse =
                    waiter.forDbSystem(
                                    GetDbSystemRequest.builder()
                                            .dbSystemId(
                                                    launchDbSystemResponse.getDbSystem().getId())
                                            .build(),
                                    DbSystem.LifecycleState.Available,
                                    new MaxTimeTerminationStrategy(
                                            TimeUnit.HOURS.toMillis(MAX_WAIT_IN_HOURS)),
                                    new ExponentialBackoffDelayStrategy(
                                            TimeUnit.MINUTES.toMillis(DELAY_INTERVAL_IN_MINS)))
                            .execute();
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
            System.out.println("Exception occurred : " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Begin terminating DbSystems");
            terminateDbSystem(dbSystemId);

            if (subnet != null) {
                DatabaseExampleHelper.deleteSubnet(virtualNetworkClient, subnet);
            }
            if (vcn != null) {
                DatabaseExampleHelper.deleteVcn(virtualNetworkClient, vcn);
            }
        }

        databaseClient.close();
        virtualNetworkClient.close();
    }

    /**
     * Method to terminate a DbSystem
     *
     * @param dbSystemId OCID of the Dbsystvem which needs to be deleted.
     * @throws Exception
     */
    private static void terminateDbSystem(String dbSystemId) throws Exception {
        if (StringUtils.isNotEmpty(dbSystemId)) {
            TerminateDbSystemRequest terminateDbSystemRequest =
                    TerminateDbSystemRequest.builder().dbSystemId(dbSystemId).build();
            databaseClient.terminateDbSystem(terminateDbSystemRequest);
            databaseClient
                    .getWaiters()
                    .forDbSystem(
                            GetDbSystemRequest.builder().dbSystemId(dbSystemId).build(),
                            DbSystem.LifecycleState.Terminated)
                    .execute();
            System.out.println("Terminated DB System : " + dbSystemId);
        }
    }
}
