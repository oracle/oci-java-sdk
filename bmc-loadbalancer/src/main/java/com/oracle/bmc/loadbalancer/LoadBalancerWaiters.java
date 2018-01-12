/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer;

import com.oracle.bmc.loadbalancer.requests.*;
import com.oracle.bmc.loadbalancer.responses.*;

/**
 * Collection of helper methods to produce {@link Waiter}s for different
 * resources of LoadBalancer.
 * <p>
 * The default configuration used is defined by {@link Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.RequiredArgsConstructor
public class LoadBalancerWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final LoadBalancer client;

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetLoadBalancerRequest, GetLoadBalancerResponse>
            forLoadBalancer(
                    GetLoadBalancerRequest request,
                    com.oracle.bmc.loadbalancer.model.LoadBalancer.LifecycleState targetState) {
        return forLoadBalancer(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @param terminationStrategy The {@link TerminationStrategy} to use.
     * @param delayStrategy The {@link DelayStrategy} to use.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetLoadBalancerRequest, GetLoadBalancerResponse>
            forLoadBalancer(
                    GetLoadBalancerRequest request,
                    com.oracle.bmc.loadbalancer.model.LoadBalancer.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forLoadBalancer(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for LoadBalancer.
    private com.oracle.bmc.waiter.Waiter<GetLoadBalancerRequest, GetLoadBalancerResponse>
            forLoadBalancer(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetLoadBalancerRequest request,
                    final com.oracle.bmc.loadbalancer.model.LoadBalancer.LifecycleState
                            targetState) {
        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetLoadBalancerRequest, GetLoadBalancerResponse>() {
                            @Override
                            public GetLoadBalancerResponse apply(GetLoadBalancerRequest request) {
                                return client.getLoadBalancer(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetLoadBalancerResponse>() {
                            @Override
                            public boolean apply(GetLoadBalancerResponse response) {
                                return response.getLoadBalancer().getLifecycleState()
                                        == targetState;
                            }
                        },
                        targetState
                                == com.oracle.bmc.loadbalancer.model.LoadBalancer.LifecycleState
                                        .Deleted),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetWorkRequestRequest, GetWorkRequestResponse>
            forWorkRequest(GetWorkRequestRequest request) {
        return forWorkRequest(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request The request to send.
     * @param terminationStrategy The {@link TerminationStrategy} to use.
     * @param delayStrategy The {@link DelayStrategy} to use.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetWorkRequestRequest, GetWorkRequestResponse>
            forWorkRequest(
                    GetWorkRequestRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forWorkRequest(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request);
    }

    // Helper method to create a new Waiter for WorkRequest.
    private com.oracle.bmc.waiter.Waiter<GetWorkRequestRequest, GetWorkRequestResponse>
            forWorkRequest(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetWorkRequestRequest request) {
        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetWorkRequestRequest, GetWorkRequestResponse>() {
                            @Override
                            public GetWorkRequestResponse apply(GetWorkRequestRequest request) {
                                return client.getWorkRequest(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetWorkRequestResponse>() {
                            @Override
                            public boolean apply(GetWorkRequestResponse response) {
                                // work requests are complete once the time finished is available
                                return response.getWorkRequest().getTimeFinished() != null;
                            }
                        },
                        false),
                request);
    }
}
