/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.serialization.jackson;

import org.junit.Test;

import java.io.IOException;
import java.time.Duration;

public class Jersey3SerializationTest {

    @Test
    public void durationClassModuleRegistered() throws IOException {
        Duration duration = Duration.ofSeconds(60);
        // Below lines will fail if JavaTimeModule for Duration class is not registered
        String durationStr =
                JacksonSerializer.getDefaultObjectMapper().writeValueAsString(duration);
        JacksonSerializer.getDefaultObjectMapper().readValue(durationStr, Duration.class);
    }
}
