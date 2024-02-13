/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference;

import com.oracle.bmc.generativeaiinference.model.CohereLlmInferenceResponse;
import com.oracle.bmc.generativeaiinference.model.GenerateTextResult;
import com.oracle.bmc.generativeaiinference.model.GeneratedText;
import com.oracle.bmc.generativeaiinference.model.LlmInferenceResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Function;

/**
 * GenerateTextResultSseHelper class implements the static function that processes the server-sent
 * events and returns the GenerateTextResult
 */
public class GenerateTextResultSseHelper {
    /**
     * Processes the server-sent events
     *
     * @param entityStream InputStream of server-sent events
     * @return {@link GenerateTextResult}
     */
    public static final Function<InputStream, GenerateTextResult> generateTextResultReader =
            entityStream -> {
                try (BufferedReader reader =
                        new BufferedReader(new InputStreamReader(entityStream))) {
                    String line;
                    List<GeneratedText> generatedTextList = new ArrayList<>();
                    while ((line = reader.readLine()) != null) {
                        if (line.isEmpty() || line.startsWith(":")) {
                            continue;
                        }

                        GeneratedText generatedText = GeneratedText.builder().text(line).build();
                        generatedTextList.add(generatedText);
                    }
                    LlmInferenceResponse response =
                            CohereLlmInferenceResponse.builder()
                                    .generatedTexts(generatedTextList)
                                    .timeCreated(Date.from(Instant.now()))
                                    .build();
                    GenerateTextResult result =
                            GenerateTextResult.builder().inferenceResponse(response).build();
                    return result;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            };
}
