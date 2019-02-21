/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.announcementsservice.requests;

import com.oracle.bmc.announcementsservice.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class ListAnnouncementsRequest extends com.oracle.bmc.requests.BmcRequest {

    /**
     * The OCID of the compartment. Because announcements are specific to a tenancy, this is the
     * OCID of the root compartment.
     *
     */
    private String compartmentId;

    /**
     * The maximum number of items to return in a paginated \"List\" call.
     */
    private Integer limit;

    /**
     * The value of the `opc-next-page` response header from the previous \"List\" call.
     */
    private String page;

    /**
     * The type of announcement.
     */
    private String announcementType;

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
            throw new RuntimeException("Invalid LifecycleState: " + key);
        }
    };

    /**
     * Whether the announcement is displayed as a console banner.
     */
    private Boolean isBanner;

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
            throw new RuntimeException("Invalid SortBy: " + key);
        }
    };

    /**
     * The sort order to use. (Sorting by `announcementType` orders the announcements list according to importance.)
     *
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use. (Sorting by `announcementType` orders the announcements list according to importance.)
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
            throw new RuntimeException("Invalid SortOrder: " + key);
        }
    };

    /**
     * The boundary for the earliest `timeOneValue` date on announcements that you want to see.
     */
    private java.util.Date timeOneEarliestTime;

    /**
     * The boundary for the latest `timeOneValue` date on announcements that you want to see.
     */
    private java.util.Date timeOneLatestTime;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the complete request ID.
     *
     */
    private String opcRequestId;

    public static class Builder {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;

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
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
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
            return request;
        }
    }
}
