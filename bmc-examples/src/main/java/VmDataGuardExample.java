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
import com.oracle.bmc.database.model.CreateDataGuardAssociationDetails;
import com.oracle.bmc.database.model.CreateDataGuardAssociationWithNewDbSystemDetails;
import com.oracle.bmc.database.model.CreateDatabaseDetails;
import com.oracle.bmc.database.model.CreateDbHomeDetails;
import com.oracle.bmc.database.model.DataGuardAssociation;
import com.oracle.bmc.database.model.DataGuardAssociationSummary;
import com.oracle.bmc.database.model.DatabaseSummary;
import com.oracle.bmc.database.model.DbHomeSummary;
import com.oracle.bmc.database.model.DbSystem;
import com.oracle.bmc.database.model.FailoverDataGuardAssociationDetails;
import com.oracle.bmc.database.model.LaunchDbSystemDetails;
import com.oracle.bmc.database.model.ReinstateDataGuardAssociationDetails;
import com.oracle.bmc.database.model.SwitchoverDataGuardAssociationDetails;
import com.oracle.bmc.database.requests.CreateDataGuardAssociationRequest;
import com.oracle.bmc.database.requests.FailoverDataGuardAssociationRequest;
import com.oracle.bmc.database.requests.GetDataGuardAssociationRequest;
import com.oracle.bmc.database.requests.GetDbSystemRequest;
import com.oracle.bmc.database.requests.LaunchDbSystemRequest;
import com.oracle.bmc.database.requests.ListDataGuardAssociationsRequest;
import com.oracle.bmc.database.requests.ListDatabasesRequest;
import com.oracle.bmc.database.requests.ListDbHomesRequest;
import com.oracle.bmc.database.requests.ReinstateDataGuardAssociationRequest;
import com.oracle.bmc.database.requests.SwitchoverDataGuardAssociationRequest;
import com.oracle.bmc.database.requests.TerminateDbSystemRequest;
import com.oracle.bmc.database.responses.CreateDataGuardAssociationResponse;
import com.oracle.bmc.database.responses.FailoverDataGuardAssociationResponse;
import com.oracle.bmc.database.responses.GetDataGuardAssociationResponse;
import com.oracle.bmc.database.responses.GetDbSystemResponse;
import com.oracle.bmc.database.responses.LaunchDbSystemResponse;
import com.oracle.bmc.database.responses.ReinstateDataGuardAssociationResponse;
import com.oracle.bmc.database.responses.SwitchoverDataGuardAssociationResponse;
import com.oracle.bmc.waiter.ExponentialBackoffDelayStrategy;
import com.oracle.bmc.waiter.MaxTimeTerminationStrategy;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class VmDataGuardExample {

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

    public static void main(String[] args) throws Exception {

        if (args.length != 3) {
            throw new Exception(
                    "This example expects 3 arguments: a region ID, a compartment OCID, availability domain for the VCN");
        }

        regionId = args[0];
        compartmentId = args[1];
        availabilityDomain = args[2];

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

            // 1. Launch Primary DbSystem
            LaunchDbSystemDetails primaryDbSystem = createLaunchVMDbSystemRequest(subnet.getId());
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
            System.out.println("Launched Primary DB System " + firstDbSystemId);

            // 2. Setup DataGuard
            CreateDataGuardAssociationDetails dataGuardRequest =
                    CreateDataGuardAssociationWithNewDbSystemDetails.builder()
                            .databaseAdminPassword(DATABASE_ADMIN_PASSWORD)
                            .displayName("dbsPeer" + randomId)
                            .availabilityDomain(availabilityDomain)
                            .hostname("hostPeer" + randomId)
                            .subnetId(subnet.getId())
                            .protectionMode(
                                    CreateDataGuardAssociationDetails.ProtectionMode
                                            .MaximumPerformance)
                            .transportType(CreateDataGuardAssociationDetails.TransportType.Async)
                            .build();
            CreateDataGuardAssociationResponse createDataGuardAssociationResponse =
                    databaseClient.createDataGuardAssociation(
                            CreateDataGuardAssociationRequest.builder()
                                    .createDataGuardAssociationDetails(dataGuardRequest)
                                    .databaseId(firstDatabaseId)
                                    .build());
            GetDataGuardAssociationResponse getDataGuardAssociationResponse =
                    waitAndGetDataGuardAssociationResponse(
                            waiter,
                            firstDatabaseId,
                            createDataGuardAssociationResponse.getDataGuardAssociation());
            System.out.println(
                    "Created DataGuard "
                            + getDataGuardAssociationResponse.getDataGuardAssociation());

            String dataguardAssociationId =
                    getDataGuardAssociationResponse.getDataGuardAssociation().getId();
            secondDbSystemId =
                    getDataGuardAssociationResponse.getDataGuardAssociation().getPeerDbSystemId();

            // 3. Switch over on current primary
            SwitchoverDataGuardAssociationRequest switchOverRequest =
                    SwitchoverDataGuardAssociationRequest.builder()
                            .databaseId(firstDatabaseId)
                            .dataGuardAssociationId(dataguardAssociationId)
                            .switchoverDataGuardAssociationDetails(
                                    SwitchoverDataGuardAssociationDetails.builder()
                                            .databaseAdminPassword(DATABASE_ADMIN_PASSWORD)
                                            .build())
                            .build();
            SwitchoverDataGuardAssociationResponse switchoverResponse =
                    databaseClient.switchoverDataGuardAssociation(switchOverRequest);
            getDataGuardAssociationResponse =
                    waitAndGetDataGuardAssociationResponse(
                            waiter, firstDatabaseId, switchoverResponse.getDataGuardAssociation());
            System.out.println(
                    "Completed Switchover DataGuard "
                            + getDataGuardAssociationResponse.getDataGuardAssociation());

            // 4. After switch over old primary will become standby and we should be able to fail-over to it.
            FailoverDataGuardAssociationRequest failOverRequest =
                    FailoverDataGuardAssociationRequest.builder()
                            .databaseId(firstDatabaseId)
                            .dataGuardAssociationId(dataguardAssociationId)
                            .failoverDataGuardAssociationDetails(
                                    FailoverDataGuardAssociationDetails.builder()
                                            .databaseAdminPassword(DATABASE_ADMIN_PASSWORD)
                                            .build())
                            .build();
            FailoverDataGuardAssociationResponse failoverResponse =
                    databaseClient.failoverDataGuardAssociation(failOverRequest);
            getDataGuardAssociationResponse =
                    waitAndGetDataGuardAssociationResponse(
                            waiter, firstDatabaseId, failoverResponse.getDataGuardAssociation());
            System.out.println(
                    "Completed Failover DataGuard "
                            + getDataGuardAssociationResponse.getDataGuardAssociation());

            // 5. Reinstate current primary.
            ReinstateDataGuardAssociationRequest reinstateRequest =
                    ReinstateDataGuardAssociationRequest.builder()
                            .databaseId(firstDatabaseId)
                            .dataGuardAssociationId(dataguardAssociationId)
                            .reinstateDataGuardAssociationDetails(
                                    ReinstateDataGuardAssociationDetails.builder()
                                            .databaseAdminPassword(DATABASE_ADMIN_PASSWORD)
                                            .build())
                            .build();
            ReinstateDataGuardAssociationResponse reinstateResponse =
                    databaseClient.reinstateDataGuardAssociation(reinstateRequest);
            getDataGuardAssociationResponse =
                    waitAndGetDataGuardAssociationResponse(
                            waiter, firstDatabaseId, reinstateResponse.getDataGuardAssociation());
            System.out.println(
                    "Completed Reinstate DataGuard "
                            + getDataGuardAssociationResponse.getDataGuardAssociation());

        } finally {
            System.out.println("Begin terminating DbSystems");
            terminateDbSystems(firstDbSystemId, secondDbSystemId);

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

    private static LaunchDbSystemDetails createLaunchVMDbSystemRequest(String subnetId) {
        return LaunchDbSystemDetails.builder()
                .dbHome(createDbHomeRequest())
                .cpuCoreCount(4)
                .nodeCount(1)
                .initialDataStorageSizeInGB(512)
                .availabilityDomain(availabilityDomain)
                .compartmentId(compartmentId)
                .databaseEdition(
                        LaunchDbSystemDetails.DatabaseEdition.EnterpriseEditionExtremePerformance)
                .displayName("dbs" + randomId)
                .shape("VM.Standard2.1")
                .subnetId(subnetId)
                .hostname("host" + randomId)
                .licenseModel(LaunchDbSystemDetails.LicenseModel.LicenseIncluded)
                .sshPublicKeys(
                        Arrays.asList(
                                "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDokoG4lDsCN/E9F7KsaVZmYYKZMdljJwxjwsoyFdTTQop0TH0lMSDiZeZ3w/8wsZ5esR5uiW/WS5RMBxrfy1/z12qHbOP8vTLCZ19X33UDS8yhEarDldmBbeQ5penrjHM54+lLBTKolGfXvszbUP8ohsN/If7nfn2caUNRiE9Ep9T+xIr/ElmSyq9qrBbUdg0ltz3yIbkmv7SwgxW+NZSD2mhmfYJJDWq5QpJqc3lcNSCU/0f1mQGm754qI7wJKGEhSEOJkBvS7YrfDRINtNABaKGIDUCijwp+dl7btRaxBDwiF/+zHrX43ZEypVcbgVnOcxtz3E/CgxRHZ1plfEpd dhshshah@dhshshah-Mac"))
                .build();
    }

    private static CreateDbHomeDetails createDbHomeRequest() {
        return CreateDbHomeDetails.builder()
                .database(createDatabaseRequest())
                .dbVersion("12.2.0.1")
                .displayName("dbh" + randomId)
                .build();
    }

    private static CreateDatabaseDetails createDatabaseRequest() {
        return CreateDatabaseDetails.builder()
                .adminPassword(DATABASE_ADMIN_PASSWORD)
                .dbName("db" + randomId)
                .build();
    }

    private static void terminateDbSystems(String firstDbSystemId, String secondDbSystemId)
            throws Exception {
        DataGuardAssociationSummary dataGuardAssociation =
                getDataGuardAssociationByDbSystem(firstDbSystemId);
        // Always delete Primary after Standby
        if (null != dataGuardAssociation
                && DataGuardAssociationSummary.Role.Primary.equals(
                        dataGuardAssociation.getRole())) {
            System.out.println("Terminating StandBy DB System " + secondDbSystemId);
            terminateDBSystem(secondDbSystemId);
            System.out.println("Terminating Primary DB System " + firstDbSystemId);
            terminateDBSystem(firstDbSystemId);
        } else {
            System.out.println("Terminating StandBy DB System " + firstDbSystemId);
            terminateDBSystem(firstDbSystemId);
            System.out.println("Terminating Primary DB System " + secondDbSystemId);
            terminateDBSystem(secondDbSystemId);
        }
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

    private static GetDataGuardAssociationResponse waitAndGetDataGuardAssociationResponse(
            DatabaseWaiters waiter, String databaseId, DataGuardAssociation dataGuardAssociation)
            throws Exception {
        return waiter.forDataGuardAssociation(
                        GetDataGuardAssociationRequest.builder()
                                .dataGuardAssociationId(dataGuardAssociation.getId())
                                .databaseId(databaseId)
                                .build(),
                        DataGuardAssociation.LifecycleState.Available,
                        new MaxTimeTerminationStrategy(minutesToMillis(MAX_WAIT_IN_MINS)),
                        new ExponentialBackoffDelayStrategy(
                                minutesToMillis(DELAY_INTERVAL_IN_MINS)))
                .execute();
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

    private static DataGuardAssociationSummary getDataGuardAssociationByDbSystem(
            String dbSystemId) {
        if (StringUtils.isEmpty(dbSystemId)) return null;

        DbHomeSummary dbHome = getDbHome(dbSystemId);
        if (null != dbHome) {
            DatabaseSummary database = getDatabase(dbHome.getId());
            if (null != database) {
                return getDataGuardAssociationByDatabase(database.getId());
            }
        }
        return null;
    }

    private static DataGuardAssociationSummary getDataGuardAssociationByDatabase(
            String databaseId) {
        if (StringUtils.isEmpty(databaseId)) return null;

        ListDataGuardAssociationsRequest listDataGuardAssociationsRequest =
                ListDataGuardAssociationsRequest.builder().databaseId(databaseId).build();
        List<DataGuardAssociationSummary> dataGuardAssociationList =
                databaseClient
                        .listDataGuardAssociations(listDataGuardAssociationsRequest)
                        .getItems();
        return (null != dataGuardAssociationList && !dataGuardAssociationList.isEmpty())
                ? dataGuardAssociationList.get(0)
                : null;
    }

    private static long minutesToMillis(long minutes) {
        return minutes * 60 * 1000L;
    }
}
