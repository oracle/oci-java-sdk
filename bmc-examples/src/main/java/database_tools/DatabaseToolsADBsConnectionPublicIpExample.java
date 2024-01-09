/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package database_tools;

import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.http.client.Options;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.database.DatabaseClient;
import com.oracle.bmc.database.DatabaseWaiters;
import com.oracle.bmc.database.model.*;
import com.oracle.bmc.database.requests.CreateAutonomousDatabaseRequest;
import com.oracle.bmc.database.requests.DeleteAutonomousDatabaseRequest;
import com.oracle.bmc.database.requests.GenerateAutonomousDatabaseWalletRequest;
import com.oracle.bmc.database.requests.GetAutonomousDatabaseRequest;
import com.oracle.bmc.database.responses.DeleteAutonomousDatabaseResponse;
import com.oracle.bmc.database.responses.GenerateAutonomousDatabaseWalletResponse;
import com.oracle.bmc.database.responses.GetAutonomousDatabaseResponse;
import com.oracle.bmc.databasetools.DatabaseToolsClient;
import com.oracle.bmc.databasetools.DatabaseToolsWaiters;
import com.oracle.bmc.databasetools.model.*;
import com.oracle.bmc.databasetools.requests.*;
import com.oracle.bmc.databasetools.responses.*;
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
import com.oracle.bmc.util.internal.FileUtils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Use Case: ADB-S with Public IP
 *
 * <p>Creates a connection to an Autonomous Databases with Shared Exadata Infrastructure with a
 * Public IP. Note, since this connection will be against a public IP address, a Database Tools
 * Private Endpoint Reverse Connection is not required. However, mTLS is required. This example
 * serves as an academic exercise of the SDK and proof of concept only.
 *
 * <p>Prerequisites: - The ability to create a new ADB-s in a tenancy (automated below) - An
 * existing Vault for storage of secrets - A previously configured .oci/config file with a [DEFAULT]
 * section
 *
 * <p>High-level Steps: 1- Create a new Autonomous Database 2- Create required secrets in the Vault
 * 3- Create a Database Tools connection 4- Validate the connection
 *
 * <p>... cleanup when done (delete the ADB, temporary secrets and connection)
 *
 * <p>Client | | +----------------------+----------+ | V | | +----------------+ | | | Database Tools
 * | | | | Service | | | +----------------+ | | | | | Database | | | Tools | | | VCN | |
 * +----------------------+----------+ | | +--------------+ | | Customer | | | VCN | |
 * +--------------+ | | | +----------------------+----------+ | | | | V | | --------- | | / ABD-S \
 * | | \Public IP/ | | --------- | | | | ADB | | Shared | | VCN |
 * +---------------------------------+
 *
 * <p>Note: We recommend that you activate the java assertion (-ea) when running this example.
 */
public class DatabaseToolsADBsConnectionPublicIpExample {

    private static AuthenticationDetailsProvider provider = null;

    private static String autonomousDatabaseId = null;
    private static String vaultId = null;
    private static String dbName = null;
    private static String dbPassword = null;
    private static String dbUser = null;
    private static String walletSecretName = null;
    private static String passwordSecretName = null;

    private static String dbPasswordSecretId = null;
    private static String dbWalletSecretId = null;
    private static String dbtoolsConnectionId = null;
    private static String compartmentId = null;
    private static String vaultKeyId = null;

    private static DatabaseClient databaseClient = null;
    private static DatabaseToolsClient databaseToolsClient = null;
    private static KmsVaultClient kmsVaultClient = null;
    private static VaultsClient vaultsClient = null;

    private static AutonomousDatabase autonomousDatabase;

    private static LocalDateTime now = LocalDateTime.now();

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     *     <ul>
     *       <li>The OCID of the compartment where the vcn, autonomous database, vault and
     *           connection will reside
     *       <li>The OCID of a Vault created in KMS with at least one master key
     *       <li>The Name of the User in the ADB-S, like admin
     *       <li>The Password of the User in the ADB-S
     *     </ul>
     */
    public static void main(String[] args) throws Exception {
        if (args.length != 4) {
            throw new IllegalArgumentException(
                    "This example expects 4 arguments: "
                            + "1. Compartment OCID "
                            + "2. Vault OCID "
                            + "3. DB User name "
                            + "4. DB Password");
        }

        compartmentId = args[0];
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
            dbName = "DB" + now.format(DateTimeFormatter.ofPattern("yyyyMMddHHmm"));
            walletSecretName =
                    "wallet-password-javasdk-"
                            + now.format(DateTimeFormatter.ofPattern("dd-HH-mm-ss-SSS"));
            passwordSecretName =
                    "db-password-javasdk-"
                            + now.format(DateTimeFormatter.ofPattern("dd-HH-mm-ss-SSS"));

            // Create Java SDK clients
            databaseClient = DatabaseClient.builder().build(provider);
            databaseToolsClient = DatabaseToolsClient.builder().build(provider);
            kmsVaultClient = KmsVaultClient.builder().build(provider);
            vaultsClient = VaultsClient.builder().build(provider);

            // 1- Create a new Autonomous Database
            createADBs();

            // Obtain a SSO Wallet for the ADB-S
            String ssoWallet = getSsoWallet();

            // 2- Create secrets (database wallet and database password) in the Vault
            createSecrets(ssoWallet);

            // 3- Create a Database Tools Connection
            createConnection();

            // 4- Validate that the Connection can be used
            boolean connectionIsValid = validateConnection();
            if (connectionIsValid) {
                System.out.println("=== Connection is Valid\n");
            } else {
                throw new RuntimeException("Connection is not valid");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Clean-up resources
            System.out.println("=== Starting resources clean-up");
            deleteConnection(dbtoolsConnectionId);
            deleteSecrets(Arrays.asList(dbWalletSecretId, dbPasswordSecretId));
            deleteADBs(autonomousDatabaseId);

            System.out.println("=== Processing completed");
        }
    }

    /** Create an Autonomous Databases with Shared Exadata Infrastructure. With a Public IP. */
    private static void createADBs() throws Exception {
        System.out.println(String.format("Creating Database with name %s...", dbName));

        // Provision a new Database
        CreateAutonomousDatabaseBase createAutonomousDatabaseBase =
                CreateAutonomousDatabaseDetails.builder()
                        .adminPassword(dbPassword)
                        .compartmentId(compartmentId)
                        .dbName(dbName)
                        .displayName(dbName)
                        .dbWorkload(CreateAutonomousDatabaseBase.DbWorkload.Oltp)
                        .cpuCoreCount(1)
                        .dataStorageSizeInTBs(1)
                        .whitelistedIps(new ArrayList<>(Arrays.asList("0.0.0.0/0")))
                        .build();

        CreateAutonomousDatabaseRequest createAutonomousDatabaseRequest =
                CreateAutonomousDatabaseRequest.builder()
                        .createAutonomousDatabaseDetails(createAutonomousDatabaseBase)
                        .build();

        autonomousDatabase =
                databaseClient
                        .createAutonomousDatabase(createAutonomousDatabaseRequest)
                        .getAutonomousDatabase();
        String dbId = autonomousDatabase.getId();

        // Wait for the ADB-S to be in state Available
        waitForADBsInstance(dbId, AutonomousDatabase.LifecycleState.Available);
        autonomousDatabaseId = dbId;
        System.out.println(
                String.format(
                        "Created Database with name %s and OCID %s", dbName, autonomousDatabaseId));
    }

    /** Obtain a SSO Wallet for the ADB-S. */
    private static String getSsoWallet() {
        System.out.println(String.format("Getting Database %s info...", autonomousDatabaseId));
        GetAutonomousDatabaseResponse response =
                databaseClient.getAutonomousDatabase(
                        GetAutonomousDatabaseRequest.builder()
                                .autonomousDatabaseId(autonomousDatabaseId)
                                .build());
        autonomousDatabase = response.getAutonomousDatabase();
        System.out.println("Database private Endpoint: " + autonomousDatabase.getPrivateEndpoint());
        System.out.println(
                "Database private Endpoint IP address: "
                        + autonomousDatabase.getPrivateEndpointIp());
        System.out.println("Database compartment Id: " + autonomousDatabase.getCompartmentId());

        // We will use the db compartment for all operations
        compartmentId = autonomousDatabase.getCompartmentId();
        assert compartmentId != null : "createSecret. Compartment Id must not be null";

        System.out.println(String.format("Getting Database %s wallet...", autonomousDatabaseId));
        Options.shouldAutoCloseResponseInputStream(false);
        GenerateAutonomousDatabaseWalletResponse walletResponse =
                databaseClient.generateAutonomousDatabaseWallet(
                        GenerateAutonomousDatabaseWalletRequest.builder()
                                .autonomousDatabaseId(autonomousDatabaseId)
                                .generateAutonomousDatabaseWalletDetails(
                                        GenerateAutonomousDatabaseWalletDetails.builder()
                                                .password(dbPassword) // Should use a different
                                                // password
                                                .build())
                                .build());

        // Extract the file from the wallet zip in memory
        ByteArrayOutputStream ssoWalletStream =
                getFileFromZip(walletResponse.getInputStream(), "cwallet.sso");

        return Base64.getEncoder().encodeToString(ssoWalletStream.toByteArray());
    }

    /**
     * Create a secret in a Vault
     *
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
                            vaultId, vault.getManagementEndpoint()));
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

        // Create secret
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
     *
     * @param wallet wallet to Store in base64 string format
     * @throws Exception
     */
    private static void createSecrets(String wallet) throws Exception {
        // Create db wallet secret in vault
        System.out.println(String.format("Storing db wallet in the vault..."));
        dbWalletSecretId = createSecret(walletSecretName, wallet);

        // Create db password secret in vault
        System.out.println(String.format("Storing db password in the vault..."));
        dbPasswordSecretId =
                createSecret(
                        passwordSecretName,
                        Base64.getEncoder()
                                .encodeToString(dbPassword.getBytes(StandardCharsets.UTF_8)));
    }

    /**
     * Get a specific file from a Zip file
     *
     * @param inputStream Stream that contains the zip file.
     * @param fileName Name of the file to extract from the zip file
     * @return a ByteArrayOutputStream for the specified fileName
     */
    private static ByteArrayOutputStream getFileFromZip(InputStream inputStream, String fileName) {
        ByteArrayOutputStream fileOut = null;
        try (ZipInputStream zis = new ZipInputStream(inputStream)) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                if (entry.getName().equals(fileName)) {
                    fileOut = new ByteArrayOutputStream();
                    FileUtils.copy(zis, fileOut);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (fileOut == null) {
            throw new RuntimeException(String.format("%s was not found in zip file!", fileName));
        }
        return fileOut;
    }

    /**
     * Create a Database Tools connection with: - ADB-S Compartment - Connection String extracted
     * from the ADB-S - Database User - Database Password Stored in a Vault - Time generated display
     * name - keyStore for the SSO Wallet extracted from the ADB-S and Stored in a Vault - Related
     * Resource with a reference to the ADB-S OCID
     *
     * @throws Exception
     */
    private static void createConnection() throws Exception {
        assert dbtoolsConnectionId == null : "Database Tools Connection should not already exists";

        CreateDatabaseToolsConnectionRequest createDatabaseToolsConnectionRequest;
        System.out.println("Creating a database tools connection...");
        // Get the mTls low connection string
        String connectionString =
                autonomousDatabase.getConnectionStrings().getProfiles().stream()
                        .filter(
                                p ->
                                        p.getTlsAuthentication()
                                                        .equals(
                                                                DatabaseConnectionStringProfile
                                                                        .TlsAuthentication.Mutual)
                                                && p.getConsumerGroup()
                                                        .equals(
                                                                DatabaseConnectionStringProfile
                                                                        .ConsumerGroup.Low))
                        .collect(Collectors.toList())
                        .iterator()
                        .next()
                        .getValue();

        List<DatabaseToolsKeyStoreDetails> keyStores =
                Collections.singletonList(
                        DatabaseToolsKeyStoreDetails.builder()
                                .keyStoreType(KeyStoreType.Sso)
                                .keyStoreContent(
                                        DatabaseToolsKeyStoreContentSecretIdDetails.builder()
                                                .secretId(dbWalletSecretId)
                                                .build())
                                .build());

        // Related Resource is optional, but will help provide additional information when querying
        // the
        // connection using the OCI Console, the SDKs and the CLI.
        CreateDatabaseToolsRelatedResourceDetails relatedResource =
                CreateDatabaseToolsRelatedResourceDetails.builder()
                        .entityType(RelatedResourceEntityType.Autonomousdatabase)
                        .identifier(autonomousDatabaseId)
                        .build();

        String displayName =
                "conn-javasdk-" + now.format(DateTimeFormatter.ofPattern("dd-HH-mm-ss-SSS"));
        createDatabaseToolsConnectionRequest =
                CreateDatabaseToolsConnectionRequest.builder()
                        .createDatabaseToolsConnectionDetails(
                                CreateDatabaseToolsConnectionOracleDatabaseDetails.builder()
                                        .compartmentId(compartmentId)
                                        .connectionString(connectionString)
                                        .displayName(displayName)
                                        .userName(dbUser)
                                        .userPassword(
                                                DatabaseToolsUserPasswordSecretIdDetails.builder()
                                                        .secretId(dbPasswordSecretId)
                                                        .build())
                                        .keyStores(keyStores)
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
                        "=== Creating Connection %s using Work request: %s",
                        displayName, createDatabaseToolsConnectionResponse.getOpcWorkRequestId()));

        // We wait for the response.
        waitForDatabaseToolsConnection(connectionId, LifecycleState.Active);

        dbtoolsConnectionId = connectionId;
        System.out.println(String.format("=== Connection %s created successfully", connectionId));

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
     *
     * @param connectionId The OCID of the Database Tools to delete
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
     * Delete a Secret in a Vault. Note that the secret is not actually deleted immediately, it is
     * scheduled for deletion on a later date.
     *
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
     *
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
     * Delete an Autonomous Database. Beware, this actually DELETES the specified DB
     *
     * @param autonomousDatabaseId Autonomous Database Id
     * @throws Exception
     */
    private static void deleteADBs(String autonomousDatabaseId) throws Exception {
        if (autonomousDatabaseId != null) {
            System.out.println(
                    String.format(
                            "Terminating Database with name %s and OCID %s",
                            dbName, autonomousDatabaseId));

            DeleteAutonomousDatabaseRequest deleteAutonomousDatabaseRequest =
                    DeleteAutonomousDatabaseRequest.builder()
                            .autonomousDatabaseId(autonomousDatabaseId)
                            .build();

            DeleteAutonomousDatabaseResponse response =
                    databaseClient.deleteAutonomousDatabase(deleteAutonomousDatabaseRequest);
            assert response != null : "deleteADBs. response should not be null";

            // Wait for the ADB-S to be state Terminated
            waitForADBsInstance(autonomousDatabaseId, AutonomousDatabase.LifecycleState.Terminated);
            System.out.println(
                    String.format(
                            "Terminated Database with name %s and OCID %s",
                            dbName, autonomousDatabaseId));
        } else {
            System.out.println("deleteADBs skipped");
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
     * Wait for an Autonomous database to get a specific state. Required for asynchronous operation.
     *
     * @param dbId Autonomous database Id
     * @param targetState The LifeCycle state to reach
     * @throws Exception
     */
    private static void waitForADBsInstance(
            String dbId, AutonomousDatabase.LifecycleState targetState) throws Exception {
        System.out.println(
                String.format("=== Waiting for ADB %s to match state -> %s", dbId, targetState));
        DatabaseWaiters waiter = databaseClient.getWaiters();
        waiter.forAutonomousDatabase(
                        GetAutonomousDatabaseRequest.builder().autonomousDatabaseId(dbId).build(),
                        targetState)
                .execute();
        System.out.println("=== Done waiting");
    }
}
