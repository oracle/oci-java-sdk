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
import com.oracle.bmc.database.model.CreateDatabaseDetails;
import com.oracle.bmc.database.model.CreateDbHomeDetails;
import com.oracle.bmc.database.model.DbSystem;
import com.oracle.bmc.database.model.LaunchDbSystemDetails;
import com.oracle.bmc.database.requests.GetDbSystemRequest;
import com.oracle.bmc.database.requests.LaunchDbSystemRequest;
import com.oracle.bmc.database.requests.TerminateDbSystemRequest;
import com.oracle.bmc.database.responses.GetDbSystemResponse;
import com.oracle.bmc.database.responses.LaunchDbSystemResponse;
import com.oracle.bmc.util.StreamUtils;
import com.oracle.bmc.waiter.ExponentialBackoffDelayStrategy;
import com.oracle.bmc.waiter.MaxTimeTerminationStrategy;

import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

/**
 * This class provides a basic example of how to launch a DB system with Exadata shape using the
 * Java SDK. This will cover:
 *
 * <p>
 *
 * <ul>
 *   <li>Create a VCN and subnets needed for the DB system and its related resources
 *   <li>Launch a DB system with Exadata shape and sparse disk group option. See: <a
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
 *   <li>DB system shape
 *   <li>Core count
 *   <li>DB edition
 *   <li>DB version
 *   <li>CIDR block for VCN
 * </ul>
 */
public class LaunchExaDbSystemWithSparseExample {
    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";
    private static final String DB_SYSTEM_SHAPE = "Exadata.Quarter2.92";
    private static final String DB_VERSION = "12.1.0.2";

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     *     <ul>
     *       <li>The OCID of the compartment which owns the DB system
     *       <li>The availability domain where the DB system will be launched
     *       <li>Sparse DiskGroup option: True, if Sparse Diskgroup is configured for Exadata
     *           dbsystem, False, if Sparse diskgroup was not configured.
     *       <li>Database admin password
     *       <li>Full path to SSH public key file
     *     </ul>
     */
    public static void main(String[] args) throws Exception {
        if (args.length != 5) {
            throw new IllegalAccessException(
                    "This example expects five arguments: "
                            + "a compartment OCID, availability domain, sparseDiskGroup option"
                            + "Database admin password and Full path to SSH public key file");
        }
        final String compartmentId = args[0];
        final String availabilityDomain = args[1];
        final String sparseDiskGroup = args[2];
        final String adminPassword = args[3];
        final String sshKeyfilePath = args[4];

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
        Subnet backupSubnet = null;

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

            final List<String> sshPublicKeys =
                    Arrays.asList(
                            StreamUtils.toString(
                                    new FileInputStream(new File(sshKeyfilePath)),
                                    Charset.defaultCharset()));

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
                            .sparseDiskgroup(sparseDiskGroup.equalsIgnoreCase("true"))
                            .sshPublicKeys(sshPublicKeys)
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
                                    new MaxTimeTerminationStrategy(21600L * 1000),
                                    new ExponentialBackoffDelayStrategy(900L * 1000))
                            .execute();

            System.out.println("Exadata DB System is in Provisioning state");
            System.out.println("===========================");
            System.out.println(getDbSystemResponse.getDbSystem().toString());
            System.out.println(
                    "With sparse disk group option: "
                            + getDbSystemResponse.getDbSystem().getSparseDiskgroup());
            /*
               Once we're done with the DB system, we can terminate it and wait for it to be terminated.
            */
            databaseClient.terminateDbSystem(
                    TerminateDbSystemRequest.builder()
                            .dbSystemId(launchDbSystemResponse.getDbSystem().getId())
                            .build());
            databaseClient
                    .getWaiters()
                    .forDbSystem(
                            GetDbSystemRequest.builder()
                                    .dbSystemId(launchDbSystemResponse.getDbSystem().getId())
                                    .build(),
                            DbSystem.LifecycleState.Terminated)
                    .execute();

            System.out.println("Terminated Exadata DB system");
        } finally {
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
}
