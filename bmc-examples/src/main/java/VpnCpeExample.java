/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.VirtualNetwork;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.Cpe;
import com.oracle.bmc.core.model.CreateCpeDetails;
import com.oracle.bmc.core.model.UpdateCpeDetails;
import com.oracle.bmc.core.model.ChangeCpeCompartmentDetails;
import com.oracle.bmc.core.requests.CreateCpeRequest;
import com.oracle.bmc.core.requests.UpdateCpeRequest;
import com.oracle.bmc.core.requests.DeleteCpeRequest;
import com.oracle.bmc.core.requests.GetCpeRequest;
import com.oracle.bmc.core.requests.ChangeCpeCompartmentRequest;
import com.oracle.bmc.core.responses.CreateCpeResponse;
import com.oracle.bmc.core.responses.UpdateCpeResponse;
import com.oracle.bmc.core.responses.GetCpeResponse;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.util.internal.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Sample to demonstrate setting up Vpn Cpe
 *
 * <p>Oracle Cloud Infrastructure Vpn provides an easy way to create a dedicated, private connection
 * between your data center and Oracle Cloud Infrastructure.
 *
 * <p>Vpn provides higher-bandwidth options, and a more reliable and consistent networking
 * experience compared to internet-based connections.
 *
 * <p>Details information on Vpn: https://docs.oracle.com/iaas/Content/Network/Concepts/Vpn.htm
 *
 * <p>Details Cpe API: https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Cpe
 */
public class VpnCpeExample {
    // Set this with your own compartment ID
    private static final String COMPARTMENT_ID = "your_Compartment_Ocid_here";
    private static final String NEW_COMPARTMENT_ID = "your_New_Compartment_Ocid_here";

    private static final String TIMESTAMP_SUFFIX =
            String.valueOf(System.currentTimeMillis() % TimeUnit.SECONDS.toMillis(10L));

    private final VirtualNetworkClient virtualNetworkClient;
    private final Region region;

    public VpnCpeExample(VirtualNetworkClient virtualNetworkClient, Region region) {
        this.virtualNetworkClient = virtualNetworkClient;
        this.region = region;
    }

    public static void main(final String... args) throws Exception {
        if (StringUtils.isBlank(COMPARTMENT_ID)) {
            throw new IllegalStateException("A compartment ID must be defined");
        }

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider authProvider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        final VirtualNetworkClient phxVirtualNetworkClient =
                VirtualNetworkClient.builder().region(Region.US_PHOENIX_1).build(authProvider);
        final VpnCpeExample example =
                new VpnCpeExample(phxVirtualNetworkClient, Region.US_PHOENIX_1);
        final IdentityClient identityClient = IdentityClient.builder().build(authProvider);

        example.run(identityClient);
    }

    public void run(IdentityClient identityClient) throws Exception {

        System.out.println("Create customer premise equipment example.");

        Cpe cc = null;
        try {

            System.out.println("Create customer premise equipment.");
            cc = createCpe(virtualNetworkClient);

            System.out.println("Activate the customer premise equipment.");
            cc = updateCpe(virtualNetworkClient, cc.getId(), true);

            System.out.println("Change Cpe compartment.");
            changeCpeCompartment(virtualNetworkClient, cc.getId(), NEW_COMPARTMENT_ID);

        } finally {
            System.out.println("Delete customer premise equipment.");
            if (null != cc) {
                deleteCpe(virtualNetworkClient, cc.getId());
            }
        }
    }

    private static Cpe createCpe(final VirtualNetwork virtualNetwork) {
        final CreateCpeRequest request =
                CreateCpeRequest.builder()
                        .createCpeDetails(
                                CreateCpeDetails.builder()
                                        .compartmentId(COMPARTMENT_ID)
                                        .displayName(String.format("CC-%s", TIMESTAMP_SUFFIX))
                                        .ipAddress("192.168.0.2")
                                        .build())
                        .build();

        final CreateCpeResponse response = virtualNetwork.createCpe(request);

        return response.getCpe();
    }

    private static Cpe getCpe(final VirtualNetwork virtualNetwork, final String ccId)
            throws Exception {

        final GetCpeRequest request = GetCpeRequest.builder().cpeId(ccId).build();
        final GetCpeResponse response = virtualNetwork.getCpe(request);

        return response.getCpe();
    }

    /*
     * Use UPDATE to update display name and activate the physical connection
     */
    private static Cpe updateCpe(
            final VirtualNetwork virtualNetwork, final String ccId, final boolean isActive) {
        final UpdateCpeRequest request =
                UpdateCpeRequest.builder()
                        .cpeId(ccId)
                        .updateCpeDetails(
                                UpdateCpeDetails.builder()
                                        .displayName(String.format("CC-%s", TIMESTAMP_SUFFIX))
                                        .build())
                        .build();

        final UpdateCpeResponse response = virtualNetwork.updateCpe(request);

        return response.getCpe();
    }

    private static void deleteCpe(final VirtualNetwork virtualNetwork, final String ccId)
            throws Exception {

        Cpe cc = getCpe(virtualNetwork, ccId);

        virtualNetwork.deleteCpe(DeleteCpeRequest.builder().cpeId(ccId).build());
        System.out.println("Deleted Cpe: " + cc.getId());
    }

    /*
     * Change Compartment
     */
    private static void changeCpeCompartment(
            final VirtualNetwork virtualNetwork, final String cpeId, final String newCompartment) {
        final ChangeCpeCompartmentRequest request =
                ChangeCpeCompartmentRequest.builder()
                        .cpeId(cpeId)
                        .changeCpeCompartmentDetails(
                                ChangeCpeCompartmentDetails.builder()
                                        .compartmentId(newCompartment)
                                        .build())
                        .build();

        virtualNetwork.changeCpeCompartment(request);
    }
}
