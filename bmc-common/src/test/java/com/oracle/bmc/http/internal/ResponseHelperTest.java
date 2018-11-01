/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.model.BmcException;
import org.junit.Test;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ResponseHelperTest {
    private static final String OPC_REQUEST_ID = "DummyOPCRequestID";
    private static final MediaType HTML_MEDIA_TYPE = MediaType.TEXT_HTML_TYPE;
    private static final MediaType JSON_MEDIA_TYPE = MediaType.APPLICATION_JSON_TYPE;
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
