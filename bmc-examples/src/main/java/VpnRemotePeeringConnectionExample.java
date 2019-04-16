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
import com.oracle.bmc.core.requests.CreateDrgRequest;
import com.oracle.bmc.core.requests.DeleteDrgRequest;
import com.oracle.bmc.core.requests.GetDrgRequest;
import com.oracle.bmc.core.model.RemotePeeringConnection;
import com.oracle.bmc.core.model.CreateRemotePeeringConnectionDetails;
import com.oracle.bmc.core.model.UpdateRemotePeeringConnectionDetails;
import com.oracle.bmc.core.requests.CreateRemotePeeringConnectionRequest;
import com.oracle.bmc.core.requests.UpdateRemotePeeringConnectionRequest;
import com.oracle.bmc.core.requests.DeleteRemotePeeringConnectionRequest;
import com.oracle.bmc.core.requests.GetRemotePeeringConnectionRequest;
import com.oracle.bmc.core.responses.CreateDrgResponse;

import com.oracle.bmc.core.responses.CreateRemotePeeringConnectionResponse;
import com.oracle.bmc.core.responses.UpdateRemotePeeringConnectionResponse;
import com.oracle.bmc.core.responses.GetRemotePeeringConnectionResponse;

import com.oracle.bmc.identity.IdentityClient;
import org.apache.commons.lang3.StringUtils;

import java.util.concurrent.TimeUnit;

/**
 * Sample to demonstrate setting up Vpn RemotePeeringConnection
 * <p>
 *
 *
 *  Oracle Cloud Infrastructure Vpn provides an easy way to create a dedicated,
 *  private connection between your data center and Oracle Cloud Infrastructure.
 *
 *  Vpn provides higher-bandwidth options, and a more reliable and consistent
 *  networking experience compared to internet-based connections.
 *
 *  Details information on Vpn: https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/Vpn.htm
 *
 *  Details RemotePeeringConnection API: https://docs.cloud.oracle.com/iaas/api/#/en/iaas/20160918/RemotePeeringConnection
 */
public class VpnRemotePeeringConnectionExample {
    // Set this with your own compartment ID
    private static final String COMPARTMENT_ID = "your_Compartment_Ocid_here";

    private static final String TIMESTAMP_SUFFIX =
            String.valueOf(System.currentTimeMillis() % TimeUnit.SECONDS.toMillis(10L));

    private final VirtualNetworkClient virtualNetworkClient;
    private final Region region;

    public VpnRemotePeeringConnectionExample(
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
        final VpnRemotePeeringConnectionExample example =
                new VpnRemotePeeringConnectionExample(phxVirtualNetworkClient, Region.US_PHOENIX_1);
        final IdentityClient identityClient = new IdentityClient(authProvider);

        example.run(identityClient);
    }

    public void run(IdentityClient identityClient) throws Exception {

        System.out.println("Create RemotePeeringConnection example, NON-LAG physical connection.");
        Drg drg = null;
        RemotePeeringConnection cc = null;
        try {
            System.out.println("Creating DRG.");
            drg = createDrg(virtualNetworkClient, region);

            System.out.println("Create RemotePeeringConnection.");
            cc = createRemotePeeringConnection(virtualNetworkClient, COMPARTMENT_ID, drg);

            System.out.println("Activate the RemotePeeringConnection.");
            cc = updateRemotePeeringConnection(virtualNetworkClient, cc.getId(), true);

        } finally {
            System.out.println("Delete RemotePeeringConnection.");
            if (null != cc) {
                deleteRemotePeeringConnection(virtualNetworkClient, cc.getId());
            }

            if (null != drg) {
                deleteDrg(virtualNetworkClient, drg);
            }
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

    private static RemotePeeringConnection createRemotePeeringConnection(
            final VirtualNetwork virtualNetwork, final String compartmentId, final Drg drg)
            throws Exception {
        final CreateRemotePeeringConnectionRequest request =
                CreateRemotePeeringConnectionRequest.builder()
                        .createRemotePeeringConnectionDetails(
                                CreateRemotePeeringConnectionDetails.builder()
                                        .compartmentId(compartmentId)
                                        .displayName(String.format("CC-%s", TIMESTAMP_SUFFIX))
                                        .drgId(drg.getId())
                                        .build())
                        .build();

        final CreateRemotePeeringConnectionResponse response =
                virtualNetwork.createRemotePeeringConnection(request);

        virtualNetwork
                .getWaiters()
                .forRemotePeeringConnection(
                        GetRemotePeeringConnectionRequest.builder()
                                .remotePeeringConnectionId(
                                        response.getRemotePeeringConnection().getId())
                                .build(),
                        RemotePeeringConnection.LifecycleState.Available)
                .execute();
        return response.getRemotePeeringConnection();
    }

    private static RemotePeeringConnection getRemotePeeringConnection(
            final VirtualNetwork virtualNetwork, final String ccId) throws Exception {

        final GetRemotePeeringConnectionRequest request =
                GetRemotePeeringConnectionRequest.builder().remotePeeringConnectionId(ccId).build();
        final GetRemotePeeringConnectionResponse response =
                virtualNetwork.getRemotePeeringConnection(request);

        return response.getRemotePeeringConnection();
    }

    /*
     * Use UPDATE to update display name and activate the physical connection
     */
    private static RemotePeeringConnection updateRemotePeeringConnection(
            final VirtualNetwork virtualNetwork, final String ccId, final boolean isActive)
            throws Exception {
        final UpdateRemotePeeringConnectionRequest request =
                UpdateRemotePeeringConnectionRequest.builder()
                        .remotePeeringConnectionId(ccId)
                        .updateRemotePeeringConnectionDetails(
                                UpdateRemotePeeringConnectionDetails.builder()
                                        .displayName(String.format("CC-%s", TIMESTAMP_SUFFIX))
                                        .build())
                        .build();

        final UpdateRemotePeeringConnectionResponse response =
                virtualNetwork.updateRemotePeeringConnection(request);

        virtualNetwork
                .getWaiters()
                .forRemotePeeringConnection(
                        GetRemotePeeringConnectionRequest.builder()
                                .remotePeeringConnectionId(
                                        response.getRemotePeeringConnection().getId())
                                .build(),
                        RemotePeeringConnection.LifecycleState.Available)
                .execute();

        return response.getRemotePeeringConnection();
    }

    private static void deleteRemotePeeringConnection(
            final VirtualNetwork virtualNetwork, final String ccId) throws Exception {

        // if resource is in provisioning, wait until provisioned
        RemotePeeringConnection cc = getRemotePeeringConnection(virtualNetwork, ccId);
        if (cc.getLifecycleState() != RemotePeeringConnection.LifecycleState.Available) {
            throw new IllegalStateException(
                    "Failed to start deleting RemotePeeringConnection due to RemotePeeringConnection in invalid state.");
        }

        virtualNetwork.deleteRemotePeeringConnection(
                DeleteRemotePeeringConnectionRequest.builder()
                        .remotePeeringConnectionId(ccId)
                        .build());
        virtualNetwork
                .getWaiters()
                .forRemotePeeringConnection(
                        GetRemotePeeringConnectionRequest.builder()
                                .remotePeeringConnectionId(ccId)
                                .build(),
                        RemotePeeringConnection.LifecycleState.Terminated)
                .execute();
        System.out.println("Deleted RemotePeeringConnection: " + cc.getId());
    }
}
