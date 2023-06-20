/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package client_side_encryption;

import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider;
import com.oracle.bmc.encryption.*;
import com.oracle.bmc.util.internal.StringUtils;
import org.apache.http.conn.ConnectTimeoutException;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;

/**
 * This class contains examples for encrypting/decrypting Text or Strings on the client side using
 * KMS service.
 *
 * <p>Instructions: As a pre-requisite for this example you must have a vault created in KMS with at
 * least one master key. OCI KMS has APIs that allow creating master keys or importing a previously
 * generated key, either will work. You can refer to the example at examples/kms_example.py for an
 * example of how to create a master key. Update the values for VAULT_ID and MASTER_KEY_ID below
 * with the values for your vault and key and then run the example.
 */
public class ClientSideEncryptionWithSignerExample {

    public static void main(final String[] args) throws Exception {

        if (args.length != 3) {
            throw new IllegalArgumentException(
                    "This example expects 3 arguments: Vault ID, Master Key Id and Region.");
        }

        // Read in vaultId, masterKeyId, region and perform basic validations.
        final String vaultId = args[0];
        final String masterKeyId = args[1];
        final String region = args[2];

        if (StringUtils.isBlank(vaultId)
                || StringUtils.isBlank(masterKeyId)
                || StringUtils.isBlank(region)) {
            System.out.println("vaultId or masterKeyId or region cannot be empty or null");
            return;
        }

        final BasicAuthenticationDetailsProvider provider;

        try {
            provider = InstancePrincipalsAuthenticationDetailsProvider.builder().build();
        } catch (Exception e) {
            if (e.getCause() instanceof SocketTimeoutException
                    || e.getCause() instanceof ConnectException
                    || e.getCause() instanceof ConnectTimeoutException) {
                System.out.println(
                        "This sample only works when running on an OCI instance. Are you sure you’re running on an OCI instance? For more info see: https://docs.cloud.oracle.com/Content/Identity/Tasks/callingservicesfrominstances.htm");
                return;
            }
            throw e;
        }

        // Create Key provider
        KmsMasterKey kmsMasterKey = new KmsMasterKey(provider, region, vaultId, masterKeyId);
        KmsMasterKeyProvider kmsMasterKeyProvider = new KmsMasterKeyProvider(kmsMasterKey);

        OciCrypto ociCrypto = new OciCrypto();

        final byte[] plainText = "Sample data to encrypt".getBytes(StandardCharsets.UTF_8);
        OciCryptoResult result = ociCrypto.encryptData(kmsMasterKeyProvider, plainText);
        byte[] cipherText = result.getResult();

        OciCryptoResult decryptResult = ociCrypto.decryptData(kmsMasterKeyProvider, cipherText);
        byte[] decryptText = decryptResult.getResult();

        System.out.println("Decrypted text: " + new String(decryptText));
        kmsMasterKey.close();
    }
}
