/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring;

import com.oracle.bmc.monitoring.requests.*;
import com.oracle.bmc.monitoring.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of Monitoring.
 *
 * <p>The default configuration used is defined by {@link
 * com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
public class MonitoringWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final Monitoring client;

    public MonitoringWaiters(
            java.util.concurrent.ExecutorService executorService, Monitoring client) {
        this.executorService = executorService;
        this.client = client;
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetAlarmRequest, GetAlarmResponse> forAlarm(
            GetAlarmRequest request,
            com.oracle.bmc.monitoring.model.Alarm.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAlarm(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetAlarmRequest, GetAlarmResponse> forAlarm(
            GetAlarmRequest request,
            com.oracle.bmc.monitoring.model.Alarm.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forAlarm(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource
     *     reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetAlarmRequest, GetAlarmResponse> forAlarm(
            GetAlarmRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.monitoring.model.Alarm.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forAlarm(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Alarm.
    private com.oracle.bmc.waiter.Waiter<GetAlarmRequest, GetAlarmResponse> forAlarm(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetAlarmRequest request,
            final com.oracle.bmc.monitoring.model.Alarm.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.monitoring.model.Alarm.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetAlarmRequest, GetAlarmResponse>() {
                            @Override
                            public GetAlarmResponse apply(GetAlarmRequest request) {
                                return client.getAlarm(request);
                            }
                        },
                        new java.util.function.Predicate<GetAlarmResponse>() {
                            @Override
                            public boolean test(GetAlarmResponse response) {
                                return targetStatesSet.contains(
                                        response.getAlarm().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.monitoring.model.Alarm.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetAlarmSuppressionRequest, GetAlarmSuppressionResponse>
            forAlarmSuppression(
                    GetAlarmSuppressionRequest request,
                    com.oracle.bmc.monitoring.model.AlarmSuppression.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAlarmSuppression(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetAlarmSuppressionRequest, GetAlarmSuppressionResponse>
            forAlarmSuppression(
                    GetAlarmSuppressionRequest request,
                    com.oracle.bmc.monitoring.model.AlarmSuppression.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forAlarmSuppression(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource
     *     reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetAlarmSuppressionRequest, GetAlarmSuppressionResponse>
            forAlarmSuppression(
                    GetAlarmSuppressionRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.monitoring.model.AlarmSuppression.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forAlarmSuppression(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for AlarmSuppression.
    private com.oracle.bmc.waiter.Waiter<GetAlarmSuppressionRequest, GetAlarmSuppressionResponse>
            forAlarmSuppression(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetAlarmSuppressionRequest request,
                    final com.oracle.bmc.monitoring.model.AlarmSuppression.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.monitoring.model.AlarmSuppression.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetAlarmSuppressionRequest, GetAlarmSuppressionResponse>() {
                            @Override
                            public GetAlarmSuppressionResponse apply(
                                    GetAlarmSuppressionRequest request) {
                                return client.getAlarmSuppression(request);
                            }
                        },
                        new java.util.function.Predicate<GetAlarmSuppressionResponse>() {
                            @Override
                            public boolean test(GetAlarmSuppressionResponse response) {
                                return targetStatesSet.contains(
                                        response.getAlarmSuppression().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.monitoring.model.AlarmSuppression.LifecycleState
                                        .Deleted)),
                request);
    }
}
