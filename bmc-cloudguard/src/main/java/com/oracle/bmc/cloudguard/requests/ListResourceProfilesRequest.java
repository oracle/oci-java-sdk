/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.requests;

import com.oracle.bmc.cloudguard.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListResourceProfilesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListResourceProfilesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListResourceProfilesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The ID of the compartment in which to list resources.
     */
    private String compartmentId;

    /**
     * Start time for a filter. If start time is not specified, start time will be set to current time - 30 days.
     */
    private java.util.Date timeLastDetectedGreaterThanOrEqualTo;

    /**
     * End time for a filter. If end time is not specified, end time will be set to current time.
     */
    private java.util.Date timeLastDetectedLessThanOrEqualTo;

    /**
     * Start time for a filter. If start time is not specified, start time will be set to current time - 30 days.
     */
    private java.util.Date timeFirstDetectedGreaterThanOrEqualTo;

    /**
     * End time for a filter. If end time is not specified, end time will be set to current time.
     */
    private java.util.Date timeFirstDetectedLessThanOrEqualTo;

    /**
     * Default is false.
     * When set to true, the hierarchy of compartments is traversed
     * and all compartments and subcompartments in the tenancy are
     * returned depending on the the setting of {@code accessLevel}.
     *
     */
    private Boolean compartmentIdInSubtree;

    /**
     * Valid values are {@code RESTRICTED} and {@code ACCESSIBLE}. Default is {@code RESTRICTED}.
     * Setting this to {@code ACCESSIBLE} returns only those compartments for which the
     * user has INSPECT permissions directly or indirectly (permissions can be on a
     * resource in a subcompartment).
     * When set to {@code RESTRICTED} permissions are checked and no partial results are displayed.
     *
     */
    private AccessLevel accessLevel;

    /**
     * Valid values are {@code RESTRICTED} and {@code ACCESSIBLE}. Default is {@code RESTRICTED}.
     * Setting this to {@code ACCESSIBLE} returns only those compartments for which the
     * user has INSPECT permissions directly or indirectly (permissions can be on a
     * resource in a subcompartment).
     * When set to {@code RESTRICTED} permissions are checked and no partial results are displayed.
     *
     **/
    public enum AccessLevel {
        Restricted("RESTRICTED"),
        Accessible("ACCESSIBLE"),
        ;

        private final String value;
        private static java.util.Map<String, AccessLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (AccessLevel v : AccessLevel.values()) {
                map.put(v.getValue(), v);
            }
        }

        AccessLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AccessLevel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AccessLevel: " + key);
        }
    };
    /**
     * A filter to return only resources that match the list of resource types given
     */
    private java.util.List<String> resourceTypes;

    /**
     * risk score filter
     */
    private Double riskScoreGreaterThanOrEqualTo;

    /**
     * risk score filter
     */
    private Double riskScoreLessThanOrEqualTo;

    /**
     * A filter to return only resources that match the list of techniques given
     */
    private java.util.List<String> techniques;

    /**
     * A filter to return only resources that match the list of tactics given.
     */
    private java.util.List<String> tactics;

    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The sort order to use, either 'asc' or 'desc'.
     */
    private com.oracle.bmc.cloudguard.model.SortOrders sortOrder;

    /**
     * The field to sort resource profiles. Only one sort order may be provided. Default order for timeLastDetected is descending. If no value is specified timeLastDetected is default.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort resource profiles. Only one sort order may be provided. Default order for timeLastDetected is descending. If no value is specified timeLastDetected is default.
     *
     **/
    public enum SortBy {
        RiskScore("riskScore"),
        RiskScoreGrowth("riskScoreGrowth"),
        TimeFirstDetected("timeFirstDetected"),
        TimeLastDetected("timeLastDetected"),
        SightingsCount("sightingsCount"),
        DisplayName("displayName"),
        Type("type"),
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
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListResourceProfilesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private java.util.List<String> resourceTypes = null;

        /**
         * A filter to return only resources that match the list of resource types given
         * @return this builder instance
         */
        public Builder resourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources that match the list of resource types given
         * @return this builder instance
         */
        public Builder resourceTypes(String singularValue) {
            return this.resourceTypes(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> techniques = null;

        /**
         * A filter to return only resources that match the list of techniques given
         * @return this builder instance
         */
        public Builder techniques(java.util.List<String> techniques) {
            this.techniques = techniques;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources that match the list of techniques given
         * @return this builder instance
         */
        public Builder techniques(String singularValue) {
            return this.techniques(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> tactics = null;

        /**
         * A filter to return only resources that match the list of tactics given.
         * @return this builder instance
         */
        public Builder tactics(java.util.List<String> tactics) {
            this.tactics = tactics;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources that match the list of tactics given.
         * @return this builder instance
         */
        public Builder tactics(String singularValue) {
            return this.tactics(java.util.Arrays.asList(singularValue));
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
        public Builder copy(ListResourceProfilesRequest o) {
            compartmentId(o.getCompartmentId());
            timeLastDetectedGreaterThanOrEqualTo(o.getTimeLastDetectedGreaterThanOrEqualTo());
            timeLastDetectedLessThanOrEqualTo(o.getTimeLastDetectedLessThanOrEqualTo());
            timeFirstDetectedGreaterThanOrEqualTo(o.getTimeFirstDetectedGreaterThanOrEqualTo());
            timeFirstDetectedLessThanOrEqualTo(o.getTimeFirstDetectedLessThanOrEqualTo());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            accessLevel(o.getAccessLevel());
            resourceTypes(o.getResourceTypes());
            riskScoreGreaterThanOrEqualTo(o.getRiskScoreGreaterThanOrEqualTo());
            riskScoreLessThanOrEqualTo(o.getRiskScoreLessThanOrEqualTo());
            techniques(o.getTechniques());
            tactics(o.getTactics());
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
         * Build the instance of ListResourceProfilesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListResourceProfilesRequest
         */
        public ListResourceProfilesRequest build() {
            ListResourceProfilesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
