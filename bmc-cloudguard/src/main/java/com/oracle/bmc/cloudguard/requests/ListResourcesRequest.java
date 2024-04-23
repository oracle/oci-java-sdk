/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.requests;

import com.oracle.bmc.cloudguard.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListResourcesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListResourcesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
public class ListResourcesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the compartment in which to list resources. */
    private String compartmentId;

    /** The OCID of the compartment in which to list resources. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The ID of the target in which to list resources. */
    private String targetId;

    /** The ID of the target in which to list resources. */
    public String getTargetId() {
        return targetId;
    }
    /** OCI monitoring region. */
    private String region;

    /** OCI monitoring region. */
    public String getRegion() {
        return region;
    }
    /** Cvss score associated with the resource. */
    private Integer cvssScore;

    /** Cvss score associated with the resource. */
    public Integer getCvssScore() {
        return cvssScore;
    }
    /** Cvss score greater than associated with the resource. */
    private Integer cvssScoreGreaterThan;

    /** Cvss score greater than associated with the resource. */
    public Integer getCvssScoreGreaterThan() {
        return cvssScoreGreaterThan;
    }
    /** Cvss score less than associated with the resource. */
    private Integer cvssScoreLessThan;

    /** Cvss score less than associated with the resource. */
    public Integer getCvssScoreLessThan() {
        return cvssScoreLessThan;
    }
    /** CVE ID associated with the resource. */
    private String cveId;

    /** CVE ID associated with the resource. */
    public String getCveId() {
        return cveId;
    }
    /** Risk level of the problem. */
    private String riskLevel;

    /** Risk level of the problem. */
    public String getRiskLevel() {
        return riskLevel;
    }
    /** To filter risk level greater than the one mentioned in query param */
    private String riskLevelGreaterThan;

    /** To filter risk level greater than the one mentioned in query param */
    public String getRiskLevelGreaterThan() {
        return riskLevelGreaterThan;
    }
    /** To filter risk level less than the one mentioned in query param */
    private String riskLevelLessThan;

    /** To filter risk level less than the one mentioned in query param */
    public String getRiskLevelLessThan() {
        return riskLevelLessThan;
    }
    /** Comma seperated list of detector rule IDs to be passed in to match against Problems. */
    private java.util.List<String> detectorRuleIdList;

    /** Comma seperated list of detector rule IDs to be passed in to match against Problems. */
    public java.util.List<String> getDetectorRuleIdList() {
        return detectorRuleIdList;
    }
    /** The field to list the problems by detector type. */
    private com.oracle.bmc.cloudguard.model.DetectorEnum detectorType;

    /** The field to list the problems by detector type. */
    public com.oracle.bmc.cloudguard.model.DetectorEnum getDetectorType() {
        return detectorType;
    }
    /** The maximum number of items to return */
    private Integer limit;

    /** The maximum number of items to return */
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
    /**
     * Default is false. When set to true, the hierarchy of compartments is traversed and all
     * compartments and subcompartments in the tenancy are returned depending on the setting of
     * {@code accessLevel}.
     */
    private Boolean compartmentIdInSubtree;

    /**
     * Default is false. When set to true, the hierarchy of compartments is traversed and all
     * compartments and subcompartments in the tenancy are returned depending on the setting of
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
    /** The sort order to use */
    private com.oracle.bmc.cloudguard.model.SortOrders sortOrder;

    /** The sort order to use */
    public com.oracle.bmc.cloudguard.model.SortOrders getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending. If no value is specified timeCreated
     * is default.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending. If no value is specified timeCreated
     * is default.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("timeCreated"),
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending. If no value is specified timeCreated
     * is default.
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
                    ListResourcesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the compartment in which to list resources. */
        private String compartmentId = null;

        /**
         * The OCID of the compartment in which to list resources.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
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

        /** OCI monitoring region. */
        private String region = null;

        /**
         * OCI monitoring region.
         *
         * @param region the value to set
         * @return this builder instance
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /** Cvss score associated with the resource. */
        private Integer cvssScore = null;

        /**
         * Cvss score associated with the resource.
         *
         * @param cvssScore the value to set
         * @return this builder instance
         */
        public Builder cvssScore(Integer cvssScore) {
            this.cvssScore = cvssScore;
            return this;
        }

        /** Cvss score greater than associated with the resource. */
        private Integer cvssScoreGreaterThan = null;

        /**
         * Cvss score greater than associated with the resource.
         *
         * @param cvssScoreGreaterThan the value to set
         * @return this builder instance
         */
        public Builder cvssScoreGreaterThan(Integer cvssScoreGreaterThan) {
            this.cvssScoreGreaterThan = cvssScoreGreaterThan;
            return this;
        }

        /** Cvss score less than associated with the resource. */
        private Integer cvssScoreLessThan = null;

        /**
         * Cvss score less than associated with the resource.
         *
         * @param cvssScoreLessThan the value to set
         * @return this builder instance
         */
        public Builder cvssScoreLessThan(Integer cvssScoreLessThan) {
            this.cvssScoreLessThan = cvssScoreLessThan;
            return this;
        }

        /** CVE ID associated with the resource. */
        private String cveId = null;

        /**
         * CVE ID associated with the resource.
         *
         * @param cveId the value to set
         * @return this builder instance
         */
        public Builder cveId(String cveId) {
            this.cveId = cveId;
            return this;
        }

        /** Risk level of the problem. */
        private String riskLevel = null;

        /**
         * Risk level of the problem.
         *
         * @param riskLevel the value to set
         * @return this builder instance
         */
        public Builder riskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }

        /** To filter risk level greater than the one mentioned in query param */
        private String riskLevelGreaterThan = null;

        /**
         * To filter risk level greater than the one mentioned in query param
         *
         * @param riskLevelGreaterThan the value to set
         * @return this builder instance
         */
        public Builder riskLevelGreaterThan(String riskLevelGreaterThan) {
            this.riskLevelGreaterThan = riskLevelGreaterThan;
            return this;
        }

        /** To filter risk level less than the one mentioned in query param */
        private String riskLevelLessThan = null;

        /**
         * To filter risk level less than the one mentioned in query param
         *
         * @param riskLevelLessThan the value to set
         * @return this builder instance
         */
        public Builder riskLevelLessThan(String riskLevelLessThan) {
            this.riskLevelLessThan = riskLevelLessThan;
            return this;
        }

        /** Comma seperated list of detector rule IDs to be passed in to match against Problems. */
        private java.util.List<String> detectorRuleIdList = null;

        /**
         * Comma seperated list of detector rule IDs to be passed in to match against Problems.
         *
         * @param detectorRuleIdList the value to set
         * @return this builder instance
         */
        public Builder detectorRuleIdList(java.util.List<String> detectorRuleIdList) {
            this.detectorRuleIdList = detectorRuleIdList;
            return this;
        }

        /**
         * Singular setter. Comma seperated list of detector rule IDs to be passed in to match
         * against Problems.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder detectorRuleIdList(String singularValue) {
            return this.detectorRuleIdList(java.util.Arrays.asList(singularValue));
        }

        /** The field to list the problems by detector type. */
        private com.oracle.bmc.cloudguard.model.DetectorEnum detectorType = null;

        /**
         * The field to list the problems by detector type.
         *
         * @param detectorType the value to set
         * @return this builder instance
         */
        public Builder detectorType(com.oracle.bmc.cloudguard.model.DetectorEnum detectorType) {
            this.detectorType = detectorType;
            return this;
        }

        /** The maximum number of items to return */
        private Integer limit = null;

        /**
         * The maximum number of items to return
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

        /**
         * Default is false. When set to true, the hierarchy of compartments is traversed and all
         * compartments and subcompartments in the tenancy are returned depending on the setting of
         * {@code accessLevel}.
         */
        private Boolean compartmentIdInSubtree = null;

        /**
         * Default is false. When set to true, the hierarchy of compartments is traversed and all
         * compartments and subcompartments in the tenancy are returned depending on the setting of
         * {@code accessLevel}.
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

        /** The sort order to use */
        private com.oracle.bmc.cloudguard.model.SortOrders sortOrder = null;

        /**
         * The sort order to use
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
         * is descending. Default order for displayName is ascending. If no value is specified
         * timeCreated is default.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for displayName is ascending. If no value is specified
         * timeCreated is default.
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
        public Builder copy(ListResourcesRequest o) {
            compartmentId(o.getCompartmentId());
            targetId(o.getTargetId());
            region(o.getRegion());
            cvssScore(o.getCvssScore());
            cvssScoreGreaterThan(o.getCvssScoreGreaterThan());
            cvssScoreLessThan(o.getCvssScoreLessThan());
            cveId(o.getCveId());
            riskLevel(o.getRiskLevel());
            riskLevelGreaterThan(o.getRiskLevelGreaterThan());
            riskLevelLessThan(o.getRiskLevelLessThan());
            detectorRuleIdList(o.getDetectorRuleIdList());
            detectorType(o.getDetectorType());
            limit(o.getLimit());
            page(o.getPage());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            accessLevel(o.getAccessLevel());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListResourcesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListResourcesRequest
         */
        public ListResourcesRequest build() {
            ListResourcesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListResourcesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListResourcesRequest
         */
        public ListResourcesRequest buildWithoutInvocationCallback() {
            ListResourcesRequest request = new ListResourcesRequest();
            request.compartmentId = compartmentId;
            request.targetId = targetId;
            request.region = region;
            request.cvssScore = cvssScore;
            request.cvssScoreGreaterThan = cvssScoreGreaterThan;
            request.cvssScoreLessThan = cvssScoreLessThan;
            request.cveId = cveId;
            request.riskLevel = riskLevel;
            request.riskLevelGreaterThan = riskLevelGreaterThan;
            request.riskLevelLessThan = riskLevelLessThan;
            request.detectorRuleIdList = detectorRuleIdList;
            request.detectorType = detectorType;
            request.limit = limit;
            request.page = page;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.accessLevel = accessLevel;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListResourcesRequest(compartmentId, targetId, region, cvssScore,
            // cvssScoreGreaterThan, cvssScoreLessThan, cveId, riskLevel, riskLevelGreaterThan,
            // riskLevelLessThan, detectorRuleIdList, detectorType, limit, page,
            // compartmentIdInSubtree, accessLevel, sortOrder, sortBy, opcRequestId);
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
                .targetId(targetId)
                .region(region)
                .cvssScore(cvssScore)
                .cvssScoreGreaterThan(cvssScoreGreaterThan)
                .cvssScoreLessThan(cvssScoreLessThan)
                .cveId(cveId)
                .riskLevel(riskLevel)
                .riskLevelGreaterThan(riskLevelGreaterThan)
                .riskLevelLessThan(riskLevelLessThan)
                .detectorRuleIdList(detectorRuleIdList)
                .detectorType(detectorType)
                .limit(limit)
                .page(page)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .accessLevel(accessLevel)
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
        sb.append(",targetId=").append(String.valueOf(this.targetId));
        sb.append(",region=").append(String.valueOf(this.region));
        sb.append(",cvssScore=").append(String.valueOf(this.cvssScore));
        sb.append(",cvssScoreGreaterThan=").append(String.valueOf(this.cvssScoreGreaterThan));
        sb.append(",cvssScoreLessThan=").append(String.valueOf(this.cvssScoreLessThan));
        sb.append(",cveId=").append(String.valueOf(this.cveId));
        sb.append(",riskLevel=").append(String.valueOf(this.riskLevel));
        sb.append(",riskLevelGreaterThan=").append(String.valueOf(this.riskLevelGreaterThan));
        sb.append(",riskLevelLessThan=").append(String.valueOf(this.riskLevelLessThan));
        sb.append(",detectorRuleIdList=").append(String.valueOf(this.detectorRuleIdList));
        sb.append(",detectorType=").append(String.valueOf(this.detectorType));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",accessLevel=").append(String.valueOf(this.accessLevel));
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
        if (!(o instanceof ListResourcesRequest)) {
            return false;
        }

        ListResourcesRequest other = (ListResourcesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.cvssScore, other.cvssScore)
                && java.util.Objects.equals(this.cvssScoreGreaterThan, other.cvssScoreGreaterThan)
                && java.util.Objects.equals(this.cvssScoreLessThan, other.cvssScoreLessThan)
                && java.util.Objects.equals(this.cveId, other.cveId)
                && java.util.Objects.equals(this.riskLevel, other.riskLevel)
                && java.util.Objects.equals(this.riskLevelGreaterThan, other.riskLevelGreaterThan)
                && java.util.Objects.equals(this.riskLevelLessThan, other.riskLevelLessThan)
                && java.util.Objects.equals(this.detectorRuleIdList, other.detectorRuleIdList)
                && java.util.Objects.equals(this.detectorType, other.detectorType)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.accessLevel, other.accessLevel)
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
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.cvssScore == null ? 43 : this.cvssScore.hashCode());
        result =
                (result * PRIME)
                        + (this.cvssScoreGreaterThan == null
                                ? 43
                                : this.cvssScoreGreaterThan.hashCode());
        result =
                (result * PRIME)
                        + (this.cvssScoreLessThan == null ? 43 : this.cvssScoreLessThan.hashCode());
        result = (result * PRIME) + (this.cveId == null ? 43 : this.cveId.hashCode());
        result = (result * PRIME) + (this.riskLevel == null ? 43 : this.riskLevel.hashCode());
        result =
                (result * PRIME)
                        + (this.riskLevelGreaterThan == null
                                ? 43
                                : this.riskLevelGreaterThan.hashCode());
        result =
                (result * PRIME)
                        + (this.riskLevelLessThan == null ? 43 : this.riskLevelLessThan.hashCode());
        result =
                (result * PRIME)
                        + (this.detectorRuleIdList == null
                                ? 43
                                : this.detectorRuleIdList.hashCode());
        result = (result * PRIME) + (this.detectorType == null ? 43 : this.detectorType.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result = (result * PRIME) + (this.accessLevel == null ? 43 : this.accessLevel.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
