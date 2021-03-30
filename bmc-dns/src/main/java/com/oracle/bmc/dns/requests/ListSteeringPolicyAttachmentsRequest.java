/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.requests;

import com.oracle.bmc.dns.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/ListSteeringPolicyAttachmentsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListSteeringPolicyAttachmentsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListSteeringPolicyAttachmentsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the compartment the resource belongs to.
     */
    private String compartmentId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need
     * to contact Oracle about a particular request, please provide
     * the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The maximum number of items to return in a page of the collection.
     *
     */
    private Long limit;

    /**
     * The value of the `opc-next-page` response header from the previous \"List\" call.
     *
     */
    private String page;

    /**
     * The OCID of a resource.
     */
    private String id;

    /**
     * The displayName of a resource.
     */
    private String displayName;

    /**
     * Search by steering policy OCID.
     * Will match any resource whose steering policy ID matches the provided value.
     *
     */
    private String steeringPolicyId;

    /**
     * Search by zone OCID.
     * Will match any resource whose zone ID matches the provided value.
     *
     */
    private String zoneId;

    /**
     * Search by domain.
     * Will match any record whose domain (case-insensitive) equals the provided value.
     *
     */
    private String domain;

    /**
     * Search by domain.
     * Will match any record whose domain (case-insensitive) contains the provided value.
     *
     */
    private String domainContains;

    /**
     * An [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) timestamp that states
     * all returned resources were created on or after the indicated time.
     *
     */
    private java.util.Date timeCreatedGreaterThanOrEqualTo;

    /**
     * An [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) timestamp that states
     * all returned resources were created before the indicated time.
     *
     */
    private java.util.Date timeCreatedLessThan;

    /**
     * The state of a resource.
     */
    private SteeringPolicyAttachmentSummary.LifecycleState lifecycleState;

    /**
     * The field by which to sort steering policy attachments. If unspecified, defaults to `timeCreated`.
     */
    private SortBy sortBy;

    /**
     * The field by which to sort steering policy attachments. If unspecified, defaults to `timeCreated`.
     **/
    public enum SortBy {
        DisplayName("displayName"),
        TimeCreated("timeCreated"),
        DomainName("domainName"),
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
     * The order to sort the resources.
     *
     */
    private com.oracle.bmc.dns.model.SortOrder sortOrder;

    /**
     * Specifies to operate only on resources that have a matching DNS scope.
     *
     */
    private com.oracle.bmc.dns.model.Scope scope;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListSteeringPolicyAttachmentsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

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
        public Builder copy(ListSteeringPolicyAttachmentsRequest o) {
            compartmentId(o.getCompartmentId());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            id(o.getId());
            displayName(o.getDisplayName());
            steeringPolicyId(o.getSteeringPolicyId());
            zoneId(o.getZoneId());
            domain(o.getDomain());
            domainContains(o.getDomainContains());
            timeCreatedGreaterThanOrEqualTo(o.getTimeCreatedGreaterThanOrEqualTo());
            timeCreatedLessThan(o.getTimeCreatedLessThan());
            lifecycleState(o.getLifecycleState());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            scope(o.getScope());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListSteeringPolicyAttachmentsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListSteeringPolicyAttachmentsRequest
         */
        public ListSteeringPolicyAttachmentsRequest build() {
            ListSteeringPolicyAttachmentsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
