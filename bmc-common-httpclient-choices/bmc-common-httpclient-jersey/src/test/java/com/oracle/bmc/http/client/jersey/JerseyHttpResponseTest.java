/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey;

import org.junit.Test;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.Response;
import java.io.InputStream;
import java.util.concurrent.CompletionException;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class JerseyHttpResponseTest {

    @Test
    public void streamBody_whenReadEntityFails_closesResponse() {
        Response rawResponse = mock(Response.class);
        MultivaluedHashMap<String, Object> headers = new MultivaluedHashMap<>();
        headers.add(HttpHeaders.CONTENT_TYPE, "application/octet-stream");
        ProcessingException failure = new ProcessingException("interrupted");

        when(rawResponse.getHeaders()).thenReturn(headers);
        when(rawResponse.readEntity(InputStream.class)).thenThrow(failure);

        JerseyHttpResponse response = new JerseyHttpResponse(rawResponse);

        try {
            response.streamBody().toCompletableFuture().join();
            fail("Expected streamBody() to fail");
        } catch (CompletionException e) {
            assertSame(failure, e.getCause());
        }

        verify(rawResponse).close();
    }
}
