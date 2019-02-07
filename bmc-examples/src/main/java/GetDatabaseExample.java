/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
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

        final ConfigFileReader.ConfigFile configFile =
                ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);
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
