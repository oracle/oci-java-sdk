/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.encryption.internal;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SerializeHeaderTest {
    @Test
    public void testCreateEncryptionHeader_NullContext() {
        Map<String, ?> context = null;
        assertEquals("", SerializeHeader.mapToJson(context));
    }

    @Test
    public void testCreateEncryptionHeader_SimpleContext() {
        Map<String, Object> context = new LinkedHashMap<>();
        context.put("key1", "value1");

        assertEquals("{\"key1\":\"value1\"}", SerializeHeader.mapToJson(context));
    }

    @Test
    public void testCreateEncryptionHeader_TwoSimpleContext() {
        Map<String, Object> context = new LinkedHashMap<>();
        context.put("key1", "value1");
        context.put("key2", "value2");

        assertEquals(
                "{\"key1\":\"value1\",\"key2\":\"value2\"}", SerializeHeader.mapToJson(context));
    }

    @Test
    public void testCreateEncryptionHeader_NestedContext() {
        Map<String, Object> nestedContext = new LinkedHashMap<>();
        nestedContext.put("nestedkey1", "nestedvalue1");
        nestedContext.put("nestedkey2", "nestedvalue2");

        Map<String, Object> context = new LinkedHashMap<>();
        context.put("key1", "value1");
        context.put("key2", "value2");
        context.put("key3", nestedContext);

        assertEquals(
                "{\"key1\":\"value1\",\"key2\":\"value2\",\"key3\":{\"nestedkey1\":\"nestedvalue1\",\"nestedkey2\":\"nestedvalue2\"}}",
                SerializeHeader.mapToJson(context));
    }
}
