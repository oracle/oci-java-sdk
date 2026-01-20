/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.ServiceDetails;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.circuitbreaker.internal.resilience4j.OciCircuitBreakerImpl;
import com.oracle.bmc.http.client.HttpClient;
import com.oracle.bmc.http.client.HttpRequest;
import com.oracle.bmc.http.client.HttpResponse;
import com.oracle.bmc.http.client.Method;
import com.oracle.bmc.http.client.Serializer;
import com.oracle.bmc.http.internal.ClientCallTest.TestErrorModel;
import com.oracle.bmc.http.internal.ClientCallTest.TestRuntimeSdkException;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.model.SdkRuntimeException;
import com.oracle.bmc.retrier.RetryConfiguration;
import com.oracle.bmc.waiter.MaxAttemptsTerminationStrategy;

import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
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

        /** The returned java.io.InputStream instance. */
        private InputStream inputStream;

        /**
         * The returned java.io.InputStream instance.
         *
         * @return the value
         */
        public InputStream getInputStream() {
            return inputStream;
        }

        @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "value", "inputStream"})
        private TestResponse(
                int __httpStatusCode__,
                java.util.Map<String, java.util.List<String>> headers,
                String value,
                InputStream inputStream) {
            super(__httpStatusCode__, headers);
            this.value = value;
            this.inputStream = inputStream;
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

            /** The returned java.io.InputStream instance. */
            private InputStream inputStream;

            /**
             * The returned java.io.InputStream instance.
             *
             * @param inputStream the value to set
             * @return this builder
             */
            public Builder inputStream(InputStream inputStream) {
                this.inputStream = inputStream;
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
                inputStream(o.getInputStream());

                return this;
            }

            /**
             * Build the response object.
             *
             * @return the response object
             */
            @Override
            public TestResponse build() {
                return new TestResponse(__httpStatusCode__, headers, value, inputStream);
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
            sb.append(",inputStream=").append(String.valueOf(inputStream));
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

    public static class TestResponseErrorRuntimeExceptionFactory
            implements ResponseErrorRuntimeExceptionFactory<
                    TestErrorModel, TestRuntimeSdkException> {

        @Override
        public Class<TestErrorModel> getResponseErrorModelType() {
            return TestErrorModel.class;
        }

        @Override
        public TestRuntimeSdkException createRuntimeException(
                int statusCode,
                String opcRequestId,
                TestErrorModel errorResponse,
                ServiceDetails serviceDetails) {
            return new TestRuntimeSdkException(
                    statusCode, opcRequestId, serviceDetails, errorResponse);
        }

        @Override
        public TestRuntimeSdkException createRuntimeException(
                int statusCode,
                String serviceCode,
                String message,
                String opcRequestId,
                ServiceDetails serviceDetails) {
            return new TestRuntimeSdkException(
                    statusCode, opcRequestId, serviceDetails, serviceCode, message);
        }

        @Override
        public TestRuntimeSdkException createRuntimeException(
                int statusCode,
                String serviceCode,
                String message,
                String opcRequestId,
                Throwable cause,
                ServiceDetails serviceDetails) {
            return new TestRuntimeSdkException(
                    statusCode, opcRequestId, serviceDetails, serviceCode, message, cause);
        }
    }

    public static class TestRuntimeSdkException extends SdkRuntimeException {
        private int statusCode;
        private String errorCode;
        private String opcRequestId;
        private ServiceDetails serviceDetails;
        private TestErrorModel error;

        public TestRuntimeSdkException(
                int statusCode,
                String opcRequestId,
                ServiceDetails serviceDetails,
                String errorCode,
                String errorMessage) {
            this(statusCode, opcRequestId, serviceDetails, errorCode, errorMessage, null);
        }

        public TestRuntimeSdkException(
                int statusCode,
                String opcRequestId,
                ServiceDetails serviceDetails,
                String errorCode,
                String errorMessage,
                Throwable cause) {
            super(errorMessage, cause);
            this.statusCode = statusCode;
            this.opcRequestId = opcRequestId;
            this.serviceDetails = serviceDetails;
            this.errorCode = errorCode;
        }

        public TestRuntimeSdkException(
                int statusCode,
                String opcRequestId,
                ServiceDetails serviceDetails,
                TestErrorModel error) {
            super(error.errorMessage);
            this.statusCode = statusCode;
            this.opcRequestId = opcRequestId;
            this.serviceDetails = serviceDetails;
            this.errorCode = error.errorCode;
            this.error = error;
        }
    }

    public static class TestErrorModel {
        private String errorCode;
        private String errorMessage;
    }

    public static class TestResponseHelper {
        private static final String OPC_REQUEST_ID = "DummyOPCRequestID";
        private static final String JSON_MEDIA_TYPE = "application/json";
        private static final int BAD_GATEWAY_STATUS = 503;
        private static final String CONTENT_TYPE = "application/json";
        private static final String CONTENT_LENGTH = "100";
        private static final String CONTENT_ENCODING = "gzip";
        private HttpClient mockClient = mock(HttpClient.class);
        private HttpRequest mockRequest = mock(HttpRequest.class);
        private Logger mockLogger = mock(Logger.class);
        private HttpResponse mockResponse = mock(HttpResponse.class);

        private ResponseHelper.ErrorCodeAndMessage ecm;

        private CompletableFuture<HttpResponse> completableFuture;

        private Supplier<ClientCallTest.TestResponse.Builder> responseBuilder;

        @Before
        public void setup() throws ExecutionException, InterruptedException, URISyntaxException {

            when(mockClient.createRequest(any())).thenReturn(mockRequest);
            when(mockRequest.offloadExecutor(any())).thenReturn(mockRequest);
            when(mockRequest.copy()).thenReturn(mockRequest);
            URI uri = new URI("https://localhost");
            when(mockRequest.uri()).thenReturn(uri);

            completableFuture = CompletableFuture.completedFuture(mockResponse);
            when(mockRequest.execute()).thenReturn(completableFuture);

            when(mockResponse.header("opc-request-id")).thenReturn(OPC_REQUEST_ID);

            responseBuilder = () -> ClientCallTest.TestResponse.builder();
        }

        @Test
        public void test_throwIfNotSuccessful_ValidJsonResponse() {

            when(mockResponse.body(ResponseHelper.ErrorCodeAndMessage.class))
                    .thenReturn(CompletableFuture.completedFuture(ecm));
            when(mockResponse.status()).thenReturn(BAD_GATEWAY_STATUS);
            when(mockResponse.header("content-type")).thenReturn(JSON_MEDIA_TYPE);
            when(mockResponse.body(ResponseHelper.ErrorCodeAndMessage.class))
                    .thenReturn(CompletableFuture.completedFuture(ecm));
            try {
                ClientCall.builder(mockClient, new ClientCallTest.TestRequest(), responseBuilder)
                        .logger(mockLogger, "mockLogger")
                        .method(Method.GET)
                        .callSync();
                fail("Expected to throw");
            } catch (BmcException e) {
                assertEquals(BAD_GATEWAY_STATUS, e.getStatusCode());
                assertEquals(OPC_REQUEST_ID, e.getOpcRequestId());
                assertEquals("Unknown", e.getServiceCode());
                assertTrue(e.getMessage().contains(OPC_REQUEST_ID));
            }
        }

        @Test
        public void test_throwIfNotSuccessful_InvalidHTMLResponse() throws IOException {

            String jsonEncodedString = Serializer.getDefault().writeValueAsString("Dummy response");
            when(mockResponse.status()).thenReturn(BAD_GATEWAY_STATUS);
            when(mockResponse.header("content-type")).thenReturn("text/html");
            when(mockResponse.textBody())
                    .thenReturn(CompletableFuture.completedFuture(jsonEncodedString));
            try {
                ClientCall.builder(mockClient, new ClientCallTest.TestRequest(), responseBuilder)
                        .logger(mockLogger, "mockLogger")
                        .method(Method.GET)
                        .callSync();
                fail("Expected to throw");
            } catch (BmcException e) {
                assertEquals(BAD_GATEWAY_STATUS, e.getStatusCode());
                assertEquals(OPC_REQUEST_ID, e.getOpcRequestId());
                assertEquals("Unknown", e.getServiceCode());
                assertTrue(e.getMessage().contains(OPC_REQUEST_ID));
                assertTrue(e.getMessage().contains("Unexpected Content-Type: text/html"));
            }
        }

        @Test
        public void test_throwIfNotSuccessful_InValidJsonResponseExtendedForLocalization() {
            Map<String, String> args = new HashMap<>();
            args.put("DummyTemplateArgumentKey", "DummyTemplateArgumentValue");
            ecm =
                    ResponseHelper.ErrorCodeAndMessage.builder()
                            .code("DummyServiceCode")
                            .message("DummyMessage")
                            .originalMessage("DummyOriginalMessage")
                            .originalMessageTemplate("DummyOriginalMessageTemplate")
                            .messageArguments(args)
                            .build();
            when(mockResponse.body(ResponseHelper.ErrorCodeAndMessage.class))
                    .thenReturn(CompletableFuture.completedFuture(ecm));

            when(mockResponse.status()).thenReturn(BAD_GATEWAY_STATUS);
            when(mockResponse.header("content-type")).thenReturn(JSON_MEDIA_TYPE);
            try {
                ClientCall.builder(mockClient, new ClientCallTest.TestRequest(), responseBuilder)
                        .logger(mockLogger, "mockLogger")
                        .method(Method.GET)
                        .callSync();
                fail("Expected to throw");
            } catch (BmcException e) {
                // expected
                assertEquals(BAD_GATEWAY_STATUS, e.getStatusCode());
                assertNotEquals(ecm.getMessage(), e.getMessage());
                assertTrue(e.getMessage().contains(ecm.getMessage()));
                assertEquals(ecm.getMessage(), e.getUnmodifiedMessage());
                assertEquals(ecm.getCode(), e.getServiceCode());
                assertEquals(ecm.getOriginalMessage(), e.getOriginalMessage());
                assertEquals(ecm.getOriginalMessageTemplate(), e.getOriginalMessageTemplate());
                assertEquals(ecm.getMessageArguments(), e.getMessageArguments());
            }
        }

        @Test
        public void test_throwIfNotSuccessful_InValidJsonResponseExtendedForPartialLocalization() {
            Map<String, String> args = new HashMap<>();
            args.put("DummyTemplateArgumentKey", "DummyTemplateArgumentValue");
            ecm =
                    ResponseHelper.ErrorCodeAndMessage.builder()
                            .code("DummyServiceCode")
                            .message("DummyMessage")
                            .originalMessage("DummyOriginalMessage")
                            .messageArguments(args)
                            .build();
            when(mockResponse.body(ResponseHelper.ErrorCodeAndMessage.class))
                    .thenReturn(CompletableFuture.completedFuture(ecm));

            when(mockResponse.status()).thenReturn(BAD_GATEWAY_STATUS);
            when(mockResponse.header("content-type")).thenReturn(JSON_MEDIA_TYPE);
            try {
                ClientCall.builder(mockClient, new ClientCallTest.TestRequest(), responseBuilder)
                        .logger(mockLogger, "mockLogger")
                        .method(Method.GET)
                        .callSync();
                fail("Expected to throw");
            } catch (BmcException e) {
                // expected
                assertEquals(BAD_GATEWAY_STATUS, e.getStatusCode());
                assertNotEquals(ecm.getMessage(), e.getMessage());
                assertTrue(e.getMessage().contains(ecm.getMessage()));
                assertEquals(ecm.getMessage(), e.getUnmodifiedMessage());
                assertEquals(ecm.getCode(), e.getServiceCode());
                assertEquals(ecm.getOriginalMessage(), e.getOriginalMessage());
                assertEquals(ecm.getOriginalMessageTemplate(), e.getOriginalMessageTemplate());
                assertEquals(ecm.getMessageArguments(), e.getMessageArguments());
            }
        }

        @Test
        public void test_throwIfNotSuccessful_CustomRuntimeExceptionFactory() {
            TestErrorModel tem = new TestErrorModel();
            tem.errorCode = "TestErrorModel_errorCode";
            tem.errorMessage = "TestErrorModel_errorMessage";

            when(mockResponse.body(TestErrorModel.class))
                    .thenReturn(CompletableFuture.completedFuture(tem));

            when(mockResponse.status()).thenReturn(BAD_GATEWAY_STATUS);
            when(mockResponse.header("content-type")).thenReturn(JSON_MEDIA_TYPE);
            try {
                ClientCall.builder(mockClient, new ClientCallTest.TestRequest(), responseBuilder)
                        .logger(mockLogger, "mockLogger")
                        .method(Method.GET)
                        // Inject the custom exception factory
                        .responseErrorExceptionFactory(
                                new TestResponseErrorRuntimeExceptionFactory())
                        .callSync();
                fail("Expected to throw");
            } catch (TestRuntimeSdkException e) {
                // expected
                assertEquals(BAD_GATEWAY_STATUS, e.statusCode);
                assertEquals(tem.errorMessage, e.getMessage());
                assertEquals(tem.errorCode, e.errorCode);
                assertEquals(OPC_REQUEST_ID, e.opcRequestId);
                assertNotNull(e.serviceDetails);
            }
        }

        @Test
        public void test_throwIfNotSuccessful_InvalidJsonResponse() {
            ecm =
                    ResponseHelper.ErrorCodeAndMessage.builder()
                            .code("DummyServiceCode")
                            .message("DummyMessage")
                            .originalMessage("DummyOriginalMessage")
                            .build();
            when(mockResponse.body(ResponseHelper.ErrorCodeAndMessage.class))
                    .thenReturn(CompletableFuture.completedFuture(ecm));

            when(mockResponse.status()).thenReturn(BAD_GATEWAY_STATUS);
            when(mockResponse.header("content-type")).thenReturn(JSON_MEDIA_TYPE);
            try {
                ClientCall.builder(mockClient, new ClientCallTest.TestRequest(), responseBuilder)
                        .logger(mockLogger, "mockLogger")
                        .method(Method.GET)
                        .callSync();
                fail("Expected to throw");
            } catch (BmcException e) {
                // expected
                assertEquals(BAD_GATEWAY_STATUS, e.getStatusCode());
                assertNotEquals(ecm.getMessage(), e.getMessage());
                assertTrue(e.getMessage().contains(ecm.getMessage()));
                assertEquals(ecm.getMessage(), e.getUnmodifiedMessage());
                assertEquals(ecm.getCode(), e.getServiceCode());
                assertEquals(ecm.getOriginalMessage(), e.getOriginalMessage());
                assertEquals(ecm.getOriginalMessageTemplate(), e.getOriginalMessageTemplate());
                assertEquals(ecm.getMessageArguments(), e.getMessageArguments());
            }
        }

        @Test
        public void test_throwIfNotSuccessful_ValidUTF8JsonResponse() {
            ecm =
                    ResponseHelper.ErrorCodeAndMessage.builder()
                            .code("DummyServiceCode")
                            .message("DummyMessage")
                            .originalMessage("DummyOriginalMessage")
                            .build();
            when(mockResponse.body(ResponseHelper.ErrorCodeAndMessage.class))
                    .thenReturn(CompletableFuture.completedFuture(ecm));

            when(mockResponse.status()).thenReturn(BAD_GATEWAY_STATUS);
            when(mockResponse.header("content-type")).thenReturn("application/json;charset=UTF-8");
            try {
                ClientCall.builder(mockClient, new ClientCallTest.TestRequest(), responseBuilder)
                        .logger(mockLogger, "mockLogger")
                        .method(Method.GET)
                        .callSync();
                fail("Expected to throw");
            } catch (BmcException e) {
                // expected
                assertEquals(BAD_GATEWAY_STATUS, e.getStatusCode());
                assertNotEquals(ecm.getMessage(), e.getMessage());
                assertTrue(e.getMessage().contains(ecm.getMessage()));
                assertEquals(ecm.getMessage(), e.getUnmodifiedMessage());
                assertEquals(ecm.getCode(), e.getServiceCode());
                assertEquals(ecm.getOriginalMessage(), e.getOriginalMessage());
                assertEquals(ecm.getOriginalMessageTemplate(), e.getOriginalMessageTemplate());
                assertEquals(ecm.getMessageArguments(), e.getMessageArguments());
            }
        }

        @Test
        public void testReadEntity_encodedJsonString() throws Exception {
            // with embedded quote
            String jsonEncodedString = Serializer.getDefault().writeValueAsString("foo \" bar");
            assertEquals("\"foo \\\" bar\"", jsonEncodedString);

            when(mockResponse.header("Content-Type")).thenReturn(JSON_MEDIA_TYPE);
            when(mockResponse.status()).thenReturn(200);
            when(mockResponse.textBody())
                    .thenReturn(CompletableFuture.completedFuture(jsonEncodedString));

            TestResponse resResp =
                    ClientCall.builder(mockClient, new TestRequest(), responseBuilder)
                            .logger(mockLogger, "mockLogger")
                            .method(Method.GET)
                            .accept(JSON_MEDIA_TYPE)
                            .handleBody(String.class, TestResponse.Builder::value)
                            .callSync();

            // embedded quote preserved, outer quotes removed
            assertEquals("foo \" bar", resResp.getValue());
            verify(mockResponse).textBody();
        }

        @Test
        public void testReadEntity_streamWithContentType() {
            Map<String, List<String>> headers = new HashMap<>();
            List<String> contentType = Collections.unmodifiableList(Arrays.asList("text"));

            InputStream mockStream = mock(InputStream.class);

            Class<InputStream> entityType = InputStream.class;

            when(mockResponse.headers()).thenReturn(headers);
            when(mockResponse.status()).thenReturn(200);
            when(mockResponse.streamBody())
                    .thenReturn(CompletableFuture.completedFuture(mockStream));
            headers.put(CONTENT_TYPE, contentType);

            TestResponse resResp =
                    ClientCall.builder(mockClient, new TestRequest(), responseBuilder)
                            .logger(mockLogger, "mockLogger")
                            .method(Method.GET)
                            .handleBody(entityType, TestResponse.Builder::inputStream)
                            .callSync();

            headers = resResp.getHeaders();
            verify(mockResponse).streamBody();
            verify(mockResponse, atLeastOnce()).headers();
            assertEquals(contentType, headers.get(CONTENT_TYPE));
        }

        @Test
        public void testReadEntity_streamWithoutContentType() {
            Map<String, List<String>> headers = new HashMap<>();

            InputStream mockStream = mock(InputStream.class);

            Class<InputStream> entityType = InputStream.class;

            when(mockResponse.headers()).thenReturn(headers);
            when(mockResponse.status()).thenReturn(200);
            when(mockResponse.streamBody())
                    .thenReturn(CompletableFuture.completedFuture(mockStream));

            TestResponse resResp =
                    ClientCall.builder(mockClient, new TestRequest(), responseBuilder)
                            .logger(mockLogger, "mockLogger")
                            .method(Method.GET)
                            .handleBody(entityType, TestResponse.Builder::inputStream)
                            .callSync();

            verify(mockResponse).streamBody();
            verify(mockResponse, atLeastOnce()).headers();
        }

        @Test
        public void testReadEntity_streamWithContentLength() {
            Map<String, List<String>> headers = new HashMap<>();
            List<String> contentType = Collections.unmodifiableList(Arrays.asList("text"));
            List<String> contentLength = Collections.unmodifiableList(Arrays.asList("100"));

            InputStream mockStream = mock(InputStream.class);

            Class<InputStream> entityType = InputStream.class;

            when(mockResponse.headers()).thenReturn(headers);
            when(mockResponse.status()).thenReturn(200);
            when(mockResponse.streamBody())
                    .thenReturn(CompletableFuture.completedFuture(mockStream));
            headers.put(CONTENT_TYPE, contentType);
            headers.put(CONTENT_LENGTH, contentLength);

            TestResponse resResp =
                    ClientCall.builder(mockClient, new TestRequest(), responseBuilder)
                            .logger(mockLogger, "mockLogger")
                            .method(Method.GET)
                            .handleBody(entityType, TestResponse.Builder::inputStream)
                            .callSync();
            headers = resResp.getHeaders();

            assertThat(resResp.getInputStream(), instanceOf(entityType));
            verify(mockResponse).streamBody();
            verify(mockResponse, atLeastOnce()).headers();
            assertEquals(contentType, headers.get(CONTENT_TYPE));
            assertEquals(contentLength, headers.get(CONTENT_LENGTH));
        }

        @Test
        public void testReadEntity_streamWithoutVerifyingContentLength() {

            Map<String, List<String>> headers = new HashMap<>();
            List<String> contentType = Collections.unmodifiableList(Arrays.asList("text"));
            List<String> contentLength = Collections.unmodifiableList(Arrays.asList("100"));
            List<String> contentEncoding = Collections.unmodifiableList(Arrays.asList("gzip"));

            InputStream mockStream = mock(InputStream.class);

            Class<InputStream> entityType = InputStream.class;

            when(mockResponse.headers()).thenReturn(headers);
            when(mockResponse.status()).thenReturn(200);
            when(mockResponse.streamBody())
                    .thenReturn(CompletableFuture.completedFuture(mockStream));
            headers.put(CONTENT_TYPE, contentType);
            headers.put(CONTENT_LENGTH, contentLength);
            headers.put(CONTENT_ENCODING, contentEncoding);

            TestResponse resResp =
                    ClientCall.builder(mockClient, new TestRequest(), responseBuilder)
                            .logger(mockLogger, "mockLogger")
                            .method(Method.GET)
                            .handleBody(entityType, TestResponse.Builder::inputStream)
                            .callSync();
            headers = resResp.getHeaders();

            assertThat(resResp.getInputStream(), instanceOf(entityType));
            verify(mockResponse).streamBody();
            verify(mockResponse, atLeastOnce()).headers();
            assertEquals(contentType, headers.get(CONTENT_TYPE));
            assertEquals(contentLength, headers.get(CONTENT_LENGTH));
            assertEquals(contentEncoding, headers.get(CONTENT_ENCODING));
        }

        @Test
        public void test_retriesOnTimeout() {
            int NUM_RETRIES = 3;
            RetryConfiguration retryConfiguration =
                    RetryConfiguration.builder()
                            .terminationStrategy(new MaxAttemptsTerminationStrategy(NUM_RETRIES))
                            .build();
            CompletionException completionException =
                    new CompletionException(new RuntimeException("Timeout Exception"));
            CompletableFuture<HttpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(completionException);
            when(mockClient.isProcessingException(any())).thenReturn(true);
            when(mockRequest.execute()).thenReturn(future);
            try {
                TestResponse resResp =
                        ClientCall.builder(mockClient, new TestRequest(), responseBuilder)
                                .retryConfiguration(retryConfiguration)
                                .logger(mockLogger, "mockLogger")
                                .method(Method.GET)
                                .callSync();
                fail("Expected to throw");
            } catch (BmcException e) {
                // Expected
                verify(mockClient, times(NUM_RETRIES)).isProcessingException(completionException);
                assertEquals(e.getCause(), completionException);
                // (status code, service code, timeout)
                assertTrue(e.getMessage().contains("(-1, null, true)"));
                assertTrue(e.getMessage().contains("Timeout Exception"));
                assert (e.isTimeout());
            }
        }

        @Test
        public void test_circuitBreakerException() {
            CompletableFuture<HttpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(new RuntimeException("foo"));
            when(mockClient.isProcessingException(any())).thenReturn(false);
            when(mockRequest.execute()).thenReturn(future);
            try {
                TestResponse resResp =
                        ClientCall.builder(mockClient, new TestRequest(), responseBuilder)
                                .circuitBreaker(
                                        new OciCircuitBreakerImpl(
                                                new CircuitBreakerConfiguration(), t -> true))
                                .logger(mockLogger, "mockLogger")
                                .method(Method.GET)
                                .callSync();
                fail("Expected to throw");
            } catch (BmcException e) {
                assertEquals("foo", e.getCause().getMessage());
            }
        }
    }
}
