/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.signing.internal;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URI;
import java.security.interfaces.RSAPrivateKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.ws.rs.HttpMethod;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oracle.bmc.http.internal.RestClientFactory;
import com.oracle.bmc.http.signing.RequestSignerException;
import com.oracle.bmc.http.signing.SigningStrategy;
import com.oracle.bmc.io.internal.KeepOpenInputStream;
import com.oracle.bmc.util.StreamUtils;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.any;
import static org.powermock.api.mockito.PowerMockito.mock;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest({LoggerFactory.class, RestClientFactory.class, RequestSignerImpl.class})
public class RequestSignerImplTest {
    private static final String SERIALIZED_MAP_JSON_STRING = "{\"header\":[\"value1\",\"value2\"]}";
    private static final byte[] BYTE_BUFFER = new byte[8196];

    @Rule public ExpectedException thrown = ExpectedException.none();

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

        final Map<String, List<String>> actual = RequestSignerImpl.ignoreCaseHeaders(headers);

        assertNotNull("Map should not be null", actual);
        assertEquals("Map should contain 3 entries", 3, actual.size());
        for (Map.Entry<String, List<String>> expectedEntry : headers.entrySet()) {
            final String expectedKey = expectedEntry.getKey();
            final List<String> expectedValue = expectedEntry.getValue();

            assertTrue(
                    "Actual map should contain matching key for lower case value",
                    actual.containsKey(expectedKey.toLowerCase()));
            final List<String> actualValue = actual.get(expectedKey.toLowerCase());
            assertEquals(
                    "Values should be equal for key: " + expectedKey, expectedValue, actualValue);
        }
    }

    // Reload the classes so PowerMockito can inject the static mocks.
    @PrepareForTest({LoggerFactory.class, RestClientFactory.class, RequestSignerImpl.class})
    @Test
    public void ignoreCaseHeaders_whenDuplicateHeaderKeysExists() throws Exception {
        final Map<String, List<String>> headers = new HashMap<>();
        headers.put("content-length", Collections.singletonList("238"));
        headers.put("opc-request-id", new ArrayList<>(Arrays.asList("ID1", "ID2")));

        final Map<String, List<String>> actual = RequestSignerImpl.ignoreCaseHeaders(headers);

        assertNotNull("Map should not be null", actual);
        assertEquals("Map should contain 2 entries", 2, actual.size());
        for (Map.Entry<String, List<String>> expectedEntry : headers.entrySet()) {
            final String expectedKey = expectedEntry.getKey();
            final List<String> expectedValue = expectedEntry.getValue();

            assertTrue(
                    "Actual map should contain matching key for lower case value",
                    actual.containsKey(expectedKey.toLowerCase()));
            final List<String> actualValue = actual.get(expectedKey.toLowerCase());
            assertEquals(
                    "Values should be equal for key: " + expectedKey, expectedValue, actualValue);
        }
    }

    // Reload the classes so PowerMockito can inject the static mocks.
    @PrepareForTest({LoggerFactory.class, RestClientFactory.class, RequestSignerImpl.class})
    @Test
    public void calculateStringToSign_whenDuplicateHeaderKeysExists() {
        final Map<String, List<String>> headers = new HashMap<>();
        headers.put("content-length", Collections.singletonList("238"));
        headers.put("opc-request-id", new ArrayList<>(Arrays.asList("ID1", "ID2")));

        try {
            RequestSignerImpl.calculateStringToSign(
                    "get",
                    "/path",
                    headers,
                    Collections.unmodifiableList(Arrays.asList("opc-request-id")),
                    headers);
            fail("Should have thrown");
        } catch (RequestSignerException e) {
            assertEquals("Expecting exactly one value for header opc-request-id", e.getMessage());
        }
    }

    // Reload the classes so PowerMockito can inject the static mocks.
    @PrepareForTest({LoggerFactory.class, RestClientFactory.class, RequestSignerImpl.class})
    @Test
    public void signRequest_withOptionallySignedHeader()
            throws IllegalAccessException, NoSuchFieldException {
        final Map<String, List<String>> headers = new HashMap<>();
        headers.put("content-length", Collections.singletonList("238"));
        headers.put("opc-request-id", new ArrayList<>(Arrays.asList("ID1", "ID2")));
        headers.put(Constants.CROSS_TENANCY_REQUEST_HEADER_NAME, Collections.singletonList("foo"));

        URI uri = URI.create("https://test.us-phoenix-1.oraclecloud.com/20181016/paths");
        String keyId = "keyId";

        KeySupplier<RSAPrivateKey> keySupplier =
                (KeySupplier<RSAPrivateKey>) mock(KeySupplier.class);

        RSAPrivateKey privateKey = mock(RSAPrivateKey.class);
        when(keySupplier.supplyKey(keyId)).thenReturn(Optional.of(privateKey));

        SignatureSigner signer = mock(SignatureSigner.class);

        Field signerField = RequestSignerImpl.class.getDeclaredField("SIGNER");
        boolean wasAccessible = signerField.isAccessible();
        signerField.setAccessible(true);
        signerField.set(null, signer);
        if (!wasAccessible) {
            signerField.setAccessible(false);
        }

        byte[] signature = new byte[] {1, 2, 3, 4, 5};
        when(signer.sign(any(RSAPrivateKey.class), any(byte[].class), any(String.class)))
                .thenReturn(signature);

        RequestSignerImpl.SigningConfiguration signingConfiguration =
                new RequestSignerImpl.SigningConfiguration(
                        SigningStrategy.STANDARD.getHeadersToSign(),
                        SigningStrategy.STANDARD.getOptionalHeadersToSign(),
                        SigningStrategy.STANDARD.isSkipContentHeadersForStreamingPutRequests());
        String verb = "get";
        Map<String, String> authHeaders =
                RequestSignerImpl.signRequest(
                        Algorithm.RSAPSS256,
                        uri,
                        verb,
                        headers,
                        null,
                        SignedRequestVersion.getLatestVersion().getVersionName(),
                        keyId,
                        keySupplier,
                        signingConfiguration);

        String authorization = authHeaders.get(Constants.AUTHORIZATION_HEADER);

        Pattern headersPattern = Pattern.compile("headers=\"([^\"]*)\"");
        Matcher matcher = headersPattern.matcher(authorization);
        assertTrue(matcher.find());
        Set<String> authorizationHeaders =
                Collections.unmodifiableSet(
                        new HashSet<>(Arrays.asList(matcher.group(1).split(" "))));

        // all required headers are there
        for (String requiredHeader : SigningStrategy.STANDARD.getHeadersToSign().get(verb)) {
            // needs to be in the signature
            assertTrue(authorizationHeaders.contains(requiredHeader));
            if (requiredHeader.equals(Constants.REQUEST_TARGET)) {
                // this is only signed, not passed as header
                assertFalse(authHeaders.containsKey(requiredHeader));
            } else {
                assertTrue(authHeaders.containsKey(requiredHeader));
                if (headers.containsKey(requiredHeader)) {
                    // if it exists, it should have the same value
                    assertEquals(
                            headers.get(requiredHeader).get(0), authHeaders.get(requiredHeader));
                }
            }
        }

        // the optionally signed header, CROSS_TENANCY_REQUEST_HEADER_NAME, is there
        for (String optionalHeader :
                SigningStrategy.STANDARD.getOptionalHeadersToSign().get(verb)) {
            if (!headers.containsKey(optionalHeader)) {
                // wasn't passed, shouldn't be there
                assertFalse(authHeaders.containsKey(optionalHeader));
                // should not be in the signature
                assertFalse(authorizationHeaders.contains(optionalHeader));
            } else {
                assertTrue(authHeaders.containsKey(optionalHeader));
                if (headers.containsKey(optionalHeader)) {
                    // if it exists, it should have the same value
                    assertEquals(
                            headers.get(optionalHeader).get(0), authHeaders.get(optionalHeader));
                }
                // needs to be in the signature
                assertTrue(authorizationHeaders.contains(optionalHeader));
            }
        }
    }

    @Test
    public void calculateMissingHeaders_postStringContentAsJson() throws IOException {
        calculateAndVerifyMissingHeaders(
                HttpMethod.POST,
                MediaType.APPLICATION_JSON,
                SERIALIZED_MAP_JSON_STRING,
                SERIALIZED_MAP_JSON_STRING.length(),
                SigningStrategy.STANDARD);
    }

    @Test
    public void calculateMissingHeaders_postStringContentAsPlainText() throws IOException {
        calculateAndVerifyMissingHeaders(
                HttpMethod.POST,
                MediaType.TEXT_PLAIN,
                SERIALIZED_MAP_JSON_STRING,
                SERIALIZED_MAP_JSON_STRING.length(),
                SigningStrategy.STANDARD);
    }

    @Test
    public void calculateMissingHeaders_postDuplicatableInputStreamAsOctetStream()
            throws IOException {
        final InputStream body = StreamUtils.createByteArrayInputStream(BYTE_BUFFER);
        calculateAndVerifyMissingHeaders(
                HttpMethod.POST,
                MediaType.APPLICATION_OCTET_STREAM,
                body,
                BYTE_BUFFER.length,
                SigningStrategy.STANDARD);

        // Read the stream one more time to verify it wasn't consumed already and verify content matches source
        assertTrue(Arrays.equals(BYTE_BUFFER, StreamUtils.toByteArray(body)));
    }

    @Test
    public void calculateMissingHeaders_postDuplicatableInputStreamAsPlainText()
            throws IOException {
        final InputStream body = StreamUtils.createByteArrayInputStream(BYTE_BUFFER);
        calculateAndVerifyMissingHeaders(
                HttpMethod.POST,
                MediaType.TEXT_PLAIN,
                body,
                BYTE_BUFFER.length,
                SigningStrategy.STANDARD);

        // Read the stream one more time to verify it wasn't consumed already and verify content matches source
        assertTrue(Arrays.equals(BYTE_BUFFER, StreamUtils.toByteArray(body)));
    }

    @Test
    public void calculateMissingHeaders_postByteArrayBody() throws IOException {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Unexpected body type");

        calculateAndVerifyMissingHeaders(
                HttpMethod.POST,
                MediaType.TEXT_PLAIN,
                BYTE_BUFFER,
                BYTE_BUFFER.length,
                SigningStrategy.STANDARD);
    }

    @Test
    public void calculateMissingHeaders_postInputStreamBody() throws IOException {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Only DuplicatableInputStream supported for body that needs signing");

        calculateAndVerifyMissingHeaders(
                HttpMethod.POST,
                MediaType.TEXT_PLAIN,
                new ByteArrayInputStream(BYTE_BUFFER),
                BYTE_BUFFER.length,
                SigningStrategy.STANDARD);
    }

    @Test
    public void calculateMissingHeaders_postKeepOpenInputStreamBody() throws IOException {
        final KeepOpenInputStream body =
                new KeepOpenInputStream(new ByteArrayInputStream(BYTE_BUFFER));
        calculateAndVerifyMissingHeaders(
                HttpMethod.POST,
                MediaType.TEXT_PLAIN,
                body,
                BYTE_BUFFER.length,
                SigningStrategy.STANDARD);

        // Read the stream one more time to verify it wasn't consumed already and verify content matches source
        assertTrue(Arrays.equals(BYTE_BUFFER, StreamUtils.toByteArray(body)));
    }

    @Test
    public void calculateMissingHeaders_postInputStreamBodyWithExcludeBodySigningStrategy()
            throws IOException {
        calculateAndVerifyMissingHeaders(
                HttpMethod.POST,
                MediaType.TEXT_PLAIN,
                new ByteArrayInputStream(BYTE_BUFFER),
                BYTE_BUFFER.length,
                SigningStrategy.EXCLUDE_BODY);
    }

    @Test
    public void calculateMissingHeaders_putInputStreamBodyWithExcludeBodySigningStrategy()
            throws IOException {
        calculateAndVerifyMissingHeaders(
                HttpMethod.PUT,
                MediaType.TEXT_PLAIN,
                new ByteArrayInputStream(BYTE_BUFFER),
                BYTE_BUFFER.length,
                SigningStrategy.EXCLUDE_BODY);
    }

    @Test
    public void calculateMissingHeaders_patchInputStreamBodyWithExcludeBodySigningStrategy()
            throws IOException {
        calculateAndVerifyMissingHeaders(
                HttpMethod.PATCH,
                MediaType.TEXT_PLAIN,
                new ByteArrayInputStream(BYTE_BUFFER),
                BYTE_BUFFER.length,
                SigningStrategy.EXCLUDE_BODY);
    }

    @Test
    public void calculateMissingHeaders_getInputStreamBodyWithExcludeBodySigningStrategy()
            throws IOException {
        thrown.expect(RequestSignerException.class);
        thrown.expectMessage("MUST NOT send body on non-POST/PUT/PATCH request");

        calculateAndVerifyMissingHeaders(
                HttpMethod.GET,
                MediaType.TEXT_PLAIN,
                new ByteArrayInputStream(BYTE_BUFFER),
                BYTE_BUFFER.length,
                SigningStrategy.EXCLUDE_BODY);
    }

    @Test
    public void calculateMissingHeaders_deleteInputStreamBodyWithExcludeBodySigningStrategy()
            throws IOException {
        thrown.expect(RequestSignerException.class);
        thrown.expectMessage("MUST NOT send body on non-POST/PUT/PATCH request");

        calculateAndVerifyMissingHeaders(
                HttpMethod.DELETE,
                MediaType.TEXT_PLAIN,
                new ByteArrayInputStream(BYTE_BUFFER),
                BYTE_BUFFER.length,
                SigningStrategy.EXCLUDE_BODY);
    }

    @Test
    public void calculateMissingHeaders_optionsInputStreamBodyWithExcludeBodySigningStrategy()
            throws IOException {
        thrown.expect(RequestSignerException.class);
        thrown.expectMessage("MUST NOT send body on non-POST/PUT/PATCH request");

        calculateAndVerifyMissingHeaders(
                HttpMethod.OPTIONS,
                MediaType.TEXT_PLAIN,
                new ByteArrayInputStream(BYTE_BUFFER),
                BYTE_BUFFER.length,
                SigningStrategy.EXCLUDE_BODY);
    }

    @Test
    public void calculateMissingHeaders_headInputStreamBodyWithExcludeBodySigningStrategy()
            throws IOException {
        thrown.expect(RequestSignerException.class);
        thrown.expectMessage("MUST NOT send body on non-POST/PUT/PATCH request");

        calculateAndVerifyMissingHeaders(
                HttpMethod.HEAD,
                MediaType.TEXT_PLAIN,
                new ByteArrayInputStream(BYTE_BUFFER),
                BYTE_BUFFER.length,
                SigningStrategy.EXCLUDE_BODY);
    }

    private void calculateAndVerifyMissingHeaders(
            final String httpMethod,
            final String contentType,
            final Object body,
            final int contentLength,
            final SigningStrategy signingStrategy)
            throws IOException {
        final URI uri = URI.create("https://identity.us-phoenix-1.oraclecloud.com/20160918/users");
        final Map<String, List<String>> temp = new HashMap<>();
        temp.put(
                HttpHeaders.CONTENT_TYPE.toLowerCase(),
                Collections.unmodifiableList(Arrays.asList(contentType)));
        temp.put(
                "opc-request-id",
                Collections.unmodifiableList(Arrays.asList("2F9BA4A30BB3452397A5BC1BFE447C5D")));
        temp.put(
                HttpHeaders.ACCEPT.toLowerCase(),
                Collections.unmodifiableList(Arrays.asList(MediaType.APPLICATION_JSON)));
        final Map<String, List<String>> existingHeaders = Collections.unmodifiableMap(temp);
        final RequestSignerImpl.SigningConfiguration signingConfiguration =
                new RequestSignerImpl.SigningConfiguration(
                        signingStrategy.getHeadersToSign(),
                        signingStrategy.getOptionalHeadersToSign(),
                        signingStrategy.isSkipContentHeadersForStreamingPutRequests());
        final Map<String, String> missingHeaders =
                RequestSignerImpl.calculateMissingHeaders(
                        httpMethod.toLowerCase(),
                        uri,
                        existingHeaders,
                        body,
                        Constants.ALL_HEADERS_LIST,
                        signingConfiguration);
        assertNotNull(missingHeaders);
        int expectedMissingHeaderSize =
                (signingStrategy.isSkipContentHeadersForStreamingPutRequests()) ? 2 : 4;
        assertEquals(expectedMissingHeaderSize, missingHeaders.size());
        assertTrue(missingHeaders.containsKey(HttpHeaders.DATE.toLowerCase()));
        if (!signingStrategy.isSkipContentHeadersForStreamingPutRequests()) {
            assertTrue(missingHeaders.containsKey(HttpHeaders.CONTENT_LENGTH.toLowerCase()));
            assertEquals(
                    Integer.toString(contentLength),
                    missingHeaders.get(HttpHeaders.CONTENT_LENGTH.toLowerCase()));
            assertTrue(missingHeaders.containsKey("x-content-sha256"));
        }
        assertEquals(
                "identity.us-phoenix-1.oraclecloud.com",
                missingHeaders.get(HttpHeaders.HOST.toLowerCase()));
    }
}
