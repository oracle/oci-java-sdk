/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.google.common.base.Strings;
import com.google.common.collect.ImmutableMap;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.BlockstorageClient;
import com.oracle.bmc.core.ComputeClient;
import com.oracle.bmc.core.ComputeWaiters;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.AddNetworkSecurityGroupSecurityRulesDetails;
import com.oracle.bmc.core.model.AddSecurityRuleDetails;
import com.oracle.bmc.core.model.AddSecurityRuleDetails.Direction;
import com.oracle.bmc.core.model.AddSecurityRuleDetails.SourceType;
import com.oracle.bmc.core.model.BootVolume;
import com.oracle.bmc.core.model.BootVolumeSourceDetails;
import com.oracle.bmc.core.model.BootVolumeSourceFromBootVolumeDetails;
import com.oracle.bmc.core.model.CreateBootVolumeDetails;
import com.oracle.bmc.core.model.CreateInternetGatewayDetails;
import com.oracle.bmc.core.model.CreateNetworkSecurityGroupDetails;
import com.oracle.bmc.core.model.CreateSubnetDetails;
import com.oracle.bmc.core.model.CreateVcnDetails;
import com.oracle.bmc.core.model.CreateVnicDetails;
import com.oracle.bmc.core.model.Image;
import com.oracle.bmc.core.model.Instance;
import com.oracle.bmc.core.model.InstanceAgentConfig;
import com.oracle.bmc.core.model.InstanceSourceViaBootVolumeDetails;
import com.oracle.bmc.core.model.InstanceSourceViaImageDetails;
import com.oracle.bmc.core.model.InternetGateway;
import com.oracle.bmc.core.model.LaunchInstanceDetails;
import com.oracle.bmc.core.model.LaunchInstanceAgentConfigDetails;
import com.oracle.bmc.core.model.NetworkSecurityGroup;
import com.oracle.bmc.core.model.PortRange;
import com.oracle.bmc.core.model.RemoveNetworkSecurityGroupSecurityRulesDetails;
import com.oracle.bmc.core.model.RouteRule;
import com.oracle.bmc.core.model.RouteTable;
import com.oracle.bmc.core.model.SecurityRule;
import com.oracle.bmc.core.model.Shape;
import com.oracle.bmc.core.model.Subnet;
import com.oracle.bmc.core.model.TcpOptions;
import com.oracle.bmc.core.model.UpdateRouteTableDetails;
import com.oracle.bmc.core.model.Vcn;
import com.oracle.bmc.core.model.Vnic;
import com.oracle.bmc.core.model.VnicAttachment;
import com.oracle.bmc.core.requests.AddNetworkSecurityGroupSecurityRulesRequest;
import com.oracle.bmc.core.requests.CreateBootVolumeRequest;
import com.oracle.bmc.core.requests.CreateInternetGatewayRequest;
import com.oracle.bmc.core.requests.CreateNetworkSecurityGroupRequest;
import com.oracle.bmc.core.requests.CreateSubnetRequest;
import com.oracle.bmc.core.requests.CreateVcnRequest;
import com.oracle.bmc.core.requests.DeleteInternetGatewayRequest;
import com.oracle.bmc.core.requests.DeleteNetworkSecurityGroupRequest;
import com.oracle.bmc.core.requests.DeleteSubnetRequest;
import com.oracle.bmc.core.requests.DeleteVcnRequest;
import com.oracle.bmc.core.requests.GetBootVolumeRequest;
import com.oracle.bmc.core.requests.GetInstanceRequest;
import com.oracle.bmc.core.requests.GetInternetGatewayRequest;
import com.oracle.bmc.core.requests.GetNetworkSecurityGroupRequest;
import com.oracle.bmc.core.requests.GetRouteTableRequest;
import com.oracle.bmc.core.requests.GetSubnetRequest;
import com.oracle.bmc.core.requests.GetVcnRequest;
import com.oracle.bmc.core.requests.GetVnicRequest;
import com.oracle.bmc.core.requests.LaunchInstanceRequest;
import com.oracle.bmc.core.requests.ListBootVolumesRequest;
import com.oracle.bmc.core.requests.ListImagesRequest;
import com.oracle.bmc.core.requests.ListNetworkSecurityGroupSecurityRulesRequest;
import com.oracle.bmc.core.requests.ListShapesRequest;
import com.oracle.bmc.core.requests.ListVnicAttachmentsRequest;
import com.oracle.bmc.core.requests.RemoveNetworkSecurityGroupSecurityRulesRequest;
import com.oracle.bmc.core.requests.TerminateInstanceRequest;
import com.oracle.bmc.core.requests.UpdateRouteTableRequest;
import com.oracle.bmc.core.responses.CreateBootVolumeResponse;
import com.oracle.bmc.core.responses.CreateInternetGatewayResponse;
import com.oracle.bmc.core.responses.CreateNetworkSecurityGroupResponse;
import com.oracle.bmc.core.responses.CreateSubnetResponse;
import com.oracle.bmc.core.responses.CreateVcnResponse;
import com.oracle.bmc.core.responses.GetBootVolumeResponse;
import com.oracle.bmc.core.responses.GetInstanceResponse;
import com.oracle.bmc.core.responses.GetInternetGatewayResponse;
import com.oracle.bmc.core.responses.GetNetworkSecurityGroupResponse;
import com.oracle.bmc.core.responses.GetRouteTableResponse;
import com.oracle.bmc.core.responses.GetSubnetResponse;
import com.oracle.bmc.core.responses.GetVcnResponse;
import com.oracle.bmc.core.responses.GetVnicResponse;
import com.oracle.bmc.core.responses.LaunchInstanceResponse;
import com.oracle.bmc.core.responses.ListBootVolumesResponse;
import com.oracle.bmc.core.responses.ListImagesResponse;
import com.oracle.bmc.core.responses.ListNetworkSecurityGroupSecurityRulesResponse;
import com.oracle.bmc.core.responses.ListShapesResponse;
import com.oracle.bmc.core.responses.ListVnicAttachmentsResponse;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.AvailabilityDomain;
import com.oracle.bmc.identity.requests.ListAvailabilityDomainsRequest;
import com.oracle.bmc.identity.responses.ListAvailabilityDomainsResponse;
import com.oracle.bmc.workrequests.WorkRequestClient;

public class CreateInstanceExample {
    private static final String PROFILE_DEFAULT = "DEFAULT";
    private static final String OPERATING_SYSTEM = "Oracle Linux";

    /**
     * This sample provides a basic example of how to launch an instance using the Java SDK.
     *
     * It will do the following things:
     * 1) Prepare VCN, Subnet, Internet gateway, and Network Security Group for VMs.
     * 2) Create a VM instance in VCN from Image and KMS key.
     * 3) Create a new boot volume based on existing boot volume.
     * 4) Launch another instance based on the newly created boot volume.
     *
     * Please refer to https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/launchinginstance.htm for more
     * information about what is necessary for using API to launch a VM instance.
     *
     * This script takes the following arguments:
     *
     * 1) The compartment which owns the instance
     * 2) The network CIDR block for the VCN and subnet (these will use the same CIDR)
     * 3) The path to the public SSH key which can be used for SSH-ing into the instance
     * 4) The OCID of the KMS key used to encrypt boot volume (optional)
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        if (args.length < 3) {
            throw new IllegalArgumentException(
                    "Invalid number of arguments provided to the script.");
        }

        String compartmentId = args[0];
        String networkCidrBlock = args[1];
        String sshPublicKey = new String(Files.readAllBytes(Paths.get(args[2])));

        // When an instance is created, a boot volume is created at the same time. User could choose to use
        // their own kms key to encrypt the data. Pass the valid OCID of your KMS key through arguments to
        // enable boot volume encryption. Otherwise, leave it to null.
        //
        // Please refer to https://cloud.oracle.com/storage/block-volume/faq for more information.
        String kmsKeyId = (args.length > 3) ? args[3] : null;

        // Read config from the profile DEFAULT in the file "~/.oci/config". You can switch to different profile.
        AuthenticationDetailsProvider authenticationDetailsProvider =
                new ConfigFileAuthenticationDetailsProvider(PROFILE_DEFAULT);

        IdentityClient identityClient =
                IdentityClient.builder().build(authenticationDetailsProvider);
        identityClient.setRegion(Region.US_PHOENIX_1);

        ComputeClient computeClient = ComputeClient.builder().build(authenticationDetailsProvider);
        computeClient.setRegion(Region.US_PHOENIX_1);
        WorkRequestClient workRequestClient =
                WorkRequestClient.builder().build(authenticationDetailsProvider);
        workRequestClient.setRegion(Region.US_PHOENIX_1);
        ComputeWaiters computeWaiters = computeClient.newWaiters(workRequestClient);

        VirtualNetworkClient virtualNetworkClient =
                VirtualNetworkClient.builder().build(authenticationDetailsProvider);
        virtualNetworkClient.setRegion(Region.US_PHOENIX_1);

        BlockstorageClient blockstorageClient =
                BlockstorageClient.builder().build(authenticationDetailsProvider);
        blockstorageClient.setRegion(Region.US_PHOENIX_1);

        AvailabilityDomain availablityDomain =
                getAvailabilityDomains(identityClient, compartmentId);
        Shape shape = getShape(computeClient, compartmentId, availablityDomain);
        Image image = getImage(computeClient, compartmentId, shape);

        Vcn vcn = null;
        InternetGateway internetGateway = null;
        Subnet subnet = null;
        NetworkSecurityGroup networkSecurityGroup = null;
        LaunchInstanceDetails launchInstanceDetails = null;
        Instance instance = null;
        Instance instanceFromBootVolume = null;
        BootVolume bootVolume = null;
        try {
            vcn = createVcn(virtualNetworkClient, compartmentId, networkCidrBlock);

            // The Internet Gateway with updated Route Rules will enable the instance to connect to the public
            // internet. If it is not desired, remove the following two lines below that create an internet
            // gateway and add that internet gateway to the VCN route table.
            internetGateway = createInternetGateway(virtualNetworkClient, compartmentId, vcn);
            addInternetGatewayToDefaultRouteTable(virtualNetworkClient, vcn, internetGateway);

            subnet =
                    createSubnet(
                            virtualNetworkClient,
                            compartmentId,
                            availablityDomain,
                            networkCidrBlock,
                            vcn);

            // The Network Security Group with Security Rules will allow external HTTP traffic go to the instance
            // through port 80. The HTTP server hosted on the instance will be open to the public. You update
            // the Security Rules with your need accordingly.
            networkSecurityGroup =
                    createNetworkSecurityGroup(virtualNetworkClient, compartmentId, vcn);
            addNetworkSecurityGroupSecurityRules(
                    virtualNetworkClient, networkSecurityGroup, networkCidrBlock);

            System.out.println("Instance is being created via image and KMS key ...");
            launchInstanceDetails =
                    createLaunchInstanceDetails(
                            compartmentId,
                            availablityDomain,
                            shape,
                            image,
                            subnet,
                            networkSecurityGroup,
                            sshPublicKey,
                            kmsKeyId);
            instance = createInstance(computeWaiters, launchInstanceDetails);
            printInstance(computeClient, virtualNetworkClient, instance);

            System.out.println("Instance is being created via boot volume ...");
            // This boot volume is created based on the boot volume of previous instance which needs to be running
            bootVolume =
                    createBootVolume(
                            blockstorageClient, compartmentId, availablityDomain, image, kmsKeyId);
            launchInstanceDetails =
                    createLaunchInstanceDetailsFromBootVolume(launchInstanceDetails, bootVolume);
            instanceFromBootVolume = createInstance(computeWaiters, launchInstanceDetails);
            printInstance(computeClient, virtualNetworkClient, instanceFromBootVolume);

        } finally {
            if (instanceFromBootVolume != null) {
                terminateInstance(computeClient, instanceFromBootVolume);
            }
            if (instance != null) {
                terminateInstance(computeClient, instance);
            }
            if (networkSecurityGroup != null) {
                clearNetworkSecurityGroupSecurityRules(virtualNetworkClient, networkSecurityGroup);
                deleteNetworkSecurityGroup(virtualNetworkClient, networkSecurityGroup);
            }
            if (internetGateway != null) {
                clearRouteRulesFromDefaultRouteTable(virtualNetworkClient, vcn);
                deleteInternetGateway(virtualNetworkClient, internetGateway);
            }
            if (subnet != null) {
                deleteSubnet(virtualNetworkClient, subnet);
            }
            if (vcn != null) {
                deleteVcn(virtualNetworkClient, vcn);
            }

            identityClient.close();
            computeClient.close();
            workRequestClient.close();
            virtualNetworkClient.close();
            blockstorageClient.close();
        }
    }

    private static AvailabilityDomain getAvailabilityDomains(
            IdentityClient identityClient, String compartmentId) throws Exception {
        ListAvailabilityDomainsResponse listAvailabilityDomainsResponse =
                identityClient.listAvailabilityDomains(
                        ListAvailabilityDomainsRequest.builder()
                                .compartmentId(compartmentId)
                                .build());
        List<AvailabilityDomain> availabilityDomains = listAvailabilityDomainsResponse.getItems();
        // For demonstration, we just return the first availability domain but for Production code you should
        // have a better way of determining what is needed
        AvailabilityDomain availabilityDomain = availabilityDomains.get(0);

        System.out.println("Found Availability Domain: " + availabilityDomain.getName());
        System.out.println();

        return availabilityDomain;
    }

    private static Shape getShape(
            ComputeClient computeClient,
            String compartmentId,
            AvailabilityDomain availabilityDomain) {
        ListShapesRequest listShapesRequest =
                ListShapesRequest.builder()
                        .availabilityDomain(availabilityDomain.getName())
                        .compartmentId(compartmentId)
                        .build();
        ListShapesResponse listShapesResponse = computeClient.listShapes(listShapesRequest);
        List<Shape> shapes = listShapesResponse.getItems();
        if (shapes.isEmpty()) {
            throw new IllegalStateException("No available shape was found.");
        }
        List<Shape> vmShapes =
                shapes.stream()
                        .filter(shape -> shape.getShape().startsWith("VM"))
                        .collect(Collectors.toList());
        if (vmShapes.isEmpty()) {
            throw new IllegalStateException("No available VM shape was found.");
        }
        // For demonstration, we just return the first shape but for Production code you should have a better
        // way of determining what is needed
        Shape shape = vmShapes.get(0);

        System.out.println("Found Shape: " + shape.getShape());
        System.out.println();

        return shape;
    }

    private static Image getImage(ComputeClient computeClient, String compartmentId, Shape shape)
            throws Exception {
        ListImagesRequest listImagesRequest =
                ListImagesRequest.builder()
                        .shape(shape.getShape())
                        .compartmentId(compartmentId)
                        .operatingSystem(OPERATING_SYSTEM)
                        .build();
        ListImagesResponse response = computeClient.listImages(listImagesRequest);
        List<Image> images = response.getItems();
        if (images.isEmpty()) {
            throw new IllegalStateException("No available image was found.");
        }

        // For demonstration, we just return the first image but for Production code you should have a better
        // way of determining what is needed.
        //
        // Note the latest version of the images for the same operating system is returned firstly.
        Image image = images.get(0);

        System.out.println("Found Image: " + image.getDisplayName());
        System.out.println();

        return image;
    }

    private static Vcn createVcn(
            VirtualNetworkClient virtualNetworkClient, String compartmentId, String cidrBlock)
            throws Exception {
        String vcnName = "java-sdk-example-vcn";
        CreateVcnDetails createVcnDetails =
                CreateVcnDetails.builder()
                        .cidrBlock(cidrBlock)
                        .compartmentId(compartmentId)
                        .displayName(vcnName)
                        .build();
        CreateVcnRequest createVcnRequest =
                CreateVcnRequest.builder().createVcnDetails(createVcnDetails).build();
        CreateVcnResponse createVcnResponse = virtualNetworkClient.createVcn(createVcnRequest);

        GetVcnRequest getVcnRequest =
                GetVcnRequest.builder().vcnId(createVcnResponse.getVcn().getId()).build();
        GetVcnResponse getVcnResponse =
                virtualNetworkClient
                        .getWaiters()
                        .forVcn(getVcnRequest, Vcn.LifecycleState.Available)
                        .execute();
        Vcn vcn = getVcnResponse.getVcn();

        System.out.println("Created Vcn: " + vcn.getId());
        System.out.println(vcn);
        System.out.println();

        return vcn;
    }

    private static void deleteVcn(VirtualNetworkClient virtualNetworkClient, Vcn vcn)
            throws Exception {
        DeleteVcnRequest deleteVcnRequest = DeleteVcnRequest.builder().vcnId(vcn.getId()).build();
        virtualNetworkClient.deleteVcn(deleteVcnRequest);

        GetVcnRequest getVcnRequest = GetVcnRequest.builder().vcnId(vcn.getId()).build();
        virtualNetworkClient
                .getWaiters()
                .forVcn(getVcnRequest, Vcn.LifecycleState.Terminated)
                .execute();

        System.out.println("Deleted Vcn: " + vcn.getId());
        System.out.println();
    }

    private static InternetGateway createInternetGateway(
            VirtualNetworkClient virtualNetworkClient, String compartmentId, Vcn vcn)
            throws Exception {
        String internetGatewayName = "java-sdk-example-internet-gateway";
        CreateInternetGatewayDetails createInternetGatewayDetails =
                CreateInternetGatewayDetails.builder()
                        .compartmentId(compartmentId)
                        .displayName(internetGatewayName)
                        .isEnabled(true)
                        .vcnId(vcn.getId())
                        .build();
        CreateInternetGatewayRequest createInternetGatewayRequest =
                CreateInternetGatewayRequest.builder()
                        .createInternetGatewayDetails(createInternetGatewayDetails)
                        .build();
        CreateInternetGatewayResponse createInternetGatewayResponse =
                virtualNetworkClient.createInternetGateway(createInternetGatewayRequest);

        GetInternetGatewayRequest getInternetGatewayRequest =
                GetInternetGatewayRequest.builder()
                        .igId(createInternetGatewayResponse.getInternetGateway().getId())
                        .build();
        GetInternetGatewayResponse getInternetGatewayResponse =
                virtualNetworkClient
                        .getWaiters()
                        .forInternetGateway(
                                getInternetGatewayRequest, InternetGateway.LifecycleState.Available)
                        .execute();
        InternetGateway internetGateway = getInternetGatewayResponse.getInternetGateway();

        System.out.println("Created Internet Gateway: " + internetGateway.getId());
        System.out.println(internetGateway);
        System.out.println();

        return internetGateway;
    }

    private static void deleteInternetGateway(
            VirtualNetworkClient virtualNetworkClient, InternetGateway internetGateway)
            throws Exception {
        DeleteInternetGatewayRequest deleteInternetGatewayRequest =
                DeleteInternetGatewayRequest.builder().igId(internetGateway.getId()).build();
        virtualNetworkClient.deleteInternetGateway(deleteInternetGatewayRequest);

        GetInternetGatewayRequest getInternetGatewayRequest =
                GetInternetGatewayRequest.builder().igId(internetGateway.getId()).build();
        virtualNetworkClient
                .getWaiters()
                .forInternetGateway(
                        getInternetGatewayRequest, InternetGateway.LifecycleState.Terminated)
                .execute();

        System.out.println("Deleted Internet Gateway: " + internetGateway.getId());
        System.out.println();
    }

    private static void addInternetGatewayToDefaultRouteTable(
            VirtualNetworkClient virtualNetworkClient, Vcn vcn, InternetGateway internetGateway)
            throws Exception {
        GetRouteTableRequest getRouteTableRequest =
                GetRouteTableRequest.builder().rtId(vcn.getDefaultRouteTableId()).build();
        GetRouteTableResponse getRouteTableResponse =
                virtualNetworkClient.getRouteTable(getRouteTableRequest);
        List<RouteRule> routeRules = getRouteTableResponse.getRouteTable().getRouteRules();

        System.out.println("Current Route Rules in Default Route Table");
        System.out.println("==========================================");
        routeRules.forEach(System.out::println);
        System.out.println();

        RouteRule internetAccessRoute =
                RouteRule.builder()
                        .destination("0.0.0.0/0")
                        .destinationType(RouteRule.DestinationType.CidrBlock)
                        .networkEntityId(internetGateway.getId())
                        .build();
        routeRules.add(internetAccessRoute);
        UpdateRouteTableDetails updateRouteTableDetails =
                UpdateRouteTableDetails.builder().routeRules(routeRules).build();
        UpdateRouteTableRequest updateRouteTableRequest =
                UpdateRouteTableRequest.builder()
                        .updateRouteTableDetails(updateRouteTableDetails)
                        .rtId(vcn.getDefaultRouteTableId())
                        .build();
        virtualNetworkClient.updateRouteTable(updateRouteTableRequest);

        getRouteTableResponse =
                virtualNetworkClient
                        .getWaiters()
                        .forRouteTable(getRouteTableRequest, RouteTable.LifecycleState.Available)
                        .execute();
        routeRules = getRouteTableResponse.getRouteTable().getRouteRules();

        System.out.println("Updated Route Rules in Default Route Table");
        System.out.println("==========================================");
        routeRules.forEach(System.out::println);
        System.out.println();
    }

    private static void clearRouteRulesFromDefaultRouteTable(
            VirtualNetworkClient virtualNetworkClient, Vcn vcn) throws Exception {
        List<RouteRule> routeRules = new ArrayList<>();
        UpdateRouteTableDetails updateRouteTableDetails =
                UpdateRouteTableDetails.builder().routeRules(routeRules).build();
        UpdateRouteTableRequest updateRouteTableRequest =
                UpdateRouteTableRequest.builder()
                        .updateRouteTableDetails(updateRouteTableDetails)
                        .rtId(vcn.getDefaultRouteTableId())
                        .build();
        virtualNetworkClient.updateRouteTable(updateRouteTableRequest);

        GetRouteTableRequest getRouteTableRequest =
                GetRouteTableRequest.builder().rtId(vcn.getDefaultRouteTableId()).build();
        virtualNetworkClient
                .getWaiters()
                .forRouteTable(getRouteTableRequest, RouteTable.LifecycleState.Available)
                .execute();

        System.out.println("Cleared route rules from route table: " + vcn.getDefaultRouteTableId());
        System.out.println();
    }

    private static Subnet createSubnet(
            VirtualNetworkClient virtualNetworkClient,
            String compartmentId,
            AvailabilityDomain availabilityDomain,
            String networkCidrBlock,
            Vcn vcn)
            throws Exception {
        String subnetName = "java-sdk-example-subnet";

        // In order to launch instances in a regional subnet, build this CreateSubnetDetails with
        // the field availablityDomain set to null.
        CreateSubnetDetails createSubnetDetails =
                CreateSubnetDetails.builder()
                        .availabilityDomain(availabilityDomain.getName())
                        .compartmentId(compartmentId)
                        .displayName(subnetName)
                        .cidrBlock(networkCidrBlock)
                        .vcnId(vcn.getId())
                        .routeTableId(vcn.getDefaultRouteTableId())
                        .build();
        CreateSubnetRequest createSubnetRequest =
                CreateSubnetRequest.builder().createSubnetDetails(createSubnetDetails).build();
        CreateSubnetResponse createSubnetResponse =
                virtualNetworkClient.createSubnet(createSubnetRequest);

        GetSubnetRequest getSubnetRequest =
                GetSubnetRequest.builder()
                        .subnetId(createSubnetResponse.getSubnet().getId())
                        .build();
        GetSubnetResponse getSubnetResponse =
                virtualNetworkClient
                        .getWaiters()
                        .forSubnet(getSubnetRequest, Subnet.LifecycleState.Available)
                        .execute();
        Subnet subnet = getSubnetResponse.getSubnet();

        System.out.println("Created Subnet: " + subnet.getId());
        System.out.println(subnet);
        System.out.println();

        return subnet;
    }

    private static void deleteSubnet(VirtualNetworkClient virtualNetworkClient, Subnet subnet)
            throws Exception {
        DeleteSubnetRequest deleteSubnetRequest =
                DeleteSubnetRequest.builder().subnetId(subnet.getId()).build();
        virtualNetworkClient.deleteSubnet(deleteSubnetRequest);

        GetSubnetRequest getSubnetRequest =
                GetSubnetRequest.builder().subnetId(subnet.getId()).build();
        virtualNetworkClient
                .getWaiters()
                .forSubnet(getSubnetRequest, Subnet.LifecycleState.Terminated)
                .execute();

        System.out.println("Deleted Subnet: " + subnet.getId());
        System.out.println();
    }

    private static NetworkSecurityGroup createNetworkSecurityGroup(
            VirtualNetworkClient virtualNetworkClient, String compartmentId, Vcn vcn)
            throws Exception {
        String networkSecurityGroupName = "java-sdk-example-nsg";
        CreateNetworkSecurityGroupDetails createNetworkSecurityGroupDetails =
                CreateNetworkSecurityGroupDetails.builder()
                        .compartmentId(compartmentId)
                        .displayName(networkSecurityGroupName)
                        .vcnId(vcn.getId())
                        .build();
        CreateNetworkSecurityGroupRequest createNetworkSecurityGroupRequest =
                CreateNetworkSecurityGroupRequest.builder()
                        .createNetworkSecurityGroupDetails(createNetworkSecurityGroupDetails)
                        .build();
        CreateNetworkSecurityGroupResponse createNetworkSecurityGroupResponse =
                virtualNetworkClient.createNetworkSecurityGroup(createNetworkSecurityGroupRequest);

        GetNetworkSecurityGroupRequest getNetworkSecurityGroupRequest =
                GetNetworkSecurityGroupRequest.builder()
                        .networkSecurityGroupId(
                                createNetworkSecurityGroupResponse
                                        .getNetworkSecurityGroup()
                                        .getId())
                        .build();
        GetNetworkSecurityGroupResponse getNetworkSecurityGroupResponse =
                virtualNetworkClient
                        .getWaiters()
                        .forNetworkSecurityGroup(
                                getNetworkSecurityGroupRequest,
                                NetworkSecurityGroup.LifecycleState.Available)
                        .execute();
        NetworkSecurityGroup networkSecurityGroup =
                getNetworkSecurityGroupResponse.getNetworkSecurityGroup();

        System.out.println("Created Network Security Group: " + networkSecurityGroup.getId());
        System.out.println(networkSecurityGroup);
        System.out.println();

        return networkSecurityGroup;
    }

    private static void deleteNetworkSecurityGroup(
            VirtualNetworkClient virtualNetworkClient, NetworkSecurityGroup networkSecurityGroup)
            throws Exception {
        DeleteNetworkSecurityGroupRequest deleteNetworkSecurityGroupRequest =
                DeleteNetworkSecurityGroupRequest.builder()
                        .networkSecurityGroupId(networkSecurityGroup.getId())
                        .build();
        virtualNetworkClient.deleteNetworkSecurityGroup(deleteNetworkSecurityGroupRequest);

        GetNetworkSecurityGroupRequest getNetworkSecurityGroupRequest =
                GetNetworkSecurityGroupRequest.builder()
                        .networkSecurityGroupId(networkSecurityGroup.getId())
                        .build();
        virtualNetworkClient
                .getWaiters()
                .forNetworkSecurityGroup(
                        getNetworkSecurityGroupRequest,
                        NetworkSecurityGroup.LifecycleState.Terminated)
                .execute();

        System.out.println("Deleted Network Security Group: " + networkSecurityGroup.getId());
        System.out.println();
    }

    private static void addNetworkSecurityGroupSecurityRules(
            VirtualNetworkClient virtualNetworkClient,
            NetworkSecurityGroup networkSecurityGroup,
            String networkCidrBlock) {
        ListNetworkSecurityGroupSecurityRulesRequest listNetworkSecurityGroupSecurityRulesRequest =
                ListNetworkSecurityGroupSecurityRulesRequest.builder()
                        .networkSecurityGroupId(networkSecurityGroup.getId())
                        .build();
        ListNetworkSecurityGroupSecurityRulesResponse
                listNetworkSecurityGroupSecurityRulesResponse =
                        virtualNetworkClient.listNetworkSecurityGroupSecurityRules(
                                listNetworkSecurityGroupSecurityRulesRequest);
        List<SecurityRule> securityRules = listNetworkSecurityGroupSecurityRulesResponse.getItems();

        System.out.println("Current Security Rules in Network Security Group");
        System.out.println("================================================");
        securityRules.forEach(System.out::println);
        System.out.println();

        AddSecurityRuleDetails addSecurityRuleDetails =
                AddSecurityRuleDetails.builder()
                        .description("Incoming HTTP connections")
                        .direction(Direction.Ingress)
                        .protocol("6")
                        .source(networkCidrBlock)
                        .sourceType(SourceType.CidrBlock)
                        .tcpOptions(
                                TcpOptions.builder()
                                        .destinationPortRange(
                                                PortRange.builder().min(80).max(80).build())
                                        .build())
                        .build();
        AddNetworkSecurityGroupSecurityRulesDetails addNetworkSecurityGroupSecurityRulesDetails =
                AddNetworkSecurityGroupSecurityRulesDetails.builder()
                        .securityRules(Arrays.asList(addSecurityRuleDetails))
                        .build();
        AddNetworkSecurityGroupSecurityRulesRequest addNetworkSecurityGroupSecurityRulesRequest =
                AddNetworkSecurityGroupSecurityRulesRequest.builder()
                        .networkSecurityGroupId(networkSecurityGroup.getId())
                        .addNetworkSecurityGroupSecurityRulesDetails(
                                addNetworkSecurityGroupSecurityRulesDetails)
                        .build();
        virtualNetworkClient.addNetworkSecurityGroupSecurityRules(
                addNetworkSecurityGroupSecurityRulesRequest);

        listNetworkSecurityGroupSecurityRulesResponse =
                virtualNetworkClient.listNetworkSecurityGroupSecurityRules(
                        listNetworkSecurityGroupSecurityRulesRequest);
        securityRules = listNetworkSecurityGroupSecurityRulesResponse.getItems();

        System.out.println("Updated Security Rules in Network Security Group");
        System.out.println("================================================");
        securityRules.forEach(System.out::println);
        System.out.println();
    }

    private static void clearNetworkSecurityGroupSecurityRules(
            VirtualNetworkClient virtualNetworkClient, NetworkSecurityGroup networkSecurityGroup) {
        ListNetworkSecurityGroupSecurityRulesRequest listNetworkSecurityGroupSecurityRulesRequest =
                ListNetworkSecurityGroupSecurityRulesRequest.builder()
                        .networkSecurityGroupId(networkSecurityGroup.getId())
                        .build();
        ListNetworkSecurityGroupSecurityRulesResponse
                listNetworkSecurityGroupSecurityRulesResponse =
                        virtualNetworkClient.listNetworkSecurityGroupSecurityRules(
                                listNetworkSecurityGroupSecurityRulesRequest);
        List<SecurityRule> securityRules = listNetworkSecurityGroupSecurityRulesResponse.getItems();

        List<String> securityRuleIds =
                securityRules.stream().map(SecurityRule::getId).collect(Collectors.toList());
        RemoveNetworkSecurityGroupSecurityRulesDetails
                removeNetworkSecurityGroupSecurityRulesDetails =
                        RemoveNetworkSecurityGroupSecurityRulesDetails.builder()
                                .securityRuleIds(securityRuleIds)
                                .build();
        RemoveNetworkSecurityGroupSecurityRulesRequest
                removeNetworkSecurityGroupSecurityRulesRequest =
                        RemoveNetworkSecurityGroupSecurityRulesRequest.builder()
                                .networkSecurityGroupId(networkSecurityGroup.getId())
                                .removeNetworkSecurityGroupSecurityRulesDetails(
                                        removeNetworkSecurityGroupSecurityRulesDetails)
                                .build();
        virtualNetworkClient.removeNetworkSecurityGroupSecurityRules(
                removeNetworkSecurityGroupSecurityRulesRequest);

        System.out.println(
                "Removed all Security Rules in Network Security Group: "
                        + networkSecurityGroup.getId());
        System.out.println();
    }

    private static Instance createInstance(
            ComputeWaiters computeWaiters, LaunchInstanceDetails launchInstanceDetails)
            throws Exception {
        LaunchInstanceRequest launchInstanceRequest =
                LaunchInstanceRequest.builder()
                        .launchInstanceDetails(launchInstanceDetails)
                        .build();
        LaunchInstanceResponse launchInstanceResponse =
                computeWaiters.forLaunchInstance(launchInstanceRequest).execute();

        GetInstanceRequest getInstanceRequest =
                GetInstanceRequest.builder()
                        .instanceId(launchInstanceResponse.getInstance().getId())
                        .build();
        GetInstanceResponse getInstanceResponse =
                computeWaiters
                        .forInstance(getInstanceRequest, Instance.LifecycleState.Running)
                        .execute();
        Instance instance = getInstanceResponse.getInstance();

        System.out.println("Launched Instance: " + instance.getId());
        System.out.println(instance);
        System.out.println();

        return instance;
    }

    private static LaunchInstanceDetails createLaunchInstanceDetails(
            String compartmentId,
            AvailabilityDomain availabilityDomain,
            Shape shape,
            Image image,
            Subnet subnet,
            NetworkSecurityGroup networkSecurityGroup,
            String sshPublicKey,
            String kmsKeyId) {
        String instanceName = "java-sdk-example-instance";
        Map<String, String> metadata =
                ImmutableMap.<String, String>builder()
                        .put("ssh_authorized_keys", sshPublicKey)
                        .put("java-sdk-example-metadata-key", "java-sdk-example-metadata-value")
                        .build();
        Map<String, Object> extendedMetadata =
                ImmutableMap.<String, Object>builder()
                        .put(
                                "java-sdk-example-extended-metadata-key",
                                "java-sdk-example-extended-metadata-value")
                        .build();
        InstanceSourceViaImageDetails instanceSourceViaImageDetails =
                InstanceSourceViaImageDetails.builder()
                        .imageId(image.getId())
                        .kmsKeyId(Strings.isNullOrEmpty(kmsKeyId) ? null : kmsKeyId)
                        .build();
        CreateVnicDetails createVnicDetails =
                CreateVnicDetails.builder()
                        .subnetId(subnet.getId())
                        .nsgIds(Arrays.asList(networkSecurityGroup.getId()))
                        .build();
        LaunchInstanceAgentConfigDetails launchInstanceAgentConfigDetails =
                LaunchInstanceAgentConfigDetails.builder().isMonitoringDisabled(false).build();
        return LaunchInstanceDetails.builder()
                .availabilityDomain(availabilityDomain.getName())
                .compartmentId(compartmentId)
                .displayName(instanceName)
                // faultDomain is optional parameter
                .faultDomain("FAULT-DOMAIN-1")
                .sourceDetails(instanceSourceViaImageDetails)
                .metadata(metadata)
                .extendedMetadata(extendedMetadata)
                .shape(shape.getShape())
                .createVnicDetails(createVnicDetails)
                // agentConfig is an optional parameter
                .agentConfig(launchInstanceAgentConfigDetails)
                .build();
    }

    private static void terminateInstance(ComputeClient computeClient, Instance instance)
            throws Exception {
        System.out.println("Terminating Instance: " + instance.getId());
        TerminateInstanceRequest terminateInstanceRequest =
                TerminateInstanceRequest.builder().instanceId(instance.getId()).build();
        computeClient.terminateInstance(terminateInstanceRequest);

        GetInstanceRequest getInstanceRequest =
                GetInstanceRequest.builder().instanceId(instance.getId()).build();
        computeClient
                .getWaiters()
                .forInstance(getInstanceRequest, Instance.LifecycleState.Terminated)
                .execute();

        System.out.println("Terminated Instance: " + instance.getId());
        System.out.println();
    }

    private static void printInstance(
            ComputeClient computeClient,
            VirtualNetworkClient virtualNetworkClient,
            Instance instance) {
        ListVnicAttachmentsRequest listVnicAttachmentsRequest =
                ListVnicAttachmentsRequest.builder()
                        .compartmentId(instance.getCompartmentId())
                        .instanceId(instance.getId())
                        .build();
        ListVnicAttachmentsResponse listVnicAttachmentsResponse =
                computeClient.listVnicAttachments(listVnicAttachmentsRequest);
        List<VnicAttachment> vnicAttachments = listVnicAttachmentsResponse.getItems();
        VnicAttachment vnicAttachment = vnicAttachments.get(0);

        GetVnicRequest getVnicRequest =
                GetVnicRequest.builder().vnicId(vnicAttachment.getVnicId()).build();
        GetVnicResponse getVnicResponse = virtualNetworkClient.getVnic(getVnicRequest);
        Vnic vnic = getVnicResponse.getVnic();

        System.out.println("Virtual Network Interface Card :" + vnic.getId());
        System.out.println(vnic);
        System.out.println();

        InstanceAgentConfig instanceAgentConfig = instance.getAgentConfig();
        boolean monitoringEnabled =
                (instanceAgentConfig != null) && !instanceAgentConfig.getIsMonitoringDisabled();
        String monitoringStatus = (monitoringEnabled ? "Enabled" : "Disabled");
        System.out.println("Instance " + instance.getId() + " has monitoring " + monitoringStatus);
        System.out.println();
    }

    private static BootVolume createBootVolume(
            BlockstorageClient blockstorageClient,
            String compartmentId,
            AvailabilityDomain availabilityDomain,
            Image image,
            String kmsKeyId)
            throws Exception {
        String bootVolumeName = "java-sdk-example-boot-volume";
        // find existing boot volume by image
        ListBootVolumesRequest listBootVolumesRequest =
                ListBootVolumesRequest.builder()
                        .availabilityDomain(availabilityDomain.getName())
                        .compartmentId(compartmentId)
                        .build();
        ListBootVolumesResponse listBootVolumesResponse =
                blockstorageClient.listBootVolumes(listBootVolumesRequest);
        List<BootVolume> bootVolumes = listBootVolumesResponse.getItems();
        String bootVolumeId = null;
        for (BootVolume bootVolume : bootVolumes) {
            if (BootVolume.LifecycleState.Available.equals(bootVolume.getLifecycleState())
                    && image.getId().equals(bootVolume.getImageId())) {
                bootVolumeId = bootVolume.getId();
                break;
            }
        }
        System.out.println("Found BootVolume: " + bootVolumeId);

        // create a new boot volume based on existing one
        BootVolumeSourceDetails bootVolumeSourceDetails =
                BootVolumeSourceFromBootVolumeDetails.builder().id(bootVolumeId).build();
        CreateBootVolumeDetails details =
                CreateBootVolumeDetails.builder()
                        .availabilityDomain(availabilityDomain.getName())
                        .compartmentId(compartmentId)
                        .displayName(bootVolumeName)
                        .sourceDetails(bootVolumeSourceDetails)
                        .kmsKeyId(kmsKeyId)
                        .build();
        CreateBootVolumeRequest createBootVolumeRequest =
                CreateBootVolumeRequest.builder().createBootVolumeDetails(details).build();
        CreateBootVolumeResponse createBootVolumeResponse =
                blockstorageClient.createBootVolume(createBootVolumeRequest);
        System.out.println(
                "Provisioning new BootVolume: " + createBootVolumeResponse.getBootVolume().getId());

        // wait for boot volume to be ready
        GetBootVolumeRequest getBootVolumeRequest =
                GetBootVolumeRequest.builder()
                        .bootVolumeId(createBootVolumeResponse.getBootVolume().getId())
                        .build();
        GetBootVolumeResponse getBootVolumeResponse =
                blockstorageClient
                        .getWaiters()
                        .forBootVolume(getBootVolumeRequest, BootVolume.LifecycleState.Available)
                        .execute();
        BootVolume bootVolume = getBootVolumeResponse.getBootVolume();

        System.out.println("Provisioned BootVolume: " + bootVolume.getId());
        System.out.println(bootVolume);
        System.out.println();

        return bootVolume;
    }

    private static LaunchInstanceDetails createLaunchInstanceDetailsFromBootVolume(
            LaunchInstanceDetails launchInstanceDetails, BootVolume bootVolume) throws Exception {
        String bootVolumeName = "java-sdk-example-instance-from-boot-volume";
        InstanceSourceViaBootVolumeDetails instanceSourceViaBootVolumeDetails =
                InstanceSourceViaBootVolumeDetails.builder()
                        .bootVolumeId(bootVolume.getId())
                        .build();
        LaunchInstanceAgentConfigDetails launchInstanceAgentConfigDetails =
                LaunchInstanceAgentConfigDetails.builder().isMonitoringDisabled(true).build();
        return LaunchInstanceDetails.builder()
                .copy(launchInstanceDetails)
                .sourceDetails(instanceSourceViaBootVolumeDetails)
                .agentConfig(launchInstanceAgentConfigDetails)
                .build();
    }
}
