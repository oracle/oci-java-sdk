/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.VirtualNetwork;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.ChangeIPSecConnectionCompartmentDetails;
import com.oracle.bmc.core.model.Cpe;
import com.oracle.bmc.core.model.CpeDeviceConfigAnswer;
import com.oracle.bmc.core.model.CreateCpeDetails;
import com.oracle.bmc.core.model.CreateDrgDetails;
import com.oracle.bmc.core.model.CreateIPSecConnectionDetails;
import com.oracle.bmc.core.model.Drg;
import com.oracle.bmc.core.model.IPSecConnection;
import com.oracle.bmc.core.model.IPSecConnectionDeviceConfig;
import com.oracle.bmc.core.model.IPSecConnectionTunnel;
import com.oracle.bmc.core.model.IPSecConnectionTunnelSharedSecret;
import com.oracle.bmc.core.model.TunnelCpeDeviceConfig;
import com.oracle.bmc.core.model.UpdateIPSecConnectionDetails;
import com.oracle.bmc.core.model.UpdateIPSecConnectionTunnelDetails;
import com.oracle.bmc.core.model.UpdateIPSecConnectionTunnelSharedSecretDetails;
import com.oracle.bmc.core.model.UpdateTunnelCpeDeviceConfigDetails;
import com.oracle.bmc.core.requests.ChangeIPSecConnectionCompartmentRequest;
import com.oracle.bmc.core.requests.CreateCpeRequest;
import com.oracle.bmc.core.requests.CreateDrgRequest;
import com.oracle.bmc.core.requests.CreateIPSecConnectionRequest;
import com.oracle.bmc.core.requests.DeleteCpeRequest;
import com.oracle.bmc.core.requests.DeleteDrgRequest;
import com.oracle.bmc.core.requests.DeleteIPSecConnectionRequest;
import com.oracle.bmc.core.requests.GetDrgRequest;
import com.oracle.bmc.core.requests.GetIPSecConnectionDeviceConfigRequest;
import com.oracle.bmc.core.requests.GetIPSecConnectionRequest;
import com.oracle.bmc.core.requests.GetIPSecConnectionTunnelRequest;
import com.oracle.bmc.core.requests.GetIPSecConnectionTunnelSharedSecretRequest;
import com.oracle.bmc.core.requests.GetTunnelCpeDeviceConfigRequest;
import com.oracle.bmc.core.requests.ListIPSecConnectionTunnelsRequest;
import com.oracle.bmc.core.requests.UpdateIPSecConnectionRequest;
import com.oracle.bmc.core.requests.UpdateIPSecConnectionTunnelRequest;
import com.oracle.bmc.core.requests.UpdateIPSecConnectionTunnelSharedSecretRequest;
import com.oracle.bmc.core.requests.UpdateTunnelCpeDeviceConfigRequest;
import com.oracle.bmc.core.responses.CreateCpeResponse;
import com.oracle.bmc.core.responses.CreateDrgResponse;
import com.oracle.bmc.core.responses.CreateIPSecConnectionResponse;
import com.oracle.bmc.core.responses.GetIPSecConnectionDeviceConfigResponse;
import com.oracle.bmc.core.responses.GetIPSecConnectionResponse;
import com.oracle.bmc.core.responses.GetIPSecConnectionTunnelSharedSecretResponse;
import com.oracle.bmc.core.responses.GetTunnelCpeDeviceConfigResponse;
import com.oracle.bmc.core.responses.ListIPSecConnectionTunnelsResponse;
import com.oracle.bmc.core.responses.UpdateIPSecConnectionResponse;
import com.oracle.bmc.core.responses.UpdateIPSecConnectionTunnelResponse;
import com.oracle.bmc.core.responses.UpdateIPSecConnectionTunnelSharedSecretResponse;
import com.oracle.bmc.core.responses.UpdateTunnelCpeDeviceConfigResponse;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.util.internal.StringUtils;

import java.util.Arrays;
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
    private static final String NEW_COMPARTMENT_ID = "your_New_Compartment_Ocid_here";

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

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider authProvider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

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
        IPSecConnection ipsec = null;
        IPSecConnectionTunnel tunnel = null;
        IPSecConnectionTunnelSharedSecret sharedsecret = null;
        IPSecConnectionDeviceConfig ipsecDeviceConfig = null;
        TunnelCpeDeviceConfig tunnelCpeDeviceConfig = null;
        try {
            System.out.println("Create Cpe.");
            cpe = createCpe(virtualNetworkClient, region);

            System.out.println("Create DRG.");
            drg = createDrg(virtualNetworkClient, region);

            System.out.println("Create IPSecConnection.");
            ipsec = createIPSecConnection(virtualNetworkClient, COMPARTMENT_ID, cpe, drg);

            System.out.println("Activate the IPSecConnection.");
            ipsec = updateIPSecConnection(virtualNetworkClient, ipsec.getId());

            System.out.println("Get the IPSecConnectionDeviceConfig of current IPSecConnection");

            ipsecDeviceConfig = getIPSecConnectionDeviceConfig(virtualNetworkClient, ipsec.getId());
            System.out.println(ipsecDeviceConfig);

            System.out.println("Change IPSecConnection compartment.");
            changeIPSecCompartment(virtualNetworkClient, ipsec.getId(), NEW_COMPARTMENT_ID);

            System.out.println("Get tunnel for the IPSecConnection.");
            tunnel = getIPSecConnectionTunnel(virtualNetworkClient, ipsec.getId());

            System.out.println("Update TunnelCpeDeviceConfig");
            tunnelCpeDeviceConfig =
                    updateTunnelCpeDeviceConfig(
                            virtualNetworkClient, ipsec.getId(), tunnel.getId());
            System.out.println(tunnelCpeDeviceConfig);

            System.out.println("Get the TunnelCpeDeviceConfig of current tunnel");
            tunnelCpeDeviceConfig =
                    getTunnelCpeDeviceConfig(virtualNetworkClient, ipsec.getId(), tunnel.getId());
            System.out.println(tunnelCpeDeviceConfig);

            System.out.println("Update tunnel for the IPSecConnection.");
            tunnel =
                    updateIPSecConnectionTunnel(
                            virtualNetworkClient, ipsec.getId(), tunnel.getId());

            System.out.println("Get Shared Secret for tunnel.");
            sharedsecret =
                    getIPSecConnectionTunnelSharedSecret(
                            virtualNetworkClient, ipsec.getId(), tunnel.getId());
            System.out.println(sharedsecret);

            System.out.println("Update tunnel for the IPSecConnection.");
            updateIPSecConnectionTunnelSharedSecret(
                    virtualNetworkClient, ipsec.getId(), tunnel.getId());

            System.out.println("Get Shared Secret for tunnel again.");
            sharedsecret =
                    getIPSecConnectionTunnelSharedSecret(
                            virtualNetworkClient, ipsec.getId(), tunnel.getId());
            System.out.println(sharedsecret);

        } finally {
            System.out.println("Delete IPSecConnection.");
            if (null != ipsec) {
                deleteIPSecConnection(virtualNetworkClient, ipsec.getId());
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

    /*
     * Use CREATE to create a CPE
     */
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

    /*
     * Use DELETE to delete the CPE
     */
    public static void deleteCpe(final VirtualNetwork virtualNetwork, final Cpe cpe)
            throws Exception {
        final DeleteCpeRequest request = DeleteCpeRequest.builder().cpeId(cpe.getId()).build();
        virtualNetwork.deleteCpe(request);

        System.out.println("Deleted Cpe: " + cpe.getId());
    }

    /*
     * Use CREATE to create a DRG connection and activate connection
     */
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

    /*
     * Use DELETE to delete the DRG
     */
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

    /*
     * Use CREATE to create a IPSec connection and activate connection
     */
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
                                        .displayName(String.format("IPSec-%s", TIMESTAMP_SUFFIX))
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

    /*
     * Use GET to get the IPSec connection
     */
    private static IPSecConnection getIPSecConnection(
            final VirtualNetwork virtualNetwork, final String ipsecId) {

        final GetIPSecConnectionRequest request =
                GetIPSecConnectionRequest.builder().ipscId(ipsecId).build();
        final GetIPSecConnectionResponse response = virtualNetwork.getIPSecConnection(request);

        return response.getIPSecConnection();
    }

    /*
     * Use UPDATE to update the IPSec connection and activate connection
     */
    private static IPSecConnection updateIPSecConnection(
            final VirtualNetwork virtualNetwork, final String ipsecId) throws Exception {
        final UpdateIPSecConnectionRequest request =
                UpdateIPSecConnectionRequest.builder()
                        .ipscId(ipsecId)
                        .updateIPSecConnectionDetails(
                                UpdateIPSecConnectionDetails.builder()
                                        .displayName(String.format("IPSec-%s", TIMESTAMP_SUFFIX))
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

    /*
     * Use GET to get the IPSec tunnel
     */
    private static IPSecConnectionTunnel getIPSecConnectionTunnel(
            final VirtualNetwork virtualNetwork, final String ipsecId) {
        final ListIPSecConnectionTunnelsRequest request =
                ListIPSecConnectionTunnelsRequest.builder().ipscId(ipsecId).build();

        final ListIPSecConnectionTunnelsResponse response =
                virtualNetwork.listIPSecConnectionTunnels(request);

        IPSecConnectionTunnel ipSecConnectionTunnel = response.getItems().get(0);

        return ipSecConnectionTunnel;
    }

    /*
     * Use UPDATE to update display name and activate the physical connection
     */
    private static IPSecConnectionTunnel updateIPSecConnectionTunnel(
            final VirtualNetwork virtualNetwork, final String ipsecId, final String tunnelId)
            throws Exception {
        final UpdateIPSecConnectionTunnelRequest request =
                UpdateIPSecConnectionTunnelRequest.builder()
                        .ipscId(ipsecId)
                        .tunnelId(tunnelId)
                        .updateIPSecConnectionTunnelDetails(
                                UpdateIPSecConnectionTunnelDetails.builder()
                                        .displayName(String.format("CC-%s", TIMESTAMP_SUFFIX))
                                        .build())
                        .build();

        final UpdateIPSecConnectionTunnelResponse response =
                virtualNetwork.updateIPSecConnectionTunnel(request);

        virtualNetwork
                .getWaiters()
                .forIPSecConnectionTunnel(
                        GetIPSecConnectionTunnelRequest.builder()
                                .ipscId(ipsecId)
                                .tunnelId(tunnelId)
                                .build(),
                        IPSecConnectionTunnel.LifecycleState.Available)
                .execute();

        return response.getIPSecConnectionTunnel();
    }

    /*
     * Use GET to get the TunnelSharedSecret
     */
    private static IPSecConnectionTunnelSharedSecret getIPSecConnectionTunnelSharedSecret(
            final VirtualNetwork virtualNetwork, final String ipsecId, final String tunnelId)
            throws Exception {
        final GetIPSecConnectionTunnelSharedSecretRequest request =
                GetIPSecConnectionTunnelSharedSecretRequest.builder()
                        .ipscId(ipsecId)
                        .tunnelId(tunnelId)
                        .build();
        final GetIPSecConnectionTunnelSharedSecretResponse response =
                virtualNetwork.getIPSecConnectionTunnelSharedSecret(request);

        return response.getIPSecConnectionTunnelSharedSecret();
    }

    /*
     * Use UPDATE to update display name and activate the physical connection
     */
    private static IPSecConnectionTunnelSharedSecret updateIPSecConnectionTunnelSharedSecret(
            final VirtualNetwork virtualNetwork, final String ipsecId, final String tunnelId)
            throws Exception {
        final UpdateIPSecConnectionTunnelSharedSecretRequest request =
                UpdateIPSecConnectionTunnelSharedSecretRequest.builder()
                        .ipscId(ipsecId)
                        .tunnelId(tunnelId)
                        .updateIPSecConnectionTunnelSharedSecretDetails(
                                UpdateIPSecConnectionTunnelSharedSecretDetails.builder()
                                        .sharedSecret("ABCDEFGHIJKLMNOPQRSTUVWXYZ")
                                        .build())
                        .build();

        final UpdateIPSecConnectionTunnelSharedSecretResponse response =
                virtualNetwork.updateIPSecConnectionTunnelSharedSecret(request);

        return response.getIPSecConnectionTunnelSharedSecret();
    }

    /*
     * Use GET to get the device config of IPSec connection
     */
    private static IPSecConnectionDeviceConfig getIPSecConnectionDeviceConfig(
            final VirtualNetwork virtualNetwork, final String ipsecId) {
        final GetIPSecConnectionDeviceConfigRequest request =
                GetIPSecConnectionDeviceConfigRequest.builder().ipscId(ipsecId).build();

        final GetIPSecConnectionDeviceConfigResponse response =
                virtualNetwork.getIPSecConnectionDeviceConfig(request);

        return response.getIPSecConnectionDeviceConfig();
    }

    /*
     * Use DELETE to delete the IPSec connection
     */
    private static void deleteIPSecConnection(
            final VirtualNetwork virtualNetwork, final String ipsecId) throws Exception {
        // if resource is in provisioning state, wait until provisioned
        IPSecConnection ipsec = getIPSecConnection(virtualNetwork, ipsecId);
        if (ipsec.getLifecycleState() != IPSecConnection.LifecycleState.Available
                && ipsec.getLifecycleState() != IPSecConnection.LifecycleState.Provisioning) {
            throw new IllegalStateException(
                    "Failed to start deleting IPSecConnection due to IPSecConnection in invalid state.");
        }

        virtualNetwork.deleteIPSecConnection(
                DeleteIPSecConnectionRequest.builder().ipscId(ipsecId).build());
        virtualNetwork
                .getWaiters()
                .forIPSecConnection(
                        GetIPSecConnectionRequest.builder().ipscId(ipsecId).build(),
                        IPSecConnection.LifecycleState.Terminated)
                .execute();
        System.out.println("Deleted IPSecConnection: " + ipsec.getId());
    }

    /*
     * Change Compartment
     */
    private static void changeIPSecCompartment(
            final VirtualNetwork virtualNetwork, final String ipsecId, final String newCompartment)
            throws Exception {
        final ChangeIPSecConnectionCompartmentRequest request =
                ChangeIPSecConnectionCompartmentRequest.builder()
                        .ipscId(ipsecId)
                        .changeIPSecConnectionCompartmentDetails(
                                ChangeIPSecConnectionCompartmentDetails.builder()
                                        .compartmentId(newCompartment)
                                        .build())
                        .build();

        virtualNetwork.changeIPSecConnectionCompartment(request);
        virtualNetwork
                .getWaiters()
                .forIPSecConnection(
                        GetIPSecConnectionRequest.builder().ipscId(ipsecId).build(),
                        IPSecConnection.LifecycleState.Available)
                .execute();
    }

    /*
     * Use GET to get the device config of IPSec tunnel
     */
    private TunnelCpeDeviceConfig getTunnelCpeDeviceConfig(
            final VirtualNetwork virtualNetwork, final String ipsecId, final String tunnelId) {
        final GetTunnelCpeDeviceConfigRequest request =
                GetTunnelCpeDeviceConfigRequest.builder()
                        .ipscId(ipsecId)
                        .tunnelId(tunnelId)
                        .build();

        final GetTunnelCpeDeviceConfigResponse response =
                virtualNetwork.getTunnelCpeDeviceConfig(request);

        return response.getTunnelCpeDeviceConfig();
    }

    /*
     * Use UPDATE to update the device config of IPSec tunnel with configAnswer and activate tunnel
     */
    private TunnelCpeDeviceConfig updateTunnelCpeDeviceConfig(
            final VirtualNetwork virtualNetwork, final String ipsecId, final String tunnelId)
            throws Exception {
        final UpdateTunnelCpeDeviceConfigDetails update =
                UpdateTunnelCpeDeviceConfigDetails.builder()
                        .tunnelCpeDeviceConfig(
                                Arrays.asList(new CpeDeviceConfigAnswer("demo_key", "demo_value")))
                        .build();

        final UpdateTunnelCpeDeviceConfigRequest request =
                UpdateTunnelCpeDeviceConfigRequest.builder()
                        .ipscId(ipsecId)
                        .tunnelId(tunnelId)
                        .updateTunnelCpeDeviceConfigDetails(update)
                        .build();

        final UpdateTunnelCpeDeviceConfigResponse response =
                virtualNetwork.updateTunnelCpeDeviceConfig(request);

        virtualNetwork
                .getWaiters()
                .forIPSecConnectionTunnel(
                        GetIPSecConnectionTunnelRequest.builder()
                                .ipscId(ipsecId)
                                .tunnelId(tunnelId)
                                .build(),
                        IPSecConnectionTunnel.LifecycleState.Available)
                .execute();

        return response.getTunnelCpeDeviceConfig();
    }
}
