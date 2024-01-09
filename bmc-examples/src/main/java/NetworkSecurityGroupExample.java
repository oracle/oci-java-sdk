/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.ComputeClient;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.AddNetworkSecurityGroupSecurityRulesDetails;
import com.oracle.bmc.core.model.AddSecurityRuleDetails;
import com.oracle.bmc.core.model.AddSecurityRuleDetails.DestinationType;
import com.oracle.bmc.core.model.AddSecurityRuleDetails.Direction;
import com.oracle.bmc.core.model.AddSecurityRuleDetails.SourceType;
import com.oracle.bmc.core.model.AddedNetworkSecurityGroupSecurityRules;
import com.oracle.bmc.core.model.CreateNetworkSecurityGroupDetails;
import com.oracle.bmc.core.model.CreateSubnetDetails;
import com.oracle.bmc.core.model.CreateVcnDetails;
import com.oracle.bmc.core.model.Instance;
import com.oracle.bmc.core.model.NetworkSecurityGroup;
import com.oracle.bmc.core.model.LaunchInstanceDetails;
import com.oracle.bmc.core.model.NetworkSecurityGroup.LifecycleState;
import com.oracle.bmc.core.model.PortRange;
import com.oracle.bmc.core.model.RemoveNetworkSecurityGroupSecurityRulesDetails;
import com.oracle.bmc.core.model.SecurityRule;
import com.oracle.bmc.core.model.Shape;
import com.oracle.bmc.core.model.Subnet;
import com.oracle.bmc.core.model.TcpOptions;
import com.oracle.bmc.core.model.UpdateNetworkSecurityGroupSecurityRulesDetails;
import com.oracle.bmc.core.model.UpdateSecurityRuleDetails;
import com.oracle.bmc.core.model.UpdateVnicDetails;
import com.oracle.bmc.core.model.Vcn;
import com.oracle.bmc.core.requests.AddNetworkSecurityGroupSecurityRulesRequest;
import com.oracle.bmc.core.requests.CreateNetworkSecurityGroupRequest;
import com.oracle.bmc.core.requests.DeleteNetworkSecurityGroupRequest;
import com.oracle.bmc.core.requests.GetNetworkSecurityGroupRequest;
import com.oracle.bmc.core.requests.ListNetworkSecurityGroupSecurityRulesRequest;
import com.oracle.bmc.core.requests.ListNetworkSecurityGroupVnicsRequest;
import com.oracle.bmc.core.requests.ListVnicAttachmentsRequest;
import com.oracle.bmc.core.requests.RemoveNetworkSecurityGroupSecurityRulesRequest;
import com.oracle.bmc.core.requests.UpdateNetworkSecurityGroupSecurityRulesRequest;
import com.oracle.bmc.core.requests.UpdateVnicRequest;
import com.oracle.bmc.core.responses.GetNetworkSecurityGroupResponse;
import com.oracle.bmc.core.responses.ListNetworkSecurityGroupSecurityRulesResponse;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.AvailabilityDomain;
import com.oracle.bmc.identity.requests.ListAvailabilityDomainsRequest;
import com.oracle.bmc.identity.responses.ListAvailabilityDomainsResponse;
import com.oracle.bmc.retrier.Retriers;
import com.oracle.bmc.retrier.RetryConfiguration;
import com.oracle.bmc.waiter.MaxAttemptsTerminationStrategy;
import java.util.Arrays;
import java.util.List;
import shared.ExampleComputeHelper;
import shared.ExampleVcnHelper;

/**
 * This class provides an example of how to manage an NetworkSecurityGroup including managing rules
 * on it and associating vnics to it.
 *
 * <p>In order to demonstrate functionality, this script will create a VCN, subnet and an instance.
 * These will be deleted at the end of the script. . This script also makes some assumptions about
 * the resources it will create:
 *
 * <ul>
 *   <li>The VCN created by this example will have a display name defined by constant
 *       VCN_DISPLAY_NAME
 *   <li>The subnet created by this example will have a display name defined by constant
 *       SUBNET_DISPLAY_NAME
 *   <li>The VCN will have a IPv4 CIDR block defined by constant VCN_V4_CIDR
 *   <li>The Subnet will have a IPv4 CIDR block defined by constant SUBNET_V4_CIDR
 *   <li>The configuration file used by service clients will be sourced from the default location
 *       (~/.oci/config) and the DEFAULT profile will be used
 *   <li>Resources will be created in us-phoenix-1
 *   <li>Resources will be created in the first AD returned from the ListAvailabilityDomains call
 *       <ul>
 */
public class NetworkSecurityGroupExample {
    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    private static final String VCN_DISPLAY_NAME = "java_sdk_nsg_example_vcn";
    private static final String SUBNET_DISPLAY_NAME = "java_sdk_nsg_example_subnet";
    private static final String INSTANCE_DISPLAY_NAME = "java_sdk_nsg_example_instance";
    private static final String VCN_V4_CIDR = "10.0.0.0/16";
    private static final String SUBNET_V4_CIDR = "10.0.1.0/24";
    private static final String INSTANCE_OS = "Oracle Linux";

    private static VirtualNetworkClient virtualNetworkClient;

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     *     <ul>
     *       <li>The OCID of the compartment where a VCN will be created for tagging.
     *     </ul>
     */
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "This example expects one argument: a compartment OCID");
        }
        final String compartmentId = args[0];

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(configurationFilePath, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        virtualNetworkClient = VirtualNetworkClient.builder().build(provider);

        IdentityClient identityClient = IdentityClient.builder().build(provider);

        final ComputeClient computeClient = ComputeClient.builder().build(provider);

        // Set the default retry strategy for all operations to set retry attempts to 3
        Retriers.setDefaultRetryConfiguration(
                RetryConfiguration.builder()
                        .terminationStrategy(new MaxAttemptsTerminationStrategy(3))
                        .build());

        final Vcn vcn =
                ExampleVcnHelper.createVcn(
                        virtualNetworkClient,
                        CreateVcnDetails.builder()
                                .cidrBlock(VCN_V4_CIDR)
                                .displayName(VCN_DISPLAY_NAME)
                                .compartmentId(compartmentId)
                                .build());
        final String adToUse = getFirstAvailabilityDomain(identityClient, compartmentId);

        Subnet subnet = null;
        Instance instance = null;
        List<String> vnicIds = null;
        try {
            subnet =
                    ExampleVcnHelper.createSubnet(
                            virtualNetworkClient,
                            CreateSubnetDetails.builder()
                                    .displayName(SUBNET_DISPLAY_NAME)
                                    .cidrBlock(SUBNET_V4_CIDR)
                                    .availabilityDomain(adToUse)
                                    .compartmentId(compartmentId)
                                    .vcnId(vcn.getId())
                                    .build());

            final Shape shape =
                    ExampleComputeHelper.getVMShapes(computeClient, compartmentId).get(0);
            final String imageId =
                    ExampleComputeHelper.getImages(
                                    computeClient, compartmentId, shape.getShape(), INSTANCE_OS)
                            .get(0)
                            .getId();

            instance =
                    ExampleComputeHelper.launchInstance(
                            computeClient,
                            LaunchInstanceDetails.builder()
                                    .displayName(INSTANCE_DISPLAY_NAME)
                                    .shape(shape.getShape())
                                    .availabilityDomain(subnet.getAvailabilityDomain())
                                    .compartmentId(compartmentId)
                                    .subnetId(subnet.getId())
                                    .imageId(imageId)
                                    .build());

            vnicIds =
                    ExampleComputeHelper.getVnicIds(
                            computeClient,
                            ListVnicAttachmentsRequest.builder()
                                    .compartmentId(compartmentId)
                                    .instanceId(instance.getId())
                                    .build());
            String vnicToUse = vnicIds.get(0);
            System.out.println(String.format("Retrieved VNIC %s", vnicToUse));

            runExampleSteps(vcn, compartmentId, vnicToUse);
        } finally {
            if (instance != null) {
                ExampleComputeHelper.terminateInstance(computeClient, instance.getId());
            }

            if (subnet != null) {
                ExampleVcnHelper.deleteSubnet(virtualNetworkClient, subnet.getId());
            }

            if (vcn != null) {
                ExampleVcnHelper.deleteVcn(virtualNetworkClient, vcn.getId());
            }
        }
    }

    /** Run all the steps of the example to demonstrate NSG functionality. */
    private static void runExampleSteps(Vcn vcn, String compartmentId, String vnicToUse)
            throws InterruptedException {
        NetworkSecurityGroup nsg1 = null;
        NetworkSecurityGroup nsg2 = null;
        try {

            // create 2 NSGs
            nsg1 = createNsg(vcn, compartmentId, "Example NSG 1");

            nsg2 = createNsg(vcn, compartmentId, "Example NSG 2");

            // Retrieve NSG details
            printSeparator();
            System.out.println("Retrieving network security group details");
            final GetNetworkSecurityGroupResponse networkSecurityGroup =
                    virtualNetworkClient.getNetworkSecurityGroup(
                            GetNetworkSecurityGroupRequest.builder()
                                    .networkSecurityGroupId(nsg1.getId())
                                    .build());
            System.out.println(networkSecurityGroup.getNetworkSecurityGroup());
            printSeparator();

            printSeparator();
            System.out.println("Adding security rules");
            addNsgRules(nsg1, nsg2);
            printSeparator();

            printSeparator();
            System.out.println("Retrieving security rules");
            ListNetworkSecurityGroupSecurityRulesResponse listRulesResponse =
                    virtualNetworkClient.listNetworkSecurityGroupSecurityRules(
                            ListNetworkSecurityGroupSecurityRulesRequest.builder()
                                    .networkSecurityGroupId(nsg1.getId())
                                    .build());
            System.out.println(listRulesResponse.getItems());
            printSeparator();

            printSeparator();
            System.out.println("Updating first security rules to be stateful");
            virtualNetworkClient.updateNetworkSecurityGroupSecurityRules(
                    UpdateNetworkSecurityGroupSecurityRulesRequest.builder()
                            .networkSecurityGroupId(nsg1.getId())
                            .updateNetworkSecurityGroupSecurityRulesDetails(
                                    UpdateNetworkSecurityGroupSecurityRulesDetails.builder()
                                            .securityRules(
                                                    Arrays.asList(
                                                            createUpdateRuleDetails(
                                                                    listRulesResponse
                                                                            .getItems()
                                                                            .get(0))))
                                            .build())
                            .build());

            System.out.println(
                    virtualNetworkClient
                            .listNetworkSecurityGroupSecurityRules(
                                    ListNetworkSecurityGroupSecurityRulesRequest.builder()
                                            .networkSecurityGroupId(nsg1.getId())
                                            .build())
                            .getItems());
            printSeparator();

            printSeparator();
            System.out.println("Removing first security rule");
            virtualNetworkClient.removeNetworkSecurityGroupSecurityRules(
                    RemoveNetworkSecurityGroupSecurityRulesRequest.builder()
                            .networkSecurityGroupId(nsg1.getId())
                            .removeNetworkSecurityGroupSecurityRulesDetails(
                                    RemoveNetworkSecurityGroupSecurityRulesDetails.builder()
                                            .securityRuleIds(
                                                    Arrays.asList(
                                                            listRulesResponse
                                                                    .getItems()
                                                                    .get(0)
                                                                    .getId()))
                                            .build())
                            .build());

            listRulesResponse =
                    virtualNetworkClient.listNetworkSecurityGroupSecurityRules(
                            ListNetworkSecurityGroupSecurityRulesRequest.builder()
                                    .networkSecurityGroupId(nsg1.getId())
                                    .build());
            System.out.println(listRulesResponse.getItems());
            printSeparator();

            printSeparator();
            System.out.println("Update vnic to be associated with network security group");
            virtualNetworkClient.updateVnic(
                    UpdateVnicRequest.builder()
                            .updateVnicDetails(
                                    UpdateVnicDetails.builder()
                                            .nsgIds(Arrays.asList(nsg1.getId()))
                                            .build())
                            .vnicId(vnicToUse)
                            .build());
            listAllVnicsInNSG(nsg1);
            printSeparator();

            printSeparator();
            System.out.println("Remove all VNICs from the network security group");
            virtualNetworkClient.updateVnic(
                    UpdateVnicRequest.builder()
                            .updateVnicDetails(
                                    UpdateVnicDetails.builder().nsgIds(Arrays.asList()).build())
                            .vnicId(vnicToUse)
                            .build());
            listAllVnicsInNSG(nsg1);
            printSeparator();
        } finally {
            if (nsg1 != null) {
                deleteNsg(nsg1);
                virtualNetworkClient
                        .getWaiters()
                        .forNetworkSecurityGroup(
                                GetNetworkSecurityGroupRequest.builder()
                                        .networkSecurityGroupId(nsg1.getId())
                                        .build(),
                                LifecycleState.Terminated);
            }

            if (nsg2 != null) {
                deleteNsg(nsg2);
                virtualNetworkClient
                        .getWaiters()
                        .forNetworkSecurityGroup(
                                GetNetworkSecurityGroupRequest.builder()
                                        .networkSecurityGroupId(nsg2.getId())
                                        .build(),
                                LifecycleState.Terminated);
            }
        }
    }

    /** list all the vnics in the given NSG */
    private static void listAllVnicsInNSG(NetworkSecurityGroup nsg1) {
        System.out.println("List all VNICs in the network security group");
        System.out.println(
                virtualNetworkClient
                        .listNetworkSecurityGroupVnics(
                                ListNetworkSecurityGroupVnicsRequest.builder()
                                        .networkSecurityGroupId(nsg1.getId())
                                        .build())
                        .getItems());
    }

    /** Construct a UpdateSecurityRuleDetails with Stateless set to True for given rule Id */
    private static UpdateSecurityRuleDetails createUpdateRuleDetails(SecurityRule rule) {
        return UpdateSecurityRuleDetails.builder()
                // Specify the rule Id to update
                .id(rule.getId())
                .description(rule.getDescription())
                .direction(UpdateSecurityRuleDetails.Direction.Ingress)

                // Change this value
                .isStateless(true)
                .protocol(rule.getProtocol()) // 1: ICMP, 6: TCP, 17: UDP, 58: ICMPv6
                .source(rule.getSource())
                .sourceType(UpdateSecurityRuleDetails.SourceType.CidrBlock)
                .tcpOptions(rule.getTcpOptions())
                .build();
    }

    /** Add rules to NSG nsg1 referencing nsg2 */
    private static AddedNetworkSecurityGroupSecurityRules addNsgRules(
            NetworkSecurityGroup nsg, NetworkSecurityGroup targetNsg) {
        return virtualNetworkClient
                .addNetworkSecurityGroupSecurityRules(
                        AddNetworkSecurityGroupSecurityRulesRequest.builder()
                                .addNetworkSecurityGroupSecurityRulesDetails(
                                        AddNetworkSecurityGroupSecurityRulesDetails.builder()
                                                .securityRules(createSecurityRules(targetNsg))
                                                .build())
                                .networkSecurityGroupId(nsg.getId())
                                .build())
                .getAddedNetworkSecurityGroupSecurityRules();
    }

    /** Create some security rules one of which refers to the target NSG as destination */
    private static List<AddSecurityRuleDetails> createSecurityRules(
            NetworkSecurityGroup targetNsg) {
        return Arrays.asList(
                AddSecurityRuleDetails.builder()
                        .description("Incoming SSH connections from private network")
                        .direction(Direction.Ingress)
                        .isStateless(false)
                        .protocol("6") // 1: ICMP, 6: TCP, 17: UDP, 58: ICMPv6
                        .source("10.0.0.0/24")
                        .sourceType(SourceType.CidrBlock)
                        .tcpOptions(
                                TcpOptions.builder()
                                        .destinationPortRange(
                                                PortRange.builder().min(22).max(22).build())
                                        .build())
                        .build(),
                AddSecurityRuleDetails.builder()
                        .description("Incoming Internet connections")
                        .direction(Direction.Ingress)
                        .isStateless(false)
                        .protocol("6")
                        .source("0.0.0.0/0")
                        .sourceType(SourceType.CidrBlock)
                        .tcpOptions(
                                TcpOptions.builder()
                                        .destinationPortRange(
                                                PortRange.builder().min(443).max(443).build())
                                        .build())
                        .build(),
                AddSecurityRuleDetails.builder()
                        .description(
                                "Outgoing connections to app service described by network security group")
                        .direction(Direction.Egress)
                        .isStateless(false)
                        .protocol("6")
                        .destination(targetNsg.getId())
                        .destinationType(DestinationType.NetworkSecurityGroup)
                        .tcpOptions(
                                TcpOptions.builder()
                                        .destinationPortRange(
                                                PortRange.builder().min(8080).max(8080).build())
                                        .build())
                        .build());
    }

    /** Create a NSG in the given VCN, compartment and having the provided displayName */
    private static NetworkSecurityGroup createNsg(
            Vcn vcn, String compartmentId, String displayName) {
        printSeparator();
        System.out.println("Creating network security group");
        printSeparator();
        final NetworkSecurityGroup networkSecurityGroup =
                virtualNetworkClient
                        .createNetworkSecurityGroup(
                                CreateNetworkSecurityGroupRequest.builder()
                                        .createNetworkSecurityGroupDetails(
                                                CreateNetworkSecurityGroupDetails.builder()
                                                        .vcnId(vcn.getId())
                                                        .displayName(displayName)
                                                        .compartmentId(compartmentId)
                                                        .build())
                                        .build())
                        .getNetworkSecurityGroup();
        printSeparator();
        System.out.println("Created network security group " + networkSecurityGroup.getId());
        printSeparator();
        return networkSecurityGroup;
    }

    private static void printSeparator() {
        System.out.println("==================");
    }

    /** delete the given nsg */
    private static void deleteNsg(NetworkSecurityGroup nsg) {
        printSeparator();
        System.out.println("Deleting network security group " + nsg.getId());
        printSeparator();
        virtualNetworkClient.deleteNetworkSecurityGroup(
                DeleteNetworkSecurityGroupRequest.builder()
                        .networkSecurityGroupId(nsg.getId())
                        .build());
        printSeparator();
        System.out.println("Deleted network security group " + nsg.getId());
        printSeparator();
    }

    /** Returns the first availability domain in a compartment. */
    protected static String getFirstAvailabilityDomain(
            final IdentityClient identityClient, final String compartmentId) {

        final ListAvailabilityDomainsResponse listAvailabilityDomainsResponse =
                identityClient.listAvailabilityDomains(
                        ListAvailabilityDomainsRequest.builder()
                                .compartmentId(compartmentId)
                                .build());

        final List<AvailabilityDomain> availabilityDomains =
                listAvailabilityDomainsResponse.getItems();
        return availabilityDomains.get(0).getName();
    }
}
