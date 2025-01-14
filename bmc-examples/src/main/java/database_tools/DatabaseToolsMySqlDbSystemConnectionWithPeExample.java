/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package database_tools;

import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.databasetools.DatabaseToolsClient;
import com.oracle.bmc.databasetools.DatabaseToolsWaiters;
import com.oracle.bmc.databasetools.model.CreateDatabaseToolsConnectionMySqlDetails;
import com.oracle.bmc.databasetools.model.CreateDatabaseToolsPrivateEndpointDetails;
import com.oracle.bmc.databasetools.model.CreateDatabaseToolsRelatedResourceMySqlDetails;
import com.oracle.bmc.databasetools.model.DatabaseToolsConnection;
import com.oracle.bmc.databasetools.model.DatabaseToolsPrivateEndpoint;
import com.oracle.bmc.databasetools.model.DatabaseToolsUserPasswordSecretIdDetails;
import com.oracle.bmc.databasetools.model.LifecycleState;
import com.oracle.bmc.databasetools.model.RelatedResourceEntityTypeMySql;
import com.oracle.bmc.databasetools.model.ValidateDatabaseToolsConnectionMySqlDetails;
import com.oracle.bmc.databasetools.requests.CreateDatabaseToolsConnectionRequest;
import com.oracle.bmc.databasetools.requests.CreateDatabaseToolsPrivateEndpointRequest;
import com.oracle.bmc.databasetools.requests.DeleteDatabaseToolsConnectionRequest;
import com.oracle.bmc.databasetools.requests.DeleteDatabaseToolsPrivateEndpointRequest;
import com.oracle.bmc.databasetools.requests.GetDatabaseToolsConnectionRequest;
import com.oracle.bmc.databasetools.requests.GetDatabaseToolsPrivateEndpointRequest;
import com.oracle.bmc.databasetools.requests.ListDatabaseToolsEndpointServicesRequest;
import com.oracle.bmc.databasetools.requests.ValidateDatabaseToolsConnectionRequest;
import com.oracle.bmc.databasetools.responses.CreateDatabaseToolsConnectionResponse;
import com.oracle.bmc.databasetools.responses.CreateDatabaseToolsPrivateEndpointResponse;
import com.oracle.bmc.databasetools.responses.DeleteDatabaseToolsConnectionResponse;
import com.oracle.bmc.databasetools.responses.DeleteDatabaseToolsPrivateEndpointResponse;
import com.oracle.bmc.databasetools.responses.GetDatabaseToolsConnectionResponse;
import com.oracle.bmc.databasetools.responses.GetDatabaseToolsPrivateEndpointResponse;
import com.oracle.bmc.databasetools.responses.ValidateDatabaseToolsConnectionResponse;
import com.oracle.bmc.keymanagement.KmsManagementClient;
import com.oracle.bmc.keymanagement.KmsVaultClient;
import com.oracle.bmc.keymanagement.model.Vault;
import com.oracle.bmc.keymanagement.requests.GetVaultRequest;
import com.oracle.bmc.keymanagement.requests.ListKeysRequest;
import com.oracle.bmc.mysql.DbSystemClient;
import com.oracle.bmc.mysql.model.DbSystem;
import com.oracle.bmc.mysql.model.DbSystemEndpoint;
import com.oracle.bmc.mysql.requests.GetDbSystemRequest;
import com.oracle.bmc.mysql.responses.GetDbSystemResponse;
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
 * Use Case: MySQL DB System with Database Tools Private Endpoint
 *
 * <p>This example creates a Database Tools Connection to a MySQL DB System accessible by private
 * IP. Note, since this connection will be against a private IP address, a Database Tools Private
 * Endpoint Reverse Connection is required. This example serves as an academic exercise of the SDK.
 *
 * <p>Prerequisites: - An existing MySQL DB System in a VCN and associated subnet - Available
 * capacity (limits apply) to create a new Private Endpoint - An existing Vault for storage of
 * secrets - A previously configured .oci/config file with a [DEFAULT] section
 *
 * <p>High-level Steps: 1- Locate the MySQL DB System by provided OCID (arg[0]) 2- Locate the Vault
 * by provided OCID (arg[2]) 3- Create a Database Tools Private Endpoint Reverse Connection 4- Store
 * the secret in the Vault (as base64 encoded string) 5- Create a Database Tools connection 6-
 * Validate the connection
 *
 * <p>... cleanup when done (delete the temporary secret, connection, and PE)
 *
 * <p>Client | | +----------------------+----------+ | V | | +----------------+ | | | Database Tools
 * | | | | Service | | | +----------------+ | | | | | Database | | | Tools | | | VCN | |
 * +----------------------+----------+ | | +----------------------+----------+ | | | | V | |
 * +-----------+ | | | Database | | | | Tools | | | | Private | | | | Endpoint | | | +-----------+ |
 * | | | | | | | V | | --------- | | / MDS \ | | | Private | | | \ IP / | | --------- | | | |
 * Customer | | VCN (jump host not required) | +---------------------------------+
 *
 * <p>Note: We recommend that you activate the java assertion (-ea) when running this example.
 */
public class DatabaseToolsMySqlDbSystemConnectionWithPeExample {

    private static AuthenticationDetailsProvider provider = null;
    private static String dbSystemId = null;
    private static String vaultId = null;
    private static String vaultKeyId = null;
    private static String compartmentId = null;
    private static String vaultCompartmentId = null;
    private static String passwordSecretName = null;
    private static String dbPasswordSecretId = null;
    private static String dbtoolsPrivateEndpointId = null;
    private static String dbtoolsConnectionId = null;
    private static String dbUser = null;
    private static String dbPassword = null;
    private static String connectionString = null;
    private static DbSystem dbSystem = null;
    private static DbSystemClient dbSystemClient = null;
    private static DatabaseToolsClient databaseToolsClient = null;
    private static KmsVaultClient kmsVaultClient = null;
    private static VaultsClient vaultsClient = null;
    private static LocalDateTime now = LocalDateTime.now();

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     *     <ul>
     *       <li>The OCID of an existing MySQL DB System
     *       <li>The OCID of a Vault created in KMS with at least one master key
     *       <li>The Name of the User in the MySQL database, like admin
     *       <li>The Password of the User in the MySQL database
     *     </ul>
     */
    public static void main(String[] args) throws Exception {
        System.out.println("\n\n============================================================\n");
        if (args.length != 4) {
            throw new IllegalArgumentException(
                    "This example expects 4 arguments: "
                            + "1. MySQL DB System OCID "
                            + "2. Vault OCID "
                            + "3. DB User name "
                            + "4. DB Password");
        }

        dbSystemId = args[0];
        vaultId = args[1];
        dbUser = args[2];
        dbPassword = args[3];

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, profile);
        provider = new ConfigFileAuthenticationDetailsProvider(ConfigFileReader.parseDefault());

        try {
            // 0- First we initialize the clients and temporary secret name
            setupPrereqs();

            // 1- Locate MySQL DB system, ocid of the related compartment, and display name
            getDatabaseInfo();

            // 2- Locate the ocid of the Vault compartment and the Vault key
            getVaultInfo();

            // 3- Create a Database Tools Private Endpoint (needed for private IP access)
            dbtoolsPrivateEndpointId = createPrivateEndpoint();

            // 4- Setup secret in Vault (database password)
            dbPasswordSecretId =
                    createSecretInVault(
                            passwordSecretName,
                            Base64.getEncoder()
                                    .encodeToString(dbPassword.getBytes(StandardCharsets.UTF_8)));

            // 5- Create Database Tools Connection
            dbtoolsConnectionId = createConnection();

            // 6- Validate the connection using the Database Tools service
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
            deletePrivateEndpoint(dbtoolsPrivateEndpointId);
            deleteSecret(dbPasswordSecretId);
            System.out.println("=== Resource cleanup completed");
        }
        System.out.println("\n============================================================\n");
    }

    /**
     * Create a Database Tools connection with: - Same compartment as specified MySQL DB System OCID
     * - Database User supplied as argument - Database Password Stored in a Vault - Related Resource
     * with a reference to the MySQL DB System OCID - Time generated display name
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

        // Related Resource is optional, but will help provide additional information when querying
        // the
        // connection using the OCI Console, the SDKs and the CLI.
        CreateDatabaseToolsRelatedResourceMySqlDetails relatedResource =
                CreateDatabaseToolsRelatedResourceMySqlDetails.builder()
                        .entityType(RelatedResourceEntityTypeMySql.Mysqldbsystem)
                        .identifier(dbSystemId)
                        .build();

        createDatabaseToolsConnectionRequest =
                CreateDatabaseToolsConnectionRequest.builder()
                        .createDatabaseToolsConnectionDetails(
                                CreateDatabaseToolsConnectionMySqlDetails.builder()
                                        .compartmentId(compartmentId)
                                        .connectionString(connectionString)
                                        .privateEndpointId(dbtoolsPrivateEndpointId)
                                        .displayName(connectionDisplayName)
                                        .userName(dbUser)
                                        .userPassword(
                                                DatabaseToolsUserPasswordSecretIdDetails.builder()
                                                        .secretId(dbPasswordSecretId)
                                                        .build())
                                        .relatedResource(relatedResource)
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
     * Create a Private Endpoint for a Reverse Connection. The Database Tools Private Endpoint will
     * be created in the same compartment and subnet as the MySQL DB system. A best practice would
     * be to use separate subnets with properly configured security lists.
     *
     * @throws Exception
     */
    public static String createPrivateEndpoint() throws Exception {
        assert dbSystem != null : "MySQL DB System must not be null";
        assert compartmentId != null : "Target compartment must not be null";

        String endpointServiceId =
                databaseToolsClient
                        .listDatabaseToolsEndpointServices(
                                ListDatabaseToolsEndpointServicesRequest.builder()
                                        .compartmentId(compartmentId)
                                        .name("DATABASE_TOOLS")
                                        .build())
                        .getDatabaseToolsEndpointServiceCollection()
                        .getItems()
                        .get(0) // Simply get the first one in this example
                        .getId();

        String displayName =
                "pe-javasdk-" + now.format(DateTimeFormatter.ofPattern("dd-HH-mm-ss-SSS"));
        CreateDatabaseToolsPrivateEndpointResponse createPrivateEndpointResponse =
                databaseToolsClient.createDatabaseToolsPrivateEndpoint(
                        CreateDatabaseToolsPrivateEndpointRequest.builder()
                                .createDatabaseToolsPrivateEndpointDetails(
                                        CreateDatabaseToolsPrivateEndpointDetails.builder()
                                                .compartmentId(compartmentId)
                                                .endpointServiceId(endpointServiceId)
                                                .subnetId(dbSystem.getSubnetId())
                                                .displayName(displayName)
                                                .build())
                                .build());

        String peId = createPrivateEndpointResponse.getDatabaseToolsPrivateEndpoint().getId();
        System.out.println(
                String.format(
                        "=== Creating Private Endpoint %s using Work request: %s",
                        displayName, createPrivateEndpointResponse.getOpcWorkRequestId()));

        // We wait for the response.
        waitForDatabaseToolsPrivateEndpoint(peId, LifecycleState.Active);

        System.out.println(String.format("=== Private endpoint %s created successfully", peId));

        // Get the Database Tools Private Endpoint that we just created
        GetDatabaseToolsPrivateEndpointRequest getDatabaseToolsPrivateEndpointRequest =
                GetDatabaseToolsPrivateEndpointRequest.builder()
                        .databaseToolsPrivateEndpointId(peId)
                        .build();

        GetDatabaseToolsPrivateEndpointResponse response =
                databaseToolsClient.getDatabaseToolsPrivateEndpoint(
                        getDatabaseToolsPrivateEndpointRequest);
        DatabaseToolsPrivateEndpoint privateEndpoint = response.getDatabaseToolsPrivateEndpoint();
        System.out.println("Private Endpoint: " + privateEndpoint);

        return peId;
    }

    /**
     * Validate a Database Tools Connection. Sends a no-op query to the MySQL database to confirm
     * the connection is valid.
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

        dbSystemClient = DbSystemClient.builder().build(provider);
        databaseToolsClient = DatabaseToolsClient.builder().build(provider);
        kmsVaultClient = KmsVaultClient.builder().build(provider);
        vaultsClient = VaultsClient.builder().build(provider);
    }

    /**
     * Queries the cloud infrastructure for the MySQL DB system specified and caches a few of the
     * results for later use.
     */
    private static void getDatabaseInfo() {
        System.out.println(String.format("Requesting information for database: %s...", dbSystemId));

        GetDbSystemRequest getDbSystemRequest =
                GetDbSystemRequest.builder().dbSystemId(dbSystemId).build();

        GetDbSystemResponse response = dbSystemClient.getDbSystem(getDbSystemRequest);

        dbSystem = response.getDbSystem();
        assert dbSystem.getEndpoints().size() > 0 : "DB system must have an endpoint";

        compartmentId = dbSystem.getCompartmentId();

        DbSystemEndpoint endpoint = dbSystem.getEndpoints().get(0);

        // Default for an endpoint are 3306 (port) and 33060 (portx)
        connectionString =
                String.format("mysql://%s:%s", endpoint.getIpAddress(), endpoint.getPort());

        System.out.println("Database name: " + dbSystem.getDisplayName());
        System.out.println("Database compartment Id: " + compartmentId);
        System.out.println("Connection string: " + connectionString);
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
     * Delete the Database Tools Private Endpoint for the specified privateEndpointId
     *
     * @param privateEndpointId
     * @throws Exception
     */
    private static void deletePrivateEndpoint(String privateEndpointId) throws Exception {
        if (privateEndpointId != null) {
            DeleteDatabaseToolsPrivateEndpointRequest deleteDatabaseToolsPrivateEndpointRequest =
                    DeleteDatabaseToolsPrivateEndpointRequest.builder()
                            .databaseToolsPrivateEndpointId(privateEndpointId)
                            .build();

            DeleteDatabaseToolsPrivateEndpointResponse response =
                    databaseToolsClient.deleteDatabaseToolsPrivateEndpoint(
                            deleteDatabaseToolsPrivateEndpointRequest);
            System.out.println(
                    "Deleting Private endpoint using Work request: "
                            + response.getOpcWorkRequestId());

            // We wait for the response.
            waitForDatabaseToolsPrivateEndpoint(privateEndpointId, LifecycleState.Deleted);
            System.out.println(
                    String.format("Private endpoint %s deleted successfully!", privateEndpointId));
        } else {
            System.out.println("deletePrivateEndpoint skipped");
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

    /**
     * Wait for a specific Private Endpoint to get a specific state. Required for asynchronous
     * operation.
     *
     * @param endpointId The OCID of the database Tools Private Endpoint
     * @param targetState The LifeCycle state to reach
     * @throws Exception
     */
    private static void waitForDatabaseToolsPrivateEndpoint(
            String endpointId, LifecycleState targetState) throws Exception {

        System.out.println(
                String.format(
                        "=== Waiting for private endpoint %s to match state -> %s",
                        endpointId, targetState));

        DatabaseToolsWaiters waiter = databaseToolsClient.getWaiters();
        waiter.forDatabaseToolsPrivateEndpoint(
                        GetDatabaseToolsPrivateEndpointRequest.builder()
                                .databaseToolsPrivateEndpointId(endpointId)
                                .build(),
                        targetState)
                .execute();

        System.out.println("=== Done waiting");
    }
}
