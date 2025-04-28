/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.ComputeClient;
import com.oracle.bmc.core.ComputeManagementClient;
import com.oracle.bmc.core.ComputeWaiters;
import com.oracle.bmc.core.model.ComputeInstanceDetails;
import com.oracle.bmc.core.model.CreateInstanceConfigurationDetails;
import com.oracle.bmc.core.model.CreateInstanceConfigurationFromInstanceDetails;
import com.oracle.bmc.core.model.Instance;
import com.oracle.bmc.core.model.InstanceConfiguration;
import com.oracle.bmc.core.model.InstanceConfigurationBlockVolumeDetails;
import com.oracle.bmc.core.model.InstanceConfigurationCreateVnicDetails;
import com.oracle.bmc.core.model.InstanceConfigurationCreateVolumeDetails;
import com.oracle.bmc.core.model.InstanceConfigurationInstanceSourceViaImageDetails;
import com.oracle.bmc.core.model.InstanceConfigurationIscsiAttachVolumeDetails;
import com.oracle.bmc.core.model.InstanceConfigurationLaunchInstanceDetails;
import com.oracle.bmc.core.requests.CreateInstanceConfigurationRequest;
import com.oracle.bmc.core.requests.DeleteInstanceConfigurationRequest;
import com.oracle.bmc.core.requests.GetInstanceRequest;
import com.oracle.bmc.core.requests.LaunchInstanceConfigurationRequest;
import com.oracle.bmc.core.requests.TerminateInstanceRequest;
import com.oracle.bmc.core.responses.CreateInstanceConfigurationResponse;
import com.oracle.bmc.core.responses.GetInstanceResponse;
import com.oracle.bmc.core.responses.LaunchInstanceConfigurationResponse;

import java.util.Arrays;
import java.util.Collections;

/**
 * This class provides an example of how you can create an InstanceConfiguration and use the
 * InstanceConfiguration to launch an Instance. 1) Create the InstanceConfiguration with a Block
 * Volume 2) Launch an Instance from an Instance Configuration 3) Wait for the instance to go into
 * running state 4) Create the InstanceConfiguration from a running instance 5) Create a partially
 * defined InstanceConfiguration 6) Launch an Instance from a partially defined
 * InstanceConfiguration 7) Wait for the instance to transition to the running state 8) Create the
 * InstanceConfiguration with FaultDomain
 */
public class InstanceConfigurationExample {

    public static CreateInstanceConfigurationDetails createInstanceConfigurationWithBlockVolume(
            String availabilityDomain,
            String subnetId,
            String imageId,
            String compartmentId,
            Long bootVolumeSizeInGBs) {
        InstanceConfigurationCreateVnicDetails vnicDetails =
                InstanceConfigurationCreateVnicDetails.builder().subnetId(subnetId).build();

        InstanceConfigurationInstanceSourceViaImageDetails sourceDetails =
                InstanceConfigurationInstanceSourceViaImageDetails.builder()
                        .imageId(imageId)
                        .bootVolumeSizeInGBs(bootVolumeSizeInGBs)
                        .build();

        InstanceConfigurationLaunchInstanceDetails launchDetails =
                InstanceConfigurationLaunchInstanceDetails.builder()
                        .compartmentId(compartmentId)
                        .availabilityDomain(availabilityDomain)
                        .displayName("Instance Configuration Example")
                        .createVnicDetails(vnicDetails)
                        .shape("VM.Standard2.1")
                        .sourceDetails(sourceDetails)
                        .build();

        // Create a block volume
        InstanceConfigurationBlockVolumeDetails volumeDetails =
                InstanceConfigurationBlockVolumeDetails.builder()
                        .createDetails(
                                InstanceConfigurationCreateVolumeDetails.builder()
                                        .availabilityDomain(availabilityDomain)
                                        .compartmentId(compartmentId)
                                        .build())
                        .attachDetails(
                                InstanceConfigurationIscsiAttachVolumeDetails.builder().build())
                        .build();

        ComputeInstanceDetails instanceDetails =
                ComputeInstanceDetails.builder()
                        .launchDetails(launchDetails)
                        .blockVolumes(Collections.unmodifiableList(Arrays.asList(volumeDetails)))
                        .build();

        CreateInstanceConfigurationDetails configurationDetails =
                CreateInstanceConfigurationDetails.builder()
                        .displayName("Instance Configuration Example")
                        .compartmentId(compartmentId)
                        .instanceDetails(instanceDetails)
                        .build();
        return configurationDetails;
    }

    public static CreateInstanceConfigurationDetails createPartiallyDefinedInstanceConfiguration(
            String imageId, String compartmentId) {
        InstanceConfigurationInstanceSourceViaImageDetails sourceDetails =
                InstanceConfigurationInstanceSourceViaImageDetails.builder()
                        .imageId(imageId)
                        .build();

        // Leave out subnetId and AvailabilityDomain
        InstanceConfigurationLaunchInstanceDetails launchDetails =
                InstanceConfigurationLaunchInstanceDetails.builder()
                        .compartmentId(compartmentId)
                        .displayName("Instance Configuration Partially Defined Example")
                        .shape("VM.Standard2.1")
                        .sourceDetails(sourceDetails)
                        .createVnicDetails(InstanceConfigurationCreateVnicDetails.builder().build())
                        .build();

        ComputeInstanceDetails instanceDetails =
                ComputeInstanceDetails.builder().launchDetails(launchDetails).build();
        CreateInstanceConfigurationDetails configurationDetails =
                CreateInstanceConfigurationDetails.builder()
                        .displayName("Instance Configuration Partially Defined Example")
                        .compartmentId(compartmentId)
                        .instanceDetails(instanceDetails)
                        .build();
        return configurationDetails;
    }

    public static CreateInstanceConfigurationDetails createInstanceConfigurationWithFaultDomain(
            String availabilityDomain, String subnetId, String imageId, String compartmentId) {
        InstanceConfigurationCreateVnicDetails vnicDetails =
                InstanceConfigurationCreateVnicDetails.builder().subnetId(subnetId).build();

        InstanceConfigurationInstanceSourceViaImageDetails sourceDetails =
                InstanceConfigurationInstanceSourceViaImageDetails.builder()
                        .imageId(imageId)
                        .build();

        InstanceConfigurationLaunchInstanceDetails launchDetails =
                InstanceConfigurationLaunchInstanceDetails.builder()
                        .compartmentId(compartmentId)
                        .availabilityDomain(availabilityDomain)
                        .displayName("Instance Configuration Example")
                        .createVnicDetails(vnicDetails)
                        .shape("VM.Standard2.1")
                        .sourceDetails(sourceDetails)
                        .faultDomain("FAULT-DOMAIN-2")
                        .build();

        ComputeInstanceDetails instanceDetails =
                ComputeInstanceDetails.builder().launchDetails(launchDetails).build();

        CreateInstanceConfigurationDetails configurationDetails =
                CreateInstanceConfigurationDetails.builder()
                        .displayName("Instance Configuration With FaultDomain")
                        .compartmentId(compartmentId)
                        .instanceDetails(instanceDetails)
                        .build();

        return configurationDetails;
    }

    public static CreateInstanceConfigurationFromInstanceDetails
            createInstanceConfigurationFromInstance(String instanceId, String compartmentId) {
        CreateInstanceConfigurationFromInstanceDetails configurationDetails =
                CreateInstanceConfigurationFromInstanceDetails.builder()
                        .compartmentId(compartmentId)
                        .instanceId(instanceId)
                        .build();

        return configurationDetails;
    }

    public static LaunchInstanceConfigurationRequest createLaunchRequest(
            String instanceConfigurationId) {
        return LaunchInstanceConfigurationRequest.builder()
                .instanceConfigurationId(instanceConfigurationId)
                .instanceConfiguration(ComputeInstanceDetails.builder().build())
                .build();
    }

    public static LaunchInstanceConfigurationRequest createPartialLaunchRequest(
            String instanceConfigurationId, String availabilityDomain, String subnetId) {

        // Provide availabilityDomain and subnetId during launch
        return LaunchInstanceConfigurationRequest.builder()
                .instanceConfigurationId(instanceConfigurationId)
                .instanceConfiguration(
                        ComputeInstanceDetails.builder()
                                .launchDetails(
                                        InstanceConfigurationLaunchInstanceDetails.builder()
                                                .availabilityDomain(availabilityDomain)
                                                .createVnicDetails(
                                                        InstanceConfigurationCreateVnicDetails
                                                                .builder()
                                                                .subnetId(subnetId)
                                                                .build())
                                                .build())
                                .build())
                .build();
    }

    /**
     * @param args Parameters to use for InstanceConfiguration as follows:
     *     <ul>
     *       <li>The first argument is the ocid of the compartment for the config
     *       <li>The second is the availability domain to launch the instance.
     *       <li>Third parameter is the subnet for the launched instances.
     *       <li>The fourth parameter is the ocid for the image source for the instance.
     *       <li>The fifth parameter is the bootVolumeSizeInGBs that is optional
     *     </ul>
     *
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        final String CONFIG_LOCATION = "~/.oci/config";
        final String CONFIG_PROFILE = "DEFAULT";

        if (args.length < 4) {
            throw new IllegalArgumentException(
                    String.format(
                            "Unexpected number of arguments.  Expected at least 4, got %s",
                            args.length));
        }

        final String compartmentId = args[0];
        final String availabilityDomain = args[1];
        final String subnetId = args[2];
        final String imageId = args[3];
        Long bootVolumeSizeInGBs = null;

        if (args.length > 4 && args[4] != null) {
            bootVolumeSizeInGBs = Long.parseLong(args[4]);
        }

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        ComputeManagementClient computeManagementClient =
                ComputeManagementClient.builder().build(provider);
        ComputeClient computeClient = ComputeClient.builder().build(provider);

        ComputeWaiters waiters = computeClient.getWaiters();

        CreateInstanceConfigurationDetails configurationDetails =
                createInstanceConfigurationWithBlockVolume(
                        availabilityDomain, subnetId, imageId, compartmentId, bootVolumeSizeInGBs);

        CreateInstanceConfigurationRequest req =
                CreateInstanceConfigurationRequest.builder()
                        .createInstanceConfiguration(configurationDetails)
                        .build();

        CreateInstanceConfigurationResponse response =
                computeManagementClient.createInstanceConfiguration(req);
        InstanceConfiguration instanceConfiguration = response.getInstanceConfiguration();

        System.out.printf("Created instance configuration:%s%n", instanceConfiguration.getId());
        LaunchInstanceConfigurationResponse launchResponse =
                computeManagementClient.launchInstanceConfiguration(
                        createLaunchRequest(instanceConfiguration.getId()));

        Instance instance = launchResponse.getInstance();
        System.out.printf("Created instance:%s%n", instance.getId());

        GetInstanceRequest instanceRequest =
                GetInstanceRequest.builder().instanceId(instance.getId()).build();

        System.out.printf("Waiting for instance:%s to transition to running%n", instance.getId());
        GetInstanceResponse instanceResponse =
                waiters.forInstance(instanceRequest, Instance.LifecycleState.Running).execute();

        System.out.printf(
                "Instance:%s is in state running%n", instanceResponse.getInstance().getId());

        // Create an instance configuration from running instance
        CreateInstanceConfigurationRequest createInstanceConfigurationFromInstanceRequest =
                CreateInstanceConfigurationRequest.builder()
                        .createInstanceConfiguration(
                                createInstanceConfigurationFromInstance(
                                        instance.getId(), compartmentId))
                        .build();

        CreateInstanceConfigurationResponse createInstanceConfigurationFromInstanceResponse =
                computeManagementClient.createInstanceConfiguration(
                        createInstanceConfigurationFromInstanceRequest);

        InstanceConfiguration instanceConfigurationFromInstance =
                createInstanceConfigurationFromInstanceResponse.getInstanceConfiguration();
        System.out.printf(
                "%nCreated instance configuration from running instance:%s%n",
                instanceConfigurationFromInstance.getId());

        // Create an instance from a partially defined instance config
        CreateInstanceConfigurationRequest partialCreateRequest =
                CreateInstanceConfigurationRequest.builder()
                        .createInstanceConfiguration(
                                createPartiallyDefinedInstanceConfiguration(imageId, compartmentId))
                        .build();

        CreateInstanceConfigurationResponse partialCreateResponse =
                computeManagementClient.createInstanceConfiguration(partialCreateRequest);

        InstanceConfiguration partiallyDefinedInstanceConfiguration =
                partialCreateResponse.getInstanceConfiguration();
        System.out.printf(
                "%nCreated partially defined instanceConfiguration:%s%n",
                partiallyDefinedInstanceConfiguration.getId());

        LaunchInstanceConfigurationRequest partialLaunchRequest =
                createPartialLaunchRequest(
                        partiallyDefinedInstanceConfiguration.getId(),
                        availabilityDomain,
                        subnetId);

        LaunchInstanceConfigurationResponse partialLaunchResponse =
                computeManagementClient.launchInstanceConfiguration(partialLaunchRequest);

        Instance partialInstance = partialLaunchResponse.getInstance();

        System.out.printf("Created partially defined instance:%s%n", partialInstance.getId());

        GetInstanceRequest partialInstanceRequest =
                GetInstanceRequest.builder().instanceId(partialInstance.getId()).build();

        System.out.printf(
                "Waiting for instance:%s to transition to running%n", partialInstance.getId());
        GetInstanceResponse partialInstanceResponse =
                waiters.forInstance(partialInstanceRequest, Instance.LifecycleState.Running)
                        .execute();

        System.out.printf(
                "Partially defined instance:%s is running%n",
                partialInstanceResponse.getInstance().getId());

        // Create an instance configuration with faultDomain
        CreateInstanceConfigurationRequest instanceConfigurationWithFaultDomainRequest =
                CreateInstanceConfigurationRequest.builder()
                        .createInstanceConfiguration(
                                createInstanceConfigurationWithFaultDomain(
                                        imageId, subnetId, imageId, compartmentId))
                        .build();

        CreateInstanceConfigurationResponse instanceConfigurationWithFaultDomainResponse =
                computeManagementClient.createInstanceConfiguration(
                        instanceConfigurationWithFaultDomainRequest);

        InstanceConfiguration instanceConfigurationWithFaultDomain =
                instanceConfigurationWithFaultDomainResponse.getInstanceConfiguration();
        System.out.printf(
                "%nCreated instance configuration with faultDomain:%s%n",
                instanceConfigurationWithFaultDomain.getId());

        // Delete the instance configurations
        DeleteInstanceConfigurationRequest deleteInstanceConfigurationRequest =
                DeleteInstanceConfigurationRequest.builder()
                        .instanceConfigurationId(instanceConfiguration.getId())
                        .build();
        computeManagementClient.deleteInstanceConfiguration(deleteInstanceConfigurationRequest);

        DeleteInstanceConfigurationRequest deleteInstanceConfigurationFromInstanceRequest =
                DeleteInstanceConfigurationRequest.builder()
                        .instanceConfigurationId(instanceConfigurationFromInstance.getId())
                        .build();
        computeManagementClient.deleteInstanceConfiguration(
                deleteInstanceConfigurationFromInstanceRequest);

        DeleteInstanceConfigurationRequest deletePartiallyDefinedInstanceConfigurationRequest =
                DeleteInstanceConfigurationRequest.builder()
                        .instanceConfigurationId(partiallyDefinedInstanceConfiguration.getId())
                        .build();
        computeManagementClient.deleteInstanceConfiguration(
                deletePartiallyDefinedInstanceConfigurationRequest);

        DeleteInstanceConfigurationRequest deleteInstanceConfigurationWithFaultDomainRequest =
                DeleteInstanceConfigurationRequest.builder()
                        .instanceConfigurationId(instanceConfigurationWithFaultDomain.getId())
                        .build();
        computeManagementClient.deleteInstanceConfiguration(
                deleteInstanceConfigurationWithFaultDomainRequest);

        // Terminate the instances
        TerminateInstanceRequest terminateInstanceRequest =
                TerminateInstanceRequest.builder().instanceId(instance.getId()).build();
        computeClient.terminateInstance(terminateInstanceRequest);

        TerminateInstanceRequest terminatePartialInstanceRequest =
                TerminateInstanceRequest.builder().instanceId(partialInstance.getId()).build();
        computeClient.terminateInstance(terminatePartialInstanceRequest);

        computeClient.close();
        computeManagementClient.close();
    }
}
