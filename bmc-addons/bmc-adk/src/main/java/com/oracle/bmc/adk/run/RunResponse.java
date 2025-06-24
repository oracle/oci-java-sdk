/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adk.run;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oracle.bmc.adk.error.AgentException;
import com.oracle.bmc.adk.utils.Console;
import java.util.Map;
import java.util.Optional;

/** Represents a response from a run operation, containing data and a session ID. */
public class RunResponse {
    /**
     * Returns the data associated with the response.
     *
     * @return the data
     */
    private final Map<String, Object> data;

    private final String sessionId;
    private static final ObjectMapper objectMapper = new ObjectMapper();

    /**
     * Constructs a new instance of {@link RunResponse} with the given data and session ID.
     *
     * @param data the data associated with the response
     * @param sessionId the session ID associated with the response
     */
    public RunResponse(Map<String, Object> data, String sessionId) {
        this.data = data;
        this.sessionId = sessionId;
    }

    /** Getter for data */
    public Map<String, Object> getData() {
        return data;
    }

    /** Getter for sessionId */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Pretty-prints the contents of the RunResponse object, including the text response and the raw
     * JSON data. The output is logged to the console.
     *
     * <p>Note that this method assumes a specific structure for the response data, namely: - A
     * "chatResult" key containing a map - A "message" key within the "chatResult" map, containing
     * another map - A "content" key within the "message" map, containing yet another map - A "text"
     * key within the "content" map, containing the actual text response
     *
     * <p>If any part of this structure is missing or malformed, an exception will be caught and its
     * stack trace printed to the console.
     */
    public void prettyPrint() {
        try {
            Map<String, Object> chatResult = (Map<String, Object>) data.get("chatResult");
            Map<String, Object> message = (Map<String, Object>) chatResult.get("message");
            Map<String, Object> content = (Map<String, Object>) message.get("content");
            String messageText =
                    "text response:\n"
                            + content.get("text")
                            + "\n\ndata:\n"
                            + objectMapper
                                    .writerWithDefaultPrettyPrinter()
                                    .writeValueAsString(this.data);
            Console.log(Console.Color.WHITE, "Agent run response: " + messageText);
        } catch (Exception e) {
            throw new AgentException("Error occurred while printing the agent response.", e);
        }
    }

    /**
     * @deprecated Use {@link #getFinalOutput()} instead. Extracts and returns the output text from
     *     the response data.
     *     <p>This method navigates through the nested maps in the response data to retrieve the
     *     output text. It checks for the presence of each required key ("chatResult", "message",
     *     "content", and "text") before attempting to access the corresponding value. If any part
     *     of the expected structure is missing, it logs an error message and returns a default
     *     string indicating that no response text is available.
     * @return the extracted output text, or "No response text available" if extraction fails
     */
    public String getOutput() {
        return getFinalOutput().orElse(null);
    }

    /**
     * Retrieves the final output text from the response data, wrapped in an Optional.
     *
     * <p>This method navigates through the nested maps in the response data to retrieve the output
     * text. It checks for the presence of each required key ("chatResult", "message", "content",
     * and "text") before attempting to access the corresponding value. If any part of the expected
     * structure is missing, it logs an error message and returns an empty Optional.
     *
     * @return an Optional containing the extracted output text, or an empty Optional if extraction
     *     fails
     */
    public Optional<String> getFinalOutput() {
        try {
            if (data == null) {
                return Optional.empty();
            }
            Map<String, Object> chatResult = (Map<String, Object>) data.get("chatResult");
            if (chatResult == null) {
                return Optional.empty();
            }
            Map<String, Object> message = (Map<String, Object>) chatResult.get("message");
            if (message == null) {
                return Optional.empty();
            }
            Map<String, Object> content = (Map<String, Object>) message.get("content");
            if (content == null) {
                return Optional.empty();
            }
            String output = (String) content.get("text");
            if (output == null) {
                return Optional.empty();
            }
            return Optional.of(output);
        } catch (Exception e) {
            Console.error(
                    Console.Color.RED, "Error extracting output from response. " + e.getMessage());
            return Optional.empty();
        }
    }
}
