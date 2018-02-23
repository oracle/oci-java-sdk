/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage;

import com.oracle.bmc.objectstorage.requests.*;
import com.oracle.bmc.objectstorage.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of ObjectStorage where multiple pages of data may be fetched.
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
 * As an example, if we were using the ListUsers operation in IdentityService, then the {@link java.lang.Interable} returned by calling a
 * ResponseIterator method would iterate over the ListUsersResponse objects returned by each ListUsers call, whereas the {@link java.lang.Iterable}
 * returned by calling a RecordIterator method would iterate over the User records and we don't have to deal with ListUsersResponse objects at all.
 * In either case, pagination will be automatically handled so we can iterate until there are no more responses or no more resources/records available.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.RequiredArgsConstructor
public class ObjectStoragePaginators {
    private final ObjectStorage client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listBuckets operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListBucketsResponse> listBucketsResponseIterator(
            final ListBucketsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBucketsRequest.Builder, ListBucketsRequest, ListBucketsResponse>(
                new com.google.common.base.Supplier<ListBucketsRequest.Builder>() {
                    @Override
                    public ListBucketsRequest.Builder get() {
                        return ListBucketsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListBucketsResponse, String>() {
                    @Override
                    public String apply(ListBucketsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBucketsRequest.Builder>,
                        ListBucketsRequest>() {
                    @Override
                    public ListBucketsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBucketsRequest.Builder>
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
                new com.google.common.base.Function<ListBucketsRequest, ListBucketsResponse>() {
                    @Override
                    public ListBucketsResponse apply(ListBucketsRequest request) {
                        return client.listBuckets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.objectstorage.model.BucketSummary} objects
     * contained in responses from the listBuckets operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.objectstorage.model.BucketSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.objectstorage.model.BucketSummary> listBucketsRecordIterator(
            final ListBucketsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBucketsRequest.Builder, ListBucketsRequest, ListBucketsResponse,
                com.oracle.bmc.objectstorage.model.BucketSummary>(
                new com.google.common.base.Supplier<ListBucketsRequest.Builder>() {
                    @Override
                    public ListBucketsRequest.Builder get() {
                        return ListBucketsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListBucketsResponse, String>() {
                    @Override
                    public String apply(ListBucketsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBucketsRequest.Builder>,
                        ListBucketsRequest>() {
                    @Override
                    public ListBucketsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBucketsRequest.Builder>
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
                new com.google.common.base.Function<ListBucketsRequest, ListBucketsResponse>() {
                    @Override
                    public ListBucketsResponse apply(ListBucketsRequest request) {
                        return client.listBuckets(request);
                    }
                },
                new com.google.common.base.Function<
                        ListBucketsResponse,
                        java.util.List<com.oracle.bmc.objectstorage.model.BucketSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.objectstorage.model.BucketSummary> apply(
                            ListBucketsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listMultipartUploadParts operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListMultipartUploadPartsResponse> listMultipartUploadPartsResponseIterator(
            final ListMultipartUploadPartsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMultipartUploadPartsRequest.Builder, ListMultipartUploadPartsRequest,
                ListMultipartUploadPartsResponse>(
                new com.google.common.base.Supplier<ListMultipartUploadPartsRequest.Builder>() {
                    @Override
                    public ListMultipartUploadPartsRequest.Builder get() {
                        return ListMultipartUploadPartsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListMultipartUploadPartsResponse, String>() {
                    @Override
                    public String apply(ListMultipartUploadPartsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMultipartUploadPartsRequest.Builder>,
                        ListMultipartUploadPartsRequest>() {
                    @Override
                    public ListMultipartUploadPartsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMultipartUploadPartsRequest.Builder>
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
                        ListMultipartUploadPartsRequest, ListMultipartUploadPartsResponse>() {
                    @Override
                    public ListMultipartUploadPartsResponse apply(
                            ListMultipartUploadPartsRequest request) {
                        return client.listMultipartUploadParts(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.objectstorage.model.MultipartUploadPartSummary} objects
     * contained in responses from the listMultipartUploadParts operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.objectstorage.model.MultipartUploadPartSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.objectstorage.model.MultipartUploadPartSummary>
            listMultipartUploadPartsRecordIterator(final ListMultipartUploadPartsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMultipartUploadPartsRequest.Builder, ListMultipartUploadPartsRequest,
                ListMultipartUploadPartsResponse,
                com.oracle.bmc.objectstorage.model.MultipartUploadPartSummary>(
                new com.google.common.base.Supplier<ListMultipartUploadPartsRequest.Builder>() {
                    @Override
                    public ListMultipartUploadPartsRequest.Builder get() {
                        return ListMultipartUploadPartsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListMultipartUploadPartsResponse, String>() {
                    @Override
                    public String apply(ListMultipartUploadPartsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMultipartUploadPartsRequest.Builder>,
                        ListMultipartUploadPartsRequest>() {
                    @Override
                    public ListMultipartUploadPartsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMultipartUploadPartsRequest.Builder>
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
                        ListMultipartUploadPartsRequest, ListMultipartUploadPartsResponse>() {
                    @Override
                    public ListMultipartUploadPartsResponse apply(
                            ListMultipartUploadPartsRequest request) {
                        return client.listMultipartUploadParts(request);
                    }
                },
                new com.google.common.base.Function<
                        ListMultipartUploadPartsResponse,
                        java.util.List<
                                com.oracle.bmc.objectstorage.model.MultipartUploadPartSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.objectstorage.model.MultipartUploadPartSummary>
                            apply(ListMultipartUploadPartsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listMultipartUploads operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListMultipartUploadsResponse> listMultipartUploadsResponseIterator(
            final ListMultipartUploadsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMultipartUploadsRequest.Builder, ListMultipartUploadsRequest,
                ListMultipartUploadsResponse>(
                new com.google.common.base.Supplier<ListMultipartUploadsRequest.Builder>() {
                    @Override
                    public ListMultipartUploadsRequest.Builder get() {
                        return ListMultipartUploadsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListMultipartUploadsResponse, String>() {
                    @Override
                    public String apply(ListMultipartUploadsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMultipartUploadsRequest.Builder>,
                        ListMultipartUploadsRequest>() {
                    @Override
                    public ListMultipartUploadsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMultipartUploadsRequest.Builder>
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
                        ListMultipartUploadsRequest, ListMultipartUploadsResponse>() {
                    @Override
                    public ListMultipartUploadsResponse apply(ListMultipartUploadsRequest request) {
                        return client.listMultipartUploads(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.objectstorage.model.MultipartUpload} objects
     * contained in responses from the listMultipartUploads operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.objectstorage.model.MultipartUpload} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.objectstorage.model.MultipartUpload>
            listMultipartUploadsRecordIterator(final ListMultipartUploadsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMultipartUploadsRequest.Builder, ListMultipartUploadsRequest,
                ListMultipartUploadsResponse, com.oracle.bmc.objectstorage.model.MultipartUpload>(
                new com.google.common.base.Supplier<ListMultipartUploadsRequest.Builder>() {
                    @Override
                    public ListMultipartUploadsRequest.Builder get() {
                        return ListMultipartUploadsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListMultipartUploadsResponse, String>() {
                    @Override
                    public String apply(ListMultipartUploadsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMultipartUploadsRequest.Builder>,
                        ListMultipartUploadsRequest>() {
                    @Override
                    public ListMultipartUploadsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMultipartUploadsRequest.Builder>
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
                        ListMultipartUploadsRequest, ListMultipartUploadsResponse>() {
                    @Override
                    public ListMultipartUploadsResponse apply(ListMultipartUploadsRequest request) {
                        return client.listMultipartUploads(request);
                    }
                },
                new com.google.common.base.Function<
                        ListMultipartUploadsResponse,
                        java.util.List<com.oracle.bmc.objectstorage.model.MultipartUpload>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.objectstorage.model.MultipartUpload> apply(
                            ListMultipartUploadsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listPreauthenticatedRequests operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListPreauthenticatedRequestsResponse>
            listPreauthenticatedRequestsResponseIterator(
                    final ListPreauthenticatedRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPreauthenticatedRequestsRequest.Builder, ListPreauthenticatedRequestsRequest,
                ListPreauthenticatedRequestsResponse>(
                new com.google.common.base.Supplier<ListPreauthenticatedRequestsRequest.Builder>() {
                    @Override
                    public ListPreauthenticatedRequestsRequest.Builder get() {
                        return ListPreauthenticatedRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListPreauthenticatedRequestsResponse, String>() {
                    @Override
                    public String apply(ListPreauthenticatedRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPreauthenticatedRequestsRequest.Builder>,
                        ListPreauthenticatedRequestsRequest>() {
                    @Override
                    public ListPreauthenticatedRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPreauthenticatedRequestsRequest.Builder>
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
                        ListPreauthenticatedRequestsRequest,
                        ListPreauthenticatedRequestsResponse>() {
                    @Override
                    public ListPreauthenticatedRequestsResponse apply(
                            ListPreauthenticatedRequestsRequest request) {
                        return client.listPreauthenticatedRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.objectstorage.model.PreauthenticatedRequestSummary} objects
     * contained in responses from the listPreauthenticatedRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.objectstorage.model.PreauthenticatedRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.objectstorage.model.PreauthenticatedRequestSummary>
            listPreauthenticatedRequestsRecordIterator(
                    final ListPreauthenticatedRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPreauthenticatedRequestsRequest.Builder, ListPreauthenticatedRequestsRequest,
                ListPreauthenticatedRequestsResponse,
                com.oracle.bmc.objectstorage.model.PreauthenticatedRequestSummary>(
                new com.google.common.base.Supplier<ListPreauthenticatedRequestsRequest.Builder>() {
                    @Override
                    public ListPreauthenticatedRequestsRequest.Builder get() {
                        return ListPreauthenticatedRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListPreauthenticatedRequestsResponse, String>() {
                    @Override
                    public String apply(ListPreauthenticatedRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPreauthenticatedRequestsRequest.Builder>,
                        ListPreauthenticatedRequestsRequest>() {
                    @Override
                    public ListPreauthenticatedRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPreauthenticatedRequestsRequest.Builder>
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
                        ListPreauthenticatedRequestsRequest,
                        ListPreauthenticatedRequestsResponse>() {
                    @Override
                    public ListPreauthenticatedRequestsResponse apply(
                            ListPreauthenticatedRequestsRequest request) {
                        return client.listPreauthenticatedRequests(request);
                    }
                },
                new com.google.common.base.Function<
                        ListPreauthenticatedRequestsResponse,
                        java.util.List<
                                com.oracle.bmc.objectstorage.model
                                        .PreauthenticatedRequestSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.objectstorage.model
                                            .PreauthenticatedRequestSummary>
                            apply(ListPreauthenticatedRequestsResponse response) {
                        return response.getItems();
                    }
                });
    }
}
