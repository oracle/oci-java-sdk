/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey3;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.oracle.bmc.http.client.HttpRequest;
import com.oracle.bmc.http.client.HttpResponse;
import com.oracle.bmc.http.client.Method;
import com.oracle.bmc.http.client.RequestInterceptor;
import com.oracle.bmc.http.internal.ApacheDuplicatableInputStreamEntity;
import com.oracle.bmc.http.internal.ApacheInputStreamEntity;
import com.oracle.bmc.http.client.Serialization;
import com.oracle.bmc.http.client.io.DuplicatableInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.ws.rs.client.CompletionStageRxInvoker;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.MultivaluedHashMap;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Variant;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;

final class Jersey3HttpRequest implements HttpRequest {
    /**
     * The boolean value indicating if extra logs related to operations that return streams are
     * enabled/disabled. Disabling this will disable warnings to close the streams, logs about
     * wrapping response stream in an auto-closeble stream. Default is true.
     */
    static final boolean isExtraStreamLogsEnabled = isExtraStreamLogsEnabledViaSystemProperty();

    private static boolean isExtraStreamLogsEnabledViaSystemProperty() {
        String streamLogsEnabledString =
                System.getProperty("oci.javasdk.extra.stream.logs.enabled");
        if (streamLogsEnabledString != null && !streamLogsEnabledString.isEmpty()) {
            String trimmedValue = streamLogsEnabledString.trim();
            if ("false".equalsIgnoreCase(trimmedValue)) {
                return false;
            }
        }
        return true;
    }

    private static final Logger LOG = LoggerFactory.getLogger(Jersey3HttpRequest.class);

    private final Jersey3HttpClient client;

    private final Method method;
    private Object processedBody;
    private MediaType requestBodyType;
    private Locale requestBodyLanguage;
    private String requestBodyEncoding;
    private WebTarget webTarget;
    private final MultivaluedMap<String, String> headers;
    private final Map<String, Object> attributes;

    Jersey3HttpRequest(Jersey3HttpClient client, Method method, WebTarget webTarget) {
        this.client = client;
        this.method = method;
        this.webTarget = webTarget;
        this.attributes = new HashMap<>();
        this.headers = new MultivaluedHashMap<String, String>();
    }

    private Jersey3HttpRequest(Jersey3HttpRequest from) {
        this.client = from.client;
        this.method = from.method;
        this.processedBody = from.processedBody;
        this.requestBodyType = from.requestBodyType;
        this.requestBodyLanguage = from.requestBodyLanguage;
        this.requestBodyEncoding = from.requestBodyEncoding;
        this.webTarget = from.webTarget;
        this.headers = new MultivaluedHashMap<String, String>(from.headers);
        this.attributes = new HashMap<>(from.attributes);
    }

    @Override
    public Method method() {
        return method;
    }

    private void logAvailable(InputStream body) {
        if (isExtraStreamLogsEnabled) {
            try {
                final int bytesAvailable = body.available();
                if (bytesAvailable == 0) {
                    LOG.warn(
                            "Stream size to upload is 0 bytes, "
                                    + "this could potentially lead to data corruption. If this is not intended, "
                                    + "please make sure all the OCI SDK dependencies point to the same version");
                }
            } catch (IOException e) {
                LOG.warn(
                        "Error calling available on the stream to get the available number of bytes");
            }
        }
    }

    @Override
    public HttpRequest body(Object body) {
        if (body instanceof String) {
            processedBody = body;
        } else if (body instanceof InputStream) {
            logAvailable((InputStream) body);
            processedBody = body;
        } else if (body == null) {
            processedBody = "";
        } else {
            try {
                processedBody = Serialization.getObjectMapper().writeValueAsString(body);
            } catch (JsonProcessingException e) {
                throw new IllegalArgumentException("Unable to process JSON body", e);
            }
        }
        return this;
    }

    @Override
    public HttpRequest body(InputStream body, long contentLength) {
        logAvailable(body);
        if (client.isApacheNonBufferingClient && contentLength > 0) {
            // Customization for providing Apache HTTP Entity instead of InputStream. This is
            // required to avoid
            // buffering all the data in memory by Jersey Apache Connector. Create the HTTP entity
            // only when a
            // content length value can be retrieved from the request.
            if (body instanceof DuplicatableInputStream) {
                processedBody =
                        new ApacheDuplicatableInputStreamEntity(
                                (DuplicatableInputStream) body, contentLength);
            } else {
                processedBody = new ApacheInputStreamEntity((InputStream) body, contentLength);
            }
        } else {
            processedBody = body;
        }
        return this;
    }

    @Override
    public Object body() {
        return processedBody;
    }

    @Override
    public HttpRequest appendPathPart(String encodedPathPart) {
        webTarget = webTarget.path(encodedPathPart);
        return this;
    }

    @Override
    public HttpRequest query(String name, String value) {
        webTarget = webTarget.queryParam(name, value);
        return this;
    }

    @Override
    public URI uri() {
        return webTarget.getUri();
    }

    @Override
    public HttpRequest header(String name, String value) {
        headers.add(name, value);
        if (name.equalsIgnoreCase("Content-Type")) {
            requestBodyType = MediaType.valueOf(value);
        }
        if (name.equalsIgnoreCase("Content-Language")) {
            requestBodyLanguage = Locale.forLanguageTag(value);
        }
        if (name.equalsIgnoreCase("Content-Encoding")) {
            requestBodyEncoding = value;
        }
        return this;
    }

    @Override
    public Map<String, List<String>> headers() {
        return headers;
    }

    @Override
    public Object attribute(String name) {
        return attributes.get(name);
    }

    @Override
    public HttpRequest removeAttribute(String name) {
        attributes.remove(name);
        return this;
    }

    @Override
    public HttpRequest attribute(String name, Object value) {
        attributes.put(name, value);
        return this;
    }

    @Override
    public HttpRequest offloadExecutor(Executor executor) {
        // can't offload for jersey
        return this;
    }

    @Override
    public HttpRequest copy() {
        return new Jersey3HttpRequest(this);
    }

    @Override
    public void discard() {}

    @Override
    public CompletionStage<HttpResponse> execute() {
        for (RequestInterceptor interceptor : client.requestInterceptors) {
            interceptor.intercept(this);
        }
        CompletionStageRxInvoker invoker =
                webTarget.request().headers(new MultivaluedHashMap<String, Object>(headers)).rx();
        CompletionStage<Response> stage;
        if (processedBody == null) {
            stage = invoker.method(method.name());
        } else {
            Variant variant =
                    new Variant(requestBodyType, requestBodyLanguage, requestBodyEncoding);
            stage = invoker.method(method.name(), Entity.entity(processedBody, variant));
        }
        return stage.thenApply(Jersey3HttpResponse::new);
    }
}
