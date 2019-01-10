/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.database.DatabaseClient;
import com.oracle.bmc.database.requests.ListDbVersionsRequest;
import com.oracle.bmc.database.responses.ListDbVersionsResponse;

/*
 * Example Class to show the usage of List DB Version DBaaS API.
 */
public class ListDBVersionExample {

    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    public static void main(String[] args) throws Exception {

        if (args.length != 2) {
            throw new Exception(
                    "This example expects 2 arguments:  a compartment OCID, a DB System Shape");
        }

        final ConfigFileReader.ConfigFile configFile =
                ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);
        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        String compartmentId = args[0];
        String dbSystemShape = args[1];

        DatabaseClient databaseClient = new DatabaseClient(provider);
        ListDbVersionsRequest dbVersionsRequest =
                ListDbVersionsRequest.builder()
                        .dbSystemShape(dbSystemShape)
                        .compartmentId(compartmentId)
                        .build();
        ListDbVersionsResponse listDbVersionsResponse =
                databaseClient.listDbVersions(dbVersionsRequest);

        System.out.printf(
                "DB Versions Fetched for Shape %s and compartment ocid: %s\n",
                compartmentId,
                dbSystemShape);

        System.out.println(listDbVersionsResponse.getItems());
    }
}
