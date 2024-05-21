/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.After;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Unit tests for CustomObjectMapper.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CustomObjectMapperTest {

    @Test
    public void ztestCustomMapperWithDefinedClass() {
        System.setProperty(
                "oci.javasdk.http.serialization.defaultObjectMapper",
                "com.oracle.bmc.http.CustomTestObjectMapper");
        ObjectMapper customMapper = Serialization.getCustomObjectMapper();
        org.junit.Assert.assertTrue(customMapper instanceof CustomTestObjectMapper);
        System.setProperty("oci.javasdk.http.serialization.defaultObjectMapper", "");
    }

    @Test
    public void testCustomMapperWithUndefinedClassDoesNotThrowException() {
        System.setProperty(
                "oci.javasdk.http.serialization.defaultObjectMapper",
                "com.oracle.bmc.http.NotFoundObjectMapper");
        ObjectMapper customMapper = Serialization.getCustomObjectMapper();
        org.junit.Assert.assertNull(customMapper);
        System.setProperty("oci.javasdk.http.serialization.defaultObjectMapper", "");
    }

    @Test
    public void testCustomMapperWithNoObjectMapperInstanceDoesNotThrowException() {
        System.setProperty(
                "oci.javasdk.http.serialization.defaultObjectMapper",
                "com.oracle.bmc.http.CustomTestClass");
        ObjectMapper customMapper = Serialization.getCustomObjectMapper();
        org.junit.Assert.assertNull(customMapper);
        System.setProperty("oci.javasdk.http.serialization.defaultObjectMapper", "");
    }
}

class CustomTestObjectMapper extends ObjectMapper {}

class CustomTestClass {}
