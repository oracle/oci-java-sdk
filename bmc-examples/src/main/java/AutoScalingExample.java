/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.google.common.collect.ImmutableList;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.autoscaling.AutoScalingClient;
import com.oracle.bmc.autoscaling.model.Action;
import com.oracle.bmc.autoscaling.model.AutoScalingConfiguration;
import com.oracle.bmc.autoscaling.model.Capacity;
import com.oracle.bmc.autoscaling.model.Condition;
import com.oracle.bmc.autoscaling.model.CreateAutoScalingConfigurationDetails;
import com.oracle.bmc.autoscaling.model.CreateAutoScalingPolicyDetails;
import com.oracle.bmc.autoscaling.model.CreateConditionDetails;
import com.oracle.bmc.autoscaling.model.CreateThresholdPolicyDetails;
import com.oracle.bmc.autoscaling.model.InstancePoolResource;
import com.oracle.bmc.autoscaling.model.Metric;
import com.oracle.bmc.autoscaling.model.Resource;
import com.oracle.bmc.autoscaling.model.Threshold;
import com.oracle.bmc.autoscaling.model.UpdateAutoScalingConfigurationDetails;
import com.oracle.bmc.autoscaling.requests.CreateAutoScalingConfigurationRequest;
import com.oracle.bmc.autoscaling.requests.DeleteAutoScalingConfigurationRequest;
import com.oracle.bmc.autoscaling.requests.UpdateAutoScalingConfigurationRequest;
import com.oracle.bmc.autoscaling.responses.CreateAutoScalingConfigurationResponse;
import com.oracle.bmc.core.ComputeManagementClient;
import com.oracle.bmc.core.ComputeManagementWaiters;
import com.oracle.bmc.core.model.ComputeInstanceDetails;
import com.oracle.bmc.core.model.CreateInstanceConfigurationDetails;
import com.oracle.bmc.core.model.CreateInstancePoolDetails;
import com.oracle.bmc.core.model.CreateInstancePoolPlacementConfigurationDetails;
import com.oracle.bmc.core.model.InstanceConfiguration;
import com.oracle.bmc.core.model.InstanceConfigurationCreateVnicDetails;
import com.oracle.bmc.core.model.InstanceConfigurationInstanceSourceViaImageDetails;
import com.oracle.bmc.core.model.InstanceConfigurationLaunchInstanceDetails;
import com.oracle.bmc.core.model.InstancePool;
import com.oracle.bmc.core.requests.CreateInstanceConfigurationRequest;
import com.oracle.bmc.core.requests.CreateInstancePoolRequest;
import com.oracle.bmc.core.requests.DeleteInstanceConfigurationRequest;
import com.oracle.bmc.core.requests.GetInstancePoolRequest;
import com.oracle.bmc.core.requests.TerminateInstancePoolRequest;
import com.oracle.bmc.core.responses.CreateInstanceConfigurationResponse;
import com.oracle.bmc.core.responses.CreateInstancePoolResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class provides an example of how you can create an AutoScalingConfiguration and use that with a InstancePools.
 * It will show how to setup an AutoscalongConfiguration that will cause the pool to scale out to 2 instances. It will
 * then wait for the pool to become available (with instances launched).  It then shows how to perform an update and
 * clean up. It will:
 * <ul>
 * <li>Create the InstanceConfiguration</li>
 * <li>Create a pool based off that configuration, placing that instance on 1 AD.</li>
 * <li>Wait for the pool to come online (which means an instance has been launched).</li>
 * <li>Create an AutoScalingConfiguration for that pool.</li>
 * <li>Wait for the InstancePool to scale up. (There are now two instances).</li>
 * <li>Clean everything up.</li>
 * </ul>
 */
public class AutoScalingExample {

    /**
     * @param args Parameters to use for the autoscalingConfiguration as follows:
     * <ul>
     *   <li>The first argument is the ocid of the compartment for the config/pool/autoscalingConfiguration.</li>
     *   <li>The second is the availability domain to launch the instance/pool.</li>
     *   <li>Third parameter is the subnet for the launched instances.</li>
     *   <li>The fourth parameter is the ocid for the image source for the instances in the pool.</li>
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

        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(CONFIG_LOCATION, CONFIG_PROFILE);

        ComputeManagementClient client = new ComputeManagementClient(provider);
        AutoScalingClient autoScalingClient = new AutoScalingClient(provider);

        InstanceConfiguration instanceConfiguration =
                createInstanceConfiguration(client, imageId, compartmentId);
        InstancePool instancePool =
                createAndStartInstancePool(
                        client, instanceConfiguration, subnetId, availabilityDomain, compartmentId);

        // Wait for the pool to scale out and enter a running state.  (This will leave one instance running)
        ComputeManagementWaiters waiter = client.getWaiters();
        GetInstancePoolRequest getInstancePoolRequest =
                GetInstancePoolRequest.builder().instancePoolId(instancePool.getId()).build();

        // Pool will go from Provisioning --> Running.
        waiter.forInstancePool(getInstancePoolRequest, InstancePool.LifecycleState.Running)
                .execute();

        // create the autoscaling configuration for a pool. Since we have set the initial size to be different than the
        // current pool size, the pool will immediately go into scaling
        AutoScalingConfiguration autoScalingConfiguration =
                createAutoscalingConfiguration(
                        autoScalingClient, instancePool.getId(), compartmentId);

        // Pool will go from Scaling --> Running.
        waiter.forInstancePool(getInstancePoolRequest, InstancePool.LifecycleState.Running)
                .execute();

        // Make an update request to update the cooldown to 10 minutes, up from the default 5
        UpdateAutoScalingConfigurationRequest updateRequest =
                UpdateAutoScalingConfigurationRequest.builder()
                        .autoScalingConfigurationId(autoScalingConfiguration.getId())
                        .updateAutoScalingConfigurationDetails(
                                UpdateAutoScalingConfigurationDetails.builder()
                                        .coolDownInSeconds(600)
                                        .build())
                        .build();
        autoScalingClient.updateAutoScalingConfiguration(updateRequest);

        // Delete the autoscaling configuration from the pool
        DeleteAutoScalingConfigurationRequest deleteRequest =
                DeleteAutoScalingConfigurationRequest.builder()
                        .autoScalingConfigurationId(autoScalingConfiguration.getId())
                        .build();
        autoScalingClient.deleteAutoScalingConfiguration(deleteRequest);

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

    public static AutoScalingConfiguration createAutoscalingConfiguration(
            AutoScalingClient client, String instancePoolId, String compartmentId) {

        Resource resource = InstancePoolResource.builder().id(instancePoolId).build();

        // defining the scaling range and initial pool size
        Capacity capacity = Capacity.builder().initial(2).min(1).max(3).build();

        // defining the scale in rule
        Threshold lowerBound =
                Threshold.builder().operator(Threshold.Operator.Lt).value(30).build();

        Action scaleInAction = Action.builder().type(Action.Type.ChangeCountBy).value(-1).build();

        CreateConditionDetails scaleInRule =
                CreateConditionDetails.builder()
                        .displayName("scaleInRule")
                        .metric(
                                Metric.builder()
                                        .metricType(Metric.MetricType.CpuUtilization)
                                        .threshold(lowerBound)
                                        .build())
                        .action(scaleInAction)
                        .build();

        // defining the scale out rule
        Threshold upperBound =
                Threshold.builder().operator(Threshold.Operator.Gt).value(70).build();

        Action scaleOutAction = Action.builder().type(Action.Type.ChangeCountBy).value(1).build();

        CreateConditionDetails scaleOutRule =
                CreateConditionDetails.builder()
                        .displayName("scaleOutRule")
                        .metric(
                                Metric.builder()
                                        .metricType(Metric.MetricType.CpuUtilization)
                                        .threshold(upperBound)
                                        .build())
                        .action(scaleOutAction)
                        .build();

        List<CreateConditionDetails> rules = ImmutableList.of(scaleInRule, scaleOutRule);

        // defining the threshold policy
        CreateAutoScalingPolicyDetails policy =
                CreateThresholdPolicyDetails.builder().capacity(capacity).rules(rules).build();

        List<CreateAutoScalingPolicyDetails> policies = ImmutableList.of(policy);

        CreateAutoScalingConfigurationDetails createAutoScalingConfigurationDetails =
                CreateAutoScalingConfigurationDetails.builder()
                        .compartmentId(compartmentId)
                        .displayName("Autoscaling Configuration Example")
                        .resource(resource)
                        .policies(policies)
                        .build();

        CreateAutoScalingConfigurationRequest createAutoScalingConfigurationRequest =
                CreateAutoScalingConfigurationRequest.builder()
                        .createAutoScalingConfigurationDetails(
                                createAutoScalingConfigurationDetails)
                        .build();

        CreateAutoScalingConfigurationResponse response =
                client.createAutoScalingConfiguration(createAutoScalingConfigurationRequest);

        return response.getAutoScalingConfiguration();
    }
}
