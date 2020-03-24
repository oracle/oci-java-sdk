/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.circuitbreaker.internal;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableSet;
import com.oracle.bmc.circuitbreaker.CallNotAllowedException;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.circuitbreaker.JaxRsCircuitBreaker;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;

import java.util.concurrent.Future;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.Response;

/**
 * JaxRsCircuitBreaker is a specialized {@link CircuitBreaker} for JaxRs client and preserves the same properties of
 * {@link CircuitBreaker} such as thread safety
 */
public class JaxRsCircuitBreakerImpl implements JaxRsCircuitBreaker {

    private final CircuitBreaker circuitBreaker;
    private final ImmutableSet<Integer> recordHttpStatuses;

    /**
     * Creates a {@link JaxRsCircuitBreakerImpl}
     *
     * @param configuration custom JaxRs CircuitBreaker configuration
     */
    public JaxRsCircuitBreakerImpl(CircuitBreakerConfiguration configuration) {

        CircuitBreakerConfig.Builder custom = CircuitBreakerConfig.custom();
        custom.enableAutomaticTransitionFromOpenToHalfOpen();
        custom.slidingWindowType(CircuitBreakerConfig.SlidingWindowType.COUNT_BASED);
        custom.failureRateThreshold(configuration.getFailureRateThreshold());
        custom.slowCallRateThreshold(configuration.getSlowCallRateThreshold());
        custom.slowCallDurationThreshold(configuration.getSlowCallDurationThreshold());
        custom.permittedNumberOfCallsInHalfOpenState(
                configuration.getPermittedNumberOfCallsInHalfOpenState());
        custom.slidingWindowSize(configuration.getSlidingWindowSize());
        custom.minimumNumberOfCalls(configuration.getMinimumNumberOfCalls());
        custom.writableStackTraceEnabled(configuration.isWritableStackTraceEnabled());

        // Exceptions to consider as failure by circuit breaker
        // Please let me know if you know a better way to do this :(
        @SuppressWarnings("rawtypes")
        Class[] exs = new Class[configuration.getRecordExceptions().size() + 1];
        for (int i = 0; i < configuration.getRecordExceptions().size(); i++) {
            exs[i] = configuration.getRecordExceptions().get(i);
        }
        exs[configuration.getRecordExceptions().size()] = HttpStatusErrorException.class;
        //noinspection unchecked
        custom.recordExceptions(exs);

        custom.waitDurationInOpenState(configuration.getWaitDurationInOpenState());

        this.circuitBreaker = CircuitBreaker.of("default", custom.build());
        this.recordHttpStatuses = configuration.getRecordHttpStatuses();
    }

    @Override
    public Supplier<Response> decorateSupplier(Supplier<Response> supplier) {
        Supplier<Response> circuitBreakerSupplier =
                circuitBreaker.decorateSupplier(
                        () -> {
                            Response response = supplier.get();
                            if (recordHttpStatuses.contains(response.getStatus())) {
                                throw new HttpStatusErrorException(response);
                            }
                            return response;
                        });

        return () -> {
            try {
                return circuitBreakerSupplier.get();
            } catch (HttpStatusErrorException e) {
                return e.getResponse();
            } catch (CallNotPermittedException e) {
                throw CallNotAllowedException.createCallNotAllowedException(
                        e.getMessage(),
                        circuitBreaker.getCircuitBreakerConfig().isWritableStackTraceEnabled());
            }
        };
    }

    @Override
    public Function<Invocation, Response> decorateFunction(
            Function<Invocation, Response> function) {
        Function<Invocation, Response> circuitBreakerFunction =
                CircuitBreaker.decorateFunction(
                        circuitBreaker,
                        (Invocation inv) -> {
                            Response response = function.apply(inv);
                            if (recordHttpStatuses.contains(response.getStatus())) {
                                throw new HttpStatusErrorException(response);
                            }
                            return response;
                        });

        return (Invocation inv) -> {
            try {
                return circuitBreakerFunction.apply(inv);
            } catch (HttpStatusErrorException e) {
                return e.getResponse();
            } catch (CallNotPermittedException e) {
                throw CallNotAllowedException.createCallNotAllowedException(
                        e.getMessage(),
                        circuitBreaker.getCircuitBreakerConfig().isWritableStackTraceEnabled());
            }
        };
    }

    @Override
    public Supplier<Future<Response>> decorateFuture(Supplier<Future<Response>> supplier) {
        Supplier<Future<Response>> circuitBreakerFuture =
                circuitBreaker.decorateFuture(
                        () -> new PreCircuitBreakerFuture(supplier.get(), recordHttpStatuses));

        return () ->
                new PostCircuitBreakerFuture(
                        circuitBreakerFuture.get(),
                        circuitBreaker.getCircuitBreakerConfig().isWritableStackTraceEnabled());
    }

    @VisibleForTesting
    CircuitBreaker getInternalCircuitBreaker() {
        return circuitBreaker;
    }

    @VisibleForTesting
    CircuitBreakerConfig getInternalCircuitBreakerConfig() {
        return circuitBreaker.getCircuitBreakerConfig();
    }

    @VisibleForTesting
    ImmutableSet<Integer> getRecordHttpStatuses() {
        return recordHttpStatuses;
    }
}
