/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer;

import com.oracle.bmc.loadbalancer.requests.*;
import com.oracle.bmc.loadbalancer.responses.*;

import com.oracle.bmc.waiter.*;
import com.oracle.bmc.waiter.internal.SimpleWaiterImpl;

import java.util.concurrent.ExecutorService;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Suppliers;

import lombok.RequiredArgsConstructor;

/**
 * Collection of helper methods to produce {@link Waiter}s for different
 * resources of LoadBalancer.
 * <p>
 * The default configuration used is defined by {@link Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@RequiredArgsConstructor
public class LoadBalancerWaiters {
    private final ExecutorService executorService;
    private final LoadBalancer client;

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public Waiter<GetLoadBalancerRequest, GetLoadBalancerResponse> forLoadBalancer(
            GetLoadBalancerRequest request,
            com.oracle.bmc.loadbalancer.model.LoadBalancer.LifecycleState targetState) {
        return forLoadBalancer(Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
    public Waiter<GetLoadBalancerRequest, GetLoadBalancerResponse> forLoadBalancer(
            GetLoadBalancerRequest request,
            com.oracle.bmc.loadbalancer.model.LoadBalancer.LifecycleState targetState,
            TerminationStrategy terminationStrategy,
            DelayStrategy delayStrategy) {
        return forLoadBalancer(
                Waiters.newWaiter(terminationStrategy, delayStrategy), request, targetState);
    }

    // Helper method to create a new Waiter for LoadBalancer.
    private Waiter<GetLoadBalancerRequest, GetLoadBalancerResponse> forLoadBalancer(
            BmcGenericWaiter waiter,
            final GetLoadBalancerRequest request,
            final com.oracle.bmc.loadbalancer.model.LoadBalancer.LifecycleState targetState) {
        return new SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        Suppliers.ofInstance(request),
                        new Function<GetLoadBalancerRequest, GetLoadBalancerResponse>() {
                            @Override
                            public GetLoadBalancerResponse apply(GetLoadBalancerRequest request) {
                                return client.getLoadBalancer(request);
                            }
                        },
                        new Predicate<GetLoadBalancerResponse>() {
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
    public Waiter<GetWorkRequestRequest, GetWorkRequestResponse> forWorkRequest(
            GetWorkRequestRequest request) {
        return forWorkRequest(Waiters.DEFAULT_POLLING_WAITER, request);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request The request to send.
     * @param terminationStrategy The {@link TerminationStrategy} to use.
     * @param delayStrategy The {@link DelayStrategy} to use.
     * @return A new Waiter instance.
     */
    public Waiter<GetWorkRequestRequest, GetWorkRequestResponse> forWorkRequest(
            GetWorkRequestRequest request,
            TerminationStrategy terminationStrategy,
            DelayStrategy delayStrategy) {
        return forWorkRequest(Waiters.newWaiter(terminationStrategy, delayStrategy), request);
    }

    // Helper method to create a new Waiter for WorkRequest.
    private Waiter<GetWorkRequestRequest, GetWorkRequestResponse> forWorkRequest(
            BmcGenericWaiter waiter, final GetWorkRequestRequest request) {
        return new SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        Suppliers.ofInstance(request),
                        new Function<GetWorkRequestRequest, GetWorkRequestResponse>() {
                            @Override
                            public GetWorkRequestResponse apply(GetWorkRequestRequest request) {
                                return client.getWorkRequest(request);
                            }
                        },
                        new Predicate<GetWorkRequestResponse>() {
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
