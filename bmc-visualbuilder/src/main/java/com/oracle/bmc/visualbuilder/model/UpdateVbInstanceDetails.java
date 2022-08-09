/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.visualbuilder.model;

/**
 * Information about updating a VbInstance.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateVbInstanceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateVbInstanceDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "freeformTags",
        "definedTags",
        "idcsOpenId",
        "nodeCount",
        "isVisualBuilderEnabled",
        "customEndpoint",
        "alternateCustomEndpoints"
    })
    public UpdateVbInstanceDetails(
            String displayName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String idcsOpenId,
            Integer nodeCount,
            Boolean isVisualBuilderEnabled,
            UpdateCustomEndpointDetails customEndpoint,
            java.util.List<UpdateCustomEndpointDetails> alternateCustomEndpoints) {
        super();
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.idcsOpenId = idcsOpenId;
        this.nodeCount = nodeCount;
        this.isVisualBuilderEnabled = isVisualBuilderEnabled;
        this.customEndpoint = customEndpoint;
        this.alternateCustomEndpoints = alternateCustomEndpoints;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Vb Instance Identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Vb Instance Identifier.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name,
         * type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name,
         * type or scope. Exists for cross-compatibility only.
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
         * Usage of predefined tag keys. These predefined keys are scoped to
         * namespaces.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Usage of predefined tag keys. These predefined keys are scoped to
         * namespaces.
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
         * Encrypted IDCS Open ID token. This is required for pre-UCPIS cloud accounts, but not UCPIS, hence not a required parameter
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsOpenId")
        private String idcsOpenId;

        /**
         * Encrypted IDCS Open ID token. This is required for pre-UCPIS cloud accounts, but not UCPIS, hence not a required parameter
         * @param idcsOpenId the value to set
         * @return this builder
         **/
        public Builder idcsOpenId(String idcsOpenId) {
            this.idcsOpenId = idcsOpenId;
            this.__explicitlySet__.add("idcsOpenId");
            return this;
        }
        /**
         * The number of Nodes
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
        private Integer nodeCount;

        /**
         * The number of Nodes
         * @param nodeCount the value to set
         * @return this builder
         **/
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            this.__explicitlySet__.add("nodeCount");
            return this;
        }
        /**
         * Enable Visual Builder. If Visual Builder is enabled alredy, then it cannot be disabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isVisualBuilderEnabled")
        private Boolean isVisualBuilderEnabled;

        /**
         * Enable Visual Builder. If Visual Builder is enabled alredy, then it cannot be disabled.
         * @param isVisualBuilderEnabled the value to set
         * @return this builder
         **/
        public Builder isVisualBuilderEnabled(Boolean isVisualBuilderEnabled) {
            this.isVisualBuilderEnabled = isVisualBuilderEnabled;
            this.__explicitlySet__.add("isVisualBuilderEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customEndpoint")
        private UpdateCustomEndpointDetails customEndpoint;

        public Builder customEndpoint(UpdateCustomEndpointDetails customEndpoint) {
            this.customEndpoint = customEndpoint;
            this.__explicitlySet__.add("customEndpoint");
            return this;
        }
        /**
         * A list of alternate custom endpoints to be used for the vb instance URL
         * (contact Oracle for alternateCustomEndpoints availability for a specific instance).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("alternateCustomEndpoints")
        private java.util.List<UpdateCustomEndpointDetails> alternateCustomEndpoints;

        /**
         * A list of alternate custom endpoints to be used for the vb instance URL
         * (contact Oracle for alternateCustomEndpoints availability for a specific instance).
         *
         * @param alternateCustomEndpoints the value to set
         * @return this builder
         **/
        public Builder alternateCustomEndpoints(
                java.util.List<UpdateCustomEndpointDetails> alternateCustomEndpoints) {
            this.alternateCustomEndpoints = alternateCustomEndpoints;
            this.__explicitlySet__.add("alternateCustomEndpoints");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateVbInstanceDetails build() {
            UpdateVbInstanceDetails model =
                    new UpdateVbInstanceDetails(
                            this.displayName,
                            this.freeformTags,
                            this.definedTags,
                            this.idcsOpenId,
                            this.nodeCount,
                            this.isVisualBuilderEnabled,
                            this.customEndpoint,
                            this.alternateCustomEndpoints);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateVbInstanceDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("idcsOpenId")) {
                this.idcsOpenId(model.getIdcsOpenId());
            }
            if (model.wasPropertyExplicitlySet("nodeCount")) {
                this.nodeCount(model.getNodeCount());
            }
            if (model.wasPropertyExplicitlySet("isVisualBuilderEnabled")) {
                this.isVisualBuilderEnabled(model.getIsVisualBuilderEnabled());
            }
            if (model.wasPropertyExplicitlySet("customEndpoint")) {
                this.customEndpoint(model.getCustomEndpoint());
            }
            if (model.wasPropertyExplicitlySet("alternateCustomEndpoints")) {
                this.alternateCustomEndpoints(model.getAlternateCustomEndpoints());
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
     * Vb Instance Identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Vb Instance Identifier.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Simple key-value pair that is applied without any predefined name,
     * type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name,
     * type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to
     * namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to
     * namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Encrypted IDCS Open ID token. This is required for pre-UCPIS cloud accounts, but not UCPIS, hence not a required parameter
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsOpenId")
    private final String idcsOpenId;

    /**
     * Encrypted IDCS Open ID token. This is required for pre-UCPIS cloud accounts, but not UCPIS, hence not a required parameter
     * @return the value
     **/
    public String getIdcsOpenId() {
        return idcsOpenId;
    }

    /**
     * The number of Nodes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
    private final Integer nodeCount;

    /**
     * The number of Nodes
     * @return the value
     **/
    public Integer getNodeCount() {
        return nodeCount;
    }

    /**
     * Enable Visual Builder. If Visual Builder is enabled alredy, then it cannot be disabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isVisualBuilderEnabled")
    private final Boolean isVisualBuilderEnabled;

    /**
     * Enable Visual Builder. If Visual Builder is enabled alredy, then it cannot be disabled.
     * @return the value
     **/
    public Boolean getIsVisualBuilderEnabled() {
        return isVisualBuilderEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("customEndpoint")
    private final UpdateCustomEndpointDetails customEndpoint;

    public UpdateCustomEndpointDetails getCustomEndpoint() {
        return customEndpoint;
    }

    /**
     * A list of alternate custom endpoints to be used for the vb instance URL
     * (contact Oracle for alternateCustomEndpoints availability for a specific instance).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("alternateCustomEndpoints")
    private final java.util.List<UpdateCustomEndpointDetails> alternateCustomEndpoints;

    /**
     * A list of alternate custom endpoints to be used for the vb instance URL
     * (contact Oracle for alternateCustomEndpoints availability for a specific instance).
     *
     * @return the value
     **/
    public java.util.List<UpdateCustomEndpointDetails> getAlternateCustomEndpoints() {
        return alternateCustomEndpoints;
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
        sb.append("UpdateVbInstanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", idcsOpenId=").append(String.valueOf(this.idcsOpenId));
        sb.append(", nodeCount=").append(String.valueOf(this.nodeCount));
        sb.append(", isVisualBuilderEnabled=").append(String.valueOf(this.isVisualBuilderEnabled));
        sb.append(", customEndpoint=").append(String.valueOf(this.customEndpoint));
        sb.append(", alternateCustomEndpoints=")
                .append(String.valueOf(this.alternateCustomEndpoints));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateVbInstanceDetails)) {
            return false;
        }

        UpdateVbInstanceDetails other = (UpdateVbInstanceDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.idcsOpenId, other.idcsOpenId)
                && java.util.Objects.equals(this.nodeCount, other.nodeCount)
                && java.util.Objects.equals(
                        this.isVisualBuilderEnabled, other.isVisualBuilderEnabled)
                && java.util.Objects.equals(this.customEndpoint, other.customEndpoint)
                && java.util.Objects.equals(
                        this.alternateCustomEndpoints, other.alternateCustomEndpoints)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.idcsOpenId == null ? 43 : this.idcsOpenId.hashCode());
        result = (result * PRIME) + (this.nodeCount == null ? 43 : this.nodeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.isVisualBuilderEnabled == null
                                ? 43
                                : this.isVisualBuilderEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.customEndpoint == null ? 43 : this.customEndpoint.hashCode());
        result =
                (result * PRIME)
                        + (this.alternateCustomEndpoints == null
                                ? 43
                                : this.alternateCustomEndpoints.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
