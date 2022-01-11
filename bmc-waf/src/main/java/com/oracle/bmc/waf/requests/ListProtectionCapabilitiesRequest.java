/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf.requests;

import com.oracle.bmc.waf.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/waf/ListProtectionCapabilitiesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListProtectionCapabilitiesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListProtectionCapabilitiesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
     */
    private String compartmentId;

    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * A token representing the position at which to start retrieving results.
     * This must come from the {@code opc-next-page} header field of a previous response.
     *
     */
    private String page;

    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The unique key of protection capability to filter by.
     */
    private String key;

    /**
     * A filter to return only resources that matches given isLatestVersion.
     */
    private java.util.List<Boolean> isLatestVersion;

    /**
     * A filter to return only resources that matches given type.
     */
    private com.oracle.bmc.waf.model.ProtectionCapabilitySummary.Type type;

    /**
     * A filter to return only resources that are accociated given group tag.
     */
    private java.util.List<String> groupTag;

    /**
     * A filter to return only resources that match the entire display name given.
     */
    private String displayName;

    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    private com.oracle.bmc.waf.model.SortOrder sortOrder;

    /**
     * The field to sort by. Only one sort order may be provided.
     * Default order for key is descending.
     * Default order for type is descending.
     * Default order for displayName is ascending.
     * If no value is specified key is default.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided.
     * Default order for key is descending.
     * Default order for type is descending.
     * Default order for displayName is ascending.
     * If no value is specified key is default.
     *
     **/
    public enum SortBy {
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListProtectionCapabilitiesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private java.util.List<Boolean> isLatestVersion = null;

        /**
         * A filter to return only resources that matches given isLatestVersion.
         * @return this builder instance
         */
        public Builder isLatestVersion(java.util.List<Boolean> isLatestVersion) {
            this.isLatestVersion = isLatestVersion;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources that matches given isLatestVersion.
         * @return this builder instance
         */
        public Builder isLatestVersion(Boolean singularValue) {
            return this.isLatestVersion(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> groupTag = null;

        /**
         * A filter to return only resources that are accociated given group tag.
         * @return this builder instance
         */
        public Builder groupTag(java.util.List<String> groupTag) {
            this.groupTag = groupTag;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources that are accociated given group tag.
         * @return this builder instance
         */
        public Builder groupTag(String singularValue) {
            return this.groupTag(java.util.Arrays.asList(singularValue));
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
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListProtectionCapabilitiesRequest
         */
        public ListProtectionCapabilitiesRequest build() {
            ListProtectionCapabilitiesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
