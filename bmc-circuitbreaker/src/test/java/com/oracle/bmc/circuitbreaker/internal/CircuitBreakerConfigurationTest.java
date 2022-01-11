/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.circuitbreaker.internal;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.Duration;
import java.util.Set;
import java.util.function.Predicate;
import javax.ws.rs.InternalServerErrorException;
import javax.ws.rs.ProcessingException;
import javax.ws.rs.ServiceUnavailableException;
import javax.ws.rs.core.Response;

public class CircuitBreakerConfigurationTest {

    @Test
    public void validateCircuitBreakerConfigurationWithCustomValues() {

        CircuitBreakerConfiguration config =
                CircuitBreakerConfiguration.builder()
                        .failureRateThreshold(50)
                        .slowCallRateThreshold(90)
                        .slowCallDurationThreshold(Duration.ofSeconds(6))
                        .permittedNumberOfCallsInHalfOpenState(2)
                        .slidingWindowSize(10)
                        .minimumNumberOfCalls(4)
                        .waitDurationInOpenState(Duration.ofSeconds(2))
                        .recordHttpStatuses(
                                ImmutableSet.of(
                                        CircuitBreakerConfiguration.TOO_MANY_REQUESTS,
                                        CircuitBreakerConfiguration.SERVICE_UNAVAILABLE))
                        .recordExceptions(
                                ImmutableList.of(
                                        CircuitBreakerConfiguration
                                                .SERVICE_UNAVAILABLE_EXCEPTION_CLASS))
                        .build();

        JaxRsCircuitBreakerImpl circuitBreaker = new JaxRsCircuitBreakerImpl(config);
        CircuitBreakerConfig internalConfig = circuitBreaker.getInternalCircuitBreakerConfig();

        assertEquals(internalConfig.getFailureRateThreshold(), 50, 0.1);
        assertEquals(internalConfig.getSlowCallRateThreshold(), 90, 0.1);
        assertEquals(internalConfig.getSlowCallDurationThreshold(), Duration.ofSeconds(6));
        assertEquals(internalConfig.getPermittedNumberOfCallsInHalfOpenState(), 2);
        assertEquals(
                internalConfig.getSlidingWindowType(),
                CircuitBreakerConfig.SlidingWindowType.TIME_BASED);
        assertEquals(internalConfig.getSlidingWindowSize(), 10);
        assertEquals(internalConfig.getMinimumNumberOfCalls(), 4);
        assertEquals(internalConfig.getWaitDurationInOpenState(), Duration.ofSeconds(2));
        assertTrue(internalConfig.isAutomaticTransitionFromOpenToHalfOpenEnabled());

        Response response503 = mock(Response.class);
        Mockito.when(response503.getStatus()).thenReturn(503);
        HttpStatusErrorException ex = new HttpStatusErrorException(response503);
        Predicate<Throwable> recordExceptionPredicate =
                internalConfig.getRecordExceptionPredicate();
        assertTrue(recordExceptionPredicate.test(ex));

        assertTrue(recordExceptionPredicate.test(new ServiceUnavailableException()));
        assertFalse(recordExceptionPredicate.test(new InternalServerErrorException()));
        assertFalse(recordExceptionPredicate.test(new ProcessingException("test")));

        Set<Integer> recordHttpStatuses = circuitBreaker.getRecordHttpStatuses();
        assertTrue(recordHttpStatuses.contains(CircuitBreakerConfiguration.SERVICE_UNAVAILABLE));
        assertTrue(recordHttpStatuses.contains(CircuitBreakerConfiguration.TOO_MANY_REQUESTS));
        assertEquals(recordHttpStatuses.size(), 2);
    }

    @Test
    public void validateCircuitBreakerConfigurationWithDefaultValues() {

        CircuitBreakerConfiguration config = CircuitBreakerConfiguration.builder().build();

        JaxRsCircuitBreakerImpl circuitBreaker = new JaxRsCircuitBreakerImpl(config);
        CircuitBreakerConfig internalConfig = circuitBreaker.getInternalCircuitBreakerConfig();

        assertEquals(
                internalConfig.getFailureRateThreshold(),
                CircuitBreakerConfiguration.DEFAULT_FAILURE_RATE_THRESHOLD,
                0.1);
        assertEquals(
                internalConfig.getSlowCallRateThreshold(),
                CircuitBreakerConfiguration.DEFAULT_SLOW_CALL_RATE_THRESHOLD,
                0.1);
        assertEquals(
                internalConfig.getSlowCallDurationThreshold(),
                Duration.ofMinutes(
                        CircuitBreakerConfiguration.DEFAULT_SLOW_CALL_DURATION_THRESHOLD));
        assertEquals(
                internalConfig.getPermittedNumberOfCallsInHalfOpenState(),
                CircuitBreakerConfiguration.DEFAULT_PERMITTED_CALLS_IN_HALF_OPEN_STATE);
        assertEquals(
                internalConfig.getSlidingWindowType(),
                CircuitBreakerConfig.SlidingWindowType.TIME_BASED);
        assertEquals(
                internalConfig.getSlidingWindowSize(),
                CircuitBreakerConfiguration.DEFAULT_SLIDING_WINDOW_SIZE);
        assertEquals(
                internalConfig.getMinimumNumberOfCalls(),
                CircuitBreakerConfiguration.DEFAULT_MINIMUM_NUMBER_OF_CALLS);
        assertEquals(
                internalConfig.getWaitDurationInOpenState(),
                Duration.ofSeconds(
                        CircuitBreakerConfiguration.DEFAULT_WAIT_DURATION_IN_OPEN_STATE));
        assertTrue(internalConfig.isAutomaticTransitionFromOpenToHalfOpenEnabled());

        Response response503 = mock(Response.class);
        Mockito.when(response503.getStatus()).thenReturn(503);
        HttpStatusErrorException ex = new HttpStatusErrorException(response503);
        Predicate<Throwable> recordExceptionPredicate =
                internalConfig.getRecordExceptionPredicate();
        assertTrue(recordExceptionPredicate.test(ex));

        assertTrue(recordExceptionPredicate.test(new ServiceUnavailableException()));
        assertTrue(recordExceptionPredicate.test(new InternalServerErrorException()));
        assertTrue(recordExceptionPredicate.test(new ProcessingException("test")));

        Set<Integer> recordHttpStatuses = circuitBreaker.getRecordHttpStatuses();
        assertTrue(recordHttpStatuses.contains(CircuitBreakerConfiguration.INTERNAL_SERVER_ERROR));
        assertTrue(recordHttpStatuses.contains(CircuitBreakerConfiguration.SERVICE_UNAVAILABLE));
        assertTrue(recordHttpStatuses.contains(CircuitBreakerConfiguration.TOO_MANY_REQUESTS));
        assertTrue(recordHttpStatuses.contains(CircuitBreakerConfiguration.BAD_GATEWAY));
        assertTrue(recordHttpStatuses.contains(CircuitBreakerConfiguration.GATEWAY_TIMEOUT));
        assertEquals(recordHttpStatuses.size(), 5);
    }
}
