/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.containerengine.ContainerEngineClient;
import com.oracle.bmc.containerengine.model.Cluster;
import com.oracle.bmc.containerengine.model.ClusterCreateOptions;
import com.oracle.bmc.containerengine.model.CreateClusterDetails;
import com.oracle.bmc.containerengine.model.UpdateClusterDetails;
import com.oracle.bmc.containerengine.model.WorkRequestResource;
import com.oracle.bmc.containerengine.model.WorkRequestStatus;
import com.oracle.bmc.containerengine.requests.CreateClusterRequest;
import com.oracle.bmc.containerengine.requests.DeleteClusterRequest;
import com.oracle.bmc.containerengine.requests.GetClusterOptionsRequest;
import com.oracle.bmc.containerengine.requests.GetClusterRequest;
import com.oracle.bmc.containerengine.requests.GetWorkRequestRequest;
import com.oracle.bmc.containerengine.requests.UpdateClusterRequest;
import com.oracle.bmc.containerengine.responses.CreateClusterResponse;
import com.oracle.bmc.containerengine.responses.DeleteClusterResponse;
import com.oracle.bmc.containerengine.responses.GetClusterOptionsResponse;
import com.oracle.bmc.containerengine.responses.GetClusterResponse;
import com.oracle.bmc.containerengine.responses.GetWorkRequestResponse;
import com.oracle.bmc.containerengine.responses.UpdateClusterResponse;
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
import com.oracle.bmc.core.responses.GetSubnetResponse;
import com.oracle.bmc.core.responses.GetVcnResponse;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.AvailabilityDomain;
import com.oracle.bmc.identity.requests.ListAvailabilityDomainsRequest;
import com.oracle.bmc.identity.responses.ListAvailabilityDomainsResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides an example of how to create a Container Engine Cluster in the Java SDK.
 * It will create a VCN and two subnets, one Container Engine cluster.
 * These will be deleted at the end. The class also makes some assumptions about
 * the resources it will create:
 *
 * <ul>:
 *   <li>The VCN created by this example will have a display name of java_sdk_oke_example_vcn</li>
 *   <li>The subnet created by this example will have a display name of: java_sdk_oke_example_subnet_1</li>
 *   <li>The subnet created by this example will have a display name of: java_sdk_oke_example_subnet_2</li>
 *   <li>The VCN will have a private IP CIDR block of 10.0.0.0/16</li>
 *   <li>The subnets will have private IP CIDR blocks of 10.0.0.0/24 and 10.0.1.0/24</li>
 *   <li>The cluster created will have hardcoded display names of ContanerEngineClusterExample</li>
 *   <li>The kubernetesVersion is hardcoded to use v1.8.11</li>
 *   <li>
 *      The configuration file used by service clients will be sourced from the default
 *      location (~/.oci/config) and the DEFAULT profile will be used
 *   </li>
 *   <li>Resources will be created in us-phoenix-1</li>
 *   <li>Resources will be created in the first AD returned from the ListAvailabilityDomains call</li>
 * <ul>
 */
public class ContainerEngineClusterExample {
    private static final String VCN_DISPLAY_NAME = "java_sdk_oke_example_vcn";
    private static final String[] SUBNET_DISPLAY_NAMES = {
        "java_sdk_oke_example_subnet_1", "java_sdk_oke_example_subnet_2"
    };
    private static final String CIDR_BLOCK = "10.0.0.0/16";
    private static final String[] SUBNET_CIDR_BLOCKS = {"10.0.0.0/24", "10.0.1.0/24"};

    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    private static final String CLUSTER_DISPLAY_NAME = "ContanerEngineClusterExample";
    private static final String CLUSTER_NEW_DISPLAY_NAME = "ContanerEngineClusterExampleNew";

    private static String clusterId = null;

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     * <ul>
     *   <li>The OCID of the compartment where the Container Engine cluster and associated resources will be created</li>
     * </ul>
     */
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "This example expects an argument of the compartment OCID");
        }

        final String compartmentId = args[0];

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(CONFIG_LOCATION, CONFIG_PROFILE);

        final ContainerEngineClient containerEngineClient = new ContainerEngineClient(provider);
        final VirtualNetworkClient vcnClient = new VirtualNetworkClient(provider);
        final IdentityClient identityClient = new IdentityClient(provider);

        containerEngineClient.setRegion(Region.US_PHOENIX_1);
        vcnClient.setRegion(Region.US_PHOENIX_1);
        identityClient.setRegion(Region.US_PHOENIX_1);

        Vcn vcn = null;
        List<Subnet> subnets = new ArrayList<Subnet>();
        Cluster cluster = null;

        try {
            final List<AvailabilityDomain> availabilityDomains =
                    getAvailabilityDomains(identityClient, compartmentId);
            final AvailabilityDomain adToUse = availabilityDomains.get(0);

            // A VCN and subnets are required to create a Container Engine Cluster
            vcn = createVcn(vcnClient, compartmentId);
            System.out.println("Created VCN");
            System.out.println();

            for (int i = 0; i < 2; i++) {
                Subnet subnet =
                        createSubnet(
                                vcnClient,
                                compartmentId,
                                adToUse,
                                vcn.getId(),
                                SUBNET_DISPLAY_NAMES[i],
                                SUBNET_CIDR_BLOCKS[i]);
                subnets.add(subnet);
                System.out.println("Created subnet" + i);
                System.out.println();
            }

            //Create a Container Engine Cluster
            List<String> subnetIds = new ArrayList<String>();
            for (Subnet subnet : subnets) {
                subnetIds.add(subnet.getId());
            }
            String kubernetesVersion = getKubernetesVersions(containerEngineClient).get(0);
            System.out.println("kubernetes version: " + kubernetesVersion);

            cluster =
                    createCluster(
                            containerEngineClient,
                            vcn.getId(),
                            subnetIds,
                            kubernetesVersion,
                            compartmentId);
            System.out.println("Created cluster");
            System.out.println();

            // Update the Container Engine Cluster
            updateCluster(containerEngineClient, clusterId, CLUSTER_NEW_DISPLAY_NAME);
            System.out.println("Updated cluster");
            System.out.println();

        } finally {
            System.out.println("Clean Up");
            System.out.println("==========");

            if (cluster != null) {
                deleteCluster(containerEngineClient, clusterId);
                System.out.println("Deleted cluster");
            }

            for (int i = 0; i < subnets.size(); i++) {
                if (subnets.get(i) != null) {
                    deleteSubnet(vcnClient, subnets.get(i));
                    System.out.println("Deleted subnet" + i);
                }
            }

            if (vcn != null) {
                deleteVcn(vcnClient, vcn);
                System.out.println("Deleted VCN");
            }

            vcnClient.close();
            identityClient.close();
            containerEngineClient.close();
        }
    }

    /**
     * Creates a VCN and waits for it to become available to use.
     *
     * @param vcnClient the service client to use to create the VCN
     * @param compartmentId the OCID of the compartment where the VCN will be created
     *
     * @return the created VCN
     *
     * @throws Exception if there is an error waiting on the VCN to become available to use
     */
    private static Vcn createVcn(final VirtualNetworkClient vcnClient, final String compartmentId)
            throws Exception {
        final CreateVcnResponse createVcnResponse =
                vcnClient.createVcn(
                        CreateVcnRequest.builder()
                                .createVcnDetails(
                                        CreateVcnDetails.builder()
                                                .cidrBlock(CIDR_BLOCK)
                                                .compartmentId(compartmentId)
                                                .displayName(VCN_DISPLAY_NAME)
                                                .build())
                                .build());

        final GetVcnResponse getVcnResponse =
                vcnClient
                        .getWaiters()
                        .forVcn(
                                GetVcnRequest.builder()
                                        .vcnId(createVcnResponse.getVcn().getId())
                                        .build(),
                                Vcn.LifecycleState.Available)
                        .execute();

        return getVcnResponse.getVcn();
    }

    /**
     * Deletes a VCN and waits for it to be deleted.
     *
     * @param vcnClient the service client to use to delete the VCN
     * @param vcn the VCN to delete
     *
     * @throws Exception if there is an error waiting on the VCN to be deleted
     */
    private static void deleteVcn(final VirtualNetworkClient vcnClient, final Vcn vcn)
            throws Exception {

        vcnClient.deleteVcn(DeleteVcnRequest.builder().vcnId(vcn.getId()).build());

        vcnClient
                .getWaiters()
                .forVcn(
                        GetVcnRequest.builder().vcnId(vcn.getId()).build(),
                        Vcn.LifecycleState.Terminated)
                .execute();
    }

    /**
     * Creates a subnet in a VCN and waits for the subnet to become available to use.
     *
     * @param vcnClient the service client to use to create the subnet
     * @param compartmentId the OCID of the compartment which owns the VCN
     * @param availabilityDomain the availability domain where the subnet will be created
     * @param cidrBlock the cidr block used to create subnet
     * @param vcnId the ID of the VCN which will own the subnet
     * @param subnetName the subnet that will be created
     *
     * @return the created subnet
     *
     * @throws Exception if there is an error waiting on the subnet to become available to use
     */
    private static Subnet createSubnet(
            final VirtualNetworkClient vcnClient,
            final String compartmentId,
            final AvailabilityDomain availabilityDomain,
            final String vcnId,
            final String subnetName,
            final String cidrBlock)
            throws Exception {

        final CreateSubnetResponse createSubnetResponse =
                vcnClient.createSubnet(
                        CreateSubnetRequest.builder()
                                .createSubnetDetails(
                                        CreateSubnetDetails.builder()
                                                .availabilityDomain(availabilityDomain.getName())
                                                .compartmentId(compartmentId)
                                                .displayName(subnetName)
                                                .cidrBlock(cidrBlock)
                                                .vcnId(vcnId)
                                                .build())
                                .build());

        final GetSubnetResponse getSubnetResponse =
                vcnClient
                        .getWaiters()
                        .forSubnet(
                                GetSubnetRequest.builder()
                                        .subnetId(createSubnetResponse.getSubnet().getId())
                                        .build(),
                                Subnet.LifecycleState.Available)
                        .execute();

        return getSubnetResponse.getSubnet();
    }

    /**
     * Deletes a subnet and waits for it to be deleted.
     *
     * @param vcnClient the service client to use to delete the subnet
     * @param subnet the subnet to delete
     *
     * @throws Exception if there is an error waiting on the subnet to be deleted
     */
    private static void deleteSubnet(final VirtualNetworkClient vcnClient, final Subnet subnet)
            throws Exception {

        vcnClient.deleteSubnet(DeleteSubnetRequest.builder().subnetId(subnet.getId()).build());

        vcnClient
                .getWaiters()
                .forSubnet(
                        GetSubnetRequest.builder().subnetId(subnet.getId()).build(),
                        Subnet.LifecycleState.Terminated)
                .execute();
    }

    /**
     * Retrieves a list of availability domains in a compartment.
     *
     * @param identityClient the client to use to retrieve the availability domains
     * @param compartmentId the OCID of the compartment whose availability domains we're listing
     *
     * @return a list of all availability domains in a compartment
     */
    private static List<AvailabilityDomain> getAvailabilityDomains(
            final IdentityClient identityClient, final String compartmentId) {

        ListAvailabilityDomainsResponse listAvailabilityDomainsResponse =
                identityClient.listAvailabilityDomains(
                        ListAvailabilityDomainsRequest.builder()
                                .compartmentId(compartmentId)
                                .build());

        return listAvailabilityDomainsResponse.getItems();
    }

    /**
     * Creates a Cluster and waits for it to become active
     *
     * @param containerEngineClient the containerEngineclient used to create the cluster
     * @param vcnId the ID of the VCN which will own the subnets
     * @param subnetIds list of subnet ids
     * @param kubernetesVersion kubernetesVersion
     * @param compartmentId
     *
     * @return the created cluster
     *
     * @throws Exception if there is an error waiting on the cluster to become available
     */
    private static Cluster createCluster(
            final ContainerEngineClient containerEngineClient,
            final String vcnId,
            final List<String> subnetIds,
            final String kubernetesVersion,
            final String compartmentId)
            throws Exception {

        Cluster cluster = null;

        System.out.println("Creating Cluster");
        System.out.println("================");

        final CreateClusterResponse createdClusterResponse =
                containerEngineClient.createCluster(
                        CreateClusterRequest.builder()
                                .createClusterDetails(
                                        CreateClusterDetails.builder()
                                                .name(CLUSTER_DISPLAY_NAME)
                                                .compartmentId(compartmentId)
                                                .vcnId(vcnId)
                                                .kubernetesVersion(kubernetesVersion)
                                                .options(
                                                        ClusterCreateOptions.builder()
                                                                .serviceLbSubnetIds(subnetIds)
                                                                .build())
                                                .build())
                                .build());

        final String workRequestId = createdClusterResponse.getOpcWorkRequestId();
        System.out.println("cluster work request ID is: " + workRequestId);
        System.out.println();

        GetWorkRequestResponse workRequestResponse =
                waitForWorkRequestFinished(containerEngineClient, workRequestId);

        if (isWorkRequestInSuccessState(workRequestResponse)) {
            clusterId = getClusterId(workRequestResponse);
            System.out.println("cluster ID is: " + clusterId);
            System.out.println();

            GetClusterResponse getResponse =
                    containerEngineClient.getCluster(
                            GetClusterRequest.builder().clusterId(clusterId).build());

            cluster = getResponse.getCluster();
        }
        return cluster;
    }

    /**
     * Deletes a cluster and waits for it to be deleted.
     *
     * @param containerEngineClient the service client to use to delete the cluster
     * @param cluster the cluster to delete
     *
     * @throws Exception if there is an error waiting on the cluster to be deleted
     */
    private static void deleteCluster(ContainerEngineClient containerEngineClient, String clusterId)
            throws Exception {

        DeleteClusterResponse deleteClusterReponse =
                containerEngineClient.deleteCluster(
                        DeleteClusterRequest.builder().clusterId(clusterId).build());

        String workRequestId = deleteClusterReponse.getOpcWorkRequestId();
        GetWorkRequestResponse workRequestResponse =
                waitForWorkRequestFinished(containerEngineClient, workRequestId);

        if (isWorkRequestInSuccessState(workRequestResponse)) {
            GetClusterResponse getResponse =
                    containerEngineClient.getCluster(
                            GetClusterRequest.builder().clusterId(clusterId).build());
            System.out.println(
                    "Cluster lifecycle state is " + getResponse.getCluster().getLifecycleState());
        }
    }

    /**
     * Update a cluster and waits for it to become active
     *
     * @param containerEngineClient the service client to use to delete the cluster
     * @param clusterId the cluster ID
     * @param newClusterName The new cluster name
     *
     * @throws Exception if there is an error waiting on the cluster to be updated
     */
    private static void updateCluster(
            ContainerEngineClient containerEngineClient, String clusterId, String newClusterName)
            throws Exception {

        UpdateClusterResponse updateClusterResponse =
                containerEngineClient.updateCluster(
                        UpdateClusterRequest.builder()
                                .clusterId(clusterId)
                                .updateClusterDetails(
                                        UpdateClusterDetails.builder().name(newClusterName).build())
                                .build());
        String workRequestId = updateClusterResponse.getOpcWorkRequestId();
        GetWorkRequestResponse workRequestResponse =
                waitForWorkRequestFinished(containerEngineClient, workRequestId);

        if (isWorkRequestInSuccessState(workRequestResponse)) {
            GetClusterResponse getResponse =
                    containerEngineClient.getCluster(
                            GetClusterRequest.builder().clusterId(clusterId).build());
            Cluster cluster = getResponse.getCluster();
            System.out.println("Cluster name is changed to " + cluster.getName());
        }
    }

    /**
     * Retrieve a list of Kubernetes versions
     *
     * @param containerEngineClient the service client to use to retrieve Kubernetes versions
     *
     * @return a list of Kubernetes versions
     *
     * @throws Exception if there is an error while retrieving
     */
    private static List<String> getKubernetesVersions(ContainerEngineClient containerEngineClient)
            throws Exception {
        GetClusterOptionsResponse getResponse =
                containerEngineClient.getClusterOptions(
                        GetClusterOptionsRequest.builder().clusterOptionId("all").build());
        return getResponse.getClusterOptions().getKubernetesVersions();
    }

    /**
     * Get cluster ID
     *
     * @param GetWorkRequestResponse The work request response for getting cluster ID
     *
     * @return cluster ID
     *
     * @throws Exception if there is an error
     */
    private static String getClusterId(GetWorkRequestResponse getWorkRequestResponse) {
        String clusterId = null;
        List<WorkRequestResource> resources =
                getWorkRequestResponse.getWorkRequest().getResources();
        for (WorkRequestResource resource : resources) {
            if (resource.getEntityType().equals("cluster")) {
                clusterId = resource.getIdentifier();
                break;
            }
        }
        return clusterId;
    }

    /**
     * Wait for a work request finished
     * @param containerEngineClient the service client to use to get work request
     * @param workRequestId the id of work request
     * @return a work request response object
     * @throws Exception If the waiter timed out.
     */
    private static GetWorkRequestResponse waitForWorkRequestFinished(
            final ContainerEngineClient containerEngineClient, final String workRequestId)
            throws Exception {
        final GetWorkRequestResponse workRequestResponse =
                containerEngineClient
                        .getWaiters()
                        .forWorkRequest(
                                GetWorkRequestRequest.builder()
                                        .workRequestId(workRequestId)
                                        .build())
                        .execute();

        return workRequestResponse;
    }

    /**
     * Check work request in Success state
     * @param containerEngineClient the service client to use to get work request
     * @return boolean
     * @throws Exception If there is error
     */
    private static boolean isWorkRequestInSuccessState(GetWorkRequestResponse workRequestResponse)
            throws Exception {
        boolean inSuccessState = false;
        WorkRequestStatus workRequestStatus = workRequestResponse.getWorkRequest().getStatus();

        if (workRequestStatus == WorkRequestStatus.Succeeded) {
            inSuccessState = true;
        }
        return inSuccessState;
    }
}
