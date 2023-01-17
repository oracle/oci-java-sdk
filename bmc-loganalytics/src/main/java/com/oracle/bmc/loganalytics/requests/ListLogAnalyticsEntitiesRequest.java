/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListLogAnalyticsEntitiesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListLogAnalyticsEntitiesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class ListLogAnalyticsEntitiesRequest
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
     * A filter to return only log analytics entities whose name matches the entire name given. The
     * match is case-insensitive.
     */
    private String name;

    /**
     * A filter to return only log analytics entities whose name matches the entire name given. The
     * match is case-insensitive.
     */
    public String getName() {
        return name;
    }
    /**
     * A filter to return only log analytics entities whose name contains the name given. The match
     * is case-insensitive.
     */
    private String nameContains;

    /**
     * A filter to return only log analytics entities whose name contains the name given. The match
     * is case-insensitive.
     */
    public String getNameContains() {
        return nameContains;
    }
    /**
     * A filter to return only log analytics entities whose entityTypeName matches the entire log
     * analytics entity type name of one of the entityTypeNames given in the list. The match is
     * case-insensitive.
     */
    private java.util.List<String> entityTypeName;

    /**
     * A filter to return only log analytics entities whose entityTypeName matches the entire log
     * analytics entity type name of one of the entityTypeNames given in the list. The match is
     * case-insensitive.
     */
    public java.util.List<String> getEntityTypeName() {
        return entityTypeName;
    }
    /**
     * A filter to return only log analytics entities whose cloudResourceId matches the
     * cloudResourceId given.
     */
    private String cloudResourceId;

    /**
     * A filter to return only log analytics entities whose cloudResourceId matches the
     * cloudResourceId given.
     */
    public String getCloudResourceId() {
        return cloudResourceId;
    }
    /**
     * A filter to return only those log analytics entities with the specified lifecycle state. The
     * state value is case-insensitive.
     */
    private com.oracle.bmc.loganalytics.model.EntityLifecycleStates lifecycleState;

    /**
     * A filter to return only those log analytics entities with the specified lifecycle state. The
     * state value is case-insensitive.
     */
    public com.oracle.bmc.loganalytics.model.EntityLifecycleStates getLifecycleState() {
        return lifecycleState;
    }
    /**
     * A filter to return only log analytics entities whose lifecycleDetails contains the specified
     * string.
     */
    private String lifecycleDetailsContains;

    /**
     * A filter to return only log analytics entities whose lifecycleDetails contains the specified
     * string.
     */
    public String getLifecycleDetailsContains() {
        return lifecycleDetailsContains;
    }
    /**
     * A filter to return only those log analytics entities whose managementAgentId is null or is
     * not null.
     */
    private IsManagementAgentIdNull isManagementAgentIdNull;

    /**
     * A filter to return only those log analytics entities whose managementAgentId is null or is
     * not null.
     */
    public enum IsManagementAgentIdNull implements com.oracle.bmc.http.internal.BmcEnum {
        True("true"),
        False("false"),
        ;

        private final String value;
        private static java.util.Map<String, IsManagementAgentIdNull> map;

        static {
            map = new java.util.HashMap<>();
            for (IsManagementAgentIdNull v : IsManagementAgentIdNull.values()) {
                map.put(v.getValue(), v);
            }
        }

        IsManagementAgentIdNull(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IsManagementAgentIdNull create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid IsManagementAgentIdNull: " + key);
        }
    };

    /**
     * A filter to return only those log analytics entities whose managementAgentId is null or is
     * not null.
     */
    public IsManagementAgentIdNull getIsManagementAgentIdNull() {
        return isManagementAgentIdNull;
    }
    /**
     * A filter to return only log analytics entities whose hostname matches the entire hostname
     * given.
     */
    private String hostname;

    /**
     * A filter to return only log analytics entities whose hostname matches the entire hostname
     * given.
     */
    public String getHostname() {
        return hostname;
    }
    /**
     * A filter to return only log analytics entities whose hostname contains the substring given.
     * The match is case-insensitive.
     */
    private String hostnameContains;

    /**
     * A filter to return only log analytics entities whose hostname contains the substring given.
     * The match is case-insensitive.
     */
    public String getHostnameContains() {
        return hostnameContains;
    }
    /** A filter to return only log analytics entities whose sourceId matches the sourceId given. */
    private String sourceId;

    /** A filter to return only log analytics entities whose sourceId matches the sourceId given. */
    public String getSourceId() {
        return sourceId;
    }
    /**
     * A filter to return only those log analytics entities with the specified auto-creation source.
     */
    private java.util.List<com.oracle.bmc.loganalytics.model.CreationSourceType> creationSourceType;

    /**
     * A filter to return only those log analytics entities with the specified auto-creation source.
     */
    public java.util.List<com.oracle.bmc.loganalytics.model.CreationSourceType>
            getCreationSourceType() {
        return creationSourceType;
    }
    /**
     * A filter to return only log analytics entities whose auto-creation source details contains
     * the specified string.
     */
    private String creationSourceDetails;

    /**
     * A filter to return only log analytics entities whose auto-creation source details contains
     * the specified string.
     */
    public String getCreationSourceDetails() {
        return creationSourceDetails;
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
     * The field to sort entities by. Only one sort order may be provided. Default order for
     * timeCreated and timeUpdated is descending. Default order for entity name is ascending. If no
     * value is specified timeCreated is default.
     */
    private SortBy sortBy;

    /**
     * The field to sort entities by. Only one sort order may be provided. Default order for
     * timeCreated and timeUpdated is descending. Default order for entity name is ascending. If no
     * value is specified timeCreated is default.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("timeCreated"),
        TimeUpdated("timeUpdated"),
        Name("name"),
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
     * The field to sort entities by. Only one sort order may be provided. Default order for
     * timeCreated and timeUpdated is descending. Default order for entity name is ascending. If no
     * value is specified timeCreated is default.
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
                    ListLogAnalyticsEntitiesRequest, java.lang.Void> {
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
         * A filter to return only log analytics entities whose name matches the entire name given.
         * The match is case-insensitive.
         */
        private String name = null;

        /**
         * A filter to return only log analytics entities whose name matches the entire name given.
         * The match is case-insensitive.
         *
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * A filter to return only log analytics entities whose name contains the name given. The
         * match is case-insensitive.
         */
        private String nameContains = null;

        /**
         * A filter to return only log analytics entities whose name contains the name given. The
         * match is case-insensitive.
         *
         * @param nameContains the value to set
         * @return this builder instance
         */
        public Builder nameContains(String nameContains) {
            this.nameContains = nameContains;
            return this;
        }

        /**
         * A filter to return only log analytics entities whose entityTypeName matches the entire
         * log analytics entity type name of one of the entityTypeNames given in the list. The match
         * is case-insensitive.
         */
        private java.util.List<String> entityTypeName = null;

        /**
         * A filter to return only log analytics entities whose entityTypeName matches the entire
         * log analytics entity type name of one of the entityTypeNames given in the list. The match
         * is case-insensitive.
         *
         * @param entityTypeName the value to set
         * @return this builder instance
         */
        public Builder entityTypeName(java.util.List<String> entityTypeName) {
            this.entityTypeName = entityTypeName;
            return this;
        }

        /**
         * Singular setter. A filter to return only log analytics entities whose entityTypeName
         * matches the entire log analytics entity type name of one of the entityTypeNames given in
         * the list. The match is case-insensitive.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder entityTypeName(String singularValue) {
            return this.entityTypeName(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return only log analytics entities whose cloudResourceId matches the
         * cloudResourceId given.
         */
        private String cloudResourceId = null;

        /**
         * A filter to return only log analytics entities whose cloudResourceId matches the
         * cloudResourceId given.
         *
         * @param cloudResourceId the value to set
         * @return this builder instance
         */
        public Builder cloudResourceId(String cloudResourceId) {
            this.cloudResourceId = cloudResourceId;
            return this;
        }

        /**
         * A filter to return only those log analytics entities with the specified lifecycle state.
         * The state value is case-insensitive.
         */
        private com.oracle.bmc.loganalytics.model.EntityLifecycleStates lifecycleState = null;

        /**
         * A filter to return only those log analytics entities with the specified lifecycle state.
         * The state value is case-insensitive.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.loganalytics.model.EntityLifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * A filter to return only log analytics entities whose lifecycleDetails contains the
         * specified string.
         */
        private String lifecycleDetailsContains = null;

        /**
         * A filter to return only log analytics entities whose lifecycleDetails contains the
         * specified string.
         *
         * @param lifecycleDetailsContains the value to set
         * @return this builder instance
         */
        public Builder lifecycleDetailsContains(String lifecycleDetailsContains) {
            this.lifecycleDetailsContains = lifecycleDetailsContains;
            return this;
        }

        /**
         * A filter to return only those log analytics entities whose managementAgentId is null or
         * is not null.
         */
        private IsManagementAgentIdNull isManagementAgentIdNull = null;

        /**
         * A filter to return only those log analytics entities whose managementAgentId is null or
         * is not null.
         *
         * @param isManagementAgentIdNull the value to set
         * @return this builder instance
         */
        public Builder isManagementAgentIdNull(IsManagementAgentIdNull isManagementAgentIdNull) {
            this.isManagementAgentIdNull = isManagementAgentIdNull;
            return this;
        }

        /**
         * A filter to return only log analytics entities whose hostname matches the entire hostname
         * given.
         */
        private String hostname = null;

        /**
         * A filter to return only log analytics entities whose hostname matches the entire hostname
         * given.
         *
         * @param hostname the value to set
         * @return this builder instance
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            return this;
        }

        /**
         * A filter to return only log analytics entities whose hostname contains the substring
         * given. The match is case-insensitive.
         */
        private String hostnameContains = null;

        /**
         * A filter to return only log analytics entities whose hostname contains the substring
         * given. The match is case-insensitive.
         *
         * @param hostnameContains the value to set
         * @return this builder instance
         */
        public Builder hostnameContains(String hostnameContains) {
            this.hostnameContains = hostnameContains;
            return this;
        }

        /**
         * A filter to return only log analytics entities whose sourceId matches the sourceId given.
         */
        private String sourceId = null;

        /**
         * A filter to return only log analytics entities whose sourceId matches the sourceId given.
         *
         * @param sourceId the value to set
         * @return this builder instance
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * A filter to return only those log analytics entities with the specified auto-creation
         * source.
         */
        private java.util.List<com.oracle.bmc.loganalytics.model.CreationSourceType>
                creationSourceType = null;

        /**
         * A filter to return only those log analytics entities with the specified auto-creation
         * source.
         *
         * @param creationSourceType the value to set
         * @return this builder instance
         */
        public Builder creationSourceType(
                java.util.List<com.oracle.bmc.loganalytics.model.CreationSourceType>
                        creationSourceType) {
            this.creationSourceType = creationSourceType;
            return this;
        }

        /**
         * Singular setter. A filter to return only those log analytics entities with the specified
         * auto-creation source.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder creationSourceType(CreationSourceType singularValue) {
            return this.creationSourceType(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return only log analytics entities whose auto-creation source details
         * contains the specified string.
         */
        private String creationSourceDetails = null;

        /**
         * A filter to return only log analytics entities whose auto-creation source details
         * contains the specified string.
         *
         * @param creationSourceDetails the value to set
         * @return this builder instance
         */
        public Builder creationSourceDetails(String creationSourceDetails) {
            this.creationSourceDetails = creationSourceDetails;
            return this;
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
         * The field to sort entities by. Only one sort order may be provided. Default order for
         * timeCreated and timeUpdated is descending. Default order for entity name is ascending. If
         * no value is specified timeCreated is default.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort entities by. Only one sort order may be provided. Default order for
         * timeCreated and timeUpdated is descending. Default order for entity name is ascending. If
         * no value is specified timeCreated is default.
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
        public Builder copy(ListLogAnalyticsEntitiesRequest o) {
            namespaceName(o.getNamespaceName());
            compartmentId(o.getCompartmentId());
            name(o.getName());
            nameContains(o.getNameContains());
            entityTypeName(o.getEntityTypeName());
            cloudResourceId(o.getCloudResourceId());
            lifecycleState(o.getLifecycleState());
            lifecycleDetailsContains(o.getLifecycleDetailsContains());
            isManagementAgentIdNull(o.getIsManagementAgentIdNull());
            hostname(o.getHostname());
            hostnameContains(o.getHostnameContains());
            sourceId(o.getSourceId());
            creationSourceType(o.getCreationSourceType());
            creationSourceDetails(o.getCreationSourceDetails());
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
         * Build the instance of ListLogAnalyticsEntitiesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListLogAnalyticsEntitiesRequest
         */
        public ListLogAnalyticsEntitiesRequest build() {
            ListLogAnalyticsEntitiesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListLogAnalyticsEntitiesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListLogAnalyticsEntitiesRequest
         */
        public ListLogAnalyticsEntitiesRequest buildWithoutInvocationCallback() {
            ListLogAnalyticsEntitiesRequest request = new ListLogAnalyticsEntitiesRequest();
            request.namespaceName = namespaceName;
            request.compartmentId = compartmentId;
            request.name = name;
            request.nameContains = nameContains;
            request.entityTypeName = entityTypeName;
            request.cloudResourceId = cloudResourceId;
            request.lifecycleState = lifecycleState;
            request.lifecycleDetailsContains = lifecycleDetailsContains;
            request.isManagementAgentIdNull = isManagementAgentIdNull;
            request.hostname = hostname;
            request.hostnameContains = hostnameContains;
            request.sourceId = sourceId;
            request.creationSourceType = creationSourceType;
            request.creationSourceDetails = creationSourceDetails;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListLogAnalyticsEntitiesRequest(namespaceName, compartmentId, name, nameContains,
            // entityTypeName, cloudResourceId, lifecycleState, lifecycleDetailsContains,
            // isManagementAgentIdNull, hostname, hostnameContains, sourceId, creationSourceType,
            // creationSourceDetails, limit, page, sortOrder, sortBy, opcRequestId);
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
                .name(name)
                .nameContains(nameContains)
                .entityTypeName(entityTypeName)
                .cloudResourceId(cloudResourceId)
                .lifecycleState(lifecycleState)
                .lifecycleDetailsContains(lifecycleDetailsContains)
                .isManagementAgentIdNull(isManagementAgentIdNull)
                .hostname(hostname)
                .hostnameContains(hostnameContains)
                .sourceId(sourceId)
                .creationSourceType(creationSourceType)
                .creationSourceDetails(creationSourceDetails)
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
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",nameContains=").append(String.valueOf(this.nameContains));
        sb.append(",entityTypeName=").append(String.valueOf(this.entityTypeName));
        sb.append(",cloudResourceId=").append(String.valueOf(this.cloudResourceId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",lifecycleDetailsContains=")
                .append(String.valueOf(this.lifecycleDetailsContains));
        sb.append(",isManagementAgentIdNull=").append(String.valueOf(this.isManagementAgentIdNull));
        sb.append(",hostname=").append(String.valueOf(this.hostname));
        sb.append(",hostnameContains=").append(String.valueOf(this.hostnameContains));
        sb.append(",sourceId=").append(String.valueOf(this.sourceId));
        sb.append(",creationSourceType=").append(String.valueOf(this.creationSourceType));
        sb.append(",creationSourceDetails=").append(String.valueOf(this.creationSourceDetails));
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
        if (!(o instanceof ListLogAnalyticsEntitiesRequest)) {
            return false;
        }

        ListLogAnalyticsEntitiesRequest other = (ListLogAnalyticsEntitiesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.nameContains, other.nameContains)
                && java.util.Objects.equals(this.entityTypeName, other.entityTypeName)
                && java.util.Objects.equals(this.cloudResourceId, other.cloudResourceId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(
                        this.lifecycleDetailsContains, other.lifecycleDetailsContains)
                && java.util.Objects.equals(
                        this.isManagementAgentIdNull, other.isManagementAgentIdNull)
                && java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.hostnameContains, other.hostnameContains)
                && java.util.Objects.equals(this.sourceId, other.sourceId)
                && java.util.Objects.equals(this.creationSourceType, other.creationSourceType)
                && java.util.Objects.equals(this.creationSourceDetails, other.creationSourceDetails)
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
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.nameContains == null ? 43 : this.nameContains.hashCode());
        result =
                (result * PRIME)
                        + (this.entityTypeName == null ? 43 : this.entityTypeName.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudResourceId == null ? 43 : this.cloudResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetailsContains == null
                                ? 43
                                : this.lifecycleDetailsContains.hashCode());
        result =
                (result * PRIME)
                        + (this.isManagementAgentIdNull == null
                                ? 43
                                : this.isManagementAgentIdNull.hashCode());
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result =
                (result * PRIME)
                        + (this.hostnameContains == null ? 43 : this.hostnameContains.hashCode());
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.creationSourceType == null
                                ? 43
                                : this.creationSourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.creationSourceDetails == null
                                ? 43
                                : this.creationSourceDetails.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
