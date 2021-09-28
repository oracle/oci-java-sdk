/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe;

import com.oracle.bmc.datasafe.requests.*;
import com.oracle.bmc.datasafe.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of DataSafe where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.RequiredArgsConstructor
public class DataSafePaginators {
    private final DataSafe client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listDataSafePrivateEndpoints operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDataSafePrivateEndpointsResponse>
            listDataSafePrivateEndpointsResponseIterator(
                    final ListDataSafePrivateEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDataSafePrivateEndpointsRequest.Builder, ListDataSafePrivateEndpointsRequest,
                ListDataSafePrivateEndpointsResponse>(
                new com.google.common.base.Supplier<ListDataSafePrivateEndpointsRequest.Builder>() {
                    @Override
                    public ListDataSafePrivateEndpointsRequest.Builder get() {
                        return ListDataSafePrivateEndpointsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDataSafePrivateEndpointsResponse, String>() {
                    @Override
                    public String apply(ListDataSafePrivateEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataSafePrivateEndpointsRequest.Builder>,
                        ListDataSafePrivateEndpointsRequest>() {
                    @Override
                    public ListDataSafePrivateEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataSafePrivateEndpointsRequest.Builder>
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
                        ListDataSafePrivateEndpointsRequest,
                        ListDataSafePrivateEndpointsResponse>() {
                    @Override
                    public ListDataSafePrivateEndpointsResponse apply(
                            ListDataSafePrivateEndpointsRequest request) {
                        return client.listDataSafePrivateEndpoints(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.DataSafePrivateEndpointSummary} objects
     * contained in responses from the listDataSafePrivateEndpoints operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.DataSafePrivateEndpointSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.DataSafePrivateEndpointSummary>
            listDataSafePrivateEndpointsRecordIterator(
                    final ListDataSafePrivateEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDataSafePrivateEndpointsRequest.Builder, ListDataSafePrivateEndpointsRequest,
                ListDataSafePrivateEndpointsResponse,
                com.oracle.bmc.datasafe.model.DataSafePrivateEndpointSummary>(
                new com.google.common.base.Supplier<ListDataSafePrivateEndpointsRequest.Builder>() {
                    @Override
                    public ListDataSafePrivateEndpointsRequest.Builder get() {
                        return ListDataSafePrivateEndpointsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDataSafePrivateEndpointsResponse, String>() {
                    @Override
                    public String apply(ListDataSafePrivateEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataSafePrivateEndpointsRequest.Builder>,
                        ListDataSafePrivateEndpointsRequest>() {
                    @Override
                    public ListDataSafePrivateEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataSafePrivateEndpointsRequest.Builder>
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
                        ListDataSafePrivateEndpointsRequest,
                        ListDataSafePrivateEndpointsResponse>() {
                    @Override
                    public ListDataSafePrivateEndpointsResponse apply(
                            ListDataSafePrivateEndpointsRequest request) {
                        return client.listDataSafePrivateEndpoints(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDataSafePrivateEndpointsResponse,
                        java.util.List<
                                com.oracle.bmc.datasafe.model.DataSafePrivateEndpointSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.datasafe.model.DataSafePrivateEndpointSummary>
                            apply(ListDataSafePrivateEndpointsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listFindings operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListFindingsResponse> listFindingsResponseIterator(
            final ListFindingsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFindingsRequest.Builder, ListFindingsRequest, ListFindingsResponse>(
                new com.google.common.base.Supplier<ListFindingsRequest.Builder>() {
                    @Override
                    public ListFindingsRequest.Builder get() {
                        return ListFindingsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListFindingsResponse, String>() {
                    @Override
                    public String apply(ListFindingsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFindingsRequest.Builder>,
                        ListFindingsRequest>() {
                    @Override
                    public ListFindingsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFindingsRequest.Builder>
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
                new com.google.common.base.Function<ListFindingsRequest, ListFindingsResponse>() {
                    @Override
                    public ListFindingsResponse apply(ListFindingsRequest request) {
                        return client.listFindings(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.FindingSummary} objects
     * contained in responses from the listFindings operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.FindingSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.FindingSummary> listFindingsRecordIterator(
            final ListFindingsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFindingsRequest.Builder, ListFindingsRequest, ListFindingsResponse,
                com.oracle.bmc.datasafe.model.FindingSummary>(
                new com.google.common.base.Supplier<ListFindingsRequest.Builder>() {
                    @Override
                    public ListFindingsRequest.Builder get() {
                        return ListFindingsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListFindingsResponse, String>() {
                    @Override
                    public String apply(ListFindingsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFindingsRequest.Builder>,
                        ListFindingsRequest>() {
                    @Override
                    public ListFindingsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFindingsRequest.Builder>
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
                new com.google.common.base.Function<ListFindingsRequest, ListFindingsResponse>() {
                    @Override
                    public ListFindingsResponse apply(ListFindingsRequest request) {
                        return client.listFindings(request);
                    }
                },
                new com.google.common.base.Function<
                        ListFindingsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.FindingSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.FindingSummary> apply(
                            ListFindingsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listGrants operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListGrantsResponse> listGrantsResponseIterator(
            final ListGrantsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListGrantsRequest.Builder, ListGrantsRequest, ListGrantsResponse>(
                new com.google.common.base.Supplier<ListGrantsRequest.Builder>() {
                    @Override
                    public ListGrantsRequest.Builder get() {
                        return ListGrantsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListGrantsResponse, String>() {
                    @Override
                    public String apply(ListGrantsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGrantsRequest.Builder>,
                        ListGrantsRequest>() {
                    @Override
                    public ListGrantsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGrantsRequest.Builder>
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
                new com.google.common.base.Function<ListGrantsRequest, ListGrantsResponse>() {
                    @Override
                    public ListGrantsResponse apply(ListGrantsRequest request) {
                        return client.listGrants(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.GrantSummary} objects
     * contained in responses from the listGrants operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.GrantSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.GrantSummary> listGrantsRecordIterator(
            final ListGrantsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListGrantsRequest.Builder, ListGrantsRequest, ListGrantsResponse,
                com.oracle.bmc.datasafe.model.GrantSummary>(
                new com.google.common.base.Supplier<ListGrantsRequest.Builder>() {
                    @Override
                    public ListGrantsRequest.Builder get() {
                        return ListGrantsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListGrantsResponse, String>() {
                    @Override
                    public String apply(ListGrantsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGrantsRequest.Builder>,
                        ListGrantsRequest>() {
                    @Override
                    public ListGrantsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGrantsRequest.Builder>
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
                new com.google.common.base.Function<ListGrantsRequest, ListGrantsResponse>() {
                    @Override
                    public ListGrantsResponse apply(ListGrantsRequest request) {
                        return client.listGrants(request);
                    }
                },
                new com.google.common.base.Function<
                        ListGrantsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.GrantSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.GrantSummary> apply(
                            ListGrantsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listOnPremConnectors operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListOnPremConnectorsResponse> listOnPremConnectorsResponseIterator(
            final ListOnPremConnectorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOnPremConnectorsRequest.Builder, ListOnPremConnectorsRequest,
                ListOnPremConnectorsResponse>(
                new com.google.common.base.Supplier<ListOnPremConnectorsRequest.Builder>() {
                    @Override
                    public ListOnPremConnectorsRequest.Builder get() {
                        return ListOnPremConnectorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListOnPremConnectorsResponse, String>() {
                    @Override
                    public String apply(ListOnPremConnectorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOnPremConnectorsRequest.Builder>,
                        ListOnPremConnectorsRequest>() {
                    @Override
                    public ListOnPremConnectorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOnPremConnectorsRequest.Builder>
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
                        ListOnPremConnectorsRequest, ListOnPremConnectorsResponse>() {
                    @Override
                    public ListOnPremConnectorsResponse apply(ListOnPremConnectorsRequest request) {
                        return client.listOnPremConnectors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.OnPremConnectorSummary} objects
     * contained in responses from the listOnPremConnectors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.OnPremConnectorSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.OnPremConnectorSummary>
            listOnPremConnectorsRecordIterator(final ListOnPremConnectorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOnPremConnectorsRequest.Builder, ListOnPremConnectorsRequest,
                ListOnPremConnectorsResponse, com.oracle.bmc.datasafe.model.OnPremConnectorSummary>(
                new com.google.common.base.Supplier<ListOnPremConnectorsRequest.Builder>() {
                    @Override
                    public ListOnPremConnectorsRequest.Builder get() {
                        return ListOnPremConnectorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListOnPremConnectorsResponse, String>() {
                    @Override
                    public String apply(ListOnPremConnectorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOnPremConnectorsRequest.Builder>,
                        ListOnPremConnectorsRequest>() {
                    @Override
                    public ListOnPremConnectorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOnPremConnectorsRequest.Builder>
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
                        ListOnPremConnectorsRequest, ListOnPremConnectorsResponse>() {
                    @Override
                    public ListOnPremConnectorsResponse apply(ListOnPremConnectorsRequest request) {
                        return client.listOnPremConnectors(request);
                    }
                },
                new com.google.common.base.Function<
                        ListOnPremConnectorsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.OnPremConnectorSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.OnPremConnectorSummary>
                            apply(ListOnPremConnectorsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSecurityAssessments operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSecurityAssessmentsResponse> listSecurityAssessmentsResponseIterator(
            final ListSecurityAssessmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSecurityAssessmentsRequest.Builder, ListSecurityAssessmentsRequest,
                ListSecurityAssessmentsResponse>(
                new com.google.common.base.Supplier<ListSecurityAssessmentsRequest.Builder>() {
                    @Override
                    public ListSecurityAssessmentsRequest.Builder get() {
                        return ListSecurityAssessmentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSecurityAssessmentsResponse, String>() {
                    @Override
                    public String apply(ListSecurityAssessmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityAssessmentsRequest.Builder>,
                        ListSecurityAssessmentsRequest>() {
                    @Override
                    public ListSecurityAssessmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityAssessmentsRequest.Builder>
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
                        ListSecurityAssessmentsRequest, ListSecurityAssessmentsResponse>() {
                    @Override
                    public ListSecurityAssessmentsResponse apply(
                            ListSecurityAssessmentsRequest request) {
                        return client.listSecurityAssessments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.SecurityAssessmentSummary} objects
     * contained in responses from the listSecurityAssessments operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.SecurityAssessmentSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.SecurityAssessmentSummary>
            listSecurityAssessmentsRecordIterator(final ListSecurityAssessmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSecurityAssessmentsRequest.Builder, ListSecurityAssessmentsRequest,
                ListSecurityAssessmentsResponse,
                com.oracle.bmc.datasafe.model.SecurityAssessmentSummary>(
                new com.google.common.base.Supplier<ListSecurityAssessmentsRequest.Builder>() {
                    @Override
                    public ListSecurityAssessmentsRequest.Builder get() {
                        return ListSecurityAssessmentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSecurityAssessmentsResponse, String>() {
                    @Override
                    public String apply(ListSecurityAssessmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityAssessmentsRequest.Builder>,
                        ListSecurityAssessmentsRequest>() {
                    @Override
                    public ListSecurityAssessmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityAssessmentsRequest.Builder>
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
                        ListSecurityAssessmentsRequest, ListSecurityAssessmentsResponse>() {
                    @Override
                    public ListSecurityAssessmentsResponse apply(
                            ListSecurityAssessmentsRequest request) {
                        return client.listSecurityAssessments(request);
                    }
                },
                new com.google.common.base.Function<
                        ListSecurityAssessmentsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.SecurityAssessmentSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.SecurityAssessmentSummary>
                            apply(ListSecurityAssessmentsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTargetDatabases operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTargetDatabasesResponse> listTargetDatabasesResponseIterator(
            final ListTargetDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTargetDatabasesRequest.Builder, ListTargetDatabasesRequest,
                ListTargetDatabasesResponse>(
                new com.google.common.base.Supplier<ListTargetDatabasesRequest.Builder>() {
                    @Override
                    public ListTargetDatabasesRequest.Builder get() {
                        return ListTargetDatabasesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTargetDatabasesResponse, String>() {
                    @Override
                    public String apply(ListTargetDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetDatabasesRequest.Builder>,
                        ListTargetDatabasesRequest>() {
                    @Override
                    public ListTargetDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetDatabasesRequest.Builder>
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
                        ListTargetDatabasesRequest, ListTargetDatabasesResponse>() {
                    @Override
                    public ListTargetDatabasesResponse apply(ListTargetDatabasesRequest request) {
                        return client.listTargetDatabases(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.TargetDatabaseSummary} objects
     * contained in responses from the listTargetDatabases operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.TargetDatabaseSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.TargetDatabaseSummary>
            listTargetDatabasesRecordIterator(final ListTargetDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTargetDatabasesRequest.Builder, ListTargetDatabasesRequest,
                ListTargetDatabasesResponse, com.oracle.bmc.datasafe.model.TargetDatabaseSummary>(
                new com.google.common.base.Supplier<ListTargetDatabasesRequest.Builder>() {
                    @Override
                    public ListTargetDatabasesRequest.Builder get() {
                        return ListTargetDatabasesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTargetDatabasesResponse, String>() {
                    @Override
                    public String apply(ListTargetDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetDatabasesRequest.Builder>,
                        ListTargetDatabasesRequest>() {
                    @Override
                    public ListTargetDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetDatabasesRequest.Builder>
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
                        ListTargetDatabasesRequest, ListTargetDatabasesResponse>() {
                    @Override
                    public ListTargetDatabasesResponse apply(ListTargetDatabasesRequest request) {
                        return client.listTargetDatabases(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTargetDatabasesResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.TargetDatabaseSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.TargetDatabaseSummary>
                            apply(ListTargetDatabasesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listUserAnalytics operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListUserAnalyticsResponse> listUserAnalyticsResponseIterator(
            final ListUserAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListUserAnalyticsRequest.Builder, ListUserAnalyticsRequest,
                ListUserAnalyticsResponse>(
                new com.google.common.base.Supplier<ListUserAnalyticsRequest.Builder>() {
                    @Override
                    public ListUserAnalyticsRequest.Builder get() {
                        return ListUserAnalyticsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListUserAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListUserAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUserAnalyticsRequest.Builder>,
                        ListUserAnalyticsRequest>() {
                    @Override
                    public ListUserAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUserAnalyticsRequest.Builder>
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
                        ListUserAnalyticsRequest, ListUserAnalyticsResponse>() {
                    @Override
                    public ListUserAnalyticsResponse apply(ListUserAnalyticsRequest request) {
                        return client.listUserAnalytics(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.UserAggregation} objects
     * contained in responses from the listUserAnalytics operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.UserAggregation} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.UserAggregation> listUserAnalyticsRecordIterator(
            final ListUserAnalyticsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListUserAnalyticsRequest.Builder, ListUserAnalyticsRequest,
                ListUserAnalyticsResponse, com.oracle.bmc.datasafe.model.UserAggregation>(
                new com.google.common.base.Supplier<ListUserAnalyticsRequest.Builder>() {
                    @Override
                    public ListUserAnalyticsRequest.Builder get() {
                        return ListUserAnalyticsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListUserAnalyticsResponse, String>() {
                    @Override
                    public String apply(ListUserAnalyticsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUserAnalyticsRequest.Builder>,
                        ListUserAnalyticsRequest>() {
                    @Override
                    public ListUserAnalyticsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUserAnalyticsRequest.Builder>
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
                        ListUserAnalyticsRequest, ListUserAnalyticsResponse>() {
                    @Override
                    public ListUserAnalyticsResponse apply(ListUserAnalyticsRequest request) {
                        return client.listUserAnalytics(request);
                    }
                },
                new com.google.common.base.Function<
                        ListUserAnalyticsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.UserAggregation>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.UserAggregation> apply(
                            ListUserAnalyticsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listUserAssessments operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListUserAssessmentsResponse> listUserAssessmentsResponseIterator(
            final ListUserAssessmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListUserAssessmentsRequest.Builder, ListUserAssessmentsRequest,
                ListUserAssessmentsResponse>(
                new com.google.common.base.Supplier<ListUserAssessmentsRequest.Builder>() {
                    @Override
                    public ListUserAssessmentsRequest.Builder get() {
                        return ListUserAssessmentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListUserAssessmentsResponse, String>() {
                    @Override
                    public String apply(ListUserAssessmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUserAssessmentsRequest.Builder>,
                        ListUserAssessmentsRequest>() {
                    @Override
                    public ListUserAssessmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUserAssessmentsRequest.Builder>
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
                        ListUserAssessmentsRequest, ListUserAssessmentsResponse>() {
                    @Override
                    public ListUserAssessmentsResponse apply(ListUserAssessmentsRequest request) {
                        return client.listUserAssessments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.UserAssessmentSummary} objects
     * contained in responses from the listUserAssessments operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.UserAssessmentSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.UserAssessmentSummary>
            listUserAssessmentsRecordIterator(final ListUserAssessmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListUserAssessmentsRequest.Builder, ListUserAssessmentsRequest,
                ListUserAssessmentsResponse, com.oracle.bmc.datasafe.model.UserAssessmentSummary>(
                new com.google.common.base.Supplier<ListUserAssessmentsRequest.Builder>() {
                    @Override
                    public ListUserAssessmentsRequest.Builder get() {
                        return ListUserAssessmentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListUserAssessmentsResponse, String>() {
                    @Override
                    public String apply(ListUserAssessmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUserAssessmentsRequest.Builder>,
                        ListUserAssessmentsRequest>() {
                    @Override
                    public ListUserAssessmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUserAssessmentsRequest.Builder>
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
                        ListUserAssessmentsRequest, ListUserAssessmentsResponse>() {
                    @Override
                    public ListUserAssessmentsResponse apply(ListUserAssessmentsRequest request) {
                        return client.listUserAssessments(request);
                    }
                },
                new com.google.common.base.Function<
                        ListUserAssessmentsResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.UserAssessmentSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.UserAssessmentSummary>
                            apply(ListUserAssessmentsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listUsers operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListUsersResponse> listUsersResponseIterator(final ListUsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListUsersRequest.Builder, ListUsersRequest, ListUsersResponse>(
                new com.google.common.base.Supplier<ListUsersRequest.Builder>() {
                    @Override
                    public ListUsersRequest.Builder get() {
                        return ListUsersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListUsersResponse, String>() {
                    @Override
                    public String apply(ListUsersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUsersRequest.Builder>,
                        ListUsersRequest>() {
                    @Override
                    public ListUsersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUsersRequest.Builder>
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
                new com.google.common.base.Function<ListUsersRequest, ListUsersResponse>() {
                    @Override
                    public ListUsersResponse apply(ListUsersRequest request) {
                        return client.listUsers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.UserSummary} objects
     * contained in responses from the listUsers operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.UserSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.UserSummary> listUsersRecordIterator(
            final ListUsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListUsersRequest.Builder, ListUsersRequest, ListUsersResponse,
                com.oracle.bmc.datasafe.model.UserSummary>(
                new com.google.common.base.Supplier<ListUsersRequest.Builder>() {
                    @Override
                    public ListUsersRequest.Builder get() {
                        return ListUsersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListUsersResponse, String>() {
                    @Override
                    public String apply(ListUsersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUsersRequest.Builder>,
                        ListUsersRequest>() {
                    @Override
                    public ListUsersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUsersRequest.Builder>
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
                new com.google.common.base.Function<ListUsersRequest, ListUsersResponse>() {
                    @Override
                    public ListUsersResponse apply(ListUsersRequest request) {
                        return client.listUsers(request);
                    }
                },
                new com.google.common.base.Function<
                        ListUsersResponse,
                        java.util.List<com.oracle.bmc.datasafe.model.UserSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.UserSummary> apply(
                            ListUsersResponse response) {
                        return response.getItems();
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.WorkRequestError} objects
     * contained in responses from the listWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse, com.oracle.bmc.datasafe.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.datasafe.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.WorkRequestError> apply(
                            ListWorkRequestErrorsResponse response) {
                        return response.getItems();
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.WorkRequestLogEntry} objects
     * contained in responses from the listWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.WorkRequestLogEntry} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse, com.oracle.bmc.datasafe.model.WorkRequestLogEntry>(
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
                        java.util.List<com.oracle.bmc.datasafe.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.WorkRequestLogEntry> apply(
                            ListWorkRequestLogsResponse response) {
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datasafe.model.WorkRequestSummary} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datasafe.model.WorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datasafe.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.datasafe.model.WorkRequestSummary>(
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
                        java.util.List<com.oracle.bmc.datasafe.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.datasafe.model.WorkRequestSummary> apply(
                            ListWorkRequestsResponse response) {
                        return response.getItems();
                    }
                });
    }
}
