/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.requests;

import com.oracle.bmc.cloudguard.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListProblemsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListProblemsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
public class ListProblemsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The ID of the compartment in which to list resources.
     */
    private String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Start time for a filter. If start time is not specified, start time will be set to current time - 30 days.
     */
    private java.util.Date timeLastDetectedGreaterThanOrEqualTo;

    public java.util.Date getTimeLastDetectedGreaterThanOrEqualTo() {
        return timeLastDetectedGreaterThanOrEqualTo;
    }
    /**
     * End time for a filter. If end time is not specified, end time will be set to current time.
     */
    private java.util.Date timeLastDetectedLessThanOrEqualTo;

    public java.util.Date getTimeLastDetectedLessThanOrEqualTo() {
        return timeLastDetectedLessThanOrEqualTo;
    }
    /**
     * Start time for a filter. If start time is not specified, start time will be set to current time - 30 days.
     */
    private java.util.Date timeFirstDetectedGreaterThanOrEqualTo;

    public java.util.Date getTimeFirstDetectedGreaterThanOrEqualTo() {
        return timeFirstDetectedGreaterThanOrEqualTo;
    }
    /**
     * End time for a filter. If end time is not specified, end time will be set to current time.
     */
    private java.util.Date timeFirstDetectedLessThanOrEqualTo;

    public java.util.Date getTimeFirstDetectedLessThanOrEqualTo() {
        return timeFirstDetectedLessThanOrEqualTo;
    }
    /**
     * The field life cycle state. Only one state can be provided. Default value for state is active. If no value is specified state is active.
     */
    private com.oracle.bmc.cloudguard.model.ProblemLifecycleDetail lifecycleDetail;

    public com.oracle.bmc.cloudguard.model.ProblemLifecycleDetail getLifecycleDetail() {
        return lifecycleDetail;
    }
    /**
     * The field life cycle state. Only one state can be provided. Default value for state is active. If no value is specified state is active.
     */
    private com.oracle.bmc.cloudguard.model.ProblemLifecycleState lifecycleState;

    public com.oracle.bmc.cloudguard.model.ProblemLifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * OCI Monitoring region.
     */
    private String region;

    public String getRegion() {
        return region;
    }
    /**
     * Risk level of the Problem.
     */
    private String riskLevel;

    public String getRiskLevel() {
        return riskLevel;
    }
    /**
     * Resource Type associated with the resource.
     */
    private String resourceType;

    public String getResourceType() {
        return resourceType;
    }
    /**
     * City of the problem.
     */
    private String city;

    public String getCity() {
        return city;
    }
    /**
     * State of the problem.
     */
    private String state;

    public String getState() {
        return state;
    }
    /**
     * Country of the problem.
     */
    private String country;

    public String getCountry() {
        return country;
    }
    /**
     * Label associated with the Problem.
     */
    private String label;

    public String getLabel() {
        return label;
    }
    /**
     * Comma seperated list of detector rule ids to be passed in to match against Problems.
     */
    private java.util.List<String> detectorRuleIdList;

    public java.util.List<String> getDetectorRuleIdList() {
        return detectorRuleIdList;
    }
    /**
     * The field to list the Problems by Detector Type. Valid values are IAAS_ACTIVITY_DETECTOR and IAAS_CONFIGURATION_DETECTOR
     *
     */
    private com.oracle.bmc.cloudguard.model.DetectorEnum detectorType;

    public com.oracle.bmc.cloudguard.model.DetectorEnum getDetectorType() {
        return detectorType;
    }
    /**
     * The ID of the target in which to list resources.
     */
    private String targetId;

    public String getTargetId() {
        return targetId;
    }
    /**
     * Setting this to {@code SECURITY_ZONE} returns only security-zone related violations.
     *
     */
    private com.oracle.bmc.cloudguard.model.ProblemCategoryEnum problemCategory;

    public com.oracle.bmc.cloudguard.model.ProblemCategoryEnum getProblemCategory() {
        return problemCategory;
    }
    /**
     * Default is false.
     * When set to true, the hierarchy of compartments is traversed
     * and all compartments and subcompartments in the tenancy are
     * returned depending on the the setting of {@code accessLevel}.
     *
     */
    private Boolean compartmentIdInSubtree;

    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }
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

    public AccessLevel getAccessLevel() {
        return accessLevel;
    }
    /**
     * The ID of the resource associated with the problem.
     */
    private String resourceId;

    public String getResourceId() {
        return resourceId;
    }
    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    private String page;

    public String getPage() {
        return page;
    }
    /**
     * The sort order to use, either 'asc' or 'desc'.
     */
    private com.oracle.bmc.cloudguard.model.SortOrders sortOrder;

    public com.oracle.bmc.cloudguard.model.SortOrders getSortOrder() {
        return sortOrder;
    }
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

    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListProblemsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String compartmentId = null;

        /**
         * The ID of the compartment in which to list resources.
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        private java.util.Date timeLastDetectedGreaterThanOrEqualTo = null;

        /**
         * Start time for a filter. If start time is not specified, start time will be set to current time - 30 days.
         * @return this builder instance
         */
        public Builder timeLastDetectedGreaterThanOrEqualTo(
                java.util.Date timeLastDetectedGreaterThanOrEqualTo) {
            this.timeLastDetectedGreaterThanOrEqualTo = timeLastDetectedGreaterThanOrEqualTo;
            return this;
        }

        private java.util.Date timeLastDetectedLessThanOrEqualTo = null;

        /**
         * End time for a filter. If end time is not specified, end time will be set to current time.
         * @return this builder instance
         */
        public Builder timeLastDetectedLessThanOrEqualTo(
                java.util.Date timeLastDetectedLessThanOrEqualTo) {
            this.timeLastDetectedLessThanOrEqualTo = timeLastDetectedLessThanOrEqualTo;
            return this;
        }

        private java.util.Date timeFirstDetectedGreaterThanOrEqualTo = null;

        /**
         * Start time for a filter. If start time is not specified, start time will be set to current time - 30 days.
         * @return this builder instance
         */
        public Builder timeFirstDetectedGreaterThanOrEqualTo(
                java.util.Date timeFirstDetectedGreaterThanOrEqualTo) {
            this.timeFirstDetectedGreaterThanOrEqualTo = timeFirstDetectedGreaterThanOrEqualTo;
            return this;
        }

        private java.util.Date timeFirstDetectedLessThanOrEqualTo = null;

        /**
         * End time for a filter. If end time is not specified, end time will be set to current time.
         * @return this builder instance
         */
        public Builder timeFirstDetectedLessThanOrEqualTo(
                java.util.Date timeFirstDetectedLessThanOrEqualTo) {
            this.timeFirstDetectedLessThanOrEqualTo = timeFirstDetectedLessThanOrEqualTo;
            return this;
        }

        private com.oracle.bmc.cloudguard.model.ProblemLifecycleDetail lifecycleDetail = null;

        /**
         * The field life cycle state. Only one state can be provided. Default value for state is active. If no value is specified state is active.
         * @return this builder instance
         */
        public Builder lifecycleDetail(
                com.oracle.bmc.cloudguard.model.ProblemLifecycleDetail lifecycleDetail) {
            this.lifecycleDetail = lifecycleDetail;
            return this;
        }

        private com.oracle.bmc.cloudguard.model.ProblemLifecycleState lifecycleState = null;

        /**
         * The field life cycle state. Only one state can be provided. Default value for state is active. If no value is specified state is active.
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.cloudguard.model.ProblemLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        private String region = null;

        /**
         * OCI Monitoring region.
         * @return this builder instance
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        private String riskLevel = null;

        /**
         * Risk level of the Problem.
         * @return this builder instance
         */
        public Builder riskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }

        private String resourceType = null;

        /**
         * Resource Type associated with the resource.
         * @return this builder instance
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        private String city = null;

        /**
         * City of the problem.
         * @return this builder instance
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }

        private String state = null;

        /**
         * State of the problem.
         * @return this builder instance
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        private String country = null;

        /**
         * Country of the problem.
         * @return this builder instance
         */
        public Builder country(String country) {
            this.country = country;
            return this;
        }

        private String label = null;

        /**
         * Label associated with the Problem.
         * @return this builder instance
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        private java.util.List<String> detectorRuleIdList = null;

        /**
         * Comma seperated list of detector rule ids to be passed in to match against Problems.
         * @return this builder instance
         */
        public Builder detectorRuleIdList(java.util.List<String> detectorRuleIdList) {
            this.detectorRuleIdList = detectorRuleIdList;
            return this;
        }

        /**
         * Singular setter. Comma seperated list of detector rule ids to be passed in to match against Problems.
         * @return this builder instance
         */
        public Builder detectorRuleIdList(String singularValue) {
            return this.detectorRuleIdList(java.util.Arrays.asList(singularValue));
        }

        private com.oracle.bmc.cloudguard.model.DetectorEnum detectorType = null;

        /**
         * The field to list the Problems by Detector Type. Valid values are IAAS_ACTIVITY_DETECTOR and IAAS_CONFIGURATION_DETECTOR
         *
         * @return this builder instance
         */
        public Builder detectorType(com.oracle.bmc.cloudguard.model.DetectorEnum detectorType) {
            this.detectorType = detectorType;
            return this;
        }

        private String targetId = null;

        /**
         * The ID of the target in which to list resources.
         * @return this builder instance
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            return this;
        }

        private com.oracle.bmc.cloudguard.model.ProblemCategoryEnum problemCategory = null;

        /**
         * Setting this to {@code SECURITY_ZONE} returns only security-zone related violations.
         *
         * @return this builder instance
         */
        public Builder problemCategory(
                com.oracle.bmc.cloudguard.model.ProblemCategoryEnum problemCategory) {
            this.problemCategory = problemCategory;
            return this;
        }

        private Boolean compartmentIdInSubtree = null;

        /**
         * Default is false.
         * When set to true, the hierarchy of compartments is traversed
         * and all compartments and subcompartments in the tenancy are
         * returned depending on the the setting of {@code accessLevel}.
         *
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        private AccessLevel accessLevel = null;

        /**
         * Valid values are {@code RESTRICTED} and {@code ACCESSIBLE}. Default is {@code RESTRICTED}.
         * Setting this to {@code ACCESSIBLE} returns only those compartments for which the
         * user has INSPECT permissions directly or indirectly (permissions can be on a
         * resource in a subcompartment).
         * When set to {@code RESTRICTED} permissions are checked and no partial results are displayed.
         *
         * @return this builder instance
         */
        public Builder accessLevel(AccessLevel accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }

        private String resourceId = null;

        /**
         * The ID of the resource associated with the problem.
         * @return this builder instance
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        private Integer limit = null;

        /**
         * The maximum number of items to return.
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        private com.oracle.bmc.cloudguard.model.SortOrders sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'.
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.cloudguard.model.SortOrders sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for riskLevel, timeLastDetected and resourceName is descending. Default order for riskLevel and resourceName is ascending. If no value is specified timeLastDetected is default.
         *
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
            problemCategory(o.getProblemCategory());
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

        /**
         * Build the instance of ListProblemsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListProblemsRequest
         */
        public ListProblemsRequest buildWithoutInvocationCallback() {
            ListProblemsRequest request = new ListProblemsRequest();
            request.compartmentId = compartmentId;
            request.timeLastDetectedGreaterThanOrEqualTo = timeLastDetectedGreaterThanOrEqualTo;
            request.timeLastDetectedLessThanOrEqualTo = timeLastDetectedLessThanOrEqualTo;
            request.timeFirstDetectedGreaterThanOrEqualTo = timeFirstDetectedGreaterThanOrEqualTo;
            request.timeFirstDetectedLessThanOrEqualTo = timeFirstDetectedLessThanOrEqualTo;
            request.lifecycleDetail = lifecycleDetail;
            request.lifecycleState = lifecycleState;
            request.region = region;
            request.riskLevel = riskLevel;
            request.resourceType = resourceType;
            request.city = city;
            request.state = state;
            request.country = country;
            request.label = label;
            request.detectorRuleIdList = detectorRuleIdList;
            request.detectorType = detectorType;
            request.targetId = targetId;
            request.problemCategory = problemCategory;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.accessLevel = accessLevel;
            request.resourceId = resourceId;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListProblemsRequest(compartmentId, timeLastDetectedGreaterThanOrEqualTo, timeLastDetectedLessThanOrEqualTo, timeFirstDetectedGreaterThanOrEqualTo, timeFirstDetectedLessThanOrEqualTo, lifecycleDetail, lifecycleState, region, riskLevel, resourceType, city, state, country, label, detectorRuleIdList, detectorType, targetId, problemCategory, compartmentIdInSubtree, accessLevel, resourceId, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .timeLastDetectedGreaterThanOrEqualTo(timeLastDetectedGreaterThanOrEqualTo)
                .timeLastDetectedLessThanOrEqualTo(timeLastDetectedLessThanOrEqualTo)
                .timeFirstDetectedGreaterThanOrEqualTo(timeFirstDetectedGreaterThanOrEqualTo)
                .timeFirstDetectedLessThanOrEqualTo(timeFirstDetectedLessThanOrEqualTo)
                .lifecycleDetail(lifecycleDetail)
                .lifecycleState(lifecycleState)
                .region(region)
                .riskLevel(riskLevel)
                .resourceType(resourceType)
                .city(city)
                .state(state)
                .country(country)
                .label(label)
                .detectorRuleIdList(detectorRuleIdList)
                .detectorType(detectorType)
                .targetId(targetId)
                .problemCategory(problemCategory)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .accessLevel(accessLevel)
                .resourceId(resourceId)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",timeLastDetectedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeLastDetectedGreaterThanOrEqualTo));
        sb.append(",timeLastDetectedLessThanOrEqualTo=")
                .append(String.valueOf(this.timeLastDetectedLessThanOrEqualTo));
        sb.append(",timeFirstDetectedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeFirstDetectedGreaterThanOrEqualTo));
        sb.append(",timeFirstDetectedLessThanOrEqualTo=")
                .append(String.valueOf(this.timeFirstDetectedLessThanOrEqualTo));
        sb.append(",lifecycleDetail=").append(String.valueOf(this.lifecycleDetail));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",region=").append(String.valueOf(this.region));
        sb.append(",riskLevel=").append(String.valueOf(this.riskLevel));
        sb.append(",resourceType=").append(String.valueOf(this.resourceType));
        sb.append(",city=").append(String.valueOf(this.city));
        sb.append(",state=").append(String.valueOf(this.state));
        sb.append(",country=").append(String.valueOf(this.country));
        sb.append(",label=").append(String.valueOf(this.label));
        sb.append(",detectorRuleIdList=").append(String.valueOf(this.detectorRuleIdList));
        sb.append(",detectorType=").append(String.valueOf(this.detectorType));
        sb.append(",targetId=").append(String.valueOf(this.targetId));
        sb.append(",problemCategory=").append(String.valueOf(this.problemCategory));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",accessLevel=").append(String.valueOf(this.accessLevel));
        sb.append(",resourceId=").append(String.valueOf(this.resourceId));
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
        if (!(o instanceof ListProblemsRequest)) {
            return false;
        }

        ListProblemsRequest other = (ListProblemsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.timeLastDetectedGreaterThanOrEqualTo,
                        other.timeLastDetectedGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.timeLastDetectedLessThanOrEqualTo,
                        other.timeLastDetectedLessThanOrEqualTo)
                && java.util.Objects.equals(
                        this.timeFirstDetectedGreaterThanOrEqualTo,
                        other.timeFirstDetectedGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.timeFirstDetectedLessThanOrEqualTo,
                        other.timeFirstDetectedLessThanOrEqualTo)
                && java.util.Objects.equals(this.lifecycleDetail, other.lifecycleDetail)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.riskLevel, other.riskLevel)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.city, other.city)
                && java.util.Objects.equals(this.state, other.state)
                && java.util.Objects.equals(this.country, other.country)
                && java.util.Objects.equals(this.label, other.label)
                && java.util.Objects.equals(this.detectorRuleIdList, other.detectorRuleIdList)
                && java.util.Objects.equals(this.detectorType, other.detectorType)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.problemCategory, other.problemCategory)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.accessLevel, other.accessLevel)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastDetectedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeLastDetectedGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastDetectedLessThanOrEqualTo == null
                                ? 43
                                : this.timeLastDetectedLessThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeFirstDetectedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeFirstDetectedGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeFirstDetectedLessThanOrEqualTo == null
                                ? 43
                                : this.timeFirstDetectedLessThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetail == null ? 43 : this.lifecycleDetail.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.riskLevel == null ? 43 : this.riskLevel.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.city == null ? 43 : this.city.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.country == null ? 43 : this.country.hashCode());
        result = (result * PRIME) + (this.label == null ? 43 : this.label.hashCode());
        result =
                (result * PRIME)
                        + (this.detectorRuleIdList == null
                                ? 43
                                : this.detectorRuleIdList.hashCode());
        result = (result * PRIME) + (this.detectorType == null ? 43 : this.detectorType.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result =
                (result * PRIME)
                        + (this.problemCategory == null ? 43 : this.problemCategory.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result = (result * PRIME) + (this.accessLevel == null ? 43 : this.accessLevel.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
