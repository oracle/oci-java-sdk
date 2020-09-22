/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.keymanagement.requests.*;
import com.oracle.bmc.keymanagement.responses.*;

/**
 * API for managing and performing operations with keys and vaults. (For the API for managing secrets, see the Vault Service
 * Secret Management API. For the API for retrieving secrets, see the Vault Service Secret Retrieval API.)
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
public interface KmsCrypto extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

    /**
     * Decrypts data using the given [DecryptDataDetails](https://docs.cloud.oracle.com/api/#/en/key/latest/datatypes/DecryptDataDetails) resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DecryptResponse decrypt(DecryptRequest request);

    /**
     * Encrypts data using the given [EncryptDataDetails](https://docs.cloud.oracle.com/api/#/en/key/latest/datatypes/EncryptDataDetails) resource.
     * Plaintext included in the example request is a base64-encoded value of a UTF-8 string.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    EncryptResponse encrypt(EncryptRequest request);

    /**
     * Exports a specific version of a master encryption key according to the details of the request. For their protection,
     * keys that you create and store on a hardware security module (HSM) can never leave the HSM. You can only export keys
     * stored on the server. For export, the key version is encrypted by an RSA public key that you provide.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ExportKeyResponse exportKey(ExportKeyRequest request);

    /**
     * Generates a key that you can use to encrypt or decrypt data.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GenerateDataEncryptionKeyResponse generateDataEncryptionKey(
            GenerateDataEncryptionKeyRequest request);
}
