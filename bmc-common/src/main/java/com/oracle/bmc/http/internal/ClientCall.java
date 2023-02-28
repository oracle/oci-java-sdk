/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.oracle.bmc.ServiceDetails;
import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;
import com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider;
import com.oracle.bmc.circuitbreaker.CallNotAllowedException;
import com.oracle.bmc.circuitbreaker.OciCircuitBreaker;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.client.RequestInterceptor;
import com.oracle.bmc.http.client.Serialization;
import com.oracle.bmc.http.client.HttpClient;
import com.oracle.bmc.http.client.HttpRequest;
import com.oracle.bmc.http.client.HttpResponse;
import com.oracle.bmc.http.client.Method;
import com.oracle.bmc.http.signing.SigningStrategy;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.model.Range;
import com.oracle.bmc.requests.BmcRequest;
import com.oracle.bmc.requests.HasContentLength;
import com.oracle.bmc.responses.AsyncHandler;
import com.oracle.bmc.responses.BmcResponse;
import com.oracle.bmc.retrier.BmcGenericRetrier;
import com.oracle.bmc.retrier.Retriers;
import com.oracle.bmc.retrier.RetryConfiguration;
import com.oracle.bmc.retrier.TokenRefreshRetrier;
import com.oracle.bmc.util.internal.CollectionFormatType;
import com.oracle.bmc.util.internal.ReflectionUtils;
import com.oracle.bmc.util.internal.StringUtils;
import com.oracle.bmc.waiter.MaxAttemptsTerminationStrategy;
import com.oracle.bmc.waiter.TerminationStrategy;
import com.oracle.bmc.waiter.WaiterScheduler;
import org.slf4j.Logger;

import jakarta.annotation.Nullable;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public final class ClientCall<
        REQ extends BmcRequest<?>,
        RESP extends BmcResponse,
        RESP_BUILDER extends BmcResponse.Builder<RESP>> {
    private static final String OPC_CLIENT_RETRIES_HEADER = "opc-client-retries";
    private static final String OPC_REQUEST_ID_HEADER = "opc-request-id";

    private final HttpClient httpClient;

    private ClientConfigurator clientConfigurator;

    private OciCircuitBreaker circuitBreaker;

    private HttpRequest httpRequest;

    private REQ request;
    private boolean responseBodyList;
    private Class<?> responseBodyUnwrappedType;
    private BiConsumer<RESP_BUILDER, Object> responseBodyHandler;
    private Logger logger;
    private String serviceDetailsServiceName;
    private String serviceDetailsOperationName;
    private String serviceDetailsApiReferenceLink;
    private boolean hasBinaryRequestBody;
    private boolean operationUsesDefaultRetries;
    private boolean sendRetryToken;
    private SigningStrategy obmcsSigningStrategy;
    private AbstractAuthenticationDetailsProvider authenticationDetailsProvider;
    private Supplier<BmcRequest.Builder<? extends REQ, ?>> requestBuilder;
    private Supplier<RESP_BUILDER> responseBuilder;
    private Set<String> headers = new HashSet<>();
    private Map<String, BiConsumer<RESP_BUILDER, String>> responseHeaders = new HashMap<>();
    private Map<String, BiConsumer<RESP_BUILDER, Map<String, String>>> responseHeadersMulti =
            new HashMap<>();
    private UnaryOperator<RESP> interceptResponse;
    private RetryConfiguration retryConfiguration;
    private WaiterScheduler waiterScheduler = WaiterScheduler.UNSUPPORTED;
    private Executor offloadExecutor = null;
    private boolean firstAttempt = true;

    private ClientCall(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public static <
                    REQ extends com.oracle.bmc.requests.BmcRequest<?>,
                    RESP extends BmcResponse,
                    RESP_BUILDER extends BmcResponse.Builder<RESP>>
            ClientCall<REQ, RESP, RESP_BUILDER> builder(
                    HttpClient httpClient,
                    // for inference, supply these directly
                    REQ request,
                    Supplier<RESP_BUILDER> responseBuilder) {
        return new ClientCall<REQ, RESP, RESP_BUILDER>(httpClient)
                .request(request)
                .responseBuilder(responseBuilder);
    }

    private ClientCall<REQ, RESP, RESP_BUILDER> request(REQ request) {
        this.request = request;
        return this;
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> clientConfigurator(
            ClientConfigurator clientConfigurator) {
        this.clientConfigurator = clientConfigurator;
        return this;
    }

    /**
     * Use a circuit breaker for this call. The results passed to {@link OciCircuitBreaker#onResult}
     * are always of type {@link HttpResponse}
     */
    public ClientCall<REQ, RESP, RESP_BUILDER> circuitBreaker(
            @Nullable OciCircuitBreaker circuitBreaker) {
        this.circuitBreaker = circuitBreaker;
        return this;
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> logger(Logger logger, String nickname) {
        this.logger = logger;
        if (logger.isTraceEnabled()) {
            logger.trace("Called async {}", nickname);
        }
        return this;
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> serviceDetails(
            String serviceName, String operationName, String apiReferenceLink) {
        this.serviceDetailsServiceName = serviceName;
        this.serviceDetailsOperationName = operationName;
        this.serviceDetailsApiReferenceLink = apiReferenceLink;
        return this;
    }

    private ServiceDetails buildServiceDetails() {
        if (serviceDetailsServiceName == null) {
            return ServiceDetails.UNKNOWN_SERVICE_DETAILS;
        }

        return new ServiceDetails(
                serviceDetailsServiceName,
                serviceDetailsOperationName,
                httpRequest.uri().toString(),
                serviceDetailsApiReferenceLink);
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> method(Method method) {
        this.httpRequest = httpClient.createRequest(method);
        return this;
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> hasBinaryRequestBody() {
        this.hasBinaryRequestBody = true;
        if (request.getRetryConfiguration() != null
                || authenticationDetailsProvider instanceof RefreshableOnNotAuthenticatedProvider) {
            request =
                    (REQ)
                            Retriers.wrapBodyInputStreamIfNecessary(
                                    (BmcRequest<InputStream>) request,
                                    (BmcRequest.Builder<BmcRequest<InputStream>, InputStream>)
                                            requestBuilder.get());
        }
        return this;
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> hasBody() {
        Object body = request.getBody$();
        if (request instanceof HasContentLength) {
            Long contentLength = ((HasContentLength) request).getContentLength();
            if (contentLength != null) {
                httpRequest.body((InputStream) body, contentLength);
            } else {
                httpRequest.body(body);
            }
        } else {
            httpRequest.body(body);
        }
        if (body instanceof InputStream) {
            // EntityFactory used to try to infer this from request.getContentType (and also
            // getContentLanguage and
            // getContentEncoding) using reflection. However it seems like this is only used for
            // PutObjectRequest, which
            // also sets these manually (they're `in: header` parameters), so we don't need to do
            // this. There's a test
            // in bmc-sdk-swagger that ensures these headers aren't overwritten by jax-rs.
            if (!headers.contains("content-type")) {
                appendHeader("Content-Type", "application/octet-stream");
            }
        } else {
            appendHeader("Content-Type", "application/json");
        }
        if (request.supportsExpect100Continue() && !headers.contains("expect")) {
            appendHeader("Expect", "100-continue");
        }
        return this;
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> operationUsesDefaultRetries() {
        this.operationUsesDefaultRetries = true;
        return this;
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> obmcsSigningStrategy(
            SigningStrategy obmcsSigningStrategy) {
        this.obmcsSigningStrategy = obmcsSigningStrategy;
        httpRequest.attribute(
                AuthnClientFilter.SIGNING_STRATEGY_PROPERTY_NAME, obmcsSigningStrategy);
        return this;
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> authenticationDetailsProvider(
            AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
        this.authenticationDetailsProvider = authenticationDetailsProvider;
        return this;
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> retryConfiguration(
            RetryConfiguration retryConfiguration) {
        this.retryConfiguration = retryConfiguration;
        return this;
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> requestBuilder(
            Supplier<BmcRequest.Builder<? extends REQ, ?>> requestBuilder) {
        this.requestBuilder = requestBuilder;
        return this;
    }

    private ClientCall<REQ, RESP, RESP_BUILDER> responseBuilder(
            Supplier<RESP_BUILDER> responseBuilder) {
        this.responseBuilder = responseBuilder;
        return this;
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> interceptResponse(
            UnaryOperator<RESP> interceptResponse) {
        this.interceptResponse = interceptResponse;
        return this;
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> basePath(String basePath) {
        return appendPathPart(basePath);
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> appendPathPart(String pathPart) {
        httpRequest.appendPathPart(pathPart);
        return this;
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> appendPathParam(String pathParamValue) {
        return appendPathPart(ParamEncoder.encodePathParam(pathParamValue));
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> appendPathParam(Number pathParamValue) {
        return appendPathParam(pathParamValue.toString());
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> appendPathParam(UUID pathParamValue) {
        return appendPathParam(pathParamValue.toString());
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> appendQueryParam(String name, Object value) {
        if (value != null) {
            httpRequest.query(name, encodeObjectQueryParam(value));
        }
        return this;
    }

    private static String encodeObjectQueryParam(Object value) {
        if (value instanceof Date) {
            value = HttpDateUtils.format((Date) value);
        }
        return ParamEncoder.encodeQueryParam(String.valueOf(value));
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> appendEnumQueryParam(String name, BmcEnum value) {
        if (value != null) {
            appendQueryParam(name, value.getValue());
        }
        return this;
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> appendListQueryParam(
            String name, List<?> values, CollectionFormatType collectionFormatType) {
        return appendListParameter(
                name,
                values,
                collectionFormatType,
                (paramName, value) -> ClientCall.this.appendQueryParam(paramName, value));
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> appendMapQueryParam(
            String prefix, Map<String, ?> values) {
        if (values != null) {
            if (prefix == null) {
                prefix = "";
            }
            for (Map.Entry<String, ?> entry : values.entrySet()) {
                String name = prefix + entry.getKey();
                if (entry.getValue() instanceof Collection<?>) {
                    for (Object value : ((Collection<?>) entry.getValue())) {
                        httpRequest.query(name, String.valueOf(value));
                    }
                } else {
                    httpRequest.query(name, String.valueOf(entry.getValue()));
                }
            }
        }
        return this;
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> accept(String... contentType) {
        StringJoiner joiner = new StringJoiner(", ");
        for (String s : contentType) {
            int extraPos = s.indexOf(';');
            if (extraPos != -1) {
                s = s.substring(0, extraPos);
            }
            joiner.add(s);
        }
        httpRequest.header("Accept", joiner.toString());
        return this;
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> appendHeader(String name, String value) {
        return appendHeader(name, (Object) value);
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> appendHeader(String name, Range value) {
        return appendHeader(name, (Object) value);
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> appendHeader(String name, Number value) {
        return appendHeader(name, (Object) value);
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> appendHeader(String name, Date value) {
        return appendHeader(name, (Object) value);
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> appendHeader(String name, Boolean value) {
        return appendHeader(name, (Object) value);
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> appendHeader(String name, BmcEnum value) {
        if (value != null) {
            appendHeader(name, value.getValue());
        }
        return this;
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> appendEnumHeader(String name, BmcEnum value) {
        if (value != null) {
            appendHeader(name, value.getValue());
        }
        return this;
    }

    private ClientCall<REQ, RESP, RESP_BUILDER> appendHeader(String name, Object value) {
        if (name.equalsIgnoreCase(RetryTokenUtils.OPC_RETRY_TOKEN_HEADER)) {
            sendRetryToken = true;
        }
        if (value != null) {
            headers.add(name.toLowerCase(Locale.ROOT));
            httpRequest.header(name, String.valueOf(value));
        }
        return this;
    }

    /**
     * Attempts to encode a header param if it is a {@link Map}. Each key is prefixed with the value
     * passed as {@code prefix}. If a value is a {@link Collection}, then the "{prefix}{key}={item}"
     * output is repeated for each item in the collection, where "{item}" is encoded using {@link
     * ClientCall#encodeObjectQueryParam(Object)}. If the value is not a collection, then the output
     * is simply "{prefix}{key}={value}", where the value is again encoded.
     *
     * <p>Note: this should be called much lower in the HTTP stack (currently being called through
     * the generated code), so it can encode the serialized values.
     *
     * @param prefix prefix for each key
     * @param queryParam The map query parameter to encode.
     * @return a new target instance
     */
    public ClientCall<REQ, RESP, RESP_BUILDER> appendMapHeader(
            String prefix, Map<String, ?> queryParam) {
        if (prefix == null) {
            prefix = "";
        }
        if (queryParam != null) {
            for (Map.Entry<String, ?> e : queryParam.entrySet()) {
                this.appendMapHeaderParamValue(prefix + e.getKey(), e.getValue());
            }
        }
        return this;
    }

    /**
     * Attempts to encode a header parameter which is described by a list of values for that
     * parameter and a {@link com.oracle.bmc.util.internal.CollectionFormatType} which describes how
     * the values should appear in the headers (e.g. as multiple parameters, as a single parameter
     * with a given delimiter).
     *
     * @param headerParamName the name of the header parameter as it should appear in the query
     *     string
     * @param values the values for the query parameter. An empty or null list will result in no
     *     action being taken on the target instance. Additionally, any null values inside the list
     *     will be ignored
     * @param collectionFormatType describes how entries should appear in the query string, for
     *     example as multiple parameters with the name query string parameter name/key, or as a
     *     single parameter with its values separated by a delimiter character (comma, space, tab or
     *     pipe)
     * @return this ClientCall instance
     */
    public <T> ClientCall<REQ, RESP, RESP_BUILDER> appendListHeader(
            String headerParamName, List<T> values, CollectionFormatType collectionFormatType) {
        return appendListParameter(
                headerParamName,
                values,
                collectionFormatType,
                (paramName, value) -> ClientCall.this.appendHeader(paramName, value));
    }

    /**
     * Attempts to encode a parameter which is described by a list of values for that parameter and
     * a {@link com.oracle.bmc.util.internal.CollectionFormatType} which describes how the values
     * should appear in the request (e.g. as multiple parameters, as a single parameter with a given
     * delimiter).
     *
     * @param paramName the name of the parameter as it should appear in the request
     * @param values the values for the parameter. An empty or null list will result in no action
     *     being taken on the target instance. Additionally, any null values inside the list will be
     *     ignored
     * @param collectionFormatType describes how entries should appear in the query string, for
     *     example as multiple parameters with the name query string parameter name/key, or as a
     *     single parameter with its values separated by a delimiter character (comma, space, tab or
     *     pipe)
     * @param appendMethod the call to actually append the parameter
     * @return this ClientCall instance
     */
    private <T> ClientCall<REQ, RESP, RESP_BUILDER> appendListParameter(
            String paramName,
            List<T> values,
            CollectionFormatType collectionFormatType,
            BiFunction<String, Object, ClientCall<REQ, RESP, RESP_BUILDER>> appendMethod) {
        if (StringUtils.isBlank(paramName)) {
            throw new IllegalArgumentException("A non-blank paramName must be provided");
        }

        if (values != null && !values.isEmpty()) {
            final List<Object> valuesToUse = new ArrayList<>();
            for (T v : values) {
                if (v == null) {
                    continue;
                }

                if (v instanceof Enum) {
                    final Object rawValue = ReflectionUtils.invokeGetter(v, "getValue");
                    if (rawValue != null) {
                        valuesToUse.add((String) rawValue);
                    } else {
                        throw new IllegalArgumentException(
                                String.format(
                                        "Could not get the correct value for enum %s",
                                        v.getClass().getCanonicalName()));
                    }
                } else {
                    valuesToUse.add(v);
                }
            }

            if (valuesToUse.isEmpty()) {
                return this;
            }

            if (collectionFormatType == CollectionFormatType.CommaSeparated) {
                appendMethod.apply(paramName, StringUtils.join(valuesToUse, ","));
            } else if (collectionFormatType == CollectionFormatType.PipeSeparated) {
                appendMethod.apply(paramName, StringUtils.join(valuesToUse, "|"));
            } else if (collectionFormatType == CollectionFormatType.SpaceSeparated) {
                appendMethod.apply(paramName, StringUtils.join(valuesToUse, " "));
            } else if (collectionFormatType == CollectionFormatType.TabSeparated) {
                appendMethod.apply(paramName, StringUtils.join(valuesToUse, "\t"));
            } else if (collectionFormatType == CollectionFormatType.Multi) {
                for (int i = 0; i < valuesToUse.size(); i++) {
                    appendMethod.apply(paramName, valuesToUse.get(i));
                }
            } else {
                throw new IllegalArgumentException(
                        String.format("Unknown collection format type: %s", collectionFormatType));
            }
        }

        return this;
    }

    private ClientCall<REQ, RESP, RESP_BUILDER> appendMapHeaderParamValue(
            String prefixedKey, Object value) {
        String name = ParamEncoder.encodeQueryParam(prefixedKey);
        if (value instanceof Collection) {
            Collection<?> c = (Collection<?>) value;
            for (Object v : c) {
                this.appendHeader(name, encodeObjectQueryParam(v));
            }
        } else {
            this.appendHeader(name, encodeObjectQueryParam(value));
        }
        return this;
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> appendHeaders(Map<String, String> values) {
        if (values != null) {
            for (Map.Entry<String, String> entry : values.entrySet()) {
                appendHeader(entry.getKey(), entry.getValue());
            }
        }
        return this;
    }

    public <RESP_BODY> ClientCall<REQ, RESP, RESP_BUILDER> handleBody(
            Class<RESP_BODY> type, BiConsumer<RESP_BUILDER, RESP_BODY> handle) {
        responseBodyList = false;
        responseBodyUnwrappedType = type;
        responseBodyHandler = (BiConsumer) handle;
        return this;
    }

    public <RESP_BODY> ClientCall<REQ, RESP, RESP_BUILDER> handleBodyMap(
            Class<RESP_BODY> type, BiConsumer<RESP_BUILDER, Map<String, RESP_BODY>> handle) {
        responseBodyList = true;
        responseBodyUnwrappedType = type;
        responseBodyHandler = (BiConsumer) handle;
        return this;
    }

    public <RESP_BODY> ClientCall<REQ, RESP, RESP_BUILDER> handleBodyList(
            Class<RESP_BODY> type, BiConsumer<RESP_BUILDER, List<RESP_BODY>> handle) {
        responseBodyList = true;
        responseBodyUnwrappedType = type;
        responseBodyHandler = (BiConsumer) handle;
        return this;
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> handleResponseHeaderString(
            String name, BiConsumer<RESP_BUILDER, String> handle) {
        responseHeaders.put(name, handle);
        return this;
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> handleResponseHeaderInteger(
            String name, BiConsumer<RESP_BUILDER, Integer> handle) {
        return handleResponseHeaderString(name, (b, s) -> handle.accept(b, Integer.valueOf(s)));
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> handleResponseHeaderLong(
            String name, BiConsumer<RESP_BUILDER, Long> handle) {
        return handleResponseHeaderString(name, (b, s) -> handle.accept(b, Long.valueOf(s)));
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> handleResponseHeaderFloat(
            String name, BiConsumer<RESP_BUILDER, Float> handle) {
        return handleResponseHeaderString(name, (b, s) -> handle.accept(b, Float.valueOf(s)));
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> handleResponseHeaderDouble(
            String name, BiConsumer<RESP_BUILDER, Double> handle) {
        return handleResponseHeaderString(name, (b, s) -> handle.accept(b, Double.valueOf(s)));
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> handleResponseHeaderBoolean(
            String name, BiConsumer<RESP_BUILDER, Boolean> handle) {
        return handleResponseHeaderString(name, (b, s) -> handle.accept(b, Boolean.valueOf(s)));
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> handleResponseHeaderDate(
            String name, BiConsumer<RESP_BUILDER, Date> handle) {
        return handleResponseHeaderString(
                name, (b, s) -> handle.accept(b, HttpDateUtils.parse(name, s)));
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> handleResponseHeaderRange(
            String name, BiConsumer<RESP_BUILDER, Range> handle) {
        return handleResponseHeaderString(name, (b, s) -> handle.accept(b, Range.parse(s)));
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> handleResponseHeaderBigDecimal(
            String name, BiConsumer<RESP_BUILDER, BigDecimal> handle) {
        return handleResponseHeaderString(name, (b, s) -> handle.accept(b, new BigDecimal(s)));
    }

    public <E> ClientCall<REQ, RESP, RESP_BUILDER> handleResponseHeaderEnum(
            String name,
            java.util.function.Function<String, E> parse,
            BiConsumer<RESP_BUILDER, E> handle) {
        return handleResponseHeaderString(name, (b, s) -> handle.accept(b, parse.apply(s)));
    }

    public ClientCall<REQ, RESP, RESP_BUILDER> handleResponseHeadersMap(
            String prefix, BiConsumer<RESP_BUILDER, Map<String, String>> handle) {
        responseHeadersMulti.put(prefix, handle);
        return this;
    }

    private CompletionStage<RESP> transformResponse(HttpResponse rawResponse) {
        CompletionStage<RESP> failure = checkError(rawResponse);
        if (failure != null) {
            return failure;
        }

        RESP_BUILDER builder = responseBuilder.get();
        builder.__httpStatusCode__(rawResponse.status());
        builder.headers(rawResponse.headers());
        boolean notModified = rawResponse.status() == 304;
        builder.isNotModified(notModified);
        for (Map.Entry<String, BiConsumer<RESP_BUILDER, String>> headerHandler :
                responseHeaders.entrySet()) {
            String header = rawResponse.header(headerHandler.getKey());
            if (header != null) {
                headerHandler.getValue().accept(builder, header);
            }
        }
        for (Map.Entry<String, BiConsumer<RESP_BUILDER, Map<String, String>>> headerHandler :
                responseHeadersMulti.entrySet()) {
            Map<String, String> found = new HashMap<>();
            for (Map.Entry<String, List<String>> header : rawResponse.headers().entrySet()) {
                if (header.getKey().toLowerCase(Locale.ROOT).startsWith(headerHandler.getKey())) {
                    found.put(header.getKey(), header.getValue().get(0));
                }
            }
            if (!found.isEmpty()) {
                headerHandler.getValue().accept(builder, found);
            }
        }
        if (responseBodyUnwrappedType == null || notModified) {
            // e.g. DELETE
            if (!isContentLengthSet(rawResponse)) {
                // close the response explicitly, otherwise Jersey 2 and Jersey 3 have problems with
                // connections not being closed if there is no content-length header
                rawResponse.close();
            }
            return CompletableFuture.completedFuture(finalizeResponse(builder));
        }

        CompletionStage<?> future;
        if (responseBodyList) {
            future = rawResponse.listBody(responseBodyUnwrappedType);
        } else {
            if (responseBodyUnwrappedType == InputStream.class) {
                future = rawResponse.streamBody();
            } else if (responseBodyUnwrappedType == String.class) {
                future = rawResponse.textBody();
                if ("application/json".equalsIgnoreCase(rawResponse.header("Content-Type"))) {
                    future =
                            thenApply(
                                    future,
                                    deserialized -> {
                                        if (((String) deserialized).startsWith("\"")
                                                && ((String) deserialized).endsWith("\"")) {
                                            try {
                                                return Serialization.getObjectMapper()
                                                        .readValue(
                                                                (String) deserialized,
                                                                String.class);
                                            } catch (JsonProcessingException e) {
                                                logger.error(
                                                        "Unable to extract string response", e);
                                            }
                                        }
                                        return deserialized;
                                    });
                }
            } else {
                future = rawResponse.body(responseBodyUnwrappedType);
            }
        }

        return future.thenApply(
                deserialized -> {
                    responseBodyHandler.accept(builder, deserialized);
                    return finalizeResponse(builder);
                });
    }

    private static boolean isContentLengthSet(HttpResponse rawResponse) {
        for (Map.Entry<String, List<String>> header : rawResponse.headers().entrySet()) {
            if (header.getKey().equalsIgnoreCase("Content-Length")) {
                return true;
            }
        }
        return false;
    }

    private RESP finalizeResponse(RESP_BUILDER builder) {
        RESP built = builder.build();
        if (interceptResponse != null) {
            built = interceptResponse.apply(built);
        }
        return built;
    }

    private static <T> CompletionStage<T> failedFuture(Throwable t) {
        CompletableFuture<T> res = new CompletableFuture<>();
        res.completeExceptionally(t);
        return res;
    }

    private <T> CompletionStage<T> checkError(HttpResponse response) {
        int status = response.status();
        if ((status >= 200 && status < 300) || status == 304) {
            // successful or not modified
            return null;
        }
        String opcRequestId = response.header(OPC_REQUEST_ID_HEADER);
        String contentType = response.header("content-type");
        if (contentType == null || !contentType.startsWith("application/json")) {
            CompletionStage<String> responseBody =
                    response.textBody()
                            .exceptionally(
                                    e -> {
                                        // Unable to read the response body. This is non-fatal so
                                        // swallow the error and proceed.
                                        logger.warn("Unable to read response body", e);
                                        return "Cannot read response body!";
                                    });
            return thenCompose(
                    responseBody,
                    s ->
                            failedFuture(
                                    new BmcException(
                                            status,
                                            "Unknown",
                                            String.format(
                                                    "Unexpected Content-Type: %s instead of %s. Response body: %s",
                                                    contentType, "application/json", s),
                                            opcRequestId,
                                            buildServiceDetails())));
        }

        return response.body(ResponseHelper.ErrorCodeAndMessage.class)
                .handle(
                        (ecm, t) -> {
                            if (t != null) {
                                // failed to parse body
                                CompletionStage<String> msgFuture =
                                        response.textBody()
                                                .thenApply(
                                                        s -> "Unable to parse error response: " + s)
                                                .exceptionally(
                                                        e -> "Unable to parse error response.");
                                return thenCompose(
                                        msgFuture,
                                        msg ->
                                                ClientCall.<T>failedFuture(
                                                        new BmcException(
                                                                status,
                                                                "Unknown",
                                                                msg,
                                                                opcRequestId,
                                                                t,
                                                                buildServiceDetails())));
                            } else {
                                if (ecm == null) {
                                    String defaultMessage =
                                            ResponseHelper.DEFAULT_ERROR_MESSAGES.getOrDefault(
                                                    status,
                                                    "Detailed exception information not available");
                                    return ClientCall.<T>failedFuture(
                                            new BmcException(
                                                    status,
                                                    "Unknown",
                                                    defaultMessage,
                                                    opcRequestId,
                                                    buildServiceDetails()));
                                } else {
                                    return ClientCall.<T>failedFuture(
                                            new BmcException(
                                                    status,
                                                    ecm.getCode(),
                                                    ecm.getMessage(),
                                                    opcRequestId,
                                                    buildServiceDetails(),
                                                    ecm.getOriginalMessage(),
                                                    ecm.getOriginalMessageTemplate(),
                                                    ecm.getMessageArguments()));
                                }
                            }
                        })
                .thenCompose(Function.identity());
    }

    public Future<RESP> callAsync(AsyncHandler<REQ, RESP> handler) {
        try {
            return callAsync0(handler).toCompletableFuture();
        } catch (CompletionException ce) {
            throw tryUnwrapBmcException(ce);
        }
    }

    /**
     * Try to unwrap the {@link BmcException} that is somewhere in the causal chain of the {@link
     * CompletionException}, or return the original {@link CompletionException}, if there was none.
     *
     * @param ce the {@link CompletionException} which may have a {@link BmcException} in its causal
     *     chain
     * @return {@link BmcException }from causal chain, or {@link CompletionException} if there was
     *     none
     */
    public static RuntimeException tryUnwrapBmcException(CompletionException ce) {
        Throwable t = ce;
        while (t.getCause() != null) {
            if (t.getCause() instanceof BmcException) {
                // rethrow the BmcException that was the cause
                BmcException cause = (BmcException) ce.getCause();
                return cause;
            } else {
                // else go up the cause chain, maybe there is a BmcException somewhere
                t = t.getCause();
            }
        }
        // rethrow as is
        return ce;
    }

    private CompletionStage<RESP> callAsync0(AsyncHandler<REQ, RESP> handler) {
        CompletionStage<RESP> stage;
        boolean discardImmediately = true;
        try {
            stage = callAsyncWithRetrier();
            // when the request has been executed for the last time, discard our httpRequest field.
            stage.whenComplete((resp, exc) -> tryDiscardHttpRequest());
            discardImmediately = false;
        } finally {
            if (discardImmediately) {
                tryDiscardHttpRequest();
            }
        }
        if (handler != null) {
            stage =
                    stage.whenComplete(
                            (resp, exc) -> {
                                try {
                                    if (exc != null) {
                                        handler.onError(request, exc);
                                    } else {
                                        handler.onSuccess(request, resp);
                                    }
                                } catch (Exception e) {
                                    logger.error("Handler threw exception", e);
                                }
                            });
        }
        return stage;
    }

    private void tryDiscardHttpRequest() {
        try {
            // httpRequest is never executed, only copied
            httpRequest.discard();
        } catch (Exception e) {
            logger.error("Failed to discard main request", e);
        }
    }

    private CompletionStage<RESP> callAsyncWithRetrier() {
        BmcGenericRetrier retrier =
                Retriers.createPreferredRetrier(
                        request.getRetryConfiguration(),
                        retryConfiguration,
                        operationUsesDefaultRetries);
        // RetryUtils.setClientRetriesHeader
        if (!headers.contains(OPC_CLIENT_RETRIES_HEADER.toLowerCase(Locale.ROOT))) {
            TerminationStrategy terminationStrategy =
                    retrier.getWaiter().getWaiterConfiguration().getTerminationStrategy();
            boolean sendOpcClientRetries =
                    terminationStrategy instanceof MaxAttemptsTerminationStrategy
                            && ((MaxAttemptsTerminationStrategy) terminationStrategy)
                                            .getMaxAttempts()
                                    > 1;
            appendHeader(OPC_CLIENT_RETRIES_HEADER, sendOpcClientRetries);
        }
        return retrier.executeAsync(waiterScheduler, this, ClientCall::callAsyncTokenRefresh);
    }

    private CompletionStage<RESP> callAsyncTokenRefresh() {
        if (authenticationDetailsProvider instanceof RefreshableOnNotAuthenticatedProvider) {
            // note: TokenRefreshRetrier uses a delay of 0 for retries, so it doesn't actually use
            // our waiterScheduler
            TokenRefreshRetrier retrier = new TokenRefreshRetrier(authenticationDetailsProvider);
            return retrier.executeAsync(waiterScheduler, this, ClientCall::callAsyncImpl);
        } else {
            return callAsyncImpl();
        }
    }

    private CompletionStage<RESP> callAsyncImpl() {
        if (!firstAttempt && hasBinaryRequestBody) {
            Retriers.tryResetStreamForRetry((InputStream) request.getBody$(), true);
        }
        firstAttempt = false;

        if (sendRetryToken) {
            RetryTokenUtils.addRetryToken(httpRequest);
        }

        HttpRequest transientRequest = httpRequest.copy();

        RequestInterceptor invocationCallback = request.getInvocationCallback();
        if (invocationCallback != null) {
            invocationCallback.intercept(transientRequest);
        }

        List<String> present =
                transientRequest
                        .headers()
                        .getOrDefault(OPC_REQUEST_ID_HEADER, Collections.emptyList());
        if (present.isEmpty()) {
            // only add if the customer has not added it themselves.
            String requestId = generateRequestId();
            logger.debug("Generated request ID: {} for URI {}", requestId, httpRequest.uri());
            transientRequest.header(BmcException.OPC_REQUEST_ID_HEADER, requestId);
        } else {
            logger.debug("User-set request ID: {}", present.get(0));
        }

        if (circuitBreaker == null) {
            CompletionStage<HttpResponse> upstream;
            try {
                upstream = transientRequest.execute();
            } catch (Exception e) {
                return failedFuture(e);
            }
            return upstream.thenCompose(this::transformResponse);
        } else {
            if (!circuitBreaker.tryAcquirePermission()) {
                CallNotAllowedException callNotAllowed =
                        circuitBreaker.createCallNotAllowedException();
                return failedFuture(
                        BmcException.createClientSide(
                                circuitBreaker.circuitBreakerCallNotPermittedErrorMessage(
                                        httpRequest.uri().toString()),
                                callNotAllowed,
                                null,
                                buildServiceDetails()));
            }
            long start = circuitBreaker.getCurrentTimestamp();
            CompletionStage<HttpResponse> upstream;
            try {
                upstream = transientRequest.execute();
            } catch (Exception e) {
                addToHistory(e);
                circuitBreaker.onError(
                        circuitBreaker.getCurrentTimestamp() - start,
                        circuitBreaker.getTimestampUnit(),
                        e);
                return failedFuture(e);
            }
            // this is a bit unwieldy, but it's necessary to pass the HttpResponse (not the RESP
            // type) to the circuit breaker
            return thenCompose(
                    upstream,
                    resp -> {
                        try {
                            return transformResponse(resp)
                                    .whenComplete(
                                            (r, t) -> {
                                                if (t instanceof CompletionException) {
                                                    t = t.getCause();
                                                }
                                                if (t == null) {
                                                    circuitBreaker.onResult(
                                                            circuitBreaker.getCurrentTimestamp()
                                                                    - start,
                                                            circuitBreaker.getTimestampUnit(),
                                                            resp);
                                                } else {
                                                    addToHistory(t);
                                                    circuitBreaker.onError(
                                                            circuitBreaker.getCurrentTimestamp()
                                                                    - start,
                                                            circuitBreaker.getTimestampUnit(),
                                                            t);
                                                }
                                            });
                        } catch (Exception e) {
                            addToHistory(e);
                            circuitBreaker.onError(
                                    circuitBreaker.getCurrentTimestamp() - start,
                                    circuitBreaker.getTimestampUnit(),
                                    e);
                            throw e;
                        }
                    });
        }
    }

    private void addToHistory(Throwable throwable) {
        Map<String, String> messages = new LinkedHashMap<>();
        Integer status = null;
        messages.put("serviceName", serviceDetailsServiceName);
        if (throwable instanceof BmcException) {
            BmcException bmcException = (BmcException) throwable;
            messages.put("message", bmcException.getUnmodifiedMessage());
            messages.put("serviceCode", bmcException.getServiceCode());
            status = bmcException.getStatusCode();
        } else {
            messages.put("message", throwable.getMessage());
        }
        if (httpRequest != null && httpRequest.uri() != null) {
            messages.put("URL", httpRequest.uri().toString());
        }
        circuitBreaker.addToHistory(throwable, status, messages);
    }

    public RESP callSync() {
        waiterScheduler = WaiterScheduler.SYNC;
        SyncFutureWaiter futureWaiter = new SyncFutureWaiter();
        offloadExecutor = futureWaiter;
        httpRequest = httpRequest.offloadExecutor(offloadExecutor);

        try {
            return futureWaiter.listenForResult(callAsync0(null));
        } catch (BmcException e) {
            throw e;
        } catch (Throwable e) {
            throw BmcException.createClientSide("Unknown error", e, null, buildServiceDetails());
        }
    }

    private static String generateRequestId() {
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }

    private <T, U> CompletionStage<U> thenApply(
            CompletionStage<T> stage, Function<? super T, ? extends U> fn) {
        if (offloadExecutor == null) {
            return stage.thenApply(fn);
        } else {
            return stage.thenApplyAsync(fn, offloadExecutor);
        }
    }

    private <T, U> CompletionStage<U> thenCompose(
            CompletionStage<T> stage, Function<? super T, ? extends CompletionStage<U>> fn) {
        if (offloadExecutor == null) {
            return stage.thenCompose(fn);
        } else {
            return stage.thenComposeAsync(fn, offloadExecutor);
        }
    }
}
