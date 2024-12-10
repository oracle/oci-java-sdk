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
import org.apache.http.conn.HttpClientConnectionManager;

import java.util.List;
import java.util.function.Supplier;

final class Jersey3HttpClient implements HttpClient {
    final List<RequestInterceptor> requestInterceptors;

    private volatile Supplier<WebTarget> baseTargetSupplier;
    final Client client;
    final boolean isApacheNonBufferingClient;
    final HttpClientConnectionManager httpClientConnectionManager;

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
            HttpClientConnectionManager httpClientConnectionManager) {
        if (client == null) {
            throw new IllegalArgumentException("Client must be non-null");
        }
        if (baseTarget == null) {
            throw new IllegalArgumentException("Endpoint must be non-null");
        }
        this.client = client;
        // start out with one endpoint for all threads
        this.baseTargetSupplier = () -> baseTarget;
        this.requestInterceptors = requestInterceptors;
        this.isApacheNonBufferingClient = isApacheNonBufferingClient;
        this.httpClientConnectionManager = httpClientConnectionManager;
    }

    @Override
    public HttpRequest createRequest(Method method) {
        return new Jersey3HttpRequest(this, method, this.baseTargetSupplier.get());
    }

    @Override
    public void close() {
        if (this.httpClientConnectionManager != null) {
            IdleConnectionMonitor.removeConnectionManager(this.httpClientConnectionManager);
        }
        client.close();
    }

    @Override
    public boolean isProcessingException(Exception e) {
        return e instanceof ProcessingException;
    }

    @Override
    public synchronized void updateEndpoint(String baseTarget) {
        if (!(this.baseTargetSupplier instanceof ThreadLocalWebTargetSupplier)) {
            // switch to each thread has its own endpoint, so they can be updated safely
            this.baseTargetSupplier = new ThreadLocalWebTargetSupplier(this.baseTargetSupplier);
        }
        ThreadLocalWebTargetSupplier supplier =
                (ThreadLocalWebTargetSupplier) this.baseTargetSupplier;
        supplier.set(this.client.target(baseTarget));
    }

    static final class ThreadLocalWebTargetSupplier implements Supplier<WebTarget> {
        private final ThreadLocal<WebTarget> threadLocal;

        public ThreadLocalWebTargetSupplier(Supplier<WebTarget> initial) {
            threadLocal = ThreadLocal.withInitial(initial);
        }

        public WebTarget get() {
            return threadLocal.get();
        }

        public void set(WebTarget updated) {
            threadLocal.set(updated);
        }
    }
}
