/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.signing.internal;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import com.oracle.bmc.http.internal.RestClientFactory;
import com.oracle.bmc.http.signing.RequestSignerException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest({LoggerFactory.class, RestClientFactory.class, RequestSignerImpl.class})
public class RequestSignerImplTest {
    private static final String SERIALIZED_MAP_JSON_STRING = "{\"header\":[\"value1\",\"value2\"]}";

    @Mock private Logger mockLogger;
    @Mock private ObjectMapper mockObjectMapper;

    @Before
    public void setUp() throws Exception {
        mockStatic(LoggerFactory.class);
        when(LoggerFactory.getLogger(any(Class.class))).thenReturn(mockLogger);

        mockStatic(LoggerFactory.class);
        when(LoggerFactory.getLogger(any(Class.class))).thenReturn(mockLogger);

        mockStatic(RestClientFactory.class);
        when(RestClientFactory.getObjectMapper()).thenReturn(mockObjectMapper);
        when(mockObjectMapper.writeValueAsString(any())).thenReturn(SERIALIZED_MAP_JSON_STRING);
    }

    @Test
    public void ignoreCaseHeaders_shouldReturnMapWithLowerCaseKeys_whenHeadersContainUpperCaseKeys()
            throws Exception {
        final Map<String, List<String>> headers = new HashMap<>();
        headers.put("Content-Length", Collections.singletonList("238"));
        headers.put("Content-Type", Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.put("OPC-REQUEST-ID", Collections.singletonList("RequestID"));

        final Map<String, String> actual = RequestSignerImpl.ignoreCaseHeaders(headers);

        assertNotNull("Map should not be null", actual);
        assertEquals("Map should contain 3 entries", 3, actual.size());
        for (Map.Entry<String, List<String>> expectedEntry : headers.entrySet()) {
            final String expectedKey = expectedEntry.getKey();
            final String expectedValue = expectedEntry.getValue().get(0);

            assertTrue(
                    "Actual map should contain matching key for lower case value",
                    actual.containsKey(expectedKey.toLowerCase()));
            final String actualValue = actual.get(expectedKey.toLowerCase());
            assertEquals(
                    "Values should be equal for key: " + expectedKey, expectedValue, actualValue);
        }
    }

    // Reload the classes so PowerMockito can inject the static mocks.
    @PrepareForTest({LoggerFactory.class, RestClientFactory.class, RequestSignerImpl.class})
    @Test
    public void ignoreCaseHeaders_shouldThrowRequestSignerException_whenDuplicateHeaderKeysExists()
            throws Exception {
        final Map<String, List<String>> headers = new HashMap<>();
        headers.put("content-length", Collections.singletonList("238"));
        headers.put("opc-request-id", Lists.newArrayList("ID1", "ID2"));

        try {
            RequestSignerImpl.ignoreCaseHeaders(headers);
            fail("RequestSignerException should have been thrown");
        } catch (RequestSignerException ex) {
            assertTrue(
                    "Exception message should contain key with duplicate entries",
                    ex.getMessage()
                            .contains("Expecting exactly one value for header opc-request-id"));
            verify(mockObjectMapper).writeValueAsString(eq(headers));

            final ArgumentCaptor<String> logMessageCaptor = ArgumentCaptor.forClass(String.class);
            verify(mockLogger)
                    .error(
                            logMessageCaptor.capture(),
                            eq("opc-request-id"),
                            eq(SERIALIZED_MAP_JSON_STRING),
                            eq(ex));

            final String actaulLogMessageValue = logMessageCaptor.getValue();
            assertTrue(
                    "Logging messages should contain the base message",
                    actaulLogMessageValue.contains("More than one value for header [{}] found."));
        }
    }
}
