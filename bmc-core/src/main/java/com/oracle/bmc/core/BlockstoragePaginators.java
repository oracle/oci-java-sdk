/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Blockstorage where multiple pages of data may be fetched.
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
@lombok.RequiredArgsConstructor
public class BlockstoragePaginators {
    private final Blockstorage client;

    /**
     * Creates a new iterable which will iterate over the responses received from the getVolumeBackupPolicyAssetAssignment operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<GetVolumeBackupPolicyAssetAssignmentResponse>
            getVolumeBackupPolicyAssetAssignmentResponseIterator(
                    final GetVolumeBackupPolicyAssetAssignmentRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                GetVolumeBackupPolicyAssetAssignmentRequest.Builder,
                GetVolumeBackupPolicyAssetAssignmentRequest,
                GetVolumeBackupPolicyAssetAssignmentResponse>(
                new com.google.common.base.Supplier<
                        GetVolumeBackupPolicyAssetAssignmentRequest.Builder>() {
                    @Override
                    public GetVolumeBackupPolicyAssetAssignmentRequest.Builder get() {
                        return GetVolumeBackupPolicyAssetAssignmentRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        GetVolumeBackupPolicyAssetAssignmentResponse, String>() {
                    @Override
                    public String apply(GetVolumeBackupPolicyAssetAssignmentResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                GetVolumeBackupPolicyAssetAssignmentRequest.Builder>,
                        GetVolumeBackupPolicyAssetAssignmentRequest>() {
                    @Override
                    public GetVolumeBackupPolicyAssetAssignmentRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            GetVolumeBackupPolicyAssetAssignmentRequest.Builder>
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
                        GetVolumeBackupPolicyAssetAssignmentRequest,
                        GetVolumeBackupPolicyAssetAssignmentResponse>() {
                    @Override
                    public GetVolumeBackupPolicyAssetAssignmentResponse apply(
                            GetVolumeBackupPolicyAssetAssignmentRequest request) {
                        return client.getVolumeBackupPolicyAssetAssignment(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.VolumeBackupPolicyAssignment} objects
     * contained in responses from the getVolumeBackupPolicyAssetAssignment operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.VolumeBackupPolicyAssignment} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.VolumeBackupPolicyAssignment>
            getVolumeBackupPolicyAssetAssignmentRecordIterator(
                    final GetVolumeBackupPolicyAssetAssignmentRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                GetVolumeBackupPolicyAssetAssignmentRequest.Builder,
                GetVolumeBackupPolicyAssetAssignmentRequest,
                GetVolumeBackupPolicyAssetAssignmentResponse,
                com.oracle.bmc.core.model.VolumeBackupPolicyAssignment>(
                new com.google.common.base.Supplier<
                        GetVolumeBackupPolicyAssetAssignmentRequest.Builder>() {
                    @Override
                    public GetVolumeBackupPolicyAssetAssignmentRequest.Builder get() {
                        return GetVolumeBackupPolicyAssetAssignmentRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        GetVolumeBackupPolicyAssetAssignmentResponse, String>() {
                    @Override
                    public String apply(GetVolumeBackupPolicyAssetAssignmentResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                GetVolumeBackupPolicyAssetAssignmentRequest.Builder>,
                        GetVolumeBackupPolicyAssetAssignmentRequest>() {
                    @Override
                    public GetVolumeBackupPolicyAssetAssignmentRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            GetVolumeBackupPolicyAssetAssignmentRequest.Builder>
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
                        GetVolumeBackupPolicyAssetAssignmentRequest,
                        GetVolumeBackupPolicyAssetAssignmentResponse>() {
                    @Override
                    public GetVolumeBackupPolicyAssetAssignmentResponse apply(
                            GetVolumeBackupPolicyAssetAssignmentRequest request) {
                        return client.getVolumeBackupPolicyAssetAssignment(request);
                    }
                },
                new com.google.common.base.Function<
                        GetVolumeBackupPolicyAssetAssignmentResponse,
                        java.util.List<com.oracle.bmc.core.model.VolumeBackupPolicyAssignment>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.VolumeBackupPolicyAssignment>
                            apply(GetVolumeBackupPolicyAssetAssignmentResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listBlockVolumeReplicas operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListBlockVolumeReplicasResponse> listBlockVolumeReplicasResponseIterator(
            final ListBlockVolumeReplicasRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBlockVolumeReplicasRequest.Builder, ListBlockVolumeReplicasRequest,
                ListBlockVolumeReplicasResponse>(
                new com.google.common.base.Supplier<ListBlockVolumeReplicasRequest.Builder>() {
                    @Override
                    public ListBlockVolumeReplicasRequest.Builder get() {
                        return ListBlockVolumeReplicasRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListBlockVolumeReplicasResponse, String>() {
                    @Override
                    public String apply(ListBlockVolumeReplicasResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBlockVolumeReplicasRequest.Builder>,
                        ListBlockVolumeReplicasRequest>() {
                    @Override
                    public ListBlockVolumeReplicasRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBlockVolumeReplicasRequest.Builder>
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
                        ListBlockVolumeReplicasRequest, ListBlockVolumeReplicasResponse>() {
                    @Override
                    public ListBlockVolumeReplicasResponse apply(
                            ListBlockVolumeReplicasRequest request) {
                        return client.listBlockVolumeReplicas(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.BlockVolumeReplica} objects
     * contained in responses from the listBlockVolumeReplicas operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.BlockVolumeReplica} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.BlockVolumeReplica>
            listBlockVolumeReplicasRecordIterator(final ListBlockVolumeReplicasRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBlockVolumeReplicasRequest.Builder, ListBlockVolumeReplicasRequest,
                ListBlockVolumeReplicasResponse, com.oracle.bmc.core.model.BlockVolumeReplica>(
                new com.google.common.base.Supplier<ListBlockVolumeReplicasRequest.Builder>() {
                    @Override
                    public ListBlockVolumeReplicasRequest.Builder get() {
                        return ListBlockVolumeReplicasRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListBlockVolumeReplicasResponse, String>() {
                    @Override
                    public String apply(ListBlockVolumeReplicasResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBlockVolumeReplicasRequest.Builder>,
                        ListBlockVolumeReplicasRequest>() {
                    @Override
                    public ListBlockVolumeReplicasRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBlockVolumeReplicasRequest.Builder>
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
                        ListBlockVolumeReplicasRequest, ListBlockVolumeReplicasResponse>() {
                    @Override
                    public ListBlockVolumeReplicasResponse apply(
                            ListBlockVolumeReplicasRequest request) {
                        return client.listBlockVolumeReplicas(request);
                    }
                },
                new com.google.common.base.Function<
                        ListBlockVolumeReplicasResponse,
                        java.util.List<com.oracle.bmc.core.model.BlockVolumeReplica>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.BlockVolumeReplica> apply(
                            ListBlockVolumeReplicasResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listBootVolumeBackups operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListBootVolumeBackupsResponse> listBootVolumeBackupsResponseIterator(
            final ListBootVolumeBackupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBootVolumeBackupsRequest.Builder, ListBootVolumeBackupsRequest,
                ListBootVolumeBackupsResponse>(
                new com.google.common.base.Supplier<ListBootVolumeBackupsRequest.Builder>() {
                    @Override
                    public ListBootVolumeBackupsRequest.Builder get() {
                        return ListBootVolumeBackupsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListBootVolumeBackupsResponse, String>() {
                    @Override
                    public String apply(ListBootVolumeBackupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBootVolumeBackupsRequest.Builder>,
                        ListBootVolumeBackupsRequest>() {
                    @Override
                    public ListBootVolumeBackupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBootVolumeBackupsRequest.Builder>
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
                        ListBootVolumeBackupsRequest, ListBootVolumeBackupsResponse>() {
                    @Override
                    public ListBootVolumeBackupsResponse apply(
                            ListBootVolumeBackupsRequest request) {
                        return client.listBootVolumeBackups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.BootVolumeBackup} objects
     * contained in responses from the listBootVolumeBackups operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.BootVolumeBackup} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.BootVolumeBackup> listBootVolumeBackupsRecordIterator(
            final ListBootVolumeBackupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBootVolumeBackupsRequest.Builder, ListBootVolumeBackupsRequest,
                ListBootVolumeBackupsResponse, com.oracle.bmc.core.model.BootVolumeBackup>(
                new com.google.common.base.Supplier<ListBootVolumeBackupsRequest.Builder>() {
                    @Override
                    public ListBootVolumeBackupsRequest.Builder get() {
                        return ListBootVolumeBackupsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListBootVolumeBackupsResponse, String>() {
                    @Override
                    public String apply(ListBootVolumeBackupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBootVolumeBackupsRequest.Builder>,
                        ListBootVolumeBackupsRequest>() {
                    @Override
                    public ListBootVolumeBackupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBootVolumeBackupsRequest.Builder>
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
                        ListBootVolumeBackupsRequest, ListBootVolumeBackupsResponse>() {
                    @Override
                    public ListBootVolumeBackupsResponse apply(
                            ListBootVolumeBackupsRequest request) {
                        return client.listBootVolumeBackups(request);
                    }
                },
                new com.google.common.base.Function<
                        ListBootVolumeBackupsResponse,
                        java.util.List<com.oracle.bmc.core.model.BootVolumeBackup>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.BootVolumeBackup> apply(
                            ListBootVolumeBackupsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listBootVolumeReplicas operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListBootVolumeReplicasResponse> listBootVolumeReplicasResponseIterator(
            final ListBootVolumeReplicasRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBootVolumeReplicasRequest.Builder, ListBootVolumeReplicasRequest,
                ListBootVolumeReplicasResponse>(
                new com.google.common.base.Supplier<ListBootVolumeReplicasRequest.Builder>() {
                    @Override
                    public ListBootVolumeReplicasRequest.Builder get() {
                        return ListBootVolumeReplicasRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListBootVolumeReplicasResponse, String>() {
                    @Override
                    public String apply(ListBootVolumeReplicasResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBootVolumeReplicasRequest.Builder>,
                        ListBootVolumeReplicasRequest>() {
                    @Override
                    public ListBootVolumeReplicasRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBootVolumeReplicasRequest.Builder>
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
                        ListBootVolumeReplicasRequest, ListBootVolumeReplicasResponse>() {
                    @Override
                    public ListBootVolumeReplicasResponse apply(
                            ListBootVolumeReplicasRequest request) {
                        return client.listBootVolumeReplicas(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.BootVolumeReplica} objects
     * contained in responses from the listBootVolumeReplicas operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.BootVolumeReplica} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.BootVolumeReplica>
            listBootVolumeReplicasRecordIterator(final ListBootVolumeReplicasRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBootVolumeReplicasRequest.Builder, ListBootVolumeReplicasRequest,
                ListBootVolumeReplicasResponse, com.oracle.bmc.core.model.BootVolumeReplica>(
                new com.google.common.base.Supplier<ListBootVolumeReplicasRequest.Builder>() {
                    @Override
                    public ListBootVolumeReplicasRequest.Builder get() {
                        return ListBootVolumeReplicasRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListBootVolumeReplicasResponse, String>() {
                    @Override
                    public String apply(ListBootVolumeReplicasResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBootVolumeReplicasRequest.Builder>,
                        ListBootVolumeReplicasRequest>() {
                    @Override
                    public ListBootVolumeReplicasRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBootVolumeReplicasRequest.Builder>
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
                        ListBootVolumeReplicasRequest, ListBootVolumeReplicasResponse>() {
                    @Override
                    public ListBootVolumeReplicasResponse apply(
                            ListBootVolumeReplicasRequest request) {
                        return client.listBootVolumeReplicas(request);
                    }
                },
                new com.google.common.base.Function<
                        ListBootVolumeReplicasResponse,
                        java.util.List<com.oracle.bmc.core.model.BootVolumeReplica>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.BootVolumeReplica> apply(
                            ListBootVolumeReplicasResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listBootVolumes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListBootVolumesResponse> listBootVolumesResponseIterator(
            final ListBootVolumesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBootVolumesRequest.Builder, ListBootVolumesRequest, ListBootVolumesResponse>(
                new com.google.common.base.Supplier<ListBootVolumesRequest.Builder>() {
                    @Override
                    public ListBootVolumesRequest.Builder get() {
                        return ListBootVolumesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListBootVolumesResponse, String>() {
                    @Override
                    public String apply(ListBootVolumesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBootVolumesRequest.Builder>,
                        ListBootVolumesRequest>() {
                    @Override
                    public ListBootVolumesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBootVolumesRequest.Builder>
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
                        ListBootVolumesRequest, ListBootVolumesResponse>() {
                    @Override
                    public ListBootVolumesResponse apply(ListBootVolumesRequest request) {
                        return client.listBootVolumes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.BootVolume} objects
     * contained in responses from the listBootVolumes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.BootVolume} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.BootVolume> listBootVolumesRecordIterator(
            final ListBootVolumesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBootVolumesRequest.Builder, ListBootVolumesRequest, ListBootVolumesResponse,
                com.oracle.bmc.core.model.BootVolume>(
                new com.google.common.base.Supplier<ListBootVolumesRequest.Builder>() {
                    @Override
                    public ListBootVolumesRequest.Builder get() {
                        return ListBootVolumesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListBootVolumesResponse, String>() {
                    @Override
                    public String apply(ListBootVolumesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBootVolumesRequest.Builder>,
                        ListBootVolumesRequest>() {
                    @Override
                    public ListBootVolumesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBootVolumesRequest.Builder>
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
                        ListBootVolumesRequest, ListBootVolumesResponse>() {
                    @Override
                    public ListBootVolumesResponse apply(ListBootVolumesRequest request) {
                        return client.listBootVolumes(request);
                    }
                },
                new com.google.common.base.Function<
                        ListBootVolumesResponse,
                        java.util.List<com.oracle.bmc.core.model.BootVolume>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.BootVolume> apply(
                            ListBootVolumesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listVolumeBackupPolicies operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListVolumeBackupPoliciesResponse> listVolumeBackupPoliciesResponseIterator(
            final ListVolumeBackupPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVolumeBackupPoliciesRequest.Builder, ListVolumeBackupPoliciesRequest,
                ListVolumeBackupPoliciesResponse>(
                new com.google.common.base.Supplier<ListVolumeBackupPoliciesRequest.Builder>() {
                    @Override
                    public ListVolumeBackupPoliciesRequest.Builder get() {
                        return ListVolumeBackupPoliciesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListVolumeBackupPoliciesResponse, String>() {
                    @Override
                    public String apply(ListVolumeBackupPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVolumeBackupPoliciesRequest.Builder>,
                        ListVolumeBackupPoliciesRequest>() {
                    @Override
                    public ListVolumeBackupPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVolumeBackupPoliciesRequest.Builder>
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
                        ListVolumeBackupPoliciesRequest, ListVolumeBackupPoliciesResponse>() {
                    @Override
                    public ListVolumeBackupPoliciesResponse apply(
                            ListVolumeBackupPoliciesRequest request) {
                        return client.listVolumeBackupPolicies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.VolumeBackupPolicy} objects
     * contained in responses from the listVolumeBackupPolicies operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.VolumeBackupPolicy} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.VolumeBackupPolicy>
            listVolumeBackupPoliciesRecordIterator(final ListVolumeBackupPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVolumeBackupPoliciesRequest.Builder, ListVolumeBackupPoliciesRequest,
                ListVolumeBackupPoliciesResponse, com.oracle.bmc.core.model.VolumeBackupPolicy>(
                new com.google.common.base.Supplier<ListVolumeBackupPoliciesRequest.Builder>() {
                    @Override
                    public ListVolumeBackupPoliciesRequest.Builder get() {
                        return ListVolumeBackupPoliciesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListVolumeBackupPoliciesResponse, String>() {
                    @Override
                    public String apply(ListVolumeBackupPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVolumeBackupPoliciesRequest.Builder>,
                        ListVolumeBackupPoliciesRequest>() {
                    @Override
                    public ListVolumeBackupPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVolumeBackupPoliciesRequest.Builder>
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
                        ListVolumeBackupPoliciesRequest, ListVolumeBackupPoliciesResponse>() {
                    @Override
                    public ListVolumeBackupPoliciesResponse apply(
                            ListVolumeBackupPoliciesRequest request) {
                        return client.listVolumeBackupPolicies(request);
                    }
                },
                new com.google.common.base.Function<
                        ListVolumeBackupPoliciesResponse,
                        java.util.List<com.oracle.bmc.core.model.VolumeBackupPolicy>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.VolumeBackupPolicy> apply(
                            ListVolumeBackupPoliciesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listVolumeBackups operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListVolumeBackupsResponse> listVolumeBackupsResponseIterator(
            final ListVolumeBackupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVolumeBackupsRequest.Builder, ListVolumeBackupsRequest,
                ListVolumeBackupsResponse>(
                new com.google.common.base.Supplier<ListVolumeBackupsRequest.Builder>() {
                    @Override
                    public ListVolumeBackupsRequest.Builder get() {
                        return ListVolumeBackupsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListVolumeBackupsResponse, String>() {
                    @Override
                    public String apply(ListVolumeBackupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVolumeBackupsRequest.Builder>,
                        ListVolumeBackupsRequest>() {
                    @Override
                    public ListVolumeBackupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVolumeBackupsRequest.Builder>
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
                        ListVolumeBackupsRequest, ListVolumeBackupsResponse>() {
                    @Override
                    public ListVolumeBackupsResponse apply(ListVolumeBackupsRequest request) {
                        return client.listVolumeBackups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.VolumeBackup} objects
     * contained in responses from the listVolumeBackups operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.VolumeBackup} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.VolumeBackup> listVolumeBackupsRecordIterator(
            final ListVolumeBackupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVolumeBackupsRequest.Builder, ListVolumeBackupsRequest,
                ListVolumeBackupsResponse, com.oracle.bmc.core.model.VolumeBackup>(
                new com.google.common.base.Supplier<ListVolumeBackupsRequest.Builder>() {
                    @Override
                    public ListVolumeBackupsRequest.Builder get() {
                        return ListVolumeBackupsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListVolumeBackupsResponse, String>() {
                    @Override
                    public String apply(ListVolumeBackupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVolumeBackupsRequest.Builder>,
                        ListVolumeBackupsRequest>() {
                    @Override
                    public ListVolumeBackupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVolumeBackupsRequest.Builder>
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
                        ListVolumeBackupsRequest, ListVolumeBackupsResponse>() {
                    @Override
                    public ListVolumeBackupsResponse apply(ListVolumeBackupsRequest request) {
                        return client.listVolumeBackups(request);
                    }
                },
                new com.google.common.base.Function<
                        ListVolumeBackupsResponse,
                        java.util.List<com.oracle.bmc.core.model.VolumeBackup>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.VolumeBackup> apply(
                            ListVolumeBackupsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listVolumeGroupBackups operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListVolumeGroupBackupsResponse> listVolumeGroupBackupsResponseIterator(
            final ListVolumeGroupBackupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVolumeGroupBackupsRequest.Builder, ListVolumeGroupBackupsRequest,
                ListVolumeGroupBackupsResponse>(
                new com.google.common.base.Supplier<ListVolumeGroupBackupsRequest.Builder>() {
                    @Override
                    public ListVolumeGroupBackupsRequest.Builder get() {
                        return ListVolumeGroupBackupsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListVolumeGroupBackupsResponse, String>() {
                    @Override
                    public String apply(ListVolumeGroupBackupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVolumeGroupBackupsRequest.Builder>,
                        ListVolumeGroupBackupsRequest>() {
                    @Override
                    public ListVolumeGroupBackupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVolumeGroupBackupsRequest.Builder>
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
                        ListVolumeGroupBackupsRequest, ListVolumeGroupBackupsResponse>() {
                    @Override
                    public ListVolumeGroupBackupsResponse apply(
                            ListVolumeGroupBackupsRequest request) {
                        return client.listVolumeGroupBackups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.VolumeGroupBackup} objects
     * contained in responses from the listVolumeGroupBackups operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.VolumeGroupBackup} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.VolumeGroupBackup>
            listVolumeGroupBackupsRecordIterator(final ListVolumeGroupBackupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVolumeGroupBackupsRequest.Builder, ListVolumeGroupBackupsRequest,
                ListVolumeGroupBackupsResponse, com.oracle.bmc.core.model.VolumeGroupBackup>(
                new com.google.common.base.Supplier<ListVolumeGroupBackupsRequest.Builder>() {
                    @Override
                    public ListVolumeGroupBackupsRequest.Builder get() {
                        return ListVolumeGroupBackupsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListVolumeGroupBackupsResponse, String>() {
                    @Override
                    public String apply(ListVolumeGroupBackupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVolumeGroupBackupsRequest.Builder>,
                        ListVolumeGroupBackupsRequest>() {
                    @Override
                    public ListVolumeGroupBackupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVolumeGroupBackupsRequest.Builder>
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
                        ListVolumeGroupBackupsRequest, ListVolumeGroupBackupsResponse>() {
                    @Override
                    public ListVolumeGroupBackupsResponse apply(
                            ListVolumeGroupBackupsRequest request) {
                        return client.listVolumeGroupBackups(request);
                    }
                },
                new com.google.common.base.Function<
                        ListVolumeGroupBackupsResponse,
                        java.util.List<com.oracle.bmc.core.model.VolumeGroupBackup>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.VolumeGroupBackup> apply(
                            ListVolumeGroupBackupsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listVolumeGroups operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListVolumeGroupsResponse> listVolumeGroupsResponseIterator(
            final ListVolumeGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVolumeGroupsRequest.Builder, ListVolumeGroupsRequest, ListVolumeGroupsResponse>(
                new com.google.common.base.Supplier<ListVolumeGroupsRequest.Builder>() {
                    @Override
                    public ListVolumeGroupsRequest.Builder get() {
                        return ListVolumeGroupsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListVolumeGroupsResponse, String>() {
                    @Override
                    public String apply(ListVolumeGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVolumeGroupsRequest.Builder>,
                        ListVolumeGroupsRequest>() {
                    @Override
                    public ListVolumeGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVolumeGroupsRequest.Builder>
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
                        ListVolumeGroupsRequest, ListVolumeGroupsResponse>() {
                    @Override
                    public ListVolumeGroupsResponse apply(ListVolumeGroupsRequest request) {
                        return client.listVolumeGroups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.VolumeGroup} objects
     * contained in responses from the listVolumeGroups operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.VolumeGroup} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.VolumeGroup> listVolumeGroupsRecordIterator(
            final ListVolumeGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVolumeGroupsRequest.Builder, ListVolumeGroupsRequest, ListVolumeGroupsResponse,
                com.oracle.bmc.core.model.VolumeGroup>(
                new com.google.common.base.Supplier<ListVolumeGroupsRequest.Builder>() {
                    @Override
                    public ListVolumeGroupsRequest.Builder get() {
                        return ListVolumeGroupsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListVolumeGroupsResponse, String>() {
                    @Override
                    public String apply(ListVolumeGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVolumeGroupsRequest.Builder>,
                        ListVolumeGroupsRequest>() {
                    @Override
                    public ListVolumeGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVolumeGroupsRequest.Builder>
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
                        ListVolumeGroupsRequest, ListVolumeGroupsResponse>() {
                    @Override
                    public ListVolumeGroupsResponse apply(ListVolumeGroupsRequest request) {
                        return client.listVolumeGroups(request);
                    }
                },
                new com.google.common.base.Function<
                        ListVolumeGroupsResponse,
                        java.util.List<com.oracle.bmc.core.model.VolumeGroup>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.VolumeGroup> apply(
                            ListVolumeGroupsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listVolumes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListVolumesResponse> listVolumesResponseIterator(
            final ListVolumesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVolumesRequest.Builder, ListVolumesRequest, ListVolumesResponse>(
                new com.google.common.base.Supplier<ListVolumesRequest.Builder>() {
                    @Override
                    public ListVolumesRequest.Builder get() {
                        return ListVolumesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListVolumesResponse, String>() {
                    @Override
                    public String apply(ListVolumesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVolumesRequest.Builder>,
                        ListVolumesRequest>() {
                    @Override
                    public ListVolumesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVolumesRequest.Builder>
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
                new com.google.common.base.Function<ListVolumesRequest, ListVolumesResponse>() {
                    @Override
                    public ListVolumesResponse apply(ListVolumesRequest request) {
                        return client.listVolumes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.Volume} objects
     * contained in responses from the listVolumes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.Volume} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.Volume> listVolumesRecordIterator(
            final ListVolumesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVolumesRequest.Builder, ListVolumesRequest, ListVolumesResponse,
                com.oracle.bmc.core.model.Volume>(
                new com.google.common.base.Supplier<ListVolumesRequest.Builder>() {
                    @Override
                    public ListVolumesRequest.Builder get() {
                        return ListVolumesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListVolumesResponse, String>() {
                    @Override
                    public String apply(ListVolumesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVolumesRequest.Builder>,
                        ListVolumesRequest>() {
                    @Override
                    public ListVolumesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVolumesRequest.Builder>
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
                new com.google.common.base.Function<ListVolumesRequest, ListVolumesResponse>() {
                    @Override
                    public ListVolumesResponse apply(ListVolumesRequest request) {
                        return client.listVolumes(request);
                    }
                },
                new com.google.common.base.Function<
                        ListVolumesResponse, java.util.List<com.oracle.bmc.core.model.Volume>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.Volume> apply(
                            ListVolumesResponse response) {
                        return response.getItems();
                    }
                });
    }
}
