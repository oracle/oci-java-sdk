/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package exacc;

import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.database.DatabaseClient;
import com.oracle.bmc.database.model.ActivateExadataInfrastructureDetails;
import com.oracle.bmc.database.model.CreateExadataInfrastructureDetails;
import com.oracle.bmc.database.model.CreateVmClusterDetails;
import com.oracle.bmc.database.model.ExadataInfrastructure;
import com.oracle.bmc.database.model.ExadataInfrastructureSummary;
import com.oracle.bmc.database.model.GenerateRecommendedNetworkDetails;
import com.oracle.bmc.database.model.InfoForNetworkGenDetails;
import com.oracle.bmc.database.model.UpdateExadataInfrastructureDetails;
import com.oracle.bmc.database.model.UpdateVmClusterDetails;
import com.oracle.bmc.database.model.UpdateVmClusterNetworkDetails;
import com.oracle.bmc.database.model.VmCluster;
import com.oracle.bmc.database.model.VmClusterNetwork;
import com.oracle.bmc.database.model.VmClusterNetworkDetails;
import com.oracle.bmc.database.requests.ActivateExadataInfrastructureRequest;
import com.oracle.bmc.database.requests.CreateExadataInfrastructureRequest;
import com.oracle.bmc.database.requests.CreateVmClusterNetworkRequest;
import com.oracle.bmc.database.requests.CreateVmClusterRequest;
import com.oracle.bmc.database.requests.DeleteExadataInfrastructureRequest;
import com.oracle.bmc.database.requests.DeleteVmClusterNetworkRequest;
import com.oracle.bmc.database.requests.DeleteVmClusterRequest;
import com.oracle.bmc.database.requests.GenerateRecommendedVmClusterNetworkRequest;
import com.oracle.bmc.database.requests.GetExadataInfrastructureRequest;
import com.oracle.bmc.database.requests.GetVmClusterNetworkRequest;
import com.oracle.bmc.database.requests.GetVmClusterRequest;
import com.oracle.bmc.database.requests.ListExadataInfrastructuresRequest;
import com.oracle.bmc.database.requests.UpdateExadataInfrastructureRequest;
import com.oracle.bmc.database.requests.UpdateVmClusterNetworkRequest;
import com.oracle.bmc.database.requests.UpdateVmClusterRequest;
import com.oracle.bmc.database.requests.ValidateVmClusterNetworkRequest;
import com.oracle.bmc.database.responses.CreateExadataInfrastructureResponse;
import com.oracle.bmc.database.responses.CreateVmClusterNetworkResponse;
import com.oracle.bmc.database.responses.CreateVmClusterResponse;
import com.oracle.bmc.database.responses.ListExadataInfrastructuresResponse;
import com.oracle.bmc.database.responses.UpdateVmClusterNetworkResponse;
import com.oracle.bmc.database.responses.UpdateVmClusterResponse;
import com.oracle.bmc.waiter.ExponentialBackoffDelayStrategy;
import com.oracle.bmc.waiter.MaxTimeTerminationStrategy;
import com.oracle.bmc.util.StreamUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class provides a basic example of CRUD(Create, read, update, delete) operations on Exadata Cloud at Customer (ExaCC) Resources: Exadata Infrastructure, VmClusterNetwork and VmCluster using the Java SDK.
 *  * <p></p>
 *  * Resources created by this class will be removed when this example is done.
 *  * <p></p>
 *  * This class also makes assumptions on the following parameters:
 *  * <p></p>
 *  * <ul>
 *  *   <li>OCID of the compartment</li>
 *  *   <li>Activation Key File path or activating Exadata Infrastructure<</li>
 *  *   <li>SSH Public key for Vm Cluster<</li>
 *  * </ul>
 */
public class ExadataCloudAtCustomerResourcesExample {
    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";
    private static final String shape = "Exadata.Quarter3.100";

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     *             <ul>
     *             <li>The OCID of the compartment</li>
     *             <li>Activation Key File path for activating Exadata Infrastructure</li>
     *             </ul>
     */
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            throw new IllegalAccessException(
                    "This example expects two arguments: "
                            + "a compartment OCID,  Activation Key file path and SSH Public key for Vm Cluster");
        }

        final String compartmentId = args[0];
        final String activationFilePath = args[1];
        final String sshPublicKey = args[2];

        final ConfigFileReader.ConfigFile configFile =
                ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);
        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);
        final DatabaseClient databaseClient = new DatabaseClient(provider);
        final String exadataInfrastructureId =
                createExadataInfrastructure(databaseClient, compartmentId);

        // Get
        waitForExadataInfrastructure(
                databaseClient,
                exadataInfrastructureId,
                ExadataInfrastructure.LifecycleState.RequiresActivation);

        System.out.println(
                "ExaCC Infrastructure is in REQUIRES_ACTIVATION state " + exadataInfrastructureId);
        System.out.println("===========================");

        // Update
        UpdateExadataInfrastructureDetails updateExadataInfrastructureDetails =
                UpdateExadataInfrastructureDetails.builder().netmask("255.255.240.1").build();

        UpdateExadataInfrastructureRequest updateExadataInfrastructureRequest =
                UpdateExadataInfrastructureRequest.builder()
                        .exadataInfrastructureId(exadataInfrastructureId)
                        .updateExadataInfrastructureDetails(updateExadataInfrastructureDetails)
                        .build();

        databaseClient.updateExadataInfrastructure(updateExadataInfrastructureRequest);

        waitForExadataInfrastructure(
                databaseClient,
                exadataInfrastructureId,
                ExadataInfrastructure.LifecycleState.RequiresActivation);

        // List
        ListExadataInfrastructuresResponse listExadataInfrastructures =
                databaseClient.listExadataInfrastructures(
                        ListExadataInfrastructuresRequest.builder()
                                .compartmentId(compartmentId)
                                .build());
        System.out.println("List of Exadata Infrastructures: ");

        for (ExadataInfrastructureSummary exadataInfrastructureSummary :
                listExadataInfrastructures.getItems()) {
            System.out.println(
                    "Exadata Infrastructure : "
                            + exadataInfrastructureSummary.getId()
                            + " is in "
                            + exadataInfrastructureSummary.getLifecycleState()
                            + " state.");
        }

        activateExadataInfrastructure(databaseClient, exadataInfrastructureId, activationFilePath);

        final String vmClusterNetworkId =
                createVmClusterNetwork(databaseClient, compartmentId, exadataInfrastructureId);

        System.out.println("VM cluster Network OCID : " + vmClusterNetworkId);

        waitForVmClusterNetwork(
                databaseClient,
                exadataInfrastructureId,
                vmClusterNetworkId,
                VmClusterNetwork.LifecycleState.RequiresValidation);

        System.out.println("VM Cluster Network is in REQUIRES_VALIDATION state ");
        System.out.println("===========================");

        final String new_dns = "10.89.138.33";
        List<String> dns = new ArrayList<>();
        dns.add(new_dns);

        UpdateVmClusterNetworkDetails updateVmClusterNetworkDetails =
                UpdateVmClusterNetworkDetails.builder().dns(dns).build();

        UpdateVmClusterNetworkResponse updateVmClusterNetworkResponse =
                databaseClient.updateVmClusterNetwork(
                        UpdateVmClusterNetworkRequest.builder()
                                .vmClusterNetworkId(vmClusterNetworkId)
                                .exadataInfrastructureId(exadataInfrastructureId)
                                .updateVmClusterNetworkDetails(updateVmClusterNetworkDetails)
                                .build());

        waitForVmClusterNetwork(
                databaseClient,
                exadataInfrastructureId,
                vmClusterNetworkId,
                VmClusterNetwork.LifecycleState.RequiresValidation);

        System.out.println(
                "state after update: "
                        + updateVmClusterNetworkResponse.getVmClusterNetwork().getLifecycleState());

        System.out.println(
                "DNS after update: "
                        + updateVmClusterNetworkResponse.getVmClusterNetwork().getDns());

        ValidateVmClusterNetworkRequest validateVmClusterNetworkRequest =
                ValidateVmClusterNetworkRequest.builder()
                        .vmClusterNetworkId(vmClusterNetworkId)
                        .exadataInfrastructureId(exadataInfrastructureId)
                        .build();

        databaseClient.validateVmClusterNetwork(validateVmClusterNetworkRequest);

        waitForVmClusterNetwork(
                databaseClient,
                exadataInfrastructureId,
                vmClusterNetworkId,
                VmClusterNetwork.LifecycleState.Validated);

        final String vmClusterId =
                createVmCluster(
                        databaseClient,
                        compartmentId,
                        exadataInfrastructureId,
                        vmClusterNetworkId,
                        sshPublicKey);

        System.out.println("VM cluster OCID : " + vmClusterId);
        waitForVmCluster(databaseClient, vmClusterId, VmCluster.LifecycleState.Available);

        UpdateVmClusterDetails updateVmClusterDetails =
                UpdateVmClusterDetails.builder()
                        .licenseModel(UpdateVmClusterDetails.LicenseModel.LicenseIncluded)
                        .build();
        UpdateVmClusterResponse updateVmClusterResponse =
                databaseClient.updateVmCluster(
                        UpdateVmClusterRequest.builder()
                                .updateVmClusterDetails(updateVmClusterDetails)
                                .vmClusterId(vmClusterId)
                                .build());
        waitForVmCluster(databaseClient, vmClusterId, VmCluster.LifecycleState.Available);

        System.out.println(
                "new license model for vm cluster: "
                        + updateVmClusterResponse.getVmCluster().getLicenseModel());

        deleteVmCluster(databaseClient, vmClusterId);
        deleteVmClusterNetwork(databaseClient, vmClusterNetworkId, exadataInfrastructureId);
        deleteExadataInfrastructure(databaseClient, exadataInfrastructureId);
    }

    private static String createExadataInfrastructure(
            DatabaseClient databaseClient, String compartmentId) {

        final String dns_server = "10.89.138.33";
        final String ntp_server = "10.89.138.33";
        final String adminNetworkCIDR = "10.31.16.0/20";
        final String cloudControlPlaneServer1 = "10.31.153.83";
        final String cloudControlPlaneServer2 = "10.31.153.84";
        final String corporateProxy = "fake-proxy.us.oracle.com";
        final String displayName = "ExaCC_Infra";
        final String gateway = "10.31.16.1";
        final String infiniBandNetworkCIDR = "192.168.31.0/24";
        final String netmask = "255.255.240.0";
        final String timeZone = "UTC";

        List<String> dnsServer = new ArrayList();
        dnsServer.add(dns_server);

        List<String> ntpServer = new ArrayList();
        ntpServer.add(ntp_server);

        CreateExadataInfrastructureDetails createExadataInfrastructureDetails =
                CreateExadataInfrastructureDetails.builder()
                        .adminNetworkCIDR(adminNetworkCIDR)
                        .cloudControlPlaneServer1(cloudControlPlaneServer1)
                        .cloudControlPlaneServer2(cloudControlPlaneServer2)
                        .compartmentId(compartmentId)
                        .corporateProxy(corporateProxy)
                        .displayName(displayName)
                        .dnsServer(dnsServer)
                        .gateway(gateway)
                        .infiniBandNetworkCIDR(infiniBandNetworkCIDR)
                        .netmask(netmask)
                        .ntpServer(ntpServer)
                        .shape(shape)
                        .timeZone(timeZone)
                        .build();

        CreateExadataInfrastructureResponse createExadataInfrastructureResponse =
                databaseClient.createExadataInfrastructure(
                        CreateExadataInfrastructureRequest.builder()
                                .createExadataInfrastructureDetails(
                                        createExadataInfrastructureDetails)
                                .build());

        System.out.println("Created Exadata Infrastructre.");
        return createExadataInfrastructureResponse.getExadataInfrastructure().getId();
    }

    private static String createVmClusterNetwork(
            DatabaseClient databaseClient, String compartmentId, String exadataInfrastructureId) {

        CreateVmClusterNetworkRequest createVmClusterNetworkRequest =
                CreateVmClusterNetworkRequest.builder()
                        .exadataInfrastructureId(exadataInfrastructureId)
                        .vmClusterNetworkDetails(
                                generateRecommendedVmClusterNetwork(databaseClient, compartmentId))
                        .build();

        CreateVmClusterNetworkResponse createVmClusterNetworkResponse =
                databaseClient.createVmClusterNetwork(createVmClusterNetworkRequest);

        System.out.println("Created Vm Cluster Network");
        return createVmClusterNetworkResponse.getVmClusterNetwork().getId();
    }

    private static String createVmCluster(
            DatabaseClient databaseClient,
            String compartmentId,
            String exadataInfrastructureId,
            String vmClusterNetworkId,
            String sshPublicKey) {

        final int cpuCoreCount = 22;
        final String giVersion = "18.0.0.0";
        final String displayName = "vmcluster";

        CreateVmClusterDetails createVmClusterDetails =
                CreateVmClusterDetails.builder()
                        .compartmentId(compartmentId)
                        .cpuCoreCount(cpuCoreCount)
                        .displayName(displayName)
                        .exadataInfrastructureId(exadataInfrastructureId)
                        .giVersion(giVersion)
                        .licenseModel(CreateVmClusterDetails.LicenseModel.BringYourOwnLicense)
                        .sshPublicKeys(Arrays.asList(sshPublicKey))
                        .vmClusterNetworkId(vmClusterNetworkId)
                        .build();

        CreateVmClusterRequest createVmClusterRequest =
                CreateVmClusterRequest.builder()
                        .createVmClusterDetails(createVmClusterDetails)
                        .build();

        CreateVmClusterResponse createVmClusterResponse =
                databaseClient.createVmCluster(createVmClusterRequest);
        return createVmClusterResponse.getVmCluster().getId();
    }

    //Once we're done with the ExaCC Infrastructure, we can terminate it and wait for it to be terminated.
    private static void deleteExadataInfrastructure(DatabaseClient databaseClient, String ocid)
            throws Exception {
        databaseClient.deleteExadataInfrastructure(
                DeleteExadataInfrastructureRequest.builder().exadataInfrastructureId(ocid).build());
        waitForExadataInfrastructure(
                databaseClient, ocid, ExadataInfrastructure.LifecycleState.Deleted);
        System.out.println("Terminated ExaCC Infrastructure");
    }

    //Once we're done with the Vm Cluster Network , we can terminate it and wait for it to be terminated.
    private static void deleteVmClusterNetwork(
            DatabaseClient databaseClient,
            String vmClusterNetworkOcid,
            String exadataInfrastructureOcid)
            throws Exception {
        databaseClient.deleteVmClusterNetwork(
                DeleteVmClusterNetworkRequest.builder()
                        .vmClusterNetworkId(vmClusterNetworkOcid)
                        .exadataInfrastructureId(exadataInfrastructureOcid)
                        .build());
        waitForVmClusterNetwork(
                databaseClient,
                exadataInfrastructureOcid,
                vmClusterNetworkOcid,
                VmClusterNetwork.LifecycleState.Terminated);
        System.out.println("Terminated VM Cluster Network");
    }

    //Once we're done with the Vm Cluster, we can terminate it and wait for it to be terminated.
    private static void deleteVmCluster(DatabaseClient databaseClient, String ocid)
            throws Exception {

        databaseClient.deleteVmCluster(DeleteVmClusterRequest.builder().vmClusterId(ocid).build());
        waitForVmCluster(databaseClient, ocid, VmCluster.LifecycleState.Terminated);
        System.out.println("Terminated VM Cluster");
    }

    private static void waitForExadataInfrastructure(
            DatabaseClient databaseClient,
            String ocid,
            ExadataInfrastructure.LifecycleState targetState)
            throws Exception {
        databaseClient
                .getWaiters()
                .forExadataInfrastructure(
                        GetExadataInfrastructureRequest.builder()
                                .exadataInfrastructureId(ocid)
                                .build(),
                        targetState,
                        new MaxTimeTerminationStrategy(21600L * 1000),
                        new ExponentialBackoffDelayStrategy(900L * 1000))
                .execute();
    }

    private static void waitForVmClusterNetwork(
            DatabaseClient databaseClient,
            String exadataInfrastructureId,
            String vmClusterNetworkId,
            VmClusterNetwork.LifecycleState targetState)
            throws Exception {

        databaseClient
                .getWaiters()
                .forVmClusterNetwork(
                        GetVmClusterNetworkRequest.builder()
                                .exadataInfrastructureId(exadataInfrastructureId)
                                .vmClusterNetworkId(vmClusterNetworkId)
                                .build(),
                        targetState,
                        new MaxTimeTerminationStrategy(21600L * 1000),
                        new ExponentialBackoffDelayStrategy(900L * 1000))
                .execute();
    }

    private static void waitForVmCluster(
            DatabaseClient databaseClient, String ocid, VmCluster.LifecycleState targetState)
            throws Exception {
        databaseClient
                .getWaiters()
                .forVmCluster(
                        GetVmClusterRequest.builder().vmClusterId(ocid).build(),
                        targetState,
                        new MaxTimeTerminationStrategy(21600L * 1000),
                        new ExponentialBackoffDelayStrategy(900L * 1000))
                .execute();
    }

    private static void activateExadataInfrastructure(
            DatabaseClient databaseClient,
            String exadataInfrastructureId,
            String ACTIVATION_KEY_FILE)
            throws Exception {

        File file = new File(ACTIVATION_KEY_FILE);

        byte[] bArray = new byte[1024];
        try {
            bArray = StreamUtils.toByteArray(new FileInputStream(file));
        } catch (Exception e) {
            System.out.println("Failed to read file " + ACTIVATION_KEY_FILE);
            e.printStackTrace();
        }

        ActivateExadataInfrastructureDetails activateExadataInfrastructureDetails =
                ActivateExadataInfrastructureDetails.builder().activationFile(bArray).build();

        ActivateExadataInfrastructureRequest activateExadataInfrastructureRequest =
                ActivateExadataInfrastructureRequest.builder()
                        .activateExadataInfrastructureDetails(activateExadataInfrastructureDetails)
                        .exadataInfrastructureId(exadataInfrastructureId)
                        .build();

        databaseClient.activateExadataInfrastructure(activateExadataInfrastructureRequest);

        waitForExadataInfrastructure(
                databaseClient,
                exadataInfrastructureId,
                ExadataInfrastructure.LifecycleState.Active);
    }

    private static VmClusterNetworkDetails generateRecommendedVmClusterNetwork(
            DatabaseClient databaseClient, String compartmentId) {
        final String cidr = "192.168.10.0/16";
        final String domain = "oracleclient.com";
        final String gateway = "192.168.10.1";
        final String netmask = "255.255.0.0";
        final String prefix = "exacc";
        final String vlanId = "223";
        final String cidr2 = "172.168.10.0/16";
        final String domain2 = "oraclebkp.com";
        final String gateway2 = "192.168.10.5";
        final String netmask2 = "255.255.0.0";
        final String prefix2 = "exacc-bkp";
        final String vlanId2 = "224";

        InfoForNetworkGenDetails networkGenDetails =
                InfoForNetworkGenDetails.builder()
                        .cidr(cidr)
                        .domain(domain)
                        .gateway(gateway)
                        .netmask(netmask)
                        .networkType(InfoForNetworkGenDetails.NetworkType.Client)
                        .prefix(prefix)
                        .vlanId(vlanId)
                        .build();

        InfoForNetworkGenDetails networkGenDetails2 =
                InfoForNetworkGenDetails.builder()
                        .cidr(cidr2)
                        .domain(domain2)
                        .gateway(gateway2)
                        .netmask(netmask2)
                        .networkType(InfoForNetworkGenDetails.NetworkType.Backup)
                        .prefix(prefix2)
                        .vlanId(vlanId2)
                        .build();

        List<InfoForNetworkGenDetails> networks =
                Arrays.asList(networkGenDetails, networkGenDetails2);
        GenerateRecommendedVmClusterNetworkRequest generateRecommendedVmClusterNetworkRequest =
                GenerateRecommendedVmClusterNetworkRequest.builder()
                        .generateRecommendedNetworkDetails(
                                GenerateRecommendedNetworkDetails.builder()
                                        .compartmentId(compartmentId)
                                        .displayName("vmClusterNetwork")
                                        .networks(networks)
                                        .build())
                        .build();
        return databaseClient
                .generateRecommendedVmClusterNetwork(generateRecommendedVmClusterNetworkRequest)
                .getVmClusterNetworkDetails();
    }
}
