/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagentruntime;

import com.oracle.bmc.generativeaiagentruntime.requests.*;
import com.oracle.bmc.generativeaiagentruntime.responses.*;

/**
 * OCI Generative AI Agents is a fully managed service that combines the power of large language models (LLMs) with an intelligent retrieval system to create contextually relevant answers by searching your knowledge base, making your AI applications smart and efficient.
 *
 * OCI Generative AI Agents supports several ways to onboard your data and then allows you and your customers to interact with your data using a chat interface or API.
 *
 * Use the Generative AI Agents Client API to create and manage client chat sessions. A session represents an interactive conversation initiated by a user through an API to engage with an agent. It involves a series of exchanges where the user sends queries or prompts, and the agent responds with relevant information, actions, or assistance based on the user's input. The session persists for the duration of the interaction, maintaining context and continuity to provide coherent and meaningful responses throughout the conversation.
 *
 * For creating and managing agents, knowledge bases, data sources, endpoints, and data ingestion jobs see the {@link #eNGenerative-ai-agentsLatest(ENGenerative-ai-agentsLatestRequest) eNGenerative-ai-agentsLatest}.
 *
 * To learn more about the service, see the [Generative AI Agents documentation](https://docs.oracle.com/iaas/Content/generative-ai-agents/home.htm).
 *
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
public interface GenerativeAiAgentRuntime extends AutoCloseable {

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
     * Chat on endpoint with provided messages.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagentruntime/ChatExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use Chat API.
     */
    ChatResponse chat(ChatRequest request);

    /**
     * A session represents an interactive conversation initiated by a user through an API to engage with an  agent. It involves a series of exchanges where the user sends queries or prompts, and the agent responds with relevant information, actions, or assistance based on the user's input. The session persists for the duration of the interaction, maintaining context and continuity to provide coherent and meaningful responses throughout the conversation.Creates an agent session.
     * <p>
     * Use this API to create an agent session.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagentruntime/CreateSessionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateSession API.
     */
    CreateSessionResponse createSession(CreateSessionRequest request);

    /**
     * Delete a session and all its associated information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagentruntime/DeleteSessionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteSession API.
     */
    DeleteSessionResponse deleteSession(DeleteSessionRequest request);

    /**
     * Return the session resource identified by the session ID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagentruntime/GetSessionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSession API.
     */
    GetSessionResponse getSession(GetSessionRequest request);

    /**
     * Update session metadata, including but not limited to description, tags.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagentruntime/UpdateSessionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateSession API.
     */
    UpdateSessionResponse updateSession(UpdateSessionRequest request);
}
