/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall;

import com.oracle.bmc.networkfirewall.requests.*;
import com.oracle.bmc.networkfirewall.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of NetworkFirewall where multiple pages of data may be fetched. Two styles
 * of iteration are supported:
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
public class NetworkFirewallPaginators {
    private final NetworkFirewall client;

    public NetworkFirewallPaginators(NetworkFirewall client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAddressLists operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAddressListsResponse> listAddressListsResponseIterator(
            final ListAddressListsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAddressListsRequest.Builder, ListAddressListsRequest, ListAddressListsResponse>(
                new java.util.function.Supplier<ListAddressListsRequest.Builder>() {
                    @Override
                    public ListAddressListsRequest.Builder get() {
                        return ListAddressListsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAddressListsResponse, String>() {
                    @Override
                    public String apply(ListAddressListsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAddressListsRequest.Builder>,
                        ListAddressListsRequest>() {
                    @Override
                    public ListAddressListsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAddressListsRequest.Builder>
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
                        ListAddressListsRequest, ListAddressListsResponse>() {
                    @Override
                    public ListAddressListsResponse apply(ListAddressListsRequest request) {
                        return client.listAddressLists(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.networkfirewall.model.AddressListSummary} objects contained in responses from
     * the listAddressLists operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.networkfirewall.model.AddressListSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.networkfirewall.model.AddressListSummary>
            listAddressListsRecordIterator(final ListAddressListsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAddressListsRequest.Builder,
                ListAddressListsRequest,
                ListAddressListsResponse,
                com.oracle.bmc.networkfirewall.model.AddressListSummary>(
                new java.util.function.Supplier<ListAddressListsRequest.Builder>() {
                    @Override
                    public ListAddressListsRequest.Builder get() {
                        return ListAddressListsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAddressListsResponse, String>() {
                    @Override
                    public String apply(ListAddressListsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAddressListsRequest.Builder>,
                        ListAddressListsRequest>() {
                    @Override
                    public ListAddressListsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAddressListsRequest.Builder>
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
                        ListAddressListsRequest, ListAddressListsResponse>() {
                    @Override
                    public ListAddressListsResponse apply(ListAddressListsRequest request) {
                        return client.listAddressLists(request);
                    }
                },
                new java.util.function.Function<
                        ListAddressListsResponse,
                        java.util.List<com.oracle.bmc.networkfirewall.model.AddressListSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.networkfirewall.model.AddressListSummary>
                            apply(ListAddressListsResponse response) {
                        return response.getAddressListSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listApplicationGroups operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListApplicationGroupsResponse> listApplicationGroupsResponseIterator(
            final ListApplicationGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListApplicationGroupsRequest.Builder,
                ListApplicationGroupsRequest,
                ListApplicationGroupsResponse>(
                new java.util.function.Supplier<ListApplicationGroupsRequest.Builder>() {
                    @Override
                    public ListApplicationGroupsRequest.Builder get() {
                        return ListApplicationGroupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListApplicationGroupsResponse, String>() {
                    @Override
                    public String apply(ListApplicationGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListApplicationGroupsRequest.Builder>,
                        ListApplicationGroupsRequest>() {
                    @Override
                    public ListApplicationGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListApplicationGroupsRequest.Builder>
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
                        ListApplicationGroupsRequest, ListApplicationGroupsResponse>() {
                    @Override
                    public ListApplicationGroupsResponse apply(
                            ListApplicationGroupsRequest request) {
                        return client.listApplicationGroups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.networkfirewall.model.ApplicationGroupSummary} objects contained in responses
     * from the listApplicationGroups operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.networkfirewall.model.ApplicationGroupSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.networkfirewall.model.ApplicationGroupSummary>
            listApplicationGroupsRecordIterator(final ListApplicationGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListApplicationGroupsRequest.Builder,
                ListApplicationGroupsRequest,
                ListApplicationGroupsResponse,
                com.oracle.bmc.networkfirewall.model.ApplicationGroupSummary>(
                new java.util.function.Supplier<ListApplicationGroupsRequest.Builder>() {
                    @Override
                    public ListApplicationGroupsRequest.Builder get() {
                        return ListApplicationGroupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListApplicationGroupsResponse, String>() {
                    @Override
                    public String apply(ListApplicationGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListApplicationGroupsRequest.Builder>,
                        ListApplicationGroupsRequest>() {
                    @Override
                    public ListApplicationGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListApplicationGroupsRequest.Builder>
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
                        ListApplicationGroupsRequest, ListApplicationGroupsResponse>() {
                    @Override
                    public ListApplicationGroupsResponse apply(
                            ListApplicationGroupsRequest request) {
                        return client.listApplicationGroups(request);
                    }
                },
                new java.util.function.Function<
                        ListApplicationGroupsResponse,
                        java.util.List<
                                com.oracle.bmc.networkfirewall.model.ApplicationGroupSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.networkfirewall.model.ApplicationGroupSummary>
                            apply(ListApplicationGroupsResponse response) {
                        return response.getApplicationGroupSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listApplications operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListApplicationsResponse> listApplicationsResponseIterator(
            final ListApplicationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListApplicationsRequest.Builder, ListApplicationsRequest, ListApplicationsResponse>(
                new java.util.function.Supplier<ListApplicationsRequest.Builder>() {
                    @Override
                    public ListApplicationsRequest.Builder get() {
                        return ListApplicationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListApplicationsResponse, String>() {
                    @Override
                    public String apply(ListApplicationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListApplicationsRequest.Builder>,
                        ListApplicationsRequest>() {
                    @Override
                    public ListApplicationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListApplicationsRequest.Builder>
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
                        ListApplicationsRequest, ListApplicationsResponse>() {
                    @Override
                    public ListApplicationsResponse apply(ListApplicationsRequest request) {
                        return client.listApplications(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.networkfirewall.model.ApplicationSummary} objects contained in responses from
     * the listApplications operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.networkfirewall.model.ApplicationSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.networkfirewall.model.ApplicationSummary>
            listApplicationsRecordIterator(final ListApplicationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListApplicationsRequest.Builder,
                ListApplicationsRequest,
                ListApplicationsResponse,
                com.oracle.bmc.networkfirewall.model.ApplicationSummary>(
                new java.util.function.Supplier<ListApplicationsRequest.Builder>() {
                    @Override
                    public ListApplicationsRequest.Builder get() {
                        return ListApplicationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListApplicationsResponse, String>() {
                    @Override
                    public String apply(ListApplicationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListApplicationsRequest.Builder>,
                        ListApplicationsRequest>() {
                    @Override
                    public ListApplicationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListApplicationsRequest.Builder>
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
                        ListApplicationsRequest, ListApplicationsResponse>() {
                    @Override
                    public ListApplicationsResponse apply(ListApplicationsRequest request) {
                        return client.listApplications(request);
                    }
                },
                new java.util.function.Function<
                        ListApplicationsResponse,
                        java.util.List<com.oracle.bmc.networkfirewall.model.ApplicationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.networkfirewall.model.ApplicationSummary>
                            apply(ListApplicationsResponse response) {
                        return response.getApplicationSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDecryptionProfiles operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDecryptionProfilesResponse> listDecryptionProfilesResponseIterator(
            final ListDecryptionProfilesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDecryptionProfilesRequest.Builder,
                ListDecryptionProfilesRequest,
                ListDecryptionProfilesResponse>(
                new java.util.function.Supplier<ListDecryptionProfilesRequest.Builder>() {
                    @Override
                    public ListDecryptionProfilesRequest.Builder get() {
                        return ListDecryptionProfilesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDecryptionProfilesResponse, String>() {
                    @Override
                    public String apply(ListDecryptionProfilesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDecryptionProfilesRequest.Builder>,
                        ListDecryptionProfilesRequest>() {
                    @Override
                    public ListDecryptionProfilesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDecryptionProfilesRequest.Builder>
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
                        ListDecryptionProfilesRequest, ListDecryptionProfilesResponse>() {
                    @Override
                    public ListDecryptionProfilesResponse apply(
                            ListDecryptionProfilesRequest request) {
                        return client.listDecryptionProfiles(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.networkfirewall.model.DecryptionProfileSummary} objects contained in responses
     * from the listDecryptionProfiles operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.networkfirewall.model.DecryptionProfileSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.networkfirewall.model.DecryptionProfileSummary>
            listDecryptionProfilesRecordIterator(final ListDecryptionProfilesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDecryptionProfilesRequest.Builder,
                ListDecryptionProfilesRequest,
                ListDecryptionProfilesResponse,
                com.oracle.bmc.networkfirewall.model.DecryptionProfileSummary>(
                new java.util.function.Supplier<ListDecryptionProfilesRequest.Builder>() {
                    @Override
                    public ListDecryptionProfilesRequest.Builder get() {
                        return ListDecryptionProfilesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDecryptionProfilesResponse, String>() {
                    @Override
                    public String apply(ListDecryptionProfilesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDecryptionProfilesRequest.Builder>,
                        ListDecryptionProfilesRequest>() {
                    @Override
                    public ListDecryptionProfilesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDecryptionProfilesRequest.Builder>
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
                        ListDecryptionProfilesRequest, ListDecryptionProfilesResponse>() {
                    @Override
                    public ListDecryptionProfilesResponse apply(
                            ListDecryptionProfilesRequest request) {
                        return client.listDecryptionProfiles(request);
                    }
                },
                new java.util.function.Function<
                        ListDecryptionProfilesResponse,
                        java.util.List<
                                com.oracle.bmc.networkfirewall.model.DecryptionProfileSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.networkfirewall.model.DecryptionProfileSummary>
                            apply(ListDecryptionProfilesResponse response) {
                        return response.getDecryptionProfileSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDecryptionRules operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDecryptionRulesResponse> listDecryptionRulesResponseIterator(
            final ListDecryptionRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDecryptionRulesRequest.Builder,
                ListDecryptionRulesRequest,
                ListDecryptionRulesResponse>(
                new java.util.function.Supplier<ListDecryptionRulesRequest.Builder>() {
                    @Override
                    public ListDecryptionRulesRequest.Builder get() {
                        return ListDecryptionRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDecryptionRulesResponse, String>() {
                    @Override
                    public String apply(ListDecryptionRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDecryptionRulesRequest.Builder>,
                        ListDecryptionRulesRequest>() {
                    @Override
                    public ListDecryptionRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDecryptionRulesRequest.Builder>
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
                        ListDecryptionRulesRequest, ListDecryptionRulesResponse>() {
                    @Override
                    public ListDecryptionRulesResponse apply(ListDecryptionRulesRequest request) {
                        return client.listDecryptionRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.networkfirewall.model.DecryptionRuleSummary} objects contained in responses
     * from the listDecryptionRules operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.networkfirewall.model.DecryptionRuleSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.networkfirewall.model.DecryptionRuleSummary>
            listDecryptionRulesRecordIterator(final ListDecryptionRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDecryptionRulesRequest.Builder,
                ListDecryptionRulesRequest,
                ListDecryptionRulesResponse,
                com.oracle.bmc.networkfirewall.model.DecryptionRuleSummary>(
                new java.util.function.Supplier<ListDecryptionRulesRequest.Builder>() {
                    @Override
                    public ListDecryptionRulesRequest.Builder get() {
                        return ListDecryptionRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDecryptionRulesResponse, String>() {
                    @Override
                    public String apply(ListDecryptionRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDecryptionRulesRequest.Builder>,
                        ListDecryptionRulesRequest>() {
                    @Override
                    public ListDecryptionRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDecryptionRulesRequest.Builder>
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
                        ListDecryptionRulesRequest, ListDecryptionRulesResponse>() {
                    @Override
                    public ListDecryptionRulesResponse apply(ListDecryptionRulesRequest request) {
                        return client.listDecryptionRules(request);
                    }
                },
                new java.util.function.Function<
                        ListDecryptionRulesResponse,
                        java.util.List<
                                com.oracle.bmc.networkfirewall.model.DecryptionRuleSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.networkfirewall.model.DecryptionRuleSummary>
                            apply(ListDecryptionRulesResponse response) {
                        return response.getDecryptionRuleSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listMappedSecrets operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMappedSecretsResponse> listMappedSecretsResponseIterator(
            final ListMappedSecretsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMappedSecretsRequest.Builder,
                ListMappedSecretsRequest,
                ListMappedSecretsResponse>(
                new java.util.function.Supplier<ListMappedSecretsRequest.Builder>() {
                    @Override
                    public ListMappedSecretsRequest.Builder get() {
                        return ListMappedSecretsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMappedSecretsResponse, String>() {
                    @Override
                    public String apply(ListMappedSecretsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMappedSecretsRequest.Builder>,
                        ListMappedSecretsRequest>() {
                    @Override
                    public ListMappedSecretsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMappedSecretsRequest.Builder>
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
                        ListMappedSecretsRequest, ListMappedSecretsResponse>() {
                    @Override
                    public ListMappedSecretsResponse apply(ListMappedSecretsRequest request) {
                        return client.listMappedSecrets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.networkfirewall.model.MappedSecretSummary} objects contained in responses from
     * the listMappedSecrets operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.networkfirewall.model.MappedSecretSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.networkfirewall.model.MappedSecretSummary>
            listMappedSecretsRecordIterator(final ListMappedSecretsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMappedSecretsRequest.Builder,
                ListMappedSecretsRequest,
                ListMappedSecretsResponse,
                com.oracle.bmc.networkfirewall.model.MappedSecretSummary>(
                new java.util.function.Supplier<ListMappedSecretsRequest.Builder>() {
                    @Override
                    public ListMappedSecretsRequest.Builder get() {
                        return ListMappedSecretsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMappedSecretsResponse, String>() {
                    @Override
                    public String apply(ListMappedSecretsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMappedSecretsRequest.Builder>,
                        ListMappedSecretsRequest>() {
                    @Override
                    public ListMappedSecretsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMappedSecretsRequest.Builder>
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
                        ListMappedSecretsRequest, ListMappedSecretsResponse>() {
                    @Override
                    public ListMappedSecretsResponse apply(ListMappedSecretsRequest request) {
                        return client.listMappedSecrets(request);
                    }
                },
                new java.util.function.Function<
                        ListMappedSecretsResponse,
                        java.util.List<
                                com.oracle.bmc.networkfirewall.model.MappedSecretSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.networkfirewall.model.MappedSecretSummary>
                            apply(ListMappedSecretsResponse response) {
                        return response.getMappedSecretSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listNatRules
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListNatRulesResponse> listNatRulesResponseIterator(
            final ListNatRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListNatRulesRequest.Builder, ListNatRulesRequest, ListNatRulesResponse>(
                new java.util.function.Supplier<ListNatRulesRequest.Builder>() {
                    @Override
                    public ListNatRulesRequest.Builder get() {
                        return ListNatRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListNatRulesResponse, String>() {
                    @Override
                    public String apply(ListNatRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNatRulesRequest.Builder>,
                        ListNatRulesRequest>() {
                    @Override
                    public ListNatRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNatRulesRequest.Builder>
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
                new java.util.function.Function<ListNatRulesRequest, ListNatRulesResponse>() {
                    @Override
                    public ListNatRulesResponse apply(ListNatRulesRequest request) {
                        return client.listNatRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.networkfirewall.model.NatRuleSummary} objects contained in responses from the
     * listNatRules operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.networkfirewall.model.NatRuleSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.networkfirewall.model.NatRuleSummary> listNatRulesRecordIterator(
            final ListNatRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListNatRulesRequest.Builder,
                ListNatRulesRequest,
                ListNatRulesResponse,
                com.oracle.bmc.networkfirewall.model.NatRuleSummary>(
                new java.util.function.Supplier<ListNatRulesRequest.Builder>() {
                    @Override
                    public ListNatRulesRequest.Builder get() {
                        return ListNatRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListNatRulesResponse, String>() {
                    @Override
                    public String apply(ListNatRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNatRulesRequest.Builder>,
                        ListNatRulesRequest>() {
                    @Override
                    public ListNatRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNatRulesRequest.Builder>
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
                new java.util.function.Function<ListNatRulesRequest, ListNatRulesResponse>() {
                    @Override
                    public ListNatRulesResponse apply(ListNatRulesRequest request) {
                        return client.listNatRules(request);
                    }
                },
                new java.util.function.Function<
                        ListNatRulesResponse,
                        java.util.List<com.oracle.bmc.networkfirewall.model.NatRuleSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.networkfirewall.model.NatRuleSummary>
                            apply(ListNatRulesResponse response) {
                        return response.getNatRuleCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listNetworkFirewallPolicies operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListNetworkFirewallPoliciesResponse>
            listNetworkFirewallPoliciesResponseIterator(
                    final ListNetworkFirewallPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListNetworkFirewallPoliciesRequest.Builder,
                ListNetworkFirewallPoliciesRequest,
                ListNetworkFirewallPoliciesResponse>(
                new java.util.function.Supplier<ListNetworkFirewallPoliciesRequest.Builder>() {
                    @Override
                    public ListNetworkFirewallPoliciesRequest.Builder get() {
                        return ListNetworkFirewallPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListNetworkFirewallPoliciesResponse, String>() {
                    @Override
                    public String apply(ListNetworkFirewallPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNetworkFirewallPoliciesRequest.Builder>,
                        ListNetworkFirewallPoliciesRequest>() {
                    @Override
                    public ListNetworkFirewallPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNetworkFirewallPoliciesRequest.Builder>
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
                        ListNetworkFirewallPoliciesRequest, ListNetworkFirewallPoliciesResponse>() {
                    @Override
                    public ListNetworkFirewallPoliciesResponse apply(
                            ListNetworkFirewallPoliciesRequest request) {
                        return client.listNetworkFirewallPolicies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.networkfirewall.model.NetworkFirewallPolicySummary} objects contained in
     * responses from the listNetworkFirewallPolicies operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.networkfirewall.model.NetworkFirewallPolicySummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.networkfirewall.model.NetworkFirewallPolicySummary>
            listNetworkFirewallPoliciesRecordIterator(
                    final ListNetworkFirewallPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListNetworkFirewallPoliciesRequest.Builder,
                ListNetworkFirewallPoliciesRequest,
                ListNetworkFirewallPoliciesResponse,
                com.oracle.bmc.networkfirewall.model.NetworkFirewallPolicySummary>(
                new java.util.function.Supplier<ListNetworkFirewallPoliciesRequest.Builder>() {
                    @Override
                    public ListNetworkFirewallPoliciesRequest.Builder get() {
                        return ListNetworkFirewallPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListNetworkFirewallPoliciesResponse, String>() {
                    @Override
                    public String apply(ListNetworkFirewallPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNetworkFirewallPoliciesRequest.Builder>,
                        ListNetworkFirewallPoliciesRequest>() {
                    @Override
                    public ListNetworkFirewallPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNetworkFirewallPoliciesRequest.Builder>
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
                        ListNetworkFirewallPoliciesRequest, ListNetworkFirewallPoliciesResponse>() {
                    @Override
                    public ListNetworkFirewallPoliciesResponse apply(
                            ListNetworkFirewallPoliciesRequest request) {
                        return client.listNetworkFirewallPolicies(request);
                    }
                },
                new java.util.function.Function<
                        ListNetworkFirewallPoliciesResponse,
                        java.util.List<
                                com.oracle.bmc.networkfirewall.model
                                        .NetworkFirewallPolicySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.networkfirewall.model
                                            .NetworkFirewallPolicySummary>
                            apply(ListNetworkFirewallPoliciesResponse response) {
                        return response.getNetworkFirewallPolicySummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listNetworkFirewalls operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListNetworkFirewallsResponse> listNetworkFirewallsResponseIterator(
            final ListNetworkFirewallsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListNetworkFirewallsRequest.Builder,
                ListNetworkFirewallsRequest,
                ListNetworkFirewallsResponse>(
                new java.util.function.Supplier<ListNetworkFirewallsRequest.Builder>() {
                    @Override
                    public ListNetworkFirewallsRequest.Builder get() {
                        return ListNetworkFirewallsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListNetworkFirewallsResponse, String>() {
                    @Override
                    public String apply(ListNetworkFirewallsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNetworkFirewallsRequest.Builder>,
                        ListNetworkFirewallsRequest>() {
                    @Override
                    public ListNetworkFirewallsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNetworkFirewallsRequest.Builder>
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
                        ListNetworkFirewallsRequest, ListNetworkFirewallsResponse>() {
                    @Override
                    public ListNetworkFirewallsResponse apply(ListNetworkFirewallsRequest request) {
                        return client.listNetworkFirewalls(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.networkfirewall.model.NetworkFirewallSummary} objects contained in responses
     * from the listNetworkFirewalls operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.networkfirewall.model.NetworkFirewallSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.networkfirewall.model.NetworkFirewallSummary>
            listNetworkFirewallsRecordIterator(final ListNetworkFirewallsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListNetworkFirewallsRequest.Builder,
                ListNetworkFirewallsRequest,
                ListNetworkFirewallsResponse,
                com.oracle.bmc.networkfirewall.model.NetworkFirewallSummary>(
                new java.util.function.Supplier<ListNetworkFirewallsRequest.Builder>() {
                    @Override
                    public ListNetworkFirewallsRequest.Builder get() {
                        return ListNetworkFirewallsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListNetworkFirewallsResponse, String>() {
                    @Override
                    public String apply(ListNetworkFirewallsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListNetworkFirewallsRequest.Builder>,
                        ListNetworkFirewallsRequest>() {
                    @Override
                    public ListNetworkFirewallsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListNetworkFirewallsRequest.Builder>
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
                        ListNetworkFirewallsRequest, ListNetworkFirewallsResponse>() {
                    @Override
                    public ListNetworkFirewallsResponse apply(ListNetworkFirewallsRequest request) {
                        return client.listNetworkFirewalls(request);
                    }
                },
                new java.util.function.Function<
                        ListNetworkFirewallsResponse,
                        java.util.List<
                                com.oracle.bmc.networkfirewall.model.NetworkFirewallSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.networkfirewall.model.NetworkFirewallSummary>
                            apply(ListNetworkFirewallsResponse response) {
                        return response.getNetworkFirewallCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSecurityRules operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSecurityRulesResponse> listSecurityRulesResponseIterator(
            final ListSecurityRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSecurityRulesRequest.Builder,
                ListSecurityRulesRequest,
                ListSecurityRulesResponse>(
                new java.util.function.Supplier<ListSecurityRulesRequest.Builder>() {
                    @Override
                    public ListSecurityRulesRequest.Builder get() {
                        return ListSecurityRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSecurityRulesResponse, String>() {
                    @Override
                    public String apply(ListSecurityRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityRulesRequest.Builder>,
                        ListSecurityRulesRequest>() {
                    @Override
                    public ListSecurityRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityRulesRequest.Builder>
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
                        ListSecurityRulesRequest, ListSecurityRulesResponse>() {
                    @Override
                    public ListSecurityRulesResponse apply(ListSecurityRulesRequest request) {
                        return client.listSecurityRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.networkfirewall.model.SecurityRuleSummary} objects contained in responses from
     * the listSecurityRules operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.networkfirewall.model.SecurityRuleSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.networkfirewall.model.SecurityRuleSummary>
            listSecurityRulesRecordIterator(final ListSecurityRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSecurityRulesRequest.Builder,
                ListSecurityRulesRequest,
                ListSecurityRulesResponse,
                com.oracle.bmc.networkfirewall.model.SecurityRuleSummary>(
                new java.util.function.Supplier<ListSecurityRulesRequest.Builder>() {
                    @Override
                    public ListSecurityRulesRequest.Builder get() {
                        return ListSecurityRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSecurityRulesResponse, String>() {
                    @Override
                    public String apply(ListSecurityRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecurityRulesRequest.Builder>,
                        ListSecurityRulesRequest>() {
                    @Override
                    public ListSecurityRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecurityRulesRequest.Builder>
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
                        ListSecurityRulesRequest, ListSecurityRulesResponse>() {
                    @Override
                    public ListSecurityRulesResponse apply(ListSecurityRulesRequest request) {
                        return client.listSecurityRules(request);
                    }
                },
                new java.util.function.Function<
                        ListSecurityRulesResponse,
                        java.util.List<
                                com.oracle.bmc.networkfirewall.model.SecurityRuleSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.networkfirewall.model.SecurityRuleSummary>
                            apply(ListSecurityRulesResponse response) {
                        return response.getSecurityRuleSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listServiceLists operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListServiceListsResponse> listServiceListsResponseIterator(
            final ListServiceListsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListServiceListsRequest.Builder, ListServiceListsRequest, ListServiceListsResponse>(
                new java.util.function.Supplier<ListServiceListsRequest.Builder>() {
                    @Override
                    public ListServiceListsRequest.Builder get() {
                        return ListServiceListsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListServiceListsResponse, String>() {
                    @Override
                    public String apply(ListServiceListsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListServiceListsRequest.Builder>,
                        ListServiceListsRequest>() {
                    @Override
                    public ListServiceListsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListServiceListsRequest.Builder>
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
                        ListServiceListsRequest, ListServiceListsResponse>() {
                    @Override
                    public ListServiceListsResponse apply(ListServiceListsRequest request) {
                        return client.listServiceLists(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.networkfirewall.model.ServiceListSummary} objects contained in responses from
     * the listServiceLists operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.networkfirewall.model.ServiceListSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.networkfirewall.model.ServiceListSummary>
            listServiceListsRecordIterator(final ListServiceListsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListServiceListsRequest.Builder,
                ListServiceListsRequest,
                ListServiceListsResponse,
                com.oracle.bmc.networkfirewall.model.ServiceListSummary>(
                new java.util.function.Supplier<ListServiceListsRequest.Builder>() {
                    @Override
                    public ListServiceListsRequest.Builder get() {
                        return ListServiceListsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListServiceListsResponse, String>() {
                    @Override
                    public String apply(ListServiceListsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListServiceListsRequest.Builder>,
                        ListServiceListsRequest>() {
                    @Override
                    public ListServiceListsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListServiceListsRequest.Builder>
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
                        ListServiceListsRequest, ListServiceListsResponse>() {
                    @Override
                    public ListServiceListsResponse apply(ListServiceListsRequest request) {
                        return client.listServiceLists(request);
                    }
                },
                new java.util.function.Function<
                        ListServiceListsResponse,
                        java.util.List<com.oracle.bmc.networkfirewall.model.ServiceListSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.networkfirewall.model.ServiceListSummary>
                            apply(ListServiceListsResponse response) {
                        return response.getServiceListSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listServices
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListServicesResponse> listServicesResponseIterator(
            final ListServicesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListServicesRequest.Builder, ListServicesRequest, ListServicesResponse>(
                new java.util.function.Supplier<ListServicesRequest.Builder>() {
                    @Override
                    public ListServicesRequest.Builder get() {
                        return ListServicesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListServicesResponse, String>() {
                    @Override
                    public String apply(ListServicesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListServicesRequest.Builder>,
                        ListServicesRequest>() {
                    @Override
                    public ListServicesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListServicesRequest.Builder>
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
                new java.util.function.Function<ListServicesRequest, ListServicesResponse>() {
                    @Override
                    public ListServicesResponse apply(ListServicesRequest request) {
                        return client.listServices(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.networkfirewall.model.ServiceSummary} objects contained in responses from the
     * listServices operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.networkfirewall.model.ServiceSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.networkfirewall.model.ServiceSummary> listServicesRecordIterator(
            final ListServicesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListServicesRequest.Builder,
                ListServicesRequest,
                ListServicesResponse,
                com.oracle.bmc.networkfirewall.model.ServiceSummary>(
                new java.util.function.Supplier<ListServicesRequest.Builder>() {
                    @Override
                    public ListServicesRequest.Builder get() {
                        return ListServicesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListServicesResponse, String>() {
                    @Override
                    public String apply(ListServicesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListServicesRequest.Builder>,
                        ListServicesRequest>() {
                    @Override
                    public ListServicesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListServicesRequest.Builder>
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
                new java.util.function.Function<ListServicesRequest, ListServicesResponse>() {
                    @Override
                    public ListServicesResponse apply(ListServicesRequest request) {
                        return client.listServices(request);
                    }
                },
                new java.util.function.Function<
                        ListServicesResponse,
                        java.util.List<com.oracle.bmc.networkfirewall.model.ServiceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.networkfirewall.model.ServiceSummary>
                            apply(ListServicesResponse response) {
                        return response.getServiceSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listTunnelInspectionRules operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListTunnelInspectionRulesResponse> listTunnelInspectionRulesResponseIterator(
            final ListTunnelInspectionRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTunnelInspectionRulesRequest.Builder,
                ListTunnelInspectionRulesRequest,
                ListTunnelInspectionRulesResponse>(
                new java.util.function.Supplier<ListTunnelInspectionRulesRequest.Builder>() {
                    @Override
                    public ListTunnelInspectionRulesRequest.Builder get() {
                        return ListTunnelInspectionRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTunnelInspectionRulesResponse, String>() {
                    @Override
                    public String apply(ListTunnelInspectionRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTunnelInspectionRulesRequest.Builder>,
                        ListTunnelInspectionRulesRequest>() {
                    @Override
                    public ListTunnelInspectionRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTunnelInspectionRulesRequest.Builder>
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
                        ListTunnelInspectionRulesRequest, ListTunnelInspectionRulesResponse>() {
                    @Override
                    public ListTunnelInspectionRulesResponse apply(
                            ListTunnelInspectionRulesRequest request) {
                        return client.listTunnelInspectionRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.networkfirewall.model.TunnelInspectionRuleSummary} objects contained in
     * responses from the listTunnelInspectionRules operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.networkfirewall.model.TunnelInspectionRuleSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.networkfirewall.model.TunnelInspectionRuleSummary>
            listTunnelInspectionRulesRecordIterator(
                    final ListTunnelInspectionRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTunnelInspectionRulesRequest.Builder,
                ListTunnelInspectionRulesRequest,
                ListTunnelInspectionRulesResponse,
                com.oracle.bmc.networkfirewall.model.TunnelInspectionRuleSummary>(
                new java.util.function.Supplier<ListTunnelInspectionRulesRequest.Builder>() {
                    @Override
                    public ListTunnelInspectionRulesRequest.Builder get() {
                        return ListTunnelInspectionRulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTunnelInspectionRulesResponse, String>() {
                    @Override
                    public String apply(ListTunnelInspectionRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTunnelInspectionRulesRequest.Builder>,
                        ListTunnelInspectionRulesRequest>() {
                    @Override
                    public ListTunnelInspectionRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTunnelInspectionRulesRequest.Builder>
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
                        ListTunnelInspectionRulesRequest, ListTunnelInspectionRulesResponse>() {
                    @Override
                    public ListTunnelInspectionRulesResponse apply(
                            ListTunnelInspectionRulesRequest request) {
                        return client.listTunnelInspectionRules(request);
                    }
                },
                new java.util.function.Function<
                        ListTunnelInspectionRulesResponse,
                        java.util.List<
                                com.oracle.bmc.networkfirewall.model
                                        .TunnelInspectionRuleSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.networkfirewall.model
                                            .TunnelInspectionRuleSummary>
                            apply(ListTunnelInspectionRulesResponse response) {
                        return response.getTunnelInspectionRuleSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listUrlLists
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListUrlListsResponse> listUrlListsResponseIterator(
            final ListUrlListsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListUrlListsRequest.Builder, ListUrlListsRequest, ListUrlListsResponse>(
                new java.util.function.Supplier<ListUrlListsRequest.Builder>() {
                    @Override
                    public ListUrlListsRequest.Builder get() {
                        return ListUrlListsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListUrlListsResponse, String>() {
                    @Override
                    public String apply(ListUrlListsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUrlListsRequest.Builder>,
                        ListUrlListsRequest>() {
                    @Override
                    public ListUrlListsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUrlListsRequest.Builder>
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
                new java.util.function.Function<ListUrlListsRequest, ListUrlListsResponse>() {
                    @Override
                    public ListUrlListsResponse apply(ListUrlListsRequest request) {
                        return client.listUrlLists(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.networkfirewall.model.UrlListSummary} objects contained in responses from the
     * listUrlLists operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.networkfirewall.model.UrlListSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.networkfirewall.model.UrlListSummary> listUrlListsRecordIterator(
            final ListUrlListsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListUrlListsRequest.Builder,
                ListUrlListsRequest,
                ListUrlListsResponse,
                com.oracle.bmc.networkfirewall.model.UrlListSummary>(
                new java.util.function.Supplier<ListUrlListsRequest.Builder>() {
                    @Override
                    public ListUrlListsRequest.Builder get() {
                        return ListUrlListsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListUrlListsResponse, String>() {
                    @Override
                    public String apply(ListUrlListsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUrlListsRequest.Builder>,
                        ListUrlListsRequest>() {
                    @Override
                    public ListUrlListsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUrlListsRequest.Builder>
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
                new java.util.function.Function<ListUrlListsRequest, ListUrlListsResponse>() {
                    @Override
                    public ListUrlListsResponse apply(ListUrlListsRequest request) {
                        return client.listUrlLists(request);
                    }
                },
                new java.util.function.Function<
                        ListUrlListsResponse,
                        java.util.List<com.oracle.bmc.networkfirewall.model.UrlListSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.networkfirewall.model.UrlListSummary>
                            apply(ListUrlListsResponse response) {
                        return response.getUrlListSummaryCollection().getItems();
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
     * com.oracle.bmc.networkfirewall.model.WorkRequestError} objects contained in responses from
     * the listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.networkfirewall.model.WorkRequestError} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.networkfirewall.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.networkfirewall.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.networkfirewall.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.networkfirewall.model.WorkRequestError>
                            apply(ListWorkRequestErrorsResponse response) {
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
     * com.oracle.bmc.networkfirewall.model.WorkRequestLogEntry} objects contained in responses from
     * the listWorkRequestLogs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.networkfirewall.model.WorkRequestLogEntry} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.networkfirewall.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.networkfirewall.model.WorkRequestLogEntry>(
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
                                com.oracle.bmc.networkfirewall.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.networkfirewall.model.WorkRequestLogEntry>
                            apply(ListWorkRequestLogsResponse response) {
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
     * com.oracle.bmc.networkfirewall.model.WorkRequestSummary} objects contained in responses from
     * the listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.networkfirewall.model.WorkRequestSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.networkfirewall.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder,
                ListWorkRequestsRequest,
                ListWorkRequestsResponse,
                com.oracle.bmc.networkfirewall.model.WorkRequestSummary>(
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
                        java.util.List<com.oracle.bmc.networkfirewall.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.networkfirewall.model.WorkRequestSummary>
                            apply(ListWorkRequestsResponse response) {
                        return response.getWorkRequestSummaryCollection().getItems();
                    }
                });
    }
}
