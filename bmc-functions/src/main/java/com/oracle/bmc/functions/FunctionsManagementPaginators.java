/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions;

import com.oracle.bmc.functions.requests.*;
import com.oracle.bmc.functions.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of FunctionsManagement where multiple pages of data may be fetched. Two
 * styles of iteration are supported:
 *
 * <ul>
 *   <li>Iterating over the Response objects returned by the list operation. These are referred to
 *       as ResponseIterators, and the methods are suffixed with ResponseIterator. For example:
 *       <i>listUsersResponseIterator</i>
 *   <li>Iterating over the resources/records being listed. These are referred to as
 *       RecordIterators, and the methods are suffixed with RecordIterator. For example:
 *       <i>listUsersRecordIterator</i>
 * </ul>
 *
 * These iterables abstract away the need to write code to manually handle pagination via looping
 * and using the page tokens. They will automatically fetch more data from the service when
 * required.
 *
 * <p>As an example, if we were using the ListUsers operation in IdentityService, then the {@link
 * java.lang.Iterable} returned by calling a ResponseIterator method would iterate over the
 * ListUsersResponse objects returned by each ListUsers call, whereas the {@link java.lang.Iterable}
 * returned by calling a RecordIterator method would iterate over the User records and we don't have
 * to deal with ListUsersResponse objects at all. In either case, pagination will be automatically
 * handled so we can iterate until there are no more responses or no more resources/records
 * available.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class FunctionsManagementPaginators {
    private final FunctionsManagement client;

    public FunctionsManagementPaginators(FunctionsManagement client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listApplications operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListApplicationsResponse> listApplicationsResponseIterator(
            final ListApplicationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListApplicationsRequest.Builder, ListApplicationsRequest, ListApplicationsResponse>(
                new java.util.function.Supplier<ListApplicationsRequest.Builder>() {
                    @Override
                    public ListApplicationsRequest.Builder get() {
                        return ListApplicationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListApplicationsResponse, String>() {
                    @Override
                    public String apply(ListApplicationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListApplicationsRequest.Builder>,
                        ListApplicationsRequest>() {
                    @Override
                    public ListApplicationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListApplicationsRequest.Builder>
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
                        ListApplicationsRequest, ListApplicationsResponse>() {
                    @Override
                    public ListApplicationsResponse apply(ListApplicationsRequest request) {
                        return client.listApplications(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.functions.model.ApplicationSummary} objects contained in responses from the
     * listApplications operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.functions.model.ApplicationSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.functions.model.ApplicationSummary>
            listApplicationsRecordIterator(final ListApplicationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListApplicationsRequest.Builder,
                ListApplicationsRequest,
                ListApplicationsResponse,
                com.oracle.bmc.functions.model.ApplicationSummary>(
                new java.util.function.Supplier<ListApplicationsRequest.Builder>() {
                    @Override
                    public ListApplicationsRequest.Builder get() {
                        return ListApplicationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListApplicationsResponse, String>() {
                    @Override
                    public String apply(ListApplicationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListApplicationsRequest.Builder>,
                        ListApplicationsRequest>() {
                    @Override
                    public ListApplicationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListApplicationsRequest.Builder>
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
                        ListApplicationsRequest, ListApplicationsResponse>() {
                    @Override
                    public ListApplicationsResponse apply(ListApplicationsRequest request) {
                        return client.listApplications(request);
                    }
                },
                new java.util.function.Function<
                        ListApplicationsResponse,
                        java.util.List<com.oracle.bmc.functions.model.ApplicationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.functions.model.ApplicationSummary> apply(
                            ListApplicationsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listFunctions
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListFunctionsResponse> listFunctionsResponseIterator(
            final ListFunctionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFunctionsRequest.Builder, ListFunctionsRequest, ListFunctionsResponse>(
                new java.util.function.Supplier<ListFunctionsRequest.Builder>() {
                    @Override
                    public ListFunctionsRequest.Builder get() {
                        return ListFunctionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFunctionsResponse, String>() {
                    @Override
                    public String apply(ListFunctionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFunctionsRequest.Builder>,
                        ListFunctionsRequest>() {
                    @Override
                    public ListFunctionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFunctionsRequest.Builder>
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
                new java.util.function.Function<ListFunctionsRequest, ListFunctionsResponse>() {
                    @Override
                    public ListFunctionsResponse apply(ListFunctionsRequest request) {
                        return client.listFunctions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.functions.model.FunctionSummary} objects contained in responses from the
     * listFunctions operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.functions.model.FunctionSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.functions.model.FunctionSummary> listFunctionsRecordIterator(
            final ListFunctionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFunctionsRequest.Builder,
                ListFunctionsRequest,
                ListFunctionsResponse,
                com.oracle.bmc.functions.model.FunctionSummary>(
                new java.util.function.Supplier<ListFunctionsRequest.Builder>() {
                    @Override
                    public ListFunctionsRequest.Builder get() {
                        return ListFunctionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFunctionsResponse, String>() {
                    @Override
                    public String apply(ListFunctionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFunctionsRequest.Builder>,
                        ListFunctionsRequest>() {
                    @Override
                    public ListFunctionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFunctionsRequest.Builder>
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
                new java.util.function.Function<ListFunctionsRequest, ListFunctionsResponse>() {
                    @Override
                    public ListFunctionsResponse apply(ListFunctionsRequest request) {
                        return client.listFunctions(request);
                    }
                },
                new java.util.function.Function<
                        ListFunctionsResponse,
                        java.util.List<com.oracle.bmc.functions.model.FunctionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.functions.model.FunctionSummary> apply(
                            ListFunctionsResponse response) {
                        return response.getItems();
                    }
                });
    }
}
