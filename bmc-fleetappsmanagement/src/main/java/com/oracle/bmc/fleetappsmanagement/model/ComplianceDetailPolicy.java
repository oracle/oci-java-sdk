/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Details of the Policy associated <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ComplianceDetailPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComplianceDetailPolicy
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compliancePolicyId",
        "compliancePolicyDisplayName",
        "compliancePolicyRuleId",
        "compliancePolicyRuleDisplayName",
        "gracePeriod",
        "patchSelection"
    })
    public ComplianceDetailPolicy(
            String compliancePolicyId,
            String compliancePolicyDisplayName,
            String compliancePolicyRuleId,
            String compliancePolicyRuleDisplayName,
            String gracePeriod,
            PatchSelectionDetails patchSelection) {
        super();
        this.compliancePolicyId = compliancePolicyId;
        this.compliancePolicyDisplayName = compliancePolicyDisplayName;
        this.compliancePolicyRuleId = compliancePolicyRuleId;
        this.compliancePolicyRuleDisplayName = compliancePolicyRuleDisplayName;
        this.gracePeriod = gracePeriod;
        this.patchSelection = patchSelection;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Compliance Policy Id */
        @com.fasterxml.jackson.annotation.JsonProperty("compliancePolicyId")
        private String compliancePolicyId;

        /**
         * Compliance Policy Id
         *
         * @param compliancePolicyId the value to set
         * @return this builder
         */
        public Builder compliancePolicyId(String compliancePolicyId) {
            this.compliancePolicyId = compliancePolicyId;
            this.__explicitlySet__.add("compliancePolicyId");
            return this;
        }
        /** Compliane Policy DisplayName */
        @com.fasterxml.jackson.annotation.JsonProperty("compliancePolicyDisplayName")
        private String compliancePolicyDisplayName;

        /**
         * Compliane Policy DisplayName
         *
         * @param compliancePolicyDisplayName the value to set
         * @return this builder
         */
        public Builder compliancePolicyDisplayName(String compliancePolicyDisplayName) {
            this.compliancePolicyDisplayName = compliancePolicyDisplayName;
            this.__explicitlySet__.add("compliancePolicyDisplayName");
            return this;
        }
        /** Compliane Policy Rule Id */
        @com.fasterxml.jackson.annotation.JsonProperty("compliancePolicyRuleId")
        private String compliancePolicyRuleId;

        /**
         * Compliane Policy Rule Id
         *
         * @param compliancePolicyRuleId the value to set
         * @return this builder
         */
        public Builder compliancePolicyRuleId(String compliancePolicyRuleId) {
            this.compliancePolicyRuleId = compliancePolicyRuleId;
            this.__explicitlySet__.add("compliancePolicyRuleId");
            return this;
        }
        /** Product Name */
        @com.fasterxml.jackson.annotation.JsonProperty("compliancePolicyRuleDisplayName")
        private String compliancePolicyRuleDisplayName;

        /**
         * Product Name
         *
         * @param compliancePolicyRuleDisplayName the value to set
         * @return this builder
         */
        public Builder compliancePolicyRuleDisplayName(String compliancePolicyRuleDisplayName) {
            this.compliancePolicyRuleDisplayName = compliancePolicyRuleDisplayName;
            this.__explicitlySet__.add("compliancePolicyRuleDisplayName");
            return this;
        }
        /** Grace period in days,weeks,months or years the exemption is applicable for the rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("gracePeriod")
        private String gracePeriod;

        /**
         * Grace period in days,weeks,months or years the exemption is applicable for the rule.
         *
         * @param gracePeriod the value to set
         * @return this builder
         */
        public Builder gracePeriod(String gracePeriod) {
            this.gracePeriod = gracePeriod;
            this.__explicitlySet__.add("gracePeriod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patchSelection")
        private PatchSelectionDetails patchSelection;

        public Builder patchSelection(PatchSelectionDetails patchSelection) {
            this.patchSelection = patchSelection;
            this.__explicitlySet__.add("patchSelection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComplianceDetailPolicy build() {
            ComplianceDetailPolicy model =
                    new ComplianceDetailPolicy(
                            this.compliancePolicyId,
                            this.compliancePolicyDisplayName,
                            this.compliancePolicyRuleId,
                            this.compliancePolicyRuleDisplayName,
                            this.gracePeriod,
                            this.patchSelection);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComplianceDetailPolicy model) {
            if (model.wasPropertyExplicitlySet("compliancePolicyId")) {
                this.compliancePolicyId(model.getCompliancePolicyId());
            }
            if (model.wasPropertyExplicitlySet("compliancePolicyDisplayName")) {
                this.compliancePolicyDisplayName(model.getCompliancePolicyDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compliancePolicyRuleId")) {
                this.compliancePolicyRuleId(model.getCompliancePolicyRuleId());
            }
            if (model.wasPropertyExplicitlySet("compliancePolicyRuleDisplayName")) {
                this.compliancePolicyRuleDisplayName(model.getCompliancePolicyRuleDisplayName());
            }
            if (model.wasPropertyExplicitlySet("gracePeriod")) {
                this.gracePeriod(model.getGracePeriod());
            }
            if (model.wasPropertyExplicitlySet("patchSelection")) {
                this.patchSelection(model.getPatchSelection());
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

    /** Compliance Policy Id */
    @com.fasterxml.jackson.annotation.JsonProperty("compliancePolicyId")
    private final String compliancePolicyId;

    /**
     * Compliance Policy Id
     *
     * @return the value
     */
    public String getCompliancePolicyId() {
        return compliancePolicyId;
    }

    /** Compliane Policy DisplayName */
    @com.fasterxml.jackson.annotation.JsonProperty("compliancePolicyDisplayName")
    private final String compliancePolicyDisplayName;

    /**
     * Compliane Policy DisplayName
     *
     * @return the value
     */
    public String getCompliancePolicyDisplayName() {
        return compliancePolicyDisplayName;
    }

    /** Compliane Policy Rule Id */
    @com.fasterxml.jackson.annotation.JsonProperty("compliancePolicyRuleId")
    private final String compliancePolicyRuleId;

    /**
     * Compliane Policy Rule Id
     *
     * @return the value
     */
    public String getCompliancePolicyRuleId() {
        return compliancePolicyRuleId;
    }

    /** Product Name */
    @com.fasterxml.jackson.annotation.JsonProperty("compliancePolicyRuleDisplayName")
    private final String compliancePolicyRuleDisplayName;

    /**
     * Product Name
     *
     * @return the value
     */
    public String getCompliancePolicyRuleDisplayName() {
        return compliancePolicyRuleDisplayName;
    }

    /** Grace period in days,weeks,months or years the exemption is applicable for the rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("gracePeriod")
    private final String gracePeriod;

    /**
     * Grace period in days,weeks,months or years the exemption is applicable for the rule.
     *
     * @return the value
     */
    public String getGracePeriod() {
        return gracePeriod;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("patchSelection")
    private final PatchSelectionDetails patchSelection;

    public PatchSelectionDetails getPatchSelection() {
        return patchSelection;
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
        sb.append("ComplianceDetailPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("compliancePolicyId=").append(String.valueOf(this.compliancePolicyId));
        sb.append(", compliancePolicyDisplayName=")
                .append(String.valueOf(this.compliancePolicyDisplayName));
        sb.append(", compliancePolicyRuleId=").append(String.valueOf(this.compliancePolicyRuleId));
        sb.append(", compliancePolicyRuleDisplayName=")
                .append(String.valueOf(this.compliancePolicyRuleDisplayName));
        sb.append(", gracePeriod=").append(String.valueOf(this.gracePeriod));
        sb.append(", patchSelection=").append(String.valueOf(this.patchSelection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComplianceDetailPolicy)) {
            return false;
        }

        ComplianceDetailPolicy other = (ComplianceDetailPolicy) o;
        return java.util.Objects.equals(this.compliancePolicyId, other.compliancePolicyId)
                && java.util.Objects.equals(
                        this.compliancePolicyDisplayName, other.compliancePolicyDisplayName)
                && java.util.Objects.equals(
                        this.compliancePolicyRuleId, other.compliancePolicyRuleId)
                && java.util.Objects.equals(
                        this.compliancePolicyRuleDisplayName, other.compliancePolicyRuleDisplayName)
                && java.util.Objects.equals(this.gracePeriod, other.gracePeriod)
                && java.util.Objects.equals(this.patchSelection, other.patchSelection)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compliancePolicyId == null
                                ? 43
                                : this.compliancePolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.compliancePolicyDisplayName == null
                                ? 43
                                : this.compliancePolicyDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compliancePolicyRuleId == null
                                ? 43
                                : this.compliancePolicyRuleId.hashCode());
        result =
                (result * PRIME)
                        + (this.compliancePolicyRuleDisplayName == null
                                ? 43
                                : this.compliancePolicyRuleDisplayName.hashCode());
        result = (result * PRIME) + (this.gracePeriod == null ? 43 : this.gracePeriod.hashCode());
        result =
                (result * PRIME)
                        + (this.patchSelection == null ? 43 : this.patchSelection.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
