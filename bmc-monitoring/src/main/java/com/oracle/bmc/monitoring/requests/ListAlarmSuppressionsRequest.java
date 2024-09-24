/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.requests;

import com.oracle.bmc.monitoring.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/monitoring/ListAlarmSuppressionsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListAlarmSuppressionsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
public class ListAlarmSuppressionsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Customer part of the request identifier token. If you need to contact Oracle about a
     * particular request, please provide the complete request ID.
     */
    private String opcRequestId;

    /**
     * Customer part of the request identifier token. If you need to contact Oracle about a
     * particular request, please provide the complete request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the alarm that is the target of the alarm suppression.
     */
    private String alarmId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the alarm that is the target of the alarm suppression.
     */
    public String getAlarmId() {
        return alarmId;
    }
    /**
     * A filter to return only resources that match the given display name exactly. Use this filter
     * to list an alarm suppression by name. Alternatively, when you know the alarm suppression
     * OCID, use the GetAlarmSuppression operation.
     */
    private String displayName;

    /**
     * A filter to return only resources that match the given display name exactly. Use this filter
     * to list an alarm suppression by name. Alternatively, when you know the alarm suppression
     * OCID, use the GetAlarmSuppression operation.
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * A filter to return only resources that match the given lifecycle state exactly. When not
     * specified, only resources in the ACTIVE lifecycle state are listed.
     */
    private com.oracle.bmc.monitoring.model.AlarmSuppression.LifecycleState lifecycleState;

    /**
     * A filter to return only resources that match the given lifecycle state exactly. When not
     * specified, only resources in the ACTIVE lifecycle state are listed.
     */
    public com.oracle.bmc.monitoring.model.AlarmSuppression.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * The level of this alarm suppression. {@code ALARM} indicates a suppression of the entire
     * alarm, regardless of dimension. {@code DIMENSION} indicates a suppression configured for
     * specified dimensions.
     */
    private com.oracle.bmc.monitoring.model.AlarmSuppression.Level level;

    /**
     * The level of this alarm suppression. {@code ALARM} indicates a suppression of the entire
     * alarm, regardless of dimension. {@code DIMENSION} indicates a suppression configured for
     * specified dimensions.
     */
    public com.oracle.bmc.monitoring.model.AlarmSuppression.Level getLevel() {
        return level;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment for searching. Use the tenancy OCID to search in the root compartment.
     *
     * <p>If targetType is not specified, searches all suppressions defined under the compartment.
     * If targetType is {@code COMPARTMENT}, searches suppressions in the specified compartment
     * only.
     *
     * <p>Example: {@code ocid1.compartment.oc1..exampleuniqueID}
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment for searching. Use the tenancy OCID to search in the root compartment.
     *
     * <p>If targetType is not specified, searches all suppressions defined under the compartment.
     * If targetType is {@code COMPARTMENT}, searches suppressions in the specified compartment
     * only.
     *
     * <p>Example: {@code ocid1.compartment.oc1..exampleuniqueID}
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * When true, returns resources from all compartments and subcompartments. The parameter can
     * only be set to true when compartmentId is the tenancy OCID (the tenancy is the root
     * compartment). A true value requires the user to have tenancy-level permissions. If this
     * requirement is not met, then the call is rejected. When false, returns resources from only
     * the compartment specified in compartmentId. Default is false.
     */
    private Boolean compartmentIdInSubtree;

    /**
     * When true, returns resources from all compartments and subcompartments. The parameter can
     * only be set to true when compartmentId is the tenancy OCID (the tenancy is the root
     * compartment). A true value requires the user to have tenancy-level permissions. If this
     * requirement is not met, then the call is rejected. When false, returns resources from only
     * the compartment specified in compartmentId. Default is false.
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }
    /**
     * The target type to use when listing alarm suppressions. {@code ALARM} lists all suppression
     * records for the specified alarm. {@code COMPARTMENT} lists all suppression records for the
     * specified compartment or tenancy.
     */
    private TargetType targetType;

    /**
     * The target type to use when listing alarm suppressions. {@code ALARM} lists all suppression
     * records for the specified alarm. {@code COMPARTMENT} lists all suppression records for the
     * specified compartment or tenancy.
     */
    public enum TargetType implements com.oracle.bmc.http.internal.BmcEnum {
        Alarm("ALARM"),
        Compartment("COMPARTMENT"),
        ;

        private final String value;
        private static java.util.Map<String, TargetType> map;

        static {
            map = new java.util.HashMap<>();
            for (TargetType v : TargetType.values()) {
                map.put(v.getValue(), v);
            }
        }

        TargetType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TargetType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TargetType: " + key);
        }
    };

    /**
     * The target type to use when listing alarm suppressions. {@code ALARM} lists all suppression
     * records for the specified alarm. {@code COMPARTMENT} lists all suppression records for the
     * specified compartment or tenancy.
     */
    public TargetType getTargetType() {
        return targetType;
    }
    /**
     * Setting this parameter to true requires the query to specify the alarm ({@code alarmId}).
     *
     * <p>When true, lists all alarm suppressions that affect the specified alarm, including
     * suppressions that target the corresponding compartment or tenancy. When false, lists only the
     * alarm suppressions that target the specified alarm.
     *
     * <p>Default is false.
     */
    private Boolean isAllSuppressions;

    /**
     * Setting this parameter to true requires the query to specify the alarm ({@code alarmId}).
     *
     * <p>When true, lists all alarm suppressions that affect the specified alarm, including
     * suppressions that target the corresponding compartment or tenancy. When false, lists only the
     * alarm suppressions that target the specified alarm.
     *
     * <p>Default is false.
     */
    public Boolean getIsAllSuppressions() {
        return isAllSuppressions;
    }
    /**
     * The field to use when sorting returned alarm suppressions. Only one sorting level is
     * provided.
     *
     * <p>Example: {@code timeCreated}
     */
    private SortBy sortBy;

    /**
     * The field to use when sorting returned alarm suppressions. Only one sorting level is
     * provided.
     *
     * <p>Example: {@code timeCreated}
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        DisplayName("displayName"),
        TimeCreated("timeCreated"),
        TimeSuppressFrom("timeSuppressFrom"),
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
     * The field to use when sorting returned alarm suppressions. Only one sorting level is
     * provided.
     *
     * <p>Example: {@code timeCreated}
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The sort order to use when sorting returned alarm suppressions. Ascending (ASC) or descending
     * (DESC).
     *
     * <p>Example: {@code ASC}
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use when sorting returned alarm suppressions. Ascending (ASC) or descending
     * (DESC).
     *
     * <p>Example: {@code ASC}
     */
    public enum SortOrder implements com.oracle.bmc.http.internal.BmcEnum {
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
     * The sort order to use when sorting returned alarm suppressions. Ascending (ASC) or descending
     * (DESC).
     *
     * <p>Example: {@code ASC}
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Default: 1000
     *
     * <p>Example: 500
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Default: 1000
     *
     * <p>Example: 500
     */
    public Integer getLimit() {
        return limit;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListAlarmSuppressionsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Customer part of the request identifier token. If you need to contact Oracle about a
         * particular request, please provide the complete request ID.
         */
        private String opcRequestId = null;

        /**
         * Customer part of the request identifier token. If you need to contact Oracle about a
         * particular request, please provide the complete request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the alarm that is the target of the alarm suppression.
         */
        private String alarmId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the alarm that is the target of the alarm suppression.
         *
         * @param alarmId the value to set
         * @return this builder instance
         */
        public Builder alarmId(String alarmId) {
            this.alarmId = alarmId;
            return this;
        }

        /**
         * A filter to return only resources that match the given display name exactly. Use this
         * filter to list an alarm suppression by name. Alternatively, when you know the alarm
         * suppression OCID, use the GetAlarmSuppression operation.
         */
        private String displayName = null;

        /**
         * A filter to return only resources that match the given display name exactly. Use this
         * filter to list an alarm suppression by name. Alternatively, when you know the alarm
         * suppression OCID, use the GetAlarmSuppression operation.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * A filter to return only resources that match the given lifecycle state exactly. When not
         * specified, only resources in the ACTIVE lifecycle state are listed.
         */
        private com.oracle.bmc.monitoring.model.AlarmSuppression.LifecycleState lifecycleState =
                null;

        /**
         * A filter to return only resources that match the given lifecycle state exactly. When not
         * specified, only resources in the ACTIVE lifecycle state are listed.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.monitoring.model.AlarmSuppression.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * The level of this alarm suppression. {@code ALARM} indicates a suppression of the entire
         * alarm, regardless of dimension. {@code DIMENSION} indicates a suppression configured for
         * specified dimensions.
         */
        private com.oracle.bmc.monitoring.model.AlarmSuppression.Level level = null;

        /**
         * The level of this alarm suppression. {@code ALARM} indicates a suppression of the entire
         * alarm, regardless of dimension. {@code DIMENSION} indicates a suppression configured for
         * specified dimensions.
         *
         * @param level the value to set
         * @return this builder instance
         */
        public Builder level(com.oracle.bmc.monitoring.model.AlarmSuppression.Level level) {
            this.level = level;
            return this;
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment for searching. Use the tenancy OCID to search in the root compartment.
         *
         * <p>If targetType is not specified, searches all suppressions defined under the
         * compartment. If targetType is {@code COMPARTMENT}, searches suppressions in the specified
         * compartment only.
         *
         * <p>Example: {@code ocid1.compartment.oc1..exampleuniqueID}
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment for searching. Use the tenancy OCID to search in the root compartment.
         *
         * <p>If targetType is not specified, searches all suppressions defined under the
         * compartment. If targetType is {@code COMPARTMENT}, searches suppressions in the specified
         * compartment only.
         *
         * <p>Example: {@code ocid1.compartment.oc1..exampleuniqueID}
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * When true, returns resources from all compartments and subcompartments. The parameter can
         * only be set to true when compartmentId is the tenancy OCID (the tenancy is the root
         * compartment). A true value requires the user to have tenancy-level permissions. If this
         * requirement is not met, then the call is rejected. When false, returns resources from
         * only the compartment specified in compartmentId. Default is false.
         */
        private Boolean compartmentIdInSubtree = null;

        /**
         * When true, returns resources from all compartments and subcompartments. The parameter can
         * only be set to true when compartmentId is the tenancy OCID (the tenancy is the root
         * compartment). A true value requires the user to have tenancy-level permissions. If this
         * requirement is not met, then the call is rejected. When false, returns resources from
         * only the compartment specified in compartmentId. Default is false.
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        /**
         * The target type to use when listing alarm suppressions. {@code ALARM} lists all
         * suppression records for the specified alarm. {@code COMPARTMENT} lists all suppression
         * records for the specified compartment or tenancy.
         */
        private TargetType targetType = null;

        /**
         * The target type to use when listing alarm suppressions. {@code ALARM} lists all
         * suppression records for the specified alarm. {@code COMPARTMENT} lists all suppression
         * records for the specified compartment or tenancy.
         *
         * @param targetType the value to set
         * @return this builder instance
         */
        public Builder targetType(TargetType targetType) {
            this.targetType = targetType;
            return this;
        }

        /**
         * Setting this parameter to true requires the query to specify the alarm ({@code alarmId}).
         *
         * <p>When true, lists all alarm suppressions that affect the specified alarm, including
         * suppressions that target the corresponding compartment or tenancy. When false, lists only
         * the alarm suppressions that target the specified alarm.
         *
         * <p>Default is false.
         */
        private Boolean isAllSuppressions = null;

        /**
         * Setting this parameter to true requires the query to specify the alarm ({@code alarmId}).
         *
         * <p>When true, lists all alarm suppressions that affect the specified alarm, including
         * suppressions that target the corresponding compartment or tenancy. When false, lists only
         * the alarm suppressions that target the specified alarm.
         *
         * <p>Default is false.
         *
         * @param isAllSuppressions the value to set
         * @return this builder instance
         */
        public Builder isAllSuppressions(Boolean isAllSuppressions) {
            this.isAllSuppressions = isAllSuppressions;
            return this;
        }

        /**
         * The field to use when sorting returned alarm suppressions. Only one sorting level is
         * provided.
         *
         * <p>Example: {@code timeCreated}
         */
        private SortBy sortBy = null;

        /**
         * The field to use when sorting returned alarm suppressions. Only one sorting level is
         * provided.
         *
         * <p>Example: {@code timeCreated}
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The sort order to use when sorting returned alarm suppressions. Ascending (ASC) or
         * descending (DESC).
         *
         * <p>Example: {@code ASC}
         */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use when sorting returned alarm suppressions. Ascending (ASC) or
         * descending (DESC).
         *
         * <p>Example: {@code ASC}
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Default: 1000
         *
         * <p>Example: 500
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Default: 1000
         *
         * <p>Example: 500
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
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
        public Builder copy(ListAlarmSuppressionsRequest o) {
            opcRequestId(o.getOpcRequestId());
            alarmId(o.getAlarmId());
            displayName(o.getDisplayName());
            lifecycleState(o.getLifecycleState());
            level(o.getLevel());
            compartmentId(o.getCompartmentId());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            targetType(o.getTargetType());
            isAllSuppressions(o.getIsAllSuppressions());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            page(o.getPage());
            limit(o.getLimit());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListAlarmSuppressionsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListAlarmSuppressionsRequest
         */
        public ListAlarmSuppressionsRequest build() {
            ListAlarmSuppressionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListAlarmSuppressionsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListAlarmSuppressionsRequest
         */
        public ListAlarmSuppressionsRequest buildWithoutInvocationCallback() {
            ListAlarmSuppressionsRequest request = new ListAlarmSuppressionsRequest();
            request.opcRequestId = opcRequestId;
            request.alarmId = alarmId;
            request.displayName = displayName;
            request.lifecycleState = lifecycleState;
            request.level = level;
            request.compartmentId = compartmentId;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.targetType = targetType;
            request.isAllSuppressions = isAllSuppressions;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.page = page;
            request.limit = limit;
            return request;
            // new ListAlarmSuppressionsRequest(opcRequestId, alarmId, displayName, lifecycleState,
            // level, compartmentId, compartmentIdInSubtree, targetType, isAllSuppressions, sortBy,
            // sortOrder, page, limit);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .opcRequestId(opcRequestId)
                .alarmId(alarmId)
                .displayName(displayName)
                .lifecycleState(lifecycleState)
                .level(level)
                .compartmentId(compartmentId)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .targetType(targetType)
                .isAllSuppressions(isAllSuppressions)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .page(page)
                .limit(limit);
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
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",alarmId=").append(String.valueOf(this.alarmId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",level=").append(String.valueOf(this.level));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",targetType=").append(String.valueOf(this.targetType));
        sb.append(",isAllSuppressions=").append(String.valueOf(this.isAllSuppressions));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListAlarmSuppressionsRequest)) {
            return false;
        }

        ListAlarmSuppressionsRequest other = (ListAlarmSuppressionsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.alarmId, other.alarmId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.level, other.level)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.targetType, other.targetType)
                && java.util.Objects.equals(this.isAllSuppressions, other.isAllSuppressions)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.alarmId == null ? 43 : this.alarmId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.level == null ? 43 : this.level.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result = (result * PRIME) + (this.targetType == null ? 43 : this.targetType.hashCode());
        result =
                (result * PRIME)
                        + (this.isAllSuppressions == null ? 43 : this.isAllSuppressions.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        return result;
    }
}
