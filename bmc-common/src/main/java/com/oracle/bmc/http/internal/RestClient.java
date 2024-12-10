/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.InternalSdk;
import com.oracle.bmc.circuitbreaker.CallNotAllowedException;
import com.oracle.bmc.circuitbreaker.JaxRsCircuitBreaker;
import com.oracle.bmc.http.ApacheUtils;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.internal.GuavaUtils;
import com.oracle.bmc.io.DuplicatableInputStream;
import com.oracle.bmc.io.internal.DuplicatableLengthLimitedInputStream;
import com.oracle.bmc.io.internal.KeepOpenInputStream;
import com.oracle.bmc.io.internal.LengthLimitedInputStream;
import com.oracle.bmc.io.internal.ResettableFileInputStream;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.requests.BmcRequest;
import com.oracle.bmc.responses.AsyncHandler;
import com.oracle.bmc.util.VisibleForTesting;
import com.oracle.bmc.util.internal.Consumer;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import org.apache.http.conn.HttpClientConnectionManager;
import org.glassfish.jersey.apache.connector.ApacheClientProperties;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.ws.rs.ProcessingException;
import javax.ws.rs.client.AsyncInvoker;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.CompletionStageRxInvoker;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.InvocationCallback;
import javax.ws.rs.client.ResponseProcessingException;
import javax.ws.rs.client.RxInvoker;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * A REST client that can make synchronous and asynchronous calls.<br/>
 * For asynchronous call, please refer to https://dennis-xlc.gitbooks.io/restful-java-with-jax-rs-2-0-2rd-edition/en/part1/chapter13/async_invoker_client_api.html
 * to understand why we'd better not mix to using callback or Java Future.
 */
public class RestClient implements AutoCloseable {
    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(RestClient.class);

    private static final String PATCH_VERB = "PATCH";
    private static final String STREAM_POTENTIAL_DATA_CORRUPTION_WARN_MSG =
            "Stream size to upload is 0 bytes, this could potentially represent data corruption in what is uploaded "
                    + "if a 0-byte upload was not your intent. If 0-byte uploads were not intended, please make sure all the OCI SDK dependencies point to the same version";

    private final EntityFactory entityFactory;
    private final Client client;

    @VisibleForTesting final JaxRsCircuitBreaker circuitBreaker;
    private final boolean isApacheNonBufferingClient;

    /**
     * The client configurator used for configuring the client. May be null.
     */
    private final ClientConfigurator clientConfigurator;
    private WrappedWebTarget baseTarget;

    private String requestUri;
    private final AtomicBoolean closedClient;

    /**
     * Create a new client that uses a provided client to make all its requests.
     * It's up to the caller to properly configure the client.
     *
     * @param client        A HTTP client to make all requests with.
     * @param entityFactory An entity factory to create entities for POST/PUT operations.
     * @param circuitBreaker A circuit breaker instance to decorate http client
     */
    public RestClient(
            @Nonnull Client client,
            @Nonnull EntityFactory entityFactory,
            JaxRsCircuitBreaker circuitBreaker) {
        this(client, entityFactory, circuitBreaker, false);
    }

    /**
     * Create a new client that uses a provided client to make all its requests.
     * It's up to the caller to properly configure the client.
     *
     * @param client        A HTTP client to make all requests with.
     * @param entityFactory An entity factory to create entities for POST/PUT operations.
     * @param circuitBreaker A circuit breaker instance to decorate http client
     * @param isApacheNonBufferingClient A boolean value to disable buffering of entities in memory for Apache client
     */
    public RestClient(
            @Nonnull Client client,
            @Nonnull EntityFactory entityFactory,
            JaxRsCircuitBreaker circuitBreaker,
            boolean isApacheNonBufferingClient) {
        this(client, entityFactory, circuitBreaker, isApacheNonBufferingClient, null);
    }

    /**
     * Create a new client that uses a provided client to make all its requests.
     * It's up to the caller to properly configure the client.
     *
     * @param client        A HTTP client to make all requests with.
     * @param entityFactory An entity factory to create entities for POST/PUT operations.
     * @param circuitBreaker A circuit breaker instance to decorate http client
     * @param isApacheNonBufferingClient A boolean value to disable buffering of entities in memory for Apache client
     * @param clientConfigurator The client configurator used when creating the client
     */
    public RestClient(
            @Nonnull Client client,
            @Nonnull EntityFactory entityFactory,
            JaxRsCircuitBreaker circuitBreaker,
            boolean isApacheNonBufferingClient,
            ClientConfigurator clientConfigurator) {
        if (client == null) {
            throw new java.lang.NullPointerException("client is marked non-null but is null");
        }
        if (entityFactory == null) {
            throw new java.lang.NullPointerException(
                    "entityFactory is marked non-null but is null");
        }
        this.client = client;
        this.entityFactory = entityFactory;
        this.circuitBreaker = circuitBreaker;
        this.isApacheNonBufferingClient = isApacheNonBufferingClient;
        this.clientConfigurator = clientConfigurator;
        this.closedClient = new AtomicBoolean(false);
    }

    /**
     * Sets the endpoint that this client should talk to.
     *
     * @param endpoint The endpoint.
     */
    public void setEndpoint(@Nonnull String endpoint) {
        if (endpoint == null) {
            throw new java.lang.NullPointerException("endpoint is marked non-null but is null");
        }
        this.baseTarget = new WrappedWebTarget(client.target(endpoint));
    }

    public Client getClient() {
        return client;
    }

    @Override
    public void close() {
        try {
            if (closedClient.compareAndSet(false, true) && client.getConfiguration() != null) {
                HttpClientConnectionManager httpClientConnectionManager =
                        (HttpClientConnectionManager)
                                client.getConfiguration()
                                        .getProperty(ApacheClientProperties.CONNECTION_MANAGER);
                if (httpClientConnectionManager != null) {
                    IdleConnectionMonitor.removeConnectionManager(httpClientConnectionManager);
                }
            }
        } catch (ClassCastException e) {
            LOG.info("Cannot call close on IdleConnectionMonitorThread");
        }

        client.close();
    }

    /**
     * Gets the target (endpoint) for this client.
     *
     * @return The target.
     */
    public WrappedWebTarget getBaseTarget() {
        if (this.baseTarget == null) {
            throw new NullPointerException("No endpoint has been configured");
        }
        return this.baseTarget;
    }

    /**
     * Gets the requestURI for this client.
     * @return the requestURI
     */
    public String getRequestUri() {
        if (this.requestUri == null) {
            throw new NullPointerException("No requestURI has been configured");
        }
        return this.requestUri;
    }

    /**
     * Sets the requestURI for this client.
     */
    public void setRequestUri(@Nonnull String requestUri) {
        if (requestUri == null) {
            throw new java.lang.NullPointerException("requestURI is marked non-null but is null");
        }
        this.requestUri = requestUri;
    }

    /**
     * Gets the underlying circuitBreaker implementation for this client
     * @return CircuitBreaker
     */
    public JaxRsCircuitBreaker getCircuitBreaker() {
        if (this.circuitBreaker == null) {
            throw new NullPointerException("CircuitBreaker has been configured");
        }
        return this.circuitBreaker;
    }

    /**
     * Ideal name for this method is decorateSupplierWithCircuitBreaker. However, I shortened it due to it's being private
     * It takes a {@code Supplier<Response>} and returns a {@code Supplier<Response>}, this pattern allows users to chain different
     * functionalities.
     * @param supplier a supplier of Response
     * @return a supplier of Response
     */
    private Supplier<Response> decorateSupplier(Supplier<Response> supplier) {
        if (circuitBreaker == null) {
            return supplier;
        } else {
            return () -> {
                try {
                    return circuitBreaker.decorateSupplier(supplier).get();
                } catch (CallNotAllowedException e) {
                    throw new BmcException(false, circuitBreakerCallNotPermittedError(), e, null);
                }
            };
        }
    }

    /**
     * Ideal name for this method is decorateFutureSupplierWithCircuitBreaker. However, I shortened it due to it's being private
     * It takes a {@code Supplier<Future<Response>>} and returns a {@code Supplier<Future<Response>>}, this pattern allows users to chain
     * different functionalities.
     * @param supplier a Supplier of {@code Future<Response>}
     * @return a Supplier of {@code Future<Response>}
     */
    private Supplier<Future<Response>> decorateFuture(Supplier<Future<Response>> supplier) {
        if (circuitBreaker == null) {
            return supplier;
        } else {
            return () -> {
                try {
                    return circuitBreaker.decorateFuture(supplier).get();
                } catch (CallNotPermittedException e) {
                    throw new BmcException(false, circuitBreakerCallNotPermittedError(), e, null);
                }
            };
        }
    }

    /**
     * Generates CircuitBreaker message when it's open.
     *
     * @return a message with error details
     */
    private String circuitBreakerCallNotPermittedError() {
        StringBuilder messageBuilder = new StringBuilder();
        messageBuilder
                .append("CircuitBreaker is OPEN and all the requests sent in a window of ")
                .append(
                        circuitBreaker
                                .getInternalCircuitBreakerConfig()
                                .getWaitDurationInOpenState()
                                .getSeconds())
                .append(" seconds will be rejected..\n");

        if (requestUri != null) {
            messageBuilder
                    .append("URL which CircuitBreaker rejected is - ")
                    .append(getRequestUri() + "\n");
        }

        if (circuitBreaker.getHistory() != null && !circuitBreaker.getHistory().trim().isEmpty()) {
            messageBuilder
                    .append("Errors which opened the CircuitBreaker:\n")
                    .append(circuitBreaker.getHistory());
        }

        return messageBuilder.toString();
    }

    // Rest APIs
    /**
     * Request a resource.
     *
     * @param ib      The invocation builder to use when making the request.
     * @param request The original client request object given to the service
     *                client.
     * @return The {@link Response} object.
     * @throws BmcException If an error was encountered while invoking the request.
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    public <T extends BmcRequest> Response get(
            @Nonnull WrappedInvocationBuilder ib, @Nonnull T request) throws BmcException {
        if (ib == null) {
            throw new java.lang.NullPointerException("ib is marked non-null but is null");
        }
        if (request == null) {
            throw new java.lang.NullPointerException("request is marked non-null but is null");
        }
        InvocationInformation info = preprocessRequest(ib, request);
        if (ib.getRequestUri() != null) {
            setRequestUri(ib.getRequestUri().toString());
        }
        try {
            return decorateSupplier(ib::get).get();
        } catch (ProcessingException ex) {
            throw convertToBmcException(baseTarget, ex, info);
        }
    }

    /**
     * Request a resource asynchronously.
     *
     * @param ib        The invocation builder to use when making the request.
     * @param request   The original client request object given to the service
     *                  client.
     * @param onSuccess The callback to invoke on success.
     * @param onError   The callback to invoke on failure.
     * @return A Future that can be used to get the Response if no Consumer was
     * provided. Note, callers should be careful not to read the entity
     * from both the future and the consumer, as the entity stream may
     * not be able to support being consumed twice.
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    public <T extends BmcRequest> Future<Response> get(
            @Nonnull WrappedInvocationBuilder ib,
            @Nonnull T request,
            @Nullable Consumer<Response> onSuccess,
            @Nullable Consumer<Throwable> onError) {
        if (ib == null) {
            throw new java.lang.NullPointerException("ib is marked non-null but is null");
        }
        if (request == null) {
            throw new java.lang.NullPointerException("request is marked non-null but is null");
        }
        InvocationInformation info = preprocessRequest(ib, request);
        if (ib.getRequestUri() != null) {
            setRequestUri(ib.getRequestUri().toString());
        }

        if (onSuccess == null && onError == null) {
            return decorateFuture(ib.async()::get).get();
        } else {
            return decorateFuture(
                            () ->
                                    ib.async()
                                            .get(
                                                    new Callback(
                                                            baseTarget, info, onSuccess, onError)))
                    .get();
        }
    }

    /**
     * Return the function that, given an {@link AsyncHandler}, makes the get request and returns the future.
     * @param interceptedRequest intercepted request
     * @param ib invocation builder
     * @param transformer transformer from JAX-RS response to model response
     * @param <B> type of the body
     * @param <REQUEST> type of the request
     * @param <RESPONSE> type of the response
     * @return future for the get request
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    public <B, REQUEST extends BmcRequest<B>, RESPONSE>
            Function<AsyncHandler<REQUEST, RESPONSE>, Future<RESPONSE>> getFutureSupplier(
                    REQUEST interceptedRequest,
                    WrappedInvocationBuilder ib,
                    Function<Response, RESPONSE> transformer) {
        return h -> {
            final com.oracle.bmc.util.internal.Consumer<Response> onSuccess =
                    new com.oracle.bmc.http.internal.SuccessConsumer<>(
                            h, transformer, interceptedRequest);
            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                    new com.oracle.bmc.http.internal.ErrorConsumer<>(h, interceptedRequest);

            Future<Response> responseFuture = get(ib, interceptedRequest, onSuccess, onError);
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        };
    }

    /**
     * Return the function that, given an {@link AsyncHandler}, makes the get request and returns the future.
     * @param interceptedRequest intercepted request
     * @param ib invocation builder
     * @param transformer transformer from JAX-RS response to model response
     * @param <B> type of the body
     * @param <REQUEST> type of the request
     * @param <RESPONSE> type of the response
     * @return future for the get request
     * @deprecated Use the method without Guava parameters instead
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    @Deprecated
    public <B, REQUEST extends BmcRequest<B>, RESPONSE>
            Function<AsyncHandler<REQUEST, RESPONSE>, Future<RESPONSE>> getFutureSupplier(
                    REQUEST interceptedRequest,
                    WrappedInvocationBuilder ib,
                    com.google.common /*Guava will be removed soon*/.base.Function<
                                    Response, RESPONSE>
                            transformer) {
        return getFutureSupplier(interceptedRequest, ib, GuavaUtils.adaptFromGuava(transformer));
    }

    /**
     * Post a request object to the endpoint represented by the web target and
     * get the response.
     *
     * @param ib      An invocation builder to execute requests with.
     * @param body    The content body to post to the web target.
     * @param request The original client request object given to the service
     *                client.
     * @return The {@link Response} object.
     * @throws BmcException If an error was encountered while invoking the request.
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    public <T extends BmcRequest> Response post(
            @Nonnull WrappedInvocationBuilder ib, @Nullable Object body, @Nonnull T request)
            throws BmcException {
        if (ib == null) {
            throw new java.lang.NullPointerException("ib is marked non-null but is null");
        }
        if (request == null) {
            throw new java.lang.NullPointerException("request is marked non-null but is null");
        }
        InvocationInformation info = preprocessRequest(ib, request);
        if (ib.getRequestUri() != null) {
            setRequestUri(ib.getRequestUri().toString());
        }
        try {
            Entity<?> requestBody =
                    this.entityFactory.forPost(request, attemptToSerialize(request, body));
            return decorateSupplier(() -> ib.post(requestBody)).get();
        } catch (ProcessingException e) {
            throw convertToBmcException(baseTarget, e, info);
        }
    }

    /**
     * Post a request object to the endpoint represented by the web target
     * asynchronously and get the response.
     *
     * @param ib        An invocation builder to execute requests with.
     * @param body      The content body to post to the web target.
     * @param request   The original client request object given to the service
     *                  client.
     * @param onSuccess The callback to invoke on success.
     * @param onError   The callback to invoke on failure.
     * @return A Future that can be used to get the Response if no Consumer was
     * provided. Note, callers should be careful not to read the entity
     * from both the future and the consumer, as the entity stream may
     * not be able to support being consumed twice.
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    public <T extends BmcRequest> Future<Response> post(
            @Nonnull WrappedInvocationBuilder ib,
            @Nullable Object body,
            @Nonnull T request,
            @Nullable Consumer<Response> onSuccess,
            @Nullable Consumer<Throwable> onError) {
        if (ib == null) {
            throw new java.lang.NullPointerException("ib is marked non-null but is null");
        }
        if (request == null) {
            throw new java.lang.NullPointerException("request is marked non-null but is null");
        }
        InvocationInformation info = preprocessRequest(ib, request);
        if (ib.getRequestUri() != null) {
            setRequestUri(ib.getRequestUri().toString());
        }
        Entity<?> requestBody =
                this.entityFactory.forPost(request, attemptToSerialize(request, body));

        if (onSuccess == null && onError == null) {
            return decorateFuture(() -> ib.async().post(requestBody)).get();
        } else {
            return decorateFuture(
                            () ->
                                    ib.async()
                                            .post(
                                                    requestBody,
                                                    new Callback(
                                                            baseTarget, info, onSuccess, onError)))
                    .get();
        }
    }

    /**
     * Return the function that, given an {@link AsyncHandler}, makes the post request and returns
     * the future
     *
     * @param interceptedRequest intercepted request
     * @param body the body of the request
     * @param ib invocation builder
     * @param transformer transformer from JAX-RS response to model response
     * @param <B> type of the body
     * @param <REQUEST> type of the request
     * @param <RESPONSE> type of the response
     * @return future for the post request
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    public <B, REQUEST extends BmcRequest<B>, RESPONSE>
            Function<AsyncHandler<REQUEST, RESPONSE>, Future<RESPONSE>> postFutureSupplier(
                    REQUEST interceptedRequest,
                    Object body,
                    WrappedInvocationBuilder ib,
                    java.util.function.Function<Response, RESPONSE> transformer) {
        return h -> {
            final Consumer<Response> onSuccess =
                    new com.oracle.bmc.http.internal.SuccessConsumer<>(
                            h, transformer, interceptedRequest);
            final Consumer<Throwable> onError =
                    new com.oracle.bmc.http.internal.ErrorConsumer<>(h, interceptedRequest);

            Future<Response> responseFuture =
                    post(ib, body, interceptedRequest, onSuccess, onError);
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        };
    }

    /**
     * Return the function that, given an {@link AsyncHandler}, makes the post request and returns the future
     * @param interceptedRequest intercepted request
     * @param body the body of the request
     * @param ib invocation builder
     * @param transformer transformer from JAX-RS response to model response
     * @param <B> type of the body
     * @param <REQUEST> type of the request
     * @param <RESPONSE> type of the response
     * @return future for the post request
     * @deprecated use the method without Guava parameters instead
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    @Deprecated
    public <B, REQUEST extends BmcRequest<B>, RESPONSE>
            Function<AsyncHandler<REQUEST, RESPONSE>, Future<RESPONSE>> postFutureSupplier(
                    REQUEST interceptedRequest,
                    Object body,
                    WrappedInvocationBuilder ib,
                    com.google.common /*Guava will be removed soon*/.base.Function<
                                    Response, RESPONSE>
                            transformer) {
        return postFutureSupplier(
                interceptedRequest, body, ib, GuavaUtils.adaptFromGuava(transformer));
    }

    /**
     * Return the function that, given an {@link AsyncHandler}, makes the post request and returns the future
     * @param interceptedRequest intercepted request
     * @param ib invocation builder
     * @param transformer transformer from JAX-RS response to model response
     * @param <B> type of the body
     * @param <REQUEST> type of the request
     * @param <RESPONSE> type of the response
     * @return future for the post request
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    public <B, REQUEST extends BmcRequest<B>, RESPONSE>
            Function<AsyncHandler<REQUEST, RESPONSE>, Future<RESPONSE>> postFutureSupplier(
                    REQUEST interceptedRequest,
                    WrappedInvocationBuilder ib,
                    java.util.function.Function<Response, RESPONSE> transformer) {
        return h -> {
            final com.oracle.bmc.util.internal.Consumer<Response> onSuccess =
                    new com.oracle.bmc.http.internal.SuccessConsumer<>(
                            h, transformer, interceptedRequest);
            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                    new com.oracle.bmc.http.internal.ErrorConsumer<>(h, interceptedRequest);

            Future<Response> responseFuture = post(ib, interceptedRequest, onSuccess, onError);
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        };
    }

    /**
     * Return the function that, given an {@link AsyncHandler}, makes the post request and returns the future
     * @param interceptedRequest intercepted request
     * @param ib invocation builder
     * @param transformer transformer from JAX-RS response to model response
     * @param <B> type of the body
     * @param <REQUEST> type of the request
     * @param <RESPONSE> type of the response
     * @return future for the post request
     * @deprecated use method without GUava parameters instead
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    @Deprecated
    public <B, REQUEST extends BmcRequest<B>, RESPONSE>
            Function<AsyncHandler<REQUEST, RESPONSE>, Future<RESPONSE>> postFutureSupplier(
                    REQUEST interceptedRequest,
                    WrappedInvocationBuilder ib,
                    com.google.common /*Guava will be removed soon*/.base.Function<
                                    Response, RESPONSE>
                            transformer) {
        return postFutureSupplier(interceptedRequest, ib, GuavaUtils.adaptFromGuava(transformer));
    }

    /**
     * Post an empty body to the endpoint represented by the web target and get
     * the response.
     *
     * @param ib      An invocation builder to execute requests with.
     * @param request The original client request object given to the service
     *                client.
     * @return The {@link Response} object.
     * @throws BmcException If an error was encountered while invoking the request.
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    public <T extends BmcRequest> Response post(
            @Nonnull WrappedInvocationBuilder ib, @Nonnull T request) {
        if (ib == null) {
            throw new java.lang.NullPointerException("ib is marked non-null but is null");
        }
        if (request == null) {
            throw new java.lang.NullPointerException("request is marked non-null but is null");
        }
        return post(ib, null, request);
    }

    /**
     * Post an empty body to the endpoint represented by the web target
     * asynchronously and get the response.
     *
     * @param ib        An invocation builder to execute requests with.
     * @param request   The original client request object given to the service
     *                  client.
     * @param onSuccess The callback to invoke on success.
     * @param onError   The callback to invoke on failure.
     * @return A Future that can be used to get the Response if no Consumer was
     * provided. Note, callers should be careful not to read the entity
     * from both the future and the consumer, as the entity stream may
     * not be able to support being consumed twice.
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    public <T extends BmcRequest> Future<Response> post(
            @Nonnull WrappedInvocationBuilder ib,
            @Nonnull T request,
            @Nullable Consumer<Response> onSuccess,
            @Nullable Consumer<Throwable> onError) {
        if (ib == null) {
            throw new java.lang.NullPointerException("ib is marked non-null but is null");
        }
        if (request == null) {
            throw new java.lang.NullPointerException("request is marked non-null but is null");
        }
        return post(ib, null, request, onSuccess, onError);
    }

    /**
     * Patch a request object without body to the endpoint represented by the web target and
     * get the response.
     *
     * @param ib      An invocation builder to execute requests with.
     * @param request The original client request object given to the service
     *                client.
     * @return The {@link Response} object.
     * @throws BmcException If an error was encountered while invoking the request.
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    public <T extends BmcRequest> Response patch(
            @Nonnull WrappedInvocationBuilder ib, @Nonnull T request) {
        if (ib == null) {
            throw new java.lang.NullPointerException("ib is marked non-null but is null");
        }
        if (request == null) {
            throw new java.lang.NullPointerException("request is marked non-null but is null");
        }
        return patch(ib, null, request);
    }

    /**
     * Patch a request object to the endpoint represented by the web target and
     * get the response.
     *
     * @param ib      An invocation builder to execute requests with.
     * @param body    The content body to post to the web target.
     * @param request The original client request object given to the service
     *                client.
     * @return The {@link Response} object.
     * @throws BmcException If an error was encountered while invoking the request.
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    public <T extends BmcRequest> Response patch(
            @Nonnull WrappedInvocationBuilder ib, @Nullable Object body, @Nonnull T request)
            throws BmcException {
        if (ib == null) {
            throw new java.lang.NullPointerException("ib is marked non-null but is null");
        }
        if (request == null) {
            throw new java.lang.NullPointerException("request is marked non-null but is null");
        }
        InvocationInformation info = preprocessRequest(ib, request);
        if (ib.getRequestUri() != null) {
            setRequestUri(ib.getRequestUri().toString());
        }
        try {
            Entity<?> requestBody =
                    this.entityFactory.forPatch(request, attemptToSerialize(request, body));
            return decorateSupplier(() -> ib.method(PATCH_VERB, requestBody)).get();
        } catch (ProcessingException e) {
            throw convertToBmcException(baseTarget, e, info);
        }
    }

    /**
     * Patch a request object without body to the endpoint represented by the web target
     * asynchronously and get the response.
     *
     * @param ib        An invocation builder to execute requests with.
     * @param request   The original client request object given to the service
     *                  client.
     * @param onSuccess The callback to invoke on success.
     * @param onError   The callback to invoke on failure.
     * @return A Future that can be used to get the Response if no Consumer was
     * provided. Note, callers should be careful not to read the entity
     * from both the future and the consumer, as the entity stream may
     * not be able to support being consumed twice.
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    public <T extends BmcRequest> Future<Response> patch(
            @Nonnull WrappedInvocationBuilder ib,
            @Nonnull T request,
            @Nullable Consumer<Response> onSuccess,
            @Nullable Consumer<Throwable> onError) {
        if (ib == null) {
            throw new java.lang.NullPointerException("ib is marked non-null but is null");
        }
        if (request == null) {
            throw new java.lang.NullPointerException("request is marked non-null but is null");
        }
        return patch(ib, null, request, onSuccess, onError);
    }

    /**
     * Patch a request object to the endpoint represented by the web target
     * asynchronously and get the response.
     *
     * @param ib        An invocation builder to execute requests with.
     * @param body      The content body object to post to the web target.
     * @param request   The original client request object given to the service
     *                  client.
     * @param onSuccess The callback to invoke on success.
     * @param onError   The callback to invoke on failure.
     * @return A Future that can be used to get the Response if no Consumer was
     * provided. Note, callers should be careful not to read the entity
     * from both the future and the consumer, as the entity stream may
     * not be able to support being consumed twice.
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    public <T extends BmcRequest> Future<Response> patch(
            @Nonnull WrappedInvocationBuilder ib,
            @Nullable Object body,
            @Nonnull T request,
            @Nullable Consumer<Response> onSuccess,
            @Nullable Consumer<Throwable> onError) {
        if (ib == null) {
            throw new java.lang.NullPointerException("ib is marked non-null but is null");
        }
        if (request == null) {
            throw new java.lang.NullPointerException("request is marked non-null but is null");
        }
        InvocationInformation info = preprocessRequest(ib, request);
        if (ib.getRequestUri() != null) {
            setRequestUri(ib.getRequestUri().toString());
        }
        Entity<?> requestBody =
                this.entityFactory.forPatch(request, attemptToSerialize(request, body));

        if (onSuccess == null && onError == null) {
            return decorateFuture(() -> ib.async().method(PATCH_VERB, requestBody)).get();
        } else {
            return decorateFuture(
                            () ->
                                    ib.async()
                                            .method(
                                                    PATCH_VERB,
                                                    requestBody,
                                                    new Callback(
                                                            baseTarget, info, onSuccess, onError)))
                    .get();
        }
    }

    /**
     * Return the function that, given an {@link AsyncHandler}, makes the patch request and returns the future
     * @param interceptedRequest intercepted request
     * @param ib invocation builder
     * @param transformer transformer from JAX-RS response to model response
     * @param <B> type of the body
     * @param <REQUEST> type of the request
     * @param <RESPONSE> type of the response
     * @return future for the patch request
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    public <B, REQUEST extends BmcRequest<B>, RESPONSE>
            Function<AsyncHandler<REQUEST, RESPONSE>, Future<RESPONSE>> patchFutureSupplier(
                    REQUEST interceptedRequest,
                    WrappedInvocationBuilder ib,
                    java.util.function.Function<Response, RESPONSE> transformer) {
        return h -> {
            final com.oracle.bmc.util.internal.Consumer<Response> onSuccess =
                    new com.oracle.bmc.http.internal.SuccessConsumer<>(
                            h, transformer, interceptedRequest);
            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                    new com.oracle.bmc.http.internal.ErrorConsumer<>(h, interceptedRequest);

            Future<Response> responseFuture = patch(ib, interceptedRequest, onSuccess, onError);
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        };
    }

    /**
     * Return the function that, given an {@link AsyncHandler}, makes the patch request and returns the future
     * @param interceptedRequest intercepted request
     * @param ib invocation builder
     * @param transformer transformer from JAX-RS response to model response
     * @param <B> type of the body
     * @param <REQUEST> type of the request
     * @param <RESPONSE> type of the response
     * @return future for the patch request
     * @deprecated use method without Guava parameters instead
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    @Deprecated
    public <B, REQUEST extends BmcRequest<B>, RESPONSE>
            Function<AsyncHandler<REQUEST, RESPONSE>, Future<RESPONSE>> patchFutureSupplier(
                    REQUEST interceptedRequest,
                    WrappedInvocationBuilder ib,
                    com.google.common /*Guava will be removed soon*/.base.Function<
                                    Response, RESPONSE>
                            transformer) {
        return patchFutureSupplier(interceptedRequest, ib, GuavaUtils.adaptFromGuava(transformer));
    }

    /**
     * Return the function that, given an {@link AsyncHandler}, makes the patch request and returns the future
     * @param interceptedRequest intercepted request
     * @param body the body of the request
     * @param ib invocation builder
     * @param transformer transformer from JAX-RS response to model response
     * @param <B> type of the body
     * @param <REQUEST> type of the request
     * @param <RESPONSE> type of the response
     * @return future for the patch request
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    public <B, REQUEST extends BmcRequest<B>, RESPONSE>
            Function<AsyncHandler<REQUEST, RESPONSE>, Future<RESPONSE>> patchFutureSupplier(
                    REQUEST interceptedRequest,
                    Object body,
                    WrappedInvocationBuilder ib,
                    java.util.function.Function<Response, RESPONSE> transformer) {
        return h -> {
            final com.oracle.bmc.util.internal.Consumer<Response> onSuccess =
                    new com.oracle.bmc.http.internal.SuccessConsumer<>(
                            h, transformer, interceptedRequest);
            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                    new com.oracle.bmc.http.internal.ErrorConsumer<>(h, interceptedRequest);

            Future<Response> responseFuture =
                    patch(ib, body, interceptedRequest, onSuccess, onError);
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        };
    }

    /**
     * Return the function that, given an {@link AsyncHandler}, makes the patch request and returns the future
     * @param interceptedRequest intercepted request
     * @param body the body of the request
     * @param ib invocation builder
     * @param transformer transformer from JAX-RS response to model response
     * @param <B> type of the body
     * @param <REQUEST> type of the request
     * @param <RESPONSE> type of the response
     * @return future for the patch request
     * @deprecated use method without Guava parameters instead
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    @Deprecated
    public <B, REQUEST extends BmcRequest<B>, RESPONSE>
            Function<AsyncHandler<REQUEST, RESPONSE>, Future<RESPONSE>> patchFutureSupplier(
                    REQUEST interceptedRequest,
                    Object body,
                    WrappedInvocationBuilder ib,
                    com.google.common /*Guava will be removed soon*/.base.Function<
                                    Response, RESPONSE>
                            transformer) {
        return patchFutureSupplier(
                interceptedRequest, body, ib, GuavaUtils.adaptFromGuava(transformer));
    }

    /**
     * Put a request object without body to the endpoint represented by the web target and
     * get the response.
     *
     * @param ib      An invocation builder to execute requests with.
     * @param request The original client request object given to the service
     *                client.
     * @return The {@link Response} object.
     * @throws BmcException If an error was encountered while invoking the request.
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    public <T extends BmcRequest> Response put(
            @Nonnull WrappedInvocationBuilder ib, @Nonnull T request) {
        return put(ib, null, request);
    }

    /**
     * Put a request object to the endpoint represented by the web target and
     * get the response.
     *
     * @param ib
     *            An invocation builder to execute requests with.
     * @param body
     *            The content body to post to the web target.
     * @param request
     *            The original client request object given to the service
     *            client.
     * @return The {@link Response} object.
     * @throws BmcException
     *             If an error was encountered while invoking the request.
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    public <T extends BmcRequest> Response put(
            @Nonnull WrappedInvocationBuilder ib, @Nullable Object body, @Nonnull T request)
            throws BmcException {
        if (ib == null) {
            throw new java.lang.NullPointerException("ib is marked non-null but is null");
        }
        if (request == null) {
            throw new java.lang.NullPointerException("request is marked non-null but is null");
        }
        InvocationInformation info = preprocessRequest(ib, request);
        if (ib.getRequestUri() != null) {
            setRequestUri(ib.getRequestUri().toString());
        }
        try {
            Entity<?> requestBody;
            List<Object> contentLengthHeader = ib.getHeaders().get(HttpHeaders.CONTENT_LENGTH);
            if (contentLengthHeader != null && contentLengthHeader.size() > 0) {
                long contentLength = Long.parseLong(contentLengthHeader.get(0).toString());
                requestBody =
                        this.entityFactory.forPut(
                                request,
                                attemptToSerialize(request, body, Optional.of(contentLength)));
            } else {
                requestBody = this.entityFactory.forPut(request, attemptToSerialize(request, body));
            }
            return decorateSupplier(() -> ib.put(requestBody)).get();
        } catch (ProcessingException e) {
            throw convertToBmcException(baseTarget, e, info);
        }
    }

    /**
     * Put a request object without body to the endpoint represented by the web target
     * asynchronously and get the response.
     *
     * @param ib
     *            An invocation builder to execute requests with.
     * @param request
     *            The original client request object given to the service
     *            client.
     * @param onSuccess
     *            The callback to invoke on success.
     * @param onError
     *            The callback to invoke on failure.
     * @return A Future that can be used to get the Response if no Consumer was
     *         provided. Note, callers should be careful not to read the entity
     *         from both the future and the consumer, as the entity stream may
     *         not be able to support being consumed twice.
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    public <T extends BmcRequest> Future<Response> put(
            @Nonnull WrappedInvocationBuilder ib,
            @Nonnull T request,
            @Nullable Consumer<Response> onSuccess,
            @Nullable Consumer<Throwable> onError) {
        if (ib == null) {
            throw new java.lang.NullPointerException("ib is marked non-null but is null");
        }
        if (request == null) {
            throw new java.lang.NullPointerException("request is marked non-null but is null");
        }
        return put(ib, null, request, onSuccess, onError);
    }

    /**
     * Put a request object to the endpoint represented by the web target
     * asynchronously and get the response.
     *
     * @param ib
     *            An invocation builder to execute requests with.
     * @param body
     *            The content body to post to the web target.
     * @param request
     *            The original client request object given to the service
     *            client.
     * @param onSuccess
     *            The callback to invoke on success.
     * @param onError
     *            The callback to invoke on failure.
     * @return A Future that can be used to get the Response if no Consumer was
     *         provided. Note, callers should be careful not to read the entity
     *         from both the future and the consumer, as the entity stream may
     *         not be able to support being consumed twice.
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    public <T extends BmcRequest> Future<Response> put(
            @Nonnull WrappedInvocationBuilder ib,
            @Nullable Object body,
            @Nonnull T request,
            @Nullable Consumer<Response> onSuccess,
            @Nullable Consumer<Throwable> onError) {
        if (ib == null) {
            throw new java.lang.NullPointerException("ib is marked non-null but is null");
        }
        if (request == null) {
            throw new java.lang.NullPointerException("request is marked non-null but is null");
        }
        InvocationInformation info = preprocessRequest(ib, request);
        if (ib.getRequestUri() != null) {
            setRequestUri(ib.getRequestUri().toString());
        }
        Entity<?> requestBody =
                this.entityFactory.forPut(request, attemptToSerialize(request, body));

        if (onSuccess == null && onError == null) {
            return decorateFuture(() -> ib.async().put(requestBody)).get();
        } else {
            return decorateFuture(
                            () ->
                                    ib.async()
                                            .put(
                                                    requestBody,
                                                    new Callback(
                                                            baseTarget, info, onSuccess, onError)))
                    .get();
        }
    }

    /**
     * Return the function that, given an {@link AsyncHandler}, makes the put request and returns the future
     * @param interceptedRequest intercepted request
     * @param ib invocation builder
     * @param transformer transformer from JAX-RS response to model response
     * @param <B> type of the body
     * @param <REQUEST> type of the request
     * @param <RESPONSE> type of the response
     * @return future for the put request
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    public <B, REQUEST extends BmcRequest<B>, RESPONSE>
            Function<AsyncHandler<REQUEST, RESPONSE>, Future<RESPONSE>> putFutureSupplier(
                    REQUEST interceptedRequest,
                    WrappedInvocationBuilder ib,
                    java.util.function.Function<Response, RESPONSE> transformer) {
        return h -> {
            final com.oracle.bmc.util.internal.Consumer<Response> onSuccess =
                    new com.oracle.bmc.http.internal.SuccessConsumer<>(
                            h, transformer, interceptedRequest);
            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                    new com.oracle.bmc.http.internal.ErrorConsumer<>(h, interceptedRequest);

            Future<Response> responseFuture = put(ib, interceptedRequest, onSuccess, onError);
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        };
    }

    /**
     * Return the function that, given an {@link AsyncHandler}, makes the put request and returns the future
     * @param interceptedRequest intercepted request
     * @param ib invocation builder
     * @param transformer transformer from JAX-RS response to model response
     * @param <B> type of the body
     * @param <REQUEST> type of the request
     * @param <RESPONSE> type of the response
     * @return future for the put request
     * @deprecated use the method without Guava parameters instead
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    @Deprecated
    public <B, REQUEST extends BmcRequest<B>, RESPONSE>
            Function<AsyncHandler<REQUEST, RESPONSE>, Future<RESPONSE>> putFutureSupplier(
                    REQUEST interceptedRequest,
                    WrappedInvocationBuilder ib,
                    com.google.common /*Guava will be removed soon*/.base.Function<
                                    Response, RESPONSE>
                            transformer) {
        return putFutureSupplier(interceptedRequest, ib, GuavaUtils.adaptFromGuava(transformer));
    }

    /**
     * Return the function that, given an {@link AsyncHandler}, makes the put request and returns the future
     * @param interceptedRequest intercepted request
     * @param body the body of the request
     * @param ib invocation builder
     * @param transformer transformer from JAX-RS response to model response
     * @param <B> type of the body
     * @param <REQUEST> type of the request
     * @param <RESPONSE> type of the response
     * @return future for the put request
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    public <B, REQUEST extends BmcRequest<B>, RESPONSE>
            Function<AsyncHandler<REQUEST, RESPONSE>, Future<RESPONSE>> putFutureSupplier(
                    REQUEST interceptedRequest,
                    Object body,
                    WrappedInvocationBuilder ib,
                    java.util.function.Function<Response, RESPONSE> transformer) {
        return h -> {
            final com.oracle.bmc.util.internal.Consumer<Response> onSuccess =
                    new com.oracle.bmc.http.internal.SuccessConsumer<>(
                            h, transformer, interceptedRequest);
            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                    new com.oracle.bmc.http.internal.ErrorConsumer<>(h, interceptedRequest);

            Future<Response> responseFuture = put(ib, body, interceptedRequest, onSuccess, onError);
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        };
    }

    /**
     * Return the function that, given an {@link AsyncHandler}, makes the put request and returns the future
     * @param interceptedRequest intercepted request
     * @param body the body of the request
     * @param ib invocation builder
     * @param transformer transformer from JAX-RS response to model response
     * @param <B> type of the body
     * @param <REQUEST> type of the request
     * @param <RESPONSE> type of the response
     * @return future for the put request
     * @deprecated use the method without Guava parameters instead
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    @Deprecated
    public <B, REQUEST extends BmcRequest<B>, RESPONSE>
            Function<AsyncHandler<REQUEST, RESPONSE>, Future<RESPONSE>> putFutureSupplier(
                    REQUEST interceptedRequest,
                    Object body,
                    WrappedInvocationBuilder ib,
                    com.google.common /*Guava will be removed soon*/.base.Function<
                                    Response, RESPONSE>
                            transformer) {
        return putFutureSupplier(
                interceptedRequest, body, ib, GuavaUtils.adaptFromGuava(transformer));
    }

    /**
     * Execute a delete on a resource and get the response.
     *
     * @param ib
     *            An invocation builder to execute requests with.
     * @param request
     *            The original client request object given to the service
     *            client.
     * @return The {@link Response} object.
     * @throws BmcException
     *             If an error was encountered while invoking the request.
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    public <T extends BmcRequest> Response delete(
            @Nonnull WrappedInvocationBuilder ib, @Nonnull T request) throws BmcException {
        if (ib == null) {
            throw new java.lang.NullPointerException("ib is marked non-null but is null");
        }
        if (request == null) {
            throw new java.lang.NullPointerException("request is marked non-null but is null");
        }
        InvocationInformation info = preprocessRequest(ib, request);
        if (ib.getRequestUri() != null) {
            setRequestUri(ib.getRequestUri().toString());
        }
        try {
            return decorateSupplier(() -> ib.delete(Response.class)).get();
        } catch (ProcessingException e) {
            throw convertToBmcException(baseTarget, e, info);
        }
    }

    /**
     * Execute a delete on a resource asynchronously and get the response.
     *
     * @param ib
     *            An invocation builder to execute requests with.
     * @param request
     *            The original client request object given to the service
     *            client.
     * @param onSuccess
     *            The callback to invoke on success.
     * @param onError
     *            The callback to invoke on failure.
     * @return A Future that can be used to get the Response if no Consumer was
     *         provided. Note, callers should be careful not to read the entity
     *         from both the future and the consumer, as the entity stream may
     *         not be able to support being consumed twice.
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    public <T extends BmcRequest> Future<Response> delete(
            @Nonnull WrappedInvocationBuilder ib,
            @Nonnull T request,
            @Nullable Consumer<Response> onSuccess,
            @Nullable Consumer<Throwable> onError) {
        if (ib == null) {
            throw new java.lang.NullPointerException("ib is marked non-null but is null");
        }
        if (request == null) {
            throw new java.lang.NullPointerException("request is marked non-null but is null");
        }
        InvocationInformation info = preprocessRequest(ib, request);
        if (ib.getRequestUri() != null) {
            setRequestUri(ib.getRequestUri().toString());
        }
        if (onSuccess == null && onError == null) {
            return decorateFuture(() -> ib.async().delete()).get();
        } else {
            return decorateFuture(
                            () ->
                                    ib.async()
                                            .delete(
                                                    new Callback(
                                                            baseTarget, info, onSuccess, onError)))
                    .get();
        }
    }

    /**
     * Return the function that, given an {@link AsyncHandler}, makes the delete request and returns the future.
     * @param interceptedRequest intercepted request
     * @param ib invocation builder
     * @param transformer transformer from JAX-RS response to model response
     * @param <B> type of the body
     * @param <REQUEST> type of the request
     * @param <RESPONSE> type of the response
     * @return future for the post request
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    public <B, REQUEST extends BmcRequest<B>, RESPONSE>
            Function<AsyncHandler<REQUEST, RESPONSE>, Future<RESPONSE>> deleteFutureSupplier(
                    REQUEST interceptedRequest,
                    WrappedInvocationBuilder ib,
                    java.util.function.Function<Response, RESPONSE> transformer) {
        return h -> {
            final com.oracle.bmc.util.internal.Consumer<Response> onSuccess =
                    new com.oracle.bmc.http.internal.SuccessConsumer<>(
                            h, transformer, interceptedRequest);
            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                    new com.oracle.bmc.http.internal.ErrorConsumer<>(h, interceptedRequest);

            Future<Response> responseFuture = delete(ib, interceptedRequest, onSuccess, onError);
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        };
    }

    /**
     * Return the function that, given an {@link AsyncHandler}, makes the delete request and returns the future.
     * @param interceptedRequest intercepted request
     * @param ib invocation builder
     * @param transformer transformer from JAX-RS response to model response
     * @param <B> type of the body
     * @param <REQUEST> type of the request
     * @param <RESPONSE> type of the response
     * @return future for the post request
     * @deprecated use the method without Guava parameters instead
     */
    @Deprecated
    @InternalSdk(backwardCompatibilityRequired = true)
    public <B, REQUEST extends BmcRequest<B>, RESPONSE>
            Function<AsyncHandler<REQUEST, RESPONSE>, Future<RESPONSE>> deleteFutureSupplier(
                    REQUEST interceptedRequest,
                    WrappedInvocationBuilder ib,
                    com.google.common /*Guava will be removed soon*/.base.Function<
                                    Response, RESPONSE>
                            transformer) {
        return deleteFutureSupplier(interceptedRequest, ib, GuavaUtils.adaptFromGuava(transformer));
    }

    /**
     * Execute a head request for a resource and return the response.
     *
     * @param ib
     *            An invocation builder to execute requests with.
     * @param request
     *            The original client request object given to the service
     *            client.
     * @return The {@link Response} object.
     * @throws BmcException
     *             If an error was encountered while invoking the request.
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    public <T extends BmcRequest> Response head(
            @Nonnull WrappedInvocationBuilder ib, @Nonnull T request) throws BmcException {
        if (ib == null) {
            throw new java.lang.NullPointerException("ib is marked non-null but is null");
        }
        if (request == null) {
            throw new java.lang.NullPointerException("request is marked non-null but is null");
        }
        InvocationInformation info = preprocessRequest(ib, request);
        if (ib.getRequestUri() != null) {
            setRequestUri(ib.getRequestUri().toString());
        }
        try {
            return decorateSupplier(ib::head).get();
        } catch (ProcessingException ex) {
            throw convertToBmcException(baseTarget, ex, info);
        }
    }

    /**
     * Execute a head request for a resource asynchronously and return the
     * response.
     *
     * @param ib
     *            An invocation builder to execute requests with.
     * @param request
     *            The original client request object given to the service
     *            client.
     * @param onSuccess
     *            The callback to invoke on success.
     * @param onError
     *            The callback to invoke on failure.
     * @return A Future that can be used to get the Response if no Consumer was
     *         provided. Note, callers should be careful not to read the entity
     *         from both the future and the consumer, as the entity stream may
     *         not be able to support being consumed twice.
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    public <T extends BmcRequest> Future<Response> head(
            @Nonnull WrappedInvocationBuilder ib,
            @Nonnull T request,
            @Nullable Consumer<Response> onSuccess,
            @Nullable Consumer<Throwable> onError) {
        if (ib == null) {
            throw new java.lang.NullPointerException("ib is marked non-null but is null");
        }
        if (request == null) {
            throw new java.lang.NullPointerException("request is marked non-null but is null");
        }
        InvocationInformation info = preprocessRequest(ib, request);
        if (ib.getRequestUri() != null) {
            setRequestUri(ib.getRequestUri().toString());
        }

        if (onSuccess == null && onError == null) {
            return decorateFuture(ib.async()::head).get();
        } else {
            return decorateFuture(
                            () ->
                                    ib.async()
                                            .head(
                                                    new Callback(
                                                            baseTarget, info, onSuccess, onError)))
                    .get();
        }
    }

    /**
     * Return the function that, given an {@link AsyncHandler}, makes the head request and returns the future.
     * @param interceptedRequest intercepted request
     * @param ib invocation builder
     * @param transformer transformer from JAX-RS response to model response
     * @param <B> type of the body
     * @param <REQUEST> type of the request
     * @param <RESPONSE> type of the response
     * @return future for the head request
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    public <B, REQUEST extends BmcRequest<B>, RESPONSE>
            Function<AsyncHandler<REQUEST, RESPONSE>, Future<RESPONSE>> headFutureSupplier(
                    REQUEST interceptedRequest,
                    WrappedInvocationBuilder ib,
                    java.util.function.Function<Response, RESPONSE> transformer) {
        return h -> {
            final com.oracle.bmc.util.internal.Consumer<Response> onSuccess =
                    new com.oracle.bmc.http.internal.SuccessConsumer<>(
                            h, transformer, interceptedRequest);
            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                    new com.oracle.bmc.http.internal.ErrorConsumer<>(h, interceptedRequest);

            Future<Response> responseFuture = head(ib, interceptedRequest, onSuccess, onError);
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        };
    }

    /**
     * Return the function that, given an {@link AsyncHandler}, makes the head request and returns the future.
     * @param interceptedRequest intercepted request
     * @param ib invocation builder
     * @param transformer transformer from JAX-RS response to model response
     * @param <B> type of the body
     * @param <REQUEST> type of the request
     * @param <RESPONSE> type of the response
     * @return future for the head request
     * @deprecated use method without Guava parameters instead
     */
    @InternalSdk(backwardCompatibilityRequired = true)
    @Deprecated
    public <B, REQUEST extends BmcRequest<B>, RESPONSE>
            Function<AsyncHandler<REQUEST, RESPONSE>, Future<RESPONSE>> headFutureSupplier(
                    REQUEST interceptedRequest,
                    WrappedInvocationBuilder ib,
                    com.google.common /*Guava will be removed soon*/.base.Function<
                                    Response, RESPONSE>
                            transformer) {
        return headFutureSupplier(interceptedRequest, ib, GuavaUtils.adaptFromGuava(transformer));
    }

    /**
     * Wraps a ProcessingException as a BmcException.
     *
     * @param target
     *            The target being called.
     * @param e
     *            The processing exception.
     * @return A new BmcException.
     */
    private static BmcException convertToBmcException(
            WebTarget target, ProcessingException e, InvocationInformation info) {

        if (e instanceof ResponseProcessingException) {
            final ResponseProcessingException responseProcessingException =
                    (ResponseProcessingException) e;
            final Response response = responseProcessingException.getResponse();
            if (response != null) {
                final String statusMessage =
                        response.getStatusInfo() != null
                                ? response.getStatusInfo().getReasonPhrase()
                                : "";
                return new BmcException(
                        response.getStatus(),
                        statusMessage,
                        e.getMessage(),
                        info.getRequestId(),
                        e);
            }
        }

        Throwable t = getRootCause(e);
        if (t instanceof InterruptedIOException) {
            return new BmcException(
                    true,
                    "Timed out while communicating to: " + getUriSafe(target),
                    e,
                    info.getRequestId());
        }

        return new BmcException(
                false,
                "Processing exception while communicating to: " + getUriSafe(target),
                e,
                info.getRequestId());
    }

    static Throwable getRootCause(Throwable t) {
        while (t.getCause() != null) {
            t = t.getCause();
        }
        return t;
    }

    /**
     * Exception safe wrapper for WebTarget.getUri() which throws an exception if the client is closed.
     * It breaks the convertToBmcException when the exception root cause is IllegalStateException
     * and fails to invoke onError on the user's supplied InvocationCallback.
     * @param target
     *  The target being called
     * @return Target URI String
     */
    private static String getUriSafe(WebTarget target) {
        try {
            return target.getUriBuilder().toTemplate();
        } catch (Exception ex) {
            LOG.error("Error getting target URI string", ex);
            return "<error getting target URI string>: " + ex.getMessage();
        }
    }

    static <T extends BmcRequest> InvocationInformation preprocessRequest(
            WrappedInvocationBuilder ib, T request) {
        NonSubmittingInvocationBuilder nonSubmittingInvocationBuilder =
                new NonSubmittingInvocationBuilder(ib);
        Consumer<Invocation.Builder> invocationPreprocessor = request.getInvocationCallback();
        if (invocationPreprocessor != null) {
            invocationPreprocessor.accept(nonSubmittingInvocationBuilder);
        }

        Object first = ib.getHeaders().getFirst(BmcException.OPC_REQUEST_ID_HEADER);
        String requestId;
        if (first == null) {
            // only add if the customer has not added it themselves.
            requestId = generateRequestId();
            LOG.debug("Generated request ID: {} for URI {}", requestId, ib.getRequestUri());
            ib.header(BmcException.OPC_REQUEST_ID_HEADER, requestId);
        } else {
            requestId = first.toString();
            LOG.debug("User-set request ID: {}", requestId);
        }

        return new InvocationInformation(requestId, ib.getHeaders());
    }

    public static String generateRequestId() {
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }

    // prevents users from being able to call any method that actually submits the request
    static class NonSubmittingInvocationBuilder extends ForwardingInvocationBuilder {
        private final WrappedInvocationBuilder delegate;

        @Override
        public Invocation.Builder delegate() {
            return delegate;
        }

        @Override
        public Response get() {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public <T> T get(Class<T> responseType) {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public <T> T get(GenericType<T> responseType) {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public Response put(Entity<?> entity) {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public <T> T put(Entity<?> entity, Class<T> responseType) {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public <T> T put(Entity<?> entity, GenericType<T> responseType) {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public Response post(Entity<?> entity) {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public <T> T post(Entity<?> entity, Class<T> responseType) {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public <T> T post(Entity<?> entity, GenericType<T> responseType) {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public Response delete() {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public <T> T delete(Class<T> responseType) {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public <T> T delete(GenericType<T> responseType) {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public Response head() {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public Response options() {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public <T> T options(Class<T> responseType) {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public <T> T options(GenericType<T> responseType) {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public Response trace() {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public <T> T trace(Class<T> responseType) {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public <T> T trace(GenericType<T> responseType) {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public Response method(String name) {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public <T> T method(String name, Class<T> responseType) {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public <T> T method(String name, GenericType<T> responseType) {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public Response method(String name, Entity<?> entity) {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public <T> T method(String name, Entity<?> entity, Class<T> responseType) {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public <T> T method(String name, Entity<?> entity, GenericType<T> responseType) {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public Invocation build(String method) {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public Invocation build(String method, Entity<?> entity) {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public Invocation buildGet() {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public Invocation buildDelete() {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public Invocation buildPost(Entity<?> entity) {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public Invocation buildPut(Entity<?> entity) {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public AsyncInvoker async() {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public CompletionStageRxInvoker rx() {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @Override
        public <T extends RxInvoker> T rx(Class<T> aClass) {
            throw new UnsupportedOperationException("Cannot issue request directly");
        }

        @java.beans.ConstructorProperties({"delegate"})
        public NonSubmittingInvocationBuilder(final WrappedInvocationBuilder delegate) {
            this.delegate = delegate;
        }
    }

    private static class Callback implements InvocationCallback<Response> {
        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Callback.class);

        private final WebTarget baseTarget;
        private final InvocationInformation info;
        private final Consumer<Response> onSuccess;
        private final Consumer<Throwable> onError;

        private Callback(
                @Nonnull WebTarget baseTarget,
                @Nonnull InvocationInformation info,
                @Nullable Consumer<Response> onSuccess,
                @Nullable Consumer<Throwable> onError) {
            if (baseTarget == null) {
                throw new java.lang.NullPointerException(
                        "baseTarget is marked non-null but is null");
            }
            if (info == null) {
                throw new java.lang.NullPointerException("info is marked non-null but is null");
            }
            this.baseTarget = baseTarget;
            this.info = info;
            this.onSuccess = onSuccess;
            this.onError = onError;
        }

        @Override
        public void completed(Response response) {
            if (onSuccess == null) {
                LOG.debug("Request completed sucessfully but no handler configured");
                return;
            }

            try {
                onSuccess.accept(response);
            } catch (Exception e) {
                LOG.debug("Failure during success handling", e);
                failed(e);
            }
        }

        @Override
        public void failed(Throwable throwable) {
            if (onError == null) {
                LOG.debug("Detected failure, but no handler configured");
                return;
            }

            onError.accept(handleException(throwable));
        }

        private Throwable handleException(Throwable throwable) {
            if (throwable instanceof ProcessingException) {
                return convertToBmcException(baseTarget, (ProcessingException) throwable, info);
            }
            return throwable;
        }
    }

    static final class InvocationInformation {
        private final String requestId;
        private final MultivaluedMap<String, Object> headersSetInCallback;

        @java.beans.ConstructorProperties({"requestId", "headersSetInCallback"})
        public InvocationInformation(
                final String requestId, final MultivaluedMap<String, Object> headersSetInCallback) {
            this.requestId = requestId;
            this.headersSetInCallback = headersSetInCallback;
        }

        public String getRequestId() {
            return this.requestId;
        }

        public MultivaluedMap<String, Object> getHeadersSetInCallback() {
            return this.headersSetInCallback;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object o) {
            if (o == this) return true;
            if (!(o instanceof RestClient.InvocationInformation)) return false;
            final RestClient.InvocationInformation other = (RestClient.InvocationInformation) o;
            final java.lang.Object this$requestId = this.getRequestId();
            final java.lang.Object other$requestId = other.getRequestId();
            if (this$requestId == null
                    ? other$requestId != null
                    : !this$requestId.equals(other$requestId)) return false;
            final java.lang.Object this$headersSetInCallback = this.getHeadersSetInCallback();
            final java.lang.Object other$headersSetInCallback = other.getHeadersSetInCallback();
            if (this$headersSetInCallback == null
                    ? other$headersSetInCallback != null
                    : !this$headersSetInCallback.equals(other$headersSetInCallback)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final java.lang.Object $requestId = this.getRequestId();
            result = result * PRIME + ($requestId == null ? 43 : $requestId.hashCode());
            final java.lang.Object $headersSetInCallback = this.getHeadersSetInCallback();
            result =
                    result * PRIME
                            + ($headersSetInCallback == null
                                    ? 43
                                    : $headersSetInCallback.hashCode());
            return result;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return "RestClient.InvocationInformation(requestId="
                    + this.getRequestId()
                    + ", headersSetInCallback="
                    + this.getHeadersSetInCallback()
                    + ")";
        }
    }

    /**
     * Convert the body to a JSON string, unless it is already a string, or if it is an InputStream
     * @param request The original client request object given to the service
     *      *                client.
     * @param body body
     * @return body as string, or unchanged if String or InputStream
     */
    private <T extends BmcRequest> Object attemptToSerialize(T request, @Nullable Object body) {
        return attemptToSerialize(request, body, Optional.empty());
    }

    /**
     * Convert the body to a JSON string, unless it is already a string, or if it is an InputStream
     * @param request The original client request object given to the service
     *      *                client.
     * @param body body
     * @param optionalContentLengthLimit an optional content length limit for the stream
     * @return body as string, or unchanged if String or InputStream
     */
    private <T extends BmcRequest> Object attemptToSerialize(
            T request, @Nullable Object body, Optional<Long> optionalContentLengthLimit) {
        try {
            if (body instanceof String) {
                return body;
            } else if (body instanceof InputStream) {
                if (optionalContentLengthLimit.isPresent()) {
                    body =
                            wrapInLengthLimitedInputStream(
                                    (InputStream) body, optionalContentLengthLimit.get());
                }

                final Long contentLength = tryGetContentLength(request);
                // check if the stream has correct implementation of available method
                final boolean isStreamWithKnownAvailableBytes = checkStreamForAvailableBytes(body);
                if (ApacheUtils.isExtraStreamLogsEnabled() && isStreamWithKnownAvailableBytes) {
                    try {
                        final int bytesAvailable = ((InputStream) body).available();
                        if (bytesAvailable == 0) {
                            LOG.warn(STREAM_POTENTIAL_DATA_CORRUPTION_WARN_MSG);
                        }
                    } catch (IOException e) {
                        LOG.warn(
                                "Error calling available on the stream to get the available number of bytes");
                    }
                }
                if (this.isApacheNonBufferingClient && contentLength != null && contentLength > 0) {
                    // Customization for providing Apache HTTP Entity instead of InputStream. This is required to avoid
                    // buffering all the data in memory by Jersey Apache Connector. Create the HTTP entity only when a
                    // content length value can be retrieved from the request.
                    if (body instanceof DuplicatableInputStream) {
                        return new ApacheDuplicatableInputStreamEntity(
                                (DuplicatableInputStream) body, contentLength);
                    }
                    return new ApacheInputStreamEntity((InputStream) body, contentLength);
                }
                return body;
            } else if (body != null) {
                return com.oracle.bmc.http.Serialization.getObjectMapper().writeValueAsString(body);
            } else {
                return "";
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Unable to process JSON body", e);
        }
    }

    /**
     * Wrap the input stream into a {@link DuplicatableLengthLimitedInputStream} or {@link LengthLimitedInputStream},
     * depending on whether the input stream is a {@link DuplicatableInputStream} or not./
     * @param body input stream
     * @param contentLength content length limit
     * @return wrapped input stream
     */
    private static LengthLimitedInputStream wrapInLengthLimitedInputStream(
            InputStream body, long contentLength) {
        if (body instanceof DuplicatableInputStream) {
            return new DuplicatableLengthLimitedInputStream(body, contentLength);
        } else {
            return new LengthLimitedInputStream(body, contentLength);
        }
    }

    private static boolean checkStreamForAvailableBytes(Object body) {
        if (body instanceof FileInputStream || body instanceof ByteArrayInputStream) {
            return true;
        }
        if (body instanceof KeepOpenInputStream) {
            KeepOpenInputStream keepOpenInputStream = (KeepOpenInputStream) body;
            if (keepOpenInputStream.innerStream instanceof ResettableFileInputStream) {
                return true;
            }
        }
        return false;
    }

    /**
     * Try to retrieve the content length set in the request.
     *
     * @param request The original client request object given to the service
     *                client.
     * @return content length or null.
     */
    private <T extends BmcRequest> Long tryGetContentLength(T request) {
        if (request instanceof com.oracle.bmc.requests.HasContentLength) {
            return ((com.oracle.bmc.requests.HasContentLength) request).getContentLength();
        } else {
            return null;
        }
    }

    /**
     * The client configurator used for configuring the client. May be null.
     */
    public ClientConfigurator getClientConfigurator() {
        return this.clientConfigurator;
    }
}
