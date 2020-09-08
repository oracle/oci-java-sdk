/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.google.common.collect.ImmutableList;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.ComputeManagementClient;
import com.oracle.bmc.core.ComputeManagementWaiters;
import com.oracle.bmc.core.model.ClusterNetwork;
import com.oracle.bmc.core.model.ClusterNetworkPlacementConfigurationDetails;
import com.oracle.bmc.core.model.ComputeInstanceDetails;
import com.oracle.bmc.core.model.CreateClusterNetworkDetails;
import com.oracle.bmc.core.model.CreateClusterNetworkInstancePoolDetails;
import com.oracle.bmc.core.model.CreateInstanceConfigurationDetails;
import com.oracle.bmc.core.model.InstanceConfiguration;
import com.oracle.bmc.core.model.InstanceConfigurationCreateVnicDetails;
import com.oracle.bmc.core.model.InstanceConfigurationInstanceSourceViaImageDetails;
import com.oracle.bmc.core.model.InstanceConfigurationLaunchInstanceDetails;
import com.oracle.bmc.core.model.InstanceSummary;
import com.oracle.bmc.core.requests.CreateClusterNetworkRequest;
import com.oracle.bmc.core.requests.CreateInstanceConfigurationRequest;
import com.oracle.bmc.core.requests.DeleteInstanceConfigurationRequest;
import com.oracle.bmc.core.requests.GetClusterNetworkRequest;
import com.oracle.bmc.core.requests.ListClusterNetworkInstancesRequest;
import com.oracle.bmc.core.requests.TerminateClusterNetworkRequest;
import com.oracle.bmc.core.responses.CreateClusterNetworkResponse;
import com.oracle.bmc.core.responses.CreateInstanceConfigurationResponse;
import com.oracle.bmc.core.responses.GetClusterNetworkResponse;
import com.oracle.bmc.core.responses.ListClusterNetworkInstancesResponse;

import java.util.Collections;

/**
 * This class provides an example of how you can create an InstanceConfiguration and use it to create a Cluster Network.
 * It will:
 *  - Create the InstanceConfiguration
 *  - Create a Cluster Network based on that configuration.
 *  - Wait for the Cluster Network to go to Running state.
 *  - List instances of the Cluster Network
 *  - Clean everything up.
 */
public class ClusterNetworkExample {

    public static InstanceConfiguration createInstanceConfigurationWithHPCShape(
            ComputeManagementClient client, String imageId, String compartmentId) {
        InstanceConfigurationCreateVnicDetails vnicDetails =
                InstanceConfigurationCreateVnicDetails.builder().build();

        InstanceConfigurationInstanceSourceViaImageDetails sourceDetails =
                InstanceConfigurationInstanceSourceViaImageDetails.builder()
                        .imageId(imageId)
                        .build();

        InstanceConfigurationLaunchInstanceDetails launchDetails =
                InstanceConfigurationLaunchInstanceDetails.builder()
                        .compartmentId(compartmentId)
                        .createVnicDetails(vnicDetails)
                        .shape("BM.HPC2.36")
                        .sourceDetails(sourceDetails)
                        .build();

        ComputeInstanceDetails instanceDetails =
                ComputeInstanceDetails.builder()
                        .launchDetails(launchDetails)
                        .secondaryVnics(Collections.EMPTY_LIST)
                        .blockVolumes(Collections.EMPTY_LIST)
                        .build();

        CreateInstanceConfigurationDetails configurationDetails =
                CreateInstanceConfigurationDetails.builder()
                        .displayName("Instance Configuration with HPC shape")
                        .compartmentId(compartmentId)
                        .instanceDetails(instanceDetails)
                        .build();

        CreateInstanceConfigurationRequest req =
                CreateInstanceConfigurationRequest.builder()
                        .createInstanceConfiguration(configurationDetails)
                        .build();

        CreateInstanceConfigurationResponse response = client.createInstanceConfiguration(req);
        return response.getInstanceConfiguration();
    }

    public static ClusterNetwork createClusterNetwork(
            ComputeManagementClient client,
            InstanceConfiguration instanceConfiguration,
            String subnetId,
            String availabilityDomain,
            String compartmentId) {

        CreateClusterNetworkDetails createClusterNetworkDetails =
                CreateClusterNetworkDetails.builder()
                        .compartmentId(compartmentId)
                        .displayName("Cluster Network Example")
                        .instancePools(
                                ImmutableList.of(
                                        CreateClusterNetworkInstancePoolDetails.builder()
                                                .instanceConfigurationId(
                                                        instanceConfiguration.getId())
                                                .size(1)
                                                .build()))
                        .placementConfiguration(
                                ClusterNetworkPlacementConfigurationDetails.builder()
                                        .availabilityDomain(availabilityDomain)
                                        .primarySubnetId(subnetId)
                                        .build())
                        .build();

        CreateClusterNetworkRequest request =
                CreateClusterNetworkRequest.builder()
                        .createClusterNetworkDetails(createClusterNetworkDetails)
                        .build();

        CreateClusterNetworkResponse response = client.createClusterNetwork(request);
        return response.getClusterNetwork();
    }

    /**
     * @param args Parameters to use for the cluster networks sample as follows:
     * <ul>
     *   <li>The first argument is the ocid of the compartment for the cluster network.</li>
     *   <li>The second is the availability domain to launch instance in.</li>
     *   <li>Third parameter is the subnet for the launched instances.</li>
     *   <li>The fourth parameter is the ocid for the image source for the instance.</li>
     * </ul>
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        final String CONFIG_LOCATION = "~/.oci/config";
        final String CONFIG_PROFILE = "DEFAULT";

        if (args.length != 4) {
            throw new IllegalArgumentException(
                    String.format(
                            "Unexpected number of arguments.  Expected 4, got %s", args.length));
        }

        final String compartmentId = args[0];
        final String availabilityDomain = args[1];
        final String subnetId = args[2];
        final String imageId = args[3];

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        ComputeManagementClient client = new ComputeManagementClient(provider);

        InstanceConfiguration instanceConfiguration =
                createInstanceConfigurationWithHPCShape(client, imageId, compartmentId);

        ClusterNetwork clusterNetwork =
                createClusterNetwork(
                        client, instanceConfiguration, subnetId, availabilityDomain, compartmentId);

        // Wait for the CN to scale out and enter a running state.  (This will leave one instance running)
        ComputeManagementWaiters waiter = client.getWaiters();
        GetClusterNetworkRequest getClusterNetworkRequest =
                GetClusterNetworkRequest.builder().clusterNetworkId(clusterNetwork.getId()).build();

        // ClusterNetwork will go from Provisioning --> Running.
        GetClusterNetworkResponse execute =
                waiter.forClusterNetwork(
                                getClusterNetworkRequest, ClusterNetwork.LifecycleState.Running)
                        .execute();

        // Listing instances of the created cluster network
        ListClusterNetworkInstancesRequest listClusterNetworkInstancesRequest =
                ListClusterNetworkInstancesRequest.builder()
                        .compartmentId(compartmentId)
                        .clusterNetworkId(clusterNetwork.getId())
                        .build();

        ListClusterNetworkInstancesResponse listClusterNetworkInstancesResponse =
                client.listClusterNetworkInstances(listClusterNetworkInstancesRequest);

        // Terminate the ClusterNetwork
        TerminateClusterNetworkRequest terminateClusterNetworkRequest =
                TerminateClusterNetworkRequest.builder()
                        .clusterNetworkId(clusterNetwork.getId())
                        .build();

        client.terminateClusterNetwork(terminateClusterNetworkRequest);

        // Delete the InstanceConfiguration
        DeleteInstanceConfigurationRequest deleteInstanceConfigurationRequest =
                DeleteInstanceConfigurationRequest.builder()
                        .instanceConfigurationId(instanceConfiguration.getId())
                        .build();
        client.deleteInstanceConfiguration(deleteInstanceConfigurationRequest);
    }
}
