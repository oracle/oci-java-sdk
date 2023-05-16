/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.integration.model;

/**
 * The information to be updated.
 *
 * <p>Some properties may not be applicable to specific integration types, see [Differences in
 * Instance
 * Management](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/application-integration&id=INTOO-GUID-931B5E33-4FE6-4997-93E5-8748516F46AA__GUID-176E43D5-4116-4828-8120-B929DF2A6B5E)
 * for details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateIntegrationInstanceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateIntegrationInstanceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "integrationInstanceType",
        "freeformTags",
        "definedTags",
        "isByol",
        "messagePacks",
        "isFileServerEnabled",
        "isVisualBuilderEnabled",
        "customEndpoint",
        "alternateCustomEndpoints"
    })
    public UpdateIntegrationInstanceDetails(
            String displayName,
            IntegrationInstanceType integrationInstanceType,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            Boolean isByol,
            Integer messagePacks,
            Boolean isFileServerEnabled,
            Boolean isVisualBuilderEnabled,
            UpdateCustomEndpointDetails customEndpoint,
            java.util.List<UpdateCustomEndpointDetails> alternateCustomEndpoints) {
        super();
        this.displayName = displayName;
        this.integrationInstanceType = integrationInstanceType;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.isByol = isByol;
        this.messagePacks = messagePacks;
        this.isFileServerEnabled = isFileServerEnabled;
        this.isVisualBuilderEnabled = isVisualBuilderEnabled;
        this.customEndpoint = customEndpoint;
        this.alternateCustomEndpoints = alternateCustomEndpoints;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Integration Instance Identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Integration Instance Identifier.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Standard or Enterprise type, Oracle Integration Generation 2 uses ENTERPRISE and
         * STANDARD, Oracle Integration 3 uses ENTERPRISEX and STANDARDX
         */
        @com.fasterxml.jackson.annotation.JsonProperty("integrationInstanceType")
        private IntegrationInstanceType integrationInstanceType;

        /**
         * Standard or Enterprise type, Oracle Integration Generation 2 uses ENTERPRISE and
         * STANDARD, Oracle Integration 3 uses ENTERPRISEX and STANDARDX
         *
         * @param integrationInstanceType the value to set
         * @return this builder
         */
        public Builder integrationInstanceType(IntegrationInstanceType integrationInstanceType) {
            this.integrationInstanceType = integrationInstanceType;
            this.__explicitlySet__.add("integrationInstanceType");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example:
         * {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example:
         * {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /** Bring your own license. */
        @com.fasterxml.jackson.annotation.JsonProperty("isByol")
        private Boolean isByol;

        /**
         * Bring your own license.
         *
         * @param isByol the value to set
         * @return this builder
         */
        public Builder isByol(Boolean isByol) {
            this.isByol = isByol;
            this.__explicitlySet__.add("isByol");
            return this;
        }
        /** The number of configured message packs */
        @com.fasterxml.jackson.annotation.JsonProperty("messagePacks")
        private Integer messagePacks;

        /**
         * The number of configured message packs
         *
         * @param messagePacks the value to set
         * @return this builder
         */
        public Builder messagePacks(Integer messagePacks) {
            this.messagePacks = messagePacks;
            this.__explicitlySet__.add("messagePacks");
            return this;
        }
        /** The file server is enabled or not. */
        @com.fasterxml.jackson.annotation.JsonProperty("isFileServerEnabled")
        private Boolean isFileServerEnabled;

        /**
         * The file server is enabled or not.
         *
         * @param isFileServerEnabled the value to set
         * @return this builder
         */
        public Builder isFileServerEnabled(Boolean isFileServerEnabled) {
            this.isFileServerEnabled = isFileServerEnabled;
            this.__explicitlySet__.add("isFileServerEnabled");
            return this;
        }
        /** Visual Builder is enabled or not. */
        @com.fasterxml.jackson.annotation.JsonProperty("isVisualBuilderEnabled")
        private Boolean isVisualBuilderEnabled;

        /**
         * Visual Builder is enabled or not.
         *
         * @param isVisualBuilderEnabled the value to set
         * @return this builder
         */
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
         * A list of alternate custom endpoints to be used for the integration instance URL (contact
         * Oracle for alternateCustomEndpoints availability for a specific instance).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("alternateCustomEndpoints")
        private java.util.List<UpdateCustomEndpointDetails> alternateCustomEndpoints;

        /**
         * A list of alternate custom endpoints to be used for the integration instance URL (contact
         * Oracle for alternateCustomEndpoints availability for a specific instance).
         *
         * @param alternateCustomEndpoints the value to set
         * @return this builder
         */
        public Builder alternateCustomEndpoints(
                java.util.List<UpdateCustomEndpointDetails> alternateCustomEndpoints) {
            this.alternateCustomEndpoints = alternateCustomEndpoints;
            this.__explicitlySet__.add("alternateCustomEndpoints");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateIntegrationInstanceDetails build() {
            UpdateIntegrationInstanceDetails model =
                    new UpdateIntegrationInstanceDetails(
                            this.displayName,
                            this.integrationInstanceType,
                            this.freeformTags,
                            this.definedTags,
                            this.isByol,
                            this.messagePacks,
                            this.isFileServerEnabled,
                            this.isVisualBuilderEnabled,
                            this.customEndpoint,
                            this.alternateCustomEndpoints);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateIntegrationInstanceDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("integrationInstanceType")) {
                this.integrationInstanceType(model.getIntegrationInstanceType());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("isByol")) {
                this.isByol(model.getIsByol());
            }
            if (model.wasPropertyExplicitlySet("messagePacks")) {
                this.messagePacks(model.getMessagePacks());
            }
            if (model.wasPropertyExplicitlySet("isFileServerEnabled")) {
                this.isFileServerEnabled(model.getIsFileServerEnabled());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** Integration Instance Identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Integration Instance Identifier.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Standard or Enterprise type, Oracle Integration Generation 2 uses ENTERPRISE and STANDARD,
     * Oracle Integration 3 uses ENTERPRISEX and STANDARDX
     */
    public enum IntegrationInstanceType implements com.oracle.bmc.http.internal.BmcEnum {
        Standard("STANDARD"),
        Enterprise("ENTERPRISE"),
        Standardx("STANDARDX"),
        Enterprisex("ENTERPRISEX"),
        ;

        private final String value;
        private static java.util.Map<String, IntegrationInstanceType> map;

        static {
            map = new java.util.HashMap<>();
            for (IntegrationInstanceType v : IntegrationInstanceType.values()) {
                map.put(v.getValue(), v);
            }
        }

        IntegrationInstanceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IntegrationInstanceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid IntegrationInstanceType: " + key);
        }
    };
    /**
     * Standard or Enterprise type, Oracle Integration Generation 2 uses ENTERPRISE and STANDARD,
     * Oracle Integration 3 uses ENTERPRISEX and STANDARDX
     */
    @com.fasterxml.jackson.annotation.JsonProperty("integrationInstanceType")
    private final IntegrationInstanceType integrationInstanceType;

    /**
     * Standard or Enterprise type, Oracle Integration Generation 2 uses ENTERPRISE and STANDARD,
     * Oracle Integration 3 uses ENTERPRISEX and STANDARDX
     *
     * @return the value
     */
    public IntegrationInstanceType getIntegrationInstanceType() {
        return integrationInstanceType;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /** Bring your own license. */
    @com.fasterxml.jackson.annotation.JsonProperty("isByol")
    private final Boolean isByol;

    /**
     * Bring your own license.
     *
     * @return the value
     */
    public Boolean getIsByol() {
        return isByol;
    }

    /** The number of configured message packs */
    @com.fasterxml.jackson.annotation.JsonProperty("messagePacks")
    private final Integer messagePacks;

    /**
     * The number of configured message packs
     *
     * @return the value
     */
    public Integer getMessagePacks() {
        return messagePacks;
    }

    /** The file server is enabled or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("isFileServerEnabled")
    private final Boolean isFileServerEnabled;

    /**
     * The file server is enabled or not.
     *
     * @return the value
     */
    public Boolean getIsFileServerEnabled() {
        return isFileServerEnabled;
    }

    /** Visual Builder is enabled or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("isVisualBuilderEnabled")
    private final Boolean isVisualBuilderEnabled;

    /**
     * Visual Builder is enabled or not.
     *
     * @return the value
     */
    public Boolean getIsVisualBuilderEnabled() {
        return isVisualBuilderEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("customEndpoint")
    private final UpdateCustomEndpointDetails customEndpoint;

    public UpdateCustomEndpointDetails getCustomEndpoint() {
        return customEndpoint;
    }

    /**
     * A list of alternate custom endpoints to be used for the integration instance URL (contact
     * Oracle for alternateCustomEndpoints availability for a specific instance).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("alternateCustomEndpoints")
    private final java.util.List<UpdateCustomEndpointDetails> alternateCustomEndpoints;

    /**
     * A list of alternate custom endpoints to be used for the integration instance URL (contact
     * Oracle for alternateCustomEndpoints availability for a specific instance).
     *
     * @return the value
     */
    public java.util.List<UpdateCustomEndpointDetails> getAlternateCustomEndpoints() {
        return alternateCustomEndpoints;
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
        sb.append("UpdateIntegrationInstanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", integrationInstanceType=")
                .append(String.valueOf(this.integrationInstanceType));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", isByol=").append(String.valueOf(this.isByol));
        sb.append(", messagePacks=").append(String.valueOf(this.messagePacks));
        sb.append(", isFileServerEnabled=").append(String.valueOf(this.isFileServerEnabled));
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
        if (!(o instanceof UpdateIntegrationInstanceDetails)) {
            return false;
        }

        UpdateIntegrationInstanceDetails other = (UpdateIntegrationInstanceDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.integrationInstanceType, other.integrationInstanceType)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.isByol, other.isByol)
                && java.util.Objects.equals(this.messagePacks, other.messagePacks)
                && java.util.Objects.equals(this.isFileServerEnabled, other.isFileServerEnabled)
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
        result =
                (result * PRIME)
                        + (this.integrationInstanceType == null
                                ? 43
                                : this.integrationInstanceType.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.isByol == null ? 43 : this.isByol.hashCode());
        result = (result * PRIME) + (this.messagePacks == null ? 43 : this.messagePacks.hashCode());
        result =
                (result * PRIME)
                        + (this.isFileServerEnabled == null
                                ? 43
                                : this.isFileServerEnabled.hashCode());
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
