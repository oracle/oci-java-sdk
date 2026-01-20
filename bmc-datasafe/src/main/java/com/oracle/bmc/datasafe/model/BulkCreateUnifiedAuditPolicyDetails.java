/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The details required to bulk create unified audit policies. <br>
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
        builder = BulkCreateUnifiedAuditPolicyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BulkCreateUnifiedAuditPolicyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "securityPolicyId",
        "targetId",
        "unifiedAuditPolicyDefinitionIds",
        "policyNames",
        "compartmentId",
        "shouldPreserveCasing"
    })
    public BulkCreateUnifiedAuditPolicyDetails(
            String securityPolicyId,
            String targetId,
            java.util.List<String> unifiedAuditPolicyDefinitionIds,
            java.util.List<String> policyNames,
            String compartmentId,
            Boolean shouldPreserveCasing) {
        super();
        this.securityPolicyId = securityPolicyId;
        this.targetId = targetId;
        this.unifiedAuditPolicyDefinitionIds = unifiedAuditPolicyDefinitionIds;
        this.policyNames = policyNames;
        this.compartmentId = compartmentId;
        this.shouldPreserveCasing = shouldPreserveCasing;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the security policy corresponding to the unified audit policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("securityPolicyId")
        private String securityPolicyId;

        /**
         * The OCID of the security policy corresponding to the unified audit policy.
         *
         * @param securityPolicyId the value to set
         * @return this builder
         */
        public Builder securityPolicyId(String securityPolicyId) {
            this.securityPolicyId = securityPolicyId;
            this.__explicitlySet__.add("securityPolicyId");
            return this;
        }
        /** The OCID of the target database. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the target database.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /**
         * The list of unified audit policy definition ocids. If unified audit policy definition ids
         * are provided, the imported audit policy will be associated to the specified unified audit
         * policy definition based on the policy name. Else, for every audit policy that gets
         * imported, a new unified audit policy definition will be created.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("unifiedAuditPolicyDefinitionIds")
        private java.util.List<String> unifiedAuditPolicyDefinitionIds;

        /**
         * The list of unified audit policy definition ocids. If unified audit policy definition ids
         * are provided, the imported audit policy will be associated to the specified unified audit
         * policy definition based on the policy name. Else, for every audit policy that gets
         * imported, a new unified audit policy definition will be created.
         *
         * @param unifiedAuditPolicyDefinitionIds the value to set
         * @return this builder
         */
        public Builder unifiedAuditPolicyDefinitionIds(
                java.util.List<String> unifiedAuditPolicyDefinitionIds) {
            this.unifiedAuditPolicyDefinitionIds = unifiedAuditPolicyDefinitionIds;
            this.__explicitlySet__.add("unifiedAuditPolicyDefinitionIds");
            return this;
        }
        /** The list of unified audit policy names to be imported. */
        @com.fasterxml.jackson.annotation.JsonProperty("policyNames")
        private java.util.List<String> policyNames;

        /**
         * The list of unified audit policy names to be imported.
         *
         * @param policyNames the value to set
         * @return this builder
         */
        public Builder policyNames(java.util.List<String> policyNames) {
            this.policyNames = policyNames;
            this.__explicitlySet__.add("policyNames");
            return this;
        }
        /** The OCID of the compartment in which to create the unified audit policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment in which to create the unified audit policy.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Indicates whether the casing of the policy names provided in the request payload should
         * be preserved during creation. By default all policy names will be converted to upper
         * case.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldPreserveCasing")
        private Boolean shouldPreserveCasing;

        /**
         * Indicates whether the casing of the policy names provided in the request payload should
         * be preserved during creation. By default all policy names will be converted to upper
         * case.
         *
         * @param shouldPreserveCasing the value to set
         * @return this builder
         */
        public Builder shouldPreserveCasing(Boolean shouldPreserveCasing) {
            this.shouldPreserveCasing = shouldPreserveCasing;
            this.__explicitlySet__.add("shouldPreserveCasing");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkCreateUnifiedAuditPolicyDetails build() {
            BulkCreateUnifiedAuditPolicyDetails model =
                    new BulkCreateUnifiedAuditPolicyDetails(
                            this.securityPolicyId,
                            this.targetId,
                            this.unifiedAuditPolicyDefinitionIds,
                            this.policyNames,
                            this.compartmentId,
                            this.shouldPreserveCasing);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkCreateUnifiedAuditPolicyDetails model) {
            if (model.wasPropertyExplicitlySet("securityPolicyId")) {
                this.securityPolicyId(model.getSecurityPolicyId());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("unifiedAuditPolicyDefinitionIds")) {
                this.unifiedAuditPolicyDefinitionIds(model.getUnifiedAuditPolicyDefinitionIds());
            }
            if (model.wasPropertyExplicitlySet("policyNames")) {
                this.policyNames(model.getPolicyNames());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("shouldPreserveCasing")) {
                this.shouldPreserveCasing(model.getShouldPreserveCasing());
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

    /** The OCID of the security policy corresponding to the unified audit policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("securityPolicyId")
    private final String securityPolicyId;

    /**
     * The OCID of the security policy corresponding to the unified audit policy.
     *
     * @return the value
     */
    public String getSecurityPolicyId() {
        return securityPolicyId;
    }

    /** The OCID of the target database. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the target database.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * The list of unified audit policy definition ocids. If unified audit policy definition ids are
     * provided, the imported audit policy will be associated to the specified unified audit policy
     * definition based on the policy name. Else, for every audit policy that gets imported, a new
     * unified audit policy definition will be created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("unifiedAuditPolicyDefinitionIds")
    private final java.util.List<String> unifiedAuditPolicyDefinitionIds;

    /**
     * The list of unified audit policy definition ocids. If unified audit policy definition ids are
     * provided, the imported audit policy will be associated to the specified unified audit policy
     * definition based on the policy name. Else, for every audit policy that gets imported, a new
     * unified audit policy definition will be created.
     *
     * @return the value
     */
    public java.util.List<String> getUnifiedAuditPolicyDefinitionIds() {
        return unifiedAuditPolicyDefinitionIds;
    }

    /** The list of unified audit policy names to be imported. */
    @com.fasterxml.jackson.annotation.JsonProperty("policyNames")
    private final java.util.List<String> policyNames;

    /**
     * The list of unified audit policy names to be imported.
     *
     * @return the value
     */
    public java.util.List<String> getPolicyNames() {
        return policyNames;
    }

    /** The OCID of the compartment in which to create the unified audit policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment in which to create the unified audit policy.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Indicates whether the casing of the policy names provided in the request payload should be
     * preserved during creation. By default all policy names will be converted to upper case.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldPreserveCasing")
    private final Boolean shouldPreserveCasing;

    /**
     * Indicates whether the casing of the policy names provided in the request payload should be
     * preserved during creation. By default all policy names will be converted to upper case.
     *
     * @return the value
     */
    public Boolean getShouldPreserveCasing() {
        return shouldPreserveCasing;
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
        sb.append("BulkCreateUnifiedAuditPolicyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("securityPolicyId=").append(String.valueOf(this.securityPolicyId));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", unifiedAuditPolicyDefinitionIds=")
                .append(String.valueOf(this.unifiedAuditPolicyDefinitionIds));
        sb.append(", policyNames=").append(String.valueOf(this.policyNames));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", shouldPreserveCasing=").append(String.valueOf(this.shouldPreserveCasing));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkCreateUnifiedAuditPolicyDetails)) {
            return false;
        }

        BulkCreateUnifiedAuditPolicyDetails other = (BulkCreateUnifiedAuditPolicyDetails) o;
        return java.util.Objects.equals(this.securityPolicyId, other.securityPolicyId)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(
                        this.unifiedAuditPolicyDefinitionIds, other.unifiedAuditPolicyDefinitionIds)
                && java.util.Objects.equals(this.policyNames, other.policyNames)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.shouldPreserveCasing, other.shouldPreserveCasing)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.securityPolicyId == null ? 43 : this.securityPolicyId.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result =
                (result * PRIME)
                        + (this.unifiedAuditPolicyDefinitionIds == null
                                ? 43
                                : this.unifiedAuditPolicyDefinitionIds.hashCode());
        result = (result * PRIME) + (this.policyNames == null ? 43 : this.policyNames.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldPreserveCasing == null
                                ? 43
                                : this.shouldPreserveCasing.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
