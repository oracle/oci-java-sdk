/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns;

import com.oracle.bmc.dns.requests.*;
import com.oracle.bmc.dns.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Dns where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public class DnsPaginators {
    private final Dns client;

    public DnsPaginators(Dns client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the getDomainRecords operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<GetDomainRecordsResponse> getDomainRecordsResponseIterator(
            final GetDomainRecordsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                GetDomainRecordsRequest.Builder, GetDomainRecordsRequest, GetDomainRecordsResponse>(
                new java.util.function.Supplier<GetDomainRecordsRequest.Builder>() {
                    @Override
                    public GetDomainRecordsRequest.Builder get() {
                        return GetDomainRecordsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<GetDomainRecordsResponse, String>() {
                    @Override
                    public String apply(GetDomainRecordsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                GetDomainRecordsRequest.Builder>,
                        GetDomainRecordsRequest>() {
                    @Override
                    public GetDomainRecordsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            GetDomainRecordsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        GetDomainRecordsRequest, GetDomainRecordsResponse>() {
                    @Override
                    public GetDomainRecordsResponse apply(GetDomainRecordsRequest request) {
                        return client.getDomainRecords(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dns.model.Record} objects
     * contained in responses from the getDomainRecords operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dns.model.Record} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dns.model.Record> getDomainRecordsRecordIterator(
            final GetDomainRecordsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                GetDomainRecordsRequest.Builder, GetDomainRecordsRequest, GetDomainRecordsResponse,
                com.oracle.bmc.dns.model.Record>(
                new java.util.function.Supplier<GetDomainRecordsRequest.Builder>() {
                    @Override
                    public GetDomainRecordsRequest.Builder get() {
                        return GetDomainRecordsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<GetDomainRecordsResponse, String>() {
                    @Override
                    public String apply(GetDomainRecordsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                GetDomainRecordsRequest.Builder>,
                        GetDomainRecordsRequest>() {
                    @Override
                    public GetDomainRecordsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            GetDomainRecordsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        GetDomainRecordsRequest, GetDomainRecordsResponse>() {
                    @Override
                    public GetDomainRecordsResponse apply(GetDomainRecordsRequest request) {
                        return client.getDomainRecords(request);
                    }
                },
                new java.util.function.Function<
                        GetDomainRecordsResponse,
                        java.util.List<com.oracle.bmc.dns.model.Record>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dns.model.Record> apply(
                            GetDomainRecordsResponse response) {
                        return response.getRecordCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the getRRSet operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<GetRRSetResponse> getRRSetResponseIterator(final GetRRSetRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                GetRRSetRequest.Builder, GetRRSetRequest, GetRRSetResponse>(
                new java.util.function.Supplier<GetRRSetRequest.Builder>() {
                    @Override
                    public GetRRSetRequest.Builder get() {
                        return GetRRSetRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<GetRRSetResponse, String>() {
                    @Override
                    public String apply(GetRRSetResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                GetRRSetRequest.Builder>,
                        GetRRSetRequest>() {
                    @Override
                    public GetRRSetRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            GetRRSetRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<GetRRSetRequest, GetRRSetResponse>() {
                    @Override
                    public GetRRSetResponse apply(GetRRSetRequest request) {
                        return client.getRRSet(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dns.model.Record} objects
     * contained in responses from the getRRSet operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dns.model.Record} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dns.model.Record> getRRSetRecordIterator(
            final GetRRSetRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                GetRRSetRequest.Builder, GetRRSetRequest, GetRRSetResponse,
                com.oracle.bmc.dns.model.Record>(
                new java.util.function.Supplier<GetRRSetRequest.Builder>() {
                    @Override
                    public GetRRSetRequest.Builder get() {
                        return GetRRSetRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<GetRRSetResponse, String>() {
                    @Override
                    public String apply(GetRRSetResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                GetRRSetRequest.Builder>,
                        GetRRSetRequest>() {
                    @Override
                    public GetRRSetRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            GetRRSetRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<GetRRSetRequest, GetRRSetResponse>() {
                    @Override
                    public GetRRSetResponse apply(GetRRSetRequest request) {
                        return client.getRRSet(request);
                    }
                },
                new java.util.function.Function<
                        GetRRSetResponse, java.util.List<com.oracle.bmc.dns.model.Record>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dns.model.Record> apply(
                            GetRRSetResponse response) {
                        return response.getRRSet().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the getZoneRecords operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<GetZoneRecordsResponse> getZoneRecordsResponseIterator(
            final GetZoneRecordsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                GetZoneRecordsRequest.Builder, GetZoneRecordsRequest, GetZoneRecordsResponse>(
                new java.util.function.Supplier<GetZoneRecordsRequest.Builder>() {
                    @Override
                    public GetZoneRecordsRequest.Builder get() {
                        return GetZoneRecordsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<GetZoneRecordsResponse, String>() {
                    @Override
                    public String apply(GetZoneRecordsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                GetZoneRecordsRequest.Builder>,
                        GetZoneRecordsRequest>() {
                    @Override
                    public GetZoneRecordsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            GetZoneRecordsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<GetZoneRecordsRequest, GetZoneRecordsResponse>() {
                    @Override
                    public GetZoneRecordsResponse apply(GetZoneRecordsRequest request) {
                        return client.getZoneRecords(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dns.model.Record} objects
     * contained in responses from the getZoneRecords operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dns.model.Record} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dns.model.Record> getZoneRecordsRecordIterator(
            final GetZoneRecordsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                GetZoneRecordsRequest.Builder, GetZoneRecordsRequest, GetZoneRecordsResponse,
                com.oracle.bmc.dns.model.Record>(
                new java.util.function.Supplier<GetZoneRecordsRequest.Builder>() {
                    @Override
                    public GetZoneRecordsRequest.Builder get() {
                        return GetZoneRecordsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<GetZoneRecordsResponse, String>() {
                    @Override
                    public String apply(GetZoneRecordsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                GetZoneRecordsRequest.Builder>,
                        GetZoneRecordsRequest>() {
                    @Override
                    public GetZoneRecordsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            GetZoneRecordsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<GetZoneRecordsRequest, GetZoneRecordsResponse>() {
                    @Override
                    public GetZoneRecordsResponse apply(GetZoneRecordsRequest request) {
                        return client.getZoneRecords(request);
                    }
                },
                new java.util.function.Function<
                        GetZoneRecordsResponse, java.util.List<com.oracle.bmc.dns.model.Record>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dns.model.Record> apply(
                            GetZoneRecordsResponse response) {
                        return response.getRecordCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listResolverEndpoints operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListResolverEndpointsResponse> listResolverEndpointsResponseIterator(
            final ListResolverEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListResolverEndpointsRequest.Builder, ListResolverEndpointsRequest,
                ListResolverEndpointsResponse>(
                new java.util.function.Supplier<ListResolverEndpointsRequest.Builder>() {
                    @Override
                    public ListResolverEndpointsRequest.Builder get() {
                        return ListResolverEndpointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResolverEndpointsResponse, String>() {
                    @Override
                    public String apply(ListResolverEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResolverEndpointsRequest.Builder>,
                        ListResolverEndpointsRequest>() {
                    @Override
                    public ListResolverEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResolverEndpointsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListResolverEndpointsRequest, ListResolverEndpointsResponse>() {
                    @Override
                    public ListResolverEndpointsResponse apply(
                            ListResolverEndpointsRequest request) {
                        return client.listResolverEndpoints(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dns.model.ResolverEndpointSummary} objects
     * contained in responses from the listResolverEndpoints operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dns.model.ResolverEndpointSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dns.model.ResolverEndpointSummary>
            listResolverEndpointsRecordIterator(final ListResolverEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListResolverEndpointsRequest.Builder, ListResolverEndpointsRequest,
                ListResolverEndpointsResponse, com.oracle.bmc.dns.model.ResolverEndpointSummary>(
                new java.util.function.Supplier<ListResolverEndpointsRequest.Builder>() {
                    @Override
                    public ListResolverEndpointsRequest.Builder get() {
                        return ListResolverEndpointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResolverEndpointsResponse, String>() {
                    @Override
                    public String apply(ListResolverEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResolverEndpointsRequest.Builder>,
                        ListResolverEndpointsRequest>() {
                    @Override
                    public ListResolverEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResolverEndpointsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListResolverEndpointsRequest, ListResolverEndpointsResponse>() {
                    @Override
                    public ListResolverEndpointsResponse apply(
                            ListResolverEndpointsRequest request) {
                        return client.listResolverEndpoints(request);
                    }
                },
                new java.util.function.Function<
                        ListResolverEndpointsResponse,
                        java.util.List<com.oracle.bmc.dns.model.ResolverEndpointSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dns.model.ResolverEndpointSummary> apply(
                            ListResolverEndpointsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listResolvers operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListResolversResponse> listResolversResponseIterator(
            final ListResolversRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListResolversRequest.Builder, ListResolversRequest, ListResolversResponse>(
                new java.util.function.Supplier<ListResolversRequest.Builder>() {
                    @Override
                    public ListResolversRequest.Builder get() {
                        return ListResolversRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResolversResponse, String>() {
                    @Override
                    public String apply(ListResolversResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResolversRequest.Builder>,
                        ListResolversRequest>() {
                    @Override
                    public ListResolversRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResolversRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListResolversRequest, ListResolversResponse>() {
                    @Override
                    public ListResolversResponse apply(ListResolversRequest request) {
                        return client.listResolvers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dns.model.ResolverSummary} objects
     * contained in responses from the listResolvers operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dns.model.ResolverSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dns.model.ResolverSummary> listResolversRecordIterator(
            final ListResolversRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListResolversRequest.Builder, ListResolversRequest, ListResolversResponse,
                com.oracle.bmc.dns.model.ResolverSummary>(
                new java.util.function.Supplier<ListResolversRequest.Builder>() {
                    @Override
                    public ListResolversRequest.Builder get() {
                        return ListResolversRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListResolversResponse, String>() {
                    @Override
                    public String apply(ListResolversResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResolversRequest.Builder>,
                        ListResolversRequest>() {
                    @Override
                    public ListResolversRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResolversRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListResolversRequest, ListResolversResponse>() {
                    @Override
                    public ListResolversResponse apply(ListResolversRequest request) {
                        return client.listResolvers(request);
                    }
                },
                new java.util.function.Function<
                        ListResolversResponse,
                        java.util.List<com.oracle.bmc.dns.model.ResolverSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dns.model.ResolverSummary> apply(
                            ListResolversResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSteeringPolicies operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSteeringPoliciesResponse> listSteeringPoliciesResponseIterator(
            final ListSteeringPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSteeringPoliciesRequest.Builder, ListSteeringPoliciesRequest,
                ListSteeringPoliciesResponse>(
                new java.util.function.Supplier<ListSteeringPoliciesRequest.Builder>() {
                    @Override
                    public ListSteeringPoliciesRequest.Builder get() {
                        return ListSteeringPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSteeringPoliciesResponse, String>() {
                    @Override
                    public String apply(ListSteeringPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSteeringPoliciesRequest.Builder>,
                        ListSteeringPoliciesRequest>() {
                    @Override
                    public ListSteeringPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSteeringPoliciesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListSteeringPoliciesRequest, ListSteeringPoliciesResponse>() {
                    @Override
                    public ListSteeringPoliciesResponse apply(ListSteeringPoliciesRequest request) {
                        return client.listSteeringPolicies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dns.model.SteeringPolicySummary} objects
     * contained in responses from the listSteeringPolicies operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dns.model.SteeringPolicySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dns.model.SteeringPolicySummary>
            listSteeringPoliciesRecordIterator(final ListSteeringPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSteeringPoliciesRequest.Builder, ListSteeringPoliciesRequest,
                ListSteeringPoliciesResponse, com.oracle.bmc.dns.model.SteeringPolicySummary>(
                new java.util.function.Supplier<ListSteeringPoliciesRequest.Builder>() {
                    @Override
                    public ListSteeringPoliciesRequest.Builder get() {
                        return ListSteeringPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSteeringPoliciesResponse, String>() {
                    @Override
                    public String apply(ListSteeringPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSteeringPoliciesRequest.Builder>,
                        ListSteeringPoliciesRequest>() {
                    @Override
                    public ListSteeringPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSteeringPoliciesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListSteeringPoliciesRequest, ListSteeringPoliciesResponse>() {
                    @Override
                    public ListSteeringPoliciesResponse apply(ListSteeringPoliciesRequest request) {
                        return client.listSteeringPolicies(request);
                    }
                },
                new java.util.function.Function<
                        ListSteeringPoliciesResponse,
                        java.util.List<com.oracle.bmc.dns.model.SteeringPolicySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dns.model.SteeringPolicySummary> apply(
                            ListSteeringPoliciesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSteeringPolicyAttachments operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSteeringPolicyAttachmentsResponse>
            listSteeringPolicyAttachmentsResponseIterator(
                    final ListSteeringPolicyAttachmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSteeringPolicyAttachmentsRequest.Builder, ListSteeringPolicyAttachmentsRequest,
                ListSteeringPolicyAttachmentsResponse>(
                new java.util.function.Supplier<ListSteeringPolicyAttachmentsRequest.Builder>() {
                    @Override
                    public ListSteeringPolicyAttachmentsRequest.Builder get() {
                        return ListSteeringPolicyAttachmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSteeringPolicyAttachmentsResponse, String>() {
                    @Override
                    public String apply(ListSteeringPolicyAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSteeringPolicyAttachmentsRequest.Builder>,
                        ListSteeringPolicyAttachmentsRequest>() {
                    @Override
                    public ListSteeringPolicyAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSteeringPolicyAttachmentsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListSteeringPolicyAttachmentsRequest,
                        ListSteeringPolicyAttachmentsResponse>() {
                    @Override
                    public ListSteeringPolicyAttachmentsResponse apply(
                            ListSteeringPolicyAttachmentsRequest request) {
                        return client.listSteeringPolicyAttachments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dns.model.SteeringPolicyAttachmentSummary} objects
     * contained in responses from the listSteeringPolicyAttachments operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dns.model.SteeringPolicyAttachmentSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dns.model.SteeringPolicyAttachmentSummary>
            listSteeringPolicyAttachmentsRecordIterator(
                    final ListSteeringPolicyAttachmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSteeringPolicyAttachmentsRequest.Builder, ListSteeringPolicyAttachmentsRequest,
                ListSteeringPolicyAttachmentsResponse,
                com.oracle.bmc.dns.model.SteeringPolicyAttachmentSummary>(
                new java.util.function.Supplier<ListSteeringPolicyAttachmentsRequest.Builder>() {
                    @Override
                    public ListSteeringPolicyAttachmentsRequest.Builder get() {
                        return ListSteeringPolicyAttachmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSteeringPolicyAttachmentsResponse, String>() {
                    @Override
                    public String apply(ListSteeringPolicyAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSteeringPolicyAttachmentsRequest.Builder>,
                        ListSteeringPolicyAttachmentsRequest>() {
                    @Override
                    public ListSteeringPolicyAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSteeringPolicyAttachmentsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListSteeringPolicyAttachmentsRequest,
                        ListSteeringPolicyAttachmentsResponse>() {
                    @Override
                    public ListSteeringPolicyAttachmentsResponse apply(
                            ListSteeringPolicyAttachmentsRequest request) {
                        return client.listSteeringPolicyAttachments(request);
                    }
                },
                new java.util.function.Function<
                        ListSteeringPolicyAttachmentsResponse,
                        java.util.List<
                                com.oracle.bmc.dns.model.SteeringPolicyAttachmentSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dns.model.SteeringPolicyAttachmentSummary>
                            apply(ListSteeringPolicyAttachmentsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTsigKeys operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTsigKeysResponse> listTsigKeysResponseIterator(
            final ListTsigKeysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTsigKeysRequest.Builder, ListTsigKeysRequest, ListTsigKeysResponse>(
                new java.util.function.Supplier<ListTsigKeysRequest.Builder>() {
                    @Override
                    public ListTsigKeysRequest.Builder get() {
                        return ListTsigKeysRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTsigKeysResponse, String>() {
                    @Override
                    public String apply(ListTsigKeysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTsigKeysRequest.Builder>,
                        ListTsigKeysRequest>() {
                    @Override
                    public ListTsigKeysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTsigKeysRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListTsigKeysRequest, ListTsigKeysResponse>() {
                    @Override
                    public ListTsigKeysResponse apply(ListTsigKeysRequest request) {
                        return client.listTsigKeys(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dns.model.TsigKeySummary} objects
     * contained in responses from the listTsigKeys operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dns.model.TsigKeySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dns.model.TsigKeySummary> listTsigKeysRecordIterator(
            final ListTsigKeysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTsigKeysRequest.Builder, ListTsigKeysRequest, ListTsigKeysResponse,
                com.oracle.bmc.dns.model.TsigKeySummary>(
                new java.util.function.Supplier<ListTsigKeysRequest.Builder>() {
                    @Override
                    public ListTsigKeysRequest.Builder get() {
                        return ListTsigKeysRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTsigKeysResponse, String>() {
                    @Override
                    public String apply(ListTsigKeysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTsigKeysRequest.Builder>,
                        ListTsigKeysRequest>() {
                    @Override
                    public ListTsigKeysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTsigKeysRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListTsigKeysRequest, ListTsigKeysResponse>() {
                    @Override
                    public ListTsigKeysResponse apply(ListTsigKeysRequest request) {
                        return client.listTsigKeys(request);
                    }
                },
                new java.util.function.Function<
                        ListTsigKeysResponse,
                        java.util.List<com.oracle.bmc.dns.model.TsigKeySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dns.model.TsigKeySummary> apply(
                            ListTsigKeysResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listViews operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListViewsResponse> listViewsResponseIterator(final ListViewsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListViewsRequest.Builder, ListViewsRequest, ListViewsResponse>(
                new java.util.function.Supplier<ListViewsRequest.Builder>() {
                    @Override
                    public ListViewsRequest.Builder get() {
                        return ListViewsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListViewsResponse, String>() {
                    @Override
                    public String apply(ListViewsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListViewsRequest.Builder>,
                        ListViewsRequest>() {
                    @Override
                    public ListViewsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListViewsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListViewsRequest, ListViewsResponse>() {
                    @Override
                    public ListViewsResponse apply(ListViewsRequest request) {
                        return client.listViews(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dns.model.ViewSummary} objects
     * contained in responses from the listViews operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dns.model.ViewSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dns.model.ViewSummary> listViewsRecordIterator(
            final ListViewsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListViewsRequest.Builder, ListViewsRequest, ListViewsResponse,
                com.oracle.bmc.dns.model.ViewSummary>(
                new java.util.function.Supplier<ListViewsRequest.Builder>() {
                    @Override
                    public ListViewsRequest.Builder get() {
                        return ListViewsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListViewsResponse, String>() {
                    @Override
                    public String apply(ListViewsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListViewsRequest.Builder>,
                        ListViewsRequest>() {
                    @Override
                    public ListViewsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListViewsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListViewsRequest, ListViewsResponse>() {
                    @Override
                    public ListViewsResponse apply(ListViewsRequest request) {
                        return client.listViews(request);
                    }
                },
                new java.util.function.Function<
                        ListViewsResponse, java.util.List<com.oracle.bmc.dns.model.ViewSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dns.model.ViewSummary> apply(
                            ListViewsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listZoneTransferServers operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListZoneTransferServersResponse> listZoneTransferServersResponseIterator(
            final ListZoneTransferServersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListZoneTransferServersRequest.Builder, ListZoneTransferServersRequest,
                ListZoneTransferServersResponse>(
                new java.util.function.Supplier<ListZoneTransferServersRequest.Builder>() {
                    @Override
                    public ListZoneTransferServersRequest.Builder get() {
                        return ListZoneTransferServersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListZoneTransferServersResponse, String>() {
                    @Override
                    public String apply(ListZoneTransferServersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListZoneTransferServersRequest.Builder>,
                        ListZoneTransferServersRequest>() {
                    @Override
                    public ListZoneTransferServersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListZoneTransferServersRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListZoneTransferServersRequest, ListZoneTransferServersResponse>() {
                    @Override
                    public ListZoneTransferServersResponse apply(
                            ListZoneTransferServersRequest request) {
                        return client.listZoneTransferServers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dns.model.ZoneTransferServer} objects
     * contained in responses from the listZoneTransferServers operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dns.model.ZoneTransferServer} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dns.model.ZoneTransferServer>
            listZoneTransferServersRecordIterator(final ListZoneTransferServersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListZoneTransferServersRequest.Builder, ListZoneTransferServersRequest,
                ListZoneTransferServersResponse, com.oracle.bmc.dns.model.ZoneTransferServer>(
                new java.util.function.Supplier<ListZoneTransferServersRequest.Builder>() {
                    @Override
                    public ListZoneTransferServersRequest.Builder get() {
                        return ListZoneTransferServersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListZoneTransferServersResponse, String>() {
                    @Override
                    public String apply(ListZoneTransferServersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListZoneTransferServersRequest.Builder>,
                        ListZoneTransferServersRequest>() {
                    @Override
                    public ListZoneTransferServersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListZoneTransferServersRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListZoneTransferServersRequest, ListZoneTransferServersResponse>() {
                    @Override
                    public ListZoneTransferServersResponse apply(
                            ListZoneTransferServersRequest request) {
                        return client.listZoneTransferServers(request);
                    }
                },
                new java.util.function.Function<
                        ListZoneTransferServersResponse,
                        java.util.List<com.oracle.bmc.dns.model.ZoneTransferServer>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dns.model.ZoneTransferServer> apply(
                            ListZoneTransferServersResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listZones operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListZonesResponse> listZonesResponseIterator(final ListZonesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListZonesRequest.Builder, ListZonesRequest, ListZonesResponse>(
                new java.util.function.Supplier<ListZonesRequest.Builder>() {
                    @Override
                    public ListZonesRequest.Builder get() {
                        return ListZonesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListZonesResponse, String>() {
                    @Override
                    public String apply(ListZonesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListZonesRequest.Builder>,
                        ListZonesRequest>() {
                    @Override
                    public ListZonesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListZonesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListZonesRequest, ListZonesResponse>() {
                    @Override
                    public ListZonesResponse apply(ListZonesRequest request) {
                        return client.listZones(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dns.model.ZoneSummary} objects
     * contained in responses from the listZones operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dns.model.ZoneSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dns.model.ZoneSummary> listZonesRecordIterator(
            final ListZonesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListZonesRequest.Builder, ListZonesRequest, ListZonesResponse,
                com.oracle.bmc.dns.model.ZoneSummary>(
                new java.util.function.Supplier<ListZonesRequest.Builder>() {
                    @Override
                    public ListZonesRequest.Builder get() {
                        return ListZonesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListZonesResponse, String>() {
                    @Override
                    public String apply(ListZonesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListZonesRequest.Builder>,
                        ListZonesRequest>() {
                    @Override
                    public ListZonesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListZonesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListZonesRequest, ListZonesResponse>() {
                    @Override
                    public ListZonesResponse apply(ListZonesRequest request) {
                        return client.listZones(request);
                    }
                },
                new java.util.function.Function<
                        ListZonesResponse, java.util.List<com.oracle.bmc.dns.model.ZoneSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dns.model.ZoneSummary> apply(
                            ListZonesResponse response) {
                        return response.getItems();
                    }
                });
    }
}
