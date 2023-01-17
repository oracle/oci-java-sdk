/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.ComputeManagementClient;
import com.oracle.bmc.core.ComputeManagementWaiters;
import com.oracle.bmc.core.model.AttachLoadBalancerDetails;
import com.oracle.bmc.core.model.ComputeInstanceDetails;
import com.oracle.bmc.core.model.CreateInstanceConfigurationDetails;
import com.oracle.bmc.core.model.CreateInstancePoolDetails;
import com.oracle.bmc.core.model.CreateInstancePoolPlacementConfigurationDetails;
import com.oracle.bmc.core.model.InstanceConfiguration;
import com.oracle.bmc.core.model.InstanceConfigurationCreateVnicDetails;
import com.oracle.bmc.core.model.InstanceConfigurationInstanceSourceViaImageDetails;
import com.oracle.bmc.core.model.InstanceConfigurationLaunchInstanceDetails;
import com.oracle.bmc.core.model.InstancePool;
import com.oracle.bmc.core.model.InstancePoolLoadBalancerAttachment;
import com.oracle.bmc.core.model.UpdateInstancePoolDetails;
import com.oracle.bmc.core.requests.AttachLoadBalancerRequest;
import com.oracle.bmc.core.requests.CreateInstanceConfigurationRequest;
import com.oracle.bmc.core.requests.CreateInstancePoolRequest;
import com.oracle.bmc.core.requests.DeleteInstanceConfigurationRequest;
import com.oracle.bmc.core.requests.GetInstancePoolLoadBalancerAttachmentRequest;
import com.oracle.bmc.core.requests.GetInstancePoolRequest;
import com.oracle.bmc.core.requests.TerminateInstancePoolRequest;
import com.oracle.bmc.core.requests.UpdateInstancePoolRequest;
import com.oracle.bmc.core.responses.AttachLoadBalancerResponse;
import com.oracle.bmc.core.responses.CreateInstanceConfigurationResponse;
import com.oracle.bmc.core.responses.CreateInstancePoolResponse;
import com.oracle.bmc.core.responses.UpdateInstancePoolResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class provides an example of how you can create an InstanceConfiguration and use that
 * configuration with a InstancePool. It will show how to setup a placement record for the instances
 * for that pool and how to wait for the pool to become available (with instances launched). It then
 * shows how to perform an update and clean up. It will: - Create the InstanceConfiguration - Create
 * a pool based off that configuration, placing that instance on 1 AD. - Wait for the pool to come
 * online (which means an instance has been launched). - Update the pool to a size of 2. - Wait for
 * the InstancePool to scale up. (There are now two instances). - Clean everything up.
 */
public class InstancePoolsExample {

    public static InstanceConfiguration createInstanceConfiguration(
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
                        .displayName("Instance Configuration Example")
                        .createVnicDetails(vnicDetails)
                        .shape("VM.Standard2.1")
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
                        .displayName("Instance Configuration Example")
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

    public static InstancePool createAndStartInstancePool(
            ComputeManagementClient client,
            InstanceConfiguration instanceConfiguration,
            String subnetId,
            String availabilityDomain,
            String compartmentId) {

        CreateInstancePoolPlacementConfigurationDetails placementDetails =
                CreateInstancePoolPlacementConfigurationDetails.builder()
                        .primarySubnetId(subnetId)
                        .availabilityDomain(availabilityDomain)
                        .secondaryVnicSubnets(Collections.EMPTY_LIST)
                        .build();

        List<CreateInstancePoolPlacementConfigurationDetails> placementConfigurationList =
                new ArrayList<>();
        placementConfigurationList.add(placementDetails);

        CreateInstancePoolDetails createInstancePoolDetails =
                CreateInstancePoolDetails.builder()
                        .displayName("Instance Pool Example")
                        .compartmentId(compartmentId)
                        .instanceConfigurationId(instanceConfiguration.getId())
                        .size(1)
                        .placementConfigurations(placementConfigurationList)
                        .build();

        CreateInstancePoolRequest request =
                CreateInstancePoolRequest.builder()
                        .createInstancePoolDetails(createInstancePoolDetails)
                        .build();

        CreateInstancePoolResponse response = client.createInstancePool(request);
        return response.getInstancePool();
    }

    /**
     * @param args Parameters to use for the instancePool as follows:
     *     <ul>
     *       <li>The first argument is the ocid of the compartment for the config/pool.
     *       <li>The second is the availability domain to launch the instance.
     *       <li>Third parameter is the subnet for the launched instances.
     *       <li>The fourth parameter is the ocid for the image source for the instance.
     *       <li>The fifth parameter is the Load Balancer ocid.
     *       <li>The sixth parameter is the load balancer backend set name.
     *     </ul>
     *
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        final String CONFIG_LOCATION = "~/.oci/config";
        final String CONFIG_PROFILE = "DEFAULT";

        if (args.length != 6) {
            throw new IllegalArgumentException(
                    String.format(
                            "Unexpected number of arguments.  Expected 4, got %s", args.length));
        }

        final String compartmentId = args[0];
        final String availabilityDomain = args[1];
        final String subnetId = args[2];
        final String imageId = args[3];
        final String loadBalancerId = args[4];
        final String loadBalancerBackendSetName = args[5];

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        ComputeManagementClient client = new ComputeManagementClient(provider);

        InstanceConfiguration instanceConfiguration =
                createInstanceConfiguration(client, imageId, compartmentId);
        InstancePool instancePool =
                createAndStartInstancePool(
                        client, instanceConfiguration, subnetId, availabilityDomain, compartmentId);

        // Wait for the pool to scale out and enter a running state.  (This will leave one instance
        // running)
        ComputeManagementWaiters waiter = client.getWaiters();
        GetInstancePoolRequest getInstancePoolRequest =
                GetInstancePoolRequest.builder().instancePoolId(instancePool.getId()).build();

        // Pool will go from Scaling --> Running.
        waiter.forInstancePool(getInstancePoolRequest, InstancePool.LifecycleState.Running)
                .execute();

        // Update the size to 2.  This will make the number of instances go to two.
        UpdateInstancePoolDetails updateInstancePoolDetails =
                UpdateInstancePoolDetails.builder().size(2).build();

        UpdateInstancePoolRequest updateRequest =
                UpdateInstancePoolRequest.builder()
                        .instancePoolId(instancePool.getId())
                        .updateInstancePoolDetails(updateInstancePoolDetails)
                        .build();

        UpdateInstancePoolResponse updateResponse = client.updateInstancePool(updateRequest);
        instancePool = updateResponse.getInstancePool();
        waiter.forInstancePool(getInstancePoolRequest, InstancePool.LifecycleState.Running)
                .execute();

        // Attach the LB to the pool.
        AttachLoadBalancerRequest attachLbRequest =
                AttachLoadBalancerRequest.builder()
                        .instancePoolId(instancePool.getId())
                        .attachLoadBalancerDetails(
                                AttachLoadBalancerDetails.builder()
                                        .backendSetName(loadBalancerBackendSetName)
                                        .loadBalancerId(loadBalancerId)
                                        .port(80)
                                        .vnicSelection("PrimaryVnic")
                                        .build())
                        .build();

        AttachLoadBalancerResponse attachLoadBalancerResponse =
                client.attachLoadBalancer(attachLbRequest);
        List<InstancePoolLoadBalancerAttachment> instancePoolLoadBalancerAttachments =
                attachLoadBalancerResponse.getInstancePool().getLoadBalancers();
        for (InstancePoolLoadBalancerAttachment loadBalancerAttachment :
                instancePoolLoadBalancerAttachments) {
            if (!loadBalancerAttachment.getLoadBalancerId().equals(loadBalancerId)
                    || !loadBalancerAttachment
                            .getBackendSetName()
                            .equals(loadBalancerBackendSetName)) {
                continue;
            }

            GetInstancePoolLoadBalancerAttachmentRequest
                    getInstancePoolLoadBalancerAttachmentRequest =
                            GetInstancePoolLoadBalancerAttachmentRequest.builder()
                                    .instancePoolId(instancePool.getId())
                                    .instancePoolLoadBalancerAttachmentId(
                                            loadBalancerAttachment.getId())
                                    .build();
            waiter.forInstancePoolLoadBalancerAttachment(
                            getInstancePoolLoadBalancerAttachmentRequest,
                            InstancePoolLoadBalancerAttachment.LifecycleState.Attached)
                    .execute();
        }

        // Terminate the Pool
        TerminateInstancePoolRequest terminatePoolRequest =
                TerminateInstancePoolRequest.builder().instancePoolId(instancePool.getId()).build();
        client.terminateInstancePool(terminatePoolRequest);

        // Delete the InstanceConfiguration
        DeleteInstanceConfigurationRequest deleteInstanceConfigurationRequest =
                DeleteInstanceConfigurationRequest.builder()
                        .instanceConfigurationId(instanceConfiguration.getId())
                        .build();
        client.deleteInstanceConfiguration(deleteInstanceConfigurationRequest);
    }
}
