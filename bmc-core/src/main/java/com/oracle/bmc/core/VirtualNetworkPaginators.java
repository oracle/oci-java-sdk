/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of VirtualNetwork where multiple pages of data may be fetched. Two styles
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class VirtualNetworkPaginators {
    private final VirtualNetwork client;

    public VirtualNetworkPaginators(VirtualNetwork client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * getAllDrgAttachments operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<GetAllDrgAttachmentsResponse> getAllDrgAttachmentsResponseIterator(
            final GetAllDrgAttachmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                GetAllDrgAttachmentsRequest.Builder,
                GetAllDrgAttachmentsRequest,
                GetAllDrgAttachmentsResponse>(
                new java.util.function.Supplier<GetAllDrgAttachmentsRequest.Builder>() {
                    @Override
                    public GetAllDrgAttachmentsRequest.Builder get() {
                        return GetAllDrgAttachmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<GetAllDrgAttachmentsResponse, String>() {
                    @Override
                    public String apply(GetAllDrgAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                GetAllDrgAttachmentsRequest.Builder>,
                        GetAllDrgAttachmentsRequest>() {
                    @Override
                    public GetAllDrgAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            GetAllDrgAttachmentsRequest.Builder>
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
                        GetAllDrgAttachmentsRequest, GetAllDrgAttachmentsResponse>() {
                    @Override
                    public GetAllDrgAttachmentsResponse apply(GetAllDrgAttachmentsRequest request) {
                        return client.getAllDrgAttachments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.DrgAttachmentInfo} objects contained in responses from the
     * getAllDrgAttachments operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.DrgAttachmentInfo} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.core.model.DrgAttachmentInfo> getAllDrgAttachmentsRecordIterator(
            final GetAllDrgAttachmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                GetAllDrgAttachmentsRequest.Builder,
                GetAllDrgAttachmentsRequest,
                GetAllDrgAttachmentsResponse,
                com.oracle.bmc.core.model.DrgAttachmentInfo>(
                new java.util.function.Supplier<GetAllDrgAttachmentsRequest.Builder>() {
                    @Override
                    public GetAllDrgAttachmentsRequest.Builder get() {
                        return GetAllDrgAttachmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<GetAllDrgAttachmentsResponse, String>() {
                    @Override
                    public String apply(GetAllDrgAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                GetAllDrgAttachmentsRequest.Builder>,
                        GetAllDrgAttachmentsRequest>() {
                    @Override
                    public GetAllDrgAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            GetAllDrgAttachmentsRequest.Builder>
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
                        GetAllDrgAttachmentsRequest, GetAllDrgAttachmentsResponse>() {
                    @Override
                    public GetAllDrgAttachmentsResponse apply(GetAllDrgAttachmentsRequest request) {
                        return client.getAllDrgAttachments(request);
                    }
                },
                new java.util.function.Function<
                        GetAllDrgAttachmentsResponse,
                        java.util.List<com.oracle.bmc.core.model.DrgAttachmentInfo>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.DrgAttachmentInfo> apply(
                            GetAllDrgAttachmentsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listByoasns
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListByoasnsResponse> listByoasnsResponseIterator(
            final ListByoasnsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListByoasnsRequest.Builder, ListByoasnsRequest, ListByoasnsResponse>(
                new java.util.function.Supplier<ListByoasnsRequest.Builder>() {
                    @Override
                    public ListByoasnsRequest.Builder get() {
                        return ListByoasnsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListByoasnsResponse, String>() {
                    @Override
                    public String apply(ListByoasnsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListByoasnsRequest.Builder>,
                        ListByoasnsRequest>() {
                    @Override
                    public ListByoasnsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListByoasnsRequest.Builder>
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
                new java.util.function.Function<ListByoasnsRequest, ListByoasnsResponse>() {
                    @Override
                    public ListByoasnsResponse apply(ListByoasnsRequest request) {
                        return client.listByoasns(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.ByoasnSummary} objects contained in responses from the listByoasns
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.ByoasnSummary} objects contained in responses received from the
     *     service.
     */
    public Iterable<com.oracle.bmc.core.model.ByoasnSummary> listByoasnsRecordIterator(
            final ListByoasnsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListByoasnsRequest.Builder,
                ListByoasnsRequest,
                ListByoasnsResponse,
                com.oracle.bmc.core.model.ByoasnSummary>(
                new java.util.function.Supplier<ListByoasnsRequest.Builder>() {
                    @Override
                    public ListByoasnsRequest.Builder get() {
                        return ListByoasnsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListByoasnsResponse, String>() {
                    @Override
                    public String apply(ListByoasnsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListByoasnsRequest.Builder>,
                        ListByoasnsRequest>() {
                    @Override
                    public ListByoasnsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListByoasnsRequest.Builder>
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
                new java.util.function.Function<ListByoasnsRequest, ListByoasnsResponse>() {
                    @Override
                    public ListByoasnsResponse apply(ListByoasnsRequest request) {
                        return client.listByoasns(request);
                    }
                },
                new java.util.function.Function<
                        ListByoasnsResponse,
                        java.util.List<com.oracle.bmc.core.model.ByoasnSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.ByoasnSummary> apply(
                            ListByoasnsResponse response) {
                        return response.getByoasnCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listByoipAllocatedRanges operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListByoipAllocatedRangesResponse> listByoipAllocatedRangesResponseIterator(
            final ListByoipAllocatedRangesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListByoipAllocatedRangesRequest.Builder,
                ListByoipAllocatedRangesRequest,
                ListByoipAllocatedRangesResponse>(
                new java.util.function.Supplier<ListByoipAllocatedRangesRequest.Builder>() {
                    @Override
                    public ListByoipAllocatedRangesRequest.Builder get() {
                        return ListByoipAllocatedRangesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListByoipAllocatedRangesResponse, String>() {
                    @Override
                    public String apply(ListByoipAllocatedRangesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListByoipAllocatedRangesRequest.Builder>,
                        ListByoipAllocatedRangesRequest>() {
                    @Override
                    public ListByoipAllocatedRangesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListByoipAllocatedRangesRequest.Builder>
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
                        ListByoipAllocatedRangesRequest, ListByoipAllocatedRangesResponse>() {
                    @Override
                    public ListByoipAllocatedRangesResponse apply(
                            ListByoipAllocatedRangesRequest request) {
                        return client.listByoipAllocatedRanges(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.ByoipAllocatedRangeSummary} objects contained in responses from the
     * listByoipAllocatedRanges operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.ByoipAllocatedRangeSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.ByoipAllocatedRangeSummary>
            listByoipAllocatedRangesRecordIterator(final ListByoipAllocatedRangesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListByoipAllocatedRangesRequest.Builder,
                ListByoipAllocatedRangesRequest,
                ListByoipAllocatedRangesResponse,
                com.oracle.bmc.core.model.ByoipAllocatedRangeSummary>(
                new java.util.function.Supplier<ListByoipAllocatedRangesRequest.Builder>() {
                    @Override
                    public ListByoipAllocatedRangesRequest.Builder get() {
                        return ListByoipAllocatedRangesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListByoipAllocatedRangesResponse, String>() {
                    @Override
                    public String apply(ListByoipAllocatedRangesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListByoipAllocatedRangesRequest.Builder>,
                        ListByoipAllocatedRangesRequest>() {
                    @Override
                    public ListByoipAllocatedRangesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListByoipAllocatedRangesRequest.Builder>
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
                        ListByoipAllocatedRangesRequest, ListByoipAllocatedRangesResponse>() {
                    @Override
                    public ListByoipAllocatedRangesResponse apply(
                            ListByoipAllocatedRangesRequest request) {
                        return client.listByoipAllocatedRanges(request);
                    }
                },
                new java.util.function.Function<
                        ListByoipAllocatedRangesResponse,
                        java.util.List<com.oracle.bmc.core.model.ByoipAllocatedRangeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.ByoipAllocatedRangeSummary>
                            apply(ListByoipAllocatedRangesResponse response) {
                        return response.getByoipAllocatedRangeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listByoipRanges operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListByoipRangesResponse> listByoipRangesResponseIterator(
            final ListByoipRangesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListByoipRangesRequest.Builder, ListByoipRangesRequest, ListByoipRangesResponse>(
                new java.util.function.Supplier<ListByoipRangesRequest.Builder>() {
                    @Override
                    public ListByoipRangesRequest.Builder get() {
                        return ListByoipRangesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListByoipRangesResponse, String>() {
                    @Override
                    public String apply(ListByoipRangesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListByoipRangesRequest.Builder>,
                        ListByoipRangesRequest>() {
                    @Override
                    public ListByoipRangesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListByoipRangesRequest.Builder>
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
                new java.util.function.Function<ListByoipRangesRequest, ListByoipRangesResponse>() {
                    @Override
                    public ListByoipRangesResponse apply(ListByoipRangesRequest request) {
                        return client.listByoipRanges(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.ByoipRangeSummary} objects contained in responses from the
     * listByoipRanges operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.ByoipRangeSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.core.model.ByoipRangeSummary> listByoipRangesRecordIterator(
            final ListByoipRangesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListByoipRangesRequest.Builder,
                ListByoipRangesRequest,
                ListByoipRangesResponse,
                com.oracle.bmc.core.model.ByoipRangeSummary>(
                new java.util.function.Supplier<ListByoipRangesRequest.Builder>() {
                    @Override
                    public ListByoipRangesRequest.Builder get() {
                        return ListByoipRangesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListByoipRangesResponse, String>() {
                    @Override
                    public String apply(ListByoipRangesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListByoipRangesRequest.Builder>,
                        ListByoipRangesRequest>() {
                    @Override
                    public ListByoipRangesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListByoipRangesRequest.Builder>
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
                new java.util.function.Function<ListByoipRangesRequest, ListByoipRangesResponse>() {
                    @Override
                    public ListByoipRangesResponse apply(ListByoipRangesRequest request) {
                        return client.listByoipRanges(request);
                    }
                },
                new java.util.function.Function<
                        ListByoipRangesResponse,
                        java.util.List<com.oracle.bmc.core.model.ByoipRangeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.ByoipRangeSummary> apply(
                            ListByoipRangesResponse response) {
                        return response.getByoipRangeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCaptureFilters operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCaptureFiltersResponse> listCaptureFiltersResponseIterator(
            final ListCaptureFiltersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCaptureFiltersRequest.Builder,
                ListCaptureFiltersRequest,
                ListCaptureFiltersResponse>(
                new java.util.function.Supplier<ListCaptureFiltersRequest.Builder>() {
                    @Override
                    public ListCaptureFiltersRequest.Builder get() {
                        return ListCaptureFiltersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCaptureFiltersResponse, String>() {
                    @Override
                    public String apply(ListCaptureFiltersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCaptureFiltersRequest.Builder>,
                        ListCaptureFiltersRequest>() {
                    @Override
                    public ListCaptureFiltersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCaptureFiltersRequest.Builder>
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
                        ListCaptureFiltersRequest, ListCaptureFiltersResponse>() {
                    @Override
                    public ListCaptureFiltersResponse apply(ListCaptureFiltersRequest request) {
                        return client.listCaptureFilters(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.CaptureFilter} objects contained in responses from the
     * listCaptureFilters operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.CaptureFilter} objects contained in responses received from the
     *     service.
     */
    public Iterable<com.oracle.bmc.core.model.CaptureFilter> listCaptureFiltersRecordIterator(
            final ListCaptureFiltersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCaptureFiltersRequest.Builder,
                ListCaptureFiltersRequest,
                ListCaptureFiltersResponse,
                com.oracle.bmc.core.model.CaptureFilter>(
                new java.util.function.Supplier<ListCaptureFiltersRequest.Builder>() {
                    @Override
                    public ListCaptureFiltersRequest.Builder get() {
                        return ListCaptureFiltersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCaptureFiltersResponse, String>() {
                    @Override
                    public String apply(ListCaptureFiltersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCaptureFiltersRequest.Builder>,
                        ListCaptureFiltersRequest>() {
                    @Override
                    public ListCaptureFiltersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCaptureFiltersRequest.Builder>
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
                        ListCaptureFiltersRequest, ListCaptureFiltersResponse>() {
                    @Override
                    public ListCaptureFiltersResponse apply(ListCaptureFiltersRequest request) {
                        return client.listCaptureFilters(request);
                    }
                },
                new java.util.function.Function<
                        ListCaptureFiltersResponse,
                        java.util.List<com.oracle.bmc.core.model.CaptureFilter>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.CaptureFilter> apply(
                            ListCaptureFiltersResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCpeDeviceShapes operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCpeDeviceShapesResponse> listCpeDeviceShapesResponseIterator(
            final ListCpeDeviceShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCpeDeviceShapesRequest.Builder,
                ListCpeDeviceShapesRequest,
                ListCpeDeviceShapesResponse>(
                new java.util.function.Supplier<ListCpeDeviceShapesRequest.Builder>() {
                    @Override
                    public ListCpeDeviceShapesRequest.Builder get() {
                        return ListCpeDeviceShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCpeDeviceShapesResponse, String>() {
                    @Override
                    public String apply(ListCpeDeviceShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCpeDeviceShapesRequest.Builder>,
                        ListCpeDeviceShapesRequest>() {
                    @Override
                    public ListCpeDeviceShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCpeDeviceShapesRequest.Builder>
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
                        ListCpeDeviceShapesRequest, ListCpeDeviceShapesResponse>() {
                    @Override
                    public ListCpeDeviceShapesResponse apply(ListCpeDeviceShapesRequest request) {
                        return client.listCpeDeviceShapes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.CpeDeviceShapeSummary} objects contained in responses from the
     * listCpeDeviceShapes operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.CpeDeviceShapeSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.core.model.CpeDeviceShapeSummary>
            listCpeDeviceShapesRecordIterator(final ListCpeDeviceShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCpeDeviceShapesRequest.Builder,
                ListCpeDeviceShapesRequest,
                ListCpeDeviceShapesResponse,
                com.oracle.bmc.core.model.CpeDeviceShapeSummary>(
                new java.util.function.Supplier<ListCpeDeviceShapesRequest.Builder>() {
                    @Override
                    public ListCpeDeviceShapesRequest.Builder get() {
                        return ListCpeDeviceShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCpeDeviceShapesResponse, String>() {
                    @Override
                    public String apply(ListCpeDeviceShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCpeDeviceShapesRequest.Builder>,
                        ListCpeDeviceShapesRequest>() {
                    @Override
                    public ListCpeDeviceShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCpeDeviceShapesRequest.Builder>
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
                        ListCpeDeviceShapesRequest, ListCpeDeviceShapesResponse>() {
                    @Override
                    public ListCpeDeviceShapesResponse apply(ListCpeDeviceShapesRequest request) {
                        return client.listCpeDeviceShapes(request);
                    }
                },
                new java.util.function.Function<
                        ListCpeDeviceShapesResponse,
                        java.util.List<com.oracle.bmc.core.model.CpeDeviceShapeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.CpeDeviceShapeSummary> apply(
                            ListCpeDeviceShapesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listCpes
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCpesResponse> listCpesResponseIterator(final ListCpesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCpesRequest.Builder, ListCpesRequest, ListCpesResponse>(
                new java.util.function.Supplier<ListCpesRequest.Builder>() {
                    @Override
                    public ListCpesRequest.Builder get() {
                        return ListCpesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCpesResponse, String>() {
                    @Override
                    public String apply(ListCpesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCpesRequest.Builder>,
                        ListCpesRequest>() {
                    @Override
                    public ListCpesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCpesRequest.Builder>
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
                new java.util.function.Function<ListCpesRequest, ListCpesResponse>() {
                    @Override
                    public ListCpesResponse apply(ListCpesRequest request) {
                        return client.listCpes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.Cpe}
     * objects contained in responses from the listCpes operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.Cpe} objects contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.Cpe> listCpesRecordIterator(
            final ListCpesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCpesRequest.Builder,
                ListCpesRequest,
                ListCpesResponse,
                com.oracle.bmc.core.model.Cpe>(
                new java.util.function.Supplier<ListCpesRequest.Builder>() {
                    @Override
                    public ListCpesRequest.Builder get() {
                        return ListCpesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCpesResponse, String>() {
                    @Override
                    public String apply(ListCpesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCpesRequest.Builder>,
                        ListCpesRequest>() {
                    @Override
                    public ListCpesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCpesRequest.Builder>
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
                new java.util.function.Function<ListCpesRequest, ListCpesResponse>() {
                    @Override
                    public ListCpesResponse apply(ListCpesRequest request) {
                        return client.listCpes(request);
                    }
                },
                new java.util.function.Function<
                        ListCpesResponse, java.util.List<com.oracle.bmc.core.model.Cpe>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.Cpe> apply(
                            ListCpesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCrossConnectGroups operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCrossConnectGroupsResponse> listCrossConnectGroupsResponseIterator(
            final ListCrossConnectGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCrossConnectGroupsRequest.Builder,
                ListCrossConnectGroupsRequest,
                ListCrossConnectGroupsResponse>(
                new java.util.function.Supplier<ListCrossConnectGroupsRequest.Builder>() {
                    @Override
                    public ListCrossConnectGroupsRequest.Builder get() {
                        return ListCrossConnectGroupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCrossConnectGroupsResponse, String>() {
                    @Override
                    public String apply(ListCrossConnectGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCrossConnectGroupsRequest.Builder>,
                        ListCrossConnectGroupsRequest>() {
                    @Override
                    public ListCrossConnectGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCrossConnectGroupsRequest.Builder>
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
                        ListCrossConnectGroupsRequest, ListCrossConnectGroupsResponse>() {
                    @Override
                    public ListCrossConnectGroupsResponse apply(
                            ListCrossConnectGroupsRequest request) {
                        return client.listCrossConnectGroups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.CrossConnectGroup} objects contained in responses from the
     * listCrossConnectGroups operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.CrossConnectGroup} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.core.model.CrossConnectGroup>
            listCrossConnectGroupsRecordIterator(final ListCrossConnectGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCrossConnectGroupsRequest.Builder,
                ListCrossConnectGroupsRequest,
                ListCrossConnectGroupsResponse,
                com.oracle.bmc.core.model.CrossConnectGroup>(
                new java.util.function.Supplier<ListCrossConnectGroupsRequest.Builder>() {
                    @Override
                    public ListCrossConnectGroupsRequest.Builder get() {
                        return ListCrossConnectGroupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCrossConnectGroupsResponse, String>() {
                    @Override
                    public String apply(ListCrossConnectGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCrossConnectGroupsRequest.Builder>,
                        ListCrossConnectGroupsRequest>() {
                    @Override
                    public ListCrossConnectGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCrossConnectGroupsRequest.Builder>
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
                        ListCrossConnectGroupsRequest, ListCrossConnectGroupsResponse>() {
                    @Override
                    public ListCrossConnectGroupsResponse apply(
                            ListCrossConnectGroupsRequest request) {
                        return client.listCrossConnectGroups(request);
                    }
                },
                new java.util.function.Function<
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
     * Creates a new iterable which will iterate over the responses received from the
     * listCrossConnectLocations operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCrossConnectLocationsResponse> listCrossConnectLocationsResponseIterator(
            final ListCrossConnectLocationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCrossConnectLocationsRequest.Builder,
                ListCrossConnectLocationsRequest,
                ListCrossConnectLocationsResponse>(
                new java.util.function.Supplier<ListCrossConnectLocationsRequest.Builder>() {
                    @Override
                    public ListCrossConnectLocationsRequest.Builder get() {
                        return ListCrossConnectLocationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCrossConnectLocationsResponse, String>() {
                    @Override
                    public String apply(ListCrossConnectLocationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCrossConnectLocationsRequest.Builder>,
                        ListCrossConnectLocationsRequest>() {
                    @Override
                    public ListCrossConnectLocationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCrossConnectLocationsRequest.Builder>
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
                        ListCrossConnectLocationsRequest, ListCrossConnectLocationsResponse>() {
                    @Override
                    public ListCrossConnectLocationsResponse apply(
                            ListCrossConnectLocationsRequest request) {
                        return client.listCrossConnectLocations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.CrossConnectLocation} objects contained in responses from the
     * listCrossConnectLocations operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.CrossConnectLocation} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.core.model.CrossConnectLocation>
            listCrossConnectLocationsRecordIterator(
                    final ListCrossConnectLocationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCrossConnectLocationsRequest.Builder,
                ListCrossConnectLocationsRequest,
                ListCrossConnectLocationsResponse,
                com.oracle.bmc.core.model.CrossConnectLocation>(
                new java.util.function.Supplier<ListCrossConnectLocationsRequest.Builder>() {
                    @Override
                    public ListCrossConnectLocationsRequest.Builder get() {
                        return ListCrossConnectLocationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCrossConnectLocationsResponse, String>() {
                    @Override
                    public String apply(ListCrossConnectLocationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCrossConnectLocationsRequest.Builder>,
                        ListCrossConnectLocationsRequest>() {
                    @Override
                    public ListCrossConnectLocationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCrossConnectLocationsRequest.Builder>
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
                        ListCrossConnectLocationsRequest, ListCrossConnectLocationsResponse>() {
                    @Override
                    public ListCrossConnectLocationsResponse apply(
                            ListCrossConnectLocationsRequest request) {
                        return client.listCrossConnectLocations(request);
                    }
                },
                new java.util.function.Function<
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
     * Creates a new iterable which will iterate over the responses received from the
     * listCrossConnects operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCrossConnectsResponse> listCrossConnectsResponseIterator(
            final ListCrossConnectsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCrossConnectsRequest.Builder,
                ListCrossConnectsRequest,
                ListCrossConnectsResponse>(
                new java.util.function.Supplier<ListCrossConnectsRequest.Builder>() {
                    @Override
                    public ListCrossConnectsRequest.Builder get() {
                        return ListCrossConnectsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCrossConnectsResponse, String>() {
                    @Override
                    public String apply(ListCrossConnectsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCrossConnectsRequest.Builder>,
                        ListCrossConnectsRequest>() {
                    @Override
                    public ListCrossConnectsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCrossConnectsRequest.Builder>
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
                        ListCrossConnectsRequest, ListCrossConnectsResponse>() {
                    @Override
                    public ListCrossConnectsResponse apply(ListCrossConnectsRequest request) {
                        return client.listCrossConnects(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.CrossConnect} objects contained in responses from the
     * listCrossConnects operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.CrossConnect} objects contained in responses received from the
     *     service.
     */
    public Iterable<com.oracle.bmc.core.model.CrossConnect> listCrossConnectsRecordIterator(
            final ListCrossConnectsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCrossConnectsRequest.Builder,
                ListCrossConnectsRequest,
                ListCrossConnectsResponse,
                com.oracle.bmc.core.model.CrossConnect>(
                new java.util.function.Supplier<ListCrossConnectsRequest.Builder>() {
                    @Override
                    public ListCrossConnectsRequest.Builder get() {
                        return ListCrossConnectsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCrossConnectsResponse, String>() {
                    @Override
                    public String apply(ListCrossConnectsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCrossConnectsRequest.Builder>,
                        ListCrossConnectsRequest>() {
                    @Override
                    public ListCrossConnectsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCrossConnectsRequest.Builder>
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
                        ListCrossConnectsRequest, ListCrossConnectsResponse>() {
                    @Override
                    public ListCrossConnectsResponse apply(ListCrossConnectsRequest request) {
                        return client.listCrossConnects(request);
                    }
                },
                new java.util.function.Function<
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
     * Creates a new iterable which will iterate over the responses received from the
     * listCrossconnectPortSpeedShapes operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCrossconnectPortSpeedShapesResponse>
            listCrossconnectPortSpeedShapesResponseIterator(
                    final ListCrossconnectPortSpeedShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCrossconnectPortSpeedShapesRequest.Builder,
                ListCrossconnectPortSpeedShapesRequest,
                ListCrossconnectPortSpeedShapesResponse>(
                new java.util.function.Supplier<ListCrossconnectPortSpeedShapesRequest.Builder>() {
                    @Override
                    public ListCrossconnectPortSpeedShapesRequest.Builder get() {
                        return ListCrossconnectPortSpeedShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCrossconnectPortSpeedShapesResponse, String>() {
                    @Override
                    public String apply(ListCrossconnectPortSpeedShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCrossconnectPortSpeedShapesRequest.Builder>,
                        ListCrossconnectPortSpeedShapesRequest>() {
                    @Override
                    public ListCrossconnectPortSpeedShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCrossconnectPortSpeedShapesRequest.Builder>
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.CrossConnectPortSpeedShape} objects contained in responses from the
     * listCrossconnectPortSpeedShapes operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.CrossConnectPortSpeedShape} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.CrossConnectPortSpeedShape>
            listCrossconnectPortSpeedShapesRecordIterator(
                    final ListCrossconnectPortSpeedShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCrossconnectPortSpeedShapesRequest.Builder,
                ListCrossconnectPortSpeedShapesRequest,
                ListCrossconnectPortSpeedShapesResponse,
                com.oracle.bmc.core.model.CrossConnectPortSpeedShape>(
                new java.util.function.Supplier<ListCrossconnectPortSpeedShapesRequest.Builder>() {
                    @Override
                    public ListCrossconnectPortSpeedShapesRequest.Builder get() {
                        return ListCrossconnectPortSpeedShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCrossconnectPortSpeedShapesResponse, String>() {
                    @Override
                    public String apply(ListCrossconnectPortSpeedShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCrossconnectPortSpeedShapesRequest.Builder>,
                        ListCrossconnectPortSpeedShapesRequest>() {
                    @Override
                    public ListCrossconnectPortSpeedShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCrossconnectPortSpeedShapesRequest.Builder>
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
                        ListCrossconnectPortSpeedShapesRequest,
                        ListCrossconnectPortSpeedShapesResponse>() {
                    @Override
                    public ListCrossconnectPortSpeedShapesResponse apply(
                            ListCrossconnectPortSpeedShapesRequest request) {
                        return client.listCrossconnectPortSpeedShapes(request);
                    }
                },
                new java.util.function.Function<
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
     * Creates a new iterable which will iterate over the responses received from the
     * listDhcpOptions operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDhcpOptionsResponse> listDhcpOptionsResponseIterator(
            final ListDhcpOptionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDhcpOptionsRequest.Builder, ListDhcpOptionsRequest, ListDhcpOptionsResponse>(
                new java.util.function.Supplier<ListDhcpOptionsRequest.Builder>() {
                    @Override
                    public ListDhcpOptionsRequest.Builder get() {
                        return ListDhcpOptionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDhcpOptionsResponse, String>() {
                    @Override
                    public String apply(ListDhcpOptionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDhcpOptionsRequest.Builder>,
                        ListDhcpOptionsRequest>() {
                    @Override
                    public ListDhcpOptionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDhcpOptionsRequest.Builder>
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
                new java.util.function.Function<ListDhcpOptionsRequest, ListDhcpOptionsResponse>() {
                    @Override
                    public ListDhcpOptionsResponse apply(ListDhcpOptionsRequest request) {
                        return client.listDhcpOptions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.DhcpOptions} objects contained in responses from the
     * listDhcpOptions operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.DhcpOptions} objects contained in responses received from the
     *     service.
     */
    public Iterable<com.oracle.bmc.core.model.DhcpOptions> listDhcpOptionsRecordIterator(
            final ListDhcpOptionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDhcpOptionsRequest.Builder,
                ListDhcpOptionsRequest,
                ListDhcpOptionsResponse,
                com.oracle.bmc.core.model.DhcpOptions>(
                new java.util.function.Supplier<ListDhcpOptionsRequest.Builder>() {
                    @Override
                    public ListDhcpOptionsRequest.Builder get() {
                        return ListDhcpOptionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDhcpOptionsResponse, String>() {
                    @Override
                    public String apply(ListDhcpOptionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDhcpOptionsRequest.Builder>,
                        ListDhcpOptionsRequest>() {
                    @Override
                    public ListDhcpOptionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDhcpOptionsRequest.Builder>
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
                new java.util.function.Function<ListDhcpOptionsRequest, ListDhcpOptionsResponse>() {
                    @Override
                    public ListDhcpOptionsResponse apply(ListDhcpOptionsRequest request) {
                        return client.listDhcpOptions(request);
                    }
                },
                new java.util.function.Function<
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
     * Creates a new iterable which will iterate over the responses received from the
     * listDrgAttachments operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDrgAttachmentsResponse> listDrgAttachmentsResponseIterator(
            final ListDrgAttachmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDrgAttachmentsRequest.Builder,
                ListDrgAttachmentsRequest,
                ListDrgAttachmentsResponse>(
                new java.util.function.Supplier<ListDrgAttachmentsRequest.Builder>() {
                    @Override
                    public ListDrgAttachmentsRequest.Builder get() {
                        return ListDrgAttachmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDrgAttachmentsResponse, String>() {
                    @Override
                    public String apply(ListDrgAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDrgAttachmentsRequest.Builder>,
                        ListDrgAttachmentsRequest>() {
                    @Override
                    public ListDrgAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDrgAttachmentsRequest.Builder>
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
                        ListDrgAttachmentsRequest, ListDrgAttachmentsResponse>() {
                    @Override
                    public ListDrgAttachmentsResponse apply(ListDrgAttachmentsRequest request) {
                        return client.listDrgAttachments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.DrgAttachment} objects contained in responses from the
     * listDrgAttachments operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.DrgAttachment} objects contained in responses received from the
     *     service.
     */
    public Iterable<com.oracle.bmc.core.model.DrgAttachment> listDrgAttachmentsRecordIterator(
            final ListDrgAttachmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDrgAttachmentsRequest.Builder,
                ListDrgAttachmentsRequest,
                ListDrgAttachmentsResponse,
                com.oracle.bmc.core.model.DrgAttachment>(
                new java.util.function.Supplier<ListDrgAttachmentsRequest.Builder>() {
                    @Override
                    public ListDrgAttachmentsRequest.Builder get() {
                        return ListDrgAttachmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDrgAttachmentsResponse, String>() {
                    @Override
                    public String apply(ListDrgAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDrgAttachmentsRequest.Builder>,
                        ListDrgAttachmentsRequest>() {
                    @Override
                    public ListDrgAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDrgAttachmentsRequest.Builder>
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
                        ListDrgAttachmentsRequest, ListDrgAttachmentsResponse>() {
                    @Override
                    public ListDrgAttachmentsResponse apply(ListDrgAttachmentsRequest request) {
                        return client.listDrgAttachments(request);
                    }
                },
                new java.util.function.Function<
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
     * Creates a new iterable which will iterate over the responses received from the
     * listDrgRouteDistributionStatements operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDrgRouteDistributionStatementsResponse>
            listDrgRouteDistributionStatementsResponseIterator(
                    final ListDrgRouteDistributionStatementsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDrgRouteDistributionStatementsRequest.Builder,
                ListDrgRouteDistributionStatementsRequest,
                ListDrgRouteDistributionStatementsResponse>(
                new java.util.function.Supplier<
                        ListDrgRouteDistributionStatementsRequest.Builder>() {
                    @Override
                    public ListDrgRouteDistributionStatementsRequest.Builder get() {
                        return ListDrgRouteDistributionStatementsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListDrgRouteDistributionStatementsResponse, String>() {
                    @Override
                    public String apply(ListDrgRouteDistributionStatementsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDrgRouteDistributionStatementsRequest.Builder>,
                        ListDrgRouteDistributionStatementsRequest>() {
                    @Override
                    public ListDrgRouteDistributionStatementsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDrgRouteDistributionStatementsRequest.Builder>
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
                        ListDrgRouteDistributionStatementsRequest,
                        ListDrgRouteDistributionStatementsResponse>() {
                    @Override
                    public ListDrgRouteDistributionStatementsResponse apply(
                            ListDrgRouteDistributionStatementsRequest request) {
                        return client.listDrgRouteDistributionStatements(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.DrgRouteDistributionStatement} objects contained in responses from
     * the listDrgRouteDistributionStatements operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.DrgRouteDistributionStatement} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.DrgRouteDistributionStatement>
            listDrgRouteDistributionStatementsRecordIterator(
                    final ListDrgRouteDistributionStatementsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDrgRouteDistributionStatementsRequest.Builder,
                ListDrgRouteDistributionStatementsRequest,
                ListDrgRouteDistributionStatementsResponse,
                com.oracle.bmc.core.model.DrgRouteDistributionStatement>(
                new java.util.function.Supplier<
                        ListDrgRouteDistributionStatementsRequest.Builder>() {
                    @Override
                    public ListDrgRouteDistributionStatementsRequest.Builder get() {
                        return ListDrgRouteDistributionStatementsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListDrgRouteDistributionStatementsResponse, String>() {
                    @Override
                    public String apply(ListDrgRouteDistributionStatementsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDrgRouteDistributionStatementsRequest.Builder>,
                        ListDrgRouteDistributionStatementsRequest>() {
                    @Override
                    public ListDrgRouteDistributionStatementsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDrgRouteDistributionStatementsRequest.Builder>
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
                        ListDrgRouteDistributionStatementsRequest,
                        ListDrgRouteDistributionStatementsResponse>() {
                    @Override
                    public ListDrgRouteDistributionStatementsResponse apply(
                            ListDrgRouteDistributionStatementsRequest request) {
                        return client.listDrgRouteDistributionStatements(request);
                    }
                },
                new java.util.function.Function<
                        ListDrgRouteDistributionStatementsResponse,
                        java.util.List<com.oracle.bmc.core.model.DrgRouteDistributionStatement>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.DrgRouteDistributionStatement>
                            apply(ListDrgRouteDistributionStatementsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDrgRouteDistributions operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDrgRouteDistributionsResponse> listDrgRouteDistributionsResponseIterator(
            final ListDrgRouteDistributionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDrgRouteDistributionsRequest.Builder,
                ListDrgRouteDistributionsRequest,
                ListDrgRouteDistributionsResponse>(
                new java.util.function.Supplier<ListDrgRouteDistributionsRequest.Builder>() {
                    @Override
                    public ListDrgRouteDistributionsRequest.Builder get() {
                        return ListDrgRouteDistributionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDrgRouteDistributionsResponse, String>() {
                    @Override
                    public String apply(ListDrgRouteDistributionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDrgRouteDistributionsRequest.Builder>,
                        ListDrgRouteDistributionsRequest>() {
                    @Override
                    public ListDrgRouteDistributionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDrgRouteDistributionsRequest.Builder>
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
                        ListDrgRouteDistributionsRequest, ListDrgRouteDistributionsResponse>() {
                    @Override
                    public ListDrgRouteDistributionsResponse apply(
                            ListDrgRouteDistributionsRequest request) {
                        return client.listDrgRouteDistributions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.DrgRouteDistribution} objects contained in responses from the
     * listDrgRouteDistributions operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.DrgRouteDistribution} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.core.model.DrgRouteDistribution>
            listDrgRouteDistributionsRecordIterator(
                    final ListDrgRouteDistributionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDrgRouteDistributionsRequest.Builder,
                ListDrgRouteDistributionsRequest,
                ListDrgRouteDistributionsResponse,
                com.oracle.bmc.core.model.DrgRouteDistribution>(
                new java.util.function.Supplier<ListDrgRouteDistributionsRequest.Builder>() {
                    @Override
                    public ListDrgRouteDistributionsRequest.Builder get() {
                        return ListDrgRouteDistributionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDrgRouteDistributionsResponse, String>() {
                    @Override
                    public String apply(ListDrgRouteDistributionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDrgRouteDistributionsRequest.Builder>,
                        ListDrgRouteDistributionsRequest>() {
                    @Override
                    public ListDrgRouteDistributionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDrgRouteDistributionsRequest.Builder>
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
                        ListDrgRouteDistributionsRequest, ListDrgRouteDistributionsResponse>() {
                    @Override
                    public ListDrgRouteDistributionsResponse apply(
                            ListDrgRouteDistributionsRequest request) {
                        return client.listDrgRouteDistributions(request);
                    }
                },
                new java.util.function.Function<
                        ListDrgRouteDistributionsResponse,
                        java.util.List<com.oracle.bmc.core.model.DrgRouteDistribution>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.DrgRouteDistribution> apply(
                            ListDrgRouteDistributionsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDrgRouteRules operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDrgRouteRulesResponse> listDrgRouteRulesResponseIterator(
            final ListDrgRouteRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDrgRouteRulesRequest.Builder,
                ListDrgRouteRulesRequest,
                ListDrgRouteRulesResponse>(
                new java.util.function.Supplier<ListDrgRouteRulesRequest.Builder>() {
                    @Override
                    public ListDrgRouteRulesRequest.Builder get() {
                        return ListDrgRouteRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDrgRouteRulesResponse, String>() {
                    @Override
                    public String apply(ListDrgRouteRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDrgRouteRulesRequest.Builder>,
                        ListDrgRouteRulesRequest>() {
                    @Override
                    public ListDrgRouteRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDrgRouteRulesRequest.Builder>
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
                        ListDrgRouteRulesRequest, ListDrgRouteRulesResponse>() {
                    @Override
                    public ListDrgRouteRulesResponse apply(ListDrgRouteRulesRequest request) {
                        return client.listDrgRouteRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.DrgRouteRule} objects contained in responses from the
     * listDrgRouteRules operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.DrgRouteRule} objects contained in responses received from the
     *     service.
     */
    public Iterable<com.oracle.bmc.core.model.DrgRouteRule> listDrgRouteRulesRecordIterator(
            final ListDrgRouteRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDrgRouteRulesRequest.Builder,
                ListDrgRouteRulesRequest,
                ListDrgRouteRulesResponse,
                com.oracle.bmc.core.model.DrgRouteRule>(
                new java.util.function.Supplier<ListDrgRouteRulesRequest.Builder>() {
                    @Override
                    public ListDrgRouteRulesRequest.Builder get() {
                        return ListDrgRouteRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDrgRouteRulesResponse, String>() {
                    @Override
                    public String apply(ListDrgRouteRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDrgRouteRulesRequest.Builder>,
                        ListDrgRouteRulesRequest>() {
                    @Override
                    public ListDrgRouteRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDrgRouteRulesRequest.Builder>
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
                        ListDrgRouteRulesRequest, ListDrgRouteRulesResponse>() {
                    @Override
                    public ListDrgRouteRulesResponse apply(ListDrgRouteRulesRequest request) {
                        return client.listDrgRouteRules(request);
                    }
                },
                new java.util.function.Function<
                        ListDrgRouteRulesResponse,
                        java.util.List<com.oracle.bmc.core.model.DrgRouteRule>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.DrgRouteRule> apply(
                            ListDrgRouteRulesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDrgRouteTables operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDrgRouteTablesResponse> listDrgRouteTablesResponseIterator(
            final ListDrgRouteTablesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDrgRouteTablesRequest.Builder,
                ListDrgRouteTablesRequest,
                ListDrgRouteTablesResponse>(
                new java.util.function.Supplier<ListDrgRouteTablesRequest.Builder>() {
                    @Override
                    public ListDrgRouteTablesRequest.Builder get() {
                        return ListDrgRouteTablesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDrgRouteTablesResponse, String>() {
                    @Override
                    public String apply(ListDrgRouteTablesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDrgRouteTablesRequest.Builder>,
                        ListDrgRouteTablesRequest>() {
                    @Override
                    public ListDrgRouteTablesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDrgRouteTablesRequest.Builder>
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
                        ListDrgRouteTablesRequest, ListDrgRouteTablesResponse>() {
                    @Override
                    public ListDrgRouteTablesResponse apply(ListDrgRouteTablesRequest request) {
                        return client.listDrgRouteTables(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.DrgRouteTable} objects contained in responses from the
     * listDrgRouteTables operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.DrgRouteTable} objects contained in responses received from the
     *     service.
     */
    public Iterable<com.oracle.bmc.core.model.DrgRouteTable> listDrgRouteTablesRecordIterator(
            final ListDrgRouteTablesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDrgRouteTablesRequest.Builder,
                ListDrgRouteTablesRequest,
                ListDrgRouteTablesResponse,
                com.oracle.bmc.core.model.DrgRouteTable>(
                new java.util.function.Supplier<ListDrgRouteTablesRequest.Builder>() {
                    @Override
                    public ListDrgRouteTablesRequest.Builder get() {
                        return ListDrgRouteTablesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDrgRouteTablesResponse, String>() {
                    @Override
                    public String apply(ListDrgRouteTablesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDrgRouteTablesRequest.Builder>,
                        ListDrgRouteTablesRequest>() {
                    @Override
                    public ListDrgRouteTablesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDrgRouteTablesRequest.Builder>
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
                        ListDrgRouteTablesRequest, ListDrgRouteTablesResponse>() {
                    @Override
                    public ListDrgRouteTablesResponse apply(ListDrgRouteTablesRequest request) {
                        return client.listDrgRouteTables(request);
                    }
                },
                new java.util.function.Function<
                        ListDrgRouteTablesResponse,
                        java.util.List<com.oracle.bmc.core.model.DrgRouteTable>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.DrgRouteTable> apply(
                            ListDrgRouteTablesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDrgs
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDrgsResponse> listDrgsResponseIterator(final ListDrgsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDrgsRequest.Builder, ListDrgsRequest, ListDrgsResponse>(
                new java.util.function.Supplier<ListDrgsRequest.Builder>() {
                    @Override
                    public ListDrgsRequest.Builder get() {
                        return ListDrgsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDrgsResponse, String>() {
                    @Override
                    public String apply(ListDrgsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDrgsRequest.Builder>,
                        ListDrgsRequest>() {
                    @Override
                    public ListDrgsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDrgsRequest.Builder>
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
                new java.util.function.Function<ListDrgsRequest, ListDrgsResponse>() {
                    @Override
                    public ListDrgsResponse apply(ListDrgsRequest request) {
                        return client.listDrgs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.Drg}
     * objects contained in responses from the listDrgs operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.Drg} objects contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.Drg> listDrgsRecordIterator(
            final ListDrgsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDrgsRequest.Builder,
                ListDrgsRequest,
                ListDrgsResponse,
                com.oracle.bmc.core.model.Drg>(
                new java.util.function.Supplier<ListDrgsRequest.Builder>() {
                    @Override
                    public ListDrgsRequest.Builder get() {
                        return ListDrgsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDrgsResponse, String>() {
                    @Override
                    public String apply(ListDrgsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDrgsRequest.Builder>,
                        ListDrgsRequest>() {
                    @Override
                    public ListDrgsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDrgsRequest.Builder>
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
                new java.util.function.Function<ListDrgsRequest, ListDrgsResponse>() {
                    @Override
                    public ListDrgsResponse apply(ListDrgsRequest request) {
                        return client.listDrgs(request);
                    }
                },
                new java.util.function.Function<
                        ListDrgsResponse, java.util.List<com.oracle.bmc.core.model.Drg>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.Drg> apply(
                            ListDrgsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listFastConnectProviderServices operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListFastConnectProviderServicesResponse>
            listFastConnectProviderServicesResponseIterator(
                    final ListFastConnectProviderServicesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFastConnectProviderServicesRequest.Builder,
                ListFastConnectProviderServicesRequest,
                ListFastConnectProviderServicesResponse>(
                new java.util.function.Supplier<ListFastConnectProviderServicesRequest.Builder>() {
                    @Override
                    public ListFastConnectProviderServicesRequest.Builder get() {
                        return ListFastConnectProviderServicesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFastConnectProviderServicesResponse, String>() {
                    @Override
                    public String apply(ListFastConnectProviderServicesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFastConnectProviderServicesRequest.Builder>,
                        ListFastConnectProviderServicesRequest>() {
                    @Override
                    public ListFastConnectProviderServicesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFastConnectProviderServicesRequest.Builder>
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.FastConnectProviderService} objects contained in responses from the
     * listFastConnectProviderServices operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.FastConnectProviderService} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.FastConnectProviderService>
            listFastConnectProviderServicesRecordIterator(
                    final ListFastConnectProviderServicesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFastConnectProviderServicesRequest.Builder,
                ListFastConnectProviderServicesRequest,
                ListFastConnectProviderServicesResponse,
                com.oracle.bmc.core.model.FastConnectProviderService>(
                new java.util.function.Supplier<ListFastConnectProviderServicesRequest.Builder>() {
                    @Override
                    public ListFastConnectProviderServicesRequest.Builder get() {
                        return ListFastConnectProviderServicesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFastConnectProviderServicesResponse, String>() {
                    @Override
                    public String apply(ListFastConnectProviderServicesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFastConnectProviderServicesRequest.Builder>,
                        ListFastConnectProviderServicesRequest>() {
                    @Override
                    public ListFastConnectProviderServicesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFastConnectProviderServicesRequest.Builder>
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
                        ListFastConnectProviderServicesRequest,
                        ListFastConnectProviderServicesResponse>() {
                    @Override
                    public ListFastConnectProviderServicesResponse apply(
                            ListFastConnectProviderServicesRequest request) {
                        return client.listFastConnectProviderServices(request);
                    }
                },
                new java.util.function.Function<
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
     * Creates a new iterable which will iterate over the responses received from the
     * listFastConnectProviderVirtualCircuitBandwidthShapes operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListFastConnectProviderVirtualCircuitBandwidthShapesResponse>
            listFastConnectProviderVirtualCircuitBandwidthShapesResponseIterator(
                    final ListFastConnectProviderVirtualCircuitBandwidthShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFastConnectProviderVirtualCircuitBandwidthShapesRequest.Builder,
                ListFastConnectProviderVirtualCircuitBandwidthShapesRequest,
                ListFastConnectProviderVirtualCircuitBandwidthShapesResponse>(
                new java.util.function.Supplier<
                        ListFastConnectProviderVirtualCircuitBandwidthShapesRequest.Builder>() {
                    @Override
                    public ListFastConnectProviderVirtualCircuitBandwidthShapesRequest.Builder
                            get() {
                        return ListFastConnectProviderVirtualCircuitBandwidthShapesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListFastConnectProviderVirtualCircuitBandwidthShapesResponse, String>() {
                    @Override
                    public String apply(
                            ListFastConnectProviderVirtualCircuitBandwidthShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.VirtualCircuitBandwidthShape} objects contained in responses from
     * the listFastConnectProviderVirtualCircuitBandwidthShapes operation. This iterable will fetch
     * more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.VirtualCircuitBandwidthShape} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.VirtualCircuitBandwidthShape>
            listFastConnectProviderVirtualCircuitBandwidthShapesRecordIterator(
                    final ListFastConnectProviderVirtualCircuitBandwidthShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFastConnectProviderVirtualCircuitBandwidthShapesRequest.Builder,
                ListFastConnectProviderVirtualCircuitBandwidthShapesRequest,
                ListFastConnectProviderVirtualCircuitBandwidthShapesResponse,
                com.oracle.bmc.core.model.VirtualCircuitBandwidthShape>(
                new java.util.function.Supplier<
                        ListFastConnectProviderVirtualCircuitBandwidthShapesRequest.Builder>() {
                    @Override
                    public ListFastConnectProviderVirtualCircuitBandwidthShapesRequest.Builder
                            get() {
                        return ListFastConnectProviderVirtualCircuitBandwidthShapesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListFastConnectProviderVirtualCircuitBandwidthShapesResponse, String>() {
                    @Override
                    public String apply(
                            ListFastConnectProviderVirtualCircuitBandwidthShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
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
                        ListFastConnectProviderVirtualCircuitBandwidthShapesRequest,
                        ListFastConnectProviderVirtualCircuitBandwidthShapesResponse>() {
                    @Override
                    public ListFastConnectProviderVirtualCircuitBandwidthShapesResponse apply(
                            ListFastConnectProviderVirtualCircuitBandwidthShapesRequest request) {
                        return client.listFastConnectProviderVirtualCircuitBandwidthShapes(request);
                    }
                },
                new java.util.function.Function<
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
     * Creates a new iterable which will iterate over the responses received from the
     * listIPSecConnectionTunnelRoutes operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListIPSecConnectionTunnelRoutesResponse>
            listIPSecConnectionTunnelRoutesResponseIterator(
                    final ListIPSecConnectionTunnelRoutesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListIPSecConnectionTunnelRoutesRequest.Builder,
                ListIPSecConnectionTunnelRoutesRequest,
                ListIPSecConnectionTunnelRoutesResponse>(
                new java.util.function.Supplier<ListIPSecConnectionTunnelRoutesRequest.Builder>() {
                    @Override
                    public ListIPSecConnectionTunnelRoutesRequest.Builder get() {
                        return ListIPSecConnectionTunnelRoutesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListIPSecConnectionTunnelRoutesResponse, String>() {
                    @Override
                    public String apply(ListIPSecConnectionTunnelRoutesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIPSecConnectionTunnelRoutesRequest.Builder>,
                        ListIPSecConnectionTunnelRoutesRequest>() {
                    @Override
                    public ListIPSecConnectionTunnelRoutesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIPSecConnectionTunnelRoutesRequest.Builder>
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
                        ListIPSecConnectionTunnelRoutesRequest,
                        ListIPSecConnectionTunnelRoutesResponse>() {
                    @Override
                    public ListIPSecConnectionTunnelRoutesResponse apply(
                            ListIPSecConnectionTunnelRoutesRequest request) {
                        return client.listIPSecConnectionTunnelRoutes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.TunnelRouteSummary} objects contained in responses from the
     * listIPSecConnectionTunnelRoutes operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.TunnelRouteSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.core.model.TunnelRouteSummary>
            listIPSecConnectionTunnelRoutesRecordIterator(
                    final ListIPSecConnectionTunnelRoutesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListIPSecConnectionTunnelRoutesRequest.Builder,
                ListIPSecConnectionTunnelRoutesRequest,
                ListIPSecConnectionTunnelRoutesResponse,
                com.oracle.bmc.core.model.TunnelRouteSummary>(
                new java.util.function.Supplier<ListIPSecConnectionTunnelRoutesRequest.Builder>() {
                    @Override
                    public ListIPSecConnectionTunnelRoutesRequest.Builder get() {
                        return ListIPSecConnectionTunnelRoutesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListIPSecConnectionTunnelRoutesResponse, String>() {
                    @Override
                    public String apply(ListIPSecConnectionTunnelRoutesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIPSecConnectionTunnelRoutesRequest.Builder>,
                        ListIPSecConnectionTunnelRoutesRequest>() {
                    @Override
                    public ListIPSecConnectionTunnelRoutesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIPSecConnectionTunnelRoutesRequest.Builder>
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
                        ListIPSecConnectionTunnelRoutesRequest,
                        ListIPSecConnectionTunnelRoutesResponse>() {
                    @Override
                    public ListIPSecConnectionTunnelRoutesResponse apply(
                            ListIPSecConnectionTunnelRoutesRequest request) {
                        return client.listIPSecConnectionTunnelRoutes(request);
                    }
                },
                new java.util.function.Function<
                        ListIPSecConnectionTunnelRoutesResponse,
                        java.util.List<com.oracle.bmc.core.model.TunnelRouteSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.TunnelRouteSummary> apply(
                            ListIPSecConnectionTunnelRoutesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listIPSecConnectionTunnelSecurityAssociations operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListIPSecConnectionTunnelSecurityAssociationsResponse>
            listIPSecConnectionTunnelSecurityAssociationsResponseIterator(
                    final ListIPSecConnectionTunnelSecurityAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListIPSecConnectionTunnelSecurityAssociationsRequest.Builder,
                ListIPSecConnectionTunnelSecurityAssociationsRequest,
                ListIPSecConnectionTunnelSecurityAssociationsResponse>(
                new java.util.function.Supplier<
                        ListIPSecConnectionTunnelSecurityAssociationsRequest.Builder>() {
                    @Override
                    public ListIPSecConnectionTunnelSecurityAssociationsRequest.Builder get() {
                        return ListIPSecConnectionTunnelSecurityAssociationsRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListIPSecConnectionTunnelSecurityAssociationsResponse, String>() {
                    @Override
                    public String apply(
                            ListIPSecConnectionTunnelSecurityAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIPSecConnectionTunnelSecurityAssociationsRequest.Builder>,
                        ListIPSecConnectionTunnelSecurityAssociationsRequest>() {
                    @Override
                    public ListIPSecConnectionTunnelSecurityAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIPSecConnectionTunnelSecurityAssociationsRequest
                                                    .Builder>
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
                        ListIPSecConnectionTunnelSecurityAssociationsRequest,
                        ListIPSecConnectionTunnelSecurityAssociationsResponse>() {
                    @Override
                    public ListIPSecConnectionTunnelSecurityAssociationsResponse apply(
                            ListIPSecConnectionTunnelSecurityAssociationsRequest request) {
                        return client.listIPSecConnectionTunnelSecurityAssociations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.TunnelSecurityAssociationSummary} objects contained in responses
     * from the listIPSecConnectionTunnelSecurityAssociations operation. This iterable will fetch
     * more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.TunnelSecurityAssociationSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.TunnelSecurityAssociationSummary>
            listIPSecConnectionTunnelSecurityAssociationsRecordIterator(
                    final ListIPSecConnectionTunnelSecurityAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListIPSecConnectionTunnelSecurityAssociationsRequest.Builder,
                ListIPSecConnectionTunnelSecurityAssociationsRequest,
                ListIPSecConnectionTunnelSecurityAssociationsResponse,
                com.oracle.bmc.core.model.TunnelSecurityAssociationSummary>(
                new java.util.function.Supplier<
                        ListIPSecConnectionTunnelSecurityAssociationsRequest.Builder>() {
                    @Override
                    public ListIPSecConnectionTunnelSecurityAssociationsRequest.Builder get() {
                        return ListIPSecConnectionTunnelSecurityAssociationsRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListIPSecConnectionTunnelSecurityAssociationsResponse, String>() {
                    @Override
                    public String apply(
                            ListIPSecConnectionTunnelSecurityAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIPSecConnectionTunnelSecurityAssociationsRequest.Builder>,
                        ListIPSecConnectionTunnelSecurityAssociationsRequest>() {
                    @Override
                    public ListIPSecConnectionTunnelSecurityAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIPSecConnectionTunnelSecurityAssociationsRequest
                                                    .Builder>
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
                        ListIPSecConnectionTunnelSecurityAssociationsRequest,
                        ListIPSecConnectionTunnelSecurityAssociationsResponse>() {
                    @Override
                    public ListIPSecConnectionTunnelSecurityAssociationsResponse apply(
                            ListIPSecConnectionTunnelSecurityAssociationsRequest request) {
                        return client.listIPSecConnectionTunnelSecurityAssociations(request);
                    }
                },
                new java.util.function.Function<
                        ListIPSecConnectionTunnelSecurityAssociationsResponse,
                        java.util.List<
                                com.oracle.bmc.core.model.TunnelSecurityAssociationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.core.model.TunnelSecurityAssociationSummary>
                            apply(ListIPSecConnectionTunnelSecurityAssociationsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listIPSecConnectionTunnels operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListIPSecConnectionTunnelsResponse> listIPSecConnectionTunnelsResponseIterator(
            final ListIPSecConnectionTunnelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListIPSecConnectionTunnelsRequest.Builder,
                ListIPSecConnectionTunnelsRequest,
                ListIPSecConnectionTunnelsResponse>(
                new java.util.function.Supplier<ListIPSecConnectionTunnelsRequest.Builder>() {
                    @Override
                    public ListIPSecConnectionTunnelsRequest.Builder get() {
                        return ListIPSecConnectionTunnelsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListIPSecConnectionTunnelsResponse, String>() {
                    @Override
                    public String apply(ListIPSecConnectionTunnelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIPSecConnectionTunnelsRequest.Builder>,
                        ListIPSecConnectionTunnelsRequest>() {
                    @Override
                    public ListIPSecConnectionTunnelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIPSecConnectionTunnelsRequest.Builder>
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
                        ListIPSecConnectionTunnelsRequest, ListIPSecConnectionTunnelsResponse>() {
                    @Override
                    public ListIPSecConnectionTunnelsResponse apply(
                            ListIPSecConnectionTunnelsRequest request) {
                        return client.listIPSecConnectionTunnels(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.IPSecConnectionTunnel} objects contained in responses from the
     * listIPSecConnectionTunnels operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.IPSecConnectionTunnel} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.core.model.IPSecConnectionTunnel>
            listIPSecConnectionTunnelsRecordIterator(
                    final ListIPSecConnectionTunnelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListIPSecConnectionTunnelsRequest.Builder,
                ListIPSecConnectionTunnelsRequest,
                ListIPSecConnectionTunnelsResponse,
                com.oracle.bmc.core.model.IPSecConnectionTunnel>(
                new java.util.function.Supplier<ListIPSecConnectionTunnelsRequest.Builder>() {
                    @Override
                    public ListIPSecConnectionTunnelsRequest.Builder get() {
                        return ListIPSecConnectionTunnelsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListIPSecConnectionTunnelsResponse, String>() {
                    @Override
                    public String apply(ListIPSecConnectionTunnelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIPSecConnectionTunnelsRequest.Builder>,
                        ListIPSecConnectionTunnelsRequest>() {
                    @Override
                    public ListIPSecConnectionTunnelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIPSecConnectionTunnelsRequest.Builder>
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
                        ListIPSecConnectionTunnelsRequest, ListIPSecConnectionTunnelsResponse>() {
                    @Override
                    public ListIPSecConnectionTunnelsResponse apply(
                            ListIPSecConnectionTunnelsRequest request) {
                        return client.listIPSecConnectionTunnels(request);
                    }
                },
                new java.util.function.Function<
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
     * Creates a new iterable which will iterate over the responses received from the
     * listIPSecConnections operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListIPSecConnectionsResponse> listIPSecConnectionsResponseIterator(
            final ListIPSecConnectionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListIPSecConnectionsRequest.Builder,
                ListIPSecConnectionsRequest,
                ListIPSecConnectionsResponse>(
                new java.util.function.Supplier<ListIPSecConnectionsRequest.Builder>() {
                    @Override
                    public ListIPSecConnectionsRequest.Builder get() {
                        return ListIPSecConnectionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListIPSecConnectionsResponse, String>() {
                    @Override
                    public String apply(ListIPSecConnectionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIPSecConnectionsRequest.Builder>,
                        ListIPSecConnectionsRequest>() {
                    @Override
                    public ListIPSecConnectionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIPSecConnectionsRequest.Builder>
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
                        ListIPSecConnectionsRequest, ListIPSecConnectionsResponse>() {
                    @Override
                    public ListIPSecConnectionsResponse apply(ListIPSecConnectionsRequest request) {
                        return client.listIPSecConnections(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.IPSecConnection} objects contained in responses from the
     * listIPSecConnections operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.IPSecConnection} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.core.model.IPSecConnection> listIPSecConnectionsRecordIterator(
            final ListIPSecConnectionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListIPSecConnectionsRequest.Builder,
                ListIPSecConnectionsRequest,
                ListIPSecConnectionsResponse,
                com.oracle.bmc.core.model.IPSecConnection>(
                new java.util.function.Supplier<ListIPSecConnectionsRequest.Builder>() {
                    @Override
                    public ListIPSecConnectionsRequest.Builder get() {
                        return ListIPSecConnectionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListIPSecConnectionsResponse, String>() {
                    @Override
                    public String apply(ListIPSecConnectionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIPSecConnectionsRequest.Builder>,
                        ListIPSecConnectionsRequest>() {
                    @Override
                    public ListIPSecConnectionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIPSecConnectionsRequest.Builder>
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
                        ListIPSecConnectionsRequest, ListIPSecConnectionsResponse>() {
                    @Override
                    public ListIPSecConnectionsResponse apply(ListIPSecConnectionsRequest request) {
                        return client.listIPSecConnections(request);
                    }
                },
                new java.util.function.Function<
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
     * Creates a new iterable which will iterate over the responses received from the
     * listInternetGateways operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListInternetGatewaysResponse> listInternetGatewaysResponseIterator(
            final ListInternetGatewaysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListInternetGatewaysRequest.Builder,
                ListInternetGatewaysRequest,
                ListInternetGatewaysResponse>(
                new java.util.function.Supplier<ListInternetGatewaysRequest.Builder>() {
                    @Override
                    public ListInternetGatewaysRequest.Builder get() {
                        return ListInternetGatewaysRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListInternetGatewaysResponse, String>() {
                    @Override
                    public String apply(ListInternetGatewaysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInternetGatewaysRequest.Builder>,
                        ListInternetGatewaysRequest>() {
                    @Override
                    public ListInternetGatewaysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInternetGatewaysRequest.Builder>
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
                        ListInternetGatewaysRequest, ListInternetGatewaysResponse>() {
                    @Override
                    public ListInternetGatewaysResponse apply(ListInternetGatewaysRequest request) {
                        return client.listInternetGateways(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.InternetGateway} objects contained in responses from the
     * listInternetGateways operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.InternetGateway} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.core.model.InternetGateway> listInternetGatewaysRecordIterator(
            final ListInternetGatewaysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListInternetGatewaysRequest.Builder,
                ListInternetGatewaysRequest,
                ListInternetGatewaysResponse,
                com.oracle.bmc.core.model.InternetGateway>(
                new java.util.function.Supplier<ListInternetGatewaysRequest.Builder>() {
                    @Override
                    public ListInternetGatewaysRequest.Builder get() {
                        return ListInternetGatewaysRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListInternetGatewaysResponse, String>() {
                    @Override
                    public String apply(ListInternetGatewaysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInternetGatewaysRequest.Builder>,
                        ListInternetGatewaysRequest>() {
                    @Override
                    public ListInternetGatewaysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInternetGatewaysRequest.Builder>
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
                        ListInternetGatewaysRequest, ListInternetGatewaysResponse>() {
                    @Override
                    public ListInternetGatewaysResponse apply(ListInternetGatewaysRequest request) {
                        return client.listInternetGateways(request);
                    }
                },
                new java.util.function.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listIpv6s
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListIpv6sResponse> listIpv6sResponseIterator(final ListIpv6sRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListIpv6sRequest.Builder, ListIpv6sRequest, ListIpv6sResponse>(
                new java.util.function.Supplier<ListIpv6sRequest.Builder>() {
                    @Override
                    public ListIpv6sRequest.Builder get() {
                        return ListIpv6sRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListIpv6sResponse, String>() {
                    @Override
                    public String apply(ListIpv6sResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIpv6sRequest.Builder>,
                        ListIpv6sRequest>() {
                    @Override
                    public ListIpv6sRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIpv6sRequest.Builder>
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
                new java.util.function.Function<ListIpv6sRequest, ListIpv6sResponse>() {
                    @Override
                    public ListIpv6sResponse apply(ListIpv6sRequest request) {
                        return client.listIpv6s(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.Ipv6}
     * objects contained in responses from the listIpv6s operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.Ipv6} objects contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.Ipv6> listIpv6sRecordIterator(
            final ListIpv6sRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListIpv6sRequest.Builder,
                ListIpv6sRequest,
                ListIpv6sResponse,
                com.oracle.bmc.core.model.Ipv6>(
                new java.util.function.Supplier<ListIpv6sRequest.Builder>() {
                    @Override
                    public ListIpv6sRequest.Builder get() {
                        return ListIpv6sRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListIpv6sResponse, String>() {
                    @Override
                    public String apply(ListIpv6sResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIpv6sRequest.Builder>,
                        ListIpv6sRequest>() {
                    @Override
                    public ListIpv6sRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIpv6sRequest.Builder>
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
                new java.util.function.Function<ListIpv6sRequest, ListIpv6sResponse>() {
                    @Override
                    public ListIpv6sResponse apply(ListIpv6sRequest request) {
                        return client.listIpv6s(request);
                    }
                },
                new java.util.function.Function<
                        ListIpv6sResponse, java.util.List<com.oracle.bmc.core.model.Ipv6>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.Ipv6> apply(
                            ListIpv6sResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listLocalPeeringGateways operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListLocalPeeringGatewaysResponse> listLocalPeeringGatewaysResponseIterator(
            final ListLocalPeeringGatewaysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLocalPeeringGatewaysRequest.Builder,
                ListLocalPeeringGatewaysRequest,
                ListLocalPeeringGatewaysResponse>(
                new java.util.function.Supplier<ListLocalPeeringGatewaysRequest.Builder>() {
                    @Override
                    public ListLocalPeeringGatewaysRequest.Builder get() {
                        return ListLocalPeeringGatewaysRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLocalPeeringGatewaysResponse, String>() {
                    @Override
                    public String apply(ListLocalPeeringGatewaysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLocalPeeringGatewaysRequest.Builder>,
                        ListLocalPeeringGatewaysRequest>() {
                    @Override
                    public ListLocalPeeringGatewaysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLocalPeeringGatewaysRequest.Builder>
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
                        ListLocalPeeringGatewaysRequest, ListLocalPeeringGatewaysResponse>() {
                    @Override
                    public ListLocalPeeringGatewaysResponse apply(
                            ListLocalPeeringGatewaysRequest request) {
                        return client.listLocalPeeringGateways(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.LocalPeeringGateway} objects contained in responses from the
     * listLocalPeeringGateways operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.LocalPeeringGateway} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.core.model.LocalPeeringGateway>
            listLocalPeeringGatewaysRecordIterator(final ListLocalPeeringGatewaysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLocalPeeringGatewaysRequest.Builder,
                ListLocalPeeringGatewaysRequest,
                ListLocalPeeringGatewaysResponse,
                com.oracle.bmc.core.model.LocalPeeringGateway>(
                new java.util.function.Supplier<ListLocalPeeringGatewaysRequest.Builder>() {
                    @Override
                    public ListLocalPeeringGatewaysRequest.Builder get() {
                        return ListLocalPeeringGatewaysRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLocalPeeringGatewaysResponse, String>() {
                    @Override
                    public String apply(ListLocalPeeringGatewaysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLocalPeeringGatewaysRequest.Builder>,
                        ListLocalPeeringGatewaysRequest>() {
                    @Override
                    public ListLocalPeeringGatewaysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLocalPeeringGatewaysRequest.Builder>
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
                        ListLocalPeeringGatewaysRequest, ListLocalPeeringGatewaysResponse>() {
                    @Override
                    public ListLocalPeeringGatewaysResponse apply(
                            ListLocalPeeringGatewaysRequest request) {
                        return client.listLocalPeeringGateways(request);
                    }
                },
                new java.util.function.Function<
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
     * Creates a new iterable which will iterate over the responses received from the
     * listNatGateways operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListNatGatewaysResponse> listNatGatewaysResponseIterator(
            final ListNatGatewaysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListNatGatewaysRequest.Builder, ListNatGatewaysRequest, ListNatGatewaysResponse>(
                new java.util.function.Supplier<ListNatGatewaysRequest.Builder>() {
                    @Override
                    public ListNatGatewaysRequest.Builder get() {
                        return ListNatGatewaysRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListNatGatewaysResponse, String>() {
                    @Override
                    public String apply(ListNatGatewaysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNatGatewaysRequest.Builder>,
                        ListNatGatewaysRequest>() {
                    @Override
                    public ListNatGatewaysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNatGatewaysRequest.Builder>
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
                new java.util.function.Function<ListNatGatewaysRequest, ListNatGatewaysResponse>() {
                    @Override
                    public ListNatGatewaysResponse apply(ListNatGatewaysRequest request) {
                        return client.listNatGateways(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.NatGateway} objects contained in responses from the listNatGateways
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.NatGateway} objects contained in responses received from the
     *     service.
     */
    public Iterable<com.oracle.bmc.core.model.NatGateway> listNatGatewaysRecordIterator(
            final ListNatGatewaysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListNatGatewaysRequest.Builder,
                ListNatGatewaysRequest,
                ListNatGatewaysResponse,
                com.oracle.bmc.core.model.NatGateway>(
                new java.util.function.Supplier<ListNatGatewaysRequest.Builder>() {
                    @Override
                    public ListNatGatewaysRequest.Builder get() {
                        return ListNatGatewaysRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListNatGatewaysResponse, String>() {
                    @Override
                    public String apply(ListNatGatewaysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNatGatewaysRequest.Builder>,
                        ListNatGatewaysRequest>() {
                    @Override
                    public ListNatGatewaysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNatGatewaysRequest.Builder>
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
                new java.util.function.Function<ListNatGatewaysRequest, ListNatGatewaysResponse>() {
                    @Override
                    public ListNatGatewaysResponse apply(ListNatGatewaysRequest request) {
                        return client.listNatGateways(request);
                    }
                },
                new java.util.function.Function<
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
     * Creates a new iterable which will iterate over the responses received from the
     * listNetworkSecurityGroupSecurityRules operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListNetworkSecurityGroupSecurityRulesResponse>
            listNetworkSecurityGroupSecurityRulesResponseIterator(
                    final ListNetworkSecurityGroupSecurityRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListNetworkSecurityGroupSecurityRulesRequest.Builder,
                ListNetworkSecurityGroupSecurityRulesRequest,
                ListNetworkSecurityGroupSecurityRulesResponse>(
                new java.util.function.Supplier<
                        ListNetworkSecurityGroupSecurityRulesRequest.Builder>() {
                    @Override
                    public ListNetworkSecurityGroupSecurityRulesRequest.Builder get() {
                        return ListNetworkSecurityGroupSecurityRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListNetworkSecurityGroupSecurityRulesResponse, String>() {
                    @Override
                    public String apply(ListNetworkSecurityGroupSecurityRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNetworkSecurityGroupSecurityRulesRequest.Builder>,
                        ListNetworkSecurityGroupSecurityRulesRequest>() {
                    @Override
                    public ListNetworkSecurityGroupSecurityRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNetworkSecurityGroupSecurityRulesRequest.Builder>
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.SecurityRule} objects contained in responses from the
     * listNetworkSecurityGroupSecurityRules operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.SecurityRule} objects contained in responses received from the
     *     service.
     */
    public Iterable<com.oracle.bmc.core.model.SecurityRule>
            listNetworkSecurityGroupSecurityRulesRecordIterator(
                    final ListNetworkSecurityGroupSecurityRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListNetworkSecurityGroupSecurityRulesRequest.Builder,
                ListNetworkSecurityGroupSecurityRulesRequest,
                ListNetworkSecurityGroupSecurityRulesResponse,
                com.oracle.bmc.core.model.SecurityRule>(
                new java.util.function.Supplier<
                        ListNetworkSecurityGroupSecurityRulesRequest.Builder>() {
                    @Override
                    public ListNetworkSecurityGroupSecurityRulesRequest.Builder get() {
                        return ListNetworkSecurityGroupSecurityRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListNetworkSecurityGroupSecurityRulesResponse, String>() {
                    @Override
                    public String apply(ListNetworkSecurityGroupSecurityRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNetworkSecurityGroupSecurityRulesRequest.Builder>,
                        ListNetworkSecurityGroupSecurityRulesRequest>() {
                    @Override
                    public ListNetworkSecurityGroupSecurityRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNetworkSecurityGroupSecurityRulesRequest.Builder>
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
                        ListNetworkSecurityGroupSecurityRulesRequest,
                        ListNetworkSecurityGroupSecurityRulesResponse>() {
                    @Override
                    public ListNetworkSecurityGroupSecurityRulesResponse apply(
                            ListNetworkSecurityGroupSecurityRulesRequest request) {
                        return client.listNetworkSecurityGroupSecurityRules(request);
                    }
                },
                new java.util.function.Function<
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
     * Creates a new iterable which will iterate over the responses received from the
     * listNetworkSecurityGroupVnics operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListNetworkSecurityGroupVnicsResponse>
            listNetworkSecurityGroupVnicsResponseIterator(
                    final ListNetworkSecurityGroupVnicsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListNetworkSecurityGroupVnicsRequest.Builder,
                ListNetworkSecurityGroupVnicsRequest,
                ListNetworkSecurityGroupVnicsResponse>(
                new java.util.function.Supplier<ListNetworkSecurityGroupVnicsRequest.Builder>() {
                    @Override
                    public ListNetworkSecurityGroupVnicsRequest.Builder get() {
                        return ListNetworkSecurityGroupVnicsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListNetworkSecurityGroupVnicsResponse, String>() {
                    @Override
                    public String apply(ListNetworkSecurityGroupVnicsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNetworkSecurityGroupVnicsRequest.Builder>,
                        ListNetworkSecurityGroupVnicsRequest>() {
                    @Override
                    public ListNetworkSecurityGroupVnicsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNetworkSecurityGroupVnicsRequest.Builder>
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.NetworkSecurityGroupVnic} objects contained in responses from the
     * listNetworkSecurityGroupVnics operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.NetworkSecurityGroupVnic} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.NetworkSecurityGroupVnic>
            listNetworkSecurityGroupVnicsRecordIterator(
                    final ListNetworkSecurityGroupVnicsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListNetworkSecurityGroupVnicsRequest.Builder,
                ListNetworkSecurityGroupVnicsRequest,
                ListNetworkSecurityGroupVnicsResponse,
                com.oracle.bmc.core.model.NetworkSecurityGroupVnic>(
                new java.util.function.Supplier<ListNetworkSecurityGroupVnicsRequest.Builder>() {
                    @Override
                    public ListNetworkSecurityGroupVnicsRequest.Builder get() {
                        return ListNetworkSecurityGroupVnicsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListNetworkSecurityGroupVnicsResponse, String>() {
                    @Override
                    public String apply(ListNetworkSecurityGroupVnicsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNetworkSecurityGroupVnicsRequest.Builder>,
                        ListNetworkSecurityGroupVnicsRequest>() {
                    @Override
                    public ListNetworkSecurityGroupVnicsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNetworkSecurityGroupVnicsRequest.Builder>
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
                        ListNetworkSecurityGroupVnicsRequest,
                        ListNetworkSecurityGroupVnicsResponse>() {
                    @Override
                    public ListNetworkSecurityGroupVnicsResponse apply(
                            ListNetworkSecurityGroupVnicsRequest request) {
                        return client.listNetworkSecurityGroupVnics(request);
                    }
                },
                new java.util.function.Function<
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
     * Creates a new iterable which will iterate over the responses received from the
     * listNetworkSecurityGroups operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListNetworkSecurityGroupsResponse> listNetworkSecurityGroupsResponseIterator(
            final ListNetworkSecurityGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListNetworkSecurityGroupsRequest.Builder,
                ListNetworkSecurityGroupsRequest,
                ListNetworkSecurityGroupsResponse>(
                new java.util.function.Supplier<ListNetworkSecurityGroupsRequest.Builder>() {
                    @Override
                    public ListNetworkSecurityGroupsRequest.Builder get() {
                        return ListNetworkSecurityGroupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListNetworkSecurityGroupsResponse, String>() {
                    @Override
                    public String apply(ListNetworkSecurityGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNetworkSecurityGroupsRequest.Builder>,
                        ListNetworkSecurityGroupsRequest>() {
                    @Override
                    public ListNetworkSecurityGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNetworkSecurityGroupsRequest.Builder>
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
                        ListNetworkSecurityGroupsRequest, ListNetworkSecurityGroupsResponse>() {
                    @Override
                    public ListNetworkSecurityGroupsResponse apply(
                            ListNetworkSecurityGroupsRequest request) {
                        return client.listNetworkSecurityGroups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.NetworkSecurityGroup} objects contained in responses from the
     * listNetworkSecurityGroups operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.NetworkSecurityGroup} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.core.model.NetworkSecurityGroup>
            listNetworkSecurityGroupsRecordIterator(
                    final ListNetworkSecurityGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListNetworkSecurityGroupsRequest.Builder,
                ListNetworkSecurityGroupsRequest,
                ListNetworkSecurityGroupsResponse,
                com.oracle.bmc.core.model.NetworkSecurityGroup>(
                new java.util.function.Supplier<ListNetworkSecurityGroupsRequest.Builder>() {
                    @Override
                    public ListNetworkSecurityGroupsRequest.Builder get() {
                        return ListNetworkSecurityGroupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListNetworkSecurityGroupsResponse, String>() {
                    @Override
                    public String apply(ListNetworkSecurityGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNetworkSecurityGroupsRequest.Builder>,
                        ListNetworkSecurityGroupsRequest>() {
                    @Override
                    public ListNetworkSecurityGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNetworkSecurityGroupsRequest.Builder>
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
                        ListNetworkSecurityGroupsRequest, ListNetworkSecurityGroupsResponse>() {
                    @Override
                    public ListNetworkSecurityGroupsResponse apply(
                            ListNetworkSecurityGroupsRequest request) {
                        return client.listNetworkSecurityGroups(request);
                    }
                },
                new java.util.function.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listPrivateIps
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListPrivateIpsResponse> listPrivateIpsResponseIterator(
            final ListPrivateIpsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPrivateIpsRequest.Builder, ListPrivateIpsRequest, ListPrivateIpsResponse>(
                new java.util.function.Supplier<ListPrivateIpsRequest.Builder>() {
                    @Override
                    public ListPrivateIpsRequest.Builder get() {
                        return ListPrivateIpsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPrivateIpsResponse, String>() {
                    @Override
                    public String apply(ListPrivateIpsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPrivateIpsRequest.Builder>,
                        ListPrivateIpsRequest>() {
                    @Override
                    public ListPrivateIpsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPrivateIpsRequest.Builder>
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
                new java.util.function.Function<ListPrivateIpsRequest, ListPrivateIpsResponse>() {
                    @Override
                    public ListPrivateIpsResponse apply(ListPrivateIpsRequest request) {
                        return client.listPrivateIps(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.PrivateIp} objects contained in responses from the listPrivateIps
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.PrivateIp} objects contained in responses received from the
     *     service.
     */
    public Iterable<com.oracle.bmc.core.model.PrivateIp> listPrivateIpsRecordIterator(
            final ListPrivateIpsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPrivateIpsRequest.Builder,
                ListPrivateIpsRequest,
                ListPrivateIpsResponse,
                com.oracle.bmc.core.model.PrivateIp>(
                new java.util.function.Supplier<ListPrivateIpsRequest.Builder>() {
                    @Override
                    public ListPrivateIpsRequest.Builder get() {
                        return ListPrivateIpsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPrivateIpsResponse, String>() {
                    @Override
                    public String apply(ListPrivateIpsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPrivateIpsRequest.Builder>,
                        ListPrivateIpsRequest>() {
                    @Override
                    public ListPrivateIpsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPrivateIpsRequest.Builder>
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
                new java.util.function.Function<ListPrivateIpsRequest, ListPrivateIpsResponse>() {
                    @Override
                    public ListPrivateIpsResponse apply(ListPrivateIpsRequest request) {
                        return client.listPrivateIps(request);
                    }
                },
                new java.util.function.Function<
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
     * Creates a new iterable which will iterate over the responses received from the
     * listPublicIpPools operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListPublicIpPoolsResponse> listPublicIpPoolsResponseIterator(
            final ListPublicIpPoolsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPublicIpPoolsRequest.Builder,
                ListPublicIpPoolsRequest,
                ListPublicIpPoolsResponse>(
                new java.util.function.Supplier<ListPublicIpPoolsRequest.Builder>() {
                    @Override
                    public ListPublicIpPoolsRequest.Builder get() {
                        return ListPublicIpPoolsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPublicIpPoolsResponse, String>() {
                    @Override
                    public String apply(ListPublicIpPoolsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPublicIpPoolsRequest.Builder>,
                        ListPublicIpPoolsRequest>() {
                    @Override
                    public ListPublicIpPoolsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPublicIpPoolsRequest.Builder>
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
                        ListPublicIpPoolsRequest, ListPublicIpPoolsResponse>() {
                    @Override
                    public ListPublicIpPoolsResponse apply(ListPublicIpPoolsRequest request) {
                        return client.listPublicIpPools(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.PublicIpPoolSummary} objects contained in responses from the
     * listPublicIpPools operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.PublicIpPoolSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.core.model.PublicIpPoolSummary> listPublicIpPoolsRecordIterator(
            final ListPublicIpPoolsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPublicIpPoolsRequest.Builder,
                ListPublicIpPoolsRequest,
                ListPublicIpPoolsResponse,
                com.oracle.bmc.core.model.PublicIpPoolSummary>(
                new java.util.function.Supplier<ListPublicIpPoolsRequest.Builder>() {
                    @Override
                    public ListPublicIpPoolsRequest.Builder get() {
                        return ListPublicIpPoolsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPublicIpPoolsResponse, String>() {
                    @Override
                    public String apply(ListPublicIpPoolsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPublicIpPoolsRequest.Builder>,
                        ListPublicIpPoolsRequest>() {
                    @Override
                    public ListPublicIpPoolsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPublicIpPoolsRequest.Builder>
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
                        ListPublicIpPoolsRequest, ListPublicIpPoolsResponse>() {
                    @Override
                    public ListPublicIpPoolsResponse apply(ListPublicIpPoolsRequest request) {
                        return client.listPublicIpPools(request);
                    }
                },
                new java.util.function.Function<
                        ListPublicIpPoolsResponse,
                        java.util.List<com.oracle.bmc.core.model.PublicIpPoolSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.PublicIpPoolSummary> apply(
                            ListPublicIpPoolsResponse response) {
                        return response.getPublicIpPoolCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listPublicIps
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListPublicIpsResponse> listPublicIpsResponseIterator(
            final ListPublicIpsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPublicIpsRequest.Builder, ListPublicIpsRequest, ListPublicIpsResponse>(
                new java.util.function.Supplier<ListPublicIpsRequest.Builder>() {
                    @Override
                    public ListPublicIpsRequest.Builder get() {
                        return ListPublicIpsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPublicIpsResponse, String>() {
                    @Override
                    public String apply(ListPublicIpsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPublicIpsRequest.Builder>,
                        ListPublicIpsRequest>() {
                    @Override
                    public ListPublicIpsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPublicIpsRequest.Builder>
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
                new java.util.function.Function<ListPublicIpsRequest, ListPublicIpsResponse>() {
                    @Override
                    public ListPublicIpsResponse apply(ListPublicIpsRequest request) {
                        return client.listPublicIps(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.PublicIp}
     * objects contained in responses from the listPublicIps operation. This iterable will fetch
     * more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.PublicIp} objects contained in responses received from the
     *     service.
     */
    public Iterable<com.oracle.bmc.core.model.PublicIp> listPublicIpsRecordIterator(
            final ListPublicIpsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPublicIpsRequest.Builder,
                ListPublicIpsRequest,
                ListPublicIpsResponse,
                com.oracle.bmc.core.model.PublicIp>(
                new java.util.function.Supplier<ListPublicIpsRequest.Builder>() {
                    @Override
                    public ListPublicIpsRequest.Builder get() {
                        return ListPublicIpsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPublicIpsResponse, String>() {
                    @Override
                    public String apply(ListPublicIpsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPublicIpsRequest.Builder>,
                        ListPublicIpsRequest>() {
                    @Override
                    public ListPublicIpsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPublicIpsRequest.Builder>
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
                new java.util.function.Function<ListPublicIpsRequest, ListPublicIpsResponse>() {
                    @Override
                    public ListPublicIpsResponse apply(ListPublicIpsRequest request) {
                        return client.listPublicIps(request);
                    }
                },
                new java.util.function.Function<
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
     * Creates a new iterable which will iterate over the responses received from the
     * listRemotePeeringConnections operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListRemotePeeringConnectionsResponse>
            listRemotePeeringConnectionsResponseIterator(
                    final ListRemotePeeringConnectionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRemotePeeringConnectionsRequest.Builder,
                ListRemotePeeringConnectionsRequest,
                ListRemotePeeringConnectionsResponse>(
                new java.util.function.Supplier<ListRemotePeeringConnectionsRequest.Builder>() {
                    @Override
                    public ListRemotePeeringConnectionsRequest.Builder get() {
                        return ListRemotePeeringConnectionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRemotePeeringConnectionsResponse, String>() {
                    @Override
                    public String apply(ListRemotePeeringConnectionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRemotePeeringConnectionsRequest.Builder>,
                        ListRemotePeeringConnectionsRequest>() {
                    @Override
                    public ListRemotePeeringConnectionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRemotePeeringConnectionsRequest.Builder>
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.RemotePeeringConnection} objects contained in responses from the
     * listRemotePeeringConnections operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.RemotePeeringConnection} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.RemotePeeringConnection>
            listRemotePeeringConnectionsRecordIterator(
                    final ListRemotePeeringConnectionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRemotePeeringConnectionsRequest.Builder,
                ListRemotePeeringConnectionsRequest,
                ListRemotePeeringConnectionsResponse,
                com.oracle.bmc.core.model.RemotePeeringConnection>(
                new java.util.function.Supplier<ListRemotePeeringConnectionsRequest.Builder>() {
                    @Override
                    public ListRemotePeeringConnectionsRequest.Builder get() {
                        return ListRemotePeeringConnectionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRemotePeeringConnectionsResponse, String>() {
                    @Override
                    public String apply(ListRemotePeeringConnectionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRemotePeeringConnectionsRequest.Builder>,
                        ListRemotePeeringConnectionsRequest>() {
                    @Override
                    public ListRemotePeeringConnectionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRemotePeeringConnectionsRequest.Builder>
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
                        ListRemotePeeringConnectionsRequest,
                        ListRemotePeeringConnectionsResponse>() {
                    @Override
                    public ListRemotePeeringConnectionsResponse apply(
                            ListRemotePeeringConnectionsRequest request) {
                        return client.listRemotePeeringConnections(request);
                    }
                },
                new java.util.function.Function<
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
     * Creates a new iterable which will iterate over the responses received from the
     * listRouteTables operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListRouteTablesResponse> listRouteTablesResponseIterator(
            final ListRouteTablesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRouteTablesRequest.Builder, ListRouteTablesRequest, ListRouteTablesResponse>(
                new java.util.function.Supplier<ListRouteTablesRequest.Builder>() {
                    @Override
                    public ListRouteTablesRequest.Builder get() {
                        return ListRouteTablesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRouteTablesResponse, String>() {
                    @Override
                    public String apply(ListRouteTablesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRouteTablesRequest.Builder>,
                        ListRouteTablesRequest>() {
                    @Override
                    public ListRouteTablesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRouteTablesRequest.Builder>
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
                new java.util.function.Function<ListRouteTablesRequest, ListRouteTablesResponse>() {
                    @Override
                    public ListRouteTablesResponse apply(ListRouteTablesRequest request) {
                        return client.listRouteTables(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.RouteTable} objects contained in responses from the listRouteTables
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.RouteTable} objects contained in responses received from the
     *     service.
     */
    public Iterable<com.oracle.bmc.core.model.RouteTable> listRouteTablesRecordIterator(
            final ListRouteTablesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRouteTablesRequest.Builder,
                ListRouteTablesRequest,
                ListRouteTablesResponse,
                com.oracle.bmc.core.model.RouteTable>(
                new java.util.function.Supplier<ListRouteTablesRequest.Builder>() {
                    @Override
                    public ListRouteTablesRequest.Builder get() {
                        return ListRouteTablesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRouteTablesResponse, String>() {
                    @Override
                    public String apply(ListRouteTablesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRouteTablesRequest.Builder>,
                        ListRouteTablesRequest>() {
                    @Override
                    public ListRouteTablesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRouteTablesRequest.Builder>
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
                new java.util.function.Function<ListRouteTablesRequest, ListRouteTablesResponse>() {
                    @Override
                    public ListRouteTablesResponse apply(ListRouteTablesRequest request) {
                        return client.listRouteTables(request);
                    }
                },
                new java.util.function.Function<
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
     * Creates a new iterable which will iterate over the responses received from the
     * listSecurityLists operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSecurityListsResponse> listSecurityListsResponseIterator(
            final ListSecurityListsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSecurityListsRequest.Builder,
                ListSecurityListsRequest,
                ListSecurityListsResponse>(
                new java.util.function.Supplier<ListSecurityListsRequest.Builder>() {
                    @Override
                    public ListSecurityListsRequest.Builder get() {
                        return ListSecurityListsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSecurityListsResponse, String>() {
                    @Override
                    public String apply(ListSecurityListsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityListsRequest.Builder>,
                        ListSecurityListsRequest>() {
                    @Override
                    public ListSecurityListsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityListsRequest.Builder>
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
                        ListSecurityListsRequest, ListSecurityListsResponse>() {
                    @Override
                    public ListSecurityListsResponse apply(ListSecurityListsRequest request) {
                        return client.listSecurityLists(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.SecurityList} objects contained in responses from the
     * listSecurityLists operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.SecurityList} objects contained in responses received from the
     *     service.
     */
    public Iterable<com.oracle.bmc.core.model.SecurityList> listSecurityListsRecordIterator(
            final ListSecurityListsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSecurityListsRequest.Builder,
                ListSecurityListsRequest,
                ListSecurityListsResponse,
                com.oracle.bmc.core.model.SecurityList>(
                new java.util.function.Supplier<ListSecurityListsRequest.Builder>() {
                    @Override
                    public ListSecurityListsRequest.Builder get() {
                        return ListSecurityListsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSecurityListsResponse, String>() {
                    @Override
                    public String apply(ListSecurityListsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityListsRequest.Builder>,
                        ListSecurityListsRequest>() {
                    @Override
                    public ListSecurityListsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityListsRequest.Builder>
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
                        ListSecurityListsRequest, ListSecurityListsResponse>() {
                    @Override
                    public ListSecurityListsResponse apply(ListSecurityListsRequest request) {
                        return client.listSecurityLists(request);
                    }
                },
                new java.util.function.Function<
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
     * Creates a new iterable which will iterate over the responses received from the
     * listServiceGateways operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListServiceGatewaysResponse> listServiceGatewaysResponseIterator(
            final ListServiceGatewaysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListServiceGatewaysRequest.Builder,
                ListServiceGatewaysRequest,
                ListServiceGatewaysResponse>(
                new java.util.function.Supplier<ListServiceGatewaysRequest.Builder>() {
                    @Override
                    public ListServiceGatewaysRequest.Builder get() {
                        return ListServiceGatewaysRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListServiceGatewaysResponse, String>() {
                    @Override
                    public String apply(ListServiceGatewaysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListServiceGatewaysRequest.Builder>,
                        ListServiceGatewaysRequest>() {
                    @Override
                    public ListServiceGatewaysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListServiceGatewaysRequest.Builder>
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
                        ListServiceGatewaysRequest, ListServiceGatewaysResponse>() {
                    @Override
                    public ListServiceGatewaysResponse apply(ListServiceGatewaysRequest request) {
                        return client.listServiceGateways(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.ServiceGateway} objects contained in responses from the
     * listServiceGateways operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.ServiceGateway} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.core.model.ServiceGateway> listServiceGatewaysRecordIterator(
            final ListServiceGatewaysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListServiceGatewaysRequest.Builder,
                ListServiceGatewaysRequest,
                ListServiceGatewaysResponse,
                com.oracle.bmc.core.model.ServiceGateway>(
                new java.util.function.Supplier<ListServiceGatewaysRequest.Builder>() {
                    @Override
                    public ListServiceGatewaysRequest.Builder get() {
                        return ListServiceGatewaysRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListServiceGatewaysResponse, String>() {
                    @Override
                    public String apply(ListServiceGatewaysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListServiceGatewaysRequest.Builder>,
                        ListServiceGatewaysRequest>() {
                    @Override
                    public ListServiceGatewaysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListServiceGatewaysRequest.Builder>
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
                        ListServiceGatewaysRequest, ListServiceGatewaysResponse>() {
                    @Override
                    public ListServiceGatewaysResponse apply(ListServiceGatewaysRequest request) {
                        return client.listServiceGateways(request);
                    }
                },
                new java.util.function.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listServices
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListServicesResponse> listServicesResponseIterator(
            final ListServicesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListServicesRequest.Builder, ListServicesRequest, ListServicesResponse>(
                new java.util.function.Supplier<ListServicesRequest.Builder>() {
                    @Override
                    public ListServicesRequest.Builder get() {
                        return ListServicesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListServicesResponse, String>() {
                    @Override
                    public String apply(ListServicesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListServicesRequest.Builder>,
                        ListServicesRequest>() {
                    @Override
                    public ListServicesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListServicesRequest.Builder>
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
                new java.util.function.Function<ListServicesRequest, ListServicesResponse>() {
                    @Override
                    public ListServicesResponse apply(ListServicesRequest request) {
                        return client.listServices(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.Service}
     * objects contained in responses from the listServices operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.Service} objects contained in responses received from the
     *     service.
     */
    public Iterable<com.oracle.bmc.core.model.Service> listServicesRecordIterator(
            final ListServicesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListServicesRequest.Builder,
                ListServicesRequest,
                ListServicesResponse,
                com.oracle.bmc.core.model.Service>(
                new java.util.function.Supplier<ListServicesRequest.Builder>() {
                    @Override
                    public ListServicesRequest.Builder get() {
                        return ListServicesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListServicesResponse, String>() {
                    @Override
                    public String apply(ListServicesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListServicesRequest.Builder>,
                        ListServicesRequest>() {
                    @Override
                    public ListServicesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListServicesRequest.Builder>
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
                new java.util.function.Function<ListServicesRequest, ListServicesResponse>() {
                    @Override
                    public ListServicesResponse apply(ListServicesRequest request) {
                        return client.listServices(request);
                    }
                },
                new java.util.function.Function<
                        ListServicesResponse, java.util.List<com.oracle.bmc.core.model.Service>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.Service> apply(
                            ListServicesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSubnets
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSubnetsResponse> listSubnetsResponseIterator(
            final ListSubnetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSubnetsRequest.Builder, ListSubnetsRequest, ListSubnetsResponse>(
                new java.util.function.Supplier<ListSubnetsRequest.Builder>() {
                    @Override
                    public ListSubnetsRequest.Builder get() {
                        return ListSubnetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSubnetsResponse, String>() {
                    @Override
                    public String apply(ListSubnetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSubnetsRequest.Builder>,
                        ListSubnetsRequest>() {
                    @Override
                    public ListSubnetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSubnetsRequest.Builder>
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
                new java.util.function.Function<ListSubnetsRequest, ListSubnetsResponse>() {
                    @Override
                    public ListSubnetsResponse apply(ListSubnetsRequest request) {
                        return client.listSubnets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.Subnet}
     * objects contained in responses from the listSubnets operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.Subnet} objects contained in responses received from the
     *     service.
     */
    public Iterable<com.oracle.bmc.core.model.Subnet> listSubnetsRecordIterator(
            final ListSubnetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSubnetsRequest.Builder,
                ListSubnetsRequest,
                ListSubnetsResponse,
                com.oracle.bmc.core.model.Subnet>(
                new java.util.function.Supplier<ListSubnetsRequest.Builder>() {
                    @Override
                    public ListSubnetsRequest.Builder get() {
                        return ListSubnetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSubnetsResponse, String>() {
                    @Override
                    public String apply(ListSubnetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSubnetsRequest.Builder>,
                        ListSubnetsRequest>() {
                    @Override
                    public ListSubnetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSubnetsRequest.Builder>
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
                new java.util.function.Function<ListSubnetsRequest, ListSubnetsResponse>() {
                    @Override
                    public ListSubnetsResponse apply(ListSubnetsRequest request) {
                        return client.listSubnets(request);
                    }
                },
                new java.util.function.Function<
                        ListSubnetsResponse, java.util.List<com.oracle.bmc.core.model.Subnet>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.Subnet> apply(
                            ListSubnetsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listVcns
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListVcnsResponse> listVcnsResponseIterator(final ListVcnsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVcnsRequest.Builder, ListVcnsRequest, ListVcnsResponse>(
                new java.util.function.Supplier<ListVcnsRequest.Builder>() {
                    @Override
                    public ListVcnsRequest.Builder get() {
                        return ListVcnsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVcnsResponse, String>() {
                    @Override
                    public String apply(ListVcnsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVcnsRequest.Builder>,
                        ListVcnsRequest>() {
                    @Override
                    public ListVcnsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVcnsRequest.Builder>
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
                new java.util.function.Function<ListVcnsRequest, ListVcnsResponse>() {
                    @Override
                    public ListVcnsResponse apply(ListVcnsRequest request) {
                        return client.listVcns(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.Vcn}
     * objects contained in responses from the listVcns operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.Vcn} objects contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.Vcn> listVcnsRecordIterator(
            final ListVcnsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVcnsRequest.Builder,
                ListVcnsRequest,
                ListVcnsResponse,
                com.oracle.bmc.core.model.Vcn>(
                new java.util.function.Supplier<ListVcnsRequest.Builder>() {
                    @Override
                    public ListVcnsRequest.Builder get() {
                        return ListVcnsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVcnsResponse, String>() {
                    @Override
                    public String apply(ListVcnsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVcnsRequest.Builder>,
                        ListVcnsRequest>() {
                    @Override
                    public ListVcnsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVcnsRequest.Builder>
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
                new java.util.function.Function<ListVcnsRequest, ListVcnsResponse>() {
                    @Override
                    public ListVcnsResponse apply(ListVcnsRequest request) {
                        return client.listVcns(request);
                    }
                },
                new java.util.function.Function<
                        ListVcnsResponse, java.util.List<com.oracle.bmc.core.model.Vcn>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.Vcn> apply(
                            ListVcnsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listVirtualCircuitAssociatedTunnels operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListVirtualCircuitAssociatedTunnelsResponse>
            listVirtualCircuitAssociatedTunnelsResponseIterator(
                    final ListVirtualCircuitAssociatedTunnelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVirtualCircuitAssociatedTunnelsRequest.Builder,
                ListVirtualCircuitAssociatedTunnelsRequest,
                ListVirtualCircuitAssociatedTunnelsResponse>(
                new java.util.function.Supplier<
                        ListVirtualCircuitAssociatedTunnelsRequest.Builder>() {
                    @Override
                    public ListVirtualCircuitAssociatedTunnelsRequest.Builder get() {
                        return ListVirtualCircuitAssociatedTunnelsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListVirtualCircuitAssociatedTunnelsResponse, String>() {
                    @Override
                    public String apply(ListVirtualCircuitAssociatedTunnelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVirtualCircuitAssociatedTunnelsRequest.Builder>,
                        ListVirtualCircuitAssociatedTunnelsRequest>() {
                    @Override
                    public ListVirtualCircuitAssociatedTunnelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVirtualCircuitAssociatedTunnelsRequest.Builder>
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
                        ListVirtualCircuitAssociatedTunnelsRequest,
                        ListVirtualCircuitAssociatedTunnelsResponse>() {
                    @Override
                    public ListVirtualCircuitAssociatedTunnelsResponse apply(
                            ListVirtualCircuitAssociatedTunnelsRequest request) {
                        return client.listVirtualCircuitAssociatedTunnels(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.VirtualCircuitAssociatedTunnelDetails} objects contained in
     * responses from the listVirtualCircuitAssociatedTunnels operation. This iterable will fetch
     * more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.VirtualCircuitAssociatedTunnelDetails} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.VirtualCircuitAssociatedTunnelDetails>
            listVirtualCircuitAssociatedTunnelsRecordIterator(
                    final ListVirtualCircuitAssociatedTunnelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVirtualCircuitAssociatedTunnelsRequest.Builder,
                ListVirtualCircuitAssociatedTunnelsRequest,
                ListVirtualCircuitAssociatedTunnelsResponse,
                com.oracle.bmc.core.model.VirtualCircuitAssociatedTunnelDetails>(
                new java.util.function.Supplier<
                        ListVirtualCircuitAssociatedTunnelsRequest.Builder>() {
                    @Override
                    public ListVirtualCircuitAssociatedTunnelsRequest.Builder get() {
                        return ListVirtualCircuitAssociatedTunnelsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListVirtualCircuitAssociatedTunnelsResponse, String>() {
                    @Override
                    public String apply(ListVirtualCircuitAssociatedTunnelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVirtualCircuitAssociatedTunnelsRequest.Builder>,
                        ListVirtualCircuitAssociatedTunnelsRequest>() {
                    @Override
                    public ListVirtualCircuitAssociatedTunnelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVirtualCircuitAssociatedTunnelsRequest.Builder>
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
                        ListVirtualCircuitAssociatedTunnelsRequest,
                        ListVirtualCircuitAssociatedTunnelsResponse>() {
                    @Override
                    public ListVirtualCircuitAssociatedTunnelsResponse apply(
                            ListVirtualCircuitAssociatedTunnelsRequest request) {
                        return client.listVirtualCircuitAssociatedTunnels(request);
                    }
                },
                new java.util.function.Function<
                        ListVirtualCircuitAssociatedTunnelsResponse,
                        java.util.List<
                                com.oracle.bmc.core.model
                                        .VirtualCircuitAssociatedTunnelDetails>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.core.model.VirtualCircuitAssociatedTunnelDetails>
                            apply(ListVirtualCircuitAssociatedTunnelsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listVirtualCircuitBandwidthShapes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListVirtualCircuitBandwidthShapesResponse>
            listVirtualCircuitBandwidthShapesResponseIterator(
                    final ListVirtualCircuitBandwidthShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVirtualCircuitBandwidthShapesRequest.Builder,
                ListVirtualCircuitBandwidthShapesRequest,
                ListVirtualCircuitBandwidthShapesResponse>(
                new java.util.function.Supplier<
                        ListVirtualCircuitBandwidthShapesRequest.Builder>() {
                    @Override
                    public ListVirtualCircuitBandwidthShapesRequest.Builder get() {
                        return ListVirtualCircuitBandwidthShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListVirtualCircuitBandwidthShapesResponse, String>() {
                    @Override
                    public String apply(ListVirtualCircuitBandwidthShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVirtualCircuitBandwidthShapesRequest.Builder>,
                        ListVirtualCircuitBandwidthShapesRequest>() {
                    @Override
                    public ListVirtualCircuitBandwidthShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVirtualCircuitBandwidthShapesRequest.Builder>
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.VirtualCircuitBandwidthShape} objects contained in responses from
     * the listVirtualCircuitBandwidthShapes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.VirtualCircuitBandwidthShape} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.VirtualCircuitBandwidthShape>
            listVirtualCircuitBandwidthShapesRecordIterator(
                    final ListVirtualCircuitBandwidthShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVirtualCircuitBandwidthShapesRequest.Builder,
                ListVirtualCircuitBandwidthShapesRequest,
                ListVirtualCircuitBandwidthShapesResponse,
                com.oracle.bmc.core.model.VirtualCircuitBandwidthShape>(
                new java.util.function.Supplier<
                        ListVirtualCircuitBandwidthShapesRequest.Builder>() {
                    @Override
                    public ListVirtualCircuitBandwidthShapesRequest.Builder get() {
                        return ListVirtualCircuitBandwidthShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListVirtualCircuitBandwidthShapesResponse, String>() {
                    @Override
                    public String apply(ListVirtualCircuitBandwidthShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVirtualCircuitBandwidthShapesRequest.Builder>,
                        ListVirtualCircuitBandwidthShapesRequest>() {
                    @Override
                    public ListVirtualCircuitBandwidthShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVirtualCircuitBandwidthShapesRequest.Builder>
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
                        ListVirtualCircuitBandwidthShapesRequest,
                        ListVirtualCircuitBandwidthShapesResponse>() {
                    @Override
                    public ListVirtualCircuitBandwidthShapesResponse apply(
                            ListVirtualCircuitBandwidthShapesRequest request) {
                        return client.listVirtualCircuitBandwidthShapes(request);
                    }
                },
                new java.util.function.Function<
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
     * Creates a new iterable which will iterate over the responses received from the
     * listVirtualCircuits operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListVirtualCircuitsResponse> listVirtualCircuitsResponseIterator(
            final ListVirtualCircuitsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVirtualCircuitsRequest.Builder,
                ListVirtualCircuitsRequest,
                ListVirtualCircuitsResponse>(
                new java.util.function.Supplier<ListVirtualCircuitsRequest.Builder>() {
                    @Override
                    public ListVirtualCircuitsRequest.Builder get() {
                        return ListVirtualCircuitsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVirtualCircuitsResponse, String>() {
                    @Override
                    public String apply(ListVirtualCircuitsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVirtualCircuitsRequest.Builder>,
                        ListVirtualCircuitsRequest>() {
                    @Override
                    public ListVirtualCircuitsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVirtualCircuitsRequest.Builder>
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
                        ListVirtualCircuitsRequest, ListVirtualCircuitsResponse>() {
                    @Override
                    public ListVirtualCircuitsResponse apply(ListVirtualCircuitsRequest request) {
                        return client.listVirtualCircuits(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.core.model.VirtualCircuit} objects contained in responses from the
     * listVirtualCircuits operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.VirtualCircuit} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.core.model.VirtualCircuit> listVirtualCircuitsRecordIterator(
            final ListVirtualCircuitsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVirtualCircuitsRequest.Builder,
                ListVirtualCircuitsRequest,
                ListVirtualCircuitsResponse,
                com.oracle.bmc.core.model.VirtualCircuit>(
                new java.util.function.Supplier<ListVirtualCircuitsRequest.Builder>() {
                    @Override
                    public ListVirtualCircuitsRequest.Builder get() {
                        return ListVirtualCircuitsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVirtualCircuitsResponse, String>() {
                    @Override
                    public String apply(ListVirtualCircuitsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVirtualCircuitsRequest.Builder>,
                        ListVirtualCircuitsRequest>() {
                    @Override
                    public ListVirtualCircuitsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVirtualCircuitsRequest.Builder>
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
                        ListVirtualCircuitsRequest, ListVirtualCircuitsResponse>() {
                    @Override
                    public ListVirtualCircuitsResponse apply(ListVirtualCircuitsRequest request) {
                        return client.listVirtualCircuits(request);
                    }
                },
                new java.util.function.Function<
                        ListVirtualCircuitsResponse,
                        java.util.List<com.oracle.bmc.core.model.VirtualCircuit>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.VirtualCircuit> apply(
                            ListVirtualCircuitsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listVlans
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListVlansResponse> listVlansResponseIterator(final ListVlansRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVlansRequest.Builder, ListVlansRequest, ListVlansResponse>(
                new java.util.function.Supplier<ListVlansRequest.Builder>() {
                    @Override
                    public ListVlansRequest.Builder get() {
                        return ListVlansRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVlansResponse, String>() {
                    @Override
                    public String apply(ListVlansResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVlansRequest.Builder>,
                        ListVlansRequest>() {
                    @Override
                    public ListVlansRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVlansRequest.Builder>
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
                new java.util.function.Function<ListVlansRequest, ListVlansResponse>() {
                    @Override
                    public ListVlansResponse apply(ListVlansRequest request) {
                        return client.listVlans(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.Vlan}
     * objects contained in responses from the listVlans operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.Vlan} objects contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.Vlan> listVlansRecordIterator(
            final ListVlansRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVlansRequest.Builder,
                ListVlansRequest,
                ListVlansResponse,
                com.oracle.bmc.core.model.Vlan>(
                new java.util.function.Supplier<ListVlansRequest.Builder>() {
                    @Override
                    public ListVlansRequest.Builder get() {
                        return ListVlansRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVlansResponse, String>() {
                    @Override
                    public String apply(ListVlansResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVlansRequest.Builder>,
                        ListVlansRequest>() {
                    @Override
                    public ListVlansRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVlansRequest.Builder>
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
                new java.util.function.Function<ListVlansRequest, ListVlansResponse>() {
                    @Override
                    public ListVlansResponse apply(ListVlansRequest request) {
                        return client.listVlans(request);
                    }
                },
                new java.util.function.Function<
                        ListVlansResponse, java.util.List<com.oracle.bmc.core.model.Vlan>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.Vlan> apply(
                            ListVlansResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listVtaps
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListVtapsResponse> listVtapsResponseIterator(final ListVtapsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVtapsRequest.Builder, ListVtapsRequest, ListVtapsResponse>(
                new java.util.function.Supplier<ListVtapsRequest.Builder>() {
                    @Override
                    public ListVtapsRequest.Builder get() {
                        return ListVtapsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVtapsResponse, String>() {
                    @Override
                    public String apply(ListVtapsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVtapsRequest.Builder>,
                        ListVtapsRequest>() {
                    @Override
                    public ListVtapsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVtapsRequest.Builder>
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
                new java.util.function.Function<ListVtapsRequest, ListVtapsResponse>() {
                    @Override
                    public ListVtapsResponse apply(ListVtapsRequest request) {
                        return client.listVtaps(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.Vtap}
     * objects contained in responses from the listVtaps operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.core.model.Vtap} objects contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.Vtap> listVtapsRecordIterator(
            final ListVtapsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVtapsRequest.Builder,
                ListVtapsRequest,
                ListVtapsResponse,
                com.oracle.bmc.core.model.Vtap>(
                new java.util.function.Supplier<ListVtapsRequest.Builder>() {
                    @Override
                    public ListVtapsRequest.Builder get() {
                        return ListVtapsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVtapsResponse, String>() {
                    @Override
                    public String apply(ListVtapsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVtapsRequest.Builder>,
                        ListVtapsRequest>() {
                    @Override
                    public ListVtapsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVtapsRequest.Builder>
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
                new java.util.function.Function<ListVtapsRequest, ListVtapsResponse>() {
                    @Override
                    public ListVtapsResponse apply(ListVtapsRequest request) {
                        return client.listVtaps(request);
                    }
                },
                new java.util.function.Function<
                        ListVtapsResponse, java.util.List<com.oracle.bmc.core.model.Vtap>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.Vtap> apply(
                            ListVtapsResponse response) {
                        return response.getItems();
                    }
                });
    }
}
