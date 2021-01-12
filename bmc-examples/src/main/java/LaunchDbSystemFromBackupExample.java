/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
import com.oracle.bmc.database.model.CreateDatabaseFromBackupDetails;
import com.oracle.bmc.database.model.CreateDbHomeFromBackupDetails;
import com.oracle.bmc.database.model.DbSystem;
import com.oracle.bmc.database.model.LaunchDbSystemFromBackupDetails;
import com.oracle.bmc.database.requests.GetDbSystemRequest;
import com.oracle.bmc.database.requests.LaunchDbSystemRequest;
import com.oracle.bmc.database.requests.TerminateDbSystemRequest;
import com.oracle.bmc.database.responses.GetDbSystemResponse;
import com.oracle.bmc.database.responses.LaunchDbSystemResponse;
import com.oracle.bmc.waiter.ExponentialBackoffDelayStrategy;
import com.oracle.bmc.waiter.MaxTimeTerminationStrategy;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * This class provides a basic example of how to launch a DB system from an active backup using the Java SDK. This will cover:
 * <p></p>
 * <ul>
 *   <li>Create a VCN and subnet for the DB system and its related resources</li>
 *   <li>
 *     Launch a DB system containing a single DB home and database from an active backup. See:
 *       <a href="https://docs.cloud.oracle.com/Content/Database/Concepts/overview.htm">overview</a> and
 *       <a href="https://docs.cloud.oracle.com/Content/Database/Tasks/launchingDB.htm">managing DB systems</a>
 *       for more information
 * </ul>
 * <p></p>
 * Resources created by this class will be removed when this example is done.
 * <p></p>
 * This class also makes assumptions on the following database parameters:
 * <p></p>
 * <ul>
 *   <li>Core count</li>
 *   <li>DB edition</li>
 *   <li>DB version</li>
 * </ul>
 */
public class LaunchDbSystemFromBackupExample {
    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";
    private static final String DATABASE_ADMIN_PASSWORD = "DBaaS12345_#";
    private static final String vcnCidrBlock = "10.0.0.0/16";
    private static final String subnetCidrBlock = "10.0.1.0/24";
    private static int randomId = new Random().nextInt(999);

    private static final long MAX_WAIT_IN_MINS = TimeUnit.SECONDS.toMinutes(4L);
    private static final long DELAY_INTERVAL_IN_MINS = TimeUnit.SECONDS.toMinutes(1L);

    private static DatabaseClient databaseClient = null;
    private static VirtualNetworkClient virtualNetworkClient = null;
    private static String compartmentId;
    private static String availabilityDomain;
    private static String backupId;

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     *             <ul>
     *             <li>The OCID of the compartment which owns the DB system</li>
     *             <li>The availability domain where the DB system will be launched</li>
     *             <li>Sparse DiskGroup option: True, if Sparse Diskgroup is configured for Exadata dbsystem, False, if Sparse diskgroup was not configured.</li>
     *             <li>The OCID of the backup that will be used during irestore</li>
     *             </ul>
     */
    public static void main(String[] args) throws Exception {

        if (args.length != 3) {
            System.out.println(args.length);
            throw new Exception(
                    "This example expects 3 arguments: a compartment OCID, availability domain for the VCN "
                            + "and BackupID of the database to be restored.");
        }

        compartmentId = args[0];
        availabilityDomain = args[1];
        backupId = args[2];

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);
        databaseClient = new DatabaseClient(provider);
        virtualNetworkClient = new VirtualNetworkClient(provider);

        Vcn vcn = null;
        Subnet subnet = null;
        String firstDbSystemId = null;
        String secondDbSystemId = null;
        try {

            vcn =
                    DatabaseExampleHelper.createVcn(
                            virtualNetworkClient, compartmentId, vcnCidrBlock);
            subnet =
                    DatabaseExampleHelper.createSubnet(
                            virtualNetworkClient, vcn, availabilityDomain, subnetCidrBlock);

            // 1. LaunchDbsystem from backup with a new database Name
            LaunchDbSystemFromBackupDetails primaryDbSystem =
                    createLaunchVMDbSystemRequestFromBackup(subnet.getId(), backupId);
            LaunchDbSystemResponse launchDbSystemResponse =
                    databaseClient.launchDbSystem(
                            LaunchDbSystemRequest.builder()
                                    .launchDbSystemDetails(primaryDbSystem)
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
                                            TimeUnit.MINUTES.toMillis(MAX_WAIT_IN_MINS)),
                                    new ExponentialBackoffDelayStrategy(
                                            TimeUnit.MINUTES.toMillis(DELAY_INTERVAL_IN_MINS)))
                            .execute();
            firstDbSystemId = getDbSystemResponse.getDbSystem().getId();
            System.out.println("Launched DB System from backup:" + firstDbSystemId);
        } finally {
            System.out.println("Begin terminating DbSystems");
            terminateDbSystems(firstDbSystemId);

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

    private static LaunchDbSystemFromBackupDetails createLaunchVMDbSystemRequestFromBackup(
            String subnetId, String backupId) {

        return LaunchDbSystemFromBackupDetails.builder()
                .dbHome(createDbHomeFromBackupDetails(backupId))
                .cpuCoreCount(1)
                .nodeCount(1)
                .initialDataStorageSizeInGB(256)
                .availabilityDomain(availabilityDomain)
                .faultDomains(Arrays.asList("FAULT-DOMAIN-1"))
                .compartmentId(compartmentId)
                .databaseEdition(
                        LaunchDbSystemFromBackupDetails.DatabaseEdition
                                .EnterpriseEditionExtremePerformance)
                .displayName("dbs" + randomId)
                .shape("VM.Standard2.1")
                .subnetId(subnetId)
                .hostname("host" + randomId)
                .licenseModel(LaunchDbSystemFromBackupDetails.LicenseModel.LicenseIncluded)
                .sshPublicKeys(
                        Arrays.asList(
                                "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDokoG4lDsCN/E9F7KsaVZmYYKZMdljJwxjwsoyFdTTQop0TH0lMSDiZeZ3w/8wsZ5esR5uiW/WS5RMBxrfy1/z12qHbOP8vTLCZ19X33UDS8yhEarDldmBbeQ5penrjHM54+lLBTKolGfXvszbUP8ohsN/If7nfn2caUNRiE9Ep9T+xIr/ElmSyq9qrBbUdg0ltz3yIbkmv7SwgxW+NZSD2mhmfYJJDWq5QpJqc3lcNSCU/0f1mQGm754qI7wJKGEhSEOJkBvS7YrfDRINtNABaKGIDUCijwp+dl7btRaxBDwiF/+zHrX43ZEypVcbgVnOcxtz3E/CgxRHZ1plfEpd dhshshah@dhshshah-Mac"))
                .build();
    }

    private static CreateDbHomeFromBackupDetails createDbHomeFromBackupDetails(String backupId) {
        return CreateDbHomeFromBackupDetails.builder()
                .database(createDatabaseFromBackupDetails(backupId))
                .build();
    }

    private static CreateDatabaseFromBackupDetails createDatabaseFromBackupDetails(
            String backupId) {
        return CreateDatabaseFromBackupDetails.builder()
                .backupId(backupId)
                .dbName("NewDb")
                .backupTDEPassword(DATABASE_ADMIN_PASSWORD)
                .adminPassword(DATABASE_ADMIN_PASSWORD)
                .build();
    }

    private static void terminateDbSystems(String firstDbSystemId) throws Exception {
        terminateDBSystem(firstDbSystemId);
    }

    private static void terminateDBSystem(String dbSystemId) throws Exception {
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
        }
    }
}
