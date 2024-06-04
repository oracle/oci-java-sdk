/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey.sse;

/**
 * Copyright (c) 2023, Oracle and/or its affiliates. All rights reserved. This software is
 * dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at
 * https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at
 * http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.SessionTokenAuthenticationDetailsProvider;
import com.oracle.bmc.generativeaiinference.GenerativeAiInferenceClient;
import com.oracle.bmc.generativeaiinference.GenerativeAiInferenceSseHelper;
import com.oracle.bmc.generativeaiinference.model.*;
import com.oracle.bmc.generativeaiinference.requests.ChatRequest;
import com.oracle.bmc.generativeaiinference.responses.ChatResponse;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.retrier.RetryConfiguration;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides an example of how to use OCI Generative AI Service to generate text.
 *
 * <p>The Generative AI Service queried by this example will be assigned:
 *
 * <ul>
 *   <li>an endpoint url defined by constant ENDPOINT
 *   <li>The configuration file used by service clients will be sourced from the default location
 *       (~/.oci/config) and the CONFIG_PROFILE profile will be used.
 * </ul>
 */
public class GenericChatExample {
    private static final String ENDPOINT = "endpoint";
    private static final Region REGION = Region.US_CHICAGO_1;
    private static final String CONFIG_LOCATION = "~/.oci/config";
    // TODO: Please update config profile name and use the compartmentId that has policies grant
    // permissions for using Generative AI Service
    private static final String CONFIG_PROFILE = "DEFAULT";
    private static final String COMPARTMENT_ID = "compartment_id";

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. This example expects no arguments.
     */
    public static void main(String[] args) throws Exception {
        if (args.length > 0) {
            throw new IllegalArgumentException("This example expects no argument");
        }

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name defined in CONFIG_PROFILE
        // variable.
        final ConfigFileReader.ConfigFile configFile =
                ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);
        final AuthenticationDetailsProvider provider =
                new SessionTokenAuthenticationDetailsProvider(configFile);

        // Set up Generative AI client with credentials and endpoint
        ClientConfiguration clientConfiguration =
                ClientConfiguration.builder()
                        .readTimeoutMillis(240000)
                        .retryConfiguration(RetryConfiguration.NO_RETRY_CONFIGURATION)
                        .build();

        SseSupport sseSupport = new SseSupport(GenerativeAiInferenceSseHelper.chatResultReader);
        ClientConfigurator clientConfigurator = sseSupport.getClientConfigurator();

        final GenerativeAiInferenceClient generativeAiInferenceClient =
                GenerativeAiInferenceClient.builder()
                        .configuration(clientConfiguration)
                        .endpoint(ENDPOINT)
                        .additionalClientConfigurator(clientConfigurator)
                        .build(provider);

        System.out.println("====");
        System.out.println(generativeAiInferenceClient.getEndpoint());

        ChatContent content = TextContent.builder().text("who are you?").build();

        List<ChatContent> contents = new ArrayList<>();
        contents.add(content);

        Message message = UserMessage.builder().content(contents).build();

        List<Message> messages = new ArrayList<>();
        messages.add(message);

        List<String> stops = new ArrayList<>();
        stops.add("word");

        GenericChatRequest genericChatRequest =
                GenericChatRequest.builder()
                        .messages(messages)
                        .maxTokens(200)
                        .numGenerations(1)
                        .frequencyPenalty(0.0)
                        .topP(1.0)
                        .topK(1)
                        .stop(stops)
                        .temperature(1.0)
                        .logProbs(0)
                        .isStream(true)
                        .build();

        ServingMode servingmode =
                OnDemandServingMode.builder().modelId("meta.llama-2-70b-chat").build();

        ChatDetails details =
                ChatDetails.builder()
                        .chatRequest(genericChatRequest)
                        .compartmentId(COMPARTMENT_ID)
                        .servingMode(servingmode)
                        .build();

        ChatRequest request = ChatRequest.builder().chatDetails(details).build();

        ChatResponse response = generativeAiInferenceClient.chat(request);

        GenericChatResponse chatResponse =
                (GenericChatResponse) response.getChatResult().getChatResponse();
        for (ChatChoice choice : chatResponse.getChoices()) {
            TextContent textContent = (TextContent) choice.getMessage().getContent().get(0);
            System.out.print(textContent.getText());
        }

        generativeAiInferenceClient.close();
    }
}
