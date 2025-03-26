/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * These details can be included in a request to update a capture filter. A capture filter contains a set of rules governing what traffic a VTAP mirrors.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateCaptureFilterDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateCaptureFilterDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "definedTags",
        "displayName",
        "vtapCaptureFilterRules",
        "flowLogCaptureFilterRules",
        "freeformTags"
    })
    public UpdateCaptureFilterDetails(
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.List<VtapCaptureFilterRuleDetails> vtapCaptureFilterRules,
            java.util.List<FlowLogCaptureFilterRuleDetails> flowLogCaptureFilterRules,
            java.util.Map<String, String> freeformTags) {
        super();
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.vtapCaptureFilterRules = vtapCaptureFilterRules;
        this.flowLogCaptureFilterRules = flowLogCaptureFilterRules;
        this.freeformTags = freeformTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The set of rules governing what traffic a VTAP mirrors.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vtapCaptureFilterRules")
        private java.util.List<VtapCaptureFilterRuleDetails> vtapCaptureFilterRules;

        /**
         * The set of rules governing what traffic a VTAP mirrors.
         *
         * @param vtapCaptureFilterRules the value to set
         * @return this builder
         **/
        public Builder vtapCaptureFilterRules(
                java.util.List<VtapCaptureFilterRuleDetails> vtapCaptureFilterRules) {
            this.vtapCaptureFilterRules = vtapCaptureFilterRules;
            this.__explicitlySet__.add("vtapCaptureFilterRules");
            return this;
        }
        /**
         * The set of rules governing what traffic the Flow Log collects when creating a flow log capture filter.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("flowLogCaptureFilterRules")
        private java.util.List<FlowLogCaptureFilterRuleDetails> flowLogCaptureFilterRules;

        /**
         * The set of rules governing what traffic the Flow Log collects when creating a flow log capture filter.
         *
         * @param flowLogCaptureFilterRules the value to set
         * @return this builder
         **/
        public Builder flowLogCaptureFilterRules(
                java.util.List<FlowLogCaptureFilterRuleDetails> flowLogCaptureFilterRules) {
            this.flowLogCaptureFilterRules = flowLogCaptureFilterRules;
            this.__explicitlySet__.add("flowLogCaptureFilterRules");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateCaptureFilterDetails build() {
            UpdateCaptureFilterDetails model =
                    new UpdateCaptureFilterDetails(
                            this.definedTags,
                            this.displayName,
                            this.vtapCaptureFilterRules,
                            this.flowLogCaptureFilterRules,
                            this.freeformTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateCaptureFilterDetails model) {
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("vtapCaptureFilterRules")) {
                this.vtapCaptureFilterRules(model.getVtapCaptureFilterRules());
            }
            if (model.wasPropertyExplicitlySet("flowLogCaptureFilterRules")) {
                this.flowLogCaptureFilterRules(model.getFlowLogCaptureFilterRules());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
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
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The set of rules governing what traffic a VTAP mirrors.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vtapCaptureFilterRules")
    private final java.util.List<VtapCaptureFilterRuleDetails> vtapCaptureFilterRules;

    /**
     * The set of rules governing what traffic a VTAP mirrors.
     *
     * @return the value
     **/
    public java.util.List<VtapCaptureFilterRuleDetails> getVtapCaptureFilterRules() {
        return vtapCaptureFilterRules;
    }

    /**
     * The set of rules governing what traffic the Flow Log collects when creating a flow log capture filter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("flowLogCaptureFilterRules")
    private final java.util.List<FlowLogCaptureFilterRuleDetails> flowLogCaptureFilterRules;

    /**
     * The set of rules governing what traffic the Flow Log collects when creating a flow log capture filter.
     *
     * @return the value
     **/
    public java.util.List<FlowLogCaptureFilterRuleDetails> getFlowLogCaptureFilterRules() {
        return flowLogCaptureFilterRules;
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
        sb.append("UpdateCaptureFilterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", vtapCaptureFilterRules=").append(String.valueOf(this.vtapCaptureFilterRules));
        sb.append(", flowLogCaptureFilterRules=")
                .append(String.valueOf(this.flowLogCaptureFilterRules));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateCaptureFilterDetails)) {
            return false;
        }

        UpdateCaptureFilterDetails other = (UpdateCaptureFilterDetails) o;
        return java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.vtapCaptureFilterRules, other.vtapCaptureFilterRules)
                && java.util.Objects.equals(
                        this.flowLogCaptureFilterRules, other.flowLogCaptureFilterRules)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.vtapCaptureFilterRules == null
                                ? 43
                                : this.vtapCaptureFilterRules.hashCode());
        result =
                (result * PRIME)
                        + (this.flowLogCaptureFilterRules == null
                                ? 43
                                : this.flowLogCaptureFilterRules.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
