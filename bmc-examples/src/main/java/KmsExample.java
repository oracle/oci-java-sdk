/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.io.internal.WrappedFileInputStream;
import com.oracle.bmc.keymanagement.KmsCryptoClient;
import com.oracle.bmc.keymanagement.KmsManagementClient;
import com.oracle.bmc.keymanagement.KmsVaultClient;
import com.oracle.bmc.keymanagement.model.*;
import com.oracle.bmc.keymanagement.requests.*;
import com.oracle.bmc.keymanagement.responses.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * This class contains examples which cover basic KMS usage.
 *
 * These examples assume you already have a Vault in ACTIVE state. If you need to create a new Vault, please
 * refer to the createVaultTest method in this class. Please keep in mind that KMS does not support immediate
 * deletion of Vaults because of the high risk; instead, you need to schedule the deletion of a Vault and a
 * retention period of 7-30 days will be enforced before the Vault is deleted. During the retention period, you
 * can cancel the deletion and the Vault will be ACTIVE again. Be careful before creating a Vault to avoid
 * unnecessary expenses.
 */
public class KmsExample {

    private static final int DEFAULT_KEY_LENGTH = 32;

    // The KeyShape used for testing
    private static final KeyShape TEST_KEY_SHAPE =
            KeyShape.builder().algorithm(KeyShape.Algorithm.Aes).length(DEFAULT_KEY_LENGTH).build();

    // Please pass in the compartmentId and the vaultId as the first and second argument
    public static void main(final String[] args) throws Exception {

        if (args.length != 3) {
            throw new IllegalArgumentException(
                    "This example expects 3 arguments: compartment ID, vault ID and target compartment ID (for move example)");
        }

        // Read in compartmentId and vaultId and perform basic validations.
        final String compartmentId = args[0];
        final String vaultId = args[1];
        final String targetCompartmentForMove = args[2];

        if (StringUtils.isBlank(compartmentId)
                || StringUtils.isBlank(vaultId)
                || StringUtils.isBlank(targetCompartmentForMove)) {
            System.out.println(
                    "compartmentId, vaultId and targetCompartmentForMove cannot be empty or null");
            return;
        }

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed.
        final String configurationFilePath = "~/.oci/config";
        final String profile = "DEFAULT";

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(configurationFilePath, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        // Initialize the KMS Clients. KMS has three clients as following:
        //      * KmsVaultClient: The client for Vault management
        //      * KmsManagementClient: The client for Key management (ControlPlane)
        //      * KmsCryptoClient: The client for data encryption and decryption (DataPlane)
        KmsVaultClient kmsVaultClient = new KmsVaultClient(provider);

        // Using the us-ashburn-1 in this example, choose a different region if needed
        kmsVaultClient.setRegion(Region.US_ASHBURN_1);

        KmsManagementClient kmsManagementClient = new KmsManagementClient(provider);
        KmsCryptoClient kmsCryptoClient = new KmsCryptoClient(provider);

        // Get the details of the given Vault
        Vault vault = getVaultTest(kmsVaultClient, vaultId);

        // The ManagementClient and CryptoClient use Vault specific endpoints; Set them now.
        kmsManagementClient.setEndpoint(vault.getManagementEndpoint());
        kmsCryptoClient.setEndpoint(vault.getCryptoEndpoint());
        System.out.println();

        // Vault Operations
        updateVaultResetTagsTest(kmsVaultClient, vault.getId());
        updateVaultTest(kmsVaultClient, vault.getId());
        listVaultsTest(kmsVaultClient, compartmentId);
        scheduleVaultDeletionTest(kmsVaultClient, vault.getId());
        // After scheduling deletion, the Vault will stay in SCHEDULING_DELETION state shortly and then
        // transit to PENDING_DELETION state. Wait a bit for the transition to happen.
        System.out.println("Wait a bit for the vault deletion scheduling to finish");
        System.out.println();
        kmsVaultClient
                .getWaiters()
                .forVault(
                        GetVaultRequest.builder().vaultId(vault.getId()).build(),
                        Vault.LifecycleState.PendingDeletion)
                .execute();

        cancelVaultDeletionTest(kmsVaultClient, vault.getId());
        // After cancelling deletion, the Vault will stay in CANCELLING_DELETION state shortly and then
        // transit to ACTIVE state. Wait a bit for the transition to happen.
        System.out.println("Wait a bit for the vault deletion cancelling to finish");
        System.out.println();
        kmsVaultClient
                .getWaiters()
                .forVault(
                        GetVaultRequest.builder().vaultId(vault.getId()).build(),
                        Vault.LifecycleState.Active)
                .execute();

        backupVaultTest(kmsVaultClient, vault.getId());
        // After backing up, the Vault will stay in BACKUP_IN_PROGRESS state shortly and then
        // transit to ACTIVE state. Wait a bit for the transition to happen.
        System.out.println("Wait a bit for the vault to be backed up");
        System.out.println();
        kmsVaultClient
                .getWaiters()
                .forVault(
                        GetVaultRequest.builder().vaultId(vault.getId()).build(),
                        Vault.LifecycleState.Active)
                .execute();

        restoreVaultFromObjectStoreTest(kmsVaultClient, compartmentId);
        // After backing up, the Vault will stay in RESTORING state shortly and then
        // transit to ACTIVE state. Wait a bit for the transition to happen.
        System.out.println("Wait a bit for the vault to be restored from object store");
        System.out.println();
        kmsVaultClient
                .getWaiters()
                .forVault(
                        GetVaultRequest.builder().vaultId(vault.getId()).build(),
                        Vault.LifecycleState.Active)
                .execute();

        restoreVaultFromFileTest(kmsVaultClient, compartmentId);
        // After restoring, the Vault will stay in RESTORING state shortly and then
        // transit to ACTIVE state. Wait a bit for the transition to happen.
        System.out.println("Wait a bit for the vault to be restored from a local file");
        System.out.println();
        kmsVaultClient
                .getWaiters()
                .forVault(
                        GetVaultRequest.builder().vaultId(vaultId).build(),
                        Vault.LifecycleState.Active)
                .execute();

        // Management / Key Operations
        String keyId = createKeyTest(kmsManagementClient, compartmentId);
        // After creating a Key, the Key will stay in CREATING state shortly and then
        // transit to ENABLED state. Wait a bit for the transition to happen.
        System.out.println("Wait a bit for key creation to finish");
        System.out.println();
        kmsManagementClient
                .getWaiters()
                .forKey(GetKeyRequest.builder().keyId(keyId).build(), Key.LifecycleState.Enabled)
                .execute();

        getKeyTest(kmsManagementClient, keyId);
        updateKeyResetTagsTest(kmsManagementClient, keyId);
        kmsManagementClient
                .getWaiters()
                .forKey(GetKeyRequest.builder().keyId(keyId).build(), Key.LifecycleState.Enabled)
                .execute();

        updateKeyTest(kmsManagementClient, keyId);
        kmsManagementClient
                .getWaiters()
                .forKey(GetKeyRequest.builder().keyId(keyId).build(), Key.LifecycleState.Enabled)
                .execute();

        listKeysTest(kmsManagementClient, compartmentId);
        disableKeyTest(kmsManagementClient, keyId);
        // After disabling a Key, the Key will stay in DISABLING state shortly and then
        // transit to DISABLED state. Wait a bit for the transition to happen.
        System.out.println("Wait a bit for key disabling to finish");
        System.out.println();
        kmsManagementClient
                .getWaiters()
                .forKey(GetKeyRequest.builder().keyId(keyId).build(), Key.LifecycleState.Disabled)
                .execute();

        enableKeyTest(kmsManagementClient, keyId);
        // After enabling a Key, the Key will stay in ENABLING state shortly and then
        // transit to ENABLED state. Wait a bit for the transition to happen.
        System.out.println("Wait a bit for key enabling to finish");
        System.out.println();
        kmsManagementClient
                .getWaiters()
                .forKey(GetKeyRequest.builder().keyId(keyId).build(), Key.LifecycleState.Enabled)
                .execute();

        scheduleKeyDeletionTest(kmsManagementClient, keyId);
        // After scheduling deletion, the Key will stay in SCHEDULING_DELETION state shortly and then
        // transit to PENDING_DELETION state. Wait a bit for the transition to happen.
        System.out.println("Wait a bit for the key deletion scheduling to finish");
        System.out.println();
        kmsManagementClient
                .getWaiters()
                .forKey(
                        GetKeyRequest.builder().keyId(keyId).build(),
                        Key.LifecycleState.PendingDeletion)
                .execute();

        cancelKeyDeletionTest(kmsManagementClient, keyId);
        // After cancelling deletion, the Key will stay in CANCELLING_DELETION state shortly and then
        // transit to Enabled state. Wait a bit for the transition to happen.
        System.out.println("Wait a bit for the key deletion cancelling to finish");
        System.out.println();
        kmsManagementClient
                .getWaiters()
                .forKey(GetKeyRequest.builder().keyId(keyId).build(), Key.LifecycleState.Enabled)
                .execute();

        createKeyVersionTest(kmsManagementClient, keyId);
        listKeyVersionsTest(kmsManagementClient, keyId);

        // Crypto Operations
        String ciphertext = encryptTest(kmsCryptoClient, keyId);
        decryptTest(kmsCryptoClient, keyId, ciphertext);
        generateDataEncryptionKeyTest(kmsCryptoClient, keyId);
        kmsManagementClient
                .getWaiters()
                .forKey(GetKeyRequest.builder().keyId(keyId).build(), Key.LifecycleState.Enabled)
                .execute();

        // Backup + Restore Operations
        backupKeyTest(kmsManagementClient, keyId);
        // After backing up, the Key will stay in BACKUP_IN_PROGRESS state shortly and then
        // transit to ENABLED state. Wait a bit for the transition to happen.
        System.out.println("Wait a bit for the key to be backed up");
        System.out.println();
        kmsManagementClient
                .getWaiters()
                .forKey(GetKeyRequest.builder().keyId(keyId).build(), Key.LifecycleState.Enabled)
                .execute();

        restoreKeyFromObjectStoreTest(kmsManagementClient);
        // After restoring, the Key will stay in RESTORING state shortly and then
        // transit to ENABLED state. Wait a bit for the transition to happen.
        System.out.println("Wait a bit for the key to be restored from object store");
        System.out.println();
        kmsManagementClient
                .getWaiters()
                .forKey(GetKeyRequest.builder().keyId(keyId).build(), Key.LifecycleState.Enabled)
                .execute();
        kmsVaultClient
                .getWaiters()
                .forVault(
                        GetVaultRequest.builder().vaultId(vaultId).build(),
                        Vault.LifecycleState.Active)
                .execute();
        Thread.sleep(30000); // wait to avoid throttling

        restoreKeyFromFileTest(kmsManagementClient);
        // After restoring, the Key will stay in RESTORING state shortly and then
        // transit to ENABLED state. Wait a bit for the transition to happen.
        System.out.println("Wait a bit for the key to be restored from a local file");
        System.out.println();
        kmsManagementClient
                .getWaiters()
                .forKey(GetKeyRequest.builder().keyId(keyId).build(), Key.LifecycleState.Enabled)
                .execute();
        kmsVaultClient
                .getWaiters()
                .forVault(
                        GetVaultRequest.builder().vaultId(vaultId).build(),
                        Vault.LifecycleState.Active)
                .execute();
        Thread.sleep(30000); // wait to avoid throttling

        // change compartment operations
        changeKeyCompartmentTest(kmsManagementClient, keyId, targetCompartmentForMove);
        System.out.println("Wait a bit for key move to finish");
        System.out.println();
        kmsManagementClient
                .getWaiters()
                .forKey(GetKeyRequest.builder().keyId(keyId).build(), Key.LifecycleState.Enabled)
                .execute();

        changeVaultCompartmentTest(kmsVaultClient, vaultId, targetCompartmentForMove);
        System.out.println("Wait a bit for vault move to finish");
        System.out.println();
        kmsManagementClient
                .getWaiters()
                .forKey(GetKeyRequest.builder().keyId(keyId).build(), Key.LifecycleState.Enabled)
                .execute();
    }

    public static Vault createVaultTest(KmsVaultClient kmsVaultClient, String compartmentId) {
        System.out.println("CreateVault Test");
        CreateVaultDetails createVaultDetails =
                CreateVaultDetails.builder()
                        .compartmentId(compartmentId)
                        .displayName("Test-Vault-V1")
                        .vaultType(CreateVaultDetails.VaultType.VirtualPrivate)
                        .freeformTags(getSampleFreeformTagData())
                        .build();

        CreateVaultRequest request =
                CreateVaultRequest.builder().createVaultDetails(createVaultDetails).build();

        CreateVaultResponse response = kmsVaultClient.createVault(request);
        System.out.println("Creating a new vault: ");
        System.out.println(response.getVault());
        System.out.println();
        return response.getVault();
    }

    public static Vault getVaultTest(KmsVaultClient kmsVaultClient, String vaultId) {
        System.out.println("GetVault Test");
        GetVaultRequest getVaultRequest = GetVaultRequest.builder().vaultId(vaultId).build();
        GetVaultResponse response = kmsVaultClient.getVault(getVaultRequest);
        System.out.println("Vault retrieved: ");
        System.out.println(response.getVault());
        System.out.println();
        return response.getVault();
    }

    public static void listVaultsTest(KmsVaultClient kmsVaultClient, String compartmentId) {
        System.out.println("ListVaults Test");
        ListVaultsRequest listVaultsRequest =
                ListVaultsRequest.builder().compartmentId(compartmentId).build();
        ListVaultsResponse response = kmsVaultClient.listVaults(listVaultsRequest);

        System.out.println("ListVaults response: ");
        for (VaultSummary vault : response.getItems()) {
            System.out.println(vault);
        }
        System.out.println();
    }

    public static void updateVaultResetTagsTest(KmsVaultClient kmsVaultClient, String vaultId) {
        System.out.println("UpdateVaultResetTags Test");
        Map<String, String> newEmptyFreeformTag = Collections.emptyMap();

        UpdateVaultDetails updateVaultDetails =
                UpdateVaultDetails.builder().freeformTags(newEmptyFreeformTag).build();
        UpdateVaultRequest updateVaultRequest =
                UpdateVaultRequest.builder()
                        .updateVaultDetails(updateVaultDetails)
                        .vaultId(vaultId)
                        .build();
        UpdateVaultResponse response = kmsVaultClient.updateVault(updateVaultRequest);
        System.out.println("Updated vault: ");
        System.out.println(response.getVault());
        System.out.println();
    }

    public static void updateVaultTest(KmsVaultClient kmsVaultClient, String vaultId) {
        System.out.println("UpdateVault Test");
        Map<String, String> newFreeformTag = getSampleFreeformTagData();
        newFreeformTag.put("dummyfreeformkey3", "dummyfreeformvalue3");

        UpdateVaultDetails updateVaultDetails =
                UpdateVaultDetails.builder()
                        .displayName("Test-Vault-V2")
                        .freeformTags(newFreeformTag)
                        .build();
        UpdateVaultRequest updateVaultRequest =
                UpdateVaultRequest.builder()
                        .updateVaultDetails(updateVaultDetails)
                        .vaultId(vaultId)
                        .build();
        UpdateVaultResponse response = kmsVaultClient.updateVault(updateVaultRequest);
        System.out.println("Updated vault: ");
        System.out.println(response.getVault());
        System.out.println();
    }

    public static void scheduleVaultDeletionTest(KmsVaultClient kmsVaultClient, String vaultId) {
        System.out.println("ScheduleVaultDeletion Test");
        ScheduleVaultDeletionDetails scheduleVaultDeletionDetails =
                ScheduleVaultDeletionDetails.builder().timeOfDeletion(null).build();
        ScheduleVaultDeletionRequest scheduleVaultDeletionRequest =
                ScheduleVaultDeletionRequest.builder()
                        .scheduleVaultDeletionDetails(scheduleVaultDeletionDetails)
                        .vaultId(vaultId)
                        .build();
        ScheduleVaultDeletionResponse response =
                kmsVaultClient.scheduleVaultDeletion(scheduleVaultDeletionRequest);
        System.out.println("Scheduling deletion, updated vault: ");
        System.out.println(response.getVault());
        System.out.println();
    }

    public static void cancelVaultDeletionTest(KmsVaultClient kmsVaultClient, String vaultId) {
        System.out.println("CancelVaultDeletion Test");
        CancelVaultDeletionRequest cancelVaultDeletionRequest =
                CancelVaultDeletionRequest.builder().vaultId(vaultId).build();
        CancelVaultDeletionResponse response =
                kmsVaultClient.cancelVaultDeletion(cancelVaultDeletionRequest);
        System.out.println("Cancelling deletion, updated vault: ");
        System.out.println(response.getVault());
        System.out.println();
    }

    public static void backupVaultTest(KmsVaultClient kmsVaultClient, String vaultId) {
        System.out.println("BackupVault Test");
        BackupVaultRequest backupVaultRequest =
                BackupVaultRequest.builder()
                        .backupVaultDetails(
                                BackupVaultDetails.builder()
                                        .backupLocation(
                                                BackupLocationBucket.builder()
                                                        .bucketName("JavaSdkExamples")
                                                        .objectName("BackupVaultSdkTest")
                                                        .namespace("kmstest")
                                                        .build())
                                        .isIncludeKeys(true)
                                        .build())
                        .vaultId(vaultId)
                        .build();
        BackupVaultResponse response = kmsVaultClient.backupVault(backupVaultRequest);
        System.out.println("Backing up vault, updated vault: ");
        System.out.println(response.getVault());
        System.out.println();
    }

    public static void restoreVaultFromObjectStoreTest(
            KmsVaultClient kmsVaultClient, String compartmentId) {
        System.out.println("RestoreVaultFromObjectStore Test");
        RestoreVaultFromObjectStoreRequest restoreVaultFromObjectStoreRequest =
                RestoreVaultFromObjectStoreRequest.builder()
                        .restoreVaultFromObjectStoreDetails(
                                RestoreVaultFromObjectStoreDetails.builder()
                                        .backupLocation(
                                                BackupLocationBucket.builder()
                                                        .bucketName("JavaSdkExamples")
                                                        .objectName("BackupVaultSdkTest")
                                                        .namespace("kmstest")
                                                        .build())
                                        .build())
                        .compartmentId(compartmentId)
                        .build();
        RestoreVaultFromObjectStoreResponse response =
                kmsVaultClient.restoreVaultFromObjectStore(restoreVaultFromObjectStoreRequest);
        System.out.println("Restoring vault from object store, updated vault: ");
        System.out.println(response.getVault());
        System.out.println();
    }

    public static void restoreVaultFromFileTest(
            KmsVaultClient kmsVaultClient, String compartmentId) {
        System.out.println("RestoreVaultFromFile Test");

        // please take a second and download backup to a local file before proceeding
        String backupFile = "/tmp/BackupVaultSdkTest";

        try (WrappedFileInputStream fileInputStream =
                new WrappedFileInputStream(new File(backupFile))) {
            RestoreVaultFromFileRequest request =
                    RestoreVaultFromFileRequest.builder()
                            .compartmentId(compartmentId)
                            .restoreVaultFromFileDetails(fileInputStream)
                            .build();
            RestoreVaultFromFileResponse response = kmsVaultClient.restoreVaultFromFile(request);
            System.out.println("Restoring vault from local file, updated vault: ");
            System.out.println(response.getVault());
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }

    public static String createKeyTest(
            KmsManagementClient kmsManagementClient, String compartmentId) {
        System.out.println("CreateKey Test");
        CreateKeyDetails createKeyDetails =
                CreateKeyDetails.builder()
                        .keyShape(TEST_KEY_SHAPE)
                        .compartmentId(compartmentId)
                        .displayName("Test_Key_V1")
                        .freeformTags(getSampleFreeformTagData())
                        .build();
        CreateKeyRequest createKeyRequest =
                CreateKeyRequest.builder().createKeyDetails(createKeyDetails).build();
        CreateKeyResponse response = kmsManagementClient.createKey(createKeyRequest);
        System.out.println("Creating a new key: ");
        System.out.println(response.getKey());
        System.out.println();
        return response.getKey().getId();
    }

    public static void getKeyTest(KmsManagementClient kmsManagementClient, String keyId) {
        System.out.println("GetKey Test");
        GetKeyRequest getKeyRequest = GetKeyRequest.builder().keyId(keyId).build();
        GetKeyResponse response = kmsManagementClient.getKey(getKeyRequest);
        System.out.println("Key retrieved: ");
        System.out.println(response.getKey());
        System.out.println();
    }

    public static void listKeysTest(KmsManagementClient kmsManagementClient, String compartmentId) {
        System.out.println("ListKeys Test");
        ListKeysRequest listKeysRequest =
                ListKeysRequest.builder().compartmentId(compartmentId).build();
        ListKeysResponse response = kmsManagementClient.listKeys(listKeysRequest);

        System.out.println("ListKeys response: ");
        for (KeySummary key : response.getItems()) {
            System.out.println(key);
        }
        System.out.println();
    }

    public static void updateKeyResetTagsTest(
            KmsManagementClient kmsManagementClient, String keyId) {
        System.out.println("UpdateKeyResetTags Test");
        Map<String, String> newEmptyFreeformTag = Collections.emptyMap();

        UpdateKeyDetails updateKeyDetails =
                UpdateKeyDetails.builder()
                        .displayName("Test_Key_V2")
                        .freeformTags(newEmptyFreeformTag)
                        .build();
        UpdateKeyRequest updateKeyRequest =
                UpdateKeyRequest.builder().updateKeyDetails(updateKeyDetails).keyId(keyId).build();
        UpdateKeyResponse response = kmsManagementClient.updateKey(updateKeyRequest);
        System.out.println("Updated key: ");
        System.out.println(response.getKey());
        System.out.println();
    }

    public static void updateKeyTest(KmsManagementClient kmsManagementClient, String keyId) {
        System.out.println("UpdateKey Test");
        Map<String, String> newFreeformTag = getSampleFreeformTagData();
        newFreeformTag.put("dummyfreeformkey3", "dummyfreeformvalue3");
        UpdateKeyDetails updateKeyDetails =
                UpdateKeyDetails.builder()
                        .displayName("Test_Key_V3")
                        .freeformTags(newFreeformTag)
                        .build();
        UpdateKeyRequest updateKeyRequest =
                UpdateKeyRequest.builder().updateKeyDetails(updateKeyDetails).keyId(keyId).build();
        UpdateKeyResponse response = kmsManagementClient.updateKey(updateKeyRequest);
        System.out.println("Updated key: ");
        System.out.println(response.getKey());
        System.out.println();
    }

    public static void disableKeyTest(KmsManagementClient kmsManagementClient, String keyId) {
        System.out.println("DisableKey Test");
        DisableKeyRequest disableKeyRequest = DisableKeyRequest.builder().keyId(keyId).build();
        DisableKeyResponse response = kmsManagementClient.disableKey(disableKeyRequest);
        System.out.println("Disabling key, updated key: ");
        System.out.println(response.getKey());
        System.out.println();
    }

    public static void enableKeyTest(KmsManagementClient kmsManagementClient, String keyId) {
        System.out.println("EnableKey Test");
        EnableKeyRequest enableKeyRequest = EnableKeyRequest.builder().keyId(keyId).build();
        EnableKeyResponse response = kmsManagementClient.enableKey(enableKeyRequest);
        System.out.println("Enabling key, updated key: ");
        System.out.println(response.getKey());
        System.out.println();
    }

    public static void cancelKeyDeletionTest(
            KmsManagementClient kmsManagementClient, String keyId) {
        System.out.println("CancelKeyDeletion Test");
        CancelKeyDeletionRequest cancelKeyDeletionRequest =
                CancelKeyDeletionRequest.builder().keyId(keyId).build();
        CancelKeyDeletionResponse response =
                kmsManagementClient.cancelKeyDeletion(cancelKeyDeletionRequest);
        System.out.println("Cancelling key deletion, updated key: ");
        System.out.println(response.getKey());
        System.out.println();
    }

    public static void scheduleKeyDeletionTest(
            KmsManagementClient kmsManagementClient, String keyId) {
        System.out.println("ScheduleKeyDeletion Test");
        ScheduleKeyDeletionDetails scheduleKeyDeletionDetails =
                ScheduleKeyDeletionDetails.builder().timeOfDeletion(null).build();
        ScheduleKeyDeletionRequest scheduleKeyDeletionRequest =
                ScheduleKeyDeletionRequest.builder()
                        .keyId(keyId)
                        .scheduleKeyDeletionDetails(scheduleKeyDeletionDetails)
                        .build();
        ScheduleKeyDeletionResponse response =
                kmsManagementClient.scheduleKeyDeletion(scheduleKeyDeletionRequest);
        System.out.println("Scheduling key deletion, updated key: ");
        System.out.println(response.getKey());
        System.out.println();
    }

    public static void createKeyVersionTest(KmsManagementClient kmsManagementClient, String keyId) {
        System.out.println("CreateKeyVersion Test");
        CreateKeyVersionRequest createKeyVersionRequest =
                CreateKeyVersionRequest.builder().keyId(keyId).build();
        CreateKeyVersionResponse response =
                kmsManagementClient.createKeyVersion(createKeyVersionRequest);
        System.out.println("Creating a new key version: ");
        System.out.println(response.getKeyVersion());
        System.out.println();
    }

    public static void listKeyVersionsTest(KmsManagementClient kmsManagementClient, String keyId) {
        System.out.println("ListKeyVersions Test");
        ListKeyVersionsRequest listKeyVersionsRequest =
                ListKeyVersionsRequest.builder().keyId(keyId).build();
        ListKeyVersionsResponse response =
                kmsManagementClient.listKeyVersions(listKeyVersionsRequest);
        System.out.println("ListKeyVersions response: ");
        for (KeyVersionSummary keyVersion : response.getItems()) {
            System.out.println(keyVersion);
        }
        System.out.println();
    }

    public static String encryptTest(KmsCryptoClient kmsCryptoClient, String keyId) {
        System.out.println("Encrypt Test");
        String plaintext = "I love OCI!";
        EncryptDataDetails encryptDataDetails =
                EncryptDataDetails.builder()
                        .keyId(keyId)
                        .plaintext(Base64.encodeBase64String(plaintext.getBytes()))
                        .loggingContext(getSampleLoggingContext())
                        .build();
        EncryptRequest encryptRequest =
                EncryptRequest.builder().encryptDataDetails(encryptDataDetails).build();
        EncryptResponse response = kmsCryptoClient.encrypt(encryptRequest);

        System.out.println("Plaintext: " + plaintext);
        System.out.println("Ciphertext: " + response.getEncryptedData().getCiphertext());
        System.out.println();
        return response.getEncryptedData().getCiphertext();
    }

    public static void decryptTest(
            KmsCryptoClient kmsCryptoClient, String keyId, String cipherText) {
        System.out.println("Decrypt Test");
        DecryptDataDetails decryptDataDetails =
                DecryptDataDetails.builder()
                        .ciphertext(cipherText)
                        .keyId(keyId)
                        .loggingContext(getSampleLoggingContext())
                        .build();
        DecryptRequest decryptRequest =
                DecryptRequest.builder().decryptDataDetails(decryptDataDetails).build();
        DecryptResponse response = kmsCryptoClient.decrypt(decryptRequest);
        System.out.println("Plaintext: " + response.getDecryptedData().getPlaintext());
        System.out.println();
    }

    public static void generateDataEncryptionKeyTest(
            KmsCryptoClient kmsCryptoClient, String keyId) {
        System.out.println("GenerateDataEncryptionKey Test");
        GenerateKeyDetails generateKeyDetails =
                GenerateKeyDetails.builder()
                        .keyId(keyId)
                        .keyShape(TEST_KEY_SHAPE)
                        .includePlaintextKey(true)
                        .loggingContext(getSampleLoggingContext())
                        .build();
        GenerateDataEncryptionKeyRequest generateDataEncryptionKeyRequest =
                GenerateDataEncryptionKeyRequest.builder()
                        .generateKeyDetails(generateKeyDetails)
                        .build();
        GenerateDataEncryptionKeyResponse response =
                kmsCryptoClient.generateDataEncryptionKey(generateDataEncryptionKeyRequest);
        System.out.println("GenerateDataEncryptionKey response: ");
        System.out.println(response.getGeneratedKey());
        System.out.println();
    }

    public static void backupKeyTest(KmsManagementClient kmsManagementClient, String keyId) {
        System.out.println("BackupKey Test");
        BackupKeyRequest backupKeyRequest =
                BackupKeyRequest.builder()
                        .backupKeyDetails(
                                BackupKeyDetails.builder()
                                        .backupLocation(
                                                BackupLocationBucket.builder()
                                                        .bucketName("JavaSdkExamples")
                                                        .objectName("BackupKeySdkTest")
                                                        .namespace("kmstest")
                                                        .build())
                                        .build())
                        .keyId(keyId)
                        .build();
        BackupKeyResponse response = kmsManagementClient.backupKey(backupKeyRequest);
        System.out.println("Backing up key, updated key:");
        System.out.println(response.getKey());
        System.out.println();
    }

    public static void restoreKeyFromObjectStoreTest(KmsManagementClient kmsManagementClient) {
        System.out.println("RestoreKeyFromObjectStore Test");
        RestoreKeyFromObjectStoreRequest restoreKeyFromObjectStoreRequest =
                RestoreKeyFromObjectStoreRequest.builder()
                        .restoreKeyFromObjectStoreDetails(
                                RestoreKeyFromObjectStoreDetails.builder()
                                        .backupLocation(
                                                BackupLocationBucket.builder()
                                                        .bucketName("JavaSdkExamples")
                                                        .objectName("BackupKeySdkTest")
                                                        .namespace("kmstest")
                                                        .build())
                                        .build())
                        .build();
        RestoreKeyFromObjectStoreResponse response =
                kmsManagementClient.restoreKeyFromObjectStore(restoreKeyFromObjectStoreRequest);
        System.out.println("Restoring key from object store, updated key: ");
        System.out.println(response.getKey());
        System.out.println();
    }

    public static void restoreKeyFromFileTest(KmsManagementClient kmsManagementClient) {
        System.out.println("RestoreKeyFromFile Test");

        // please take a second and download backup to a local file before proceeding
        String backupFile = "/tmp/BackupKeySdkTest";

        try (WrappedFileInputStream fileInputStream =
                new WrappedFileInputStream(new File(backupFile))) {
            RestoreKeyFromFileRequest request =
                    RestoreKeyFromFileRequest.builder()
                            .restoreKeyFromFileDetails(fileInputStream)
                            .build();
            RestoreKeyFromFileResponse response = kmsManagementClient.restoreKeyFromFile(request);
            System.out.println("Restoring key from local file, updated key: ");
            System.out.println(response.getKey());
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }

    public static void changeVaultCompartmentTest(
            KmsVaultClient kmsVaultClient, String vaultId, String targetCompartment) {
        System.out.println("ChangeVaultCompartment Test");
        ChangeVaultCompartmentDetails changeVaultCompartmentDetails =
                ChangeVaultCompartmentDetails.builder().compartmentId(targetCompartment).build();

        ChangeVaultCompartmentRequest request =
                ChangeVaultCompartmentRequest.builder()
                        .vaultId(vaultId)
                        .changeVaultCompartmentDetails(changeVaultCompartmentDetails)
                        .build();

        ChangeVaultCompartmentResponse response = kmsVaultClient.changeVaultCompartment(request);

        System.out.println("Changing compartment of vault");
        System.out.println();
    }

    public static void changeKeyCompartmentTest(
            KmsManagementClient kmsManagementClient, String keyId, String targetCompartment) {
        System.out.println("ChangeKeyCompartment Test");
        ChangeKeyCompartmentDetails changeKeyCompartmentDetails =
                ChangeKeyCompartmentDetails.builder().compartmentId(targetCompartment).build();

        ChangeKeyCompartmentRequest request =
                ChangeKeyCompartmentRequest.builder()
                        .keyId(keyId)
                        .changeKeyCompartmentDetails(changeKeyCompartmentDetails)
                        .build();

        ChangeKeyCompartmentResponse response = kmsManagementClient.changeKeyCompartment(request);

        System.out.println("Changing compartment of key");
        System.out.println();
    }

    private static Map<String, String> getSampleFreeformTagData() {
        Map<String, String> freeformTags = new HashMap<String, String>();
        freeformTags.put("dummyfreeformkey1", "dummyfreeformvalue1");
        freeformTags.put("dummyfreeformkey2", "dummyfreeformvalue2");
        return freeformTags;
    }

    private static Map<String, String> getSampleLoggingContext() {
        Map<String, String> loggingContext = new HashMap<String, String>();
        loggingContext.put("loggingContextKey1", "loggingContextValue1");
        loggingContext.put("loggingContextKey2", "loggingContextValue2");
        return loggingContext;
    }
}
