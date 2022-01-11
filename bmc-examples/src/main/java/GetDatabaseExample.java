/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.database.DatabaseClient;
import com.oracle.bmc.database.requests.GetDatabaseRequest;
import com.oracle.bmc.database.responses.GetDatabaseResponse;

/*
 * Example Class to show the usage of Get Database DBaaS API.
 */
public class GetDatabaseExample {

    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    public static void main(String[] args) throws Exception {

        if (args.length != 1) {
            throw new Exception("This example expects 1 argument:  A Database OCID");
        }

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        String databaseId = args[0];

        DatabaseClient databaseClient = new DatabaseClient(provider);

        GetDatabaseRequest getDatabaseRequest =
                GetDatabaseRequest.builder().databaseId(databaseId).build();

        GetDatabaseResponse database = databaseClient.getDatabase(getDatabaseRequest);
        System.out.printf("Database Fetched based on Id:%s\n", databaseId);
    }
}
