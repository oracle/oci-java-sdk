/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adk.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.oracle.bmc.adk.run.RunResponse;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class RunResponseTest {

    @Test
    public void testPrettyPrintWithValidData() {
        // Setup valid data
        Map<String, Object> contentMap = new HashMap<>();
        contentMap.put("text", "Sample response text");

        Map<String, Object> messageMap = new HashMap<>();
        messageMap.put("content", contentMap);

        Map<String, Object> chatResultMap = new HashMap<>();
        chatResultMap.put("message", messageMap);

        Map<String, Object> data = new HashMap<>();
        data.put("chatResult", chatResultMap);

        // Create RunResponse instance with a NoOpLogger
        RunResponse runResponse = new RunResponse(data, "session123");

        // Call the method under test
        runResponse.prettyPrint();

        // If needed, you can verify that your `getOutput` method works
        String output = runResponse.getOutput();
        assertEquals("Sample response text", output);
    }
}
