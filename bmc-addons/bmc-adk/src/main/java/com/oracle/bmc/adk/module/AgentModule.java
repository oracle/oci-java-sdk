/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adk.module;

import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.generativeaiagent.GenerativeAiAgentClient;
import com.oracle.bmc.generativeaiagentruntime.GenerativeAiAgentRuntimeClient;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.retrier.RetryConfiguration;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The AgentModule class provides methods for creating Generative AI Agent clients. It encapsulates
 * the configuration and creation of clients for managing and interacting with Generative AI Agents.
 */
public class AgentModule {
    private static final Logger log = LoggerFactory.getLogger(AgentModule.class);

    /** Constants for client configuration. */
    private static final int CONNECTION_TIMEOUT_MILLIS = 30000;

    private static final int READ_TIMEOUT_MILLIS = 240000;

    /**
     * Creates a Generative AI Agent Management client.
     *
     * @param authProvider the authentication details provider
     * @param region the region for the client
     * @param agentManagementEndpoint the endpoint for agent management
     * @param additionalClientConfiguration additional client configuration
     * @return a GenerativeAiAgentClient instance
     * @throws NullPointerException if authProvider or agentManagementEndpoint is null
     */
    public static GenerativeAiAgentClient getGenerativeAiAgentManagementClient(
            BasicAuthenticationDetailsProvider authProvider,
            String region,
            String agentManagementEndpoint,
            ClientConfigurator additionalClientConfiguration) {

        if (authProvider == null) {
            throw new IllegalArgumentException("authProvider must not be null");
        }
        if (agentManagementEndpoint == null && region == null) {
            throw new IllegalArgumentException(
                    "At least one of 'agentManagementEndpoint' or 'region' must be non-null");
        }

        ClientConfiguration clientConfiguration =
                ClientConfiguration.builder()
                        .retryConfiguration(
                                RetryConfiguration.builder()
                                        .retryCondition(e -> e.getStatusCode() >= 500)
                                        .build())
                        .connectionTimeoutMillis(CONNECTION_TIMEOUT_MILLIS)
                        .readTimeoutMillis(READ_TIMEOUT_MILLIS)
                        .build();

        GenerativeAiAgentClient.Builder builder =
                GenerativeAiAgentClient.builder().configuration(clientConfiguration);

        if (additionalClientConfiguration != null) {
            builder.additionalClientConfigurator(additionalClientConfiguration);
        }

        if (StringUtils.isEmpty(agentManagementEndpoint)) {
            builder.region(region);
        } else {
            builder.endpoint(agentManagementEndpoint);
        }

        return builder.build(authProvider);
    }

    /**
     * Creates a Generative AI Agent Runtime client.
     *
     * @param authProvider the authentication details provider
     * @param region the region for the client
     * @param agentRuntimeEndpoint the endpoint for agent runtime
     * @param additionalClientConfiguration additional client configuration
     * @return a GenerativeAiAgentRuntimeClient instance
     * @throws NullPointerException if authProvider or agentRuntimeEndpoint is null
     */
    public static GenerativeAiAgentRuntimeClient getGenerativeAiAgentRuntimeClient(
            BasicAuthenticationDetailsProvider authProvider,
            String region,
            String agentRuntimeEndpoint,
            ClientConfigurator additionalClientConfiguration) {

        if (authProvider == null) {
            throw new IllegalArgumentException("authProvider must not be null");
        }
        if (agentRuntimeEndpoint == null && region == null) {
            throw new IllegalArgumentException(
                    "At least one of 'agentRuntimeEndpoint' or 'region' must be non-null");
        }

        ClientConfiguration clientConfiguration =
                ClientConfiguration.builder()
                        .retryConfiguration(
                                RetryConfiguration.builder()
                                        .retryCondition(
                                                e ->
                                                        e.getStatusCode() == 429
                                                                || e.getStatusCode() >= 500)
                                        .build())
                        .connectionTimeoutMillis(CONNECTION_TIMEOUT_MILLIS)
                        .readTimeoutMillis(READ_TIMEOUT_MILLIS)
                        .build();

        GenerativeAiAgentRuntimeClient.Builder builder =
                GenerativeAiAgentRuntimeClient.builder().configuration(clientConfiguration);

        if (additionalClientConfiguration != null) {
            builder.additionalClientConfigurator(additionalClientConfiguration);
        }

        if (StringUtils.isEmpty(agentRuntimeEndpoint)) {
            builder.region(region);
        } else {
            builder.endpoint(agentRuntimeEndpoint);
        }

        return builder.build(authProvider);
    }
}
