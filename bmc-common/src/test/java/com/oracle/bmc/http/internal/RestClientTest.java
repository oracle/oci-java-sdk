/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.requests.BmcRequest;
import com.oracle.bmc.util.internal.Consumer;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import java.io.IOException;

import static org.junit.Assert.*;

@Ignore
public class RestClientTest {

    @Mock private Invocation.Builder ib;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void filter_headerExists() throws IOException {
        final String testVal = "testVal";
        BmcRequest request = new BmcRequest();
        request.setInvocationCallback(
                new Consumer<Invocation.Builder>() {
                    @Override
                    public void accept(Invocation.Builder builder) {
                        builder.header(BmcException.OPC_REQUEST_ID_HEADER, testVal);
                    }
                });
        WrappedInvocationBuilder wib = new WrappedInvocationBuilder(ib);
        RestClient.InvocationInformation info = RestClient.preprocessRequest(wib, request);
        assertEquals(
                1, info.getHeadersSetInCallback().get(BmcException.OPC_REQUEST_ID_HEADER).size());
        assertEquals(
                testVal,
                info.getHeadersSetInCallback().getFirst(BmcException.OPC_REQUEST_ID_HEADER));
        assertEquals(testVal, info.getRequestId());
    }

    @Test
    public void filter_headerAbsent() throws IOException {
        final String testVal = "testVal";
        final String testKey = "testKey";
        BmcRequest request = new BmcRequest();
        request.setInvocationCallback(
                new Consumer<Invocation.Builder>() {
                    @Override
                    public void accept(Invocation.Builder builder) {
                        builder.header(testKey, testVal);
                    }
                });
        WrappedInvocationBuilder wib = new WrappedInvocationBuilder(ib);
        RestClient.InvocationInformation info = RestClient.preprocessRequest(wib, request);
        assertEquals(1, info.getHeadersSetInCallback().size());
        assertEquals(testVal, info.getHeadersSetInCallback().getFirst(testKey));
        assertNotNull(info.getRequestId());
        assertFalse(testVal.equals(info.getRequestId()));
    }

    @Test
    public void filter_noCallback() throws IOException {
        BmcRequest request = new BmcRequest();
        WrappedInvocationBuilder wib = new WrappedInvocationBuilder(ib);
        RestClient.InvocationInformation info = RestClient.preprocessRequest(wib, request);
        assertEquals(0, info.getHeadersSetInCallback().size());
        assertNotNull(info.getRequestId());
    }

    @Test
    public void filter_headerExistsSetAll() throws IOException {
        final String testVal = "testVal";
        final String lostKey = "foo";
        final String testKey2 = "testKey2";
        final String testVal2 = "testVal2";

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
        WrappedInvocationBuilder wib = new WrappedInvocationBuilder(ib);
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
    public void filter_headerAbsentSetAll() throws IOException {
        final String testVal = "testVal";
        final String testKey = "testKey";
        final String lostKey = "foo";
        final String testKey2 = "testKey2";
        final String testVal2 = "testVal2";
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
        WrappedInvocationBuilder wib = new WrappedInvocationBuilder(ib);
        RestClient.InvocationInformation info = RestClient.preprocessRequest(wib, request);
        assertEquals(2, info.getHeadersSetInCallback().size());
        assertEquals(testVal, info.getHeadersSetInCallback().getFirst(testKey));
        assertEquals(testVal2, info.getHeadersSetInCallback().getFirst(testKey2));
        assertNull(info.getHeadersSetInCallback().get(lostKey));
        assertNotNull(info.getRequestId());
        assertFalse(testVal.equals(info.getRequestId()));
    }

    @Test
    public void filter_headerExistsSetNull() throws IOException {
        final String testVal = "testVal";
        final String lostKey = "foo";
        final String testKey2 = "testKey2";
        final String testVal2 = "testVal2";

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
        WrappedInvocationBuilder wib = new WrappedInvocationBuilder(ib);
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
    public void filter_headerAbsentSetNull() throws IOException {
        final String testVal = "testVal";
        final String testKey = "testKey";
        final String lostKey = "foo";
        final String testKey2 = "testKey2";
        final String testVal2 = "testVal2";
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
        WrappedInvocationBuilder wib = new WrappedInvocationBuilder(ib);
        RestClient.InvocationInformation info = RestClient.preprocessRequest(wib, request);
        assertEquals(2, info.getHeadersSetInCallback().size());
        assertEquals(testVal, info.getHeadersSetInCallback().getFirst(testKey));
        assertEquals(testVal2, info.getHeadersSetInCallback().getFirst(testKey2));
        assertNull(info.getHeadersSetInCallback().get(lostKey));
        assertNotNull(info.getRequestId());
        assertFalse(testVal.equals(info.getRequestId()));
    }
}
