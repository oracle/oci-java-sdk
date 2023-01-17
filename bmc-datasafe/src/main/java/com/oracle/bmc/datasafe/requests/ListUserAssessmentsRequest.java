/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListUserAssessmentsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListUserAssessmentsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListUserAssessmentsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * A filter to return only resources that match the specified compartment OCID.
     */
    private String compartmentId;

    /**
     * A filter to return only resources that match the specified compartment OCID.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Default is false.
     * When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned. Depends on the 'accessLevel' setting.
     *
     */
    private Boolean compartmentIdInSubtree;

    /**
     * Default is false.
     * When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned. Depends on the 'accessLevel' setting.
     *
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }
    /**
     * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED.
     * Setting this to ACCESSIBLE returns only those compartments for which the
     * user has INSPECT permissions directly or indirectly (permissions can be on a
     * resource in a subcompartment). When set to RESTRICTED permissions are checked and no partial results are displayed.
     *
     */
    private AccessLevel accessLevel;

    /**
     * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED.
     * Setting this to ACCESSIBLE returns only those compartments for which the
     * user has INSPECT permissions directly or indirectly (permissions can be on a
     * resource in a subcompartment). When set to RESTRICTED permissions are checked and no partial results are displayed.
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
     * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED.
     * Setting this to ACCESSIBLE returns only those compartments for which the
     * user has INSPECT permissions directly or indirectly (permissions can be on a
     * resource in a subcompartment). When set to RESTRICTED permissions are checked and no partial results are displayed.
     *
     */
    public AccessLevel getAccessLevel() {
        return accessLevel;
    }
    /**
     * A filter to return only resources that match the specified display name.
     *
     */
    private String displayName;

    /**
     * A filter to return only resources that match the specified display name.
     *
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * The OCID of the user assessment of type SAVE_SCHEDULE.
     */
    private String scheduleUserAssessmentId;

    /**
     * The OCID of the user assessment of type SAVE_SCHEDULE.
     */
    public String getScheduleUserAssessmentId() {
        return scheduleUserAssessmentId;
    }
    /**
     * A filter to return only user assessments of type SAVE_SCHEDULE.
     *
     */
    private Boolean isScheduleAssessment;

    /**
     * A filter to return only user assessments of type SAVE_SCHEDULE.
     *
     */
    public Boolean getIsScheduleAssessment() {
        return isScheduleAssessment;
    }
    /**
     * A filter to return only user assessments that are set as baseline.
     */
    private Boolean isBaseline;

    /**
     * A filter to return only user assessments that are set as baseline.
     */
    public Boolean getIsBaseline() {
        return isBaseline;
    }
    /**
     * A filter to return only items related to a specific target OCID.
     */
    private String targetId;

    /**
     * A filter to return only items related to a specific target OCID.
     */
    public String getTargetId() {
        return targetId;
    }
    /**
     * A filter to return only items that match the specified assessment type.
     */
    private Type type;

    /**
     * A filter to return only items that match the specified assessment type.
     **/
    public enum Type {
        Latest("LATEST"),
        Saved("SAVED"),
        Compartment("COMPARTMENT"),
        SaveSchedule("SAVE_SCHEDULE"),
        ;

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                map.put(v.getValue(), v);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };

    /**
     * A filter to return only items that match the specified assessment type.
     */
    public Type getType() {
        return type;
    }
    /**
     * A filter to return user assessments that were created by either the system or by a user only.
     */
    private TriggeredBy triggeredBy;

    /**
     * A filter to return user assessments that were created by either the system or by a user only.
     **/
    public enum TriggeredBy {
        User("USER"),
        System("SYSTEM"),
        ;

        private final String value;
        private static java.util.Map<String, TriggeredBy> map;

        static {
            map = new java.util.HashMap<>();
            for (TriggeredBy v : TriggeredBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        TriggeredBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TriggeredBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TriggeredBy: " + key);
        }
    };

    /**
     * A filter to return user assessments that were created by either the system or by a user only.
     */
    public TriggeredBy getTriggeredBy() {
        return triggeredBy;
    }
    /**
     * A filter to return only user assessments that were created after the specified date and time, as defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Using timeCreatedGreaterThanOrEqualTo parameter retrieves all assessments created after that date.
     * <p>
     **Example:** 2016-12-19T16:39:57.600Z
     *
     */
    private java.util.Date timeCreatedGreaterThanOrEqualTo;

    /**
     * A filter to return only user assessments that were created after the specified date and time, as defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Using timeCreatedGreaterThanOrEqualTo parameter retrieves all assessments created after that date.
     * <p>
     **Example:** 2016-12-19T16:39:57.600Z
     *
     */
    public java.util.Date getTimeCreatedGreaterThanOrEqualTo() {
        return timeCreatedGreaterThanOrEqualTo;
    }
    /**
     * Search for resources that were created before a specific date.
     * Specifying this parameter corresponding {@code timeCreatedLessThan}
     * parameter will retrieve all resources created before the
     * specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as
     * defined by RFC 3339.
     * <p>
     **Example:** 2016-12-19T16:39:57.600Z
     *
     */
    private java.util.Date timeCreatedLessThan;

    /**
     * Search for resources that were created before a specific date.
     * Specifying this parameter corresponding {@code timeCreatedLessThan}
     * parameter will retrieve all resources created before the
     * specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as
     * defined by RFC 3339.
     * <p>
     **Example:** 2016-12-19T16:39:57.600Z
     *
     */
    public java.util.Date getTimeCreatedLessThan() {
        return timeCreatedLessThan;
    }
    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /**
     * The current state of the user assessment.
     */
    private com.oracle.bmc.datasafe.model.UserAssessmentLifecycleState lifecycleState;

    /**
     * The current state of the user assessment.
     */
    public com.oracle.bmc.datasafe.model.UserAssessmentLifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * The sort order to use, either ascending (ASC) or descending (DESC).
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either ascending (ASC) or descending (DESC).
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
     * The sort order to use, either ascending (ASC) or descending (DESC).
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. You can specify only one sort order (sortOrder). The default order for timeCreated is descending.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can specify only one sort order (sortOrder). The default order for timeCreated is descending.
     *
     **/
    public enum SortBy {
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
     * The field to sort by. You can specify only one sort order (sortOrder). The default order for timeCreated is descending.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListUserAssessmentsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * A filter to return only resources that match the specified compartment OCID.
         */
        private String compartmentId = null;

        /**
         * A filter to return only resources that match the specified compartment OCID.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Default is false.
         * When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned. Depends on the 'accessLevel' setting.
         *
         */
        private Boolean compartmentIdInSubtree = null;

        /**
         * Default is false.
         * When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned. Depends on the 'accessLevel' setting.
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        /**
         * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED.
         * Setting this to ACCESSIBLE returns only those compartments for which the
         * user has INSPECT permissions directly or indirectly (permissions can be on a
         * resource in a subcompartment). When set to RESTRICTED permissions are checked and no partial results are displayed.
         *
         */
        private AccessLevel accessLevel = null;

        /**
         * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED.
         * Setting this to ACCESSIBLE returns only those compartments for which the
         * user has INSPECT permissions directly or indirectly (permissions can be on a
         * resource in a subcompartment). When set to RESTRICTED permissions are checked and no partial results are displayed.
         *
         * @param accessLevel the value to set
         * @return this builder instance
         */
        public Builder accessLevel(AccessLevel accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }

        /**
         * A filter to return only resources that match the specified display name.
         *
         */
        private String displayName = null;

        /**
         * A filter to return only resources that match the specified display name.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * The OCID of the user assessment of type SAVE_SCHEDULE.
         */
        private String scheduleUserAssessmentId = null;

        /**
         * The OCID of the user assessment of type SAVE_SCHEDULE.
         * @param scheduleUserAssessmentId the value to set
         * @return this builder instance
         */
        public Builder scheduleUserAssessmentId(String scheduleUserAssessmentId) {
            this.scheduleUserAssessmentId = scheduleUserAssessmentId;
            return this;
        }

        /**
         * A filter to return only user assessments of type SAVE_SCHEDULE.
         *
         */
        private Boolean isScheduleAssessment = null;

        /**
         * A filter to return only user assessments of type SAVE_SCHEDULE.
         *
         * @param isScheduleAssessment the value to set
         * @return this builder instance
         */
        public Builder isScheduleAssessment(Boolean isScheduleAssessment) {
            this.isScheduleAssessment = isScheduleAssessment;
            return this;
        }

        /**
         * A filter to return only user assessments that are set as baseline.
         */
        private Boolean isBaseline = null;

        /**
         * A filter to return only user assessments that are set as baseline.
         * @param isBaseline the value to set
         * @return this builder instance
         */
        public Builder isBaseline(Boolean isBaseline) {
            this.isBaseline = isBaseline;
            return this;
        }

        /**
         * A filter to return only items related to a specific target OCID.
         */
        private String targetId = null;

        /**
         * A filter to return only items related to a specific target OCID.
         * @param targetId the value to set
         * @return this builder instance
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            return this;
        }

        /**
         * A filter to return only items that match the specified assessment type.
         */
        private Type type = null;

        /**
         * A filter to return only items that match the specified assessment type.
         * @param type the value to set
         * @return this builder instance
         */
        public Builder type(Type type) {
            this.type = type;
            return this;
        }

        /**
         * A filter to return user assessments that were created by either the system or by a user only.
         */
        private TriggeredBy triggeredBy = null;

        /**
         * A filter to return user assessments that were created by either the system or by a user only.
         * @param triggeredBy the value to set
         * @return this builder instance
         */
        public Builder triggeredBy(TriggeredBy triggeredBy) {
            this.triggeredBy = triggeredBy;
            return this;
        }

        /**
         * A filter to return only user assessments that were created after the specified date and time, as defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Using timeCreatedGreaterThanOrEqualTo parameter retrieves all assessments created after that date.
         * <p>
         **Example:** 2016-12-19T16:39:57.600Z
         *
         */
        private java.util.Date timeCreatedGreaterThanOrEqualTo = null;

        /**
         * A filter to return only user assessments that were created after the specified date and time, as defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Using timeCreatedGreaterThanOrEqualTo parameter retrieves all assessments created after that date.
         * <p>
         **Example:** 2016-12-19T16:39:57.600Z
         *
         * @param timeCreatedGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeCreatedGreaterThanOrEqualTo(
                java.util.Date timeCreatedGreaterThanOrEqualTo) {
            this.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            return this;
        }

        /**
         * Search for resources that were created before a specific date.
         * Specifying this parameter corresponding {@code timeCreatedLessThan}
         * parameter will retrieve all resources created before the
         * specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as
         * defined by RFC 3339.
         * <p>
         **Example:** 2016-12-19T16:39:57.600Z
         *
         */
        private java.util.Date timeCreatedLessThan = null;

        /**
         * Search for resources that were created before a specific date.
         * Specifying this parameter corresponding {@code timeCreatedLessThan}
         * parameter will retrieve all resources created before the
         * specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as
         * defined by RFC 3339.
         * <p>
         **Example:** 2016-12-19T16:39:57.600Z
         *
         * @param timeCreatedLessThan the value to set
         * @return this builder instance
         */
        public Builder timeCreatedLessThan(java.util.Date timeCreatedLessThan) {
            this.timeCreatedLessThan = timeCreatedLessThan;
            return this;
        }

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The current state of the user assessment.
         */
        private com.oracle.bmc.datasafe.model.UserAssessmentLifecycleState lifecycleState = null;

        /**
         * The current state of the user assessment.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.datasafe.model.UserAssessmentLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * The sort order to use, either ascending (ASC) or descending (DESC).
         */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending (ASC) or descending (DESC).
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. You can specify only one sort order (sortOrder). The default order for timeCreated is descending.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can specify only one sort order (sortOrder). The default order for timeCreated is descending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Unique identifier for the request.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(ListUserAssessmentsRequest o) {
            compartmentId(o.getCompartmentId());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            accessLevel(o.getAccessLevel());
            displayName(o.getDisplayName());
            scheduleUserAssessmentId(o.getScheduleUserAssessmentId());
            isScheduleAssessment(o.getIsScheduleAssessment());
            isBaseline(o.getIsBaseline());
            targetId(o.getTargetId());
            type(o.getType());
            triggeredBy(o.getTriggeredBy());
            timeCreatedGreaterThanOrEqualTo(o.getTimeCreatedGreaterThanOrEqualTo());
            timeCreatedLessThan(o.getTimeCreatedLessThan());
            limit(o.getLimit());
            page(o.getPage());
            lifecycleState(o.getLifecycleState());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListUserAssessmentsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListUserAssessmentsRequest
         */
        public ListUserAssessmentsRequest build() {
            ListUserAssessmentsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListUserAssessmentsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListUserAssessmentsRequest
         */
        public ListUserAssessmentsRequest buildWithoutInvocationCallback() {
            ListUserAssessmentsRequest request = new ListUserAssessmentsRequest();
            request.compartmentId = compartmentId;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.accessLevel = accessLevel;
            request.displayName = displayName;
            request.scheduleUserAssessmentId = scheduleUserAssessmentId;
            request.isScheduleAssessment = isScheduleAssessment;
            request.isBaseline = isBaseline;
            request.targetId = targetId;
            request.type = type;
            request.triggeredBy = triggeredBy;
            request.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            request.timeCreatedLessThan = timeCreatedLessThan;
            request.limit = limit;
            request.page = page;
            request.lifecycleState = lifecycleState;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListUserAssessmentsRequest(compartmentId, compartmentIdInSubtree, accessLevel, displayName, scheduleUserAssessmentId, isScheduleAssessment, isBaseline, targetId, type, triggeredBy, timeCreatedGreaterThanOrEqualTo, timeCreatedLessThan, limit, page, lifecycleState, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .accessLevel(accessLevel)
                .displayName(displayName)
                .scheduleUserAssessmentId(scheduleUserAssessmentId)
                .isScheduleAssessment(isScheduleAssessment)
                .isBaseline(isBaseline)
                .targetId(targetId)
                .type(type)
                .triggeredBy(triggeredBy)
                .timeCreatedGreaterThanOrEqualTo(timeCreatedGreaterThanOrEqualTo)
                .timeCreatedLessThan(timeCreatedLessThan)
                .limit(limit)
                .page(page)
                .lifecycleState(lifecycleState)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
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
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",accessLevel=").append(String.valueOf(this.accessLevel));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",scheduleUserAssessmentId=")
                .append(String.valueOf(this.scheduleUserAssessmentId));
        sb.append(",isScheduleAssessment=").append(String.valueOf(this.isScheduleAssessment));
        sb.append(",isBaseline=").append(String.valueOf(this.isBaseline));
        sb.append(",targetId=").append(String.valueOf(this.targetId));
        sb.append(",type=").append(String.valueOf(this.type));
        sb.append(",triggeredBy=").append(String.valueOf(this.triggeredBy));
        sb.append(",timeCreatedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeCreatedGreaterThanOrEqualTo));
        sb.append(",timeCreatedLessThan=").append(String.valueOf(this.timeCreatedLessThan));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
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
        if (!(o instanceof ListUserAssessmentsRequest)) {
            return false;
        }

        ListUserAssessmentsRequest other = (ListUserAssessmentsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.accessLevel, other.accessLevel)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.scheduleUserAssessmentId, other.scheduleUserAssessmentId)
                && java.util.Objects.equals(this.isScheduleAssessment, other.isScheduleAssessment)
                && java.util.Objects.equals(this.isBaseline, other.isBaseline)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.triggeredBy, other.triggeredBy)
                && java.util.Objects.equals(
                        this.timeCreatedGreaterThanOrEqualTo, other.timeCreatedGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeCreatedLessThan, other.timeCreatedLessThan)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduleUserAssessmentId == null
                                ? 43
                                : this.scheduleUserAssessmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.isScheduleAssessment == null
                                ? 43
                                : this.isScheduleAssessment.hashCode());
        result = (result * PRIME) + (this.isBaseline == null ? 43 : this.isBaseline.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.triggeredBy == null ? 43 : this.triggeredBy.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCreatedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeCreatedGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCreatedLessThan == null
                                ? 43
                                : this.timeCreatedLessThan.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
