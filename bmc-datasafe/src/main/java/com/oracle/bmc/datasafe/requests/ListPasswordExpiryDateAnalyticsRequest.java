/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListPasswordExpiryDateAnalyticsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListPasswordExpiryDateAnalyticsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListPasswordExpiryDateAnalyticsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the user assessment.
     */
    private String userAssessmentId;

    /**
     * The OCID of the user assessment.
     */
    public String getUserAssessmentId() {
        return userAssessmentId;
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
     * A filter to return only items that match the specified user category.
     */
    private String userCategory;

    /**
     * A filter to return only items that match the specified user category.
     */
    public String getUserCategory() {
        return userCategory;
    }
    /**
     * A filter to return users whose password expiry date in the database is less than the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * **Example:** 2016-12-19T16:39:57.600Z
     *
     */
    private java.util.Date timePasswordExpiryLessThan;

    /**
     * A filter to return users whose password expiry date in the database is less than the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * **Example:** 2016-12-19T16:39:57.600Z
     *
     */
    public java.util.Date getTimePasswordExpiryLessThan() {
        return timePasswordExpiryLessThan;
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
                    ListPasswordExpiryDateAnalyticsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the user assessment.
         */
        private String userAssessmentId = null;

        /**
         * The OCID of the user assessment.
         * @param userAssessmentId the value to set
         * @return this builder instance
         */
        public Builder userAssessmentId(String userAssessmentId) {
            this.userAssessmentId = userAssessmentId;
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
         * A filter to return only items that match the specified user category.
         */
        private String userCategory = null;

        /**
         * A filter to return only items that match the specified user category.
         * @param userCategory the value to set
         * @return this builder instance
         */
        public Builder userCategory(String userCategory) {
            this.userCategory = userCategory;
            return this;
        }

        /**
         * A filter to return users whose password expiry date in the database is less than the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * **Example:** 2016-12-19T16:39:57.600Z
         *
         */
        private java.util.Date timePasswordExpiryLessThan = null;

        /**
         * A filter to return users whose password expiry date in the database is less than the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * **Example:** 2016-12-19T16:39:57.600Z
         *
         * @param timePasswordExpiryLessThan the value to set
         * @return this builder instance
         */
        public Builder timePasswordExpiryLessThan(java.util.Date timePasswordExpiryLessThan) {
            this.timePasswordExpiryLessThan = timePasswordExpiryLessThan;
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
        public Builder copy(ListPasswordExpiryDateAnalyticsRequest o) {
            userAssessmentId(o.getUserAssessmentId());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            accessLevel(o.getAccessLevel());
            userCategory(o.getUserCategory());
            timePasswordExpiryLessThan(o.getTimePasswordExpiryLessThan());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListPasswordExpiryDateAnalyticsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListPasswordExpiryDateAnalyticsRequest
         */
        public ListPasswordExpiryDateAnalyticsRequest build() {
            ListPasswordExpiryDateAnalyticsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListPasswordExpiryDateAnalyticsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListPasswordExpiryDateAnalyticsRequest
         */
        public ListPasswordExpiryDateAnalyticsRequest buildWithoutInvocationCallback() {
            ListPasswordExpiryDateAnalyticsRequest request =
                    new ListPasswordExpiryDateAnalyticsRequest();
            request.userAssessmentId = userAssessmentId;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.accessLevel = accessLevel;
            request.userCategory = userCategory;
            request.timePasswordExpiryLessThan = timePasswordExpiryLessThan;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListPasswordExpiryDateAnalyticsRequest(userAssessmentId, compartmentIdInSubtree, accessLevel, userCategory, timePasswordExpiryLessThan, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .userAssessmentId(userAssessmentId)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .accessLevel(accessLevel)
                .userCategory(userCategory)
                .timePasswordExpiryLessThan(timePasswordExpiryLessThan)
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
        sb.append(",userAssessmentId=").append(String.valueOf(this.userAssessmentId));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",accessLevel=").append(String.valueOf(this.accessLevel));
        sb.append(",userCategory=").append(String.valueOf(this.userCategory));
        sb.append(",timePasswordExpiryLessThan=")
                .append(String.valueOf(this.timePasswordExpiryLessThan));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListPasswordExpiryDateAnalyticsRequest)) {
            return false;
        }

        ListPasswordExpiryDateAnalyticsRequest other = (ListPasswordExpiryDateAnalyticsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.userAssessmentId, other.userAssessmentId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.accessLevel, other.accessLevel)
                && java.util.Objects.equals(this.userCategory, other.userCategory)
                && java.util.Objects.equals(
                        this.timePasswordExpiryLessThan, other.timePasswordExpiryLessThan)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.userAssessmentId == null ? 43 : this.userAssessmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result = (result * PRIME) + (this.accessLevel == null ? 43 : this.accessLevel.hashCode());
        result = (result * PRIME) + (this.userCategory == null ? 43 : this.userCategory.hashCode());
        result =
                (result * PRIME)
                        + (this.timePasswordExpiryLessThan == null
                                ? 43
                                : this.timePasswordExpiryLessThan.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
