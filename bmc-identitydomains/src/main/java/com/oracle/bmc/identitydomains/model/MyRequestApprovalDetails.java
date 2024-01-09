/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Approvals created for this request. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MyRequestApprovalDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MyRequestApprovalDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "approverId",
        "approverDisplayName",
        "justification",
        "status",
        "order",
        "approvalType",
        "timeUpdated"
    })
    public MyRequestApprovalDetails(
            String approverId,
            String approverDisplayName,
            String justification,
            String status,
            Integer order,
            String approvalType,
            String timeUpdated) {
        super();
        this.approverId = approverId;
        this.approverDisplayName = approverDisplayName;
        this.justification = justification;
        this.status = status;
        this.order = order;
        this.approvalType = approvalType;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Approver Id
         *
         * <p>*Added In:** 2307071836
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - returned: default
         * - type: string - uniqueness: none - mutability: readOnly
         */
        @com.fasterxml.jackson.annotation.JsonProperty("approverId")
        private String approverId;

        /**
         * Approver Id
         *
         * <p>*Added In:** 2307071836
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - returned: default
         * - type: string - uniqueness: none - mutability: readOnly
         *
         * @param approverId the value to set
         * @return this builder
         */
        public Builder approverId(String approverId) {
            this.approverId = approverId;
            this.__explicitlySet__.add("approverId");
            return this;
        }
        /**
         * Approver display name
         *
         * <p>*Added In:** 2307071836
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - returned: default
         * - type: string - uniqueness: none - mutability: readOnly
         */
        @com.fasterxml.jackson.annotation.JsonProperty("approverDisplayName")
        private String approverDisplayName;

        /**
         * Approver display name
         *
         * <p>*Added In:** 2307071836
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - returned: default
         * - type: string - uniqueness: none - mutability: readOnly
         *
         * @param approverDisplayName the value to set
         * @return this builder
         */
        public Builder approverDisplayName(String approverDisplayName) {
            this.approverDisplayName = approverDisplayName;
            this.__explicitlySet__.add("approverDisplayName");
            return this;
        }
        /**
         * Approval Justification
         *
         * <p>*Added In:** 2307071836
         *
         * <p>*SCIM++ Properties:** - multiValued: false - idcsSearchable: false - returned: default
         * - type: string - uniqueness: none - mutability: readOnly
         */
        @com.fasterxml.jackson.annotation.JsonProperty("justification")
        private String justification;

        /**
         * Approval Justification
         *
         * <p>*Added In:** 2307071836
         *
         * <p>*SCIM++ Properties:** - multiValued: false - idcsSearchable: false - returned: default
         * - type: string - uniqueness: none - mutability: readOnly
         *
         * @param justification the value to set
         * @return this builder
         */
        public Builder justification(String justification) {
            this.justification = justification;
            this.__explicitlySet__.add("justification");
            return this;
        }
        /**
         * Approval Status
         *
         * <p>*Added In:** 2307071836
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - returned: default
         * - type: string - uniqueness: none - mutability: readOnly
         */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * Approval Status
         *
         * <p>*Added In:** 2307071836
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - returned: default
         * - type: string - uniqueness: none - mutability: readOnly
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Approval Order
         *
         * <p>*Added In:** 2307071836
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - returned: default
         * - type: integer - uniqueness: none - mutability: readOnly
         */
        @com.fasterxml.jackson.annotation.JsonProperty("order")
        private Integer order;

        /**
         * Approval Order
         *
         * <p>*Added In:** 2307071836
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - returned: default
         * - type: integer - uniqueness: none - mutability: readOnly
         *
         * @param order the value to set
         * @return this builder
         */
        public Builder order(Integer order) {
            this.order = order;
            this.__explicitlySet__.add("order");
            return this;
        }
        /**
         * Approval Type (Escalation or Regular)
         *
         * <p>*Added In:** 2307071836
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - returned: default
         * - type: string - uniqueness: none - mutability: readOnly
         */
        @com.fasterxml.jackson.annotation.JsonProperty("approvalType")
        private String approvalType;

        /**
         * Approval Type (Escalation or Regular)
         *
         * <p>*Added In:** 2307071836
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - returned: default
         * - type: string - uniqueness: none - mutability: readOnly
         *
         * @param approvalType the value to set
         * @return this builder
         */
        public Builder approvalType(String approvalType) {
            this.approvalType = approvalType;
            this.__explicitlySet__.add("approvalType");
            return this;
        }
        /**
         * Approval Update Time
         *
         * <p>*Added In:** 2307071836
         *
         * <p>*SCIM++ Properties:** - multiValued: false - idcsSearchable: false - returned: default
         * - type: dateTime - uniqueness: none - mutability: readOnly
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private String timeUpdated;

        /**
         * Approval Update Time
         *
         * <p>*Added In:** 2307071836
         *
         * <p>*SCIM++ Properties:** - multiValued: false - idcsSearchable: false - returned: default
         * - type: dateTime - uniqueness: none - mutability: readOnly
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(String timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MyRequestApprovalDetails build() {
            MyRequestApprovalDetails model =
                    new MyRequestApprovalDetails(
                            this.approverId,
                            this.approverDisplayName,
                            this.justification,
                            this.status,
                            this.order,
                            this.approvalType,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MyRequestApprovalDetails model) {
            if (model.wasPropertyExplicitlySet("approverId")) {
                this.approverId(model.getApproverId());
            }
            if (model.wasPropertyExplicitlySet("approverDisplayName")) {
                this.approverDisplayName(model.getApproverDisplayName());
            }
            if (model.wasPropertyExplicitlySet("justification")) {
                this.justification(model.getJustification());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("order")) {
                this.order(model.getOrder());
            }
            if (model.wasPropertyExplicitlySet("approvalType")) {
                this.approvalType(model.getApprovalType());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Approver Id
     *
     * <p>*Added In:** 2307071836
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - returned: default -
     * type: string - uniqueness: none - mutability: readOnly
     */
    @com.fasterxml.jackson.annotation.JsonProperty("approverId")
    private final String approverId;

    /**
     * Approver Id
     *
     * <p>*Added In:** 2307071836
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - returned: default -
     * type: string - uniqueness: none - mutability: readOnly
     *
     * @return the value
     */
    public String getApproverId() {
        return approverId;
    }

    /**
     * Approver display name
     *
     * <p>*Added In:** 2307071836
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - returned: default -
     * type: string - uniqueness: none - mutability: readOnly
     */
    @com.fasterxml.jackson.annotation.JsonProperty("approverDisplayName")
    private final String approverDisplayName;

    /**
     * Approver display name
     *
     * <p>*Added In:** 2307071836
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - returned: default -
     * type: string - uniqueness: none - mutability: readOnly
     *
     * @return the value
     */
    public String getApproverDisplayName() {
        return approverDisplayName;
    }

    /**
     * Approval Justification
     *
     * <p>*Added In:** 2307071836
     *
     * <p>*SCIM++ Properties:** - multiValued: false - idcsSearchable: false - returned: default -
     * type: string - uniqueness: none - mutability: readOnly
     */
    @com.fasterxml.jackson.annotation.JsonProperty("justification")
    private final String justification;

    /**
     * Approval Justification
     *
     * <p>*Added In:** 2307071836
     *
     * <p>*SCIM++ Properties:** - multiValued: false - idcsSearchable: false - returned: default -
     * type: string - uniqueness: none - mutability: readOnly
     *
     * @return the value
     */
    public String getJustification() {
        return justification;
    }

    /**
     * Approval Status
     *
     * <p>*Added In:** 2307071836
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - returned: default -
     * type: string - uniqueness: none - mutability: readOnly
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * Approval Status
     *
     * <p>*Added In:** 2307071836
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - returned: default -
     * type: string - uniqueness: none - mutability: readOnly
     *
     * @return the value
     */
    public String getStatus() {
        return status;
    }

    /**
     * Approval Order
     *
     * <p>*Added In:** 2307071836
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - returned: default -
     * type: integer - uniqueness: none - mutability: readOnly
     */
    @com.fasterxml.jackson.annotation.JsonProperty("order")
    private final Integer order;

    /**
     * Approval Order
     *
     * <p>*Added In:** 2307071836
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - returned: default -
     * type: integer - uniqueness: none - mutability: readOnly
     *
     * @return the value
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * Approval Type (Escalation or Regular)
     *
     * <p>*Added In:** 2307071836
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - returned: default -
     * type: string - uniqueness: none - mutability: readOnly
     */
    @com.fasterxml.jackson.annotation.JsonProperty("approvalType")
    private final String approvalType;

    /**
     * Approval Type (Escalation or Regular)
     *
     * <p>*Added In:** 2307071836
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - returned: default -
     * type: string - uniqueness: none - mutability: readOnly
     *
     * @return the value
     */
    public String getApprovalType() {
        return approvalType;
    }

    /**
     * Approval Update Time
     *
     * <p>*Added In:** 2307071836
     *
     * <p>*SCIM++ Properties:** - multiValued: false - idcsSearchable: false - returned: default -
     * type: dateTime - uniqueness: none - mutability: readOnly
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final String timeUpdated;

    /**
     * Approval Update Time
     *
     * <p>*Added In:** 2307071836
     *
     * <p>*SCIM++ Properties:** - multiValued: false - idcsSearchable: false - returned: default -
     * type: dateTime - uniqueness: none - mutability: readOnly
     *
     * @return the value
     */
    public String getTimeUpdated() {
        return timeUpdated;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MyRequestApprovalDetails(");
        sb.append("super=").append(super.toString());
        sb.append("approverId=").append(String.valueOf(this.approverId));
        sb.append(", approverDisplayName=").append(String.valueOf(this.approverDisplayName));
        sb.append(", justification=").append(String.valueOf(this.justification));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", order=").append(String.valueOf(this.order));
        sb.append(", approvalType=").append(String.valueOf(this.approvalType));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MyRequestApprovalDetails)) {
            return false;
        }

        MyRequestApprovalDetails other = (MyRequestApprovalDetails) o;
        return java.util.Objects.equals(this.approverId, other.approverId)
                && java.util.Objects.equals(this.approverDisplayName, other.approverDisplayName)
                && java.util.Objects.equals(this.justification, other.justification)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.order, other.order)
                && java.util.Objects.equals(this.approvalType, other.approvalType)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.approverId == null ? 43 : this.approverId.hashCode());
        result =
                (result * PRIME)
                        + (this.approverDisplayName == null
                                ? 43
                                : this.approverDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.justification == null ? 43 : this.justification.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.order == null ? 43 : this.order.hashCode());
        result = (result * PRIME) + (this.approvalType == null ? 43 : this.approvalType.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
