/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.VirtualNetwork;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.Cpe;
import com.oracle.bmc.core.model.CreateCpeDetails;
import com.oracle.bmc.core.model.Drg;
import com.oracle.bmc.core.model.CreateDrgDetails;
import com.oracle.bmc.core.requests.CreateCpeRequest;
import com.oracle.bmc.core.requests.DeleteCpeRequest;
import com.oracle.bmc.core.requests.CreateDrgRequest;
import com.oracle.bmc.core.requests.DeleteDrgRequest;
import com.oracle.bmc.core.requests.GetDrgRequest;
import com.oracle.bmc.core.model.IPSecConnection;
import com.oracle.bmc.core.model.CreateIPSecConnectionDetails;
import com.oracle.bmc.core.model.UpdateIPSecConnectionDetails;
import com.oracle.bmc.core.requests.CreateIPSecConnectionRequest;
import com.oracle.bmc.core.requests.UpdateIPSecConnectionRequest;
import com.oracle.bmc.core.requests.DeleteIPSecConnectionRequest;
import com.oracle.bmc.core.requests.GetIPSecConnectionRequest;
import com.oracle.bmc.core.responses.CreateCpeResponse;
import com.oracle.bmc.core.responses.CreateDrgResponse;
import com.oracle.bmc.core.responses.CreateIPSecConnectionResponse;
import com.oracle.bmc.core.responses.UpdateIPSecConnectionResponse;
import com.oracle.bmc.core.responses.GetIPSecConnectionResponse;
import com.oracle.bmc.identity.IdentityClient;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Sample to demonstrate setting up Vpn IPSecConnection
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
 *  Details IPSecConnection API: https://docs.cloud.oracle.com/iaas/api/#/en/iaas/20160918/IPSecConnection
 */
public class VpnIPSecConnectionExample {
    // Set this with your own compartment ID
    private static final String COMPARTMENT_ID = "your_Compartment_Ocid_here";

    private static final String TIMESTAMP_SUFFIX =
            String.valueOf(System.currentTimeMillis() % TimeUnit.SECONDS.toMillis(10L));

    private final VirtualNetworkClient virtualNetworkClient;
    private final Region region;

    public VpnIPSecConnectionExample(VirtualNetworkClient virtualNetworkClient, Region region) {
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
        final VpnIPSecConnectionExample example =
                new VpnIPSecConnectionExample(phxVirtualNetworkClient, Region.US_PHOENIX_1);
        final IdentityClient identityClient = new IdentityClient(authProvider);

        example.run(identityClient);
    }

    public void run(IdentityClient identityClient) throws Exception {

        System.out.println("Create IPSecConnection example.");
        Cpe cpe = null;
        Drg drg = null;
        IPSecConnection cc = null;
        try {
            System.out.println("Creating Cpe.");
            cpe = createCpe(virtualNetworkClient, region);

            System.out.println("Creating DRG.");
            drg = createDrg(virtualNetworkClient, region);

            System.out.println("Create IPSecConnection.");
            cc = createIPSecConnection(virtualNetworkClient, COMPARTMENT_ID, cpe, drg);

            System.out.println("Activate the IPSecConnection.");
            cc = updateIPSecConnection(virtualNetworkClient, cc.getId(), true);

        } finally {
            System.out.println("Delete IPSecConnection.");
            if (null != cc) {
                deleteIPSecConnection(virtualNetworkClient, cc.getId());
            }
            System.out.println("Delete Drg.");
            if (null != drg) {
                deleteDrg(virtualNetworkClient, drg);
            }
            System.out.println("Delete Cpe.");
            if (null != cpe) {
                deleteCpe(virtualNetworkClient, cpe);
            }
        }
    }

    public static Cpe createCpe(final VirtualNetwork virtualNetwork, final Region region) {
        final CreateCpeRequest request =
                CreateCpeRequest.builder()
                        .createCpeDetails(
                                CreateCpeDetails.builder()
                                        .compartmentId(COMPARTMENT_ID)
                                        .displayName(
                                                String.format(
                                                        "Drg-%s-%s",
                                                        region.getRegionId(),
                                                        TIMESTAMP_SUFFIX))
                                        .ipAddress("192.168.0.2")
                                        .build())
                        .build();

        final CreateCpeResponse response = virtualNetwork.createCpe(request);

        System.out.println("Created DRG: " + response.getCpe().getId());

        return response.getCpe();
    }

    public static void deleteCpe(final VirtualNetwork virtualNetwork, final Cpe cpe)
            throws Exception {
        final DeleteCpeRequest request = DeleteCpeRequest.builder().cpeId(cpe.getId()).build();
        virtualNetwork.deleteCpe(request);

        System.out.println("Deleted Cpe: " + cpe.getId());
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

    private static IPSecConnection createIPSecConnection(
            final VirtualNetwork virtualNetwork,
            final String compartmentId,
            final Cpe cpe,
            final Drg drg)
            throws Exception {
        List<String> items = new ArrayList<>();
        items.add("192.168.1.0/24");

        final CreateIPSecConnectionRequest request =
                CreateIPSecConnectionRequest.builder()
                        .createIPSecConnectionDetails(
                                CreateIPSecConnectionDetails.builder()
                                        .compartmentId(compartmentId)
                                        .displayName(String.format("CC-%s", TIMESTAMP_SUFFIX))
                                        .cpeId(cpe.getId())
                                        .drgId(drg.getId())
                                        .staticRoutes(items)
                                        .build())
                        .build();

        final CreateIPSecConnectionResponse response =
                virtualNetwork.createIPSecConnection(request);

        virtualNetwork
                .getWaiters()
                .forIPSecConnection(
                        GetIPSecConnectionRequest.builder()
                                .ipscId(response.getIPSecConnection().getId())
                                .build(),
                        IPSecConnection.LifecycleState.Available)
                .execute();
        return response.getIPSecConnection();
    }

    private static IPSecConnection getIPSecConnection(
            final VirtualNetwork virtualNetwork, final String ccId) {

        final GetIPSecConnectionRequest request =
                GetIPSecConnectionRequest.builder().ipscId(ccId).build();
        final GetIPSecConnectionResponse response = virtualNetwork.getIPSecConnection(request);

        return response.getIPSecConnection();
    }

    /*
     * Use UPDATE to update display name and activate the physical connection
     */
    private static IPSecConnection updateIPSecConnection(
            final VirtualNetwork virtualNetwork, final String ccId, final boolean isActive)
            throws Exception {
        final UpdateIPSecConnectionRequest request =
                UpdateIPSecConnectionRequest.builder()
                        .ipscId(ccId)
                        .updateIPSecConnectionDetails(
                                UpdateIPSecConnectionDetails.builder()
                                        .displayName(String.format("CC-%s", TIMESTAMP_SUFFIX))
                                        .build())
                        .build();

        final UpdateIPSecConnectionResponse response =
                virtualNetwork.updateIPSecConnection(request);

        virtualNetwork
                .getWaiters()
                .forIPSecConnection(
                        GetIPSecConnectionRequest.builder()
                                .ipscId(response.getIPSecConnection().getId())
                                .build(),
                        IPSecConnection.LifecycleState.Available)
                .execute();

        return response.getIPSecConnection();
    }

    private static void deleteIPSecConnection(
            final VirtualNetwork virtualNetwork, final String ccId) throws Exception {

        // if resource is in provisioning state, wait until provisioned
        IPSecConnection cc = getIPSecConnection(virtualNetwork, ccId);
        if (cc.getLifecycleState() != IPSecConnection.LifecycleState.Available
                && cc.getLifecycleState() != IPSecConnection.LifecycleState.Provisioning) {
            throw new IllegalStateException(
                    "Failed to start deleting IPSecConnection due to IPSecConnection in invalid state.");
        }

        virtualNetwork.deleteIPSecConnection(
                DeleteIPSecConnectionRequest.builder().ipscId(ccId).build());
        virtualNetwork
                .getWaiters()
                .forIPSecConnection(
                        GetIPSecConnectionRequest.builder().ipscId(ccId).build(),
                        IPSecConnection.LifecycleState.Terminated)
                .execute();
        System.out.println("Deleted IPSecConnection: " + cc.getId());
    }
}
