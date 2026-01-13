/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.multicloud;

import com.oracle.bmc.multicloud.requests.*;
import com.oracle.bmc.multicloud.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Metadata where multiple pages of data may be fetched. Two styles of
 * iteration are supported:
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
public class MetadataPaginators {
    private final Metadata client;

    public MetadataPaginators(Metadata client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listExternalLocationDetailsMetadata operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListExternalLocationDetailsMetadataResponse>
            listExternalLocationDetailsMetadataResponseIterator(
                    final ListExternalLocationDetailsMetadataRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExternalLocationDetailsMetadataRequest.Builder,
                ListExternalLocationDetailsMetadataRequest,
                ListExternalLocationDetailsMetadataResponse>(
                new java.util.function.Supplier<
                        ListExternalLocationDetailsMetadataRequest.Builder>() {
                    @Override
                    public ListExternalLocationDetailsMetadataRequest.Builder get() {
                        return ListExternalLocationDetailsMetadataRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalLocationDetailsMetadataResponse, String>() {
                    @Override
                    public String apply(ListExternalLocationDetailsMetadataResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalLocationDetailsMetadataRequest.Builder>,
                        ListExternalLocationDetailsMetadataRequest>() {
                    @Override
                    public ListExternalLocationDetailsMetadataRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalLocationDetailsMetadataRequest.Builder>
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
                        ListExternalLocationDetailsMetadataRequest,
                        ListExternalLocationDetailsMetadataResponse>() {
                    @Override
                    public ListExternalLocationDetailsMetadataResponse apply(
                            ListExternalLocationDetailsMetadataRequest request) {
                        return client.listExternalLocationDetailsMetadata(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.multicloud.model.ExternalLocationsMetadatumSummary} objects contained in
     * responses from the listExternalLocationDetailsMetadata operation. This iterable will fetch
     * more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.multicloud.model.ExternalLocationsMetadatumSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.multicloud.model.ExternalLocationsMetadatumSummary>
            listExternalLocationDetailsMetadataRecordIterator(
                    final ListExternalLocationDetailsMetadataRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExternalLocationDetailsMetadataRequest.Builder,
                ListExternalLocationDetailsMetadataRequest,
                ListExternalLocationDetailsMetadataResponse,
                com.oracle.bmc.multicloud.model.ExternalLocationsMetadatumSummary>(
                new java.util.function.Supplier<
                        ListExternalLocationDetailsMetadataRequest.Builder>() {
                    @Override
                    public ListExternalLocationDetailsMetadataRequest.Builder get() {
                        return ListExternalLocationDetailsMetadataRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalLocationDetailsMetadataResponse, String>() {
                    @Override
                    public String apply(ListExternalLocationDetailsMetadataResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalLocationDetailsMetadataRequest.Builder>,
                        ListExternalLocationDetailsMetadataRequest>() {
                    @Override
                    public ListExternalLocationDetailsMetadataRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalLocationDetailsMetadataRequest.Builder>
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
                        ListExternalLocationDetailsMetadataRequest,
                        ListExternalLocationDetailsMetadataResponse>() {
                    @Override
                    public ListExternalLocationDetailsMetadataResponse apply(
                            ListExternalLocationDetailsMetadataRequest request) {
                        return client.listExternalLocationDetailsMetadata(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalLocationDetailsMetadataResponse,
                        java.util.List<
                                com.oracle.bmc.multicloud.model
                                        .ExternalLocationsMetadatumSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.multicloud.model
                                            .ExternalLocationsMetadatumSummary>
                            apply(ListExternalLocationDetailsMetadataResponse response) {
                        return response.getExternalLocationsMetadatumCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listExternalLocationMappingMetadata operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListExternalLocationMappingMetadataResponse>
            listExternalLocationMappingMetadataResponseIterator(
                    final ListExternalLocationMappingMetadataRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExternalLocationMappingMetadataRequest.Builder,
                ListExternalLocationMappingMetadataRequest,
                ListExternalLocationMappingMetadataResponse>(
                new java.util.function.Supplier<
                        ListExternalLocationMappingMetadataRequest.Builder>() {
                    @Override
                    public ListExternalLocationMappingMetadataRequest.Builder get() {
                        return ListExternalLocationMappingMetadataRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalLocationMappingMetadataResponse, String>() {
                    @Override
                    public String apply(ListExternalLocationMappingMetadataResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalLocationMappingMetadataRequest.Builder>,
                        ListExternalLocationMappingMetadataRequest>() {
                    @Override
                    public ListExternalLocationMappingMetadataRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalLocationMappingMetadataRequest.Builder>
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
                        ListExternalLocationMappingMetadataRequest,
                        ListExternalLocationMappingMetadataResponse>() {
                    @Override
                    public ListExternalLocationMappingMetadataResponse apply(
                            ListExternalLocationMappingMetadataRequest request) {
                        return client.listExternalLocationMappingMetadata(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.multicloud.model.ExternalLocationMappingMetadatumSummary} objects contained in
     * responses from the listExternalLocationMappingMetadata operation. This iterable will fetch
     * more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.multicloud.model.ExternalLocationMappingMetadatumSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.multicloud.model.ExternalLocationMappingMetadatumSummary>
            listExternalLocationMappingMetadataRecordIterator(
                    final ListExternalLocationMappingMetadataRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExternalLocationMappingMetadataRequest.Builder,
                ListExternalLocationMappingMetadataRequest,
                ListExternalLocationMappingMetadataResponse,
                com.oracle.bmc.multicloud.model.ExternalLocationMappingMetadatumSummary>(
                new java.util.function.Supplier<
                        ListExternalLocationMappingMetadataRequest.Builder>() {
                    @Override
                    public ListExternalLocationMappingMetadataRequest.Builder get() {
                        return ListExternalLocationMappingMetadataRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalLocationMappingMetadataResponse, String>() {
                    @Override
                    public String apply(ListExternalLocationMappingMetadataResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalLocationMappingMetadataRequest.Builder>,
                        ListExternalLocationMappingMetadataRequest>() {
                    @Override
                    public ListExternalLocationMappingMetadataRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalLocationMappingMetadataRequest.Builder>
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
                        ListExternalLocationMappingMetadataRequest,
                        ListExternalLocationMappingMetadataResponse>() {
                    @Override
                    public ListExternalLocationMappingMetadataResponse apply(
                            ListExternalLocationMappingMetadataRequest request) {
                        return client.listExternalLocationMappingMetadata(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalLocationMappingMetadataResponse,
                        java.util.List<
                                com.oracle.bmc.multicloud.model
                                        .ExternalLocationMappingMetadatumSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.multicloud.model
                                            .ExternalLocationMappingMetadatumSummary>
                            apply(ListExternalLocationMappingMetadataResponse response) {
                        return response.getExternalLocationMappingMetadatumSummaryCollection()
                                .getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listExternalLocationSummariesMetadata operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListExternalLocationSummariesMetadataResponse>
            listExternalLocationSummariesMetadataResponseIterator(
                    final ListExternalLocationSummariesMetadataRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExternalLocationSummariesMetadataRequest.Builder,
                ListExternalLocationSummariesMetadataRequest,
                ListExternalLocationSummariesMetadataResponse>(
                new java.util.function.Supplier<
                        ListExternalLocationSummariesMetadataRequest.Builder>() {
                    @Override
                    public ListExternalLocationSummariesMetadataRequest.Builder get() {
                        return ListExternalLocationSummariesMetadataRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalLocationSummariesMetadataResponse, String>() {
                    @Override
                    public String apply(ListExternalLocationSummariesMetadataResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalLocationSummariesMetadataRequest.Builder>,
                        ListExternalLocationSummariesMetadataRequest>() {
                    @Override
                    public ListExternalLocationSummariesMetadataRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalLocationSummariesMetadataRequest.Builder>
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
                        ListExternalLocationSummariesMetadataRequest,
                        ListExternalLocationSummariesMetadataResponse>() {
                    @Override
                    public ListExternalLocationSummariesMetadataResponse apply(
                            ListExternalLocationSummariesMetadataRequest request) {
                        return client.listExternalLocationSummariesMetadata(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.multicloud.model.ExternalLocationSummariesMetadatumSummary} objects contained
     * in responses from the listExternalLocationSummariesMetadata operation. This iterable will
     * fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.multicloud.model.ExternalLocationSummariesMetadatumSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.multicloud.model.ExternalLocationSummariesMetadatumSummary>
            listExternalLocationSummariesMetadataRecordIterator(
                    final ListExternalLocationSummariesMetadataRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExternalLocationSummariesMetadataRequest.Builder,
                ListExternalLocationSummariesMetadataRequest,
                ListExternalLocationSummariesMetadataResponse,
                com.oracle.bmc.multicloud.model.ExternalLocationSummariesMetadatumSummary>(
                new java.util.function.Supplier<
                        ListExternalLocationSummariesMetadataRequest.Builder>() {
                    @Override
                    public ListExternalLocationSummariesMetadataRequest.Builder get() {
                        return ListExternalLocationSummariesMetadataRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalLocationSummariesMetadataResponse, String>() {
                    @Override
                    public String apply(ListExternalLocationSummariesMetadataResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalLocationSummariesMetadataRequest.Builder>,
                        ListExternalLocationSummariesMetadataRequest>() {
                    @Override
                    public ListExternalLocationSummariesMetadataRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalLocationSummariesMetadataRequest.Builder>
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
                        ListExternalLocationSummariesMetadataRequest,
                        ListExternalLocationSummariesMetadataResponse>() {
                    @Override
                    public ListExternalLocationSummariesMetadataResponse apply(
                            ListExternalLocationSummariesMetadataRequest request) {
                        return client.listExternalLocationSummariesMetadata(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalLocationSummariesMetadataResponse,
                        java.util.List<
                                com.oracle.bmc.multicloud.model
                                        .ExternalLocationSummariesMetadatumSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.multicloud.model
                                            .ExternalLocationSummariesMetadatumSummary>
                            apply(ListExternalLocationSummariesMetadataResponse response) {
                        return response.getExternalLocationSummariesMetadatumSummaryCollection()
                                .getItems();
                    }
                });
    }
}
