/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.database.DatabaseClient;
import com.oracle.bmc.database.model.DbIormConfigUpdateDetail;
import com.oracle.bmc.database.model.ExadataIormConfigUpdateDetails;
import com.oracle.bmc.database.requests.GetExadataIormConfigRequest;
import com.oracle.bmc.database.requests.UpdateExadataIormConfigRequest;
import com.oracle.bmc.database.responses.GetExadataIormConfigResponse;
import com.oracle.bmc.database.responses.UpdateExadataIormConfigResponse;

import java.util.Collections;

/*
 * Example Class to show the usage of Get, Update and Reset of DBaaS Exadata IORM Configuration.
 * This Example assumes that an Exadata DB System is already in available state.
 */
public class GetAndUpdateExadataIORMExample {

    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    public static void main(String[] args) throws Exception {

        if (args.length != 1) {
            throw new Exception("This example expects 1 argument:  A Database System OCID");
        }

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        String dbSystemID = args[0];

        DatabaseClient databaseClient = DatabaseClient.builder().build(provider);

        /*
          Exadata IORM get configuration Example...
        */

        GetExadataIormConfigRequest getExadataIormConfigRequest =
                GetExadataIormConfigRequest.builder().dbSystemId(dbSystemID).build();

        GetExadataIormConfigResponse exadataIormConfig =
                databaseClient.getExadataIormConfig(getExadataIormConfigRequest);
        System.out.printf(
                "Successfully fetched Exadata IORM configuration :%s\n",
                exadataIormConfig.getExadataIormConfig());

        /*
        Exadata IORM update configuration Example...
        Sets the default directive and the Objective for IORM configuration

        default share value is set to 10
        Objective is set to Balanced
        */

        DbIormConfigUpdateDetail defaultPlan =
                DbIormConfigUpdateDetail.builder().dbName("default").share(10).build();

        ExadataIormConfigUpdateDetails configUpdateDetails =
                ExadataIormConfigUpdateDetails.builder()
                        .objective(ExadataIormConfigUpdateDetails.Objective.Balanced)
                        .dbPlans(Collections.singletonList(defaultPlan))
                        .build();

        UpdateExadataIormConfigRequest updateExadataIormConfigRequest =
                UpdateExadataIormConfigRequest.builder()
                        .dbSystemId(dbSystemID)
                        .exadataIormConfigUpdateDetails(configUpdateDetails)
                        .build();

        UpdateExadataIormConfigResponse updateExadataIormConfigResponse =
                databaseClient.updateExadataIormConfig(updateExadataIormConfigRequest);

        System.out.printf(
                "Exadata IORM configuration is being updated:%s\n",
                updateExadataIormConfigResponse.getExadataIormConfig());

        /*
        Exadata IORM reset configuration Example...
        Sets the IORM configuration to disabled.
        This is achieved by sending in null values for objective and dbPlans
        */

        ExadataIormConfigUpdateDetails configResetDetails =
                ExadataIormConfigUpdateDetails.builder().objective(null).dbPlans(null).build();

        UpdateExadataIormConfigRequest resetExadataIormConfigRequest =
                UpdateExadataIormConfigRequest.builder()
                        .dbSystemId(dbSystemID)
                        .exadataIormConfigUpdateDetails(configResetDetails)
                        .build();

        UpdateExadataIormConfigResponse resetConfigResponse =
                databaseClient.updateExadataIormConfig(resetExadataIormConfigRequest);

        System.out.printf(
                "Exadata IORM configuration is being reset:%s\n",
                resetConfigResponse.getExadataIormConfig());
    }
}
