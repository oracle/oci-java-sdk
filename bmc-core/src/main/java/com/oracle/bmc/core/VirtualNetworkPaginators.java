/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of VirtualNetwork where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.RequiredArgsConstructor
public class VirtualNetworkPaginators {
    private final VirtualNetwork client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listCpes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListCpesResponse> listCpesResponseIterator(final ListCpesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCpesRequest.Builder, ListCpesRequest, ListCpesResponse>(
                new com.google.common.base.Supplier<ListCpesRequest.Builder>() {
                    @Override
                    public ListCpesRequest.Builder get() {
                        return ListCpesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListCpesResponse, String>() {
                    @Override
                    public String apply(ListCpesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCpesRequest.Builder>,
                        ListCpesRequest>() {
                    @Override
                    public ListCpesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCpesRequest.Builder>
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
                new com.google.common.base.Function<ListCpesRequest, ListCpesResponse>() {
                    @Override
                    public ListCpesResponse apply(ListCpesRequest request) {
                        return client.listCpes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.Cpe} objects
     * contained in responses from the listCpes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.Cpe} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.Cpe> listCpesRecordIterator(
            final ListCpesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCpesRequest.Builder, ListCpesRequest, ListCpesResponse,
                com.oracle.bmc.core.model.Cpe>(
                new com.google.common.base.Supplier<ListCpesRequest.Builder>() {
                    @Override
                    public ListCpesRequest.Builder get() {
                        return ListCpesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListCpesResponse, String>() {
                    @Override
                    public String apply(ListCpesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCpesRequest.Builder>,
                        ListCpesRequest>() {
                    @Override
                    public ListCpesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCpesRequest.Builder>
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
                new com.google.common.base.Function<ListCpesRequest, ListCpesResponse>() {
                    @Override
                    public ListCpesResponse apply(ListCpesRequest request) {
                        return client.listCpes(request);
                    }
                },
                new com.google.common.base.Function<
                        ListCpesResponse, java.util.List<com.oracle.bmc.core.model.Cpe>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.Cpe> apply(
                            ListCpesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listCrossConnectGroups operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListCrossConnectGroupsResponse> listCrossConnectGroupsResponseIterator(
            final ListCrossConnectGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCrossConnectGroupsRequest.Builder, ListCrossConnectGroupsRequest,
                ListCrossConnectGroupsResponse>(
                new com.google.common.base.Supplier<ListCrossConnectGroupsRequest.Builder>() {
                    @Override
                    public ListCrossConnectGroupsRequest.Builder get() {
                        return ListCrossConnectGroupsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListCrossConnectGroupsResponse, String>() {
                    @Override
                    public String apply(ListCrossConnectGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCrossConnectGroupsRequest.Builder>,
                        ListCrossConnectGroupsRequest>() {
                    @Override
                    public ListCrossConnectGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCrossConnectGroupsRequest.Builder>
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
                        ListCrossConnectGroupsRequest, ListCrossConnectGroupsResponse>() {
                    @Override
                    public ListCrossConnectGroupsResponse apply(
                            ListCrossConnectGroupsRequest request) {
                        return client.listCrossConnectGroups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.CrossConnectGroup} objects
     * contained in responses from the listCrossConnectGroups operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.CrossConnectGroup} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.CrossConnectGroup>
            listCrossConnectGroupsRecordIterator(final ListCrossConnectGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCrossConnectGroupsRequest.Builder, ListCrossConnectGroupsRequest,
                ListCrossConnectGroupsResponse, com.oracle.bmc.core.model.CrossConnectGroup>(
                new com.google.common.base.Supplier<ListCrossConnectGroupsRequest.Builder>() {
                    @Override
                    public ListCrossConnectGroupsRequest.Builder get() {
                        return ListCrossConnectGroupsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListCrossConnectGroupsResponse, String>() {
                    @Override
                    public String apply(ListCrossConnectGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCrossConnectGroupsRequest.Builder>,
                        ListCrossConnectGroupsRequest>() {
                    @Override
                    public ListCrossConnectGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCrossConnectGroupsRequest.Builder>
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
                        ListCrossConnectGroupsRequest, ListCrossConnectGroupsResponse>() {
                    @Override
                    public ListCrossConnectGroupsResponse apply(
                            ListCrossConnectGroupsRequest request) {
                        return client.listCrossConnectGroups(request);
                    }
                },
                new com.google.common.base.Function<
                        ListCrossConnectGroupsResponse,
                        java.util.List<com.oracle.bmc.core.model.CrossConnectGroup>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.CrossConnectGroup> apply(
                            ListCrossConnectGroupsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listCrossConnectLocations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListCrossConnectLocationsResponse> listCrossConnectLocationsResponseIterator(
            final ListCrossConnectLocationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCrossConnectLocationsRequest.Builder, ListCrossConnectLocationsRequest,
                ListCrossConnectLocationsResponse>(
                new com.google.common.base.Supplier<ListCrossConnectLocationsRequest.Builder>() {
                    @Override
                    public ListCrossConnectLocationsRequest.Builder get() {
                        return ListCrossConnectLocationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListCrossConnectLocationsResponse, String>() {
                    @Override
                    public String apply(ListCrossConnectLocationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCrossConnectLocationsRequest.Builder>,
                        ListCrossConnectLocationsRequest>() {
                    @Override
                    public ListCrossConnectLocationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCrossConnectLocationsRequest.Builder>
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
                        ListCrossConnectLocationsRequest, ListCrossConnectLocationsResponse>() {
                    @Override
                    public ListCrossConnectLocationsResponse apply(
                            ListCrossConnectLocationsRequest request) {
                        return client.listCrossConnectLocations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.CrossConnectLocation} objects
     * contained in responses from the listCrossConnectLocations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.CrossConnectLocation} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.CrossConnectLocation>
            listCrossConnectLocationsRecordIterator(
                    final ListCrossConnectLocationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCrossConnectLocationsRequest.Builder, ListCrossConnectLocationsRequest,
                ListCrossConnectLocationsResponse, com.oracle.bmc.core.model.CrossConnectLocation>(
                new com.google.common.base.Supplier<ListCrossConnectLocationsRequest.Builder>() {
                    @Override
                    public ListCrossConnectLocationsRequest.Builder get() {
                        return ListCrossConnectLocationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListCrossConnectLocationsResponse, String>() {
                    @Override
                    public String apply(ListCrossConnectLocationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCrossConnectLocationsRequest.Builder>,
                        ListCrossConnectLocationsRequest>() {
                    @Override
                    public ListCrossConnectLocationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCrossConnectLocationsRequest.Builder>
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
                        ListCrossConnectLocationsRequest, ListCrossConnectLocationsResponse>() {
                    @Override
                    public ListCrossConnectLocationsResponse apply(
                            ListCrossConnectLocationsRequest request) {
                        return client.listCrossConnectLocations(request);
                    }
                },
                new com.google.common.base.Function<
                        ListCrossConnectLocationsResponse,
                        java.util.List<com.oracle.bmc.core.model.CrossConnectLocation>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.CrossConnectLocation> apply(
                            ListCrossConnectLocationsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listCrossConnects operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListCrossConnectsResponse> listCrossConnectsResponseIterator(
            final ListCrossConnectsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCrossConnectsRequest.Builder, ListCrossConnectsRequest,
                ListCrossConnectsResponse>(
                new com.google.common.base.Supplier<ListCrossConnectsRequest.Builder>() {
                    @Override
                    public ListCrossConnectsRequest.Builder get() {
                        return ListCrossConnectsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListCrossConnectsResponse, String>() {
                    @Override
                    public String apply(ListCrossConnectsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCrossConnectsRequest.Builder>,
                        ListCrossConnectsRequest>() {
                    @Override
                    public ListCrossConnectsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCrossConnectsRequest.Builder>
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
                        ListCrossConnectsRequest, ListCrossConnectsResponse>() {
                    @Override
                    public ListCrossConnectsResponse apply(ListCrossConnectsRequest request) {
                        return client.listCrossConnects(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.CrossConnect} objects
     * contained in responses from the listCrossConnects operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.CrossConnect} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.CrossConnect> listCrossConnectsRecordIterator(
            final ListCrossConnectsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCrossConnectsRequest.Builder, ListCrossConnectsRequest,
                ListCrossConnectsResponse, com.oracle.bmc.core.model.CrossConnect>(
                new com.google.common.base.Supplier<ListCrossConnectsRequest.Builder>() {
                    @Override
                    public ListCrossConnectsRequest.Builder get() {
                        return ListCrossConnectsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListCrossConnectsResponse, String>() {
                    @Override
                    public String apply(ListCrossConnectsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCrossConnectsRequest.Builder>,
                        ListCrossConnectsRequest>() {
                    @Override
                    public ListCrossConnectsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCrossConnectsRequest.Builder>
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
                        ListCrossConnectsRequest, ListCrossConnectsResponse>() {
                    @Override
                    public ListCrossConnectsResponse apply(ListCrossConnectsRequest request) {
                        return client.listCrossConnects(request);
                    }
                },
                new com.google.common.base.Function<
                        ListCrossConnectsResponse,
                        java.util.List<com.oracle.bmc.core.model.CrossConnect>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.CrossConnect> apply(
                            ListCrossConnectsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listCrossconnectPortSpeedShapes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListCrossconnectPortSpeedShapesResponse>
            listCrossconnectPortSpeedShapesResponseIterator(
                    final ListCrossconnectPortSpeedShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCrossconnectPortSpeedShapesRequest.Builder,
                ListCrossconnectPortSpeedShapesRequest, ListCrossconnectPortSpeedShapesResponse>(
                new com.google.common.base.Supplier<
                        ListCrossconnectPortSpeedShapesRequest.Builder>() {
                    @Override
                    public ListCrossconnectPortSpeedShapesRequest.Builder get() {
                        return ListCrossconnectPortSpeedShapesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListCrossconnectPortSpeedShapesResponse, String>() {
                    @Override
                    public String apply(ListCrossconnectPortSpeedShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCrossconnectPortSpeedShapesRequest.Builder>,
                        ListCrossconnectPortSpeedShapesRequest>() {
                    @Override
                    public ListCrossconnectPortSpeedShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCrossconnectPortSpeedShapesRequest.Builder>
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
                        ListCrossconnectPortSpeedShapesRequest,
                        ListCrossconnectPortSpeedShapesResponse>() {
                    @Override
                    public ListCrossconnectPortSpeedShapesResponse apply(
                            ListCrossconnectPortSpeedShapesRequest request) {
                        return client.listCrossconnectPortSpeedShapes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.CrossConnectPortSpeedShape} objects
     * contained in responses from the listCrossconnectPortSpeedShapes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.CrossConnectPortSpeedShape} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.CrossConnectPortSpeedShape>
            listCrossconnectPortSpeedShapesRecordIterator(
                    final ListCrossconnectPortSpeedShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCrossconnectPortSpeedShapesRequest.Builder,
                ListCrossconnectPortSpeedShapesRequest, ListCrossconnectPortSpeedShapesResponse,
                com.oracle.bmc.core.model.CrossConnectPortSpeedShape>(
                new com.google.common.base.Supplier<
                        ListCrossconnectPortSpeedShapesRequest.Builder>() {
                    @Override
                    public ListCrossconnectPortSpeedShapesRequest.Builder get() {
                        return ListCrossconnectPortSpeedShapesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListCrossconnectPortSpeedShapesResponse, String>() {
                    @Override
                    public String apply(ListCrossconnectPortSpeedShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCrossconnectPortSpeedShapesRequest.Builder>,
                        ListCrossconnectPortSpeedShapesRequest>() {
                    @Override
                    public ListCrossconnectPortSpeedShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCrossconnectPortSpeedShapesRequest.Builder>
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
                        ListCrossconnectPortSpeedShapesRequest,
                        ListCrossconnectPortSpeedShapesResponse>() {
                    @Override
                    public ListCrossconnectPortSpeedShapesResponse apply(
                            ListCrossconnectPortSpeedShapesRequest request) {
                        return client.listCrossconnectPortSpeedShapes(request);
                    }
                },
                new com.google.common.base.Function<
                        ListCrossconnectPortSpeedShapesResponse,
                        java.util.List<com.oracle.bmc.core.model.CrossConnectPortSpeedShape>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.CrossConnectPortSpeedShape>
                            apply(ListCrossconnectPortSpeedShapesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDhcpOptions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDhcpOptionsResponse> listDhcpOptionsResponseIterator(
            final ListDhcpOptionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDhcpOptionsRequest.Builder, ListDhcpOptionsRequest, ListDhcpOptionsResponse>(
                new com.google.common.base.Supplier<ListDhcpOptionsRequest.Builder>() {
                    @Override
                    public ListDhcpOptionsRequest.Builder get() {
                        return ListDhcpOptionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDhcpOptionsResponse, String>() {
                    @Override
                    public String apply(ListDhcpOptionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDhcpOptionsRequest.Builder>,
                        ListDhcpOptionsRequest>() {
                    @Override
                    public ListDhcpOptionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDhcpOptionsRequest.Builder>
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
                        ListDhcpOptionsRequest, ListDhcpOptionsResponse>() {
                    @Override
                    public ListDhcpOptionsResponse apply(ListDhcpOptionsRequest request) {
                        return client.listDhcpOptions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.DhcpOptions} objects
     * contained in responses from the listDhcpOptions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.DhcpOptions} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.DhcpOptions> listDhcpOptionsRecordIterator(
            final ListDhcpOptionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDhcpOptionsRequest.Builder, ListDhcpOptionsRequest, ListDhcpOptionsResponse,
                com.oracle.bmc.core.model.DhcpOptions>(
                new com.google.common.base.Supplier<ListDhcpOptionsRequest.Builder>() {
                    @Override
                    public ListDhcpOptionsRequest.Builder get() {
                        return ListDhcpOptionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDhcpOptionsResponse, String>() {
                    @Override
                    public String apply(ListDhcpOptionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDhcpOptionsRequest.Builder>,
                        ListDhcpOptionsRequest>() {
                    @Override
                    public ListDhcpOptionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDhcpOptionsRequest.Builder>
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
                        ListDhcpOptionsRequest, ListDhcpOptionsResponse>() {
                    @Override
                    public ListDhcpOptionsResponse apply(ListDhcpOptionsRequest request) {
                        return client.listDhcpOptions(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDhcpOptionsResponse,
                        java.util.List<com.oracle.bmc.core.model.DhcpOptions>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.DhcpOptions> apply(
                            ListDhcpOptionsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDrgAttachments operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDrgAttachmentsResponse> listDrgAttachmentsResponseIterator(
            final ListDrgAttachmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDrgAttachmentsRequest.Builder, ListDrgAttachmentsRequest,
                ListDrgAttachmentsResponse>(
                new com.google.common.base.Supplier<ListDrgAttachmentsRequest.Builder>() {
                    @Override
                    public ListDrgAttachmentsRequest.Builder get() {
                        return ListDrgAttachmentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDrgAttachmentsResponse, String>() {
                    @Override
                    public String apply(ListDrgAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDrgAttachmentsRequest.Builder>,
                        ListDrgAttachmentsRequest>() {
                    @Override
                    public ListDrgAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDrgAttachmentsRequest.Builder>
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
                        ListDrgAttachmentsRequest, ListDrgAttachmentsResponse>() {
                    @Override
                    public ListDrgAttachmentsResponse apply(ListDrgAttachmentsRequest request) {
                        return client.listDrgAttachments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.DrgAttachment} objects
     * contained in responses from the listDrgAttachments operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.DrgAttachment} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.DrgAttachment> listDrgAttachmentsRecordIterator(
            final ListDrgAttachmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDrgAttachmentsRequest.Builder, ListDrgAttachmentsRequest,
                ListDrgAttachmentsResponse, com.oracle.bmc.core.model.DrgAttachment>(
                new com.google.common.base.Supplier<ListDrgAttachmentsRequest.Builder>() {
                    @Override
                    public ListDrgAttachmentsRequest.Builder get() {
                        return ListDrgAttachmentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDrgAttachmentsResponse, String>() {
                    @Override
                    public String apply(ListDrgAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDrgAttachmentsRequest.Builder>,
                        ListDrgAttachmentsRequest>() {
                    @Override
                    public ListDrgAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDrgAttachmentsRequest.Builder>
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
                        ListDrgAttachmentsRequest, ListDrgAttachmentsResponse>() {
                    @Override
                    public ListDrgAttachmentsResponse apply(ListDrgAttachmentsRequest request) {
                        return client.listDrgAttachments(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDrgAttachmentsResponse,
                        java.util.List<com.oracle.bmc.core.model.DrgAttachment>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.DrgAttachment> apply(
                            ListDrgAttachmentsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDrgs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDrgsResponse> listDrgsResponseIterator(final ListDrgsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDrgsRequest.Builder, ListDrgsRequest, ListDrgsResponse>(
                new com.google.common.base.Supplier<ListDrgsRequest.Builder>() {
                    @Override
                    public ListDrgsRequest.Builder get() {
                        return ListDrgsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDrgsResponse, String>() {
                    @Override
                    public String apply(ListDrgsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDrgsRequest.Builder>,
                        ListDrgsRequest>() {
                    @Override
                    public ListDrgsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDrgsRequest.Builder>
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
                new com.google.common.base.Function<ListDrgsRequest, ListDrgsResponse>() {
                    @Override
                    public ListDrgsResponse apply(ListDrgsRequest request) {
                        return client.listDrgs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.Drg} objects
     * contained in responses from the listDrgs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.Drg} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.Drg> listDrgsRecordIterator(
            final ListDrgsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDrgsRequest.Builder, ListDrgsRequest, ListDrgsResponse,
                com.oracle.bmc.core.model.Drg>(
                new com.google.common.base.Supplier<ListDrgsRequest.Builder>() {
                    @Override
                    public ListDrgsRequest.Builder get() {
                        return ListDrgsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDrgsResponse, String>() {
                    @Override
                    public String apply(ListDrgsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDrgsRequest.Builder>,
                        ListDrgsRequest>() {
                    @Override
                    public ListDrgsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDrgsRequest.Builder>
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
                new com.google.common.base.Function<ListDrgsRequest, ListDrgsResponse>() {
                    @Override
                    public ListDrgsResponse apply(ListDrgsRequest request) {
                        return client.listDrgs(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDrgsResponse, java.util.List<com.oracle.bmc.core.model.Drg>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.Drg> apply(
                            ListDrgsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listFastConnectProviderServices operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListFastConnectProviderServicesResponse>
            listFastConnectProviderServicesResponseIterator(
                    final ListFastConnectProviderServicesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFastConnectProviderServicesRequest.Builder,
                ListFastConnectProviderServicesRequest, ListFastConnectProviderServicesResponse>(
                new com.google.common.base.Supplier<
                        ListFastConnectProviderServicesRequest.Builder>() {
                    @Override
                    public ListFastConnectProviderServicesRequest.Builder get() {
                        return ListFastConnectProviderServicesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListFastConnectProviderServicesResponse, String>() {
                    @Override
                    public String apply(ListFastConnectProviderServicesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFastConnectProviderServicesRequest.Builder>,
                        ListFastConnectProviderServicesRequest>() {
                    @Override
                    public ListFastConnectProviderServicesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFastConnectProviderServicesRequest.Builder>
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
                        ListFastConnectProviderServicesRequest,
                        ListFastConnectProviderServicesResponse>() {
                    @Override
                    public ListFastConnectProviderServicesResponse apply(
                            ListFastConnectProviderServicesRequest request) {
                        return client.listFastConnectProviderServices(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.FastConnectProviderService} objects
     * contained in responses from the listFastConnectProviderServices operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.FastConnectProviderService} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.FastConnectProviderService>
            listFastConnectProviderServicesRecordIterator(
                    final ListFastConnectProviderServicesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFastConnectProviderServicesRequest.Builder,
                ListFastConnectProviderServicesRequest, ListFastConnectProviderServicesResponse,
                com.oracle.bmc.core.model.FastConnectProviderService>(
                new com.google.common.base.Supplier<
                        ListFastConnectProviderServicesRequest.Builder>() {
                    @Override
                    public ListFastConnectProviderServicesRequest.Builder get() {
                        return ListFastConnectProviderServicesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListFastConnectProviderServicesResponse, String>() {
                    @Override
                    public String apply(ListFastConnectProviderServicesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFastConnectProviderServicesRequest.Builder>,
                        ListFastConnectProviderServicesRequest>() {
                    @Override
                    public ListFastConnectProviderServicesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFastConnectProviderServicesRequest.Builder>
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
                        ListFastConnectProviderServicesRequest,
                        ListFastConnectProviderServicesResponse>() {
                    @Override
                    public ListFastConnectProviderServicesResponse apply(
                            ListFastConnectProviderServicesRequest request) {
                        return client.listFastConnectProviderServices(request);
                    }
                },
                new com.google.common.base.Function<
                        ListFastConnectProviderServicesResponse,
                        java.util.List<com.oracle.bmc.core.model.FastConnectProviderService>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.FastConnectProviderService>
                            apply(ListFastConnectProviderServicesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listFastConnectProviderVirtualCircuitBandwidthShapes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListFastConnectProviderVirtualCircuitBandwidthShapesResponse>
            listFastConnectProviderVirtualCircuitBandwidthShapesResponseIterator(
                    final ListFastConnectProviderVirtualCircuitBandwidthShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFastConnectProviderVirtualCircuitBandwidthShapesRequest.Builder,
                ListFastConnectProviderVirtualCircuitBandwidthShapesRequest,
                ListFastConnectProviderVirtualCircuitBandwidthShapesResponse>(
                new com.google.common.base.Supplier<
                        ListFastConnectProviderVirtualCircuitBandwidthShapesRequest.Builder>() {
                    @Override
                    public ListFastConnectProviderVirtualCircuitBandwidthShapesRequest.Builder
                            get() {
                        return ListFastConnectProviderVirtualCircuitBandwidthShapesRequest.builder()
                                .copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListFastConnectProviderVirtualCircuitBandwidthShapesResponse, String>() {
                    @Override
                    public String apply(
                            ListFastConnectProviderVirtualCircuitBandwidthShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFastConnectProviderVirtualCircuitBandwidthShapesRequest
                                        .Builder>,
                        ListFastConnectProviderVirtualCircuitBandwidthShapesRequest>() {
                    @Override
                    public ListFastConnectProviderVirtualCircuitBandwidthShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFastConnectProviderVirtualCircuitBandwidthShapesRequest
                                                    .Builder>
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
                        ListFastConnectProviderVirtualCircuitBandwidthShapesRequest,
                        ListFastConnectProviderVirtualCircuitBandwidthShapesResponse>() {
                    @Override
                    public ListFastConnectProviderVirtualCircuitBandwidthShapesResponse apply(
                            ListFastConnectProviderVirtualCircuitBandwidthShapesRequest request) {
                        return client.listFastConnectProviderVirtualCircuitBandwidthShapes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.VirtualCircuitBandwidthShape} objects
     * contained in responses from the listFastConnectProviderVirtualCircuitBandwidthShapes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.VirtualCircuitBandwidthShape} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.VirtualCircuitBandwidthShape>
            listFastConnectProviderVirtualCircuitBandwidthShapesRecordIterator(
                    final ListFastConnectProviderVirtualCircuitBandwidthShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFastConnectProviderVirtualCircuitBandwidthShapesRequest.Builder,
                ListFastConnectProviderVirtualCircuitBandwidthShapesRequest,
                ListFastConnectProviderVirtualCircuitBandwidthShapesResponse,
                com.oracle.bmc.core.model.VirtualCircuitBandwidthShape>(
                new com.google.common.base.Supplier<
                        ListFastConnectProviderVirtualCircuitBandwidthShapesRequest.Builder>() {
                    @Override
                    public ListFastConnectProviderVirtualCircuitBandwidthShapesRequest.Builder
                            get() {
                        return ListFastConnectProviderVirtualCircuitBandwidthShapesRequest.builder()
                                .copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListFastConnectProviderVirtualCircuitBandwidthShapesResponse, String>() {
                    @Override
                    public String apply(
                            ListFastConnectProviderVirtualCircuitBandwidthShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFastConnectProviderVirtualCircuitBandwidthShapesRequest
                                        .Builder>,
                        ListFastConnectProviderVirtualCircuitBandwidthShapesRequest>() {
                    @Override
                    public ListFastConnectProviderVirtualCircuitBandwidthShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFastConnectProviderVirtualCircuitBandwidthShapesRequest
                                                    .Builder>
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
                        ListFastConnectProviderVirtualCircuitBandwidthShapesRequest,
                        ListFastConnectProviderVirtualCircuitBandwidthShapesResponse>() {
                    @Override
                    public ListFastConnectProviderVirtualCircuitBandwidthShapesResponse apply(
                            ListFastConnectProviderVirtualCircuitBandwidthShapesRequest request) {
                        return client.listFastConnectProviderVirtualCircuitBandwidthShapes(request);
                    }
                },
                new com.google.common.base.Function<
                        ListFastConnectProviderVirtualCircuitBandwidthShapesResponse,
                        java.util.List<com.oracle.bmc.core.model.VirtualCircuitBandwidthShape>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.VirtualCircuitBandwidthShape>
                            apply(
                                    ListFastConnectProviderVirtualCircuitBandwidthShapesResponse
                                            response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listIPSecConnectionTunnels operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListIPSecConnectionTunnelsResponse> listIPSecConnectionTunnelsResponseIterator(
            final ListIPSecConnectionTunnelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListIPSecConnectionTunnelsRequest.Builder, ListIPSecConnectionTunnelsRequest,
                ListIPSecConnectionTunnelsResponse>(
                new com.google.common.base.Supplier<ListIPSecConnectionTunnelsRequest.Builder>() {
                    @Override
                    public ListIPSecConnectionTunnelsRequest.Builder get() {
                        return ListIPSecConnectionTunnelsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListIPSecConnectionTunnelsResponse, String>() {
                    @Override
                    public String apply(ListIPSecConnectionTunnelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIPSecConnectionTunnelsRequest.Builder>,
                        ListIPSecConnectionTunnelsRequest>() {
                    @Override
                    public ListIPSecConnectionTunnelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIPSecConnectionTunnelsRequest.Builder>
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
                        ListIPSecConnectionTunnelsRequest, ListIPSecConnectionTunnelsResponse>() {
                    @Override
                    public ListIPSecConnectionTunnelsResponse apply(
                            ListIPSecConnectionTunnelsRequest request) {
                        return client.listIPSecConnectionTunnels(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.IPSecConnectionTunnel} objects
     * contained in responses from the listIPSecConnectionTunnels operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.IPSecConnectionTunnel} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.IPSecConnectionTunnel>
            listIPSecConnectionTunnelsRecordIterator(
                    final ListIPSecConnectionTunnelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListIPSecConnectionTunnelsRequest.Builder, ListIPSecConnectionTunnelsRequest,
                ListIPSecConnectionTunnelsResponse,
                com.oracle.bmc.core.model.IPSecConnectionTunnel>(
                new com.google.common.base.Supplier<ListIPSecConnectionTunnelsRequest.Builder>() {
                    @Override
                    public ListIPSecConnectionTunnelsRequest.Builder get() {
                        return ListIPSecConnectionTunnelsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListIPSecConnectionTunnelsResponse, String>() {
                    @Override
                    public String apply(ListIPSecConnectionTunnelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIPSecConnectionTunnelsRequest.Builder>,
                        ListIPSecConnectionTunnelsRequest>() {
                    @Override
                    public ListIPSecConnectionTunnelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIPSecConnectionTunnelsRequest.Builder>
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
                        ListIPSecConnectionTunnelsRequest, ListIPSecConnectionTunnelsResponse>() {
                    @Override
                    public ListIPSecConnectionTunnelsResponse apply(
                            ListIPSecConnectionTunnelsRequest request) {
                        return client.listIPSecConnectionTunnels(request);
                    }
                },
                new com.google.common.base.Function<
                        ListIPSecConnectionTunnelsResponse,
                        java.util.List<com.oracle.bmc.core.model.IPSecConnectionTunnel>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.IPSecConnectionTunnel> apply(
                            ListIPSecConnectionTunnelsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listIPSecConnections operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListIPSecConnectionsResponse> listIPSecConnectionsResponseIterator(
            final ListIPSecConnectionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListIPSecConnectionsRequest.Builder, ListIPSecConnectionsRequest,
                ListIPSecConnectionsResponse>(
                new com.google.common.base.Supplier<ListIPSecConnectionsRequest.Builder>() {
                    @Override
                    public ListIPSecConnectionsRequest.Builder get() {
                        return ListIPSecConnectionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListIPSecConnectionsResponse, String>() {
                    @Override
                    public String apply(ListIPSecConnectionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIPSecConnectionsRequest.Builder>,
                        ListIPSecConnectionsRequest>() {
                    @Override
                    public ListIPSecConnectionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIPSecConnectionsRequest.Builder>
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
                        ListIPSecConnectionsRequest, ListIPSecConnectionsResponse>() {
                    @Override
                    public ListIPSecConnectionsResponse apply(ListIPSecConnectionsRequest request) {
                        return client.listIPSecConnections(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.IPSecConnection} objects
     * contained in responses from the listIPSecConnections operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.IPSecConnection} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.IPSecConnection> listIPSecConnectionsRecordIterator(
            final ListIPSecConnectionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListIPSecConnectionsRequest.Builder, ListIPSecConnectionsRequest,
                ListIPSecConnectionsResponse, com.oracle.bmc.core.model.IPSecConnection>(
                new com.google.common.base.Supplier<ListIPSecConnectionsRequest.Builder>() {
                    @Override
                    public ListIPSecConnectionsRequest.Builder get() {
                        return ListIPSecConnectionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListIPSecConnectionsResponse, String>() {
                    @Override
                    public String apply(ListIPSecConnectionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIPSecConnectionsRequest.Builder>,
                        ListIPSecConnectionsRequest>() {
                    @Override
                    public ListIPSecConnectionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIPSecConnectionsRequest.Builder>
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
                        ListIPSecConnectionsRequest, ListIPSecConnectionsResponse>() {
                    @Override
                    public ListIPSecConnectionsResponse apply(ListIPSecConnectionsRequest request) {
                        return client.listIPSecConnections(request);
                    }
                },
                new com.google.common.base.Function<
                        ListIPSecConnectionsResponse,
                        java.util.List<com.oracle.bmc.core.model.IPSecConnection>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.IPSecConnection> apply(
                            ListIPSecConnectionsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listInternetGateways operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListInternetGatewaysResponse> listInternetGatewaysResponseIterator(
            final ListInternetGatewaysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListInternetGatewaysRequest.Builder, ListInternetGatewaysRequest,
                ListInternetGatewaysResponse>(
                new com.google.common.base.Supplier<ListInternetGatewaysRequest.Builder>() {
                    @Override
                    public ListInternetGatewaysRequest.Builder get() {
                        return ListInternetGatewaysRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListInternetGatewaysResponse, String>() {
                    @Override
                    public String apply(ListInternetGatewaysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInternetGatewaysRequest.Builder>,
                        ListInternetGatewaysRequest>() {
                    @Override
                    public ListInternetGatewaysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInternetGatewaysRequest.Builder>
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
                        ListInternetGatewaysRequest, ListInternetGatewaysResponse>() {
                    @Override
                    public ListInternetGatewaysResponse apply(ListInternetGatewaysRequest request) {
                        return client.listInternetGateways(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.InternetGateway} objects
     * contained in responses from the listInternetGateways operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.InternetGateway} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.InternetGateway> listInternetGatewaysRecordIterator(
            final ListInternetGatewaysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListInternetGatewaysRequest.Builder, ListInternetGatewaysRequest,
                ListInternetGatewaysResponse, com.oracle.bmc.core.model.InternetGateway>(
                new com.google.common.base.Supplier<ListInternetGatewaysRequest.Builder>() {
                    @Override
                    public ListInternetGatewaysRequest.Builder get() {
                        return ListInternetGatewaysRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListInternetGatewaysResponse, String>() {
                    @Override
                    public String apply(ListInternetGatewaysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInternetGatewaysRequest.Builder>,
                        ListInternetGatewaysRequest>() {
                    @Override
                    public ListInternetGatewaysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInternetGatewaysRequest.Builder>
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
                        ListInternetGatewaysRequest, ListInternetGatewaysResponse>() {
                    @Override
                    public ListInternetGatewaysResponse apply(ListInternetGatewaysRequest request) {
                        return client.listInternetGateways(request);
                    }
                },
                new com.google.common.base.Function<
                        ListInternetGatewaysResponse,
                        java.util.List<com.oracle.bmc.core.model.InternetGateway>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.InternetGateway> apply(
                            ListInternetGatewaysResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listLocalPeeringGateways operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListLocalPeeringGatewaysResponse> listLocalPeeringGatewaysResponseIterator(
            final ListLocalPeeringGatewaysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLocalPeeringGatewaysRequest.Builder, ListLocalPeeringGatewaysRequest,
                ListLocalPeeringGatewaysResponse>(
                new com.google.common.base.Supplier<ListLocalPeeringGatewaysRequest.Builder>() {
                    @Override
                    public ListLocalPeeringGatewaysRequest.Builder get() {
                        return ListLocalPeeringGatewaysRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLocalPeeringGatewaysResponse, String>() {
                    @Override
                    public String apply(ListLocalPeeringGatewaysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLocalPeeringGatewaysRequest.Builder>,
                        ListLocalPeeringGatewaysRequest>() {
                    @Override
                    public ListLocalPeeringGatewaysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLocalPeeringGatewaysRequest.Builder>
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
                        ListLocalPeeringGatewaysRequest, ListLocalPeeringGatewaysResponse>() {
                    @Override
                    public ListLocalPeeringGatewaysResponse apply(
                            ListLocalPeeringGatewaysRequest request) {
                        return client.listLocalPeeringGateways(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.LocalPeeringGateway} objects
     * contained in responses from the listLocalPeeringGateways operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.LocalPeeringGateway} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.LocalPeeringGateway>
            listLocalPeeringGatewaysRecordIterator(final ListLocalPeeringGatewaysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLocalPeeringGatewaysRequest.Builder, ListLocalPeeringGatewaysRequest,
                ListLocalPeeringGatewaysResponse, com.oracle.bmc.core.model.LocalPeeringGateway>(
                new com.google.common.base.Supplier<ListLocalPeeringGatewaysRequest.Builder>() {
                    @Override
                    public ListLocalPeeringGatewaysRequest.Builder get() {
                        return ListLocalPeeringGatewaysRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLocalPeeringGatewaysResponse, String>() {
                    @Override
                    public String apply(ListLocalPeeringGatewaysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLocalPeeringGatewaysRequest.Builder>,
                        ListLocalPeeringGatewaysRequest>() {
                    @Override
                    public ListLocalPeeringGatewaysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLocalPeeringGatewaysRequest.Builder>
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
                        ListLocalPeeringGatewaysRequest, ListLocalPeeringGatewaysResponse>() {
                    @Override
                    public ListLocalPeeringGatewaysResponse apply(
                            ListLocalPeeringGatewaysRequest request) {
                        return client.listLocalPeeringGateways(request);
                    }
                },
                new com.google.common.base.Function<
                        ListLocalPeeringGatewaysResponse,
                        java.util.List<com.oracle.bmc.core.model.LocalPeeringGateway>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.LocalPeeringGateway> apply(
                            ListLocalPeeringGatewaysResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listNatGateways operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListNatGatewaysResponse> listNatGatewaysResponseIterator(
            final ListNatGatewaysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListNatGatewaysRequest.Builder, ListNatGatewaysRequest, ListNatGatewaysResponse>(
                new com.google.common.base.Supplier<ListNatGatewaysRequest.Builder>() {
                    @Override
                    public ListNatGatewaysRequest.Builder get() {
                        return ListNatGatewaysRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListNatGatewaysResponse, String>() {
                    @Override
                    public String apply(ListNatGatewaysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNatGatewaysRequest.Builder>,
                        ListNatGatewaysRequest>() {
                    @Override
                    public ListNatGatewaysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNatGatewaysRequest.Builder>
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
                        ListNatGatewaysRequest, ListNatGatewaysResponse>() {
                    @Override
                    public ListNatGatewaysResponse apply(ListNatGatewaysRequest request) {
                        return client.listNatGateways(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.NatGateway} objects
     * contained in responses from the listNatGateways operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.NatGateway} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.NatGateway> listNatGatewaysRecordIterator(
            final ListNatGatewaysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListNatGatewaysRequest.Builder, ListNatGatewaysRequest, ListNatGatewaysResponse,
                com.oracle.bmc.core.model.NatGateway>(
                new com.google.common.base.Supplier<ListNatGatewaysRequest.Builder>() {
                    @Override
                    public ListNatGatewaysRequest.Builder get() {
                        return ListNatGatewaysRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListNatGatewaysResponse, String>() {
                    @Override
                    public String apply(ListNatGatewaysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNatGatewaysRequest.Builder>,
                        ListNatGatewaysRequest>() {
                    @Override
                    public ListNatGatewaysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNatGatewaysRequest.Builder>
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
                        ListNatGatewaysRequest, ListNatGatewaysResponse>() {
                    @Override
                    public ListNatGatewaysResponse apply(ListNatGatewaysRequest request) {
                        return client.listNatGateways(request);
                    }
                },
                new com.google.common.base.Function<
                        ListNatGatewaysResponse,
                        java.util.List<com.oracle.bmc.core.model.NatGateway>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.NatGateway> apply(
                            ListNatGatewaysResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listNetworkSecurityGroupSecurityRules operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListNetworkSecurityGroupSecurityRulesResponse>
            listNetworkSecurityGroupSecurityRulesResponseIterator(
                    final ListNetworkSecurityGroupSecurityRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListNetworkSecurityGroupSecurityRulesRequest.Builder,
                ListNetworkSecurityGroupSecurityRulesRequest,
                ListNetworkSecurityGroupSecurityRulesResponse>(
                new com.google.common.base.Supplier<
                        ListNetworkSecurityGroupSecurityRulesRequest.Builder>() {
                    @Override
                    public ListNetworkSecurityGroupSecurityRulesRequest.Builder get() {
                        return ListNetworkSecurityGroupSecurityRulesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListNetworkSecurityGroupSecurityRulesResponse, String>() {
                    @Override
                    public String apply(ListNetworkSecurityGroupSecurityRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNetworkSecurityGroupSecurityRulesRequest.Builder>,
                        ListNetworkSecurityGroupSecurityRulesRequest>() {
                    @Override
                    public ListNetworkSecurityGroupSecurityRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNetworkSecurityGroupSecurityRulesRequest.Builder>
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
                        ListNetworkSecurityGroupSecurityRulesRequest,
                        ListNetworkSecurityGroupSecurityRulesResponse>() {
                    @Override
                    public ListNetworkSecurityGroupSecurityRulesResponse apply(
                            ListNetworkSecurityGroupSecurityRulesRequest request) {
                        return client.listNetworkSecurityGroupSecurityRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.SecurityRule} objects
     * contained in responses from the listNetworkSecurityGroupSecurityRules operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.SecurityRule} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.SecurityRule>
            listNetworkSecurityGroupSecurityRulesRecordIterator(
                    final ListNetworkSecurityGroupSecurityRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListNetworkSecurityGroupSecurityRulesRequest.Builder,
                ListNetworkSecurityGroupSecurityRulesRequest,
                ListNetworkSecurityGroupSecurityRulesResponse,
                com.oracle.bmc.core.model.SecurityRule>(
                new com.google.common.base.Supplier<
                        ListNetworkSecurityGroupSecurityRulesRequest.Builder>() {
                    @Override
                    public ListNetworkSecurityGroupSecurityRulesRequest.Builder get() {
                        return ListNetworkSecurityGroupSecurityRulesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListNetworkSecurityGroupSecurityRulesResponse, String>() {
                    @Override
                    public String apply(ListNetworkSecurityGroupSecurityRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNetworkSecurityGroupSecurityRulesRequest.Builder>,
                        ListNetworkSecurityGroupSecurityRulesRequest>() {
                    @Override
                    public ListNetworkSecurityGroupSecurityRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNetworkSecurityGroupSecurityRulesRequest.Builder>
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
                        ListNetworkSecurityGroupSecurityRulesRequest,
                        ListNetworkSecurityGroupSecurityRulesResponse>() {
                    @Override
                    public ListNetworkSecurityGroupSecurityRulesResponse apply(
                            ListNetworkSecurityGroupSecurityRulesRequest request) {
                        return client.listNetworkSecurityGroupSecurityRules(request);
                    }
                },
                new com.google.common.base.Function<
                        ListNetworkSecurityGroupSecurityRulesResponse,
                        java.util.List<com.oracle.bmc.core.model.SecurityRule>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.SecurityRule> apply(
                            ListNetworkSecurityGroupSecurityRulesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listNetworkSecurityGroupVnics operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListNetworkSecurityGroupVnicsResponse>
            listNetworkSecurityGroupVnicsResponseIterator(
                    final ListNetworkSecurityGroupVnicsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListNetworkSecurityGroupVnicsRequest.Builder, ListNetworkSecurityGroupVnicsRequest,
                ListNetworkSecurityGroupVnicsResponse>(
                new com.google.common.base.Supplier<
                        ListNetworkSecurityGroupVnicsRequest.Builder>() {
                    @Override
                    public ListNetworkSecurityGroupVnicsRequest.Builder get() {
                        return ListNetworkSecurityGroupVnicsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListNetworkSecurityGroupVnicsResponse, String>() {
                    @Override
                    public String apply(ListNetworkSecurityGroupVnicsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNetworkSecurityGroupVnicsRequest.Builder>,
                        ListNetworkSecurityGroupVnicsRequest>() {
                    @Override
                    public ListNetworkSecurityGroupVnicsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNetworkSecurityGroupVnicsRequest.Builder>
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
                        ListNetworkSecurityGroupVnicsRequest,
                        ListNetworkSecurityGroupVnicsResponse>() {
                    @Override
                    public ListNetworkSecurityGroupVnicsResponse apply(
                            ListNetworkSecurityGroupVnicsRequest request) {
                        return client.listNetworkSecurityGroupVnics(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.NetworkSecurityGroupVnic} objects
     * contained in responses from the listNetworkSecurityGroupVnics operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.NetworkSecurityGroupVnic} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.NetworkSecurityGroupVnic>
            listNetworkSecurityGroupVnicsRecordIterator(
                    final ListNetworkSecurityGroupVnicsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListNetworkSecurityGroupVnicsRequest.Builder, ListNetworkSecurityGroupVnicsRequest,
                ListNetworkSecurityGroupVnicsResponse,
                com.oracle.bmc.core.model.NetworkSecurityGroupVnic>(
                new com.google.common.base.Supplier<
                        ListNetworkSecurityGroupVnicsRequest.Builder>() {
                    @Override
                    public ListNetworkSecurityGroupVnicsRequest.Builder get() {
                        return ListNetworkSecurityGroupVnicsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListNetworkSecurityGroupVnicsResponse, String>() {
                    @Override
                    public String apply(ListNetworkSecurityGroupVnicsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNetworkSecurityGroupVnicsRequest.Builder>,
                        ListNetworkSecurityGroupVnicsRequest>() {
                    @Override
                    public ListNetworkSecurityGroupVnicsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNetworkSecurityGroupVnicsRequest.Builder>
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
                        ListNetworkSecurityGroupVnicsRequest,
                        ListNetworkSecurityGroupVnicsResponse>() {
                    @Override
                    public ListNetworkSecurityGroupVnicsResponse apply(
                            ListNetworkSecurityGroupVnicsRequest request) {
                        return client.listNetworkSecurityGroupVnics(request);
                    }
                },
                new com.google.common.base.Function<
                        ListNetworkSecurityGroupVnicsResponse,
                        java.util.List<com.oracle.bmc.core.model.NetworkSecurityGroupVnic>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.NetworkSecurityGroupVnic> apply(
                            ListNetworkSecurityGroupVnicsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listNetworkSecurityGroups operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListNetworkSecurityGroupsResponse> listNetworkSecurityGroupsResponseIterator(
            final ListNetworkSecurityGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListNetworkSecurityGroupsRequest.Builder, ListNetworkSecurityGroupsRequest,
                ListNetworkSecurityGroupsResponse>(
                new com.google.common.base.Supplier<ListNetworkSecurityGroupsRequest.Builder>() {
                    @Override
                    public ListNetworkSecurityGroupsRequest.Builder get() {
                        return ListNetworkSecurityGroupsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListNetworkSecurityGroupsResponse, String>() {
                    @Override
                    public String apply(ListNetworkSecurityGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNetworkSecurityGroupsRequest.Builder>,
                        ListNetworkSecurityGroupsRequest>() {
                    @Override
                    public ListNetworkSecurityGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNetworkSecurityGroupsRequest.Builder>
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
                        ListNetworkSecurityGroupsRequest, ListNetworkSecurityGroupsResponse>() {
                    @Override
                    public ListNetworkSecurityGroupsResponse apply(
                            ListNetworkSecurityGroupsRequest request) {
                        return client.listNetworkSecurityGroups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.NetworkSecurityGroup} objects
     * contained in responses from the listNetworkSecurityGroups operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.NetworkSecurityGroup} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.NetworkSecurityGroup>
            listNetworkSecurityGroupsRecordIterator(
                    final ListNetworkSecurityGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListNetworkSecurityGroupsRequest.Builder, ListNetworkSecurityGroupsRequest,
                ListNetworkSecurityGroupsResponse, com.oracle.bmc.core.model.NetworkSecurityGroup>(
                new com.google.common.base.Supplier<ListNetworkSecurityGroupsRequest.Builder>() {
                    @Override
                    public ListNetworkSecurityGroupsRequest.Builder get() {
                        return ListNetworkSecurityGroupsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListNetworkSecurityGroupsResponse, String>() {
                    @Override
                    public String apply(ListNetworkSecurityGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNetworkSecurityGroupsRequest.Builder>,
                        ListNetworkSecurityGroupsRequest>() {
                    @Override
                    public ListNetworkSecurityGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNetworkSecurityGroupsRequest.Builder>
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
                        ListNetworkSecurityGroupsRequest, ListNetworkSecurityGroupsResponse>() {
                    @Override
                    public ListNetworkSecurityGroupsResponse apply(
                            ListNetworkSecurityGroupsRequest request) {
                        return client.listNetworkSecurityGroups(request);
                    }
                },
                new com.google.common.base.Function<
                        ListNetworkSecurityGroupsResponse,
                        java.util.List<com.oracle.bmc.core.model.NetworkSecurityGroup>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.NetworkSecurityGroup> apply(
                            ListNetworkSecurityGroupsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listPrivateIps operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListPrivateIpsResponse> listPrivateIpsResponseIterator(
            final ListPrivateIpsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPrivateIpsRequest.Builder, ListPrivateIpsRequest, ListPrivateIpsResponse>(
                new com.google.common.base.Supplier<ListPrivateIpsRequest.Builder>() {
                    @Override
                    public ListPrivateIpsRequest.Builder get() {
                        return ListPrivateIpsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListPrivateIpsResponse, String>() {
                    @Override
                    public String apply(ListPrivateIpsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPrivateIpsRequest.Builder>,
                        ListPrivateIpsRequest>() {
                    @Override
                    public ListPrivateIpsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPrivateIpsRequest.Builder>
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
                        ListPrivateIpsRequest, ListPrivateIpsResponse>() {
                    @Override
                    public ListPrivateIpsResponse apply(ListPrivateIpsRequest request) {
                        return client.listPrivateIps(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.PrivateIp} objects
     * contained in responses from the listPrivateIps operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.PrivateIp} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.PrivateIp> listPrivateIpsRecordIterator(
            final ListPrivateIpsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPrivateIpsRequest.Builder, ListPrivateIpsRequest, ListPrivateIpsResponse,
                com.oracle.bmc.core.model.PrivateIp>(
                new com.google.common.base.Supplier<ListPrivateIpsRequest.Builder>() {
                    @Override
                    public ListPrivateIpsRequest.Builder get() {
                        return ListPrivateIpsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListPrivateIpsResponse, String>() {
                    @Override
                    public String apply(ListPrivateIpsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPrivateIpsRequest.Builder>,
                        ListPrivateIpsRequest>() {
                    @Override
                    public ListPrivateIpsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPrivateIpsRequest.Builder>
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
                        ListPrivateIpsRequest, ListPrivateIpsResponse>() {
                    @Override
                    public ListPrivateIpsResponse apply(ListPrivateIpsRequest request) {
                        return client.listPrivateIps(request);
                    }
                },
                new com.google.common.base.Function<
                        ListPrivateIpsResponse,
                        java.util.List<com.oracle.bmc.core.model.PrivateIp>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.PrivateIp> apply(
                            ListPrivateIpsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listPublicIps operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListPublicIpsResponse> listPublicIpsResponseIterator(
            final ListPublicIpsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPublicIpsRequest.Builder, ListPublicIpsRequest, ListPublicIpsResponse>(
                new com.google.common.base.Supplier<ListPublicIpsRequest.Builder>() {
                    @Override
                    public ListPublicIpsRequest.Builder get() {
                        return ListPublicIpsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListPublicIpsResponse, String>() {
                    @Override
                    public String apply(ListPublicIpsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPublicIpsRequest.Builder>,
                        ListPublicIpsRequest>() {
                    @Override
                    public ListPublicIpsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPublicIpsRequest.Builder>
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
                new com.google.common.base.Function<ListPublicIpsRequest, ListPublicIpsResponse>() {
                    @Override
                    public ListPublicIpsResponse apply(ListPublicIpsRequest request) {
                        return client.listPublicIps(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.PublicIp} objects
     * contained in responses from the listPublicIps operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.PublicIp} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.PublicIp> listPublicIpsRecordIterator(
            final ListPublicIpsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPublicIpsRequest.Builder, ListPublicIpsRequest, ListPublicIpsResponse,
                com.oracle.bmc.core.model.PublicIp>(
                new com.google.common.base.Supplier<ListPublicIpsRequest.Builder>() {
                    @Override
                    public ListPublicIpsRequest.Builder get() {
                        return ListPublicIpsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListPublicIpsResponse, String>() {
                    @Override
                    public String apply(ListPublicIpsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPublicIpsRequest.Builder>,
                        ListPublicIpsRequest>() {
                    @Override
                    public ListPublicIpsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPublicIpsRequest.Builder>
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
                new com.google.common.base.Function<ListPublicIpsRequest, ListPublicIpsResponse>() {
                    @Override
                    public ListPublicIpsResponse apply(ListPublicIpsRequest request) {
                        return client.listPublicIps(request);
                    }
                },
                new com.google.common.base.Function<
                        ListPublicIpsResponse,
                        java.util.List<com.oracle.bmc.core.model.PublicIp>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.PublicIp> apply(
                            ListPublicIpsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listRemotePeeringConnections operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListRemotePeeringConnectionsResponse>
            listRemotePeeringConnectionsResponseIterator(
                    final ListRemotePeeringConnectionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRemotePeeringConnectionsRequest.Builder, ListRemotePeeringConnectionsRequest,
                ListRemotePeeringConnectionsResponse>(
                new com.google.common.base.Supplier<ListRemotePeeringConnectionsRequest.Builder>() {
                    @Override
                    public ListRemotePeeringConnectionsRequest.Builder get() {
                        return ListRemotePeeringConnectionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListRemotePeeringConnectionsResponse, String>() {
                    @Override
                    public String apply(ListRemotePeeringConnectionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRemotePeeringConnectionsRequest.Builder>,
                        ListRemotePeeringConnectionsRequest>() {
                    @Override
                    public ListRemotePeeringConnectionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRemotePeeringConnectionsRequest.Builder>
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
                        ListRemotePeeringConnectionsRequest,
                        ListRemotePeeringConnectionsResponse>() {
                    @Override
                    public ListRemotePeeringConnectionsResponse apply(
                            ListRemotePeeringConnectionsRequest request) {
                        return client.listRemotePeeringConnections(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.RemotePeeringConnection} objects
     * contained in responses from the listRemotePeeringConnections operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.RemotePeeringConnection} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.RemotePeeringConnection>
            listRemotePeeringConnectionsRecordIterator(
                    final ListRemotePeeringConnectionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRemotePeeringConnectionsRequest.Builder, ListRemotePeeringConnectionsRequest,
                ListRemotePeeringConnectionsResponse,
                com.oracle.bmc.core.model.RemotePeeringConnection>(
                new com.google.common.base.Supplier<ListRemotePeeringConnectionsRequest.Builder>() {
                    @Override
                    public ListRemotePeeringConnectionsRequest.Builder get() {
                        return ListRemotePeeringConnectionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListRemotePeeringConnectionsResponse, String>() {
                    @Override
                    public String apply(ListRemotePeeringConnectionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRemotePeeringConnectionsRequest.Builder>,
                        ListRemotePeeringConnectionsRequest>() {
                    @Override
                    public ListRemotePeeringConnectionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRemotePeeringConnectionsRequest.Builder>
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
                        ListRemotePeeringConnectionsRequest,
                        ListRemotePeeringConnectionsResponse>() {
                    @Override
                    public ListRemotePeeringConnectionsResponse apply(
                            ListRemotePeeringConnectionsRequest request) {
                        return client.listRemotePeeringConnections(request);
                    }
                },
                new com.google.common.base.Function<
                        ListRemotePeeringConnectionsResponse,
                        java.util.List<com.oracle.bmc.core.model.RemotePeeringConnection>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.RemotePeeringConnection> apply(
                            ListRemotePeeringConnectionsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listRouteTables operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListRouteTablesResponse> listRouteTablesResponseIterator(
            final ListRouteTablesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRouteTablesRequest.Builder, ListRouteTablesRequest, ListRouteTablesResponse>(
                new com.google.common.base.Supplier<ListRouteTablesRequest.Builder>() {
                    @Override
                    public ListRouteTablesRequest.Builder get() {
                        return ListRouteTablesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListRouteTablesResponse, String>() {
                    @Override
                    public String apply(ListRouteTablesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRouteTablesRequest.Builder>,
                        ListRouteTablesRequest>() {
                    @Override
                    public ListRouteTablesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRouteTablesRequest.Builder>
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
                        ListRouteTablesRequest, ListRouteTablesResponse>() {
                    @Override
                    public ListRouteTablesResponse apply(ListRouteTablesRequest request) {
                        return client.listRouteTables(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.RouteTable} objects
     * contained in responses from the listRouteTables operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.RouteTable} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.RouteTable> listRouteTablesRecordIterator(
            final ListRouteTablesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRouteTablesRequest.Builder, ListRouteTablesRequest, ListRouteTablesResponse,
                com.oracle.bmc.core.model.RouteTable>(
                new com.google.common.base.Supplier<ListRouteTablesRequest.Builder>() {
                    @Override
                    public ListRouteTablesRequest.Builder get() {
                        return ListRouteTablesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListRouteTablesResponse, String>() {
                    @Override
                    public String apply(ListRouteTablesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRouteTablesRequest.Builder>,
                        ListRouteTablesRequest>() {
                    @Override
                    public ListRouteTablesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRouteTablesRequest.Builder>
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
                        ListRouteTablesRequest, ListRouteTablesResponse>() {
                    @Override
                    public ListRouteTablesResponse apply(ListRouteTablesRequest request) {
                        return client.listRouteTables(request);
                    }
                },
                new com.google.common.base.Function<
                        ListRouteTablesResponse,
                        java.util.List<com.oracle.bmc.core.model.RouteTable>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.RouteTable> apply(
                            ListRouteTablesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSecurityLists operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSecurityListsResponse> listSecurityListsResponseIterator(
            final ListSecurityListsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSecurityListsRequest.Builder, ListSecurityListsRequest,
                ListSecurityListsResponse>(
                new com.google.common.base.Supplier<ListSecurityListsRequest.Builder>() {
                    @Override
                    public ListSecurityListsRequest.Builder get() {
                        return ListSecurityListsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSecurityListsResponse, String>() {
                    @Override
                    public String apply(ListSecurityListsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityListsRequest.Builder>,
                        ListSecurityListsRequest>() {
                    @Override
                    public ListSecurityListsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityListsRequest.Builder>
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
                        ListSecurityListsRequest, ListSecurityListsResponse>() {
                    @Override
                    public ListSecurityListsResponse apply(ListSecurityListsRequest request) {
                        return client.listSecurityLists(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.SecurityList} objects
     * contained in responses from the listSecurityLists operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.SecurityList} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.SecurityList> listSecurityListsRecordIterator(
            final ListSecurityListsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSecurityListsRequest.Builder, ListSecurityListsRequest,
                ListSecurityListsResponse, com.oracle.bmc.core.model.SecurityList>(
                new com.google.common.base.Supplier<ListSecurityListsRequest.Builder>() {
                    @Override
                    public ListSecurityListsRequest.Builder get() {
                        return ListSecurityListsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSecurityListsResponse, String>() {
                    @Override
                    public String apply(ListSecurityListsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityListsRequest.Builder>,
                        ListSecurityListsRequest>() {
                    @Override
                    public ListSecurityListsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityListsRequest.Builder>
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
                        ListSecurityListsRequest, ListSecurityListsResponse>() {
                    @Override
                    public ListSecurityListsResponse apply(ListSecurityListsRequest request) {
                        return client.listSecurityLists(request);
                    }
                },
                new com.google.common.base.Function<
                        ListSecurityListsResponse,
                        java.util.List<com.oracle.bmc.core.model.SecurityList>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.SecurityList> apply(
                            ListSecurityListsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listServiceGateways operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListServiceGatewaysResponse> listServiceGatewaysResponseIterator(
            final ListServiceGatewaysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListServiceGatewaysRequest.Builder, ListServiceGatewaysRequest,
                ListServiceGatewaysResponse>(
                new com.google.common.base.Supplier<ListServiceGatewaysRequest.Builder>() {
                    @Override
                    public ListServiceGatewaysRequest.Builder get() {
                        return ListServiceGatewaysRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListServiceGatewaysResponse, String>() {
                    @Override
                    public String apply(ListServiceGatewaysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListServiceGatewaysRequest.Builder>,
                        ListServiceGatewaysRequest>() {
                    @Override
                    public ListServiceGatewaysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListServiceGatewaysRequest.Builder>
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
                        ListServiceGatewaysRequest, ListServiceGatewaysResponse>() {
                    @Override
                    public ListServiceGatewaysResponse apply(ListServiceGatewaysRequest request) {
                        return client.listServiceGateways(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.ServiceGateway} objects
     * contained in responses from the listServiceGateways operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.ServiceGateway} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.ServiceGateway> listServiceGatewaysRecordIterator(
            final ListServiceGatewaysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListServiceGatewaysRequest.Builder, ListServiceGatewaysRequest,
                ListServiceGatewaysResponse, com.oracle.bmc.core.model.ServiceGateway>(
                new com.google.common.base.Supplier<ListServiceGatewaysRequest.Builder>() {
                    @Override
                    public ListServiceGatewaysRequest.Builder get() {
                        return ListServiceGatewaysRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListServiceGatewaysResponse, String>() {
                    @Override
                    public String apply(ListServiceGatewaysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListServiceGatewaysRequest.Builder>,
                        ListServiceGatewaysRequest>() {
                    @Override
                    public ListServiceGatewaysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListServiceGatewaysRequest.Builder>
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
                        ListServiceGatewaysRequest, ListServiceGatewaysResponse>() {
                    @Override
                    public ListServiceGatewaysResponse apply(ListServiceGatewaysRequest request) {
                        return client.listServiceGateways(request);
                    }
                },
                new com.google.common.base.Function<
                        ListServiceGatewaysResponse,
                        java.util.List<com.oracle.bmc.core.model.ServiceGateway>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.ServiceGateway> apply(
                            ListServiceGatewaysResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listServices operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListServicesResponse> listServicesResponseIterator(
            final ListServicesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListServicesRequest.Builder, ListServicesRequest, ListServicesResponse>(
                new com.google.common.base.Supplier<ListServicesRequest.Builder>() {
                    @Override
                    public ListServicesRequest.Builder get() {
                        return ListServicesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListServicesResponse, String>() {
                    @Override
                    public String apply(ListServicesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListServicesRequest.Builder>,
                        ListServicesRequest>() {
                    @Override
                    public ListServicesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListServicesRequest.Builder>
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
                new com.google.common.base.Function<ListServicesRequest, ListServicesResponse>() {
                    @Override
                    public ListServicesResponse apply(ListServicesRequest request) {
                        return client.listServices(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.Service} objects
     * contained in responses from the listServices operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.Service} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.Service> listServicesRecordIterator(
            final ListServicesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListServicesRequest.Builder, ListServicesRequest, ListServicesResponse,
                com.oracle.bmc.core.model.Service>(
                new com.google.common.base.Supplier<ListServicesRequest.Builder>() {
                    @Override
                    public ListServicesRequest.Builder get() {
                        return ListServicesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListServicesResponse, String>() {
                    @Override
                    public String apply(ListServicesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListServicesRequest.Builder>,
                        ListServicesRequest>() {
                    @Override
                    public ListServicesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListServicesRequest.Builder>
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
                new com.google.common.base.Function<ListServicesRequest, ListServicesResponse>() {
                    @Override
                    public ListServicesResponse apply(ListServicesRequest request) {
                        return client.listServices(request);
                    }
                },
                new com.google.common.base.Function<
                        ListServicesResponse, java.util.List<com.oracle.bmc.core.model.Service>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.Service> apply(
                            ListServicesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSubnets operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSubnetsResponse> listSubnetsResponseIterator(
            final ListSubnetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSubnetsRequest.Builder, ListSubnetsRequest, ListSubnetsResponse>(
                new com.google.common.base.Supplier<ListSubnetsRequest.Builder>() {
                    @Override
                    public ListSubnetsRequest.Builder get() {
                        return ListSubnetsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSubnetsResponse, String>() {
                    @Override
                    public String apply(ListSubnetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSubnetsRequest.Builder>,
                        ListSubnetsRequest>() {
                    @Override
                    public ListSubnetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSubnetsRequest.Builder>
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
                new com.google.common.base.Function<ListSubnetsRequest, ListSubnetsResponse>() {
                    @Override
                    public ListSubnetsResponse apply(ListSubnetsRequest request) {
                        return client.listSubnets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.Subnet} objects
     * contained in responses from the listSubnets operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.Subnet} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.Subnet> listSubnetsRecordIterator(
            final ListSubnetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSubnetsRequest.Builder, ListSubnetsRequest, ListSubnetsResponse,
                com.oracle.bmc.core.model.Subnet>(
                new com.google.common.base.Supplier<ListSubnetsRequest.Builder>() {
                    @Override
                    public ListSubnetsRequest.Builder get() {
                        return ListSubnetsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSubnetsResponse, String>() {
                    @Override
                    public String apply(ListSubnetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSubnetsRequest.Builder>,
                        ListSubnetsRequest>() {
                    @Override
                    public ListSubnetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSubnetsRequest.Builder>
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
                new com.google.common.base.Function<ListSubnetsRequest, ListSubnetsResponse>() {
                    @Override
                    public ListSubnetsResponse apply(ListSubnetsRequest request) {
                        return client.listSubnets(request);
                    }
                },
                new com.google.common.base.Function<
                        ListSubnetsResponse, java.util.List<com.oracle.bmc.core.model.Subnet>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.Subnet> apply(
                            ListSubnetsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listVcns operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListVcnsResponse> listVcnsResponseIterator(final ListVcnsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVcnsRequest.Builder, ListVcnsRequest, ListVcnsResponse>(
                new com.google.common.base.Supplier<ListVcnsRequest.Builder>() {
                    @Override
                    public ListVcnsRequest.Builder get() {
                        return ListVcnsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListVcnsResponse, String>() {
                    @Override
                    public String apply(ListVcnsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVcnsRequest.Builder>,
                        ListVcnsRequest>() {
                    @Override
                    public ListVcnsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVcnsRequest.Builder>
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
                new com.google.common.base.Function<ListVcnsRequest, ListVcnsResponse>() {
                    @Override
                    public ListVcnsResponse apply(ListVcnsRequest request) {
                        return client.listVcns(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.Vcn} objects
     * contained in responses from the listVcns operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.Vcn} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.Vcn> listVcnsRecordIterator(
            final ListVcnsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVcnsRequest.Builder, ListVcnsRequest, ListVcnsResponse,
                com.oracle.bmc.core.model.Vcn>(
                new com.google.common.base.Supplier<ListVcnsRequest.Builder>() {
                    @Override
                    public ListVcnsRequest.Builder get() {
                        return ListVcnsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListVcnsResponse, String>() {
                    @Override
                    public String apply(ListVcnsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVcnsRequest.Builder>,
                        ListVcnsRequest>() {
                    @Override
                    public ListVcnsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVcnsRequest.Builder>
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
                new com.google.common.base.Function<ListVcnsRequest, ListVcnsResponse>() {
                    @Override
                    public ListVcnsResponse apply(ListVcnsRequest request) {
                        return client.listVcns(request);
                    }
                },
                new com.google.common.base.Function<
                        ListVcnsResponse, java.util.List<com.oracle.bmc.core.model.Vcn>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.Vcn> apply(
                            ListVcnsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listVirtualCircuitBandwidthShapes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListVirtualCircuitBandwidthShapesResponse>
            listVirtualCircuitBandwidthShapesResponseIterator(
                    final ListVirtualCircuitBandwidthShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVirtualCircuitBandwidthShapesRequest.Builder,
                ListVirtualCircuitBandwidthShapesRequest,
                ListVirtualCircuitBandwidthShapesResponse>(
                new com.google.common.base.Supplier<
                        ListVirtualCircuitBandwidthShapesRequest.Builder>() {
                    @Override
                    public ListVirtualCircuitBandwidthShapesRequest.Builder get() {
                        return ListVirtualCircuitBandwidthShapesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListVirtualCircuitBandwidthShapesResponse, String>() {
                    @Override
                    public String apply(ListVirtualCircuitBandwidthShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVirtualCircuitBandwidthShapesRequest.Builder>,
                        ListVirtualCircuitBandwidthShapesRequest>() {
                    @Override
                    public ListVirtualCircuitBandwidthShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVirtualCircuitBandwidthShapesRequest.Builder>
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
                        ListVirtualCircuitBandwidthShapesRequest,
                        ListVirtualCircuitBandwidthShapesResponse>() {
                    @Override
                    public ListVirtualCircuitBandwidthShapesResponse apply(
                            ListVirtualCircuitBandwidthShapesRequest request) {
                        return client.listVirtualCircuitBandwidthShapes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.VirtualCircuitBandwidthShape} objects
     * contained in responses from the listVirtualCircuitBandwidthShapes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.VirtualCircuitBandwidthShape} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.VirtualCircuitBandwidthShape>
            listVirtualCircuitBandwidthShapesRecordIterator(
                    final ListVirtualCircuitBandwidthShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVirtualCircuitBandwidthShapesRequest.Builder,
                ListVirtualCircuitBandwidthShapesRequest, ListVirtualCircuitBandwidthShapesResponse,
                com.oracle.bmc.core.model.VirtualCircuitBandwidthShape>(
                new com.google.common.base.Supplier<
                        ListVirtualCircuitBandwidthShapesRequest.Builder>() {
                    @Override
                    public ListVirtualCircuitBandwidthShapesRequest.Builder get() {
                        return ListVirtualCircuitBandwidthShapesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListVirtualCircuitBandwidthShapesResponse, String>() {
                    @Override
                    public String apply(ListVirtualCircuitBandwidthShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVirtualCircuitBandwidthShapesRequest.Builder>,
                        ListVirtualCircuitBandwidthShapesRequest>() {
                    @Override
                    public ListVirtualCircuitBandwidthShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVirtualCircuitBandwidthShapesRequest.Builder>
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
                        ListVirtualCircuitBandwidthShapesRequest,
                        ListVirtualCircuitBandwidthShapesResponse>() {
                    @Override
                    public ListVirtualCircuitBandwidthShapesResponse apply(
                            ListVirtualCircuitBandwidthShapesRequest request) {
                        return client.listVirtualCircuitBandwidthShapes(request);
                    }
                },
                new com.google.common.base.Function<
                        ListVirtualCircuitBandwidthShapesResponse,
                        java.util.List<com.oracle.bmc.core.model.VirtualCircuitBandwidthShape>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.VirtualCircuitBandwidthShape>
                            apply(ListVirtualCircuitBandwidthShapesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listVirtualCircuits operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListVirtualCircuitsResponse> listVirtualCircuitsResponseIterator(
            final ListVirtualCircuitsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVirtualCircuitsRequest.Builder, ListVirtualCircuitsRequest,
                ListVirtualCircuitsResponse>(
                new com.google.common.base.Supplier<ListVirtualCircuitsRequest.Builder>() {
                    @Override
                    public ListVirtualCircuitsRequest.Builder get() {
                        return ListVirtualCircuitsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListVirtualCircuitsResponse, String>() {
                    @Override
                    public String apply(ListVirtualCircuitsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVirtualCircuitsRequest.Builder>,
                        ListVirtualCircuitsRequest>() {
                    @Override
                    public ListVirtualCircuitsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVirtualCircuitsRequest.Builder>
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
                        ListVirtualCircuitsRequest, ListVirtualCircuitsResponse>() {
                    @Override
                    public ListVirtualCircuitsResponse apply(ListVirtualCircuitsRequest request) {
                        return client.listVirtualCircuits(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.VirtualCircuit} objects
     * contained in responses from the listVirtualCircuits operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.VirtualCircuit} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.VirtualCircuit> listVirtualCircuitsRecordIterator(
            final ListVirtualCircuitsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVirtualCircuitsRequest.Builder, ListVirtualCircuitsRequest,
                ListVirtualCircuitsResponse, com.oracle.bmc.core.model.VirtualCircuit>(
                new com.google.common.base.Supplier<ListVirtualCircuitsRequest.Builder>() {
                    @Override
                    public ListVirtualCircuitsRequest.Builder get() {
                        return ListVirtualCircuitsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListVirtualCircuitsResponse, String>() {
                    @Override
                    public String apply(ListVirtualCircuitsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVirtualCircuitsRequest.Builder>,
                        ListVirtualCircuitsRequest>() {
                    @Override
                    public ListVirtualCircuitsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVirtualCircuitsRequest.Builder>
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
                        ListVirtualCircuitsRequest, ListVirtualCircuitsResponse>() {
                    @Override
                    public ListVirtualCircuitsResponse apply(ListVirtualCircuitsRequest request) {
                        return client.listVirtualCircuits(request);
                    }
                },
                new com.google.common.base.Function<
                        ListVirtualCircuitsResponse,
                        java.util.List<com.oracle.bmc.core.model.VirtualCircuit>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.VirtualCircuit> apply(
                            ListVirtualCircuitsResponse response) {
                        return response.getItems();
                    }
                });
    }
}
