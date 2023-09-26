/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.keymanagement.requests.*;
import com.oracle.bmc.keymanagement.responses.*;

/**
 * Use the Key Management API to manage vaults and keys. For more information, see [Managing
 * Vaults](https://docs.cloud.oracle.com/Content/KeyManagement/Tasks/managingvaults.htm) and
 * [Managing Keys](https://docs.cloud.oracle.com/Content/KeyManagement/Tasks/managingkeys.htm).
 *
 * <p>This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by
 * default if no circuit breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
public interface KmsManagement extends AutoCloseable {

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
     * Backs up an encrypted file that contains all key versions and metadata of the specified key
     * so that you can restore the key later. The file also contains the metadata of the vault that
     * the key belonged to.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/BackupKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use BackupKey API.
     */
    BackupKeyResponse backupKey(BackupKeyRequest request);

    /**
     * Cancels the scheduled deletion of the specified key. Canceling a scheduled deletion restores
     * the key's lifecycle state to what it was before its scheduled deletion.
     *
     * <p>As a provisioning operation, this call is subject to a Key Management limit that applies
     * to the total number of requests across all provisioning write operations. Key Management
     * might throttle this call to reject an otherwise valid request when the total rate of
     * provisioning write operations exceeds 10 requests per second for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/CancelKeyDeletionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CancelKeyDeletion
     *     API.
     */
    CancelKeyDeletionResponse cancelKeyDeletion(CancelKeyDeletionRequest request);

    /**
     * Cancels the scheduled deletion of the specified key version. Canceling a scheduled deletion
     * restores the key version to its lifecycle state from before its scheduled deletion.
     *
     * <p>As a provisioning operation, this call is subject to a Key Management limit that applies
     * to the total number of requests across all provisioning write operations. Key Management
     * might throttle this call to reject an otherwise valid request when the total rate of
     * provisioning write operations exceeds 10 requests per second for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/CancelKeyVersionDeletionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CancelKeyVersionDeletion API.
     */
    CancelKeyVersionDeletionResponse cancelKeyVersionDeletion(
            CancelKeyVersionDeletionRequest request);

    /**
     * Moves a key into a different compartment within the same tenancy. For information about
     * moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * <p>When provided, if-match is checked against the ETag values of the key.
     *
     * <p>As a provisioning operation, this call is subject to a Key Management limit that applies
     * to the total number of requests across all provisioning write operations. Key Management
     * might throttle this call to reject an otherwise valid request when the total rate of
     * provisioning write operations exceeds 10 requests per second for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/ChangeKeyCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeKeyCompartment API.
     */
    ChangeKeyCompartmentResponse changeKeyCompartment(ChangeKeyCompartmentRequest request);

    /**
     * Creates a new master encryption key.
     *
     * <p>As a management operation, this call is subject to a Key Management limit that applies to
     * the total number of requests across all management write operations. Key Management might
     * throttle this call to reject an otherwise valid request when the total rate of management
     * write operations exceeds 10 requests per second for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/CreateKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateKey API.
     */
    CreateKeyResponse createKey(CreateKeyRequest request);

    /**
     * Generates a new [KeyVersion](https://docs.cloud.oracle.com/api/#/en/key/latest/KeyVersion/)
     * resource that provides new cryptographic material for a master encryption key. The key must
     * be in an `ENABLED` state to be rotated.
     *
     * <p>As a management operation, this call is subject to a Key Management limit that applies to
     * the total number of requests across all management write operations. Key Management might
     * throttle this call to reject an otherwise valid request when the total rate of management
     * write operations exceeds 10 requests per second for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/CreateKeyVersionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateKeyVersion
     *     API.
     */
    CreateKeyVersionResponse createKeyVersion(CreateKeyVersionRequest request);

    /**
     * Disables a master encryption key so it can no longer be used for encryption, decryption, or
     * generating new data encryption keys.
     *
     * <p>As a management operation, this call is subject to a Key Management limit that applies to
     * the total number of requests across all management write operations. Key Management might
     * throttle this call to reject an otherwise valid request when the total rate of management
     * write operations exceeds 10 requests per second for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/DisableKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DisableKey API.
     */
    DisableKeyResponse disableKey(DisableKeyRequest request);

    /**
     * Enables a master encryption key so it can be used for encryption, decryption, or generating
     * new data encryption keys.
     *
     * <p>As a management operation, this call is subject to a Key Management limit that applies to
     * the total number of requests across all management write operations. Key Management might
     * throttle this call to reject an otherwise valid request when the total rate of management
     * write operations exceeds 10 requests per second for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/EnableKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnableKey API.
     */
    EnableKeyResponse enableKey(EnableKeyRequest request);

    /**
     * Gets information about the specified master encryption key.
     *
     * <p>As a management operation, this call is subject to a Key Management limit that applies to
     * the total number of requests across all management read operations. Key Management might
     * throttle this call to reject an otherwise valid request when the total rate of management
     * read operations exceeds 10 requests per second for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/GetKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetKey API.
     */
    GetKeyResponse getKey(GetKeyRequest request);

    /**
     * Gets information about the specified key version.
     *
     * <p>As a management operation, this call is subject to a Key Management limit that applies to
     * the total number of requests across all management read operations. Key Management might
     * throttle this call to reject an otherwise valid request when the total rate of management
     * read operations exceeds 10 requests per second for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/GetKeyVersionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetKeyVersion API.
     */
    GetKeyVersionResponse getKeyVersion(GetKeyVersionRequest request);

    /**
     * When a vault has a replica, each operation on the vault or its resources, such as keys, is
     * replicated and has an associated replicationId. Replication status provides details about
     * whether the operation associated with the given replicationId has been successfully applied
     * across replicas.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/GetReplicationStatusExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetReplicationStatus API.
     */
    GetReplicationStatusResponse getReplicationStatus(GetReplicationStatusRequest request);

    /**
     * Gets details about the public RSA wrapping key associated with the vault in the endpoint.
     * Each vault has an RSA key-pair that wraps and unwraps AES key material for import into Key
     * Management.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/GetWrappingKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWrappingKey API.
     */
    GetWrappingKeyResponse getWrappingKey(GetWrappingKeyRequest request);

    /**
     * Imports AES and RSA keys to create a new key. The key material must be base64-encoded and
     * wrapped by the vault's public RSA wrapping key before you can import it. Key Management
     * supports both RSA and AES keys. The AES keys are symmetric keys of length 128 bits (16
     * bytes), 192 bits (24 bytes), or 256 bits (32 bytes), and the RSA keys are asymmetric keys of
     * length 2048 bits (256 bytes), 3072 bits (384 bytes), and 4096 bits (512 bytes). Furthermore,
     * the key length must match what you specify at the time of import. When importing an
     * asymmetric key, only private key must be wrapped in PKCS8 format while the corresponding
     * public key is generated internally by KMS.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/ImportKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ImportKey API.
     */
    ImportKeyResponse importKey(ImportKeyRequest request);

    /**
     * Imports AES key material to create a new key version and then rotate the key to begin using
     * the new key version. The key material must be base64-encoded and wrapped by the vault's
     * public RSA wrapping key before you can import it. Key Management supports AES symmetric keys
     * that are exactly 16, 24, or 32 bytes. Furthermore, the key length must match the length of
     * the specified key and what you specify as the length at the time of import. When importing an
     * asymmetric key, only the private key must be wrapped in PKCS8 format while the corresponding
     * public key is generated internally by KMS.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/ImportKeyVersionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ImportKeyVersion
     *     API.
     */
    ImportKeyVersionResponse importKeyVersion(ImportKeyVersionRequest request);

    /**
     * Lists all [KeyVersion](https://docs.cloud.oracle.com/api/#/en/key/latest/KeyVersion/)
     * resources for the specified master encryption key.
     *
     * <p>As a management operation, this call is subject to a Key Management limit that applies to
     * the total number of requests across all management read operations. Key Management might
     * throttle this call to reject an otherwise valid request when the total rate of management
     * read operations exceeds 10 requests per second for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/ListKeyVersionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListKeyVersions
     *     API.
     */
    ListKeyVersionsResponse listKeyVersions(ListKeyVersionsRequest request);

    /**
     * Lists the master encryption keys in the specified vault and compartment.
     *
     * <p>As a management operation, this call is subject to a Key Management limit that applies to
     * the total number of requests across all management read operations. Key Management might
     * throttle this call to reject an otherwise valid request when the total rate of management
     * read operations exceeds 10 requests per second for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/ListKeysExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListKeys API.
     */
    ListKeysResponse listKeys(ListKeysRequest request);

    /**
     * Restores the specified key to the specified vault, based on information in the backup file
     * provided. If the vault doesn't exist, the operation returns a response with a 404 HTTP status
     * error code. You need to first restore the vault associated with the key.
     *
     * <p>Note: This operation consumes a stream.
     *
     * <p>If the stream supports {@link java.io.InputStream#mark(int)} and {@link
     * java.io.InputStream#reset()}, when a retry is necessary, the stream is reset so it starts at
     * the beginning (or whatever the stream's position was at the time this operation is called}.
     *
     * <p>Note this means that if the caller has used {@link java.io.InputStream#mark(int)} before,
     * then the mark will not be the same anymore after this operation, and a subsequent call to
     * {@link java.io.InputStream#reset()} by the caller will reset the stream not to the caller's
     * mark, but to the position the stream was in when this operation was called.
     *
     * <p>If the stream is a {@link java.io.FileInputStream}, and the stream's {@link
     * java.nio.channels.FileChannel} position can be changed (like for a regular file), the stream
     * will be wrapped in such a way that it does provide support for {@link
     * java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}. Then the same
     * procedure as above is followed. If the stream's {@link java.nio.channels.FileChannel}
     * position cannot be changed (like for a named pipe), then the stream's contents will be
     * buffered in memory, as described below.
     *
     * <p>If the stream does not support {@link java.io.InputStream#mark(int)} and {@link
     * java.io.InputStream#reset()}, then the stream is wrapped in a {@link
     * java.io.BufferedInputStream}, which means the entire contents may be buffered in memory. Then
     * the same procedure as above is followed.
     *
     * <p>The contents of the stream, except when the stream is a {@link java.io.FileInputStream}
     * whose {@link java.nio.channels.FileChannel} position can be changed, should be less than 2
     * GiB in size if retries are used. This is because streams 2 GiB in size or larger do no
     * guarantee that mark-and-reset can be performed. If the stream is larger, do not use built-in
     * retries and manage retries yourself.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/RestoreKeyFromFileExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use RestoreKeyFromFile
     *     API.
     */
    RestoreKeyFromFileResponse restoreKeyFromFile(RestoreKeyFromFileRequest request);

    /**
     * Restores the specified key to the specified vault from an Oracle Cloud Infrastructure Object
     * Storage location. If the vault doesn't exist, the operation returns a response with a 404
     * HTTP status error code. You need to first restore the vault associated with the key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/RestoreKeyFromObjectStoreExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RestoreKeyFromObjectStore API.
     */
    RestoreKeyFromObjectStoreResponse restoreKeyFromObjectStore(
            RestoreKeyFromObjectStoreRequest request);

    /**
     * Schedules the deletion of the specified key. This sets the lifecycle state of the key to
     * `PENDING_DELETION` and then deletes it after the specified retention period ends.
     *
     * <p>As a provisioning operation, this call is subject to a Key Management limit that applies
     * to the total number of requests across all provisioning write operations. Key Management
     * might throttle this call to reject an otherwise valid request when the total rate of
     * provisioning write operations exceeds 10 requests per second for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/ScheduleKeyDeletionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ScheduleKeyDeletion
     *     API.
     */
    ScheduleKeyDeletionResponse scheduleKeyDeletion(ScheduleKeyDeletionRequest request);

    /**
     * Schedules the deletion of the specified key version. This sets the lifecycle state of the key
     * version to `PENDING_DELETION` and then deletes it after the specified retention period ends.
     *
     * <p>As a provisioning operation, this call is subject to a Key Management limit that applies
     * to the total number of requests across all provisioning write operations. Key Management
     * might throttle this call to reject an otherwise valid request when the total rate of
     * provisioning write operations exceeds 10 requests per second for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/ScheduleKeyVersionDeletionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ScheduleKeyVersionDeletion API.
     */
    ScheduleKeyVersionDeletionResponse scheduleKeyVersionDeletion(
            ScheduleKeyVersionDeletionRequest request);

    /**
     * Updates the properties of a master encryption key. Specifically, you can update the
     * `displayName`, `freeformTags`, and `definedTags` properties. Furthermore, the key must be in
     * an `ENABLED` or `CREATING` state to be updated.
     *
     * <p>As a management operation, this call is subject to a Key Management limit that applies to
     * the total number of requests across all management write operations. Key Management might
     * throttle this call to reject an otherwise valid request when the total rate of management
     * write operations exceeds 10 requests per second for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/UpdateKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateKey API.
     */
    UpdateKeyResponse updateKey(UpdateKeyRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    KmsManagementWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    KmsManagementPaginators getPaginators();
}
