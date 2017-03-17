/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

import java.io.InterruptedIOException;
import java.util.concurrent.Future;

import javax.annotation.Nullable;
import javax.ws.rs.ProcessingException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.InvocationCallback;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import com.google.common.base.Throwables;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.util.internal.Consumer;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

/**
 * A REST client that can make synchronous and asynchronous calls.
 */
public class RestClient implements AutoCloseable {
    private static final String PATCH_VERB = "PATCH";

    private final EntityFactory entityFactory;
    private final Client client;

    private WebTarget baseTarget;

    /**
     * Create a new client that uses a provided client to make all its requests.
     * It's up to the caller to properly configure the client.
     *
     * @param client
     *            A HTTP client to make all requests with.
     * @param entityFactory
     *            An entity factory to create entities for POST/PUT operations.
     */
    public RestClient(@NonNull Client client, @NonNull EntityFactory entityFactory) {
        this.client = client;
        this.entityFactory = entityFactory;
    }

    /**
     * Sets the endpoint that this client should talk to.
     *
     * @param endpoint
     *            The endpoint.
     */
    public void setEndpoint(@NonNull String endpoint) {
        this.baseTarget = client.target(endpoint);
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
    public WebTarget getBaseTarget() {
        if (this.baseTarget == null) {
            throw new NullPointerException("No endpoint has been configured");
        }
        return this.baseTarget;
    }

    // Rest APIs

    /**
     * Request a resource.
     *
     * @param ib
     *            The invocation builder to use when making the request.
     * @param request
     *            The original client request object given to the service
     *            client.
     * @return The {@link Response} object.
     * @throws BmcException
     *             If an error was encountered while invoking the request.
     */
    public Response get(@NonNull Invocation.Builder ib, @NonNull Object request)
            throws BmcException {
        try {
            Response response = ib.get();
            return response;
        } catch (ProcessingException ex) {
            throw convertToBmcException(baseTarget, ex);
        }
    }

    /**
     * Request a resource asynchronously.
     *
     * @param ib
     *            The invocation builder to use when making the request.
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
    public Future<Response> get(
            @NonNull Invocation.Builder ib,
            @NonNull Object request,
            @Nullable Consumer<Response> onSuccess,
            @Nullable Consumer<Throwable> onError) {
        return ib.async().get(new Callback(baseTarget, onSuccess, onError));
    }

    /**
     * Post a request object to the endpoint represented by the web target and
     * get the response.
     *
     * @param ib
     *            An invocation builder to execute requests with.
     * @param request
     *            The original client request object given to the service
     *            client.
     * @param body
     *            The content body to post to the web target.
     * @return The {@link Response} object.
     * @throws BmcException
     *             If an error was encountered while invoking the request.
     */
    public Response post(@NonNull Invocation.Builder ib, Object body, @NonNull Object request)
            throws BmcException {
        try {
            Entity<?> requestBody = this.entityFactory.forPost(request, body);
            final Response response = ib.post(requestBody);
            return response;
        } catch (ProcessingException e) {
            throw convertToBmcException(baseTarget, e);
        }
    }

    /**
     * Post a request object to the endpoint represented by the web target
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
    public Future<Response> post(
            @NonNull Invocation.Builder ib,
            Object body,
            @NonNull Object request,
            @Nullable Consumer<Response> onSuccess,
            @Nullable Consumer<Throwable> onError) {
        Entity<?> requestBody = this.entityFactory.forPost(request, body);
        return ib.async().post(requestBody, new Callback(baseTarget, onSuccess, onError));
    }

    /**
     * Post an empty body to the endpoint represented by the web target and get
     * the response.
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
    public Response post(@NonNull Invocation.Builder ib, @NonNull Object request) {
        return post(ib, null, request);
    }

    /**
     * Post an empty body to the endpoint represented by the web target
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
    public Future<Response> post(
            @NonNull Invocation.Builder ib,
            @NonNull Object request,
            @Nullable Consumer<Response> onSuccess,
            @Nullable Consumer<Throwable> onError) {
        return post(ib, null, request, onSuccess, onError);
    }

    /**
     * Patch a request object to the endpoint represented by the web target and
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
    public Response patch(@NonNull Invocation.Builder ib, Object body, @NonNull Object request)
            throws BmcException {
        try {
            Entity<?> requestBody = this.entityFactory.forPatch(request, body);
            final Response response = ib.method(PATCH_VERB, requestBody);
            return response;
        } catch (ProcessingException e) {
            throw convertToBmcException(baseTarget, e);
        }
    }

    /**
     * Patch a request object to the endpoint represented by the web target
     * asynchronously and get the response.
     *
     * @param ib
     *            An invocation builder to execute requests with.
     * @param body
     *            The content body object to post to the web target.
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
    public Future<Response> patch(
            @NonNull Invocation.Builder ib,
            Object body,
            @NonNull Object request,
            @Nullable Consumer<Response> onSuccess,
            @Nullable Consumer<Throwable> onError) {
        Entity<?> requestBody = this.entityFactory.forPatch(request, body);

        return ib.async()
                .method(PATCH_VERB, requestBody, new Callback(baseTarget, onSuccess, onError));
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
    public Response put(@NonNull Invocation.Builder ib, Object body, @NonNull Object request)
            throws BmcException {
        try {
            Entity<?> requestBody = this.entityFactory.forPut(request, body);
            final Response response = ib.put(requestBody);
            return response;
        } catch (ProcessingException e) {
            throw convertToBmcException(baseTarget, e);
        }
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
    public Future<Response> put(
            @NonNull Invocation.Builder ib,
            Object body,
            @NonNull Object request,
            @Nullable Consumer<Response> onSuccess,
            @Nullable Consumer<Throwable> onError) {
        Entity<?> requestBody = this.entityFactory.forPut(request, body);
        return ib.async().put(requestBody, new Callback(baseTarget, onSuccess, onError));
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
    public Response delete(@NonNull Invocation.Builder ib, @NonNull Object request)
            throws BmcException {
        try {
            Response response = ib.delete(Response.class);
            return response;
        } catch (ProcessingException e) {
            throw convertToBmcException(baseTarget, e);
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
    public Future<Response> delete(
            @NonNull Invocation.Builder ib,
            @NonNull Object request,
            @Nullable Consumer<Response> onSuccess,
            @Nullable Consumer<Throwable> onError) {
        return ib.async().delete(new Callback(baseTarget, onSuccess, onError));
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
    public Response head(@NonNull Invocation.Builder ib, @NonNull Object request)
            throws BmcException {
        try {
            Response response = ib.head();
            return response;
        } catch (ProcessingException ex) {
            throw convertToBmcException(baseTarget, ex);
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
    public Future<Response> head(
            @NonNull Invocation.Builder ib,
            @NonNull Object request,
            @Nullable Consumer<Response> onSuccess,
            @Nullable Consumer<Throwable> onError) {
        return ib.async().head(new Callback(baseTarget, onSuccess, onError));
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
    private static BmcException convertToBmcException(WebTarget target, ProcessingException e) {
        Throwable t = Throwables.getRootCause(e);
        if (t instanceof InterruptedIOException) {
            return new BmcException(
                    true, "Timed out while communicating to: " + target.getUri().toString(), e);
        }
        return new BmcException(
                false,
                "Processing exception while communicating to: " + target.getUri().toString(),
                e);
    }

    @Slf4j
    private static class Callback implements InvocationCallback<Response> {

        private final WebTarget baseTarget;
        private final Consumer<Response> onSuccess;
        private final Consumer<Throwable> onError;

        private Callback(
                @NonNull WebTarget baseTarget,
                @Nullable Consumer<Response> onSuccess,
                @Nullable Consumer<Throwable> onError) {

            this.baseTarget = baseTarget;
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
                return convertToBmcException(baseTarget, (ProcessingException) throwable);
            }
            return throwable;
        }
    }
}
