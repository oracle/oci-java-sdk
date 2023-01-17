/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousContainerDatabasesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListAutonomousContainerDatabasesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListAutonomousContainerDatabasesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The compartment [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String compartmentId;

    /**
     * The compartment [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The Autonomous Exadata Infrastructure [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String autonomousExadataInfrastructureId;

    /**
     * The Autonomous Exadata Infrastructure [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getAutonomousExadataInfrastructureId() {
        return autonomousExadataInfrastructureId;
    }
    /**
     * The Autonomous VM Cluster [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String autonomousVmClusterId;

    /**
     * The Autonomous VM Cluster [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getAutonomousVmClusterId() {
        return autonomousVmClusterId;
    }
    /**
     * A filter to return only resources that match the given Infrastructure Type.
     */
    private com.oracle.bmc.database.model.AutonomousContainerDatabaseSummary.InfrastructureType
            infrastructureType;

    /**
     * A filter to return only resources that match the given Infrastructure Type.
     */
    public com.oracle.bmc.database.model.AutonomousContainerDatabaseSummary.InfrastructureType
            getInfrastructureType() {
        return infrastructureType;
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
     * The pagination token to continue listing from.
     */
    private String page;

    /**
     * The pagination token to continue listing from.
     */
    public String getPage() {
        return page;
    }
    /**
     * The field to sort by.  You can provide one sort order ({@code sortOrder}).  Default order for TIMECREATED is descending.  Default order for DISPLAYNAME is ascending. The DISPLAYNAME sort order is case sensitive.
     * <p>
     **Note:** If you do not include the availability domain filter, the resources are grouped by availability domain, then sorted.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by.  You can provide one sort order ({@code sortOrder}).  Default order for TIMECREATED is descending.  Default order for DISPLAYNAME is ascending. The DISPLAYNAME sort order is case sensitive.
     * <p>
     **Note:** If you do not include the availability domain filter, the resources are grouped by availability domain, then sorted.
     *
     **/
    public enum SortBy {
        Timecreated("TIMECREATED"),
        Displayname("DISPLAYNAME"),
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
     * The field to sort by.  You can provide one sort order ({@code sortOrder}).  Default order for TIMECREATED is descending.  Default order for DISPLAYNAME is ascending. The DISPLAYNAME sort order is case sensitive.
     * <p>
     **Note:** If you do not include the availability domain filter, the resources are grouped by availability domain, then sorted.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
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
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * A filter to return only resources that match the given lifecycle state exactly.
     */
    private com.oracle.bmc.database.model.AutonomousContainerDatabaseSummary.LifecycleState
            lifecycleState;

    /**
     * A filter to return only resources that match the given lifecycle state exactly.
     */
    public com.oracle.bmc.database.model.AutonomousContainerDatabaseSummary.LifecycleState
            getLifecycleState() {
        return lifecycleState;
    }
    /**
     * A filter to return only resources that match the given availability domain exactly.
     */
    private String availabilityDomain;

    /**
     * A filter to return only resources that match the given availability domain exactly.
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }
    /**
     * A filter to return only resources that match the entire display name given. The match is not case sensitive.
     */
    private String displayName;

    /**
     * A filter to return only resources that match the entire display name given. The match is not case sensitive.
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * A filter to return only resources that match the given service-level agreement type exactly.
     */
    private String serviceLevelAgreementType;

    /**
     * A filter to return only resources that match the given service-level agreement type exactly.
     */
    public String getServiceLevelAgreementType() {
        return serviceLevelAgreementType;
    }
    /**
     * The cloud Autonomous VM Cluster [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String cloudAutonomousVmClusterId;

    /**
     * The cloud Autonomous VM Cluster [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getCloudAutonomousVmClusterId() {
        return cloudAutonomousVmClusterId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListAutonomousContainerDatabasesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The compartment [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String compartmentId = null;

        /**
         * The compartment [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The Autonomous Exadata Infrastructure [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String autonomousExadataInfrastructureId = null;

        /**
         * The Autonomous Exadata Infrastructure [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param autonomousExadataInfrastructureId the value to set
         * @return this builder instance
         */
        public Builder autonomousExadataInfrastructureId(String autonomousExadataInfrastructureId) {
            this.autonomousExadataInfrastructureId = autonomousExadataInfrastructureId;
            return this;
        }

        /**
         * The Autonomous VM Cluster [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String autonomousVmClusterId = null;

        /**
         * The Autonomous VM Cluster [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param autonomousVmClusterId the value to set
         * @return this builder instance
         */
        public Builder autonomousVmClusterId(String autonomousVmClusterId) {
            this.autonomousVmClusterId = autonomousVmClusterId;
            return this;
        }

        /**
         * A filter to return only resources that match the given Infrastructure Type.
         */
        private com.oracle.bmc.database.model.AutonomousContainerDatabaseSummary.InfrastructureType
                infrastructureType = null;

        /**
         * A filter to return only resources that match the given Infrastructure Type.
         * @param infrastructureType the value to set
         * @return this builder instance
         */
        public Builder infrastructureType(
                com.oracle.bmc.database.model.AutonomousContainerDatabaseSummary.InfrastructureType
                        infrastructureType) {
            this.infrastructureType = infrastructureType;
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
         * The pagination token to continue listing from.
         */
        private String page = null;

        /**
         * The pagination token to continue listing from.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The field to sort by.  You can provide one sort order ({@code sortOrder}).  Default order for TIMECREATED is descending.  Default order for DISPLAYNAME is ascending. The DISPLAYNAME sort order is case sensitive.
         * <p>
         **Note:** If you do not include the availability domain filter, the resources are grouped by availability domain, then sorted.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by.  You can provide one sort order ({@code sortOrder}).  Default order for TIMECREATED is descending.  Default order for DISPLAYNAME is ascending. The DISPLAYNAME sort order is case sensitive.
         * <p>
         **Note:** If you do not include the availability domain filter, the resources are grouped by availability domain, then sorted.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * A filter to return only resources that match the given lifecycle state exactly.
         */
        private com.oracle.bmc.database.model.AutonomousContainerDatabaseSummary.LifecycleState
                lifecycleState = null;

        /**
         * A filter to return only resources that match the given lifecycle state exactly.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.database.model.AutonomousContainerDatabaseSummary.LifecycleState
                        lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * A filter to return only resources that match the given availability domain exactly.
         */
        private String availabilityDomain = null;

        /**
         * A filter to return only resources that match the given availability domain exactly.
         * @param availabilityDomain the value to set
         * @return this builder instance
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            return this;
        }

        /**
         * A filter to return only resources that match the entire display name given. The match is not case sensitive.
         */
        private String displayName = null;

        /**
         * A filter to return only resources that match the entire display name given. The match is not case sensitive.
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * A filter to return only resources that match the given service-level agreement type exactly.
         */
        private String serviceLevelAgreementType = null;

        /**
         * A filter to return only resources that match the given service-level agreement type exactly.
         * @param serviceLevelAgreementType the value to set
         * @return this builder instance
         */
        public Builder serviceLevelAgreementType(String serviceLevelAgreementType) {
            this.serviceLevelAgreementType = serviceLevelAgreementType;
            return this;
        }

        /**
         * The cloud Autonomous VM Cluster [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String cloudAutonomousVmClusterId = null;

        /**
         * The cloud Autonomous VM Cluster [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param cloudAutonomousVmClusterId the value to set
         * @return this builder instance
         */
        public Builder cloudAutonomousVmClusterId(String cloudAutonomousVmClusterId) {
            this.cloudAutonomousVmClusterId = cloudAutonomousVmClusterId;
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
        public Builder copy(ListAutonomousContainerDatabasesRequest o) {
            compartmentId(o.getCompartmentId());
            autonomousExadataInfrastructureId(o.getAutonomousExadataInfrastructureId());
            autonomousVmClusterId(o.getAutonomousVmClusterId());
            infrastructureType(o.getInfrastructureType());
            limit(o.getLimit());
            page(o.getPage());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            lifecycleState(o.getLifecycleState());
            availabilityDomain(o.getAvailabilityDomain());
            displayName(o.getDisplayName());
            serviceLevelAgreementType(o.getServiceLevelAgreementType());
            cloudAutonomousVmClusterId(o.getCloudAutonomousVmClusterId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListAutonomousContainerDatabasesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListAutonomousContainerDatabasesRequest
         */
        public ListAutonomousContainerDatabasesRequest build() {
            ListAutonomousContainerDatabasesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListAutonomousContainerDatabasesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListAutonomousContainerDatabasesRequest
         */
        public ListAutonomousContainerDatabasesRequest buildWithoutInvocationCallback() {
            ListAutonomousContainerDatabasesRequest request =
                    new ListAutonomousContainerDatabasesRequest();
            request.compartmentId = compartmentId;
            request.autonomousExadataInfrastructureId = autonomousExadataInfrastructureId;
            request.autonomousVmClusterId = autonomousVmClusterId;
            request.infrastructureType = infrastructureType;
            request.limit = limit;
            request.page = page;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.lifecycleState = lifecycleState;
            request.availabilityDomain = availabilityDomain;
            request.displayName = displayName;
            request.serviceLevelAgreementType = serviceLevelAgreementType;
            request.cloudAutonomousVmClusterId = cloudAutonomousVmClusterId;
            return request;
            // new ListAutonomousContainerDatabasesRequest(compartmentId, autonomousExadataInfrastructureId, autonomousVmClusterId, infrastructureType, limit, page, sortBy, sortOrder, lifecycleState, availabilityDomain, displayName, serviceLevelAgreementType, cloudAutonomousVmClusterId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .autonomousExadataInfrastructureId(autonomousExadataInfrastructureId)
                .autonomousVmClusterId(autonomousVmClusterId)
                .infrastructureType(infrastructureType)
                .limit(limit)
                .page(page)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .lifecycleState(lifecycleState)
                .availabilityDomain(availabilityDomain)
                .displayName(displayName)
                .serviceLevelAgreementType(serviceLevelAgreementType)
                .cloudAutonomousVmClusterId(cloudAutonomousVmClusterId);
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",autonomousExadataInfrastructureId=")
                .append(String.valueOf(this.autonomousExadataInfrastructureId));
        sb.append(",autonomousVmClusterId=").append(String.valueOf(this.autonomousVmClusterId));
        sb.append(",infrastructureType=").append(String.valueOf(this.infrastructureType));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",serviceLevelAgreementType=")
                .append(String.valueOf(this.serviceLevelAgreementType));
        sb.append(",cloudAutonomousVmClusterId=")
                .append(String.valueOf(this.cloudAutonomousVmClusterId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListAutonomousContainerDatabasesRequest)) {
            return false;
        }

        ListAutonomousContainerDatabasesRequest other = (ListAutonomousContainerDatabasesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.autonomousExadataInfrastructureId,
                        other.autonomousExadataInfrastructureId)
                && java.util.Objects.equals(this.autonomousVmClusterId, other.autonomousVmClusterId)
                && java.util.Objects.equals(this.infrastructureType, other.infrastructureType)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.serviceLevelAgreementType, other.serviceLevelAgreementType)
                && java.util.Objects.equals(
                        this.cloudAutonomousVmClusterId, other.cloudAutonomousVmClusterId);
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
                        + (this.autonomousExadataInfrastructureId == null
                                ? 43
                                : this.autonomousExadataInfrastructureId.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousVmClusterId == null
                                ? 43
                                : this.autonomousVmClusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.infrastructureType == null
                                ? 43
                                : this.infrastructureType.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceLevelAgreementType == null
                                ? 43
                                : this.serviceLevelAgreementType.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudAutonomousVmClusterId == null
                                ? 43
                                : this.cloudAutonomousVmClusterId.hashCode());
        return result;
    }
}
