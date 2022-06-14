/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.governancerulescontrolplane;

import com.oracle.bmc.governancerulescontrolplane.requests.*;
import com.oracle.bmc.governancerulescontrolplane.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of GovernanceRule where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220504")
public class GovernanceRulePaginators {
    private final GovernanceRule client;

    public GovernanceRulePaginators(GovernanceRule client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listEnforcedGovernanceRules operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListEnforcedGovernanceRulesResponse>
            listEnforcedGovernanceRulesResponseIterator(
                    final ListEnforcedGovernanceRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListEnforcedGovernanceRulesRequest.Builder, ListEnforcedGovernanceRulesRequest,
                ListEnforcedGovernanceRulesResponse>(
                new com.google.common.base.Supplier<ListEnforcedGovernanceRulesRequest.Builder>() {
                    @Override
                    public ListEnforcedGovernanceRulesRequest.Builder get() {
                        return ListEnforcedGovernanceRulesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListEnforcedGovernanceRulesResponse, String>() {
                    @Override
                    public String apply(ListEnforcedGovernanceRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEnforcedGovernanceRulesRequest.Builder>,
                        ListEnforcedGovernanceRulesRequest>() {
                    @Override
                    public ListEnforcedGovernanceRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEnforcedGovernanceRulesRequest.Builder>
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
                        ListEnforcedGovernanceRulesRequest, ListEnforcedGovernanceRulesResponse>() {
                    @Override
                    public ListEnforcedGovernanceRulesResponse apply(
                            ListEnforcedGovernanceRulesRequest request) {
                        return client.listEnforcedGovernanceRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.governancerulescontrolplane.model.EnforcedGovernanceRuleSummary} objects
     * contained in responses from the listEnforcedGovernanceRules operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.governancerulescontrolplane.model.EnforcedGovernanceRuleSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.governancerulescontrolplane.model.EnforcedGovernanceRuleSummary>
            listEnforcedGovernanceRulesRecordIterator(
                    final ListEnforcedGovernanceRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListEnforcedGovernanceRulesRequest.Builder, ListEnforcedGovernanceRulesRequest,
                ListEnforcedGovernanceRulesResponse,
                com.oracle.bmc.governancerulescontrolplane.model.EnforcedGovernanceRuleSummary>(
                new com.google.common.base.Supplier<ListEnforcedGovernanceRulesRequest.Builder>() {
                    @Override
                    public ListEnforcedGovernanceRulesRequest.Builder get() {
                        return ListEnforcedGovernanceRulesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListEnforcedGovernanceRulesResponse, String>() {
                    @Override
                    public String apply(ListEnforcedGovernanceRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEnforcedGovernanceRulesRequest.Builder>,
                        ListEnforcedGovernanceRulesRequest>() {
                    @Override
                    public ListEnforcedGovernanceRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEnforcedGovernanceRulesRequest.Builder>
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
                        ListEnforcedGovernanceRulesRequest, ListEnforcedGovernanceRulesResponse>() {
                    @Override
                    public ListEnforcedGovernanceRulesResponse apply(
                            ListEnforcedGovernanceRulesRequest request) {
                        return client.listEnforcedGovernanceRules(request);
                    }
                },
                new com.google.common.base.Function<
                        ListEnforcedGovernanceRulesResponse,
                        java.util.List<
                                com.oracle.bmc.governancerulescontrolplane.model
                                        .EnforcedGovernanceRuleSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.governancerulescontrolplane.model
                                            .EnforcedGovernanceRuleSummary>
                            apply(ListEnforcedGovernanceRulesResponse response) {
                        return response.getEnforcedGovernanceRuleCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listGovernanceRules operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListGovernanceRulesResponse> listGovernanceRulesResponseIterator(
            final ListGovernanceRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListGovernanceRulesRequest.Builder, ListGovernanceRulesRequest,
                ListGovernanceRulesResponse>(
                new com.google.common.base.Supplier<ListGovernanceRulesRequest.Builder>() {
                    @Override
                    public ListGovernanceRulesRequest.Builder get() {
                        return ListGovernanceRulesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListGovernanceRulesResponse, String>() {
                    @Override
                    public String apply(ListGovernanceRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGovernanceRulesRequest.Builder>,
                        ListGovernanceRulesRequest>() {
                    @Override
                    public ListGovernanceRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGovernanceRulesRequest.Builder>
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
                        ListGovernanceRulesRequest, ListGovernanceRulesResponse>() {
                    @Override
                    public ListGovernanceRulesResponse apply(ListGovernanceRulesRequest request) {
                        return client.listGovernanceRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.governancerulescontrolplane.model.GovernanceRuleSummary} objects
     * contained in responses from the listGovernanceRules operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.governancerulescontrolplane.model.GovernanceRuleSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.governancerulescontrolplane.model.GovernanceRuleSummary>
            listGovernanceRulesRecordIterator(final ListGovernanceRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListGovernanceRulesRequest.Builder, ListGovernanceRulesRequest,
                ListGovernanceRulesResponse,
                com.oracle.bmc.governancerulescontrolplane.model.GovernanceRuleSummary>(
                new com.google.common.base.Supplier<ListGovernanceRulesRequest.Builder>() {
                    @Override
                    public ListGovernanceRulesRequest.Builder get() {
                        return ListGovernanceRulesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListGovernanceRulesResponse, String>() {
                    @Override
                    public String apply(ListGovernanceRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGovernanceRulesRequest.Builder>,
                        ListGovernanceRulesRequest>() {
                    @Override
                    public ListGovernanceRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGovernanceRulesRequest.Builder>
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
                        ListGovernanceRulesRequest, ListGovernanceRulesResponse>() {
                    @Override
                    public ListGovernanceRulesResponse apply(ListGovernanceRulesRequest request) {
                        return client.listGovernanceRules(request);
                    }
                },
                new com.google.common.base.Function<
                        ListGovernanceRulesResponse,
                        java.util.List<
                                com.oracle.bmc.governancerulescontrolplane.model
                                        .GovernanceRuleSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.governancerulescontrolplane.model
                                            .GovernanceRuleSummary>
                            apply(ListGovernanceRulesResponse response) {
                        return response.getGovernanceRuleCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listInclusionCriteria operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListInclusionCriteriaResponse> listInclusionCriteriaResponseIterator(
            final ListInclusionCriteriaRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListInclusionCriteriaRequest.Builder, ListInclusionCriteriaRequest,
                ListInclusionCriteriaResponse>(
                new com.google.common.base.Supplier<ListInclusionCriteriaRequest.Builder>() {
                    @Override
                    public ListInclusionCriteriaRequest.Builder get() {
                        return ListInclusionCriteriaRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListInclusionCriteriaResponse, String>() {
                    @Override
                    public String apply(ListInclusionCriteriaResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInclusionCriteriaRequest.Builder>,
                        ListInclusionCriteriaRequest>() {
                    @Override
                    public ListInclusionCriteriaRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInclusionCriteriaRequest.Builder>
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
                        ListInclusionCriteriaRequest, ListInclusionCriteriaResponse>() {
                    @Override
                    public ListInclusionCriteriaResponse apply(
                            ListInclusionCriteriaRequest request) {
                        return client.listInclusionCriteria(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.governancerulescontrolplane.model.InclusionCriterionSummary} objects
     * contained in responses from the listInclusionCriteria operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.governancerulescontrolplane.model.InclusionCriterionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.governancerulescontrolplane.model.InclusionCriterionSummary>
            listInclusionCriteriaRecordIterator(final ListInclusionCriteriaRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListInclusionCriteriaRequest.Builder, ListInclusionCriteriaRequest,
                ListInclusionCriteriaResponse,
                com.oracle.bmc.governancerulescontrolplane.model.InclusionCriterionSummary>(
                new com.google.common.base.Supplier<ListInclusionCriteriaRequest.Builder>() {
                    @Override
                    public ListInclusionCriteriaRequest.Builder get() {
                        return ListInclusionCriteriaRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListInclusionCriteriaResponse, String>() {
                    @Override
                    public String apply(ListInclusionCriteriaResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInclusionCriteriaRequest.Builder>,
                        ListInclusionCriteriaRequest>() {
                    @Override
                    public ListInclusionCriteriaRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInclusionCriteriaRequest.Builder>
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
                        ListInclusionCriteriaRequest, ListInclusionCriteriaResponse>() {
                    @Override
                    public ListInclusionCriteriaResponse apply(
                            ListInclusionCriteriaRequest request) {
                        return client.listInclusionCriteria(request);
                    }
                },
                new com.google.common.base.Function<
                        ListInclusionCriteriaResponse,
                        java.util.List<
                                com.oracle.bmc.governancerulescontrolplane.model
                                        .InclusionCriterionSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.governancerulescontrolplane.model
                                            .InclusionCriterionSummary>
                            apply(ListInclusionCriteriaResponse response) {
                        return response.getInclusionCriterionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTenancyAttachments operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTenancyAttachmentsResponse> listTenancyAttachmentsResponseIterator(
            final ListTenancyAttachmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTenancyAttachmentsRequest.Builder, ListTenancyAttachmentsRequest,
                ListTenancyAttachmentsResponse>(
                new com.google.common.base.Supplier<ListTenancyAttachmentsRequest.Builder>() {
                    @Override
                    public ListTenancyAttachmentsRequest.Builder get() {
                        return ListTenancyAttachmentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTenancyAttachmentsResponse, String>() {
                    @Override
                    public String apply(ListTenancyAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTenancyAttachmentsRequest.Builder>,
                        ListTenancyAttachmentsRequest>() {
                    @Override
                    public ListTenancyAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTenancyAttachmentsRequest.Builder>
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
                        ListTenancyAttachmentsRequest, ListTenancyAttachmentsResponse>() {
                    @Override
                    public ListTenancyAttachmentsResponse apply(
                            ListTenancyAttachmentsRequest request) {
                        return client.listTenancyAttachments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.governancerulescontrolplane.model.TenancyAttachmentSummary} objects
     * contained in responses from the listTenancyAttachments operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.governancerulescontrolplane.model.TenancyAttachmentSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.governancerulescontrolplane.model.TenancyAttachmentSummary>
            listTenancyAttachmentsRecordIterator(final ListTenancyAttachmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTenancyAttachmentsRequest.Builder, ListTenancyAttachmentsRequest,
                ListTenancyAttachmentsResponse,
                com.oracle.bmc.governancerulescontrolplane.model.TenancyAttachmentSummary>(
                new com.google.common.base.Supplier<ListTenancyAttachmentsRequest.Builder>() {
                    @Override
                    public ListTenancyAttachmentsRequest.Builder get() {
                        return ListTenancyAttachmentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTenancyAttachmentsResponse, String>() {
                    @Override
                    public String apply(ListTenancyAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTenancyAttachmentsRequest.Builder>,
                        ListTenancyAttachmentsRequest>() {
                    @Override
                    public ListTenancyAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTenancyAttachmentsRequest.Builder>
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
                        ListTenancyAttachmentsRequest, ListTenancyAttachmentsResponse>() {
                    @Override
                    public ListTenancyAttachmentsResponse apply(
                            ListTenancyAttachmentsRequest request) {
                        return client.listTenancyAttachments(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTenancyAttachmentsResponse,
                        java.util.List<
                                com.oracle.bmc.governancerulescontrolplane.model
                                        .TenancyAttachmentSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.governancerulescontrolplane.model
                                            .TenancyAttachmentSummary>
                            apply(ListTenancyAttachmentsResponse response) {
                        return response.getTenancyAttachmentCollection().getItems();
                    }
                });
    }
}
