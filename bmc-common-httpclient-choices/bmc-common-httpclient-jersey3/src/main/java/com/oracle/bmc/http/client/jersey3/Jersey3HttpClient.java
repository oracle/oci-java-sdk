/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey3;

import com.oracle.bmc.http.client.HttpClient;
import com.oracle.bmc.http.client.HttpProviderCapability;
import com.oracle.bmc.http.client.HttpRequest;
import com.oracle.bmc.http.client.Method;
import com.oracle.bmc.http.client.RequestInterceptor;
import com.oracle.bmc.http.client.internal.parameterizedendpoints.ParameterizedEndpointUtil;
import com.oracle.bmc.http.client.jersey3.internal.IdleConnectionMonitor;
import jakarta.ws.rs.ProcessingException;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.WebTarget;
import org.apache.http.conn.HttpClientConnectionManager;

import java.util.Collections;
import java.util.List;
import java.util.Map;

final class Jersey3HttpClient implements HttpClient {
    final List<RequestInterceptor> requestInterceptors;

    final String baseUriString;
    final Client client;
    final boolean isApacheNonBufferingClient;
    final HttpClientConnectionManager httpClientConnectionManager;

    Jersey3HttpClient(
            Client client,
            String baseUriString,
            List<RequestInterceptor> requestInterceptors,
            boolean isApacheNonBufferingClient) {
        this(client, baseUriString, requestInterceptors, isApacheNonBufferingClient, null);
    }

    Jersey3HttpClient(
            Client client,
            String baseUriString,
            List<RequestInterceptor> requestInterceptors,
            boolean isApacheNonBufferingClient,
            HttpClientConnectionManager httpClientConnectionManager) {
        if (client == null) {
            throw new IllegalArgumentException("Client must be non-null");
        }
        if (baseUriString == null) {
            throw new IllegalArgumentException("baseUriString must be non-null");
        }
        this.client = client;
        this.baseUriString = baseUriString;
        this.requestInterceptors = requestInterceptors;
        this.isApacheNonBufferingClient = isApacheNonBufferingClient;
        this.httpClientConnectionManager = httpClientConnectionManager;
    }

    @Override
    public HttpRequest createRequest(Method method) {
        return createRequest(method, Collections.emptyMap(), Collections.emptyMap());
    }

    @Override
    public HttpRequest createRequest(
            Method method,
            Map<String, Object> requiredParametersMap,
            Map<String, Boolean> optionsMap) {
        String resolvedEndpoint =
                ParameterizedEndpointUtil.INSTANCE.getEndpointWithPopulatedServiceParameters(
                        baseUriString, requiredParametersMap, optionsMap);
        WebTarget webTarget = client.target(resolvedEndpoint);
        return new Jersey3HttpRequest(this, method, webTarget);
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
    public boolean hasCapability(HttpProviderCapability capability) {
        return Jersey3HttpProvider.getInstance().hasCapability(capability);
    }
}
