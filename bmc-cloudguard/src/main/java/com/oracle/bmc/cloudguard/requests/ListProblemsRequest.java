/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.requests;

import com.oracle.bmc.cloudguard.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListProblemsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListProblemsRequest.
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
public class ListProblemsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * The field life cycle state. Only one state can be provided. Default value for state is active. If no value is specified state is active.
     */
    private com.oracle.bmc.cloudguard.model.ProblemLifecycleDetail lifecycleDetail;

    /**
     * The field life cycle state. Only one state can be provided. Default value for state is active. If no value is specified state is active.
     */
    private com.oracle.bmc.cloudguard.model.ProblemLifecycleState lifecycleState;

    /**
     * OCI Monitoring region.
     */
    private String region;

    /**
     * Risk level of the Problem.
     */
    private String riskLevel;

    /**
     * Resource Type associated with the resource.
     */
    private String resourceType;

    /**
     * City of the problem.
     */
    private String city;

    /**
     * State of the problem.
     */
    private String state;

    /**
     * Country of the problem.
     */
    private String country;

    /**
     * Label associated with the Problem.
     */
    private String label;

    /**
     * Comma seperated list of detector rule ids to be passed in to match against Problems.
     */
    private java.util.List<String> detectorRuleIdList;

    /**
     * The field to list the Problems by Detector Type. Valid values are IAAS_ACTIVITY_DETECTOR and IAAS_CONFIGURATION_DETECTOR
     *
     */
    private com.oracle.bmc.cloudguard.model.DetectorEnum detectorType;

    /**
     * The ID of the target in which to list resources.
     */
    private String targetId;

    /**
     * Default is false.
     * When set to true, the hierarchy of compartments is traversed
     * and all compartments and subcompartments in the tenancy are
     * returned depending on the the setting of `accessLevel`.
     *
     */
    private Boolean compartmentIdInSubtree;

    /**
     * Valid values are `RESTRICTED` and `ACCESSIBLE`. Default is `RESTRICTED`.
     * Setting this to `ACCESSIBLE` returns only those compartments for which the
     * user has INSPECT permissions directly or indirectly (permissions can be on a
     * resource in a subcompartment).
     * When set to `RESTRICTED` permissions are checked and no partial results are displayed.
     *
     */
    private AccessLevel accessLevel;

    /**
     * Valid values are `RESTRICTED` and `ACCESSIBLE`. Default is `RESTRICTED`.
     * Setting this to `ACCESSIBLE` returns only those compartments for which the
     * user has INSPECT permissions directly or indirectly (permissions can be on a
     * resource in a subcompartment).
     * When set to `RESTRICTED` permissions are checked and no partial results are displayed.
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
     * The ID of the resource associated with the problem.
     */
    private String resourceId;

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
     * The field to sort by. Only one sort order may be provided. Default order for riskLevel, timeLastDetected and resourceName is descending. Default order for riskLevel and resourceName is ascending. If no value is specified timeLastDetected is default.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for riskLevel, timeLastDetected and resourceName is descending. Default order for riskLevel and resourceName is ascending. If no value is specified timeLastDetected is default.
     *
     **/
    public enum SortBy {
        RiskLevel("riskLevel"),
        TimeLastDetected("timeLastDetected"),
        ResourceName("resourceName"),
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
                    ListProblemsRequest, java.lang.Void> {
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
        public Builder copy(ListProblemsRequest o) {
            compartmentId(o.getCompartmentId());
            timeLastDetectedGreaterThanOrEqualTo(o.getTimeLastDetectedGreaterThanOrEqualTo());
            timeLastDetectedLessThanOrEqualTo(o.getTimeLastDetectedLessThanOrEqualTo());
            timeFirstDetectedGreaterThanOrEqualTo(o.getTimeFirstDetectedGreaterThanOrEqualTo());
            timeFirstDetectedLessThanOrEqualTo(o.getTimeFirstDetectedLessThanOrEqualTo());
            lifecycleDetail(o.getLifecycleDetail());
            lifecycleState(o.getLifecycleState());
            region(o.getRegion());
            riskLevel(o.getRiskLevel());
            resourceType(o.getResourceType());
            city(o.getCity());
            state(o.getState());
            country(o.getCountry());
            label(o.getLabel());
            detectorRuleIdList(o.getDetectorRuleIdList());
            detectorType(o.getDetectorType());
            targetId(o.getTargetId());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            accessLevel(o.getAccessLevel());
            resourceId(o.getResourceId());
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
         * Build the instance of ListProblemsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListProblemsRequest
         */
        public ListProblemsRequest build() {
            ListProblemsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
