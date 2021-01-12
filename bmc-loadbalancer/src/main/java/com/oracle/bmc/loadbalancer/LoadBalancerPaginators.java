/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer;

import com.oracle.bmc.loadbalancer.requests.*;
import com.oracle.bmc.loadbalancer.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of LoadBalancer where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.RequiredArgsConstructor
public class LoadBalancerPaginators {
    private final LoadBalancer client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listLoadBalancerHealths operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListLoadBalancerHealthsResponse> listLoadBalancerHealthsResponseIterator(
            final ListLoadBalancerHealthsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLoadBalancerHealthsRequest.Builder, ListLoadBalancerHealthsRequest,
                ListLoadBalancerHealthsResponse>(
                new com.google.common.base.Supplier<ListLoadBalancerHealthsRequest.Builder>() {
                    @Override
                    public ListLoadBalancerHealthsRequest.Builder get() {
                        return ListLoadBalancerHealthsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLoadBalancerHealthsResponse, String>() {
                    @Override
                    public String apply(ListLoadBalancerHealthsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLoadBalancerHealthsRequest.Builder>,
                        ListLoadBalancerHealthsRequest>() {
                    @Override
                    public ListLoadBalancerHealthsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLoadBalancerHealthsRequest.Builder>
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
                        ListLoadBalancerHealthsRequest, ListLoadBalancerHealthsResponse>() {
                    @Override
                    public ListLoadBalancerHealthsResponse apply(
                            ListLoadBalancerHealthsRequest request) {
                        return client.listLoadBalancerHealths(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loadbalancer.model.LoadBalancerHealthSummary} objects
     * contained in responses from the listLoadBalancerHealths operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loadbalancer.model.LoadBalancerHealthSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loadbalancer.model.LoadBalancerHealthSummary>
            listLoadBalancerHealthsRecordIterator(final ListLoadBalancerHealthsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLoadBalancerHealthsRequest.Builder, ListLoadBalancerHealthsRequest,
                ListLoadBalancerHealthsResponse,
                com.oracle.bmc.loadbalancer.model.LoadBalancerHealthSummary>(
                new com.google.common.base.Supplier<ListLoadBalancerHealthsRequest.Builder>() {
                    @Override
                    public ListLoadBalancerHealthsRequest.Builder get() {
                        return ListLoadBalancerHealthsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLoadBalancerHealthsResponse, String>() {
                    @Override
                    public String apply(ListLoadBalancerHealthsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLoadBalancerHealthsRequest.Builder>,
                        ListLoadBalancerHealthsRequest>() {
                    @Override
                    public ListLoadBalancerHealthsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLoadBalancerHealthsRequest.Builder>
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
                        ListLoadBalancerHealthsRequest, ListLoadBalancerHealthsResponse>() {
                    @Override
                    public ListLoadBalancerHealthsResponse apply(
                            ListLoadBalancerHealthsRequest request) {
                        return client.listLoadBalancerHealths(request);
                    }
                },
                new com.google.common.base.Function<
                        ListLoadBalancerHealthsResponse,
                        java.util.List<
                                com.oracle.bmc.loadbalancer.model.LoadBalancerHealthSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.loadbalancer.model.LoadBalancerHealthSummary>
                            apply(ListLoadBalancerHealthsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listLoadBalancers operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListLoadBalancersResponse> listLoadBalancersResponseIterator(
            final ListLoadBalancersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLoadBalancersRequest.Builder, ListLoadBalancersRequest,
                ListLoadBalancersResponse>(
                new com.google.common.base.Supplier<ListLoadBalancersRequest.Builder>() {
                    @Override
                    public ListLoadBalancersRequest.Builder get() {
                        return ListLoadBalancersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLoadBalancersResponse, String>() {
                    @Override
                    public String apply(ListLoadBalancersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLoadBalancersRequest.Builder>,
                        ListLoadBalancersRequest>() {
                    @Override
                    public ListLoadBalancersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLoadBalancersRequest.Builder>
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
                        ListLoadBalancersRequest, ListLoadBalancersResponse>() {
                    @Override
                    public ListLoadBalancersResponse apply(ListLoadBalancersRequest request) {
                        return client.listLoadBalancers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loadbalancer.model.LoadBalancer} objects
     * contained in responses from the listLoadBalancers operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loadbalancer.model.LoadBalancer} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loadbalancer.model.LoadBalancer> listLoadBalancersRecordIterator(
            final ListLoadBalancersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLoadBalancersRequest.Builder, ListLoadBalancersRequest,
                ListLoadBalancersResponse, com.oracle.bmc.loadbalancer.model.LoadBalancer>(
                new com.google.common.base.Supplier<ListLoadBalancersRequest.Builder>() {
                    @Override
                    public ListLoadBalancersRequest.Builder get() {
                        return ListLoadBalancersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLoadBalancersResponse, String>() {
                    @Override
                    public String apply(ListLoadBalancersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLoadBalancersRequest.Builder>,
                        ListLoadBalancersRequest>() {
                    @Override
                    public ListLoadBalancersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLoadBalancersRequest.Builder>
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
                        ListLoadBalancersRequest, ListLoadBalancersResponse>() {
                    @Override
                    public ListLoadBalancersResponse apply(ListLoadBalancersRequest request) {
                        return client.listLoadBalancers(request);
                    }
                },
                new com.google.common.base.Function<
                        ListLoadBalancersResponse,
                        java.util.List<com.oracle.bmc.loadbalancer.model.LoadBalancer>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loadbalancer.model.LoadBalancer> apply(
                            ListLoadBalancersResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listPolicies operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListPoliciesResponse> listPoliciesResponseIterator(
            final ListPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPoliciesRequest.Builder, ListPoliciesRequest, ListPoliciesResponse>(
                new com.google.common.base.Supplier<ListPoliciesRequest.Builder>() {
                    @Override
                    public ListPoliciesRequest.Builder get() {
                        return ListPoliciesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListPoliciesResponse, String>() {
                    @Override
                    public String apply(ListPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPoliciesRequest.Builder>,
                        ListPoliciesRequest>() {
                    @Override
                    public ListPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPoliciesRequest.Builder>
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
                new com.google.common.base.Function<ListPoliciesRequest, ListPoliciesResponse>() {
                    @Override
                    public ListPoliciesResponse apply(ListPoliciesRequest request) {
                        return client.listPolicies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loadbalancer.model.LoadBalancerPolicy} objects
     * contained in responses from the listPolicies operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loadbalancer.model.LoadBalancerPolicy} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loadbalancer.model.LoadBalancerPolicy>
            listPoliciesRecordIterator(final ListPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPoliciesRequest.Builder, ListPoliciesRequest, ListPoliciesResponse,
                com.oracle.bmc.loadbalancer.model.LoadBalancerPolicy>(
                new com.google.common.base.Supplier<ListPoliciesRequest.Builder>() {
                    @Override
                    public ListPoliciesRequest.Builder get() {
                        return ListPoliciesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListPoliciesResponse, String>() {
                    @Override
                    public String apply(ListPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPoliciesRequest.Builder>,
                        ListPoliciesRequest>() {
                    @Override
                    public ListPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPoliciesRequest.Builder>
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
                new com.google.common.base.Function<ListPoliciesRequest, ListPoliciesResponse>() {
                    @Override
                    public ListPoliciesResponse apply(ListPoliciesRequest request) {
                        return client.listPolicies(request);
                    }
                },
                new com.google.common.base.Function<
                        ListPoliciesResponse,
                        java.util.List<com.oracle.bmc.loadbalancer.model.LoadBalancerPolicy>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loadbalancer.model.LoadBalancerPolicy>
                            apply(ListPoliciesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listProtocols operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListProtocolsResponse> listProtocolsResponseIterator(
            final ListProtocolsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListProtocolsRequest.Builder, ListProtocolsRequest, ListProtocolsResponse>(
                new com.google.common.base.Supplier<ListProtocolsRequest.Builder>() {
                    @Override
                    public ListProtocolsRequest.Builder get() {
                        return ListProtocolsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListProtocolsResponse, String>() {
                    @Override
                    public String apply(ListProtocolsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProtocolsRequest.Builder>,
                        ListProtocolsRequest>() {
                    @Override
                    public ListProtocolsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProtocolsRequest.Builder>
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
                new com.google.common.base.Function<ListProtocolsRequest, ListProtocolsResponse>() {
                    @Override
                    public ListProtocolsResponse apply(ListProtocolsRequest request) {
                        return client.listProtocols(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loadbalancer.model.LoadBalancerProtocol} objects
     * contained in responses from the listProtocols operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loadbalancer.model.LoadBalancerProtocol} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loadbalancer.model.LoadBalancerProtocol>
            listProtocolsRecordIterator(final ListProtocolsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListProtocolsRequest.Builder, ListProtocolsRequest, ListProtocolsResponse,
                com.oracle.bmc.loadbalancer.model.LoadBalancerProtocol>(
                new com.google.common.base.Supplier<ListProtocolsRequest.Builder>() {
                    @Override
                    public ListProtocolsRequest.Builder get() {
                        return ListProtocolsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListProtocolsResponse, String>() {
                    @Override
                    public String apply(ListProtocolsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProtocolsRequest.Builder>,
                        ListProtocolsRequest>() {
                    @Override
                    public ListProtocolsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProtocolsRequest.Builder>
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
                new com.google.common.base.Function<ListProtocolsRequest, ListProtocolsResponse>() {
                    @Override
                    public ListProtocolsResponse apply(ListProtocolsRequest request) {
                        return client.listProtocols(request);
                    }
                },
                new com.google.common.base.Function<
                        ListProtocolsResponse,
                        java.util.List<com.oracle.bmc.loadbalancer.model.LoadBalancerProtocol>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loadbalancer.model.LoadBalancerProtocol>
                            apply(ListProtocolsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listShapes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListShapesResponse> listShapesResponseIterator(
            final ListShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListShapesRequest.Builder, ListShapesRequest, ListShapesResponse>(
                new com.google.common.base.Supplier<ListShapesRequest.Builder>() {
                    @Override
                    public ListShapesRequest.Builder get() {
                        return ListShapesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListShapesResponse, String>() {
                    @Override
                    public String apply(ListShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListShapesRequest.Builder>,
                        ListShapesRequest>() {
                    @Override
                    public ListShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListShapesRequest.Builder>
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
                new com.google.common.base.Function<ListShapesRequest, ListShapesResponse>() {
                    @Override
                    public ListShapesResponse apply(ListShapesRequest request) {
                        return client.listShapes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loadbalancer.model.LoadBalancerShape} objects
     * contained in responses from the listShapes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loadbalancer.model.LoadBalancerShape} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loadbalancer.model.LoadBalancerShape> listShapesRecordIterator(
            final ListShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListShapesRequest.Builder, ListShapesRequest, ListShapesResponse,
                com.oracle.bmc.loadbalancer.model.LoadBalancerShape>(
                new com.google.common.base.Supplier<ListShapesRequest.Builder>() {
                    @Override
                    public ListShapesRequest.Builder get() {
                        return ListShapesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListShapesResponse, String>() {
                    @Override
                    public String apply(ListShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListShapesRequest.Builder>,
                        ListShapesRequest>() {
                    @Override
                    public ListShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListShapesRequest.Builder>
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
                new com.google.common.base.Function<ListShapesRequest, ListShapesResponse>() {
                    @Override
                    public ListShapesResponse apply(ListShapesRequest request) {
                        return client.listShapes(request);
                    }
                },
                new com.google.common.base.Function<
                        ListShapesResponse,
                        java.util.List<com.oracle.bmc.loadbalancer.model.LoadBalancerShape>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loadbalancer.model.LoadBalancerShape>
                            apply(ListShapesResponse response) {
                        return response.getItems();
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.loadbalancer.model.WorkRequest} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.loadbalancer.model.WorkRequest} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.loadbalancer.model.WorkRequest> listWorkRequestsRecordIterator(
            final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.loadbalancer.model.WorkRequest>(
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
                        java.util.List<com.oracle.bmc.loadbalancer.model.WorkRequest>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.loadbalancer.model.WorkRequest> apply(
                            ListWorkRequestsResponse response) {
                        return response.getItems();
                    }
                });
    }
}
