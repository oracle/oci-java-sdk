/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
import com.oracle.bmc.database.model.CreateDbHomeWithDbSystemIdDetails;
import com.oracle.bmc.database.model.Database;
import com.oracle.bmc.database.model.DatabaseSummary;
import com.oracle.bmc.database.model.DbBackupConfig;
import com.oracle.bmc.database.model.DbHome;
import com.oracle.bmc.database.model.DbSystem;
import com.oracle.bmc.database.model.LaunchDbSystemDetails;
import com.oracle.bmc.database.model.UpdateDatabaseDetails;
import com.oracle.bmc.database.requests.CreateDbHomeRequest;
import com.oracle.bmc.database.requests.GetDatabaseRequest;
import com.oracle.bmc.database.requests.GetDbHomeRequest;
import com.oracle.bmc.database.requests.GetDbSystemRequest;
import com.oracle.bmc.database.requests.LaunchDbSystemRequest;
import com.oracle.bmc.database.requests.ListDatabasesRequest;
import com.oracle.bmc.database.requests.TerminateDbSystemRequest;
import com.oracle.bmc.database.requests.UpdateDatabaseRequest;
import com.oracle.bmc.database.responses.CreateDbHomeResponse;
import com.oracle.bmc.database.responses.GetDatabaseResponse;
import com.oracle.bmc.database.responses.GetDbHomeResponse;
import com.oracle.bmc.database.responses.GetDbSystemResponse;
import com.oracle.bmc.database.responses.LaunchDbSystemResponse;
import com.oracle.bmc.database.responses.UpdateDatabaseResponse;
import com.oracle.bmc.waiter.ExponentialBackoffDelayStrategy;
import com.oracle.bmc.waiter.MaxTimeTerminationStrategy;
import com.oracle.bmc.util.internal.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * This class provides a basic example of how to launch a DB system, create a new DbHome and update an existing database
 * with a recovery window as the input using the Java SDK. This will cover:
 * <p></p>
 * <ul>
 *   <li>Create a VCN and subnet for the DB system and its related resources</li>
 *   <li>
 *     Launch a DB system containing a single DB home and database. See:
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
public class BackupRetentionWindowExample {

    private static DatabaseClient databaseClient = null;
    private static VirtualNetworkClient virtualNetworkClient = null;
    private static String compartmentId;
    private static String availabilityDomain;
    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";
    private static final String DATABASE_ADMIN_PASSWORD = "DBaaS12345_#";
    private static final String vcnCidrBlock = "10.0.0.0/16";
    private static final String subnetCidrBlock = "10.0.1.0/24";

    private static final long MAX_WAIT_IN_MINS = TimeUnit.SECONDS.toMinutes(4L);
    private static final long DELAY_INTERVAL_IN_MINS = TimeUnit.SECONDS.toMinutes(1L);

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     *             <ul>
     *             <li>The OCID of the compartment which owns the DB system</li>
     *             <li>The availability domain where the DB system will be launched</li>
     *             <li>The database recovery window input during launch of the DB system </li>
     *             <li>The database recovery window input to create a new db home in the DB system </li>
     *             <li>The database recovery window input to update an existing database's recovery window </li>
     *             </ul>
     */
    public static void main(String[] args) throws Exception {
        if (args.length != 5) {
            throw new Exception(
                    "This example expects 5 arguments: a compartment OCID, availability domain for the VCN, \n"
                            + "recovery window for the launched DbSystem, \n"
                            + "recovery window for the created DbHome and recovery window to update the Database");
        }
        for (String arg : args) {
            System.out.println(arg);
        }

        compartmentId = args[0];
        availabilityDomain = args[1];

        int recoveryWindowForLaunch = Integer.parseInt(args[2]);
        int recoveryWindowForDbHome = Integer.parseInt(args[3]);
        int recoveryWindowForUpdate = Integer.parseInt(args[4]);

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
        String dbSystemId = null;
        String dbhomeId = null;
        try {

            vcn =
                    DatabaseExampleHelper.createVcn(
                            virtualNetworkClient, compartmentId, vcnCidrBlock);
            subnet =
                    DatabaseExampleHelper.createSubnet(
                            virtualNetworkClient, vcn, availabilityDomain, subnetCidrBlock);

            dbSystemId = launchDbSystem(subnet, recoveryWindowForLaunch);
            dbhomeId = createDbHome(recoveryWindowForDbHome, dbSystemId);
            updateDatabase(recoveryWindowForUpdate, dbhomeId);
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
    }

    /**
     * Launch a DbSystem with recovery window specified in Input
     *
     * @param subnet
     * @param recoveryWindowForLaunch
     * @return OCID of the launched DbSystem
     * @throws Exception
     *
     */
    private static String launchDbSystem(Subnet subnet, Integer recoveryWindowForLaunch)
            throws Exception {
        System.out.println(
                "Launching DB System with recovery window set to " + recoveryWindowForLaunch);
        LaunchDbSystemDetails dbSystem =
                createLaunchDbSystemRequest(subnet.getId(), recoveryWindowForLaunch);
        LaunchDbSystemResponse launchDbSystemResponse =
                databaseClient.launchDbSystem(
                        LaunchDbSystemRequest.builder().launchDbSystemDetails(dbSystem).build());
        DatabaseWaiters waiter = databaseClient.getWaiters();
        GetDbSystemResponse getDbSystemResponse =
                waiter.forDbSystem(
                                GetDbSystemRequest.builder()
                                        .dbSystemId(launchDbSystemResponse.getDbSystem().getId())
                                        .build(),
                                DbSystem.LifecycleState.Available,
                                new MaxTimeTerminationStrategy(
                                        TimeUnit.MINUTES.toMillis(MAX_WAIT_IN_MINS)),
                                new ExponentialBackoffDelayStrategy(
                                        TimeUnit.MINUTES.toMillis(DELAY_INTERVAL_IN_MINS)))
                        .execute();
        String dbSystemId = getDbSystemResponse.getDbSystem().getId();
        System.out.println("Launched DB System " + dbSystemId);
        return dbSystemId;
    }

    /**
     * Create DbHome with recovery window specified in Input in the same dbsystem
     *
     * @param recoveryWindowForDbHome
     * @param dbSystemId
     * @return OCID of the created DbHome
     * @throws Exception
     */
    private static String createDbHome(Integer recoveryWindowForDbHome, String dbSystemId)
            throws Exception {
        System.out.println(
                "Creating DbHome with recovery window set to " + recoveryWindowForDbHome);
        CreateDbHomeWithDbSystemIdDetails dbHome =
                createDbHomeWithDbSystemIdRequest(dbSystemId, recoveryWindowForDbHome);
        DatabaseWaiters waiter = databaseClient.getWaiters();

        CreateDbHomeResponse createDbHomeResponse =
                databaseClient.createDbHome(
                        CreateDbHomeRequest.builder()
                                .createDbHomeWithDbSystemIdDetails(dbHome)
                                .build());

        GetDbHomeResponse getDbHomeResponse =
                waiter.forDbHome(
                                GetDbHomeRequest.builder()
                                        .dbHomeId(createDbHomeResponse.getDbHome().getId())
                                        .build(),
                                DbHome.LifecycleState.Available,
                                new MaxTimeTerminationStrategy(
                                        TimeUnit.MINUTES.toMillis(MAX_WAIT_IN_MINS / 2)),
                                new ExponentialBackoffDelayStrategy(
                                        TimeUnit.MINUTES.toMillis(DELAY_INTERVAL_IN_MINS)))
                        .execute();

        String dbHomeId = getDbHomeResponse.getDbHome().getId();
        System.out.println("Created DbHome is  " + dbHomeId);
        return dbHomeId;
    }

    /**
     * Update Database with recovery window specified in Input
     *
     * @param recoveryWindowForUpdate
     * @param dbHomeId
     * @throws Exception
     *
     */
    private static void updateDatabase(Integer recoveryWindowForUpdate, String dbHomeId)
            throws Exception {
        DatabaseWaiters waiter = databaseClient.getWaiters();
        DatabaseSummary database = getDatabase(dbHomeId);
        System.out.println(
                "Updating Database "
                        + database.getId()
                        + " to have Recovery Window as "
                        + recoveryWindowForUpdate);

        UpdateDatabaseResponse updateDatabaseResponse =
                databaseClient.updateDatabase(
                        UpdateDatabaseRequest.builder()
                                .databaseId(database.getId())
                                .updateDatabaseDetails(
                                        updateDatasbeRequest(recoveryWindowForUpdate))
                                .build());

        GetDatabaseResponse getDatabaseResponse =
                waiter.forDatabase(
                                GetDatabaseRequest.builder()
                                        .databaseId(updateDatabaseResponse.getDatabase().getId())
                                        .build(),
                                Database.LifecycleState.Available,
                                new MaxTimeTerminationStrategy(
                                        TimeUnit.MINUTES.toMillis(MAX_WAIT_IN_MINS / 2)),
                                new ExponentialBackoffDelayStrategy(
                                        TimeUnit.MINUTES.toMillis(DELAY_INTERVAL_IN_MINS)))
                        .execute();

        String databaseId = getDatabaseResponse.getDatabase().getId();
        System.out.println("Updated Database " + databaseId);
    }

    private static UpdateDatabaseDetails updateDatasbeRequest(Integer recoveryWindowForUpdate) {
        return UpdateDatabaseDetails.builder()
                .dbBackupConfig(
                        DbBackupConfig.builder()
                                .recoveryWindowInDays(recoveryWindowForUpdate)
                                .build())
                .build();
    }

    private static CreateDbHomeWithDbSystemIdDetails createDbHomeWithDbSystemIdRequest(
            String dbSystemId, Integer recoveryWindowForDbHome) {
        int randomId = new Random().nextInt(999);
        return CreateDbHomeWithDbSystemIdDetails.builder()
                .dbSystemId(dbSystemId)
                .dbVersion("12.2.0.1")
                .displayName("dbh" + randomId)
                .database(createDatabaseRequest(randomId, recoveryWindowForDbHome))
                .build();
    }

    private static LaunchDbSystemDetails createLaunchDbSystemRequest(
            String subnetId, Integer recoveryWindow) {
        int randomId = new Random().nextInt(999);
        return LaunchDbSystemDetails.builder()
                .dbHome(createDbHomeRequest(randomId, recoveryWindow))
                .cpuCoreCount(4)
                .nodeCount(1)
                .initialDataStorageSizeInGB(512)
                .availabilityDomain(availabilityDomain)
                .compartmentId(compartmentId)
                .databaseEdition(
                        LaunchDbSystemDetails.DatabaseEdition.EnterpriseEditionExtremePerformance)
                .displayName("dbs" + randomId)
                .shape("BM.DenseIO2.52")
                .subnetId(subnetId)
                .hostname("host" + randomId)
                .licenseModel(LaunchDbSystemDetails.LicenseModel.LicenseIncluded)
                .sshPublicKeys(
                        Arrays.asList(
                                "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDokoG4lDsCN/E9F7KsaVZmYYKZMdljJwxjwsoyFdTTQop0TH0lMSDiZeZ3w/8wsZ5esR5uiW/WS5RMBxrfy1/z12qHbOP8vTLCZ19X33UDS8yhEarDldmBbeQ5penrjHM54+lLBTKolGfXvszbUP8ohsN/If7nfn2caUNRiE9Ep9T+xIr/ElmSyq9qrBbUdg0ltz3yIbkmv7SwgxW+NZSD2mhmfYJJDWq5QpJqc3lcNSCU/0f1mQGm754qI7wJKGEhSEOJkBvS7YrfDRINtNABaKGIDUCijwp+dl7btRaxBDwiF/+zHrX43ZEypVcbgVnOcxtz3E/CgxRHZ1plfEpd dhshshah@dhshshah-Mac"))
                .build();
    }

    private static CreateDbHomeDetails createDbHomeRequest(
            Integer randomId, Integer recoveryWindow) {
        return CreateDbHomeDetails.builder()
                .database(createDatabaseRequest(randomId, recoveryWindow))
                .dbVersion("12.2.0.1")
                .displayName("dbh" + randomId)
                .build();
    }

    private static CreateDatabaseDetails createDatabaseRequest(
            Integer randomId, Integer recoveryWindow) {
        return CreateDatabaseDetails.builder()
                .dbBackupConfig(
                        DbBackupConfig.builder().recoveryWindowInDays(recoveryWindow).build())
                .adminPassword(DATABASE_ADMIN_PASSWORD)
                .dbName("db" + randomId)
                .build();
    }

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
        }
    }

    private static DatabaseSummary getDatabase(String dbHomeId) {
        ListDatabasesRequest listDatabasesRequest =
                ListDatabasesRequest.builder()
                        .compartmentId(compartmentId)
                        .dbHomeId(dbHomeId)
                        .build();
        List<DatabaseSummary> databaseList =
                databaseClient.listDatabases(listDatabasesRequest).getItems();
        return (null != databaseList && !databaseList.isEmpty()) ? databaseList.get(0) : null;
    }
}
