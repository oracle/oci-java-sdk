/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf;

import com.oracle.bmc.waf.requests.*;
import com.oracle.bmc.waf.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Waf where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
public class WafPaginators {
    private final Waf client;

    public WafPaginators(Waf client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listNetworkAddressLists operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListNetworkAddressListsResponse> listNetworkAddressListsResponseIterator(
            final ListNetworkAddressListsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListNetworkAddressListsRequest.Builder, ListNetworkAddressListsRequest,
                ListNetworkAddressListsResponse>(
                new com.google.common.base.Supplier<ListNetworkAddressListsRequest.Builder>() {
                    @Override
                    public ListNetworkAddressListsRequest.Builder get() {
                        return ListNetworkAddressListsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListNetworkAddressListsResponse, String>() {
                    @Override
                    public String apply(ListNetworkAddressListsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNetworkAddressListsRequest.Builder>,
                        ListNetworkAddressListsRequest>() {
                    @Override
                    public ListNetworkAddressListsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNetworkAddressListsRequest.Builder>
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
                        ListNetworkAddressListsRequest, ListNetworkAddressListsResponse>() {
                    @Override
                    public ListNetworkAddressListsResponse apply(
                            ListNetworkAddressListsRequest request) {
                        return client.listNetworkAddressLists(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.waf.model.NetworkAddressListSummary} objects
     * contained in responses from the listNetworkAddressLists operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.waf.model.NetworkAddressListSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.waf.model.NetworkAddressListSummary>
            listNetworkAddressListsRecordIterator(final ListNetworkAddressListsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListNetworkAddressListsRequest.Builder, ListNetworkAddressListsRequest,
                ListNetworkAddressListsResponse,
                com.oracle.bmc.waf.model.NetworkAddressListSummary>(
                new com.google.common.base.Supplier<ListNetworkAddressListsRequest.Builder>() {
                    @Override
                    public ListNetworkAddressListsRequest.Builder get() {
                        return ListNetworkAddressListsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListNetworkAddressListsResponse, String>() {
                    @Override
                    public String apply(ListNetworkAddressListsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNetworkAddressListsRequest.Builder>,
                        ListNetworkAddressListsRequest>() {
                    @Override
                    public ListNetworkAddressListsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNetworkAddressListsRequest.Builder>
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
                        ListNetworkAddressListsRequest, ListNetworkAddressListsResponse>() {
                    @Override
                    public ListNetworkAddressListsResponse apply(
                            ListNetworkAddressListsRequest request) {
                        return client.listNetworkAddressLists(request);
                    }
                },
                new com.google.common.base.Function<
                        ListNetworkAddressListsResponse,
                        java.util.List<com.oracle.bmc.waf.model.NetworkAddressListSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.waf.model.NetworkAddressListSummary> apply(
                            ListNetworkAddressListsResponse response) {
                        return response.getNetworkAddressListCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listProtectionCapabilities operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListProtectionCapabilitiesResponse> listProtectionCapabilitiesResponseIterator(
            final ListProtectionCapabilitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListProtectionCapabilitiesRequest.Builder, ListProtectionCapabilitiesRequest,
                ListProtectionCapabilitiesResponse>(
                new com.google.common.base.Supplier<ListProtectionCapabilitiesRequest.Builder>() {
                    @Override
                    public ListProtectionCapabilitiesRequest.Builder get() {
                        return ListProtectionCapabilitiesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListProtectionCapabilitiesResponse, String>() {
                    @Override
                    public String apply(ListProtectionCapabilitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProtectionCapabilitiesRequest.Builder>,
                        ListProtectionCapabilitiesRequest>() {
                    @Override
                    public ListProtectionCapabilitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProtectionCapabilitiesRequest.Builder>
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
                        ListProtectionCapabilitiesRequest, ListProtectionCapabilitiesResponse>() {
                    @Override
                    public ListProtectionCapabilitiesResponse apply(
                            ListProtectionCapabilitiesRequest request) {
                        return client.listProtectionCapabilities(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.waf.model.ProtectionCapabilitySummary} objects
     * contained in responses from the listProtectionCapabilities operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.waf.model.ProtectionCapabilitySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.waf.model.ProtectionCapabilitySummary>
            listProtectionCapabilitiesRecordIterator(
                    final ListProtectionCapabilitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListProtectionCapabilitiesRequest.Builder, ListProtectionCapabilitiesRequest,
                ListProtectionCapabilitiesResponse,
                com.oracle.bmc.waf.model.ProtectionCapabilitySummary>(
                new com.google.common.base.Supplier<ListProtectionCapabilitiesRequest.Builder>() {
                    @Override
                    public ListProtectionCapabilitiesRequest.Builder get() {
                        return ListProtectionCapabilitiesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListProtectionCapabilitiesResponse, String>() {
                    @Override
                    public String apply(ListProtectionCapabilitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProtectionCapabilitiesRequest.Builder>,
                        ListProtectionCapabilitiesRequest>() {
                    @Override
                    public ListProtectionCapabilitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProtectionCapabilitiesRequest.Builder>
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
                        ListProtectionCapabilitiesRequest, ListProtectionCapabilitiesResponse>() {
                    @Override
                    public ListProtectionCapabilitiesResponse apply(
                            ListProtectionCapabilitiesRequest request) {
                        return client.listProtectionCapabilities(request);
                    }
                },
                new com.google.common.base.Function<
                        ListProtectionCapabilitiesResponse,
                        java.util.List<com.oracle.bmc.waf.model.ProtectionCapabilitySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.waf.model.ProtectionCapabilitySummary>
                            apply(ListProtectionCapabilitiesResponse response) {
                        return response.getProtectionCapabilityCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listProtectionCapabilityGroupTags operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListProtectionCapabilityGroupTagsResponse>
            listProtectionCapabilityGroupTagsResponseIterator(
                    final ListProtectionCapabilityGroupTagsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListProtectionCapabilityGroupTagsRequest.Builder,
                ListProtectionCapabilityGroupTagsRequest,
                ListProtectionCapabilityGroupTagsResponse>(
                new com.google.common.base.Supplier<
                        ListProtectionCapabilityGroupTagsRequest.Builder>() {
                    @Override
                    public ListProtectionCapabilityGroupTagsRequest.Builder get() {
                        return ListProtectionCapabilityGroupTagsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListProtectionCapabilityGroupTagsResponse, String>() {
                    @Override
                    public String apply(ListProtectionCapabilityGroupTagsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProtectionCapabilityGroupTagsRequest.Builder>,
                        ListProtectionCapabilityGroupTagsRequest>() {
                    @Override
                    public ListProtectionCapabilityGroupTagsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProtectionCapabilityGroupTagsRequest.Builder>
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
                        ListProtectionCapabilityGroupTagsRequest,
                        ListProtectionCapabilityGroupTagsResponse>() {
                    @Override
                    public ListProtectionCapabilityGroupTagsResponse apply(
                            ListProtectionCapabilityGroupTagsRequest request) {
                        return client.listProtectionCapabilityGroupTags(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.waf.model.ProtectionCapabilityGroupTagSummary} objects
     * contained in responses from the listProtectionCapabilityGroupTags operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.waf.model.ProtectionCapabilityGroupTagSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.waf.model.ProtectionCapabilityGroupTagSummary>
            listProtectionCapabilityGroupTagsRecordIterator(
                    final ListProtectionCapabilityGroupTagsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListProtectionCapabilityGroupTagsRequest.Builder,
                ListProtectionCapabilityGroupTagsRequest, ListProtectionCapabilityGroupTagsResponse,
                com.oracle.bmc.waf.model.ProtectionCapabilityGroupTagSummary>(
                new com.google.common.base.Supplier<
                        ListProtectionCapabilityGroupTagsRequest.Builder>() {
                    @Override
                    public ListProtectionCapabilityGroupTagsRequest.Builder get() {
                        return ListProtectionCapabilityGroupTagsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListProtectionCapabilityGroupTagsResponse, String>() {
                    @Override
                    public String apply(ListProtectionCapabilityGroupTagsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProtectionCapabilityGroupTagsRequest.Builder>,
                        ListProtectionCapabilityGroupTagsRequest>() {
                    @Override
                    public ListProtectionCapabilityGroupTagsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProtectionCapabilityGroupTagsRequest.Builder>
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
                        ListProtectionCapabilityGroupTagsRequest,
                        ListProtectionCapabilityGroupTagsResponse>() {
                    @Override
                    public ListProtectionCapabilityGroupTagsResponse apply(
                            ListProtectionCapabilityGroupTagsRequest request) {
                        return client.listProtectionCapabilityGroupTags(request);
                    }
                },
                new com.google.common.base.Function<
                        ListProtectionCapabilityGroupTagsResponse,
                        java.util.List<
                                com.oracle.bmc.waf.model.ProtectionCapabilityGroupTagSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.waf.model.ProtectionCapabilityGroupTagSummary>
                            apply(ListProtectionCapabilityGroupTagsResponse response) {
                        return response.getProtectionCapabilityGroupTagCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWebAppFirewallPolicies operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWebAppFirewallPoliciesResponse> listWebAppFirewallPoliciesResponseIterator(
            final ListWebAppFirewallPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWebAppFirewallPoliciesRequest.Builder, ListWebAppFirewallPoliciesRequest,
                ListWebAppFirewallPoliciesResponse>(
                new com.google.common.base.Supplier<ListWebAppFirewallPoliciesRequest.Builder>() {
                    @Override
                    public ListWebAppFirewallPoliciesRequest.Builder get() {
                        return ListWebAppFirewallPoliciesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWebAppFirewallPoliciesResponse, String>() {
                    @Override
                    public String apply(ListWebAppFirewallPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWebAppFirewallPoliciesRequest.Builder>,
                        ListWebAppFirewallPoliciesRequest>() {
                    @Override
                    public ListWebAppFirewallPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWebAppFirewallPoliciesRequest.Builder>
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
                        ListWebAppFirewallPoliciesRequest, ListWebAppFirewallPoliciesResponse>() {
                    @Override
                    public ListWebAppFirewallPoliciesResponse apply(
                            ListWebAppFirewallPoliciesRequest request) {
                        return client.listWebAppFirewallPolicies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.waf.model.WebAppFirewallPolicySummary} objects
     * contained in responses from the listWebAppFirewallPolicies operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.waf.model.WebAppFirewallPolicySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.waf.model.WebAppFirewallPolicySummary>
            listWebAppFirewallPoliciesRecordIterator(
                    final ListWebAppFirewallPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWebAppFirewallPoliciesRequest.Builder, ListWebAppFirewallPoliciesRequest,
                ListWebAppFirewallPoliciesResponse,
                com.oracle.bmc.waf.model.WebAppFirewallPolicySummary>(
                new com.google.common.base.Supplier<ListWebAppFirewallPoliciesRequest.Builder>() {
                    @Override
                    public ListWebAppFirewallPoliciesRequest.Builder get() {
                        return ListWebAppFirewallPoliciesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWebAppFirewallPoliciesResponse, String>() {
                    @Override
                    public String apply(ListWebAppFirewallPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWebAppFirewallPoliciesRequest.Builder>,
                        ListWebAppFirewallPoliciesRequest>() {
                    @Override
                    public ListWebAppFirewallPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWebAppFirewallPoliciesRequest.Builder>
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
                        ListWebAppFirewallPoliciesRequest, ListWebAppFirewallPoliciesResponse>() {
                    @Override
                    public ListWebAppFirewallPoliciesResponse apply(
                            ListWebAppFirewallPoliciesRequest request) {
                        return client.listWebAppFirewallPolicies(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWebAppFirewallPoliciesResponse,
                        java.util.List<com.oracle.bmc.waf.model.WebAppFirewallPolicySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.waf.model.WebAppFirewallPolicySummary>
                            apply(ListWebAppFirewallPoliciesResponse response) {
                        return response.getWebAppFirewallPolicyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWebAppFirewalls operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWebAppFirewallsResponse> listWebAppFirewallsResponseIterator(
            final ListWebAppFirewallsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWebAppFirewallsRequest.Builder, ListWebAppFirewallsRequest,
                ListWebAppFirewallsResponse>(
                new com.google.common.base.Supplier<ListWebAppFirewallsRequest.Builder>() {
                    @Override
                    public ListWebAppFirewallsRequest.Builder get() {
                        return ListWebAppFirewallsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWebAppFirewallsResponse, String>() {
                    @Override
                    public String apply(ListWebAppFirewallsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWebAppFirewallsRequest.Builder>,
                        ListWebAppFirewallsRequest>() {
                    @Override
                    public ListWebAppFirewallsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWebAppFirewallsRequest.Builder>
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
                        ListWebAppFirewallsRequest, ListWebAppFirewallsResponse>() {
                    @Override
                    public ListWebAppFirewallsResponse apply(ListWebAppFirewallsRequest request) {
                        return client.listWebAppFirewalls(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.waf.model.WebAppFirewallSummary} objects
     * contained in responses from the listWebAppFirewalls operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.waf.model.WebAppFirewallSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.waf.model.WebAppFirewallSummary>
            listWebAppFirewallsRecordIterator(final ListWebAppFirewallsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWebAppFirewallsRequest.Builder, ListWebAppFirewallsRequest,
                ListWebAppFirewallsResponse, com.oracle.bmc.waf.model.WebAppFirewallSummary>(
                new com.google.common.base.Supplier<ListWebAppFirewallsRequest.Builder>() {
                    @Override
                    public ListWebAppFirewallsRequest.Builder get() {
                        return ListWebAppFirewallsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWebAppFirewallsResponse, String>() {
                    @Override
                    public String apply(ListWebAppFirewallsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWebAppFirewallsRequest.Builder>,
                        ListWebAppFirewallsRequest>() {
                    @Override
                    public ListWebAppFirewallsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWebAppFirewallsRequest.Builder>
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
                        ListWebAppFirewallsRequest, ListWebAppFirewallsResponse>() {
                    @Override
                    public ListWebAppFirewallsResponse apply(ListWebAppFirewallsRequest request) {
                        return client.listWebAppFirewalls(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWebAppFirewallsResponse,
                        java.util.List<com.oracle.bmc.waf.model.WebAppFirewallSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.waf.model.WebAppFirewallSummary> apply(
                            ListWebAppFirewallsResponse response) {
                        return response.getWebAppFirewallCollection().getItems();
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.waf.model.WorkRequestError} objects
     * contained in responses from the listWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.waf.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.waf.model.WorkRequestError> listWorkRequestErrorsRecordIterator(
            final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse, com.oracle.bmc.waf.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.waf.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.waf.model.WorkRequestError> apply(
                            ListWorkRequestErrorsResponse response) {
                        return response.getWorkRequestErrorCollection().getItems();
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.waf.model.WorkRequestLogEntry} objects
     * contained in responses from the listWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.waf.model.WorkRequestLogEntry} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.waf.model.WorkRequestLogEntry> listWorkRequestLogsRecordIterator(
            final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse, com.oracle.bmc.waf.model.WorkRequestLogEntry>(
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
                        java.util.List<com.oracle.bmc.waf.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.waf.model.WorkRequestLogEntry> apply(
                            ListWorkRequestLogsResponse response) {
                        return response.getWorkRequestLogEntryCollection().getItems();
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.waf.model.WorkRequest} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.waf.model.WorkRequest} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.waf.model.WorkRequest> listWorkRequestsRecordIterator(
            final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.waf.model.WorkRequest>(
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
                        java.util.List<com.oracle.bmc.waf.model.WorkRequest>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.waf.model.WorkRequest> apply(
                            ListWorkRequestsResponse response) {
                        return response.getWorkRequestCollection().getItems();
                    }
                });
    }
}
