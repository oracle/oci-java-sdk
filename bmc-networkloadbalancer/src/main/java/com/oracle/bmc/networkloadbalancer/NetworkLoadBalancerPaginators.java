/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer;

import com.oracle.bmc.networkloadbalancer.requests.*;
import com.oracle.bmc.networkloadbalancer.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of NetworkLoadBalancer where multiple pages of data may be fetched.
 * Two styles of iteration are supported:
 *
 * <ul>
 *   <li>Iterating over the Response objects returned by the list operation. These are referred to as ResponseIterators, and the methods are suffixed with ResponseIterator. For example: <i>listUsersResponseIterator</i></li>
 *   <li>Iterating over the resources/records being listed. These are referred to as RecordIterators, and the methods are suffixed with RecordIterator. For example: <i>listUsersRecordIterator</i></li>
 * </ul>
 *
 * These iterables abstract away the need to write code to manually handle pagination via looping and using the page tokens.
 * They will automatically fetch more data from the service when required.
 *
 * As an example, if we were using the ListUsers operation in IdentityService, then the {@link java.lang.Iterable} returned by calling a
 * ResponseIterator method would iterate over the ListUsersResponse objects returned by each ListUsers call, whereas the {@link java.lang.Iterable}
 * returned by calling a RecordIterator method would iterate over the User records and we don't have to deal with ListUsersResponse objects at all.
 * In either case, pagination will be automatically handled so we can iterate until there are no more responses or no more resources/records available.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@lombok.RequiredArgsConstructor
public class NetworkLoadBalancerPaginators {
    private final NetworkLoadBalancer client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listBackendSets operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListBackendSetsResponse> listBackendSetsResponseIterator(
            final ListBackendSetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBackendSetsRequest.Builder, ListBackendSetsRequest, ListBackendSetsResponse>(
                new com.google.common.base.Supplier<ListBackendSetsRequest.Builder>() {
                    @Override
                    public ListBackendSetsRequest.Builder get() {
                        return ListBackendSetsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListBackendSetsResponse, String>() {
                    @Override
                    public String apply(ListBackendSetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBackendSetsRequest.Builder>,
                        ListBackendSetsRequest>() {
                    @Override
                    public ListBackendSetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBackendSetsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListBackendSetsRequest, ListBackendSetsResponse>() {
                    @Override
                    public ListBackendSetsResponse apply(ListBackendSetsRequest request) {
                        return client.listBackendSets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.networkloadbalancer.model.BackendSetSummary} objects
     * contained in responses from the listBackendSets operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.networkloadbalancer.model.BackendSetSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.networkloadbalancer.model.BackendSetSummary>
            listBackendSetsRecordIterator(final ListBackendSetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBackendSetsRequest.Builder, ListBackendSetsRequest, ListBackendSetsResponse,
                com.oracle.bmc.networkloadbalancer.model.BackendSetSummary>(
                new com.google.common.base.Supplier<ListBackendSetsRequest.Builder>() {
                    @Override
                    public ListBackendSetsRequest.Builder get() {
                        return ListBackendSetsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListBackendSetsResponse, String>() {
                    @Override
                    public String apply(ListBackendSetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBackendSetsRequest.Builder>,
                        ListBackendSetsRequest>() {
                    @Override
                    public ListBackendSetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBackendSetsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListBackendSetsRequest, ListBackendSetsResponse>() {
                    @Override
                    public ListBackendSetsResponse apply(ListBackendSetsRequest request) {
                        return client.listBackendSets(request);
                    }
                },
                new com.google.common.base.Function<
                        ListBackendSetsResponse,
                        java.util.List<
                                com.oracle.bmc.networkloadbalancer.model.BackendSetSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.networkloadbalancer.model.BackendSetSummary>
                            apply(ListBackendSetsResponse response) {
                        return response.getBackendSetCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listBackends operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListBackendsResponse> listBackendsResponseIterator(
            final ListBackendsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBackendsRequest.Builder, ListBackendsRequest, ListBackendsResponse>(
                new com.google.common.base.Supplier<ListBackendsRequest.Builder>() {
                    @Override
                    public ListBackendsRequest.Builder get() {
                        return ListBackendsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListBackendsResponse, String>() {
                    @Override
                    public String apply(ListBackendsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBackendsRequest.Builder>,
                        ListBackendsRequest>() {
                    @Override
                    public ListBackendsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBackendsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListBackendsRequest, ListBackendsResponse>() {
                    @Override
                    public ListBackendsResponse apply(ListBackendsRequest request) {
                        return client.listBackends(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.networkloadbalancer.model.BackendSummary} objects
     * contained in responses from the listBackends operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.networkloadbalancer.model.BackendSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.networkloadbalancer.model.BackendSummary>
            listBackendsRecordIterator(final ListBackendsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBackendsRequest.Builder, ListBackendsRequest, ListBackendsResponse,
                com.oracle.bmc.networkloadbalancer.model.BackendSummary>(
                new com.google.common.base.Supplier<ListBackendsRequest.Builder>() {
                    @Override
                    public ListBackendsRequest.Builder get() {
                        return ListBackendsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListBackendsResponse, String>() {
                    @Override
                    public String apply(ListBackendsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBackendsRequest.Builder>,
                        ListBackendsRequest>() {
                    @Override
                    public ListBackendsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBackendsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListBackendsRequest, ListBackendsResponse>() {
                    @Override
                    public ListBackendsResponse apply(ListBackendsRequest request) {
                        return client.listBackends(request);
                    }
                },
                new com.google.common.base.Function<
                        ListBackendsResponse,
                        java.util.List<com.oracle.bmc.networkloadbalancer.model.BackendSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.networkloadbalancer.model.BackendSummary>
                            apply(ListBackendsResponse response) {
                        return response.getBackendCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listListeners operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListListenersResponse> listListenersResponseIterator(
            final ListListenersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListListenersRequest.Builder, ListListenersRequest, ListListenersResponse>(
                new com.google.common.base.Supplier<ListListenersRequest.Builder>() {
                    @Override
                    public ListListenersRequest.Builder get() {
                        return ListListenersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListListenersResponse, String>() {
                    @Override
                    public String apply(ListListenersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListListenersRequest.Builder>,
                        ListListenersRequest>() {
                    @Override
                    public ListListenersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListListenersRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListListenersRequest, ListListenersResponse>() {
                    @Override
                    public ListListenersResponse apply(ListListenersRequest request) {
                        return client.listListeners(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.networkloadbalancer.model.ListenerSummary} objects
     * contained in responses from the listListeners operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.networkloadbalancer.model.ListenerSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.networkloadbalancer.model.ListenerSummary>
            listListenersRecordIterator(final ListListenersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListListenersRequest.Builder, ListListenersRequest, ListListenersResponse,
                com.oracle.bmc.networkloadbalancer.model.ListenerSummary>(
                new com.google.common.base.Supplier<ListListenersRequest.Builder>() {
                    @Override
                    public ListListenersRequest.Builder get() {
                        return ListListenersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListListenersResponse, String>() {
                    @Override
                    public String apply(ListListenersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListListenersRequest.Builder>,
                        ListListenersRequest>() {
                    @Override
                    public ListListenersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListListenersRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListListenersRequest, ListListenersResponse>() {
                    @Override
                    public ListListenersResponse apply(ListListenersRequest request) {
                        return client.listListeners(request);
                    }
                },
                new com.google.common.base.Function<
                        ListListenersResponse,
                        java.util.List<
                                com.oracle.bmc.networkloadbalancer.model.ListenerSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.networkloadbalancer.model.ListenerSummary>
                            apply(ListListenersResponse response) {
                        return response.getListenerCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listNetworkLoadBalancerHealths operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListNetworkLoadBalancerHealthsResponse>
            listNetworkLoadBalancerHealthsResponseIterator(
                    final ListNetworkLoadBalancerHealthsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListNetworkLoadBalancerHealthsRequest.Builder,
                ListNetworkLoadBalancerHealthsRequest, ListNetworkLoadBalancerHealthsResponse>(
                new com.google.common.base.Supplier<
                        ListNetworkLoadBalancerHealthsRequest.Builder>() {
                    @Override
                    public ListNetworkLoadBalancerHealthsRequest.Builder get() {
                        return ListNetworkLoadBalancerHealthsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListNetworkLoadBalancerHealthsResponse, String>() {
                    @Override
                    public String apply(ListNetworkLoadBalancerHealthsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNetworkLoadBalancerHealthsRequest.Builder>,
                        ListNetworkLoadBalancerHealthsRequest>() {
                    @Override
                    public ListNetworkLoadBalancerHealthsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNetworkLoadBalancerHealthsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListNetworkLoadBalancerHealthsRequest,
                        ListNetworkLoadBalancerHealthsResponse>() {
                    @Override
                    public ListNetworkLoadBalancerHealthsResponse apply(
                            ListNetworkLoadBalancerHealthsRequest request) {
                        return client.listNetworkLoadBalancerHealths(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancerHealthSummary} objects
     * contained in responses from the listNetworkLoadBalancerHealths operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancerHealthSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancerHealthSummary>
            listNetworkLoadBalancerHealthsRecordIterator(
                    final ListNetworkLoadBalancerHealthsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListNetworkLoadBalancerHealthsRequest.Builder,
                ListNetworkLoadBalancerHealthsRequest, ListNetworkLoadBalancerHealthsResponse,
                com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancerHealthSummary>(
                new com.google.common.base.Supplier<
                        ListNetworkLoadBalancerHealthsRequest.Builder>() {
                    @Override
                    public ListNetworkLoadBalancerHealthsRequest.Builder get() {
                        return ListNetworkLoadBalancerHealthsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListNetworkLoadBalancerHealthsResponse, String>() {
                    @Override
                    public String apply(ListNetworkLoadBalancerHealthsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNetworkLoadBalancerHealthsRequest.Builder>,
                        ListNetworkLoadBalancerHealthsRequest>() {
                    @Override
                    public ListNetworkLoadBalancerHealthsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNetworkLoadBalancerHealthsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListNetworkLoadBalancerHealthsRequest,
                        ListNetworkLoadBalancerHealthsResponse>() {
                    @Override
                    public ListNetworkLoadBalancerHealthsResponse apply(
                            ListNetworkLoadBalancerHealthsRequest request) {
                        return client.listNetworkLoadBalancerHealths(request);
                    }
                },
                new com.google.common.base.Function<
                        ListNetworkLoadBalancerHealthsResponse,
                        java.util.List<
                                com.oracle.bmc.networkloadbalancer.model
                                        .NetworkLoadBalancerHealthSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.networkloadbalancer.model
                                            .NetworkLoadBalancerHealthSummary>
                            apply(ListNetworkLoadBalancerHealthsResponse response) {
                        return response.getNetworkLoadBalancerHealthCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listNetworkLoadBalancers operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListNetworkLoadBalancersResponse> listNetworkLoadBalancersResponseIterator(
            final ListNetworkLoadBalancersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListNetworkLoadBalancersRequest.Builder, ListNetworkLoadBalancersRequest,
                ListNetworkLoadBalancersResponse>(
                new com.google.common.base.Supplier<ListNetworkLoadBalancersRequest.Builder>() {
                    @Override
                    public ListNetworkLoadBalancersRequest.Builder get() {
                        return ListNetworkLoadBalancersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListNetworkLoadBalancersResponse, String>() {
                    @Override
                    public String apply(ListNetworkLoadBalancersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNetworkLoadBalancersRequest.Builder>,
                        ListNetworkLoadBalancersRequest>() {
                    @Override
                    public ListNetworkLoadBalancersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNetworkLoadBalancersRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListNetworkLoadBalancersRequest, ListNetworkLoadBalancersResponse>() {
                    @Override
                    public ListNetworkLoadBalancersResponse apply(
                            ListNetworkLoadBalancersRequest request) {
                        return client.listNetworkLoadBalancers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancerSummary} objects
     * contained in responses from the listNetworkLoadBalancers operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancerSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancerSummary>
            listNetworkLoadBalancersRecordIterator(final ListNetworkLoadBalancersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListNetworkLoadBalancersRequest.Builder, ListNetworkLoadBalancersRequest,
                ListNetworkLoadBalancersResponse,
                com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancerSummary>(
                new com.google.common.base.Supplier<ListNetworkLoadBalancersRequest.Builder>() {
                    @Override
                    public ListNetworkLoadBalancersRequest.Builder get() {
                        return ListNetworkLoadBalancersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListNetworkLoadBalancersResponse, String>() {
                    @Override
                    public String apply(ListNetworkLoadBalancersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNetworkLoadBalancersRequest.Builder>,
                        ListNetworkLoadBalancersRequest>() {
                    @Override
                    public ListNetworkLoadBalancersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNetworkLoadBalancersRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListNetworkLoadBalancersRequest, ListNetworkLoadBalancersResponse>() {
                    @Override
                    public ListNetworkLoadBalancersResponse apply(
                            ListNetworkLoadBalancersRequest request) {
                        return client.listNetworkLoadBalancers(request);
                    }
                },
                new com.google.common.base.Function<
                        ListNetworkLoadBalancersResponse,
                        java.util.List<
                                com.oracle.bmc.networkloadbalancer.model
                                        .NetworkLoadBalancerSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.networkloadbalancer.model
                                            .NetworkLoadBalancerSummary>
                            apply(ListNetworkLoadBalancersResponse response) {
                        return response.getNetworkLoadBalancerCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listNetworkLoadBalancersPolicies operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListNetworkLoadBalancersPoliciesResponse>
            listNetworkLoadBalancersPoliciesResponseIterator(
                    final ListNetworkLoadBalancersPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListNetworkLoadBalancersPoliciesRequest.Builder,
                ListNetworkLoadBalancersPoliciesRequest, ListNetworkLoadBalancersPoliciesResponse>(
                new com.google.common.base.Supplier<
                        ListNetworkLoadBalancersPoliciesRequest.Builder>() {
                    @Override
                    public ListNetworkLoadBalancersPoliciesRequest.Builder get() {
                        return ListNetworkLoadBalancersPoliciesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListNetworkLoadBalancersPoliciesResponse, String>() {
                    @Override
                    public String apply(ListNetworkLoadBalancersPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNetworkLoadBalancersPoliciesRequest.Builder>,
                        ListNetworkLoadBalancersPoliciesRequest>() {
                    @Override
                    public ListNetworkLoadBalancersPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNetworkLoadBalancersPoliciesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListNetworkLoadBalancersPoliciesRequest,
                        ListNetworkLoadBalancersPoliciesResponse>() {
                    @Override
                    public ListNetworkLoadBalancersPoliciesResponse apply(
                            ListNetworkLoadBalancersPoliciesRequest request) {
                        return client.listNetworkLoadBalancersPolicies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancersPolicySummary} objects
     * contained in responses from the listNetworkLoadBalancersPolicies operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancersPolicySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancersPolicySummary>
            listNetworkLoadBalancersPoliciesRecordIterator(
                    final ListNetworkLoadBalancersPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListNetworkLoadBalancersPoliciesRequest.Builder,
                ListNetworkLoadBalancersPoliciesRequest, ListNetworkLoadBalancersPoliciesResponse,
                com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancersPolicySummary>(
                new com.google.common.base.Supplier<
                        ListNetworkLoadBalancersPoliciesRequest.Builder>() {
                    @Override
                    public ListNetworkLoadBalancersPoliciesRequest.Builder get() {
                        return ListNetworkLoadBalancersPoliciesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListNetworkLoadBalancersPoliciesResponse, String>() {
                    @Override
                    public String apply(ListNetworkLoadBalancersPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNetworkLoadBalancersPoliciesRequest.Builder>,
                        ListNetworkLoadBalancersPoliciesRequest>() {
                    @Override
                    public ListNetworkLoadBalancersPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNetworkLoadBalancersPoliciesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListNetworkLoadBalancersPoliciesRequest,
                        ListNetworkLoadBalancersPoliciesResponse>() {
                    @Override
                    public ListNetworkLoadBalancersPoliciesResponse apply(
                            ListNetworkLoadBalancersPoliciesRequest request) {
                        return client.listNetworkLoadBalancersPolicies(request);
                    }
                },
                new com.google.common.base.Function<
                        ListNetworkLoadBalancersPoliciesResponse,
                        java.util.List<
                                com.oracle.bmc.networkloadbalancer.model
                                        .NetworkLoadBalancersPolicySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.networkloadbalancer.model
                                            .NetworkLoadBalancersPolicySummary>
                            apply(ListNetworkLoadBalancersPoliciesResponse response) {
                        return response.getNetworkLoadBalancersPolicyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listNetworkLoadBalancersProtocols operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListNetworkLoadBalancersProtocolsResponse>
            listNetworkLoadBalancersProtocolsResponseIterator(
                    final ListNetworkLoadBalancersProtocolsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListNetworkLoadBalancersProtocolsRequest.Builder,
                ListNetworkLoadBalancersProtocolsRequest,
                ListNetworkLoadBalancersProtocolsResponse>(
                new com.google.common.base.Supplier<
                        ListNetworkLoadBalancersProtocolsRequest.Builder>() {
                    @Override
                    public ListNetworkLoadBalancersProtocolsRequest.Builder get() {
                        return ListNetworkLoadBalancersProtocolsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListNetworkLoadBalancersProtocolsResponse, String>() {
                    @Override
                    public String apply(ListNetworkLoadBalancersProtocolsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNetworkLoadBalancersProtocolsRequest.Builder>,
                        ListNetworkLoadBalancersProtocolsRequest>() {
                    @Override
                    public ListNetworkLoadBalancersProtocolsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNetworkLoadBalancersProtocolsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListNetworkLoadBalancersProtocolsRequest,
                        ListNetworkLoadBalancersProtocolsResponse>() {
                    @Override
                    public ListNetworkLoadBalancersProtocolsResponse apply(
                            ListNetworkLoadBalancersProtocolsRequest request) {
                        return client.listNetworkLoadBalancersProtocols(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancersProtocolSummary} objects
     * contained in responses from the listNetworkLoadBalancersProtocols operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancersProtocolSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancersProtocolSummary>
            listNetworkLoadBalancersProtocolsRecordIterator(
                    final ListNetworkLoadBalancersProtocolsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListNetworkLoadBalancersProtocolsRequest.Builder,
                ListNetworkLoadBalancersProtocolsRequest, ListNetworkLoadBalancersProtocolsResponse,
                com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancersProtocolSummary>(
                new com.google.common.base.Supplier<
                        ListNetworkLoadBalancersProtocolsRequest.Builder>() {
                    @Override
                    public ListNetworkLoadBalancersProtocolsRequest.Builder get() {
                        return ListNetworkLoadBalancersProtocolsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListNetworkLoadBalancersProtocolsResponse, String>() {
                    @Override
                    public String apply(ListNetworkLoadBalancersProtocolsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNetworkLoadBalancersProtocolsRequest.Builder>,
                        ListNetworkLoadBalancersProtocolsRequest>() {
                    @Override
                    public ListNetworkLoadBalancersProtocolsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNetworkLoadBalancersProtocolsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListNetworkLoadBalancersProtocolsRequest,
                        ListNetworkLoadBalancersProtocolsResponse>() {
                    @Override
                    public ListNetworkLoadBalancersProtocolsResponse apply(
                            ListNetworkLoadBalancersProtocolsRequest request) {
                        return client.listNetworkLoadBalancersProtocols(request);
                    }
                },
                new com.google.common.base.Function<
                        ListNetworkLoadBalancersProtocolsResponse,
                        java.util.List<
                                com.oracle.bmc.networkloadbalancer.model
                                        .NetworkLoadBalancersProtocolSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.networkloadbalancer.model
                                            .NetworkLoadBalancersProtocolSummary>
                            apply(ListNetworkLoadBalancersProtocolsResponse response) {
                        return response.getNetworkLoadBalancersProtocolCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWorkRequestErrors operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWorkRequestErrorsResponse> listWorkRequestErrorsResponseIterator(
            final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse>(
                new com.google.common.base.Supplier<ListWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListWorkRequestErrorsRequest.Builder get() {
                        return ListWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestErrorsRequest.Builder>,
                        ListWorkRequestErrorsRequest>() {
                    @Override
                    public ListWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestErrorsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>() {
                    @Override
                    public ListWorkRequestErrorsResponse apply(
                            ListWorkRequestErrorsRequest request) {
                        return client.listWorkRequestErrors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.networkloadbalancer.model.WorkRequestError} objects
     * contained in responses from the listWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.networkloadbalancer.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.networkloadbalancer.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.networkloadbalancer.model.WorkRequestError>(
                new com.google.common.base.Supplier<ListWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListWorkRequestErrorsRequest.Builder get() {
                        return ListWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestErrorsRequest.Builder>,
                        ListWorkRequestErrorsRequest>() {
                    @Override
                    public ListWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestErrorsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>() {
                    @Override
                    public ListWorkRequestErrorsResponse apply(
                            ListWorkRequestErrorsRequest request) {
                        return client.listWorkRequestErrors(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestErrorsResponse,
                        java.util.List<
                                com.oracle.bmc.networkloadbalancer.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.networkloadbalancer.model.WorkRequestError>
                            apply(ListWorkRequestErrorsResponse response) {
                        return response.getWorkRequestErrorCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWorkRequestLogs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWorkRequestLogsResponse> listWorkRequestLogsResponseIterator(
            final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse>(
                new com.google.common.base.Supplier<ListWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListWorkRequestLogsRequest.Builder get() {
                        return ListWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestLogsRequest.Builder>,
                        ListWorkRequestLogsRequest>() {
                    @Override
                    public ListWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestLogsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>() {
                    @Override
                    public ListWorkRequestLogsResponse apply(ListWorkRequestLogsRequest request) {
                        return client.listWorkRequestLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.networkloadbalancer.model.WorkRequestLogEntry} objects
     * contained in responses from the listWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.networkloadbalancer.model.WorkRequestLogEntry} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.networkloadbalancer.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.networkloadbalancer.model.WorkRequestLogEntry>(
                new com.google.common.base.Supplier<ListWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListWorkRequestLogsRequest.Builder get() {
                        return ListWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestLogsRequest.Builder>,
                        ListWorkRequestLogsRequest>() {
                    @Override
                    public ListWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestLogsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>() {
                    @Override
                    public ListWorkRequestLogsResponse apply(ListWorkRequestLogsRequest request) {
                        return client.listWorkRequestLogs(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestLogsResponse,
                        java.util.List<
                                com.oracle.bmc.networkloadbalancer.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.networkloadbalancer.model.WorkRequestLogEntry>
                            apply(ListWorkRequestLogsResponse response) {
                        return response.getWorkRequestLogEntryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWorkRequests operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWorkRequestsResponse> listWorkRequestsResponseIterator(
            final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse>(
                new com.google.common.base.Supplier<ListWorkRequestsRequest.Builder>() {
                    @Override
                    public ListWorkRequestsRequest.Builder get() {
                        return ListWorkRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestsRequest.Builder>,
                        ListWorkRequestsRequest>() {
                    @Override
                    public ListWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestsRequest, ListWorkRequestsResponse>() {
                    @Override
                    public ListWorkRequestsResponse apply(ListWorkRequestsRequest request) {
                        return client.listWorkRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.networkloadbalancer.model.WorkRequestSummary} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.networkloadbalancer.model.WorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.networkloadbalancer.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.networkloadbalancer.model.WorkRequestSummary>(
                new com.google.common.base.Supplier<ListWorkRequestsRequest.Builder>() {
                    @Override
                    public ListWorkRequestsRequest.Builder get() {
                        return ListWorkRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestsRequest.Builder>,
                        ListWorkRequestsRequest>() {
                    @Override
                    public ListWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestsRequest, ListWorkRequestsResponse>() {
                    @Override
                    public ListWorkRequestsResponse apply(ListWorkRequestsRequest request) {
                        return client.listWorkRequests(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestsResponse,
                        java.util.List<
                                com.oracle.bmc.networkloadbalancer.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.networkloadbalancer.model.WorkRequestSummary>
                            apply(ListWorkRequestsResponse response) {
                        return response.getWorkRequestCollection().getItems();
                    }
                });
    }
}
