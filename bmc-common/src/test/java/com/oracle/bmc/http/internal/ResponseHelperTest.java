/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableList;
import com.oracle.bmc.io.internal.ContentLengthVerifyingInputStream;
import com.oracle.bmc.io.internal.WrappedResponseInputStream;
import com.oracle.bmc.model.BmcException;
import org.junit.Test;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import java.io.InputStream;
import java.util.List;

import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

public class ResponseHelperTest {
    private static final String OPC_REQUEST_ID = "DummyOPCRequestID";
    private static final MediaType HTML_MEDIA_TYPE = MediaType.TEXT_HTML_TYPE;
    private static final MediaType JSON_MEDIA_TYPE = MediaType.APPLICATION_JSON_TYPE;
    private static final MediaType JSON_MEDIA_TYPE_WITH_CHARSET =
            MediaType.APPLICATION_JSON_TYPE.withCharset("UTF-8");
    private static final Response.Status BAD_GATEWAY_STATUS = Response.Status.BAD_GATEWAY;

    @Test
    public void test_throwIfNotSuccessful_InvalidHTMLResponse() {
        final Response htmlResponse =
                buildMockResponse(OPC_REQUEST_ID, HTML_MEDIA_TYPE, BAD_GATEWAY_STATUS);

        try {
            ResponseHelper.throwIfNotSuccessful(htmlResponse);
            fail("Should have thrown");
        } catch (BmcException exception) {
            validateExceptionFields(
                    exception,
                    OPC_REQUEST_ID,
                    BAD_GATEWAY_STATUS,
                    "Unknown",
                    "Unexpected Content-Type: " + HTML_MEDIA_TYPE);
        }
    }

    @Test
    public void test_throwIfNotSuccessful_ValidUTF8JsonResponse() {
        final Response jsonResponse =
                buildMockResponse(OPC_REQUEST_ID, JSON_MEDIA_TYPE_WITH_CHARSET, BAD_GATEWAY_STATUS);
        final String dummyServiceCode = "DummyServiceCode";
        final String dummyMessage = "DummyMessage";
        when(jsonResponse.readEntity(ResponseHelper.ErrorCodeAndMessage.class))
                .thenReturn(
                        ResponseHelper.ErrorCodeAndMessage.builder()
                                .code(dummyServiceCode)
                                .message(dummyMessage)
                                .build());

        try {
            ResponseHelper.throwIfNotSuccessful(jsonResponse);
            fail("Should have thrown");
        } catch (BmcException exception) {
            validateExceptionFields(
                    exception, OPC_REQUEST_ID, BAD_GATEWAY_STATUS, dummyServiceCode, dummyMessage);
        }
    }

    @Test
    public void test_throwIfNotSuccessful_ValidJsonResponse() {
        final Response jsonResponse =
                buildMockResponse(OPC_REQUEST_ID, JSON_MEDIA_TYPE, Response.Status.OK);
        ResponseHelper.throwIfNotSuccessful(jsonResponse);
    }

    @Test
    public void test_throwIfNotSuccessful_InvalidJsonResponse() {
        final Response jsonResponse =
                buildMockResponse(OPC_REQUEST_ID, JSON_MEDIA_TYPE, BAD_GATEWAY_STATUS);
        final String dummyServiceCode = "DummyServiceCode";
        final String dummyMessage = "DummyMessage";
        when(jsonResponse.readEntity(ResponseHelper.ErrorCodeAndMessage.class))
                .thenReturn(
                        ResponseHelper.ErrorCodeAndMessage.builder()
                                .code(dummyServiceCode)
                                .message(dummyMessage)
                                .build());

        try {
            ResponseHelper.throwIfNotSuccessful(jsonResponse);
            fail("Should have thrown");
        } catch (BmcException exception) {
            validateExceptionFields(
                    exception, OPC_REQUEST_ID, BAD_GATEWAY_STATUS, dummyServiceCode, dummyMessage);
        }
    }

    @Test
    public void testReadEntity_encodedJsonString() throws Exception {
        Response response = mock(Response.class);
        Response.StatusType statusInfo = mock(Response.StatusType.class);
        // with embedded quote
        String jsonEncodedString = new ObjectMapper().writeValueAsString("foo \" bar");
        assertEquals("\"foo \\\" bar\"", jsonEncodedString);

        Class<String> entityType = String.class;

        when(response.getStatusInfo()).thenReturn(statusInfo);
        when(statusInfo.getFamily()).thenReturn(Response.Status.Family.SUCCESSFUL);
        when(response.getHeaderString(HttpHeaders.CONTENT_TYPE))
                .thenReturn(javax.ws.rs.core.MediaType.APPLICATION_JSON);
        when(response.readEntity(entityType)).thenReturn(jsonEncodedString);

        String responseString = ResponseHelper.readEntity(response, entityType);

        // embedded quote preserved, outer quotes removed
        assertEquals("foo \" bar", responseString);
        verify(response).bufferEntity();
        verify(statusInfo).getFamily();
        verify(response).readEntity(entityType);
        verify(response).getHeaderString(HttpHeaders.CONTENT_TYPE);
    }

    @Test
    public void testReadEntity_streamWithContentType() {
        Response response = mock(Response.class);
        Response.StatusType statusInfo = mock(Response.StatusType.class);
        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
        List<Object> contentType = ImmutableList.<Object>of("text");
        InputStream mockStream = mock(InputStream.class);

        Class<InputStream> entityType = InputStream.class;

        when(response.getStatusInfo()).thenReturn(statusInfo);
        when(statusInfo.getFamily()).thenReturn(Response.Status.Family.SUCCESSFUL);
        when(response.getHeaders()).thenReturn(headers);
        headers.add(HttpHeaders.CONTENT_TYPE, contentType);
        when(response.readEntity(entityType)).thenReturn(mockStream);

        InputStream inputStream = ResponseHelper.readEntity(response, entityType);

        assertThat(inputStream, instanceOf(WrappedResponseInputStream.class));
        verify(response).getStatusInfo();
        verify(statusInfo).getFamily();
        verify(response, atLeastOnce()).getHeaders();
        verify(response).readEntity(entityType);
        verify(response, never()).bufferEntity();
        verify(response).getStringHeaders();
        verifyNoMoreInteractions(response, statusInfo, mockStream);
        assertEquals(ImmutableList.of(contentType), headers.get(HttpHeaders.CONTENT_TYPE));
    }

    @Test
    public void testReadEntity_streamWithoutContentType() {
        Response response = mock(Response.class);
        Response.StatusType statusInfo = mock(Response.StatusType.class);
        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
        InputStream mockStream = mock(InputStream.class);

        Class<InputStream> entityType = InputStream.class;

        when(response.getStatusInfo()).thenReturn(statusInfo);
        when(statusInfo.getFamily()).thenReturn(Response.Status.Family.SUCCESSFUL);
        when(response.getHeaders()).thenReturn(headers);
        when(response.readEntity(entityType)).thenReturn(mockStream);

        InputStream inputStream = ResponseHelper.readEntity(response, entityType);

        assertThat(inputStream, instanceOf(WrappedResponseInputStream.class));
        verify(response).getStatusInfo();
        verify(statusInfo).getFamily();
        verify(response, atLeastOnce()).getHeaders();
        verify(response).readEntity(entityType);
        verify(response, never()).bufferEntity();
        verify(response).getStringHeaders();
        verifyNoMoreInteractions(response, statusInfo, mockStream);
    }

    @Test
    public void testReadEntity_streamWithContentLength() {
        Response response = mock(Response.class);
        Response.StatusType statusInfo = mock(Response.StatusType.class);
        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
        List<Object> contentType = ImmutableList.<Object>of("text");
        InputStream mockStream = mock(InputStream.class);

        Class<InputStream> entityType = InputStream.class;

        when(response.getStatusInfo()).thenReturn(statusInfo);
        when(statusInfo.getFamily()).thenReturn(Response.Status.Family.SUCCESSFUL);
        when(response.getHeaders()).thenReturn(headers);
        headers.add(HttpHeaders.CONTENT_TYPE, contentType);
        headers.add(HttpHeaders.CONTENT_LENGTH, "100");
        MultivaluedMap<String, String> stringHeaders = new MultivaluedHashMap<>();
        stringHeaders.putSingle(HttpHeaders.CONTENT_LENGTH, "100");
        when(response.getStringHeaders()).thenReturn(stringHeaders);
        when(response.readEntity(entityType)).thenReturn(mockStream);

        InputStream inputStream = ResponseHelper.readEntity(response, entityType);

        assertThat(inputStream, instanceOf(ContentLengthVerifyingInputStream.class));
        verify(response).getStatusInfo();
        verify(statusInfo).getFamily();
        verify(response, atLeastOnce()).getHeaders();
        verify(response).readEntity(entityType);
        verify(response, never()).bufferEntity();
        verify(response).getStringHeaders();
        verifyNoMoreInteractions(response, statusInfo, mockStream);
        headers = response.getHeaders();
        stringHeaders = response.getStringHeaders();
        assertEquals(ImmutableList.of(contentType), headers.get(HttpHeaders.CONTENT_TYPE));
        assertEquals(ImmutableList.of("100"), headers.get(HttpHeaders.CONTENT_LENGTH));
        assertEquals(ImmutableList.of("100"), stringHeaders.get(HttpHeaders.CONTENT_LENGTH));
    }

    private static Response buildMockResponse(
            final String opcRequestId, final MediaType mediaType, final Response.Status status) {
        final Response response = mock(Response.class);
        when(response.getHeaderString(BmcException.OPC_REQUEST_ID_HEADER)).thenReturn(opcRequestId);
        when(response.getMediaType()).thenReturn(mediaType);
        when(response.getStatusInfo()).thenReturn(status);
        when(response.getStatus()).thenReturn(status.getStatusCode());
        return response;
    }

    private static void validateExceptionFields(
            final BmcException exception,
            final String opcRequestId,
            final Response.Status status,
            final String serviceCode,
            final String... messageSubStrings) {
        assertEquals(opcRequestId, exception.getOpcRequestId());
        assertEquals(status.getStatusCode(), exception.getStatusCode());
        assertEquals(serviceCode, exception.getServiceCode());

        assertTrue(exception.getMessage().contains(opcRequestId));
        assertTrue(exception.getMessage().contains(String.valueOf(status.getStatusCode())));

        for (String messageSubString : messageSubStrings) {
            assertTrue(exception.getMessage().contains(messageSubString));
        }
    }
}
