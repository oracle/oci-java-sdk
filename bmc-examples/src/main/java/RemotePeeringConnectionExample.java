/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.VirtualNetwork;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.ConnectRemotePeeringConnectionsDetails;
import com.oracle.bmc.core.model.CreateDrgAttachmentDetails;
import com.oracle.bmc.core.model.CreateDrgDetails;
import com.oracle.bmc.core.model.CreateRemotePeeringConnectionDetails;
import com.oracle.bmc.core.model.CreateVcnDetails;
import com.oracle.bmc.core.model.Drg;
import com.oracle.bmc.core.model.DrgAttachment;
import com.oracle.bmc.core.model.RemotePeeringConnection;
import com.oracle.bmc.core.model.Vcn;
import com.oracle.bmc.core.requests.ConnectRemotePeeringConnectionsRequest;
import com.oracle.bmc.core.requests.CreateDrgAttachmentRequest;
import com.oracle.bmc.core.requests.CreateDrgRequest;
import com.oracle.bmc.core.requests.CreateRemotePeeringConnectionRequest;
import com.oracle.bmc.core.requests.CreateVcnRequest;
import com.oracle.bmc.core.requests.DeleteDrgAttachmentRequest;
import com.oracle.bmc.core.requests.DeleteDrgRequest;
import com.oracle.bmc.core.requests.DeleteRemotePeeringConnectionRequest;
import com.oracle.bmc.core.requests.DeleteVcnRequest;
import com.oracle.bmc.core.requests.GetDrgAttachmentRequest;
import com.oracle.bmc.core.requests.GetDrgRequest;
import com.oracle.bmc.core.requests.GetRemotePeeringConnectionRequest;
import com.oracle.bmc.core.requests.GetVcnRequest;
import com.oracle.bmc.core.responses.CreateDrgAttachmentResponse;
import com.oracle.bmc.core.responses.CreateDrgResponse;
import com.oracle.bmc.core.responses.CreateRemotePeeringConnectionResponse;
import com.oracle.bmc.core.responses.CreateVcnResponse;

import java.util.concurrent.TimeUnit;

/**
 * Sample to demonstrate remote peering of two virtual cloud networks between two different regions within a single
 * compartment.
 * <p>
 * The sample relies on the correct IAM policies already being in place for a given compartment ID.
 * For more information, please refer to the
 * <a href="https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/remoteVCNpeering.htm">Remote VCN
 * Peering</a> documentation that is found on the Oracle Cloud Infrastructure developer portal.
 * <p>
 * The order of operations and waiting for the appropriate states is important. Each VCN can be set up
 * concurrently until the point where the connection is established. Deleting the connection and
 * resources can not be performed concurrently until the remote peering connection has been revoked. This sample
 * demonstrates the creation of resources on a single thread to more clearly demonstrate remote peering connections.
 * It is also worth noting that each VCN utilizes a dynamic routing gateway. DRGs are a finite resource and may require
 * contacting customer support if limits have been exceeded for a given tenancy.
 */
public class RemotePeeringConnectionExample {
    // Set this with your own compartment ID
    public static final String COMPARTMENT_ID = "";

    private static final String LOCAL_CIDR_BLOCK = "10.5.0.0/16";
    private static final String PEER_CIDR_BLOCK = "10.6.0.0/16";

    private static final String TIMESTAMP_SUFFIX =
            String.valueOf(System.currentTimeMillis() % TimeUnit.SECONDS.toMillis(10L));

    private final VirtualNetwork localVirtualNetwork;
    private final VirtualNetwork peerVirtualNetwork;

    private final Region localRegion;
    private final Region peerRegion;

    /**
     * Creates a new {@code RemotePeeringConnectionExample} object.
     *
     * @param localRegion the local region (e.g., "us-phoenix-1")
     * @param localVirtualNetwork the virtual network client for the local region
     * @param peerRegion the peer region (e.g., "us-ashburn-1")
     * @param peerVirtualNetwork the virtual network client for the peer region
     */
    public RemotePeeringConnectionExample(
            final Region localRegion,
            final VirtualNetwork localVirtualNetwork,
            final Region peerRegion,
            final VirtualNetwork peerVirtualNetwork) {
        this.localRegion = localRegion;
        this.localVirtualNetwork = localVirtualNetwork;
        this.peerRegion = peerRegion;
        this.peerVirtualNetwork = peerVirtualNetwork;
    }

    /**
     * Main entry point for the example.
     *
     * @param args command line arguments (not used)
     * @throws Exception if an error occurred
     */
    public static void main(final String... args) throws Exception {
        if ("".equals(COMPARTMENT_ID)) {
            throw new IllegalStateException("A compartment ID must be defined");
        }

        final AuthenticationDetailsProvider authProvider =
                new ConfigFileAuthenticationDetailsProvider("~/.oci/config", "DEFAULT");

        // The local virtual network client (PHX)
        final VirtualNetworkClient phxVirtualNetwork = new VirtualNetworkClient(authProvider);
        phxVirtualNetwork.setRegion(Region.US_PHOENIX_1);

        // The peer virtual network client (IAD)
        final VirtualNetworkClient iadVirtualNetwork = new VirtualNetworkClient(authProvider);
        iadVirtualNetwork.setRegion(Region.US_ASHBURN_1);

        final RemotePeeringConnectionExample example =
                new RemotePeeringConnectionExample(
                        Region.US_PHOENIX_1,
                        phxVirtualNetwork,
                        Region.US_ASHBURN_1,
                        iadVirtualNetwork);
        example.run();
    }

    /**
     * The primary business logic that creates two VCNs, establishes a remote peering connection, and cleans up.
     *
     * @throws Exception if an error occurred
     */
    public void run() throws Exception {
        final String localRegionCode = localRegion.getRegionCode().toUpperCase(); // PHX
        final String peerRegionCode = peerRegion.getRegionCode().toUpperCase(); // IAD

        // ------------------------------
        // Set up a VCN in PHX as 'local'

        System.out.println(String.format("Setting up VCN in %s...", localRegionCode));
        System.out.println("    Creating VCN");
        final String localVcnId = createVcn(localVirtualNetwork, localRegion, LOCAL_CIDR_BLOCK);
        System.out.println("        Created VCN with ID: " + localVcnId);

        System.out.println("    Creating DRG");
        final String localDrgId = createDrg(localVirtualNetwork, localRegion);
        System.out.println("        Created DRG with ID: " + localDrgId);

        System.out.println("    Creating DRG Attachment");
        final String localDrgAttachmentId =
                createDrgAttachment(localVirtualNetwork, localRegion, localVcnId, localDrgId);
        System.out.println("        Created DRG Attachment with ID: " + localDrgAttachmentId);

        System.out.println("    Creating Remote Peering Connection");
        final String localRemotePeeringConnectionId =
                createRemotePeeringConnection(localVirtualNetwork, localRegion, localDrgId);
        System.out.println(
                "        Created Remote Peering Connection with ID: "
                        + localRemotePeeringConnectionId);

        // ---------------------------------
        // Set up a VCN in IAD as the 'peer'

        System.out.println(String.format("Setting up VCN in %s...", peerRegionCode));
        System.out.println("    Creating VCN");
        final String peerVcnId = createVcn(peerVirtualNetwork, peerRegion, PEER_CIDR_BLOCK);
        System.out.println("        Created VCN with ID: " + peerVcnId);

        System.out.println("    Creating DRG");
        final String peerDrgId = createDrg(peerVirtualNetwork, peerRegion);
        System.out.println("        Created DRG with ID: " + peerDrgId);

        System.out.println("    Creating DRG Attachment");
        final String peerDrgAttachmentId =
                createDrgAttachment(peerVirtualNetwork, peerRegion, peerVcnId, peerDrgId);
        System.out.println("        Created DRG Attachment with ID: " + peerDrgAttachmentId);

        System.out.println("    Creating Remote Peering Connection");
        final String peerRemotePeeringConnectionId =
                createRemotePeeringConnection(peerVirtualNetwork, peerRegion, peerDrgId);
        System.out.println(
                "        Created Remote Peering Connection with ID: "
                        + peerRemotePeeringConnectionId);

        // --------------------------------------------
        // Establish the connection between PHX and IAD

        System.out.println("\nEstablishing remote peering connection...");
        final ConnectRemotePeeringConnectionsRequest request =
                ConnectRemotePeeringConnectionsRequest.builder()
                        .connectRemotePeeringConnectionsDetails(
                                ConnectRemotePeeringConnectionsDetails.builder()
                                        .peerId(
                                                peerRemotePeeringConnectionId) // The peer's remote peering connection ID in IAD
                                        .peerRegionName(
                                                peerRegion.getRegionId()) // e.g., "us-ashburn-1"
                                        .build())
                        .remotePeeringConnectionId(
                                localRemotePeeringConnectionId) // The local peering connection ID in PHX
                        .build();
        localVirtualNetwork.connectRemotePeeringConnections(request);

        // Ensure that the connection reflects the peering status in both regions
        localVirtualNetwork
                .getWaiters()
                .forRemotePeeringConnection(
                        GetRemotePeeringConnectionRequest.builder()
                                .remotePeeringConnectionId(localRemotePeeringConnectionId)
                                .build(),
                        RemotePeeringConnection.PeeringStatus.Peered)
                .execute();
        peerVirtualNetwork
                .getWaiters()
                .forRemotePeeringConnection(
                        GetRemotePeeringConnectionRequest.builder()
                                .remotePeeringConnectionId(peerRemotePeeringConnectionId)
                                .build(),
                        RemotePeeringConnection.PeeringStatus.Peered)
                .execute();
        System.out.println("    Remote Peering connection established");

        // --------
        // Clean up

        System.out.println("\nCleaning up resources...");
        System.out.println("    Deleting local remote peering connection in " + localRegionCode);
        deleteRemotePeeringConnection(localVirtualNetwork, localRemotePeeringConnectionId);

        // Note: It is important to wait for the PeeringStatus to reflect a REVOKED status before proceeding

        System.out.println(
                "    Waiting for remote peering connection status to be revoked in "
                        + peerRegionCode);
        peerVirtualNetwork
                .getWaiters()
                .forRemotePeeringConnection(
                        GetRemotePeeringConnectionRequest.builder()
                                .remotePeeringConnectionId(peerRemotePeeringConnectionId)
                                .build(),
                        RemotePeeringConnection.PeeringStatus.Revoked)
                .execute();

        System.out.println(
                "    Waiting for remote peering connection status to be revoked in "
                        + localRegionCode);
        localVirtualNetwork
                .getWaiters()
                .forRemotePeeringConnection(
                        GetRemotePeeringConnectionRequest.builder()
                                .remotePeeringConnectionId(localRemotePeeringConnectionId)
                                .build(),
                        RemotePeeringConnection.PeeringStatus.Revoked)
                .execute();

        System.out.println("    Deleting remote peering connection in " + peerRegionCode);
        deleteRemotePeeringConnection(peerVirtualNetwork, peerRemotePeeringConnectionId);

        System.out.println("    Deleting DRG Attachment in " + peerRegionCode);
        deleteDrgAttachment(peerVirtualNetwork, peerDrgAttachmentId);

        System.out.println("    Deleting DRG in " + peerRegionCode);
        deleteDrg(peerVirtualNetwork, peerDrgId);

        System.out.println("    Deleting VCN in " + peerRegionCode);
        deleteVcn(peerVirtualNetwork, peerVcnId);

        System.out.println("    Deleting DRG Attachment in " + localRegionCode);
        deleteDrgAttachment(localVirtualNetwork, localDrgAttachmentId);

        System.out.println("    Deleting DRG in " + localRegionCode);
        deleteDrg(localVirtualNetwork, localDrgId);

        System.out.println("    Deleting VCN in " + localRegionCode);
        deleteVcn(localVirtualNetwork, localVcnId);
    }

    // -----------------
    // Create Operations

    public static String createVcn(
            final VirtualNetwork virtualNetwork, final Region region, final String cidrBlock)
            throws Exception {
        final CreateVcnRequest request =
                CreateVcnRequest.builder()
                        .createVcnDetails(
                                CreateVcnDetails.builder()
                                        .cidrBlock(cidrBlock)
                                        .compartmentId(COMPARTMENT_ID)
                                        .displayName(
                                                String.format(
                                                        "VCN-%s-%s",
                                                        region.getRegionId(),
                                                        TIMESTAMP_SUFFIX))
                                        .dnsLabel(
                                                String.format(
                                                        "dns%s%s",
                                                        region.getRegionCode(),
                                                        TIMESTAMP_SUFFIX))
                                        .build())
                        .build();

        final CreateVcnResponse response = virtualNetwork.createVcn(request);
        final String vcnId = response.getVcn().getId();

        virtualNetwork
                .getWaiters()
                .forVcn(GetVcnRequest.builder().vcnId(vcnId).build(), Vcn.LifecycleState.Available)
                .execute();
        return vcnId;
    }

    public static String createDrg(final VirtualNetwork virtualNetwork, final Region region)
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
        final String drgId = response.getDrg().getId();

        virtualNetwork
                .getWaiters()
                .forDrg(GetDrgRequest.builder().drgId(drgId).build(), Drg.LifecycleState.Available)
                .execute();
        return drgId;
    }

    public static String createDrgAttachment(
            final VirtualNetwork virtualNetwork,
            final Region region,
            final String vcnId,
            final String drgId)
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
                                        .drgId(drgId)
                                        .vcnId(vcnId)
                                        .build())
                        .build();

        final CreateDrgAttachmentResponse response = virtualNetwork.createDrgAttachment(request);
        final String drgAttachmentId = response.getDrgAttachment().getId();

        virtualNetwork
                .getWaiters()
                .forDrgAttachment(
                        GetDrgAttachmentRequest.builder().drgAttachmentId(drgAttachmentId).build(),
                        DrgAttachment.LifecycleState.Attached)
                .execute();
        return drgAttachmentId;
    }

    public static String createRemotePeeringConnection(
            final VirtualNetwork virtualNetwork, final Region region, final String drgId)
            throws Exception {
        final CreateRemotePeeringConnectionRequest request =
                CreateRemotePeeringConnectionRequest.builder()
                        .createRemotePeeringConnectionDetails(
                                CreateRemotePeeringConnectionDetails.builder()
                                        .compartmentId(COMPARTMENT_ID)
                                        .displayName(
                                                String.format(
                                                        "RemotePeeringConnection-%s-%s",
                                                        region.getRegionId(),
                                                        TIMESTAMP_SUFFIX))
                                        .drgId(drgId)
                                        .build())
                        .build();

        final CreateRemotePeeringConnectionResponse response =
                virtualNetwork.createRemotePeeringConnection(request);
        final String remotePeeringConnectionId = response.getRemotePeeringConnection().getId();

        virtualNetwork
                .getWaiters()
                .forRemotePeeringConnection(
                        GetRemotePeeringConnectionRequest.builder()
                                .remotePeeringConnectionId(remotePeeringConnectionId)
                                .build(),
                        RemotePeeringConnection.LifecycleState.Available)
                .execute();
        return remotePeeringConnectionId;
    }

    // -----------------
    // Delete operations

    public static void deleteRemotePeeringConnection(
            final VirtualNetwork virtualNetwork, final String remotePeeringConnectionId)
            throws Exception {
        final DeleteRemotePeeringConnectionRequest request =
                DeleteRemotePeeringConnectionRequest.builder()
                        .remotePeeringConnectionId(remotePeeringConnectionId)
                        .build();
        virtualNetwork.deleteRemotePeeringConnection(request);

        virtualNetwork
                .getWaiters()
                .forRemotePeeringConnection(
                        GetRemotePeeringConnectionRequest.builder()
                                .remotePeeringConnectionId(remotePeeringConnectionId)
                                .build(),
                        RemotePeeringConnection.LifecycleState.Terminated)
                .execute();
    }

    public static void deleteDrgAttachment(
            final VirtualNetwork virtualNetwork, final String drgAttachmentId) throws Exception {
        final DeleteDrgAttachmentRequest request =
                DeleteDrgAttachmentRequest.builder().drgAttachmentId(drgAttachmentId).build();
        virtualNetwork.deleteDrgAttachment(request);

        virtualNetwork
                .getWaiters()
                .forDrgAttachment(
                        GetDrgAttachmentRequest.builder().drgAttachmentId(drgAttachmentId).build(),
                        DrgAttachment.LifecycleState.Detached)
                .execute();
    }

    public static void deleteDrg(final VirtualNetwork virtualNetwork, final String drgId)
            throws Exception {
        final DeleteDrgRequest request = DeleteDrgRequest.builder().drgId(drgId).build();
        virtualNetwork.deleteDrg(request);

        virtualNetwork
                .getWaiters()
                .forDrg(GetDrgRequest.builder().drgId(drgId).build(), Drg.LifecycleState.Terminated)
                .execute();
    }

    public static void deleteVcn(final VirtualNetwork virtualNetwork, final String vcnId)
            throws Exception {
        final DeleteVcnRequest request = DeleteVcnRequest.builder().vcnId(vcnId).build();
        virtualNetwork.deleteVcn(request);

        virtualNetwork
                .getWaiters()
                .forVcn(GetVcnRequest.builder().vcnId(vcnId).build(), Vcn.LifecycleState.Terminated)
                .execute();
    }
}
