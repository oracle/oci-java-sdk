/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package database_tools;

import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.database.DatabaseClient;
import com.oracle.bmc.database.requests.*;
import com.oracle.bmc.databasetools.DatabaseToolsClient;
import com.oracle.bmc.databasetools.model.*;
import com.oracle.bmc.databasetools.requests.*;
import com.oracle.bmc.databasetools.responses.*;
import com.oracle.bmc.keymanagement.KmsManagementClient;
import com.oracle.bmc.keymanagement.KmsVaultClient;
import com.oracle.bmc.keymanagement.model.Vault;
import com.oracle.bmc.keymanagement.requests.GetVaultRequest;
import com.oracle.bmc.keymanagement.requests.ListKeysRequest;
import com.oracle.bmc.secrets.SecretsClient;
import com.oracle.bmc.vault.VaultsClient;
import com.oracle.bmc.vault.model.Base64SecretContentDetails;
import com.oracle.bmc.vault.model.CreateSecretDetails;
import com.oracle.bmc.vault.model.ScheduleSecretDeletionDetails;
import com.oracle.bmc.vault.model.Secret;
import com.oracle.bmc.vault.requests.CreateSecretRequest;
import com.oracle.bmc.vault.requests.GetSecretRequest;
import com.oracle.bmc.vault.requests.ScheduleSecretDeletionRequest;
import com.oracle.bmc.vault.responses.CreateSecretResponse;
import com.oracle.bmc.vault.responses.GetSecretResponse;
import com.oracle.bmc.vault.responses.ScheduleSecretDeletionResponse;

import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * Use Case: Bare Metal, VM or Exadata with Private IP
 *
 * Creates a connection to a VM DB System with Private Endpoint (PE) in a Private Subnet
 *  - Requires Database Tools Private Endpoint Reverse Connection: Yes
 *  - Requires a KeyStore: No
 *
 *  1- Create required secrets
 *  2- Create a Database Tools Private Endpoint for A Reverse Connection to the VM DB System
 *  3- Create a Database Tools connection
 *  4- Validate the connection
 *
 *                       Client
 *                         |
 *                         |
 *  +----------------------+----------+
 *  |                      V          |
 *  |              +----------------+ |
 *  |              | Database Tools | |
 *  |              |    Service     | |
 *  |              +----------------+ |
 *  |                      |          |
 *  | Database             |          |
 *  | Tools                |          |
 *  | VCN                  |          |
 *  +----------------------+----------+
 *                         |
 *                         |
 *  +----------------------+----------+
 *  |                      |          |
 *  |                      V          |
 *  |                +-----------+    |
 *  |                | Database  |    |
 *  |                |  Tools    |    |
 *  |                | Private   |    |
 *  |                | Endpoint  |    |
 *  |                |  Reverse  |    |
 *  |                | Connection|    |
 *  |                +-----------+    |
 *  |                      |          |
 *  |                      V          |
 *  |                  ---------      |
 *  |                 /    DB   \     |
 *  |                 \  System /     |
 *  |                  ---------      |
 *  |                                 |
 *  | Customer                        |
 *  | VCN                             |
 *  +---------------------------------+
 *
 *  Note: We recommend that you activate the java assertion (-ea) when running this example.
 */
public class DatabaseToolsDbSystemConnectionPrivateSubnet {

    private static AuthenticationDetailsProvider provider = null;
    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    private static String dbSystemId = null;
    private static String vaultId = null;
    private static String dbPassword = null;
    private static String dbUser = null;
    private static String passwordSecretName = null;
    private static String subnetId = null;

    private static String dbPasswordSecretId = null;
    private static String dbtoolsConnectionId = null;
    private static String dbtoolsPrivateEndpointId = null;
    private static String compartmentId = null;
    private static String vaultKeyId = null;

    private static DatabaseClient databaseClient = null;
    private static DatabaseToolsClient databaseToolsClient = null;
    private static KmsVaultClient kmsVaultClient = null;
    private static SecretsClient secretsClient = null;
    private static VaultsClient vaultsClient = null;

    private static LocalDateTime now = LocalDateTime.now();

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     * <ul>
     *   <li>The OCID of the compartment where the vcn, DB System, vault, private endpoint and connection will reside</li>
     *   <li>The OCID of the DB System created following the instructions from: https://docs.oracle.com/en-us/iaas/Content/Database/Tasks/creatingDBsystem.htm with NSG for port 1521</li>
     *   <li>The OCID of a Vault created in KMS with at least one master key</li>
     *   <li>The Name of the User in the DB System, like system</li>
     *   <li>The Password of the User in the DB System</li>
     *   <li>The OCID of the Subnet of the DB System. Best practice is to use a private subnet.</li>
     * </ul>
     */
    public static void main(String[] args) throws Exception {
        if (args.length != 6) {
            throw new IllegalArgumentException(
                    "This example expects 6 arguments: 1. Compartment OCID 2. DB System OCID 3. Vault OCID 4. DB User name 5. DB Password 6. Subnet OCID");
        }

        compartmentId = args[0];
        dbSystemId = args[1];
        vaultId = args[2];
        dbUser = args[3];
        dbPassword = args[4];
        subnetId = args[5];

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, profile);
        provider = new ConfigFileAuthenticationDetailsProvider(ConfigFileReader.parseDefault());

        try {
            passwordSecretName =
                    "db-password-javasdk-"
                            + now.format(DateTimeFormatter.ofPattern("dd-HH-mm-ss-SSS"));

            // Create Java SDK clients
            databaseClient = DatabaseClient.builder().build(provider);
            databaseToolsClient = DatabaseToolsClient.builder().build(provider);
            secretsClient = SecretsClient.builder().build(provider);
            kmsVaultClient = KmsVaultClient.builder().build(provider);
            vaultsClient = VaultsClient.builder().build(provider);

            // 1- Create secrets (database password) in the Vault
            createSecrets();

            // 2- Create a Database Tools Private Endpoint for a Reverse Connection to the VM DB System
            createPrivateEndpoint();

            // 3- Create a Database Tools connection
            createConnection();

            // 4- Validate that the connection can be used
            boolean connectionIsValid = validateConnection();
            if (connectionIsValid) {
                System.out.println("===Connection is Valid\n");
            } else {
                throw new RuntimeException("Connection is not valid");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Clean-up resources
            System.out.println("===Starting resources clean-up");
            deleteConnection(dbtoolsConnectionId);
            deletePrivateEndpoint(dbtoolsPrivateEndpointId);
            deleteSecrets(Arrays.asList(dbPasswordSecretId));

            System.out.println("===Processing completed");
        }
    }

    /**
     * Create a secret in a Vault
     * @param name Name of the Secret
     * @param base64Secret The content of the secret as a base 64 string
     * @return the OCID of the generated secret
     * @throws Exception
     */
    private static String createSecret(String name, String base64Secret) throws Exception {
        if (vaultKeyId == null) {
            System.out.println(
                    String.format("Retrieving the vault %s key to create secrets", vaultId));
            Vault vault =
                    kmsVaultClient
                            .getVault(GetVaultRequest.builder().vaultId(vaultId).build())
                            .getVault();

            assert vault != null : "createSecret. vault must not be null";
            System.out.println(
                    String.format(
                            "Vault %s management endpoint is %s",
                            vaultId,
                            vault.getManagementEndpoint()));
            KmsManagementClient kmsManagementClient =
                    KmsManagementClient.builder().vault(vault).build(provider);
            // This will only work if the key is in the same compartment as the vault
            vaultKeyId =
                    kmsManagementClient
                            .listKeys(
                                    ListKeysRequest.builder()
                                            .compartmentId(vault.getCompartmentId())
                                            .build())
                            .getItems()
                            .iterator()
                            .next()
                            .getId();
            System.out.println(String.format("Vault %s key id is %s", vaultId, vaultKeyId));
        }

        // Create Secret in vault
        CreateSecretResponse createSecretResponse =
                vaultsClient.createSecret(
                        CreateSecretRequest.builder()
                                .createSecretDetails(
                                        CreateSecretDetails.builder()
                                                .vaultId(vaultId)
                                                .keyId(vaultKeyId)
                                                .compartmentId(compartmentId)
                                                .secretName(name)
                                                .secretContent(
                                                        Base64SecretContentDetails.builder()
                                                                .content(base64Secret)
                                                                .build())
                                                .build())
                                .build());
        String secretId = createSecretResponse.getSecret().getId();
        System.out.println(String.format("Creating secret %s, id %s...", name, secretId));

        // We wait for the response.
        waitForSecret(secretId, Secret.LifecycleState.Active);
        System.out.println(String.format("Secret %s is active", secretId));
        return secretId;
    }

    /**
     * Create secrets (database wallet and database password) in the Vault
     * @throws Exception
     */
    private static void createSecrets() throws Exception {
        // Create db password secret in vault
        System.out.println(String.format("Storing db password in the vault..."));
        dbPasswordSecretId =
                createSecret(
                        passwordSecretName,
                        Base64.getEncoder()
                                .encodeToString(dbPassword.getBytes(StandardCharsets.UTF_8)));
    }

    /**
     * Create a Private Endpoint for a Reverse Connection. The Database Tools Private Endpoint will
     * be created in the same compartment and subnet as the Autonomous Database.
     * A best practice would be to use separate subnets with properly configured security lists.
     * @throws Exception
     */
    public static void createPrivateEndpoint() throws Exception {
        assert dbtoolsPrivateEndpointId == null : "Database Tools PE should not already exists";

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
                                                .subnetId(subnetId)
                                                .displayName(displayName)
                                                .build())
                                .build());

        String peId = createPrivateEndpointResponse.getDatabaseToolsPrivateEndpoint().getId();
        System.out.println(
                String.format(
                        "===Creating Private Endpoint %s using Work request: %s",
                        displayName,
                        createPrivateEndpointResponse.getOpcWorkRequestId()));

        // We wait for the response.
        waitForDatabaseToolsPrivateEndpoint(peId, LifecycleState.Active);

        dbtoolsPrivateEndpointId = peId;
        System.out.println(String.format("===Private endpoint %s created successfully", peId));

        // Get the Database Tools Private Endpoint that we just created
        GetDatabaseToolsPrivateEndpointRequest getDatabaseToolsPrivateEndpointRequest =
                GetDatabaseToolsPrivateEndpointRequest.builder()
                        .databaseToolsPrivateEndpointId(dbtoolsPrivateEndpointId)
                        .build();

        GetDatabaseToolsPrivateEndpointResponse response =
                databaseToolsClient.getDatabaseToolsPrivateEndpoint(
                        getDatabaseToolsPrivateEndpointRequest);
        DatabaseToolsPrivateEndpoint privateEndpoint = response.getDatabaseToolsPrivateEndpoint();
        System.out.println("Private Endpoint: " + privateEndpoint);
    }

    /**
     * Create a Database Tools connection with:
     * - Compartment Id
     * - Private Endpoint for a Reverse Connection
     * - Connection String extracted from the DB System
     * - Database User
     * - Database Password Stored in a Vault
     * - Time generated display name
     * - Related Resource with a reference to the DBSystem OCID
     * @throws Exception
     */
    private static void createConnection() throws Exception {
        assert dbtoolsConnectionId == null : "Database Tools Connection should not already exists";

        CreateDatabaseToolsConnectionRequest createDatabaseToolsConnectionRequest;
        System.out.println("Creating a database tools connection...");

        //  Get Connection String for VM DB System
        // - List dbHomes in compartment for our dbSystemId
        //   - Take the first
        // - List database in compartment for the dbHome of our DB System
        //   - Take the first one that matches dbHome
        // - List pdbs in database
        //   - Take the first one
        //   - connection string is in PdbDefault of the connection strings.
        String dbHomeId =
                databaseClient
                        .listDbHomes(
                                ListDbHomesRequest.builder()
                                        .compartmentId(compartmentId)
                                        .dbSystemId(dbSystemId)
                                        .build())
                        .getItems()
                        .iterator()
                        .next()
                        .getId();

        String databaseSummaryId =
                databaseClient
                        .listDatabases(
                                ListDatabasesRequest.builder()
                                        .compartmentId(compartmentId)
                                        .dbHomeId(dbHomeId)
                                        .build())
                        .getItems()
                        .iterator()
                        .next()
                        .getId();

        String connectionString =
                databaseClient
                        .listPluggableDatabases(
                                ListPluggableDatabasesRequest.builder()
                                        .databaseId(databaseSummaryId)
                                        .build())
                        .getItems()
                        .iterator()
                        .next()
                        .getConnectionStrings()
                        .getPdbDefault();

        assert connectionString != null : "connectionString should not be null";

        // Related Resource is optional, but will help provide additional information when querying the
        // connection using the OCI Console, the SDKs and the CLI.
        CreateDatabaseToolsRelatedResourceDetails relatedResource =
                CreateDatabaseToolsRelatedResourceDetails.builder()
                        .entityType(RelatedResourceEntityType.Pluggabledatabase)
                        .identifier(dbSystemId)
                        .build();

        String displayName =
                "conn-javasdk-" + now.format(DateTimeFormatter.ofPattern("dd-HH-mm-ss-SSS"));
        createDatabaseToolsConnectionRequest =
                CreateDatabaseToolsConnectionRequest.builder()
                        .createDatabaseToolsConnectionDetails(
                                CreateDatabaseToolsConnectionOracleDatabaseDetails.builder()
                                        .compartmentId(compartmentId)
                                        .connectionString(connectionString)
                                        .privateEndpointId(dbtoolsPrivateEndpointId)
                                        .displayName(displayName)
                                        .userName(dbUser)
                                        .userPassword(
                                                DatabaseToolsUserPasswordSecretIdDetails.builder()
                                                        .secretId(dbPasswordSecretId)
                                                        .build())
                                        .relatedResource(relatedResource)
                                        .build())
                        .build();
        CreateDatabaseToolsConnectionResponse createDatabaseToolsConnectionResponse =
                databaseToolsClient.createDatabaseToolsConnection(
                        createDatabaseToolsConnectionRequest);
        String connectionId =
                createDatabaseToolsConnectionResponse.getDatabaseToolsConnection().getId();

        System.out.println(
                String.format(
                        "===Creating Connection %s using Work request: %s",
                        displayName,
                        createDatabaseToolsConnectionResponse.getOpcWorkRequestId()));

        // We wait for the response.
        waitForDatabaseToolsConnection(connectionId, LifecycleState.Active);

        dbtoolsConnectionId = connectionId;
        System.out.println(String.format("===Connection %s created successfully", connectionId));

        // Read the Connection that we just created
        GetDatabaseToolsConnectionRequest getDatabaseToolsConnectionRequest =
                GetDatabaseToolsConnectionRequest.builder()
                        .databaseToolsConnectionId(dbtoolsConnectionId)
                        .build();

        GetDatabaseToolsConnectionResponse response =
                databaseToolsClient.getDatabaseToolsConnection(getDatabaseToolsConnectionRequest);
        DatabaseToolsConnection connection = response.getDatabaseToolsConnection();
        System.out.println("Connection: " + connection);
    }

    /**
     * Validate a Database Tools Connection.
     * The Validation is similar to the "Test Connection" in SQL Developer.
     * @return true if the Connection is Valid
     */
    private static boolean validateConnection() {
        System.out.println(
                String.format("===Validating Database Tools Connection %s", dbtoolsConnectionId));
        ValidateDatabaseToolsConnectionResponse response =
                databaseToolsClient.validateDatabaseToolsConnection(
                        ValidateDatabaseToolsConnectionRequest.builder()
                                .databaseToolsConnectionId(dbtoolsConnectionId)
                                .validateDatabaseToolsConnectionDetails(
                                        ValidateDatabaseToolsConnectionOracleDatabaseDetails
                                                .builder()
                                                .build())
                                .build());

        System.out.println(
                "validateDatabaseToolsConnection result: "
                        + response.getValidateDatabaseToolsConnectionResult());

        // Validation is only successful if the code is OK
        return ("OK".equals(response.getValidateDatabaseToolsConnectionResult().getCode()));
    }

    /**
     * Delete The database Tools Connection for the specified connectionId
     * @param connectionId
     * @throws Exception
     */
    private static void deleteConnection(String connectionId) throws Exception {

        if (connectionId != null) {
            System.out.println(
                    String.format("Deleting Database Tools Connection %s", connectionId));

            DeleteDatabaseToolsConnectionRequest deleteDatabaseToolsConnectionRequest =
                    DeleteDatabaseToolsConnectionRequest.builder()
                            .databaseToolsConnectionId(connectionId)
                            .build();

            DeleteDatabaseToolsConnectionResponse response =
                    databaseToolsClient.deleteDatabaseToolsConnection(
                            deleteDatabaseToolsConnectionRequest);
            System.out.println(
                    "Deleting Connection using Work request: " + response.getOpcWorkRequestId());

            // We wait for the response.
            waitForDatabaseToolsConnection(connectionId, LifecycleState.Deleted);
            System.out.println(String.format("Connection %s deleted successfully!", connectionId));
        } else {
            System.out.println("deleteConnection skipped");
        }
    }

    /**
     * Delete the Database Tools Private Endpoint for the specified privateEndpointId
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
     * Delete a Secret in a Vault.
     * Note that the secret is not actually deleted immediately, it is scheduled for deletion on a later date.
     * @param secretId The OCID of the Secret to delete
     * @throws Exception
     */
    private static void deleteSecret(String secretId) throws Exception {
        System.out.println("Deleting secret: " + secretId);

        // Schedule Secret deletion
        Date deletionDate =
                Date.from(
                        LocalDate.now()
                                .plusDays(2)
                                .atStartOfDay(ZoneId.systemDefault())
                                .toInstant());
        ScheduleSecretDeletionDetails scheduleSecretDeletionDetails =
                ScheduleSecretDeletionDetails.builder().timeOfDeletion(deletionDate).build();

        ScheduleSecretDeletionRequest scheduleSecretDeletionRequest =
                ScheduleSecretDeletionRequest.builder()
                        .secretId(secretId)
                        .scheduleSecretDeletionDetails(scheduleSecretDeletionDetails)
                        .build();

        ScheduleSecretDeletionResponse response =
                vaultsClient.scheduleSecretDeletion(scheduleSecretDeletionRequest);
        System.out.println("Deleting Secret using OpcRequestId: " + response.getOpcRequestId());

        // We wait for the response.
        waitForSecret(secretId, Secret.LifecycleState.PendingDeletion);
        System.out.println(String.format("Secret %s is Pending Deletion.", secretId));
    }

    /**
     * Delete secrets in a Vault.
     * @param secretIds the list of Secret OCID to delete
     * @throws Exception
     */
    private static void deleteSecrets(List<String> secretIds) throws Exception {
        for (String secretId : secretIds) {
            if (secretId != null) {
                deleteSecret(secretId);
            }
        }
    }

    /**
     * Wait for a specific Connection to get a specific state. Required for asynchronous operation.
     * @param connectionId The OCID of the database Tools Connection
     * @param targetState The LifeCycle state to reach
     * @throws Exception
     */
    private static void waitForDatabaseToolsConnection(
            String connectionId, LifecycleState targetState) throws Exception {
        GetDatabaseToolsConnectionResponse getConnectionResponse = null;

        do {
            if (getConnectionResponse != null) {
                LifecycleState currentState =
                        getConnectionResponse.getDatabaseToolsConnection().getLifecycleState();
                System.out.println(
                        String.format(
                                "Waiting for connection %s to be in state %s. Current state %s",
                                connectionId,
                                targetState,
                                currentState));
                Thread.sleep(10000);
            }
            getConnectionResponse =
                    databaseToolsClient.getDatabaseToolsConnection(
                            GetDatabaseToolsConnectionRequest.builder()
                                    .databaseToolsConnectionId(connectionId)
                                    .build());
            if (getConnectionResponse.getDatabaseToolsConnection().getLifecycleState()
                    == LifecycleState.Failed) {
                throw new RuntimeException(
                        String.format(
                                "Could not set connection %s in state %s",
                                dbtoolsConnectionId,
                                targetState));
            }

        } while (getConnectionResponse.getDatabaseToolsConnection().getLifecycleState()
                != targetState);
    }

    /**
     * Wait for a specific Private Endpoint to get a specific state. Required for asynchronous operation.
     * @param privateEndpointId The OCID of the database Tools Private Endpoint
     * @param targetState The LifeCycle state to reach
     * @throws Exception
     */
    private static void waitForDatabaseToolsPrivateEndpoint(
            String privateEndpointId, LifecycleState targetState) throws Exception {
        GetDatabaseToolsPrivateEndpointResponse getPrivateEndpointResponse = null;

        do {
            if (getPrivateEndpointResponse != null) {
                LifecycleState currentState =
                        getPrivateEndpointResponse
                                .getDatabaseToolsPrivateEndpoint()
                                .getLifecycleState();
                System.out.println(
                        String.format(
                                "Waiting for private endpoint %s to be in state %s. Current state %s",
                                privateEndpointId,
                                targetState,
                                currentState));
                Thread.sleep(10000);
            }
            getPrivateEndpointResponse =
                    databaseToolsClient.getDatabaseToolsPrivateEndpoint(
                            GetDatabaseToolsPrivateEndpointRequest.builder()
                                    .databaseToolsPrivateEndpointId(privateEndpointId)
                                    .build());
            if (getPrivateEndpointResponse.getDatabaseToolsPrivateEndpoint().getLifecycleState()
                    == LifecycleState.Failed) {
                throw new RuntimeException(
                        String.format(
                                "Could not delete private endpoint %s %s",
                                privateEndpointId,
                                targetState));
            }
        } while (getPrivateEndpointResponse.getDatabaseToolsPrivateEndpoint().getLifecycleState()
                != targetState);
    }

    /**
     * Wait for a specific Secret to get a specific state. Required for asynchronous operation.
     * @param secretId The OCID of the Secret in a Vault
     * @param targetState The LifeCycle state to reach
     * @throws Exception
     */
    private static void waitForSecret(String secretId, Secret.LifecycleState targetState)
            throws Exception {
        GetSecretResponse getSecretResponse = null;

        do {
            if (getSecretResponse != null) {
                Secret.LifecycleState currentState =
                        getSecretResponse.getSecret().getLifecycleState();
                System.out.println(
                        String.format(
                                "Waiting for secret %s to be in state %s. Current state %s",
                                secretId,
                                targetState,
                                currentState));
                Thread.sleep(2000);
            }
            getSecretResponse =
                    vaultsClient.getSecret(GetSecretRequest.builder().secretId(secretId).build());
            if (getSecretResponse.getSecret().getLifecycleState() == Secret.LifecycleState.Failed) {
                throw new RuntimeException(
                        "Secret lifecycle state is unexpected "
                                + getSecretResponse.getSecret().getLifecycleState());
            }
        } while (getSecretResponse.getSecret().getLifecycleState() != targetState);
    }
}
