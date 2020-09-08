/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.workrequests.WorkRequestClient;
import com.oracle.bmc.workrequests.requests.ListWorkRequestsRequest;
import com.oracle.bmc.workrequests.responses.ListWorkRequestsResponse;

import java.io.IOException;

/**
 * This class provides an example of listing Work Requests, filtering by either compartment ID or both compartment ID
 * and resource ID.
 */
public class ListWorkRequestsExample {

    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE_DEFAULT = "DEFAULT";

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     * <ul>
     *   <li>The OCID of the compartment to list all of the Work Requests</li>
     *   <li>The identifier of the resource to list all of the Work Requests</li>
     * </ul>
     */
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new IllegalArgumentException(
                    "This example expects the compartment OCID and resource identifier as arguments.");
        }

        String compartmentId = args[0];
        String resourceId = args[1];

        try (WorkRequestClient client = getWorkRequestClient()) {
            System.out.println("A listWorkRequests call by compartment ID.");
            ListWorkRequestsRequest compartmentRequest =
                    ListWorkRequestsRequest.builder().compartmentId(compartmentId).build();

            listWorkRequests(client, compartmentRequest);

            System.out.println(
                    "A listWorkRequsts call filtering by both compartment ID and resource ID.");
            ListWorkRequestsRequest compartmentAndResourceRequest =
                    ListWorkRequestsRequest.builder()
                            .compartmentId(compartmentId)
                            .resourceId(resourceId)
                            .build();

            listWorkRequests(client, compartmentAndResourceRequest);
        }
    }

    private static void listWorkRequests(
            WorkRequestClient client, ListWorkRequestsRequest request) {
        Iterable<ListWorkRequestsResponse> responseIterator =
                client.getPaginators().listWorkRequestsResponseIterator(request);

        for (ListWorkRequestsResponse response : responseIterator) {
            System.out.println("Received response: " + response.getItems());
        }
    }

    private static WorkRequestClient getWorkRequestClient() throws IOException {
        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);
        WorkRequestClient client = new WorkRequestClient(provider);
        return client;
    }
}
