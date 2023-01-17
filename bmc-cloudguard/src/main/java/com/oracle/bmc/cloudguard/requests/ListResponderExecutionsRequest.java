/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.requests;

import com.oracle.bmc.cloudguard.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListResponderExecutionsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListResponderExecutionsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
public class ListResponderExecutionsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The ID of the compartment in which to list resources. */
    private String compartmentId;

    /** The ID of the compartment in which to list resources. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Default is false. When set to true, the hierarchy of compartments is traversed and all
     * compartments and subcompartments in the tenancy are returned depending on the the setting of
     * {@code accessLevel}.
     */
    private Boolean compartmentIdInSubtree;

    /**
     * Default is false. When set to true, the hierarchy of compartments is traversed and all
     * compartments and subcompartments in the tenancy are returned depending on the the setting of
     * {@code accessLevel}.
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }
    /**
     * Valid values are {@code RESTRICTED} and {@code ACCESSIBLE}. Default is {@code RESTRICTED}.
     * Setting this to {@code ACCESSIBLE} returns only those compartments for which the user has
     * INSPECT permissions directly or indirectly (permissions can be on a resource in a
     * subcompartment). When set to {@code RESTRICTED} permissions are checked and no partial
     * results are displayed.
     */
    private AccessLevel accessLevel;

    /**
     * Valid values are {@code RESTRICTED} and {@code ACCESSIBLE}. Default is {@code RESTRICTED}.
     * Setting this to {@code ACCESSIBLE} returns only those compartments for which the user has
     * INSPECT permissions directly or indirectly (permissions can be on a resource in a
     * subcompartment). When set to {@code RESTRICTED} permissions are checked and no partial
     * results are displayed.
     */
    public enum AccessLevel implements com.oracle.bmc.http.internal.BmcEnum {
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
     * Valid values are {@code RESTRICTED} and {@code ACCESSIBLE}. Default is {@code RESTRICTED}.
     * Setting this to {@code ACCESSIBLE} returns only those compartments for which the user has
     * INSPECT permissions directly or indirectly (permissions can be on a resource in a
     * subcompartment). When set to {@code RESTRICTED} permissions are checked and no partial
     * results are displayed.
     */
    public AccessLevel getAccessLevel() {
        return accessLevel;
    }
    /** Responder Rule Ids filter for the Responder Executions. */
    private java.util.List<String> responderRuleIds;

    /** Responder Rule Ids filter for the Responder Executions. */
    public java.util.List<String> getResponderRuleIds() {
        return responderRuleIds;
    }
    /** Creation Start time for filtering */
    private java.util.Date timeCreatedGreaterThanOrEqualTo;

    /** Creation Start time for filtering */
    public java.util.Date getTimeCreatedGreaterThanOrEqualTo() {
        return timeCreatedGreaterThanOrEqualTo;
    }
    /** Creation End time for filtering */
    private java.util.Date timeCreatedLessThanOrEqualTo;

    /** Creation End time for filtering */
    public java.util.Date getTimeCreatedLessThanOrEqualTo() {
        return timeCreatedLessThanOrEqualTo;
    }
    /** Completion End Time */
    private java.util.Date timeCompletedGreaterThanOrEqualTo;

    /** Completion End Time */
    public java.util.Date getTimeCompletedGreaterThanOrEqualTo() {
        return timeCompletedGreaterThanOrEqualTo;
    }
    /** Completion Start Time */
    private java.util.Date timeCompletedLessThanOrEqualTo;

    /** Completion Start Time */
    public java.util.Date getTimeCompletedLessThanOrEqualTo() {
        return timeCompletedLessThanOrEqualTo;
    }
    /** The ID of the target in which to list resources. */
    private String targetId;

    /** The ID of the target in which to list resources. */
    public String getTargetId() {
        return targetId;
    }
    /** Resource Type associated with the resource. */
    private String resourceType;

    /** Resource Type associated with the resource. */
    public String getResourceType() {
        return resourceType;
    }
    /**
     * The field to list the Responder Executions by Responder Type. Valid values are REMEDIATION
     * and NOTIFICATION
     */
    private ResponderType responderType;

    /**
     * The field to list the Responder Executions by Responder Type. Valid values are REMEDIATION
     * and NOTIFICATION
     */
    public enum ResponderType implements com.oracle.bmc.http.internal.BmcEnum {
        Remediation("REMEDIATION"),
        Notification("NOTIFICATION"),
        ;

        private final String value;
        private static java.util.Map<String, ResponderType> map;

        static {
            map = new java.util.HashMap<>();
            for (ResponderType v : ResponderType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ResponderType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ResponderType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ResponderType: " + key);
        }
    };

    /**
     * The field to list the Responder Executions by Responder Type. Valid values are REMEDIATION
     * and NOTIFICATION
     */
    public ResponderType getResponderType() {
        return responderType;
    }
    /** The status of the responder execution in which to list responders. */
    private com.oracle.bmc.cloudguard.model.ResponderExecutionStates responderExecutionStatus;

    /** The status of the responder execution in which to list responders. */
    public com.oracle.bmc.cloudguard.model.ResponderExecutionStates getResponderExecutionStatus() {
        return responderExecutionStatus;
    }
    /** The mode of the responder execution in which to list responders. */
    private com.oracle.bmc.cloudguard.model.ResponderExecutionModes responderExecutionMode;

    /** The mode of the responder execution in which to list responders. */
    public com.oracle.bmc.cloudguard.model.ResponderExecutionModes getResponderExecutionMode() {
        return responderExecutionMode;
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
    /** The sort order to use, either 'asc' or 'desc'. */
    private com.oracle.bmc.cloudguard.model.SortOrders sortOrder;

    /** The sort order to use, either 'asc' or 'desc'. */
    public com.oracle.bmc.cloudguard.model.SortOrders getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for responderRuleName and resourceName is ascending. If no value is
     * specified timeCreated is default.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for responderRuleName and resourceName is ascending. If no value is
     * specified timeCreated is default.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("timeCreated"),
        ResponderRuleName("responderRuleName"),
        ResourceName("resourceName"),
        TimeCompleted("timeCompleted"),
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for responderRuleName and resourceName is ascending. If no value is
     * specified timeCreated is default.
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
                    ListResponderExecutionsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

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
         * Default is false. When set to true, the hierarchy of compartments is traversed and all
         * compartments and subcompartments in the tenancy are returned depending on the the setting
         * of {@code accessLevel}.
         */
        private Boolean compartmentIdInSubtree = null;

        /**
         * Default is false. When set to true, the hierarchy of compartments is traversed and all
         * compartments and subcompartments in the tenancy are returned depending on the the setting
         * of {@code accessLevel}.
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        /**
         * Valid values are {@code RESTRICTED} and {@code ACCESSIBLE}. Default is {@code
         * RESTRICTED}. Setting this to {@code ACCESSIBLE} returns only those compartments for which
         * the user has INSPECT permissions directly or indirectly (permissions can be on a resource
         * in a subcompartment). When set to {@code RESTRICTED} permissions are checked and no
         * partial results are displayed.
         */
        private AccessLevel accessLevel = null;

        /**
         * Valid values are {@code RESTRICTED} and {@code ACCESSIBLE}. Default is {@code
         * RESTRICTED}. Setting this to {@code ACCESSIBLE} returns only those compartments for which
         * the user has INSPECT permissions directly or indirectly (permissions can be on a resource
         * in a subcompartment). When set to {@code RESTRICTED} permissions are checked and no
         * partial results are displayed.
         *
         * @param accessLevel the value to set
         * @return this builder instance
         */
        public Builder accessLevel(AccessLevel accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }

        /** Responder Rule Ids filter for the Responder Executions. */
        private java.util.List<String> responderRuleIds = null;

        /**
         * Responder Rule Ids filter for the Responder Executions.
         *
         * @param responderRuleIds the value to set
         * @return this builder instance
         */
        public Builder responderRuleIds(java.util.List<String> responderRuleIds) {
            this.responderRuleIds = responderRuleIds;
            return this;
        }

        /**
         * Singular setter. Responder Rule Ids filter for the Responder Executions.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder responderRuleIds(String singularValue) {
            return this.responderRuleIds(java.util.Arrays.asList(singularValue));
        }

        /** Creation Start time for filtering */
        private java.util.Date timeCreatedGreaterThanOrEqualTo = null;

        /**
         * Creation Start time for filtering
         *
         * @param timeCreatedGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeCreatedGreaterThanOrEqualTo(
                java.util.Date timeCreatedGreaterThanOrEqualTo) {
            this.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            return this;
        }

        /** Creation End time for filtering */
        private java.util.Date timeCreatedLessThanOrEqualTo = null;

        /**
         * Creation End time for filtering
         *
         * @param timeCreatedLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeCreatedLessThanOrEqualTo(java.util.Date timeCreatedLessThanOrEqualTo) {
            this.timeCreatedLessThanOrEqualTo = timeCreatedLessThanOrEqualTo;
            return this;
        }

        /** Completion End Time */
        private java.util.Date timeCompletedGreaterThanOrEqualTo = null;

        /**
         * Completion End Time
         *
         * @param timeCompletedGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeCompletedGreaterThanOrEqualTo(
                java.util.Date timeCompletedGreaterThanOrEqualTo) {
            this.timeCompletedGreaterThanOrEqualTo = timeCompletedGreaterThanOrEqualTo;
            return this;
        }

        /** Completion Start Time */
        private java.util.Date timeCompletedLessThanOrEqualTo = null;

        /**
         * Completion Start Time
         *
         * @param timeCompletedLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeCompletedLessThanOrEqualTo(
                java.util.Date timeCompletedLessThanOrEqualTo) {
            this.timeCompletedLessThanOrEqualTo = timeCompletedLessThanOrEqualTo;
            return this;
        }

        /** The ID of the target in which to list resources. */
        private String targetId = null;

        /**
         * The ID of the target in which to list resources.
         *
         * @param targetId the value to set
         * @return this builder instance
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            return this;
        }

        /** Resource Type associated with the resource. */
        private String resourceType = null;

        /**
         * Resource Type associated with the resource.
         *
         * @param resourceType the value to set
         * @return this builder instance
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The field to list the Responder Executions by Responder Type. Valid values are
         * REMEDIATION and NOTIFICATION
         */
        private ResponderType responderType = null;

        /**
         * The field to list the Responder Executions by Responder Type. Valid values are
         * REMEDIATION and NOTIFICATION
         *
         * @param responderType the value to set
         * @return this builder instance
         */
        public Builder responderType(ResponderType responderType) {
            this.responderType = responderType;
            return this;
        }

        /** The status of the responder execution in which to list responders. */
        private com.oracle.bmc.cloudguard.model.ResponderExecutionStates responderExecutionStatus =
                null;

        /**
         * The status of the responder execution in which to list responders.
         *
         * @param responderExecutionStatus the value to set
         * @return this builder instance
         */
        public Builder responderExecutionStatus(
                com.oracle.bmc.cloudguard.model.ResponderExecutionStates responderExecutionStatus) {
            this.responderExecutionStatus = responderExecutionStatus;
            return this;
        }

        /** The mode of the responder execution in which to list responders. */
        private com.oracle.bmc.cloudguard.model.ResponderExecutionModes responderExecutionMode =
                null;

        /**
         * The mode of the responder execution in which to list responders.
         *
         * @param responderExecutionMode the value to set
         * @return this builder instance
         */
        public Builder responderExecutionMode(
                com.oracle.bmc.cloudguard.model.ResponderExecutionModes responderExecutionMode) {
            this.responderExecutionMode = responderExecutionMode;
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

        /** The sort order to use, either 'asc' or 'desc'. */
        private com.oracle.bmc.cloudguard.model.SortOrders sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.cloudguard.model.SortOrders sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for responderRuleName and resourceName is ascending. If no
         * value is specified timeCreated is default.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for responderRuleName and resourceName is ascending. If no
         * value is specified timeCreated is default.
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
        public Builder copy(ListResponderExecutionsRequest o) {
            compartmentId(o.getCompartmentId());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            accessLevel(o.getAccessLevel());
            responderRuleIds(o.getResponderRuleIds());
            timeCreatedGreaterThanOrEqualTo(o.getTimeCreatedGreaterThanOrEqualTo());
            timeCreatedLessThanOrEqualTo(o.getTimeCreatedLessThanOrEqualTo());
            timeCompletedGreaterThanOrEqualTo(o.getTimeCompletedGreaterThanOrEqualTo());
            timeCompletedLessThanOrEqualTo(o.getTimeCompletedLessThanOrEqualTo());
            targetId(o.getTargetId());
            resourceType(o.getResourceType());
            responderType(o.getResponderType());
            responderExecutionStatus(o.getResponderExecutionStatus());
            responderExecutionMode(o.getResponderExecutionMode());
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
         * Build the instance of ListResponderExecutionsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListResponderExecutionsRequest
         */
        public ListResponderExecutionsRequest build() {
            ListResponderExecutionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListResponderExecutionsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListResponderExecutionsRequest
         */
        public ListResponderExecutionsRequest buildWithoutInvocationCallback() {
            ListResponderExecutionsRequest request = new ListResponderExecutionsRequest();
            request.compartmentId = compartmentId;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.accessLevel = accessLevel;
            request.responderRuleIds = responderRuleIds;
            request.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            request.timeCreatedLessThanOrEqualTo = timeCreatedLessThanOrEqualTo;
            request.timeCompletedGreaterThanOrEqualTo = timeCompletedGreaterThanOrEqualTo;
            request.timeCompletedLessThanOrEqualTo = timeCompletedLessThanOrEqualTo;
            request.targetId = targetId;
            request.resourceType = resourceType;
            request.responderType = responderType;
            request.responderExecutionStatus = responderExecutionStatus;
            request.responderExecutionMode = responderExecutionMode;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListResponderExecutionsRequest(compartmentId, compartmentIdInSubtree,
            // accessLevel, responderRuleIds, timeCreatedGreaterThanOrEqualTo,
            // timeCreatedLessThanOrEqualTo, timeCompletedGreaterThanOrEqualTo,
            // timeCompletedLessThanOrEqualTo, targetId, resourceType, responderType,
            // responderExecutionStatus, responderExecutionMode, limit, page, sortOrder, sortBy,
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
                .compartmentId(compartmentId)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .accessLevel(accessLevel)
                .responderRuleIds(responderRuleIds)
                .timeCreatedGreaterThanOrEqualTo(timeCreatedGreaterThanOrEqualTo)
                .timeCreatedLessThanOrEqualTo(timeCreatedLessThanOrEqualTo)
                .timeCompletedGreaterThanOrEqualTo(timeCompletedGreaterThanOrEqualTo)
                .timeCompletedLessThanOrEqualTo(timeCompletedLessThanOrEqualTo)
                .targetId(targetId)
                .resourceType(resourceType)
                .responderType(responderType)
                .responderExecutionStatus(responderExecutionStatus)
                .responderExecutionMode(responderExecutionMode)
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",accessLevel=").append(String.valueOf(this.accessLevel));
        sb.append(",responderRuleIds=").append(String.valueOf(this.responderRuleIds));
        sb.append(",timeCreatedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeCreatedGreaterThanOrEqualTo));
        sb.append(",timeCreatedLessThanOrEqualTo=")
                .append(String.valueOf(this.timeCreatedLessThanOrEqualTo));
        sb.append(",timeCompletedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeCompletedGreaterThanOrEqualTo));
        sb.append(",timeCompletedLessThanOrEqualTo=")
                .append(String.valueOf(this.timeCompletedLessThanOrEqualTo));
        sb.append(",targetId=").append(String.valueOf(this.targetId));
        sb.append(",resourceType=").append(String.valueOf(this.resourceType));
        sb.append(",responderType=").append(String.valueOf(this.responderType));
        sb.append(",responderExecutionStatus=")
                .append(String.valueOf(this.responderExecutionStatus));
        sb.append(",responderExecutionMode=").append(String.valueOf(this.responderExecutionMode));
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
        if (!(o instanceof ListResponderExecutionsRequest)) {
            return false;
        }

        ListResponderExecutionsRequest other = (ListResponderExecutionsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.accessLevel, other.accessLevel)
                && java.util.Objects.equals(this.responderRuleIds, other.responderRuleIds)
                && java.util.Objects.equals(
                        this.timeCreatedGreaterThanOrEqualTo, other.timeCreatedGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.timeCreatedLessThanOrEqualTo, other.timeCreatedLessThanOrEqualTo)
                && java.util.Objects.equals(
                        this.timeCompletedGreaterThanOrEqualTo,
                        other.timeCompletedGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.timeCompletedLessThanOrEqualTo, other.timeCompletedLessThanOrEqualTo)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.responderType, other.responderType)
                && java.util.Objects.equals(
                        this.responderExecutionStatus, other.responderExecutionStatus)
                && java.util.Objects.equals(
                        this.responderExecutionMode, other.responderExecutionMode)
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
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result = (result * PRIME) + (this.accessLevel == null ? 43 : this.accessLevel.hashCode());
        result =
                (result * PRIME)
                        + (this.responderRuleIds == null ? 43 : this.responderRuleIds.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCreatedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeCreatedGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCreatedLessThanOrEqualTo == null
                                ? 43
                                : this.timeCreatedLessThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCompletedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeCompletedGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCompletedLessThanOrEqualTo == null
                                ? 43
                                : this.timeCompletedLessThanOrEqualTo.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.responderType == null ? 43 : this.responderType.hashCode());
        result =
                (result * PRIME)
                        + (this.responderExecutionStatus == null
                                ? 43
                                : this.responderExecutionStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.responderExecutionMode == null
                                ? 43
                                : this.responderExecutionMode.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
