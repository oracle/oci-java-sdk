/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package database_tools;

import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.databasetools.DatabaseToolsClient;
import com.oracle.bmc.databasetools.DatabaseToolsWaiters;
import com.oracle.bmc.databasetools.model.CreateDatabaseToolsConnectionMySqlDetails;
import com.oracle.bmc.databasetools.model.DatabaseToolsConnection;
import com.oracle.bmc.databasetools.model.DatabaseToolsUserPasswordSecretIdDetails;
import com.oracle.bmc.databasetools.model.LifecycleState;
import com.oracle.bmc.databasetools.model.ValidateDatabaseToolsConnectionMySqlDetails;
import com.oracle.bmc.databasetools.requests.CreateDatabaseToolsConnectionRequest;
import com.oracle.bmc.databasetools.requests.DeleteDatabaseToolsConnectionRequest;
import com.oracle.bmc.databasetools.requests.GetDatabaseToolsConnectionRequest;
import com.oracle.bmc.databasetools.requests.ValidateDatabaseToolsConnectionRequest;
import com.oracle.bmc.databasetools.responses.CreateDatabaseToolsConnectionResponse;
import com.oracle.bmc.databasetools.responses.DeleteDatabaseToolsConnectionResponse;
import com.oracle.bmc.databasetools.responses.GetDatabaseToolsConnectionResponse;
import com.oracle.bmc.databasetools.responses.ValidateDatabaseToolsConnectionResponse;
import com.oracle.bmc.keymanagement.KmsManagementClient;
import com.oracle.bmc.keymanagement.KmsVaultClient;
import com.oracle.bmc.keymanagement.model.Vault;
import com.oracle.bmc.keymanagement.requests.GetVaultRequest;
import com.oracle.bmc.keymanagement.requests.ListKeysRequest;
import com.oracle.bmc.vault.VaultsClient;
import com.oracle.bmc.vault.VaultsWaiters;
import com.oracle.bmc.vault.model.Base64SecretContentDetails;
import com.oracle.bmc.vault.model.CreateSecretDetails;
import com.oracle.bmc.vault.model.ScheduleSecretDeletionDetails;
import com.oracle.bmc.vault.model.Secret;
import com.oracle.bmc.vault.requests.CreateSecretRequest;
import com.oracle.bmc.vault.requests.GetSecretRequest;
import com.oracle.bmc.vault.requests.ScheduleSecretDeletionRequest;
import com.oracle.bmc.vault.responses.CreateSecretResponse;
import com.oracle.bmc.vault.responses.ScheduleSecretDeletionResponse;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Date;

/**
 * Use Case: Existing MySQL database with Public IP (customer-managed)
 *
 * <p>This example creates a Database Tools Connection to a MySQL database accessible by public IP.
 * Note, since this connection will be against a public IP address, a Database Tools Private
 * Endpoint Reverse Connection is not required. Exposing a database directly to the Internet is not
 * a recommended practice for security reasons. This example serves as an academic exercise of the
 * SDK and proof of concept only.
 *
 * <p>Prerequisites: - An existing MySQL database on a compute node, for example - Firewall or
 * security list entries allowing TCP traffic to MySQL - An existing Vault for storage of secrets -
 * A previously configured .oci/config file with a [DEFAULT] section
 *
 * <p>High-level Steps: 1- Locate the Vault by the provided OCID 2- Store the secret in the Vault
 * (as base64 encoded string) 3- Create a Database Tools Connection 4- Validate the connection
 *
 * <p>... cleanup when done (delete the temporary secret and connection)
 *
 * <p>Client | | +----------------------+----------+ | V | | +----------------+ | | | Database Tools
 * | | | | Service | | | +----------------+ | | | | | Database | | | Tools | | | VCN | |
 * +----------------------+----------+ | | +----------------------+----------+ | Compute | | | Node
 * | | | | | | | | | V | | --------- | | / MySQL \ | | \Public IP/ | | --------- | | |
 * +---------------------------------+
 *
 * <p>Note: We recommend that you activate the java assertion (-ea) when running this example.
 */
public class DatabaseToolsMySqlConnectionPublicIpExample {
    private static String compartmentId = null;
    private static String vaultCompartmentId = null;
    private static String dbUser;
    private static String dbPassword = null;
    private static String dbPasswordSecretId = null;
    private static String dbtoolsConnectionId = null;
    private static String connectionString = null;
    private static String passwordSecretName = null;
    private static AuthenticationDetailsProvider provider = null;
    private static String vaultId = null;
    private static String vaultKeyId = null;
    private static DatabaseToolsClient databaseToolsClient = null;
    private static KmsVaultClient kmsVaultClient = null;
    private static VaultsClient vaultsClient = null;
    private static LocalDateTime now = LocalDateTime.now();

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     *     <ul>
     *       <li>The OCID of a compartment where the connection should be created
     *       <li>The OCID of a Vault created in KMS with at least one master key
     *       <li>The Name of the User in the MySQL database, like admin
     *       <li>The Password of the User in the MySQL database
     *       <li>The connection string such as mysql://ipaddress:3306/
     *     </ul>
     */
    public static void main(String[] args) throws Exception {
        System.out.println("\n\n============================================================\n");
        if (args.length != 5) {
            throw new IllegalArgumentException(
                    "This example expects 5 arguments: "
                            + "1. Target compartment OCID "
                            + "2. Vault OCID "
                            + "3. DB User name "
                            + "4. DB Password"
                            + "5. Connection string");
        }

        compartmentId = args[0];
        vaultId = args[1];
        dbUser = args[2];
        dbPassword = args[3];
        connectionString = args[4];

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, profile);
        provider = new ConfigFileAuthenticationDetailsProvider(ConfigFileReader.parseDefault());

        try {
            // 0- First we initialize the clients and temporary secret name
            setupPrereqs();

            // 1- Locate the ocid of the Vault compartment and the Vault key
            getVaultInfo();

            // 2- Setup secrets in Vault (wallet.sso and database password)
            dbPasswordSecretId =
                    createSecretInVault(
                            passwordSecretName,
                            Base64.getEncoder()
                                    .encodeToString(dbPassword.getBytes(StandardCharsets.UTF_8)));

            // 3- Create Database Tools Connection
            dbtoolsConnectionId = createConnection();

            // 4- Validate the connection using the Database Tools service
            boolean connectionIsValid = validateConnection();
            if (connectionIsValid) {
                System.out.println("=== Connection is Valid\n");
            } else {
                throw new RuntimeException("=== Connection is not valid");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Clean up resources
            System.out.println("=== Starting resources clean-up");
            deleteConnection(dbtoolsConnectionId);
            deleteSecret(dbPasswordSecretId);
            System.out.println("=== Resource cleanup completed");
        }
        System.out.println("\n============================================================\n");
    }

    /**
     * Create a Database Tools connection with: - Specified compartment - Connection String supplied
     * as argument - Database User supplied as argument - Database Password Stored in a Vault - Time
     * generated display name
     *
     * @return OCID of the Database Tools Connection created
     * @throws Exception
     */
    private static String createConnection() throws Exception {
        assert dbtoolsConnectionId == null : "Database Tools Connection should not already exist";

        CreateDatabaseToolsConnectionRequest createDatabaseToolsConnectionRequest;
        System.out.println("Creating a database tools connection...");

        String connectionDisplayName =
                "conn-javasdk-" + now.format(DateTimeFormatter.ofPattern("dd-HH-mm-ss-SSS"));

        createDatabaseToolsConnectionRequest =
                CreateDatabaseToolsConnectionRequest.builder()
                        .createDatabaseToolsConnectionDetails(
                                CreateDatabaseToolsConnectionMySqlDetails.builder()
                                        .compartmentId(compartmentId)
                                        .connectionString(connectionString)
                                        .displayName(connectionDisplayName)
                                        .userName(dbUser)
                                        .userPassword(
                                                DatabaseToolsUserPasswordSecretIdDetails.builder()
                                                        .secretId(dbPasswordSecretId)
                                                        .build())
                                        .build())
                        .build();

        CreateDatabaseToolsConnectionResponse response =
                databaseToolsClient.createDatabaseToolsConnection(
                        createDatabaseToolsConnectionRequest);

        String connectionId = response.getDatabaseToolsConnection().getId();

        System.out.println(
                String.format(
                        "=== Creating connection %s using Work request: %s",
                        connectionDisplayName, response.getOpcWorkRequestId()));

        waitForDatabaseToolsConnection(connectionId, LifecycleState.Active);

        System.out.println(String.format("=== Connection %s created successfully", connectionId));

        GetDatabaseToolsConnectionResponse getResponse =
                databaseToolsClient.getDatabaseToolsConnection(
                        GetDatabaseToolsConnectionRequest.builder()
                                .databaseToolsConnectionId(connectionId)
                                .build());

        DatabaseToolsConnection connection = getResponse.getDatabaseToolsConnection();
        System.out.println("Connection: " + connection);

        return connectionId;
    }

    /**
     * Validate a Database Tools Connection. The Validation is similar to the "Test Connection" in
     * SQL Developer.
     *
     * @return true if the Connection is Valid
     */
    private static boolean validateConnection() {
        System.out.println(
                String.format("=== Validating Database Tools Connection %s", dbtoolsConnectionId));
        ValidateDatabaseToolsConnectionResponse response =
                databaseToolsClient.validateDatabaseToolsConnection(
                        ValidateDatabaseToolsConnectionRequest.builder()
                                .databaseToolsConnectionId(dbtoolsConnectionId)
                                .validateDatabaseToolsConnectionDetails(
                                        ValidateDatabaseToolsConnectionMySqlDetails.builder()
                                                .build())
                                .build());

        System.out.println(
                "validateConnection result: "
                        + response.getValidateDatabaseToolsConnectionResult());

        // Validation is only successful if the code is OK
        return ("OK".equals(response.getValidateDatabaseToolsConnectionResult().getCode()));
    }

    /**
     * Perform setup and initializes and builds all the SDK clients using the
     * AuthenticationDetailsProvider based on .oci/config, for example.
     */
    private static void setupPrereqs() {
        passwordSecretName =
                "temp-db-password-javasdk-"
                        + now.format(DateTimeFormatter.ofPattern("dd-HH-mm-ss-SSS"));

        databaseToolsClient = DatabaseToolsClient.builder().build(provider);
        kmsVaultClient = KmsVaultClient.builder().build(provider);
        vaultsClient = VaultsClient.builder().build(provider);
    }

    /**
     * Queries the cloud infrastructure for the Vault specified and caches a few of these parameters
     * for later use.
     */
    private static void getVaultInfo() {
        System.out.println(String.format("Retrieving the vault %s key to create secrets", vaultId));

        Vault vault =
                kmsVaultClient
                        .getVault(GetVaultRequest.builder().vaultId(vaultId).build())
                        .getVault();
        assert vault != null : "getVaultInfo()... vault must not be null";

        System.out.println(
                String.format(
                        "Vault %s management endpoint is %s",
                        vaultId, vault.getManagementEndpoint()));

        vaultCompartmentId = vault.getCompartmentId();

        KmsManagementClient kmsManagementClient =
                KmsManagementClient.builder().vault(vault).build(provider);

        vaultKeyId =
                kmsManagementClient
                        .listKeys(
                                ListKeysRequest.builder().compartmentId(vaultCompartmentId).build())
                        .getItems()
                        .iterator()
                        .next()
                        .getId();
    }

    /**
     * Create a secret in a Vault
     *
     * @param secretName Name of the Secret
     * @param base64Content The content of the secret as a base 64 string
     * @return the OCID of the generated secret
     * @throws Exception
     */
    private static String createSecretInVault(String secretName, String base64Content)
            throws Exception {
        System.out.println(
                String.format("Using vault key ID %s to create secret %s", vaultKeyId, secretName));

        CreateSecretResponse createSecretResponse =
                vaultsClient.createSecret(
                        CreateSecretRequest.builder()
                                .createSecretDetails(
                                        CreateSecretDetails.builder()
                                                .vaultId(vaultId)
                                                .keyId(vaultKeyId)
                                                .compartmentId(vaultCompartmentId)
                                                .secretName(secretName)
                                                .secretContent(
                                                        Base64SecretContentDetails.builder()
                                                                .content(base64Content)
                                                                .build())
                                                .build())
                                .build());
        String secretId = createSecretResponse.getSecret().getId();
        System.out.println(String.format("Creating secret %s, id %s", secretName, secretId));

        // Async request so wait for it to be ACTIVE before use
        waitForSecret(secretId, Secret.LifecycleState.Active);
        System.out.println("Secret state is now ACTIVE.");

        return secretId;
    }

    /**
     * Delete a Secret in a Vault. Note that the secret is not actually deleted immediately, it is
     * scheduled for deletion on a later date.
     *
     * @param secretId The OCID of the Secret to delete
     * @throws Exception
     */
    private static void deleteSecret(String secretId) throws Exception {
        if (secretId == null || secretId.isEmpty()) {
            System.out.println("=== Vault secret is undefined... skipping delete");
            return;
        }
        ScheduleSecretDeletionDetails scheduleSecretDeletionDetails =
                ScheduleSecretDeletionDetails.builder()
                        .timeOfDeletion(
                                Date.from(
                                        LocalDate.now()
                                                .plusDays(2)
                                                .atStartOfDay(ZoneId.systemDefault())
                                                .toInstant()))
                        .build();

        ScheduleSecretDeletionResponse response =
                vaultsClient.scheduleSecretDeletion(
                        ScheduleSecretDeletionRequest.builder()
                                .secretId(secretId)
                                .scheduleSecretDeletionDetails(scheduleSecretDeletionDetails)
                                .build());
        System.out.println(
                String.format("Deleting Secret with OpcRequestId: %s", response.getOpcRequestId()));

        waitForSecret(secretId, Secret.LifecycleState.PendingDeletion);

        System.out.println(String.format("Secret %s state is now pending deletion", secretId));
    }

    /**
     * Delete The database Tools Connection for the specified connectionId
     *
     * @param connectionId The OCID of the Database Tools to delete
     * @throws Exception
     */
    private static void deleteConnection(String connectionId) throws Exception {
        if (connectionId == null) {
            System.out.println("=== database tools connection is undefined... delete skipped");
        } else {
            DeleteDatabaseToolsConnectionResponse response =
                    databaseToolsClient.deleteDatabaseToolsConnection(
                            DeleteDatabaseToolsConnectionRequest.builder()
                                    .databaseToolsConnectionId(connectionId)
                                    .build());
            System.out.println(
                    String.format(
                            "Deleting connection %s using Work request: %s",
                            connectionId, response.getOpcWorkRequestId()));

            waitForDatabaseToolsConnection(connectionId, LifecycleState.Deleted);
            System.out.println(String.format("Connection %s state is now deleted", connectionId));
        }
    }

    /**
     * Wait for a specific Connection to get a specific state. Required for asynchronous operation.
     *
     * @param connectionId The OCID of the database Tools Connection
     * @param targetState The LifeCycle state to reach
     * @throws Exception
     */
    private static void waitForDatabaseToolsConnection(
            String connectionId, LifecycleState targetState) throws Exception {

        System.out.println(
                String.format(
                        "=== Waiting for connection %s to match state -> %s",
                        connectionId, targetState));

        DatabaseToolsWaiters waiter = databaseToolsClient.getWaiters();
        waiter.forDatabaseToolsConnection(
                        GetDatabaseToolsConnectionRequest.builder()
                                .databaseToolsConnectionId(connectionId)
                                .build(),
                        targetState)
                .execute();
        System.out.println("=== Done waiting");
    }

    /**
     * Wait for a specific Secret to get a specific state. Required for asynchronous operation.
     *
     * @param secretId The OCID of the Secret in a Vault
     * @param targetState The LifeCycle state to reach
     * @throws Exception
     */
    private static void waitForSecret(String secretId, Secret.LifecycleState targetState)
            throws Exception {

        System.out.println(
                String.format(
                        "=== Waiting for secret %s to match state -> %s", secretId, targetState));

        VaultsWaiters waiter = vaultsClient.getWaiters();
        waiter.forSecret(GetSecretRequest.builder().secretId(secretId).build(), targetState)
                .execute();
        System.out.println("=== Done waiting");
    }
}
