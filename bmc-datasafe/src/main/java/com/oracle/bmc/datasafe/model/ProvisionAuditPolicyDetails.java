/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details for audit policy provisioning. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ProvisionAuditPolicyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ProvisionAuditPolicyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isDataSafeServiceAccountExcluded",
        "provisionAuditConditions"
    })
    public ProvisionAuditPolicyDetails(
            Boolean isDataSafeServiceAccountExcluded,
            java.util.List<ProvisionAuditConditions> provisionAuditConditions) {
        super();
        this.isDataSafeServiceAccountExcluded = isDataSafeServiceAccountExcluded;
        this.provisionAuditConditions = provisionAuditConditions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Option provided to users at the target to indicate whether the Data Safe service account
         * has to be excluded while provisioning the audit policies.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isDataSafeServiceAccountExcluded")
        private Boolean isDataSafeServiceAccountExcluded;

        /**
         * Option provided to users at the target to indicate whether the Data Safe service account
         * has to be excluded while provisioning the audit policies.
         *
         * @param isDataSafeServiceAccountExcluded the value to set
         * @return this builder
         */
        public Builder isDataSafeServiceAccountExcluded(Boolean isDataSafeServiceAccountExcluded) {
            this.isDataSafeServiceAccountExcluded = isDataSafeServiceAccountExcluded;
            this.__explicitlySet__.add("isDataSafeServiceAccountExcluded");
            return this;
        }
        /** The audit policy details for provisioning. */
        @com.fasterxml.jackson.annotation.JsonProperty("provisionAuditConditions")
        private java.util.List<ProvisionAuditConditions> provisionAuditConditions;

        /**
         * The audit policy details for provisioning.
         *
         * @param provisionAuditConditions the value to set
         * @return this builder
         */
        public Builder provisionAuditConditions(
                java.util.List<ProvisionAuditConditions> provisionAuditConditions) {
            this.provisionAuditConditions = provisionAuditConditions;
            this.__explicitlySet__.add("provisionAuditConditions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProvisionAuditPolicyDetails build() {
            ProvisionAuditPolicyDetails model =
                    new ProvisionAuditPolicyDetails(
                            this.isDataSafeServiceAccountExcluded, this.provisionAuditConditions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProvisionAuditPolicyDetails model) {
            if (model.wasPropertyExplicitlySet("isDataSafeServiceAccountExcluded")) {
                this.isDataSafeServiceAccountExcluded(model.getIsDataSafeServiceAccountExcluded());
            }
            if (model.wasPropertyExplicitlySet("provisionAuditConditions")) {
                this.provisionAuditConditions(model.getProvisionAuditConditions());
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
     * Option provided to users at the target to indicate whether the Data Safe service account has
     * to be excluded while provisioning the audit policies.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isDataSafeServiceAccountExcluded")
    private final Boolean isDataSafeServiceAccountExcluded;

    /**
     * Option provided to users at the target to indicate whether the Data Safe service account has
     * to be excluded while provisioning the audit policies.
     *
     * @return the value
     */
    public Boolean getIsDataSafeServiceAccountExcluded() {
        return isDataSafeServiceAccountExcluded;
    }

    /** The audit policy details for provisioning. */
    @com.fasterxml.jackson.annotation.JsonProperty("provisionAuditConditions")
    private final java.util.List<ProvisionAuditConditions> provisionAuditConditions;

    /**
     * The audit policy details for provisioning.
     *
     * @return the value
     */
    public java.util.List<ProvisionAuditConditions> getProvisionAuditConditions() {
        return provisionAuditConditions;
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
        sb.append("ProvisionAuditPolicyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isDataSafeServiceAccountExcluded=")
                .append(String.valueOf(this.isDataSafeServiceAccountExcluded));
        sb.append(", provisionAuditConditions=")
                .append(String.valueOf(this.provisionAuditConditions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProvisionAuditPolicyDetails)) {
            return false;
        }

        ProvisionAuditPolicyDetails other = (ProvisionAuditPolicyDetails) o;
        return java.util.Objects.equals(
                        this.isDataSafeServiceAccountExcluded,
                        other.isDataSafeServiceAccountExcluded)
                && java.util.Objects.equals(
                        this.provisionAuditConditions, other.provisionAuditConditions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isDataSafeServiceAccountExcluded == null
                                ? 43
                                : this.isDataSafeServiceAccountExcluded.hashCode());
        result =
                (result * PRIME)
                        + (this.provisionAuditConditions == null
                                ? 43
                                : this.provisionAuditConditions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
