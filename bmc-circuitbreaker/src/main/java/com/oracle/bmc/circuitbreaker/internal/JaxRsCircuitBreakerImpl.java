/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.circuitbreaker.internal;

import com.oracle.bmc.circuitbreaker.CallNotAllowedException;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.circuitbreaker.CircuitBreakerState;
import com.oracle.bmc.circuitbreaker.JaxRsCircuitBreaker;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.Response;

/**
 * JaxRsCircuitBreaker is a specialized {@link CircuitBreaker} for JaxRs client and preserves the same properties of
 * {@link CircuitBreaker} such as thread safety
 */
public class JaxRsCircuitBreakerImpl implements JaxRsCircuitBreaker {

    private final CircuitBreaker circuitBreaker;
    private final Set<Integer> recordHttpStatuses;

    private static final String INCORRECT_STATE_RESPONSE_STATUS = "IncorrectState";

    private final int numberOfRecordedHisotry;
    private Deque<String> historyQueue;
    /**
     * Creates a {@link JaxRsCircuitBreakerImpl}
     *
     * @param configuration custom JaxRs CircuitBreaker configuration
     */
    public JaxRsCircuitBreakerImpl(CircuitBreakerConfiguration configuration) {

        CircuitBreakerConfig.Builder custom = CircuitBreakerConfig.custom();
        custom.enableAutomaticTransitionFromOpenToHalfOpen();
        custom.slidingWindowType(CircuitBreakerConfig.SlidingWindowType.TIME_BASED);
        custom.failureRateThreshold(configuration.getFailureRateThreshold());
        custom.slowCallRateThreshold(configuration.getSlowCallRateThreshold());
        custom.slowCallDurationThreshold(configuration.getSlowCallDurationThreshold());
        custom.permittedNumberOfCallsInHalfOpenState(
                configuration.getPermittedNumberOfCallsInHalfOpenState());
        custom.slidingWindowSize(configuration.getSlidingWindowSize());
        custom.minimumNumberOfCalls(configuration.getMinimumNumberOfCalls());
        custom.writableStackTraceEnabled(configuration.isWritableStackTraceEnabled());
        custom.waitDurationInOpenState(configuration.getWaitDurationInOpenState());

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

        this.circuitBreaker = CircuitBreaker.of("default", custom.build());
        this.recordHttpStatuses = configuration.getRecordHttpStatuses();
        this.historyQueue = new ArrayDeque<>();
        this.numberOfRecordedHisotry = configuration.getNumberOfRecordedHistoryRepsonse();
    }

    private boolean isResponseStatusIncorrectState(Response response) {
        Response.StatusType statusType = response.getStatusInfo();
        if (statusType.getStatusCode() == 409
                && statusType.getReasonPhrase().equals(INCORRECT_STATE_RESPONSE_STATUS)) {
            return true;
        }
        return false;
    }

    @Override
    public Supplier<Response> decorateSupplier(Supplier<Response> supplier) {
        Supplier<Response> circuitBreakerSupplier =
                circuitBreaker.decorateSupplier(
                        () -> {
                            Response response = supplier.get();
                            if (recordHttpStatuses.contains(response.getStatus())
                                    || isResponseStatusIncorrectState(response)) {
                                throw new HttpStatusErrorException(response);
                            }
                            return response;
                        });

        return () -> {
            try {
                return circuitBreakerSupplier.get();
            } catch (HttpStatusErrorException e) {
                this.addToHistory(e);
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
                            if (recordHttpStatuses.contains(response.getStatus())
                                    || isResponseStatusIncorrectState(response)) {
                                throw new HttpStatusErrorException(response);
                            }
                            return response;
                        });

        return (Invocation inv) -> {
            try {
                return circuitBreakerFunction.apply(inv);
            } catch (HttpStatusErrorException e) {
                this.addToHistory(e);
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

    @Override
    public CircuitBreakerState getState() {
        switch (circuitBreaker.getState()) {
            case OPEN:
                return CircuitBreakerState.OPEN;
            case CLOSED:
                return CircuitBreakerState.CLOSED;
            case DISABLED:
                return CircuitBreakerState.DISABLED;
            case HALF_OPEN:
                return CircuitBreakerState.HALF_OPEN;
            case FORCED_OPEN:
                return CircuitBreakerState.FORCED_OPEN;
            default:
                return CircuitBreakerState.UNKNOWN;
        }
    }

    CircuitBreaker getInternalCircuitBreaker() {
        return circuitBreaker;
    }

    // @VisibleForTesting
    public CircuitBreakerConfig getInternalCircuitBreakerConfig() {
        return circuitBreaker.getCircuitBreakerConfig();
    }

    // @VisibleForTesting
    Set<Integer> getRecordHttpStatuses() {
        return recordHttpStatuses;
    }

    public synchronized void addToHistory(HttpStatusErrorException err) {

        if (historyQueue.size() >= numberOfRecordedHisotry) {
            historyQueue.removeFirst();
        }

        StringBuilder historyBuilder =
                new StringBuilder()
                        .append("Error - " + err.toString() + "; ")
                        .append("ErrorMessage - " + err.getResponse().getStatusInfo() + "; ")
                        .append("ErrorCode - " + err.getResponse().getStatus());

        historyQueue.add(historyBuilder.toString());
    }

    @Override
    public synchronized String getHistory() {
        return historyQueue.stream().collect(Collectors.joining("\n"));
    }
}
