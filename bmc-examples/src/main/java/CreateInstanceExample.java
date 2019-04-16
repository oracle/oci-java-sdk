/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.base.Strings;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.BlockstorageClient;
import com.oracle.bmc.core.BlockstorageWaiters;
import com.oracle.bmc.core.ComputeClient;
import com.oracle.bmc.core.ComputeWaiters;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.BootVolume;
import com.oracle.bmc.core.model.BootVolumeSourceDetails;
import com.oracle.bmc.core.model.BootVolumeSourceFromBootVolumeDetails;
import com.oracle.bmc.core.model.CreateBootVolumeDetails;
import com.oracle.bmc.core.model.CreateInternetGatewayDetails;
import com.oracle.bmc.core.model.CreateSubnetDetails;
import com.oracle.bmc.core.model.CreateVcnDetails;
import com.oracle.bmc.core.model.CreateVnicDetails;
import com.oracle.bmc.core.model.Image;
import com.oracle.bmc.core.model.Instance;
import com.oracle.bmc.core.model.InstanceSourceViaBootVolumeDetails;
import com.oracle.bmc.core.model.InstanceSourceViaImageDetails;
import com.oracle.bmc.core.model.InternetGateway;
import com.oracle.bmc.core.model.LaunchInstanceDetails;
import com.oracle.bmc.core.model.LaunchInstanceAgentConfigDetails;
import com.oracle.bmc.core.model.RouteRule;
import com.oracle.bmc.core.model.Shape;
import com.oracle.bmc.core.model.Subnet;
import com.oracle.bmc.core.model.UpdateRouteTableDetails;
import com.oracle.bmc.core.model.Vcn;
import com.oracle.bmc.core.requests.CreateBootVolumeRequest;
import com.oracle.bmc.core.requests.CreateInternetGatewayRequest;
import com.oracle.bmc.core.requests.CreateSubnetRequest;
import com.oracle.bmc.core.requests.CreateVcnRequest;
import com.oracle.bmc.core.requests.GetBootVolumeRequest;
import com.oracle.bmc.core.requests.GetInstanceRequest;
import com.oracle.bmc.core.requests.GetSubnetRequest;
import com.oracle.bmc.core.requests.LaunchInstanceRequest;
import com.oracle.bmc.core.requests.ListBootVolumesRequest;
import com.oracle.bmc.core.requests.ListImagesRequest;
import com.oracle.bmc.core.requests.ListShapesRequest;
import com.oracle.bmc.core.requests.UpdateRouteTableRequest;
import com.oracle.bmc.core.responses.CreateInternetGatewayResponse;
import com.oracle.bmc.core.responses.CreateSubnetResponse;
import com.oracle.bmc.core.responses.CreateVcnResponse;
import com.oracle.bmc.core.responses.GetBootVolumeResponse;
import com.oracle.bmc.core.responses.GetInstanceResponse;
import com.oracle.bmc.core.responses.LaunchInstanceResponse;
import com.oracle.bmc.core.responses.ListImagesResponse;
import com.oracle.bmc.core.responses.ListShapesResponse;
import com.oracle.bmc.identity.Identity;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.AvailabilityDomain;
import com.oracle.bmc.identity.requests.ListAvailabilityDomainsRequest;
import com.oracle.bmc.identity.responses.ListAvailabilityDomainsResponse;

public class CreateInstanceExample {
    /**
     * Please refer to https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/launchinginstance.htm to get information about what is necessary for using API to launch a VM instance.
     * This sample will do following things:
     * 1) Prepare VCN, GateWay for VMs.
     * 2) create an instance in VCN from image id and kms key Id.
     * 3) Create a new boot volume based on existing boot volume.
     * 4) Launch another instance based on the newly created boot volume.
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        // TODO: Fill in these values
        String compartmentId = "SOME OCID";
        String instanceDisplayName = "SOME NAME";
        String networkCidrBlock = "10.0.0.0/16";
        // Sample of sshPublicKey format is provided in the value for sshPublicKey
        String sshPublicKey =
                "ssh-rsa AAAAB3NzaC1y...key shortened for example...fdK/ABqxgH7sy3AWgBjfj some description";

        String subnetDisplayName = instanceDisplayName + "-subnet";
        String vcnDisplayName = instanceDisplayName + "-vcn";
        String internetGatewayDisplayName = instanceDisplayName + "-internet-gateway";
        String bootVolumeDisplayName = instanceDisplayName + "-bootVolume";

        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        // When an instance is created, a boot volume is created at the same time. User could choose to use their own kms key to encrypt the data.
        // fill out necessary kms key information to use your own key to protect kms.  More information of volume security please refer to https://cloud.oracle.com/storage/block-volume/faq
        // If you dont't need kmsKeyId, then simply set it to null.  Refer to the commented out line below.
        String kmsKeyId = "SOME VALID KMS Key OCID";
        // String kmsKeyId = null;

        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

        ComputeClient computeClient = new ComputeClient(provider);
        VirtualNetworkClient vcnClient = new VirtualNetworkClient(provider);
        BlockstorageClient blockstorageClient = new BlockstorageClient(provider);

        computeClient.setRegion(Region.US_PHOENIX_1);
        vcnClient.setRegion(Region.US_PHOENIX_1);
        blockstorageClient.setRegion(Region.US_PHOENIX_1);

        // TODO: For this example we're just using the first AD returned.
        // You'll probably want different logic around which AD to use
        List<AvailabilityDomain> availabilityDomains =
                getAvailabilityDomains(provider, compartmentId);
        AvailabilityDomain adToUse = availabilityDomains.get(0);

        List<Image> images = getImages(provider, computeClient, compartmentId);
        List<Shape> shapes = getShapes(provider, computeClient, compartmentId);

        Image image = null;
        for (Image item : images) {
            if (item.getDisplayName().equals("Oracle-Linux-7.4-2018.01.20-0")) {
                image = item;
                break;
            }
        }

        Shape shape = null;
        for (Shape item : shapes) {
            if (item.getShape().equals("VM.Standard1.1")) {
                shape = item;
                break;
            }
        }

        if (image == null || shape == null) {
            throw new NullPointerException("Image or shape was not found.");
        }

        Vcn vcn = createVcn(vcnClient, compartmentId, vcnDisplayName, networkCidrBlock);

        // TODO: If you don't want to connect the created instance to the public internet
        // remove the lines below that create an internet gateway and add that gateway to the VCN route table
        InternetGateway internetGateway =
                createInternetGateway(
                        vcnClient, compartmentId, internetGatewayDisplayName, vcn.getId());

        addInternetGatewayToRouteTable(
                vcnClient, compartmentId, vcn.getDefaultRouteTableId(), internetGateway);

        // TODO: To launch instances in a regional subnet, replace "adToUse" with null.
        Subnet subnet =
                createSubnet(
                        vcnClient,
                        compartmentId,
                        adToUse,
                        subnetDisplayName,
                        networkCidrBlock,
                        vcn.getId(),
                        vcn.getDefaultRouteTableId());

        // Wait for subnet to be available
        vcnClient
                .getWaiters()
                .forSubnet(
                        GetSubnetRequest.builder().subnetId(subnet.getId()).build(),
                        Subnet.LifecycleState.Available)
                .execute();

        // TODO: For this example we're just using the first image and shape returned.
        // You'll probably want different logic around which of each of these to use
        Instance instance =
                createInstance(
                        computeClient,
                        compartmentId,
                        adToUse,
                        instanceDisplayName,
                        image,
                        shape,
                        subnet,
                        sshPublicKey,
                        kmsKeyId);

        System.out.println("Instance is being created via image id and kms key id...");

        instance = waitForInstanceProvisioningToComplete(computeClient, instance.getId());

        System.out.println("Instance is provisioned.");

        printMonitoringStatus(instance);

        InstanceSourceViaImageDetails sourceDetails =
                (InstanceSourceViaImageDetails) instance.getSourceDetails();

        BootVolume bootVolume =
                createBootVolume(
                        blockstorageClient,
                        adToUse,
                        sourceDetails,
                        instance.getImageId(),
                        bootVolumeDisplayName,
                        compartmentId,
                        kmsKeyId);

        System.out.println("New bootVolume is provisioning...");

        bootVolume = waitForBootVolumeToBeReady(blockstorageClient, bootVolume.getId());

        System.out.println("New bootVolume is provisioned...");

        System.out.println("Provisioning a new instance via boot volume");
        Instance instance2 =
                createInstanceFromBootVolume(
                        computeClient,
                        compartmentId,
                        adToUse,
                        instanceDisplayName + "2",
                        bootVolume.getId(),
                        shapes.get(0),
                        subnet,
                        sshPublicKey);

        System.out.println("Instance 2 is provisioned.");
        printMonitoringStatus(instance2);

        blockstorageClient.close();
        computeClient.close();
        vcnClient.close();
    }

    private static void printMonitoringStatus(Instance instance) {
        boolean monitoringEnabled =
                instance.getAgentConfig() != null
                        && !instance.getAgentConfig().getIsMonitoringDisabled();
        if (monitoringEnabled) {
            System.out.println("Instance " + instance.getId() + " has Monitoring Enabled");
        } else {
            System.out.println("Instance " + instance.getId() + " has Monitoring Disabled");
        }
    }

    public static Vcn createVcn(
            VirtualNetworkClient vcnClient,
            String compartmentId,
            String vcnName,
            String cidrBlock) {

        CreateVcnResponse response =
                vcnClient.createVcn(
                        CreateVcnRequest.builder()
                                .createVcnDetails(
                                        CreateVcnDetails.builder()
                                                .cidrBlock(cidrBlock)
                                                .compartmentId(compartmentId)
                                                .displayName(vcnName)
                                                .build())
                                .build());

        return response.getVcn();
    }

    public static InternetGateway createInternetGateway(
            VirtualNetworkClient vcnClient,
            String compartmentId,
            String internetGatewayName,
            String vcnId) {

        CreateInternetGatewayResponse response =
                vcnClient.createInternetGateway(
                        CreateInternetGatewayRequest.builder()
                                .createInternetGatewayDetails(
                                        CreateInternetGatewayDetails.builder()
                                                .compartmentId(compartmentId)
                                                .displayName(internetGatewayName)
                                                .isEnabled(true)
                                                .vcnId(vcnId)
                                                .build())
                                .build());

        return response.getInternetGateway();
    }

    public static void addInternetGatewayToRouteTable(
            VirtualNetworkClient vcnClient,
            String compartmentId,
            String routeTableId,
            InternetGateway internetGateway) {

        List<RouteRule> routeRules = new ArrayList<RouteRule>();
        RouteRule internetAccessRoute =
                RouteRule.builder()
                        .cidrBlock("0.0.0.0/0")
                        .destination(internetGateway.getId())
                        .build();
        routeRules.add(internetAccessRoute);

        vcnClient.updateRouteTable(
                UpdateRouteTableRequest.builder()
                        .updateRouteTableDetails(
                                UpdateRouteTableDetails.builder().routeRules(routeRules).build())
                        .rtId(routeTableId)
                        .build());
    }

    public static Subnet createSubnet(
            VirtualNetworkClient vcnClient,
            String compartmentId,
            AvailabilityDomain availabilityDomain,
            String subnetName,
            String cidrBlock,
            String vcnId,
            String routeTableId) {

        CreateSubnetResponse response =
                vcnClient.createSubnet(
                        CreateSubnetRequest.builder()
                                .createSubnetDetails(
                                        CreateSubnetDetails.builder()
                                                .availabilityDomain(availabilityDomain.getName())
                                                .compartmentId(compartmentId)
                                                .displayName(subnetName)
                                                .cidrBlock(cidrBlock)
                                                .vcnId(vcnId)
                                                .routeTableId(routeTableId)
                                                .build())
                                .build());

        return response.getSubnet();
    }

    public static Instance createInstance(
            ComputeClient computeClient,
            String compartmentId,
            AvailabilityDomain availabilityDomain,
            String instanceName,
            Image image,
            Shape shape,
            Subnet subnet,
            String sshPublicKey,
            String kmsKeyId) {

        Map<String, String> metadata = new HashMap<>();
        metadata.put("ssh_authorized_keys", sshPublicKey);

        InstanceSourceViaImageDetails details =
                (Strings.isNullOrEmpty(kmsKeyId))
                        ? InstanceSourceViaImageDetails.builder().imageId(image.getId()).build()
                        : InstanceSourceViaImageDetails.builder()
                                .imageId(image.getId())
                                .kmsKeyId(kmsKeyId)
                                .build();

        LaunchInstanceResponse response =
                computeClient.launchInstance(
                        LaunchInstanceRequest.builder()
                                .launchInstanceDetails(
                                        LaunchInstanceDetails.builder()
                                                .availabilityDomain(availabilityDomain.getName())
                                                .compartmentId(compartmentId)
                                                .displayName(instanceName)
                                                .faultDomain("FAULT-DOMAIN-1") // optional parameter
                                                .metadata(metadata)
                                                .shape(shape.getShape())
                                                .sourceDetails(details)
                                                .createVnicDetails(
                                                        CreateVnicDetails.builder()
                                                                .subnetId(subnet.getId())
                                                                .build())
                                                // agentConfig is an optional parameter
                                                .agentConfig(
                                                        LaunchInstanceAgentConfigDetails.builder()
                                                                .isMonitoringDisabled(false)
                                                                .build())
                                                .build())
                                .build());

        return response.getInstance();
    }

    public static List<AvailabilityDomain> getAvailabilityDomains(
            AuthenticationDetailsProvider provider, String compartmentId) throws Exception {

        Identity identityClient = new IdentityClient(provider);
        identityClient.setRegion(Region.US_PHOENIX_1);

        ListAvailabilityDomainsResponse listAvailabilityDomainsResponse =
                identityClient.listAvailabilityDomains(
                        ListAvailabilityDomainsRequest.builder()
                                .compartmentId(compartmentId)
                                .build());

        identityClient.close();

        return listAvailabilityDomainsResponse.getItems();
    }

    public static List<Image> getImages(
            AuthenticationDetailsProvider provider,
            ComputeClient computeClient,
            String compartmentId)
            throws Exception {

        ListImagesResponse response =
                computeClient.listImages(
                        ListImagesRequest.builder().compartmentId(compartmentId).build());

        return response.getItems();
    }

    public static List<Shape> getShapes(
            AuthenticationDetailsProvider provider,
            ComputeClient computeClient,
            String compartmentId)
            throws Exception {

        ListShapesResponse response =
                computeClient.listShapes(
                        ListShapesRequest.builder().compartmentId(compartmentId).build());

        return response.getItems();
    }

    public static Instance waitForInstanceProvisioningToComplete(
            ComputeClient computeClient, String instanceId) throws Exception {

        ComputeWaiters waiter = computeClient.getWaiters();
        GetInstanceResponse response =
                waiter.forInstance(
                                GetInstanceRequest.builder().instanceId(instanceId).build(),
                                Instance.LifecycleState.Running)
                        .execute();

        return response.getInstance();
    }

    private static BootVolume createBootVolume(
            BlockstorageClient blockstorageClient,
            AvailabilityDomain adToUse,
            InstanceSourceViaImageDetails sourceDetails,
            String imageId,
            String displayName,
            String compartmentId,
            String kmsKeyId) {
        List<BootVolume> bootVolumes =
                blockstorageClient
                        .listBootVolumes(
                                ListBootVolumesRequest.builder()
                                        .availabilityDomain(adToUse.getName())
                                        .compartmentId(compartmentId)
                                        .build())
                        .getItems();
        String bootVolumeId = null;
        for (BootVolume bootVolume : bootVolumes) {
            if (bootVolume.getLifecycleState().equals(BootVolume.LifecycleState.Available)
                    && bootVolume.getImageId() != null
                    && bootVolume.getImageId().equals(imageId)) {
                bootVolumeId = bootVolume.getId();
                break;
            }
        }

        BootVolumeSourceDetails bootVolumeSourceDetails =
                BootVolumeSourceFromBootVolumeDetails.builder().id(bootVolumeId).build();
        CreateBootVolumeDetails details =
                CreateBootVolumeDetails.builder()
                        .availabilityDomain(adToUse.getName())
                        .compartmentId(compartmentId)
                        .displayName(displayName)
                        .sourceDetails(bootVolumeSourceDetails)
                        .kmsKeyId(kmsKeyId)
                        .build();

        return blockstorageClient
                .createBootVolume(
                        CreateBootVolumeRequest.builder().createBootVolumeDetails(details).build())
                .getBootVolume();
    }

    private static BootVolume waitForBootVolumeToBeReady(
            BlockstorageClient blockStorage, String bootVolumeId) throws Exception {

        BlockstorageWaiters waiter = blockStorage.getWaiters();
        GetBootVolumeResponse response =
                waiter.forBootVolume(
                                GetBootVolumeRequest.builder().bootVolumeId(bootVolumeId).build(),
                                BootVolume.LifecycleState.Available)
                        .execute();

        return response.getBootVolume();
    }

    private static Instance createInstanceFromBootVolume(
            ComputeClient computeClient,
            String compartmentId,
            AvailabilityDomain adToUse,
            String instanceName,
            String bootVolumeId,
            Shape shape,
            Subnet subnet,
            String sshPublicKey) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put("ssh_authorized_keys", sshPublicKey);

        InstanceSourceViaBootVolumeDetails details =
                InstanceSourceViaBootVolumeDetails.builder().bootVolumeId(bootVolumeId).build();

        LaunchInstanceResponse response =
                computeClient.launchInstance(
                        LaunchInstanceRequest.builder()
                                .launchInstanceDetails(
                                        LaunchInstanceDetails.builder()
                                                .availabilityDomain(adToUse.getName())
                                                .compartmentId(compartmentId)
                                                .displayName(instanceName)
                                                .faultDomain("FAULT-DOMAIN-1") // optional parameter
                                                .sourceDetails(details)
                                                .metadata(metadata)
                                                .shape(shape.getShape())
                                                .subnetId(subnet.getId())
                                                .agentConfig(
                                                        LaunchInstanceAgentConfigDetails.builder()
                                                                .isMonitoringDisabled(true)
                                                                .build())
                                                .build())
                                .build());

        return response.getInstance();
    }
}
