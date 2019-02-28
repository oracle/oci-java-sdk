/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.Subnet;
import com.oracle.bmc.core.model.Vcn;
import com.oracle.bmc.database.DatabaseClient;
import com.oracle.bmc.database.DatabaseWaiters;
import com.oracle.bmc.database.model.CreateBackupDetails;
import com.oracle.bmc.database.model.CreateDatabaseFromBackupDetails;
import com.oracle.bmc.database.model.CreateDbHomeDetails;
import com.oracle.bmc.database.model.CreateDbHomeFromBackupDetails;
import com.oracle.bmc.database.model.DataGuardAssociation;
import com.oracle.bmc.database.model.DataGuardAssociationSummary;
import com.oracle.bmc.database.model.DatabaseSummary;
import com.oracle.bmc.database.model.DbHomeSummary;
import com.oracle.bmc.database.model.DbSystem;
import com.oracle.bmc.database.model.LaunchDbSystemFromBackupDetails;
import com.oracle.bmc.database.requests.GetDbSystemRequest;
import com.oracle.bmc.database.requests.LaunchDbSystemRequest;
import com.oracle.bmc.database.requests.ListDatabasesRequest;
import com.oracle.bmc.database.requests.ListDbHomesRequest;
import com.oracle.bmc.database.requests.TerminateDbSystemRequest;
import com.oracle.bmc.database.responses.GetDbSystemResponse;
import com.oracle.bmc.database.responses.LaunchDbSystemResponse;
import com.oracle.bmc.waiter.ExponentialBackoffDelayStrategy;
import com.oracle.bmc.waiter.MaxTimeTerminationStrategy;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LaunchDbSystemFromBackupExample {
    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";
    private static final String DATABASE_ADMIN_PASSWORD = "DBaaS12345_#";
    private static final String vcnCidrBlock = "10.0.0.0/16";
    private static final String subnetCidrBlock = "10.0.1.0/24";
    private static int randomId = new Random().nextInt(999);

    private static final long MAX_WAIT_IN_MINS = 4 * 60;
    private static final long DELAY_INTERVAL_IN_MINS = 1;

    private static DatabaseClient databaseClient = null;
    private static VirtualNetworkClient virtualNetworkClient = null;
    private static String regionId;
    private static String compartmentId;
    private static String availabilityDomain;
    private static String backupId;

    public static void main(String[] args) throws Exception {

        if (args.length != 4) {
            System.out.println(args.length);
            throw new Exception(
                    "This example expects 4 arguments: a region ID, a compartment OCID, availability domain for the VCN "
                            + "and BackupID of the database to be restored.");
        }

        regionId = args[0];
        compartmentId = args[1];
        availabilityDomain = args[2];
        backupId = args[3];

        Region targetRegion = Region.fromRegionId(regionId);

        final ConfigFileReader.ConfigFile configFile =
                ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);
        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);
        databaseClient = new DatabaseClient(provider);
        virtualNetworkClient = new VirtualNetworkClient(provider);

        databaseClient.setRegion(targetRegion);
        virtualNetworkClient.setRegion(targetRegion);

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
                                            minutesToMillis(MAX_WAIT_IN_MINS)),
                                    new ExponentialBackoffDelayStrategy(
                                            minutesToMillis(DELAY_INTERVAL_IN_MINS)))
                            .execute();
            firstDbSystemId = getDbSystemResponse.getDbSystem().getId();
            String firstDbHomeId = getDbHome(firstDbSystemId).getId();
            String firstDatabaseId = getDatabase(firstDbHomeId).getId();
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
                .shape("VM.Standard1.1")
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

    private static DbHomeSummary getDbHome(String dbSystemId) {
        if (StringUtils.isEmpty(dbSystemId)) return null;

        ListDbHomesRequest listDbHomesRequest =
                ListDbHomesRequest.builder()
                        .compartmentId(compartmentId)
                        .dbSystemId(dbSystemId)
                        .build();
        List<DbHomeSummary> dbHomeList = databaseClient.listDbHomes(listDbHomesRequest).getItems();
        return (null != dbHomeList && !dbHomeList.isEmpty()) ? dbHomeList.get(0) : null;
    }

    private static DatabaseSummary getDatabase(String dbHomeId) {
        if (StringUtils.isEmpty(dbHomeId)) return null;

        ListDatabasesRequest listDatabasesRequest =
                ListDatabasesRequest.builder()
                        .compartmentId(compartmentId)
                        .dbHomeId(dbHomeId)
                        .build();
        List<DatabaseSummary> databaseList =
                databaseClient.listDatabases(listDatabasesRequest).getItems();
        return (null != databaseList && !databaseList.isEmpty()) ? databaseList.get(0) : null;
    }

    private static long minutesToMillis(long minutes) {
        return minutes * 60 * 1000L;
    }
}
