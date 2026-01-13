/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.database.DatabaseClient;
import com.oracle.bmc.database.model.BackupDestinationDetails;
import com.oracle.bmc.database.model.DbBackupConfig;
import com.oracle.bmc.database.model.UpdateDatabaseDetails;
import com.oracle.bmc.database.requests.UpdateDatabaseRequest;
import com.oracle.bmc.database.responses.UpdateDatabaseResponse;
import com.oracle.bmc.util.internal.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * This class provides a basic example of how to update a database with BackupDestination using the
 * Java SDK.
 *
 * <p>
 *
 * <ul>
 *   <li>Updating database with backupDestination. See: <a
 *       href="https://docs.oracle.com/iaas/Content/Database/Concepts/overview.htm">overview</a> for
 *       more information
 * </ul>
 */
public class UpdateDbBackupDestinationExample {

    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";
    private static DatabaseClient databaseClient = null;

    private static final Map<String, Opts> mappings =
            Arrays.stream(Opts.values()).collect(Collectors.toMap(Opts::getArgName, o -> o));

    /** Defines the arguments for this example. */
    private enum Opts {
        DATABASE_OCID("--databaseOcid", "The OCID of a database.", true),
        BACKUP_DESTINATION_OCID(
                "--backupDestinationOcid", "The OCID of a backup destination.", true),
        BACKUP_DESTINATION_TYPE("--backupDestinationType", "Type of backup destination", true),
        VPC_USER("--vpcUser", "vpcuser for the ZDLRA type of backup destination", false),
        VPC_PASSWORD(
                "--vpcPassword", "vpcPassword for the ZDLRA type of backup destination", false);

        Opts(String argName, String description, boolean required) {
            this.argName = argName;
            this.description = description;
            this.required = required;
        }

        public final String argName;
        public final String description;
        public final boolean required;

        public String getArgName() {
            return argName;
        }

        public String getDescription() {
            return description;
        }

        public boolean isRequired() {
            return required;
        }
    }

    /**
     * A helper method for parsing command line arguments.
     *
     * @param argv the arguments as passed
     * @return a mapping of argument to its value. Arguments may be missing from the map if they
     *     were not supplied by the user and not required.
     */
    private static Map<Opts, String> parseOpts(String[] argv) {
        if (argv == null) {
            throw new IllegalArgumentException("Missing arguments to be parsed");
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
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     *     <ul>
     *       <li>Database OCID
     *       <li>BackupDestination OCID
     *       <li>BackupDestination Type
     *     </ul>
     *     vpcUser and vpcPassword arguments are required for ZDLRA case.
     */
    public static void main(String[] args) throws Exception {

        final Map<Opts, String> argumentMap = parseOpts(args);

        final String databaseId = argumentMap.get(Opts.DATABASE_OCID);
        final String backupdestinationId = argumentMap.get(Opts.BACKUP_DESTINATION_OCID);
        final String backupdestinationType = argumentMap.get(Opts.BACKUP_DESTINATION_TYPE);
        final String vpcUser = argumentMap.getOrDefault(Opts.VPC_USER, null);
        final String vpcPassword = argumentMap.getOrDefault(Opts.VPC_PASSWORD, null);

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        databaseClient = DatabaseClient.builder().build(provider);

        final BackupDestinationDetails backupDestinationDetails =
                BackupDestinationHelper.backupDestinationDetailsCreater(
                        backupdestinationType, backupdestinationId, vpcUser, vpcPassword);

        List<BackupDestinationDetails> list = new ArrayList<>();
        list.add(backupDestinationDetails);

        UpdateDatabaseDetails updateDatabaseDetails =
                UpdateDatabaseDetails.builder()
                        .dbBackupConfig(
                                DbBackupConfig.builder().backupDestinationDetails(list).build())
                        .build();

        final UpdateDatabaseRequest request =
                UpdateDatabaseRequest.builder()
                        .databaseId(databaseId)
                        .updateDatabaseDetails(updateDatabaseDetails)
                        .build();

        UpdateDatabaseResponse response = databaseClient.updateDatabase(request);

        if (response == null) {
            throw new RuntimeException("Response from server was null.");
        } else if (response.getDatabase() == null
                || StringUtils.isBlank(response.getDatabase().getId())) {
            throw new RuntimeException(
                    "Response from server did not contain expected data! request id: "
                            + response.getOpcRequestId());
        } else {
            System.out.println(response.getDatabase().getId() + " is updated.");
        }
    }
}
