/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.requests;

import com.oracle.bmc.oda.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/ListSkillsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListSkillsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class ListSkillsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique Digital Assistant instance identifier.
     */
    private String odaInstanceId;

    /**
     * Unique Digital Assistant instance identifier.
     */
    public String getOdaInstanceId() {
        return odaInstanceId;
    }
    /**
     * Unique Skill identifier.
     */
    private String id;

    /**
     * Unique Skill identifier.
     */
    public String getId() {
        return id;
    }
    /**
     * List only Bot resources with this category.
     */
    private String category;

    /**
     * List only Bot resources with this category.
     */
    public String getCategory() {
        return category;
    }
    /**
     * List only Bot resources with this name. Names are unique and may not change.
     * <p>
     * Example: {@code MySkill}
     *
     */
    private String name;

    /**
     * List only Bot resources with this name. Names are unique and may not change.
     * <p>
     * Example: {@code MySkill}
     *
     */
    public String getName() {
        return name;
    }
    /**
     * List only Bot resources with this version. Versions are unique and may not change.
     * <p>
     * Example: {@code 1.0}
     *
     */
    private String version;

    /**
     * List only Bot resources with this version. Versions are unique and may not change.
     * <p>
     * Example: {@code 1.0}
     *
     */
    public String getVersion() {
        return version;
    }
    /**
     * List only Bot resources with this namespace. Namespaces may not change.
     * <p>
     * Example: {@code MyNamespace}
     *
     */
    private String namespace;

    /**
     * List only Bot resources with this namespace. Namespaces may not change.
     * <p>
     * Example: {@code MyNamespace}
     *
     */
    public String getNamespace() {
        return namespace;
    }
    /**
     * List only Bot resources with this platform version.
     *
     */
    private String platformVersion;

    /**
     * List only Bot resources with this platform version.
     *
     */
    public String getPlatformVersion() {
        return platformVersion;
    }
    /**
     * List only the resources that are in this lifecycle state.
     */
    private com.oracle.bmc.oda.model.LifecycleState lifecycleState;

    /**
     * List only the resources that are in this lifecycle state.
     */
    public com.oracle.bmc.oda.model.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * List only Bot resources with this lifecycle details.
     *
     */
    private String lifecycleDetails;

    /**
     * List only Bot resources with this lifecycle details.
     *
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }
    /**
     * The maximum number of items to return per page.
     */
    private Integer limit;

    /**
     * The maximum number of items to return per page.
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page at which to start retrieving results.
     * <p>
     * You get this value from the {@code opc-next-page} header in a previous list request.
     * To retireve the first page, omit this query parameter.
     * <p>
     * Example: {@code MToxMA==}
     *
     */
    private String page;

    /**
     * The page at which to start retrieving results.
     * <p>
     * You get this value from the {@code opc-next-page} header in a previous list request.
     * To retireve the first page, omit this query parameter.
     * <p>
     * Example: {@code MToxMA==}
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * Sort the results in this order, use either {@code ASC} (ascending) or {@code DESC} (descending).
     */
    private SortOrder sortOrder;

    /**
     * Sort the results in this order, use either {@code ASC} (ascending) or {@code DESC} (descending).
     **/
    public enum SortOrder {
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

    /**
     * Sort the results in this order, use either {@code ASC} (ascending) or {@code DESC} (descending).
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * Sort on this field. You can specify one sort order only. The default sort field is {@code timeCreated}.
     * <p>
     * The default sort order for {@code timeCreated} and {@code timeUpdated} is descending.
     * For all other sort fields the default sort order is ascending.
     *
     */
    private SortBy sortBy;

    /**
     * Sort on this field. You can specify one sort order only. The default sort field is {@code timeCreated}.
     * <p>
     * The default sort order for {@code timeCreated} and {@code timeUpdated} is descending.
     * For all other sort fields the default sort order is ascending.
     *
     **/
    public enum SortBy {
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
     * Sort on this field. You can specify one sort order only. The default sort field is {@code timeCreated}.
     * <p>
     * The default sort order for {@code timeCreated} and {@code timeUpdated} is descending.
     * For all other sort fields the default sort order is ascending.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The client request ID for tracing. This value is included in the opc-request-id response header.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing. This value is included in the opc-request-id response header.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListSkillsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique Digital Assistant instance identifier.
         */
        private String odaInstanceId = null;

        /**
         * Unique Digital Assistant instance identifier.
         * @param odaInstanceId the value to set
         * @return this builder instance
         */
        public Builder odaInstanceId(String odaInstanceId) {
            this.odaInstanceId = odaInstanceId;
            return this;
        }

        /**
         * Unique Skill identifier.
         */
        private String id = null;

        /**
         * Unique Skill identifier.
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * List only Bot resources with this category.
         */
        private String category = null;

        /**
         * List only Bot resources with this category.
         * @param category the value to set
         * @return this builder instance
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * List only Bot resources with this name. Names are unique and may not change.
         * <p>
         * Example: {@code MySkill}
         *
         */
        private String name = null;

        /**
         * List only Bot resources with this name. Names are unique and may not change.
         * <p>
         * Example: {@code MySkill}
         *
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * List only Bot resources with this version. Versions are unique and may not change.
         * <p>
         * Example: {@code 1.0}
         *
         */
        private String version = null;

        /**
         * List only Bot resources with this version. Versions are unique and may not change.
         * <p>
         * Example: {@code 1.0}
         *
         * @param version the value to set
         * @return this builder instance
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * List only Bot resources with this namespace. Namespaces may not change.
         * <p>
         * Example: {@code MyNamespace}
         *
         */
        private String namespace = null;

        /**
         * List only Bot resources with this namespace. Namespaces may not change.
         * <p>
         * Example: {@code MyNamespace}
         *
         * @param namespace the value to set
         * @return this builder instance
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * List only Bot resources with this platform version.
         *
         */
        private String platformVersion = null;

        /**
         * List only Bot resources with this platform version.
         *
         * @param platformVersion the value to set
         * @return this builder instance
         */
        public Builder platformVersion(String platformVersion) {
            this.platformVersion = platformVersion;
            return this;
        }

        /**
         * List only the resources that are in this lifecycle state.
         */
        private com.oracle.bmc.oda.model.LifecycleState lifecycleState = null;

        /**
         * List only the resources that are in this lifecycle state.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(com.oracle.bmc.oda.model.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * List only Bot resources with this lifecycle details.
         *
         */
        private String lifecycleDetails = null;

        /**
         * List only Bot resources with this lifecycle details.
         *
         * @param lifecycleDetails the value to set
         * @return this builder instance
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            return this;
        }

        /**
         * The maximum number of items to return per page.
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return per page.
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The page at which to start retrieving results.
         * <p>
         * You get this value from the {@code opc-next-page} header in a previous list request.
         * To retireve the first page, omit this query parameter.
         * <p>
         * Example: {@code MToxMA==}
         *
         */
        private String page = null;

        /**
         * The page at which to start retrieving results.
         * <p>
         * You get this value from the {@code opc-next-page} header in a previous list request.
         * To retireve the first page, omit this query parameter.
         * <p>
         * Example: {@code MToxMA==}
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Sort the results in this order, use either {@code ASC} (ascending) or {@code DESC} (descending).
         */
        private SortOrder sortOrder = null;

        /**
         * Sort the results in this order, use either {@code ASC} (ascending) or {@code DESC} (descending).
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Sort on this field. You can specify one sort order only. The default sort field is {@code timeCreated}.
         * <p>
         * The default sort order for {@code timeCreated} and {@code timeUpdated} is descending.
         * For all other sort fields the default sort order is ascending.
         *
         */
        private SortBy sortBy = null;

        /**
         * Sort on this field. You can specify one sort order only. The default sort field is {@code timeCreated}.
         * <p>
         * The default sort order for {@code timeCreated} and {@code timeUpdated} is descending.
         * For all other sort fields the default sort order is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The client request ID for tracing. This value is included in the opc-request-id response header.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing. This value is included in the opc-request-id response header.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
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
         * @return this builder instance
         */
        public Builder copy(ListSkillsRequest o) {
            odaInstanceId(o.getOdaInstanceId());
            id(o.getId());
            category(o.getCategory());
            name(o.getName());
            version(o.getVersion());
            namespace(o.getNamespace());
            platformVersion(o.getPlatformVersion());
            lifecycleState(o.getLifecycleState());
            lifecycleDetails(o.getLifecycleDetails());
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
         * Build the instance of ListSkillsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListSkillsRequest
         */
        public ListSkillsRequest build() {
            ListSkillsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListSkillsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListSkillsRequest
         */
        public ListSkillsRequest buildWithoutInvocationCallback() {
            ListSkillsRequest request = new ListSkillsRequest();
            request.odaInstanceId = odaInstanceId;
            request.id = id;
            request.category = category;
            request.name = name;
            request.version = version;
            request.namespace = namespace;
            request.platformVersion = platformVersion;
            request.lifecycleState = lifecycleState;
            request.lifecycleDetails = lifecycleDetails;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListSkillsRequest(odaInstanceId, id, category, name, version, namespace, platformVersion, lifecycleState, lifecycleDetails, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .odaInstanceId(odaInstanceId)
                .id(id)
                .category(category)
                .name(name)
                .version(version)
                .namespace(namespace)
                .platformVersion(platformVersion)
                .lifecycleState(lifecycleState)
                .lifecycleDetails(lifecycleDetails)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
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
        sb.append(",odaInstanceId=").append(String.valueOf(this.odaInstanceId));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",category=").append(String.valueOf(this.category));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",version=").append(String.valueOf(this.version));
        sb.append(",namespace=").append(String.valueOf(this.namespace));
        sb.append(",platformVersion=").append(String.valueOf(this.platformVersion));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
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
        if (!(o instanceof ListSkillsRequest)) {
            return false;
        }

        ListSkillsRequest other = (ListSkillsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.odaInstanceId, other.odaInstanceId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.platformVersion, other.platformVersion)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
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
                        + (this.odaInstanceId == null ? 43 : this.odaInstanceId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result =
                (result * PRIME)
                        + (this.platformVersion == null ? 43 : this.platformVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
