/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package database_tools;

import static com.oracle.bmc.vault.model.Secret.LifecycleState.Active;
import static com.oracle.bmc.vault.model.Secret.LifecycleState.PendingDeletion;

import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.databasetools.DatabaseToolsClient;
import com.oracle.bmc.databasetools.model.CreateDatabaseToolsConnectionGenericJdbcDetails;
import com.oracle.bmc.databasetools.model.DatabaseToolsUserPasswordSecretIdDetails;
import com.oracle.bmc.databasetools.model.RuntimeSupport;
import com.oracle.bmc.databasetools.requests.CreateDatabaseToolsConnectionRequest;
import com.oracle.bmc.databasetools.requests.DeleteDatabaseToolsConnectionRequest;
import com.oracle.bmc.databasetools.responses.CreateDatabaseToolsConnectionResponse;
import com.oracle.bmc.keymanagement.KmsManagementClient;
import com.oracle.bmc.keymanagement.KmsVaultClient;
import com.oracle.bmc.keymanagement.model.Vault;
import com.oracle.bmc.keymanagement.requests.GetVaultRequest;
import com.oracle.bmc.keymanagement.requests.ListKeysRequest;
import com.oracle.bmc.vault.VaultsClient;
import com.oracle.bmc.vault.model.Base64SecretContentDetails;
import com.oracle.bmc.vault.model.CreateSecretDetails;
import com.oracle.bmc.vault.model.ScheduleSecretDeletionDetails;
import com.oracle.bmc.vault.requests.CreateSecretRequest;
import com.oracle.bmc.vault.requests.GetSecretRequest;
import com.oracle.bmc.vault.requests.ScheduleSecretDeletionRequest;
import com.oracle.bmc.vault.responses.CreateSecretResponse;
import com.oracle.bmc.vault.responses.ScheduleSecretDeletionResponse;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Base64;
import java.util.Date;

/**
 * Use Case: Create a Database Tools Generic JDBC type connection.
 *
 * <p><i>Note that this example can easily be adapated to create a Postgresql connection (without
 * runtime support) by using a CreateDatabaseToolsConnectionPostgresqlDetails instance in the
 * connection creation method.</i>
 *
 * <p>This example creates a Database Tools Generic JDBC connection.
 *
 * <p>Prerequisites:
 *
 * <ul>
 *   <li>An existing Vault where the secret will be stored
 *   <li>A previously configured .oci/config file with a [DEFAULT] section should already setup.
 * </ul>
 *
 * <p>High-level Steps:
 *
 * <ul>
 *   <li>Locates the Vault by using the provided OCID
 *   <li>Stores the secret in the Vault
 *   <li>Creates a Database Tools Connection in the provided compartment
 *   <li>Cleanup when done (delete the secret and connection)
 * </ul>
 */
public class DatabaseToolsGenericJdbcConnectionExample {

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new Exception(
                    "This example expects 2 arguments:  "
                            + "A compartment OCID (to save the connection in) and a Vault OCID (to store the secret in)");
        }

        String compartmentId = args[0];
        String vaultId = args[1];

        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(ConfigFileReader.parseDefault());

        try (SecretCreator secretCreator = new SecretCreator(provider, compartmentId, vaultId)) {
            secretCreator.create("generic-jdbc-java-sdk-example", "testpassword");

            try (GenericJdbcConnectionCreator connectionCreator =
                    new GenericJdbcConnectionCreator(provider, compartmentId, vaultId)) {
                connectionCreator.create(
                        "generic-jdbc-connection-java-sdk-example", secretCreator.getSecretId());
            }
        }
    }

    static class GenericJdbcConnectionCreator implements AutoCloseable {
        private final AuthenticationDetailsProvider authenticationDetailsProvider;
        private final DatabaseToolsClient databaseToolsClient;
        private final String compartmentId;
        private final String vaultId;
        String connectionId;

        GenericJdbcConnectionCreator(
                AuthenticationDetailsProvider authenticationDetailsProvider,
                String compartmentId,
                String vaultId) {
            this.authenticationDetailsProvider = authenticationDetailsProvider;
            this.compartmentId = compartmentId;
            this.vaultId = vaultId;
            databaseToolsClient =
                    DatabaseToolsClient.builder().build(authenticationDetailsProvider);
        }

        void create(String connectionDisplayName, String secretId) {
            CreateDatabaseToolsConnectionResponse response =
                    databaseToolsClient.createDatabaseToolsConnection(
                            CreateDatabaseToolsConnectionRequest.builder()
                                    .createDatabaseToolsConnectionDetails(
                                            CreateDatabaseToolsConnectionGenericJdbcDetails
                                                    .builder()
                                                    .compartmentId(compartmentId)
                                                    .displayName(connectionDisplayName)
                                                    .runtimeSupport(RuntimeSupport.Unsupported)
                                                    .url("jdbc:mysql://localhost:3006")
                                                    .userName("admin")
                                                    .userPassword(
                                                            DatabaseToolsUserPasswordSecretIdDetails
                                                                    .builder()
                                                                    .secretId(secretId)
                                                                    .build())
                                                    .build())
                                    .build());

            connectionId = response.getDatabaseToolsConnection().getId();
            System.out.printf("Created connection %s\n", connectionDisplayName);
        }

        @Override
        public void close() throws Exception {
            try {
                databaseToolsClient.deleteDatabaseToolsConnection(
                        DeleteDatabaseToolsConnectionRequest.builder()
                                .databaseToolsConnectionId(connectionId)
                                .build());
                System.out.printf("Deleted connection %s\n", connectionId);
            } catch (Exception e) {
                System.err.printf("The connection couldn't be deleted.\n", connectionId);
                throw e;
            }
        }
    }

    static class SecretCreator implements AutoCloseable {
        private final AuthenticationDetailsProvider authenticationDetailsProvider;
        private final VaultsClient vaultsClient;
        private final String compartmentId;
        private final String vaultId;
        String secretId;

        SecretCreator(
                AuthenticationDetailsProvider authenticationDetailsProvider,
                String compartmentId,
                String vaultId) {
            this.authenticationDetailsProvider = authenticationDetailsProvider;
            this.compartmentId = compartmentId;
            this.vaultId = vaultId;
            vaultsClient = VaultsClient.builder().build(authenticationDetailsProvider);
        }

        String getSecretId() {
            return secretId;
        }

        void create(String secretName, String password) throws Exception {
            KmsVaultClient kmsVaultClient =
                    KmsVaultClient.builder().build(authenticationDetailsProvider);
            Vault vault =
                    kmsVaultClient
                            .getVault(GetVaultRequest.builder().vaultId(vaultId).build())
                            .getVault();
            KmsManagementClient kmsManagementClient =
                    KmsManagementClient.builder().vault(vault).build(authenticationDetailsProvider);
            String vaultKeyId =
                    kmsManagementClient
                            .listKeys(
                                    ListKeysRequest.builder().compartmentId(compartmentId).build())
                            .getItems()
                            .iterator()
                            .next()
                            .getId();

            CreateSecretResponse createSecretResponse =
                    vaultsClient.createSecret(
                            CreateSecretRequest.builder()
                                    .createSecretDetails(
                                            CreateSecretDetails.builder()
                                                    .vaultId(vaultId)
                                                    .keyId(vaultKeyId)
                                                    .compartmentId(compartmentId)
                                                    .secretName(secretName)
                                                    .secretContent(
                                                            Base64SecretContentDetails.builder()
                                                                    .content(
                                                                            Base64.getEncoder()
                                                                                    .encodeToString(
                                                                                            password
                                                                                                    .getBytes(
                                                                                                            StandardCharsets
                                                                                                                    .UTF_8)))
                                                                    .build())
                                                    .build())
                                    .build());

            secretId = createSecretResponse.getSecret().getId();
            System.out.println("Creating secret. Waiting for the state to be Active");
            vaultsClient
                    .getWaiters()
                    .forSecret(GetSecretRequest.builder().secretId(this.secretId).build(), Active)
                    .execute();
            System.out.printf("Created secret '%s'\n", secretName);
        }

        @Override
        public void close() throws Exception {
            try {
                Date deletionDate =
                        Date.from(
                                LocalDate.now()
                                        .plusDays(2)
                                        .atStartOfDay(ZoneId.systemDefault())
                                        .toInstant());
                ScheduleSecretDeletionDetails scheduleSecretDeletionDetails =
                        ScheduleSecretDeletionDetails.builder()
                                .timeOfDeletion(deletionDate)
                                .build();

                ScheduleSecretDeletionResponse response =
                        vaultsClient.scheduleSecretDeletion(
                                ScheduleSecretDeletionRequest.builder()
                                        .secretId(secretId)
                                        .scheduleSecretDeletionDetails(
                                                scheduleSecretDeletionDetails)
                                        .build());

                System.out.println(
                        "Issued secret deletion request. Waiting for the state to be Deleted");
                vaultsClient
                        .getWaiters()
                        .forSecret(
                                GetSecretRequest.builder().secretId(secretId).build(),
                                PendingDeletion)
                        .execute();
                System.out.printf("Secret will be deleted on %s\n", deletionDate.toString());
            } catch (Exception e) {
                System.err.printf("The secret couldn't be deleted\n");
                throw e;
            }
        }
    }
}
