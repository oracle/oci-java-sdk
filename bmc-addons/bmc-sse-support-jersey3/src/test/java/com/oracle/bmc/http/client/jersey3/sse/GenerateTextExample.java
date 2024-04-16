/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey3.sse;
/**
 * Copyright (c) 2023, Oracle and/or its affiliates. All rights reserved. This software is
 * dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at
 * https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at
 * http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.SessionTokenAuthenticationDetailsProvider;
import com.oracle.bmc.generativeaiinference.GenerativeAiInferenceClient;
import com.oracle.bmc.generativeaiinference.GenerativeAiInferenceSseHelper;
import com.oracle.bmc.generativeaiinference.model.*;
import com.oracle.bmc.generativeaiinference.requests.GenerateTextRequest;
import com.oracle.bmc.generativeaiinference.responses.GenerateTextResponse;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.retrier.RetryConfiguration;

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
public class GenerateTextExample {

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

        System.out.println("Start Running GenerateText Example ...");

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name defined in CONFIG_PROFILE
        // variable.
        final ConfigFileReader.ConfigFile configFile =
                ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);
        final SessionTokenAuthenticationDetailsProvider provider =
                new SessionTokenAuthenticationDetailsProvider(configFile);
        // Set up Generative AI client with credentials and endpoint
        ClientConfiguration clientConfiguration =
                ClientConfiguration.builder()
                        .retryConfiguration(RetryConfiguration.NO_RETRY_CONFIGURATION)
                        .build();
        // Create and add new additional client configurator for sse support by using appropriate
        // reader function
        SseSupport sseSupport =
                new SseSupport(GenerativeAiInferenceSseHelper.generateTextResultReader);
        ClientConfigurator clientConfigurator = sseSupport.getClientConfigurator();
        final GenerativeAiInferenceClient generativeAiInferenceClient =
                GenerativeAiInferenceClient.builder()
                        .configuration(clientConfiguration)
                        .additionalClientConfigurator(clientConfigurator)
                        .build(provider);
        generativeAiInferenceClient.setEndpoint(ENDPOINT);
        generativeAiInferenceClient.setRegion(REGION);

        String prompt = "Tell me one fact about Oracle";

        // Construct the inference request
        CohereLlmInferenceRequest cohereLlmInferenceRequest =
                CohereLlmInferenceRequest.builder()
                        .prompt(prompt)
                        .maxTokens(100)
                        .temperature(0.75)
                        .frequencyPenalty(1.0)
                        .topP(0.7)
                        .isStream(true)
                        .isEcho(false)
                        .build();

        // Build generate text request, send, and get response
        GenerateTextDetails generateTextDetails =
                GenerateTextDetails.builder()
                        .servingMode(
                                OnDemandServingMode.builder()
                                        .modelId("cohere.command")
                                        .build()) // "cohere.command-light" is also available to use
                        .compartmentId(COMPARTMENT_ID)
                        .inferenceRequest(cohereLlmInferenceRequest)
                        .build();

        GenerateTextRequest generateTextRequest =
                GenerateTextRequest.builder().generateTextDetails(generateTextDetails).build();

        GenerateTextResponse generateTextResponse =
                generativeAiInferenceClient.generateText(generateTextRequest);
        CohereLlmInferenceResponse res =
                (CohereLlmInferenceResponse)
                        generateTextResponse.getGenerateTextResult().getInferenceResponse();
        for (GeneratedText genText : res.getGeneratedTexts()) {
            System.out.print(genText.getText());
        }

        generativeAiInferenceClient.close();
    }
}
