/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.http.client.HttpClient;
import com.oracle.bmc.http.client.HttpRequest;
import com.oracle.bmc.http.client.HttpResponse;
import com.oracle.bmc.http.client.Method;
import com.oracle.bmc.http.internal.ClientCallTest.TestRequest;
import com.oracle.bmc.http.internal.ClientCallTest.TestResponse;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.responses.AsyncHandler;
import com.oracle.bmc.retrier.RetryConfiguration;
import java.net.URI;
import java.security.ProviderException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.slf4j.Logger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.same;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(ClientCall.class)
public class ClientCallRequestIdTest {
    private static final String REQUEST_ID_HEADER = "opc-request-id";

    private final HttpClient httpClient = mock(HttpClient.class);
    private final HttpRequest httpRequest = mock(HttpRequest.class);
    private final HttpResponse httpResponse = mock(HttpResponse.class);
    private final Logger logger = mock(Logger.class);
    private final Map<String, List<String>> headers = new HashMap<>();

    @Before
    public void setUp() {
        PowerMockito.spy(ClientCall.class);
        when(httpClient.createRequest(any())).thenReturn(httpRequest);
        when(httpRequest.offloadExecutor(any())).thenReturn(httpRequest);
        when(httpRequest.copy()).thenReturn(httpRequest);
        when(httpRequest.uri()).thenReturn(URI.create("https://localhost"));
        when(httpRequest.method()).thenReturn(Method.GET);
        when(httpRequest.headers()).thenReturn(headers);
        when(httpRequest.header(anyString(), any()))
                .thenAnswer(
                        invocation -> {
                            String name = invocation.getArgument(0);
                            String value = invocation.getArgument(1);
                            if (value == null) {
                                headers.remove(name);
                            } else {
                                headers.put(name, Collections.singletonList(value));
                            }
                            return httpRequest;
                        });
        when(httpRequest.execute()).thenReturn(CompletableFuture.completedFuture(httpResponse));
        when(httpResponse.status()).thenReturn(200);
        when(httpResponse.headers()).thenReturn(Collections.emptyMap());
    }

    @Test
    public void requestIdFailureStillExecutesSynchronousRequestWithoutGeneratedId()
            throws Exception {
        failRequestIdGeneration();

        TestResponse response = call(new TestRequest()).callSync();

        assertEquals(200, response.get__httpStatusCode__());
        verify(httpRequest).header(REQUEST_ID_HEADER, null);
        verify(httpRequest).execute();
    }

    @Test
    @SuppressWarnings("unchecked")
    public void requestIdFailureStillCompletesAsynchronousRequest() throws Exception {
        failRequestIdGeneration();
        TestRequest request = new TestRequest();
        AsyncHandler<TestRequest, TestResponse> handler = mock(AsyncHandler.class);

        TestResponse response = call(request).callAsync(handler).get(5, TimeUnit.SECONDS);

        assertEquals(200, response.get__httpStatusCode__());
        verify(handler).onSuccess(same(request), same(response));
        verify(handler, never()).onError(any(), any());
        verify(httpRequest).execute();
    }

    @Test
    public void requestIdFailurePreservesCallerHeader() throws Exception {
        failRequestIdGeneration();

        call(new TestRequest()).appendHeader(REQUEST_ID_HEADER, "caller-id").callSync();

        assertEquals(Collections.singletonList("caller-id"), headers.get(REQUEST_ID_HEADER));
        verify(httpRequest, never()).header(REQUEST_ID_HEADER, null);
        verify(httpRequest).execute();
    }

    @Test
    public void requestIdFailurePreservesInvocationCallbackHeader() throws Exception {
        failRequestIdGeneration();
        TestRequest request =
                TestRequest.builder()
                        .invocationCallback(r -> r.header(REQUEST_ID_HEADER, "callback-id"))
                        .build();

        call(request).callSync();

        assertEquals(Collections.singletonList("callback-id"), headers.get(REQUEST_ID_HEADER));
        verify(httpRequest, never()).header(REQUEST_ID_HEADER, null);
        verify(httpRequest).execute();
    }

    @Test
    public void healthyGenerationStillSuppliesSdkRequestId() {
        TestResponse response = call(new TestRequest()).callSync();

        ArgumentCaptor<String> id = ArgumentCaptor.forClass(String.class);
        verify(httpRequest).header(eq(REQUEST_ID_HEADER), id.capture());
        assertTrue(id.getValue().matches("[0-9A-F]{32}"));
        assertEquals(200, response.get__httpStatusCode__());
        verify(httpRequest).execute();
    }

    @Test
    public void invocationCallbackFailureIsNotSwallowedAfterRequestIdFailure() throws Exception {
        failRequestIdGeneration();
        IllegalStateException failure = new IllegalStateException("callback failure");
        TestRequest request =
                TestRequest.builder()
                        .invocationCallback(
                                r -> {
                                    throw failure;
                                })
                        .build();

        BmcException thrown = assertThrows(BmcException.class, () -> call(request).callSync());

        assertCausedBy(failure, thrown);
        verify(httpRequest, never()).execute();
    }

    @Test
    public void transportFailureIsNotSwallowedAfterRequestIdFailure() throws Exception {
        failRequestIdGeneration();
        IllegalStateException failure = new IllegalStateException("transport failure");
        CompletableFuture<HttpResponse> failed = new CompletableFuture<>();
        failed.completeExceptionally(failure);
        when(httpRequest.execute()).thenReturn(failed);

        ExecutionException thrown =
                assertThrows(
                        ExecutionException.class,
                        () -> call(new TestRequest()).callAsync(null).get(5, TimeUnit.SECONDS));

        assertCausedBy(failure, thrown);
        verify(httpRequest).execute();
    }

    private ClientCall<TestRequest, TestResponse, TestResponse.Builder> call(TestRequest request) {
        return ClientCall.builder(httpClient, request, TestResponse::builder)
                .logger(logger, "request-id-test")
                .retryConfiguration(RetryConfiguration.NO_RETRY_CONFIGURATION)
                .method(Method.GET);
    }

    private void failRequestIdGeneration() throws Exception {
        PowerMockito.doThrow(new ProviderException("RNG unavailable"))
                .when(ClientCall.class, "generateRequestId");
    }

    private static void assertCausedBy(Throwable expected, Throwable actual) {
        for (Throwable cause = actual; cause != null; cause = cause.getCause()) {
            if (cause == expected) {
                return;
            }
        }
        fail("Expected failure in cause chain: " + expected);
    }
}
