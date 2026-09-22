/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListCryptoAssessmentsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListCryptoAssessmentsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListCryptoAssessmentsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * A filter to return only crypto assessments that match the specified type.
     */
    private com.oracle.bmc.datasafe.model.CryptoAssessment.Type type;

    /**
     * A filter to return only crypto assessments that match the specified type.
     */
    public com.oracle.bmc.datasafe.model.CryptoAssessment.Type getType() {
        return type;
    }
    /**
     * A filter to return only resources associated with the specified crypto assessment OCID.
     */
    private String assessmentId;

    /**
     * A filter to return only resources associated with the specified crypto assessment OCID.
     */
    public String getAssessmentId() {
        return assessmentId;
    }
    /**
     * A filter to return only crypto assessments associated with the specified target OCID. When provided, targetType must also be specified.
     */
    private String targetId;

    /**
     * A filter to return only crypto assessments associated with the specified target OCID. When provided, targetType must also be specified.
     */
    public String getTargetId() {
        return targetId;
    }
    /**
     * A filter to return only resources associated with any of the specified target OCIDs.
     */
    private java.util.List<String> targetIds;

    /**
     * A filter to return only resources associated with any of the specified target OCIDs.
     */
    public java.util.List<String> getTargetIds() {
        return targetIds;
    }
    /**
     * A filter to return the target database group that matches the specified OCID.
     */
    private String targetDatabaseGroupId;

    /**
     * A filter to return the target database group that matches the specified OCID.
     */
    public String getTargetDatabaseGroupId() {
        return targetDatabaseGroupId;
    }
    /**
     * A filter to return crypto assessments belonging to the specified target type. {@code ListCryptoAssessments} returns assessment rows; use {@code targetDatabaseGroupId} to list the underlying target database assessments for a group.
     */
    private com.oracle.bmc.datasafe.model.CryptoAssessment.TargetType targetType;

    /**
     * A filter to return crypto assessments belonging to the specified target type. {@code ListCryptoAssessments} returns assessment rows; use {@code targetDatabaseGroupId} to list the underlying target database assessments for a group.
     */
    public com.oracle.bmc.datasafe.model.CryptoAssessment.TargetType getTargetType() {
        return targetType;
    }
    /**
     * A filter to return only crypto assessments that match any of the specified posture categories.
     */
    private java.util.List<com.oracle.bmc.datasafe.model.CryptoPostureCategory> postureCategory;

    /**
     * A filter to return only crypto assessments that match any of the specified posture categories.
     */
    public java.util.List<com.oracle.bmc.datasafe.model.CryptoPostureCategory>
            getPostureCategory() {
        return postureCategory;
    }
    /**
     * A filter to return only crypto assessments whose scheduled execution state matches the specified value.
     */
    private Boolean isAssessmentScheduled;

    /**
     * A filter to return only crypto assessments whose scheduled execution state matches the specified value.
     */
    public Boolean getIsAssessmentScheduled() {
        return isAssessmentScheduled;
    }
    /**
     * A filter to return only resources that match the specified lifecycle state.
     */
    private com.oracle.bmc.datasafe.model.CryptoAssessment.LifecycleState lifecycleState;

    /**
     * A filter to return only resources that match the specified lifecycle state.
     */
    public com.oracle.bmc.datasafe.model.CryptoAssessment.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * The field used to sort crypto assessments. You can specify only one sort order (sortOrder).
     *
     */
    private SortBy sortBy;

    /**
     * The field used to sort crypto assessments. You can specify only one sort order (sortOrder).
     *
     **/
    public enum SortBy {
        IssueCount("issueCount"),
        TimeCreated("timeCreated"),
        TimeUpdated("timeUpdated"),
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
     * The field used to sort crypto assessments. You can specify only one sort order (sortOrder).
     *
     */
    public SortBy getSortBy() {
        return sortBy;
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
     * Unique identifier for the request.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListCryptoAssessmentsRequest, java.lang.Void> {
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
         * A filter to return only crypto assessments that match the specified type.
         */
        private com.oracle.bmc.datasafe.model.CryptoAssessment.Type type = null;

        /**
         * A filter to return only crypto assessments that match the specified type.
         * @param type the value to set
         * @return this builder instance
         */
        public Builder type(com.oracle.bmc.datasafe.model.CryptoAssessment.Type type) {
            this.type = type;
            return this;
        }

        /**
         * A filter to return only resources associated with the specified crypto assessment OCID.
         */
        private String assessmentId = null;

        /**
         * A filter to return only resources associated with the specified crypto assessment OCID.
         * @param assessmentId the value to set
         * @return this builder instance
         */
        public Builder assessmentId(String assessmentId) {
            this.assessmentId = assessmentId;
            return this;
        }

        /**
         * A filter to return only crypto assessments associated with the specified target OCID. When provided, targetType must also be specified.
         */
        private String targetId = null;

        /**
         * A filter to return only crypto assessments associated with the specified target OCID. When provided, targetType must also be specified.
         * @param targetId the value to set
         * @return this builder instance
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            return this;
        }

        /**
         * A filter to return only resources associated with any of the specified target OCIDs.
         */
        private java.util.List<String> targetIds = null;

        /**
         * A filter to return only resources associated with any of the specified target OCIDs.
         * @param targetIds the value to set
         * @return this builder instance
         */
        public Builder targetIds(java.util.List<String> targetIds) {
            this.targetIds = targetIds;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources associated with any of the specified target OCIDs.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder targetIds(String singularValue) {
            return this.targetIds(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return the target database group that matches the specified OCID.
         */
        private String targetDatabaseGroupId = null;

        /**
         * A filter to return the target database group that matches the specified OCID.
         * @param targetDatabaseGroupId the value to set
         * @return this builder instance
         */
        public Builder targetDatabaseGroupId(String targetDatabaseGroupId) {
            this.targetDatabaseGroupId = targetDatabaseGroupId;
            return this;
        }

        /**
         * A filter to return crypto assessments belonging to the specified target type. {@code ListCryptoAssessments} returns assessment rows; use {@code targetDatabaseGroupId} to list the underlying target database assessments for a group.
         */
        private com.oracle.bmc.datasafe.model.CryptoAssessment.TargetType targetType = null;

        /**
         * A filter to return crypto assessments belonging to the specified target type. {@code ListCryptoAssessments} returns assessment rows; use {@code targetDatabaseGroupId} to list the underlying target database assessments for a group.
         * @param targetType the value to set
         * @return this builder instance
         */
        public Builder targetType(
                com.oracle.bmc.datasafe.model.CryptoAssessment.TargetType targetType) {
            this.targetType = targetType;
            return this;
        }

        /**
         * A filter to return only crypto assessments that match any of the specified posture categories.
         */
        private java.util.List<com.oracle.bmc.datasafe.model.CryptoPostureCategory>
                postureCategory = null;

        /**
         * A filter to return only crypto assessments that match any of the specified posture categories.
         * @param postureCategory the value to set
         * @return this builder instance
         */
        public Builder postureCategory(
                java.util.List<com.oracle.bmc.datasafe.model.CryptoPostureCategory>
                        postureCategory) {
            this.postureCategory = postureCategory;
            return this;
        }

        /**
         * Singular setter. A filter to return only crypto assessments that match any of the specified posture categories.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder postureCategory(CryptoPostureCategory singularValue) {
            return this.postureCategory(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return only crypto assessments whose scheduled execution state matches the specified value.
         */
        private Boolean isAssessmentScheduled = null;

        /**
         * A filter to return only crypto assessments whose scheduled execution state matches the specified value.
         * @param isAssessmentScheduled the value to set
         * @return this builder instance
         */
        public Builder isAssessmentScheduled(Boolean isAssessmentScheduled) {
            this.isAssessmentScheduled = isAssessmentScheduled;
            return this;
        }

        /**
         * A filter to return only resources that match the specified lifecycle state.
         */
        private com.oracle.bmc.datasafe.model.CryptoAssessment.LifecycleState lifecycleState = null;

        /**
         * A filter to return only resources that match the specified lifecycle state.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.datasafe.model.CryptoAssessment.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * The field used to sort crypto assessments. You can specify only one sort order (sortOrder).
         *
         */
        private SortBy sortBy = null;

        /**
         * The field used to sort crypto assessments. You can specify only one sort order (sortOrder).
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
         * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
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
        public Builder copy(ListCryptoAssessmentsRequest o) {
            compartmentId(o.getCompartmentId());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            accessLevel(o.getAccessLevel());
            displayName(o.getDisplayName());
            type(o.getType());
            assessmentId(o.getAssessmentId());
            targetId(o.getTargetId());
            targetIds(o.getTargetIds());
            targetDatabaseGroupId(o.getTargetDatabaseGroupId());
            targetType(o.getTargetType());
            postureCategory(o.getPostureCategory());
            isAssessmentScheduled(o.getIsAssessmentScheduled());
            lifecycleState(o.getLifecycleState());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListCryptoAssessmentsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListCryptoAssessmentsRequest
         */
        public ListCryptoAssessmentsRequest build() {
            ListCryptoAssessmentsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListCryptoAssessmentsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListCryptoAssessmentsRequest
         */
        public ListCryptoAssessmentsRequest buildWithoutInvocationCallback() {
            ListCryptoAssessmentsRequest request = new ListCryptoAssessmentsRequest();
            request.compartmentId = compartmentId;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.accessLevel = accessLevel;
            request.displayName = displayName;
            request.type = type;
            request.assessmentId = assessmentId;
            request.targetId = targetId;
            request.targetIds = targetIds;
            request.targetDatabaseGroupId = targetDatabaseGroupId;
            request.targetType = targetType;
            request.postureCategory = postureCategory;
            request.isAssessmentScheduled = isAssessmentScheduled;
            request.lifecycleState = lifecycleState;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            return request;
            // new ListCryptoAssessmentsRequest(compartmentId, compartmentIdInSubtree, accessLevel, displayName, type, assessmentId, targetId, targetIds, targetDatabaseGroupId, targetType, postureCategory, isAssessmentScheduled, lifecycleState, sortBy, sortOrder, opcRequestId, limit, page);
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
                .type(type)
                .assessmentId(assessmentId)
                .targetId(targetId)
                .targetIds(targetIds)
                .targetDatabaseGroupId(targetDatabaseGroupId)
                .targetType(targetType)
                .postureCategory(postureCategory)
                .isAssessmentScheduled(isAssessmentScheduled)
                .lifecycleState(lifecycleState)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page);
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
        sb.append(",type=").append(String.valueOf(this.type));
        sb.append(",assessmentId=").append(String.valueOf(this.assessmentId));
        sb.append(",targetId=").append(String.valueOf(this.targetId));
        sb.append(",targetIds=").append(String.valueOf(this.targetIds));
        sb.append(",targetDatabaseGroupId=").append(String.valueOf(this.targetDatabaseGroupId));
        sb.append(",targetType=").append(String.valueOf(this.targetType));
        sb.append(",postureCategory=").append(String.valueOf(this.postureCategory));
        sb.append(",isAssessmentScheduled=").append(String.valueOf(this.isAssessmentScheduled));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListCryptoAssessmentsRequest)) {
            return false;
        }

        ListCryptoAssessmentsRequest other = (ListCryptoAssessmentsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.accessLevel, other.accessLevel)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.assessmentId, other.assessmentId)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.targetIds, other.targetIds)
                && java.util.Objects.equals(this.targetDatabaseGroupId, other.targetDatabaseGroupId)
                && java.util.Objects.equals(this.targetType, other.targetType)
                && java.util.Objects.equals(this.postureCategory, other.postureCategory)
                && java.util.Objects.equals(this.isAssessmentScheduled, other.isAssessmentScheduled)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page);
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
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.assessmentId == null ? 43 : this.assessmentId.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.targetIds == null ? 43 : this.targetIds.hashCode());
        result =
                (result * PRIME)
                        + (this.targetDatabaseGroupId == null
                                ? 43
                                : this.targetDatabaseGroupId.hashCode());
        result = (result * PRIME) + (this.targetType == null ? 43 : this.targetType.hashCode());
        result =
                (result * PRIME)
                        + (this.postureCategory == null ? 43 : this.postureCategory.hashCode());
        result =
                (result * PRIME)
                        + (this.isAssessmentScheduled == null
                                ? 43
                                : this.isAssessmentScheduled.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        return result;
    }
}
