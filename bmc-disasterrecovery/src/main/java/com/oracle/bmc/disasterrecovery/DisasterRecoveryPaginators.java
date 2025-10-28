/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery;

import com.oracle.bmc.disasterrecovery.requests.*;
import com.oracle.bmc.disasterrecovery.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of DisasterRecovery where multiple pages of data may be fetched. Two
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public class DisasterRecoveryPaginators {
    private final DisasterRecovery client;

    public DisasterRecoveryPaginators(DisasterRecovery client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAutomaticDrConfigurations operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAutomaticDrConfigurationsResponse>
            listAutomaticDrConfigurationsResponseIterator(
                    final ListAutomaticDrConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAutomaticDrConfigurationsRequest.Builder,
                ListAutomaticDrConfigurationsRequest,
                ListAutomaticDrConfigurationsResponse>(
                new java.util.function.Supplier<ListAutomaticDrConfigurationsRequest.Builder>() {
                    @Override
                    public ListAutomaticDrConfigurationsRequest.Builder get() {
                        return ListAutomaticDrConfigurationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAutomaticDrConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListAutomaticDrConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutomaticDrConfigurationsRequest.Builder>,
                        ListAutomaticDrConfigurationsRequest>() {
                    @Override
                    public ListAutomaticDrConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutomaticDrConfigurationsRequest.Builder>
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
                        ListAutomaticDrConfigurationsRequest,
                        ListAutomaticDrConfigurationsResponse>() {
                    @Override
                    public ListAutomaticDrConfigurationsResponse apply(
                            ListAutomaticDrConfigurationsRequest request) {
                        return client.listAutomaticDrConfigurations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.disasterrecovery.model.AutomaticDrConfigurationSummary} objects contained in
     * responses from the listAutomaticDrConfigurations operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.disasterrecovery.model.AutomaticDrConfigurationSummary} objects contained
     *     in responses received from the service.
     */
    public Iterable<com.oracle.bmc.disasterrecovery.model.AutomaticDrConfigurationSummary>
            listAutomaticDrConfigurationsRecordIterator(
                    final ListAutomaticDrConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAutomaticDrConfigurationsRequest.Builder,
                ListAutomaticDrConfigurationsRequest,
                ListAutomaticDrConfigurationsResponse,
                com.oracle.bmc.disasterrecovery.model.AutomaticDrConfigurationSummary>(
                new java.util.function.Supplier<ListAutomaticDrConfigurationsRequest.Builder>() {
                    @Override
                    public ListAutomaticDrConfigurationsRequest.Builder get() {
                        return ListAutomaticDrConfigurationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAutomaticDrConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListAutomaticDrConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutomaticDrConfigurationsRequest.Builder>,
                        ListAutomaticDrConfigurationsRequest>() {
                    @Override
                    public ListAutomaticDrConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutomaticDrConfigurationsRequest.Builder>
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
                        ListAutomaticDrConfigurationsRequest,
                        ListAutomaticDrConfigurationsResponse>() {
                    @Override
                    public ListAutomaticDrConfigurationsResponse apply(
                            ListAutomaticDrConfigurationsRequest request) {
                        return client.listAutomaticDrConfigurations(request);
                    }
                },
                new java.util.function.Function<
                        ListAutomaticDrConfigurationsResponse,
                        java.util.List<
                                com.oracle.bmc.disasterrecovery.model
                                        .AutomaticDrConfigurationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.disasterrecovery.model
                                            .AutomaticDrConfigurationSummary>
                            apply(ListAutomaticDrConfigurationsResponse response) {
                        return response.getAutomaticDrConfigurationCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDrPlanExecutions operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDrPlanExecutionsResponse> listDrPlanExecutionsResponseIterator(
            final ListDrPlanExecutionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDrPlanExecutionsRequest.Builder,
                ListDrPlanExecutionsRequest,
                ListDrPlanExecutionsResponse>(
                new java.util.function.Supplier<ListDrPlanExecutionsRequest.Builder>() {
                    @Override
                    public ListDrPlanExecutionsRequest.Builder get() {
                        return ListDrPlanExecutionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDrPlanExecutionsResponse, String>() {
                    @Override
                    public String apply(ListDrPlanExecutionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDrPlanExecutionsRequest.Builder>,
                        ListDrPlanExecutionsRequest>() {
                    @Override
                    public ListDrPlanExecutionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDrPlanExecutionsRequest.Builder>
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
                        ListDrPlanExecutionsRequest, ListDrPlanExecutionsResponse>() {
                    @Override
                    public ListDrPlanExecutionsResponse apply(ListDrPlanExecutionsRequest request) {
                        return client.listDrPlanExecutions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.disasterrecovery.model.DrPlanExecutionSummary} objects contained in responses
     * from the listDrPlanExecutions operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.disasterrecovery.model.DrPlanExecutionSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.disasterrecovery.model.DrPlanExecutionSummary>
            listDrPlanExecutionsRecordIterator(final ListDrPlanExecutionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDrPlanExecutionsRequest.Builder,
                ListDrPlanExecutionsRequest,
                ListDrPlanExecutionsResponse,
                com.oracle.bmc.disasterrecovery.model.DrPlanExecutionSummary>(
                new java.util.function.Supplier<ListDrPlanExecutionsRequest.Builder>() {
                    @Override
                    public ListDrPlanExecutionsRequest.Builder get() {
                        return ListDrPlanExecutionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDrPlanExecutionsResponse, String>() {
                    @Override
                    public String apply(ListDrPlanExecutionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDrPlanExecutionsRequest.Builder>,
                        ListDrPlanExecutionsRequest>() {
                    @Override
                    public ListDrPlanExecutionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDrPlanExecutionsRequest.Builder>
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
                        ListDrPlanExecutionsRequest, ListDrPlanExecutionsResponse>() {
                    @Override
                    public ListDrPlanExecutionsResponse apply(ListDrPlanExecutionsRequest request) {
                        return client.listDrPlanExecutions(request);
                    }
                },
                new java.util.function.Function<
                        ListDrPlanExecutionsResponse,
                        java.util.List<
                                com.oracle.bmc.disasterrecovery.model.DrPlanExecutionSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.disasterrecovery.model.DrPlanExecutionSummary>
                            apply(ListDrPlanExecutionsResponse response) {
                        return response.getDrPlanExecutionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDrPlans
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDrPlansResponse> listDrPlansResponseIterator(
            final ListDrPlansRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDrPlansRequest.Builder, ListDrPlansRequest, ListDrPlansResponse>(
                new java.util.function.Supplier<ListDrPlansRequest.Builder>() {
                    @Override
                    public ListDrPlansRequest.Builder get() {
                        return ListDrPlansRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDrPlansResponse, String>() {
                    @Override
                    public String apply(ListDrPlansResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDrPlansRequest.Builder>,
                        ListDrPlansRequest>() {
                    @Override
                    public ListDrPlansRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDrPlansRequest.Builder>
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
                new java.util.function.Function<ListDrPlansRequest, ListDrPlansResponse>() {
                    @Override
                    public ListDrPlansResponse apply(ListDrPlansRequest request) {
                        return client.listDrPlans(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.disasterrecovery.model.DrPlanSummary} objects contained in responses from the
     * listDrPlans operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.disasterrecovery.model.DrPlanSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.disasterrecovery.model.DrPlanSummary> listDrPlansRecordIterator(
            final ListDrPlansRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDrPlansRequest.Builder,
                ListDrPlansRequest,
                ListDrPlansResponse,
                com.oracle.bmc.disasterrecovery.model.DrPlanSummary>(
                new java.util.function.Supplier<ListDrPlansRequest.Builder>() {
                    @Override
                    public ListDrPlansRequest.Builder get() {
                        return ListDrPlansRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDrPlansResponse, String>() {
                    @Override
                    public String apply(ListDrPlansResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDrPlansRequest.Builder>,
                        ListDrPlansRequest>() {
                    @Override
                    public ListDrPlansRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDrPlansRequest.Builder>
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
                new java.util.function.Function<ListDrPlansRequest, ListDrPlansResponse>() {
                    @Override
                    public ListDrPlansResponse apply(ListDrPlansRequest request) {
                        return client.listDrPlans(request);
                    }
                },
                new java.util.function.Function<
                        ListDrPlansResponse,
                        java.util.List<com.oracle.bmc.disasterrecovery.model.DrPlanSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.disasterrecovery.model.DrPlanSummary>
                            apply(ListDrPlansResponse response) {
                        return response.getDrPlanCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDrProtectionGroups operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDrProtectionGroupsResponse> listDrProtectionGroupsResponseIterator(
            final ListDrProtectionGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDrProtectionGroupsRequest.Builder,
                ListDrProtectionGroupsRequest,
                ListDrProtectionGroupsResponse>(
                new java.util.function.Supplier<ListDrProtectionGroupsRequest.Builder>() {
                    @Override
                    public ListDrProtectionGroupsRequest.Builder get() {
                        return ListDrProtectionGroupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDrProtectionGroupsResponse, String>() {
                    @Override
                    public String apply(ListDrProtectionGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDrProtectionGroupsRequest.Builder>,
                        ListDrProtectionGroupsRequest>() {
                    @Override
                    public ListDrProtectionGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDrProtectionGroupsRequest.Builder>
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
                        ListDrProtectionGroupsRequest, ListDrProtectionGroupsResponse>() {
                    @Override
                    public ListDrProtectionGroupsResponse apply(
                            ListDrProtectionGroupsRequest request) {
                        return client.listDrProtectionGroups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.disasterrecovery.model.DrProtectionGroupSummary} objects contained in
     * responses from the listDrProtectionGroups operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.disasterrecovery.model.DrProtectionGroupSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.disasterrecovery.model.DrProtectionGroupSummary>
            listDrProtectionGroupsRecordIterator(final ListDrProtectionGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDrProtectionGroupsRequest.Builder,
                ListDrProtectionGroupsRequest,
                ListDrProtectionGroupsResponse,
                com.oracle.bmc.disasterrecovery.model.DrProtectionGroupSummary>(
                new java.util.function.Supplier<ListDrProtectionGroupsRequest.Builder>() {
                    @Override
                    public ListDrProtectionGroupsRequest.Builder get() {
                        return ListDrProtectionGroupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDrProtectionGroupsResponse, String>() {
                    @Override
                    public String apply(ListDrProtectionGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDrProtectionGroupsRequest.Builder>,
                        ListDrProtectionGroupsRequest>() {
                    @Override
                    public ListDrProtectionGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDrProtectionGroupsRequest.Builder>
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
                        ListDrProtectionGroupsRequest, ListDrProtectionGroupsResponse>() {
                    @Override
                    public ListDrProtectionGroupsResponse apply(
                            ListDrProtectionGroupsRequest request) {
                        return client.listDrProtectionGroups(request);
                    }
                },
                new java.util.function.Function<
                        ListDrProtectionGroupsResponse,
                        java.util.List<
                                com.oracle.bmc.disasterrecovery.model.DrProtectionGroupSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.disasterrecovery.model.DrProtectionGroupSummary>
                            apply(ListDrProtectionGroupsResponse response) {
                        return response.getDrProtectionGroupCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWorkRequestErrorsResponse> listWorkRequestErrorsResponseIterator(
            final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse>(
                new java.util.function.Supplier<ListWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListWorkRequestErrorsRequest.Builder get() {
                        return ListWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestErrorsRequest.Builder>,
                        ListWorkRequestErrorsRequest>() {
                    @Override
                    public ListWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestErrorsRequest.Builder>
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
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>() {
                    @Override
                    public ListWorkRequestErrorsResponse apply(
                            ListWorkRequestErrorsRequest request) {
                        return client.listWorkRequestErrors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.disasterrecovery.model.WorkRequestError} objects contained in responses from
     * the listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.disasterrecovery.model.WorkRequestError} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.disasterrecovery.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.disasterrecovery.model.WorkRequestError>(
                new java.util.function.Supplier<ListWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListWorkRequestErrorsRequest.Builder get() {
                        return ListWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestErrorsRequest.Builder>,
                        ListWorkRequestErrorsRequest>() {
                    @Override
                    public ListWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestErrorsRequest.Builder>
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
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>() {
                    @Override
                    public ListWorkRequestErrorsResponse apply(
                            ListWorkRequestErrorsRequest request) {
                        return client.listWorkRequestErrors(request);
                    }
                },
                new java.util.function.Function<
                        ListWorkRequestErrorsResponse,
                        java.util.List<com.oracle.bmc.disasterrecovery.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.disasterrecovery.model.WorkRequestError>
                            apply(ListWorkRequestErrorsResponse response) {
                        return response.getWorkRequestErrorCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listWorkRequestLogs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWorkRequestLogsResponse> listWorkRequestLogsResponseIterator(
            final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse>(
                new java.util.function.Supplier<ListWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListWorkRequestLogsRequest.Builder get() {
                        return ListWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestLogsRequest.Builder>,
                        ListWorkRequestLogsRequest>() {
                    @Override
                    public ListWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestLogsRequest.Builder>
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
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>() {
                    @Override
                    public ListWorkRequestLogsResponse apply(ListWorkRequestLogsRequest request) {
                        return client.listWorkRequestLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.disasterrecovery.model.WorkRequestLogEntry} objects contained in responses
     * from the listWorkRequestLogs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.disasterrecovery.model.WorkRequestLogEntry} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.disasterrecovery.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.disasterrecovery.model.WorkRequestLogEntry>(
                new java.util.function.Supplier<ListWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListWorkRequestLogsRequest.Builder get() {
                        return ListWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestLogsRequest.Builder>,
                        ListWorkRequestLogsRequest>() {
                    @Override
                    public ListWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestLogsRequest.Builder>
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
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>() {
                    @Override
                    public ListWorkRequestLogsResponse apply(ListWorkRequestLogsRequest request) {
                        return client.listWorkRequestLogs(request);
                    }
                },
                new java.util.function.Function<
                        ListWorkRequestLogsResponse,
                        java.util.List<
                                com.oracle.bmc.disasterrecovery.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.disasterrecovery.model.WorkRequestLogEntry>
                            apply(ListWorkRequestLogsResponse response) {
                        return response.getWorkRequestLogEntryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWorkRequestsResponse> listWorkRequestsResponseIterator(
            final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse>(
                new java.util.function.Supplier<ListWorkRequestsRequest.Builder>() {
                    @Override
                    public ListWorkRequestsRequest.Builder get() {
                        return ListWorkRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestsRequest.Builder>,
                        ListWorkRequestsRequest>() {
                    @Override
                    public ListWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestsRequest.Builder>
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
                        ListWorkRequestsRequest, ListWorkRequestsResponse>() {
                    @Override
                    public ListWorkRequestsResponse apply(ListWorkRequestsRequest request) {
                        return client.listWorkRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.disasterrecovery.model.WorkRequestSummary} objects contained in responses from
     * the listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.disasterrecovery.model.WorkRequestSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.disasterrecovery.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder,
                ListWorkRequestsRequest,
                ListWorkRequestsResponse,
                com.oracle.bmc.disasterrecovery.model.WorkRequestSummary>(
                new java.util.function.Supplier<ListWorkRequestsRequest.Builder>() {
                    @Override
                    public ListWorkRequestsRequest.Builder get() {
                        return ListWorkRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestsRequest.Builder>,
                        ListWorkRequestsRequest>() {
                    @Override
                    public ListWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestsRequest.Builder>
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
                        ListWorkRequestsRequest, ListWorkRequestsResponse>() {
                    @Override
                    public ListWorkRequestsResponse apply(ListWorkRequestsRequest request) {
                        return client.listWorkRequests(request);
                    }
                },
                new java.util.function.Function<
                        ListWorkRequestsResponse,
                        java.util.List<
                                com.oracle.bmc.disasterrecovery.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.disasterrecovery.model.WorkRequestSummary>
                            apply(ListWorkRequestsResponse response) {
                        return response.getWorkRequestSummaryCollection().getItems();
                    }
                });
    }
}
