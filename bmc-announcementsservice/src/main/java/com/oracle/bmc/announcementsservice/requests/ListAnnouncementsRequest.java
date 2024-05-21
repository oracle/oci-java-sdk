/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice.requests;

import com.oracle.bmc.announcementsservice.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/announcementsservice/ListAnnouncementsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListAnnouncementsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
public class ListAnnouncementsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the compartment.
     *
     */
    private String compartmentId;

    /**
     * The OCID of the compartment.
     *
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The maximum number of items to return in a paginated "List" call.
     */
    private Integer limit;

    /**
     * The maximum number of items to return in a paginated "List" call.
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The value of the {@code opc-next-page} response header from the previous "List" call.
     */
    private String page;

    /**
     * The value of the {@code opc-next-page} response header from the previous "List" call.
     */
    public String getPage() {
        return page;
    }
    /**
     * The type of announcement.
     */
    private String announcementType;

    /**
     * The type of announcement.
     */
    public String getAnnouncementType() {
        return announcementType;
    }
    /**
     * The announcement's current lifecycle state.
     */
    private LifecycleState lifecycleState;

    /**
     * The announcement's current lifecycle state.
     **/
    public enum LifecycleState {
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        ;

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                map.put(v.getValue(), v);
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid LifecycleState: " + key);
        }
    };

    /**
     * The announcement's current lifecycle state.
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * Whether the announcement is displayed as a console banner.
     */
    private Boolean isBanner;

    /**
     * Whether the announcement is displayed as a console banner.
     */
    public Boolean getIsBanner() {
        return isBanner;
    }
    /**
     * The criteria to sort by. You can specify only one sort order.
     *
     */
    private SortBy sortBy;

    /**
     * The criteria to sort by. You can specify only one sort order.
     *
     **/
    public enum SortBy {
        TimeOneValue("timeOneValue"),
        TimeTwoValue("timeTwoValue"),
        TimeCreated("timeCreated"),
        ReferenceTicketNumber("referenceTicketNumber"),
        Summary("summary"),
        AnnouncementType("announcementType"),
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
     * The criteria to sort by. You can specify only one sort order.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The sort order to use. (Sorting by {@code announcementType} orders the announcements list according to importance.)
     *
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use. (Sorting by {@code announcementType} orders the announcements list according to importance.)
     *
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
     * The sort order to use. (Sorting by {@code announcementType} orders the announcements list according to importance.)
     *
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The boundary for the earliest {@code timeOneValue} date on announcements that you want to see.
     */
    private java.util.Date timeOneEarliestTime;

    /**
     * The boundary for the earliest {@code timeOneValue} date on announcements that you want to see.
     */
    public java.util.Date getTimeOneEarliestTime() {
        return timeOneEarliestTime;
    }
    /**
     * The boundary for the latest {@code timeOneValue} date on announcements that you want to see.
     */
    private java.util.Date timeOneLatestTime;

    /**
     * The boundary for the latest {@code timeOneValue} date on announcements that you want to see.
     */
    public java.util.Date getTimeOneLatestTime() {
        return timeOneLatestTime;
    }
    /**
     * A filter to return only announcements that match a specific environment name.
     */
    private String environmentName;

    /**
     * A filter to return only announcements that match a specific environment name.
     */
    public String getEnvironmentName() {
        return environmentName;
    }
    /**
     * A filter to return only announcements affecting a specific service.
     */
    private String service;

    /**
     * A filter to return only announcements affecting a specific service.
     */
    public String getService() {
        return service;
    }
    /**
     * A filter to return only announcements affecting a specific platform.
     */
    private PlatformType platformType;

    /**
     * A filter to return only announcements affecting a specific platform.
     **/
    public enum PlatformType {
        Iaas("IAAS"),
        Saas("SAAS"),
        ;

        private final String value;
        private static java.util.Map<String, PlatformType> map;

        static {
            map = new java.util.HashMap<>();
            for (PlatformType v : PlatformType.values()) {
                map.put(v.getValue(), v);
            }
        }

        PlatformType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PlatformType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid PlatformType: " + key);
        }
    };

    /**
     * A filter to return only announcements affecting a specific platform.
     */
    public PlatformType getPlatformType() {
        return platformType;
    }
    /**
     * Exclude The type of announcement.
     */
    private java.util.List<String> excludeAnnouncementTypes;

    /**
     * Exclude The type of announcement.
     */
    public java.util.List<String> getExcludeAnnouncementTypes() {
        return excludeAnnouncementTypes;
    }
    /**
     * A filter to display only the latest announcement in a chain.
     */
    private Boolean shouldShowOnlyLatestInChain;

    /**
     * A filter to display only the latest announcement in a chain.
     */
    public Boolean getShouldShowOnlyLatestInChain() {
        return shouldShowOnlyLatestInChain;
    }
    /**
     * A filter to return only announcements belonging to the specified announcement chain ID.
     */
    private String chainId;

    /**
     * A filter to return only announcements belonging to the specified announcement chain ID.
     */
    public String getChainId() {
        return chainId;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the complete request ID.
     *
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the complete request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListAnnouncementsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the compartment.
         *
         */
        private String compartmentId = null;

        /**
         * The OCID of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The maximum number of items to return in a paginated "List" call.
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return in a paginated "List" call.
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The value of the {@code opc-next-page} response header from the previous "List" call.
         */
        private String page = null;

        /**
         * The value of the {@code opc-next-page} response header from the previous "List" call.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The type of announcement.
         */
        private String announcementType = null;

        /**
         * The type of announcement.
         * @param announcementType the value to set
         * @return this builder instance
         */
        public Builder announcementType(String announcementType) {
            this.announcementType = announcementType;
            return this;
        }

        /**
         * The announcement's current lifecycle state.
         */
        private LifecycleState lifecycleState = null;

        /**
         * The announcement's current lifecycle state.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * Whether the announcement is displayed as a console banner.
         */
        private Boolean isBanner = null;

        /**
         * Whether the announcement is displayed as a console banner.
         * @param isBanner the value to set
         * @return this builder instance
         */
        public Builder isBanner(Boolean isBanner) {
            this.isBanner = isBanner;
            return this;
        }

        /**
         * The criteria to sort by. You can specify only one sort order.
         *
         */
        private SortBy sortBy = null;

        /**
         * The criteria to sort by. You can specify only one sort order.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The sort order to use. (Sorting by {@code announcementType} orders the announcements list according to importance.)
         *
         */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use. (Sorting by {@code announcementType} orders the announcements list according to importance.)
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The boundary for the earliest {@code timeOneValue} date on announcements that you want to see.
         */
        private java.util.Date timeOneEarliestTime = null;

        /**
         * The boundary for the earliest {@code timeOneValue} date on announcements that you want to see.
         * @param timeOneEarliestTime the value to set
         * @return this builder instance
         */
        public Builder timeOneEarliestTime(java.util.Date timeOneEarliestTime) {
            this.timeOneEarliestTime = timeOneEarliestTime;
            return this;
        }

        /**
         * The boundary for the latest {@code timeOneValue} date on announcements that you want to see.
         */
        private java.util.Date timeOneLatestTime = null;

        /**
         * The boundary for the latest {@code timeOneValue} date on announcements that you want to see.
         * @param timeOneLatestTime the value to set
         * @return this builder instance
         */
        public Builder timeOneLatestTime(java.util.Date timeOneLatestTime) {
            this.timeOneLatestTime = timeOneLatestTime;
            return this;
        }

        /**
         * A filter to return only announcements that match a specific environment name.
         */
        private String environmentName = null;

        /**
         * A filter to return only announcements that match a specific environment name.
         * @param environmentName the value to set
         * @return this builder instance
         */
        public Builder environmentName(String environmentName) {
            this.environmentName = environmentName;
            return this;
        }

        /**
         * A filter to return only announcements affecting a specific service.
         */
        private String service = null;

        /**
         * A filter to return only announcements affecting a specific service.
         * @param service the value to set
         * @return this builder instance
         */
        public Builder service(String service) {
            this.service = service;
            return this;
        }

        /**
         * A filter to return only announcements affecting a specific platform.
         */
        private PlatformType platformType = null;

        /**
         * A filter to return only announcements affecting a specific platform.
         * @param platformType the value to set
         * @return this builder instance
         */
        public Builder platformType(PlatformType platformType) {
            this.platformType = platformType;
            return this;
        }

        /**
         * Exclude The type of announcement.
         */
        private java.util.List<String> excludeAnnouncementTypes = null;

        /**
         * Exclude The type of announcement.
         * @param excludeAnnouncementTypes the value to set
         * @return this builder instance
         */
        public Builder excludeAnnouncementTypes(java.util.List<String> excludeAnnouncementTypes) {
            this.excludeAnnouncementTypes = excludeAnnouncementTypes;
            return this;
        }

        /**
         * Singular setter. Exclude The type of announcement.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder excludeAnnouncementTypes(String singularValue) {
            return this.excludeAnnouncementTypes(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to display only the latest announcement in a chain.
         */
        private Boolean shouldShowOnlyLatestInChain = null;

        /**
         * A filter to display only the latest announcement in a chain.
         * @param shouldShowOnlyLatestInChain the value to set
         * @return this builder instance
         */
        public Builder shouldShowOnlyLatestInChain(Boolean shouldShowOnlyLatestInChain) {
            this.shouldShowOnlyLatestInChain = shouldShowOnlyLatestInChain;
            return this;
        }

        /**
         * A filter to return only announcements belonging to the specified announcement chain ID.
         */
        private String chainId = null;

        /**
         * A filter to return only announcements belonging to the specified announcement chain ID.
         * @param chainId the value to set
         * @return this builder instance
         */
        public Builder chainId(String chainId) {
            this.chainId = chainId;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the complete request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the complete request ID.
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
        public Builder copy(ListAnnouncementsRequest o) {
            compartmentId(o.getCompartmentId());
            limit(o.getLimit());
            page(o.getPage());
            announcementType(o.getAnnouncementType());
            lifecycleState(o.getLifecycleState());
            isBanner(o.getIsBanner());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            timeOneEarliestTime(o.getTimeOneEarliestTime());
            timeOneLatestTime(o.getTimeOneLatestTime());
            environmentName(o.getEnvironmentName());
            service(o.getService());
            platformType(o.getPlatformType());
            excludeAnnouncementTypes(o.getExcludeAnnouncementTypes());
            shouldShowOnlyLatestInChain(o.getShouldShowOnlyLatestInChain());
            chainId(o.getChainId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListAnnouncementsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListAnnouncementsRequest
         */
        public ListAnnouncementsRequest build() {
            ListAnnouncementsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListAnnouncementsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListAnnouncementsRequest
         */
        public ListAnnouncementsRequest buildWithoutInvocationCallback() {
            ListAnnouncementsRequest request = new ListAnnouncementsRequest();
            request.compartmentId = compartmentId;
            request.limit = limit;
            request.page = page;
            request.announcementType = announcementType;
            request.lifecycleState = lifecycleState;
            request.isBanner = isBanner;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.timeOneEarliestTime = timeOneEarliestTime;
            request.timeOneLatestTime = timeOneLatestTime;
            request.environmentName = environmentName;
            request.service = service;
            request.platformType = platformType;
            request.excludeAnnouncementTypes = excludeAnnouncementTypes;
            request.shouldShowOnlyLatestInChain = shouldShowOnlyLatestInChain;
            request.chainId = chainId;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListAnnouncementsRequest(compartmentId, limit, page, announcementType, lifecycleState, isBanner, sortBy, sortOrder, timeOneEarliestTime, timeOneLatestTime, environmentName, service, platformType, excludeAnnouncementTypes, shouldShowOnlyLatestInChain, chainId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .limit(limit)
                .page(page)
                .announcementType(announcementType)
                .lifecycleState(lifecycleState)
                .isBanner(isBanner)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .timeOneEarliestTime(timeOneEarliestTime)
                .timeOneLatestTime(timeOneLatestTime)
                .environmentName(environmentName)
                .service(service)
                .platformType(platformType)
                .excludeAnnouncementTypes(excludeAnnouncementTypes)
                .shouldShowOnlyLatestInChain(shouldShowOnlyLatestInChain)
                .chainId(chainId)
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",announcementType=").append(String.valueOf(this.announcementType));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",isBanner=").append(String.valueOf(this.isBanner));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",timeOneEarliestTime=").append(String.valueOf(this.timeOneEarliestTime));
        sb.append(",timeOneLatestTime=").append(String.valueOf(this.timeOneLatestTime));
        sb.append(",environmentName=").append(String.valueOf(this.environmentName));
        sb.append(",service=").append(String.valueOf(this.service));
        sb.append(",platformType=").append(String.valueOf(this.platformType));
        sb.append(",excludeAnnouncementTypes=")
                .append(String.valueOf(this.excludeAnnouncementTypes));
        sb.append(",shouldShowOnlyLatestInChain=")
                .append(String.valueOf(this.shouldShowOnlyLatestInChain));
        sb.append(",chainId=").append(String.valueOf(this.chainId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListAnnouncementsRequest)) {
            return false;
        }

        ListAnnouncementsRequest other = (ListAnnouncementsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.announcementType, other.announcementType)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.isBanner, other.isBanner)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.timeOneEarliestTime, other.timeOneEarliestTime)
                && java.util.Objects.equals(this.timeOneLatestTime, other.timeOneLatestTime)
                && java.util.Objects.equals(this.environmentName, other.environmentName)
                && java.util.Objects.equals(this.service, other.service)
                && java.util.Objects.equals(this.platformType, other.platformType)
                && java.util.Objects.equals(
                        this.excludeAnnouncementTypes, other.excludeAnnouncementTypes)
                && java.util.Objects.equals(
                        this.shouldShowOnlyLatestInChain, other.shouldShowOnlyLatestInChain)
                && java.util.Objects.equals(this.chainId, other.chainId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.announcementType == null ? 43 : this.announcementType.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.isBanner == null ? 43 : this.isBanner.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOneEarliestTime == null
                                ? 43
                                : this.timeOneEarliestTime.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOneLatestTime == null ? 43 : this.timeOneLatestTime.hashCode());
        result =
                (result * PRIME)
                        + (this.environmentName == null ? 43 : this.environmentName.hashCode());
        result = (result * PRIME) + (this.service == null ? 43 : this.service.hashCode());
        result = (result * PRIME) + (this.platformType == null ? 43 : this.platformType.hashCode());
        result =
                (result * PRIME)
                        + (this.excludeAnnouncementTypes == null
                                ? 43
                                : this.excludeAnnouncementTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldShowOnlyLatestInChain == null
                                ? 43
                                : this.shouldShowOnlyLatestInChain.hashCode());
        result = (result * PRIME) + (this.chainId == null ? 43 : this.chainId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
