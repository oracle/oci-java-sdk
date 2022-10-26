/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details of aggregation dimensions used for summarizing audit policies. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AuditPolicyDimensions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class AuditPolicyDimensions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"auditPolicyCategory", "auditPolicyName"})
    public AuditPolicyDimensions(AuditPolicyCategory auditPolicyCategory, String auditPolicyName) {
        super();
        this.auditPolicyCategory = auditPolicyCategory;
        this.auditPolicyName = auditPolicyName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The category to which the audit policy belongs. */
        @com.fasterxml.jackson.annotation.JsonProperty("auditPolicyCategory")
        private AuditPolicyCategory auditPolicyCategory;

        /**
         * The category to which the audit policy belongs.
         *
         * @param auditPolicyCategory the value to set
         * @return this builder
         */
        public Builder auditPolicyCategory(AuditPolicyCategory auditPolicyCategory) {
            this.auditPolicyCategory = auditPolicyCategory;
            this.__explicitlySet__.add("auditPolicyCategory");
            return this;
        }
        /**
         * Indicates the audit policy name. Refer to the
         * [documentation](https://docs.oracle.com/en/cloud/paas/data-safe/udscs/audit-policies.html#GUID-361A9A9A-7C21-4F5A-8945-9B3A0C472827)
         * for seeded audit policy names. For custom policies, refer to the user-defined policy name
         * created in the target database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("auditPolicyName")
        private String auditPolicyName;

        /**
         * Indicates the audit policy name. Refer to the
         * [documentation](https://docs.oracle.com/en/cloud/paas/data-safe/udscs/audit-policies.html#GUID-361A9A9A-7C21-4F5A-8945-9B3A0C472827)
         * for seeded audit policy names. For custom policies, refer to the user-defined policy name
         * created in the target database.
         *
         * @param auditPolicyName the value to set
         * @return this builder
         */
        public Builder auditPolicyName(String auditPolicyName) {
            this.auditPolicyName = auditPolicyName;
            this.__explicitlySet__.add("auditPolicyName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuditPolicyDimensions build() {
            AuditPolicyDimensions model =
                    new AuditPolicyDimensions(this.auditPolicyCategory, this.auditPolicyName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuditPolicyDimensions model) {
            if (model.wasPropertyExplicitlySet("auditPolicyCategory")) {
                this.auditPolicyCategory(model.getAuditPolicyCategory());
            }
            if (model.wasPropertyExplicitlySet("auditPolicyName")) {
                this.auditPolicyName(model.getAuditPolicyName());
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

    /** The category to which the audit policy belongs. */
    @com.fasterxml.jackson.annotation.JsonProperty("auditPolicyCategory")
    private final AuditPolicyCategory auditPolicyCategory;

    /**
     * The category to which the audit policy belongs.
     *
     * @return the value
     */
    public AuditPolicyCategory getAuditPolicyCategory() {
        return auditPolicyCategory;
    }

    /**
     * Indicates the audit policy name. Refer to the
     * [documentation](https://docs.oracle.com/en/cloud/paas/data-safe/udscs/audit-policies.html#GUID-361A9A9A-7C21-4F5A-8945-9B3A0C472827)
     * for seeded audit policy names. For custom policies, refer to the user-defined policy name
     * created in the target database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("auditPolicyName")
    private final String auditPolicyName;

    /**
     * Indicates the audit policy name. Refer to the
     * [documentation](https://docs.oracle.com/en/cloud/paas/data-safe/udscs/audit-policies.html#GUID-361A9A9A-7C21-4F5A-8945-9B3A0C472827)
     * for seeded audit policy names. For custom policies, refer to the user-defined policy name
     * created in the target database.
     *
     * @return the value
     */
    public String getAuditPolicyName() {
        return auditPolicyName;
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
        sb.append("AuditPolicyDimensions(");
        sb.append("super=").append(super.toString());
        sb.append("auditPolicyCategory=").append(String.valueOf(this.auditPolicyCategory));
        sb.append(", auditPolicyName=").append(String.valueOf(this.auditPolicyName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuditPolicyDimensions)) {
            return false;
        }

        AuditPolicyDimensions other = (AuditPolicyDimensions) o;
        return java.util.Objects.equals(this.auditPolicyCategory, other.auditPolicyCategory)
                && java.util.Objects.equals(this.auditPolicyName, other.auditPolicyName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.auditPolicyCategory == null
                                ? 43
                                : this.auditPolicyCategory.hashCode());
        result =
                (result * PRIME)
                        + (this.auditPolicyName == null ? 43 : this.auditPolicyName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
