/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane;

import com.oracle.bmc.datalabelingservicedataplane.requests.*;
import com.oracle.bmc.datalabelingservicedataplane.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of DataLabeling where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
public class DataLabelingPaginators {
    private final DataLabeling client;

    public DataLabelingPaginators(DataLabeling client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAnnotations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAnnotationsResponse> listAnnotationsResponseIterator(
            final ListAnnotationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAnnotationsRequest.Builder, ListAnnotationsRequest, ListAnnotationsResponse>(
                new java.util.function.Supplier<ListAnnotationsRequest.Builder>() {
                    @Override
                    public ListAnnotationsRequest.Builder get() {
                        return ListAnnotationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAnnotationsResponse, String>() {
                    @Override
                    public String apply(ListAnnotationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAnnotationsRequest.Builder>,
                        ListAnnotationsRequest>() {
                    @Override
                    public ListAnnotationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAnnotationsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListAnnotationsRequest, ListAnnotationsResponse>() {
                    @Override
                    public ListAnnotationsResponse apply(ListAnnotationsRequest request) {
                        return client.listAnnotations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datalabelingservicedataplane.model.AnnotationSummary} objects
     * contained in responses from the listAnnotations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datalabelingservicedataplane.model.AnnotationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datalabelingservicedataplane.model.AnnotationSummary>
            listAnnotationsRecordIterator(final ListAnnotationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAnnotationsRequest.Builder, ListAnnotationsRequest, ListAnnotationsResponse,
                com.oracle.bmc.datalabelingservicedataplane.model.AnnotationSummary>(
                new java.util.function.Supplier<ListAnnotationsRequest.Builder>() {
                    @Override
                    public ListAnnotationsRequest.Builder get() {
                        return ListAnnotationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAnnotationsResponse, String>() {
                    @Override
                    public String apply(ListAnnotationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAnnotationsRequest.Builder>,
                        ListAnnotationsRequest>() {
                    @Override
                    public ListAnnotationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAnnotationsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListAnnotationsRequest, ListAnnotationsResponse>() {
                    @Override
                    public ListAnnotationsResponse apply(ListAnnotationsRequest request) {
                        return client.listAnnotations(request);
                    }
                },
                new java.util.function.Function<
                        ListAnnotationsResponse,
                        java.util.List<
                                com.oracle.bmc.datalabelingservicedataplane.model
                                        .AnnotationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.datalabelingservicedataplane.model
                                            .AnnotationSummary>
                            apply(ListAnnotationsResponse response) {
                        return response.getAnnotationCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listRecords operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListRecordsResponse> listRecordsResponseIterator(
            final ListRecordsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRecordsRequest.Builder, ListRecordsRequest, ListRecordsResponse>(
                new java.util.function.Supplier<ListRecordsRequest.Builder>() {
                    @Override
                    public ListRecordsRequest.Builder get() {
                        return ListRecordsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRecordsResponse, String>() {
                    @Override
                    public String apply(ListRecordsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRecordsRequest.Builder>,
                        ListRecordsRequest>() {
                    @Override
                    public ListRecordsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRecordsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListRecordsRequest, ListRecordsResponse>() {
                    @Override
                    public ListRecordsResponse apply(ListRecordsRequest request) {
                        return client.listRecords(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.datalabelingservicedataplane.model.RecordSummary} objects
     * contained in responses from the listRecords operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.datalabelingservicedataplane.model.RecordSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.datalabelingservicedataplane.model.RecordSummary>
            listRecordsRecordIterator(final ListRecordsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRecordsRequest.Builder, ListRecordsRequest, ListRecordsResponse,
                com.oracle.bmc.datalabelingservicedataplane.model.RecordSummary>(
                new java.util.function.Supplier<ListRecordsRequest.Builder>() {
                    @Override
                    public ListRecordsRequest.Builder get() {
                        return ListRecordsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRecordsResponse, String>() {
                    @Override
                    public String apply(ListRecordsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRecordsRequest.Builder>,
                        ListRecordsRequest>() {
                    @Override
                    public ListRecordsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRecordsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListRecordsRequest, ListRecordsResponse>() {
                    @Override
                    public ListRecordsResponse apply(ListRecordsRequest request) {
                        return client.listRecords(request);
                    }
                },
                new java.util.function.Function<
                        ListRecordsResponse,
                        java.util.List<
                                com.oracle.bmc.datalabelingservicedataplane.model
                                        .RecordSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.datalabelingservicedataplane.model.RecordSummary>
                            apply(ListRecordsResponse response) {
                        return response.getRecordCollection().getItems();
                    }
                });
    }
}
