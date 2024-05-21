/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub;

import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of SoftwareSource where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class SoftwareSourcePaginators {
    private final SoftwareSource client;

    public SoftwareSourcePaginators(SoftwareSource client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAllSoftwarePackages operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAllSoftwarePackagesResponse> listAllSoftwarePackagesResponseIterator(
            final ListAllSoftwarePackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAllSoftwarePackagesRequest.Builder, ListAllSoftwarePackagesRequest,
                ListAllSoftwarePackagesResponse>(
                new java.util.function.Supplier<ListAllSoftwarePackagesRequest.Builder>() {
                    @Override
                    public ListAllSoftwarePackagesRequest.Builder get() {
                        return ListAllSoftwarePackagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAllSoftwarePackagesResponse, String>() {
                    @Override
                    public String apply(ListAllSoftwarePackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAllSoftwarePackagesRequest.Builder>,
                        ListAllSoftwarePackagesRequest>() {
                    @Override
                    public ListAllSoftwarePackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAllSoftwarePackagesRequest.Builder>
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
                        ListAllSoftwarePackagesRequest, ListAllSoftwarePackagesResponse>() {
                    @Override
                    public ListAllSoftwarePackagesResponse apply(
                            ListAllSoftwarePackagesRequest request) {
                        return client.listAllSoftwarePackages(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.osmanagementhub.model.SoftwarePackageSummary} objects
     * contained in responses from the listAllSoftwarePackages operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.osmanagementhub.model.SoftwarePackageSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagementhub.model.SoftwarePackageSummary>
            listAllSoftwarePackagesRecordIterator(final ListAllSoftwarePackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAllSoftwarePackagesRequest.Builder, ListAllSoftwarePackagesRequest,
                ListAllSoftwarePackagesResponse,
                com.oracle.bmc.osmanagementhub.model.SoftwarePackageSummary>(
                new java.util.function.Supplier<ListAllSoftwarePackagesRequest.Builder>() {
                    @Override
                    public ListAllSoftwarePackagesRequest.Builder get() {
                        return ListAllSoftwarePackagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAllSoftwarePackagesResponse, String>() {
                    @Override
                    public String apply(ListAllSoftwarePackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAllSoftwarePackagesRequest.Builder>,
                        ListAllSoftwarePackagesRequest>() {
                    @Override
                    public ListAllSoftwarePackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAllSoftwarePackagesRequest.Builder>
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
                        ListAllSoftwarePackagesRequest, ListAllSoftwarePackagesResponse>() {
                    @Override
                    public ListAllSoftwarePackagesResponse apply(
                            ListAllSoftwarePackagesRequest request) {
                        return client.listAllSoftwarePackages(request);
                    }
                },
                new java.util.function.Function<
                        ListAllSoftwarePackagesResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagementhub.model.SoftwarePackageSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagementhub.model.SoftwarePackageSummary>
                            apply(ListAllSoftwarePackagesResponse response) {
                        return response.getSoftwarePackageCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listEntitlements operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListEntitlementsResponse> listEntitlementsResponseIterator(
            final ListEntitlementsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListEntitlementsRequest.Builder, ListEntitlementsRequest, ListEntitlementsResponse>(
                new java.util.function.Supplier<ListEntitlementsRequest.Builder>() {
                    @Override
                    public ListEntitlementsRequest.Builder get() {
                        return ListEntitlementsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListEntitlementsResponse, String>() {
                    @Override
                    public String apply(ListEntitlementsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEntitlementsRequest.Builder>,
                        ListEntitlementsRequest>() {
                    @Override
                    public ListEntitlementsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEntitlementsRequest.Builder>
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
                        ListEntitlementsRequest, ListEntitlementsResponse>() {
                    @Override
                    public ListEntitlementsResponse apply(ListEntitlementsRequest request) {
                        return client.listEntitlements(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.osmanagementhub.model.EntitlementSummary} objects
     * contained in responses from the listEntitlements operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.osmanagementhub.model.EntitlementSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagementhub.model.EntitlementSummary>
            listEntitlementsRecordIterator(final ListEntitlementsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListEntitlementsRequest.Builder, ListEntitlementsRequest, ListEntitlementsResponse,
                com.oracle.bmc.osmanagementhub.model.EntitlementSummary>(
                new java.util.function.Supplier<ListEntitlementsRequest.Builder>() {
                    @Override
                    public ListEntitlementsRequest.Builder get() {
                        return ListEntitlementsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListEntitlementsResponse, String>() {
                    @Override
                    public String apply(ListEntitlementsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEntitlementsRequest.Builder>,
                        ListEntitlementsRequest>() {
                    @Override
                    public ListEntitlementsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEntitlementsRequest.Builder>
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
                        ListEntitlementsRequest, ListEntitlementsResponse>() {
                    @Override
                    public ListEntitlementsResponse apply(ListEntitlementsRequest request) {
                        return client.listEntitlements(request);
                    }
                },
                new java.util.function.Function<
                        ListEntitlementsResponse,
                        java.util.List<com.oracle.bmc.osmanagementhub.model.EntitlementSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.osmanagementhub.model.EntitlementSummary>
                            apply(ListEntitlementsResponse response) {
                        return response.getEntitlementCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listErrata operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListErrataResponse> listErrataResponseIterator(
            final ListErrataRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListErrataRequest.Builder, ListErrataRequest, ListErrataResponse>(
                new java.util.function.Supplier<ListErrataRequest.Builder>() {
                    @Override
                    public ListErrataRequest.Builder get() {
                        return ListErrataRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListErrataResponse, String>() {
                    @Override
                    public String apply(ListErrataResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListErrataRequest.Builder>,
                        ListErrataRequest>() {
                    @Override
                    public ListErrataRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListErrataRequest.Builder>
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
                new java.util.function.Function<ListErrataRequest, ListErrataResponse>() {
                    @Override
                    public ListErrataResponse apply(ListErrataRequest request) {
                        return client.listErrata(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.osmanagementhub.model.ErratumSummary} objects
     * contained in responses from the listErrata operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.osmanagementhub.model.ErratumSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagementhub.model.ErratumSummary> listErrataRecordIterator(
            final ListErrataRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListErrataRequest.Builder, ListErrataRequest, ListErrataResponse,
                com.oracle.bmc.osmanagementhub.model.ErratumSummary>(
                new java.util.function.Supplier<ListErrataRequest.Builder>() {
                    @Override
                    public ListErrataRequest.Builder get() {
                        return ListErrataRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListErrataResponse, String>() {
                    @Override
                    public String apply(ListErrataResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListErrataRequest.Builder>,
                        ListErrataRequest>() {
                    @Override
                    public ListErrataRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListErrataRequest.Builder>
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
                new java.util.function.Function<ListErrataRequest, ListErrataResponse>() {
                    @Override
                    public ListErrataResponse apply(ListErrataRequest request) {
                        return client.listErrata(request);
                    }
                },
                new java.util.function.Function<
                        ListErrataResponse,
                        java.util.List<com.oracle.bmc.osmanagementhub.model.ErratumSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.osmanagementhub.model.ErratumSummary>
                            apply(ListErrataResponse response) {
                        return response.getErratumCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listModuleStreamProfiles operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListModuleStreamProfilesResponse> listModuleStreamProfilesResponseIterator(
            final ListModuleStreamProfilesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListModuleStreamProfilesRequest.Builder, ListModuleStreamProfilesRequest,
                ListModuleStreamProfilesResponse>(
                new java.util.function.Supplier<ListModuleStreamProfilesRequest.Builder>() {
                    @Override
                    public ListModuleStreamProfilesRequest.Builder get() {
                        return ListModuleStreamProfilesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListModuleStreamProfilesResponse, String>() {
                    @Override
                    public String apply(ListModuleStreamProfilesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListModuleStreamProfilesRequest.Builder>,
                        ListModuleStreamProfilesRequest>() {
                    @Override
                    public ListModuleStreamProfilesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListModuleStreamProfilesRequest.Builder>
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
                        ListModuleStreamProfilesRequest, ListModuleStreamProfilesResponse>() {
                    @Override
                    public ListModuleStreamProfilesResponse apply(
                            ListModuleStreamProfilesRequest request) {
                        return client.listModuleStreamProfiles(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.osmanagementhub.model.ModuleStreamProfileSummary} objects
     * contained in responses from the listModuleStreamProfiles operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.osmanagementhub.model.ModuleStreamProfileSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagementhub.model.ModuleStreamProfileSummary>
            listModuleStreamProfilesRecordIterator(final ListModuleStreamProfilesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListModuleStreamProfilesRequest.Builder, ListModuleStreamProfilesRequest,
                ListModuleStreamProfilesResponse,
                com.oracle.bmc.osmanagementhub.model.ModuleStreamProfileSummary>(
                new java.util.function.Supplier<ListModuleStreamProfilesRequest.Builder>() {
                    @Override
                    public ListModuleStreamProfilesRequest.Builder get() {
                        return ListModuleStreamProfilesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListModuleStreamProfilesResponse, String>() {
                    @Override
                    public String apply(ListModuleStreamProfilesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListModuleStreamProfilesRequest.Builder>,
                        ListModuleStreamProfilesRequest>() {
                    @Override
                    public ListModuleStreamProfilesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListModuleStreamProfilesRequest.Builder>
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
                        ListModuleStreamProfilesRequest, ListModuleStreamProfilesResponse>() {
                    @Override
                    public ListModuleStreamProfilesResponse apply(
                            ListModuleStreamProfilesRequest request) {
                        return client.listModuleStreamProfiles(request);
                    }
                },
                new java.util.function.Function<
                        ListModuleStreamProfilesResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagementhub.model
                                        .ModuleStreamProfileSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagementhub.model.ModuleStreamProfileSummary>
                            apply(ListModuleStreamProfilesResponse response) {
                        return response.getModuleStreamProfileCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listModuleStreams operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListModuleStreamsResponse> listModuleStreamsResponseIterator(
            final ListModuleStreamsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListModuleStreamsRequest.Builder, ListModuleStreamsRequest,
                ListModuleStreamsResponse>(
                new java.util.function.Supplier<ListModuleStreamsRequest.Builder>() {
                    @Override
                    public ListModuleStreamsRequest.Builder get() {
                        return ListModuleStreamsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListModuleStreamsResponse, String>() {
                    @Override
                    public String apply(ListModuleStreamsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListModuleStreamsRequest.Builder>,
                        ListModuleStreamsRequest>() {
                    @Override
                    public ListModuleStreamsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListModuleStreamsRequest.Builder>
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
                        ListModuleStreamsRequest, ListModuleStreamsResponse>() {
                    @Override
                    public ListModuleStreamsResponse apply(ListModuleStreamsRequest request) {
                        return client.listModuleStreams(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.osmanagementhub.model.ModuleStreamSummary} objects
     * contained in responses from the listModuleStreams operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.osmanagementhub.model.ModuleStreamSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagementhub.model.ModuleStreamSummary>
            listModuleStreamsRecordIterator(final ListModuleStreamsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListModuleStreamsRequest.Builder, ListModuleStreamsRequest,
                ListModuleStreamsResponse,
                com.oracle.bmc.osmanagementhub.model.ModuleStreamSummary>(
                new java.util.function.Supplier<ListModuleStreamsRequest.Builder>() {
                    @Override
                    public ListModuleStreamsRequest.Builder get() {
                        return ListModuleStreamsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListModuleStreamsResponse, String>() {
                    @Override
                    public String apply(ListModuleStreamsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListModuleStreamsRequest.Builder>,
                        ListModuleStreamsRequest>() {
                    @Override
                    public ListModuleStreamsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListModuleStreamsRequest.Builder>
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
                        ListModuleStreamsRequest, ListModuleStreamsResponse>() {
                    @Override
                    public ListModuleStreamsResponse apply(ListModuleStreamsRequest request) {
                        return client.listModuleStreams(request);
                    }
                },
                new java.util.function.Function<
                        ListModuleStreamsResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagementhub.model.ModuleStreamSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.osmanagementhub.model.ModuleStreamSummary>
                            apply(ListModuleStreamsResponse response) {
                        return response.getModuleStreamCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listPackageGroups operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListPackageGroupsResponse> listPackageGroupsResponseIterator(
            final ListPackageGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPackageGroupsRequest.Builder, ListPackageGroupsRequest,
                ListPackageGroupsResponse>(
                new java.util.function.Supplier<ListPackageGroupsRequest.Builder>() {
                    @Override
                    public ListPackageGroupsRequest.Builder get() {
                        return ListPackageGroupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPackageGroupsResponse, String>() {
                    @Override
                    public String apply(ListPackageGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPackageGroupsRequest.Builder>,
                        ListPackageGroupsRequest>() {
                    @Override
                    public ListPackageGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPackageGroupsRequest.Builder>
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
                        ListPackageGroupsRequest, ListPackageGroupsResponse>() {
                    @Override
                    public ListPackageGroupsResponse apply(ListPackageGroupsRequest request) {
                        return client.listPackageGroups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.osmanagementhub.model.PackageGroupSummary} objects
     * contained in responses from the listPackageGroups operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.osmanagementhub.model.PackageGroupSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagementhub.model.PackageGroupSummary>
            listPackageGroupsRecordIterator(final ListPackageGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPackageGroupsRequest.Builder, ListPackageGroupsRequest,
                ListPackageGroupsResponse,
                com.oracle.bmc.osmanagementhub.model.PackageGroupSummary>(
                new java.util.function.Supplier<ListPackageGroupsRequest.Builder>() {
                    @Override
                    public ListPackageGroupsRequest.Builder get() {
                        return ListPackageGroupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPackageGroupsResponse, String>() {
                    @Override
                    public String apply(ListPackageGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPackageGroupsRequest.Builder>,
                        ListPackageGroupsRequest>() {
                    @Override
                    public ListPackageGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPackageGroupsRequest.Builder>
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
                        ListPackageGroupsRequest, ListPackageGroupsResponse>() {
                    @Override
                    public ListPackageGroupsResponse apply(ListPackageGroupsRequest request) {
                        return client.listPackageGroups(request);
                    }
                },
                new java.util.function.Function<
                        ListPackageGroupsResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagementhub.model.PackageGroupSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.osmanagementhub.model.PackageGroupSummary>
                            apply(ListPackageGroupsResponse response) {
                        return response.getPackageGroupCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSoftwarePackageSoftwareSources operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSoftwarePackageSoftwareSourcesResponse>
            listSoftwarePackageSoftwareSourcesResponseIterator(
                    final ListSoftwarePackageSoftwareSourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSoftwarePackageSoftwareSourcesRequest.Builder,
                ListSoftwarePackageSoftwareSourcesRequest,
                ListSoftwarePackageSoftwareSourcesResponse>(
                new java.util.function.Supplier<
                        ListSoftwarePackageSoftwareSourcesRequest.Builder>() {
                    @Override
                    public ListSoftwarePackageSoftwareSourcesRequest.Builder get() {
                        return ListSoftwarePackageSoftwareSourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListSoftwarePackageSoftwareSourcesResponse, String>() {
                    @Override
                    public String apply(ListSoftwarePackageSoftwareSourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSoftwarePackageSoftwareSourcesRequest.Builder>,
                        ListSoftwarePackageSoftwareSourcesRequest>() {
                    @Override
                    public ListSoftwarePackageSoftwareSourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSoftwarePackageSoftwareSourcesRequest.Builder>
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
                        ListSoftwarePackageSoftwareSourcesRequest,
                        ListSoftwarePackageSoftwareSourcesResponse>() {
                    @Override
                    public ListSoftwarePackageSoftwareSourcesResponse apply(
                            ListSoftwarePackageSoftwareSourcesRequest request) {
                        return client.listSoftwarePackageSoftwareSources(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.osmanagementhub.model.SoftwareSourceSummary} objects
     * contained in responses from the listSoftwarePackageSoftwareSources operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.osmanagementhub.model.SoftwareSourceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagementhub.model.SoftwareSourceSummary>
            listSoftwarePackageSoftwareSourcesRecordIterator(
                    final ListSoftwarePackageSoftwareSourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSoftwarePackageSoftwareSourcesRequest.Builder,
                ListSoftwarePackageSoftwareSourcesRequest,
                ListSoftwarePackageSoftwareSourcesResponse,
                com.oracle.bmc.osmanagementhub.model.SoftwareSourceSummary>(
                new java.util.function.Supplier<
                        ListSoftwarePackageSoftwareSourcesRequest.Builder>() {
                    @Override
                    public ListSoftwarePackageSoftwareSourcesRequest.Builder get() {
                        return ListSoftwarePackageSoftwareSourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListSoftwarePackageSoftwareSourcesResponse, String>() {
                    @Override
                    public String apply(ListSoftwarePackageSoftwareSourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSoftwarePackageSoftwareSourcesRequest.Builder>,
                        ListSoftwarePackageSoftwareSourcesRequest>() {
                    @Override
                    public ListSoftwarePackageSoftwareSourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSoftwarePackageSoftwareSourcesRequest.Builder>
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
                        ListSoftwarePackageSoftwareSourcesRequest,
                        ListSoftwarePackageSoftwareSourcesResponse>() {
                    @Override
                    public ListSoftwarePackageSoftwareSourcesResponse apply(
                            ListSoftwarePackageSoftwareSourcesRequest request) {
                        return client.listSoftwarePackageSoftwareSources(request);
                    }
                },
                new java.util.function.Function<
                        ListSoftwarePackageSoftwareSourcesResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagementhub.model.SoftwareSourceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagementhub.model.SoftwareSourceSummary>
                            apply(ListSoftwarePackageSoftwareSourcesResponse response) {
                        return response.getSoftwareSourceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSoftwarePackages operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSoftwarePackagesResponse> listSoftwarePackagesResponseIterator(
            final ListSoftwarePackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSoftwarePackagesRequest.Builder, ListSoftwarePackagesRequest,
                ListSoftwarePackagesResponse>(
                new java.util.function.Supplier<ListSoftwarePackagesRequest.Builder>() {
                    @Override
                    public ListSoftwarePackagesRequest.Builder get() {
                        return ListSoftwarePackagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSoftwarePackagesResponse, String>() {
                    @Override
                    public String apply(ListSoftwarePackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSoftwarePackagesRequest.Builder>,
                        ListSoftwarePackagesRequest>() {
                    @Override
                    public ListSoftwarePackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSoftwarePackagesRequest.Builder>
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
                        ListSoftwarePackagesRequest, ListSoftwarePackagesResponse>() {
                    @Override
                    public ListSoftwarePackagesResponse apply(ListSoftwarePackagesRequest request) {
                        return client.listSoftwarePackages(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.osmanagementhub.model.SoftwarePackageSummary} objects
     * contained in responses from the listSoftwarePackages operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.osmanagementhub.model.SoftwarePackageSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagementhub.model.SoftwarePackageSummary>
            listSoftwarePackagesRecordIterator(final ListSoftwarePackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSoftwarePackagesRequest.Builder, ListSoftwarePackagesRequest,
                ListSoftwarePackagesResponse,
                com.oracle.bmc.osmanagementhub.model.SoftwarePackageSummary>(
                new java.util.function.Supplier<ListSoftwarePackagesRequest.Builder>() {
                    @Override
                    public ListSoftwarePackagesRequest.Builder get() {
                        return ListSoftwarePackagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSoftwarePackagesResponse, String>() {
                    @Override
                    public String apply(ListSoftwarePackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSoftwarePackagesRequest.Builder>,
                        ListSoftwarePackagesRequest>() {
                    @Override
                    public ListSoftwarePackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSoftwarePackagesRequest.Builder>
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
                        ListSoftwarePackagesRequest, ListSoftwarePackagesResponse>() {
                    @Override
                    public ListSoftwarePackagesResponse apply(ListSoftwarePackagesRequest request) {
                        return client.listSoftwarePackages(request);
                    }
                },
                new java.util.function.Function<
                        ListSoftwarePackagesResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagementhub.model.SoftwarePackageSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagementhub.model.SoftwarePackageSummary>
                            apply(ListSoftwarePackagesResponse response) {
                        return response.getSoftwarePackageCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSoftwareSources operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSoftwareSourcesResponse> listSoftwareSourcesResponseIterator(
            final ListSoftwareSourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSoftwareSourcesRequest.Builder, ListSoftwareSourcesRequest,
                ListSoftwareSourcesResponse>(
                new java.util.function.Supplier<ListSoftwareSourcesRequest.Builder>() {
                    @Override
                    public ListSoftwareSourcesRequest.Builder get() {
                        return ListSoftwareSourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSoftwareSourcesResponse, String>() {
                    @Override
                    public String apply(ListSoftwareSourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSoftwareSourcesRequest.Builder>,
                        ListSoftwareSourcesRequest>() {
                    @Override
                    public ListSoftwareSourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSoftwareSourcesRequest.Builder>
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
                        ListSoftwareSourcesRequest, ListSoftwareSourcesResponse>() {
                    @Override
                    public ListSoftwareSourcesResponse apply(ListSoftwareSourcesRequest request) {
                        return client.listSoftwareSources(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.osmanagementhub.model.SoftwareSourceSummary} objects
     * contained in responses from the listSoftwareSources operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.osmanagementhub.model.SoftwareSourceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagementhub.model.SoftwareSourceSummary>
            listSoftwareSourcesRecordIterator(final ListSoftwareSourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSoftwareSourcesRequest.Builder, ListSoftwareSourcesRequest,
                ListSoftwareSourcesResponse,
                com.oracle.bmc.osmanagementhub.model.SoftwareSourceSummary>(
                new java.util.function.Supplier<ListSoftwareSourcesRequest.Builder>() {
                    @Override
                    public ListSoftwareSourcesRequest.Builder get() {
                        return ListSoftwareSourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSoftwareSourcesResponse, String>() {
                    @Override
                    public String apply(ListSoftwareSourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSoftwareSourcesRequest.Builder>,
                        ListSoftwareSourcesRequest>() {
                    @Override
                    public ListSoftwareSourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSoftwareSourcesRequest.Builder>
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
                        ListSoftwareSourcesRequest, ListSoftwareSourcesResponse>() {
                    @Override
                    public ListSoftwareSourcesResponse apply(ListSoftwareSourcesRequest request) {
                        return client.listSoftwareSources(request);
                    }
                },
                new java.util.function.Function<
                        ListSoftwareSourcesResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagementhub.model.SoftwareSourceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagementhub.model.SoftwareSourceSummary>
                            apply(ListSoftwareSourcesResponse response) {
                        return response.getSoftwareSourceCollection().getItems();
                    }
                });
    }
}
