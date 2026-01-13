/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.iot;

import com.oracle.bmc.iot.requests.*;
import com.oracle.bmc.iot.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Iot where multiple pages of data may be fetched. Two styles of
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250531")
public class IotPaginators {
    private final Iot client;

    public IotPaginators(Iot client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDigitalTwinAdapters operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDigitalTwinAdaptersResponse> listDigitalTwinAdaptersResponseIterator(
            final ListDigitalTwinAdaptersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDigitalTwinAdaptersRequest.Builder,
                ListDigitalTwinAdaptersRequest,
                ListDigitalTwinAdaptersResponse>(
                new java.util.function.Supplier<ListDigitalTwinAdaptersRequest.Builder>() {
                    @Override
                    public ListDigitalTwinAdaptersRequest.Builder get() {
                        return ListDigitalTwinAdaptersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDigitalTwinAdaptersResponse, String>() {
                    @Override
                    public String apply(ListDigitalTwinAdaptersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDigitalTwinAdaptersRequest.Builder>,
                        ListDigitalTwinAdaptersRequest>() {
                    @Override
                    public ListDigitalTwinAdaptersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDigitalTwinAdaptersRequest.Builder>
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
                        ListDigitalTwinAdaptersRequest, ListDigitalTwinAdaptersResponse>() {
                    @Override
                    public ListDigitalTwinAdaptersResponse apply(
                            ListDigitalTwinAdaptersRequest request) {
                        return client.listDigitalTwinAdapters(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.iot.model.DigitalTwinAdapterSummary} objects contained in responses from the
     * listDigitalTwinAdapters operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.iot.model.DigitalTwinAdapterSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.iot.model.DigitalTwinAdapterSummary>
            listDigitalTwinAdaptersRecordIterator(final ListDigitalTwinAdaptersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDigitalTwinAdaptersRequest.Builder,
                ListDigitalTwinAdaptersRequest,
                ListDigitalTwinAdaptersResponse,
                com.oracle.bmc.iot.model.DigitalTwinAdapterSummary>(
                new java.util.function.Supplier<ListDigitalTwinAdaptersRequest.Builder>() {
                    @Override
                    public ListDigitalTwinAdaptersRequest.Builder get() {
                        return ListDigitalTwinAdaptersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDigitalTwinAdaptersResponse, String>() {
                    @Override
                    public String apply(ListDigitalTwinAdaptersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDigitalTwinAdaptersRequest.Builder>,
                        ListDigitalTwinAdaptersRequest>() {
                    @Override
                    public ListDigitalTwinAdaptersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDigitalTwinAdaptersRequest.Builder>
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
                        ListDigitalTwinAdaptersRequest, ListDigitalTwinAdaptersResponse>() {
                    @Override
                    public ListDigitalTwinAdaptersResponse apply(
                            ListDigitalTwinAdaptersRequest request) {
                        return client.listDigitalTwinAdapters(request);
                    }
                },
                new java.util.function.Function<
                        ListDigitalTwinAdaptersResponse,
                        java.util.List<com.oracle.bmc.iot.model.DigitalTwinAdapterSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.iot.model.DigitalTwinAdapterSummary> apply(
                            ListDigitalTwinAdaptersResponse response) {
                        return response.getDigitalTwinAdapterCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDigitalTwinInstances operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDigitalTwinInstancesResponse> listDigitalTwinInstancesResponseIterator(
            final ListDigitalTwinInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDigitalTwinInstancesRequest.Builder,
                ListDigitalTwinInstancesRequest,
                ListDigitalTwinInstancesResponse>(
                new java.util.function.Supplier<ListDigitalTwinInstancesRequest.Builder>() {
                    @Override
                    public ListDigitalTwinInstancesRequest.Builder get() {
                        return ListDigitalTwinInstancesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDigitalTwinInstancesResponse, String>() {
                    @Override
                    public String apply(ListDigitalTwinInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDigitalTwinInstancesRequest.Builder>,
                        ListDigitalTwinInstancesRequest>() {
                    @Override
                    public ListDigitalTwinInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDigitalTwinInstancesRequest.Builder>
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
                        ListDigitalTwinInstancesRequest, ListDigitalTwinInstancesResponse>() {
                    @Override
                    public ListDigitalTwinInstancesResponse apply(
                            ListDigitalTwinInstancesRequest request) {
                        return client.listDigitalTwinInstances(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.iot.model.DigitalTwinInstanceSummary} objects contained in responses from the
     * listDigitalTwinInstances operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.iot.model.DigitalTwinInstanceSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.iot.model.DigitalTwinInstanceSummary>
            listDigitalTwinInstancesRecordIterator(final ListDigitalTwinInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDigitalTwinInstancesRequest.Builder,
                ListDigitalTwinInstancesRequest,
                ListDigitalTwinInstancesResponse,
                com.oracle.bmc.iot.model.DigitalTwinInstanceSummary>(
                new java.util.function.Supplier<ListDigitalTwinInstancesRequest.Builder>() {
                    @Override
                    public ListDigitalTwinInstancesRequest.Builder get() {
                        return ListDigitalTwinInstancesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDigitalTwinInstancesResponse, String>() {
                    @Override
                    public String apply(ListDigitalTwinInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDigitalTwinInstancesRequest.Builder>,
                        ListDigitalTwinInstancesRequest>() {
                    @Override
                    public ListDigitalTwinInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDigitalTwinInstancesRequest.Builder>
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
                        ListDigitalTwinInstancesRequest, ListDigitalTwinInstancesResponse>() {
                    @Override
                    public ListDigitalTwinInstancesResponse apply(
                            ListDigitalTwinInstancesRequest request) {
                        return client.listDigitalTwinInstances(request);
                    }
                },
                new java.util.function.Function<
                        ListDigitalTwinInstancesResponse,
                        java.util.List<com.oracle.bmc.iot.model.DigitalTwinInstanceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.iot.model.DigitalTwinInstanceSummary>
                            apply(ListDigitalTwinInstancesResponse response) {
                        return response.getDigitalTwinInstanceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDigitalTwinModels operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDigitalTwinModelsResponse> listDigitalTwinModelsResponseIterator(
            final ListDigitalTwinModelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDigitalTwinModelsRequest.Builder,
                ListDigitalTwinModelsRequest,
                ListDigitalTwinModelsResponse>(
                new java.util.function.Supplier<ListDigitalTwinModelsRequest.Builder>() {
                    @Override
                    public ListDigitalTwinModelsRequest.Builder get() {
                        return ListDigitalTwinModelsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDigitalTwinModelsResponse, String>() {
                    @Override
                    public String apply(ListDigitalTwinModelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDigitalTwinModelsRequest.Builder>,
                        ListDigitalTwinModelsRequest>() {
                    @Override
                    public ListDigitalTwinModelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDigitalTwinModelsRequest.Builder>
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
                        ListDigitalTwinModelsRequest, ListDigitalTwinModelsResponse>() {
                    @Override
                    public ListDigitalTwinModelsResponse apply(
                            ListDigitalTwinModelsRequest request) {
                        return client.listDigitalTwinModels(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.iot.model.DigitalTwinModelSummary} objects contained in responses from the
     * listDigitalTwinModels operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.iot.model.DigitalTwinModelSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.iot.model.DigitalTwinModelSummary>
            listDigitalTwinModelsRecordIterator(final ListDigitalTwinModelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDigitalTwinModelsRequest.Builder,
                ListDigitalTwinModelsRequest,
                ListDigitalTwinModelsResponse,
                com.oracle.bmc.iot.model.DigitalTwinModelSummary>(
                new java.util.function.Supplier<ListDigitalTwinModelsRequest.Builder>() {
                    @Override
                    public ListDigitalTwinModelsRequest.Builder get() {
                        return ListDigitalTwinModelsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDigitalTwinModelsResponse, String>() {
                    @Override
                    public String apply(ListDigitalTwinModelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDigitalTwinModelsRequest.Builder>,
                        ListDigitalTwinModelsRequest>() {
                    @Override
                    public ListDigitalTwinModelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDigitalTwinModelsRequest.Builder>
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
                        ListDigitalTwinModelsRequest, ListDigitalTwinModelsResponse>() {
                    @Override
                    public ListDigitalTwinModelsResponse apply(
                            ListDigitalTwinModelsRequest request) {
                        return client.listDigitalTwinModels(request);
                    }
                },
                new java.util.function.Function<
                        ListDigitalTwinModelsResponse,
                        java.util.List<com.oracle.bmc.iot.model.DigitalTwinModelSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.iot.model.DigitalTwinModelSummary> apply(
                            ListDigitalTwinModelsResponse response) {
                        return response.getDigitalTwinModelCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDigitalTwinRelationships operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDigitalTwinRelationshipsResponse>
            listDigitalTwinRelationshipsResponseIterator(
                    final ListDigitalTwinRelationshipsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDigitalTwinRelationshipsRequest.Builder,
                ListDigitalTwinRelationshipsRequest,
                ListDigitalTwinRelationshipsResponse>(
                new java.util.function.Supplier<ListDigitalTwinRelationshipsRequest.Builder>() {
                    @Override
                    public ListDigitalTwinRelationshipsRequest.Builder get() {
                        return ListDigitalTwinRelationshipsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDigitalTwinRelationshipsResponse, String>() {
                    @Override
                    public String apply(ListDigitalTwinRelationshipsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDigitalTwinRelationshipsRequest.Builder>,
                        ListDigitalTwinRelationshipsRequest>() {
                    @Override
                    public ListDigitalTwinRelationshipsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDigitalTwinRelationshipsRequest.Builder>
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
                        ListDigitalTwinRelationshipsRequest,
                        ListDigitalTwinRelationshipsResponse>() {
                    @Override
                    public ListDigitalTwinRelationshipsResponse apply(
                            ListDigitalTwinRelationshipsRequest request) {
                        return client.listDigitalTwinRelationships(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.iot.model.DigitalTwinRelationshipSummary} objects contained in responses from
     * the listDigitalTwinRelationships operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.iot.model.DigitalTwinRelationshipSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.iot.model.DigitalTwinRelationshipSummary>
            listDigitalTwinRelationshipsRecordIterator(
                    final ListDigitalTwinRelationshipsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDigitalTwinRelationshipsRequest.Builder,
                ListDigitalTwinRelationshipsRequest,
                ListDigitalTwinRelationshipsResponse,
                com.oracle.bmc.iot.model.DigitalTwinRelationshipSummary>(
                new java.util.function.Supplier<ListDigitalTwinRelationshipsRequest.Builder>() {
                    @Override
                    public ListDigitalTwinRelationshipsRequest.Builder get() {
                        return ListDigitalTwinRelationshipsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDigitalTwinRelationshipsResponse, String>() {
                    @Override
                    public String apply(ListDigitalTwinRelationshipsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDigitalTwinRelationshipsRequest.Builder>,
                        ListDigitalTwinRelationshipsRequest>() {
                    @Override
                    public ListDigitalTwinRelationshipsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDigitalTwinRelationshipsRequest.Builder>
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
                        ListDigitalTwinRelationshipsRequest,
                        ListDigitalTwinRelationshipsResponse>() {
                    @Override
                    public ListDigitalTwinRelationshipsResponse apply(
                            ListDigitalTwinRelationshipsRequest request) {
                        return client.listDigitalTwinRelationships(request);
                    }
                },
                new java.util.function.Function<
                        ListDigitalTwinRelationshipsResponse,
                        java.util.List<com.oracle.bmc.iot.model.DigitalTwinRelationshipSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.iot.model.DigitalTwinRelationshipSummary>
                            apply(ListDigitalTwinRelationshipsResponse response) {
                        return response.getDigitalTwinRelationshipCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listIotDomainGroups operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListIotDomainGroupsResponse> listIotDomainGroupsResponseIterator(
            final ListIotDomainGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListIotDomainGroupsRequest.Builder,
                ListIotDomainGroupsRequest,
                ListIotDomainGroupsResponse>(
                new java.util.function.Supplier<ListIotDomainGroupsRequest.Builder>() {
                    @Override
                    public ListIotDomainGroupsRequest.Builder get() {
                        return ListIotDomainGroupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListIotDomainGroupsResponse, String>() {
                    @Override
                    public String apply(ListIotDomainGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIotDomainGroupsRequest.Builder>,
                        ListIotDomainGroupsRequest>() {
                    @Override
                    public ListIotDomainGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIotDomainGroupsRequest.Builder>
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
                        ListIotDomainGroupsRequest, ListIotDomainGroupsResponse>() {
                    @Override
                    public ListIotDomainGroupsResponse apply(ListIotDomainGroupsRequest request) {
                        return client.listIotDomainGroups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.iot.model.IotDomainGroupSummary} objects contained in responses from the
     * listIotDomainGroups operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.iot.model.IotDomainGroupSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.iot.model.IotDomainGroupSummary>
            listIotDomainGroupsRecordIterator(final ListIotDomainGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListIotDomainGroupsRequest.Builder,
                ListIotDomainGroupsRequest,
                ListIotDomainGroupsResponse,
                com.oracle.bmc.iot.model.IotDomainGroupSummary>(
                new java.util.function.Supplier<ListIotDomainGroupsRequest.Builder>() {
                    @Override
                    public ListIotDomainGroupsRequest.Builder get() {
                        return ListIotDomainGroupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListIotDomainGroupsResponse, String>() {
                    @Override
                    public String apply(ListIotDomainGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIotDomainGroupsRequest.Builder>,
                        ListIotDomainGroupsRequest>() {
                    @Override
                    public ListIotDomainGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIotDomainGroupsRequest.Builder>
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
                        ListIotDomainGroupsRequest, ListIotDomainGroupsResponse>() {
                    @Override
                    public ListIotDomainGroupsResponse apply(ListIotDomainGroupsRequest request) {
                        return client.listIotDomainGroups(request);
                    }
                },
                new java.util.function.Function<
                        ListIotDomainGroupsResponse,
                        java.util.List<com.oracle.bmc.iot.model.IotDomainGroupSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.iot.model.IotDomainGroupSummary> apply(
                            ListIotDomainGroupsResponse response) {
                        return response.getIotDomainGroupCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listIotDomains
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListIotDomainsResponse> listIotDomainsResponseIterator(
            final ListIotDomainsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListIotDomainsRequest.Builder, ListIotDomainsRequest, ListIotDomainsResponse>(
                new java.util.function.Supplier<ListIotDomainsRequest.Builder>() {
                    @Override
                    public ListIotDomainsRequest.Builder get() {
                        return ListIotDomainsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListIotDomainsResponse, String>() {
                    @Override
                    public String apply(ListIotDomainsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIotDomainsRequest.Builder>,
                        ListIotDomainsRequest>() {
                    @Override
                    public ListIotDomainsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIotDomainsRequest.Builder>
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
                new java.util.function.Function<ListIotDomainsRequest, ListIotDomainsResponse>() {
                    @Override
                    public ListIotDomainsResponse apply(ListIotDomainsRequest request) {
                        return client.listIotDomains(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.iot.model.IotDomainSummary} objects contained in responses from the
     * listIotDomains operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.iot.model.IotDomainSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.iot.model.IotDomainSummary> listIotDomainsRecordIterator(
            final ListIotDomainsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListIotDomainsRequest.Builder,
                ListIotDomainsRequest,
                ListIotDomainsResponse,
                com.oracle.bmc.iot.model.IotDomainSummary>(
                new java.util.function.Supplier<ListIotDomainsRequest.Builder>() {
                    @Override
                    public ListIotDomainsRequest.Builder get() {
                        return ListIotDomainsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListIotDomainsResponse, String>() {
                    @Override
                    public String apply(ListIotDomainsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIotDomainsRequest.Builder>,
                        ListIotDomainsRequest>() {
                    @Override
                    public ListIotDomainsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIotDomainsRequest.Builder>
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
                new java.util.function.Function<ListIotDomainsRequest, ListIotDomainsResponse>() {
                    @Override
                    public ListIotDomainsResponse apply(ListIotDomainsRequest request) {
                        return client.listIotDomains(request);
                    }
                },
                new java.util.function.Function<
                        ListIotDomainsResponse,
                        java.util.List<com.oracle.bmc.iot.model.IotDomainSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.iot.model.IotDomainSummary> apply(
                            ListIotDomainsResponse response) {
                        return response.getIotDomainCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWorkRequestErrorsResponse> listWorkRequestErrorsResponseIterator(
            final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.iot.model.WorkRequestError} objects contained in responses from the
     * listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.iot.model.WorkRequestError} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.iot.model.WorkRequestError> listWorkRequestErrorsRecordIterator(
            final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.iot.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.iot.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.iot.model.WorkRequestError> apply(
                            ListWorkRequestErrorsResponse response) {
                        return response.getWorkRequestErrorCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listWorkRequestLogs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWorkRequestLogsResponse> listWorkRequestLogsResponseIterator(
            final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.iot.model.WorkRequestLogEntry} objects contained in responses from the
     * listWorkRequestLogs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.iot.model.WorkRequestLogEntry} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.iot.model.WorkRequestLogEntry> listWorkRequestLogsRecordIterator(
            final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.iot.model.WorkRequestLogEntry>(
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
                        java.util.List<com.oracle.bmc.iot.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.iot.model.WorkRequestLogEntry> apply(
                            ListWorkRequestLogsResponse response) {
                        return response.getWorkRequestLogEntryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.iot.model.WorkRequestSummary} objects contained in responses from the
     * listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.iot.model.WorkRequestSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.iot.model.WorkRequestSummary> listWorkRequestsRecordIterator(
            final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder,
                ListWorkRequestsRequest,
                ListWorkRequestsResponse,
                com.oracle.bmc.iot.model.WorkRequestSummary>(
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
                        java.util.List<com.oracle.bmc.iot.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.iot.model.WorkRequestSummary> apply(
                            ListWorkRequestsResponse response) {
                        return response.getWorkRequestSummaryCollection().getItems();
                    }
                });
    }
}
