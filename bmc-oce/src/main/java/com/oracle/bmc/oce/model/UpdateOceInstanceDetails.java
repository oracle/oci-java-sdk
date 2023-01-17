/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oce.model;

/**
 * The information to be updated.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190912")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateOceInstanceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateOceInstanceDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "wafPrimaryDomain",
        "instanceLicenseType",
        "instanceUsageType",
        "addOnFeatures",
        "freeformTags",
        "definedTags"
    })
    public UpdateOceInstanceDetails(
            String description,
            String wafPrimaryDomain,
            LicenseType instanceLicenseType,
            InstanceUsageType instanceUsageType,
            java.util.List<String> addOnFeatures,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.description = description;
        this.wafPrimaryDomain = wafPrimaryDomain;
        this.instanceLicenseType = instanceLicenseType;
        this.instanceUsageType = instanceUsageType;
        this.addOnFeatures = addOnFeatures;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OceInstance description
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * OceInstance description
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Web Application Firewall(WAF) primary domain
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("wafPrimaryDomain")
        private String wafPrimaryDomain;

        /**
         * Web Application Firewall(WAF) primary domain
         * @param wafPrimaryDomain the value to set
         * @return this builder
         **/
        public Builder wafPrimaryDomain(String wafPrimaryDomain) {
            this.wafPrimaryDomain = wafPrimaryDomain;
            this.__explicitlySet__.add("wafPrimaryDomain");
            return this;
        }
        /**
         * Flag indicating whether the instance license is new cloud or bring your own license
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceLicenseType")
        private LicenseType instanceLicenseType;

        /**
         * Flag indicating whether the instance license is new cloud or bring your own license
         * @param instanceLicenseType the value to set
         * @return this builder
         **/
        public Builder instanceLicenseType(LicenseType instanceLicenseType) {
            this.instanceLicenseType = instanceLicenseType;
            this.__explicitlySet__.add("instanceLicenseType");
            return this;
        }
        /**
         * Instance type based on its usage
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceUsageType")
        private InstanceUsageType instanceUsageType;

        /**
         * Instance type based on its usage
         * @param instanceUsageType the value to set
         * @return this builder
         **/
        public Builder instanceUsageType(InstanceUsageType instanceUsageType) {
            this.instanceUsageType = instanceUsageType;
            this.__explicitlySet__.add("instanceUsageType");
            return this;
        }
        /**
         * a list of add-on features for the ocm instance
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("addOnFeatures")
        private java.util.List<String> addOnFeatures;

        /**
         * a list of add-on features for the ocm instance
         * @param addOnFeatures the value to set
         * @return this builder
         **/
        public Builder addOnFeatures(java.util.List<String> addOnFeatures) {
            this.addOnFeatures = addOnFeatures;
            this.__explicitlySet__.add("addOnFeatures");
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
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateOceInstanceDetails build() {
            UpdateOceInstanceDetails model =
                    new UpdateOceInstanceDetails(
                            this.description,
                            this.wafPrimaryDomain,
                            this.instanceLicenseType,
                            this.instanceUsageType,
                            this.addOnFeatures,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOceInstanceDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("wafPrimaryDomain")) {
                this.wafPrimaryDomain(model.getWafPrimaryDomain());
            }
            if (model.wasPropertyExplicitlySet("instanceLicenseType")) {
                this.instanceLicenseType(model.getInstanceLicenseType());
            }
            if (model.wasPropertyExplicitlySet("instanceUsageType")) {
                this.instanceUsageType(model.getInstanceUsageType());
            }
            if (model.wasPropertyExplicitlySet("addOnFeatures")) {
                this.addOnFeatures(model.getAddOnFeatures());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * OceInstance description
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * OceInstance description
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Web Application Firewall(WAF) primary domain
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("wafPrimaryDomain")
    private final String wafPrimaryDomain;

    /**
     * Web Application Firewall(WAF) primary domain
     * @return the value
     **/
    public String getWafPrimaryDomain() {
        return wafPrimaryDomain;
    }

    /**
     * Flag indicating whether the instance license is new cloud or bring your own license
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceLicenseType")
    private final LicenseType instanceLicenseType;

    /**
     * Flag indicating whether the instance license is new cloud or bring your own license
     * @return the value
     **/
    public LicenseType getInstanceLicenseType() {
        return instanceLicenseType;
    }

    /**
     * Instance type based on its usage
     **/
    public enum InstanceUsageType {
        Primary("PRIMARY"),
        Nonprimary("NONPRIMARY"),
        ;

        private final String value;
        private static java.util.Map<String, InstanceUsageType> map;

        static {
            map = new java.util.HashMap<>();
            for (InstanceUsageType v : InstanceUsageType.values()) {
                map.put(v.getValue(), v);
            }
        }

        InstanceUsageType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static InstanceUsageType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid InstanceUsageType: " + key);
        }
    };
    /**
     * Instance type based on its usage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceUsageType")
    private final InstanceUsageType instanceUsageType;

    /**
     * Instance type based on its usage
     * @return the value
     **/
    public InstanceUsageType getInstanceUsageType() {
        return instanceUsageType;
    }

    /**
     * a list of add-on features for the ocm instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addOnFeatures")
    private final java.util.List<String> addOnFeatures;

    /**
     * a list of add-on features for the ocm instance
     * @return the value
     **/
    public java.util.List<String> getAddOnFeatures() {
        return addOnFeatures;
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
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateOceInstanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", wafPrimaryDomain=").append(String.valueOf(this.wafPrimaryDomain));
        sb.append(", instanceLicenseType=").append(String.valueOf(this.instanceLicenseType));
        sb.append(", instanceUsageType=").append(String.valueOf(this.instanceUsageType));
        sb.append(", addOnFeatures=").append(String.valueOf(this.addOnFeatures));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOceInstanceDetails)) {
            return false;
        }

        UpdateOceInstanceDetails other = (UpdateOceInstanceDetails) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.wafPrimaryDomain, other.wafPrimaryDomain)
                && java.util.Objects.equals(this.instanceLicenseType, other.instanceLicenseType)
                && java.util.Objects.equals(this.instanceUsageType, other.instanceUsageType)
                && java.util.Objects.equals(this.addOnFeatures, other.addOnFeatures)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.wafPrimaryDomain == null ? 43 : this.wafPrimaryDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceLicenseType == null
                                ? 43
                                : this.instanceLicenseType.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceUsageType == null ? 43 : this.instanceUsageType.hashCode());
        result =
                (result * PRIME)
                        + (this.addOnFeatures == null ? 43 : this.addOnFeatures.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
