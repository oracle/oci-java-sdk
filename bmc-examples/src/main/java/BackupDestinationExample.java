/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.database.DatabaseClient;
import com.oracle.bmc.database.DatabaseWaiters;
import com.oracle.bmc.database.model.CreateBackupDestinationDetails;
import com.oracle.bmc.database.model.CreateNFSBackupDestinationDetails;
import com.oracle.bmc.database.model.CreateRecoveryApplianceBackupDestinationDetails;
import com.oracle.bmc.database.model.UpdateBackupDestinationDetails;
import com.oracle.bmc.database.requests.CreateBackupDestinationRequest;
import com.oracle.bmc.database.requests.DeleteBackupDestinationRequest;
import com.oracle.bmc.database.requests.GetBackupDestinationRequest;
import com.oracle.bmc.database.requests.UpdateBackupDestinationRequest;
import com.oracle.bmc.database.responses.CreateBackupDestinationResponse;
import com.oracle.bmc.database.responses.DeleteBackupDestinationResponse;
import com.oracle.bmc.database.responses.GetBackupDestinationResponse;
import com.oracle.bmc.database.responses.UpdateBackupDestinationResponse;

import java.util.*;
import java.util.stream.Collectors;

/**
 * This class provides an example of CRUD(Create, read, update, delete) operations on
 * BackupDestination using the Java SDK.
 *
 * <p>
 *
 * <ul>
 *   <li>For general documentation refer to :- <a
 *       href="https://docs.oracle.com/iaas/Content/Database/Concepts/overview.htm">overview</a> for
 *       more information
 * </ul>
 */
public class BackupDestinationExample {
    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";
    private static final String displayName = "displayName";

    private static DatabaseClient databaseClient = null;
    private static final Map<String, Opts> mappings =
            Arrays.stream(Opts.values()).collect(Collectors.toMap(Opts::getArgName, o -> o));

    /** Defines the arguments for this example. */
    private enum Opts {
        COMPARTMENT_OCID("--compartmentOcid", "The OCID of compartment.", true),
        BACKUP_DESTINATION_TYPE("--backupDestinationType", "Type of backup destination", true),
        VPC_USER("--vpcUser", "vpcuser for the ZDLRA type of backup destination", false),
        LOCAL_MOUNT_PATH(
                "--localMountPath", "localMountPath for NFS type of backup destination", false),
        CONNECTION_STRING(
                "--connectionString",
                "connectionString for ZDLRA type of backup destination",
                false);

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
     *       <li>Compartment OCID
     *     </ul>
     */
    public static void main(String[] args) throws Exception {
        final Map<Opts, String> argumentMap = parseOpts(args);

        final String compartmentId = argumentMap.get(Opts.COMPARTMENT_OCID);
        final String backupdestinationType = argumentMap.get(Opts.BACKUP_DESTINATION_TYPE);
        final String localMountPath = argumentMap.get(Opts.LOCAL_MOUNT_PATH);
        final String vpcUser = argumentMap.getOrDefault(Opts.VPC_USER, null);
        final String connectionString = argumentMap.getOrDefault(Opts.CONNECTION_STRING, null);

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);
        databaseClient = DatabaseClient.builder().build(provider);

        List<String> vpcusers = new ArrayList<>();
        vpcusers.add(vpcUser);

        // Create Backup Destination
        CreateBackupDestinationDetails backupDestinationDetails =
                createBackupDestinationDetails(
                        compartmentId,
                        backupdestinationType,
                        vpcusers,
                        connectionString,
                        localMountPath);

        CreateBackupDestinationResponse createBackupDestinationResponse =
                databaseClient.createBackupDestination(
                        CreateBackupDestinationRequest.builder()
                                .createBackupDestinationDetails(backupDestinationDetails)
                                .build());

        com.oracle.bmc.database.model.BackupDestination backupDestination =
                createBackupDestinationResponse.getBackupDestination();

        // Get Backup Destination
        backupDestination =
                databaseClient
                        .getBackupDestination(
                                GetBackupDestinationRequest.builder()
                                        .backupDestinationId(backupDestination.getId())
                                        .build())
                        .getBackupDestination();

        System.out.println("GET request returned :" + backupDestination);

        // Update
        UpdateBackupDestinationDetails updateBackupDestinationDetails =
                updateBackupDestinationDetails(backupdestinationType, vpcusers);
        UpdateBackupDestinationResponse updateResponse =
                databaseClient.updateBackupDestination(
                        UpdateBackupDestinationRequest.builder()
                                .updateBackupDestinationDetails(updateBackupDestinationDetails)
                                .backupDestinationId(backupDestination.getId())
                                .build());

        backupDestination = updateResponse.getBackupDestination();

        // Delete
        DeleteBackupDestinationResponse deleteResponse =
                databaseClient.deleteBackupDestination(
                        DeleteBackupDestinationRequest.builder()
                                .backupDestinationId(backupDestination.getId())
                                .build());

        DatabaseWaiters waiter = databaseClient.getWaiters();
        GetBackupDestinationResponse response =
                waiter.forBackupDestination(
                                GetBackupDestinationRequest.builder()
                                        .backupDestinationId(backupDestination.getId())
                                        .build(),
                                com.oracle.bmc.database.model.BackupDestination.LifecycleState
                                        .Deleted)
                        .execute();

        databaseClient.close();
    }

    private static UpdateBackupDestinationDetails updateBackupDestinationDetails(
            String type, List<String> vpcUsers) throws Exception {
        UpdateBackupDestinationDetails updateBackupDestinationDetails = null;

        switch (type) {
            case "ZDLRA":
                vpcUsers.add("New User");
                updateBackupDestinationDetails =
                        UpdateBackupDestinationDetails.builder().vpcUsers(vpcUsers).build();
                break;
            case "NFS":
                updateBackupDestinationDetails =
                        UpdateBackupDestinationDetails.builder()
                                .localMountPointPath("Updated Path")
                                .build();
                break;
            default:
                throw new Exception("Enter a valid type value from NFS or ZDLRA");
        }

        return updateBackupDestinationDetails;
    }

    private static CreateBackupDestinationDetails createBackupDestinationDetails(
            String compartmentId,
            String type,
            List<String> vpcUsers,
            String connectionString,
            String localMountPath)
            throws Exception {
        CreateBackupDestinationDetails createBackupDestinationDetails = null;

        switch (type) {
            case "ZDLRA":
                createBackupDestinationDetails =
                        CreateRecoveryApplianceBackupDestinationDetails.builder()
                                .compartmentId(compartmentId)
                                .displayName(displayName)
                                .vpcUsers(vpcUsers)
                                .connectionString(connectionString)
                                .build();
                break;
            case "NFS":
                createBackupDestinationDetails =
                        CreateNFSBackupDestinationDetails.builder()
                                .compartmentId(compartmentId)
                                .displayName(displayName)
                                .localMountPointPath(localMountPath)
                                .build();
                break;
            default:
                throw new Exception("Enter a valid type value from NFS or ZDLRA");
        }

        return createBackupDestinationDetails;
    }
}
