/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListLogAnalyticsEmBridgesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListLogAnalyticsEmBridgesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class ListLogAnalyticsEmBridgesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The Logging Analytics namespace used for the request. */
    private String namespaceName;

    /** The Logging Analytics namespace used for the request. */
    public String getNamespaceName() {
        return namespaceName;
    }
    /** The ID of the compartment in which to list resources. */
    private String compartmentId;

    /** The ID of the compartment in which to list resources. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * A filter to return only log analytics enterprise manager bridge name whose name matches the
     * entire name given. The match is case-insensitive.
     */
    private String displayName;

    /**
     * A filter to return only log analytics enterprise manager bridge name whose name matches the
     * entire name given. The match is case-insensitive.
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * A filter to return only log analytics enterprise manager bridges matching all the lifecycle
     * states specified for this parameter.
     */
    private java.util.List<com.oracle.bmc.loganalytics.model.EmBridgeLifecycleStates>
            lifecycleState;

    /**
     * A filter to return only log analytics enterprise manager bridges matching all the lifecycle
     * states specified for this parameter.
     */
    public java.util.List<com.oracle.bmc.loganalytics.model.EmBridgeLifecycleStates>
            getLifecycleState() {
        return lifecycleState;
    }
    /**
     * A filter to return only log analytics enterprise manager bridges whose lifecycleDetails
     * contains the specified string.
     */
    private String lifecycleDetailsContains;

    /**
     * A filter to return only log analytics enterprise manager bridges whose lifecycleDetails
     * contains the specified string.
     */
    public String getLifecycleDetailsContains() {
        return lifecycleDetailsContains;
    }
    /** Filter by the processing status of the latest upload from enterprise manager. */
    private java.util.List<com.oracle.bmc.loganalytics.model.EmBridgeLatestImportProcessingStatus>
            importStatus;

    /** Filter by the processing status of the latest upload from enterprise manager. */
    public java.util.List<com.oracle.bmc.loganalytics.model.EmBridgeLatestImportProcessingStatus>
            getImportStatus() {
        return importStatus;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    private SortOrder sortOrder;

    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    public enum SortOrder implements com.oracle.bmc.http.internal.BmcEnum {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };

    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort enterprise manager bridges by. Only one sort order may be provided. Default
     * order for timeCreated and timeUpdated is descending. Default order for enterprise manager
     * name is ascending. If no value is specified timeCreated is default.
     */
    private SortBy sortBy;

    /**
     * The field to sort enterprise manager bridges by. Only one sort order may be provided. Default
     * order for timeCreated and timeUpdated is descending. Default order for enterprise manager
     * name is ascending. If no value is specified timeCreated is default.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("timeCreated"),
        TimeUpdated("timeUpdated"),
        DisplayName("displayName"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };

    /**
     * The field to sort enterprise manager bridges by. Only one sort order may be provided. Default
     * order for timeCreated and timeUpdated is descending. Default order for enterprise manager
     * name is ascending. If no value is specified timeCreated is default.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListLogAnalyticsEmBridgesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The Logging Analytics namespace used for the request. */
        private String namespaceName = null;

        /**
         * The Logging Analytics namespace used for the request.
         *
         * @param namespaceName the value to set
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        /** The ID of the compartment in which to list resources. */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which to list resources.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * A filter to return only log analytics enterprise manager bridge name whose name matches
         * the entire name given. The match is case-insensitive.
         */
        private String displayName = null;

        /**
         * A filter to return only log analytics enterprise manager bridge name whose name matches
         * the entire name given. The match is case-insensitive.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * A filter to return only log analytics enterprise manager bridges matching all the
         * lifecycle states specified for this parameter.
         */
        private java.util.List<com.oracle.bmc.loganalytics.model.EmBridgeLifecycleStates>
                lifecycleState = null;

        /**
         * A filter to return only log analytics enterprise manager bridges matching all the
         * lifecycle states specified for this parameter.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                java.util.List<com.oracle.bmc.loganalytics.model.EmBridgeLifecycleStates>
                        lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * Singular setter. A filter to return only log analytics enterprise manager bridges
         * matching all the lifecycle states specified for this parameter.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder lifecycleState(EmBridgeLifecycleStates singularValue) {
            return this.lifecycleState(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return only log analytics enterprise manager bridges whose lifecycleDetails
         * contains the specified string.
         */
        private String lifecycleDetailsContains = null;

        /**
         * A filter to return only log analytics enterprise manager bridges whose lifecycleDetails
         * contains the specified string.
         *
         * @param lifecycleDetailsContains the value to set
         * @return this builder instance
         */
        public Builder lifecycleDetailsContains(String lifecycleDetailsContains) {
            this.lifecycleDetailsContains = lifecycleDetailsContains;
            return this;
        }

        /** Filter by the processing status of the latest upload from enterprise manager. */
        private java.util.List<
                        com.oracle.bmc.loganalytics.model.EmBridgeLatestImportProcessingStatus>
                importStatus = null;

        /**
         * Filter by the processing status of the latest upload from enterprise manager.
         *
         * @param importStatus the value to set
         * @return this builder instance
         */
        public Builder importStatus(
                java.util.List<
                                com.oracle.bmc.loganalytics.model
                                        .EmBridgeLatestImportProcessingStatus>
                        importStatus) {
            this.importStatus = importStatus;
            return this;
        }

        /**
         * Singular setter. Filter by the processing status of the latest upload from enterprise
         * manager.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder importStatus(EmBridgeLatestImportProcessingStatus singularValue) {
            return this.importStatus(java.util.Arrays.asList(singularValue));
        }

        /** The maximum number of items to return. */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort enterprise manager bridges by. Only one sort order may be provided.
         * Default order for timeCreated and timeUpdated is descending. Default order for enterprise
         * manager name is ascending. If no value is specified timeCreated is default.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort enterprise manager bridges by. Only one sort order may be provided.
         * Default order for timeCreated and timeUpdated is descending. Default order for enterprise
         * manager name is ascending. If no value is specified timeCreated is default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        public Builder copy(ListLogAnalyticsEmBridgesRequest o) {
            namespaceName(o.getNamespaceName());
            compartmentId(o.getCompartmentId());
            displayName(o.getDisplayName());
            lifecycleState(o.getLifecycleState());
            lifecycleDetailsContains(o.getLifecycleDetailsContains());
            importStatus(o.getImportStatus());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListLogAnalyticsEmBridgesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListLogAnalyticsEmBridgesRequest
         */
        public ListLogAnalyticsEmBridgesRequest build() {
            ListLogAnalyticsEmBridgesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListLogAnalyticsEmBridgesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListLogAnalyticsEmBridgesRequest
         */
        public ListLogAnalyticsEmBridgesRequest buildWithoutInvocationCallback() {
            ListLogAnalyticsEmBridgesRequest request = new ListLogAnalyticsEmBridgesRequest();
            request.namespaceName = namespaceName;
            request.compartmentId = compartmentId;
            request.displayName = displayName;
            request.lifecycleState = lifecycleState;
            request.lifecycleDetailsContains = lifecycleDetailsContains;
            request.importStatus = importStatus;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListLogAnalyticsEmBridgesRequest(namespaceName, compartmentId, displayName,
            // lifecycleState, lifecycleDetailsContains, importStatus, limit, page, sortOrder,
            // sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .compartmentId(compartmentId)
                .displayName(displayName)
                .lifecycleState(lifecycleState)
                .lifecycleDetailsContains(lifecycleDetailsContains)
                .importStatus(importStatus)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
     *
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",lifecycleDetailsContains=")
                .append(String.valueOf(this.lifecycleDetailsContains));
        sb.append(",importStatus=").append(String.valueOf(this.importStatus));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListLogAnalyticsEmBridgesRequest)) {
            return false;
        }

        ListLogAnalyticsEmBridgesRequest other = (ListLogAnalyticsEmBridgesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(
                        this.lifecycleDetailsContains, other.lifecycleDetailsContains)
                && java.util.Objects.equals(this.importStatus, other.importStatus)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetailsContains == null
                                ? 43
                                : this.lifecycleDetailsContains.hashCode());
        result = (result * PRIME) + (this.importStatus == null ? 43 : this.importStatus.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
