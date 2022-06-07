/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda;

import com.oracle.bmc.oda.requests.*;
import com.oracle.bmc.oda.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Management where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class ManagementPaginators {
    private final Management client;

    public ManagementPaginators(Management client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAuthenticationProviders operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAuthenticationProvidersResponse>
            listAuthenticationProvidersResponseIterator(
                    final ListAuthenticationProvidersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAuthenticationProvidersRequest.Builder, ListAuthenticationProvidersRequest,
                ListAuthenticationProvidersResponse>(
                new com.google.common.base.Supplier<ListAuthenticationProvidersRequest.Builder>() {
                    @Override
                    public ListAuthenticationProvidersRequest.Builder get() {
                        return ListAuthenticationProvidersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAuthenticationProvidersResponse, String>() {
                    @Override
                    public String apply(ListAuthenticationProvidersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuthenticationProvidersRequest.Builder>,
                        ListAuthenticationProvidersRequest>() {
                    @Override
                    public ListAuthenticationProvidersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuthenticationProvidersRequest.Builder>
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
                        ListAuthenticationProvidersRequest, ListAuthenticationProvidersResponse>() {
                    @Override
                    public ListAuthenticationProvidersResponse apply(
                            ListAuthenticationProvidersRequest request) {
                        return client.listAuthenticationProviders(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.oda.model.AuthenticationProviderSummary} objects
     * contained in responses from the listAuthenticationProviders operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.oda.model.AuthenticationProviderSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.oda.model.AuthenticationProviderSummary>
            listAuthenticationProvidersRecordIterator(
                    final ListAuthenticationProvidersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAuthenticationProvidersRequest.Builder, ListAuthenticationProvidersRequest,
                ListAuthenticationProvidersResponse,
                com.oracle.bmc.oda.model.AuthenticationProviderSummary>(
                new com.google.common.base.Supplier<ListAuthenticationProvidersRequest.Builder>() {
                    @Override
                    public ListAuthenticationProvidersRequest.Builder get() {
                        return ListAuthenticationProvidersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAuthenticationProvidersResponse, String>() {
                    @Override
                    public String apply(ListAuthenticationProvidersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAuthenticationProvidersRequest.Builder>,
                        ListAuthenticationProvidersRequest>() {
                    @Override
                    public ListAuthenticationProvidersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAuthenticationProvidersRequest.Builder>
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
                        ListAuthenticationProvidersRequest, ListAuthenticationProvidersResponse>() {
                    @Override
                    public ListAuthenticationProvidersResponse apply(
                            ListAuthenticationProvidersRequest request) {
                        return client.listAuthenticationProviders(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listChannels operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListChannelsResponse> listChannelsResponseIterator(
            final ListChannelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListChannelsRequest.Builder, ListChannelsRequest, ListChannelsResponse>(
                new com.google.common.base.Supplier<ListChannelsRequest.Builder>() {
                    @Override
                    public ListChannelsRequest.Builder get() {
                        return ListChannelsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListChannelsResponse, String>() {
                    @Override
                    public String apply(ListChannelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListChannelsRequest.Builder>,
                        ListChannelsRequest>() {
                    @Override
                    public ListChannelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListChannelsRequest.Builder>
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
                new com.google.common.base.Function<ListChannelsRequest, ListChannelsResponse>() {
                    @Override
                    public ListChannelsResponse apply(ListChannelsRequest request) {
                        return client.listChannels(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.oda.model.ChannelSummary} objects
     * contained in responses from the listChannels operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.oda.model.ChannelSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.oda.model.ChannelSummary> listChannelsRecordIterator(
            final ListChannelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListChannelsRequest.Builder, ListChannelsRequest, ListChannelsResponse,
                com.oracle.bmc.oda.model.ChannelSummary>(
                new com.google.common.base.Supplier<ListChannelsRequest.Builder>() {
                    @Override
                    public ListChannelsRequest.Builder get() {
                        return ListChannelsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListChannelsResponse, String>() {
                    @Override
                    public String apply(ListChannelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListChannelsRequest.Builder>,
                        ListChannelsRequest>() {
                    @Override
                    public ListChannelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListChannelsRequest.Builder>
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
                new com.google.common.base.Function<ListChannelsRequest, ListChannelsResponse>() {
                    @Override
                    public ListChannelsResponse apply(ListChannelsRequest request) {
                        return client.listChannels(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listDigitalAssistantParameters operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDigitalAssistantParametersResponse>
            listDigitalAssistantParametersResponseIterator(
                    final ListDigitalAssistantParametersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDigitalAssistantParametersRequest.Builder,
                ListDigitalAssistantParametersRequest, ListDigitalAssistantParametersResponse>(
                new com.google.common.base.Supplier<
                        ListDigitalAssistantParametersRequest.Builder>() {
                    @Override
                    public ListDigitalAssistantParametersRequest.Builder get() {
                        return ListDigitalAssistantParametersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDigitalAssistantParametersResponse, String>() {
                    @Override
                    public String apply(ListDigitalAssistantParametersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDigitalAssistantParametersRequest.Builder>,
                        ListDigitalAssistantParametersRequest>() {
                    @Override
                    public ListDigitalAssistantParametersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDigitalAssistantParametersRequest.Builder>
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.oda.model.DigitalAssistantParameterSummary} objects
     * contained in responses from the listDigitalAssistantParameters operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.oda.model.DigitalAssistantParameterSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.oda.model.DigitalAssistantParameterSummary>
            listDigitalAssistantParametersRecordIterator(
                    final ListDigitalAssistantParametersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDigitalAssistantParametersRequest.Builder,
                ListDigitalAssistantParametersRequest, ListDigitalAssistantParametersResponse,
                com.oracle.bmc.oda.model.DigitalAssistantParameterSummary>(
                new com.google.common.base.Supplier<
                        ListDigitalAssistantParametersRequest.Builder>() {
                    @Override
                    public ListDigitalAssistantParametersRequest.Builder get() {
                        return ListDigitalAssistantParametersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDigitalAssistantParametersResponse, String>() {
                    @Override
                    public String apply(ListDigitalAssistantParametersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDigitalAssistantParametersRequest.Builder>,
                        ListDigitalAssistantParametersRequest>() {
                    @Override
                    public ListDigitalAssistantParametersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDigitalAssistantParametersRequest.Builder>
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
                        ListDigitalAssistantParametersRequest,
                        ListDigitalAssistantParametersResponse>() {
                    @Override
                    public ListDigitalAssistantParametersResponse apply(
                            ListDigitalAssistantParametersRequest request) {
                        return client.listDigitalAssistantParameters(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listDigitalAssistants operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDigitalAssistantsResponse> listDigitalAssistantsResponseIterator(
            final ListDigitalAssistantsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDigitalAssistantsRequest.Builder, ListDigitalAssistantsRequest,
                ListDigitalAssistantsResponse>(
                new com.google.common.base.Supplier<ListDigitalAssistantsRequest.Builder>() {
                    @Override
                    public ListDigitalAssistantsRequest.Builder get() {
                        return ListDigitalAssistantsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDigitalAssistantsResponse, String>() {
                    @Override
                    public String apply(ListDigitalAssistantsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDigitalAssistantsRequest.Builder>,
                        ListDigitalAssistantsRequest>() {
                    @Override
                    public ListDigitalAssistantsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDigitalAssistantsRequest.Builder>
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
                        ListDigitalAssistantsRequest, ListDigitalAssistantsResponse>() {
                    @Override
                    public ListDigitalAssistantsResponse apply(
                            ListDigitalAssistantsRequest request) {
                        return client.listDigitalAssistants(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.oda.model.DigitalAssistantSummary} objects
     * contained in responses from the listDigitalAssistants operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.oda.model.DigitalAssistantSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.oda.model.DigitalAssistantSummary>
            listDigitalAssistantsRecordIterator(final ListDigitalAssistantsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDigitalAssistantsRequest.Builder, ListDigitalAssistantsRequest,
                ListDigitalAssistantsResponse, com.oracle.bmc.oda.model.DigitalAssistantSummary>(
                new com.google.common.base.Supplier<ListDigitalAssistantsRequest.Builder>() {
                    @Override
                    public ListDigitalAssistantsRequest.Builder get() {
                        return ListDigitalAssistantsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDigitalAssistantsResponse, String>() {
                    @Override
                    public String apply(ListDigitalAssistantsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDigitalAssistantsRequest.Builder>,
                        ListDigitalAssistantsRequest>() {
                    @Override
                    public ListDigitalAssistantsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDigitalAssistantsRequest.Builder>
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
                        ListDigitalAssistantsRequest, ListDigitalAssistantsResponse>() {
                    @Override
                    public ListDigitalAssistantsResponse apply(
                            ListDigitalAssistantsRequest request) {
                        return client.listDigitalAssistants(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listSkillParameters operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSkillParametersResponse> listSkillParametersResponseIterator(
            final ListSkillParametersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSkillParametersRequest.Builder, ListSkillParametersRequest,
                ListSkillParametersResponse>(
                new com.google.common.base.Supplier<ListSkillParametersRequest.Builder>() {
                    @Override
                    public ListSkillParametersRequest.Builder get() {
                        return ListSkillParametersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSkillParametersResponse, String>() {
                    @Override
                    public String apply(ListSkillParametersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSkillParametersRequest.Builder>,
                        ListSkillParametersRequest>() {
                    @Override
                    public ListSkillParametersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSkillParametersRequest.Builder>
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
                        ListSkillParametersRequest, ListSkillParametersResponse>() {
                    @Override
                    public ListSkillParametersResponse apply(ListSkillParametersRequest request) {
                        return client.listSkillParameters(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.oda.model.SkillParameterSummary} objects
     * contained in responses from the listSkillParameters operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.oda.model.SkillParameterSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.oda.model.SkillParameterSummary>
            listSkillParametersRecordIterator(final ListSkillParametersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSkillParametersRequest.Builder, ListSkillParametersRequest,
                ListSkillParametersResponse, com.oracle.bmc.oda.model.SkillParameterSummary>(
                new com.google.common.base.Supplier<ListSkillParametersRequest.Builder>() {
                    @Override
                    public ListSkillParametersRequest.Builder get() {
                        return ListSkillParametersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSkillParametersResponse, String>() {
                    @Override
                    public String apply(ListSkillParametersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSkillParametersRequest.Builder>,
                        ListSkillParametersRequest>() {
                    @Override
                    public ListSkillParametersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSkillParametersRequest.Builder>
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
                        ListSkillParametersRequest, ListSkillParametersResponse>() {
                    @Override
                    public ListSkillParametersResponse apply(ListSkillParametersRequest request) {
                        return client.listSkillParameters(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listSkills operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSkillsResponse> listSkillsResponseIterator(
            final ListSkillsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSkillsRequest.Builder, ListSkillsRequest, ListSkillsResponse>(
                new com.google.common.base.Supplier<ListSkillsRequest.Builder>() {
                    @Override
                    public ListSkillsRequest.Builder get() {
                        return ListSkillsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSkillsResponse, String>() {
                    @Override
                    public String apply(ListSkillsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSkillsRequest.Builder>,
                        ListSkillsRequest>() {
                    @Override
                    public ListSkillsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSkillsRequest.Builder>
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
                new com.google.common.base.Function<ListSkillsRequest, ListSkillsResponse>() {
                    @Override
                    public ListSkillsResponse apply(ListSkillsRequest request) {
                        return client.listSkills(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.oda.model.SkillSummary} objects
     * contained in responses from the listSkills operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.oda.model.SkillSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.oda.model.SkillSummary> listSkillsRecordIterator(
            final ListSkillsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSkillsRequest.Builder, ListSkillsRequest, ListSkillsResponse,
                com.oracle.bmc.oda.model.SkillSummary>(
                new com.google.common.base.Supplier<ListSkillsRequest.Builder>() {
                    @Override
                    public ListSkillsRequest.Builder get() {
                        return ListSkillsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSkillsResponse, String>() {
                    @Override
                    public String apply(ListSkillsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSkillsRequest.Builder>,
                        ListSkillsRequest>() {
                    @Override
                    public ListSkillsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSkillsRequest.Builder>
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
                new com.google.common.base.Function<ListSkillsRequest, ListSkillsResponse>() {
                    @Override
                    public ListSkillsResponse apply(ListSkillsRequest request) {
                        return client.listSkills(request);
                    }
                },
                new com.google.common.base.Function<
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
     * Creates a new iterable which will iterate over the responses received from the listTranslators operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTranslatorsResponse> listTranslatorsResponseIterator(
            final ListTranslatorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTranslatorsRequest.Builder, ListTranslatorsRequest, ListTranslatorsResponse>(
                new com.google.common.base.Supplier<ListTranslatorsRequest.Builder>() {
                    @Override
                    public ListTranslatorsRequest.Builder get() {
                        return ListTranslatorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTranslatorsResponse, String>() {
                    @Override
                    public String apply(ListTranslatorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTranslatorsRequest.Builder>,
                        ListTranslatorsRequest>() {
                    @Override
                    public ListTranslatorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTranslatorsRequest.Builder>
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
                        ListTranslatorsRequest, ListTranslatorsResponse>() {
                    @Override
                    public ListTranslatorsResponse apply(ListTranslatorsRequest request) {
                        return client.listTranslators(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.oda.model.TranslatorSummary} objects
     * contained in responses from the listTranslators operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.oda.model.TranslatorSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.oda.model.TranslatorSummary> listTranslatorsRecordIterator(
            final ListTranslatorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTranslatorsRequest.Builder, ListTranslatorsRequest, ListTranslatorsResponse,
                com.oracle.bmc.oda.model.TranslatorSummary>(
                new com.google.common.base.Supplier<ListTranslatorsRequest.Builder>() {
                    @Override
                    public ListTranslatorsRequest.Builder get() {
                        return ListTranslatorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTranslatorsResponse, String>() {
                    @Override
                    public String apply(ListTranslatorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTranslatorsRequest.Builder>,
                        ListTranslatorsRequest>() {
                    @Override
                    public ListTranslatorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTranslatorsRequest.Builder>
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
                        ListTranslatorsRequest, ListTranslatorsResponse>() {
                    @Override
                    public ListTranslatorsResponse apply(ListTranslatorsRequest request) {
                        return client.listTranslators(request);
                    }
                },
                new com.google.common.base.Function<
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
