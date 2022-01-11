/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.circuitbreaker.CallNotAllowedException;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.requests.BmcRequest;
import com.oracle.bmc.util.internal.Consumer;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;

import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.net.URI;
import java.time.Duration;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class RestClientTest {

    @Mock private Invocation.Builder ib;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @Ignore
    public void filter_headerExists() throws IOException {
        final String testVal = "testVal";
        URI requestURI = PowerMockito.mock(URI.class);
        BmcRequest request = new BmcRequest();
        request.setInvocationCallback(
                new Consumer<Invocation.Builder>() {
                    @Override
                    public void accept(Invocation.Builder builder) {
                        builder.header(BmcException.OPC_REQUEST_ID_HEADER, testVal);
                    }
                });
        WrappedInvocationBuilder wib = new WrappedInvocationBuilder(ib, requestURI);
        RestClient.InvocationInformation info = RestClient.preprocessRequest(wib, request);
        assertEquals(
                1, info.getHeadersSetInCallback().get(BmcException.OPC_REQUEST_ID_HEADER).size());
        assertEquals(
                testVal,
                info.getHeadersSetInCallback().getFirst(BmcException.OPC_REQUEST_ID_HEADER));
        assertEquals(testVal, info.getRequestId());
    }

    @Test
    @Ignore
    public void filter_headerAbsent() throws IOException {
        final String testVal = "testVal";
        final String testKey = "testKey";
        URI requestURI = PowerMockito.mock(URI.class);
        BmcRequest request = new BmcRequest();
        request.setInvocationCallback(
                new Consumer<Invocation.Builder>() {
                    @Override
                    public void accept(Invocation.Builder builder) {
                        builder.header(testKey, testVal);
                    }
                });
        WrappedInvocationBuilder wib = new WrappedInvocationBuilder(ib, requestURI);
        RestClient.InvocationInformation info = RestClient.preprocessRequest(wib, request);
        assertEquals(1, info.getHeadersSetInCallback().size());
        assertEquals(testVal, info.getHeadersSetInCallback().getFirst(testKey));
        assertNotNull(info.getRequestId());
        assertFalse(testVal.equals(info.getRequestId()));
    }

    @Test
    @Ignore
    public void filter_noCallback() throws IOException {
        BmcRequest request = new BmcRequest();
        URI requestURI = PowerMockito.mock(URI.class);
        WrappedInvocationBuilder wib = new WrappedInvocationBuilder(ib, requestURI);
        RestClient.InvocationInformation info = RestClient.preprocessRequest(wib, request);
        assertEquals(0, info.getHeadersSetInCallback().size());
        assertNotNull(info.getRequestId());
    }

    @Test
    @Ignore
    public void filter_headerExistsSetAll() throws IOException {
        final String testVal = "testVal";
        final String lostKey = "foo";
        final String testKey2 = "testKey2";
        final String testVal2 = "testVal2";
        URI requestURI = PowerMockito.mock(URI.class);
        BmcRequest request = new BmcRequest();

        request.setInvocationCallback(
                new Consumer<Invocation.Builder>() {
                    @Override
                    public void accept(Invocation.Builder builder) {
                        builder.header(lostKey, "will get lost");

                        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
                        headers.putSingle(BmcException.OPC_REQUEST_ID_HEADER, testVal);
                        builder.headers(headers);

                        builder.header(testKey2, testVal2);
                    }
                });
        WrappedInvocationBuilder wib = new WrappedInvocationBuilder(ib, requestURI);
        RestClient.InvocationInformation info = RestClient.preprocessRequest(wib, request);
        assertEquals(2, info.getHeadersSetInCallback().size());
        assertEquals(
                1, info.getHeadersSetInCallback().get(BmcException.OPC_REQUEST_ID_HEADER).size());
        assertEquals(
                testVal,
                info.getHeadersSetInCallback().getFirst(BmcException.OPC_REQUEST_ID_HEADER));
        assertEquals(testVal2, info.getHeadersSetInCallback().getFirst(testKey2));
        assertNull(info.getHeadersSetInCallback().get(lostKey));
        assertEquals(testVal, info.getRequestId());
    }

    @Test
    @Ignore
    public void filter_headerAbsentSetAll() throws IOException {
        final String testVal = "testVal";
        final String testKey = "testKey";
        final String lostKey = "foo";
        final String testKey2 = "testKey2";
        final String testVal2 = "testVal2";
        URI requestURI = PowerMockito.mock(URI.class);
        BmcRequest request = new BmcRequest();

        request.setInvocationCallback(
                new Consumer<Invocation.Builder>() {
                    @Override
                    public void accept(Invocation.Builder builder) {
                        builder.header(lostKey, "will get lost");

                        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
                        headers.putSingle(testKey, testVal);
                        builder.headers(headers);

                        builder.header(testKey2, testVal2);
                    }
                });
        WrappedInvocationBuilder wib = new WrappedInvocationBuilder(ib, requestURI);
        RestClient.InvocationInformation info = RestClient.preprocessRequest(wib, request);
        assertEquals(2, info.getHeadersSetInCallback().size());
        assertEquals(testVal, info.getHeadersSetInCallback().getFirst(testKey));
        assertEquals(testVal2, info.getHeadersSetInCallback().getFirst(testKey2));
        assertNull(info.getHeadersSetInCallback().get(lostKey));
        assertNotNull(info.getRequestId());
        assertFalse(testVal.equals(info.getRequestId()));
    }

    @Test
    @Ignore
    public void filter_headerExistsSetNull() throws IOException {
        final String testVal = "testVal";
        final String lostKey = "foo";
        final String testKey2 = "testKey2";
        final String testVal2 = "testVal2";
        URI requestURI = PowerMockito.mock(URI.class);
        BmcRequest request = new BmcRequest();

        request.setInvocationCallback(
                new Consumer<Invocation.Builder>() {
                    @Override
                    public void accept(Invocation.Builder builder) {
                        builder.header(lostKey, "will get lost");

                        builder.headers(null);

                        builder.header(BmcException.OPC_REQUEST_ID_HEADER, testVal);
                        builder.header(testKey2, testVal2);
                    }
                });
        WrappedInvocationBuilder wib = new WrappedInvocationBuilder(ib, requestURI);
        RestClient.InvocationInformation info = RestClient.preprocessRequest(wib, request);
        assertEquals(2, info.getHeadersSetInCallback().size());
        assertEquals(
                1, info.getHeadersSetInCallback().get(BmcException.OPC_REQUEST_ID_HEADER).size());
        assertEquals(
                testVal,
                info.getHeadersSetInCallback().getFirst(BmcException.OPC_REQUEST_ID_HEADER));
        assertEquals(testVal2, info.getHeadersSetInCallback().getFirst(testKey2));
        assertNull(info.getHeadersSetInCallback().get(lostKey));
        assertEquals(testVal, info.getRequestId());
    }

    @Test
    @Ignore
    public void filter_headerAbsentSetNull() throws IOException {
        final String testVal = "testVal";
        final String testKey = "testKey";
        final String lostKey = "foo";
        final String testKey2 = "testKey2";
        final String testVal2 = "testVal2";
        URI requestURI = PowerMockito.mock(URI.class);
        BmcRequest request = new BmcRequest();
        request.setInvocationCallback(
                new Consumer<Invocation.Builder>() {
                    @Override
                    public void accept(Invocation.Builder builder) {
                        builder.header(lostKey, "will get lost");

                        builder.headers(null);

                        builder.header(testKey, testVal);
                        builder.header(testKey2, testVal2);
                    }
                });
        WrappedInvocationBuilder wib = new WrappedInvocationBuilder(ib, requestURI);
        RestClient.InvocationInformation info = RestClient.preprocessRequest(wib, request);
        assertEquals(2, info.getHeadersSetInCallback().size());
        assertEquals(testVal, info.getHeadersSetInCallback().getFirst(testKey));
        assertEquals(testVal2, info.getHeadersSetInCallback().getFirst(testKey2));
        assertNull(info.getHeadersSetInCallback().get(lostKey));
        assertNotNull(info.getRequestId());
        assertFalse(testVal.equals(info.getRequestId()));
    }

    @Test
    public void validateCircuitBreaker() {
        int MIN_NUM_CALLS = 4;
        RestClient client =
                RestClientFactoryBuilder.builder()
                        .build()
                        .create(
                                null,
                                null,
                                ClientConfiguration.builder()
                                        .circuitBreakerConfiguration(
                                                CircuitBreakerConfiguration.builder()
                                                        .slidingWindowSize(10)
                                                        .minimumNumberOfCalls(MIN_NUM_CALLS)
                                                        .waitDurationInOpenState(
                                                                Duration.ofSeconds(2))
                                                        .build())
                                        .build());

        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
        headers.putSingle(BmcException.OPC_REQUEST_ID_HEADER, "123");

        BmcRequest request = new BmcRequest();
        request.setInvocationCallback(
                new Consumer<Invocation.Builder>() {
                    @Override
                    public void accept(Invocation.Builder builder) {
                        builder.headers(headers);
                    }
                });

        Response response503 = mock(Response.class);
        Mockito.when(response503.getStatus()).thenReturn(503);

        WrappedInvocationBuilder wib = Mockito.mock(WrappedInvocationBuilder.class);
        Mockito.when(wib.get()).thenReturn(response503);
        Mockito.when(wib.getHeaders()).thenReturn(headers);

        for (int i = 0; i < MIN_NUM_CALLS + 2; i++) {
            try {
                client.get(wib, request);
                assertTrue("Initial calls are not expected to fail", i < MIN_NUM_CALLS);
            } catch (BmcException e) {
                assertTrue("The rest of the call are expected to fail", i >= MIN_NUM_CALLS);
                assertTrue(e.getCause() instanceof CallNotAllowedException);
            }
        }
    }

    @Test
    public void validateCircuitBreakerNotConfigured() {
        int MIN_NUM_CALLS = 4;
        RestClient client =
                RestClientFactoryBuilder.builder()
                        .build()
                        .create(null, null, ClientConfiguration.builder().build());

        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
        headers.putSingle(BmcException.OPC_REQUEST_ID_HEADER, "123");

        BmcRequest request = new BmcRequest();
        request.setInvocationCallback(
                new Consumer<Invocation.Builder>() {
                    @Override
                    public void accept(Invocation.Builder builder) {
                        builder.headers(headers);
                    }
                });

        Response response503 = mock(Response.class);
        Mockito.when(response503.getStatus()).thenReturn(503);
        WrappedInvocationBuilder wib = Mockito.mock(WrappedInvocationBuilder.class);
        Mockito.when(wib.get()).thenReturn(response503);
        Mockito.when(wib.getHeaders()).thenReturn(headers);

        for (int i = 0; i < MIN_NUM_CALLS + 2; i++) {
            try {
                client.get(wib, request);
            } catch (BmcException e) {
                fail("The circuit-breaker should be disabled");
            }
        }
    }
}
