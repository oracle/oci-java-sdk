/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds;

import com.oracle.bmc.bds.requests.*;
import com.oracle.bmc.bds.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Bds where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
public class BdsPaginators {
    private final Bds client;

    public BdsPaginators(Bds client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAutoScalingConfigurations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAutoScalingConfigurationsResponse>
            listAutoScalingConfigurationsResponseIterator(
                    final ListAutoScalingConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAutoScalingConfigurationsRequest.Builder, ListAutoScalingConfigurationsRequest,
                ListAutoScalingConfigurationsResponse>(
                new java.util.function.Supplier<ListAutoScalingConfigurationsRequest.Builder>() {
                    @Override
                    public ListAutoScalingConfigurationsRequest.Builder get() {
                        return ListAutoScalingConfigurationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAutoScalingConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListAutoScalingConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutoScalingConfigurationsRequest.Builder>,
                        ListAutoScalingConfigurationsRequest>() {
                    @Override
                    public ListAutoScalingConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutoScalingConfigurationsRequest.Builder>
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
                        ListAutoScalingConfigurationsRequest,
                        ListAutoScalingConfigurationsResponse>() {
                    @Override
                    public ListAutoScalingConfigurationsResponse apply(
                            ListAutoScalingConfigurationsRequest request) {
                        return client.listAutoScalingConfigurations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.bds.model.AutoScalingConfigurationSummary} objects
     * contained in responses from the listAutoScalingConfigurations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.bds.model.AutoScalingConfigurationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.bds.model.AutoScalingConfigurationSummary>
            listAutoScalingConfigurationsRecordIterator(
                    final ListAutoScalingConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAutoScalingConfigurationsRequest.Builder, ListAutoScalingConfigurationsRequest,
                ListAutoScalingConfigurationsResponse,
                com.oracle.bmc.bds.model.AutoScalingConfigurationSummary>(
                new java.util.function.Supplier<ListAutoScalingConfigurationsRequest.Builder>() {
                    @Override
                    public ListAutoScalingConfigurationsRequest.Builder get() {
                        return ListAutoScalingConfigurationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAutoScalingConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListAutoScalingConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutoScalingConfigurationsRequest.Builder>,
                        ListAutoScalingConfigurationsRequest>() {
                    @Override
                    public ListAutoScalingConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutoScalingConfigurationsRequest.Builder>
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
                        ListAutoScalingConfigurationsRequest,
                        ListAutoScalingConfigurationsResponse>() {
                    @Override
                    public ListAutoScalingConfigurationsResponse apply(
                            ListAutoScalingConfigurationsRequest request) {
                        return client.listAutoScalingConfigurations(request);
                    }
                },
                new java.util.function.Function<
                        ListAutoScalingConfigurationsResponse,
                        java.util.List<
                                com.oracle.bmc.bds.model.AutoScalingConfigurationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.bds.model.AutoScalingConfigurationSummary>
                            apply(ListAutoScalingConfigurationsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listBdsApiKeys operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListBdsApiKeysResponse> listBdsApiKeysResponseIterator(
            final ListBdsApiKeysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBdsApiKeysRequest.Builder, ListBdsApiKeysRequest, ListBdsApiKeysResponse>(
                new java.util.function.Supplier<ListBdsApiKeysRequest.Builder>() {
                    @Override
                    public ListBdsApiKeysRequest.Builder get() {
                        return ListBdsApiKeysRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBdsApiKeysResponse, String>() {
                    @Override
                    public String apply(ListBdsApiKeysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBdsApiKeysRequest.Builder>,
                        ListBdsApiKeysRequest>() {
                    @Override
                    public ListBdsApiKeysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBdsApiKeysRequest.Builder>
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
                new java.util.function.Function<ListBdsApiKeysRequest, ListBdsApiKeysResponse>() {
                    @Override
                    public ListBdsApiKeysResponse apply(ListBdsApiKeysRequest request) {
                        return client.listBdsApiKeys(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.bds.model.BdsApiKeySummary} objects
     * contained in responses from the listBdsApiKeys operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.bds.model.BdsApiKeySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.bds.model.BdsApiKeySummary> listBdsApiKeysRecordIterator(
            final ListBdsApiKeysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBdsApiKeysRequest.Builder, ListBdsApiKeysRequest, ListBdsApiKeysResponse,
                com.oracle.bmc.bds.model.BdsApiKeySummary>(
                new java.util.function.Supplier<ListBdsApiKeysRequest.Builder>() {
                    @Override
                    public ListBdsApiKeysRequest.Builder get() {
                        return ListBdsApiKeysRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBdsApiKeysResponse, String>() {
                    @Override
                    public String apply(ListBdsApiKeysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBdsApiKeysRequest.Builder>,
                        ListBdsApiKeysRequest>() {
                    @Override
                    public ListBdsApiKeysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBdsApiKeysRequest.Builder>
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
                new java.util.function.Function<ListBdsApiKeysRequest, ListBdsApiKeysResponse>() {
                    @Override
                    public ListBdsApiKeysResponse apply(ListBdsApiKeysRequest request) {
                        return client.listBdsApiKeys(request);
                    }
                },
                new java.util.function.Function<
                        ListBdsApiKeysResponse,
                        java.util.List<com.oracle.bmc.bds.model.BdsApiKeySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.bds.model.BdsApiKeySummary> apply(
                            ListBdsApiKeysResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listBdsInstances operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListBdsInstancesResponse> listBdsInstancesResponseIterator(
            final ListBdsInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBdsInstancesRequest.Builder, ListBdsInstancesRequest, ListBdsInstancesResponse>(
                new java.util.function.Supplier<ListBdsInstancesRequest.Builder>() {
                    @Override
                    public ListBdsInstancesRequest.Builder get() {
                        return ListBdsInstancesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBdsInstancesResponse, String>() {
                    @Override
                    public String apply(ListBdsInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBdsInstancesRequest.Builder>,
                        ListBdsInstancesRequest>() {
                    @Override
                    public ListBdsInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBdsInstancesRequest.Builder>
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
                        ListBdsInstancesRequest, ListBdsInstancesResponse>() {
                    @Override
                    public ListBdsInstancesResponse apply(ListBdsInstancesRequest request) {
                        return client.listBdsInstances(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.bds.model.BdsInstanceSummary} objects
     * contained in responses from the listBdsInstances operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.bds.model.BdsInstanceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.bds.model.BdsInstanceSummary> listBdsInstancesRecordIterator(
            final ListBdsInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBdsInstancesRequest.Builder, ListBdsInstancesRequest, ListBdsInstancesResponse,
                com.oracle.bmc.bds.model.BdsInstanceSummary>(
                new java.util.function.Supplier<ListBdsInstancesRequest.Builder>() {
                    @Override
                    public ListBdsInstancesRequest.Builder get() {
                        return ListBdsInstancesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBdsInstancesResponse, String>() {
                    @Override
                    public String apply(ListBdsInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBdsInstancesRequest.Builder>,
                        ListBdsInstancesRequest>() {
                    @Override
                    public ListBdsInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBdsInstancesRequest.Builder>
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
                        ListBdsInstancesRequest, ListBdsInstancesResponse>() {
                    @Override
                    public ListBdsInstancesResponse apply(ListBdsInstancesRequest request) {
                        return client.listBdsInstances(request);
                    }
                },
                new java.util.function.Function<
                        ListBdsInstancesResponse,
                        java.util.List<com.oracle.bmc.bds.model.BdsInstanceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.bds.model.BdsInstanceSummary> apply(
                            ListBdsInstancesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listBdsMetastoreConfigurations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListBdsMetastoreConfigurationsResponse>
            listBdsMetastoreConfigurationsResponseIterator(
                    final ListBdsMetastoreConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBdsMetastoreConfigurationsRequest.Builder,
                ListBdsMetastoreConfigurationsRequest, ListBdsMetastoreConfigurationsResponse>(
                new java.util.function.Supplier<ListBdsMetastoreConfigurationsRequest.Builder>() {
                    @Override
                    public ListBdsMetastoreConfigurationsRequest.Builder get() {
                        return ListBdsMetastoreConfigurationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBdsMetastoreConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListBdsMetastoreConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBdsMetastoreConfigurationsRequest.Builder>,
                        ListBdsMetastoreConfigurationsRequest>() {
                    @Override
                    public ListBdsMetastoreConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBdsMetastoreConfigurationsRequest.Builder>
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
                        ListBdsMetastoreConfigurationsRequest,
                        ListBdsMetastoreConfigurationsResponse>() {
                    @Override
                    public ListBdsMetastoreConfigurationsResponse apply(
                            ListBdsMetastoreConfigurationsRequest request) {
                        return client.listBdsMetastoreConfigurations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.bds.model.BdsMetastoreConfigurationSummary} objects
     * contained in responses from the listBdsMetastoreConfigurations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.bds.model.BdsMetastoreConfigurationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.bds.model.BdsMetastoreConfigurationSummary>
            listBdsMetastoreConfigurationsRecordIterator(
                    final ListBdsMetastoreConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBdsMetastoreConfigurationsRequest.Builder,
                ListBdsMetastoreConfigurationsRequest, ListBdsMetastoreConfigurationsResponse,
                com.oracle.bmc.bds.model.BdsMetastoreConfigurationSummary>(
                new java.util.function.Supplier<ListBdsMetastoreConfigurationsRequest.Builder>() {
                    @Override
                    public ListBdsMetastoreConfigurationsRequest.Builder get() {
                        return ListBdsMetastoreConfigurationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBdsMetastoreConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListBdsMetastoreConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBdsMetastoreConfigurationsRequest.Builder>,
                        ListBdsMetastoreConfigurationsRequest>() {
                    @Override
                    public ListBdsMetastoreConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBdsMetastoreConfigurationsRequest.Builder>
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
                        ListBdsMetastoreConfigurationsRequest,
                        ListBdsMetastoreConfigurationsResponse>() {
                    @Override
                    public ListBdsMetastoreConfigurationsResponse apply(
                            ListBdsMetastoreConfigurationsRequest request) {
                        return client.listBdsMetastoreConfigurations(request);
                    }
                },
                new java.util.function.Function<
                        ListBdsMetastoreConfigurationsResponse,
                        java.util.List<
                                com.oracle.bmc.bds.model.BdsMetastoreConfigurationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.bds.model.BdsMetastoreConfigurationSummary>
                            apply(ListBdsMetastoreConfigurationsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listNodeBackupConfigurations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListNodeBackupConfigurationsResponse>
            listNodeBackupConfigurationsResponseIterator(
                    final ListNodeBackupConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListNodeBackupConfigurationsRequest.Builder, ListNodeBackupConfigurationsRequest,
                ListNodeBackupConfigurationsResponse>(
                new java.util.function.Supplier<ListNodeBackupConfigurationsRequest.Builder>() {
                    @Override
                    public ListNodeBackupConfigurationsRequest.Builder get() {
                        return ListNodeBackupConfigurationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListNodeBackupConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListNodeBackupConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNodeBackupConfigurationsRequest.Builder>,
                        ListNodeBackupConfigurationsRequest>() {
                    @Override
                    public ListNodeBackupConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNodeBackupConfigurationsRequest.Builder>
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
                        ListNodeBackupConfigurationsRequest,
                        ListNodeBackupConfigurationsResponse>() {
                    @Override
                    public ListNodeBackupConfigurationsResponse apply(
                            ListNodeBackupConfigurationsRequest request) {
                        return client.listNodeBackupConfigurations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.bds.model.NodeBackupConfigurationSummary} objects
     * contained in responses from the listNodeBackupConfigurations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.bds.model.NodeBackupConfigurationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.bds.model.NodeBackupConfigurationSummary>
            listNodeBackupConfigurationsRecordIterator(
                    final ListNodeBackupConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListNodeBackupConfigurationsRequest.Builder, ListNodeBackupConfigurationsRequest,
                ListNodeBackupConfigurationsResponse,
                com.oracle.bmc.bds.model.NodeBackupConfigurationSummary>(
                new java.util.function.Supplier<ListNodeBackupConfigurationsRequest.Builder>() {
                    @Override
                    public ListNodeBackupConfigurationsRequest.Builder get() {
                        return ListNodeBackupConfigurationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListNodeBackupConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListNodeBackupConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNodeBackupConfigurationsRequest.Builder>,
                        ListNodeBackupConfigurationsRequest>() {
                    @Override
                    public ListNodeBackupConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNodeBackupConfigurationsRequest.Builder>
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
                        ListNodeBackupConfigurationsRequest,
                        ListNodeBackupConfigurationsResponse>() {
                    @Override
                    public ListNodeBackupConfigurationsResponse apply(
                            ListNodeBackupConfigurationsRequest request) {
                        return client.listNodeBackupConfigurations(request);
                    }
                },
                new java.util.function.Function<
                        ListNodeBackupConfigurationsResponse,
                        java.util.List<com.oracle.bmc.bds.model.NodeBackupConfigurationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.bds.model.NodeBackupConfigurationSummary>
                            apply(ListNodeBackupConfigurationsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listNodeBackups operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListNodeBackupsResponse> listNodeBackupsResponseIterator(
            final ListNodeBackupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListNodeBackupsRequest.Builder, ListNodeBackupsRequest, ListNodeBackupsResponse>(
                new java.util.function.Supplier<ListNodeBackupsRequest.Builder>() {
                    @Override
                    public ListNodeBackupsRequest.Builder get() {
                        return ListNodeBackupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListNodeBackupsResponse, String>() {
                    @Override
                    public String apply(ListNodeBackupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNodeBackupsRequest.Builder>,
                        ListNodeBackupsRequest>() {
                    @Override
                    public ListNodeBackupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNodeBackupsRequest.Builder>
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
                new java.util.function.Function<ListNodeBackupsRequest, ListNodeBackupsResponse>() {
                    @Override
                    public ListNodeBackupsResponse apply(ListNodeBackupsRequest request) {
                        return client.listNodeBackups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.bds.model.NodeBackupSummary} objects
     * contained in responses from the listNodeBackups operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.bds.model.NodeBackupSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.bds.model.NodeBackupSummary> listNodeBackupsRecordIterator(
            final ListNodeBackupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListNodeBackupsRequest.Builder, ListNodeBackupsRequest, ListNodeBackupsResponse,
                com.oracle.bmc.bds.model.NodeBackupSummary>(
                new java.util.function.Supplier<ListNodeBackupsRequest.Builder>() {
                    @Override
                    public ListNodeBackupsRequest.Builder get() {
                        return ListNodeBackupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListNodeBackupsResponse, String>() {
                    @Override
                    public String apply(ListNodeBackupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNodeBackupsRequest.Builder>,
                        ListNodeBackupsRequest>() {
                    @Override
                    public ListNodeBackupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNodeBackupsRequest.Builder>
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
                new java.util.function.Function<ListNodeBackupsRequest, ListNodeBackupsResponse>() {
                    @Override
                    public ListNodeBackupsResponse apply(ListNodeBackupsRequest request) {
                        return client.listNodeBackups(request);
                    }
                },
                new java.util.function.Function<
                        ListNodeBackupsResponse,
                        java.util.List<com.oracle.bmc.bds.model.NodeBackupSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.bds.model.NodeBackupSummary> apply(
                            ListNodeBackupsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listNodeReplaceConfigurations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListNodeReplaceConfigurationsResponse>
            listNodeReplaceConfigurationsResponseIterator(
                    final ListNodeReplaceConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListNodeReplaceConfigurationsRequest.Builder, ListNodeReplaceConfigurationsRequest,
                ListNodeReplaceConfigurationsResponse>(
                new java.util.function.Supplier<ListNodeReplaceConfigurationsRequest.Builder>() {
                    @Override
                    public ListNodeReplaceConfigurationsRequest.Builder get() {
                        return ListNodeReplaceConfigurationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListNodeReplaceConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListNodeReplaceConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNodeReplaceConfigurationsRequest.Builder>,
                        ListNodeReplaceConfigurationsRequest>() {
                    @Override
                    public ListNodeReplaceConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNodeReplaceConfigurationsRequest.Builder>
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
                        ListNodeReplaceConfigurationsRequest,
                        ListNodeReplaceConfigurationsResponse>() {
                    @Override
                    public ListNodeReplaceConfigurationsResponse apply(
                            ListNodeReplaceConfigurationsRequest request) {
                        return client.listNodeReplaceConfigurations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.bds.model.NodeReplaceConfigurationSummary} objects
     * contained in responses from the listNodeReplaceConfigurations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.bds.model.NodeReplaceConfigurationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.bds.model.NodeReplaceConfigurationSummary>
            listNodeReplaceConfigurationsRecordIterator(
                    final ListNodeReplaceConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListNodeReplaceConfigurationsRequest.Builder, ListNodeReplaceConfigurationsRequest,
                ListNodeReplaceConfigurationsResponse,
                com.oracle.bmc.bds.model.NodeReplaceConfigurationSummary>(
                new java.util.function.Supplier<ListNodeReplaceConfigurationsRequest.Builder>() {
                    @Override
                    public ListNodeReplaceConfigurationsRequest.Builder get() {
                        return ListNodeReplaceConfigurationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListNodeReplaceConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListNodeReplaceConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNodeReplaceConfigurationsRequest.Builder>,
                        ListNodeReplaceConfigurationsRequest>() {
                    @Override
                    public ListNodeReplaceConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNodeReplaceConfigurationsRequest.Builder>
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
                        ListNodeReplaceConfigurationsRequest,
                        ListNodeReplaceConfigurationsResponse>() {
                    @Override
                    public ListNodeReplaceConfigurationsResponse apply(
                            ListNodeReplaceConfigurationsRequest request) {
                        return client.listNodeReplaceConfigurations(request);
                    }
                },
                new java.util.function.Function<
                        ListNodeReplaceConfigurationsResponse,
                        java.util.List<
                                com.oracle.bmc.bds.model.NodeReplaceConfigurationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.bds.model.NodeReplaceConfigurationSummary>
                            apply(ListNodeReplaceConfigurationsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listOsPatches operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListOsPatchesResponse> listOsPatchesResponseIterator(
            final ListOsPatchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOsPatchesRequest.Builder, ListOsPatchesRequest, ListOsPatchesResponse>(
                new java.util.function.Supplier<ListOsPatchesRequest.Builder>() {
                    @Override
                    public ListOsPatchesRequest.Builder get() {
                        return ListOsPatchesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOsPatchesResponse, String>() {
                    @Override
                    public String apply(ListOsPatchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOsPatchesRequest.Builder>,
                        ListOsPatchesRequest>() {
                    @Override
                    public ListOsPatchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOsPatchesRequest.Builder>
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
                new java.util.function.Function<ListOsPatchesRequest, ListOsPatchesResponse>() {
                    @Override
                    public ListOsPatchesResponse apply(ListOsPatchesRequest request) {
                        return client.listOsPatches(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.bds.model.OsPatchSummary} objects
     * contained in responses from the listOsPatches operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.bds.model.OsPatchSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.bds.model.OsPatchSummary> listOsPatchesRecordIterator(
            final ListOsPatchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOsPatchesRequest.Builder, ListOsPatchesRequest, ListOsPatchesResponse,
                com.oracle.bmc.bds.model.OsPatchSummary>(
                new java.util.function.Supplier<ListOsPatchesRequest.Builder>() {
                    @Override
                    public ListOsPatchesRequest.Builder get() {
                        return ListOsPatchesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOsPatchesResponse, String>() {
                    @Override
                    public String apply(ListOsPatchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOsPatchesRequest.Builder>,
                        ListOsPatchesRequest>() {
                    @Override
                    public ListOsPatchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOsPatchesRequest.Builder>
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
                new java.util.function.Function<ListOsPatchesRequest, ListOsPatchesResponse>() {
                    @Override
                    public ListOsPatchesResponse apply(ListOsPatchesRequest request) {
                        return client.listOsPatches(request);
                    }
                },
                new java.util.function.Function<
                        ListOsPatchesResponse,
                        java.util.List<com.oracle.bmc.bds.model.OsPatchSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.bds.model.OsPatchSummary> apply(
                            ListOsPatchesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listPatchHistories operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListPatchHistoriesResponse> listPatchHistoriesResponseIterator(
            final ListPatchHistoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPatchHistoriesRequest.Builder, ListPatchHistoriesRequest,
                ListPatchHistoriesResponse>(
                new java.util.function.Supplier<ListPatchHistoriesRequest.Builder>() {
                    @Override
                    public ListPatchHistoriesRequest.Builder get() {
                        return ListPatchHistoriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPatchHistoriesResponse, String>() {
                    @Override
                    public String apply(ListPatchHistoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPatchHistoriesRequest.Builder>,
                        ListPatchHistoriesRequest>() {
                    @Override
                    public ListPatchHistoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPatchHistoriesRequest.Builder>
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
                        ListPatchHistoriesRequest, ListPatchHistoriesResponse>() {
                    @Override
                    public ListPatchHistoriesResponse apply(ListPatchHistoriesRequest request) {
                        return client.listPatchHistories(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.bds.model.PatchHistorySummary} objects
     * contained in responses from the listPatchHistories operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.bds.model.PatchHistorySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.bds.model.PatchHistorySummary> listPatchHistoriesRecordIterator(
            final ListPatchHistoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPatchHistoriesRequest.Builder, ListPatchHistoriesRequest,
                ListPatchHistoriesResponse, com.oracle.bmc.bds.model.PatchHistorySummary>(
                new java.util.function.Supplier<ListPatchHistoriesRequest.Builder>() {
                    @Override
                    public ListPatchHistoriesRequest.Builder get() {
                        return ListPatchHistoriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPatchHistoriesResponse, String>() {
                    @Override
                    public String apply(ListPatchHistoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPatchHistoriesRequest.Builder>,
                        ListPatchHistoriesRequest>() {
                    @Override
                    public ListPatchHistoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPatchHistoriesRequest.Builder>
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
                        ListPatchHistoriesRequest, ListPatchHistoriesResponse>() {
                    @Override
                    public ListPatchHistoriesResponse apply(ListPatchHistoriesRequest request) {
                        return client.listPatchHistories(request);
                    }
                },
                new java.util.function.Function<
                        ListPatchHistoriesResponse,
                        java.util.List<com.oracle.bmc.bds.model.PatchHistorySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.bds.model.PatchHistorySummary> apply(
                            ListPatchHistoriesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listPatches operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListPatchesResponse> listPatchesResponseIterator(
            final ListPatchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPatchesRequest.Builder, ListPatchesRequest, ListPatchesResponse>(
                new java.util.function.Supplier<ListPatchesRequest.Builder>() {
                    @Override
                    public ListPatchesRequest.Builder get() {
                        return ListPatchesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPatchesResponse, String>() {
                    @Override
                    public String apply(ListPatchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPatchesRequest.Builder>,
                        ListPatchesRequest>() {
                    @Override
                    public ListPatchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPatchesRequest.Builder>
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
                new java.util.function.Function<ListPatchesRequest, ListPatchesResponse>() {
                    @Override
                    public ListPatchesResponse apply(ListPatchesRequest request) {
                        return client.listPatches(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.bds.model.PatchSummary} objects
     * contained in responses from the listPatches operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.bds.model.PatchSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.bds.model.PatchSummary> listPatchesRecordIterator(
            final ListPatchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPatchesRequest.Builder, ListPatchesRequest, ListPatchesResponse,
                com.oracle.bmc.bds.model.PatchSummary>(
                new java.util.function.Supplier<ListPatchesRequest.Builder>() {
                    @Override
                    public ListPatchesRequest.Builder get() {
                        return ListPatchesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPatchesResponse, String>() {
                    @Override
                    public String apply(ListPatchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPatchesRequest.Builder>,
                        ListPatchesRequest>() {
                    @Override
                    public ListPatchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPatchesRequest.Builder>
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
                new java.util.function.Function<ListPatchesRequest, ListPatchesResponse>() {
                    @Override
                    public ListPatchesResponse apply(ListPatchesRequest request) {
                        return client.listPatches(request);
                    }
                },
                new java.util.function.Function<
                        ListPatchesResponse,
                        java.util.List<com.oracle.bmc.bds.model.PatchSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.bds.model.PatchSummary> apply(
                            ListPatchesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listResourcePrincipalConfigurations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListResourcePrincipalConfigurationsResponse>
            listResourcePrincipalConfigurationsResponseIterator(
                    final ListResourcePrincipalConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListResourcePrincipalConfigurationsRequest.Builder,
                ListResourcePrincipalConfigurationsRequest,
                ListResourcePrincipalConfigurationsResponse>(
                new java.util.function.Supplier<
                        ListResourcePrincipalConfigurationsRequest.Builder>() {
                    @Override
                    public ListResourcePrincipalConfigurationsRequest.Builder get() {
                        return ListResourcePrincipalConfigurationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListResourcePrincipalConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListResourcePrincipalConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourcePrincipalConfigurationsRequest.Builder>,
                        ListResourcePrincipalConfigurationsRequest>() {
                    @Override
                    public ListResourcePrincipalConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourcePrincipalConfigurationsRequest.Builder>
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
                        ListResourcePrincipalConfigurationsRequest,
                        ListResourcePrincipalConfigurationsResponse>() {
                    @Override
                    public ListResourcePrincipalConfigurationsResponse apply(
                            ListResourcePrincipalConfigurationsRequest request) {
                        return client.listResourcePrincipalConfigurations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.bds.model.ResourcePrincipalConfigurationSummary} objects
     * contained in responses from the listResourcePrincipalConfigurations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.bds.model.ResourcePrincipalConfigurationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.bds.model.ResourcePrincipalConfigurationSummary>
            listResourcePrincipalConfigurationsRecordIterator(
                    final ListResourcePrincipalConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListResourcePrincipalConfigurationsRequest.Builder,
                ListResourcePrincipalConfigurationsRequest,
                ListResourcePrincipalConfigurationsResponse,
                com.oracle.bmc.bds.model.ResourcePrincipalConfigurationSummary>(
                new java.util.function.Supplier<
                        ListResourcePrincipalConfigurationsRequest.Builder>() {
                    @Override
                    public ListResourcePrincipalConfigurationsRequest.Builder get() {
                        return ListResourcePrincipalConfigurationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListResourcePrincipalConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListResourcePrincipalConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourcePrincipalConfigurationsRequest.Builder>,
                        ListResourcePrincipalConfigurationsRequest>() {
                    @Override
                    public ListResourcePrincipalConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourcePrincipalConfigurationsRequest.Builder>
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
                        ListResourcePrincipalConfigurationsRequest,
                        ListResourcePrincipalConfigurationsResponse>() {
                    @Override
                    public ListResourcePrincipalConfigurationsResponse apply(
                            ListResourcePrincipalConfigurationsRequest request) {
                        return client.listResourcePrincipalConfigurations(request);
                    }
                },
                new java.util.function.Function<
                        ListResourcePrincipalConfigurationsResponse,
                        java.util.List<
                                com.oracle.bmc.bds.model.ResourcePrincipalConfigurationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.bds.model.ResourcePrincipalConfigurationSummary>
                            apply(ListResourcePrincipalConfigurationsResponse response) {
                        return response.getItems();
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.bds.model.WorkRequestError} objects
     * contained in responses from the listWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.bds.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.bds.model.WorkRequestError> listWorkRequestErrorsRecordIterator(
            final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse, com.oracle.bmc.bds.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.bds.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.bds.model.WorkRequestError> apply(
                            ListWorkRequestErrorsResponse response) {
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.bds.model.WorkRequestLogEntry} objects
     * contained in responses from the listWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.bds.model.WorkRequestLogEntry} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.bds.model.WorkRequestLogEntry> listWorkRequestLogsRecordIterator(
            final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse, com.oracle.bmc.bds.model.WorkRequestLogEntry>(
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
                        java.util.List<com.oracle.bmc.bds.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.bds.model.WorkRequestLogEntry> apply(
                            ListWorkRequestLogsResponse response) {
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.bds.model.WorkRequest} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.bds.model.WorkRequest} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.bds.model.WorkRequest> listWorkRequestsRecordIterator(
            final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.bds.model.WorkRequest>(
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
                        java.util.List<com.oracle.bmc.bds.model.WorkRequest>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.bds.model.WorkRequest> apply(
                            ListWorkRequestsResponse response) {
                        return response.getItems();
                    }
                });
    }
}
