/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.desktops;

import com.oracle.bmc.desktops.requests.*;
import com.oracle.bmc.desktops.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of DesktopService where multiple pages of data may be fetched. Two styles
 * of iteration are supported:
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220618")
public class DesktopServicePaginators {
    private final DesktopService client;

    public DesktopServicePaginators(DesktopService client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDesktopPoolDesktops operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDesktopPoolDesktopsResponse> listDesktopPoolDesktopsResponseIterator(
            final ListDesktopPoolDesktopsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDesktopPoolDesktopsRequest.Builder,
                ListDesktopPoolDesktopsRequest,
                ListDesktopPoolDesktopsResponse>(
                new java.util.function.Supplier<ListDesktopPoolDesktopsRequest.Builder>() {
                    @Override
                    public ListDesktopPoolDesktopsRequest.Builder get() {
                        return ListDesktopPoolDesktopsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDesktopPoolDesktopsResponse, String>() {
                    @Override
                    public String apply(ListDesktopPoolDesktopsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDesktopPoolDesktopsRequest.Builder>,
                        ListDesktopPoolDesktopsRequest>() {
                    @Override
                    public ListDesktopPoolDesktopsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDesktopPoolDesktopsRequest.Builder>
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
                        ListDesktopPoolDesktopsRequest, ListDesktopPoolDesktopsResponse>() {
                    @Override
                    public ListDesktopPoolDesktopsResponse apply(
                            ListDesktopPoolDesktopsRequest request) {
                        return client.listDesktopPoolDesktops(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.desktops.model.DesktopPoolDesktopSummary} objects contained in responses from
     * the listDesktopPoolDesktops operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.desktops.model.DesktopPoolDesktopSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.desktops.model.DesktopPoolDesktopSummary>
            listDesktopPoolDesktopsRecordIterator(final ListDesktopPoolDesktopsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDesktopPoolDesktopsRequest.Builder,
                ListDesktopPoolDesktopsRequest,
                ListDesktopPoolDesktopsResponse,
                com.oracle.bmc.desktops.model.DesktopPoolDesktopSummary>(
                new java.util.function.Supplier<ListDesktopPoolDesktopsRequest.Builder>() {
                    @Override
                    public ListDesktopPoolDesktopsRequest.Builder get() {
                        return ListDesktopPoolDesktopsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDesktopPoolDesktopsResponse, String>() {
                    @Override
                    public String apply(ListDesktopPoolDesktopsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDesktopPoolDesktopsRequest.Builder>,
                        ListDesktopPoolDesktopsRequest>() {
                    @Override
                    public ListDesktopPoolDesktopsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDesktopPoolDesktopsRequest.Builder>
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
                        ListDesktopPoolDesktopsRequest, ListDesktopPoolDesktopsResponse>() {
                    @Override
                    public ListDesktopPoolDesktopsResponse apply(
                            ListDesktopPoolDesktopsRequest request) {
                        return client.listDesktopPoolDesktops(request);
                    }
                },
                new java.util.function.Function<
                        ListDesktopPoolDesktopsResponse,
                        java.util.List<com.oracle.bmc.desktops.model.DesktopPoolDesktopSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.desktops.model.DesktopPoolDesktopSummary>
                            apply(ListDesktopPoolDesktopsResponse response) {
                        return response.getDesktopPoolDesktopCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDesktopPoolVolumes operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDesktopPoolVolumesResponse> listDesktopPoolVolumesResponseIterator(
            final ListDesktopPoolVolumesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDesktopPoolVolumesRequest.Builder,
                ListDesktopPoolVolumesRequest,
                ListDesktopPoolVolumesResponse>(
                new java.util.function.Supplier<ListDesktopPoolVolumesRequest.Builder>() {
                    @Override
                    public ListDesktopPoolVolumesRequest.Builder get() {
                        return ListDesktopPoolVolumesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDesktopPoolVolumesResponse, String>() {
                    @Override
                    public String apply(ListDesktopPoolVolumesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDesktopPoolVolumesRequest.Builder>,
                        ListDesktopPoolVolumesRequest>() {
                    @Override
                    public ListDesktopPoolVolumesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDesktopPoolVolumesRequest.Builder>
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
                        ListDesktopPoolVolumesRequest, ListDesktopPoolVolumesResponse>() {
                    @Override
                    public ListDesktopPoolVolumesResponse apply(
                            ListDesktopPoolVolumesRequest request) {
                        return client.listDesktopPoolVolumes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.desktops.model.DesktopPoolVolumeSummary} objects contained in responses from
     * the listDesktopPoolVolumes operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.desktops.model.DesktopPoolVolumeSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.desktops.model.DesktopPoolVolumeSummary>
            listDesktopPoolVolumesRecordIterator(final ListDesktopPoolVolumesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDesktopPoolVolumesRequest.Builder,
                ListDesktopPoolVolumesRequest,
                ListDesktopPoolVolumesResponse,
                com.oracle.bmc.desktops.model.DesktopPoolVolumeSummary>(
                new java.util.function.Supplier<ListDesktopPoolVolumesRequest.Builder>() {
                    @Override
                    public ListDesktopPoolVolumesRequest.Builder get() {
                        return ListDesktopPoolVolumesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDesktopPoolVolumesResponse, String>() {
                    @Override
                    public String apply(ListDesktopPoolVolumesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDesktopPoolVolumesRequest.Builder>,
                        ListDesktopPoolVolumesRequest>() {
                    @Override
                    public ListDesktopPoolVolumesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDesktopPoolVolumesRequest.Builder>
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
                        ListDesktopPoolVolumesRequest, ListDesktopPoolVolumesResponse>() {
                    @Override
                    public ListDesktopPoolVolumesResponse apply(
                            ListDesktopPoolVolumesRequest request) {
                        return client.listDesktopPoolVolumes(request);
                    }
                },
                new java.util.function.Function<
                        ListDesktopPoolVolumesResponse,
                        java.util.List<com.oracle.bmc.desktops.model.DesktopPoolVolumeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.desktops.model.DesktopPoolVolumeSummary>
                            apply(ListDesktopPoolVolumesResponse response) {
                        return response.getDesktopPoolVolumeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDesktopPools operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDesktopPoolsResponse> listDesktopPoolsResponseIterator(
            final ListDesktopPoolsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDesktopPoolsRequest.Builder, ListDesktopPoolsRequest, ListDesktopPoolsResponse>(
                new java.util.function.Supplier<ListDesktopPoolsRequest.Builder>() {
                    @Override
                    public ListDesktopPoolsRequest.Builder get() {
                        return ListDesktopPoolsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDesktopPoolsResponse, String>() {
                    @Override
                    public String apply(ListDesktopPoolsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDesktopPoolsRequest.Builder>,
                        ListDesktopPoolsRequest>() {
                    @Override
                    public ListDesktopPoolsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDesktopPoolsRequest.Builder>
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
                        ListDesktopPoolsRequest, ListDesktopPoolsResponse>() {
                    @Override
                    public ListDesktopPoolsResponse apply(ListDesktopPoolsRequest request) {
                        return client.listDesktopPools(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.desktops.model.DesktopPoolSummary} objects contained in responses from the
     * listDesktopPools operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.desktops.model.DesktopPoolSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.desktops.model.DesktopPoolSummary>
            listDesktopPoolsRecordIterator(final ListDesktopPoolsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDesktopPoolsRequest.Builder,
                ListDesktopPoolsRequest,
                ListDesktopPoolsResponse,
                com.oracle.bmc.desktops.model.DesktopPoolSummary>(
                new java.util.function.Supplier<ListDesktopPoolsRequest.Builder>() {
                    @Override
                    public ListDesktopPoolsRequest.Builder get() {
                        return ListDesktopPoolsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDesktopPoolsResponse, String>() {
                    @Override
                    public String apply(ListDesktopPoolsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDesktopPoolsRequest.Builder>,
                        ListDesktopPoolsRequest>() {
                    @Override
                    public ListDesktopPoolsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDesktopPoolsRequest.Builder>
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
                        ListDesktopPoolsRequest, ListDesktopPoolsResponse>() {
                    @Override
                    public ListDesktopPoolsResponse apply(ListDesktopPoolsRequest request) {
                        return client.listDesktopPools(request);
                    }
                },
                new java.util.function.Function<
                        ListDesktopPoolsResponse,
                        java.util.List<com.oracle.bmc.desktops.model.DesktopPoolSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.desktops.model.DesktopPoolSummary> apply(
                            ListDesktopPoolsResponse response) {
                        return response.getDesktopPoolCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDesktops
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDesktopsResponse> listDesktopsResponseIterator(
            final ListDesktopsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDesktopsRequest.Builder, ListDesktopsRequest, ListDesktopsResponse>(
                new java.util.function.Supplier<ListDesktopsRequest.Builder>() {
                    @Override
                    public ListDesktopsRequest.Builder get() {
                        return ListDesktopsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDesktopsResponse, String>() {
                    @Override
                    public String apply(ListDesktopsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDesktopsRequest.Builder>,
                        ListDesktopsRequest>() {
                    @Override
                    public ListDesktopsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDesktopsRequest.Builder>
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
                new java.util.function.Function<ListDesktopsRequest, ListDesktopsResponse>() {
                    @Override
                    public ListDesktopsResponse apply(ListDesktopsRequest request) {
                        return client.listDesktops(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.desktops.model.DesktopSummary} objects contained in responses from the
     * listDesktops operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.desktops.model.DesktopSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.desktops.model.DesktopSummary> listDesktopsRecordIterator(
            final ListDesktopsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDesktopsRequest.Builder,
                ListDesktopsRequest,
                ListDesktopsResponse,
                com.oracle.bmc.desktops.model.DesktopSummary>(
                new java.util.function.Supplier<ListDesktopsRequest.Builder>() {
                    @Override
                    public ListDesktopsRequest.Builder get() {
                        return ListDesktopsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDesktopsResponse, String>() {
                    @Override
                    public String apply(ListDesktopsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDesktopsRequest.Builder>,
                        ListDesktopsRequest>() {
                    @Override
                    public ListDesktopsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDesktopsRequest.Builder>
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
                new java.util.function.Function<ListDesktopsRequest, ListDesktopsResponse>() {
                    @Override
                    public ListDesktopsResponse apply(ListDesktopsRequest request) {
                        return client.listDesktops(request);
                    }
                },
                new java.util.function.Function<
                        ListDesktopsResponse,
                        java.util.List<com.oracle.bmc.desktops.model.DesktopSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.desktops.model.DesktopSummary> apply(
                            ListDesktopsResponse response) {
                        return response.getDesktopCollection().getItems();
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
     * com.oracle.bmc.desktops.model.WorkRequestError} objects contained in responses from the
     * listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.desktops.model.WorkRequestError} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.desktops.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.desktops.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.desktops.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.desktops.model.WorkRequestError> apply(
                            ListWorkRequestErrorsResponse response) {
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
     * com.oracle.bmc.desktops.model.WorkRequestLogEntry} objects contained in responses from the
     * listWorkRequestLogs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.desktops.model.WorkRequestLogEntry} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.desktops.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.desktops.model.WorkRequestLogEntry>(
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
                        java.util.List<com.oracle.bmc.desktops.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.desktops.model.WorkRequestLogEntry> apply(
                            ListWorkRequestLogsResponse response) {
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
     * com.oracle.bmc.desktops.model.WorkRequestSummary} objects contained in responses from the
     * listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.desktops.model.WorkRequestSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.desktops.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder,
                ListWorkRequestsRequest,
                ListWorkRequestsResponse,
                com.oracle.bmc.desktops.model.WorkRequestSummary>(
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
                        java.util.List<com.oracle.bmc.desktops.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.desktops.model.WorkRequestSummary> apply(
                            ListWorkRequestsResponse response) {
                        return response.getWorkRequestSummaryCollection().getItems();
                    }
                });
    }
}
