/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
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
 * As an example, if we were using the ListUsers operation in IdentityService, then the {@link java.lang.Iterable} returned by calling a
 * ResponseIterator method would iterate over the ListUsersResponse objects returned by each ListUsers call, whereas the {@link java.lang.Iterable}
 * returned by calling a RecordIterator method would iterate over the User records and we don't have to deal with ListUsersResponse objects at all.
 * In either case, pagination will be automatically handled so we can iterate until there are no more responses or no more resources/records available.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ObjectStoragePaginators {
    private final ObjectStorage client;

    public ObjectStoragePaginators(ObjectStorage client) {
        this.client = client;
    }

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
                new java.util.function.Supplier<ListBucketsRequest.Builder>() {
                    @Override
                    public ListBucketsRequest.Builder get() {
                        return ListBucketsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBucketsResponse, String>() {
                    @Override
                    public String apply(ListBucketsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
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
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListBucketsRequest, ListBucketsResponse>() {
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
                new java.util.function.Supplier<ListBucketsRequest.Builder>() {
                    @Override
                    public ListBucketsRequest.Builder get() {
                        return ListBucketsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBucketsResponse, String>() {
                    @Override
                    public String apply(ListBucketsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
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
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListBucketsRequest, ListBucketsResponse>() {
                    @Override
                    public ListBucketsResponse apply(ListBucketsRequest request) {
                        return client.listBuckets(request);
                    }
                },
                new java.util.function.Function<
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
                new java.util.function.Supplier<ListMultipartUploadPartsRequest.Builder>() {
                    @Override
                    public ListMultipartUploadPartsRequest.Builder get() {
                        return ListMultipartUploadPartsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMultipartUploadPartsResponse, String>() {
                    @Override
                    public String apply(ListMultipartUploadPartsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
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
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
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
                new java.util.function.Supplier<ListMultipartUploadPartsRequest.Builder>() {
                    @Override
                    public ListMultipartUploadPartsRequest.Builder get() {
                        return ListMultipartUploadPartsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMultipartUploadPartsResponse, String>() {
                    @Override
                    public String apply(ListMultipartUploadPartsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
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
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListMultipartUploadPartsRequest, ListMultipartUploadPartsResponse>() {
                    @Override
                    public ListMultipartUploadPartsResponse apply(
                            ListMultipartUploadPartsRequest request) {
                        return client.listMultipartUploadParts(request);
                    }
                },
                new java.util.function.Function<
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
                new java.util.function.Supplier<ListMultipartUploadsRequest.Builder>() {
                    @Override
                    public ListMultipartUploadsRequest.Builder get() {
                        return ListMultipartUploadsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMultipartUploadsResponse, String>() {
                    @Override
                    public String apply(ListMultipartUploadsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
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
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
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
                new java.util.function.Supplier<ListMultipartUploadsRequest.Builder>() {
                    @Override
                    public ListMultipartUploadsRequest.Builder get() {
                        return ListMultipartUploadsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMultipartUploadsResponse, String>() {
                    @Override
                    public String apply(ListMultipartUploadsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
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
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListMultipartUploadsRequest, ListMultipartUploadsResponse>() {
                    @Override
                    public ListMultipartUploadsResponse apply(ListMultipartUploadsRequest request) {
                        return client.listMultipartUploads(request);
                    }
                },
                new java.util.function.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listObjectVersions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListObjectVersionsResponse> listObjectVersionsResponseIterator(
            final ListObjectVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListObjectVersionsRequest.Builder, ListObjectVersionsRequest,
                ListObjectVersionsResponse>(
                new java.util.function.Supplier<ListObjectVersionsRequest.Builder>() {
                    @Override
                    public ListObjectVersionsRequest.Builder get() {
                        return ListObjectVersionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListObjectVersionsResponse, String>() {
                    @Override
                    public String apply(ListObjectVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListObjectVersionsRequest.Builder>,
                        ListObjectVersionsRequest>() {
                    @Override
                    public ListObjectVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListObjectVersionsRequest.Builder>
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
                new java.util.function.Function<
                        ListObjectVersionsRequest, ListObjectVersionsResponse>() {
                    @Override
                    public ListObjectVersionsResponse apply(ListObjectVersionsRequest request) {
                        return client.listObjectVersions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.objectstorage.model.ObjectVersionSummary} objects
     * contained in responses from the listObjectVersions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.objectstorage.model.ObjectVersionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.objectstorage.model.ObjectVersionSummary>
            listObjectVersionsRecordIterator(final ListObjectVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListObjectVersionsRequest.Builder, ListObjectVersionsRequest,
                ListObjectVersionsResponse,
                com.oracle.bmc.objectstorage.model.ObjectVersionSummary>(
                new java.util.function.Supplier<ListObjectVersionsRequest.Builder>() {
                    @Override
                    public ListObjectVersionsRequest.Builder get() {
                        return ListObjectVersionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListObjectVersionsResponse, String>() {
                    @Override
                    public String apply(ListObjectVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListObjectVersionsRequest.Builder>,
                        ListObjectVersionsRequest>() {
                    @Override
                    public ListObjectVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListObjectVersionsRequest.Builder>
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
                new java.util.function.Function<
                        ListObjectVersionsRequest, ListObjectVersionsResponse>() {
                    @Override
                    public ListObjectVersionsResponse apply(ListObjectVersionsRequest request) {
                        return client.listObjectVersions(request);
                    }
                },
                new java.util.function.Function<
                        ListObjectVersionsResponse,
                        java.util.List<com.oracle.bmc.objectstorage.model.ObjectVersionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.objectstorage.model.ObjectVersionSummary>
                            apply(ListObjectVersionsResponse response) {
                        return response.getObjectVersionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listObjects operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListObjectsResponse> listObjectsResponseIterator(
            final ListObjectsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListObjectsRequest.Builder, ListObjectsRequest, ListObjectsResponse>(
                new java.util.function.Supplier<ListObjectsRequest.Builder>() {
                    @Override
                    public ListObjectsRequest.Builder get() {
                        return ListObjectsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListObjectsResponse, String>() {
                    @Override
                    public String apply(ListObjectsResponse response) {
                        return response.getListObjects().getNextStartWith();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListObjectsRequest.Builder>,
                        ListObjectsRequest>() {
                    @Override
                    public ListObjectsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListObjectsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .start(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListObjectsRequest, ListObjectsResponse>() {
                    @Override
                    public ListObjectsResponse apply(ListObjectsRequest request) {
                        return client.listObjects(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.objectstorage.model.ObjectSummary} objects
     * contained in responses from the listObjects operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.objectstorage.model.ObjectSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.objectstorage.model.ObjectSummary> listObjectsRecordIterator(
            final ListObjectsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListObjectsRequest.Builder, ListObjectsRequest, ListObjectsResponse,
                com.oracle.bmc.objectstorage.model.ObjectSummary>(
                new java.util.function.Supplier<ListObjectsRequest.Builder>() {
                    @Override
                    public ListObjectsRequest.Builder get() {
                        return ListObjectsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListObjectsResponse, String>() {
                    @Override
                    public String apply(ListObjectsResponse response) {
                        return response.getListObjects().getNextStartWith();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListObjectsRequest.Builder>,
                        ListObjectsRequest>() {
                    @Override
                    public ListObjectsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListObjectsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .start(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListObjectsRequest, ListObjectsResponse>() {
                    @Override
                    public ListObjectsResponse apply(ListObjectsRequest request) {
                        return client.listObjects(request);
                    }
                },
                new java.util.function.Function<
                        ListObjectsResponse,
                        java.util.List<com.oracle.bmc.objectstorage.model.ObjectSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.objectstorage.model.ObjectSummary> apply(
                            ListObjectsResponse response) {
                        return response.getListObjects().getObjects();
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
                new java.util.function.Supplier<ListPreauthenticatedRequestsRequest.Builder>() {
                    @Override
                    public ListPreauthenticatedRequestsRequest.Builder get() {
                        return ListPreauthenticatedRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPreauthenticatedRequestsResponse, String>() {
                    @Override
                    public String apply(ListPreauthenticatedRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
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
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
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
                new java.util.function.Supplier<ListPreauthenticatedRequestsRequest.Builder>() {
                    @Override
                    public ListPreauthenticatedRequestsRequest.Builder get() {
                        return ListPreauthenticatedRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPreauthenticatedRequestsResponse, String>() {
                    @Override
                    public String apply(ListPreauthenticatedRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
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
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListPreauthenticatedRequestsRequest,
                        ListPreauthenticatedRequestsResponse>() {
                    @Override
                    public ListPreauthenticatedRequestsResponse apply(
                            ListPreauthenticatedRequestsRequest request) {
                        return client.listPreauthenticatedRequests(request);
                    }
                },
                new java.util.function.Function<
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

    /**
     * Creates a new iterable which will iterate over the responses received from the listReplicationPolicies operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListReplicationPoliciesResponse> listReplicationPoliciesResponseIterator(
            final ListReplicationPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListReplicationPoliciesRequest.Builder, ListReplicationPoliciesRequest,
                ListReplicationPoliciesResponse>(
                new java.util.function.Supplier<ListReplicationPoliciesRequest.Builder>() {
                    @Override
                    public ListReplicationPoliciesRequest.Builder get() {
                        return ListReplicationPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListReplicationPoliciesResponse, String>() {
                    @Override
                    public String apply(ListReplicationPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListReplicationPoliciesRequest.Builder>,
                        ListReplicationPoliciesRequest>() {
                    @Override
                    public ListReplicationPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListReplicationPoliciesRequest.Builder>
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
                new java.util.function.Function<
                        ListReplicationPoliciesRequest, ListReplicationPoliciesResponse>() {
                    @Override
                    public ListReplicationPoliciesResponse apply(
                            ListReplicationPoliciesRequest request) {
                        return client.listReplicationPolicies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.objectstorage.model.ReplicationPolicySummary} objects
     * contained in responses from the listReplicationPolicies operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.objectstorage.model.ReplicationPolicySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.objectstorage.model.ReplicationPolicySummary>
            listReplicationPoliciesRecordIterator(final ListReplicationPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListReplicationPoliciesRequest.Builder, ListReplicationPoliciesRequest,
                ListReplicationPoliciesResponse,
                com.oracle.bmc.objectstorage.model.ReplicationPolicySummary>(
                new java.util.function.Supplier<ListReplicationPoliciesRequest.Builder>() {
                    @Override
                    public ListReplicationPoliciesRequest.Builder get() {
                        return ListReplicationPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListReplicationPoliciesResponse, String>() {
                    @Override
                    public String apply(ListReplicationPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListReplicationPoliciesRequest.Builder>,
                        ListReplicationPoliciesRequest>() {
                    @Override
                    public ListReplicationPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListReplicationPoliciesRequest.Builder>
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
                new java.util.function.Function<
                        ListReplicationPoliciesRequest, ListReplicationPoliciesResponse>() {
                    @Override
                    public ListReplicationPoliciesResponse apply(
                            ListReplicationPoliciesRequest request) {
                        return client.listReplicationPolicies(request);
                    }
                },
                new java.util.function.Function<
                        ListReplicationPoliciesResponse,
                        java.util.List<
                                com.oracle.bmc.objectstorage.model.ReplicationPolicySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.objectstorage.model.ReplicationPolicySummary>
                            apply(ListReplicationPoliciesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listReplicationSources operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListReplicationSourcesResponse> listReplicationSourcesResponseIterator(
            final ListReplicationSourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListReplicationSourcesRequest.Builder, ListReplicationSourcesRequest,
                ListReplicationSourcesResponse>(
                new java.util.function.Supplier<ListReplicationSourcesRequest.Builder>() {
                    @Override
                    public ListReplicationSourcesRequest.Builder get() {
                        return ListReplicationSourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListReplicationSourcesResponse, String>() {
                    @Override
                    public String apply(ListReplicationSourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListReplicationSourcesRequest.Builder>,
                        ListReplicationSourcesRequest>() {
                    @Override
                    public ListReplicationSourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListReplicationSourcesRequest.Builder>
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
                new java.util.function.Function<
                        ListReplicationSourcesRequest, ListReplicationSourcesResponse>() {
                    @Override
                    public ListReplicationSourcesResponse apply(
                            ListReplicationSourcesRequest request) {
                        return client.listReplicationSources(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.objectstorage.model.ReplicationSource} objects
     * contained in responses from the listReplicationSources operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.objectstorage.model.ReplicationSource} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.objectstorage.model.ReplicationSource>
            listReplicationSourcesRecordIterator(final ListReplicationSourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListReplicationSourcesRequest.Builder, ListReplicationSourcesRequest,
                ListReplicationSourcesResponse,
                com.oracle.bmc.objectstorage.model.ReplicationSource>(
                new java.util.function.Supplier<ListReplicationSourcesRequest.Builder>() {
                    @Override
                    public ListReplicationSourcesRequest.Builder get() {
                        return ListReplicationSourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListReplicationSourcesResponse, String>() {
                    @Override
                    public String apply(ListReplicationSourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListReplicationSourcesRequest.Builder>,
                        ListReplicationSourcesRequest>() {
                    @Override
                    public ListReplicationSourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListReplicationSourcesRequest.Builder>
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
                new java.util.function.Function<
                        ListReplicationSourcesRequest, ListReplicationSourcesResponse>() {
                    @Override
                    public ListReplicationSourcesResponse apply(
                            ListReplicationSourcesRequest request) {
                        return client.listReplicationSources(request);
                    }
                },
                new java.util.function.Function<
                        ListReplicationSourcesResponse,
                        java.util.List<com.oracle.bmc.objectstorage.model.ReplicationSource>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.objectstorage.model.ReplicationSource>
                            apply(ListReplicationSourcesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listRetentionRules operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListRetentionRulesResponse> listRetentionRulesResponseIterator(
            final ListRetentionRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRetentionRulesRequest.Builder, ListRetentionRulesRequest,
                ListRetentionRulesResponse>(
                new java.util.function.Supplier<ListRetentionRulesRequest.Builder>() {
                    @Override
                    public ListRetentionRulesRequest.Builder get() {
                        return ListRetentionRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRetentionRulesResponse, String>() {
                    @Override
                    public String apply(ListRetentionRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRetentionRulesRequest.Builder>,
                        ListRetentionRulesRequest>() {
                    @Override
                    public ListRetentionRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRetentionRulesRequest.Builder>
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
                new java.util.function.Function<
                        ListRetentionRulesRequest, ListRetentionRulesResponse>() {
                    @Override
                    public ListRetentionRulesResponse apply(ListRetentionRulesRequest request) {
                        return client.listRetentionRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.objectstorage.model.RetentionRuleSummary} objects
     * contained in responses from the listRetentionRules operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.objectstorage.model.RetentionRuleSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.objectstorage.model.RetentionRuleSummary>
            listRetentionRulesRecordIterator(final ListRetentionRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRetentionRulesRequest.Builder, ListRetentionRulesRequest,
                ListRetentionRulesResponse,
                com.oracle.bmc.objectstorage.model.RetentionRuleSummary>(
                new java.util.function.Supplier<ListRetentionRulesRequest.Builder>() {
                    @Override
                    public ListRetentionRulesRequest.Builder get() {
                        return ListRetentionRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRetentionRulesResponse, String>() {
                    @Override
                    public String apply(ListRetentionRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRetentionRulesRequest.Builder>,
                        ListRetentionRulesRequest>() {
                    @Override
                    public ListRetentionRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRetentionRulesRequest.Builder>
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
                new java.util.function.Function<
                        ListRetentionRulesRequest, ListRetentionRulesResponse>() {
                    @Override
                    public ListRetentionRulesResponse apply(ListRetentionRulesRequest request) {
                        return client.listRetentionRules(request);
                    }
                },
                new java.util.function.Function<
                        ListRetentionRulesResponse,
                        java.util.List<com.oracle.bmc.objectstorage.model.RetentionRuleSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.objectstorage.model.RetentionRuleSummary>
                            apply(ListRetentionRulesResponse response) {
                        return response.getRetentionRuleCollection().getItems();
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
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.objectstorage.model.WorkRequestError} objects
     * contained in responses from the listWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.objectstorage.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.objectstorage.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse, com.oracle.bmc.objectstorage.model.WorkRequestError>(
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
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
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
                        java.util.List<com.oracle.bmc.objectstorage.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.objectstorage.model.WorkRequestError>
                            apply(ListWorkRequestErrorsResponse response) {
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
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.objectstorage.model.WorkRequestLogEntry} objects
     * contained in responses from the listWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.objectstorage.model.WorkRequestLogEntry} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.objectstorage.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.objectstorage.model.WorkRequestLogEntry>(
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
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
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
                        java.util.List<com.oracle.bmc.objectstorage.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.objectstorage.model.WorkRequestLogEntry>
                            apply(ListWorkRequestLogsResponse response) {
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
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.objectstorage.model.WorkRequestSummary} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.objectstorage.model.WorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.objectstorage.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.objectstorage.model.WorkRequestSummary>(
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
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
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
                        java.util.List<com.oracle.bmc.objectstorage.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.objectstorage.model.WorkRequestSummary>
                            apply(ListWorkRequestsResponse response) {
                        return response.getItems();
                    }
                });
    }
}
