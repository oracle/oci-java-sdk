/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey;

import com.oracle.bmc.http.client.HttpClient;
import com.oracle.bmc.http.client.HttpProviderCapability;
import com.oracle.bmc.http.client.HttpRequest;
import com.oracle.bmc.http.client.Method;
import com.oracle.bmc.http.client.RequestInterceptor;
import com.oracle.bmc.http.client.internal.parameterizedendpoints.ParameterizedEndpointUtil;
import com.oracle.bmc.http.client.jersey.internal.IdleConnectionMonitor;
import org.apache.http.conn.HttpClientConnectionManager;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import java.util.Collections;
import java.util.List;
import java.util.Map;

final class JerseyHttpClient implements HttpClient {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(JerseyHttpClient.class);

    final List<RequestInterceptor> requestInterceptors;

    final String baseUriString;
    final Client client;
    final boolean isApacheNonBufferingClient;
    final HttpClientConnectionManager httpClientConnectionManager;

    JerseyHttpClient(
            Client client,
            String baseUriString,
            List<RequestInterceptor> requestInterceptors,
            boolean isApacheNonBufferingClient) {
        this(client, baseUriString, requestInterceptors, isApacheNonBufferingClient, null);
    }

    JerseyHttpClient(
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
        return new JerseyHttpRequest(this, method, webTarget);
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
        return JerseyHttpProvider.getInstance().hasCapability(capability);
    }
}
