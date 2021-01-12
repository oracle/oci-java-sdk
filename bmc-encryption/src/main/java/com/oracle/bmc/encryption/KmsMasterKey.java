/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.encryption;

import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.encryption.internal.CryptoAlgorithm;
import com.oracle.bmc.encryption.internal.DataKey;
import com.oracle.bmc.keymanagement.KmsCryptoClient;
import com.oracle.bmc.keymanagement.KmsManagementClient;
import com.oracle.bmc.keymanagement.KmsVaultClient;
import com.oracle.bmc.keymanagement.model.DecryptDataDetails;
import com.oracle.bmc.keymanagement.model.GenerateKeyDetails;
import com.oracle.bmc.keymanagement.model.KeyShape;
import com.oracle.bmc.keymanagement.model.Vault;
import com.oracle.bmc.keymanagement.requests.DecryptRequest;
import com.oracle.bmc.keymanagement.requests.GenerateDataEncryptionKeyRequest;
import com.oracle.bmc.keymanagement.requests.GetKeyRequest;
import com.oracle.bmc.keymanagement.requests.GetVaultRequest;
import com.oracle.bmc.keymanagement.responses.DecryptResponse;
import com.oracle.bmc.keymanagement.responses.GenerateDataEncryptionKeyResponse;
import com.oracle.bmc.keymanagement.responses.GetKeyResponse;
import com.oracle.bmc.keymanagement.responses.GetVaultResponse;
import com.oracle.bmc.model.BmcException;
import lombok.Getter;
/**
 * Represents a MasterKey contained in the OCI Key Management Service.
 */
public class KmsMasterKey implements MasterKey {
    private final KmsCryptoClient kmsCryptoClient;
    private final KmsManagementClient kmsManagementClient;
    private final KmsVaultClient kmsVaultClient;

    @Getter private final AuthenticationDetailsProvider provider;

    @Getter private final String vaultId;

    @Getter private final String kmsMasterKeyId;

    @Getter private final String region;

    /**
     * Initialize KmsMasterKey for encryption.
     * It creates the clients needed to get Keys from OCI KMS service.
     * @param authenticationDetailsProvider Authentication Provider for OCI.
     * @param region OCI Region
     * @param vaultId The OCID of the vault.
     * @param kmsMasterKeyId The OCID of the KMS master key.
     */
    public KmsMasterKey(
            AuthenticationDetailsProvider authenticationDetailsProvider,
            String region,
            String vaultId,
            String kmsMasterKeyId) {
        if (authenticationDetailsProvider == null || region.isEmpty()) {
            throw new IllegalArgumentException(
                    "Please provide a valid authenticationDetailsProvider and a region.");
        }
        if (vaultId.isEmpty() || kmsMasterKeyId.isEmpty()) {
            throw new IllegalArgumentException(
                    "Encryption Key info is missing. Please provide a kmsMasterKeyId and vaultId.");
        }
        this.vaultId = vaultId;
        this.kmsMasterKeyId = kmsMasterKeyId;
        this.region = region;

        this.provider = authenticationDetailsProvider;
        // Initialize the KMS Clients. KMS has three clients as following:
        // KmsVaultClient: The client for Vault management
        // KmsManagementClient: The client for Key management (ControlPlane)
        // KmsCryptoClient: The client for data encryption and decryption (DataPlane)
        kmsVaultClient = new KmsVaultClient(provider);
        kmsManagementClient = new KmsManagementClient(provider);
        kmsCryptoClient = new KmsCryptoClient(provider);

        kmsVaultClient.setRegion(region);
        setVault(vaultId);
    }

    private void setVault(String vaultId) {
        // Get the details of the given Vault
        GetVaultRequest getVaultRequest = GetVaultRequest.builder().vaultId(vaultId).build();
        GetVaultResponse response;
        try {
            response = kmsVaultClient.getVault(getVaultRequest);
        } catch (BmcException e) {
            throw new RuntimeException(getVaultAccessErrorMsg(), e);
        }
        Vault vault = response.getVault();

        // The ManagementClient and CryptoClient use Vault specific endpoints; Set them now.
        kmsManagementClient.setEndpoint(vault.getManagementEndpoint());
        kmsCryptoClient.setEndpoint(vault.getCryptoEndpoint());
    }

    /**
     * Generate Data encryption key.
     * @param cryptoAlgorithm Crypto Algorithm.
     * @return Data Key
     */
    public DataKey generateDataEncryptionKey(CryptoAlgorithm cryptoAlgorithm) {
        KeyShape masterkeyShape =
                KeyShape.builder()
                        .algorithm(KeyShape.Algorithm.Aes)
                        .length(cryptoAlgorithm.getDataKeyLen())
                        .build();
        GenerateKeyDetails generateKeyDetails =
                GenerateKeyDetails.builder()
                        .keyId(kmsMasterKeyId)
                        .keyShape(masterkeyShape)
                        .includePlaintextKey(true)
                        .build();
        GenerateDataEncryptionKeyRequest generateDataEncryptionKeyRequest =
                GenerateDataEncryptionKeyRequest.builder()
                        .generateKeyDetails(generateKeyDetails)
                        .build();

        GenerateDataEncryptionKeyResponse response;
        try {
            response = kmsCryptoClient.generateDataEncryptionKey(generateDataEncryptionKeyRequest);
        } catch (BmcException generateKeyError) {
            // The error can happen for two reasons:
            // 1) The MasterKey doesn't exist.
            try {
                // Check if the MasterKey exist.
                GetKeyRequest getKeyRequest = GetKeyRequest.builder().keyId(kmsMasterKeyId).build();
                GetKeyResponse masterKeyResponse = kmsManagementClient.getKey(getKeyRequest);
            } catch (BmcException keyError) {
                throw new RuntimeException(getMasterKeyAccessErrorMsg(), keyError);
            }
            // 2) The DEK can't be generated.
            throw new RuntimeException(
                    "Can't generate the DataKey using MasterKeyId: " + kmsMasterKeyId,
                    generateKeyError);
        }
        DataKey dataKey =
                new DataKey(
                        response.getGeneratedKey().getCiphertext(),
                        response.getGeneratedKey().getPlaintext(),
                        response.getGeneratedKey().getPlaintextChecksum());
        return dataKey;
    }

    /**
     * Decrypt Data key.
     * @param encryptedDataKey encryptedDataKey.
     * @param kmsMasterKeyId masterKeyId.
     * @return Decrypted Data Key
     */
    public String decryptDataKey(String encryptedDataKey, String kmsMasterKeyId) {
        DecryptDataDetails decryptDataDetails =
                DecryptDataDetails.builder()
                        .ciphertext(encryptedDataKey)
                        .keyId(kmsMasterKeyId)
                        .build();
        DecryptRequest decryptRequest =
                DecryptRequest.builder().decryptDataDetails(decryptDataDetails).build();
        DecryptResponse response;
        try {
            response = kmsCryptoClient.decrypt(decryptRequest);
        } catch (BmcException decryptError) {
            // The error can happen for two reasons:
            // 1) The MasterKey doesn't exist.
            try {
                // Check if the MasterKey exist.
                GetKeyRequest getKeyRequest = GetKeyRequest.builder().keyId(kmsMasterKeyId).build();
                GetKeyResponse masterKeyResponse = kmsManagementClient.getKey(getKeyRequest);
            } catch (BmcException keyError) {
                throw new RuntimeException(getMasterKeyAccessErrorMsg(), keyError);
            }
            // 2) The DEK is encrypted using a different MasterKey.
            throw new RuntimeException(
                    "Can't decrypt the DataKey using MasterKeyId: " + kmsMasterKeyId, decryptError);
        }
        return response.getDecryptedData().getPlaintext();
    }

    private String getMasterKeyAccessErrorMsg() {
        StringBuilder errorMsg = new StringBuilder();
        errorMsg.append("Failed to access MasterKeyId: ");
        errorMsg.append(kmsMasterKeyId);
        errorMsg.append(" in vaultId: ");
        errorMsg.append(this.vaultId);
        errorMsg.append(" in region: ");
        errorMsg.append(this.region);
        return errorMsg.toString();
    }

    private String getVaultAccessErrorMsg() {
        StringBuilder errorMsg = new StringBuilder();
        errorMsg.append("Failed to access vaultId: ");
        errorMsg.append(this.vaultId);
        errorMsg.append(" in region: ");
        errorMsg.append(this.region);
        return errorMsg.toString();
    }

    /**
     * Close the OCI clients.
     */
    public void close() {
        if (kmsVaultClient != null) kmsVaultClient.close();
        if (kmsManagementClient != null) kmsManagementClient.close();
        if (kmsCryptoClient != null) kmsCryptoClient.close();
    }
}
