/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent;

import com.oracle.bmc.managementagent.requests.*;
import com.oracle.bmc.managementagent.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of ManagementAgent where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
public class ManagementAgentPaginators {
    private final ManagementAgent client;

    public ManagementAgentPaginators(ManagementAgent client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAvailabilityHistories operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAvailabilityHistoriesResponse> listAvailabilityHistoriesResponseIterator(
            final ListAvailabilityHistoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAvailabilityHistoriesRequest.Builder, ListAvailabilityHistoriesRequest,
                ListAvailabilityHistoriesResponse>(
                new com.google.common.base.Supplier<ListAvailabilityHistoriesRequest.Builder>() {
                    @Override
                    public ListAvailabilityHistoriesRequest.Builder get() {
                        return ListAvailabilityHistoriesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAvailabilityHistoriesResponse, String>() {
                    @Override
                    public String apply(ListAvailabilityHistoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAvailabilityHistoriesRequest.Builder>,
                        ListAvailabilityHistoriesRequest>() {
                    @Override
                    public ListAvailabilityHistoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAvailabilityHistoriesRequest.Builder>
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
                        ListAvailabilityHistoriesRequest, ListAvailabilityHistoriesResponse>() {
                    @Override
                    public ListAvailabilityHistoriesResponse apply(
                            ListAvailabilityHistoriesRequest request) {
                        return client.listAvailabilityHistories(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.managementagent.model.AvailabilityHistorySummary} objects
     * contained in responses from the listAvailabilityHistories operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.managementagent.model.AvailabilityHistorySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.managementagent.model.AvailabilityHistorySummary>
            listAvailabilityHistoriesRecordIterator(
                    final ListAvailabilityHistoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAvailabilityHistoriesRequest.Builder, ListAvailabilityHistoriesRequest,
                ListAvailabilityHistoriesResponse,
                com.oracle.bmc.managementagent.model.AvailabilityHistorySummary>(
                new com.google.common.base.Supplier<ListAvailabilityHistoriesRequest.Builder>() {
                    @Override
                    public ListAvailabilityHistoriesRequest.Builder get() {
                        return ListAvailabilityHistoriesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAvailabilityHistoriesResponse, String>() {
                    @Override
                    public String apply(ListAvailabilityHistoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAvailabilityHistoriesRequest.Builder>,
                        ListAvailabilityHistoriesRequest>() {
                    @Override
                    public ListAvailabilityHistoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAvailabilityHistoriesRequest.Builder>
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
                        ListAvailabilityHistoriesRequest, ListAvailabilityHistoriesResponse>() {
                    @Override
                    public ListAvailabilityHistoriesResponse apply(
                            ListAvailabilityHistoriesRequest request) {
                        return client.listAvailabilityHistories(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAvailabilityHistoriesResponse,
                        java.util.List<
                                com.oracle.bmc.managementagent.model
                                        .AvailabilityHistorySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.managementagent.model.AvailabilityHistorySummary>
                            apply(ListAvailabilityHistoriesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listManagementAgentImages operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListManagementAgentImagesResponse> listManagementAgentImagesResponseIterator(
            final ListManagementAgentImagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagementAgentImagesRequest.Builder, ListManagementAgentImagesRequest,
                ListManagementAgentImagesResponse>(
                new com.google.common.base.Supplier<ListManagementAgentImagesRequest.Builder>() {
                    @Override
                    public ListManagementAgentImagesRequest.Builder get() {
                        return ListManagementAgentImagesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListManagementAgentImagesResponse, String>() {
                    @Override
                    public String apply(ListManagementAgentImagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagementAgentImagesRequest.Builder>,
                        ListManagementAgentImagesRequest>() {
                    @Override
                    public ListManagementAgentImagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagementAgentImagesRequest.Builder>
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
                        ListManagementAgentImagesRequest, ListManagementAgentImagesResponse>() {
                    @Override
                    public ListManagementAgentImagesResponse apply(
                            ListManagementAgentImagesRequest request) {
                        return client.listManagementAgentImages(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.managementagent.model.ManagementAgentImageSummary} objects
     * contained in responses from the listManagementAgentImages operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.managementagent.model.ManagementAgentImageSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.managementagent.model.ManagementAgentImageSummary>
            listManagementAgentImagesRecordIterator(
                    final ListManagementAgentImagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagementAgentImagesRequest.Builder, ListManagementAgentImagesRequest,
                ListManagementAgentImagesResponse,
                com.oracle.bmc.managementagent.model.ManagementAgentImageSummary>(
                new com.google.common.base.Supplier<ListManagementAgentImagesRequest.Builder>() {
                    @Override
                    public ListManagementAgentImagesRequest.Builder get() {
                        return ListManagementAgentImagesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListManagementAgentImagesResponse, String>() {
                    @Override
                    public String apply(ListManagementAgentImagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagementAgentImagesRequest.Builder>,
                        ListManagementAgentImagesRequest>() {
                    @Override
                    public ListManagementAgentImagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagementAgentImagesRequest.Builder>
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
                        ListManagementAgentImagesRequest, ListManagementAgentImagesResponse>() {
                    @Override
                    public ListManagementAgentImagesResponse apply(
                            ListManagementAgentImagesRequest request) {
                        return client.listManagementAgentImages(request);
                    }
                },
                new com.google.common.base.Function<
                        ListManagementAgentImagesResponse,
                        java.util.List<
                                com.oracle.bmc.managementagent.model
                                        .ManagementAgentImageSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.managementagent.model
                                            .ManagementAgentImageSummary>
                            apply(ListManagementAgentImagesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listManagementAgentInstallKeys operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListManagementAgentInstallKeysResponse>
            listManagementAgentInstallKeysResponseIterator(
                    final ListManagementAgentInstallKeysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagementAgentInstallKeysRequest.Builder,
                ListManagementAgentInstallKeysRequest, ListManagementAgentInstallKeysResponse>(
                new com.google.common.base.Supplier<
                        ListManagementAgentInstallKeysRequest.Builder>() {
                    @Override
                    public ListManagementAgentInstallKeysRequest.Builder get() {
                        return ListManagementAgentInstallKeysRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListManagementAgentInstallKeysResponse, String>() {
                    @Override
                    public String apply(ListManagementAgentInstallKeysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagementAgentInstallKeysRequest.Builder>,
                        ListManagementAgentInstallKeysRequest>() {
                    @Override
                    public ListManagementAgentInstallKeysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagementAgentInstallKeysRequest.Builder>
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
                        ListManagementAgentInstallKeysRequest,
                        ListManagementAgentInstallKeysResponse>() {
                    @Override
                    public ListManagementAgentInstallKeysResponse apply(
                            ListManagementAgentInstallKeysRequest request) {
                        return client.listManagementAgentInstallKeys(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.managementagent.model.ManagementAgentInstallKeySummary} objects
     * contained in responses from the listManagementAgentInstallKeys operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.managementagent.model.ManagementAgentInstallKeySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.managementagent.model.ManagementAgentInstallKeySummary>
            listManagementAgentInstallKeysRecordIterator(
                    final ListManagementAgentInstallKeysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagementAgentInstallKeysRequest.Builder,
                ListManagementAgentInstallKeysRequest, ListManagementAgentInstallKeysResponse,
                com.oracle.bmc.managementagent.model.ManagementAgentInstallKeySummary>(
                new com.google.common.base.Supplier<
                        ListManagementAgentInstallKeysRequest.Builder>() {
                    @Override
                    public ListManagementAgentInstallKeysRequest.Builder get() {
                        return ListManagementAgentInstallKeysRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListManagementAgentInstallKeysResponse, String>() {
                    @Override
                    public String apply(ListManagementAgentInstallKeysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagementAgentInstallKeysRequest.Builder>,
                        ListManagementAgentInstallKeysRequest>() {
                    @Override
                    public ListManagementAgentInstallKeysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagementAgentInstallKeysRequest.Builder>
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
                        ListManagementAgentInstallKeysRequest,
                        ListManagementAgentInstallKeysResponse>() {
                    @Override
                    public ListManagementAgentInstallKeysResponse apply(
                            ListManagementAgentInstallKeysRequest request) {
                        return client.listManagementAgentInstallKeys(request);
                    }
                },
                new com.google.common.base.Function<
                        ListManagementAgentInstallKeysResponse,
                        java.util.List<
                                com.oracle.bmc.managementagent.model
                                        .ManagementAgentInstallKeySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.managementagent.model
                                            .ManagementAgentInstallKeySummary>
                            apply(ListManagementAgentInstallKeysResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listManagementAgentPlugins operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListManagementAgentPluginsResponse> listManagementAgentPluginsResponseIterator(
            final ListManagementAgentPluginsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagementAgentPluginsRequest.Builder, ListManagementAgentPluginsRequest,
                ListManagementAgentPluginsResponse>(
                new com.google.common.base.Supplier<ListManagementAgentPluginsRequest.Builder>() {
                    @Override
                    public ListManagementAgentPluginsRequest.Builder get() {
                        return ListManagementAgentPluginsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListManagementAgentPluginsResponse, String>() {
                    @Override
                    public String apply(ListManagementAgentPluginsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagementAgentPluginsRequest.Builder>,
                        ListManagementAgentPluginsRequest>() {
                    @Override
                    public ListManagementAgentPluginsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagementAgentPluginsRequest.Builder>
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
                        ListManagementAgentPluginsRequest, ListManagementAgentPluginsResponse>() {
                    @Override
                    public ListManagementAgentPluginsResponse apply(
                            ListManagementAgentPluginsRequest request) {
                        return client.listManagementAgentPlugins(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.managementagent.model.ManagementAgentPluginSummary} objects
     * contained in responses from the listManagementAgentPlugins operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.managementagent.model.ManagementAgentPluginSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.managementagent.model.ManagementAgentPluginSummary>
            listManagementAgentPluginsRecordIterator(
                    final ListManagementAgentPluginsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagementAgentPluginsRequest.Builder, ListManagementAgentPluginsRequest,
                ListManagementAgentPluginsResponse,
                com.oracle.bmc.managementagent.model.ManagementAgentPluginSummary>(
                new com.google.common.base.Supplier<ListManagementAgentPluginsRequest.Builder>() {
                    @Override
                    public ListManagementAgentPluginsRequest.Builder get() {
                        return ListManagementAgentPluginsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListManagementAgentPluginsResponse, String>() {
                    @Override
                    public String apply(ListManagementAgentPluginsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagementAgentPluginsRequest.Builder>,
                        ListManagementAgentPluginsRequest>() {
                    @Override
                    public ListManagementAgentPluginsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagementAgentPluginsRequest.Builder>
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
                        ListManagementAgentPluginsRequest, ListManagementAgentPluginsResponse>() {
                    @Override
                    public ListManagementAgentPluginsResponse apply(
                            ListManagementAgentPluginsRequest request) {
                        return client.listManagementAgentPlugins(request);
                    }
                },
                new com.google.common.base.Function<
                        ListManagementAgentPluginsResponse,
                        java.util.List<
                                com.oracle.bmc.managementagent.model
                                        .ManagementAgentPluginSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.managementagent.model
                                            .ManagementAgentPluginSummary>
                            apply(ListManagementAgentPluginsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listManagementAgents operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListManagementAgentsResponse> listManagementAgentsResponseIterator(
            final ListManagementAgentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagementAgentsRequest.Builder, ListManagementAgentsRequest,
                ListManagementAgentsResponse>(
                new com.google.common.base.Supplier<ListManagementAgentsRequest.Builder>() {
                    @Override
                    public ListManagementAgentsRequest.Builder get() {
                        return ListManagementAgentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListManagementAgentsResponse, String>() {
                    @Override
                    public String apply(ListManagementAgentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagementAgentsRequest.Builder>,
                        ListManagementAgentsRequest>() {
                    @Override
                    public ListManagementAgentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagementAgentsRequest.Builder>
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
                        ListManagementAgentsRequest, ListManagementAgentsResponse>() {
                    @Override
                    public ListManagementAgentsResponse apply(ListManagementAgentsRequest request) {
                        return client.listManagementAgents(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.managementagent.model.ManagementAgentSummary} objects
     * contained in responses from the listManagementAgents operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.managementagent.model.ManagementAgentSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.managementagent.model.ManagementAgentSummary>
            listManagementAgentsRecordIterator(final ListManagementAgentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagementAgentsRequest.Builder, ListManagementAgentsRequest,
                ListManagementAgentsResponse,
                com.oracle.bmc.managementagent.model.ManagementAgentSummary>(
                new com.google.common.base.Supplier<ListManagementAgentsRequest.Builder>() {
                    @Override
                    public ListManagementAgentsRequest.Builder get() {
                        return ListManagementAgentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListManagementAgentsResponse, String>() {
                    @Override
                    public String apply(ListManagementAgentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagementAgentsRequest.Builder>,
                        ListManagementAgentsRequest>() {
                    @Override
                    public ListManagementAgentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagementAgentsRequest.Builder>
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
                        ListManagementAgentsRequest, ListManagementAgentsResponse>() {
                    @Override
                    public ListManagementAgentsResponse apply(ListManagementAgentsRequest request) {
                        return client.listManagementAgents(request);
                    }
                },
                new com.google.common.base.Function<
                        ListManagementAgentsResponse,
                        java.util.List<
                                com.oracle.bmc.managementagent.model.ManagementAgentSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.managementagent.model.ManagementAgentSummary>
                            apply(ListManagementAgentsResponse response) {
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
                new com.google.common.base.Supplier<ListWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListWorkRequestErrorsRequest.Builder get() {
                        return ListWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
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
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>() {
                    @Override
                    public ListWorkRequestErrorsResponse apply(
                            ListWorkRequestErrorsRequest request) {
                        return client.listWorkRequestErrors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.managementagent.model.WorkRequestError} objects
     * contained in responses from the listWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.managementagent.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.managementagent.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.managementagent.model.WorkRequestError>(
                new com.google.common.base.Supplier<ListWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListWorkRequestErrorsRequest.Builder get() {
                        return ListWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
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
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>() {
                    @Override
                    public ListWorkRequestErrorsResponse apply(
                            ListWorkRequestErrorsRequest request) {
                        return client.listWorkRequestErrors(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestErrorsResponse,
                        java.util.List<com.oracle.bmc.managementagent.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.managementagent.model.WorkRequestError>
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
                new com.google.common.base.Supplier<ListWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListWorkRequestLogsRequest.Builder get() {
                        return ListWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
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
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>() {
                    @Override
                    public ListWorkRequestLogsResponse apply(ListWorkRequestLogsRequest request) {
                        return client.listWorkRequestLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.managementagent.model.WorkRequestLogEntry} objects
     * contained in responses from the listWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.managementagent.model.WorkRequestLogEntry} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.managementagent.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.managementagent.model.WorkRequestLogEntry>(
                new com.google.common.base.Supplier<ListWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListWorkRequestLogsRequest.Builder get() {
                        return ListWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
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
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>() {
                    @Override
                    public ListWorkRequestLogsResponse apply(ListWorkRequestLogsRequest request) {
                        return client.listWorkRequestLogs(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestLogsResponse,
                        java.util.List<
                                com.oracle.bmc.managementagent.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.managementagent.model.WorkRequestLogEntry>
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
                new com.google.common.base.Supplier<ListWorkRequestsRequest.Builder>() {
                    @Override
                    public ListWorkRequestsRequest.Builder get() {
                        return ListWorkRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
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
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestsRequest, ListWorkRequestsResponse>() {
                    @Override
                    public ListWorkRequestsResponse apply(ListWorkRequestsRequest request) {
                        return client.listWorkRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.managementagent.model.WorkRequestSummary} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.managementagent.model.WorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.managementagent.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.managementagent.model.WorkRequestSummary>(
                new com.google.common.base.Supplier<ListWorkRequestsRequest.Builder>() {
                    @Override
                    public ListWorkRequestsRequest.Builder get() {
                        return ListWorkRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
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
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestsRequest, ListWorkRequestsResponse>() {
                    @Override
                    public ListWorkRequestsResponse apply(ListWorkRequestsRequest request) {
                        return client.listWorkRequests(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestsResponse,
                        java.util.List<com.oracle.bmc.managementagent.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.managementagent.model.WorkRequestSummary>
                            apply(ListWorkRequestsResponse response) {
                        return response.getItems();
                    }
                });
    }
}
