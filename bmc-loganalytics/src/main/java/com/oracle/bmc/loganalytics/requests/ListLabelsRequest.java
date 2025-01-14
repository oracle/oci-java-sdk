/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListLabelsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListLabelsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class ListLabelsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The Logging Analytics namespace used for the request. */
    private String namespaceName;

    /** The Logging Analytics namespace used for the request. */
    public String getNamespaceName() {
        return namespaceName;
    }
    /**
     * The label name used for filtering. Only items with, or associated with, the specified label
     * name will be returned.
     */
    private String labelName;

    /**
     * The label name used for filtering. Only items with, or associated with, the specified label
     * name will be returned.
     */
    public String getLabelName() {
        return labelName;
    }
    /**
     * The label display text used for filtering. Only labels with the specified name or description
     * will be returned.
     */
    private String labelDisplayText;

    /**
     * The label display text used for filtering. Only labels with the specified name or description
     * will be returned.
     */
    public String getLabelDisplayText() {
        return labelDisplayText;
    }
    /**
     * The system value used for filtering. Only items with the specified system value will be
     * returned. Valid values are built in, custom (for user defined items), or all (for all items,
     * regardless of system value).
     */
    private IsSystem isSystem;

    /**
     * The system value used for filtering. Only items with the specified system value will be
     * returned. Valid values are built in, custom (for user defined items), or all (for all items,
     * regardless of system value).
     */
    public enum IsSystem implements com.oracle.bmc.http.internal.BmcEnum {
        All("ALL"),
        Custom("CUSTOM"),
        BuiltIn("BUILT_IN"),
        ;

        private final String value;
        private static java.util.Map<String, IsSystem> map;

        static {
            map = new java.util.HashMap<>();
            for (IsSystem v : IsSystem.values()) {
                map.put(v.getValue(), v);
            }
        }

        IsSystem(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IsSystem create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid IsSystem: " + key);
        }
    };

    /**
     * The system value used for filtering. Only items with the specified system value will be
     * returned. Valid values are built in, custom (for user defined items), or all (for all items,
     * regardless of system value).
     */
    public IsSystem getIsSystem() {
        return isSystem;
    }
    /**
     * The label priority used for filtering. Only labels with the specified priority will be
     * returned.
     */
    private LabelPriority labelPriority;

    /**
     * The label priority used for filtering. Only labels with the specified priority will be
     * returned.
     */
    public enum LabelPriority implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        Low("LOW"),
        Medium("MEDIUM"),
        High("HIGH"),
        ;

        private final String value;
        private static java.util.Map<String, LabelPriority> map;

        static {
            map = new java.util.HashMap<>();
            for (LabelPriority v : LabelPriority.values()) {
                map.put(v.getValue(), v);
            }
        }

        LabelPriority(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LabelPriority create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid LabelPriority: " + key);
        }
    };

    /**
     * The label priority used for filtering. Only labels with the specified priority will be
     * returned.
     */
    public LabelPriority getLabelPriority() {
        return labelPriority;
    }
    /** A flag indicating whether or not to count the label usage per source and per rule. */
    private Boolean isCountPop;

    /** A flag indicating whether or not to count the label usage per source and per rule. */
    public Boolean getIsCountPop() {
        return isCountPop;
    }
    /** A flag indicating whether or not return the aliases used by each label. */
    private Boolean isAliasPop;

    /** A flag indicating whether or not return the aliases used by each label. */
    public Boolean getIsAliasPop() {
        return isAliasPop;
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
    /** The attribute used to sort the returned labels */
    private LabelSortBy labelSortBy;

    /** The attribute used to sort the returned labels */
    public enum LabelSortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Name("name"),
        Priority("priority"),
        SourceUsing("sourceUsing"),
        ;

        private final String value;
        private static java.util.Map<String, LabelSortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (LabelSortBy v : LabelSortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        LabelSortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LabelSortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid LabelSortBy: " + key);
        }
    };

    /** The attribute used to sort the returned labels */
    public LabelSortBy getLabelSortBy() {
        return labelSortBy;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListLabelsRequest, java.lang.Void> {
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

        /**
         * The label name used for filtering. Only items with, or associated with, the specified
         * label name will be returned.
         */
        private String labelName = null;

        /**
         * The label name used for filtering. Only items with, or associated with, the specified
         * label name will be returned.
         *
         * @param labelName the value to set
         * @return this builder instance
         */
        public Builder labelName(String labelName) {
            this.labelName = labelName;
            return this;
        }

        /**
         * The label display text used for filtering. Only labels with the specified name or
         * description will be returned.
         */
        private String labelDisplayText = null;

        /**
         * The label display text used for filtering. Only labels with the specified name or
         * description will be returned.
         *
         * @param labelDisplayText the value to set
         * @return this builder instance
         */
        public Builder labelDisplayText(String labelDisplayText) {
            this.labelDisplayText = labelDisplayText;
            return this;
        }

        /**
         * The system value used for filtering. Only items with the specified system value will be
         * returned. Valid values are built in, custom (for user defined items), or all (for all
         * items, regardless of system value).
         */
        private IsSystem isSystem = null;

        /**
         * The system value used for filtering. Only items with the specified system value will be
         * returned. Valid values are built in, custom (for user defined items), or all (for all
         * items, regardless of system value).
         *
         * @param isSystem the value to set
         * @return this builder instance
         */
        public Builder isSystem(IsSystem isSystem) {
            this.isSystem = isSystem;
            return this;
        }

        /**
         * The label priority used for filtering. Only labels with the specified priority will be
         * returned.
         */
        private LabelPriority labelPriority = null;

        /**
         * The label priority used for filtering. Only labels with the specified priority will be
         * returned.
         *
         * @param labelPriority the value to set
         * @return this builder instance
         */
        public Builder labelPriority(LabelPriority labelPriority) {
            this.labelPriority = labelPriority;
            return this;
        }

        /** A flag indicating whether or not to count the label usage per source and per rule. */
        private Boolean isCountPop = null;

        /**
         * A flag indicating whether or not to count the label usage per source and per rule.
         *
         * @param isCountPop the value to set
         * @return this builder instance
         */
        public Builder isCountPop(Boolean isCountPop) {
            this.isCountPop = isCountPop;
            return this;
        }

        /** A flag indicating whether or not return the aliases used by each label. */
        private Boolean isAliasPop = null;

        /**
         * A flag indicating whether or not return the aliases used by each label.
         *
         * @param isAliasPop the value to set
         * @return this builder instance
         */
        public Builder isAliasPop(Boolean isAliasPop) {
            this.isAliasPop = isAliasPop;
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

        /** The attribute used to sort the returned labels */
        private LabelSortBy labelSortBy = null;

        /**
         * The attribute used to sort the returned labels
         *
         * @param labelSortBy the value to set
         * @return this builder instance
         */
        public Builder labelSortBy(LabelSortBy labelSortBy) {
            this.labelSortBy = labelSortBy;
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
        public Builder copy(ListLabelsRequest o) {
            namespaceName(o.getNamespaceName());
            labelName(o.getLabelName());
            labelDisplayText(o.getLabelDisplayText());
            isSystem(o.getIsSystem());
            labelPriority(o.getLabelPriority());
            isCountPop(o.getIsCountPop());
            isAliasPop(o.getIsAliasPop());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            labelSortBy(o.getLabelSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListLabelsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListLabelsRequest
         */
        public ListLabelsRequest build() {
            ListLabelsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListLabelsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListLabelsRequest
         */
        public ListLabelsRequest buildWithoutInvocationCallback() {
            ListLabelsRequest request = new ListLabelsRequest();
            request.namespaceName = namespaceName;
            request.labelName = labelName;
            request.labelDisplayText = labelDisplayText;
            request.isSystem = isSystem;
            request.labelPriority = labelPriority;
            request.isCountPop = isCountPop;
            request.isAliasPop = isAliasPop;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.labelSortBy = labelSortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListLabelsRequest(namespaceName, labelName, labelDisplayText, isSystem,
            // labelPriority, isCountPop, isAliasPop, limit, page, sortOrder, labelSortBy,
            // opcRequestId);
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
                .labelName(labelName)
                .labelDisplayText(labelDisplayText)
                .isSystem(isSystem)
                .labelPriority(labelPriority)
                .isCountPop(isCountPop)
                .isAliasPop(isAliasPop)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .labelSortBy(labelSortBy)
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
        sb.append(",labelName=").append(String.valueOf(this.labelName));
        sb.append(",labelDisplayText=").append(String.valueOf(this.labelDisplayText));
        sb.append(",isSystem=").append(String.valueOf(this.isSystem));
        sb.append(",labelPriority=").append(String.valueOf(this.labelPriority));
        sb.append(",isCountPop=").append(String.valueOf(this.isCountPop));
        sb.append(",isAliasPop=").append(String.valueOf(this.isAliasPop));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",labelSortBy=").append(String.valueOf(this.labelSortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListLabelsRequest)) {
            return false;
        }

        ListLabelsRequest other = (ListLabelsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.labelName, other.labelName)
                && java.util.Objects.equals(this.labelDisplayText, other.labelDisplayText)
                && java.util.Objects.equals(this.isSystem, other.isSystem)
                && java.util.Objects.equals(this.labelPriority, other.labelPriority)
                && java.util.Objects.equals(this.isCountPop, other.isCountPop)
                && java.util.Objects.equals(this.isAliasPop, other.isAliasPop)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.labelSortBy, other.labelSortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.labelName == null ? 43 : this.labelName.hashCode());
        result =
                (result * PRIME)
                        + (this.labelDisplayText == null ? 43 : this.labelDisplayText.hashCode());
        result = (result * PRIME) + (this.isSystem == null ? 43 : this.isSystem.hashCode());
        result =
                (result * PRIME)
                        + (this.labelPriority == null ? 43 : this.labelPriority.hashCode());
        result = (result * PRIME) + (this.isCountPop == null ? 43 : this.isCountPop.hashCode());
        result = (result * PRIME) + (this.isAliasPop == null ? 43 : this.isAliasPop.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.labelSortBy == null ? 43 : this.labelSortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
