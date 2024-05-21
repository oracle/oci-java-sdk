/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.governancerulescontrolplane.model;

/**
 * Summary of the inclusion criterion.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220504")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InclusionCriterionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InclusionCriterionSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "governanceRuleId",
        "type",
        "association",
        "lifecycleState",
        "timeCreated",
        "timeUpdated"
    })
    public InclusionCriterionSummary(
            String id,
            String governanceRuleId,
            InclusionCriterion.Type type,
            Association association,
            InclusionCriterion.LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.id = id;
        this.governanceRuleId = governanceRuleId;
        this.type = type;
        this.association = association;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Oracle ID ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the inclusion criterion.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The Oracle ID ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the inclusion criterion.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The Oracle ID ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the governance rule. Every inclusion criterion is associated with a governance rule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("governanceRuleId")
        private String governanceRuleId;

        /**
         * The Oracle ID ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the governance rule. Every inclusion criterion is associated with a governance rule.
         * @param governanceRuleId the value to set
         * @return this builder
         **/
        public Builder governanceRuleId(String governanceRuleId) {
            this.governanceRuleId = governanceRuleId;
            this.__explicitlySet__.add("governanceRuleId");
            return this;
        }
        /**
         * Type of inclusion criterion - TENANCY, ALL or TAG. We support TENANCY and ALL for now.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private InclusionCriterion.Type type;

        /**
         * Type of inclusion criterion - TENANCY, ALL or TAG. We support TENANCY and ALL for now.
         * @param type the value to set
         * @return this builder
         **/
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
        /**
         * The current state of the inclusion criterion.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private InclusionCriterion.LifecycleState lifecycleState;

        /**
         * The current state of the inclusion criterion.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(InclusionCriterion.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Date and time the inclusion criterion was created. An RFC3339 formatted datetime string.
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Date and time the inclusion criterion was created. An RFC3339 formatted datetime string.
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Date and time the inclusion criterion was updated. An RFC3339 formatted datetime string.
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Date and time the inclusion criterion was updated. An RFC3339 formatted datetime string.
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InclusionCriterionSummary build() {
            InclusionCriterionSummary model =
                    new InclusionCriterionSummary(
                            this.id,
                            this.governanceRuleId,
                            this.type,
                            this.association,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InclusionCriterionSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("governanceRuleId")) {
                this.governanceRuleId(model.getGovernanceRuleId());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("association")) {
                this.association(model.getAssociation());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The Oracle ID ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the inclusion criterion.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The Oracle ID ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the inclusion criterion.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The Oracle ID ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the governance rule. Every inclusion criterion is associated with a governance rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("governanceRuleId")
    private final String governanceRuleId;

    /**
     * The Oracle ID ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the governance rule. Every inclusion criterion is associated with a governance rule.
     * @return the value
     **/
    public String getGovernanceRuleId() {
        return governanceRuleId;
    }

    /**
     * Type of inclusion criterion - TENANCY, ALL or TAG. We support TENANCY and ALL for now.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final InclusionCriterion.Type type;

    /**
     * Type of inclusion criterion - TENANCY, ALL or TAG. We support TENANCY and ALL for now.
     * @return the value
     **/
    public InclusionCriterion.Type getType() {
        return type;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("association")
    private final Association association;

    public Association getAssociation() {
        return association;
    }

    /**
     * The current state of the inclusion criterion.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final InclusionCriterion.LifecycleState lifecycleState;

    /**
     * The current state of the inclusion criterion.
     * @return the value
     **/
    public InclusionCriterion.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Date and time the inclusion criterion was created. An RFC3339 formatted datetime string.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Date and time the inclusion criterion was created. An RFC3339 formatted datetime string.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Date and time the inclusion criterion was updated. An RFC3339 formatted datetime string.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Date and time the inclusion criterion was updated. An RFC3339 formatted datetime string.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("InclusionCriterionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", governanceRuleId=").append(String.valueOf(this.governanceRuleId));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", association=").append(String.valueOf(this.association));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InclusionCriterionSummary)) {
            return false;
        }

        InclusionCriterionSummary other = (InclusionCriterionSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.governanceRuleId, other.governanceRuleId)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.association, other.association)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.governanceRuleId == null ? 43 : this.governanceRuleId.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.association == null ? 43 : this.association.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
