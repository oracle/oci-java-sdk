/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.keymanagement.requests.*;
import com.oracle.bmc.keymanagement.responses.*;

/**
 * API for managing and performing operations with keys and vaults. (For the API for managing
 * secrets, see the Vault Service Secret Management API. For the API for retrieving secrets, see the
 * Vault Service Secret Retrieval API.)
 *
 * <p>This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by
 * default if no circuit breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
public interface KmsCrypto extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Decrypts data using the given
     * [DecryptDataDetails](https://docs.cloud.oracle.com/api/#/en/key/latest/datatypes/DecryptDataDetails)
     * resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/DecryptExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use Decrypt API.
     */
    DecryptResponse decrypt(DecryptRequest request);

    /**
     * Encrypts data using the given
     * [EncryptDataDetails](https://docs.cloud.oracle.com/api/#/en/key/latest/datatypes/EncryptDataDetails)
     * resource. Plaintext included in the example request is a base64-encoded value of a UTF-8
     * string.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/EncryptExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use Encrypt API.
     */
    EncryptResponse encrypt(EncryptRequest request);

    /**
     * Exports a specific version of a master encryption key according to the details of the
     * request. For their protection, keys that you create and store on a hardware security module
     * (HSM) can never leave the HSM. You can only export keys stored on the server. For export, the
     * key version is encrypted by an RSA public key that you provide.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/ExportKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ExportKey API.
     */
    ExportKeyResponse exportKey(ExportKeyRequest request);

    /**
     * Generates a key that you can use to encrypt or decrypt data.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/GenerateDataEncryptionKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GenerateDataEncryptionKey API.
     */
    GenerateDataEncryptionKeyResponse generateDataEncryptionKey(
            GenerateDataEncryptionKeyRequest request);

    /**
     * Creates a digital signature for a message or message digest by using the private key of a
     * public-private key pair, also known as an asymmetric key. To verify the generated signature,
     * you can use the
     * [Verify](https://docs.cloud.oracle.com/api/#/en/key/latest/VerifiedData/Verify) operation.
     * Or, if you want to validate the signature outside of the service, you can do so by using the
     * public key of the same asymmetric key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/SignExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use Sign API.
     */
    SignResponse sign(SignRequest request);

    /**
     * Verifies a digital signature that was generated by the
     * [Sign](https://docs.cloud.oracle.com/api/#/en/key/latest/SignedData/Sign) operation by using
     * the public key of the same asymmetric key that was used to sign the data. If you want to
     * validate the digital signature outside of the service, you can do so by using the public key
     * of the asymmetric key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/VerifyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use Verify API.
     */
    VerifyResponse verify(VerifyRequest request);
}
