/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Throwables;
import com.oracle.bmc.circuitbreaker.CallNotAllowedException;
import com.oracle.bmc.circuitbreaker.JaxRsCircuitBreaker;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.requests.BmcRequest;
import com.oracle.bmc.util.internal.Consumer;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

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
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.UUID;
import java.util.concurrent.Future;
import java.util.function.Supplier;

/**
 * A REST client that can make synchronous and asynchronous calls.<br/>
 * For asynchronous call, please refer to https://dennis-xlc.gitbooks.io/restful-java-with-jax-rs-2-0-2rd-edition/en/part1/chapter13/async_invoker_client_api.html
 * to understand why we'd better not mix to using callback or Java Future.
 */
@Slf4j
public class RestClient implements AutoCloseable {
    private static final String PATCH_VERB = "PATCH";

    private final EntityFactory entityFactory;
    private final Client client;

    @VisibleForTesting final JaxRsCircuitBreaker circuitBreaker;

    private WrappedWebTarget baseTarget;

    /**
     * Create a new client that uses a provided client to make all its requests.
     * It's up to the caller to properly configure the client.
     *
     * @param client        A HTTP client to make all requests with.
     * @param entityFactory An entity factory to create entities for POST/PUT operations.
     * @param circuitBreaker A circuit breaker instance to decorate http client
     */
    public RestClient(
            @NonNull Client client,
            @NonNull EntityFactory entityFactory,
            JaxRsCircuitBreaker circuitBreaker) {
        this.client = client;
        this.entityFactory = entityFactory;
        this.circuitBreaker = circuitBreaker;
    }

    /**
     * Sets the endpoint that this client should talk to.
     *
     * @param endpoint The endpoint.
     */
    public void setEndpoint(@NonNull String endpoint) {
        this.baseTarget = new WrappedWebTarget(client.target(endpoint));
    }

    @Override
    public void close() {
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
     * Ideal name for this method is decorateSupplierWithCircuitBreaker. However, I shortened it due to it's being private
     * It takes a Supplier<Response> and returns a Supplier<Response>, this pattern allows users to chain different
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
                    throw new BmcException(false, "CircuitBreaker is OPEN!", e, null);
                }
            };
        }
    }

    /**
     * Ideal name for this method is decorateFutureSupplierWithCircuitBreaker. However, I shortened it due to it's being private
     * It takes a Supplier<Future<Response>> and returns a Supplier<Future<Response>>, this pattern allows users to chain
     * different functionalities.
     * @param supplier a Supplier of Future<Response>
     * @return a Supplier of Future<Response>
     */
    private Supplier<Future<Response>> decorateFuture(Supplier<Future<Response>> supplier) {
        if (circuitBreaker == null) {
            return supplier;
        } else {
            return () -> {
                try {
                    return circuitBreaker.decorateFuture(supplier).get();
                } catch (CallNotPermittedException e) {
                    throw new BmcException(false, "CircuitBreaker is OPEN!", e, null);
                }
            };
        }
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
    public <T extends BmcRequest> Response get(
            @NonNull WrappedInvocationBuilder ib, @NonNull T request) throws BmcException {
        InvocationInformation info = preprocessRequest(ib, request);
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
    public <T extends BmcRequest> Future<Response> get(
            @NonNull WrappedInvocationBuilder ib,
            @NonNull T request,
            @Nullable Consumer<Response> onSuccess,
            @Nullable Consumer<Throwable> onError) {
        InvocationInformation info = preprocessRequest(ib, request);

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
    public <T extends BmcRequest> Response post(
            @NonNull WrappedInvocationBuilder ib, @Nullable Object body, @NonNull T request)
            throws BmcException {
        InvocationInformation info = preprocessRequest(ib, request);
        try {
            Entity<?> requestBody = this.entityFactory.forPost(request, attemptToSerialize(body));
            return decorateSupplier(() -> ib.post(requestBody)).get();
        } catch (ProcessingException e) {
            throw convertToBmcException(baseTarget, e, info);
        }
    }

    /**
     * Convert the body to a JSON string, unless it is already a string, or if it is an InputStream
     * @param body body
     * @return body as string, or unchanged if String or InputStream
     */
    private Object attemptToSerialize(@Nullable Object body) {
        try {
            if (body instanceof String || body instanceof InputStream) {
                return body;
            } else if (body != null) {
                return RestClientFactory.getObjectMapper().writeValueAsString(body);
            } else {
                return StringUtils.EMPTY;
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Unable to process JSON body", e);
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
    public <T extends BmcRequest> Future<Response> post(
            @NonNull WrappedInvocationBuilder ib,
            @Nullable Object body,
            @NonNull T request,
            @Nullable Consumer<Response> onSuccess,
            @Nullable Consumer<Throwable> onError) {
        InvocationInformation info = preprocessRequest(ib, request);
        Entity<?> requestBody = this.entityFactory.forPost(request, attemptToSerialize(body));

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
     * Post an empty body to the endpoint represented by the web target and get
     * the response.
     *
     * @param ib      An invocation builder to execute requests with.
     * @param request The original client request object given to the service
     *                client.
     * @return The {@link Response} object.
     * @throws BmcException If an error was encountered while invoking the request.
     */
    public <T extends BmcRequest> Response post(
            @NonNull WrappedInvocationBuilder ib, @NonNull T request) {
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
    public <T extends BmcRequest> Future<Response> post(
            @NonNull WrappedInvocationBuilder ib,
            @NonNull T request,
            @Nullable Consumer<Response> onSuccess,
            @Nullable Consumer<Throwable> onError) {
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
    public <T extends BmcRequest> Response patch(
            @NonNull WrappedInvocationBuilder ib, @NonNull T request) {
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
    public <T extends BmcRequest> Response patch(
            @NonNull WrappedInvocationBuilder ib, @Nullable Object body, @NonNull T request)
            throws BmcException {
        InvocationInformation info = preprocessRequest(ib, request);
        try {
            Entity<?> requestBody = this.entityFactory.forPatch(request, attemptToSerialize(body));
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
    public <T extends BmcRequest> Future<Response> patch(
            @NonNull WrappedInvocationBuilder ib,
            @NonNull T request,
            @Nullable Consumer<Response> onSuccess,
            @Nullable Consumer<Throwable> onError) {
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
    public <T extends BmcRequest> Future<Response> patch(
            @NonNull WrappedInvocationBuilder ib,
            @Nullable Object body,
            @NonNull T request,
            @Nullable Consumer<Response> onSuccess,
            @Nullable Consumer<Throwable> onError) {
        InvocationInformation info = preprocessRequest(ib, request);
        Entity<?> requestBody = this.entityFactory.forPatch(request, attemptToSerialize(body));

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
     * Put a request object without body to the endpoint represented by the web target and
     * get the response.
     *
     * @param ib      An invocation builder to execute requests with.
     * @param request The original client request object given to the service
     *                client.
     * @return The {@link Response} object.
     * @throws BmcException If an error was encountered while invoking the request.
     */
    public <T extends BmcRequest> Response put(
            @NonNull WrappedInvocationBuilder ib, @NonNull T request) {
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
    public <T extends BmcRequest> Response put(
            @NonNull WrappedInvocationBuilder ib, @Nullable Object body, @NonNull T request)
            throws BmcException {
        InvocationInformation info = preprocessRequest(ib, request);
        try {
            Entity<?> requestBody = this.entityFactory.forPut(request, attemptToSerialize(body));
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
    public <T extends BmcRequest> Future<Response> put(
            @NonNull WrappedInvocationBuilder ib,
            @NonNull T request,
            @Nullable Consumer<Response> onSuccess,
            @Nullable Consumer<Throwable> onError) {
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
    public <T extends BmcRequest> Future<Response> put(
            @NonNull WrappedInvocationBuilder ib,
            @Nullable Object body,
            @NonNull T request,
            @Nullable Consumer<Response> onSuccess,
            @Nullable Consumer<Throwable> onError) {
        InvocationInformation info = preprocessRequest(ib, request);
        Entity<?> requestBody = this.entityFactory.forPut(request, attemptToSerialize(body));

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
    public <T extends BmcRequest> Response delete(
            @NonNull WrappedInvocationBuilder ib, @NonNull T request) throws BmcException {
        InvocationInformation info = preprocessRequest(ib, request);
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
    public <T extends BmcRequest> Future<Response> delete(
            @NonNull WrappedInvocationBuilder ib,
            @NonNull T request,
            @Nullable Consumer<Response> onSuccess,
            @Nullable Consumer<Throwable> onError) {
        InvocationInformation info = preprocessRequest(ib, request);

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
    public <T extends BmcRequest> Response head(
            @NonNull WrappedInvocationBuilder ib, @NonNull T request) throws BmcException {
        InvocationInformation info = preprocessRequest(ib, request);
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
    public <T extends BmcRequest> Future<Response> head(
            @NonNull WrappedInvocationBuilder ib,
            @NonNull T request,
            @Nullable Consumer<Response> onSuccess,
            @Nullable Consumer<Throwable> onError) {
        InvocationInformation info = preprocessRequest(ib, request);

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
                throw new BmcException(
                        response.getStatus(),
                        statusMessage,
                        e.getMessage(),
                        info.getRequestId(),
                        e);
            }
        }

        Throwable t = Throwables.getRootCause(e);
        if (t instanceof InterruptedIOException) {
            return new BmcException(
                    true,
                    "Timed out while communicating to: " + target.getUri().toString(),
                    e,
                    info.getRequestId());
        }

        return new BmcException(
                false,
                "Processing exception while communicating to: " + target.getUri().toString(),
                e,
                info.getRequestId());
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

    private static String generateRequestId() {
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }

    // prevents users from being able to call any method that actually submits the request
    @RequiredArgsConstructor
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
    }

    @Slf4j
    private static class Callback implements InvocationCallback<Response> {

        private final WebTarget baseTarget;
        private final InvocationInformation info;
        private final Consumer<Response> onSuccess;
        private final Consumer<Throwable> onError;

        private Callback(
                @NonNull WebTarget baseTarget,
                @NonNull InvocationInformation info,
                @Nullable Consumer<Response> onSuccess,
                @Nullable Consumer<Throwable> onError) {
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
                LOG.debug("Failure during success handling");
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

    @Value
    static class InvocationInformation {
        private final String requestId;
        private final MultivaluedMap<String, Object> headersSetInCallback;
    }
}
