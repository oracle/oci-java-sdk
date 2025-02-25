/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides the information used to create a management station.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateManagementStationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateManagementStationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "description",
        "hostname",
        "isAutoConfigEnabled",
        "proxy",
        "mirror",
        "freeformTags",
        "definedTags"
    })
    public CreateManagementStationDetails(
            String compartmentId,
            String displayName,
            String description,
            String hostname,
            Boolean isAutoConfigEnabled,
            CreateProxyConfigurationDetails proxy,
            CreateMirrorConfigurationDetails mirror,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.hostname = hostname;
        this.isAutoConfigEnabled = isAutoConfigEnabled;
        this.proxy = proxy;
        this.mirror = mirror;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the management station.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the management station.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * User-friendly name for the management station. Does not have to be unique and you can change the name later. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * User-friendly name for the management station. Does not have to be unique and you can change the name later. Avoid entering confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * User-specified description of the management station. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * User-specified description of the management station. Avoid entering confidential information.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Hostname of the management station.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        /**
         * Hostname of the management station.
         * @param hostname the value to set
         * @return this builder
         **/
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }
        /**
         * When enabled, the station setup script automatically runs to configure the firewall and SELinux settings on the station.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoConfigEnabled")
        private Boolean isAutoConfigEnabled;

        /**
         * When enabled, the station setup script automatically runs to configure the firewall and SELinux settings on the station.
         * @param isAutoConfigEnabled the value to set
         * @return this builder
         **/
        public Builder isAutoConfigEnabled(Boolean isAutoConfigEnabled) {
            this.isAutoConfigEnabled = isAutoConfigEnabled;
            this.__explicitlySet__.add("isAutoConfigEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("proxy")
        private CreateProxyConfigurationDetails proxy;

        public Builder proxy(CreateProxyConfigurationDetails proxy) {
            this.proxy = proxy;
            this.__explicitlySet__.add("proxy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mirror")
        private CreateMirrorConfigurationDetails mirror;

        public Builder mirror(CreateMirrorConfigurationDetails mirror) {
            this.mirror = mirror;
            this.__explicitlySet__.add("mirror");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
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
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
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

        public CreateManagementStationDetails build() {
            CreateManagementStationDetails model =
                    new CreateManagementStationDetails(
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.hostname,
                            this.isAutoConfigEnabled,
                            this.proxy,
                            this.mirror,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateManagementStationDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("hostname")) {
                this.hostname(model.getHostname());
            }
            if (model.wasPropertyExplicitlySet("isAutoConfigEnabled")) {
                this.isAutoConfigEnabled(model.getIsAutoConfigEnabled());
            }
            if (model.wasPropertyExplicitlySet("proxy")) {
                this.proxy(model.getProxy());
            }
            if (model.wasPropertyExplicitlySet("mirror")) {
                this.mirror(model.getMirror());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the management station.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the management station.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * User-friendly name for the management station. Does not have to be unique and you can change the name later. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * User-friendly name for the management station. Does not have to be unique and you can change the name later. Avoid entering confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * User-specified description of the management station. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * User-specified description of the management station. Avoid entering confidential information.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Hostname of the management station.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * Hostname of the management station.
     * @return the value
     **/
    public String getHostname() {
        return hostname;
    }

    /**
     * When enabled, the station setup script automatically runs to configure the firewall and SELinux settings on the station.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoConfigEnabled")
    private final Boolean isAutoConfigEnabled;

    /**
     * When enabled, the station setup script automatically runs to configure the firewall and SELinux settings on the station.
     * @return the value
     **/
    public Boolean getIsAutoConfigEnabled() {
        return isAutoConfigEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("proxy")
    private final CreateProxyConfigurationDetails proxy;

    public CreateProxyConfigurationDetails getProxy() {
        return proxy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("mirror")
    private final CreateMirrorConfigurationDetails mirror;

    public CreateMirrorConfigurationDetails getMirror() {
        return mirror;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
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
        sb.append("CreateManagementStationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", hostname=").append(String.valueOf(this.hostname));
        sb.append(", isAutoConfigEnabled=").append(String.valueOf(this.isAutoConfigEnabled));
        sb.append(", proxy=").append(String.valueOf(this.proxy));
        sb.append(", mirror=").append(String.valueOf(this.mirror));
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
        if (!(o instanceof CreateManagementStationDetails)) {
            return false;
        }

        CreateManagementStationDetails other = (CreateManagementStationDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.isAutoConfigEnabled, other.isAutoConfigEnabled)
                && java.util.Objects.equals(this.proxy, other.proxy)
                && java.util.Objects.equals(this.mirror, other.mirror)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoConfigEnabled == null
                                ? 43
                                : this.isAutoConfigEnabled.hashCode());
        result = (result * PRIME) + (this.proxy == null ? 43 : this.proxy.hashCode());
        result = (result * PRIME) + (this.mirror == null ? 43 : this.mirror.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
