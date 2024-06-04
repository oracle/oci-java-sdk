/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference;

import com.oracle.bmc.generativeaiinference.model.*;
import com.oracle.bmc.http.client.Serializer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * GenerativeAiInferenceSseHelper class implements the static function that processes the
 * server-sent events
 */
public class GenerativeAiInferenceSseHelper {
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
                    String patternString = "\"text\"\\s*:\\s*\"([^\"]*)\"";
                    Pattern pattern = Pattern.compile(patternString);
                    while ((line = reader.readLine()) != null) {
                        if (line.isEmpty() || line.startsWith(":")) {
                            continue;
                        }
                        Matcher matcher = pattern.matcher(line);

                        if (matcher.find()) {
                            String textField = matcher.group(1);
                            GeneratedText generatedText =
                                    GeneratedText.builder().text(textField).build();
                            generatedTextList.add(generatedText);
                        }
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

    /**
     * Processes the server-sent events
     *
     * @param entityStream InputStream of server-sent events
     * @return {@link ChatResult}
     */
    public static final Function<InputStream, ChatResult> chatResultReader =
            entityStream -> {
                try (BufferedReader reader =
                        new BufferedReader(new InputStreamReader(entityStream))) {
                    String line;
                    List<ChatChoice> chatChoiceList = new ArrayList<>();
                    String patternString = "\"text\"\\s*:\\s*\"([^\"]*)\"";
                    Pattern pattern = Pattern.compile(patternString);
                    while ((line = reader.readLine()) != null) {
                        if (line.isEmpty() || line.startsWith(":")) {
                            continue;
                        }

                        Matcher matcher = pattern.matcher(line);

                        if (matcher.find()) {
                            String textField = matcher.group(1);
                            ChatContent chatContent = TextContent.builder().text(textField).build();
                            List<ChatContent> chatContentList = new ArrayList<>();
                            chatContentList.add(chatContent);
                            Message message =
                                    AssistantMessage.builder().content(chatContentList).build();
                            ChatChoice chatChoice = ChatChoice.builder().message(message).build();
                            chatChoiceList.add(chatChoice);
                        }
                    }

                    GenericChatResponse chatResponse =
                            GenericChatResponse.builder().choices(chatChoiceList).build();
                    ChatResult chatResult = ChatResult.builder().chatResponse(chatResponse).build();
                    return chatResult;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            };
}
