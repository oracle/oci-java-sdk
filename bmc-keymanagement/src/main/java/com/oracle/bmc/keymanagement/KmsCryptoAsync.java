/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
public interface KmsCryptoAsync extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

    /**
     * Decrypts data using the given [DecryptDataDetails](https://docs.cloud.oracle.com/api/#/en/key/latest/datatypes/DecryptDataDetails) resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DecryptResponse> decrypt(
            DecryptRequest request,
            com.oracle.bmc.responses.AsyncHandler<DecryptRequest, DecryptResponse> handler);

    /**
     * Encrypts data using the given [EncryptDataDetails](https://docs.cloud.oracle.com/api/#/en/key/latest/datatypes/EncryptDataDetails) resource.
     * Plaintext included in the example request is a base64-encoded value of a UTF-8 string.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<EncryptResponse> encrypt(
            EncryptRequest request,
            com.oracle.bmc.responses.AsyncHandler<EncryptRequest, EncryptResponse> handler);

    /**
     * Exports a specific version of a master encryption key according to the details of the request. For their protection,
     * keys that you create and store on a hardware security module (HSM) can never leave the HSM. You can only export keys
     * stored on the server. For export, the key version is encrypted by an RSA public key that you provide.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ExportKeyResponse> exportKey(
            ExportKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<ExportKeyRequest, ExportKeyResponse> handler);

    /**
     * Generates a key that you can use to encrypt or decrypt data.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GenerateDataEncryptionKeyResponse> generateDataEncryptionKey(
            GenerateDataEncryptionKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GenerateDataEncryptionKeyRequest, GenerateDataEncryptionKeyResponse>
                    handler);

    /**
     * Creates a digital signature for a message or message digest by using the private key in an asymmetric key.
     * To verify the generated signature, you can use the Verify operation or use the public key in the same asymmetric key outside of KMS
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SignResponse> sign(
            SignRequest request,
            com.oracle.bmc.responses.AsyncHandler<SignRequest, SignResponse> handler);

    /**
     * Verifies a digital signature that was generated by the Sign operation using the public key in the same asymmetric key.
     * You can also verify the digital signature by using the public key in the asymmetric key outside of KMS
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<VerifyResponse> verify(
            VerifyRequest request,
            com.oracle.bmc.responses.AsyncHandler<VerifyRequest, VerifyResponse> handler);
}
