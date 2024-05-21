/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps;

import com.oracle.bmc.fusionapps.requests.*;
import com.oracle.bmc.fusionapps.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of FusionApplications where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
public class FusionApplicationsPaginators {
    private final FusionApplications client;

    public FusionApplicationsPaginators(FusionApplications client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDataMaskingActivities operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDataMaskingActivitiesResponse> listDataMaskingActivitiesResponseIterator(
            final ListDataMaskingActivitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDataMaskingActivitiesRequest.Builder, ListDataMaskingActivitiesRequest,
                ListDataMaskingActivitiesResponse>(
                new java.util.function.Supplier<ListDataMaskingActivitiesRequest.Builder>() {
                    @Override
                    public ListDataMaskingActivitiesRequest.Builder get() {
                        return ListDataMaskingActivitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDataMaskingActivitiesResponse, String>() {
                    @Override
                    public String apply(ListDataMaskingActivitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataMaskingActivitiesRequest.Builder>,
                        ListDataMaskingActivitiesRequest>() {
                    @Override
                    public ListDataMaskingActivitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataMaskingActivitiesRequest.Builder>
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
                        ListDataMaskingActivitiesRequest, ListDataMaskingActivitiesResponse>() {
                    @Override
                    public ListDataMaskingActivitiesResponse apply(
                            ListDataMaskingActivitiesRequest request) {
                        return client.listDataMaskingActivities(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.fusionapps.model.DataMaskingActivitySummary} objects
     * contained in responses from the listDataMaskingActivities operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.fusionapps.model.DataMaskingActivitySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.fusionapps.model.DataMaskingActivitySummary>
            listDataMaskingActivitiesRecordIterator(
                    final ListDataMaskingActivitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDataMaskingActivitiesRequest.Builder, ListDataMaskingActivitiesRequest,
                ListDataMaskingActivitiesResponse,
                com.oracle.bmc.fusionapps.model.DataMaskingActivitySummary>(
                new java.util.function.Supplier<ListDataMaskingActivitiesRequest.Builder>() {
                    @Override
                    public ListDataMaskingActivitiesRequest.Builder get() {
                        return ListDataMaskingActivitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDataMaskingActivitiesResponse, String>() {
                    @Override
                    public String apply(ListDataMaskingActivitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataMaskingActivitiesRequest.Builder>,
                        ListDataMaskingActivitiesRequest>() {
                    @Override
                    public ListDataMaskingActivitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataMaskingActivitiesRequest.Builder>
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
                        ListDataMaskingActivitiesRequest, ListDataMaskingActivitiesResponse>() {
                    @Override
                    public ListDataMaskingActivitiesResponse apply(
                            ListDataMaskingActivitiesRequest request) {
                        return client.listDataMaskingActivities(request);
                    }
                },
                new java.util.function.Function<
                        ListDataMaskingActivitiesResponse,
                        java.util.List<
                                com.oracle.bmc.fusionapps.model.DataMaskingActivitySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.fusionapps.model.DataMaskingActivitySummary>
                            apply(ListDataMaskingActivitiesResponse response) {
                        return response.getDataMaskingActivityCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listFusionEnvironmentFamilies operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListFusionEnvironmentFamiliesResponse>
            listFusionEnvironmentFamiliesResponseIterator(
                    final ListFusionEnvironmentFamiliesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFusionEnvironmentFamiliesRequest.Builder, ListFusionEnvironmentFamiliesRequest,
                ListFusionEnvironmentFamiliesResponse>(
                new java.util.function.Supplier<ListFusionEnvironmentFamiliesRequest.Builder>() {
                    @Override
                    public ListFusionEnvironmentFamiliesRequest.Builder get() {
                        return ListFusionEnvironmentFamiliesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFusionEnvironmentFamiliesResponse, String>() {
                    @Override
                    public String apply(ListFusionEnvironmentFamiliesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFusionEnvironmentFamiliesRequest.Builder>,
                        ListFusionEnvironmentFamiliesRequest>() {
                    @Override
                    public ListFusionEnvironmentFamiliesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFusionEnvironmentFamiliesRequest.Builder>
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
                        ListFusionEnvironmentFamiliesRequest,
                        ListFusionEnvironmentFamiliesResponse>() {
                    @Override
                    public ListFusionEnvironmentFamiliesResponse apply(
                            ListFusionEnvironmentFamiliesRequest request) {
                        return client.listFusionEnvironmentFamilies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.fusionapps.model.FusionEnvironmentFamilySummary} objects
     * contained in responses from the listFusionEnvironmentFamilies operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.fusionapps.model.FusionEnvironmentFamilySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.fusionapps.model.FusionEnvironmentFamilySummary>
            listFusionEnvironmentFamiliesRecordIterator(
                    final ListFusionEnvironmentFamiliesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFusionEnvironmentFamiliesRequest.Builder, ListFusionEnvironmentFamiliesRequest,
                ListFusionEnvironmentFamiliesResponse,
                com.oracle.bmc.fusionapps.model.FusionEnvironmentFamilySummary>(
                new java.util.function.Supplier<ListFusionEnvironmentFamiliesRequest.Builder>() {
                    @Override
                    public ListFusionEnvironmentFamiliesRequest.Builder get() {
                        return ListFusionEnvironmentFamiliesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFusionEnvironmentFamiliesResponse, String>() {
                    @Override
                    public String apply(ListFusionEnvironmentFamiliesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFusionEnvironmentFamiliesRequest.Builder>,
                        ListFusionEnvironmentFamiliesRequest>() {
                    @Override
                    public ListFusionEnvironmentFamiliesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFusionEnvironmentFamiliesRequest.Builder>
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
                        ListFusionEnvironmentFamiliesRequest,
                        ListFusionEnvironmentFamiliesResponse>() {
                    @Override
                    public ListFusionEnvironmentFamiliesResponse apply(
                            ListFusionEnvironmentFamiliesRequest request) {
                        return client.listFusionEnvironmentFamilies(request);
                    }
                },
                new java.util.function.Function<
                        ListFusionEnvironmentFamiliesResponse,
                        java.util.List<
                                com.oracle.bmc.fusionapps.model.FusionEnvironmentFamilySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.fusionapps.model.FusionEnvironmentFamilySummary>
                            apply(ListFusionEnvironmentFamiliesResponse response) {
                        return response.getFusionEnvironmentFamilyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listFusionEnvironments operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListFusionEnvironmentsResponse> listFusionEnvironmentsResponseIterator(
            final ListFusionEnvironmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFusionEnvironmentsRequest.Builder, ListFusionEnvironmentsRequest,
                ListFusionEnvironmentsResponse>(
                new java.util.function.Supplier<ListFusionEnvironmentsRequest.Builder>() {
                    @Override
                    public ListFusionEnvironmentsRequest.Builder get() {
                        return ListFusionEnvironmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFusionEnvironmentsResponse, String>() {
                    @Override
                    public String apply(ListFusionEnvironmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFusionEnvironmentsRequest.Builder>,
                        ListFusionEnvironmentsRequest>() {
                    @Override
                    public ListFusionEnvironmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFusionEnvironmentsRequest.Builder>
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
                        ListFusionEnvironmentsRequest, ListFusionEnvironmentsResponse>() {
                    @Override
                    public ListFusionEnvironmentsResponse apply(
                            ListFusionEnvironmentsRequest request) {
                        return client.listFusionEnvironments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.fusionapps.model.FusionEnvironmentSummary} objects
     * contained in responses from the listFusionEnvironments operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.fusionapps.model.FusionEnvironmentSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.fusionapps.model.FusionEnvironmentSummary>
            listFusionEnvironmentsRecordIterator(final ListFusionEnvironmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFusionEnvironmentsRequest.Builder, ListFusionEnvironmentsRequest,
                ListFusionEnvironmentsResponse,
                com.oracle.bmc.fusionapps.model.FusionEnvironmentSummary>(
                new java.util.function.Supplier<ListFusionEnvironmentsRequest.Builder>() {
                    @Override
                    public ListFusionEnvironmentsRequest.Builder get() {
                        return ListFusionEnvironmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFusionEnvironmentsResponse, String>() {
                    @Override
                    public String apply(ListFusionEnvironmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFusionEnvironmentsRequest.Builder>,
                        ListFusionEnvironmentsRequest>() {
                    @Override
                    public ListFusionEnvironmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFusionEnvironmentsRequest.Builder>
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
                        ListFusionEnvironmentsRequest, ListFusionEnvironmentsResponse>() {
                    @Override
                    public ListFusionEnvironmentsResponse apply(
                            ListFusionEnvironmentsRequest request) {
                        return client.listFusionEnvironments(request);
                    }
                },
                new java.util.function.Function<
                        ListFusionEnvironmentsResponse,
                        java.util.List<
                                com.oracle.bmc.fusionapps.model.FusionEnvironmentSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.fusionapps.model.FusionEnvironmentSummary>
                            apply(ListFusionEnvironmentsResponse response) {
                        return response.getFusionEnvironmentCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listRefreshActivities operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListRefreshActivitiesResponse> listRefreshActivitiesResponseIterator(
            final ListRefreshActivitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRefreshActivitiesRequest.Builder, ListRefreshActivitiesRequest,
                ListRefreshActivitiesResponse>(
                new java.util.function.Supplier<ListRefreshActivitiesRequest.Builder>() {
                    @Override
                    public ListRefreshActivitiesRequest.Builder get() {
                        return ListRefreshActivitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRefreshActivitiesResponse, String>() {
                    @Override
                    public String apply(ListRefreshActivitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRefreshActivitiesRequest.Builder>,
                        ListRefreshActivitiesRequest>() {
                    @Override
                    public ListRefreshActivitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRefreshActivitiesRequest.Builder>
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
                        ListRefreshActivitiesRequest, ListRefreshActivitiesResponse>() {
                    @Override
                    public ListRefreshActivitiesResponse apply(
                            ListRefreshActivitiesRequest request) {
                        return client.listRefreshActivities(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.fusionapps.model.RefreshActivitySummary} objects
     * contained in responses from the listRefreshActivities operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.fusionapps.model.RefreshActivitySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.fusionapps.model.RefreshActivitySummary>
            listRefreshActivitiesRecordIterator(final ListRefreshActivitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRefreshActivitiesRequest.Builder, ListRefreshActivitiesRequest,
                ListRefreshActivitiesResponse,
                com.oracle.bmc.fusionapps.model.RefreshActivitySummary>(
                new java.util.function.Supplier<ListRefreshActivitiesRequest.Builder>() {
                    @Override
                    public ListRefreshActivitiesRequest.Builder get() {
                        return ListRefreshActivitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRefreshActivitiesResponse, String>() {
                    @Override
                    public String apply(ListRefreshActivitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRefreshActivitiesRequest.Builder>,
                        ListRefreshActivitiesRequest>() {
                    @Override
                    public ListRefreshActivitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRefreshActivitiesRequest.Builder>
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
                        ListRefreshActivitiesRequest, ListRefreshActivitiesResponse>() {
                    @Override
                    public ListRefreshActivitiesResponse apply(
                            ListRefreshActivitiesRequest request) {
                        return client.listRefreshActivities(request);
                    }
                },
                new java.util.function.Function<
                        ListRefreshActivitiesResponse,
                        java.util.List<com.oracle.bmc.fusionapps.model.RefreshActivitySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.fusionapps.model.RefreshActivitySummary>
                            apply(ListRefreshActivitiesResponse response) {
                        return response.getRefreshActivityCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listScheduledActivities operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListScheduledActivitiesResponse> listScheduledActivitiesResponseIterator(
            final ListScheduledActivitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListScheduledActivitiesRequest.Builder, ListScheduledActivitiesRequest,
                ListScheduledActivitiesResponse>(
                new java.util.function.Supplier<ListScheduledActivitiesRequest.Builder>() {
                    @Override
                    public ListScheduledActivitiesRequest.Builder get() {
                        return ListScheduledActivitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListScheduledActivitiesResponse, String>() {
                    @Override
                    public String apply(ListScheduledActivitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListScheduledActivitiesRequest.Builder>,
                        ListScheduledActivitiesRequest>() {
                    @Override
                    public ListScheduledActivitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListScheduledActivitiesRequest.Builder>
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
                        ListScheduledActivitiesRequest, ListScheduledActivitiesResponse>() {
                    @Override
                    public ListScheduledActivitiesResponse apply(
                            ListScheduledActivitiesRequest request) {
                        return client.listScheduledActivities(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.fusionapps.model.ScheduledActivitySummary} objects
     * contained in responses from the listScheduledActivities operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.fusionapps.model.ScheduledActivitySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.fusionapps.model.ScheduledActivitySummary>
            listScheduledActivitiesRecordIterator(final ListScheduledActivitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListScheduledActivitiesRequest.Builder, ListScheduledActivitiesRequest,
                ListScheduledActivitiesResponse,
                com.oracle.bmc.fusionapps.model.ScheduledActivitySummary>(
                new java.util.function.Supplier<ListScheduledActivitiesRequest.Builder>() {
                    @Override
                    public ListScheduledActivitiesRequest.Builder get() {
                        return ListScheduledActivitiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListScheduledActivitiesResponse, String>() {
                    @Override
                    public String apply(ListScheduledActivitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListScheduledActivitiesRequest.Builder>,
                        ListScheduledActivitiesRequest>() {
                    @Override
                    public ListScheduledActivitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListScheduledActivitiesRequest.Builder>
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
                        ListScheduledActivitiesRequest, ListScheduledActivitiesResponse>() {
                    @Override
                    public ListScheduledActivitiesResponse apply(
                            ListScheduledActivitiesRequest request) {
                        return client.listScheduledActivities(request);
                    }
                },
                new java.util.function.Function<
                        ListScheduledActivitiesResponse,
                        java.util.List<
                                com.oracle.bmc.fusionapps.model.ScheduledActivitySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.fusionapps.model.ScheduledActivitySummary>
                            apply(ListScheduledActivitiesResponse response) {
                        return response.getScheduledActivityCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listServiceAttachments operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListServiceAttachmentsResponse> listServiceAttachmentsResponseIterator(
            final ListServiceAttachmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListServiceAttachmentsRequest.Builder, ListServiceAttachmentsRequest,
                ListServiceAttachmentsResponse>(
                new java.util.function.Supplier<ListServiceAttachmentsRequest.Builder>() {
                    @Override
                    public ListServiceAttachmentsRequest.Builder get() {
                        return ListServiceAttachmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListServiceAttachmentsResponse, String>() {
                    @Override
                    public String apply(ListServiceAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListServiceAttachmentsRequest.Builder>,
                        ListServiceAttachmentsRequest>() {
                    @Override
                    public ListServiceAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListServiceAttachmentsRequest.Builder>
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
                        ListServiceAttachmentsRequest, ListServiceAttachmentsResponse>() {
                    @Override
                    public ListServiceAttachmentsResponse apply(
                            ListServiceAttachmentsRequest request) {
                        return client.listServiceAttachments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.fusionapps.model.ServiceAttachmentSummary} objects
     * contained in responses from the listServiceAttachments operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.fusionapps.model.ServiceAttachmentSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.fusionapps.model.ServiceAttachmentSummary>
            listServiceAttachmentsRecordIterator(final ListServiceAttachmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListServiceAttachmentsRequest.Builder, ListServiceAttachmentsRequest,
                ListServiceAttachmentsResponse,
                com.oracle.bmc.fusionapps.model.ServiceAttachmentSummary>(
                new java.util.function.Supplier<ListServiceAttachmentsRequest.Builder>() {
                    @Override
                    public ListServiceAttachmentsRequest.Builder get() {
                        return ListServiceAttachmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListServiceAttachmentsResponse, String>() {
                    @Override
                    public String apply(ListServiceAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListServiceAttachmentsRequest.Builder>,
                        ListServiceAttachmentsRequest>() {
                    @Override
                    public ListServiceAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListServiceAttachmentsRequest.Builder>
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
                        ListServiceAttachmentsRequest, ListServiceAttachmentsResponse>() {
                    @Override
                    public ListServiceAttachmentsResponse apply(
                            ListServiceAttachmentsRequest request) {
                        return client.listServiceAttachments(request);
                    }
                },
                new java.util.function.Function<
                        ListServiceAttachmentsResponse,
                        java.util.List<
                                com.oracle.bmc.fusionapps.model.ServiceAttachmentSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.fusionapps.model.ServiceAttachmentSummary>
                            apply(ListServiceAttachmentsResponse response) {
                        return response.getServiceAttachmentCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTimeAvailableForRefreshes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTimeAvailableForRefreshesResponse>
            listTimeAvailableForRefreshesResponseIterator(
                    final ListTimeAvailableForRefreshesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTimeAvailableForRefreshesRequest.Builder, ListTimeAvailableForRefreshesRequest,
                ListTimeAvailableForRefreshesResponse>(
                new java.util.function.Supplier<ListTimeAvailableForRefreshesRequest.Builder>() {
                    @Override
                    public ListTimeAvailableForRefreshesRequest.Builder get() {
                        return ListTimeAvailableForRefreshesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTimeAvailableForRefreshesResponse, String>() {
                    @Override
                    public String apply(ListTimeAvailableForRefreshesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTimeAvailableForRefreshesRequest.Builder>,
                        ListTimeAvailableForRefreshesRequest>() {
                    @Override
                    public ListTimeAvailableForRefreshesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTimeAvailableForRefreshesRequest.Builder>
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
                        ListTimeAvailableForRefreshesRequest,
                        ListTimeAvailableForRefreshesResponse>() {
                    @Override
                    public ListTimeAvailableForRefreshesResponse apply(
                            ListTimeAvailableForRefreshesRequest request) {
                        return client.listTimeAvailableForRefreshes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.fusionapps.model.TimeAvailableForRefreshSummary} objects
     * contained in responses from the listTimeAvailableForRefreshes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.fusionapps.model.TimeAvailableForRefreshSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.fusionapps.model.TimeAvailableForRefreshSummary>
            listTimeAvailableForRefreshesRecordIterator(
                    final ListTimeAvailableForRefreshesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTimeAvailableForRefreshesRequest.Builder, ListTimeAvailableForRefreshesRequest,
                ListTimeAvailableForRefreshesResponse,
                com.oracle.bmc.fusionapps.model.TimeAvailableForRefreshSummary>(
                new java.util.function.Supplier<ListTimeAvailableForRefreshesRequest.Builder>() {
                    @Override
                    public ListTimeAvailableForRefreshesRequest.Builder get() {
                        return ListTimeAvailableForRefreshesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTimeAvailableForRefreshesResponse, String>() {
                    @Override
                    public String apply(ListTimeAvailableForRefreshesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTimeAvailableForRefreshesRequest.Builder>,
                        ListTimeAvailableForRefreshesRequest>() {
                    @Override
                    public ListTimeAvailableForRefreshesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTimeAvailableForRefreshesRequest.Builder>
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
                        ListTimeAvailableForRefreshesRequest,
                        ListTimeAvailableForRefreshesResponse>() {
                    @Override
                    public ListTimeAvailableForRefreshesResponse apply(
                            ListTimeAvailableForRefreshesRequest request) {
                        return client.listTimeAvailableForRefreshes(request);
                    }
                },
                new java.util.function.Function<
                        ListTimeAvailableForRefreshesResponse,
                        java.util.List<
                                com.oracle.bmc.fusionapps.model.TimeAvailableForRefreshSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.fusionapps.model.TimeAvailableForRefreshSummary>
                            apply(ListTimeAvailableForRefreshesResponse response) {
                        return response.getTimeAvailableForRefreshCollection().getItems();
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.fusionapps.model.WorkRequestError} objects
     * contained in responses from the listWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.fusionapps.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.fusionapps.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse, com.oracle.bmc.fusionapps.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.fusionapps.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.fusionapps.model.WorkRequestError> apply(
                            ListWorkRequestErrorsResponse response) {
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.fusionapps.model.WorkRequestLogEntry} objects
     * contained in responses from the listWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.fusionapps.model.WorkRequestLogEntry} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.fusionapps.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse, com.oracle.bmc.fusionapps.model.WorkRequestLogEntry>(
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
                        java.util.List<com.oracle.bmc.fusionapps.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.fusionapps.model.WorkRequestLogEntry>
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.fusionapps.model.WorkRequestSummary} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.fusionapps.model.WorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.fusionapps.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.fusionapps.model.WorkRequestSummary>(
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
                        java.util.List<com.oracle.bmc.fusionapps.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.fusionapps.model.WorkRequestSummary> apply(
                            ListWorkRequestsResponse response) {
                        return response.getWorkRequestSummaryCollection().getItems();
                    }
                });
    }
}
