/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package exacc;

import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.database.DatabaseClient;
import com.oracle.bmc.database.model.CreateDatabaseDetails;
import com.oracle.bmc.database.model.CreateDbHomeBase;
import com.oracle.bmc.database.model.CreateDbHomeWithVmClusterIdDetails;
import com.oracle.bmc.database.model.DbHomeSummary;
import com.oracle.bmc.database.requests.CreateDbHomeRequest;
import com.oracle.bmc.database.requests.GetDbHomeRequest;
import com.oracle.bmc.database.requests.GetVmClusterRequest;
import com.oracle.bmc.database.requests.ListDbHomesRequest;
import com.oracle.bmc.database.responses.CreateDbHomeResponse;
import com.oracle.bmc.database.responses.GetDbHomeResponse;
import com.oracle.bmc.database.responses.GetVmClusterResponse;
import com.oracle.bmc.database.responses.ListDbHomesResponse;
import com.oracle.bmc.util.internal.StringUtils;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Collection;

import java.io.IOException;
import java.util.HashMap;
import java.util.function.Function;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * This class provides some basic example of how to create, get a DbHome for a given VmCluster, as well as list DbHomes
 * within the given VmCluster.
 * <p>
 * Sample arguments (not comprehensive, see below for a full list):
 * <b>--vmClusterOcid &lt;OCID of a VmCluster&gt; --dbName &lt;a Db Name&gt; --dbUniqueName &lt;a DbUniqueName&gt;</b>
 */
public class ExaCCDbHomeExample {
    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";
    private static final String DEFAULT_VERSION = "18.0.0.0";
    private static final String USAGE =
            "This problem expects the following parameters. Parameters marked with an asterisk (*) are required:";
    private static final Map<String, Opts> mappings =
            Arrays.stream(Opts.values()).collect(Collectors.toMap(Opts::getArgName, o -> o));

    /**
     * Defines the arguments for this example.
     */
    private enum Opts {
        VM_CLUSTER_OCID("--vmClusterOcid", "The OCID of a VmCluster.", true, null),
        DB_NAME(
                "--dbName",
                "A DbName. Generates a value if not specified.",
                false,
                o -> StringUtils.randomAlphabetic(8)),
        DB_UNIQUE_NAME(
                "--dbUniqueName",
                "A DbUniqueName. Generates a value if not specified.",
                false,
                dbName -> dbName + "_" + StringUtils.randomAlphabetic(2, 16)),
        DB_PASSWORD(
                "--dbPassword",
                "The admin password for your DB. Generates a value if not specified.",
                false,
                o ->
                        StringUtils.random(16, "abcdefgABCDEFG#-_1234567890")
                                + StringUtils.random(2, "abcdefg")
                                + StringUtils.random(2, "ABCDEFG")
                                + StringUtils.random(2, "#-_")
                                + StringUtils.random(2, "1234567890")),
        DB_VERSION(
                "--dbVersion",
                String.format(
                        "The version to use. Defaults to %s if not specified.", DEFAULT_VERSION),
                false,
                o -> DEFAULT_VERSION);

        Opts(
                String argName,
                String description,
                boolean required,
                Function<Object, String> defaultSupplier) {
            this.argName = argName;
            this.description = description;
            this.required = required;
            this.defaultSupplier = defaultSupplier;
        }

        public final String argName;
        public final String description;
        public final boolean required;
        public final Function<Object, String> defaultSupplier;

        public String getArgName() {
            return argName;
        }

        public String getDescription() {
            return description;
        }

        public boolean isRequired() {
            return required;
        }

        public Function<Object, String> getDefaultSupplier() {
            return defaultSupplier;
        }
    }

    /**
     * A helper method for parsing command line arguments.
     *
     * @param argv the arguments as passed
     * @return a mapping of argument to its value. Arguments may be missing from the map if they were not supplied by
     * the user and not required.
     */
    private static Map<Opts, String> parseOpts(String[] argv) {
        if (argv == null) {
            throw new IllegalArgumentException("Arguments passed are null");
        }
        final Iterable<String> iterable = Arrays.asList(argv);
        final Iterator<String> iterator = iterable.iterator();
        final Map<Opts, String> argsMap = new HashMap<>();

        while (iterator.hasNext()) {
            String token = iterator.next();
            if (mappings.containsKey(token)) {
                if (iterator.hasNext()) {
                    argsMap.put(mappings.get(token), iterator.next());
                } else {
                    throw new IllegalArgumentException("Missing value for parameter " + token);
                }
            } else {
                throw new IllegalArgumentException("Unknown parameter " + token);
            }
        }

        Arrays.stream(Opts.values())
                .filter(Opts::isRequired)
                .filter(opt -> !argsMap.containsKey(opt))
                .findAny()
                .ifPresent(
                        opts -> {
                            throw new IllegalArgumentException(
                                    "Missing required parameter " + opts.argName);
                        });

        return argsMap;
    }

    /**
     * Creates a DbHome for a given VmCluster
     *
     * @param vmClusterOcid the OCID of the VmCluster
     * @param client        the DatabaseClient to use
     * @return the OCID of the DbHome that is created
     */
    private static String create(
            final String vmClusterOcid,
            final DatabaseClient client,
            final String dbName,
            final String dbUniqueName,
            final String dbPassword,
            final String version) {

        if (vmClusterOcid == null
                || client == null
                || dbName == null
                || dbUniqueName == null
                || dbPassword == null
                || version == null) {
            System.out.println(
                    "vmClusterId, client, dbName, dbUniqueName, dbpassword or version is null. Please check if this values are valid");
        }

        System.out.println(
                String.format(
                        "Creating DbName %s with DbUniqueName %s with DbVersion %s ...",
                        dbName,
                        dbUniqueName,
                        version));

        final CreateDatabaseDetails databaseDetails =
                CreateDatabaseDetails.builder()
                        .adminPassword(dbPassword)
                        .dbName(dbName)
                        .dbUniqueName(dbUniqueName)
                        .build();

        final CreateDbHomeBase details =
                CreateDbHomeWithVmClusterIdDetails.builder()
                        .displayName(StringUtils.randomPrint(4, 96))
                        .database(databaseDetails)
                        .vmClusterId(vmClusterOcid)
                        .dbVersion(version)
                        .build();

        final CreateDbHomeRequest request =
                CreateDbHomeRequest.builder().createDbHomeWithDbSystemIdDetails(details).build();

        CreateDbHomeResponse response = client.createDbHome(request);

        if (response == null) {
            throw new RuntimeException("Response from server was null.");
        } else if (response.getDbHome() == null
                || StringUtils.isBlank(response.getDbHome().getId())) {
            throw new RuntimeException(
                    "Response from server did not contain expected data! request id: "
                            + response.getOpcRequestId());
        } else {
            System.out.println(response.getDbHome().getId());
            return response.getDbHome().getId();
        }
    }

    /**
     * Lists DbHomes for a given VmCluster
     *
     * @param vmClusterOcid the OCID of a given VmCluster
     * @param client        the DatabaseClient to use
     * @return a Collection of OCIDs of the DbHomes
     */
    private static Collection<String> list(
            final String vmClusterOcid, final DatabaseClient client) {

        if (vmClusterOcid == null || client == null) {
            throw new RuntimeException("vmClusterId or client is null");
        }

        System.out.printf("Listing dbHomes for VmCluster: %s ... %n", vmClusterOcid);

        final GetVmClusterRequest getVmClusterRequest =
                GetVmClusterRequest.builder().vmClusterId(vmClusterOcid).build();

        final GetVmClusterResponse getVmClusterResponse = client.getVmCluster(getVmClusterRequest);

        final ListDbHomesRequest request =
                ListDbHomesRequest.builder()
                        .compartmentId(getVmClusterResponse.getVmCluster().getCompartmentId())
                        .vmClusterId(vmClusterOcid)
                        .build();

        ListDbHomesResponse response = client.listDbHomes(request);

        if (response == null) {
            throw new RuntimeException("Response from server was null.");
        } else {
            Collection<String> collection =
                    response.getItems()
                            .stream()
                            .map(DbHomeSummary::getId)
                            .collect(Collectors.toList());
            collection.forEach(System.out::println);
            return collection;
        }
    }

    /**
     * Gets a DbHome
     *
     * @param dbHomeOcid the OCID of a DbHome
     * @param client     the DatabaseClient instance to be used
     * @return the OCID of the DbHome that was fetched.
     */
    public static String get(final String dbHomeOcid, final DatabaseClient client) {

        if (dbHomeOcid == null || client == null) {
            throw new IllegalArgumentException(
                    "dbHomeOcid or client is null. Please provide valid values");
        }
        System.out.println("Getting dbHome...");

        final GetDbHomeRequest request = GetDbHomeRequest.builder().dbHomeId(dbHomeOcid).build();

        GetDbHomeResponse response = client.getDbHome(request);

        if (response == null) {
            throw new RuntimeException("Response from server was null.");
        } else if (response.getDbHome() == null
                || StringUtils.isBlank(response.getDbHome().getId())
                || !Objects.equals(dbHomeOcid, response.getDbHome().getId())) {
            throw new RuntimeException(
                    "Response from server did not contain expected data! request id: "
                            + response.getOpcRequestId());
        } else {
            System.out.println(response.getDbHome().getId());
            return response.getDbHome().getId();
        }
    }

    /**
     * The entry point for this example.
     *
     * @param args The following arguments are expected and handled:
     *             <ul>
     *             <li>--vmClusterOcid The OCID of a given VmCluster. This argument is required.</li>
     *             <li>--dbName the DbName for the database to be created.</li>
     *             <li>--dbUniqueName the DbUniqueName for the database to be created.</li>
     *             <li>--dbPassword the admin password of the database to be created.</li>
     *             <li>--dbVersion the version the database to use.</li>
     *             </ul>
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        try {
            final Map<Opts, String> argumentMap = parseOpts(args);

            final String vmClusterOcid = argumentMap.get(Opts.VM_CLUSTER_OCID);
            final String dbName =
                    argumentMap.getOrDefault(
                            Opts.DB_NAME, Opts.DB_NAME.getDefaultSupplier().apply(null));
            final String dbUniqueName =
                    argumentMap.getOrDefault(
                            Opts.DB_UNIQUE_NAME,
                            Opts.DB_UNIQUE_NAME.getDefaultSupplier().apply(dbName));
            final String dbPassword =
                    argumentMap.getOrDefault(
                            Opts.DB_PASSWORD, Opts.DB_PASSWORD.getDefaultSupplier().apply(null));
            final String version =
                    argumentMap.getOrDefault(
                            Opts.DB_VERSION, Opts.DB_VERSION.getDefaultSupplier().apply(null));

            // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
            // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
            // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

            final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

            final AuthenticationDetailsProvider provider =
                    new ConfigFileAuthenticationDetailsProvider(configFile);
            final DatabaseClient client = DatabaseClient.builder().build(provider);

            final String dbHomeOcid =
                    create(vmClusterOcid, client, dbName, dbUniqueName, dbPassword, version);

            get(dbHomeOcid, client);
            list(vmClusterOcid, client);

        } catch (IllegalArgumentException e) {
            // print out usage guide with full list possible arguments
            System.out.println(USAGE);
            for (Opts opt : Opts.values()) {
                System.out.printf(
                        "%s\t%s %n\t\t\t %s%n%n",
                        opt.required ? "*" : "",
                        opt.argName,
                        opt.description);
            }
            System.out.flush();
            throw e;
        }
    }
}
