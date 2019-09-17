/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.database.DatabaseClient;
import com.oracle.bmc.database.model.*;
import com.oracle.bmc.database.requests.*;
import com.oracle.bmc.database.responses.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * This class provides a basic example of how to create a DbHome with BackupDestination using the Java SDK. This will cover:
 * <p></p>
 * <ul>
 *   <li>Create a BackupDestination for the DbHome to be created.</li>
 *   <li>
 *     Creating DBHome with BackupDestination. See:
 *       <a href="https://docs.us-phoenix-1.oraclecloud.com/Content/Database/Concepts/overview.htm">overview</a>
 *       for more information</li>
 * </ul>
 */
public class CreateDbHomeBackupDestinationExample {
    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";
    private static final String DEFAULT_VERSION = "18.0.0.0";
    private static DatabaseClient databaseClient = null;
    private static final Map<String, Opts> mappings =
            Arrays.stream(Opts.values()).collect(Collectors.toMap(Opts::getArgName, o -> o));

    /**
     * Defines the arguments for this example.
     */
    @AllArgsConstructor
    private enum Opts {
        VM_CLUSTER_OCID("--vmClusterOcid", "The OCID of a VmCluster.", true, null),
        DB_NAME(
                "--dbName",
                "A DbName. Generates a value if not specified.",
                false,
                o -> RandomStringUtils.randomAlphabetic(8)),
        DB_UNIQUE_NAME(
                "--dbUniqueName",
                "A DbUniqueName. Generates a value if not specified.",
                false,
                dbName -> dbName + "_" + RandomStringUtils.randomAlphabetic(2, 16)),
        DB_PASSWORD(
                "--dbPassword",
                "The admin password for your DB. Generates a value if not specified.",
                false,
                o ->
                        RandomStringUtils.random(16, "abcdefgABCDEFG#-_1234567890")
                                + RandomStringUtils.random(2, "abcdefg")
                                + RandomStringUtils.random(2, "ABCDEFG")
                                + RandomStringUtils.random(2, "#-_")
                                + RandomStringUtils.random(2, "1234567890")),
        DB_VERSION(
                "--dbVersion",
                String.format(
                        "The version to use. Defaults to %s if not specified.", DEFAULT_VERSION),
                false,
                o -> DEFAULT_VERSION),
        BACKUP_DESTINATION_OCID(
                "--backupDestinationOcid", "The OCID of a backup destination.", true, null),
        BACKUP_DESTINATION_TYPE(
                "--backupDestinationType", "Type of backup destination", true, null),
        VPC_USER("--vpcUser", "vpcuser for the ZDLRA type of backup destination", false, null),
        VPC_PASSWORD(
                "--vpcPassword",
                "vpcPassword for the ZDLRA type of backup destination",
                false,
                null);
        @Getter public final String argName;
        @Getter public final String description;
        @Getter public final boolean required;
        @Getter public final Function<Object, String> defaultSupplier;
    }

    /**
     * A helper method for parsing command line arguments.
     *
     * @param argv the arguments as passed
     * @return a mapping of argument to its value. Arguments may be missing from the map if they were not supplied by
     * the user and not required.
     */
    private static Map<Opts, String> parseOpts(@NonNull String[] argv) {
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
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     *             <ul>
     *             <li>VM-cluster OCID</li>
     *             <li>Compartment OCID</li>
     *             <li>Database Name</li>
     *             <li>Database Unique Name</li>
     *             <li>Database Password</li>
     *             <li>DatabaseVersion</li>
     *             </ul>
     */
    public static void main(String[] args) throws Exception {
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
        final String backupDestinationId = argumentMap.get(Opts.BACKUP_DESTINATION_OCID);
        final String backupDestinationType = argumentMap.get(Opts.BACKUP_DESTINATION_TYPE);
        final String vpcUser = argumentMap.getOrDefault(Opts.VPC_USER, null);
        final String vpcPassword = argumentMap.getOrDefault(Opts.VPC_PASSWORD, null);

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(CONFIG_LOCATION, CONFIG_PROFILE);
        databaseClient = new DatabaseClient(provider);

        final BackupDestinationDetails backupDestinationDetails =
                BackupDestinationHelper.backupDestinationDetailsCreater(
                        backupDestinationType, backupDestinationId, vpcUser, vpcPassword);

        List<BackupDestinationDetails> list = new ArrayList<>();
        list.add(backupDestinationDetails);

        final CreateDatabaseDetails databaseDetails =
                CreateDatabaseDetails.builder()
                        .adminPassword(dbPassword)
                        .dbName(dbName)
                        .dbBackupConfig(
                                DbBackupConfig.builder().backupDestinationDetails(list).build())
                        .dbUniqueName(dbUniqueName)
                        .build();

        final CreateDbHomeBase details =
                CreateDbHomeWithVmClusterIdDetails.builder()
                        .displayName(RandomStringUtils.randomPrint(4, 96))
                        .database(databaseDetails)
                        .vmClusterId(vmClusterOcid)
                        .dbVersion(version)
                        .build();

        final CreateDbHomeRequest request =
                CreateDbHomeRequest.builder().createDbHomeWithDbSystemIdDetails(details).build();

        CreateDbHomeResponse response = databaseClient.createDbHome(request);

        if (response == null) {
            throw new RuntimeException("Response from server was null.");
        } else if (response.getDbHome() == null
                || StringUtils.isBlank(response.getDbHome().getId())) {
            throw new RuntimeException(
                    "Response from server did not contain expected data! request id: "
                            + response.getOpcRequestId());
        } else {
            System.out.println(response.getDbHome().getId());
        }
    }
}
