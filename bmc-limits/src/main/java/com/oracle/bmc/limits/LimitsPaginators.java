/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.limits;

import com.oracle.bmc.limits.requests.*;
import com.oracle.bmc.limits.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Limits where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181025")
@lombok.RequiredArgsConstructor
public class LimitsPaginators {
    private final Limits client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listLimitDefinitions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListLimitDefinitionsResponse> listLimitDefinitionsResponseIterator(
            final ListLimitDefinitionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLimitDefinitionsRequest.Builder, ListLimitDefinitionsRequest,
                ListLimitDefinitionsResponse>(
                new com.google.common.base.Supplier<ListLimitDefinitionsRequest.Builder>() {
                    @Override
                    public ListLimitDefinitionsRequest.Builder get() {
                        return ListLimitDefinitionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLimitDefinitionsResponse, String>() {
                    @Override
                    public String apply(ListLimitDefinitionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLimitDefinitionsRequest.Builder>,
                        ListLimitDefinitionsRequest>() {
                    @Override
                    public ListLimitDefinitionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLimitDefinitionsRequest.Builder>
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
                        ListLimitDefinitionsRequest, ListLimitDefinitionsResponse>() {
                    @Override
                    public ListLimitDefinitionsResponse apply(ListLimitDefinitionsRequest request) {
                        return client.listLimitDefinitions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.limits.model.LimitDefinitionSummary} objects
     * contained in responses from the listLimitDefinitions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.limits.model.LimitDefinitionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.limits.model.LimitDefinitionSummary>
            listLimitDefinitionsRecordIterator(final ListLimitDefinitionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLimitDefinitionsRequest.Builder, ListLimitDefinitionsRequest,
                ListLimitDefinitionsResponse, com.oracle.bmc.limits.model.LimitDefinitionSummary>(
                new com.google.common.base.Supplier<ListLimitDefinitionsRequest.Builder>() {
                    @Override
                    public ListLimitDefinitionsRequest.Builder get() {
                        return ListLimitDefinitionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLimitDefinitionsResponse, String>() {
                    @Override
                    public String apply(ListLimitDefinitionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLimitDefinitionsRequest.Builder>,
                        ListLimitDefinitionsRequest>() {
                    @Override
                    public ListLimitDefinitionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLimitDefinitionsRequest.Builder>
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
                        ListLimitDefinitionsRequest, ListLimitDefinitionsResponse>() {
                    @Override
                    public ListLimitDefinitionsResponse apply(ListLimitDefinitionsRequest request) {
                        return client.listLimitDefinitions(request);
                    }
                },
                new com.google.common.base.Function<
                        ListLimitDefinitionsResponse,
                        java.util.List<com.oracle.bmc.limits.model.LimitDefinitionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.limits.model.LimitDefinitionSummary> apply(
                            ListLimitDefinitionsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listLimitValues operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListLimitValuesResponse> listLimitValuesResponseIterator(
            final ListLimitValuesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLimitValuesRequest.Builder, ListLimitValuesRequest, ListLimitValuesResponse>(
                new com.google.common.base.Supplier<ListLimitValuesRequest.Builder>() {
                    @Override
                    public ListLimitValuesRequest.Builder get() {
                        return ListLimitValuesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLimitValuesResponse, String>() {
                    @Override
                    public String apply(ListLimitValuesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLimitValuesRequest.Builder>,
                        ListLimitValuesRequest>() {
                    @Override
                    public ListLimitValuesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLimitValuesRequest.Builder>
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
                        ListLimitValuesRequest, ListLimitValuesResponse>() {
                    @Override
                    public ListLimitValuesResponse apply(ListLimitValuesRequest request) {
                        return client.listLimitValues(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.limits.model.LimitValueSummary} objects
     * contained in responses from the listLimitValues operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.limits.model.LimitValueSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.limits.model.LimitValueSummary> listLimitValuesRecordIterator(
            final ListLimitValuesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLimitValuesRequest.Builder, ListLimitValuesRequest, ListLimitValuesResponse,
                com.oracle.bmc.limits.model.LimitValueSummary>(
                new com.google.common.base.Supplier<ListLimitValuesRequest.Builder>() {
                    @Override
                    public ListLimitValuesRequest.Builder get() {
                        return ListLimitValuesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLimitValuesResponse, String>() {
                    @Override
                    public String apply(ListLimitValuesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLimitValuesRequest.Builder>,
                        ListLimitValuesRequest>() {
                    @Override
                    public ListLimitValuesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLimitValuesRequest.Builder>
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
                        ListLimitValuesRequest, ListLimitValuesResponse>() {
                    @Override
                    public ListLimitValuesResponse apply(ListLimitValuesRequest request) {
                        return client.listLimitValues(request);
                    }
                },
                new com.google.common.base.Function<
                        ListLimitValuesResponse,
                        java.util.List<com.oracle.bmc.limits.model.LimitValueSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.limits.model.LimitValueSummary> apply(
                            ListLimitValuesResponse response) {
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.limits.model.ServiceSummary} objects
     * contained in responses from the listServices operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.limits.model.ServiceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.limits.model.ServiceSummary> listServicesRecordIterator(
            final ListServicesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListServicesRequest.Builder, ListServicesRequest, ListServicesResponse,
                com.oracle.bmc.limits.model.ServiceSummary>(
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
                        ListServicesResponse,
                        java.util.List<com.oracle.bmc.limits.model.ServiceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.limits.model.ServiceSummary> apply(
                            ListServicesResponse response) {
                        return response.getItems();
                    }
                });
    }
}
