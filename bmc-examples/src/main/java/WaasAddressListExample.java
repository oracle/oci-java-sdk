/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.waas.WaasClient;
import com.oracle.bmc.waas.model.*;
import com.oracle.bmc.waas.requests.*;
import com.oracle.bmc.waas.responses.ChangeAddressListCompartmentResponse;
import com.oracle.bmc.waas.responses.CreateAddressListResponse;
import com.oracle.bmc.waas.responses.GetAddressListResponse;

import java.util.ArrayList;
import java.util.List;

public class WaasAddressListExample {

    /** Configuration for the example, replace these with your own values. */
    private static final String CONFIG_LOCATION = "~/.oci/config";

    private static final String CONFIG_PROFILE = "DEFAULT";
    private static final String COMPARTMENT_ID = "ocid1.compartment.oc1...aaaaaa";
    private static final String TARGET_COMPARTMENT_ID = "ocid1.compartment.oc1...xxxxxx";

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     *     <ul>
     *       <li>The OCID of the compartment where the WAAS policy will be created.
     *           <p><b>Note:</b> Your tenancy OCID will be read from your configuration file
     *       <li>The web application domain that will be pointed to the CNAME of the Web Application
     *           Firewall.
     *       <li>The origin domain that the Web Application Firewall will forward traffic to.
     *       <li><b>Optionally:</b> The path to the PEM encoded RSA private key used by the Web
     *           Application Firewall to accept HTTPS traffic for your domain
     *       <li><b>Optionally:</b> The path to the PEM encoded SSL certificate used by the Web
     *           Application Firewall to accept HTTPS traffic for your domain
     *     </ul>
     *     The request flow should look like the following: User -> `domain` -> OCI Web Application
     *     Firewall -> `origin`
     */
    public static void main(String[] args) throws Exception {
        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);
        final WaasClient waasClient = WaasClient.builder().build(provider);
        final IdentityClient identityClient = IdentityClient.builder().build(provider);

        AddressList addressList = null;
        try {
            addressList = createAddressList(waasClient, COMPARTMENT_ID, "BlockedAddresses");

            listAddressLists(waasClient, COMPARTMENT_ID);

            changeAddressListCompartment(waasClient, addressList.getId(), TARGET_COMPARTMENT_ID);

            getAddressList(waasClient, addressList.getId());

            deleteAddressList(waasClient, addressList.getId());

        } finally {

            waasClient.close();
            identityClient.close();
        }
    }

    /**
     * Creates a new Address List
     *
     * @param waasClient the client used to communicate with the WAAS service
     * @param compartmentId the OCID of the compartment that owns the Address List
     * @param name text used as a displayName in the created resource
     * @return the created Address List
     */
    private static AddressList createAddressList(
            final WaasClient waasClient, final String compartmentId, final String name) {

        final List<String> addresses = new ArrayList<String>();
        addresses.add("127.0.0.1");

        System.out.println("Creating Address List");
        System.out.println("=======================");

        CreateAddressListDetails.Builder addressListDetails =
                CreateAddressListDetails.builder()
                        .compartmentId(compartmentId)
                        .displayName(name)
                        .addresses(addresses);

        final CreateAddressListResponse addressListResponse =
                waasClient.createAddressList(
                        CreateAddressListRequest.builder()
                                .createAddressListDetails(addressListDetails.build())
                                .build());

        System.out.println("Address List has been created " + addressListResponse.toString());
        System.out.println();

        return addressListResponse.getAddressList();
    }

    /**
     * Deletes a WAAS policy and waits for it to be deleted
     *
     * @param waasClient the client used to communicate with the WAAS service
     * @param addressListId the custom protection rule OCID to delete
     */
    private static void deleteAddressList(final WaasClient waasClient, final String addressListId)
            throws Exception {

        waasClient.deleteAddressList(
                DeleteAddressListRequest.builder().addressListId(addressListId).build());

        waasClient
                .getWaiters()
                .forAddressList(
                        GetAddressListRequest.builder().addressListId(addressListId).build(),
                        LifecycleStates.Deleted)
                .execute();

        System.out.println("Address List deleted");
    }

    /**
     * Lists Address Lists.
     *
     * @param waasClient the client used to communicate with the WAAS service
     * @param compartmentId the OCID of the compartment to list resources in
     */
    private static void listAddressLists(WaasClient waasClient, final String compartmentId) {

        System.out.println("Listing Address Lists");
        System.out.println("=====================");

        ListAddressListsRequest listAddressListsRequest =
                ListAddressListsRequest.builder().compartmentId(compartmentId).build();

        Iterable<AddressListSummary> addressListIterator =
                waasClient.getPaginators().listAddressListsRecordIterator(listAddressListsRequest);

        for (AddressListSummary summary : addressListIterator) {
            System.out.println("Address List name: " + summary.getDisplayName());
        }
    }

    /**
     * Changes the compartment for an existing Address List
     *
     * @param waasClient client used to communicate with the service
     * @param addressListId ID of the Address List to be updated
     * @param targetCompartmentId target compartment to which the Address List will be moved
     */
    private static void changeAddressListCompartment(
            WaasClient waasClient, final String addressListId, final String targetCompartmentId) {
        ChangeAddressListCompartmentResponse response =
                waasClient.changeAddressListCompartment(
                        ChangeAddressListCompartmentRequest.builder()
                                .addressListId(addressListId)
                                .changeAddressListCompartmentDetails(
                                        ChangeAddressListCompartmentDetails.builder()
                                                .compartmentId(targetCompartmentId)
                                                .build())
                                .build());

        System.out.println("Moved Address List " + response.toString());
    }

    /**
     * Gets Address List.
     *
     * @param waasClient the client used to communicate with the WAAS service
     * @param addressListId the OCID of the Address List
     */
    private static AddressList getAddressList(WaasClient waasClient, final String addressListId) {

        GetAddressListResponse addressListResponse =
                waasClient.getAddressList(
                        GetAddressListRequest.builder().addressListId(addressListId).build());

        System.out.println(
                "Found address list: " + addressListResponse.getAddressList().getDisplayName());
        return addressListResponse.getAddressList();
    }
}
