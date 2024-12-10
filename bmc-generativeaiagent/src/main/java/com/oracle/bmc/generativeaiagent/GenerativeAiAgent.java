/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent;

import com.oracle.bmc.generativeaiagent.requests.*;
import com.oracle.bmc.generativeaiagent.responses.*;

/**
 * **Generative AI Agents API**
 *
 *
 * OCI Generative AI Agents is a fully managed service that combines the power of large language models (LLMs) with an intelligent retrieval system to create contextually relevant answers by searching your knowledge base, making your AI applications smart and efficient.
 *
 * OCI Generative AI Agents supports several ways to onboard your data and then allows you and your customers to interact with your data using a chat interface or API.
 *
 * Use the Generative AI Agents API to create and manage agents, knowledge bases, data sources, endpoints, data ingestion jobs, and work requests.
 *
 * For creating and managing client chat sessions see the {@link #eNGenerative-ai-agents-clientLatest(ENGenerative-ai-agents-clientLatestRequest) eNGenerative-ai-agents-clientLatest}.
 *
 * To learn more about the service, see the [Generative AI Agents documentation](https://docs.cloud.oracle.com/iaas/Content/generative-ai-agents/home.htm).
 *
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
public interface GenerativeAiAgent extends AutoCloseable {

    /**
     * Rebuilds the client from scratch.
     * Useful to refresh certificates.
     */
    void refreshClient();

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
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this Region, however, an IllegalArgumentException will be raised.
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     * <p>
     * Note, this will first try to map the region ID to a known Region and call
     * {@link #setRegion(Region) setRegion}.
     * <p>
     * If no known Region could be determined, it will create an endpoint based on the
     * default endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Determines whether realm specific endpoint should be used or not.
     * Set realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm specific endpoint template, otherwise set it to "false"
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * **CancelWorkRequest**
     * <p>
     * Cancels a work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/CancelWorkRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CancelWorkRequest API.
     */
    CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request);

    /**
     * **ChangeAgentCompartment**
     * <p>
     * Moves an agent into a different compartment within the same tenancy. For information about moving resources between
     * compartments, see [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/ChangeAgentCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeAgentCompartment API.
     */
    ChangeAgentCompartmentResponse changeAgentCompartment(ChangeAgentCompartmentRequest request);

    /**
     * **ChangeAgentEndpointCompartment**
     * <p>
     * Moves an endpoint into a different compartment within the same tenancy. For information about moving resources between
     * compartments, see [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/ChangeAgentEndpointCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeAgentEndpointCompartment API.
     */
    ChangeAgentEndpointCompartmentResponse changeAgentEndpointCompartment(
            ChangeAgentEndpointCompartmentRequest request);

    /**
     * **ChangeKnowledgeBaseCompartment**
     * <p>
     * Moves a knowledge base into a different compartment within the same tenancy. For information about moving resources between
     * compartments, see [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/ChangeKnowledgeBaseCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeKnowledgeBaseCompartment API.
     */
    ChangeKnowledgeBaseCompartmentResponse changeKnowledgeBaseCompartment(
            ChangeKnowledgeBaseCompartmentRequest request);

    /**
     * **CreateAgent**
     * <p>
     * Creates an agent.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/CreateAgentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateAgent API.
     */
    CreateAgentResponse createAgent(CreateAgentRequest request);

    /**
     * **CreateAgentEndpoint**
     * <p>
     * Creates an endpoint.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/CreateAgentEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateAgentEndpoint API.
     */
    CreateAgentEndpointResponse createAgentEndpoint(CreateAgentEndpointRequest request);

    /**
     * **CreateDataIngestionJob**
     * <p>
     * Creates a data ingestion job.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/CreateDataIngestionJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDataIngestionJob API.
     */
    CreateDataIngestionJobResponse createDataIngestionJob(CreateDataIngestionJobRequest request);

    /**
     * **CreateDataSource**
     * <p>
     * Creates a data source.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/CreateDataSourceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDataSource API.
     */
    CreateDataSourceResponse createDataSource(CreateDataSourceRequest request);

    /**
     * **CreateKnowledgeBase**
     * <p>
     * Creates a knowledge base.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/CreateKnowledgeBaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateKnowledgeBase API.
     */
    CreateKnowledgeBaseResponse createKnowledgeBase(CreateKnowledgeBaseRequest request);

    /**
     * **DeleteAgent**
     * <p>
     * Deletes an agent.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/DeleteAgentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteAgent API.
     */
    DeleteAgentResponse deleteAgent(DeleteAgentRequest request);

    /**
     * **DeleteAgentEndpoint**
     * <p>
     * Deletes an endpoint.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/DeleteAgentEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteAgentEndpoint API.
     */
    DeleteAgentEndpointResponse deleteAgentEndpoint(DeleteAgentEndpointRequest request);

    /**
     * **DeleteDataIngestionJob**
     * <p>
     * Deletes a data ingestion job.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/DeleteDataIngestionJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDataIngestionJob API.
     */
    DeleteDataIngestionJobResponse deleteDataIngestionJob(DeleteDataIngestionJobRequest request);

    /**
     * **DeleteDataSource**
     * <p>
     * Deletes a data source.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/DeleteDataSourceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDataSource API.
     */
    DeleteDataSourceResponse deleteDataSource(DeleteDataSourceRequest request);

    /**
     * **DeleteKnowledgeBase**
     * <p>
     * Deletes a knowledge base.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/DeleteKnowledgeBaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteKnowledgeBase API.
     */
    DeleteKnowledgeBaseResponse deleteKnowledgeBase(DeleteKnowledgeBaseRequest request);

    /**
     * **GetAgent**
     * <p>
     * Gets information about an agent.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/GetAgentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAgent API.
     */
    GetAgentResponse getAgent(GetAgentRequest request);

    /**
     * **GetAgentEndpoint**
     * <p>
     * Gets information about an endpoint.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/GetAgentEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAgentEndpoint API.
     */
    GetAgentEndpointResponse getAgentEndpoint(GetAgentEndpointRequest request);

    /**
     * **GetDataIngestionJob**
     * <p>
     * Gets information about a data ingestion job.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/GetDataIngestionJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDataIngestionJob API.
     */
    GetDataIngestionJobResponse getDataIngestionJob(GetDataIngestionJobRequest request);

    /**
     * **GetDataIngestionJobLogContent**
     * <p>
     * Returns the raw log file for the specified data ingestion job in text format.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/GetDataIngestionJobLogContentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDataIngestionJobLogContent API.
     */
    GetDataIngestionJobLogContentResponse getDataIngestionJobLogContent(
            GetDataIngestionJobLogContentRequest request);

    /**
     * **GetDataSource**
     * <p>
     * Gets information about a data source.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/GetDataSourceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDataSource API.
     */
    GetDataSourceResponse getDataSource(GetDataSourceRequest request);

    /**
     * **GetKnowledgeBase**
     * <p>
     * Gets information about a knowledge base.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/GetKnowledgeBaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetKnowledgeBase API.
     */
    GetKnowledgeBaseResponse getKnowledgeBase(GetKnowledgeBaseRequest request);

    /**
     * **GetWorkRequest**
     * <p>
     * Gets the details of a work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/GetWorkRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * **ListAgentEndpoints**
     * <p>
     * Gets a list of endpoints.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/ListAgentEndpointsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAgentEndpoints API.
     */
    ListAgentEndpointsResponse listAgentEndpoints(ListAgentEndpointsRequest request);

    /**
     * **ListAgents**
     * <p>
     * Gets a list of agents.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/ListAgentsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAgents API.
     */
    ListAgentsResponse listAgents(ListAgentsRequest request);

    /**
     * **ListDataIngestionJobs**
     * <p>
     * Gets a list of data ingestion jobs.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/ListDataIngestionJobsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDataIngestionJobs API.
     */
    ListDataIngestionJobsResponse listDataIngestionJobs(ListDataIngestionJobsRequest request);

    /**
     * **ListDataSources**
     * <p>
     * Gets a list of data sources.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/ListDataSourcesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDataSources API.
     */
    ListDataSourcesResponse listDataSources(ListDataSourcesRequest request);

    /**
     * **ListKnowledgeBases**
     * <p>
     * Gets a list of knowledge bases.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/ListKnowledgeBasesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListKnowledgeBases API.
     */
    ListKnowledgeBasesResponse listKnowledgeBases(ListKnowledgeBasesRequest request);

    /**
     * **ListWorkRequestErrors**
     * <p>
     * Lists the errors for a work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/ListWorkRequestErrorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * **ListWorkRequestLogs**
     * <p>
     * Lists the logs for a work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/ListWorkRequestLogsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestLogs API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * **ListWorkRequests**
     * <p>
     * Lists the work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/ListWorkRequestsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequests API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * **UpdateAgent**
     * <p>
     * Updates an agent.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/UpdateAgentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateAgent API.
     */
    UpdateAgentResponse updateAgent(UpdateAgentRequest request);

    /**
     * **UpdateAgentEndpoint**
     * <p>
     * Updates an endpoint.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/UpdateAgentEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateAgentEndpoint API.
     */
    UpdateAgentEndpointResponse updateAgentEndpoint(UpdateAgentEndpointRequest request);

    /**
     * **UpdateDataSource**
     * <p>
     * Updates a data source.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/UpdateDataSourceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDataSource API.
     */
    UpdateDataSourceResponse updateDataSource(UpdateDataSourceRequest request);

    /**
     * **UpdateKnowledgeBase**
     * <p>
     * Updates a knowledge base.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagent/UpdateKnowledgeBaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateKnowledgeBase API.
     */
    UpdateKnowledgeBaseResponse updateKnowledgeBase(UpdateKnowledgeBaseRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    GenerativeAiAgentWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    GenerativeAiAgentPaginators getPaginators();
}
