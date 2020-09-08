/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.database.DatabaseClient;
import com.oracle.bmc.database.model.MaintenanceRun;
import com.oracle.bmc.database.model.MaintenanceRunSummary;
import com.oracle.bmc.database.model.UpdateMaintenanceRunDetails;
import com.oracle.bmc.database.requests.GetMaintenanceRunRequest;
import com.oracle.bmc.database.requests.ListMaintenanceRunsRequest;
import com.oracle.bmc.database.requests.UpdateMaintenanceRunRequest;
import com.oracle.bmc.database.responses.GetMaintenanceRunResponse;
import com.oracle.bmc.database.responses.ListMaintenanceRunsResponse;

/**
 * Example class to show the usage of MaintenanceRun DBaaS APIs. It shows how to
 * perform get, update and list of MaintenanceRun. It will:
 * <ul>
 *   <li>Get MaintenanceRun with given Id.</li>
 *   <li>Update MaintenanceRun to disabled state.</li>
 *   <li>List MaintenanceRuns in a given compartment.</li>
 * <u/>
 */
public class MaintenanceRunExample {

    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    public static void main(String[] args) throws Exception {

        if (args.length != 2) {
            throw new Exception(
                    "This example expects 2 arguments: a compartment OCID and MaintenanceRun OCID");
        }

        String compartmentId = args[0];
        String maintenanceRunId = args[1];

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        // Get MaintenanceRun
        DatabaseClient databaseClient = new DatabaseClient(provider);
        GetMaintenanceRunRequest getMaintenanceRunRequest =
                GetMaintenanceRunRequest.builder().maintenanceRunId(maintenanceRunId).build();
        GetMaintenanceRunResponse maintenanceRun =
                databaseClient.getMaintenanceRun(getMaintenanceRunRequest);
        System.out.printf("MaintenanceRun Fetched based on Id:%s\n", maintenanceRun);

        // Update MaintenanceRun
        UpdateMaintenanceRunDetails updateMaintenanceRunDetails =
                UpdateMaintenanceRunDetails.builder().isEnabled(false).build();
        UpdateMaintenanceRunRequest updateMaintenanceRunRequest =
                UpdateMaintenanceRunRequest.builder()
                        .maintenanceRunId(maintenanceRunId)
                        .updateMaintenanceRunDetails(updateMaintenanceRunDetails)
                        .build();
        databaseClient.updateMaintenanceRun(updateMaintenanceRunRequest);

        GetMaintenanceRunRequest getMaintenanceRunRequestAfterUpdate =
                GetMaintenanceRunRequest.builder().maintenanceRunId(maintenanceRunId).build();
        MaintenanceRun maintenanceRunAfterUpdate =
                databaseClient
                        .getMaintenanceRun(getMaintenanceRunRequestAfterUpdate)
                        .getMaintenanceRun();

        System.out.println("After update: \n" + maintenanceRunAfterUpdate);

        // List MaintenanceRuns
        ListMaintenanceRunsRequest listMaintenanceRunsRequest =
                ListMaintenanceRunsRequest.builder()
                        .compartmentId(compartmentId)
                        .lifecycleState(MaintenanceRunSummary.LifecycleState.Scheduled)
                        .build();

        ListMaintenanceRunsResponse listMaintenanceRunsResponse =
                databaseClient.listMaintenanceRuns(listMaintenanceRunsRequest);

        System.out.printf(
                "MaintenanceRuns in SCHEDULED lifecycle state fetched for compartment ocid: %s\n",
                compartmentId);
        System.out.println(listMaintenanceRunsResponse.getItems());
    }
}
