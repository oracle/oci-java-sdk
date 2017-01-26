/**
 * Copyright (c) 2016-2017 Oracle and/or its affiliates. All rights reserved.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.ComputeClient;
import com.oracle.bmc.core.ComputeWaiters;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.CreateInternetGatewayDetails;
import com.oracle.bmc.core.model.CreateSubnetDetails;
import com.oracle.bmc.core.model.CreateVcnDetails;
import com.oracle.bmc.core.model.Image;
import com.oracle.bmc.core.model.Instance;
import com.oracle.bmc.core.model.InternetGateway;
import com.oracle.bmc.core.model.LaunchInstanceDetails;
import com.oracle.bmc.core.model.RouteRule;
import com.oracle.bmc.core.model.Shape;
import com.oracle.bmc.core.model.Subnet;
import com.oracle.bmc.core.model.UpdateRouteTableDetails;
import com.oracle.bmc.core.model.Vcn;
import com.oracle.bmc.core.requests.CreateInternetGatewayRequest;
import com.oracle.bmc.core.requests.CreateSubnetRequest;
import com.oracle.bmc.core.requests.CreateVcnRequest;
import com.oracle.bmc.core.requests.GetInstanceRequest;
import com.oracle.bmc.core.requests.LaunchInstanceRequest;
import com.oracle.bmc.core.requests.ListImagesRequest;
import com.oracle.bmc.core.requests.ListShapesRequest;
import com.oracle.bmc.core.requests.UpdateRouteTableRequest;
import com.oracle.bmc.core.responses.CreateInternetGatewayResponse;
import com.oracle.bmc.core.responses.CreateSubnetResponse;
import com.oracle.bmc.core.responses.CreateVcnResponse;
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

        String configurationFilePath = "~/.oraclebmc/config";
        String profile = "DEFAULT";

        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

        ComputeClient computeClient = new ComputeClient(provider);
        VirtualNetworkClient vcnClient = new VirtualNetworkClient(provider);

        vcnClient.setRegion(Region.US_PHOENIX_1);
        computeClient.setRegion(Region.US_PHOENIX_1);

        // TODO: For this example we're just using the first AD returned.
        // You'll probably want different logic around which AD to use
        List<AvailabilityDomain> availabilityDomains =
                getAvailabilityDomains(provider, compartmentId);
        AvailabilityDomain adToUse = availabilityDomains.get(0);

        List<Image> images = getImages(provider, computeClient, compartmentId);
        List<Shape> shapes = getShapes(provider, computeClient, compartmentId);

        Vcn vcn = createVcn(vcnClient, compartmentId, vcnDisplayName, networkCidrBlock);

        // TODO: If you don't want to connect the created instance to the public internet
        // remove the lines below that create an internet gateway and add that gateway to the VCN route table
        InternetGateway internetGateway =
                createInternetGateway(
                        vcnClient, compartmentId, internetGatewayDisplayName, vcn.getId());

        addInternetGatewayToRouteTable(
                vcnClient, compartmentId, vcn.getDefaultRouteTableId(), internetGateway);

        Subnet subnet =
                createSubnet(
                        vcnClient,
                        compartmentId,
                        adToUse,
                        subnetDisplayName,
                        networkCidrBlock,
                        vcn.getId(),
                        vcn.getDefaultRouteTableId());

        // TODO: For this example we're just using the first image and shape returned.
        // You'll probably want different logic around which of each of these to use
        Instance instance =
                createInstance(
                        computeClient,
                        compartmentId,
                        adToUse,
                        instanceDisplayName,
                        images.get(0),
                        shapes.get(0),
                        subnet,
                        sshPublicKey);

        System.out.println("Instance is provisioning...");

        instance = waitForInstanceProvisioningToComplete(computeClient, instance.getId());

        computeClient.close();
        vcnClient.close();

        System.out.println("Instance is provisioned:");
        System.out.println(instance);
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
        RouteRule internetAccessRoute = new RouteRule("0.0.0.0/0", internetGateway.getId());
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
            String sshPublicKey) {

        Map<String, String> metadata = new HashMap<>();
        metadata.put("ssh_authorized_keys", sshPublicKey);

        LaunchInstanceResponse response =
                computeClient.launchInstance(
                        LaunchInstanceRequest.builder()
                                .launchInstanceDetails(
                                        LaunchInstanceDetails.builder()
                                                .availabilityDomain(availabilityDomain.getName())
                                                .compartmentId(compartmentId)
                                                .displayName(instanceName)
                                                .imageId(image.getId())
                                                .metadata(metadata)
                                                .shape(shape.getShape())
                                                .subnetId(subnet.getId())
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
}
