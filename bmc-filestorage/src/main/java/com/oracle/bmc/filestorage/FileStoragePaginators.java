/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage;

import com.oracle.bmc.filestorage.requests.*;
import com.oracle.bmc.filestorage.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of FileStorage where multiple pages of data may be fetched. Two styles of
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
public class FileStoragePaginators {
    private final FileStorage client;

    public FileStoragePaginators(FileStorage client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listExportSets
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListExportSetsResponse> listExportSetsResponseIterator(
            final ListExportSetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExportSetsRequest.Builder, ListExportSetsRequest, ListExportSetsResponse>(
                new java.util.function.Supplier<ListExportSetsRequest.Builder>() {
                    @Override
                    public ListExportSetsRequest.Builder get() {
                        return ListExportSetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExportSetsResponse, String>() {
                    @Override
                    public String apply(ListExportSetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExportSetsRequest.Builder>,
                        ListExportSetsRequest>() {
                    @Override
                    public ListExportSetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExportSetsRequest.Builder>
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
                new java.util.function.Function<ListExportSetsRequest, ListExportSetsResponse>() {
                    @Override
                    public ListExportSetsResponse apply(ListExportSetsRequest request) {
                        return client.listExportSets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.filestorage.model.ExportSetSummary} objects contained in responses from the
     * listExportSets operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.filestorage.model.ExportSetSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.filestorage.model.ExportSetSummary> listExportSetsRecordIterator(
            final ListExportSetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExportSetsRequest.Builder,
                ListExportSetsRequest,
                ListExportSetsResponse,
                com.oracle.bmc.filestorage.model.ExportSetSummary>(
                new java.util.function.Supplier<ListExportSetsRequest.Builder>() {
                    @Override
                    public ListExportSetsRequest.Builder get() {
                        return ListExportSetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExportSetsResponse, String>() {
                    @Override
                    public String apply(ListExportSetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExportSetsRequest.Builder>,
                        ListExportSetsRequest>() {
                    @Override
                    public ListExportSetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExportSetsRequest.Builder>
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
                new java.util.function.Function<ListExportSetsRequest, ListExportSetsResponse>() {
                    @Override
                    public ListExportSetsResponse apply(ListExportSetsRequest request) {
                        return client.listExportSets(request);
                    }
                },
                new java.util.function.Function<
                        ListExportSetsResponse,
                        java.util.List<com.oracle.bmc.filestorage.model.ExportSetSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.filestorage.model.ExportSetSummary> apply(
                            ListExportSetsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listExports
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListExportsResponse> listExportsResponseIterator(
            final ListExportsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExportsRequest.Builder, ListExportsRequest, ListExportsResponse>(
                new java.util.function.Supplier<ListExportsRequest.Builder>() {
                    @Override
                    public ListExportsRequest.Builder get() {
                        return ListExportsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExportsResponse, String>() {
                    @Override
                    public String apply(ListExportsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExportsRequest.Builder>,
                        ListExportsRequest>() {
                    @Override
                    public ListExportsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExportsRequest.Builder>
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
                new java.util.function.Function<ListExportsRequest, ListExportsResponse>() {
                    @Override
                    public ListExportsResponse apply(ListExportsRequest request) {
                        return client.listExports(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.filestorage.model.ExportSummary} objects contained in responses from the
     * listExports operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.filestorage.model.ExportSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.filestorage.model.ExportSummary> listExportsRecordIterator(
            final ListExportsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExportsRequest.Builder,
                ListExportsRequest,
                ListExportsResponse,
                com.oracle.bmc.filestorage.model.ExportSummary>(
                new java.util.function.Supplier<ListExportsRequest.Builder>() {
                    @Override
                    public ListExportsRequest.Builder get() {
                        return ListExportsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExportsResponse, String>() {
                    @Override
                    public String apply(ListExportsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExportsRequest.Builder>,
                        ListExportsRequest>() {
                    @Override
                    public ListExportsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExportsRequest.Builder>
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
                new java.util.function.Function<ListExportsRequest, ListExportsResponse>() {
                    @Override
                    public ListExportsResponse apply(ListExportsRequest request) {
                        return client.listExports(request);
                    }
                },
                new java.util.function.Function<
                        ListExportsResponse,
                        java.util.List<com.oracle.bmc.filestorage.model.ExportSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.filestorage.model.ExportSummary> apply(
                            ListExportsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listFileSystems operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListFileSystemsResponse> listFileSystemsResponseIterator(
            final ListFileSystemsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFileSystemsRequest.Builder, ListFileSystemsRequest, ListFileSystemsResponse>(
                new java.util.function.Supplier<ListFileSystemsRequest.Builder>() {
                    @Override
                    public ListFileSystemsRequest.Builder get() {
                        return ListFileSystemsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFileSystemsResponse, String>() {
                    @Override
                    public String apply(ListFileSystemsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFileSystemsRequest.Builder>,
                        ListFileSystemsRequest>() {
                    @Override
                    public ListFileSystemsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFileSystemsRequest.Builder>
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
                new java.util.function.Function<ListFileSystemsRequest, ListFileSystemsResponse>() {
                    @Override
                    public ListFileSystemsResponse apply(ListFileSystemsRequest request) {
                        return client.listFileSystems(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.filestorage.model.FileSystemSummary} objects contained in responses from the
     * listFileSystems operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.filestorage.model.FileSystemSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.filestorage.model.FileSystemSummary>
            listFileSystemsRecordIterator(final ListFileSystemsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFileSystemsRequest.Builder,
                ListFileSystemsRequest,
                ListFileSystemsResponse,
                com.oracle.bmc.filestorage.model.FileSystemSummary>(
                new java.util.function.Supplier<ListFileSystemsRequest.Builder>() {
                    @Override
                    public ListFileSystemsRequest.Builder get() {
                        return ListFileSystemsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFileSystemsResponse, String>() {
                    @Override
                    public String apply(ListFileSystemsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFileSystemsRequest.Builder>,
                        ListFileSystemsRequest>() {
                    @Override
                    public ListFileSystemsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFileSystemsRequest.Builder>
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
                new java.util.function.Function<ListFileSystemsRequest, ListFileSystemsResponse>() {
                    @Override
                    public ListFileSystemsResponse apply(ListFileSystemsRequest request) {
                        return client.listFileSystems(request);
                    }
                },
                new java.util.function.Function<
                        ListFileSystemsResponse,
                        java.util.List<com.oracle.bmc.filestorage.model.FileSystemSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.filestorage.model.FileSystemSummary> apply(
                            ListFileSystemsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listFilesystemSnapshotPolicies operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListFilesystemSnapshotPoliciesResponse>
            listFilesystemSnapshotPoliciesResponseIterator(
                    final ListFilesystemSnapshotPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFilesystemSnapshotPoliciesRequest.Builder,
                ListFilesystemSnapshotPoliciesRequest,
                ListFilesystemSnapshotPoliciesResponse>(
                new java.util.function.Supplier<ListFilesystemSnapshotPoliciesRequest.Builder>() {
                    @Override
                    public ListFilesystemSnapshotPoliciesRequest.Builder get() {
                        return ListFilesystemSnapshotPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFilesystemSnapshotPoliciesResponse, String>() {
                    @Override
                    public String apply(ListFilesystemSnapshotPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFilesystemSnapshotPoliciesRequest.Builder>,
                        ListFilesystemSnapshotPoliciesRequest>() {
                    @Override
                    public ListFilesystemSnapshotPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFilesystemSnapshotPoliciesRequest.Builder>
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
                        ListFilesystemSnapshotPoliciesRequest,
                        ListFilesystemSnapshotPoliciesResponse>() {
                    @Override
                    public ListFilesystemSnapshotPoliciesResponse apply(
                            ListFilesystemSnapshotPoliciesRequest request) {
                        return client.listFilesystemSnapshotPolicies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.filestorage.model.FilesystemSnapshotPolicySummary} objects contained in
     * responses from the listFilesystemSnapshotPolicies operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.filestorage.model.FilesystemSnapshotPolicySummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.filestorage.model.FilesystemSnapshotPolicySummary>
            listFilesystemSnapshotPoliciesRecordIterator(
                    final ListFilesystemSnapshotPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFilesystemSnapshotPoliciesRequest.Builder,
                ListFilesystemSnapshotPoliciesRequest,
                ListFilesystemSnapshotPoliciesResponse,
                com.oracle.bmc.filestorage.model.FilesystemSnapshotPolicySummary>(
                new java.util.function.Supplier<ListFilesystemSnapshotPoliciesRequest.Builder>() {
                    @Override
                    public ListFilesystemSnapshotPoliciesRequest.Builder get() {
                        return ListFilesystemSnapshotPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFilesystemSnapshotPoliciesResponse, String>() {
                    @Override
                    public String apply(ListFilesystemSnapshotPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFilesystemSnapshotPoliciesRequest.Builder>,
                        ListFilesystemSnapshotPoliciesRequest>() {
                    @Override
                    public ListFilesystemSnapshotPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFilesystemSnapshotPoliciesRequest.Builder>
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
                        ListFilesystemSnapshotPoliciesRequest,
                        ListFilesystemSnapshotPoliciesResponse>() {
                    @Override
                    public ListFilesystemSnapshotPoliciesResponse apply(
                            ListFilesystemSnapshotPoliciesRequest request) {
                        return client.listFilesystemSnapshotPolicies(request);
                    }
                },
                new java.util.function.Function<
                        ListFilesystemSnapshotPoliciesResponse,
                        java.util.List<
                                com.oracle.bmc.filestorage.model
                                        .FilesystemSnapshotPolicySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.filestorage.model
                                            .FilesystemSnapshotPolicySummary>
                            apply(ListFilesystemSnapshotPoliciesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listMountTargets operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMountTargetsResponse> listMountTargetsResponseIterator(
            final ListMountTargetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMountTargetsRequest.Builder, ListMountTargetsRequest, ListMountTargetsResponse>(
                new java.util.function.Supplier<ListMountTargetsRequest.Builder>() {
                    @Override
                    public ListMountTargetsRequest.Builder get() {
                        return ListMountTargetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMountTargetsResponse, String>() {
                    @Override
                    public String apply(ListMountTargetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMountTargetsRequest.Builder>,
                        ListMountTargetsRequest>() {
                    @Override
                    public ListMountTargetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMountTargetsRequest.Builder>
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
                        ListMountTargetsRequest, ListMountTargetsResponse>() {
                    @Override
                    public ListMountTargetsResponse apply(ListMountTargetsRequest request) {
                        return client.listMountTargets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.filestorage.model.MountTargetSummary} objects contained in responses from the
     * listMountTargets operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.filestorage.model.MountTargetSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.filestorage.model.MountTargetSummary>
            listMountTargetsRecordIterator(final ListMountTargetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMountTargetsRequest.Builder,
                ListMountTargetsRequest,
                ListMountTargetsResponse,
                com.oracle.bmc.filestorage.model.MountTargetSummary>(
                new java.util.function.Supplier<ListMountTargetsRequest.Builder>() {
                    @Override
                    public ListMountTargetsRequest.Builder get() {
                        return ListMountTargetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMountTargetsResponse, String>() {
                    @Override
                    public String apply(ListMountTargetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMountTargetsRequest.Builder>,
                        ListMountTargetsRequest>() {
                    @Override
                    public ListMountTargetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMountTargetsRequest.Builder>
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
                        ListMountTargetsRequest, ListMountTargetsResponse>() {
                    @Override
                    public ListMountTargetsResponse apply(ListMountTargetsRequest request) {
                        return client.listMountTargets(request);
                    }
                },
                new java.util.function.Function<
                        ListMountTargetsResponse,
                        java.util.List<com.oracle.bmc.filestorage.model.MountTargetSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.filestorage.model.MountTargetSummary>
                            apply(ListMountTargetsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listOutboundConnectors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListOutboundConnectorsResponse> listOutboundConnectorsResponseIterator(
            final ListOutboundConnectorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOutboundConnectorsRequest.Builder,
                ListOutboundConnectorsRequest,
                ListOutboundConnectorsResponse>(
                new java.util.function.Supplier<ListOutboundConnectorsRequest.Builder>() {
                    @Override
                    public ListOutboundConnectorsRequest.Builder get() {
                        return ListOutboundConnectorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOutboundConnectorsResponse, String>() {
                    @Override
                    public String apply(ListOutboundConnectorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOutboundConnectorsRequest.Builder>,
                        ListOutboundConnectorsRequest>() {
                    @Override
                    public ListOutboundConnectorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOutboundConnectorsRequest.Builder>
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
                        ListOutboundConnectorsRequest, ListOutboundConnectorsResponse>() {
                    @Override
                    public ListOutboundConnectorsResponse apply(
                            ListOutboundConnectorsRequest request) {
                        return client.listOutboundConnectors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.filestorage.model.OutboundConnectorSummary} objects contained in responses
     * from the listOutboundConnectors operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.filestorage.model.OutboundConnectorSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.filestorage.model.OutboundConnectorSummary>
            listOutboundConnectorsRecordIterator(final ListOutboundConnectorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOutboundConnectorsRequest.Builder,
                ListOutboundConnectorsRequest,
                ListOutboundConnectorsResponse,
                com.oracle.bmc.filestorage.model.OutboundConnectorSummary>(
                new java.util.function.Supplier<ListOutboundConnectorsRequest.Builder>() {
                    @Override
                    public ListOutboundConnectorsRequest.Builder get() {
                        return ListOutboundConnectorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOutboundConnectorsResponse, String>() {
                    @Override
                    public String apply(ListOutboundConnectorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOutboundConnectorsRequest.Builder>,
                        ListOutboundConnectorsRequest>() {
                    @Override
                    public ListOutboundConnectorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOutboundConnectorsRequest.Builder>
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
                        ListOutboundConnectorsRequest, ListOutboundConnectorsResponse>() {
                    @Override
                    public ListOutboundConnectorsResponse apply(
                            ListOutboundConnectorsRequest request) {
                        return client.listOutboundConnectors(request);
                    }
                },
                new java.util.function.Function<
                        ListOutboundConnectorsResponse,
                        java.util.List<
                                com.oracle.bmc.filestorage.model.OutboundConnectorSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.filestorage.model.OutboundConnectorSummary>
                            apply(ListOutboundConnectorsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listReplicationTargets operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListReplicationTargetsResponse> listReplicationTargetsResponseIterator(
            final ListReplicationTargetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListReplicationTargetsRequest.Builder,
                ListReplicationTargetsRequest,
                ListReplicationTargetsResponse>(
                new java.util.function.Supplier<ListReplicationTargetsRequest.Builder>() {
                    @Override
                    public ListReplicationTargetsRequest.Builder get() {
                        return ListReplicationTargetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListReplicationTargetsResponse, String>() {
                    @Override
                    public String apply(ListReplicationTargetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListReplicationTargetsRequest.Builder>,
                        ListReplicationTargetsRequest>() {
                    @Override
                    public ListReplicationTargetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListReplicationTargetsRequest.Builder>
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
                        ListReplicationTargetsRequest, ListReplicationTargetsResponse>() {
                    @Override
                    public ListReplicationTargetsResponse apply(
                            ListReplicationTargetsRequest request) {
                        return client.listReplicationTargets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.filestorage.model.ReplicationTargetSummary} objects contained in responses
     * from the listReplicationTargets operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.filestorage.model.ReplicationTargetSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.filestorage.model.ReplicationTargetSummary>
            listReplicationTargetsRecordIterator(final ListReplicationTargetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListReplicationTargetsRequest.Builder,
                ListReplicationTargetsRequest,
                ListReplicationTargetsResponse,
                com.oracle.bmc.filestorage.model.ReplicationTargetSummary>(
                new java.util.function.Supplier<ListReplicationTargetsRequest.Builder>() {
                    @Override
                    public ListReplicationTargetsRequest.Builder get() {
                        return ListReplicationTargetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListReplicationTargetsResponse, String>() {
                    @Override
                    public String apply(ListReplicationTargetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListReplicationTargetsRequest.Builder>,
                        ListReplicationTargetsRequest>() {
                    @Override
                    public ListReplicationTargetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListReplicationTargetsRequest.Builder>
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
                        ListReplicationTargetsRequest, ListReplicationTargetsResponse>() {
                    @Override
                    public ListReplicationTargetsResponse apply(
                            ListReplicationTargetsRequest request) {
                        return client.listReplicationTargets(request);
                    }
                },
                new java.util.function.Function<
                        ListReplicationTargetsResponse,
                        java.util.List<
                                com.oracle.bmc.filestorage.model.ReplicationTargetSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.filestorage.model.ReplicationTargetSummary>
                            apply(ListReplicationTargetsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listReplications operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListReplicationsResponse> listReplicationsResponseIterator(
            final ListReplicationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListReplicationsRequest.Builder, ListReplicationsRequest, ListReplicationsResponse>(
                new java.util.function.Supplier<ListReplicationsRequest.Builder>() {
                    @Override
                    public ListReplicationsRequest.Builder get() {
                        return ListReplicationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListReplicationsResponse, String>() {
                    @Override
                    public String apply(ListReplicationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListReplicationsRequest.Builder>,
                        ListReplicationsRequest>() {
                    @Override
                    public ListReplicationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListReplicationsRequest.Builder>
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
                        ListReplicationsRequest, ListReplicationsResponse>() {
                    @Override
                    public ListReplicationsResponse apply(ListReplicationsRequest request) {
                        return client.listReplications(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.filestorage.model.ReplicationSummary} objects contained in responses from the
     * listReplications operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.filestorage.model.ReplicationSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.filestorage.model.ReplicationSummary>
            listReplicationsRecordIterator(final ListReplicationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListReplicationsRequest.Builder,
                ListReplicationsRequest,
                ListReplicationsResponse,
                com.oracle.bmc.filestorage.model.ReplicationSummary>(
                new java.util.function.Supplier<ListReplicationsRequest.Builder>() {
                    @Override
                    public ListReplicationsRequest.Builder get() {
                        return ListReplicationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListReplicationsResponse, String>() {
                    @Override
                    public String apply(ListReplicationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListReplicationsRequest.Builder>,
                        ListReplicationsRequest>() {
                    @Override
                    public ListReplicationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListReplicationsRequest.Builder>
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
                        ListReplicationsRequest, ListReplicationsResponse>() {
                    @Override
                    public ListReplicationsResponse apply(ListReplicationsRequest request) {
                        return client.listReplications(request);
                    }
                },
                new java.util.function.Function<
                        ListReplicationsResponse,
                        java.util.List<com.oracle.bmc.filestorage.model.ReplicationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.filestorage.model.ReplicationSummary>
                            apply(ListReplicationsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSnapshots
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSnapshotsResponse> listSnapshotsResponseIterator(
            final ListSnapshotsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSnapshotsRequest.Builder, ListSnapshotsRequest, ListSnapshotsResponse>(
                new java.util.function.Supplier<ListSnapshotsRequest.Builder>() {
                    @Override
                    public ListSnapshotsRequest.Builder get() {
                        return ListSnapshotsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSnapshotsResponse, String>() {
                    @Override
                    public String apply(ListSnapshotsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSnapshotsRequest.Builder>,
                        ListSnapshotsRequest>() {
                    @Override
                    public ListSnapshotsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSnapshotsRequest.Builder>
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
                new java.util.function.Function<ListSnapshotsRequest, ListSnapshotsResponse>() {
                    @Override
                    public ListSnapshotsResponse apply(ListSnapshotsRequest request) {
                        return client.listSnapshots(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.filestorage.model.SnapshotSummary} objects contained in responses from the
     * listSnapshots operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.filestorage.model.SnapshotSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.filestorage.model.SnapshotSummary> listSnapshotsRecordIterator(
            final ListSnapshotsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSnapshotsRequest.Builder,
                ListSnapshotsRequest,
                ListSnapshotsResponse,
                com.oracle.bmc.filestorage.model.SnapshotSummary>(
                new java.util.function.Supplier<ListSnapshotsRequest.Builder>() {
                    @Override
                    public ListSnapshotsRequest.Builder get() {
                        return ListSnapshotsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSnapshotsResponse, String>() {
                    @Override
                    public String apply(ListSnapshotsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSnapshotsRequest.Builder>,
                        ListSnapshotsRequest>() {
                    @Override
                    public ListSnapshotsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSnapshotsRequest.Builder>
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
                new java.util.function.Function<ListSnapshotsRequest, ListSnapshotsResponse>() {
                    @Override
                    public ListSnapshotsResponse apply(ListSnapshotsRequest request) {
                        return client.listSnapshots(request);
                    }
                },
                new java.util.function.Function<
                        ListSnapshotsResponse,
                        java.util.List<com.oracle.bmc.filestorage.model.SnapshotSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.filestorage.model.SnapshotSummary> apply(
                            ListSnapshotsResponse response) {
                        return response.getItems();
                    }
                });
    }
}
