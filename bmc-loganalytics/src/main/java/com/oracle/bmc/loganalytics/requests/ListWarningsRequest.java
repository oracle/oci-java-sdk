/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListWarningsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListWarningsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class ListWarningsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * The warning state used for filtering. A value of SUPPRESSED will return only suppressed
     * warnings, a value of UNSUPPRESSED will return only unsuppressed warnings, and a value of ALL
     * will return all warnings regardless of their suppression state. Default is UNSUPPRESSED.
     */
    private WarningState warningState;

    /**
     * The warning state used for filtering. A value of SUPPRESSED will return only suppressed
     * warnings, a value of UNSUPPRESSED will return only unsuppressed warnings, and a value of ALL
     * will return all warnings regardless of their suppression state. Default is UNSUPPRESSED.
     */
    public enum WarningState implements com.oracle.bmc.http.internal.BmcEnum {
        All("ALL"),
        Suppressed("SUPPRESSED"),
        Unsuppressed("UNSUPPRESSED"),
        ;

        private final String value;
        private static java.util.Map<String, WarningState> map;

        static {
            map = new java.util.HashMap<>();
            for (WarningState v : WarningState.values()) {
                map.put(v.getValue(), v);
            }
        }

        WarningState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static WarningState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid WarningState: " + key);
        }
    };

    /**
     * The warning state used for filtering. A value of SUPPRESSED will return only suppressed
     * warnings, a value of UNSUPPRESSED will return only unsuppressed warnings, and a value of ALL
     * will return all warnings regardless of their suppression state. Default is UNSUPPRESSED.
     */
    public WarningState getWarningState() {
        return warningState;
    }
    /** The source name. */
    private String sourceName;

    /** The source name. */
    public String getSourceName() {
        return sourceName;
    }
    /**
     * The source pattern used for filtering. Only warnings associated with a source with the
     * specified pattern will be returned.
     */
    private String sourcePattern;

    /**
     * The source pattern used for filtering. Only warnings associated with a source with the
     * specified pattern will be returned.
     */
    public String getSourcePattern() {
        return sourcePattern;
    }
    /** warning message query parameter */
    private String warningMessage;

    /** warning message query parameter */
    public String getWarningMessage() {
        return warningMessage;
    }
    /**
     * The entity name used for filtering. Only warnings associated with an entity with the
     * specified name will be returned.
     */
    private String entityName;

    /**
     * The entity name used for filtering. Only warnings associated with an entity with the
     * specified name will be returned.
     */
    public String getEntityName() {
        return entityName;
    }
    /**
     * The entity type used for filtering. Only associations on an entity with the specified type
     * will be returned.
     */
    private String entityType;

    /**
     * The entity type used for filtering. Only associations on an entity with the specified type
     * will be returned.
     */
    public String getEntityType() {
        return entityType;
    }
    /** The warning type query parameter. */
    private String warningType;

    /** The warning type query parameter. */
    public String getWarningType() {
        return warningType;
    }
    /**
     * A flag indicating whether to filter warnings based on source display name or on warning
     * level. A value of true will filter based on warning level (rule, source, or pattern), while a
     * value of false will filter based on source display name.
     */
    private Boolean isNoSource;

    /**
     * A flag indicating whether to filter warnings based on source display name or on warning
     * level. A value of true will filter based on warning level (rule, source, or pattern), while a
     * value of false will filter based on source display name.
     */
    public Boolean getIsNoSource() {
        return isNoSource;
    }
    /** The warning start date query parameter. */
    private String startTime;

    /** The warning start date query parameter. */
    public String getStartTime() {
        return startTime;
    }
    /** The warning end date query parameter. */
    private String endTime;

    /** The warning end date query parameter. */
    public String getEndTime() {
        return endTime;
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
    /** The attribute used to sort the returned warnings */
    private SortBy sortBy;

    /** The attribute used to sort the returned warnings */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        EntityType("EntityType"),
        SourceName("SourceName"),
        PatternText("PatternText"),
        FirstReported("FirstReported"),
        WarningMessage("WarningMessage"),
        Host("Host"),
        EntityName("EntityName"),
        InitialWarningDate("InitialWarningDate"),
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

    /** The attribute used to sort the returned warnings */
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
                    ListWarningsRequest, java.lang.Void> {
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
         * The warning state used for filtering. A value of SUPPRESSED will return only suppressed
         * warnings, a value of UNSUPPRESSED will return only unsuppressed warnings, and a value of
         * ALL will return all warnings regardless of their suppression state. Default is
         * UNSUPPRESSED.
         */
        private WarningState warningState = null;

        /**
         * The warning state used for filtering. A value of SUPPRESSED will return only suppressed
         * warnings, a value of UNSUPPRESSED will return only unsuppressed warnings, and a value of
         * ALL will return all warnings regardless of their suppression state. Default is
         * UNSUPPRESSED.
         *
         * @param warningState the value to set
         * @return this builder instance
         */
        public Builder warningState(WarningState warningState) {
            this.warningState = warningState;
            return this;
        }

        /** The source name. */
        private String sourceName = null;

        /**
         * The source name.
         *
         * @param sourceName the value to set
         * @return this builder instance
         */
        public Builder sourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }

        /**
         * The source pattern used for filtering. Only warnings associated with a source with the
         * specified pattern will be returned.
         */
        private String sourcePattern = null;

        /**
         * The source pattern used for filtering. Only warnings associated with a source with the
         * specified pattern will be returned.
         *
         * @param sourcePattern the value to set
         * @return this builder instance
         */
        public Builder sourcePattern(String sourcePattern) {
            this.sourcePattern = sourcePattern;
            return this;
        }

        /** warning message query parameter */
        private String warningMessage = null;

        /**
         * warning message query parameter
         *
         * @param warningMessage the value to set
         * @return this builder instance
         */
        public Builder warningMessage(String warningMessage) {
            this.warningMessage = warningMessage;
            return this;
        }

        /**
         * The entity name used for filtering. Only warnings associated with an entity with the
         * specified name will be returned.
         */
        private String entityName = null;

        /**
         * The entity name used for filtering. Only warnings associated with an entity with the
         * specified name will be returned.
         *
         * @param entityName the value to set
         * @return this builder instance
         */
        public Builder entityName(String entityName) {
            this.entityName = entityName;
            return this;
        }

        /**
         * The entity type used for filtering. Only associations on an entity with the specified
         * type will be returned.
         */
        private String entityType = null;

        /**
         * The entity type used for filtering. Only associations on an entity with the specified
         * type will be returned.
         *
         * @param entityType the value to set
         * @return this builder instance
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            return this;
        }

        /** The warning type query parameter. */
        private String warningType = null;

        /**
         * The warning type query parameter.
         *
         * @param warningType the value to set
         * @return this builder instance
         */
        public Builder warningType(String warningType) {
            this.warningType = warningType;
            return this;
        }

        /**
         * A flag indicating whether to filter warnings based on source display name or on warning
         * level. A value of true will filter based on warning level (rule, source, or pattern),
         * while a value of false will filter based on source display name.
         */
        private Boolean isNoSource = null;

        /**
         * A flag indicating whether to filter warnings based on source display name or on warning
         * level. A value of true will filter based on warning level (rule, source, or pattern),
         * while a value of false will filter based on source display name.
         *
         * @param isNoSource the value to set
         * @return this builder instance
         */
        public Builder isNoSource(Boolean isNoSource) {
            this.isNoSource = isNoSource;
            return this;
        }

        /** The warning start date query parameter. */
        private String startTime = null;

        /**
         * The warning start date query parameter.
         *
         * @param startTime the value to set
         * @return this builder instance
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /** The warning end date query parameter. */
        private String endTime = null;

        /**
         * The warning end date query parameter.
         *
         * @param endTime the value to set
         * @return this builder instance
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
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

        /** The attribute used to sort the returned warnings */
        private SortBy sortBy = null;

        /**
         * The attribute used to sort the returned warnings
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
        public Builder copy(ListWarningsRequest o) {
            namespaceName(o.getNamespaceName());
            compartmentId(o.getCompartmentId());
            warningState(o.getWarningState());
            sourceName(o.getSourceName());
            sourcePattern(o.getSourcePattern());
            warningMessage(o.getWarningMessage());
            entityName(o.getEntityName());
            entityType(o.getEntityType());
            warningType(o.getWarningType());
            isNoSource(o.getIsNoSource());
            startTime(o.getStartTime());
            endTime(o.getEndTime());
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
         * Build the instance of ListWarningsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListWarningsRequest
         */
        public ListWarningsRequest build() {
            ListWarningsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListWarningsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListWarningsRequest
         */
        public ListWarningsRequest buildWithoutInvocationCallback() {
            ListWarningsRequest request = new ListWarningsRequest();
            request.namespaceName = namespaceName;
            request.compartmentId = compartmentId;
            request.warningState = warningState;
            request.sourceName = sourceName;
            request.sourcePattern = sourcePattern;
            request.warningMessage = warningMessage;
            request.entityName = entityName;
            request.entityType = entityType;
            request.warningType = warningType;
            request.isNoSource = isNoSource;
            request.startTime = startTime;
            request.endTime = endTime;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListWarningsRequest(namespaceName, compartmentId, warningState, sourceName,
            // sourcePattern, warningMessage, entityName, entityType, warningType, isNoSource,
            // startTime, endTime, limit, page, sortOrder, sortBy, opcRequestId);
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
                .warningState(warningState)
                .sourceName(sourceName)
                .sourcePattern(sourcePattern)
                .warningMessage(warningMessage)
                .entityName(entityName)
                .entityType(entityType)
                .warningType(warningType)
                .isNoSource(isNoSource)
                .startTime(startTime)
                .endTime(endTime)
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
        sb.append(",warningState=").append(String.valueOf(this.warningState));
        sb.append(",sourceName=").append(String.valueOf(this.sourceName));
        sb.append(",sourcePattern=").append(String.valueOf(this.sourcePattern));
        sb.append(",warningMessage=").append(String.valueOf(this.warningMessage));
        sb.append(",entityName=").append(String.valueOf(this.entityName));
        sb.append(",entityType=").append(String.valueOf(this.entityType));
        sb.append(",warningType=").append(String.valueOf(this.warningType));
        sb.append(",isNoSource=").append(String.valueOf(this.isNoSource));
        sb.append(",startTime=").append(String.valueOf(this.startTime));
        sb.append(",endTime=").append(String.valueOf(this.endTime));
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
        if (!(o instanceof ListWarningsRequest)) {
            return false;
        }

        ListWarningsRequest other = (ListWarningsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.warningState, other.warningState)
                && java.util.Objects.equals(this.sourceName, other.sourceName)
                && java.util.Objects.equals(this.sourcePattern, other.sourcePattern)
                && java.util.Objects.equals(this.warningMessage, other.warningMessage)
                && java.util.Objects.equals(this.entityName, other.entityName)
                && java.util.Objects.equals(this.entityType, other.entityType)
                && java.util.Objects.equals(this.warningType, other.warningType)
                && java.util.Objects.equals(this.isNoSource, other.isNoSource)
                && java.util.Objects.equals(this.startTime, other.startTime)
                && java.util.Objects.equals(this.endTime, other.endTime)
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
        result = (result * PRIME) + (this.warningState == null ? 43 : this.warningState.hashCode());
        result = (result * PRIME) + (this.sourceName == null ? 43 : this.sourceName.hashCode());
        result =
                (result * PRIME)
                        + (this.sourcePattern == null ? 43 : this.sourcePattern.hashCode());
        result =
                (result * PRIME)
                        + (this.warningMessage == null ? 43 : this.warningMessage.hashCode());
        result = (result * PRIME) + (this.entityName == null ? 43 : this.entityName.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result = (result * PRIME) + (this.warningType == null ? 43 : this.warningType.hashCode());
        result = (result * PRIME) + (this.isNoSource == null ? 43 : this.isNoSource.hashCode());
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.endTime == null ? 43 : this.endTime.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
