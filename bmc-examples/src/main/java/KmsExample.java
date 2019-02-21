/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.keymanagement.KmsCryptoClient;
import com.oracle.bmc.keymanagement.KmsManagementClient;
import com.oracle.bmc.keymanagement.KmsVaultClient;
import com.oracle.bmc.keymanagement.model.CreateKeyDetails;
import com.oracle.bmc.keymanagement.model.CreateVaultDetails;
import com.oracle.bmc.keymanagement.model.DecryptDataDetails;
import com.oracle.bmc.keymanagement.model.EncryptDataDetails;
import com.oracle.bmc.keymanagement.model.GenerateKeyDetails;
import com.oracle.bmc.keymanagement.model.KeyShape;
import com.oracle.bmc.keymanagement.model.KeySummary;
import com.oracle.bmc.keymanagement.model.KeyVersionSummary;
import com.oracle.bmc.keymanagement.model.ScheduleVaultDeletionDetails;
import com.oracle.bmc.keymanagement.model.UpdateKeyDetails;
import com.oracle.bmc.keymanagement.model.UpdateVaultDetails;
import com.oracle.bmc.keymanagement.model.Vault;
import com.oracle.bmc.keymanagement.model.VaultSummary;
import com.oracle.bmc.keymanagement.requests.CancelVaultDeletionRequest;
import com.oracle.bmc.keymanagement.requests.CreateKeyRequest;
import com.oracle.bmc.keymanagement.requests.CreateKeyVersionRequest;
import com.oracle.bmc.keymanagement.requests.CreateVaultRequest;
import com.oracle.bmc.keymanagement.requests.DecryptRequest;
import com.oracle.bmc.keymanagement.requests.DisableKeyRequest;
import com.oracle.bmc.keymanagement.requests.EnableKeyRequest;
import com.oracle.bmc.keymanagement.requests.EncryptRequest;
import com.oracle.bmc.keymanagement.requests.GenerateDataEncryptionKeyRequest;
import com.oracle.bmc.keymanagement.requests.GetKeyRequest;
import com.oracle.bmc.keymanagement.requests.GetVaultRequest;
import com.oracle.bmc.keymanagement.requests.ListKeyVersionsRequest;
import com.oracle.bmc.keymanagement.requests.ListKeysRequest;
import com.oracle.bmc.keymanagement.requests.ListVaultsRequest;
import com.oracle.bmc.keymanagement.requests.ScheduleVaultDeletionRequest;
import com.oracle.bmc.keymanagement.requests.UpdateKeyRequest;
import com.oracle.bmc.keymanagement.requests.UpdateVaultRequest;
import com.oracle.bmc.keymanagement.responses.CancelVaultDeletionResponse;
import com.oracle.bmc.keymanagement.responses.CreateKeyResponse;
import com.oracle.bmc.keymanagement.responses.CreateKeyVersionResponse;
import com.oracle.bmc.keymanagement.responses.CreateVaultResponse;
import com.oracle.bmc.keymanagement.responses.DecryptResponse;
import com.oracle.bmc.keymanagement.responses.DisableKeyResponse;
import com.oracle.bmc.keymanagement.responses.EnableKeyResponse;
import com.oracle.bmc.keymanagement.responses.EncryptResponse;
import com.oracle.bmc.keymanagement.responses.GenerateDataEncryptionKeyResponse;
import com.oracle.bmc.keymanagement.responses.GetKeyResponse;
import com.oracle.bmc.keymanagement.responses.GetVaultResponse;
import com.oracle.bmc.keymanagement.responses.ListKeyVersionsResponse;
import com.oracle.bmc.keymanagement.responses.ListKeysResponse;
import com.oracle.bmc.keymanagement.responses.ListVaultsResponse;
import com.oracle.bmc.keymanagement.responses.ScheduleVaultDeletionResponse;
import com.oracle.bmc.keymanagement.responses.UpdateKeyResponse;
import com.oracle.bmc.keymanagement.responses.UpdateVaultResponse;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;

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
    private static final long TRANSIENT_STATE_WAIT_TIME_MS = 1000L * 30L;

    // The KeyShape used for testing
    private static final KeyShape TEST_KEY_SHAPE =
            KeyShape.builder().algorithm(KeyShape.Algorithm.Aes).length(DEFAULT_KEY_LENGTH).build();

    // Please pass in the compartmentId and the vaultId as the first and second argument
    public static void main(final String[] args) throws Exception {

        // Read in compartmentId and vaultId and perform basic validations.
        final String compartmentId = args[0];
        final String vaultId = args[1];
        if (StringUtils.isBlank(compartmentId) || StringUtils.isBlank(vaultId)) {
            System.out.println("compartmentId and vaultId cannot be empty or null");
            return;
        }

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed.
        final String configurationFilePath = "~/.oci/config";
        final String profile = "DEFAULT";

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

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

        // Vault Operations
        updateVaultResetTagsTest(kmsVaultClient, vault.getId());
        updateVaultTest(kmsVaultClient, vault.getId());
        listVaultsTest(kmsVaultClient, compartmentId);
        scheduleVaultDeletionTest(kmsVaultClient, vault.getId());
        // After scheduling deletion, the Vault will stay in SCHEDULING_DELETION state shortly and then
        // transit to PENDING_DELETION state. Wait a bit for the transition to happen.
        System.out.println("Wait a bit for the deletion scheduling to finish");
        Thread.sleep(TRANSIENT_STATE_WAIT_TIME_MS);

        cancelVaultDeletionTest(kmsVaultClient, vault.getId());
        // After cancelling deletion, the Vault will stay in CANCELLING_DELETION state shortly and then
        // transit to ACTIVE state. Wait a bit for the transition to happen.
        System.out.println("Wait a bit for the deletion cancelling to finish");
        Thread.sleep(TRANSIENT_STATE_WAIT_TIME_MS);

        // Management / Key Operations
        String keyId = createKeyTest(kmsManagementClient, compartmentId);
        // After creating a Key, the Key will stay in CREATING state shortly and then
        // transit to ENABLED state. Wait a bit for the transition to happen.
        System.out.println("Wait a bit for Key creation to finish");
        Thread.sleep(TRANSIENT_STATE_WAIT_TIME_MS);

        getKeyTest(kmsManagementClient, keyId);
        updateKeyResetTagsTest(kmsManagementClient, keyId);
        updateKeyTest(kmsManagementClient, keyId);
        listKeysTest(kmsManagementClient, compartmentId);
        disableKeyTest(kmsManagementClient, keyId);
        // After disabling a Key, the Key will stay in DISABLING state shortly and then
        // transit to DISABLED state. Wait a bit for the transition to happen.
        System.out.println("Wait a bit for Key disabling to finish");
        Thread.sleep(TRANSIENT_STATE_WAIT_TIME_MS);

        enableKeyTest(kmsManagementClient, keyId);
        // After enabling a Key, the Key will stay in ENABLING state shortly and then
        // transit to ENABLED state. Wait a bit for the transition to happen.
        System.out.println("Wait a bit for Key enabling to finish");
        Thread.sleep(TRANSIENT_STATE_WAIT_TIME_MS);

        createKeyVersionTest(kmsManagementClient, keyId);
        listKeyVersionsTest(kmsManagementClient, keyId);

        // Crypto Operations
        String ciphertext = encryptTest(kmsCryptoClient, keyId);
        decryptTest(kmsCryptoClient, keyId, ciphertext);
        generateDataEncryptionKeyTest(kmsCryptoClient, keyId);
    }

    public static Vault createVaultTest(KmsVaultClient kmsVaultClient, String compartmentId) {
        System.out.println("CreateVault Test: ");
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
        System.out.println("Newly Created Vault: ");
        System.out.println(response.getVault());
        return response.getVault();
    }

    public static Vault getVaultTest(KmsVaultClient kmsVaultClient, String vaultId) {
        System.out.println("GetVault Test: ");
        GetVaultRequest getVaultRequest = GetVaultRequest.builder().vaultId(vaultId).build();
        GetVaultResponse response = kmsVaultClient.getVault(getVaultRequest);
        System.out.println("Vault Retrieved: ");
        System.out.println(response.getVault());
        return response.getVault();
    }

    public static void listVaultsTest(KmsVaultClient kmsVaultClient, String compartmentId) {
        System.out.println("ListVaults Test: ");
        ListVaultsRequest listVaultsRequest =
                ListVaultsRequest.builder().compartmentId(compartmentId).build();
        ListVaultsResponse response = kmsVaultClient.listVaults(listVaultsRequest);

        System.out.println("ListVaults Response: ");
        for (VaultSummary vault : response.getItems()) {
            System.out.println(vault);
        }
        System.out.println();
    }

    public static void updateVaultResetTagsTest(KmsVaultClient kmsVaultClient, String vaultId) {
        System.out.println("UpdateVault Test: ");
        Map<String, String> newEmptyFreeformTag = Collections.emptyMap();

        UpdateVaultDetails updateVaultDetails =
                UpdateVaultDetails.builder().freeformTags(newEmptyFreeformTag).build();
        UpdateVaultRequest updateVaultRequest =
                UpdateVaultRequest.builder()
                        .updateVaultDetails(updateVaultDetails)
                        .vaultId(vaultId)
                        .build();
        UpdateVaultResponse response = kmsVaultClient.updateVault(updateVaultRequest);
        System.out.println("Updated Vault: ");
        System.out.println(response.getVault());
        System.out.println();
    }

    public static void updateVaultTest(KmsVaultClient kmsVaultClient, String vaultId) {
        System.out.println("UpdateVault Test: ");
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
        System.out.println("Updated Vault: ");
        System.out.println(response.getVault());
        System.out.println();
    }

    public static void scheduleVaultDeletionTest(KmsVaultClient kmsVaultClient, String vaultId) {
        System.out.println("ScheduleVaultDeletion Test: ");
        ScheduleVaultDeletionDetails scheduleVaultDeletionDetails =
                ScheduleVaultDeletionDetails.builder().timeOfDeletion(null).build();
        ScheduleVaultDeletionRequest scheduleVaultDeletionRequest =
                ScheduleVaultDeletionRequest.builder()
                        .scheduleVaultDeletionDetails(scheduleVaultDeletionDetails)
                        .vaultId(vaultId)
                        .build();
        ScheduleVaultDeletionResponse response =
                kmsVaultClient.scheduleVaultDeletion(scheduleVaultDeletionRequest);
        System.out.println("Deletion Scheduled Successfully, Updated Vault: ");
        System.out.println(response.getVault());
        System.out.println();
    }

    public static void cancelVaultDeletionTest(KmsVaultClient kmsVaultClient, String vaultId) {
        System.out.println("CancelVaultDeletion Test: ");
        CancelVaultDeletionRequest cancelVaultDeletionRequest =
                CancelVaultDeletionRequest.builder().vaultId(vaultId).build();
        CancelVaultDeletionResponse response =
                kmsVaultClient.cancelVaultDeletion(cancelVaultDeletionRequest);
        System.out.println("Deletion Cancelled Successfully, Updated Vault: ");
        System.out.println(response.getVault());
        System.out.println();
    }

    public static String createKeyTest(
            KmsManagementClient kmsManagementClient, String compartmentId) {
        System.out.println("CreateKey Test: ");
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
        System.out.println("Newly Created Key: ");
        System.out.println(response.getKey());
        System.out.println();
        return response.getKey().getId();
    }

    public static void getKeyTest(KmsManagementClient kmsManagementClient, String keyId) {
        System.out.println("GetKey Test: ");
        GetKeyRequest getKeyRequest = GetKeyRequest.builder().keyId(keyId).build();
        GetKeyResponse response = kmsManagementClient.getKey(getKeyRequest);
        System.out.println("Key Retrieved: ");
        System.out.println(response.getKey());
    }

    public static void listKeysTest(KmsManagementClient kmsManagementClient, String compartmentId) {
        System.out.println("ListKeys Test: ");
        ListKeysRequest listKeysRequest =
                ListKeysRequest.builder().compartmentId(compartmentId).build();
        ListKeysResponse response = kmsManagementClient.listKeys(listKeysRequest);

        System.out.println("ListKeys Response: ");
        for (KeySummary key : response.getItems()) {
            System.out.println(key);
        }
        System.out.println();
    }

    public static void updateKeyResetTagsTest(
            KmsManagementClient kmsManagementClient, String keyId) {
        System.out.println("UpdateKey Test: ");
        Map<String, String> newEmptyFreeformTag = Collections.emptyMap();

        UpdateKeyDetails updateKeyDetails =
                UpdateKeyDetails.builder()
                        .displayName("Test_Key_V2")
                        .freeformTags(newEmptyFreeformTag)
                        .build();
        UpdateKeyRequest updateKeyRequest =
                UpdateKeyRequest.builder().updateKeyDetails(updateKeyDetails).keyId(keyId).build();
        UpdateKeyResponse response = kmsManagementClient.updateKey(updateKeyRequest);
        System.out.println("Updated Key: ");
        System.out.println(response.getKey());
        System.out.println();
    }

    public static void updateKeyTest(KmsManagementClient kmsManagementClient, String keyId) {
        System.out.println("UpdateKey Test: ");
        Map<String, String> newFreeformTag = getSampleFreeformTagData();
        newFreeformTag.put("dummyfreeformkey3", "dummyfreeformvalue3");
        UpdateKeyDetails updateKeyDetails =
                UpdateKeyDetails.builder()
                        .displayName("Test_Key_V2")
                        .freeformTags(newFreeformTag)
                        .build();
        UpdateKeyRequest updateKeyRequest =
                UpdateKeyRequest.builder().updateKeyDetails(updateKeyDetails).keyId(keyId).build();
        UpdateKeyResponse response = kmsManagementClient.updateKey(updateKeyRequest);
        System.out.println("Updated Key: ");
        System.out.println(response.getKey());
        System.out.println();
    }

    public static void disableKeyTest(KmsManagementClient kmsManagementClient, String keyId) {
        System.out.println("DisableKey Test: ");
        DisableKeyRequest disableKeyRequest = DisableKeyRequest.builder().keyId(keyId).build();
        DisableKeyResponse response = kmsManagementClient.disableKey(disableKeyRequest);
        System.out.println("Key Disabled Successfully, Updated Key: ");
        System.out.println(response.getKey());
        System.out.println();
    }

    public static void enableKeyTest(KmsManagementClient kmsManagementClient, String keyId) {
        System.out.println("EnableKey Test: ");
        EnableKeyRequest enableKeyRequest = EnableKeyRequest.builder().keyId(keyId).build();
        EnableKeyResponse response = kmsManagementClient.enableKey(enableKeyRequest);
        System.out.println("Key Enabled Successfully, Updated Key: ");
        System.out.println(response.getKey());
        System.out.println();
    }

    public static void createKeyVersionTest(KmsManagementClient kmsManagementClient, String keyId) {
        System.out.println("CreateKeyVersion Test: ");
        CreateKeyVersionRequest createKeyVersionRequest =
                CreateKeyVersionRequest.builder().keyId(keyId).build();
        CreateKeyVersionResponse response =
                kmsManagementClient.createKeyVersion(createKeyVersionRequest);
        System.out.println("Newly Created KeyVersion: ");
        System.out.println(response.getKeyVersion());
        System.out.println();
    }

    public static void listKeyVersionsTest(KmsManagementClient kmsManagementClient, String keyId) {
        System.out.println("ListKeyVersions Test: ");
        ListKeyVersionsRequest listKeyVersionsRequest =
                ListKeyVersionsRequest.builder().keyId(keyId).build();
        ListKeyVersionsResponse response =
                kmsManagementClient.listKeyVersions(listKeyVersionsRequest);
        System.out.println("ListKeyVersions Response: ");
        for (KeyVersionSummary keyVersion : response.getItems()) {
            System.out.println(keyVersion);
        }
        System.out.println();
    }

    public static String encryptTest(KmsCryptoClient kmsCryptoClient, String keyId) {
        System.out.println("Encrypt Test: ");
        String plaintext = "I love OCI!";
        EncryptDataDetails encryptDataDetails =
                EncryptDataDetails.builder()
                        .keyId(keyId)
                        .plaintext(Base64.encodeBase64String(plaintext.getBytes()))
                        .build();
        EncryptRequest encryptRequest =
                EncryptRequest.builder().encryptDataDetails(encryptDataDetails).build();
        EncryptResponse response = kmsCryptoClient.encrypt(encryptRequest);

        System.out.println("Plaintext: " + plaintext);
        System.out.println("Cipheretext: " + response.getEncryptedData().getCiphertext());
        System.out.println();
        return response.getEncryptedData().getCiphertext();
    }

    public static void decryptTest(
            KmsCryptoClient kmsCryptoClient, String keyId, String cipherText) {
        System.out.println("Decrypt Test: ");
        DecryptDataDetails decryptDataDetails =
                DecryptDataDetails.builder().ciphertext(cipherText).keyId(keyId).build();
        DecryptRequest decryptRequest =
                DecryptRequest.builder().decryptDataDetails(decryptDataDetails).build();
        DecryptResponse response = kmsCryptoClient.decrypt(decryptRequest);
        System.out.println("Plaintext: " + response.getDecryptedData().getPlaintext());
        System.out.println();
    }

    public static void generateDataEncryptionKeyTest(
            KmsCryptoClient kmsCryptoClient, String keyId) {
        System.out.println("GenerateDataEncryptionKey Test: ");
        GenerateKeyDetails generateKeyDetails =
                GenerateKeyDetails.builder()
                        .keyId(keyId)
                        .keyShape(TEST_KEY_SHAPE)
                        .includePlaintextKey(true)
                        .build();
        GenerateDataEncryptionKeyRequest generateDataEncryptionKeyRequest =
                GenerateDataEncryptionKeyRequest.builder()
                        .generateKeyDetails(generateKeyDetails)
                        .build();
        GenerateDataEncryptionKeyResponse response =
                kmsCryptoClient.generateDataEncryptionKey(generateDataEncryptionKeyRequest);
        System.out.println("GenerateDataEncryptionKey Response: ");
        System.out.println(response.getGeneratedKey());
        System.out.println();
    }

    private static Map<String, String> getSampleFreeformTagData() {
        Map<String, String> freeformTags = new HashMap<String, String>();
        freeformTags.put("dummyfreeformkey1", "dummyfreeformvalue1");
        freeformTags.put("dummyfreeformkey2", "dummyfreeformvalue2");
        return freeformTags;
    }
}
