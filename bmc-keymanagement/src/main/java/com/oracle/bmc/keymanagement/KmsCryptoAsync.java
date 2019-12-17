/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.keymanagement.requests.*;
import com.oracle.bmc.keymanagement.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
public interface KmsCryptoAsync extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /**
     * Decrypts data using the given [DecryptDataDetails](https://docs.cloud.oracle.com/api/#/en/key/release/datatypes/DecryptDataDetails) resource.
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
     * Encrypts data using the given [EncryptDataDetails](https://docs.cloud.oracle.com/api/#/en/key/release/datatypes/EncryptDataDetails) resource.
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
}
