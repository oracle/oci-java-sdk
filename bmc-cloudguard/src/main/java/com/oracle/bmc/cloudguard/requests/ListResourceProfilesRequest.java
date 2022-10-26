/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.requests;

import com.oracle.bmc.cloudguard.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListResourceProfilesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListResourceProfilesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
public class ListResourceProfilesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The ID of the compartment in which to list resources. */
    private String compartmentId;

    /** The ID of the compartment in which to list resources. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Start time for a filter. If start time is not specified, start time will be set to current
     * time - 30 days.
     */
    private java.util.Date timeLastDetectedGreaterThanOrEqualTo;

    /**
     * Start time for a filter. If start time is not specified, start time will be set to current
     * time - 30 days.
     */
    public java.util.Date getTimeLastDetectedGreaterThanOrEqualTo() {
        return timeLastDetectedGreaterThanOrEqualTo;
    }
    /**
     * End time for a filter. If end time is not specified, end time will be set to current time.
     */
    private java.util.Date timeLastDetectedLessThanOrEqualTo;

    /**
     * End time for a filter. If end time is not specified, end time will be set to current time.
     */
    public java.util.Date getTimeLastDetectedLessThanOrEqualTo() {
        return timeLastDetectedLessThanOrEqualTo;
    }
    /**
     * Start time for a filter. If start time is not specified, start time will be set to current
     * time - 30 days.
     */
    private java.util.Date timeFirstDetectedGreaterThanOrEqualTo;

    /**
     * Start time for a filter. If start time is not specified, start time will be set to current
     * time - 30 days.
     */
    public java.util.Date getTimeFirstDetectedGreaterThanOrEqualTo() {
        return timeFirstDetectedGreaterThanOrEqualTo;
    }
    /**
     * End time for a filter. If end time is not specified, end time will be set to current time.
     */
    private java.util.Date timeFirstDetectedLessThanOrEqualTo;

    /**
     * End time for a filter. If end time is not specified, end time will be set to current time.
     */
    public java.util.Date getTimeFirstDetectedLessThanOrEqualTo() {
        return timeFirstDetectedLessThanOrEqualTo;
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
    /** A filter to return only resources that match the list of resource types given */
    private java.util.List<String> resourceTypes;

    /** A filter to return only resources that match the list of resource types given */
    public java.util.List<String> getResourceTypes() {
        return resourceTypes;
    }
    /** risk score filter */
    private Double riskScoreGreaterThanOrEqualTo;

    /** risk score filter */
    public Double getRiskScoreGreaterThanOrEqualTo() {
        return riskScoreGreaterThanOrEqualTo;
    }
    /** risk score filter */
    private Double riskScoreLessThanOrEqualTo;

    /** risk score filter */
    public Double getRiskScoreLessThanOrEqualTo() {
        return riskScoreLessThanOrEqualTo;
    }
    /** A filter to return only resources that match the list of techniques given */
    private java.util.List<String> techniques;

    /** A filter to return only resources that match the list of techniques given */
    public java.util.List<String> getTechniques() {
        return techniques;
    }
    /** A filter to return only resources that match the list of tactics given. */
    private java.util.List<String> tactics;

    /** A filter to return only resources that match the list of tactics given. */
    public java.util.List<String> getTactics() {
        return tactics;
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
     * The field to sort resource profiles. Only one sort order may be provided. Default order for
     * timeLastDetected is descending. If no value is specified timeLastDetected is default.
     */
    private SortBy sortBy;

    /**
     * The field to sort resource profiles. Only one sort order may be provided. Default order for
     * timeLastDetected is descending. If no value is specified timeLastDetected is default.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
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
     * The field to sort resource profiles. Only one sort order may be provided. Default order for
     * timeLastDetected is descending. If no value is specified timeLastDetected is default.
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
                    ListResourceProfilesRequest, java.lang.Void> {
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
         * Start time for a filter. If start time is not specified, start time will be set to
         * current time - 30 days.
         */
        private java.util.Date timeLastDetectedGreaterThanOrEqualTo = null;

        /**
         * Start time for a filter. If start time is not specified, start time will be set to
         * current time - 30 days.
         *
         * @param timeLastDetectedGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeLastDetectedGreaterThanOrEqualTo(
                java.util.Date timeLastDetectedGreaterThanOrEqualTo) {
            this.timeLastDetectedGreaterThanOrEqualTo = timeLastDetectedGreaterThanOrEqualTo;
            return this;
        }

        /**
         * End time for a filter. If end time is not specified, end time will be set to current
         * time.
         */
        private java.util.Date timeLastDetectedLessThanOrEqualTo = null;

        /**
         * End time for a filter. If end time is not specified, end time will be set to current
         * time.
         *
         * @param timeLastDetectedLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeLastDetectedLessThanOrEqualTo(
                java.util.Date timeLastDetectedLessThanOrEqualTo) {
            this.timeLastDetectedLessThanOrEqualTo = timeLastDetectedLessThanOrEqualTo;
            return this;
        }

        /**
         * Start time for a filter. If start time is not specified, start time will be set to
         * current time - 30 days.
         */
        private java.util.Date timeFirstDetectedGreaterThanOrEqualTo = null;

        /**
         * Start time for a filter. If start time is not specified, start time will be set to
         * current time - 30 days.
         *
         * @param timeFirstDetectedGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeFirstDetectedGreaterThanOrEqualTo(
                java.util.Date timeFirstDetectedGreaterThanOrEqualTo) {
            this.timeFirstDetectedGreaterThanOrEqualTo = timeFirstDetectedGreaterThanOrEqualTo;
            return this;
        }

        /**
         * End time for a filter. If end time is not specified, end time will be set to current
         * time.
         */
        private java.util.Date timeFirstDetectedLessThanOrEqualTo = null;

        /**
         * End time for a filter. If end time is not specified, end time will be set to current
         * time.
         *
         * @param timeFirstDetectedLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeFirstDetectedLessThanOrEqualTo(
                java.util.Date timeFirstDetectedLessThanOrEqualTo) {
            this.timeFirstDetectedLessThanOrEqualTo = timeFirstDetectedLessThanOrEqualTo;
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

        /** A filter to return only resources that match the list of resource types given */
        private java.util.List<String> resourceTypes = null;

        /**
         * A filter to return only resources that match the list of resource types given
         *
         * @param resourceTypes the value to set
         * @return this builder instance
         */
        public Builder resourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources that match the list of resource types
         * given
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder resourceTypes(String singularValue) {
            return this.resourceTypes(java.util.Arrays.asList(singularValue));
        }

        /** risk score filter */
        private Double riskScoreGreaterThanOrEqualTo = null;

        /**
         * risk score filter
         *
         * @param riskScoreGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder riskScoreGreaterThanOrEqualTo(Double riskScoreGreaterThanOrEqualTo) {
            this.riskScoreGreaterThanOrEqualTo = riskScoreGreaterThanOrEqualTo;
            return this;
        }

        /** risk score filter */
        private Double riskScoreLessThanOrEqualTo = null;

        /**
         * risk score filter
         *
         * @param riskScoreLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder riskScoreLessThanOrEqualTo(Double riskScoreLessThanOrEqualTo) {
            this.riskScoreLessThanOrEqualTo = riskScoreLessThanOrEqualTo;
            return this;
        }

        /** A filter to return only resources that match the list of techniques given */
        private java.util.List<String> techniques = null;

        /**
         * A filter to return only resources that match the list of techniques given
         *
         * @param techniques the value to set
         * @return this builder instance
         */
        public Builder techniques(java.util.List<String> techniques) {
            this.techniques = techniques;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources that match the list of techniques
         * given
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder techniques(String singularValue) {
            return this.techniques(java.util.Arrays.asList(singularValue));
        }

        /** A filter to return only resources that match the list of tactics given. */
        private java.util.List<String> tactics = null;

        /**
         * A filter to return only resources that match the list of tactics given.
         *
         * @param tactics the value to set
         * @return this builder instance
         */
        public Builder tactics(java.util.List<String> tactics) {
            this.tactics = tactics;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources that match the list of tactics given.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder tactics(String singularValue) {
            return this.tactics(java.util.Arrays.asList(singularValue));
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
         * The field to sort resource profiles. Only one sort order may be provided. Default order
         * for timeLastDetected is descending. If no value is specified timeLastDetected is default.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort resource profiles. Only one sort order may be provided. Default order
         * for timeLastDetected is descending. If no value is specified timeLastDetected is default.
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
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListResourceProfilesRequest
         */
        public ListResourceProfilesRequest build() {
            ListResourceProfilesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListResourceProfilesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListResourceProfilesRequest
         */
        public ListResourceProfilesRequest buildWithoutInvocationCallback() {
            ListResourceProfilesRequest request = new ListResourceProfilesRequest();
            request.compartmentId = compartmentId;
            request.timeLastDetectedGreaterThanOrEqualTo = timeLastDetectedGreaterThanOrEqualTo;
            request.timeLastDetectedLessThanOrEqualTo = timeLastDetectedLessThanOrEqualTo;
            request.timeFirstDetectedGreaterThanOrEqualTo = timeFirstDetectedGreaterThanOrEqualTo;
            request.timeFirstDetectedLessThanOrEqualTo = timeFirstDetectedLessThanOrEqualTo;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.accessLevel = accessLevel;
            request.resourceTypes = resourceTypes;
            request.riskScoreGreaterThanOrEqualTo = riskScoreGreaterThanOrEqualTo;
            request.riskScoreLessThanOrEqualTo = riskScoreLessThanOrEqualTo;
            request.techniques = techniques;
            request.tactics = tactics;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListResourceProfilesRequest(compartmentId, timeLastDetectedGreaterThanOrEqualTo,
            // timeLastDetectedLessThanOrEqualTo, timeFirstDetectedGreaterThanOrEqualTo,
            // timeFirstDetectedLessThanOrEqualTo, compartmentIdInSubtree, accessLevel,
            // resourceTypes, riskScoreGreaterThanOrEqualTo, riskScoreLessThanOrEqualTo, techniques,
            // tactics, limit, page, sortOrder, sortBy, opcRequestId);
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
                .timeLastDetectedGreaterThanOrEqualTo(timeLastDetectedGreaterThanOrEqualTo)
                .timeLastDetectedLessThanOrEqualTo(timeLastDetectedLessThanOrEqualTo)
                .timeFirstDetectedGreaterThanOrEqualTo(timeFirstDetectedGreaterThanOrEqualTo)
                .timeFirstDetectedLessThanOrEqualTo(timeFirstDetectedLessThanOrEqualTo)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .accessLevel(accessLevel)
                .resourceTypes(resourceTypes)
                .riskScoreGreaterThanOrEqualTo(riskScoreGreaterThanOrEqualTo)
                .riskScoreLessThanOrEqualTo(riskScoreLessThanOrEqualTo)
                .techniques(techniques)
                .tactics(tactics)
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
        sb.append(",timeLastDetectedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeLastDetectedGreaterThanOrEqualTo));
        sb.append(",timeLastDetectedLessThanOrEqualTo=")
                .append(String.valueOf(this.timeLastDetectedLessThanOrEqualTo));
        sb.append(",timeFirstDetectedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeFirstDetectedGreaterThanOrEqualTo));
        sb.append(",timeFirstDetectedLessThanOrEqualTo=")
                .append(String.valueOf(this.timeFirstDetectedLessThanOrEqualTo));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",accessLevel=").append(String.valueOf(this.accessLevel));
        sb.append(",resourceTypes=").append(String.valueOf(this.resourceTypes));
        sb.append(",riskScoreGreaterThanOrEqualTo=")
                .append(String.valueOf(this.riskScoreGreaterThanOrEqualTo));
        sb.append(",riskScoreLessThanOrEqualTo=")
                .append(String.valueOf(this.riskScoreLessThanOrEqualTo));
        sb.append(",techniques=").append(String.valueOf(this.techniques));
        sb.append(",tactics=").append(String.valueOf(this.tactics));
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
        if (!(o instanceof ListResourceProfilesRequest)) {
            return false;
        }

        ListResourceProfilesRequest other = (ListResourceProfilesRequest) o;
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
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.accessLevel, other.accessLevel)
                && java.util.Objects.equals(this.resourceTypes, other.resourceTypes)
                && java.util.Objects.equals(
                        this.riskScoreGreaterThanOrEqualTo, other.riskScoreGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.riskScoreLessThanOrEqualTo, other.riskScoreLessThanOrEqualTo)
                && java.util.Objects.equals(this.techniques, other.techniques)
                && java.util.Objects.equals(this.tactics, other.tactics)
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
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result = (result * PRIME) + (this.accessLevel == null ? 43 : this.accessLevel.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceTypes == null ? 43 : this.resourceTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.riskScoreGreaterThanOrEqualTo == null
                                ? 43
                                : this.riskScoreGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.riskScoreLessThanOrEqualTo == null
                                ? 43
                                : this.riskScoreLessThanOrEqualTo.hashCode());
        result = (result * PRIME) + (this.techniques == null ? 43 : this.techniques.hashCode());
        result = (result * PRIME) + (this.tactics == null ? 43 : this.tactics.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
