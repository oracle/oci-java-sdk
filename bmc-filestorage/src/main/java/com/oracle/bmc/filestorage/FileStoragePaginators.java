/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.filestorage;

import com.oracle.bmc.filestorage.requests.*;
import com.oracle.bmc.filestorage.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of FileStorage where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@lombok.RequiredArgsConstructor
public class FileStoragePaginators {
    private final FileStorage client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listExportSets operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListExportSetsResponse> listExportSetsResponseIterator(
            final ListExportSetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExportSetsRequest.Builder, ListExportSetsRequest, ListExportSetsResponse>(
                new com.google.common.base.Supplier<ListExportSetsRequest.Builder>() {
                    @Override
                    public ListExportSetsRequest.Builder get() {
                        return ListExportSetsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListExportSetsResponse, String>() {
                    @Override
                    public String apply(ListExportSetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExportSetsRequest.Builder>,
                        ListExportSetsRequest>() {
                    @Override
                    public ListExportSetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExportSetsRequest.Builder>
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
                        ListExportSetsRequest, ListExportSetsResponse>() {
                    @Override
                    public ListExportSetsResponse apply(ListExportSetsRequest request) {
                        return client.listExportSets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.filestorage.model.ExportSetSummary} objects
     * contained in responses from the listExportSets operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.filestorage.model.ExportSetSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.filestorage.model.ExportSetSummary> listExportSetsRecordIterator(
            final ListExportSetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExportSetsRequest.Builder, ListExportSetsRequest, ListExportSetsResponse,
                com.oracle.bmc.filestorage.model.ExportSetSummary>(
                new com.google.common.base.Supplier<ListExportSetsRequest.Builder>() {
                    @Override
                    public ListExportSetsRequest.Builder get() {
                        return ListExportSetsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListExportSetsResponse, String>() {
                    @Override
                    public String apply(ListExportSetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExportSetsRequest.Builder>,
                        ListExportSetsRequest>() {
                    @Override
                    public ListExportSetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExportSetsRequest.Builder>
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
                        ListExportSetsRequest, ListExportSetsResponse>() {
                    @Override
                    public ListExportSetsResponse apply(ListExportSetsRequest request) {
                        return client.listExportSets(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listExports operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListExportsResponse> listExportsResponseIterator(
            final ListExportsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExportsRequest.Builder, ListExportsRequest, ListExportsResponse>(
                new com.google.common.base.Supplier<ListExportsRequest.Builder>() {
                    @Override
                    public ListExportsRequest.Builder get() {
                        return ListExportsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListExportsResponse, String>() {
                    @Override
                    public String apply(ListExportsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExportsRequest.Builder>,
                        ListExportsRequest>() {
                    @Override
                    public ListExportsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExportsRequest.Builder>
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
                new com.google.common.base.Function<ListExportsRequest, ListExportsResponse>() {
                    @Override
                    public ListExportsResponse apply(ListExportsRequest request) {
                        return client.listExports(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.filestorage.model.ExportSummary} objects
     * contained in responses from the listExports operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.filestorage.model.ExportSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.filestorage.model.ExportSummary> listExportsRecordIterator(
            final ListExportsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExportsRequest.Builder, ListExportsRequest, ListExportsResponse,
                com.oracle.bmc.filestorage.model.ExportSummary>(
                new com.google.common.base.Supplier<ListExportsRequest.Builder>() {
                    @Override
                    public ListExportsRequest.Builder get() {
                        return ListExportsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListExportsResponse, String>() {
                    @Override
                    public String apply(ListExportsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExportsRequest.Builder>,
                        ListExportsRequest>() {
                    @Override
                    public ListExportsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExportsRequest.Builder>
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
                new com.google.common.base.Function<ListExportsRequest, ListExportsResponse>() {
                    @Override
                    public ListExportsResponse apply(ListExportsRequest request) {
                        return client.listExports(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listFileSystems operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListFileSystemsResponse> listFileSystemsResponseIterator(
            final ListFileSystemsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFileSystemsRequest.Builder, ListFileSystemsRequest, ListFileSystemsResponse>(
                new com.google.common.base.Supplier<ListFileSystemsRequest.Builder>() {
                    @Override
                    public ListFileSystemsRequest.Builder get() {
                        return ListFileSystemsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListFileSystemsResponse, String>() {
                    @Override
                    public String apply(ListFileSystemsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFileSystemsRequest.Builder>,
                        ListFileSystemsRequest>() {
                    @Override
                    public ListFileSystemsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFileSystemsRequest.Builder>
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
                        ListFileSystemsRequest, ListFileSystemsResponse>() {
                    @Override
                    public ListFileSystemsResponse apply(ListFileSystemsRequest request) {
                        return client.listFileSystems(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.filestorage.model.FileSystemSummary} objects
     * contained in responses from the listFileSystems operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.filestorage.model.FileSystemSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.filestorage.model.FileSystemSummary>
            listFileSystemsRecordIterator(final ListFileSystemsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFileSystemsRequest.Builder, ListFileSystemsRequest, ListFileSystemsResponse,
                com.oracle.bmc.filestorage.model.FileSystemSummary>(
                new com.google.common.base.Supplier<ListFileSystemsRequest.Builder>() {
                    @Override
                    public ListFileSystemsRequest.Builder get() {
                        return ListFileSystemsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListFileSystemsResponse, String>() {
                    @Override
                    public String apply(ListFileSystemsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFileSystemsRequest.Builder>,
                        ListFileSystemsRequest>() {
                    @Override
                    public ListFileSystemsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFileSystemsRequest.Builder>
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
                        ListFileSystemsRequest, ListFileSystemsResponse>() {
                    @Override
                    public ListFileSystemsResponse apply(ListFileSystemsRequest request) {
                        return client.listFileSystems(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listMountTargets operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListMountTargetsResponse> listMountTargetsResponseIterator(
            final ListMountTargetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMountTargetsRequest.Builder, ListMountTargetsRequest, ListMountTargetsResponse>(
                new com.google.common.base.Supplier<ListMountTargetsRequest.Builder>() {
                    @Override
                    public ListMountTargetsRequest.Builder get() {
                        return ListMountTargetsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListMountTargetsResponse, String>() {
                    @Override
                    public String apply(ListMountTargetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMountTargetsRequest.Builder>,
                        ListMountTargetsRequest>() {
                    @Override
                    public ListMountTargetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMountTargetsRequest.Builder>
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
                        ListMountTargetsRequest, ListMountTargetsResponse>() {
                    @Override
                    public ListMountTargetsResponse apply(ListMountTargetsRequest request) {
                        return client.listMountTargets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.filestorage.model.MountTargetSummary} objects
     * contained in responses from the listMountTargets operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.filestorage.model.MountTargetSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.filestorage.model.MountTargetSummary>
            listMountTargetsRecordIterator(final ListMountTargetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMountTargetsRequest.Builder, ListMountTargetsRequest, ListMountTargetsResponse,
                com.oracle.bmc.filestorage.model.MountTargetSummary>(
                new com.google.common.base.Supplier<ListMountTargetsRequest.Builder>() {
                    @Override
                    public ListMountTargetsRequest.Builder get() {
                        return ListMountTargetsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListMountTargetsResponse, String>() {
                    @Override
                    public String apply(ListMountTargetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMountTargetsRequest.Builder>,
                        ListMountTargetsRequest>() {
                    @Override
                    public ListMountTargetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMountTargetsRequest.Builder>
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
                        ListMountTargetsRequest, ListMountTargetsResponse>() {
                    @Override
                    public ListMountTargetsResponse apply(ListMountTargetsRequest request) {
                        return client.listMountTargets(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listSnapshots operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSnapshotsResponse> listSnapshotsResponseIterator(
            final ListSnapshotsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSnapshotsRequest.Builder, ListSnapshotsRequest, ListSnapshotsResponse>(
                new com.google.common.base.Supplier<ListSnapshotsRequest.Builder>() {
                    @Override
                    public ListSnapshotsRequest.Builder get() {
                        return ListSnapshotsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSnapshotsResponse, String>() {
                    @Override
                    public String apply(ListSnapshotsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSnapshotsRequest.Builder>,
                        ListSnapshotsRequest>() {
                    @Override
                    public ListSnapshotsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSnapshotsRequest.Builder>
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
                new com.google.common.base.Function<ListSnapshotsRequest, ListSnapshotsResponse>() {
                    @Override
                    public ListSnapshotsResponse apply(ListSnapshotsRequest request) {
                        return client.listSnapshots(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.filestorage.model.SnapshotSummary} objects
     * contained in responses from the listSnapshots operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.filestorage.model.SnapshotSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.filestorage.model.SnapshotSummary> listSnapshotsRecordIterator(
            final ListSnapshotsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSnapshotsRequest.Builder, ListSnapshotsRequest, ListSnapshotsResponse,
                com.oracle.bmc.filestorage.model.SnapshotSummary>(
                new com.google.common.base.Supplier<ListSnapshotsRequest.Builder>() {
                    @Override
                    public ListSnapshotsRequest.Builder get() {
                        return ListSnapshotsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSnapshotsResponse, String>() {
                    @Override
                    public String apply(ListSnapshotsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSnapshotsRequest.Builder>,
                        ListSnapshotsRequest>() {
                    @Override
                    public ListSnapshotsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSnapshotsRequest.Builder>
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
                new com.google.common.base.Function<ListSnapshotsRequest, ListSnapshotsResponse>() {
                    @Override
                    public ListSnapshotsResponse apply(ListSnapshotsRequest request) {
                        return client.listSnapshots(request);
                    }
                },
                new com.google.common.base.Function<
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
