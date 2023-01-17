/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package client_side_encryption;

import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.encryption.KmsMasterKey;
import com.oracle.bmc.encryption.KmsMasterKeyProvider;
import com.oracle.bmc.encryption.OciCrypto;
import com.oracle.bmc.encryption.OciCryptoInputStream;
import com.oracle.bmc.util.internal.FileUtils;
import com.oracle.bmc.util.internal.StringUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * This class contains examples for encrypting/decrypting Streams on the client side using KMS
 * service.
 *
 * <p>Instructions: As a pre-requisite for this example you must have a vault created in KMS with at
 * least one master key. OCI KMS has APIs that allow creating master keys or importing a previously
 * generated key, either will work. You can refer to the example at examples/kmsExample.java for an
 * example of how to create a master key.
 */
public class StreamEncryptionExample {

    public static void main(final String[] args) throws Exception {

        if (args.length != 4) {
            throw new IllegalArgumentException(
                    "This example expects 4 arguments: Vault ID, Master Key Id, Region and File Path.");
        }

        // Read in vaultId, masterKeyId, region and perform basic validations.
        final String vaultId = args[0];
        final String masterKeyId = args[1];
        final String region = args[2];
        final String filePath = args[3];

        if (StringUtils.isBlank(vaultId)
                || StringUtils.isBlank(masterKeyId)
                || StringUtils.isBlank(region)
                || StringUtils.isBlank(filePath)) {
            System.out.println("vaultId, masterKeyId, region and filePath cannot be empty or null");
            return;
        }

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(configurationFilePath, profile);
        final String configurationFilePath = "~/.oci/config";
        final String profile = "DEFAULT";

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        // Create Key provider
        KmsMasterKey kmsMasterKey = new KmsMasterKey(provider, region, vaultId, masterKeyId);
        KmsMasterKeyProvider kmsMasterKeyProvider = new KmsMasterKeyProvider(kmsMasterKey);

        OciCrypto ociCrypto = new OciCrypto();

        FileInputStream fileInputStreamText = new FileInputStream(filePath);
        FileOutputStream fileOutputStreamEnc = new FileOutputStream(filePath + ".encrypted");

        // Create encryption stream
        OciCryptoInputStream inputCipherStreamEncrypt =
                ociCrypto.createEncryptingStream(
                        kmsMasterKeyProvider, fileInputStreamText, getSampleContext());

        // Encrypt data
        FileUtils.copy(inputCipherStreamEncrypt, fileOutputStreamEnc);
        fileOutputStreamEnc.close();
        inputCipherStreamEncrypt.close();

        System.out.println("Encrypted file: " + filePath + ".encrypted");
        ////////////////////////////////////////////////////////////////////////////////
        FileInputStream fileInputStreamEnc = new FileInputStream(filePath + ".encrypted");
        FileOutputStream fileOutputStreamText = new FileOutputStream(filePath + ".decrypted");

        // Create decryption stream
        kmsMasterKeyProvider = new KmsMasterKeyProvider(provider);
        OciCryptoInputStream inputCipherStreamDecrypt =
                ociCrypto.createDecryptingStream(kmsMasterKeyProvider, fileInputStreamEnc);

        // Decrypt data
        FileUtils.copy(inputCipherStreamDecrypt, fileOutputStreamText);
        fileOutputStreamText.close();
        kmsMasterKey.close();

        System.out.println("Decrypted file: " + filePath + ".decrypted");
    }

    private static Map<String, String> getSampleContext() {
        Map<String, String> context = new HashMap<String, String>();
        context.put("Key1", "Value1");
        context.put("Key2", "Value2");
        return context;
    }
}
