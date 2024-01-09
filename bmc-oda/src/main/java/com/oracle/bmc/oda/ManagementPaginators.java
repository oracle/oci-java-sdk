/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda;

import com.oracle.bmc.oda.requests.*;
import com.oracle.bmc.oda.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Management where multiple pages of data may be fetched. Two styles of
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class ManagementPaginators {
    private final Management client;

    public ManagementPaginators(Management client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAuthenticationProviders operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAuthenticationProvidersResponse>
            listAuthenticationProvidersResponseIterator(
                    final ListAuthenticationProvidersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAuthenticationProvidersRequest.Builder,
                ListAuthenticationProvidersRequest,
                ListAuthenticationProvidersResponse>(
                new java.util.function.Supplier<ListAuthenticationProvidersRequest.Builder>() {
                    @Override
                    public ListAuthenticationProvidersRequest.Builder get() {
                        return ListAuthenticationProvidersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAuthenticationProvidersResponse, String>() {
                    @Override
                    public String apply(ListAuthenticationProvidersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuthenticationProvidersRequest.Builder>,
                        ListAuthenticationProvidersRequest>() {
                    @Override
                    public ListAuthenticationProvidersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuthenticationProvidersRequest.Builder>
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
                        ListAuthenticationProvidersRequest, ListAuthenticationProvidersResponse>() {
                    @Override
                    public ListAuthenticationProvidersResponse apply(
                            ListAuthenticationProvidersRequest request) {
                        return client.listAuthenticationProviders(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.oda.model.AuthenticationProviderSummary} objects contained in responses from
     * the listAuthenticationProviders operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.oda.model.AuthenticationProviderSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.oda.model.AuthenticationProviderSummary>
            listAuthenticationProvidersRecordIterator(
                    final ListAuthenticationProvidersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAuthenticationProvidersRequest.Builder,
                ListAuthenticationProvidersRequest,
                ListAuthenticationProvidersResponse,
                com.oracle.bmc.oda.model.AuthenticationProviderSummary>(
                new java.util.function.Supplier<ListAuthenticationProvidersRequest.Builder>() {
                    @Override
                    public ListAuthenticationProvidersRequest.Builder get() {
                        return ListAuthenticationProvidersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAuthenticationProvidersResponse, String>() {
                    @Override
                    public String apply(ListAuthenticationProvidersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuthenticationProvidersRequest.Builder>,
                        ListAuthenticationProvidersRequest>() {
                    @Override
                    public ListAuthenticationProvidersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuthenticationProvidersRequest.Builder>
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
                        ListAuthenticationProvidersRequest, ListAuthenticationProvidersResponse>() {
                    @Override
                    public ListAuthenticationProvidersResponse apply(
                            ListAuthenticationProvidersRequest request) {
                        return client.listAuthenticationProviders(request);
                    }
                },
                new java.util.function.Function<
                        ListAuthenticationProvidersResponse,
                        java.util.List<com.oracle.bmc.oda.model.AuthenticationProviderSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.oda.model.AuthenticationProviderSummary>
                            apply(ListAuthenticationProvidersResponse response) {
                        return response.getAuthenticationProviderCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listChannels
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListChannelsResponse> listChannelsResponseIterator(
            final ListChannelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListChannelsRequest.Builder, ListChannelsRequest, ListChannelsResponse>(
                new java.util.function.Supplier<ListChannelsRequest.Builder>() {
                    @Override
                    public ListChannelsRequest.Builder get() {
                        return ListChannelsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListChannelsResponse, String>() {
                    @Override
                    public String apply(ListChannelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListChannelsRequest.Builder>,
                        ListChannelsRequest>() {
                    @Override
                    public ListChannelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListChannelsRequest.Builder>
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
                new java.util.function.Function<ListChannelsRequest, ListChannelsResponse>() {
                    @Override
                    public ListChannelsResponse apply(ListChannelsRequest request) {
                        return client.listChannels(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.oda.model.ChannelSummary} objects contained in responses from the listChannels
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.oda.model.ChannelSummary} objects contained in responses received from the
     *     service.
     */
    public Iterable<com.oracle.bmc.oda.model.ChannelSummary> listChannelsRecordIterator(
            final ListChannelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListChannelsRequest.Builder,
                ListChannelsRequest,
                ListChannelsResponse,
                com.oracle.bmc.oda.model.ChannelSummary>(
                new java.util.function.Supplier<ListChannelsRequest.Builder>() {
                    @Override
                    public ListChannelsRequest.Builder get() {
                        return ListChannelsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListChannelsResponse, String>() {
                    @Override
                    public String apply(ListChannelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListChannelsRequest.Builder>,
                        ListChannelsRequest>() {
                    @Override
                    public ListChannelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListChannelsRequest.Builder>
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
                new java.util.function.Function<ListChannelsRequest, ListChannelsResponse>() {
                    @Override
                    public ListChannelsResponse apply(ListChannelsRequest request) {
                        return client.listChannels(request);
                    }
                },
                new java.util.function.Function<
                        ListChannelsResponse,
                        java.util.List<com.oracle.bmc.oda.model.ChannelSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.oda.model.ChannelSummary> apply(
                            ListChannelsResponse response) {
                        return response.getChannelCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDigitalAssistantParameters operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDigitalAssistantParametersResponse>
            listDigitalAssistantParametersResponseIterator(
                    final ListDigitalAssistantParametersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDigitalAssistantParametersRequest.Builder,
                ListDigitalAssistantParametersRequest,
                ListDigitalAssistantParametersResponse>(
                new java.util.function.Supplier<ListDigitalAssistantParametersRequest.Builder>() {
                    @Override
                    public ListDigitalAssistantParametersRequest.Builder get() {
                        return ListDigitalAssistantParametersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDigitalAssistantParametersResponse, String>() {
                    @Override
                    public String apply(ListDigitalAssistantParametersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDigitalAssistantParametersRequest.Builder>,
                        ListDigitalAssistantParametersRequest>() {
                    @Override
                    public ListDigitalAssistantParametersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDigitalAssistantParametersRequest.Builder>
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
                        ListDigitalAssistantParametersRequest,
                        ListDigitalAssistantParametersResponse>() {
                    @Override
                    public ListDigitalAssistantParametersResponse apply(
                            ListDigitalAssistantParametersRequest request) {
                        return client.listDigitalAssistantParameters(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.oda.model.DigitalAssistantParameterSummary} objects contained in responses
     * from the listDigitalAssistantParameters operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.oda.model.DigitalAssistantParameterSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.oda.model.DigitalAssistantParameterSummary>
            listDigitalAssistantParametersRecordIterator(
                    final ListDigitalAssistantParametersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDigitalAssistantParametersRequest.Builder,
                ListDigitalAssistantParametersRequest,
                ListDigitalAssistantParametersResponse,
                com.oracle.bmc.oda.model.DigitalAssistantParameterSummary>(
                new java.util.function.Supplier<ListDigitalAssistantParametersRequest.Builder>() {
                    @Override
                    public ListDigitalAssistantParametersRequest.Builder get() {
                        return ListDigitalAssistantParametersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDigitalAssistantParametersResponse, String>() {
                    @Override
                    public String apply(ListDigitalAssistantParametersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDigitalAssistantParametersRequest.Builder>,
                        ListDigitalAssistantParametersRequest>() {
                    @Override
                    public ListDigitalAssistantParametersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDigitalAssistantParametersRequest.Builder>
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
                        ListDigitalAssistantParametersRequest,
                        ListDigitalAssistantParametersResponse>() {
                    @Override
                    public ListDigitalAssistantParametersResponse apply(
                            ListDigitalAssistantParametersRequest request) {
                        return client.listDigitalAssistantParameters(request);
                    }
                },
                new java.util.function.Function<
                        ListDigitalAssistantParametersResponse,
                        java.util.List<
                                com.oracle.bmc.oda.model.DigitalAssistantParameterSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.oda.model.DigitalAssistantParameterSummary>
                            apply(ListDigitalAssistantParametersResponse response) {
                        return response.getDigitalAssistantParameterCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDigitalAssistants operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDigitalAssistantsResponse> listDigitalAssistantsResponseIterator(
            final ListDigitalAssistantsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDigitalAssistantsRequest.Builder,
                ListDigitalAssistantsRequest,
                ListDigitalAssistantsResponse>(
                new java.util.function.Supplier<ListDigitalAssistantsRequest.Builder>() {
                    @Override
                    public ListDigitalAssistantsRequest.Builder get() {
                        return ListDigitalAssistantsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDigitalAssistantsResponse, String>() {
                    @Override
                    public String apply(ListDigitalAssistantsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDigitalAssistantsRequest.Builder>,
                        ListDigitalAssistantsRequest>() {
                    @Override
                    public ListDigitalAssistantsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDigitalAssistantsRequest.Builder>
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
                        ListDigitalAssistantsRequest, ListDigitalAssistantsResponse>() {
                    @Override
                    public ListDigitalAssistantsResponse apply(
                            ListDigitalAssistantsRequest request) {
                        return client.listDigitalAssistants(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.oda.model.DigitalAssistantSummary} objects contained in responses from the
     * listDigitalAssistants operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.oda.model.DigitalAssistantSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.oda.model.DigitalAssistantSummary>
            listDigitalAssistantsRecordIterator(final ListDigitalAssistantsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDigitalAssistantsRequest.Builder,
                ListDigitalAssistantsRequest,
                ListDigitalAssistantsResponse,
                com.oracle.bmc.oda.model.DigitalAssistantSummary>(
                new java.util.function.Supplier<ListDigitalAssistantsRequest.Builder>() {
                    @Override
                    public ListDigitalAssistantsRequest.Builder get() {
                        return ListDigitalAssistantsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDigitalAssistantsResponse, String>() {
                    @Override
                    public String apply(ListDigitalAssistantsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDigitalAssistantsRequest.Builder>,
                        ListDigitalAssistantsRequest>() {
                    @Override
                    public ListDigitalAssistantsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDigitalAssistantsRequest.Builder>
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
                        ListDigitalAssistantsRequest, ListDigitalAssistantsResponse>() {
                    @Override
                    public ListDigitalAssistantsResponse apply(
                            ListDigitalAssistantsRequest request) {
                        return client.listDigitalAssistants(request);
                    }
                },
                new java.util.function.Function<
                        ListDigitalAssistantsResponse,
                        java.util.List<com.oracle.bmc.oda.model.DigitalAssistantSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.oda.model.DigitalAssistantSummary> apply(
                            ListDigitalAssistantsResponse response) {
                        return response.getDigitalAssistantCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listOdaPrivateEndpointAttachments operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListOdaPrivateEndpointAttachmentsResponse>
            listOdaPrivateEndpointAttachmentsResponseIterator(
                    final ListOdaPrivateEndpointAttachmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOdaPrivateEndpointAttachmentsRequest.Builder,
                ListOdaPrivateEndpointAttachmentsRequest,
                ListOdaPrivateEndpointAttachmentsResponse>(
                new java.util.function.Supplier<
                        ListOdaPrivateEndpointAttachmentsRequest.Builder>() {
                    @Override
                    public ListOdaPrivateEndpointAttachmentsRequest.Builder get() {
                        return ListOdaPrivateEndpointAttachmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListOdaPrivateEndpointAttachmentsResponse, String>() {
                    @Override
                    public String apply(ListOdaPrivateEndpointAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOdaPrivateEndpointAttachmentsRequest.Builder>,
                        ListOdaPrivateEndpointAttachmentsRequest>() {
                    @Override
                    public ListOdaPrivateEndpointAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOdaPrivateEndpointAttachmentsRequest.Builder>
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
                        ListOdaPrivateEndpointAttachmentsRequest,
                        ListOdaPrivateEndpointAttachmentsResponse>() {
                    @Override
                    public ListOdaPrivateEndpointAttachmentsResponse apply(
                            ListOdaPrivateEndpointAttachmentsRequest request) {
                        return client.listOdaPrivateEndpointAttachments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.oda.model.OdaPrivateEndpointAttachmentSummary} objects contained in responses
     * from the listOdaPrivateEndpointAttachments operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.oda.model.OdaPrivateEndpointAttachmentSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.oda.model.OdaPrivateEndpointAttachmentSummary>
            listOdaPrivateEndpointAttachmentsRecordIterator(
                    final ListOdaPrivateEndpointAttachmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOdaPrivateEndpointAttachmentsRequest.Builder,
                ListOdaPrivateEndpointAttachmentsRequest,
                ListOdaPrivateEndpointAttachmentsResponse,
                com.oracle.bmc.oda.model.OdaPrivateEndpointAttachmentSummary>(
                new java.util.function.Supplier<
                        ListOdaPrivateEndpointAttachmentsRequest.Builder>() {
                    @Override
                    public ListOdaPrivateEndpointAttachmentsRequest.Builder get() {
                        return ListOdaPrivateEndpointAttachmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListOdaPrivateEndpointAttachmentsResponse, String>() {
                    @Override
                    public String apply(ListOdaPrivateEndpointAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOdaPrivateEndpointAttachmentsRequest.Builder>,
                        ListOdaPrivateEndpointAttachmentsRequest>() {
                    @Override
                    public ListOdaPrivateEndpointAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOdaPrivateEndpointAttachmentsRequest.Builder>
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
                        ListOdaPrivateEndpointAttachmentsRequest,
                        ListOdaPrivateEndpointAttachmentsResponse>() {
                    @Override
                    public ListOdaPrivateEndpointAttachmentsResponse apply(
                            ListOdaPrivateEndpointAttachmentsRequest request) {
                        return client.listOdaPrivateEndpointAttachments(request);
                    }
                },
                new java.util.function.Function<
                        ListOdaPrivateEndpointAttachmentsResponse,
                        java.util.List<
                                com.oracle.bmc.oda.model.OdaPrivateEndpointAttachmentSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.oda.model.OdaPrivateEndpointAttachmentSummary>
                            apply(ListOdaPrivateEndpointAttachmentsResponse response) {
                        return response.getOdaPrivateEndpointAttachmentCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listOdaPrivateEndpointScanProxies operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListOdaPrivateEndpointScanProxiesResponse>
            listOdaPrivateEndpointScanProxiesResponseIterator(
                    final ListOdaPrivateEndpointScanProxiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOdaPrivateEndpointScanProxiesRequest.Builder,
                ListOdaPrivateEndpointScanProxiesRequest,
                ListOdaPrivateEndpointScanProxiesResponse>(
                new java.util.function.Supplier<
                        ListOdaPrivateEndpointScanProxiesRequest.Builder>() {
                    @Override
                    public ListOdaPrivateEndpointScanProxiesRequest.Builder get() {
                        return ListOdaPrivateEndpointScanProxiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListOdaPrivateEndpointScanProxiesResponse, String>() {
                    @Override
                    public String apply(ListOdaPrivateEndpointScanProxiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOdaPrivateEndpointScanProxiesRequest.Builder>,
                        ListOdaPrivateEndpointScanProxiesRequest>() {
                    @Override
                    public ListOdaPrivateEndpointScanProxiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOdaPrivateEndpointScanProxiesRequest.Builder>
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
                        ListOdaPrivateEndpointScanProxiesRequest,
                        ListOdaPrivateEndpointScanProxiesResponse>() {
                    @Override
                    public ListOdaPrivateEndpointScanProxiesResponse apply(
                            ListOdaPrivateEndpointScanProxiesRequest request) {
                        return client.listOdaPrivateEndpointScanProxies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.oda.model.OdaPrivateEndpointScanProxySummary} objects contained in responses
     * from the listOdaPrivateEndpointScanProxies operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.oda.model.OdaPrivateEndpointScanProxySummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.oda.model.OdaPrivateEndpointScanProxySummary>
            listOdaPrivateEndpointScanProxiesRecordIterator(
                    final ListOdaPrivateEndpointScanProxiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOdaPrivateEndpointScanProxiesRequest.Builder,
                ListOdaPrivateEndpointScanProxiesRequest,
                ListOdaPrivateEndpointScanProxiesResponse,
                com.oracle.bmc.oda.model.OdaPrivateEndpointScanProxySummary>(
                new java.util.function.Supplier<
                        ListOdaPrivateEndpointScanProxiesRequest.Builder>() {
                    @Override
                    public ListOdaPrivateEndpointScanProxiesRequest.Builder get() {
                        return ListOdaPrivateEndpointScanProxiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListOdaPrivateEndpointScanProxiesResponse, String>() {
                    @Override
                    public String apply(ListOdaPrivateEndpointScanProxiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOdaPrivateEndpointScanProxiesRequest.Builder>,
                        ListOdaPrivateEndpointScanProxiesRequest>() {
                    @Override
                    public ListOdaPrivateEndpointScanProxiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOdaPrivateEndpointScanProxiesRequest.Builder>
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
                        ListOdaPrivateEndpointScanProxiesRequest,
                        ListOdaPrivateEndpointScanProxiesResponse>() {
                    @Override
                    public ListOdaPrivateEndpointScanProxiesResponse apply(
                            ListOdaPrivateEndpointScanProxiesRequest request) {
                        return client.listOdaPrivateEndpointScanProxies(request);
                    }
                },
                new java.util.function.Function<
                        ListOdaPrivateEndpointScanProxiesResponse,
                        java.util.List<
                                com.oracle.bmc.oda.model.OdaPrivateEndpointScanProxySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.oda.model.OdaPrivateEndpointScanProxySummary>
                            apply(ListOdaPrivateEndpointScanProxiesResponse response) {
                        return response.getOdaPrivateEndpointScanProxyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listOdaPrivateEndpoints operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListOdaPrivateEndpointsResponse> listOdaPrivateEndpointsResponseIterator(
            final ListOdaPrivateEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOdaPrivateEndpointsRequest.Builder,
                ListOdaPrivateEndpointsRequest,
                ListOdaPrivateEndpointsResponse>(
                new java.util.function.Supplier<ListOdaPrivateEndpointsRequest.Builder>() {
                    @Override
                    public ListOdaPrivateEndpointsRequest.Builder get() {
                        return ListOdaPrivateEndpointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOdaPrivateEndpointsResponse, String>() {
                    @Override
                    public String apply(ListOdaPrivateEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOdaPrivateEndpointsRequest.Builder>,
                        ListOdaPrivateEndpointsRequest>() {
                    @Override
                    public ListOdaPrivateEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOdaPrivateEndpointsRequest.Builder>
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
                        ListOdaPrivateEndpointsRequest, ListOdaPrivateEndpointsResponse>() {
                    @Override
                    public ListOdaPrivateEndpointsResponse apply(
                            ListOdaPrivateEndpointsRequest request) {
                        return client.listOdaPrivateEndpoints(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.oda.model.OdaPrivateEndpointSummary} objects contained in responses from the
     * listOdaPrivateEndpoints operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.oda.model.OdaPrivateEndpointSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.oda.model.OdaPrivateEndpointSummary>
            listOdaPrivateEndpointsRecordIterator(final ListOdaPrivateEndpointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOdaPrivateEndpointsRequest.Builder,
                ListOdaPrivateEndpointsRequest,
                ListOdaPrivateEndpointsResponse,
                com.oracle.bmc.oda.model.OdaPrivateEndpointSummary>(
                new java.util.function.Supplier<ListOdaPrivateEndpointsRequest.Builder>() {
                    @Override
                    public ListOdaPrivateEndpointsRequest.Builder get() {
                        return ListOdaPrivateEndpointsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOdaPrivateEndpointsResponse, String>() {
                    @Override
                    public String apply(ListOdaPrivateEndpointsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOdaPrivateEndpointsRequest.Builder>,
                        ListOdaPrivateEndpointsRequest>() {
                    @Override
                    public ListOdaPrivateEndpointsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOdaPrivateEndpointsRequest.Builder>
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
                        ListOdaPrivateEndpointsRequest, ListOdaPrivateEndpointsResponse>() {
                    @Override
                    public ListOdaPrivateEndpointsResponse apply(
                            ListOdaPrivateEndpointsRequest request) {
                        return client.listOdaPrivateEndpoints(request);
                    }
                },
                new java.util.function.Function<
                        ListOdaPrivateEndpointsResponse,
                        java.util.List<com.oracle.bmc.oda.model.OdaPrivateEndpointSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.oda.model.OdaPrivateEndpointSummary> apply(
                            ListOdaPrivateEndpointsResponse response) {
                        return response.getOdaPrivateEndpointCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSkillParameters operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSkillParametersResponse> listSkillParametersResponseIterator(
            final ListSkillParametersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSkillParametersRequest.Builder,
                ListSkillParametersRequest,
                ListSkillParametersResponse>(
                new java.util.function.Supplier<ListSkillParametersRequest.Builder>() {
                    @Override
                    public ListSkillParametersRequest.Builder get() {
                        return ListSkillParametersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSkillParametersResponse, String>() {
                    @Override
                    public String apply(ListSkillParametersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSkillParametersRequest.Builder>,
                        ListSkillParametersRequest>() {
                    @Override
                    public ListSkillParametersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSkillParametersRequest.Builder>
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
                        ListSkillParametersRequest, ListSkillParametersResponse>() {
                    @Override
                    public ListSkillParametersResponse apply(ListSkillParametersRequest request) {
                        return client.listSkillParameters(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.oda.model.SkillParameterSummary} objects contained in responses from the
     * listSkillParameters operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.oda.model.SkillParameterSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.oda.model.SkillParameterSummary>
            listSkillParametersRecordIterator(final ListSkillParametersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSkillParametersRequest.Builder,
                ListSkillParametersRequest,
                ListSkillParametersResponse,
                com.oracle.bmc.oda.model.SkillParameterSummary>(
                new java.util.function.Supplier<ListSkillParametersRequest.Builder>() {
                    @Override
                    public ListSkillParametersRequest.Builder get() {
                        return ListSkillParametersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSkillParametersResponse, String>() {
                    @Override
                    public String apply(ListSkillParametersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSkillParametersRequest.Builder>,
                        ListSkillParametersRequest>() {
                    @Override
                    public ListSkillParametersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSkillParametersRequest.Builder>
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
                        ListSkillParametersRequest, ListSkillParametersResponse>() {
                    @Override
                    public ListSkillParametersResponse apply(ListSkillParametersRequest request) {
                        return client.listSkillParameters(request);
                    }
                },
                new java.util.function.Function<
                        ListSkillParametersResponse,
                        java.util.List<com.oracle.bmc.oda.model.SkillParameterSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.oda.model.SkillParameterSummary> apply(
                            ListSkillParametersResponse response) {
                        return response.getSkillParameterCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSkills
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSkillsResponse> listSkillsResponseIterator(
            final ListSkillsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSkillsRequest.Builder, ListSkillsRequest, ListSkillsResponse>(
                new java.util.function.Supplier<ListSkillsRequest.Builder>() {
                    @Override
                    public ListSkillsRequest.Builder get() {
                        return ListSkillsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSkillsResponse, String>() {
                    @Override
                    public String apply(ListSkillsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSkillsRequest.Builder>,
                        ListSkillsRequest>() {
                    @Override
                    public ListSkillsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSkillsRequest.Builder>
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
                new java.util.function.Function<ListSkillsRequest, ListSkillsResponse>() {
                    @Override
                    public ListSkillsResponse apply(ListSkillsRequest request) {
                        return client.listSkills(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.oda.model.SkillSummary} objects contained in responses from the listSkills
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.oda.model.SkillSummary} objects contained in responses received from the
     *     service.
     */
    public Iterable<com.oracle.bmc.oda.model.SkillSummary> listSkillsRecordIterator(
            final ListSkillsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSkillsRequest.Builder,
                ListSkillsRequest,
                ListSkillsResponse,
                com.oracle.bmc.oda.model.SkillSummary>(
                new java.util.function.Supplier<ListSkillsRequest.Builder>() {
                    @Override
                    public ListSkillsRequest.Builder get() {
                        return ListSkillsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSkillsResponse, String>() {
                    @Override
                    public String apply(ListSkillsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSkillsRequest.Builder>,
                        ListSkillsRequest>() {
                    @Override
                    public ListSkillsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSkillsRequest.Builder>
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
                new java.util.function.Function<ListSkillsRequest, ListSkillsResponse>() {
                    @Override
                    public ListSkillsResponse apply(ListSkillsRequest request) {
                        return client.listSkills(request);
                    }
                },
                new java.util.function.Function<
                        ListSkillsResponse,
                        java.util.List<com.oracle.bmc.oda.model.SkillSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.oda.model.SkillSummary> apply(
                            ListSkillsResponse response) {
                        return response.getSkillCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listTranslators operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListTranslatorsResponse> listTranslatorsResponseIterator(
            final ListTranslatorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTranslatorsRequest.Builder, ListTranslatorsRequest, ListTranslatorsResponse>(
                new java.util.function.Supplier<ListTranslatorsRequest.Builder>() {
                    @Override
                    public ListTranslatorsRequest.Builder get() {
                        return ListTranslatorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTranslatorsResponse, String>() {
                    @Override
                    public String apply(ListTranslatorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTranslatorsRequest.Builder>,
                        ListTranslatorsRequest>() {
                    @Override
                    public ListTranslatorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTranslatorsRequest.Builder>
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
                new java.util.function.Function<ListTranslatorsRequest, ListTranslatorsResponse>() {
                    @Override
                    public ListTranslatorsResponse apply(ListTranslatorsRequest request) {
                        return client.listTranslators(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.oda.model.TranslatorSummary} objects contained in responses from the
     * listTranslators operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.oda.model.TranslatorSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.oda.model.TranslatorSummary> listTranslatorsRecordIterator(
            final ListTranslatorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTranslatorsRequest.Builder,
                ListTranslatorsRequest,
                ListTranslatorsResponse,
                com.oracle.bmc.oda.model.TranslatorSummary>(
                new java.util.function.Supplier<ListTranslatorsRequest.Builder>() {
                    @Override
                    public ListTranslatorsRequest.Builder get() {
                        return ListTranslatorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTranslatorsResponse, String>() {
                    @Override
                    public String apply(ListTranslatorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTranslatorsRequest.Builder>,
                        ListTranslatorsRequest>() {
                    @Override
                    public ListTranslatorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTranslatorsRequest.Builder>
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
                new java.util.function.Function<ListTranslatorsRequest, ListTranslatorsResponse>() {
                    @Override
                    public ListTranslatorsResponse apply(ListTranslatorsRequest request) {
                        return client.listTranslators(request);
                    }
                },
                new java.util.function.Function<
                        ListTranslatorsResponse,
                        java.util.List<com.oracle.bmc.oda.model.TranslatorSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.oda.model.TranslatorSummary> apply(
                            ListTranslatorsResponse response) {
                        return response.getTranslatorCollection().getItems();
                    }
                });
    }
}
