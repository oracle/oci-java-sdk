/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda;

import com.oracle.bmc.oda.requests.*;
import com.oracle.bmc.oda.responses.*;

/**
 * API to create and maintain Oracle Digital Assistant service instances. This service client uses
 * CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit
 * breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public interface Management extends AutoCloseable {

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
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this Region, however, an
     * IllegalArgumentException will be raised.
     *
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     *
     * <p>Note, this will first try to map the region ID to a known Region and call {@link
     * #setRegion(Region) setRegion}.
     *
     * <p>If no known Region could be determined, it will create an endpoint based on the default
     * endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     *
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Determines whether realm specific endpoint should be used or not. Set
     * realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm
     * specific endpoint template, otherwise set it to "false"
     *
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint
     *     template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Bulk create composite and value list entities into a skill.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/BulkCreateSkillEntitiesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     BulkCreateSkillEntities API.
     */
    BulkCreateSkillEntitiesResponse bulkCreateSkillEntities(BulkCreateSkillEntitiesRequest request);

    /**
     * Cascading delete of the custom entities in a skill.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/CascadingDeleteSkillCustomEntitiesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CascadingDeleteSkillCustomEntities API.
     */
    CascadingDeleteSkillCustomEntitiesResponse cascadingDeleteSkillCustomEntities(
            CascadingDeleteSkillCustomEntitiesRequest request);

    /**
     * Starts an asynchronous job to move the specified ODA Private Endpoint into a different
     * compartment.
     *
     * <p>To monitor the status of the job, take the `opc-work-request-id` response header value and
     * use it to call `GET /workRequests/{workRequestID}`. When provided, If-Match is checked
     * against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/ChangeOdaPrivateEndpointCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeOdaPrivateEndpointCompartment API.
     */
    ChangeOdaPrivateEndpointCompartmentResponse changeOdaPrivateEndpointCompartment(
            ChangeOdaPrivateEndpointCompartmentRequest request);

    /**
     * This will store the provided parameters in the Digital Assistant instance and update any
     * Digital Assistants with matching parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/ConfigureDigitalAssistantParametersExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ConfigureDigitalAssistantParameters API.
     */
    ConfigureDigitalAssistantParametersResponse configureDigitalAssistantParameters(
            ConfigureDigitalAssistantParametersRequest request);

    /**
     * Creates a new Authentication Provider
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/CreateAuthenticationProviderExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateAuthenticationProvider API.
     */
    CreateAuthenticationProviderResponse createAuthenticationProvider(
            CreateAuthenticationProviderRequest request);

    /**
     * Creates a new Channel.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/CreateChannelExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateChannel API.
     */
    CreateChannelResponse createChannel(CreateChannelRequest request);

    /**
     * Creates a new Digital Assistant.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/CreateDigitalAssistantExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateDigitalAssistant API.
     */
    CreateDigitalAssistantResponse createDigitalAssistant(CreateDigitalAssistantRequest request);

    /**
     * Starts an asynchronous job to create an ODA Private Endpoint.
     *
     * <p>To monitor the status of the job, take the `opc-work-request-id` response header value and
     * use it to call `GET /workRequests/{workRequestID}`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/CreateOdaPrivateEndpointExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateOdaPrivateEndpoint API.
     */
    CreateOdaPrivateEndpointResponse createOdaPrivateEndpoint(
            CreateOdaPrivateEndpointRequest request);

    /**
     * Starts an asynchronous job to create an ODA Private Endpoint Attachment.
     *
     * <p>To monitor the status of the job, take the `opc-work-request-id` response header value and
     * use it to call `GET /workRequests/{workRequestID}`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/CreateOdaPrivateEndpointAttachmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateOdaPrivateEndpointAttachment API.
     */
    CreateOdaPrivateEndpointAttachmentResponse createOdaPrivateEndpointAttachment(
            CreateOdaPrivateEndpointAttachmentRequest request);

    /**
     * Starts an asynchronous job to create an ODA Private Endpoint Scan Proxy.
     *
     * <p>To monitor the status of the job, take the `opc-work-request-id` response header value and
     * use it to call `GET /workRequests/{workRequestID}`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/CreateOdaPrivateEndpointScanProxyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateOdaPrivateEndpointScanProxy API.
     */
    CreateOdaPrivateEndpointScanProxyResponse createOdaPrivateEndpointScanProxy(
            CreateOdaPrivateEndpointScanProxyRequest request);

    /**
     * Creates a new Skill from scratch.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/CreateSkillExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateSkill API.
     */
    CreateSkillResponse createSkill(CreateSkillRequest request);

    /**
     * Creates a new Skill Parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/CreateSkillParameterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateSkillParameter API.
     */
    CreateSkillParameterResponse createSkillParameter(CreateSkillParameterRequest request);

    /**
     * Creates a new Translator
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/CreateTranslatorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateTranslator
     *     API.
     */
    CreateTranslatorResponse createTranslator(CreateTranslatorRequest request);

    /**
     * Delete the specified Authentication Provider.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/DeleteAuthenticationProviderExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteAuthenticationProvider API.
     */
    DeleteAuthenticationProviderResponse deleteAuthenticationProvider(
            DeleteAuthenticationProviderRequest request);

    /**
     * Delete the specified Channel.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/DeleteChannelExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteChannel API.
     */
    DeleteChannelResponse deleteChannel(DeleteChannelRequest request);

    /**
     * Delete the specified Digital Assistant.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/DeleteDigitalAssistantExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteDigitalAssistant API.
     */
    DeleteDigitalAssistantResponse deleteDigitalAssistant(DeleteDigitalAssistantRequest request);

    /**
     * Starts an asynchronous job to delete the specified ODA Private Endpoint. To monitor the
     * status of the job, take the `opc-work-request-id` response header value and use it to call
     * `GET /workRequests/{workRequestID}`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/DeleteOdaPrivateEndpointExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteOdaPrivateEndpoint API.
     */
    DeleteOdaPrivateEndpointResponse deleteOdaPrivateEndpoint(
            DeleteOdaPrivateEndpointRequest request);

    /**
     * Starts an asynchronous job to delete the specified ODA Private Endpoint Attachment. To
     * monitor the status of the job, take the `opc-work-request-id` response header value and use
     * it to call `GET /workRequests/{workRequestID}`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/DeleteOdaPrivateEndpointAttachmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteOdaPrivateEndpointAttachment API.
     */
    DeleteOdaPrivateEndpointAttachmentResponse deleteOdaPrivateEndpointAttachment(
            DeleteOdaPrivateEndpointAttachmentRequest request);

    /**
     * Starts an asynchronous job to delete the specified ODA Private Endpoint Scan Proxy. To
     * monitor the status of the job, take the `opc-work-request-id` response header value and use
     * it to call `GET /workRequests/{workRequestID}`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/DeleteOdaPrivateEndpointScanProxyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteOdaPrivateEndpointScanProxy API.
     */
    DeleteOdaPrivateEndpointScanProxyResponse deleteOdaPrivateEndpointScanProxy(
            DeleteOdaPrivateEndpointScanProxyRequest request);

    /**
     * Delete the specified Skill.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/DeleteSkillExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteSkill API.
     */
    DeleteSkillResponse deleteSkill(DeleteSkillRequest request);

    /**
     * Delete the specified Skill Parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/DeleteSkillParameterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteSkillParameter API.
     */
    DeleteSkillParameterResponse deleteSkillParameter(DeleteSkillParameterRequest request);

    /**
     * Delete the specified Translator.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/DeleteTranslatorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteTranslator
     *     API.
     */
    DeleteTranslatorResponse deleteTranslator(DeleteTranslatorRequest request);

    /**
     * Exports the specified Digital Assistant as an archive to Object Storage.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/ExportDigitalAssistantExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ExportDigitalAssistant API.
     */
    ExportDigitalAssistantResponse exportDigitalAssistant(ExportDigitalAssistantRequest request);

    /**
     * Exports the specified Skill as an archive to Object Storage.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/ExportSkillExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ExportSkill API.
     */
    ExportSkillResponse exportSkill(ExportSkillRequest request);

    /**
     * Gets the specified Authentication Provider.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/GetAuthenticationProviderExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetAuthenticationProvider API.
     */
    GetAuthenticationProviderResponse getAuthenticationProvider(
            GetAuthenticationProviderRequest request);

    /**
     * Gets the specified Channel.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/GetChannelExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetChannel API.
     */
    GetChannelResponse getChannel(GetChannelRequest request);

    /**
     * Gets the specified Digital Assistant.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/GetDigitalAssistantExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDigitalAssistant
     *     API.
     */
    GetDigitalAssistantResponse getDigitalAssistant(GetDigitalAssistantRequest request);

    /**
     * Gets the specified Digital Assistant Parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/GetDigitalAssistantParameterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetDigitalAssistantParameter API.
     */
    GetDigitalAssistantParameterResponse getDigitalAssistantParameter(
            GetDigitalAssistantParameterRequest request);

    /**
     * Gets the specified ODA Private Endpoint.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/GetOdaPrivateEndpointExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetOdaPrivateEndpoint API.
     */
    GetOdaPrivateEndpointResponse getOdaPrivateEndpoint(GetOdaPrivateEndpointRequest request);

    /**
     * Gets the specified ODA Private Endpoint Attachment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/GetOdaPrivateEndpointAttachmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetOdaPrivateEndpointAttachment API.
     */
    GetOdaPrivateEndpointAttachmentResponse getOdaPrivateEndpointAttachment(
            GetOdaPrivateEndpointAttachmentRequest request);

    /**
     * Gets the specified ODA Private Endpoint Scan Proxy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/GetOdaPrivateEndpointScanProxyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetOdaPrivateEndpointScanProxy API.
     */
    GetOdaPrivateEndpointScanProxyResponse getOdaPrivateEndpointScanProxy(
            GetOdaPrivateEndpointScanProxyRequest request);

    /**
     * Gets the specified Skill.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/GetSkillExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSkill API.
     */
    GetSkillResponse getSkill(GetSkillRequest request);

    /**
     * Gets the specified Skill Parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/GetSkillParameterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSkillParameter
     *     API.
     */
    GetSkillParameterResponse getSkillParameter(GetSkillParameterRequest request);

    /**
     * Gets the specified Translator.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/GetTranslatorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetTranslator API.
     */
    GetTranslatorResponse getTranslator(GetTranslatorRequest request);

    /**
     * Import a Bot archive from Object Storage.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/ImportBotExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ImportBot API.
     */
    ImportBotResponse importBot(ImportBotRequest request);

    /**
     * Returns a page of Authentication Providers that belong to the specified Digital Assistant
     * instance.
     *
     * <p>If the `opc-next-page` header appears in the response, then there are more items to
     * retrieve. To get the next page in the subsequent GET request, include the header's value as
     * the `page` query parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/ListAuthenticationProvidersExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAuthenticationProviders API.
     */
    ListAuthenticationProvidersResponse listAuthenticationProviders(
            ListAuthenticationProvidersRequest request);

    /**
     * Returns a page of Channels that belong to the specified Digital Assistant instance.
     *
     * <p>If the `opc-next-page` header appears in the response, then there are more items to
     * retrieve. To get the next page in the subsequent GET request, include the header's value as
     * the `page` query parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/ListChannelsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListChannels API.
     */
    ListChannelsResponse listChannels(ListChannelsRequest request);

    /**
     * Returns a page of Parameters that belong to the specified Digital Assistant.
     *
     * <p>If the `opc-next-page` header appears in the response, then there are more items to
     * retrieve. To get the next page in the subsequent GET request, include the header's value as
     * the `page` query parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/ListDigitalAssistantParametersExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListDigitalAssistantParameters API.
     */
    ListDigitalAssistantParametersResponse listDigitalAssistantParameters(
            ListDigitalAssistantParametersRequest request);

    /**
     * Returns a page of Digital Assistants that belong to the specified Digital Assistant instance.
     *
     * <p>If the `opc-next-page` header appears in the response, then there are more items to
     * retrieve. To get the next page in the subsequent GET request, include the header's value as
     * the `page` query parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/ListDigitalAssistantsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListDigitalAssistants API.
     */
    ListDigitalAssistantsResponse listDigitalAssistants(ListDigitalAssistantsRequest request);

    /**
     * Returns a page of ODA Instances attached to this ODA Private Endpoint.
     *
     * <p>If the `opc-next-page` header appears in the response, then there are more items to
     * retrieve. To get the next page in the subsequent GET request, include the header's value as
     * the `page` query parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/ListOdaPrivateEndpointAttachmentsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListOdaPrivateEndpointAttachments API.
     */
    ListOdaPrivateEndpointAttachmentsResponse listOdaPrivateEndpointAttachments(
            ListOdaPrivateEndpointAttachmentsRequest request);

    /**
     * Returns a page of ODA Private Endpoint Scan Proxies that belong to the specified ODA Private
     * Endpoint.
     *
     * <p>If the `opc-next-page` header appears in the response, then there are more items to
     * retrieve. To get the next page in the subsequent GET request, include the header's value as
     * the `page` query parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/ListOdaPrivateEndpointScanProxiesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListOdaPrivateEndpointScanProxies API.
     */
    ListOdaPrivateEndpointScanProxiesResponse listOdaPrivateEndpointScanProxies(
            ListOdaPrivateEndpointScanProxiesRequest request);

    /**
     * Returns a page of ODA Private Endpoints that belong to the specified compartment.
     *
     * <p>If the `opc-next-page` header appears in the response, then there are more items to
     * retrieve. To get the next page in the subsequent GET request, include the header's value as
     * the `page` query parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/ListOdaPrivateEndpointsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListOdaPrivateEndpoints API.
     */
    ListOdaPrivateEndpointsResponse listOdaPrivateEndpoints(ListOdaPrivateEndpointsRequest request);

    /**
     * Returns a page of Skill Parameters that belong to the specified Skill.
     *
     * <p>If the `opc-next-page` header appears in the response, then there are more items to
     * retrieve. To get the next page in the subsequent GET request, include the header's value as
     * the `page` query parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/ListSkillParametersExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSkillParameters
     *     API.
     */
    ListSkillParametersResponse listSkillParameters(ListSkillParametersRequest request);

    /**
     * Returns a page of Skills that belong to the specified Digital Assistant instance.
     *
     * <p>If the `opc-next-page` header appears in the response, then there are more items to
     * retrieve. To get the next page in the subsequent GET request, include the header's value as
     * the `page` query parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/ListSkillsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSkills API.
     */
    ListSkillsResponse listSkills(ListSkillsRequest request);

    /**
     * Returns a page of Translators that belong to the specified Digital Assistant instance.
     *
     * <p>If the `opc-next-page` header appears in the response, then there are more items to
     * retrieve. To get the next page in the subsequent GET request, include the header's value as
     * the `page` query parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/ListTranslatorsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTranslators
     *     API.
     */
    ListTranslatorsResponse listTranslators(ListTranslatorsRequest request);

    /**
     * Publish a draft Digital Assistant. Once published the Digital Assistant cannot be modified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/PublishDigitalAssistantExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     PublishDigitalAssistant API.
     */
    PublishDigitalAssistantResponse publishDigitalAssistant(PublishDigitalAssistantRequest request);

    /**
     * Publish a draft Skill. Once published it cannot be modified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/PublishSkillExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use PublishSkill API.
     */
    PublishSkillResponse publishSkill(PublishSkillRequest request);

    /**
     * This will generate new keys for any generated keys in the Channel (eg. secretKey,
     * verifyToken). If a Channel has no generated keys then no changes will be made. Ensure that
     * you take note of the newly generated keys in the response as they will not be returned again.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/RotateChannelKeysExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use RotateChannelKeys
     *     API.
     */
    RotateChannelKeysResponse rotateChannelKeys(RotateChannelKeysRequest request);

    /**
     * Starts a Channel so that it will begin accepting messages.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/StartChannelExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use StartChannel API.
     */
    StartChannelResponse startChannel(StartChannelRequest request);

    /**
     * Stops a Channel so that it will no longer accept messages.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/StopChannelExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use StopChannel API.
     */
    StopChannelResponse stopChannel(StopChannelRequest request);

    /**
     * Train a skill.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/TrainSkillExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use TrainSkill API.
     */
    TrainSkillResponse trainSkill(TrainSkillRequest request);

    /**
     * Updates the specified Authentication Provider with the information in the request body.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/UpdateAuthenticationProviderExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateAuthenticationProvider API.
     */
    UpdateAuthenticationProviderResponse updateAuthenticationProvider(
            UpdateAuthenticationProviderRequest request);

    /**
     * Updates the specified Channel with the information in the request body.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/UpdateChannelExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateChannel API.
     */
    UpdateChannelResponse updateChannel(UpdateChannelRequest request);

    /**
     * Updates the specified Digital Assistant with the information in the request body.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/UpdateDigitalAssistantExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateDigitalAssistant API.
     */
    UpdateDigitalAssistantResponse updateDigitalAssistant(UpdateDigitalAssistantRequest request);

    /**
     * Updates the specified Digital Assistant Parameter with the information in the request body.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/UpdateDigitalAssistantParameterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateDigitalAssistantParameter API.
     */
    UpdateDigitalAssistantParameterResponse updateDigitalAssistantParameter(
            UpdateDigitalAssistantParameterRequest request);

    /**
     * Starts an asynchronous job to update the specified ODA Private Endpoint with the information
     * in the request body.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/UpdateOdaPrivateEndpointExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateOdaPrivateEndpoint API.
     */
    UpdateOdaPrivateEndpointResponse updateOdaPrivateEndpoint(
            UpdateOdaPrivateEndpointRequest request);

    /**
     * Updates the specified Skill with the information in the request body.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/UpdateSkillExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateSkill API.
     */
    UpdateSkillResponse updateSkill(UpdateSkillRequest request);

    /**
     * Updates the specified Skill Parameter with the information in the request body.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/UpdateSkillParameterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateSkillParameter API.
     */
    UpdateSkillParameterResponse updateSkillParameter(UpdateSkillParameterRequest request);

    /**
     * Updates the specified Translator with the information in the request body.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/UpdateTranslatorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateTranslator
     *     API.
     */
    UpdateTranslatorResponse updateTranslator(UpdateTranslatorRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    ManagementWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    ManagementPaginators getPaginators();
}
