/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey;

import com.oracle.bmc.http.client.HttpClient;
import com.oracle.bmc.http.client.HttpRequest;
import com.oracle.bmc.http.client.Method;
import com.oracle.bmc.http.client.RequestInterceptor;
import com.oracle.bmc.http.client.jersey.internal.IdleConnectionMonitor;
import org.apache.http.conn.HttpClientConnectionManager;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import java.util.List;
import java.util.function.Supplier;

final class JerseyHttpClient implements HttpClient {
    final List<RequestInterceptor> requestInterceptors;

    private volatile Supplier<WebTarget> baseTargetSupplier;
    final Client client;
    final boolean isApacheNonBufferingClient;
    final HttpClientConnectionManager httpClientConnectionManager;

    JerseyHttpClient(
            Client client,
            WebTarget baseTarget,
            List<RequestInterceptor> requestInterceptors,
            boolean isApacheNonBufferingClient) {
        this(client, baseTarget, requestInterceptors, isApacheNonBufferingClient, null);
    }

    JerseyHttpClient(
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
        this.baseTargetSupplier = () -> baseTarget;
        this.requestInterceptors = requestInterceptors;
        this.isApacheNonBufferingClient = isApacheNonBufferingClient;
        this.httpClientConnectionManager = httpClientConnectionManager;
    }

    @Override
    public HttpRequest createRequest(Method method) {
        return new JerseyHttpRequest(this, method, this.baseTargetSupplier.get());
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
            // switch to "each thread has its own endpoint"
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
