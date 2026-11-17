/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.circuitbreaker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.junit.Test;

public class CircuitBreakerConfigurationTest {
    @Test
    public void defaultMaxWaitDurationInHalfOpenStateIsThirtySeconds() {
        CircuitBreakerConfiguration configuration = new CircuitBreakerConfiguration();

        assertEquals(Duration.ofSeconds(30), configuration.getMaxWaitDurationInHalfOpenState());
        assertEquals(10, configuration.getPermittedNumberOfCallsInHalfOpenState());
        assertTrue(
                configuration.getCircuitBreakerEventListener()
                        instanceof DefaultCircuitBreakerEventListener);
    }

    @Test
    public void emptyBuilderUsesDefaultHalfOpenSettings() {
        CircuitBreakerConfiguration configuration = CircuitBreakerConfiguration.builder().build();

        assertEquals(Duration.ofSeconds(30), configuration.getMaxWaitDurationInHalfOpenState());
        assertEquals(10, configuration.getPermittedNumberOfCallsInHalfOpenState());
        assertTrue(
                configuration.getCircuitBreakerEventListener()
                        instanceof DefaultCircuitBreakerEventListener);
    }

    @Test
    public void customHalfOpenWaitDurationUsesFluentBuilder() {
        Duration customDuration = Duration.ofSeconds(47);
        CircuitBreakerConfiguration.CircuitBreakerConfigurationBuilder builder =
                CircuitBreakerConfiguration.builder();

        builder.maxWaitDurationInHalfOpenState(customDuration);
        assertEquals(customDuration, builder.build().getMaxWaitDurationInHalfOpenState());
    }

    @Test
    public void reusingBuilderPreservesPreviouslyBuiltConfigurations() {
        CircuitBreakerConfiguration.CircuitBreakerConfigurationBuilder builder =
                CircuitBreakerConfiguration.builder();
        CircuitBreakerConfiguration defaultConfiguration = builder.build();
        CircuitBreakerEventListener listener = new DefaultCircuitBreakerEventListener() {};
        CircuitBreakerConfiguration customConfiguration =
                builder.maxWaitDurationInHalfOpenState(Duration.ofSeconds(47))
                        .circuitBreakerEventListener(listener)
                        .build();
        CircuitBreakerConfiguration disabledConfiguration =
                builder.maxWaitDurationInHalfOpenState(Duration.ofSeconds(83))
                        .circuitBreakerEventListener(null)
                        .build();

        assertEquals(
                Duration.ofSeconds(30), defaultConfiguration.getMaxWaitDurationInHalfOpenState());
        assertTrue(
                defaultConfiguration.getCircuitBreakerEventListener()
                        instanceof DefaultCircuitBreakerEventListener);
        assertEquals(
                Duration.ofSeconds(47), customConfiguration.getMaxWaitDurationInHalfOpenState());
        assertSame(listener, customConfiguration.getCircuitBreakerEventListener());
        assertEquals(
                Duration.ofSeconds(83), disabledConfiguration.getMaxWaitDurationInHalfOpenState());
        assertNull(disabledConfiguration.getCircuitBreakerEventListener());
        assertNull(builder.build().getCircuitBreakerEventListener());
    }

    @Test
    public void existingElevenArgumentConstructorPreservesSettingsAndDefaultHistoryCount() {
        assertSettingsWithDefaultListener(new TestConfig(), 5);
    }

    @Test
    public void existingTwelveArgumentConstructorPreservesSettingsAndCustomHistoryCount() {
        assertSettingsWithDefaultListener(new TestConfig(9), 9);
    }

    @Test
    public void customListenerCanBeConfiguredOrDisabled() {
        CircuitBreakerEventListener listener = new DefaultCircuitBreakerEventListener() {};
        CircuitBreakerConfiguration.CircuitBreakerConfigurationBuilder builder =
                CircuitBreakerConfiguration.builder();

        builder.circuitBreakerEventListener(listener);
        assertSame(listener, builder.build().getCircuitBreakerEventListener());
        assertNull(
                builder.circuitBreakerEventListener(null).build().getCircuitBreakerEventListener());
    }

    @Test
    public void thirteenArgumentConstructorPreservesCustomTimeoutAndDefaultsListener() {
        CircuitBreakerConfiguration configuration = new TestConfig(Duration.ofSeconds(47));

        assertSettingsWithDefaultListener(configuration, 9, Duration.ofSeconds(47));
    }

    @Test
    public void fourteenArgumentConstructorPreservesExplicitListenerAndSettings() {
        CircuitBreakerEventListener listener = new DefaultCircuitBreakerEventListener() {};
        CircuitBreakerConfiguration configuration =
                new TestConfig(Duration.ofSeconds(47), listener);

        assertSettings(configuration, 9, Duration.ofSeconds(47));
        assertSame(listener, configuration.getCircuitBreakerEventListener());
        assertNull(new TestConfig(Duration.ofSeconds(47), null).getCircuitBreakerEventListener());
    }

    private static void assertSettingsWithDefaultListener(
            CircuitBreakerConfiguration configuration, int expectedHistoryCount) {
        assertSettingsWithDefaultListener(
                configuration, expectedHistoryCount, Duration.ofSeconds(30));
    }

    private static void assertSettingsWithDefaultListener(
            CircuitBreakerConfiguration configuration,
            int expectedHistoryCount,
            Duration expectedTimeout) {
        assertSettings(configuration, expectedHistoryCount, expectedTimeout);
        assertTrue(
                configuration.getCircuitBreakerEventListener()
                        instanceof DefaultCircuitBreakerEventListener);
    }

    private static void assertSettings(
            CircuitBreakerConfiguration configuration,
            int expectedHistoryCount,
            Duration expectedTimeout) {
        assertEquals(expectedTimeout, configuration.getMaxWaitDurationInHalfOpenState());
        assertEquals(61, configuration.getFailureRateThreshold());
        assertEquals(72, configuration.getSlowCallRateThreshold());
        assertEquals(Duration.ofSeconds(13), configuration.getWaitDurationInOpenState());
        assertEquals(3, configuration.getPermittedNumberOfCallsInHalfOpenState());
        assertEquals(7, configuration.getMinimumNumberOfCalls());
        assertEquals(41, configuration.getSlidingWindowSize());
        assertEquals(Duration.ofSeconds(17), configuration.getSlowCallDurationThreshold());
        assertEquals(false, configuration.isWritableStackTraceEnabled());
        assertEquals(TestConfig.HTTP_STATUSES, configuration.getRecordHttpStatuses());
        assertEquals(TestConfig.EXCEPTIONS, configuration.getRecordExceptions());
        assertEquals(false, configuration.isRecordProcessingFailures());
        assertEquals(expectedHistoryCount, configuration.getNumberOfRecordedHistoryResponses());
    }

    private static final class TestConfig extends CircuitBreakerConfiguration {
        private static final Set<Integer> HTTP_STATUSES = Collections.singleton(418);
        private static final List<Class<? extends RuntimeException>> EXCEPTIONS =
                Collections.<Class<? extends RuntimeException>>singletonList(
                        IllegalStateException.class);

        private TestConfig() {
            super(
                    61,
                    72,
                    Duration.ofSeconds(13),
                    3,
                    7,
                    41,
                    Duration.ofSeconds(17),
                    false,
                    HTTP_STATUSES,
                    EXCEPTIONS,
                    false);
        }

        private TestConfig(int historyCount) {
            super(
                    61,
                    72,
                    Duration.ofSeconds(13),
                    3,
                    7,
                    41,
                    Duration.ofSeconds(17),
                    false,
                    HTTP_STATUSES,
                    EXCEPTIONS,
                    false,
                    historyCount);
        }

        private TestConfig(Duration timeout) {
            super(
                    61,
                    72,
                    Duration.ofSeconds(13),
                    3,
                    7,
                    41,
                    Duration.ofSeconds(17),
                    false,
                    HTTP_STATUSES,
                    EXCEPTIONS,
                    false,
                    9,
                    timeout);
        }

        private TestConfig(Duration timeout, CircuitBreakerEventListener listener) {
            super(
                    61,
                    72,
                    Duration.ofSeconds(13),
                    3,
                    7,
                    41,
                    Duration.ofSeconds(17),
                    false,
                    HTTP_STATUSES,
                    EXCEPTIONS,
                    false,
                    9,
                    timeout,
                    listener);
        }
    }
}
