/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.signing.internal;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.io.ByteStreams;
import com.oracle.bmc.http.internal.RestClientFactory;
import com.oracle.bmc.http.signing.RequestSignerException;
import com.oracle.bmc.http.signing.SigningStrategy;
import com.oracle.bmc.util.StreamUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.HttpMethod;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

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
    private static final byte[] BYTE_BUFFER = new byte[8196];

    @Mock private Logger mockLogger;
    @Mock private ObjectMapper mockObjectMapper;

    @Before
    public void setUp() throws Exception {
        ThreadLocalRandom.current().nextBytes(BYTE_BUFFER);

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

    @Test
    public void calculateMissingHeaders_postStringContentAsJson() throws IOException {
        calculateAndVerifyMissingHeaders(
                MediaType.APPLICATION_JSON,
                SERIALIZED_MAP_JSON_STRING,
                SERIALIZED_MAP_JSON_STRING.length());
    }

    @Test
    public void calculateMissingHeaders_postStringContentAsPlainText() throws IOException {
        calculateAndVerifyMissingHeaders(
                MediaType.TEXT_PLAIN,
                SERIALIZED_MAP_JSON_STRING,
                SERIALIZED_MAP_JSON_STRING.length());
    }

    @Test
    public void calculateMissingHeaders_postDuplicatableInputStreamAsOctetStream()
            throws IOException {
        final InputStream body = StreamUtils.createByteArrayInputStream(BYTE_BUFFER);
        calculateAndVerifyMissingHeaders(
                MediaType.APPLICATION_OCTET_STREAM, body, BYTE_BUFFER.length);

        // Read the stream one more time to verify it wasn't consumed already and verify content matches source
        assertTrue(Arrays.equals(BYTE_BUFFER, ByteStreams.toByteArray(body)));
    }

    @Test
    public void calculateMissingHeaders_postDuplicatableInputStreamAsPlainText()
            throws IOException {
        final InputStream body = StreamUtils.createByteArrayInputStream(BYTE_BUFFER);
        calculateAndVerifyMissingHeaders(MediaType.TEXT_PLAIN, body, BYTE_BUFFER.length);

        // Read the stream one more time to verify it wasn't consumed already and verify content matches source
        assertTrue(Arrays.equals(BYTE_BUFFER, ByteStreams.toByteArray(body)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateMissingHeaders_postByteArrayBody() throws IOException {
        calculateAndVerifyMissingHeaders(MediaType.TEXT_PLAIN, BYTE_BUFFER, BYTE_BUFFER.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateMissingHeaders_postInputStreamBody() throws IOException {
        calculateAndVerifyMissingHeaders(
                MediaType.TEXT_PLAIN, new ByteArrayInputStream(BYTE_BUFFER), BYTE_BUFFER.length);
    }

    private void calculateAndVerifyMissingHeaders(
            final String contentType, final Object body, final int contentLength)
            throws IOException {
        final URI uri = URI.create("https://identity.us-phoenix-1.oraclecloud.com/20160918/users");
        final Map<String, String> existingHeaders =
                ImmutableMap.of(
                        HttpHeaders.CONTENT_TYPE.toLowerCase(),
                        contentType,
                        "opc-request-id",
                        "2F9BA4A30BB3452397A5BC1BFE447C5D",
                        HttpHeaders.ACCEPT.toLowerCase(),
                        MediaType.APPLICATION_JSON);
        final RequestSignerImpl.SigningConfiguration signingConfiguration =
                new RequestSignerImpl.SigningConfiguration(
                        SigningStrategy.STANDARD.getHeadersToSign(),
                        SigningStrategy.STANDARD.isSkipContentHeadersForStreamingPutRequests());
        final Map<String, String> missingHeaders =
                RequestSignerImpl.calculateMissingHeaders(
                        HttpMethod.POST.toLowerCase(),
                        uri,
                        existingHeaders,
                        body,
                        Constants.ALL_HEADERS,
                        signingConfiguration);
        assertNotNull(missingHeaders);
        assertEquals(4, missingHeaders.size());
        assertTrue(missingHeaders.containsKey(HttpHeaders.DATE.toLowerCase()));
        assertTrue(missingHeaders.containsKey(HttpHeaders.CONTENT_LENGTH.toLowerCase()));
        assertEquals(
                Integer.toString(contentLength),
                missingHeaders.get(HttpHeaders.CONTENT_LENGTH.toLowerCase()));
        assertTrue(missingHeaders.containsKey("x-content-sha256"));
        assertEquals(
                "identity.us-phoenix-1.oraclecloud.com",
                missingHeaders.get(HttpHeaders.HOST.toLowerCase()));
    }
}
