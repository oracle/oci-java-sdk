/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.workrequests.WorkRequestClient;
import com.oracle.bmc.workrequests.requests.GetWorkRequestRequest;
import com.oracle.bmc.workrequests.requests.ListWorkRequestErrorsRequest;
import com.oracle.bmc.workrequests.requests.ListWorkRequestLogsRequest;
import com.oracle.bmc.workrequests.responses.GetWorkRequestResponse;
import com.oracle.bmc.workrequests.responses.ListWorkRequestErrorsResponse;
import com.oracle.bmc.workrequests.responses.ListWorkRequestLogsResponse;

import java.io.IOException;

/**
 * This class provides an example of using the APIs to get information about a Work Request, looked up by the Work
 * Request ID. The following examples are given:
 *
 * <ul>
 *     <li>getWorkRequest - Get information about a Work Request</li>
 *     <li>listWorkRequestErrors - List errors related to a Work Request</li>
 *     <li>listWorkRequestLogs - List logs related to a Work Request</li>
 * </ul>
 */
public class GetWorkRequestExample {

    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE_DEFAULT = "DEFAULT";

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     * <ul>
     *   <li>The OCID of the Work Request for which to request information</li>
     * </ul>
     */
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "This example expects the Work Request OCID as an argument.");
        }

        String workRequestId = args[0];

        try (WorkRequestClient client = getWorkRequestClient()) {
            getWorkRequest(client, workRequestId);

            listWorkRequestErrors(client, workRequestId);

            listWorkRequestLogs(client, workRequestId);
        }
    }

    private static void getWorkRequest(WorkRequestClient client, String workRequestId) {
        System.out.println("getWorkRequest");

        GetWorkRequestRequest request =
                GetWorkRequestRequest.builder().workRequestId(workRequestId).build();

        GetWorkRequestResponse response = client.getWorkRequest(request);
        System.out.println("getWorkRequests response: " + response.getWorkRequest());
    }

    private static void listWorkRequestErrors(WorkRequestClient client, String workRequestId) {
        System.out.println("listWorkRequestErrors");

        ListWorkRequestErrorsRequest request =
                ListWorkRequestErrorsRequest.builder().workRequestId(workRequestId).build();

        Iterable<ListWorkRequestErrorsResponse> responseIterator =
                client.getPaginators().listWorkRequestErrorsResponseIterator(request);

        for (ListWorkRequestErrorsResponse response : responseIterator) {
            System.out.println("listWorkRequestErrors response: " + response.getItems());
        }
    }

    private static void listWorkRequestLogs(WorkRequestClient client, String workRequestId) {
        System.out.println("listWorkRequestLogs");

        ListWorkRequestLogsRequest request =
                ListWorkRequestLogsRequest.builder().workRequestId(workRequestId).build();

        Iterable<ListWorkRequestLogsResponse> responseIterator =
                client.getPaginators().listWorkRequestLogsResponseIterator(request);

        for (ListWorkRequestLogsResponse response : responseIterator) {
            System.out.println("listWorkRequestLogs response: " + response.getItems());
        }
    }

    private static WorkRequestClient getWorkRequestClient() throws IOException {
        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);
        WorkRequestClient client = new WorkRequestClient(provider);
        return client;
    }
}
