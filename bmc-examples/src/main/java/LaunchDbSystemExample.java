/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.VirtualNetwork;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.CreateSubnetDetails;
import com.oracle.bmc.core.model.CreateVcnDetails;
import com.oracle.bmc.core.model.Subnet;
import com.oracle.bmc.core.model.Vcn;
import com.oracle.bmc.core.requests.CreateSubnetRequest;
import com.oracle.bmc.core.requests.CreateVcnRequest;
import com.oracle.bmc.core.requests.DeleteSubnetRequest;
import com.oracle.bmc.core.requests.DeleteVcnRequest;
import com.oracle.bmc.core.requests.GetSubnetRequest;
import com.oracle.bmc.core.requests.GetVcnRequest;
import com.oracle.bmc.core.responses.CreateSubnetResponse;
import com.oracle.bmc.core.responses.CreateVcnResponse;
import com.oracle.bmc.database.DatabaseClient;
import com.oracle.bmc.database.model.CreateDatabaseDetails;
import com.oracle.bmc.database.model.CreateDbHomeDetails;
import com.oracle.bmc.database.model.Database;
import com.oracle.bmc.database.model.DatabaseSummary;
import com.oracle.bmc.database.model.DbHome;
import com.oracle.bmc.database.model.DbHomeSummary;
import com.oracle.bmc.database.model.DbSystem;
import com.oracle.bmc.database.model.DbSystemShapeSummary;
import com.oracle.bmc.database.model.DbVersionSummary;
import com.oracle.bmc.database.model.LaunchDbSystemDetails;
import com.oracle.bmc.database.requests.GetDatabaseRequest;
import com.oracle.bmc.database.requests.GetDbHomeRequest;
import com.oracle.bmc.database.requests.GetDbSystemRequest;
import com.oracle.bmc.database.requests.LaunchDbSystemRequest;
import com.oracle.bmc.database.requests.ListDatabasesRequest;
import com.oracle.bmc.database.requests.ListDbHomesRequest;
import com.oracle.bmc.database.requests.ListDbSystemShapesRequest;
import com.oracle.bmc.database.requests.ListDbVersionsRequest;
import com.oracle.bmc.database.requests.TerminateDbSystemRequest;
import com.oracle.bmc.database.responses.GetDbSystemResponse;
import com.oracle.bmc.database.responses.LaunchDbSystemResponse;
import com.oracle.bmc.waiter.ExponentialBackoffDelayStrategy;
import com.oracle.bmc.waiter.MaxTimeTerminationStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class provides a basic example of how to launch a DB system using the Java SDK. This will cover:
 * <p></p>
 * <ul>
 *   <li>Create a VCN and subnet for the DB system and its related resources</li>
 *   <li>
 *     Launch a DB system containing a single DB home and database. See:
 *       <a href="https://docs.us-phoenix-1.oraclecloud.com/Content/Database/Concepts/overview.htm">overview</a> and
 *       <a href="https://docs.us-phoenix-1.oraclecloud.com/Content/Database/Tasks/launchingDB.htm">managing DB systems</a>
 *       for more information
 *   <li>Demonstrate listing and retrieving information on individual DB systems, DB homes and databases</li>
 *   <li>Demonstrate taking action on nodes</li>
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
public class LaunchDbSystemExample {
    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";
    private static final String DB_VERSION = "12.1.0.2";
    private static final int DB_SYSTEM_CPU_CORE_COUNT = 4;
    private static final LaunchDbSystemDetails.DatabaseEdition DB_SYSTEM_DB_EDITION =
            LaunchDbSystemDetails.DatabaseEdition.EnterpriseEdition;
    private static final String DB_SYSTEM_SHAPE = "BM.DenseIO1.36";

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     * <ul>
     *   <li>The OCID of the compartment which owns the DB system</li>
     *   <li>The availability domain where the DB system will be launched</li>
     *   <li>The CIDR block for the VCN and subnet (these will use the same CIDR)</li>
     *   <li>Admin password for the DB system</li>
     * </ul>
     */
    public static void main(String[] args) throws Exception {
        if (args.length != 4) {
            throw new IllegalAccessException(
                    "This example expects four arguments: a compartment OCID, availability domain, CIDR block for the VCN and admin password.");
        }
        final String compartmentId = args[0];
        final String availabilityDomain = args[1];
        final String cidrBlock = args[2];
        final String adminPassword = args[3];
        // Sample of sshPublicKey format is provided in the value for sshPublicKey
        String sshPublicKey =
                "ssh-rsa AAAAB3NzaC1y...key shortened for example...fdK/ABqxgH7sy3AWgBjfj some description";

        final ConfigFileReader.ConfigFile configFile =
                ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);
        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);
        final DatabaseClient databaseClient = new DatabaseClient(provider);
        final VirtualNetworkClient virtualNetworkClient = new VirtualNetworkClient(provider);

        databaseClient.setRegion(Region.US_PHOENIX_1);
        virtualNetworkClient.setRegion(Region.US_PHOENIX_1);

        Vcn vcn = null;
        Subnet subnet = null;

        listDbSystemShapes(databaseClient, compartmentId, availabilityDomain);
        listDbVersions(databaseClient, compartmentId);

        try {
            vcn = createVcn(virtualNetworkClient, compartmentId, cidrBlock);
            subnet = createSubnet(virtualNetworkClient, vcn, availabilityDomain);

            final List<String> sshPublicKeys = Arrays.asList(sshPublicKey);

            LaunchDbSystemDetails launchDbSystemDetails =
                    LaunchDbSystemDetails.builder()
                            .availabilityDomain(availabilityDomain)
                            .compartmentId(compartmentId)
                            .cpuCoreCount(DB_SYSTEM_CPU_CORE_COUNT)
                            .databaseEdition(DB_SYSTEM_DB_EDITION)
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
                            .displayName("testdb")
                            .hostname("javasdk-example-db-host")
                            .shape(DB_SYSTEM_SHAPE)
                            .sshPublicKeys(sshPublicKeys)
                            .subnetId(subnet.getId())
                            .build();

            LaunchDbSystemResponse launchDbSystemResponse =
                    databaseClient.launchDbSystem(
                            LaunchDbSystemRequest.builder()
                                    .launchDbSystemDetails(launchDbSystemDetails)
                                    .build());
            System.out.println("Launched DB System");
            System.out.println("===========================");
            System.out.println(launchDbSystemResponse.getDbSystem().toString());
            System.out.println();

            /*
               We can wait until the DB system is available. A DB system can take some time to launch (e.g. on the order
               of magnitude of hours) so we can change the ExponentialBackoffDelayStrategy and MaxTimeTerminationStrategy
               to account for this.

               The defaults of checking every 30 seconds and waiting for a maximum of 1200 seconds (20 minutes)
               may not be sufficient.

               In the below example, we check every 900 seconds (15 minutes) and wait a max of 21600 seconds (6 hours)
            */

            GetDbSystemResponse getDbSystemResponse =
                    databaseClient
                            .getWaiters()
                            .forDbSystem(
                                    GetDbSystemRequest.builder()
                                            .dbSystemId(
                                                    launchDbSystemResponse.getDbSystem().getId())
                                            .build(),
                                    DbSystem.LifecycleState.Available,
                                    new MaxTimeTerminationStrategy(21600L * 1000),
                                    new ExponentialBackoffDelayStrategy(900L * 1000))
                            .execute();

            System.out.println("DB System Available");
            System.out.println("===========================");
            System.out.println(getDbSystemResponse.getDbSystem().toString());
            System.out.println();

            listDbHomeAndDatabaseUnderDbSystems(
                    databaseClient, compartmentId, getDbSystemResponse.getDbSystem());

            /*
               Once we're done with the DB system, we can terminate it and wait for it to be terminated.

               In this basic scenario where we have a single DB system, DB home and database, terminating the DB system
               will also delete the DB home and database.

               Note: Please comment out the code below if you would like to keep the launched DB system.
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

            System.out.println("Terminated DB system");
        } finally {
            if (subnet != null) {
                deleteSubnet(virtualNetworkClient, subnet);
            }

            if (vcn != null) {
                deleteVcn(virtualNetworkClient, vcn);
            }
        }
    }

    private static Vcn createVcn(
            VirtualNetwork virtualNetwork, String compartmentId, String cidrBlock)
            throws Exception {
        final String vcnName = "JavaSdkExampleVcn";
        CreateVcnResponse response =
                virtualNetwork.createVcn(
                        CreateVcnRequest.builder()
                                .createVcnDetails(
                                        CreateVcnDetails.builder()
                                                .cidrBlock(cidrBlock)
                                                .compartmentId(compartmentId)
                                                .displayName(vcnName)
                                                .dnsLabel("javasdkex")
                                                .build())
                                .build());

        virtualNetwork
                .getWaiters()
                .forVcn(
                        GetVcnRequest.builder().vcnId(response.getVcn().getId()).build(),
                        Vcn.LifecycleState.Available)
                .execute();
        System.out.println("Created VCN: " + response.getVcn().getId());

        return response.getVcn();
    }

    private static void deleteVcn(VirtualNetwork virtualNetwork, Vcn vcn) throws Exception {
        virtualNetwork.deleteVcn(DeleteVcnRequest.builder().vcnId(vcn.getId()).build());
        virtualNetwork
                .getWaiters()
                .forVcn(
                        GetVcnRequest.builder().vcnId(vcn.getId()).build(),
                        Vcn.LifecycleState.Terminated)
                .execute();
        System.out.println("Deleted VCN: " + vcn.getId());
    }

    private static Subnet createSubnet(
            VirtualNetwork virtualNetwork, Vcn vcn, String availabilityDomain) throws Exception {
        final String subnetName = "JavaSdkExampleSubnet1";
        CreateSubnetResponse response =
                virtualNetwork.createSubnet(
                        CreateSubnetRequest.builder()
                                .createSubnetDetails(
                                        CreateSubnetDetails.builder()
                                                .compartmentId(vcn.getCompartmentId())
                                                .availabilityDomain(availabilityDomain)
                                                .displayName(subnetName)
                                                .vcnId(vcn.getId())
                                                .cidrBlock(vcn.getCidrBlock())
                                                .dnsLabel("javasdksubex")
                                                .build())
                                .build());

        virtualNetwork
                .getWaiters()
                .forSubnet(
                        GetSubnetRequest.builder().subnetId(response.getSubnet().getId()).build(),
                        Subnet.LifecycleState.Available)
                .execute();
        System.out.println("Created Subnet: " + response.getSubnet().getId());
        return response.getSubnet();
    }

    private static void deleteSubnet(VirtualNetwork virtualNetwork, Subnet subnet)
            throws Exception {
        virtualNetwork.deleteSubnet(DeleteSubnetRequest.builder().subnetId(subnet.getId()).build());
        virtualNetwork
                .getWaiters()
                .forSubnet(
                        GetSubnetRequest.builder().subnetId(subnet.getId()).build(),
                        Subnet.LifecycleState.Terminated)
                .execute();
        System.out.println("Deleted Subnet: " + subnet.getId());
    }

    private static void listDbSystemShapes(
            DatabaseClient databaseClient, String compartmentId, String availabilityDomain) {
        /*
         We can list the different database shapes available to us. This is a paginated operation so we can use the functions
         in getPaginators() to get all the results without having to manually deal with page tokens
        */
        System.out.println("DB System Shapes");
        System.out.println("===========================");
        for (DbSystemShapeSummary dbSystemShape :
                databaseClient
                        .getPaginators()
                        .listDbSystemShapesRecordIterator(
                                ListDbSystemShapesRequest.builder()
                                        .compartmentId(compartmentId)
                                        .availabilityDomain(availabilityDomain)
                                        .build())) {
            System.out.println(dbSystemShape.getShape().toString());
        }
        System.out.println();
    }

    private static void listDbVersions(DatabaseClient databaseClient, String compartmentId) {
        /*
         We can list DB versions. This is a paginated operation so we can use the functions in getPaginators() to get
         all the results without having to manually deal with page tokens
        */
        System.out.println("DB Versions");
        System.out.println("===========================");
        for (DbVersionSummary dbVersion :
                databaseClient
                        .getPaginators()
                        .listDbVersionsRecordIterator(
                                ListDbVersionsRequest.builder()
                                        .compartmentId(compartmentId)
                                        .build())) {
            System.out.println(dbVersion.toString());
        }
        System.out.println();

        /*
         We can do some additional filtering so that only versions compatible with a given shape are returned. Note
         the usage of the dbSystemShape parameter
        */
        System.out.println("DB Versions by shape: " + DB_SYSTEM_SHAPE);
        System.out.println("===========================");
        for (DbVersionSummary dbVersion :
                databaseClient
                        .getPaginators()
                        .listDbVersionsRecordIterator(
                                ListDbVersionsRequest.builder()
                                        .compartmentId(compartmentId)
                                        .dbSystemShape(DB_SYSTEM_SHAPE)
                                        .build())) {
            System.out.println(dbVersion.toString());
        }
        System.out.println();
    }

    private static void listDbHomeAndDatabaseUnderDbSystems(
            DatabaseClient databaseClient, String compartmentId, DbSystem dbSystem) {
        /*
         A DB System contains DB Homes and the DB Homes contain databases. First, let's find the DB homes for the
         DB system by listing them. Listing is a paginated operation so we can use the functions in getPaginators()
         here
        */
        System.out.println("DB Homes For DB System");
        System.out.println("===========================");
        List<DbHomeSummary> dbHomeSummaries = new ArrayList<>();
        for (DbHomeSummary dbHome :
                databaseClient
                        .getPaginators()
                        .listDbHomesRecordIterator(
                                ListDbHomesRequest.builder()
                                        .compartmentId(compartmentId)
                                        .dbSystemId(dbSystem.getId())
                                        .build())) {
            dbHomeSummaries.add(dbHome);
            System.out.println(dbHome.toString());
        }
        System.out.println();

        /*
         The results returned in the list operation are DatabaseSummary objects. We can also call getDatabase to fetch
          the full information about the DB home
        */
        System.out.println("Get DB Home");
        System.out.println("===========================");
        DbHomeSummary dbHomeSummary = dbHomeSummaries.get(0);
        DbHome dbHome =
                databaseClient
                        .getDbHome(
                                GetDbHomeRequest.builder().dbHomeId(dbHomeSummary.getId()).build())
                        .getDbHome();
        System.out.println(dbHome);
        System.out.println();

        /*
         DB Homes contain databases. We can find the databases in a DB home by listing them. This is a paginated
         operation so we can use the getPaginators().listDatabasesRecordIterator() function here
        */
        System.out.println("Databases for DB Home");
        System.out.println("===========================");
        List<DatabaseSummary> dbSummaries = new ArrayList<>();
        for (DatabaseSummary dbSummary :
                databaseClient
                        .getPaginators()
                        .listDatabasesRecordIterator(
                                ListDatabasesRequest.builder()
                                        .compartmentId(compartmentId)
                                        .dbHomeId(dbHomeSummary.getId())
                                        .build())) {
            dbSummaries.add(dbSummary);
            System.out.println(dbSummary);
        }
        System.out.println();

        /*
         The results returned in the list operation are DatabaseSummary objects. We can also call getDatabase to fetch
         the full information about the DB home
        */
        DatabaseSummary databaseSummary = dbSummaries.get(0);
        Database database =
                databaseClient
                        .getDatabase(
                                GetDatabaseRequest.builder()
                                        .databaseId(databaseSummary.getId())
                                        .build())
                        .getDatabase();
        System.out.println("Get Database");
        System.out.println("===========================\"");
        System.out.println(database);
        System.out.println();
    }
}
