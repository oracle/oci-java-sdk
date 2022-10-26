/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

import com.oracle.bmc.http.client.HttpClient;
import com.oracle.bmc.http.client.HttpRequest;
import com.oracle.bmc.http.client.HttpResponse;
import com.oracle.bmc.http.client.Method;
import com.oracle.bmc.model.BmcException;
import org.junit.Test;
import org.slf4j.Logger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ClientCallTest {
    @Test
    public void testCheckError() throws URISyntaxException {
        HttpClient mockClient = mock(HttpClient.class);
        HttpRequest mockRequest = mock(HttpRequest.class);
        Logger mockLogger = mock(Logger.class);
        HttpResponse mockResponse = mock(HttpResponse.class);

        when(mockClient.createRequest(any())).thenReturn(mockRequest);
        when(mockRequest.offloadExecutor(any())).thenReturn(mockRequest);
        when(mockRequest.copy()).thenReturn(mockRequest);
        URI uri = new URI("https://localhost");
        when(mockRequest.uri()).thenReturn(uri);

        CompletableFuture<HttpResponse> completableFuture =
                CompletableFuture.completedFuture(mockResponse);
        when(mockRequest.execute()).thenReturn(completableFuture);

        when(mockResponse.header("content-type")).thenReturn("application/json");
        Map<String, String> args = new HashMap<>();
        args.put("key1", "value1");
        args.put("key2", "value2");
        ResponseHelper.ErrorCodeAndMessage ecm =
                ResponseHelper.ErrorCodeAndMessage.builder()
                        .code("code")
                        .message("message")
                        .originalMessage("originalMessage")
                        .originalMessageTemplate("originalMessageTemplate")
                        .messageArguments(args)
                        .build();
        when(mockResponse.status()).thenReturn(400);
        when(mockResponse.body(ResponseHelper.ErrorCodeAndMessage.class))
                .thenReturn(CompletableFuture.completedFuture(ecm));

        Supplier<TestResponse.Builder> responseBuilder = () -> TestResponse.builder();
        try {
            ClientCall.builder(mockClient, new TestRequest(), responseBuilder)
                    .logger(mockLogger, "mockLogger")
                    .method(Method.GET)
                    .callSync();
            fail("Expected to throw");
        } catch (BmcException e) {
            // expected
            assertEquals(400, e.getStatusCode());
            assertNotEquals(ecm.getMessage(), e.getMessage());
            assertTrue(e.getMessage().contains(ecm.getMessage()));
            assertEquals(ecm.getMessage(), e.getUnmodifiedMessage());
            assertEquals(ecm.getCode(), e.getServiceCode());
            assertEquals(ecm.getOriginalMessage(), e.getOriginalMessage());
            assertEquals(ecm.getOriginalMessageTemplate(), e.getOriginalMessageTemplate());
            assertEquals(ecm.getMessageArguments(), e.getMessageArguments());
        }
    }

    public static class TestRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

        public static class Builder
                implements com.oracle.bmc.requests.BmcRequest.Builder<TestRequest, java.lang.Void> {
            private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
            private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

            /**
             * Set the invocation callback for the request to be built.
             *
             * @param invocationCallback the invocation callback to be set for the request
             * @return this builder instance
             */
            public Builder invocationCallback(
                    com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
                this.invocationCallback = invocationCallback;
                return this;
            }

            /**
             * Set the retry configuration for the request to be built.
             *
             * @param retryConfiguration the retry configuration to be used for the request
             * @return this builder instance
             */
            public Builder retryConfiguration(
                    com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
                this.retryConfiguration = retryConfiguration;
                return this;
            }

            /**
             * Copy method to populate the builder with values from the given instance.
             *
             * @return this builder instance
             */
            public Builder copy(TestRequest o) {
                invocationCallback(o.getInvocationCallback());
                retryConfiguration(o.getRetryConfiguration());
                return this;
            }

            /**
             * Build the instance of TestRequest as configured by this builder
             *
             * <p>Note that this method takes calls to {@link
             * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into
             * account, while the method {@link Builder#buildWithoutInvocationCallback} does not.
             *
             * <p>This is the preferred method to build an instance.
             *
             * @return instance of TestRequest
             */
            public TestRequest build() {
                TestRequest request = buildWithoutInvocationCallback();
                request.setInvocationCallback(invocationCallback);
                request.setRetryConfiguration(retryConfiguration);
                return request;
            }

            /**
             * Build the instance of TestRequest as configured by this builder
             *
             * <p>Note that this method does not take calls to {@link
             * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into
             * account, while the method {@link Builder#build} does
             *
             * @return instance of TestRequest
             */
            public TestRequest buildWithoutInvocationCallback() {
                TestRequest request = new TestRequest();
                return request;
                // new TestRequest(opcClientRequestId, compartmentId);
            }
        }

        /**
         * Return an instance of {@link Builder} that allows you to modify request properties.
         *
         * @return instance of {@link Builder} that allows you to modify request properties.
         */
        public Builder toBuilder() {
            return new Builder();
        }

        /**
         * Return a new builder for this request object.
         *
         * @return builder for the request object
         */
        public static Builder builder() {
            return new Builder();
        }

        @Override
        public String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("(");
            sb.append("super=").append(super.toString());
            sb.append(")");
            return sb.toString();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof TestRequest)) {
                return false;
            }

            TestRequest other = (TestRequest) o;
            return super.equals(o);
        }

        @Override
        public int hashCode() {
            final int PRIME = 59;
            int result = super.hashCode();
            return result;
        }
    }

    public static class TestResponse extends com.oracle.bmc.responses.BmcResponse {
        /** The returned String instance. */
        private String value;

        /**
         * The returned String instance.
         *
         * @return the value
         */
        public String getValue() {
            return value;
        }

        @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "value"})
        private TestResponse(
                int __httpStatusCode__,
                java.util.Map<String, java.util.List<String>> headers,
                String value) {
            super(__httpStatusCode__, headers);
            this.value = value;
        }

        public static class Builder
                implements com.oracle.bmc.responses.BmcResponse.Builder<TestResponse> {
            private int __httpStatusCode__;

            @Override
            public Builder __httpStatusCode__(int __httpStatusCode__) {
                this.__httpStatusCode__ = __httpStatusCode__;
                return this;
            }

            private java.util.Map<String, java.util.List<String>> headers;

            @Override
            public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
                this.headers = headers;
                return this;
            }

            /** The returned String instance. */
            private String value;

            /**
             * The returned String instance.
             *
             * @param value the value to set
             * @return this builder
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * Copy method to populate the builder with values from the given instance.
             *
             * @return this builder instance
             */
            @Override
            public Builder copy(TestResponse o) {
                __httpStatusCode__(o.get__httpStatusCode__());
                headers(o.getHeaders());

                value(o.getValue());

                return this;
            }

            /**
             * Build the response object.
             *
             * @return the response object
             */
            @Override
            public TestResponse build() {
                return new TestResponse(__httpStatusCode__, headers, value);
            }
        }

        /**
         * Return a new builder for this response object.
         *
         * @return builder for the response object
         */
        public static Builder builder() {
            return new Builder();
        }

        @Override
        public String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("(");
            sb.append("super=").append(super.toString());
            sb.append(",value=").append(String.valueOf(value));
            sb.append(")");
            return sb.toString();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof TestResponse)) {
                return false;
            }

            TestResponse other = (TestResponse) o;
            return super.equals(o) && java.util.Objects.equals(this.value, other.value);
        }

        @Override
        public int hashCode() {
            final int PRIME = 59;
            int result = super.hashCode();
            result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
            return result;
        }
    }
}

// TODO: TODO: DEX-14784 - reimplement these tests
// public class ResponseHelperTest {
    //    private static final String OPC_REQUEST_ID = "DummyOPCRequestID";
    //    private static final MediaType HTML_MEDIA_TYPE = MediaType.TEXT_HTML_TYPE;
    //    private static final MediaType JSON_MEDIA_TYPE = MediaType.APPLICATION_JSON_TYPE;
    //    private static final MediaType JSON_MEDIA_TYPE_WITH_CHARSET =
    //            MediaType.APPLICATION_JSON_TYPE.withCharset("UTF-8");
    //    private static final Response.Status BAD_GATEWAY_STATUS = Response.Status.BAD_GATEWAY;
    //
    //    @Test
    //    public void test_throwIfNotSuccessful_InvalidHTMLResponse() {
    //        final Response htmlResponse =
    //                buildMockResponse(OPC_REQUEST_ID, HTML_MEDIA_TYPE, BAD_GATEWAY_STATUS);
    //
    //        try {
    //            ResponseHelper.throwIfNotSuccessful(htmlResponse);
    //            fail("Should have thrown");
    //        } catch (BmcException exception) {
    //            validateExceptionFields(
    //                    exception,
    //                    OPC_REQUEST_ID,
    //                    BAD_GATEWAY_STATUS,
    //                    "Unknown",
    //                    "Unexpected Content-Type: " + HTML_MEDIA_TYPE);
    //        }
    //    }
    //
    //    @Test
    //    public void test_throwIfNotSuccessful_ValidJsonResponse() {
    //        final Response jsonResponse =
    //                buildMockResponse(OPC_REQUEST_ID, JSON_MEDIA_TYPE, Response.Status.OK);
    //        ResponseHelper.throwIfNotSuccessful(jsonResponse);
    //    }
    //
    //    @Test
    //    public void test_throwIfNotSuccessful_InValidJsonResponseExtendedForLocalization() {
    //        final Response jsonResponse =
    //                buildMockResponseExtendedForLocalization(OPC_REQUEST_ID, JSON_MEDIA_TYPE,
    // BAD_GATEWAY_STATUS);
    //        final String dummyServiceCode = "DummyServiceCode";
    //        final String dummyMessage = "DummyMessage";
    //        final String dummyOriginalMessage = "DummyOriginalMessage";
    //        final String dummyOriginalMessageTemplate = "DummyOriginalMessageTemplate";
    //        final Map<String, String> dummymessageArguments = new HashMap<>();
    //        dummymessageArguments.put("DummyTemplateArgumentKey", "DummyTemplateArgumentValue");
    //        when(jsonResponse.readEntity(ResponseHelper.ErrorCodeAndMessage.class))
    //                .thenReturn(
    //                        ResponseHelper.ErrorCodeAndMessage.builder()
    //                                .code(dummyServiceCode)
    //                                .message(dummyMessage)
    //                                .originalMessage(dummyOriginalMessage)
    //                                .originalMessageTemplate(dummyOriginalMessageTemplate)
    //                                .messageArguments(dummymessageArguments)
    //                                .build());
    //        try {
    //            ResponseHelper.throwIfNotSuccessful(jsonResponse);
    //            fail("Should have thrown");
    //        } catch (BmcException exception) {
    //            validateExceptionFields(
    //                    exception, OPC_REQUEST_ID, BAD_GATEWAY_STATUS, dummyServiceCode,
    // dummyMessage);
    //            assertEquals(exception.getOriginalMessage(), dummyOriginalMessage);
    //            assertEquals(exception.getOriginalMessageTemplate(),
    // dummyOriginalMessageTemplate);
    //            assertEquals(exception.getMessageArguments(), dummymessageArguments);
    //        }
    //    }
    //
    //    @Test
    //    public void test_throwIfNotSuccessful_InValidJsonResponseExtendedForPartialLocalization()
    // {
    //        final Response jsonResponse =
    //                buildMockResponseExtendedForLocalization(OPC_REQUEST_ID, JSON_MEDIA_TYPE,
    // BAD_GATEWAY_STATUS);
    //        final String dummyServiceCode = "DummyServiceCode";
    //        final String dummyMessage = "DummyMessage";
    //        final String dummyOriginalMessage = "DummyOriginalMessage";
    //        final Map<String, String> dummymessageArguments = new HashMap<>();
    //        dummymessageArguments.put("DummyTemplateArgumentKey", "DummyTemplateArgumentValue");
    //        when(jsonResponse.readEntity(ResponseHelper.ErrorCodeAndMessage.class))
    //                .thenReturn(
    //                        ResponseHelper.ErrorCodeAndMessage.builder()
    //                                .code(dummyServiceCode)
    //                                .message(dummyMessage)
    //                                .originalMessage(dummyOriginalMessage)
    //                                .messageArguments(dummymessageArguments)
    //                                .build());
    //        try {
    //            ResponseHelper.throwIfNotSuccessful(jsonResponse);
    //            fail("Should have thrown");
    //        } catch (BmcException exception) {
    //            validateExceptionFields(
    //                    exception, OPC_REQUEST_ID, BAD_GATEWAY_STATUS, dummyServiceCode,
    // dummyMessage);
    //            assertEquals(exception.getOriginalMessage(), dummyOriginalMessage);
    //            assertNull(exception.getOriginalMessageTemplate());
    //            assertEquals(exception.getMessageArguments(), dummymessageArguments);
    //        }
    //    }
    //
    //    @Test
    //    public void test_throwIfNotSuccessful_InvalidJsonResponse() {
    //        final Response jsonResponse =
    //                buildMockResponse(OPC_REQUEST_ID, JSON_MEDIA_TYPE, BAD_GATEWAY_STATUS);
    //        final String dummyServiceCode = "DummyServiceCode";
    //        final String dummyMessage = "DummyMessage";
    //        when(jsonResponse.readEntity(ResponseHelper.ErrorCodeAndMessage.class))
    //                .thenReturn(
    //                        ResponseHelper.ErrorCodeAndMessage.builder()
    //                                .code(dummyServiceCode)
    //                                .message(dummyMessage)
    //                                .build());
    //
    //        try {
    //            ResponseHelper.throwIfNotSuccessful(jsonResponse);
    //            fail("Should have thrown");
    //        } catch (BmcException exception) {
    //            validateExceptionFields(
    //                    exception, OPC_REQUEST_ID, BAD_GATEWAY_STATUS, dummyServiceCode,
    // dummyMessage);
    //        }
    //    }
    //
    //    @Test
    //    public void test_throwIfNotSuccessful_ValidUTF8JsonResponse() {
    //        final Response jsonResponse =
    //                buildMockResponse(OPC_REQUEST_ID, JSON_MEDIA_TYPE_WITH_CHARSET,
    // BAD_GATEWAY_STATUS);
    //        final String dummyServiceCode = "DummyServiceCode";
    //        final String dummyMessage = "DummyMessage";
    //        when(jsonResponse.readEntity(ResponseHelper.ErrorCodeAndMessage.class))
    //                .thenReturn(
    //                        ResponseHelper.ErrorCodeAndMessage.builder()
    //                                .code(dummyServiceCode)
    //                                .message(dummyMessage)
    //                                .build());
    //
    //        try {
    //            ResponseHelper.throwIfNotSuccessful(jsonResponse);
    //            fail("Should have thrown");
    //        } catch (BmcException exception) {
    //            validateExceptionFields(
    //                    exception, OPC_REQUEST_ID, BAD_GATEWAY_STATUS, dummyServiceCode,
    // dummyMessage);
    //        }
    //    }
    //
    //    @Test
    //    public void testReadEntity_encodedJsonString() throws Exception {
    //        Response response = mock(Response.class);
    //        Response.StatusType statusInfo = mock(Response.StatusType.class);
    //        // with embedded quote
    //        String jsonEncodedString =
    //                RestClientFactory.getObjectMapper().writeValueAsString("foo \" bar");
    //        assertEquals("\"foo \\\" bar\"", jsonEncodedString);
    //
    //        Class<String> entityType = String.class;
    //
    //        when(response.getStatusInfo()).thenReturn(statusInfo);
    //        when(statusInfo.getFamily()).thenReturn(Response.Status.Family.SUCCESSFUL);
    //        when(response.getHeaderString(HttpHeaders.CONTENT_TYPE))
    //                .thenReturn(javax.ws.rs.core.MediaType.APPLICATION_JSON);
    //        when(response.readEntity(entityType)).thenReturn(jsonEncodedString);
    //
    //        String responseString = ResponseHelper.readEntity(response, entityType);
    //
    //        // embedded quote preserved, outer quotes removed
    //        assertEquals("foo \" bar", responseString);
    //        verify(response).bufferEntity();
    //        verify(statusInfo).getFamily();
    //        verify(response).readEntity(entityType);
    //        verify(response).getHeaderString(HttpHeaders.CONTENT_TYPE);
    //    }
    //
    //    @Test
    //    public void testReadEntity_streamWithContentType() {
    //        Response response = mock(Response.class);
    //        Response.StatusType statusInfo = mock(Response.StatusType.class);
    //        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
    //        List<Object> contentType = Collections.unmodifiableList(Arrays.asList("text"));
    //        InputStream mockStream = mock(InputStream.class);
    //
    //        Class<InputStream> entityType = InputStream.class;
    //
    //        when(response.getStatusInfo()).thenReturn(statusInfo);
    //        when(statusInfo.getFamily()).thenReturn(Response.Status.Family.SUCCESSFUL);
    //        when(response.getHeaders()).thenReturn(headers);
    //        headers.add(HttpHeaders.CONTENT_TYPE, contentType);
    //        when(response.readEntity(entityType)).thenReturn(mockStream);
    //
    //        InputStream inputStream = ResponseHelper.readEntity(response, entityType);
    //
    //        assertThat(inputStream, instanceOf(WrappedResponseInputStream.class));
    //        verify(response).getStatusInfo();
    //        verify(statusInfo).getFamily();
    //        verify(response, atLeastOnce()).getHeaders();
    //        verify(response).readEntity(entityType);
    //        verify(response, never()).bufferEntity();
    //        verify(response).getStringHeaders();
    //        verifyNoMoreInteractions(response, statusInfo, mockStream);
    //        assertEquals(
    //                Collections.unmodifiableList(Arrays.asList(contentType)),
    //                headers.get(HttpHeaders.CONTENT_TYPE));
    //    }
    //
    //    @Test
    //    public void testReadEntity_streamWithoutContentType() {
    //        Response response = mock(Response.class);
    //        Response.StatusType statusInfo = mock(Response.StatusType.class);
    //        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
    //        InputStream mockStream = mock(InputStream.class);
    //
    //        Class<InputStream> entityType = InputStream.class;
    //
    //        when(response.getStatusInfo()).thenReturn(statusInfo);
    //        when(statusInfo.getFamily()).thenReturn(Response.Status.Family.SUCCESSFUL);
    //        when(response.getHeaders()).thenReturn(headers);
    //        when(response.readEntity(entityType)).thenReturn(mockStream);
    //
    //        InputStream inputStream = ResponseHelper.readEntity(response, entityType);
    //
    //        assertThat(inputStream, instanceOf(WrappedResponseInputStream.class));
    //        verify(response).getStatusInfo();
    //        verify(statusInfo).getFamily();
    //        verify(response, atLeastOnce()).getHeaders();
    //        verify(response).readEntity(entityType);
    //        verify(response, never()).bufferEntity();
    //        verify(response).getStringHeaders();
    //        verifyNoMoreInteractions(response, statusInfo, mockStream);
    //    }
    //
    //    @Test
    //    public void testReadEntity_streamWithContentLength() {
    //        Response response = mock(Response.class);
    //        Response.StatusType statusInfo = mock(Response.StatusType.class);
    //        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
    //        List<Object> contentType =
    // Collections.unmodifiableList(Arrays.<Object>asList(("text")));
    //        InputStream mockStream = mock(InputStream.class);
    //
    //        Class<InputStream> entityType = InputStream.class;
    //
    //        when(response.getStatusInfo()).thenReturn(statusInfo);
    //        when(statusInfo.getFamily()).thenReturn(Response.Status.Family.SUCCESSFUL);
    //        when(response.getHeaders()).thenReturn(headers);
    //        headers.add(HttpHeaders.CONTENT_TYPE, contentType);
    //        headers.add(HttpHeaders.CONTENT_LENGTH, "100");
    //        MultivaluedMap<String, String> stringHeaders = new MultivaluedHashMap<>();
    //        stringHeaders.putSingle(HttpHeaders.CONTENT_LENGTH, "100");
    //        when(response.getStringHeaders()).thenReturn(stringHeaders);
    //        when(response.readEntity(entityType)).thenReturn(mockStream);
    //
    //        InputStream inputStream = ResponseHelper.readEntity(response, entityType);
    //
    //        assertThat(inputStream, instanceOf(ContentLengthVerifyingInputStream.class));
    //        verify(response).getStatusInfo();
    //        verify(statusInfo).getFamily();
    //        verify(response, atLeastOnce()).getHeaders();
    //        verify(response).readEntity(entityType);
    //        verify(response, never()).bufferEntity();
    //        verify(response).getStringHeaders();
    //        verifyNoMoreInteractions(response, statusInfo, mockStream);
    //        headers = response.getHeaders();
    //        stringHeaders = response.getStringHeaders();
    //        assertEquals(
    //                Collections.unmodifiableList(Arrays.asList(contentType)),
    //                headers.get(HttpHeaders.CONTENT_TYPE));
    //        assertEquals(
    //                Collections.unmodifiableList(Arrays.asList("100")),
    //                headers.get(HttpHeaders.CONTENT_LENGTH));
    //        assertEquals(
    //                Collections.unmodifiableList(Arrays.asList("100")),
    //                stringHeaders.get(HttpHeaders.CONTENT_LENGTH));
    //    }
    //
    //    @Test
    //    public void testReadEntity_streamWithoutVerifyingContentLength() {
    //        Response response = mock(Response.class);
    //        Response.StatusType statusInfo = mock(Response.StatusType.class);
    //        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
    //        List<Object> contentType =
    // Collections.unmodifiableList(Arrays.<Object>asList("text"));
    //        InputStream mockStream = mock(InputStream.class);
    //
    //        Class<InputStream> entityType = InputStream.class;
    //
    //        when(response.getStatusInfo()).thenReturn(statusInfo);
    //        when(statusInfo.getFamily()).thenReturn(Response.Status.Family.SUCCESSFUL);
    //        when(response.getHeaders()).thenReturn(headers);
    //        headers.add(HttpHeaders.CONTENT_TYPE, contentType);
    //        headers.add(HttpHeaders.CONTENT_LENGTH, "100");
    //        headers.add(HttpHeaders.CONTENT_ENCODING, "gzip");
    //        MultivaluedMap<String, String> stringHeaders = new MultivaluedHashMap<>();
    //        stringHeaders.putSingle(HttpHeaders.CONTENT_LENGTH, "100");
    //        when(response.getStringHeaders()).thenReturn(stringHeaders);
    //        when(response.readEntity(entityType)).thenReturn(mockStream);
    //
    //        InputStream inputStream = ResponseHelper.readEntity(response, entityType);
    //
    //        assertFalse(inputStream instanceof ContentLengthVerifyingInputStream);
    //        assertFalse(inputStream instanceof AutoCloseableContentLengthVerifyingInputStream);
    //        verify(response).getStatusInfo();
    //        verify(statusInfo).getFamily();
    //        verify(response, atLeastOnce()).getHeaders();
    //        verify(response).readEntity(entityType);
    //        verify(response, never()).bufferEntity();
    //        verify(response).getStringHeaders();
    //        verifyNoMoreInteractions(response, statusInfo, mockStream);
    //        headers = response.getHeaders();
    //        stringHeaders = response.getStringHeaders();
    //        assertEquals(
    //                Collections.unmodifiableList(Arrays.asList(contentType)),
    //                headers.get(HttpHeaders.CONTENT_TYPE));
    //        assertEquals(
    //                Collections.unmodifiableList(Arrays.asList("100")),
    //                headers.get(HttpHeaders.CONTENT_LENGTH));
    //        assertEquals(
    //                Collections.unmodifiableList(Arrays.asList("100")),
    //                stringHeaders.get(HttpHeaders.CONTENT_LENGTH));
    //        assertEquals(
    //                Collections.unmodifiableList(Arrays.asList("gzip")),
    //                headers.get(HttpHeaders.CONTENT_ENCODING));
    //    }
    //
    //    private static Response buildMockResponse(
    //            final String opcRequestId, final MediaType mediaType, final Response.Status
    // status) {
    //        final Response response = mock(Response.class);
    //
    // when(response.getHeaderString(BmcException.OPC_REQUEST_ID_HEADER)).thenReturn(opcRequestId);
    //        when(response.getMediaType()).thenReturn(mediaType);
    //        when(response.getStatusInfo()).thenReturn(status);
    //        when(response.getStatus()).thenReturn(status.getStatusCode());
    //        return response;
    //    }
    //
    //    private static Response buildMockResponseExtendedForLocalization(
    //            final String opcRequestId, final MediaType mediaType, final Response.Status
    // status) {
    //        final Response response = mock(Response.class);
    //
    // when(response.getHeaderString(BmcException.OPC_REQUEST_ID_HEADER)).thenReturn(opcRequestId);
    //        when(response.getMediaType()).thenReturn(mediaType);
    //        when(response.getStatusInfo()).thenReturn(status);
    //        when(response.getStatus()).thenReturn(status.getStatusCode());
    //        return response;
    //    }
    //
    //    private static void validateExceptionFields(
    //            final BmcException exception,
    //            final String opcRequestId,
    //            final Response.Status status,
    //            final String serviceCode,
    //            final String... messageSubStrings) {
    //        assertEquals(opcRequestId, exception.getOpcRequestId());
    //        assertEquals(status.getStatusCode(), exception.getStatusCode());
    //        assertEquals(serviceCode, exception.getServiceCode());
    //
    //        assertTrue(exception.getMessage().contains(opcRequestId));
    //        assertTrue(exception.getMessage().contains(String.valueOf(status.getStatusCode())));
    //
    //        for (String messageSubString : messageSubStrings) {
    //            assertTrue(exception.getMessage().contains(messageSubString));
    //        }
    //    }
// }
