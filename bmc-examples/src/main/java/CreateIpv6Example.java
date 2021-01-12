/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.ComputeClient;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.CreateIpv6Details;
import com.oracle.bmc.core.model.CreateSubnetDetails;
import com.oracle.bmc.core.model.CreateVcnDetails;
import com.oracle.bmc.core.model.Image;
import com.oracle.bmc.core.model.Instance;
import com.oracle.bmc.core.model.Ipv6;
import com.oracle.bmc.core.model.LaunchInstanceDetails;
import com.oracle.bmc.core.model.Subnet;
import com.oracle.bmc.core.model.Vcn;
import com.oracle.bmc.core.requests.CreateIpv6Request;
import com.oracle.bmc.core.requests.ListVnicAttachmentsRequest;
import com.oracle.bmc.core.responses.CreateIpv6Response;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.AvailabilityDomain;
import com.oracle.bmc.identity.requests.ListAvailabilityDomainsRequest;
import com.oracle.bmc.identity.responses.ListAvailabilityDomainsResponse;
import shared.ExampleComputeHelper;
import shared.ExampleVcnHelper;

import java.util.List;

/**
 * This class provides an example of how to create an IPv6 VNIC attachment from scratch.
 * <p>
 * In order to demonstrate functionality, this script will create a VCN, subnet and an instance.
 * These will be deleted at the end of the script. . This script also makes some assumptions about
 * the resources it will create:
 *
 * <ul>
 * <li>The VCN created by this example will have a display name defined by constant VCN_DISPLAY_NAME</li>
 * <li>The subnet created by this example will have a display name defined by constant SUBNET_DISPLAY_NAME</li>
 * <li>The VCN will have a IPv4 CIDR block defined by constant VCN_V4_CIDR</li>
 * <li>The VCN will have a IPv6 CIDR block defined by constant VCN_V6_CIDR</li>
 * <li>The Subnet will have a IPv4 CIDR block defined by constant SUBNET_V4_CIDR</li>
 * <li>The Subnet will have a IPv6 CIDR block defined by constant SUBNET_V6_CIDR</li>
 * <li>
 * The configuration file used by service clients will be sourced from the default
 * location (~/.oci/config) and the DEFAULT profile will be used
 * </li>
 * <li>Resources will be created in us-phoenix-1</li>
 * <li>Resources will be created in the first AD returned from the ListAvailabilityDomains call</li>
 * <ul>
 */
public class CreateIpv6Example {
    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    private static final String VCN_DISPLAY_NAME = "java_sdk_ipv6_example_vcn";
    private static final String SUBNET_DISPLAY_NAME = "java_sdk_ipv6_example_subnet";
    private static final String INSTANCE_DISPLAY_NAME = "java_sdk_ipv6_example_instance";
    private static final String VCN_V4_CIDR = "10.0.0.0/16";
    private static final String VCN_V6_CIDR = "fd00:aaaa:0123::/48";
    private static final String SUBNET_V4_CIDR = "10.0.1.0/24";
    private static final String SUBNET_V6_CIDR = "fd00:aaaa:0123:1111::/64";

    private static final String INSTANCE_SHAPE = "VM.Standard2.1";
    private static final String INSTANCE_OS = "Oracle Linux";
    private static final String OS_VERSION = "7";

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     *             <ul>
     *             <li>The OCID of the compartment where a VCN will be created for tagging.</li>
     *             </ul>
     */
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "This example expects one argument: a compartment OCID");
        }
        final String compartmentId = args[0];

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        final VirtualNetworkClient virtualNetworkClient = new VirtualNetworkClient(provider);
        final IdentityClient identityClient = new IdentityClient(provider);
        final ComputeClient computeClient = new ComputeClient(provider);

        final Vcn vcn =
                ExampleVcnHelper.createVcn(
                        virtualNetworkClient,
                        CreateVcnDetails.builder()
                                .isIpv6Enabled(true)
                                .cidrBlock(VCN_V4_CIDR)
                                .ipv6CidrBlock(VCN_V6_CIDR)
                                .displayName(VCN_DISPLAY_NAME)
                                .compartmentId(compartmentId)
                                .build());
        final String adToUse = getFirstAvailabilityDomain(identityClient, compartmentId);

        Subnet subnet = null;
        Instance instance = null;
        List<String> vnicIds = null;
        Ipv6 ipv6 = null;
        try {
            subnet =
                    ExampleVcnHelper.createSubnet(
                            virtualNetworkClient,
                            CreateSubnetDetails.builder()
                                    .displayName(SUBNET_DISPLAY_NAME)
                                    .cidrBlock(SUBNET_V4_CIDR)
                                    .ipv6CidrBlock(SUBNET_V6_CIDR)
                                    .availabilityDomain(adToUse)
                                    .compartmentId(compartmentId)
                                    .vcnId(vcn.getId())
                                    .build());

            final Image image =
                    ExampleComputeHelper.getImageForShape(
                            computeClient, compartmentId, INSTANCE_SHAPE, INSTANCE_OS, OS_VERSION);

            instance =
                    ExampleComputeHelper.launchInstance(
                            computeClient,
                            LaunchInstanceDetails.builder()
                                    .displayName(INSTANCE_DISPLAY_NAME)
                                    .shape(INSTANCE_SHAPE)
                                    .availabilityDomain(subnet.getAvailabilityDomain())
                                    .compartmentId(compartmentId)
                                    .subnetId(subnet.getId())
                                    .imageId(image.getId())
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

            ipv6 =
                    createIpv6(
                            virtualNetworkClient,
                            CreateIpv6Details.builder().vnicId(vnicToUse).build());
            System.out.println(String.format("Created Ipv6 %s", ipv6.getId()));
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

    /**
     * Returns the first availability domain in a compartment.
     *
     * @param identityClient the client used to communicate with the service
     * @param compartmentId  the OCID of the compartment whose availability domains we're listing
     * @return a list of all availability domains in a compartment
     */
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

    /**
     * Assigns an Ipv6 address to a provided VNIC.
     *
     * @param vcnClient         the client used to communicate with the service
     * @param createIpv6Details CreateIpv6Details to be used for creating the Ipv6
     * @return the Ipv6 object that has been created
     */
    protected static Ipv6 createIpv6(
            final VirtualNetworkClient vcnClient, final CreateIpv6Details createIpv6Details) {

        final CreateIpv6Response createIpv6Response =
                vcnClient.createIpv6(
                        CreateIpv6Request.builder().createIpv6Details(createIpv6Details).build());

        return createIpv6Response.getIpv6();
    }
}
