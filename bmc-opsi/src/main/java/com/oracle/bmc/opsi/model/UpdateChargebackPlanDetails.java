/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * The details used to update a Ops Insights chargeback plan.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateChargebackPlanDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateChargebackPlanDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "planDescription",
        "planName",
        "freeformTags",
        "definedTags",
        "planCustomItems"
    })
    public UpdateChargebackPlanDetails(
            String planDescription,
            String planName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<CreatePlanCustomItemDetails> planCustomItems) {
        super();
        this.planDescription = planDescription;
        this.planName = planName;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.planCustomItems = planCustomItems;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Description of OPSI Chargeback Plan.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("planDescription")
        private String planDescription;

        /**
         * Description of OPSI Chargeback Plan.
         * @param planDescription the value to set
         * @return this builder
         **/
        public Builder planDescription(String planDescription) {
            this.planDescription = planDescription;
            this.__explicitlySet__.add("planDescription");
            return this;
        }
        /**
         * Name for the OPSI Chargeback plan.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("planName")
        private String planName;

        /**
         * Name for the OPSI Chargeback plan.
         * @param planName the value to set
         * @return this builder
         **/
        public Builder planName(String planName) {
            this.planName = planName;
            this.__explicitlySet__.add("planName");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * List of chargeback plan customizations.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("planCustomItems")
        private java.util.List<CreatePlanCustomItemDetails> planCustomItems;

        /**
         * List of chargeback plan customizations.
         * @param planCustomItems the value to set
         * @return this builder
         **/
        public Builder planCustomItems(
                java.util.List<CreatePlanCustomItemDetails> planCustomItems) {
            this.planCustomItems = planCustomItems;
            this.__explicitlySet__.add("planCustomItems");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateChargebackPlanDetails build() {
            UpdateChargebackPlanDetails model =
                    new UpdateChargebackPlanDetails(
                            this.planDescription,
                            this.planName,
                            this.freeformTags,
                            this.definedTags,
                            this.planCustomItems);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateChargebackPlanDetails model) {
            if (model.wasPropertyExplicitlySet("planDescription")) {
                this.planDescription(model.getPlanDescription());
            }
            if (model.wasPropertyExplicitlySet("planName")) {
                this.planName(model.getPlanName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("planCustomItems")) {
                this.planCustomItems(model.getPlanCustomItems());
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
     * Description of OPSI Chargeback Plan.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planDescription")
    private final String planDescription;

    /**
     * Description of OPSI Chargeback Plan.
     * @return the value
     **/
    public String getPlanDescription() {
        return planDescription;
    }

    /**
     * Name for the OPSI Chargeback plan.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planName")
    private final String planName;

    /**
     * Name for the OPSI Chargeback plan.
     * @return the value
     **/
    public String getPlanName() {
        return planName;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * List of chargeback plan customizations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planCustomItems")
    private final java.util.List<CreatePlanCustomItemDetails> planCustomItems;

    /**
     * List of chargeback plan customizations.
     * @return the value
     **/
    public java.util.List<CreatePlanCustomItemDetails> getPlanCustomItems() {
        return planCustomItems;
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
        sb.append("UpdateChargebackPlanDetails(");
        sb.append("super=").append(super.toString());
        sb.append("planDescription=").append(String.valueOf(this.planDescription));
        sb.append(", planName=").append(String.valueOf(this.planName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", planCustomItems=").append(String.valueOf(this.planCustomItems));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateChargebackPlanDetails)) {
            return false;
        }

        UpdateChargebackPlanDetails other = (UpdateChargebackPlanDetails) o;
        return java.util.Objects.equals(this.planDescription, other.planDescription)
                && java.util.Objects.equals(this.planName, other.planName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.planCustomItems, other.planCustomItems)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.planDescription == null ? 43 : this.planDescription.hashCode());
        result = (result * PRIME) + (this.planName == null ? 43 : this.planName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.planCustomItems == null ? 43 : this.planCustomItems.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
