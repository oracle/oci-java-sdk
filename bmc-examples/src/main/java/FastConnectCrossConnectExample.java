/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.VirtualNetwork;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.CrossConnect;
import com.oracle.bmc.core.model.CrossConnectGroup;
import com.oracle.bmc.core.model.CrossConnectLocation;
import com.oracle.bmc.core.model.CrossConnectPortSpeedShape;
import com.oracle.bmc.core.model.CreateCrossConnectDetails;
import com.oracle.bmc.core.model.UpdateCrossConnectDetails;
import com.oracle.bmc.core.requests.CreateCrossConnectRequest;
import com.oracle.bmc.core.requests.GetCrossConnectGroupRequest;
import com.oracle.bmc.core.requests.UpdateCrossConnectRequest;
import com.oracle.bmc.core.requests.DeleteCrossConnectRequest;
import com.oracle.bmc.core.requests.GetCrossConnectRequest;
import com.oracle.bmc.core.responses.CreateCrossConnectResponse;
import com.oracle.bmc.core.responses.ListCrossConnectLocationsResponse;
import com.oracle.bmc.core.responses.ListCrossconnectPortSpeedShapesResponse;
import com.oracle.bmc.core.requests.ListCrossConnectLocationsRequest;
import com.oracle.bmc.core.requests.ListCrossconnectPortSpeedShapesRequest;
import com.oracle.bmc.core.responses.UpdateCrossConnectResponse;
import com.oracle.bmc.core.responses.GetCrossConnectResponse;
import com.oracle.bmc.identity.IdentityClient;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Sample to demonstrate setting up FastConnect CrossConnect
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
 *  Details CrossConnect API: https://docs.cloud.oracle.com/iaas/api/#/en/iaas/20160918/CrossConnect
 */
public class FastConnectCrossConnectExample {
    // Set this with your own compartment ID
    private static final String COMPARTMENT_ID = "your_Compartment_Ocid_here";

    private static final String TIMESTAMP_SUFFIX =
            String.valueOf(System.currentTimeMillis() % TimeUnit.SECONDS.toMillis(10L));

    private final VirtualNetworkClient virtualNetworkClient;
    private final Region region;

    public FastConnectCrossConnectExample(
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
        final FastConnectCrossConnectExample example =
                new FastConnectCrossConnectExample(phxVirtualNetworkClient, Region.US_PHOENIX_1);
        final IdentityClient identityClient = new IdentityClient(authProvider);

        example.run(identityClient);
    }

    public void run(IdentityClient identityClient) throws Exception {

        System.out.println("Create CrossConnect example, NON-LAG physical connection.");

        System.out.println("Get list of CrossConnect locations POP.");
        List<CrossConnectLocation> listCrossConnectLocations =
                getCrossConnectLocations(virtualNetworkClient, COMPARTMENT_ID);

        System.out.println("Get list of CrossConnect port speeds.");
        List<CrossConnectPortSpeedShape> listCrossConnectPortSpeedShape =
                getCrossConnectPortSpeedShapes(virtualNetworkClient, COMPARTMENT_ID);

        System.out.println("Create CrossConnect.");
        CrossConnect cc = null;
        try {
            cc =
                    createCrossConnect(
                            virtualNetworkClient,
                            COMPARTMENT_ID,
                            null,
                            listCrossConnectLocations.get(0).getName(),
                            listCrossConnectPortSpeedShape.get(0).getName());

            System.out.println("Activate the CrossConnect.");
            cc = updateCrossConnect(virtualNetworkClient, cc.getId(), true);
        } finally {
            System.out.println("Delete CrossConnect.");
            if (null != cc) {
                deleteCrossConnect(virtualNetworkClient, cc.getId());
            }
        }
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

    private static void deleteCrossConnect(final VirtualNetwork virtualNetwork, final String ccId)
            throws Exception {

        // if resource is in provisioning, wait until provisioned
        CrossConnect cc = getCrossConnect(virtualNetwork, ccId);
        if (cc.getLifecycleState() != CrossConnect.LifecycleState.Provisioned
                && cc.getLifecycleState() != CrossConnect.LifecycleState.PendingCustomer) {
            throw new IllegalStateException(
                    "Failed to start deleting CrossConnect due to CrossConnect in invalid state.");
        }

        virtualNetwork.deleteCrossConnect(
                DeleteCrossConnectRequest.builder().crossConnectId(ccId).build());
        virtualNetwork
                .getWaiters()
                .forCrossConnect(
                        GetCrossConnectRequest.builder().crossConnectId(ccId).build(),
                        CrossConnect.LifecycleState.Terminated)
                .execute();
        System.out.println("Deleted CrossConnect: " + cc.getId());
    }
}
