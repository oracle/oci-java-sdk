/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.VirtualNetwork;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.Drg;
import com.oracle.bmc.core.model.CreateDrgDetails;
import com.oracle.bmc.core.model.CrossConnectMapping;
import com.oracle.bmc.core.model.VirtualCircuit;
import com.oracle.bmc.core.model.VirtualCircuitBandwidthShape;
import com.oracle.bmc.core.model.CreateVirtualCircuitDetails;
import com.oracle.bmc.core.model.UpdateVirtualCircuitDetails;
import com.oracle.bmc.core.model.FastConnectProviderService;
import com.oracle.bmc.core.requests.CreateVirtualCircuitRequest;
import com.oracle.bmc.core.requests.GetVirtualCircuitRequest;
import com.oracle.bmc.core.requests.UpdateVirtualCircuitRequest;
import com.oracle.bmc.core.requests.DeleteVirtualCircuitRequest;
import com.oracle.bmc.core.requests.GetDrgRequest;
import com.oracle.bmc.core.requests.DeleteDrgRequest;
import com.oracle.bmc.core.requests.ListFastConnectProviderServicesRequest;
import com.oracle.bmc.core.requests.ListFastConnectProviderVirtualCircuitBandwidthShapesRequest;
import com.oracle.bmc.core.responses.ListFastConnectProviderVirtualCircuitBandwidthShapesResponse;
import com.oracle.bmc.core.responses.ListFastConnectProviderServicesResponse;
import com.oracle.bmc.core.requests.CreateDrgRequest;
import com.oracle.bmc.core.responses.CreateVirtualCircuitResponse;
import com.oracle.bmc.core.responses.CreateDrgResponse;
import com.oracle.bmc.core.responses.UpdateVirtualCircuitResponse;
import com.oracle.bmc.identity.IdentityClient;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Sample to demonstrate setting up FastConnect Virtual Circuit
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
public class FastConnectVirtualCircuitExample {
    // Set this with your own compartment ID
    private static final String COMPARTMENT_ID = "your_Compartment_Ocid_here";

    private static final String CUSTOMER_BGP_IP = "10.0.0.3/31";
    private static final String UPDATE_CUSTOMER_BGP_IP = "10.0.1.3/31";

    private static final int CUSTOMER_ASN = 1234;
    private static final int UPDATE_CUSTOMER_ASN = 1001;

    private static final String TIMESTAMP_SUFFIX =
            String.valueOf(System.currentTimeMillis() % TimeUnit.SECONDS.toMillis(10L));

    private final VirtualNetworkClient virtualNetworkClient;
    private final Region region;

    public FastConnectVirtualCircuitExample(
            VirtualNetworkClient virtualNetworkClient, Region region) {
        this.virtualNetworkClient = virtualNetworkClient;
        this.region = region;
    }

    public static void main(final String... args) throws Exception {
        if (StringUtils.isBlank(COMPARTMENT_ID)) {
            throw new IllegalStateException("A compartment ID must be defined");
        }

        final AuthenticationDetailsProvider authProvider =
                new ConfigFileAuthenticationDetailsProvider("~/.oci/config", "DEFAULT");

        final VirtualNetworkClient phxVirtualNetworkClient = new VirtualNetworkClient(authProvider);
        phxVirtualNetworkClient.setRegion(Region.US_PHOENIX_1);
        final FastConnectVirtualCircuitExample example =
                new FastConnectVirtualCircuitExample(phxVirtualNetworkClient, Region.US_PHOENIX_1);
        final IdentityClient identityClient = new IdentityClient(authProvider);

        example.run(identityClient);
    }

    public void run(IdentityClient identityClient) throws Exception {

        System.out.println("Create Virtual Circuit via provider.");

        System.out.println("Get provider service list.");
        List<FastConnectProviderService> fastConnectProviderServiceList =
                getFastConnectProviderServices(virtualNetworkClient, COMPARTMENT_ID);

        System.out.println("Setting up DRG.");

        System.out.println("Creating DRG.");
        Drg drg = createDrg(virtualNetworkClient, region);

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
                    getFastConnectProviderVirtualCircuitBandwidthShapes(
                            virtualNetworkClient, layer2ProviderService.getId());

            System.out.println("Creating virtual circuit.");
            VirtualCircuit vc =
                    createVirtualCircuitViaLayer2Provider(
                            virtualNetworkClient,
                            COMPARTMENT_ID,
                            layer2ProviderService.getId(),
                            vcBandwidthShapes.get(0).getName(),
                            CUSTOMER_BGP_IP,
                            CUSTOMER_ASN,
                            drg.getId(),
                            CreateVirtualCircuitDetails.Type.Private);

            vc =
                    updateVirtualCircuitViaLayer2Provider(
                            virtualNetworkClient,
                            vc.getId(),
                            vcBandwidthShapes.get(1).getName(),
                            UPDATE_CUSTOMER_BGP_IP,
                            UPDATE_CUSTOMER_ASN);

            System.out.println("Deleting virtual circuit.");
            deleteVirtualCircuit(virtualNetworkClient, vc.getId());

        } finally {
            System.out.println("Deleting the DRG.");
            deleteDrg(virtualNetworkClient, drg);
        }
    }

    public static Drg createDrg(final VirtualNetwork virtualNetwork, final Region region)
            throws Exception {
        final CreateDrgRequest request =
                CreateDrgRequest.builder()
                        .createDrgDetails(
                                CreateDrgDetails.builder()
                                        .compartmentId(COMPARTMENT_ID)
                                        .displayName(
                                                String.format(
                                                        "Drg-%s-%s",
                                                        region.getRegionId(),
                                                        TIMESTAMP_SUFFIX))
                                        .build())
                        .build();

        final CreateDrgResponse response = virtualNetwork.createDrg(request);

        virtualNetwork
                .getWaiters()
                .forDrg(
                        GetDrgRequest.builder().drgId(response.getDrg().getId()).build(),
                        Drg.LifecycleState.Available)
                .execute();

        System.out.println("Created DRG: " + response.getDrg().getId());

        return response.getDrg();
    }

    public static void deleteDrg(final VirtualNetwork virtualNetwork, final Drg drg)
            throws Exception {
        final DeleteDrgRequest request = DeleteDrgRequest.builder().drgId(drg.getId()).build();
        virtualNetwork.deleteDrg(request);

        virtualNetwork
                .getWaiters()
                .forDrg(
                        GetDrgRequest.builder().drgId(drg.getId()).build(),
                        Drg.LifecycleState.Terminated)
                .execute();
        System.out.println("Deleted DRG: " + drg.getId());
    }

    public static List<FastConnectProviderService> getFastConnectProviderServices(
            final VirtualNetwork virtualNetwork, final String compartmentId) {
        ListFastConnectProviderServicesResponse listFastConnectProviderServicesResponse =
                virtualNetwork.listFastConnectProviderServices(
                        ListFastConnectProviderServicesRequest.builder()
                                .compartmentId(compartmentId)
                                .build());

        return listFastConnectProviderServicesResponse.getItems();
    }

    public static List<VirtualCircuitBandwidthShape>
            getFastConnectProviderVirtualCircuitBandwidthShapes(
                    final VirtualNetwork virtualNetwork, final String providerServiceId) {
        ListFastConnectProviderVirtualCircuitBandwidthShapesResponse
                listFastConnectProviderVirtualCircuitBandwidthShapesResponse =
                        virtualNetwork.listFastConnectProviderVirtualCircuitBandwidthShapes(
                                ListFastConnectProviderVirtualCircuitBandwidthShapesRequest
                                        .builder()
                                        .providerServiceId(providerServiceId)
                                        .build());

        return listFastConnectProviderVirtualCircuitBandwidthShapesResponse.getItems();
    }

    private static VirtualCircuit createVirtualCircuitViaLayer2Provider(
            final VirtualNetwork virtualNetwork,
            final String compartmentId,
            final String providerServiceId,
            final String bandwidthShapeName,
            final String customerBgpIp,
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

    private static VirtualCircuit updateVirtualCircuitViaLayer2Provider(
            final VirtualNetwork virtualNetwork,
            final String vcId,
            final String bandwidthShapeName,
            final String customerBgpIp,
            final int customerBgpAsn) {
        final UpdateVirtualCircuitRequest request =
                UpdateVirtualCircuitRequest.builder()
                        .virtualCircuitId(vcId)
                        .updateVirtualCircuitDetails(
                                UpdateVirtualCircuitDetails.builder()
                                        .displayName(String.format("VC-%s", TIMESTAMP_SUFFIX))
                                        .crossConnectMappings(
                                                Arrays.asList(
                                                        CrossConnectMapping.builder()
                                                                .customerBgpPeeringIp(customerBgpIp)
                                                                .build()))
                                        .bandwidthShapeName(bandwidthShapeName)
                                        .customerBgpAsn(customerBgpAsn)
                                        .build())
                        .build();

        final UpdateVirtualCircuitResponse response = virtualNetwork.updateVirtualCircuit(request);

        return response.getVirtualCircuit();
    }

    public static void deleteVirtualCircuit(final VirtualNetwork virtualNetwork, final String vcId)
            throws Exception {
        final DeleteVirtualCircuitRequest request =
                DeleteVirtualCircuitRequest.builder().virtualCircuitId(vcId).build();
        virtualNetwork.deleteVirtualCircuit(request);

        virtualNetwork
                .getWaiters()
                .forVirtualCircuit(
                        GetVirtualCircuitRequest.builder().virtualCircuitId(vcId).build(),
                        VirtualCircuit.LifecycleState.Terminated)
                .execute();
        System.out.println("Deleted virtual circuit: " + vcId);
    }
}
