/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey3;

import com.oracle.bmc.http.client.HttpResponse;
import com.oracle.bmc.http.client.Method;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.CompletionStageRxInvoker;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.core.Response;
import org.junit.Test;

import java.util.Collections;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Jersey3HttpRequestTest {
    private static final String TEST_PROPERTY_NAME = "operationName";
    private static final String TEST_PROPERTY_VALUE = "GetVcn";

    @Test
    public void executeCopiesAttributesToJerseyInvocationBuilderProperties() throws Exception {
        Client rawClient = mock(Client.class);
        WebTarget webTarget = mock(WebTarget.class);
        Invocation.Builder invocationBuilder = mock(Invocation.Builder.class);
        CompletionStageRxInvoker invoker = mock(CompletionStageRxInvoker.class);
        Response rawResponse = mock(Response.class);
        Jersey3HttpClient client =
                new Jersey3HttpClient(
                        rawClient, "http://localhost", Collections.emptyList(), false);

        when(webTarget.request()).thenReturn(invocationBuilder);
        when(invocationBuilder.headers(any(MultivaluedMap.class))).thenReturn(invocationBuilder);
        when(invocationBuilder.property(TEST_PROPERTY_NAME, TEST_PROPERTY_VALUE))
                .thenReturn(invocationBuilder);
        when(invocationBuilder.rx()).thenReturn(invoker);
        when(invoker.method(Method.GET.name()))
                .thenReturn(CompletableFuture.completedFuture(rawResponse));
        when(rawResponse.getStatus()).thenReturn(204);

        try (HttpResponse response =
                new Jersey3HttpRequest(client, Method.GET, webTarget)
                        .attribute(TEST_PROPERTY_NAME, TEST_PROPERTY_VALUE)
                        .execute()
                        .toCompletableFuture()
                        .get(5, TimeUnit.SECONDS)) {
            assertEquals(204, response.status());
            verify(invocationBuilder).property(TEST_PROPERTY_NAME, TEST_PROPERTY_VALUE);
        }
    }
}
