/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.governancerulescontrolplane.model;

/**
 * Request object for Createinclusion criterion operation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220504")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateInclusionCriterionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateInclusionCriterionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"governanceRuleId", "type", "association"})
    public CreateInclusionCriterionDetails(
            String governanceRuleId, InclusionCriterion.Type type, Association association) {
        super();
        this.governanceRuleId = governanceRuleId;
        this.type = type;
        this.association = association;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Oracle ID
         * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
         * governance rule. Every inclusion criterion is associated with a governance rule.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("governanceRuleId")
        private String governanceRuleId;

        /**
         * The Oracle ID
         * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
         * governance rule. Every inclusion criterion is associated with a governance rule.
         *
         * @param governanceRuleId the value to set
         * @return this builder
         */
        public Builder governanceRuleId(String governanceRuleId) {
            this.governanceRuleId = governanceRuleId;
            this.__explicitlySet__.add("governanceRuleId");
            return this;
        }
        /**
         * Type of inclusion criterion - TENANCY, ALL or TAG. We support TENANCY and ALL for now.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private InclusionCriterion.Type type;

        /**
         * Type of inclusion criterion - TENANCY, ALL or TAG. We support TENANCY and ALL for now.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(InclusionCriterion.Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("association")
        private Association association;

        public Builder association(Association association) {
            this.association = association;
            this.__explicitlySet__.add("association");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateInclusionCriterionDetails build() {
            CreateInclusionCriterionDetails model =
                    new CreateInclusionCriterionDetails(
                            this.governanceRuleId, this.type, this.association);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateInclusionCriterionDetails model) {
            if (model.wasPropertyExplicitlySet("governanceRuleId")) {
                this.governanceRuleId(model.getGovernanceRuleId());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("association")) {
                this.association(model.getAssociation());
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
     * The Oracle ID
     * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
     * governance rule. Every inclusion criterion is associated with a governance rule.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("governanceRuleId")
    private final String governanceRuleId;

    /**
     * The Oracle ID
     * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
     * governance rule. Every inclusion criterion is associated with a governance rule.
     *
     * @return the value
     */
    public String getGovernanceRuleId() {
        return governanceRuleId;
    }

    /** Type of inclusion criterion - TENANCY, ALL or TAG. We support TENANCY and ALL for now. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final InclusionCriterion.Type type;

    /**
     * Type of inclusion criterion - TENANCY, ALL or TAG. We support TENANCY and ALL for now.
     *
     * @return the value
     */
    public InclusionCriterion.Type getType() {
        return type;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("association")
    private final Association association;

    public Association getAssociation() {
        return association;
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
        sb.append("CreateInclusionCriterionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("governanceRuleId=").append(String.valueOf(this.governanceRuleId));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", association=").append(String.valueOf(this.association));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateInclusionCriterionDetails)) {
            return false;
        }

        CreateInclusionCriterionDetails other = (CreateInclusionCriterionDetails) o;
        return java.util.Objects.equals(this.governanceRuleId, other.governanceRuleId)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.association, other.association)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.governanceRuleId == null ? 43 : this.governanceRuleId.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.association == null ? 43 : this.association.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
