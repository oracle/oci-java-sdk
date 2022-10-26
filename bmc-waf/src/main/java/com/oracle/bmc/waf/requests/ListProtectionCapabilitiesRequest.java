/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf.requests;

import com.oracle.bmc.waf.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/waf/ListProtectionCapabilitiesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListProtectionCapabilitiesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
public class ListProtectionCapabilitiesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment in which to list resources.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment in which to list resources.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token representing the position at which to start retrieving results. This must come from
     * the {@code opc-next-page} header field of a previous response.
     */
    private String page;

    /**
     * A token representing the position at which to start retrieving results. This must come from
     * the {@code opc-next-page} header field of a previous response.
     */
    public String getPage() {
        return page;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /** The unique key of protection capability to filter by. */
    private String key;

    /** The unique key of protection capability to filter by. */
    public String getKey() {
        return key;
    }
    /** A filter to return only resources that matches given isLatestVersion. */
    private java.util.List<Boolean> isLatestVersion;

    /** A filter to return only resources that matches given isLatestVersion. */
    public java.util.List<Boolean> getIsLatestVersion() {
        return isLatestVersion;
    }
    /** A filter to return only resources that matches given type. */
    private com.oracle.bmc.waf.model.ProtectionCapabilitySummary.Type type;

    /** A filter to return only resources that matches given type. */
    public com.oracle.bmc.waf.model.ProtectionCapabilitySummary.Type getType() {
        return type;
    }
    /** A filter to return only resources that are accociated given group tag. */
    private java.util.List<String> groupTag;

    /** A filter to return only resources that are accociated given group tag. */
    public java.util.List<String> getGroupTag() {
        return groupTag;
    }
    /** A filter to return only resources that match the entire display name given. */
    private String displayName;

    /** A filter to return only resources that match the entire display name given. */
    public String getDisplayName() {
        return displayName;
    }
    /** The sort order to use, either 'ASC' or 'DESC'. */
    private com.oracle.bmc.waf.model.SortOrder sortOrder;

    /** The sort order to use, either 'ASC' or 'DESC'. */
    public com.oracle.bmc.waf.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for key is
     * descending. Default order for type is descending. Default order for displayName is ascending.
     * If no value is specified key is default.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for key is
     * descending. Default order for type is descending. Default order for displayName is ascending.
     * If no value is specified key is default.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Key("key"),
        Type("type"),
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
     * The field to sort by. Only one sort order may be provided. Default order for key is
     * descending. Default order for type is descending. Default order for displayName is ascending.
     * If no value is specified key is default.
     */
    public SortBy getSortBy() {
        return sortBy;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListProtectionCapabilitiesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment in which to list resources.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment in which to list resources.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
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
         * A token representing the position at which to start retrieving results. This must come
         * from the {@code opc-next-page} header field of a previous response.
         */
        private String page = null;

        /**
         * A token representing the position at which to start retrieving results. This must come
         * from the {@code opc-next-page} header field of a previous response.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
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

        /** The unique key of protection capability to filter by. */
        private String key = null;

        /**
         * The unique key of protection capability to filter by.
         *
         * @param key the value to set
         * @return this builder instance
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /** A filter to return only resources that matches given isLatestVersion. */
        private java.util.List<Boolean> isLatestVersion = null;

        /**
         * A filter to return only resources that matches given isLatestVersion.
         *
         * @param isLatestVersion the value to set
         * @return this builder instance
         */
        public Builder isLatestVersion(java.util.List<Boolean> isLatestVersion) {
            this.isLatestVersion = isLatestVersion;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources that matches given isLatestVersion.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder isLatestVersion(Boolean singularValue) {
            return this.isLatestVersion(java.util.Arrays.asList(singularValue));
        }

        /** A filter to return only resources that matches given type. */
        private com.oracle.bmc.waf.model.ProtectionCapabilitySummary.Type type = null;

        /**
         * A filter to return only resources that matches given type.
         *
         * @param type the value to set
         * @return this builder instance
         */
        public Builder type(com.oracle.bmc.waf.model.ProtectionCapabilitySummary.Type type) {
            this.type = type;
            return this;
        }

        /** A filter to return only resources that are accociated given group tag. */
        private java.util.List<String> groupTag = null;

        /**
         * A filter to return only resources that are accociated given group tag.
         *
         * @param groupTag the value to set
         * @return this builder instance
         */
        public Builder groupTag(java.util.List<String> groupTag) {
            this.groupTag = groupTag;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources that are accociated given group tag.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder groupTag(String singularValue) {
            return this.groupTag(java.util.Arrays.asList(singularValue));
        }

        /** A filter to return only resources that match the entire display name given. */
        private String displayName = null;

        /**
         * A filter to return only resources that match the entire display name given.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /** The sort order to use, either 'ASC' or 'DESC'. */
        private com.oracle.bmc.waf.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.waf.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for key is
         * descending. Default order for type is descending. Default order for displayName is
         * ascending. If no value is specified key is default.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for key is
         * descending. Default order for type is descending. Default order for displayName is
         * ascending. If no value is specified key is default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
        public Builder copy(ListProtectionCapabilitiesRequest o) {
            compartmentId(o.getCompartmentId());
            opcRequestId(o.getOpcRequestId());
            page(o.getPage());
            limit(o.getLimit());
            key(o.getKey());
            isLatestVersion(o.getIsLatestVersion());
            type(o.getType());
            groupTag(o.getGroupTag());
            displayName(o.getDisplayName());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListProtectionCapabilitiesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListProtectionCapabilitiesRequest
         */
        public ListProtectionCapabilitiesRequest build() {
            ListProtectionCapabilitiesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListProtectionCapabilitiesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListProtectionCapabilitiesRequest
         */
        public ListProtectionCapabilitiesRequest buildWithoutInvocationCallback() {
            ListProtectionCapabilitiesRequest request = new ListProtectionCapabilitiesRequest();
            request.compartmentId = compartmentId;
            request.opcRequestId = opcRequestId;
            request.page = page;
            request.limit = limit;
            request.key = key;
            request.isLatestVersion = isLatestVersion;
            request.type = type;
            request.groupTag = groupTag;
            request.displayName = displayName;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            return request;
            // new ListProtectionCapabilitiesRequest(compartmentId, opcRequestId, page, limit, key,
            // isLatestVersion, type, groupTag, displayName, sortOrder, sortBy);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .opcRequestId(opcRequestId)
                .page(page)
                .limit(limit)
                .key(key)
                .isLatestVersion(isLatestVersion)
                .type(type)
                .groupTag(groupTag)
                .displayName(displayName)
                .sortOrder(sortOrder)
                .sortBy(sortBy);
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",key=").append(String.valueOf(this.key));
        sb.append(",isLatestVersion=").append(String.valueOf(this.isLatestVersion));
        sb.append(",type=").append(String.valueOf(this.type));
        sb.append(",groupTag=").append(String.valueOf(this.groupTag));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListProtectionCapabilitiesRequest)) {
            return false;
        }

        ListProtectionCapabilitiesRequest other = (ListProtectionCapabilitiesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.isLatestVersion, other.isLatestVersion)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.groupTag, other.groupTag)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result =
                (result * PRIME)
                        + (this.isLatestVersion == null ? 43 : this.isLatestVersion.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.groupTag == null ? 43 : this.groupTag.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        return result;
    }
}
