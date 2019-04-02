/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.VirtualNetwork;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;
import com.oracle.bmc.identity.IdentityClient;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Sample to demonstrate setting up FastConnect CrossConnectGroup
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
 *  Details CrossConnectGroup API: https://docs.cloud.oracle.com/iaas/api/#/en/iaas/20160918/CrossConnectGroup
 */
public class FastConnectCrossConnectGroupExample {
    // Set this with your own compartment ID
    private static final String COMPARTMENT_ID = "";

    private static final String TIMESTAMP_SUFFIX =
            String.valueOf(System.currentTimeMillis() % TimeUnit.SECONDS.toMillis(10L));

    private final VirtualNetworkClient virtualNetworkClient;
    private final Region region;

    public FastConnectCrossConnectGroupExample(
            VirtualNetworkClient virtualNetworkClient, Region region) {
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
        final FastConnectCrossConnectGroupExample example =
                new FastConnectCrossConnectGroupExample(
                        phxVirtualNetworkClient, Region.US_PHOENIX_1);
        final IdentityClient identityClient = new IdentityClient(authProvider);

        example.run(identityClient);
    }

    public void run(IdentityClient identityClient) throws Exception {

        System.out.println("Create CrossConnectGroup example, LAG physical connection.");

        System.out.println("Get list of CrossConnect locations POP.");
        List<CrossConnectLocation> listCrossConnectLocations =
                getCrossConnectLocations(virtualNetworkClient, COMPARTMENT_ID);

        System.out.println("Get list of CrossConnect port speeds.");
        List<CrossConnectPortSpeedShape> listCrossConnectPortSpeedShape =
                getCrossConnectPortSpeedShapes(virtualNetworkClient, COMPARTMENT_ID);

        System.out.println("Create CrossConnectGroup.");
        CrossConnectGroup ccg = createCrossConnectGroup(virtualNetworkClient, COMPARTMENT_ID);

        System.out.println("Update CrossConnectGroup.");
        ccg = updateCrossConnectGroup(virtualNetworkClient, ccg.getId());

        System.out.println("Add a (physical connection) CrossConnect to CrossConnectGroup.");
        CrossConnect cc =
                createCrossConnect(
                        virtualNetworkClient,
                        COMPARTMENT_ID,
                        ccg.getId(),
                        listCrossConnectLocations.get(0).getName(),
                        listCrossConnectPortSpeedShape.get(0).getName());

        System.out.println(
                "Activate the CrossConnect. This also activate CrossConnectGroup as well.");
        cc = updateCrossConnect(virtualNetworkClient, cc.getId(), true);

        System.out.println("Remove physical connection from LAG.");
        deleteCrossConnect(virtualNetworkClient, ccg.getId(), cc.getId());

        System.out.println("Delete CrossConnect group.");
        deleteCrossConnectGroup(virtualNetworkClient, ccg.getId());
    }

    private static List<CrossConnectLocation> getCrossConnectLocations(
            final VirtualNetwork virtualNetwork, final String compartmentId) {
        ListCrossConnectLocationsResponse listCrossConnectLocationsResponse =
                virtualNetwork.listCrossConnectLocations(
                        ListCrossConnectLocationsRequest.builder()
                                .compartmentId(compartmentId)
                                .build());

        return listCrossConnectLocationsResponse.getItems();
    }

    private static List<CrossConnectPortSpeedShape> getCrossConnectPortSpeedShapes(
            final VirtualNetwork virtualNetwork, final String compartmentId) {
        final ListCrossconnectPortSpeedShapesResponse listCrossconnectPortSpeedShapesResponse =
                virtualNetwork.listCrossconnectPortSpeedShapes(
                        ListCrossconnectPortSpeedShapesRequest.builder()
                                .compartmentId(compartmentId)
                                .build());

        return listCrossconnectPortSpeedShapesResponse.getItems();
    }

    private static CrossConnectGroup createCrossConnectGroup(
            final VirtualNetwork virtualNetwork, final String compartmentId) throws Exception {
        final CreateCrossConnectGroupRequest request =
                CreateCrossConnectGroupRequest.builder()
                        .createCrossConnectGroupDetails(
                                CreateCrossConnectGroupDetails.builder()
                                        .compartmentId(COMPARTMENT_ID)
                                        .displayName(String.format("CCG-%s", TIMESTAMP_SUFFIX))
                                        .build())
                        .build();

        final CreateCrossConnectGroupResponse response =
                virtualNetwork.createCrossConnectGroup(request);

        virtualNetwork
                .getWaiters()
                .forCrossConnectGroup(
                        GetCrossConnectGroupRequest.builder()
                                .crossConnectGroupId(response.getCrossConnectGroup().getId())
                                .build(),
                        CrossConnectGroup.LifecycleState.Inactive)
                .execute();
        return response.getCrossConnectGroup();
    }

    private static CrossConnectGroup getCrossConnectGroup(
            final VirtualNetwork virtualNetwork, final String ccgId) throws Exception {

        final GetCrossConnectGroupRequest request =
                GetCrossConnectGroupRequest.builder().crossConnectGroupId(ccgId).build();
        final GetCrossConnectGroupResponse response = virtualNetwork.getCrossConnectGroup(request);

        return response.getCrossConnectGroup();
    }

    private static CrossConnectGroup updateCrossConnectGroup(
            final VirtualNetwork virtualNetwork, final String ccgId) throws Exception {
        final UpdateCrossConnectGroupRequest request =
                UpdateCrossConnectGroupRequest.builder()
                        .crossConnectGroupId(ccgId)
                        .updateCrossConnectGroupDetails(
                                UpdateCrossConnectGroupDetails.builder()
                                        .displayName(String.format("CCG-%s", TIMESTAMP_SUFFIX))
                                        .build())
                        .build();

        final UpdateCrossConnectGroupResponse response =
                virtualNetwork.updateCrossConnectGroup(request);

        return response.getCrossConnectGroup();
    }

    private static void deleteCrossConnectGroup(VirtualNetwork virtualNetwork, final String ccgId)
            throws Exception {

        // if ccg is in provisioning, wait until provisioned
        CrossConnectGroup ccg = getCrossConnectGroup(virtualNetwork, ccgId);

        if (ccg.getLifecycleState() != CrossConnectGroup.LifecycleState.Inactive) {
            throw new Exception(
                    "Failed to start deleting CrossConnectGroup due to CrossConnectGroup in invalid state.");
        }

        virtualNetwork.deleteCrossConnectGroup(
                DeleteCrossConnectGroupRequest.builder().crossConnectGroupId(ccgId).build());
        virtualNetwork
                .getWaiters()
                .forCrossConnect(
                        GetCrossConnectRequest.builder().crossConnectId(ccgId).build(),
                        CrossConnect.LifecycleState.Terminated)
                .execute();
        System.out.println("Deleted CrossConnectGroup: " + ccg.getId());
    }

    private static CrossConnect createCrossConnect(
            final VirtualNetwork virtualNetwork,
            final String compartmentId,
            final String ccgId,
            final String locationName,
            final String portSpeedShapeName)
            throws Exception {
        final CreateCrossConnectRequest request =
                CreateCrossConnectRequest.builder()
                        .createCrossConnectDetails(
                                CreateCrossConnectDetails.builder()
                                        .compartmentId(COMPARTMENT_ID)
                                        .displayName(String.format("CC-%s", TIMESTAMP_SUFFIX))
                                        .crossConnectGroupId(ccgId)
                                        .locationName(locationName)
                                        .portSpeedShapeName(portSpeedShapeName)
                                        .build())
                        .build();

        final CreateCrossConnectResponse response = virtualNetwork.createCrossConnect(request);

        virtualNetwork
                .getWaiters()
                .forCrossConnect(
                        GetCrossConnectRequest.builder()
                                .crossConnectId(response.getCrossConnect().getId())
                                .build(),
                        CrossConnect.LifecycleState.PendingCustomer)
                .execute();
        return response.getCrossConnect();
    }

    private static CrossConnect getCrossConnect(
            final VirtualNetwork virtualNetwork, final String ccId) throws Exception {

        final GetCrossConnectRequest request =
                GetCrossConnectRequest.builder().crossConnectId(ccId).build();
        final GetCrossConnectResponse response = virtualNetwork.getCrossConnect(request);

        return response.getCrossConnect();
    }

    /*
     * Use UPDATE to update display name and activate the physical connection
     */
    private static CrossConnect updateCrossConnect(
            final VirtualNetwork virtualNetwork, final String ccId, final boolean isActive)
            throws Exception {
        final UpdateCrossConnectRequest request =
                UpdateCrossConnectRequest.builder()
                        .crossConnectId(ccId)
                        .updateCrossConnectDetails(
                                UpdateCrossConnectDetails.builder()
                                        .displayName(String.format("CC-%s", TIMESTAMP_SUFFIX))
                                        .isActive(isActive)
                                        .build())
                        .build();

        final UpdateCrossConnectResponse response = virtualNetwork.updateCrossConnect(request);

        virtualNetwork
                .getWaiters()
                .forCrossConnect(
                        GetCrossConnectRequest.builder()
                                .crossConnectId(response.getCrossConnect().getId())
                                .build(),
                        CrossConnect.LifecycleState.Provisioned)
                .execute();

        if (StringUtils.isNoneBlank(response.getCrossConnect().getCrossConnectGroupId())) {
            virtualNetwork
                    .getWaiters()
                    .forCrossConnectGroup(
                            GetCrossConnectGroupRequest.builder()
                                    .crossConnectGroupId(
                                            response.getCrossConnect().getCrossConnectGroupId())
                                    .build(),
                            CrossConnectGroup.LifecycleState.Provisioned)
                    .execute();
        }
        return response.getCrossConnect();
    }

    private static void deleteCrossConnect(
            VirtualNetwork virtualNetwork, final String ccgId, final String ccId) throws Exception {

        // if ccg is in provisioning, wait until provisioned
        CrossConnectGroup ccg = getCrossConnectGroup(virtualNetwork, ccgId);
        if (ccg.getLifecycleState() == CrossConnectGroup.LifecycleState.Provisioning) {
            throw new Exception(
                    "Failed to start deleting CrossConnect of CrossConnectGroup due to CrossConnectGroup in invalid state.");
        }
        virtualNetwork.deleteCrossConnect(
                DeleteCrossConnectRequest.builder().crossConnectId(ccId).build());
        virtualNetwork
                .getWaiters()
                .forCrossConnect(
                        GetCrossConnectRequest.builder().crossConnectId(ccId).build(),
                        CrossConnect.LifecycleState.Terminated)
                .execute();
        System.out.println("Deleted CrossConnect: " + ccId);
    }
}
