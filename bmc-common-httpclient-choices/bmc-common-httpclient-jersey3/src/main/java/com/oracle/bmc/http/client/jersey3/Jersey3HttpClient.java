/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey3;

import com.oracle.bmc.http.client.HttpClient;
import com.oracle.bmc.http.client.HttpRequest;
import com.oracle.bmc.http.client.Method;
import com.oracle.bmc.http.client.RequestInterceptor;

import com.oracle.bmc.http.client.jersey3.internal.IdleConnectionMonitor;
import jakarta.ws.rs.ProcessingException;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.WebTarget;
import java.util.List;

final class Jersey3HttpClient implements HttpClient {
    final List<RequestInterceptor> requestInterceptors;

    private final WebTarget baseTarget;
    final Client client;
    final boolean isApacheNonBufferingClient;
    final IdleConnectionMonitor idleConnectionMonitor;

    Jersey3HttpClient(
            Client client,
            WebTarget baseTarget,
            List<RequestInterceptor> requestInterceptors,
            boolean isApacheNonBufferingClient) {
        this(client, baseTarget, requestInterceptors, isApacheNonBufferingClient, null);
    }

    Jersey3HttpClient(
            Client client,
            WebTarget baseTarget,
            List<RequestInterceptor> requestInterceptors,
            boolean isApacheNonBufferingClient,
            IdleConnectionMonitor idleConnectionMonitor) {
        this.client = client;
        this.baseTarget = baseTarget;
        this.requestInterceptors = requestInterceptors;
        this.isApacheNonBufferingClient = isApacheNonBufferingClient;
        this.idleConnectionMonitor = idleConnectionMonitor;
    }

    @Override
    public HttpRequest createRequest(Method method) {
        return new Jersey3HttpRequest(this, method, baseTarget);
    }

    @Override
    public void close() {
        if (this.idleConnectionMonitor != null) {
            idleConnectionMonitor.shutdown();
        }
        client.close();
    }

    @Override
    public boolean isProcessingException(Exception e) {
        return e instanceof ProcessingException;
    }
}
