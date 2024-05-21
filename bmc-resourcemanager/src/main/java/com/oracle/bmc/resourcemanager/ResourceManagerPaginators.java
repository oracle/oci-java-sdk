/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager;

import com.oracle.bmc.resourcemanager.requests.*;
import com.oracle.bmc.resourcemanager.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of ResourceManager where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
public class ResourceManagerPaginators {
    private final ResourceManager client;

    public ResourceManagerPaginators(ResourceManager client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the getJobLogs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<GetJobLogsResponse> getJobLogsResponseIterator(
            final GetJobLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                GetJobLogsRequest.Builder, GetJobLogsRequest, GetJobLogsResponse>(
                new java.util.function.Supplier<GetJobLogsRequest.Builder>() {
                    @Override
                    public GetJobLogsRequest.Builder get() {
                        return GetJobLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<GetJobLogsResponse, String>() {
                    @Override
                    public String apply(GetJobLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                GetJobLogsRequest.Builder>,
                        GetJobLogsRequest>() {
                    @Override
                    public GetJobLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            GetJobLogsRequest.Builder>
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
                new java.util.function.Function<GetJobLogsRequest, GetJobLogsResponse>() {
                    @Override
                    public GetJobLogsResponse apply(GetJobLogsRequest request) {
                        return client.getJobLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.resourcemanager.model.LogEntry} objects
     * contained in responses from the getJobLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.resourcemanager.model.LogEntry} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.resourcemanager.model.LogEntry> getJobLogsRecordIterator(
            final GetJobLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                GetJobLogsRequest.Builder, GetJobLogsRequest, GetJobLogsResponse,
                com.oracle.bmc.resourcemanager.model.LogEntry>(
                new java.util.function.Supplier<GetJobLogsRequest.Builder>() {
                    @Override
                    public GetJobLogsRequest.Builder get() {
                        return GetJobLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<GetJobLogsResponse, String>() {
                    @Override
                    public String apply(GetJobLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                GetJobLogsRequest.Builder>,
                        GetJobLogsRequest>() {
                    @Override
                    public GetJobLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            GetJobLogsRequest.Builder>
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
                new java.util.function.Function<GetJobLogsRequest, GetJobLogsResponse>() {
                    @Override
                    public GetJobLogsResponse apply(GetJobLogsRequest request) {
                        return client.getJobLogs(request);
                    }
                },
                new java.util.function.Function<
                        GetJobLogsResponse,
                        java.util.List<com.oracle.bmc.resourcemanager.model.LogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.resourcemanager.model.LogEntry> apply(
                            GetJobLogsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listConfigurationSourceProviders operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListConfigurationSourceProvidersResponse>
            listConfigurationSourceProvidersResponseIterator(
                    final ListConfigurationSourceProvidersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListConfigurationSourceProvidersRequest.Builder,
                ListConfigurationSourceProvidersRequest, ListConfigurationSourceProvidersResponse>(
                new java.util.function.Supplier<ListConfigurationSourceProvidersRequest.Builder>() {
                    @Override
                    public ListConfigurationSourceProvidersRequest.Builder get() {
                        return ListConfigurationSourceProvidersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListConfigurationSourceProvidersResponse, String>() {
                    @Override
                    public String apply(ListConfigurationSourceProvidersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConfigurationSourceProvidersRequest.Builder>,
                        ListConfigurationSourceProvidersRequest>() {
                    @Override
                    public ListConfigurationSourceProvidersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConfigurationSourceProvidersRequest.Builder>
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
                        ListConfigurationSourceProvidersRequest,
                        ListConfigurationSourceProvidersResponse>() {
                    @Override
                    public ListConfigurationSourceProvidersResponse apply(
                            ListConfigurationSourceProvidersRequest request) {
                        return client.listConfigurationSourceProviders(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.resourcemanager.model.ConfigurationSourceProviderSummary} objects
     * contained in responses from the listConfigurationSourceProviders operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.resourcemanager.model.ConfigurationSourceProviderSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.resourcemanager.model.ConfigurationSourceProviderSummary>
            listConfigurationSourceProvidersRecordIterator(
                    final ListConfigurationSourceProvidersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListConfigurationSourceProvidersRequest.Builder,
                ListConfigurationSourceProvidersRequest, ListConfigurationSourceProvidersResponse,
                com.oracle.bmc.resourcemanager.model.ConfigurationSourceProviderSummary>(
                new java.util.function.Supplier<ListConfigurationSourceProvidersRequest.Builder>() {
                    @Override
                    public ListConfigurationSourceProvidersRequest.Builder get() {
                        return ListConfigurationSourceProvidersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListConfigurationSourceProvidersResponse, String>() {
                    @Override
                    public String apply(ListConfigurationSourceProvidersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConfigurationSourceProvidersRequest.Builder>,
                        ListConfigurationSourceProvidersRequest>() {
                    @Override
                    public ListConfigurationSourceProvidersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConfigurationSourceProvidersRequest.Builder>
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
                        ListConfigurationSourceProvidersRequest,
                        ListConfigurationSourceProvidersResponse>() {
                    @Override
                    public ListConfigurationSourceProvidersResponse apply(
                            ListConfigurationSourceProvidersRequest request) {
                        return client.listConfigurationSourceProviders(request);
                    }
                },
                new java.util.function.Function<
                        ListConfigurationSourceProvidersResponse,
                        java.util.List<
                                com.oracle.bmc.resourcemanager.model
                                        .ConfigurationSourceProviderSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.resourcemanager.model
                                            .ConfigurationSourceProviderSummary>
                            apply(ListConfigurationSourceProvidersResponse response) {
                        return response.getConfigurationSourceProviderCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listJobAssociatedResources operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListJobAssociatedResourcesResponse> listJobAssociatedResourcesResponseIterator(
            final ListJobAssociatedResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListJobAssociatedResourcesRequest.Builder, ListJobAssociatedResourcesRequest,
                ListJobAssociatedResourcesResponse>(
                new java.util.function.Supplier<ListJobAssociatedResourcesRequest.Builder>() {
                    @Override
                    public ListJobAssociatedResourcesRequest.Builder get() {
                        return ListJobAssociatedResourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJobAssociatedResourcesResponse, String>() {
                    @Override
                    public String apply(ListJobAssociatedResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobAssociatedResourcesRequest.Builder>,
                        ListJobAssociatedResourcesRequest>() {
                    @Override
                    public ListJobAssociatedResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobAssociatedResourcesRequest.Builder>
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
                        ListJobAssociatedResourcesRequest, ListJobAssociatedResourcesResponse>() {
                    @Override
                    public ListJobAssociatedResourcesResponse apply(
                            ListJobAssociatedResourcesRequest request) {
                        return client.listJobAssociatedResources(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.resourcemanager.model.AssociatedResourceSummary} objects
     * contained in responses from the listJobAssociatedResources operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.resourcemanager.model.AssociatedResourceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.resourcemanager.model.AssociatedResourceSummary>
            listJobAssociatedResourcesRecordIterator(
                    final ListJobAssociatedResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJobAssociatedResourcesRequest.Builder, ListJobAssociatedResourcesRequest,
                ListJobAssociatedResourcesResponse,
                com.oracle.bmc.resourcemanager.model.AssociatedResourceSummary>(
                new java.util.function.Supplier<ListJobAssociatedResourcesRequest.Builder>() {
                    @Override
                    public ListJobAssociatedResourcesRequest.Builder get() {
                        return ListJobAssociatedResourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJobAssociatedResourcesResponse, String>() {
                    @Override
                    public String apply(ListJobAssociatedResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobAssociatedResourcesRequest.Builder>,
                        ListJobAssociatedResourcesRequest>() {
                    @Override
                    public ListJobAssociatedResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobAssociatedResourcesRequest.Builder>
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
                        ListJobAssociatedResourcesRequest, ListJobAssociatedResourcesResponse>() {
                    @Override
                    public ListJobAssociatedResourcesResponse apply(
                            ListJobAssociatedResourcesRequest request) {
                        return client.listJobAssociatedResources(request);
                    }
                },
                new java.util.function.Function<
                        ListJobAssociatedResourcesResponse,
                        java.util.List<
                                com.oracle.bmc.resourcemanager.model.AssociatedResourceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.resourcemanager.model.AssociatedResourceSummary>
                            apply(ListJobAssociatedResourcesResponse response) {
                        return response.getAssociatedResourcesCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listJobOutputs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListJobOutputsResponse> listJobOutputsResponseIterator(
            final ListJobOutputsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListJobOutputsRequest.Builder, ListJobOutputsRequest, ListJobOutputsResponse>(
                new java.util.function.Supplier<ListJobOutputsRequest.Builder>() {
                    @Override
                    public ListJobOutputsRequest.Builder get() {
                        return ListJobOutputsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJobOutputsResponse, String>() {
                    @Override
                    public String apply(ListJobOutputsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobOutputsRequest.Builder>,
                        ListJobOutputsRequest>() {
                    @Override
                    public ListJobOutputsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobOutputsRequest.Builder>
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
                new java.util.function.Function<ListJobOutputsRequest, ListJobOutputsResponse>() {
                    @Override
                    public ListJobOutputsResponse apply(ListJobOutputsRequest request) {
                        return client.listJobOutputs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.resourcemanager.model.JobOutputSummary} objects
     * contained in responses from the listJobOutputs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.resourcemanager.model.JobOutputSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.resourcemanager.model.JobOutputSummary>
            listJobOutputsRecordIterator(final ListJobOutputsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJobOutputsRequest.Builder, ListJobOutputsRequest, ListJobOutputsResponse,
                com.oracle.bmc.resourcemanager.model.JobOutputSummary>(
                new java.util.function.Supplier<ListJobOutputsRequest.Builder>() {
                    @Override
                    public ListJobOutputsRequest.Builder get() {
                        return ListJobOutputsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJobOutputsResponse, String>() {
                    @Override
                    public String apply(ListJobOutputsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobOutputsRequest.Builder>,
                        ListJobOutputsRequest>() {
                    @Override
                    public ListJobOutputsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobOutputsRequest.Builder>
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
                new java.util.function.Function<ListJobOutputsRequest, ListJobOutputsResponse>() {
                    @Override
                    public ListJobOutputsResponse apply(ListJobOutputsRequest request) {
                        return client.listJobOutputs(request);
                    }
                },
                new java.util.function.Function<
                        ListJobOutputsResponse,
                        java.util.List<com.oracle.bmc.resourcemanager.model.JobOutputSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.resourcemanager.model.JobOutputSummary>
                            apply(ListJobOutputsResponse response) {
                        return response.getJobOutputsCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listJobs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListJobsResponse> listJobsResponseIterator(final ListJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListJobsRequest.Builder, ListJobsRequest, ListJobsResponse>(
                new java.util.function.Supplier<ListJobsRequest.Builder>() {
                    @Override
                    public ListJobsRequest.Builder get() {
                        return ListJobsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJobsResponse, String>() {
                    @Override
                    public String apply(ListJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobsRequest.Builder>,
                        ListJobsRequest>() {
                    @Override
                    public ListJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobsRequest.Builder>
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
                new java.util.function.Function<ListJobsRequest, ListJobsResponse>() {
                    @Override
                    public ListJobsResponse apply(ListJobsRequest request) {
                        return client.listJobs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.resourcemanager.model.JobSummary} objects
     * contained in responses from the listJobs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.resourcemanager.model.JobSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.resourcemanager.model.JobSummary> listJobsRecordIterator(
            final ListJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJobsRequest.Builder, ListJobsRequest, ListJobsResponse,
                com.oracle.bmc.resourcemanager.model.JobSummary>(
                new java.util.function.Supplier<ListJobsRequest.Builder>() {
                    @Override
                    public ListJobsRequest.Builder get() {
                        return ListJobsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJobsResponse, String>() {
                    @Override
                    public String apply(ListJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJobsRequest.Builder>,
                        ListJobsRequest>() {
                    @Override
                    public ListJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJobsRequest.Builder>
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
                new java.util.function.Function<ListJobsRequest, ListJobsResponse>() {
                    @Override
                    public ListJobsResponse apply(ListJobsRequest request) {
                        return client.listJobs(request);
                    }
                },
                new java.util.function.Function<
                        ListJobsResponse,
                        java.util.List<com.oracle.bmc.resourcemanager.model.JobSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.resourcemanager.model.JobSummary> apply(
                            ListJobsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listPrivateEndpoints operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListPrivateEndpointsResponse> listPrivateEndpointsResponseIterator(
            final ListPrivateEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPrivateEndpointsRequest.Builder, ListPrivateEndpointsRequest,
                ListPrivateEndpointsResponse>(
                new java.util.function.Supplier<ListPrivateEndpointsRequest.Builder>() {
                    @Override
                    public ListPrivateEndpointsRequest.Builder get() {
                        return ListPrivateEndpointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPrivateEndpointsResponse, String>() {
                    @Override
                    public String apply(ListPrivateEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPrivateEndpointsRequest.Builder>,
                        ListPrivateEndpointsRequest>() {
                    @Override
                    public ListPrivateEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPrivateEndpointsRequest.Builder>
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
                        ListPrivateEndpointsRequest, ListPrivateEndpointsResponse>() {
                    @Override
                    public ListPrivateEndpointsResponse apply(ListPrivateEndpointsRequest request) {
                        return client.listPrivateEndpoints(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.resourcemanager.model.PrivateEndpointSummary} objects
     * contained in responses from the listPrivateEndpoints operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.resourcemanager.model.PrivateEndpointSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.resourcemanager.model.PrivateEndpointSummary>
            listPrivateEndpointsRecordIterator(final ListPrivateEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPrivateEndpointsRequest.Builder, ListPrivateEndpointsRequest,
                ListPrivateEndpointsResponse,
                com.oracle.bmc.resourcemanager.model.PrivateEndpointSummary>(
                new java.util.function.Supplier<ListPrivateEndpointsRequest.Builder>() {
                    @Override
                    public ListPrivateEndpointsRequest.Builder get() {
                        return ListPrivateEndpointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPrivateEndpointsResponse, String>() {
                    @Override
                    public String apply(ListPrivateEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPrivateEndpointsRequest.Builder>,
                        ListPrivateEndpointsRequest>() {
                    @Override
                    public ListPrivateEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPrivateEndpointsRequest.Builder>
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
                        ListPrivateEndpointsRequest, ListPrivateEndpointsResponse>() {
                    @Override
                    public ListPrivateEndpointsResponse apply(ListPrivateEndpointsRequest request) {
                        return client.listPrivateEndpoints(request);
                    }
                },
                new java.util.function.Function<
                        ListPrivateEndpointsResponse,
                        java.util.List<
                                com.oracle.bmc.resourcemanager.model.PrivateEndpointSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.resourcemanager.model.PrivateEndpointSummary>
                            apply(ListPrivateEndpointsResponse response) {
                        return response.getPrivateEndpointCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listStackAssociatedResources operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListStackAssociatedResourcesResponse>
            listStackAssociatedResourcesResponseIterator(
                    final ListStackAssociatedResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListStackAssociatedResourcesRequest.Builder, ListStackAssociatedResourcesRequest,
                ListStackAssociatedResourcesResponse>(
                new java.util.function.Supplier<ListStackAssociatedResourcesRequest.Builder>() {
                    @Override
                    public ListStackAssociatedResourcesRequest.Builder get() {
                        return ListStackAssociatedResourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListStackAssociatedResourcesResponse, String>() {
                    @Override
                    public String apply(ListStackAssociatedResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStackAssociatedResourcesRequest.Builder>,
                        ListStackAssociatedResourcesRequest>() {
                    @Override
                    public ListStackAssociatedResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStackAssociatedResourcesRequest.Builder>
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
                        ListStackAssociatedResourcesRequest,
                        ListStackAssociatedResourcesResponse>() {
                    @Override
                    public ListStackAssociatedResourcesResponse apply(
                            ListStackAssociatedResourcesRequest request) {
                        return client.listStackAssociatedResources(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.resourcemanager.model.AssociatedResourceSummary} objects
     * contained in responses from the listStackAssociatedResources operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.resourcemanager.model.AssociatedResourceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.resourcemanager.model.AssociatedResourceSummary>
            listStackAssociatedResourcesRecordIterator(
                    final ListStackAssociatedResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListStackAssociatedResourcesRequest.Builder, ListStackAssociatedResourcesRequest,
                ListStackAssociatedResourcesResponse,
                com.oracle.bmc.resourcemanager.model.AssociatedResourceSummary>(
                new java.util.function.Supplier<ListStackAssociatedResourcesRequest.Builder>() {
                    @Override
                    public ListStackAssociatedResourcesRequest.Builder get() {
                        return ListStackAssociatedResourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListStackAssociatedResourcesResponse, String>() {
                    @Override
                    public String apply(ListStackAssociatedResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStackAssociatedResourcesRequest.Builder>,
                        ListStackAssociatedResourcesRequest>() {
                    @Override
                    public ListStackAssociatedResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStackAssociatedResourcesRequest.Builder>
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
                        ListStackAssociatedResourcesRequest,
                        ListStackAssociatedResourcesResponse>() {
                    @Override
                    public ListStackAssociatedResourcesResponse apply(
                            ListStackAssociatedResourcesRequest request) {
                        return client.listStackAssociatedResources(request);
                    }
                },
                new java.util.function.Function<
                        ListStackAssociatedResourcesResponse,
                        java.util.List<
                                com.oracle.bmc.resourcemanager.model.AssociatedResourceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.resourcemanager.model.AssociatedResourceSummary>
                            apply(ListStackAssociatedResourcesResponse response) {
                        return response.getAssociatedResourcesCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listStackResourceDriftDetails operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListStackResourceDriftDetailsResponse>
            listStackResourceDriftDetailsResponseIterator(
                    final ListStackResourceDriftDetailsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListStackResourceDriftDetailsRequest.Builder, ListStackResourceDriftDetailsRequest,
                ListStackResourceDriftDetailsResponse>(
                new java.util.function.Supplier<ListStackResourceDriftDetailsRequest.Builder>() {
                    @Override
                    public ListStackResourceDriftDetailsRequest.Builder get() {
                        return ListStackResourceDriftDetailsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListStackResourceDriftDetailsResponse, String>() {
                    @Override
                    public String apply(ListStackResourceDriftDetailsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStackResourceDriftDetailsRequest.Builder>,
                        ListStackResourceDriftDetailsRequest>() {
                    @Override
                    public ListStackResourceDriftDetailsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStackResourceDriftDetailsRequest.Builder>
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
                        ListStackResourceDriftDetailsRequest,
                        ListStackResourceDriftDetailsResponse>() {
                    @Override
                    public ListStackResourceDriftDetailsResponse apply(
                            ListStackResourceDriftDetailsRequest request) {
                        return client.listStackResourceDriftDetails(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.resourcemanager.model.StackResourceDriftSummary} objects
     * contained in responses from the listStackResourceDriftDetails operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.resourcemanager.model.StackResourceDriftSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.resourcemanager.model.StackResourceDriftSummary>
            listStackResourceDriftDetailsRecordIterator(
                    final ListStackResourceDriftDetailsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListStackResourceDriftDetailsRequest.Builder, ListStackResourceDriftDetailsRequest,
                ListStackResourceDriftDetailsResponse,
                com.oracle.bmc.resourcemanager.model.StackResourceDriftSummary>(
                new java.util.function.Supplier<ListStackResourceDriftDetailsRequest.Builder>() {
                    @Override
                    public ListStackResourceDriftDetailsRequest.Builder get() {
                        return ListStackResourceDriftDetailsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListStackResourceDriftDetailsResponse, String>() {
                    @Override
                    public String apply(ListStackResourceDriftDetailsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStackResourceDriftDetailsRequest.Builder>,
                        ListStackResourceDriftDetailsRequest>() {
                    @Override
                    public ListStackResourceDriftDetailsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStackResourceDriftDetailsRequest.Builder>
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
                        ListStackResourceDriftDetailsRequest,
                        ListStackResourceDriftDetailsResponse>() {
                    @Override
                    public ListStackResourceDriftDetailsResponse apply(
                            ListStackResourceDriftDetailsRequest request) {
                        return client.listStackResourceDriftDetails(request);
                    }
                },
                new java.util.function.Function<
                        ListStackResourceDriftDetailsResponse,
                        java.util.List<
                                com.oracle.bmc.resourcemanager.model.StackResourceDriftSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.resourcemanager.model.StackResourceDriftSummary>
                            apply(ListStackResourceDriftDetailsResponse response) {
                        return response.getStackResourceDriftCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listStacks operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListStacksResponse> listStacksResponseIterator(
            final ListStacksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListStacksRequest.Builder, ListStacksRequest, ListStacksResponse>(
                new java.util.function.Supplier<ListStacksRequest.Builder>() {
                    @Override
                    public ListStacksRequest.Builder get() {
                        return ListStacksRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListStacksResponse, String>() {
                    @Override
                    public String apply(ListStacksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStacksRequest.Builder>,
                        ListStacksRequest>() {
                    @Override
                    public ListStacksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStacksRequest.Builder>
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
                new java.util.function.Function<ListStacksRequest, ListStacksResponse>() {
                    @Override
                    public ListStacksResponse apply(ListStacksRequest request) {
                        return client.listStacks(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.resourcemanager.model.StackSummary} objects
     * contained in responses from the listStacks operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.resourcemanager.model.StackSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.resourcemanager.model.StackSummary> listStacksRecordIterator(
            final ListStacksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListStacksRequest.Builder, ListStacksRequest, ListStacksResponse,
                com.oracle.bmc.resourcemanager.model.StackSummary>(
                new java.util.function.Supplier<ListStacksRequest.Builder>() {
                    @Override
                    public ListStacksRequest.Builder get() {
                        return ListStacksRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListStacksResponse, String>() {
                    @Override
                    public String apply(ListStacksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStacksRequest.Builder>,
                        ListStacksRequest>() {
                    @Override
                    public ListStacksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStacksRequest.Builder>
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
                new java.util.function.Function<ListStacksRequest, ListStacksResponse>() {
                    @Override
                    public ListStacksResponse apply(ListStacksRequest request) {
                        return client.listStacks(request);
                    }
                },
                new java.util.function.Function<
                        ListStacksResponse,
                        java.util.List<com.oracle.bmc.resourcemanager.model.StackSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.resourcemanager.model.StackSummary> apply(
                            ListStacksResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTemplates operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTemplatesResponse> listTemplatesResponseIterator(
            final ListTemplatesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTemplatesRequest.Builder, ListTemplatesRequest, ListTemplatesResponse>(
                new java.util.function.Supplier<ListTemplatesRequest.Builder>() {
                    @Override
                    public ListTemplatesRequest.Builder get() {
                        return ListTemplatesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTemplatesResponse, String>() {
                    @Override
                    public String apply(ListTemplatesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTemplatesRequest.Builder>,
                        ListTemplatesRequest>() {
                    @Override
                    public ListTemplatesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTemplatesRequest.Builder>
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
                new java.util.function.Function<ListTemplatesRequest, ListTemplatesResponse>() {
                    @Override
                    public ListTemplatesResponse apply(ListTemplatesRequest request) {
                        return client.listTemplates(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.resourcemanager.model.TemplateSummary} objects
     * contained in responses from the listTemplates operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.resourcemanager.model.TemplateSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.resourcemanager.model.TemplateSummary>
            listTemplatesRecordIterator(final ListTemplatesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTemplatesRequest.Builder, ListTemplatesRequest, ListTemplatesResponse,
                com.oracle.bmc.resourcemanager.model.TemplateSummary>(
                new java.util.function.Supplier<ListTemplatesRequest.Builder>() {
                    @Override
                    public ListTemplatesRequest.Builder get() {
                        return ListTemplatesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTemplatesResponse, String>() {
                    @Override
                    public String apply(ListTemplatesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTemplatesRequest.Builder>,
                        ListTemplatesRequest>() {
                    @Override
                    public ListTemplatesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTemplatesRequest.Builder>
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
                new java.util.function.Function<ListTemplatesRequest, ListTemplatesResponse>() {
                    @Override
                    public ListTemplatesResponse apply(ListTemplatesRequest request) {
                        return client.listTemplates(request);
                    }
                },
                new java.util.function.Function<
                        ListTemplatesResponse,
                        java.util.List<com.oracle.bmc.resourcemanager.model.TemplateSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.resourcemanager.model.TemplateSummary>
                            apply(ListTemplatesResponse response) {
                        return response.getTemplateSummaryCollection().getItems();
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.resourcemanager.model.WorkRequestError} objects
     * contained in responses from the listWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.resourcemanager.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.resourcemanager.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.resourcemanager.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.resourcemanager.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.resourcemanager.model.WorkRequestError>
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.resourcemanager.model.WorkRequestLogEntry} objects
     * contained in responses from the listWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.resourcemanager.model.WorkRequestLogEntry} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.resourcemanager.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.resourcemanager.model.WorkRequestLogEntry>(
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
                        java.util.List<
                                com.oracle.bmc.resourcemanager.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.resourcemanager.model.WorkRequestLogEntry>
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.resourcemanager.model.WorkRequestSummary} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.resourcemanager.model.WorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.resourcemanager.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.resourcemanager.model.WorkRequestSummary>(
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
                        java.util.List<com.oracle.bmc.resourcemanager.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.resourcemanager.model.WorkRequestSummary>
                            apply(ListWorkRequestsResponse response) {
                        return response.getItems();
                    }
                });
    }
}
