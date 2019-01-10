/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.VirtualNetwork;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.ConnectLocalPeeringGatewaysDetails;
import com.oracle.bmc.core.model.CreateDrgAttachmentDetails;
import com.oracle.bmc.core.model.CreateDrgDetails;
import com.oracle.bmc.core.model.CreateLocalPeeringGatewayDetails;
import com.oracle.bmc.core.model.CreateRouteTableDetails;
import com.oracle.bmc.core.model.CreateSubnetDetails;
import com.oracle.bmc.core.model.CreateVcnDetails;
import com.oracle.bmc.core.model.Drg;
import com.oracle.bmc.core.model.DrgAttachment;
import com.oracle.bmc.core.model.LocalPeeringGateway;
import com.oracle.bmc.core.model.RouteRule;
import com.oracle.bmc.core.model.RouteTable;
import com.oracle.bmc.core.model.Subnet;
import com.oracle.bmc.core.model.UpdateDrgAttachmentDetails;
import com.oracle.bmc.core.model.UpdateLocalPeeringGatewayDetails;
import com.oracle.bmc.core.model.UpdateRouteTableDetails;
import com.oracle.bmc.core.model.Vcn;
import com.oracle.bmc.core.requests.ConnectLocalPeeringGatewaysRequest;
import com.oracle.bmc.core.requests.CreateDrgAttachmentRequest;
import com.oracle.bmc.core.requests.CreateDrgRequest;
import com.oracle.bmc.core.requests.CreateLocalPeeringGatewayRequest;
import com.oracle.bmc.core.requests.CreateRouteTableRequest;
import com.oracle.bmc.core.requests.CreateSubnetRequest;
import com.oracle.bmc.core.requests.CreateVcnRequest;
import com.oracle.bmc.core.requests.DeleteDrgAttachmentRequest;
import com.oracle.bmc.core.requests.DeleteDrgRequest;
import com.oracle.bmc.core.requests.DeleteLocalPeeringGatewayRequest;
import com.oracle.bmc.core.requests.DeleteRouteTableRequest;
import com.oracle.bmc.core.requests.DeleteSubnetRequest;
import com.oracle.bmc.core.requests.DeleteVcnRequest;
import com.oracle.bmc.core.requests.GetDrgAttachmentRequest;
import com.oracle.bmc.core.requests.GetDrgRequest;
import com.oracle.bmc.core.requests.GetLocalPeeringGatewayRequest;
import com.oracle.bmc.core.requests.GetRouteTableRequest;
import com.oracle.bmc.core.requests.GetSubnetRequest;
import com.oracle.bmc.core.requests.GetVcnRequest;
import com.oracle.bmc.core.requests.UpdateDrgAttachmentRequest;
import com.oracle.bmc.core.requests.UpdateLocalPeeringGatewayRequest;
import com.oracle.bmc.core.requests.UpdateRouteTableRequest;
import com.oracle.bmc.core.responses.ConnectLocalPeeringGatewaysResponse;
import com.oracle.bmc.core.responses.CreateDrgAttachmentResponse;
import com.oracle.bmc.core.responses.CreateDrgResponse;
import com.oracle.bmc.core.responses.CreateLocalPeeringGatewayResponse;
import com.oracle.bmc.core.responses.CreateRouteTableResponse;
import com.oracle.bmc.core.responses.CreateSubnetResponse;
import com.oracle.bmc.core.responses.CreateVcnResponse;
import com.oracle.bmc.core.responses.UpdateDrgAttachmentResponse;
import com.oracle.bmc.core.responses.UpdateLocalPeeringGatewayResponse;
import com.oracle.bmc.core.responses.UpdateRouteTableResponse;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.AvailabilityDomain;
import com.oracle.bmc.identity.requests.ListAvailabilityDomainsRequest;
import com.oracle.bmc.identity.responses.ListAvailabilityDomainsResponse;

/**
 * Sample to demonstrate setting up VCN Transit Routing
 * <p>
 * The sample relies on the correct IAM policies already being in place for a given compartment ID.
 * <p/>
 *
 *                                              TOPOLOGY
 *                 spokeVcn                                                   hubVcn
 *               11.0.0.0/16                                               10.0.0.0/16
 *      +----------------------------+                              +-------------------- +
 *      |                            |                              |                     |
 *      |                            |                           +---------------+        |
 *      |                            |                           |  |            |        |
 *      |  +-----------+             |                           v  |            |        |
 *      |  |           +----+        +-----+                  +-----+----+       |        |
 *      |  |  SUBNET   | RT |------->| LPG +------------------+ LPG | RT |       |        |
 *      |  |           +----+        +-----+                  +-----+--+-+       |        |
 *      |  +-----------+             |                              |  |         |        |
 *      |                            |                              |  |    +----+---+    |
 *      |                            |                              |  |    |   RT   |    |
 *      |                            |                              +--|----+--------+----+
 *      +----------------------------+                                 |    | DrgAtt |
 *                                                                     |    +----+---+
 *                                                                     |         |
 *                                                                     |    +----+---+
 *                                                                     +--->|   DRG  |
 *                                                                          +----+---+
 *                                                                               |
 *                                                                               |
 *                                                                               +
 *                                                                to OnPrem Network 172.16.0.0/16
 *
 *  Vcn Transit Routing allows your OnPrem network to access your connected VCN as well as any
 *  Peered VCN(s). VCN Transit Routing is achieved through the use of LocalPeeringGateway in conjunction
 *  with a dynamically routing gateway (or DRG).
 *
 *  The order of operations and waiting for the appropriate state is important. This sample
 *  demonstrates the creation of resources on a single thread to more clearly demonstrate the
 *  setup for VCN Transit Routing.
 *
 *  It is also worth noting that the Hub VCN utilizes a dynamic routing gateway. DRGs are a
 *  finite resource and may require contacting customer support if limits have been exceeded
 *  for a given tenancy.
 */
public class VcnTransitRouting {
    // Set this with your own compartment ID
    private static final String COMPARTMENT_ID = "";

    private static final String HUB_VCN_CIDR = "10.0.0.0/16";
    private static final String SPOKE_VCN_CIDR = "11.0.0.0/16";
    private static final String SPOKE_VCN_SUBNET_CIDR = "11.0.1.0/24";
    private static final String ON_PREM_NETWORK_CIDR = "172.16.0.0/16";

    private static final String TIMESTAMP_SUFFIX =
            String.valueOf(System.currentTimeMillis() % TimeUnit.SECONDS.toMillis(10L));

    private final VirtualNetworkClient virtualNetworkClient;
    private final Region region;

    public VcnTransitRouting(VirtualNetworkClient virtualNetworkClient, Region region) {
        this.virtualNetworkClient = virtualNetworkClient;
        this.region = region;
    }

    public static void main(final String... args) throws Exception {
        if ("".equals(COMPARTMENT_ID)) {
            throw new IllegalStateException("A compartment ID must be defined");
        }

        final AuthenticationDetailsProvider authProvider =
                new ConfigFileAuthenticationDetailsProvider("~/.oci/config", "DEFAULT");

        final VirtualNetworkClient phxVirtualNetworkClient = new VirtualNetworkClient(authProvider);
        phxVirtualNetworkClient.setRegion(Region.US_PHOENIX_1);
        final VcnTransitRouting example =
                new VcnTransitRouting(phxVirtualNetworkClient, Region.US_PHOENIX_1);
        final IdentityClient identityClient = new IdentityClient(authProvider);
        identityClient.setRegion(Region.US_PHOENIX_1);

        example.run(identityClient);
    }

    public void run(IdentityClient identityClient) throws Exception {
        System.out.println("Setting up Hub Vcn.");

        System.out.println("Creating Hub Vcn.");
        Vcn hubVcn = createVcn(virtualNetworkClient, region, HUB_VCN_CIDR, "HUBVCN");

        System.out.println("Creating DRG in the hub Vcn.");
        Drg drg = createDrg(virtualNetworkClient, region);

        System.out.println("Creating DRG Attachment in the hub Vcn.");
        DrgAttachment drgAttachment =
                createDrgAttachment(virtualNetworkClient, region, hubVcn, drg);

        System.out.println("Creating LPG the hub Vcn.");
        LocalPeeringGateway hubLpg = createLpg(virtualNetworkClient, hubVcn, "hub-VCN-LPG");

        System.out.println(
                "Creating Route Table that will be associated with Drg Attachment in the hub Vcn.");
        RouteRule routeToSpoke =
                RouteRule.builder()
                        .cidrBlock(SPOKE_VCN_CIDR)
                        .networkEntityId(hubLpg.getId())
                        .build();
        RouteTable drgAttRT =
                createRouteTable(
                        virtualNetworkClient,
                        "drgAttRT",
                        hubVcn,
                        Collections.singletonList(routeToSpoke));

        System.out.println("Associating drgAttRT with Drg Attachment in the hub Vcn.");
        drgAttachment =
                associateRouteTableWithDrgAttachment(virtualNetworkClient, drgAttachment, drgAttRT);

        System.out.println(
                "Creating Route Table that will be associated with hubLpg in the hub Vcn.");
        RouteRule routeToOnPrem =
                RouteRule.builder()
                        .cidrBlock(ON_PREM_NETWORK_CIDR)
                        .networkEntityId(drg.getId())
                        .build();
        RouteTable hubLpgRT =
                createRouteTable(
                        virtualNetworkClient,
                        "hubLpgRT",
                        hubVcn,
                        Collections.singletonList(routeToOnPrem));

        System.out.println("Associating hubLpgRT with hubLpg in the hub Vcn.");
        hubLpg = associateRouteTableWithLpg(virtualNetworkClient, hubLpg, hubLpgRT);

        System.out.println(
                "=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");

        System.out.println("Setting up Spoke Vcn.");
        Vcn spokeVcn = createVcn(virtualNetworkClient, region, SPOKE_VCN_CIDR, "SPOKEVCN");

        System.out.println("Creating LPG the spoke Vcn.");
        LocalPeeringGateway spokeLpg = createLpg(virtualNetworkClient, spokeVcn, "spoke-vcn-lpg");

        System.out.println("Creating Subnet Route Table in the spoke Vcn.");
        List<RouteRule> subnetRTRules = new ArrayList<>();

        System.out.println("Adding peer route to subnet route table in spoke VCN");
        subnetRTRules.add(
                RouteRule.builder()
                        .cidrBlock(HUB_VCN_CIDR)
                        .networkEntityId(spokeLpg.getId())
                        .build());

        System.out.println("Adding on-prem route to subnet route table in spoke VCN");
        subnetRTRules.add(
                RouteRule.builder()
                        .cidrBlock(ON_PREM_NETWORK_CIDR)
                        .networkEntityId(spokeLpg.getId())
                        .build());

        RouteTable subnetRT =
                createRouteTable(virtualNetworkClient, "spoke-subnet-RT", spokeVcn, subnetRTRules);

        System.out.println("Creating Subnet with Route Table the spoke Vcn.");
        final List<AvailabilityDomain> availabilityDomains =
                getAvailabilityDomains(identityClient, COMPARTMENT_ID);

        Subnet spokeSubnet =
                createSubnet(
                        virtualNetworkClient,
                        spokeVcn,
                        "spoke-subnet",
                        availabilityDomains.get(0),
                        subnetRT);

        System.out.println(
                "=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        System.out.println("Establishing peering betwwen hub and spoke vcn");
        connectLpg(virtualNetworkClient, hubLpg, spokeLpg);

        System.out.println(
                "=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        System.out.println("Setup Completed");

        // Start the cleanup process
        System.out.println(
                "=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        System.out.println("Cleaning up Hub Vcn.");

        // Cleaning up the route tables must happen before deleting any associated entities.
        System.out.println("Clearing the route tables in Hub Vcn.");
        drgAttRT = updateRouteTable(virtualNetworkClient, drgAttRT, Collections.EMPTY_LIST);
        hubLpgRT = updateRouteTable(virtualNetworkClient, hubLpgRT, Collections.EMPTY_LIST);

        System.out.println("Deleting the Drg Attachment in Hub Vcn.");
        deleteDrgAttachment(virtualNetworkClient, drgAttachment);

        System.out.println("Deleting the Drg in Hub Vcn.");
        deleteDrg(virtualNetworkClient, drg);

        System.out.println("Deleting the Hub Lpg in Hub Vcn.");
        deleteLpg(virtualNetworkClient, hubLpg);

        // Route tables can only be deleted after the associated entities are deleted.
        System.out.println("Deleting route table associated with hubLpg Hub Vcn.");
        deleteRouteTable(virtualNetworkClient, hubLpgRT);

        System.out.println("Deleting route table associated with drgAttachment Hub Vcn.");
        deleteRouteTable(virtualNetworkClient, drgAttRT);

        System.out.println("Deleting the the Hub Vcn.");
        deleteVcn(virtualNetworkClient, hubVcn);

        System.out.println(
                "=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        System.out.println("Cleaning up Spoke Vcn.");

        System.out.println("Clearing the route tables in Spoke Vcn.");
        subnetRT = updateRouteTable(virtualNetworkClient, subnetRT, Collections.EMPTY_LIST);

        System.out.println("Deleting the Spoke Lpg in Spoke Vcn.");
        deleteLpg(virtualNetworkClient, spokeLpg);

        System.out.println("Deleting the subnet in Spoke Vcn.");
        deleteSubnet(virtualNetworkClient, spokeSubnet);

        System.out.println("Deleting the subnet route tbale in Spoke Vcn.");
        deleteRouteTable(virtualNetworkClient, subnetRT);

        System.out.println("Deleting the the Spoke Vcn.");
        deleteVcn(virtualNetworkClient, spokeVcn);
    }

    private static List<AvailabilityDomain> getAvailabilityDomains(
            final IdentityClient identityClient, final String compartmentId) {
        ListAvailabilityDomainsResponse listAvailabilityDomainsResponse =
                identityClient.listAvailabilityDomains(
                        ListAvailabilityDomainsRequest.builder()
                                .compartmentId(compartmentId)
                                .build());

        return listAvailabilityDomainsResponse.getItems();
    }

    private static Vcn createVcn(
            final VirtualNetwork virtualNetwork,
            final Region region,
            final String cidrBlock,
            final String label)
            throws Exception {
        final CreateVcnRequest request =
                CreateVcnRequest.builder()
                        .createVcnDetails(
                                CreateVcnDetails.builder()
                                        .cidrBlock(cidrBlock)
                                        .compartmentId(COMPARTMENT_ID)
                                        .displayName(
                                                String.format(
                                                        "%s-%s-%s",
                                                        region.getRegionId(),
                                                        label,
                                                        TIMESTAMP_SUFFIX))
                                        .dnsLabel(
                                                String.format(
                                                        "dns%s%s", region.getRegionCode(), label))
                                        .build())
                        .build();

        final CreateVcnResponse response = virtualNetwork.createVcn(request);

        virtualNetwork
                .getWaiters()
                .forVcn(
                        GetVcnRequest.builder().vcnId(response.getVcn().getId()).build(),
                        Vcn.LifecycleState.Available)
                .execute();
        return response.getVcn();
    }

    private static Drg createDrg(final VirtualNetwork virtualNetwork, final Region region)
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
        return response.getDrg();
    }

    private static DrgAttachment createDrgAttachment(
            final VirtualNetwork virtualNetwork, final Region region, final Vcn vcn, final Drg drg)
            throws Exception {
        final CreateDrgAttachmentRequest request =
                CreateDrgAttachmentRequest.builder()
                        .createDrgAttachmentDetails(
                                CreateDrgAttachmentDetails.builder()
                                        .displayName(
                                                String.format(
                                                        "DrgAttachment-%s-%s",
                                                        region.getRegionId(),
                                                        TIMESTAMP_SUFFIX))
                                        .drgId(drg.getId())
                                        .vcnId(vcn.getId())
                                        .build())
                        .build();

        final CreateDrgAttachmentResponse response = virtualNetwork.createDrgAttachment(request);

        virtualNetwork
                .getWaiters()
                .forDrgAttachment(
                        GetDrgAttachmentRequest.builder()
                                .drgAttachmentId(response.getDrgAttachment().getId())
                                .build(),
                        DrgAttachment.LifecycleState.Attached)
                .execute();
        return response.getDrgAttachment();
    }

    private static DrgAttachment associateRouteTableWithDrgAttachment(
            VirtualNetwork virtualNetwork, DrgAttachment drgAttachment, RouteTable routeTable)
            throws Exception {
        UpdateDrgAttachmentResponse response =
                virtualNetwork.updateDrgAttachment(
                        UpdateDrgAttachmentRequest.builder()
                                .drgAttachmentId(drgAttachment.getId())
                                .updateDrgAttachmentDetails(
                                        UpdateDrgAttachmentDetails.builder()
                                                .routeTableId(routeTable.getId())
                                                .build())
                                .build());
        return response.getDrgAttachment();
    }

    private static RouteTable createRouteTable(
            VirtualNetwork virtualNetwork, String displayName, Vcn vcn, List<RouteRule> routeRules)
            throws Exception {
        CreateRouteTableResponse response =
                virtualNetwork.createRouteTable(
                        CreateRouteTableRequest.builder()
                                .createRouteTableDetails(
                                        CreateRouteTableDetails.builder()
                                                .compartmentId(COMPARTMENT_ID)
                                                .vcnId(vcn.getId())
                                                .displayName(displayName)
                                                .routeRules(routeRules)
                                                .build())
                                .build());

        virtualNetwork
                .getWaiters()
                .forRouteTable(
                        GetRouteTableRequest.builder()
                                .rtId(response.getRouteTable().getId())
                                .build(),
                        RouteTable.LifecycleState.Available)
                .execute();
        return response.getRouteTable();
    }

    private static RouteTable updateRouteTable(
            VirtualNetwork virtualNetwork, RouteTable routeTable, List<RouteRule> routeRules)
            throws Exception {
        UpdateRouteTableResponse response =
                virtualNetwork.updateRouteTable(
                        UpdateRouteTableRequest.builder()
                                .rtId(routeTable.getId())
                                .updateRouteTableDetails(
                                        UpdateRouteTableDetails.builder()
                                                .routeRules(routeRules)
                                                .build())
                                .build());
        return response.getRouteTable();
    }

    private static Subnet createSubnet(
            VirtualNetwork virtualNetwork,
            Vcn vcn,
            String displayName,
            AvailabilityDomain availabilityDomain,
            RouteTable routeTable)
            throws Exception {
        CreateSubnetResponse response =
                virtualNetwork.createSubnet(
                        CreateSubnetRequest.builder()
                                .createSubnetDetails(
                                        CreateSubnetDetails.builder()
                                                .compartmentId(vcn.getCompartmentId())
                                                .availabilityDomain(availabilityDomain.getName())
                                                .displayName(displayName)
                                                .vcnId(vcn.getId())
                                                .cidrBlock(SPOKE_VCN_SUBNET_CIDR)
                                                .dnsLabel("javasdksubex")
                                                .routeTableId(routeTable.getId())
                                                .build())
                                .build());

        virtualNetwork
                .getWaiters()
                .forSubnet(
                        GetSubnetRequest.builder().subnetId(response.getSubnet().getId()).build(),
                        Subnet.LifecycleState.Available)
                .execute();
        System.out.println("Created Subnet: " + response.getSubnet().getId());
        return response.getSubnet();
    }

    private static LocalPeeringGateway createLpg(
            VirtualNetwork virtualNetwork, Vcn vcn, String displayName) throws Exception {
        CreateLocalPeeringGatewayResponse response =
                virtualNetwork.createLocalPeeringGateway(
                        CreateLocalPeeringGatewayRequest.builder()
                                .createLocalPeeringGatewayDetails(
                                        CreateLocalPeeringGatewayDetails.builder()
                                                .compartmentId(vcn.getCompartmentId())
                                                .displayName(displayName)
                                                .vcnId(vcn.getId())
                                                .build())
                                .build());

        virtualNetwork
                .getWaiters()
                .forLocalPeeringGateway(
                        GetLocalPeeringGatewayRequest.builder()
                                .localPeeringGatewayId(response.getLocalPeeringGateway().getId())
                                .build(),
                        LocalPeeringGateway.LifecycleState.Available)
                .execute();
        System.out.println("Created LPG: " + response.getLocalPeeringGateway().getId());
        return response.getLocalPeeringGateway();
    }

    private static void connectLpg(
            VirtualNetwork virtualNetwork, LocalPeeringGateway lpg1, LocalPeeringGateway lpg2)
            throws Exception {
        ConnectLocalPeeringGatewaysResponse response =
                virtualNetwork.connectLocalPeeringGateways(
                        ConnectLocalPeeringGatewaysRequest.builder()
                                .connectLocalPeeringGatewaysDetails(
                                        ConnectLocalPeeringGatewaysDetails.builder()
                                                .peerId(lpg2.getId())
                                                .build())
                                .localPeeringGatewayId(lpg1.getId())
                                .build());
        virtualNetwork
                .getWaiters()
                .forLocalPeeringGateway(
                        GetLocalPeeringGatewayRequest.builder()
                                .localPeeringGatewayId(lpg1.getId())
                                .build(),
                        LocalPeeringGateway.PeeringStatus.Peered)
                .execute();

        virtualNetwork
                .getWaiters()
                .forLocalPeeringGateway(
                        GetLocalPeeringGatewayRequest.builder()
                                .localPeeringGatewayId(lpg2.getId())
                                .build(),
                        LocalPeeringGateway.PeeringStatus.Peered)
                .execute();
    }

    private static LocalPeeringGateway associateRouteTableWithLpg(
            VirtualNetwork virtualNetwork, LocalPeeringGateway lpg, RouteTable routeTable)
            throws Exception {
        UpdateLocalPeeringGatewayResponse response =
                virtualNetwork.updateLocalPeeringGateway(
                        UpdateLocalPeeringGatewayRequest.builder()
                                .localPeeringGatewayId(lpg.getId())
                                .updateLocalPeeringGatewayDetails(
                                        UpdateLocalPeeringGatewayDetails.builder()
                                                .routeTableId(routeTable.getId())
                                                .build())
                                .build());
        return response.getLocalPeeringGateway();
    }

    private static void deleteLpg(VirtualNetwork virtualNetwork, LocalPeeringGateway lpg)
            throws Exception {
        virtualNetwork.deleteLocalPeeringGateway(
                DeleteLocalPeeringGatewayRequest.builder()
                        .localPeeringGatewayId(lpg.getId())
                        .build());
        virtualNetwork
                .getWaiters()
                .forLocalPeeringGateway(
                        GetLocalPeeringGatewayRequest.builder()
                                .localPeeringGatewayId(lpg.getId())
                                .build(),
                        LocalPeeringGateway.LifecycleState.Terminated)
                .execute();
        System.out.println("Deleted Lpg: " + lpg.getId());
    }

    private static void deleteSubnet(VirtualNetwork virtualNetwork, Subnet subnet)
            throws Exception {
        virtualNetwork.deleteSubnet(DeleteSubnetRequest.builder().subnetId(subnet.getId()).build());
        virtualNetwork
                .getWaiters()
                .forSubnet(
                        GetSubnetRequest.builder().subnetId(subnet.getId()).build(),
                        Subnet.LifecycleState.Terminated)
                .execute();
        System.out.println("Deleted Subnet: " + subnet.getId());
    }

    private static void deleteRouteTable(VirtualNetwork virtualNetwork, RouteTable routeTable)
            throws Exception {
        virtualNetwork.deleteRouteTable(
                DeleteRouteTableRequest.builder().rtId(routeTable.getId()).build());
        virtualNetwork
                .getWaiters()
                .forRouteTable(
                        GetRouteTableRequest.builder().rtId(routeTable.getId()).build(),
                        RouteTable.LifecycleState.Terminated)
                .execute();
        System.out.println("Deleted Route Table: " + routeTable.getId());
    }

    private static void deleteDrgAttachment(
            final VirtualNetwork virtualNetwork, final DrgAttachment drgAttachment)
            throws Exception {
        final DeleteDrgAttachmentRequest request =
                DeleteDrgAttachmentRequest.builder().drgAttachmentId(drgAttachment.getId()).build();
        virtualNetwork.deleteDrgAttachment(request);

        virtualNetwork
                .getWaiters()
                .forDrgAttachment(
                        GetDrgAttachmentRequest.builder()
                                .drgAttachmentId(drgAttachment.getId())
                                .build(),
                        DrgAttachment.LifecycleState.Detached)
                .execute();
        System.out.println("Deleted DrgAttachment: " + drgAttachment.getId());
    }

    private static void deleteDrg(final VirtualNetwork virtualNetwork, final Drg drg)
            throws Exception {
        final DeleteDrgRequest request = DeleteDrgRequest.builder().drgId(drg.getId()).build();
        virtualNetwork.deleteDrg(request);

        virtualNetwork
                .getWaiters()
                .forDrg(
                        GetDrgRequest.builder().drgId(drg.getId()).build(),
                        Drg.LifecycleState.Terminated)
                .execute();
        System.out.println("Deleted Drg: " + drg.getId());
    }

    private static void deleteVcn(final VirtualNetwork virtualNetwork, final Vcn vcn)
            throws Exception {
        final DeleteVcnRequest request = DeleteVcnRequest.builder().vcnId(vcn.getId()).build();
        virtualNetwork.deleteVcn(request);

        virtualNetwork
                .getWaiters()
                .forVcn(
                        GetVcnRequest.builder().vcnId(vcn.getId()).build(),
                        Vcn.LifecycleState.Terminated)
                .execute();
        System.out.println("Deleted Vcn: " + vcn.getId());
    }
}
