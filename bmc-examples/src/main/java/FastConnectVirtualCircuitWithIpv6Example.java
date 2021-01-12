/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.VirtualNetwork;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;
import com.oracle.bmc.identity.IdentityClient;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Sample to demonstrate setting up FastConnect Virtual Circuit with Ipv6
 * <p>
 *
 *
 *  Oracle Cloud Infrastructure FastConnect provides an easy way to create a dedicated,
 *  private connection between your data center and Oracle Cloud Infrastructure.
 *
 *  FastConnect provides higher-bandwidth options, and a more reliable and consistent
 *  networking experience compared to internet-based connections.
 *
 *  Details information on FastConnect: https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/fastconnect.htm
 *
 *  Details virtual circuit API: https://docs.cloud.oracle.com/api/#/en/iaas/20160918/VirtualCircuit
 */
public class FastConnectVirtualCircuitWithIpv6Example {
    // Set this with your own compartment ID
    private static final String COMPARTMENT_ID = "";

    private static final String CUSTOMER_BGP_IP = "10.0.0.3/31";

    private static final String CUSTOMER_BGP_PEERING_IPv6 = "CAFE:F00D:CAFE:F00D::1/126";
    private static final String ORACLE_BGP_PEERING_IPv6 = "CAFE:F00D:CAFE:F00D::2/126";

    private static final int CUSTOMER_ASN = 1234;

    private static final String TIMESTAMP_SUFFIX =
            String.valueOf(System.currentTimeMillis() % TimeUnit.SECONDS.toMillis(10L));

    private final VirtualNetworkClient virtualNetworkClient;
    private final Region region;

    public FastConnectVirtualCircuitWithIpv6Example(
            VirtualNetworkClient virtualNetworkClient, Region region) {
        this.virtualNetworkClient = virtualNetworkClient;
        this.region = region;
    }

    public static void main(final String... args) throws Exception {
        if ("".equals(COMPARTMENT_ID)) {
            throw new IllegalStateException("A compartment ID must be defined");
        }

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(configurationFilePath, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider authProvider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        final VirtualNetworkClient phxVirtualNetworkClient = new VirtualNetworkClient(authProvider);
        phxVirtualNetworkClient.setRegion(Region.US_PHOENIX_1);

        final FastConnectVirtualCircuitWithIpv6Example example =
                new FastConnectVirtualCircuitWithIpv6Example(
                        phxVirtualNetworkClient, Region.US_PHOENIX_1);
        final IdentityClient identityClient = new IdentityClient(authProvider);

        example.run(identityClient);
    }

    public void run(IdentityClient identityClient) throws Exception {
        System.out.println("Create Virtual Circuit with Ipv6 via provider.");

        System.out.println("Get provider service list.");
        List<FastConnectProviderService> fastConnectProviderServiceList =
                FastConnectVirtualCircuitExample.getFastConnectProviderServices(
                        virtualNetworkClient, COMPARTMENT_ID);

        System.out.println("Setting up DRG.");

        System.out.println("Creating DRG.");
        Drg drg = FastConnectVirtualCircuitExample.createDrg(virtualNetworkClient, region);

        try {
            FastConnectProviderService layer2ProviderService = null;
            for (FastConnectProviderService item : fastConnectProviderServiceList) {
                if (item.getType() == FastConnectProviderService.Type.Layer2) {
                    layer2ProviderService = item;
                    break;
                }
            }

            //Gets the list of available virtual circuit bandwidth levels for the above provider. Example: 1 Gbps
            List<VirtualCircuitBandwidthShape> vcBandwidthShapes =
                    FastConnectVirtualCircuitExample
                            .getFastConnectProviderVirtualCircuitBandwidthShapes(
                                    virtualNetworkClient, layer2ProviderService.getId());
            System.out.println("Creating virtual circuit with Ipv6");

            VirtualCircuit vcWithIpv6 =
                    createVirtualCircuitWithIpv6ViaLayer2Provider(
                            virtualNetworkClient,
                            COMPARTMENT_ID,
                            layer2ProviderService.getId(),
                            vcBandwidthShapes.get(0).getName(),
                            CUSTOMER_BGP_IP,
                            CUSTOMER_BGP_PEERING_IPv6,
                            ORACLE_BGP_PEERING_IPv6,
                            CUSTOMER_ASN,
                            drg.getId(),
                            CreateVirtualCircuitDetails.Type.Private);

            System.out.println("Deleting virtual circuit.");
            FastConnectVirtualCircuitExample.deleteVirtualCircuit(
                    virtualNetworkClient, vcWithIpv6.getId());

        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
        System.out.println("Deleting the DRG.");
        FastConnectVirtualCircuitExample.deleteDrg(virtualNetworkClient, drg);
    }

    private static VirtualCircuit createVirtualCircuitWithIpv6ViaLayer2Provider(
            final VirtualNetwork virtualNetwork,
            final String compartmentId,
            final String providerServiceId,
            final String bandwidthShapeName,
            final String customerBgpIp,
            final String customerBgpPeeringIpv6,
            final String oracleBgpPeeringIpv6,
            final int customerBgpAsn,
            final String gatewayId,
            final CreateVirtualCircuitDetails.Type type)
            throws Exception {
        final CreateVirtualCircuitRequest request =
                CreateVirtualCircuitRequest.builder()
                        .createVirtualCircuitDetails(
                                CreateVirtualCircuitDetails.builder()
                                        .compartmentId(compartmentId)
                                        .displayName(String.format("VC-%s", TIMESTAMP_SUFFIX))
                                        .crossConnectMappings(
                                                Arrays.asList(
                                                        CrossConnectMapping.builder()
                                                                .customerBgpPeeringIp(customerBgpIp)
                                                                .customerBgpPeeringIpv6(
                                                                        customerBgpPeeringIpv6)
                                                                .oracleBgpPeeringIpv6(
                                                                        oracleBgpPeeringIpv6)
                                                                .build()))
                                        .providerServiceId(providerServiceId)
                                        .bandwidthShapeName(bandwidthShapeName)
                                        .customerBgpAsn(customerBgpAsn)
                                        .gatewayId(gatewayId)
                                        .type(type)
                                        .build())
                        .build();

        final CreateVirtualCircuitResponse response = virtualNetwork.createVirtualCircuit(request);

        virtualNetwork
                .getWaiters()
                .forVirtualCircuit(
                        GetVirtualCircuitRequest.builder()
                                .virtualCircuitId(response.getVirtualCircuit().getId())
                                .build(),
                        VirtualCircuit.LifecycleState.PendingProvider)
                .execute();

        System.out.println("Created virtual circuit: " + response.getVirtualCircuit().getId());
        return response.getVirtualCircuit();
    }
}
