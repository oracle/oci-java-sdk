/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity;

import com.oracle.bmc.identity.requests.*;
import com.oracle.bmc.identity.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Identity where multiple pages of data may be fetched.
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
public class IdentityPaginators {
    private final Identity client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listBulkActionResourceTypes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListBulkActionResourceTypesResponse>
            listBulkActionResourceTypesResponseIterator(
                    final ListBulkActionResourceTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBulkActionResourceTypesRequest.Builder, ListBulkActionResourceTypesRequest,
                ListBulkActionResourceTypesResponse>(
                new com.google.common.base.Supplier<ListBulkActionResourceTypesRequest.Builder>() {
                    @Override
                    public ListBulkActionResourceTypesRequest.Builder get() {
                        return ListBulkActionResourceTypesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListBulkActionResourceTypesResponse, String>() {
                    @Override
                    public String apply(ListBulkActionResourceTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBulkActionResourceTypesRequest.Builder>,
                        ListBulkActionResourceTypesRequest>() {
                    @Override
                    public ListBulkActionResourceTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBulkActionResourceTypesRequest.Builder>
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
                        ListBulkActionResourceTypesRequest, ListBulkActionResourceTypesResponse>() {
                    @Override
                    public ListBulkActionResourceTypesResponse apply(
                            ListBulkActionResourceTypesRequest request) {
                        return client.listBulkActionResourceTypes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.identity.model.BulkActionResourceType} objects
     * contained in responses from the listBulkActionResourceTypes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.identity.model.BulkActionResourceType} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.identity.model.BulkActionResourceType>
            listBulkActionResourceTypesRecordIterator(
                    final ListBulkActionResourceTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBulkActionResourceTypesRequest.Builder, ListBulkActionResourceTypesRequest,
                ListBulkActionResourceTypesResponse,
                com.oracle.bmc.identity.model.BulkActionResourceType>(
                new com.google.common.base.Supplier<ListBulkActionResourceTypesRequest.Builder>() {
                    @Override
                    public ListBulkActionResourceTypesRequest.Builder get() {
                        return ListBulkActionResourceTypesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListBulkActionResourceTypesResponse, String>() {
                    @Override
                    public String apply(ListBulkActionResourceTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBulkActionResourceTypesRequest.Builder>,
                        ListBulkActionResourceTypesRequest>() {
                    @Override
                    public ListBulkActionResourceTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBulkActionResourceTypesRequest.Builder>
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
                        ListBulkActionResourceTypesRequest, ListBulkActionResourceTypesResponse>() {
                    @Override
                    public ListBulkActionResourceTypesResponse apply(
                            ListBulkActionResourceTypesRequest request) {
                        return client.listBulkActionResourceTypes(request);
                    }
                },
                new com.google.common.base.Function<
                        ListBulkActionResourceTypesResponse,
                        java.util.List<com.oracle.bmc.identity.model.BulkActionResourceType>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.identity.model.BulkActionResourceType>
                            apply(ListBulkActionResourceTypesResponse response) {
                        return response.getBulkActionResourceTypeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listBulkEditTagsResourceTypes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListBulkEditTagsResourceTypesResponse>
            listBulkEditTagsResourceTypesResponseIterator(
                    final ListBulkEditTagsResourceTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBulkEditTagsResourceTypesRequest.Builder, ListBulkEditTagsResourceTypesRequest,
                ListBulkEditTagsResourceTypesResponse>(
                new com.google.common.base.Supplier<
                        ListBulkEditTagsResourceTypesRequest.Builder>() {
                    @Override
                    public ListBulkEditTagsResourceTypesRequest.Builder get() {
                        return ListBulkEditTagsResourceTypesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListBulkEditTagsResourceTypesResponse, String>() {
                    @Override
                    public String apply(ListBulkEditTagsResourceTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBulkEditTagsResourceTypesRequest.Builder>,
                        ListBulkEditTagsResourceTypesRequest>() {
                    @Override
                    public ListBulkEditTagsResourceTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBulkEditTagsResourceTypesRequest.Builder>
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
                        ListBulkEditTagsResourceTypesRequest,
                        ListBulkEditTagsResourceTypesResponse>() {
                    @Override
                    public ListBulkEditTagsResourceTypesResponse apply(
                            ListBulkEditTagsResourceTypesRequest request) {
                        return client.listBulkEditTagsResourceTypes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.identity.model.BulkEditTagsResourceType} objects
     * contained in responses from the listBulkEditTagsResourceTypes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.identity.model.BulkEditTagsResourceType} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.identity.model.BulkEditTagsResourceType>
            listBulkEditTagsResourceTypesRecordIterator(
                    final ListBulkEditTagsResourceTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBulkEditTagsResourceTypesRequest.Builder, ListBulkEditTagsResourceTypesRequest,
                ListBulkEditTagsResourceTypesResponse,
                com.oracle.bmc.identity.model.BulkEditTagsResourceType>(
                new com.google.common.base.Supplier<
                        ListBulkEditTagsResourceTypesRequest.Builder>() {
                    @Override
                    public ListBulkEditTagsResourceTypesRequest.Builder get() {
                        return ListBulkEditTagsResourceTypesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListBulkEditTagsResourceTypesResponse, String>() {
                    @Override
                    public String apply(ListBulkEditTagsResourceTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBulkEditTagsResourceTypesRequest.Builder>,
                        ListBulkEditTagsResourceTypesRequest>() {
                    @Override
                    public ListBulkEditTagsResourceTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBulkEditTagsResourceTypesRequest.Builder>
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
                        ListBulkEditTagsResourceTypesRequest,
                        ListBulkEditTagsResourceTypesResponse>() {
                    @Override
                    public ListBulkEditTagsResourceTypesResponse apply(
                            ListBulkEditTagsResourceTypesRequest request) {
                        return client.listBulkEditTagsResourceTypes(request);
                    }
                },
                new com.google.common.base.Function<
                        ListBulkEditTagsResourceTypesResponse,
                        java.util.List<com.oracle.bmc.identity.model.BulkEditTagsResourceType>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.identity.model.BulkEditTagsResourceType>
                            apply(ListBulkEditTagsResourceTypesResponse response) {
                        return response.getBulkEditTagsResourceTypeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listCompartments operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListCompartmentsResponse> listCompartmentsResponseIterator(
            final ListCompartmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCompartmentsRequest.Builder, ListCompartmentsRequest, ListCompartmentsResponse>(
                new com.google.common.base.Supplier<ListCompartmentsRequest.Builder>() {
                    @Override
                    public ListCompartmentsRequest.Builder get() {
                        return ListCompartmentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListCompartmentsResponse, String>() {
                    @Override
                    public String apply(ListCompartmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCompartmentsRequest.Builder>,
                        ListCompartmentsRequest>() {
                    @Override
                    public ListCompartmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCompartmentsRequest.Builder>
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
                        ListCompartmentsRequest, ListCompartmentsResponse>() {
                    @Override
                    public ListCompartmentsResponse apply(ListCompartmentsRequest request) {
                        return client.listCompartments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.identity.model.Compartment} objects
     * contained in responses from the listCompartments operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.identity.model.Compartment} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.identity.model.Compartment> listCompartmentsRecordIterator(
            final ListCompartmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCompartmentsRequest.Builder, ListCompartmentsRequest, ListCompartmentsResponse,
                com.oracle.bmc.identity.model.Compartment>(
                new com.google.common.base.Supplier<ListCompartmentsRequest.Builder>() {
                    @Override
                    public ListCompartmentsRequest.Builder get() {
                        return ListCompartmentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListCompartmentsResponse, String>() {
                    @Override
                    public String apply(ListCompartmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCompartmentsRequest.Builder>,
                        ListCompartmentsRequest>() {
                    @Override
                    public ListCompartmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCompartmentsRequest.Builder>
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
                        ListCompartmentsRequest, ListCompartmentsResponse>() {
                    @Override
                    public ListCompartmentsResponse apply(ListCompartmentsRequest request) {
                        return client.listCompartments(request);
                    }
                },
                new com.google.common.base.Function<
                        ListCompartmentsResponse,
                        java.util.List<com.oracle.bmc.identity.model.Compartment>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.identity.model.Compartment> apply(
                            ListCompartmentsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listCostTrackingTags operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListCostTrackingTagsResponse> listCostTrackingTagsResponseIterator(
            final ListCostTrackingTagsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCostTrackingTagsRequest.Builder, ListCostTrackingTagsRequest,
                ListCostTrackingTagsResponse>(
                new com.google.common.base.Supplier<ListCostTrackingTagsRequest.Builder>() {
                    @Override
                    public ListCostTrackingTagsRequest.Builder get() {
                        return ListCostTrackingTagsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListCostTrackingTagsResponse, String>() {
                    @Override
                    public String apply(ListCostTrackingTagsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCostTrackingTagsRequest.Builder>,
                        ListCostTrackingTagsRequest>() {
                    @Override
                    public ListCostTrackingTagsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCostTrackingTagsRequest.Builder>
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
                        ListCostTrackingTagsRequest, ListCostTrackingTagsResponse>() {
                    @Override
                    public ListCostTrackingTagsResponse apply(ListCostTrackingTagsRequest request) {
                        return client.listCostTrackingTags(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.identity.model.Tag} objects
     * contained in responses from the listCostTrackingTags operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.identity.model.Tag} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.identity.model.Tag> listCostTrackingTagsRecordIterator(
            final ListCostTrackingTagsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCostTrackingTagsRequest.Builder, ListCostTrackingTagsRequest,
                ListCostTrackingTagsResponse, com.oracle.bmc.identity.model.Tag>(
                new com.google.common.base.Supplier<ListCostTrackingTagsRequest.Builder>() {
                    @Override
                    public ListCostTrackingTagsRequest.Builder get() {
                        return ListCostTrackingTagsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListCostTrackingTagsResponse, String>() {
                    @Override
                    public String apply(ListCostTrackingTagsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCostTrackingTagsRequest.Builder>,
                        ListCostTrackingTagsRequest>() {
                    @Override
                    public ListCostTrackingTagsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCostTrackingTagsRequest.Builder>
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
                        ListCostTrackingTagsRequest, ListCostTrackingTagsResponse>() {
                    @Override
                    public ListCostTrackingTagsResponse apply(ListCostTrackingTagsRequest request) {
                        return client.listCostTrackingTags(request);
                    }
                },
                new com.google.common.base.Function<
                        ListCostTrackingTagsResponse,
                        java.util.List<com.oracle.bmc.identity.model.Tag>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.identity.model.Tag> apply(
                            ListCostTrackingTagsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDomains operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDomainsResponse> listDomainsResponseIterator(
            final ListDomainsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDomainsRequest.Builder, ListDomainsRequest, ListDomainsResponse>(
                new com.google.common.base.Supplier<ListDomainsRequest.Builder>() {
                    @Override
                    public ListDomainsRequest.Builder get() {
                        return ListDomainsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDomainsResponse, String>() {
                    @Override
                    public String apply(ListDomainsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDomainsRequest.Builder>,
                        ListDomainsRequest>() {
                    @Override
                    public ListDomainsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDomainsRequest.Builder>
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
                new com.google.common.base.Function<ListDomainsRequest, ListDomainsResponse>() {
                    @Override
                    public ListDomainsResponse apply(ListDomainsRequest request) {
                        return client.listDomains(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.identity.model.DomainSummary} objects
     * contained in responses from the listDomains operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.identity.model.DomainSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.identity.model.DomainSummary> listDomainsRecordIterator(
            final ListDomainsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDomainsRequest.Builder, ListDomainsRequest, ListDomainsResponse,
                com.oracle.bmc.identity.model.DomainSummary>(
                new com.google.common.base.Supplier<ListDomainsRequest.Builder>() {
                    @Override
                    public ListDomainsRequest.Builder get() {
                        return ListDomainsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDomainsResponse, String>() {
                    @Override
                    public String apply(ListDomainsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDomainsRequest.Builder>,
                        ListDomainsRequest>() {
                    @Override
                    public ListDomainsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDomainsRequest.Builder>
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
                new com.google.common.base.Function<ListDomainsRequest, ListDomainsResponse>() {
                    @Override
                    public ListDomainsResponse apply(ListDomainsRequest request) {
                        return client.listDomains(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDomainsResponse,
                        java.util.List<com.oracle.bmc.identity.model.DomainSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.identity.model.DomainSummary> apply(
                            ListDomainsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDynamicGroups operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDynamicGroupsResponse> listDynamicGroupsResponseIterator(
            final ListDynamicGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDynamicGroupsRequest.Builder, ListDynamicGroupsRequest,
                ListDynamicGroupsResponse>(
                new com.google.common.base.Supplier<ListDynamicGroupsRequest.Builder>() {
                    @Override
                    public ListDynamicGroupsRequest.Builder get() {
                        return ListDynamicGroupsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDynamicGroupsResponse, String>() {
                    @Override
                    public String apply(ListDynamicGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDynamicGroupsRequest.Builder>,
                        ListDynamicGroupsRequest>() {
                    @Override
                    public ListDynamicGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDynamicGroupsRequest.Builder>
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
                        ListDynamicGroupsRequest, ListDynamicGroupsResponse>() {
                    @Override
                    public ListDynamicGroupsResponse apply(ListDynamicGroupsRequest request) {
                        return client.listDynamicGroups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.identity.model.DynamicGroup} objects
     * contained in responses from the listDynamicGroups operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.identity.model.DynamicGroup} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.identity.model.DynamicGroup> listDynamicGroupsRecordIterator(
            final ListDynamicGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDynamicGroupsRequest.Builder, ListDynamicGroupsRequest,
                ListDynamicGroupsResponse, com.oracle.bmc.identity.model.DynamicGroup>(
                new com.google.common.base.Supplier<ListDynamicGroupsRequest.Builder>() {
                    @Override
                    public ListDynamicGroupsRequest.Builder get() {
                        return ListDynamicGroupsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDynamicGroupsResponse, String>() {
                    @Override
                    public String apply(ListDynamicGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDynamicGroupsRequest.Builder>,
                        ListDynamicGroupsRequest>() {
                    @Override
                    public ListDynamicGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDynamicGroupsRequest.Builder>
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
                        ListDynamicGroupsRequest, ListDynamicGroupsResponse>() {
                    @Override
                    public ListDynamicGroupsResponse apply(ListDynamicGroupsRequest request) {
                        return client.listDynamicGroups(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDynamicGroupsResponse,
                        java.util.List<com.oracle.bmc.identity.model.DynamicGroup>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.identity.model.DynamicGroup> apply(
                            ListDynamicGroupsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listGroups operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListGroupsResponse> listGroupsResponseIterator(
            final ListGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListGroupsRequest.Builder, ListGroupsRequest, ListGroupsResponse>(
                new com.google.common.base.Supplier<ListGroupsRequest.Builder>() {
                    @Override
                    public ListGroupsRequest.Builder get() {
                        return ListGroupsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListGroupsResponse, String>() {
                    @Override
                    public String apply(ListGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGroupsRequest.Builder>,
                        ListGroupsRequest>() {
                    @Override
                    public ListGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGroupsRequest.Builder>
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
                new com.google.common.base.Function<ListGroupsRequest, ListGroupsResponse>() {
                    @Override
                    public ListGroupsResponse apply(ListGroupsRequest request) {
                        return client.listGroups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.identity.model.Group} objects
     * contained in responses from the listGroups operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.identity.model.Group} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.identity.model.Group> listGroupsRecordIterator(
            final ListGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListGroupsRequest.Builder, ListGroupsRequest, ListGroupsResponse,
                com.oracle.bmc.identity.model.Group>(
                new com.google.common.base.Supplier<ListGroupsRequest.Builder>() {
                    @Override
                    public ListGroupsRequest.Builder get() {
                        return ListGroupsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListGroupsResponse, String>() {
                    @Override
                    public String apply(ListGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGroupsRequest.Builder>,
                        ListGroupsRequest>() {
                    @Override
                    public ListGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGroupsRequest.Builder>
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
                new com.google.common.base.Function<ListGroupsRequest, ListGroupsResponse>() {
                    @Override
                    public ListGroupsResponse apply(ListGroupsRequest request) {
                        return client.listGroups(request);
                    }
                },
                new com.google.common.base.Function<
                        ListGroupsResponse, java.util.List<com.oracle.bmc.identity.model.Group>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.identity.model.Group> apply(
                            ListGroupsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listIamWorkRequestErrors operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListIamWorkRequestErrorsResponse> listIamWorkRequestErrorsResponseIterator(
            final ListIamWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListIamWorkRequestErrorsRequest.Builder, ListIamWorkRequestErrorsRequest,
                ListIamWorkRequestErrorsResponse>(
                new com.google.common.base.Supplier<ListIamWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListIamWorkRequestErrorsRequest.Builder get() {
                        return ListIamWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListIamWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListIamWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIamWorkRequestErrorsRequest.Builder>,
                        ListIamWorkRequestErrorsRequest>() {
                    @Override
                    public ListIamWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIamWorkRequestErrorsRequest.Builder>
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
                        ListIamWorkRequestErrorsRequest, ListIamWorkRequestErrorsResponse>() {
                    @Override
                    public ListIamWorkRequestErrorsResponse apply(
                            ListIamWorkRequestErrorsRequest request) {
                        return client.listIamWorkRequestErrors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.identity.model.IamWorkRequestErrorSummary} objects
     * contained in responses from the listIamWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.identity.model.IamWorkRequestErrorSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.identity.model.IamWorkRequestErrorSummary>
            listIamWorkRequestErrorsRecordIterator(final ListIamWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListIamWorkRequestErrorsRequest.Builder, ListIamWorkRequestErrorsRequest,
                ListIamWorkRequestErrorsResponse,
                com.oracle.bmc.identity.model.IamWorkRequestErrorSummary>(
                new com.google.common.base.Supplier<ListIamWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListIamWorkRequestErrorsRequest.Builder get() {
                        return ListIamWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListIamWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListIamWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIamWorkRequestErrorsRequest.Builder>,
                        ListIamWorkRequestErrorsRequest>() {
                    @Override
                    public ListIamWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIamWorkRequestErrorsRequest.Builder>
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
                        ListIamWorkRequestErrorsRequest, ListIamWorkRequestErrorsResponse>() {
                    @Override
                    public ListIamWorkRequestErrorsResponse apply(
                            ListIamWorkRequestErrorsRequest request) {
                        return client.listIamWorkRequestErrors(request);
                    }
                },
                new com.google.common.base.Function<
                        ListIamWorkRequestErrorsResponse,
                        java.util.List<
                                com.oracle.bmc.identity.model.IamWorkRequestErrorSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.identity.model.IamWorkRequestErrorSummary>
                            apply(ListIamWorkRequestErrorsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listIamWorkRequestLogs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListIamWorkRequestLogsResponse> listIamWorkRequestLogsResponseIterator(
            final ListIamWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListIamWorkRequestLogsRequest.Builder, ListIamWorkRequestLogsRequest,
                ListIamWorkRequestLogsResponse>(
                new com.google.common.base.Supplier<ListIamWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListIamWorkRequestLogsRequest.Builder get() {
                        return ListIamWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListIamWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListIamWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIamWorkRequestLogsRequest.Builder>,
                        ListIamWorkRequestLogsRequest>() {
                    @Override
                    public ListIamWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIamWorkRequestLogsRequest.Builder>
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
                        ListIamWorkRequestLogsRequest, ListIamWorkRequestLogsResponse>() {
                    @Override
                    public ListIamWorkRequestLogsResponse apply(
                            ListIamWorkRequestLogsRequest request) {
                        return client.listIamWorkRequestLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.identity.model.IamWorkRequestLogSummary} objects
     * contained in responses from the listIamWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.identity.model.IamWorkRequestLogSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.identity.model.IamWorkRequestLogSummary>
            listIamWorkRequestLogsRecordIterator(final ListIamWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListIamWorkRequestLogsRequest.Builder, ListIamWorkRequestLogsRequest,
                ListIamWorkRequestLogsResponse,
                com.oracle.bmc.identity.model.IamWorkRequestLogSummary>(
                new com.google.common.base.Supplier<ListIamWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListIamWorkRequestLogsRequest.Builder get() {
                        return ListIamWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListIamWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListIamWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIamWorkRequestLogsRequest.Builder>,
                        ListIamWorkRequestLogsRequest>() {
                    @Override
                    public ListIamWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIamWorkRequestLogsRequest.Builder>
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
                        ListIamWorkRequestLogsRequest, ListIamWorkRequestLogsResponse>() {
                    @Override
                    public ListIamWorkRequestLogsResponse apply(
                            ListIamWorkRequestLogsRequest request) {
                        return client.listIamWorkRequestLogs(request);
                    }
                },
                new com.google.common.base.Function<
                        ListIamWorkRequestLogsResponse,
                        java.util.List<com.oracle.bmc.identity.model.IamWorkRequestLogSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.identity.model.IamWorkRequestLogSummary>
                            apply(ListIamWorkRequestLogsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listIamWorkRequests operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListIamWorkRequestsResponse> listIamWorkRequestsResponseIterator(
            final ListIamWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListIamWorkRequestsRequest.Builder, ListIamWorkRequestsRequest,
                ListIamWorkRequestsResponse>(
                new com.google.common.base.Supplier<ListIamWorkRequestsRequest.Builder>() {
                    @Override
                    public ListIamWorkRequestsRequest.Builder get() {
                        return ListIamWorkRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListIamWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListIamWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIamWorkRequestsRequest.Builder>,
                        ListIamWorkRequestsRequest>() {
                    @Override
                    public ListIamWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIamWorkRequestsRequest.Builder>
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
                        ListIamWorkRequestsRequest, ListIamWorkRequestsResponse>() {
                    @Override
                    public ListIamWorkRequestsResponse apply(ListIamWorkRequestsRequest request) {
                        return client.listIamWorkRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.identity.model.IamWorkRequestSummary} objects
     * contained in responses from the listIamWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.identity.model.IamWorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.identity.model.IamWorkRequestSummary>
            listIamWorkRequestsRecordIterator(final ListIamWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListIamWorkRequestsRequest.Builder, ListIamWorkRequestsRequest,
                ListIamWorkRequestsResponse, com.oracle.bmc.identity.model.IamWorkRequestSummary>(
                new com.google.common.base.Supplier<ListIamWorkRequestsRequest.Builder>() {
                    @Override
                    public ListIamWorkRequestsRequest.Builder get() {
                        return ListIamWorkRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListIamWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListIamWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIamWorkRequestsRequest.Builder>,
                        ListIamWorkRequestsRequest>() {
                    @Override
                    public ListIamWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIamWorkRequestsRequest.Builder>
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
                        ListIamWorkRequestsRequest, ListIamWorkRequestsResponse>() {
                    @Override
                    public ListIamWorkRequestsResponse apply(ListIamWorkRequestsRequest request) {
                        return client.listIamWorkRequests(request);
                    }
                },
                new com.google.common.base.Function<
                        ListIamWorkRequestsResponse,
                        java.util.List<com.oracle.bmc.identity.model.IamWorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.identity.model.IamWorkRequestSummary>
                            apply(ListIamWorkRequestsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listIdentityProviderGroups operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListIdentityProviderGroupsResponse> listIdentityProviderGroupsResponseIterator(
            final ListIdentityProviderGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListIdentityProviderGroupsRequest.Builder, ListIdentityProviderGroupsRequest,
                ListIdentityProviderGroupsResponse>(
                new com.google.common.base.Supplier<ListIdentityProviderGroupsRequest.Builder>() {
                    @Override
                    public ListIdentityProviderGroupsRequest.Builder get() {
                        return ListIdentityProviderGroupsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListIdentityProviderGroupsResponse, String>() {
                    @Override
                    public String apply(ListIdentityProviderGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIdentityProviderGroupsRequest.Builder>,
                        ListIdentityProviderGroupsRequest>() {
                    @Override
                    public ListIdentityProviderGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIdentityProviderGroupsRequest.Builder>
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
                        ListIdentityProviderGroupsRequest, ListIdentityProviderGroupsResponse>() {
                    @Override
                    public ListIdentityProviderGroupsResponse apply(
                            ListIdentityProviderGroupsRequest request) {
                        return client.listIdentityProviderGroups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.identity.model.IdentityProviderGroupSummary} objects
     * contained in responses from the listIdentityProviderGroups operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.identity.model.IdentityProviderGroupSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.identity.model.IdentityProviderGroupSummary>
            listIdentityProviderGroupsRecordIterator(
                    final ListIdentityProviderGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListIdentityProviderGroupsRequest.Builder, ListIdentityProviderGroupsRequest,
                ListIdentityProviderGroupsResponse,
                com.oracle.bmc.identity.model.IdentityProviderGroupSummary>(
                new com.google.common.base.Supplier<ListIdentityProviderGroupsRequest.Builder>() {
                    @Override
                    public ListIdentityProviderGroupsRequest.Builder get() {
                        return ListIdentityProviderGroupsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListIdentityProviderGroupsResponse, String>() {
                    @Override
                    public String apply(ListIdentityProviderGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIdentityProviderGroupsRequest.Builder>,
                        ListIdentityProviderGroupsRequest>() {
                    @Override
                    public ListIdentityProviderGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIdentityProviderGroupsRequest.Builder>
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
                        ListIdentityProviderGroupsRequest, ListIdentityProviderGroupsResponse>() {
                    @Override
                    public ListIdentityProviderGroupsResponse apply(
                            ListIdentityProviderGroupsRequest request) {
                        return client.listIdentityProviderGroups(request);
                    }
                },
                new com.google.common.base.Function<
                        ListIdentityProviderGroupsResponse,
                        java.util.List<
                                com.oracle.bmc.identity.model.IdentityProviderGroupSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.identity.model.IdentityProviderGroupSummary>
                            apply(ListIdentityProviderGroupsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listIdentityProviders operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListIdentityProvidersResponse> listIdentityProvidersResponseIterator(
            final ListIdentityProvidersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListIdentityProvidersRequest.Builder, ListIdentityProvidersRequest,
                ListIdentityProvidersResponse>(
                new com.google.common.base.Supplier<ListIdentityProvidersRequest.Builder>() {
                    @Override
                    public ListIdentityProvidersRequest.Builder get() {
                        return ListIdentityProvidersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListIdentityProvidersResponse, String>() {
                    @Override
                    public String apply(ListIdentityProvidersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIdentityProvidersRequest.Builder>,
                        ListIdentityProvidersRequest>() {
                    @Override
                    public ListIdentityProvidersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIdentityProvidersRequest.Builder>
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
                        ListIdentityProvidersRequest, ListIdentityProvidersResponse>() {
                    @Override
                    public ListIdentityProvidersResponse apply(
                            ListIdentityProvidersRequest request) {
                        return client.listIdentityProviders(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.identity.model.IdentityProvider} objects
     * contained in responses from the listIdentityProviders operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.identity.model.IdentityProvider} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.identity.model.IdentityProvider>
            listIdentityProvidersRecordIterator(final ListIdentityProvidersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListIdentityProvidersRequest.Builder, ListIdentityProvidersRequest,
                ListIdentityProvidersResponse, com.oracle.bmc.identity.model.IdentityProvider>(
                new com.google.common.base.Supplier<ListIdentityProvidersRequest.Builder>() {
                    @Override
                    public ListIdentityProvidersRequest.Builder get() {
                        return ListIdentityProvidersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListIdentityProvidersResponse, String>() {
                    @Override
                    public String apply(ListIdentityProvidersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIdentityProvidersRequest.Builder>,
                        ListIdentityProvidersRequest>() {
                    @Override
                    public ListIdentityProvidersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIdentityProvidersRequest.Builder>
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
                        ListIdentityProvidersRequest, ListIdentityProvidersResponse>() {
                    @Override
                    public ListIdentityProvidersResponse apply(
                            ListIdentityProvidersRequest request) {
                        return client.listIdentityProviders(request);
                    }
                },
                new com.google.common.base.Function<
                        ListIdentityProvidersResponse,
                        java.util.List<com.oracle.bmc.identity.model.IdentityProvider>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.identity.model.IdentityProvider> apply(
                            ListIdentityProvidersResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listIdpGroupMappings operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListIdpGroupMappingsResponse> listIdpGroupMappingsResponseIterator(
            final ListIdpGroupMappingsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListIdpGroupMappingsRequest.Builder, ListIdpGroupMappingsRequest,
                ListIdpGroupMappingsResponse>(
                new com.google.common.base.Supplier<ListIdpGroupMappingsRequest.Builder>() {
                    @Override
                    public ListIdpGroupMappingsRequest.Builder get() {
                        return ListIdpGroupMappingsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListIdpGroupMappingsResponse, String>() {
                    @Override
                    public String apply(ListIdpGroupMappingsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIdpGroupMappingsRequest.Builder>,
                        ListIdpGroupMappingsRequest>() {
                    @Override
                    public ListIdpGroupMappingsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIdpGroupMappingsRequest.Builder>
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
                        ListIdpGroupMappingsRequest, ListIdpGroupMappingsResponse>() {
                    @Override
                    public ListIdpGroupMappingsResponse apply(ListIdpGroupMappingsRequest request) {
                        return client.listIdpGroupMappings(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.identity.model.IdpGroupMapping} objects
     * contained in responses from the listIdpGroupMappings operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.identity.model.IdpGroupMapping} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.identity.model.IdpGroupMapping>
            listIdpGroupMappingsRecordIterator(final ListIdpGroupMappingsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListIdpGroupMappingsRequest.Builder, ListIdpGroupMappingsRequest,
                ListIdpGroupMappingsResponse, com.oracle.bmc.identity.model.IdpGroupMapping>(
                new com.google.common.base.Supplier<ListIdpGroupMappingsRequest.Builder>() {
                    @Override
                    public ListIdpGroupMappingsRequest.Builder get() {
                        return ListIdpGroupMappingsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListIdpGroupMappingsResponse, String>() {
                    @Override
                    public String apply(ListIdpGroupMappingsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIdpGroupMappingsRequest.Builder>,
                        ListIdpGroupMappingsRequest>() {
                    @Override
                    public ListIdpGroupMappingsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIdpGroupMappingsRequest.Builder>
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
                        ListIdpGroupMappingsRequest, ListIdpGroupMappingsResponse>() {
                    @Override
                    public ListIdpGroupMappingsResponse apply(ListIdpGroupMappingsRequest request) {
                        return client.listIdpGroupMappings(request);
                    }
                },
                new com.google.common.base.Function<
                        ListIdpGroupMappingsResponse,
                        java.util.List<com.oracle.bmc.identity.model.IdpGroupMapping>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.identity.model.IdpGroupMapping> apply(
                            ListIdpGroupMappingsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listMfaTotpDevices operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListMfaTotpDevicesResponse> listMfaTotpDevicesResponseIterator(
            final ListMfaTotpDevicesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMfaTotpDevicesRequest.Builder, ListMfaTotpDevicesRequest,
                ListMfaTotpDevicesResponse>(
                new com.google.common.base.Supplier<ListMfaTotpDevicesRequest.Builder>() {
                    @Override
                    public ListMfaTotpDevicesRequest.Builder get() {
                        return ListMfaTotpDevicesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListMfaTotpDevicesResponse, String>() {
                    @Override
                    public String apply(ListMfaTotpDevicesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMfaTotpDevicesRequest.Builder>,
                        ListMfaTotpDevicesRequest>() {
                    @Override
                    public ListMfaTotpDevicesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMfaTotpDevicesRequest.Builder>
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
                        ListMfaTotpDevicesRequest, ListMfaTotpDevicesResponse>() {
                    @Override
                    public ListMfaTotpDevicesResponse apply(ListMfaTotpDevicesRequest request) {
                        return client.listMfaTotpDevices(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.identity.model.MfaTotpDeviceSummary} objects
     * contained in responses from the listMfaTotpDevices operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.identity.model.MfaTotpDeviceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.identity.model.MfaTotpDeviceSummary>
            listMfaTotpDevicesRecordIterator(final ListMfaTotpDevicesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMfaTotpDevicesRequest.Builder, ListMfaTotpDevicesRequest,
                ListMfaTotpDevicesResponse, com.oracle.bmc.identity.model.MfaTotpDeviceSummary>(
                new com.google.common.base.Supplier<ListMfaTotpDevicesRequest.Builder>() {
                    @Override
                    public ListMfaTotpDevicesRequest.Builder get() {
                        return ListMfaTotpDevicesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListMfaTotpDevicesResponse, String>() {
                    @Override
                    public String apply(ListMfaTotpDevicesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMfaTotpDevicesRequest.Builder>,
                        ListMfaTotpDevicesRequest>() {
                    @Override
                    public ListMfaTotpDevicesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMfaTotpDevicesRequest.Builder>
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
                        ListMfaTotpDevicesRequest, ListMfaTotpDevicesResponse>() {
                    @Override
                    public ListMfaTotpDevicesResponse apply(ListMfaTotpDevicesRequest request) {
                        return client.listMfaTotpDevices(request);
                    }
                },
                new com.google.common.base.Function<
                        ListMfaTotpDevicesResponse,
                        java.util.List<com.oracle.bmc.identity.model.MfaTotpDeviceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.identity.model.MfaTotpDeviceSummary> apply(
                            ListMfaTotpDevicesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listNetworkSources operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListNetworkSourcesResponse> listNetworkSourcesResponseIterator(
            final ListNetworkSourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListNetworkSourcesRequest.Builder, ListNetworkSourcesRequest,
                ListNetworkSourcesResponse>(
                new com.google.common.base.Supplier<ListNetworkSourcesRequest.Builder>() {
                    @Override
                    public ListNetworkSourcesRequest.Builder get() {
                        return ListNetworkSourcesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListNetworkSourcesResponse, String>() {
                    @Override
                    public String apply(ListNetworkSourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNetworkSourcesRequest.Builder>,
                        ListNetworkSourcesRequest>() {
                    @Override
                    public ListNetworkSourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNetworkSourcesRequest.Builder>
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
                        ListNetworkSourcesRequest, ListNetworkSourcesResponse>() {
                    @Override
                    public ListNetworkSourcesResponse apply(ListNetworkSourcesRequest request) {
                        return client.listNetworkSources(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.identity.model.NetworkSourcesSummary} objects
     * contained in responses from the listNetworkSources operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.identity.model.NetworkSourcesSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.identity.model.NetworkSourcesSummary>
            listNetworkSourcesRecordIterator(final ListNetworkSourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListNetworkSourcesRequest.Builder, ListNetworkSourcesRequest,
                ListNetworkSourcesResponse, com.oracle.bmc.identity.model.NetworkSourcesSummary>(
                new com.google.common.base.Supplier<ListNetworkSourcesRequest.Builder>() {
                    @Override
                    public ListNetworkSourcesRequest.Builder get() {
                        return ListNetworkSourcesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListNetworkSourcesResponse, String>() {
                    @Override
                    public String apply(ListNetworkSourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNetworkSourcesRequest.Builder>,
                        ListNetworkSourcesRequest>() {
                    @Override
                    public ListNetworkSourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNetworkSourcesRequest.Builder>
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
                        ListNetworkSourcesRequest, ListNetworkSourcesResponse>() {
                    @Override
                    public ListNetworkSourcesResponse apply(ListNetworkSourcesRequest request) {
                        return client.listNetworkSources(request);
                    }
                },
                new com.google.common.base.Function<
                        ListNetworkSourcesResponse,
                        java.util.List<com.oracle.bmc.identity.model.NetworkSourcesSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.identity.model.NetworkSourcesSummary>
                            apply(ListNetworkSourcesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listOAuthClientCredentials operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListOAuthClientCredentialsResponse> listOAuthClientCredentialsResponseIterator(
            final ListOAuthClientCredentialsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOAuthClientCredentialsRequest.Builder, ListOAuthClientCredentialsRequest,
                ListOAuthClientCredentialsResponse>(
                new com.google.common.base.Supplier<ListOAuthClientCredentialsRequest.Builder>() {
                    @Override
                    public ListOAuthClientCredentialsRequest.Builder get() {
                        return ListOAuthClientCredentialsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListOAuthClientCredentialsResponse, String>() {
                    @Override
                    public String apply(ListOAuthClientCredentialsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOAuthClientCredentialsRequest.Builder>,
                        ListOAuthClientCredentialsRequest>() {
                    @Override
                    public ListOAuthClientCredentialsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOAuthClientCredentialsRequest.Builder>
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
                        ListOAuthClientCredentialsRequest, ListOAuthClientCredentialsResponse>() {
                    @Override
                    public ListOAuthClientCredentialsResponse apply(
                            ListOAuthClientCredentialsRequest request) {
                        return client.listOAuthClientCredentials(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.identity.model.OAuth2ClientCredentialSummary} objects
     * contained in responses from the listOAuthClientCredentials operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.identity.model.OAuth2ClientCredentialSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.identity.model.OAuth2ClientCredentialSummary>
            listOAuthClientCredentialsRecordIterator(
                    final ListOAuthClientCredentialsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOAuthClientCredentialsRequest.Builder, ListOAuthClientCredentialsRequest,
                ListOAuthClientCredentialsResponse,
                com.oracle.bmc.identity.model.OAuth2ClientCredentialSummary>(
                new com.google.common.base.Supplier<ListOAuthClientCredentialsRequest.Builder>() {
                    @Override
                    public ListOAuthClientCredentialsRequest.Builder get() {
                        return ListOAuthClientCredentialsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListOAuthClientCredentialsResponse, String>() {
                    @Override
                    public String apply(ListOAuthClientCredentialsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOAuthClientCredentialsRequest.Builder>,
                        ListOAuthClientCredentialsRequest>() {
                    @Override
                    public ListOAuthClientCredentialsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOAuthClientCredentialsRequest.Builder>
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
                        ListOAuthClientCredentialsRequest, ListOAuthClientCredentialsResponse>() {
                    @Override
                    public ListOAuthClientCredentialsResponse apply(
                            ListOAuthClientCredentialsRequest request) {
                        return client.listOAuthClientCredentials(request);
                    }
                },
                new com.google.common.base.Function<
                        ListOAuthClientCredentialsResponse,
                        java.util.List<
                                com.oracle.bmc.identity.model.OAuth2ClientCredentialSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.identity.model.OAuth2ClientCredentialSummary>
                            apply(ListOAuthClientCredentialsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listPolicies operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListPoliciesResponse> listPoliciesResponseIterator(
            final ListPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPoliciesRequest.Builder, ListPoliciesRequest, ListPoliciesResponse>(
                new com.google.common.base.Supplier<ListPoliciesRequest.Builder>() {
                    @Override
                    public ListPoliciesRequest.Builder get() {
                        return ListPoliciesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListPoliciesResponse, String>() {
                    @Override
                    public String apply(ListPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPoliciesRequest.Builder>,
                        ListPoliciesRequest>() {
                    @Override
                    public ListPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPoliciesRequest.Builder>
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
                new com.google.common.base.Function<ListPoliciesRequest, ListPoliciesResponse>() {
                    @Override
                    public ListPoliciesResponse apply(ListPoliciesRequest request) {
                        return client.listPolicies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.identity.model.Policy} objects
     * contained in responses from the listPolicies operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.identity.model.Policy} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.identity.model.Policy> listPoliciesRecordIterator(
            final ListPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPoliciesRequest.Builder, ListPoliciesRequest, ListPoliciesResponse,
                com.oracle.bmc.identity.model.Policy>(
                new com.google.common.base.Supplier<ListPoliciesRequest.Builder>() {
                    @Override
                    public ListPoliciesRequest.Builder get() {
                        return ListPoliciesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListPoliciesResponse, String>() {
                    @Override
                    public String apply(ListPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPoliciesRequest.Builder>,
                        ListPoliciesRequest>() {
                    @Override
                    public ListPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPoliciesRequest.Builder>
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
                new com.google.common.base.Function<ListPoliciesRequest, ListPoliciesResponse>() {
                    @Override
                    public ListPoliciesResponse apply(ListPoliciesRequest request) {
                        return client.listPolicies(request);
                    }
                },
                new com.google.common.base.Function<
                        ListPoliciesResponse,
                        java.util.List<com.oracle.bmc.identity.model.Policy>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.identity.model.Policy> apply(
                            ListPoliciesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listStandardTagNamespaces operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListStandardTagNamespacesResponse> listStandardTagNamespacesResponseIterator(
            final ListStandardTagNamespacesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListStandardTagNamespacesRequest.Builder, ListStandardTagNamespacesRequest,
                ListStandardTagNamespacesResponse>(
                new com.google.common.base.Supplier<ListStandardTagNamespacesRequest.Builder>() {
                    @Override
                    public ListStandardTagNamespacesRequest.Builder get() {
                        return ListStandardTagNamespacesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListStandardTagNamespacesResponse, String>() {
                    @Override
                    public String apply(ListStandardTagNamespacesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStandardTagNamespacesRequest.Builder>,
                        ListStandardTagNamespacesRequest>() {
                    @Override
                    public ListStandardTagNamespacesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStandardTagNamespacesRequest.Builder>
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
                        ListStandardTagNamespacesRequest, ListStandardTagNamespacesResponse>() {
                    @Override
                    public ListStandardTagNamespacesResponse apply(
                            ListStandardTagNamespacesRequest request) {
                        return client.listStandardTagNamespaces(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.identity.model.StandardTagNamespaceTemplateSummary} objects
     * contained in responses from the listStandardTagNamespaces operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.identity.model.StandardTagNamespaceTemplateSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.identity.model.StandardTagNamespaceTemplateSummary>
            listStandardTagNamespacesRecordIterator(
                    final ListStandardTagNamespacesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListStandardTagNamespacesRequest.Builder, ListStandardTagNamespacesRequest,
                ListStandardTagNamespacesResponse,
                com.oracle.bmc.identity.model.StandardTagNamespaceTemplateSummary>(
                new com.google.common.base.Supplier<ListStandardTagNamespacesRequest.Builder>() {
                    @Override
                    public ListStandardTagNamespacesRequest.Builder get() {
                        return ListStandardTagNamespacesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListStandardTagNamespacesResponse, String>() {
                    @Override
                    public String apply(ListStandardTagNamespacesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStandardTagNamespacesRequest.Builder>,
                        ListStandardTagNamespacesRequest>() {
                    @Override
                    public ListStandardTagNamespacesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStandardTagNamespacesRequest.Builder>
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
                        ListStandardTagNamespacesRequest, ListStandardTagNamespacesResponse>() {
                    @Override
                    public ListStandardTagNamespacesResponse apply(
                            ListStandardTagNamespacesRequest request) {
                        return client.listStandardTagNamespaces(request);
                    }
                },
                new com.google.common.base.Function<
                        ListStandardTagNamespacesResponse,
                        java.util.List<
                                com.oracle.bmc.identity.model
                                        .StandardTagNamespaceTemplateSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.identity.model
                                            .StandardTagNamespaceTemplateSummary>
                            apply(ListStandardTagNamespacesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTagDefaults operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTagDefaultsResponse> listTagDefaultsResponseIterator(
            final ListTagDefaultsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTagDefaultsRequest.Builder, ListTagDefaultsRequest, ListTagDefaultsResponse>(
                new com.google.common.base.Supplier<ListTagDefaultsRequest.Builder>() {
                    @Override
                    public ListTagDefaultsRequest.Builder get() {
                        return ListTagDefaultsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTagDefaultsResponse, String>() {
                    @Override
                    public String apply(ListTagDefaultsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTagDefaultsRequest.Builder>,
                        ListTagDefaultsRequest>() {
                    @Override
                    public ListTagDefaultsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTagDefaultsRequest.Builder>
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
                        ListTagDefaultsRequest, ListTagDefaultsResponse>() {
                    @Override
                    public ListTagDefaultsResponse apply(ListTagDefaultsRequest request) {
                        return client.listTagDefaults(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.identity.model.TagDefaultSummary} objects
     * contained in responses from the listTagDefaults operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.identity.model.TagDefaultSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.identity.model.TagDefaultSummary> listTagDefaultsRecordIterator(
            final ListTagDefaultsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTagDefaultsRequest.Builder, ListTagDefaultsRequest, ListTagDefaultsResponse,
                com.oracle.bmc.identity.model.TagDefaultSummary>(
                new com.google.common.base.Supplier<ListTagDefaultsRequest.Builder>() {
                    @Override
                    public ListTagDefaultsRequest.Builder get() {
                        return ListTagDefaultsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTagDefaultsResponse, String>() {
                    @Override
                    public String apply(ListTagDefaultsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTagDefaultsRequest.Builder>,
                        ListTagDefaultsRequest>() {
                    @Override
                    public ListTagDefaultsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTagDefaultsRequest.Builder>
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
                        ListTagDefaultsRequest, ListTagDefaultsResponse>() {
                    @Override
                    public ListTagDefaultsResponse apply(ListTagDefaultsRequest request) {
                        return client.listTagDefaults(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTagDefaultsResponse,
                        java.util.List<com.oracle.bmc.identity.model.TagDefaultSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.identity.model.TagDefaultSummary> apply(
                            ListTagDefaultsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTagNamespaces operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTagNamespacesResponse> listTagNamespacesResponseIterator(
            final ListTagNamespacesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTagNamespacesRequest.Builder, ListTagNamespacesRequest,
                ListTagNamespacesResponse>(
                new com.google.common.base.Supplier<ListTagNamespacesRequest.Builder>() {
                    @Override
                    public ListTagNamespacesRequest.Builder get() {
                        return ListTagNamespacesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTagNamespacesResponse, String>() {
                    @Override
                    public String apply(ListTagNamespacesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTagNamespacesRequest.Builder>,
                        ListTagNamespacesRequest>() {
                    @Override
                    public ListTagNamespacesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTagNamespacesRequest.Builder>
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
                        ListTagNamespacesRequest, ListTagNamespacesResponse>() {
                    @Override
                    public ListTagNamespacesResponse apply(ListTagNamespacesRequest request) {
                        return client.listTagNamespaces(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.identity.model.TagNamespaceSummary} objects
     * contained in responses from the listTagNamespaces operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.identity.model.TagNamespaceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.identity.model.TagNamespaceSummary>
            listTagNamespacesRecordIterator(final ListTagNamespacesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTagNamespacesRequest.Builder, ListTagNamespacesRequest,
                ListTagNamespacesResponse, com.oracle.bmc.identity.model.TagNamespaceSummary>(
                new com.google.common.base.Supplier<ListTagNamespacesRequest.Builder>() {
                    @Override
                    public ListTagNamespacesRequest.Builder get() {
                        return ListTagNamespacesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTagNamespacesResponse, String>() {
                    @Override
                    public String apply(ListTagNamespacesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTagNamespacesRequest.Builder>,
                        ListTagNamespacesRequest>() {
                    @Override
                    public ListTagNamespacesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTagNamespacesRequest.Builder>
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
                        ListTagNamespacesRequest, ListTagNamespacesResponse>() {
                    @Override
                    public ListTagNamespacesResponse apply(ListTagNamespacesRequest request) {
                        return client.listTagNamespaces(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTagNamespacesResponse,
                        java.util.List<com.oracle.bmc.identity.model.TagNamespaceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.identity.model.TagNamespaceSummary> apply(
                            ListTagNamespacesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTaggingWorkRequestErrors operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTaggingWorkRequestErrorsResponse>
            listTaggingWorkRequestErrorsResponseIterator(
                    final ListTaggingWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTaggingWorkRequestErrorsRequest.Builder, ListTaggingWorkRequestErrorsRequest,
                ListTaggingWorkRequestErrorsResponse>(
                new com.google.common.base.Supplier<ListTaggingWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListTaggingWorkRequestErrorsRequest.Builder get() {
                        return ListTaggingWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTaggingWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListTaggingWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTaggingWorkRequestErrorsRequest.Builder>,
                        ListTaggingWorkRequestErrorsRequest>() {
                    @Override
                    public ListTaggingWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTaggingWorkRequestErrorsRequest.Builder>
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
                        ListTaggingWorkRequestErrorsRequest,
                        ListTaggingWorkRequestErrorsResponse>() {
                    @Override
                    public ListTaggingWorkRequestErrorsResponse apply(
                            ListTaggingWorkRequestErrorsRequest request) {
                        return client.listTaggingWorkRequestErrors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.identity.model.TaggingWorkRequestErrorSummary} objects
     * contained in responses from the listTaggingWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.identity.model.TaggingWorkRequestErrorSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.identity.model.TaggingWorkRequestErrorSummary>
            listTaggingWorkRequestErrorsRecordIterator(
                    final ListTaggingWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTaggingWorkRequestErrorsRequest.Builder, ListTaggingWorkRequestErrorsRequest,
                ListTaggingWorkRequestErrorsResponse,
                com.oracle.bmc.identity.model.TaggingWorkRequestErrorSummary>(
                new com.google.common.base.Supplier<ListTaggingWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListTaggingWorkRequestErrorsRequest.Builder get() {
                        return ListTaggingWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTaggingWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListTaggingWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTaggingWorkRequestErrorsRequest.Builder>,
                        ListTaggingWorkRequestErrorsRequest>() {
                    @Override
                    public ListTaggingWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTaggingWorkRequestErrorsRequest.Builder>
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
                        ListTaggingWorkRequestErrorsRequest,
                        ListTaggingWorkRequestErrorsResponse>() {
                    @Override
                    public ListTaggingWorkRequestErrorsResponse apply(
                            ListTaggingWorkRequestErrorsRequest request) {
                        return client.listTaggingWorkRequestErrors(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTaggingWorkRequestErrorsResponse,
                        java.util.List<
                                com.oracle.bmc.identity.model.TaggingWorkRequestErrorSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.identity.model.TaggingWorkRequestErrorSummary>
                            apply(ListTaggingWorkRequestErrorsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTaggingWorkRequestLogs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTaggingWorkRequestLogsResponse> listTaggingWorkRequestLogsResponseIterator(
            final ListTaggingWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTaggingWorkRequestLogsRequest.Builder, ListTaggingWorkRequestLogsRequest,
                ListTaggingWorkRequestLogsResponse>(
                new com.google.common.base.Supplier<ListTaggingWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListTaggingWorkRequestLogsRequest.Builder get() {
                        return ListTaggingWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTaggingWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListTaggingWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTaggingWorkRequestLogsRequest.Builder>,
                        ListTaggingWorkRequestLogsRequest>() {
                    @Override
                    public ListTaggingWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTaggingWorkRequestLogsRequest.Builder>
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
                        ListTaggingWorkRequestLogsRequest, ListTaggingWorkRequestLogsResponse>() {
                    @Override
                    public ListTaggingWorkRequestLogsResponse apply(
                            ListTaggingWorkRequestLogsRequest request) {
                        return client.listTaggingWorkRequestLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.identity.model.TaggingWorkRequestLogSummary} objects
     * contained in responses from the listTaggingWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.identity.model.TaggingWorkRequestLogSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.identity.model.TaggingWorkRequestLogSummary>
            listTaggingWorkRequestLogsRecordIterator(
                    final ListTaggingWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTaggingWorkRequestLogsRequest.Builder, ListTaggingWorkRequestLogsRequest,
                ListTaggingWorkRequestLogsResponse,
                com.oracle.bmc.identity.model.TaggingWorkRequestLogSummary>(
                new com.google.common.base.Supplier<ListTaggingWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListTaggingWorkRequestLogsRequest.Builder get() {
                        return ListTaggingWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTaggingWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListTaggingWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTaggingWorkRequestLogsRequest.Builder>,
                        ListTaggingWorkRequestLogsRequest>() {
                    @Override
                    public ListTaggingWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTaggingWorkRequestLogsRequest.Builder>
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
                        ListTaggingWorkRequestLogsRequest, ListTaggingWorkRequestLogsResponse>() {
                    @Override
                    public ListTaggingWorkRequestLogsResponse apply(
                            ListTaggingWorkRequestLogsRequest request) {
                        return client.listTaggingWorkRequestLogs(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTaggingWorkRequestLogsResponse,
                        java.util.List<
                                com.oracle.bmc.identity.model.TaggingWorkRequestLogSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.identity.model.TaggingWorkRequestLogSummary>
                            apply(ListTaggingWorkRequestLogsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTaggingWorkRequests operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTaggingWorkRequestsResponse> listTaggingWorkRequestsResponseIterator(
            final ListTaggingWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTaggingWorkRequestsRequest.Builder, ListTaggingWorkRequestsRequest,
                ListTaggingWorkRequestsResponse>(
                new com.google.common.base.Supplier<ListTaggingWorkRequestsRequest.Builder>() {
                    @Override
                    public ListTaggingWorkRequestsRequest.Builder get() {
                        return ListTaggingWorkRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTaggingWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListTaggingWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTaggingWorkRequestsRequest.Builder>,
                        ListTaggingWorkRequestsRequest>() {
                    @Override
                    public ListTaggingWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTaggingWorkRequestsRequest.Builder>
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
                        ListTaggingWorkRequestsRequest, ListTaggingWorkRequestsResponse>() {
                    @Override
                    public ListTaggingWorkRequestsResponse apply(
                            ListTaggingWorkRequestsRequest request) {
                        return client.listTaggingWorkRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.identity.model.TaggingWorkRequestSummary} objects
     * contained in responses from the listTaggingWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.identity.model.TaggingWorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.identity.model.TaggingWorkRequestSummary>
            listTaggingWorkRequestsRecordIterator(final ListTaggingWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTaggingWorkRequestsRequest.Builder, ListTaggingWorkRequestsRequest,
                ListTaggingWorkRequestsResponse,
                com.oracle.bmc.identity.model.TaggingWorkRequestSummary>(
                new com.google.common.base.Supplier<ListTaggingWorkRequestsRequest.Builder>() {
                    @Override
                    public ListTaggingWorkRequestsRequest.Builder get() {
                        return ListTaggingWorkRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTaggingWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListTaggingWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTaggingWorkRequestsRequest.Builder>,
                        ListTaggingWorkRequestsRequest>() {
                    @Override
                    public ListTaggingWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTaggingWorkRequestsRequest.Builder>
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
                        ListTaggingWorkRequestsRequest, ListTaggingWorkRequestsResponse>() {
                    @Override
                    public ListTaggingWorkRequestsResponse apply(
                            ListTaggingWorkRequestsRequest request) {
                        return client.listTaggingWorkRequests(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTaggingWorkRequestsResponse,
                        java.util.List<com.oracle.bmc.identity.model.TaggingWorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.identity.model.TaggingWorkRequestSummary>
                            apply(ListTaggingWorkRequestsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTags operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTagsResponse> listTagsResponseIterator(final ListTagsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTagsRequest.Builder, ListTagsRequest, ListTagsResponse>(
                new com.google.common.base.Supplier<ListTagsRequest.Builder>() {
                    @Override
                    public ListTagsRequest.Builder get() {
                        return ListTagsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTagsResponse, String>() {
                    @Override
                    public String apply(ListTagsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTagsRequest.Builder>,
                        ListTagsRequest>() {
                    @Override
                    public ListTagsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTagsRequest.Builder>
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
                new com.google.common.base.Function<ListTagsRequest, ListTagsResponse>() {
                    @Override
                    public ListTagsResponse apply(ListTagsRequest request) {
                        return client.listTags(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.identity.model.TagSummary} objects
     * contained in responses from the listTags operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.identity.model.TagSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.identity.model.TagSummary> listTagsRecordIterator(
            final ListTagsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTagsRequest.Builder, ListTagsRequest, ListTagsResponse,
                com.oracle.bmc.identity.model.TagSummary>(
                new com.google.common.base.Supplier<ListTagsRequest.Builder>() {
                    @Override
                    public ListTagsRequest.Builder get() {
                        return ListTagsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTagsResponse, String>() {
                    @Override
                    public String apply(ListTagsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTagsRequest.Builder>,
                        ListTagsRequest>() {
                    @Override
                    public ListTagsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTagsRequest.Builder>
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
                new com.google.common.base.Function<ListTagsRequest, ListTagsResponse>() {
                    @Override
                    public ListTagsResponse apply(ListTagsRequest request) {
                        return client.listTags(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTagsResponse,
                        java.util.List<com.oracle.bmc.identity.model.TagSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.identity.model.TagSummary> apply(
                            ListTagsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listUserGroupMemberships operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListUserGroupMembershipsResponse> listUserGroupMembershipsResponseIterator(
            final ListUserGroupMembershipsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListUserGroupMembershipsRequest.Builder, ListUserGroupMembershipsRequest,
                ListUserGroupMembershipsResponse>(
                new com.google.common.base.Supplier<ListUserGroupMembershipsRequest.Builder>() {
                    @Override
                    public ListUserGroupMembershipsRequest.Builder get() {
                        return ListUserGroupMembershipsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListUserGroupMembershipsResponse, String>() {
                    @Override
                    public String apply(ListUserGroupMembershipsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUserGroupMembershipsRequest.Builder>,
                        ListUserGroupMembershipsRequest>() {
                    @Override
                    public ListUserGroupMembershipsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUserGroupMembershipsRequest.Builder>
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
                        ListUserGroupMembershipsRequest, ListUserGroupMembershipsResponse>() {
                    @Override
                    public ListUserGroupMembershipsResponse apply(
                            ListUserGroupMembershipsRequest request) {
                        return client.listUserGroupMemberships(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.identity.model.UserGroupMembership} objects
     * contained in responses from the listUserGroupMemberships operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.identity.model.UserGroupMembership} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.identity.model.UserGroupMembership>
            listUserGroupMembershipsRecordIterator(final ListUserGroupMembershipsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListUserGroupMembershipsRequest.Builder, ListUserGroupMembershipsRequest,
                ListUserGroupMembershipsResponse,
                com.oracle.bmc.identity.model.UserGroupMembership>(
                new com.google.common.base.Supplier<ListUserGroupMembershipsRequest.Builder>() {
                    @Override
                    public ListUserGroupMembershipsRequest.Builder get() {
                        return ListUserGroupMembershipsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListUserGroupMembershipsResponse, String>() {
                    @Override
                    public String apply(ListUserGroupMembershipsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUserGroupMembershipsRequest.Builder>,
                        ListUserGroupMembershipsRequest>() {
                    @Override
                    public ListUserGroupMembershipsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUserGroupMembershipsRequest.Builder>
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
                        ListUserGroupMembershipsRequest, ListUserGroupMembershipsResponse>() {
                    @Override
                    public ListUserGroupMembershipsResponse apply(
                            ListUserGroupMembershipsRequest request) {
                        return client.listUserGroupMemberships(request);
                    }
                },
                new com.google.common.base.Function<
                        ListUserGroupMembershipsResponse,
                        java.util.List<com.oracle.bmc.identity.model.UserGroupMembership>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.identity.model.UserGroupMembership> apply(
                            ListUserGroupMembershipsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listUsers operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListUsersResponse> listUsersResponseIterator(final ListUsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListUsersRequest.Builder, ListUsersRequest, ListUsersResponse>(
                new com.google.common.base.Supplier<ListUsersRequest.Builder>() {
                    @Override
                    public ListUsersRequest.Builder get() {
                        return ListUsersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListUsersResponse, String>() {
                    @Override
                    public String apply(ListUsersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUsersRequest.Builder>,
                        ListUsersRequest>() {
                    @Override
                    public ListUsersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUsersRequest.Builder>
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
                new com.google.common.base.Function<ListUsersRequest, ListUsersResponse>() {
                    @Override
                    public ListUsersResponse apply(ListUsersRequest request) {
                        return client.listUsers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.identity.model.User} objects
     * contained in responses from the listUsers operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.identity.model.User} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.identity.model.User> listUsersRecordIterator(
            final ListUsersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListUsersRequest.Builder, ListUsersRequest, ListUsersResponse,
                com.oracle.bmc.identity.model.User>(
                new com.google.common.base.Supplier<ListUsersRequest.Builder>() {
                    @Override
                    public ListUsersRequest.Builder get() {
                        return ListUsersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListUsersResponse, String>() {
                    @Override
                    public String apply(ListUsersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUsersRequest.Builder>,
                        ListUsersRequest>() {
                    @Override
                    public ListUsersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUsersRequest.Builder>
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
                new com.google.common.base.Function<ListUsersRequest, ListUsersResponse>() {
                    @Override
                    public ListUsersResponse apply(ListUsersRequest request) {
                        return client.listUsers(request);
                    }
                },
                new com.google.common.base.Function<
                        ListUsersResponse, java.util.List<com.oracle.bmc.identity.model.User>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.identity.model.User> apply(
                            ListUsersResponse response) {
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.identity.model.WorkRequestSummary} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.identity.model.WorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.identity.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.identity.model.WorkRequestSummary>(
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
                        java.util.List<com.oracle.bmc.identity.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.identity.model.WorkRequestSummary> apply(
                            ListWorkRequestsResponse response) {
                        return response.getItems();
                    }
                });
    }
}
