/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * A Data Safe configuration for a tenancy and region.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DataSafeConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DataSafeConfiguration
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isEnabled",
        "url",
        "compartmentId",
        "timeEnabled",
        "lifecycleState",
        "dataSafeNatGatewayIpAddress",
        "globalSettings",
        "freeformTags",
        "definedTags"
    })
    public DataSafeConfiguration(
            Boolean isEnabled,
            String url,
            String compartmentId,
            java.util.Date timeEnabled,
            LifecycleState lifecycleState,
            String dataSafeNatGatewayIpAddress,
            GlobalSettings globalSettings,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.isEnabled = isEnabled;
        this.url = url;
        this.compartmentId = compartmentId;
        this.timeEnabled = timeEnabled;
        this.lifecycleState = lifecycleState;
        this.dataSafeNatGatewayIpAddress = dataSafeNatGatewayIpAddress;
        this.globalSettings = globalSettings;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates if Data Safe is enabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Indicates if Data Safe is enabled.
         * @param isEnabled the value to set
         * @return this builder
         **/
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * The URL of the Data Safe service.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * The URL of the Data Safe service.
         * @param url the value to set
         * @return this builder
         **/
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }
        /**
         * The OCID of the tenancy used to enable Data Safe.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the tenancy used to enable Data Safe.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The date and time Data Safe was enabled, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnabled")
        private java.util.Date timeEnabled;

        /**
         * The date and time Data Safe was enabled, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * @param timeEnabled the value to set
         * @return this builder
         **/
        public Builder timeEnabled(java.util.Date timeEnabled) {
            this.timeEnabled = timeEnabled;
            this.__explicitlySet__.add("timeEnabled");
            return this;
        }
        /**
         * The current state of Data Safe.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of Data Safe.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The Oracle Data Safe's NAT Gateway IP Address.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataSafeNatGatewayIpAddress")
        private String dataSafeNatGatewayIpAddress;

        /**
         * The Oracle Data Safe's NAT Gateway IP Address.
         *
         * @param dataSafeNatGatewayIpAddress the value to set
         * @return this builder
         **/
        public Builder dataSafeNatGatewayIpAddress(String dataSafeNatGatewayIpAddress) {
            this.dataSafeNatGatewayIpAddress = dataSafeNatGatewayIpAddress;
            this.__explicitlySet__.add("dataSafeNatGatewayIpAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("globalSettings")
        private GlobalSettings globalSettings;

        public Builder globalSettings(GlobalSettings globalSettings) {
            this.globalSettings = globalSettings;
            this.__explicitlySet__.add("globalSettings");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
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

        public DataSafeConfiguration build() {
            DataSafeConfiguration model =
                    new DataSafeConfiguration(
                            this.isEnabled,
                            this.url,
                            this.compartmentId,
                            this.timeEnabled,
                            this.lifecycleState,
                            this.dataSafeNatGatewayIpAddress,
                            this.globalSettings,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataSafeConfiguration model) {
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("url")) {
                this.url(model.getUrl());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("timeEnabled")) {
                this.timeEnabled(model.getTimeEnabled());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("dataSafeNatGatewayIpAddress")) {
                this.dataSafeNatGatewayIpAddress(model.getDataSafeNatGatewayIpAddress());
            }
            if (model.wasPropertyExplicitlySet("globalSettings")) {
                this.globalSettings(model.getGlobalSettings());
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
     * Indicates if Data Safe is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Indicates if Data Safe is enabled.
     * @return the value
     **/
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * The URL of the Data Safe service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * The URL of the Data Safe service.
     * @return the value
     **/
    public String getUrl() {
        return url;
    }

    /**
     * The OCID of the tenancy used to enable Data Safe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the tenancy used to enable Data Safe.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The date and time Data Safe was enabled, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnabled")
    private final java.util.Date timeEnabled;

    /**
     * The date and time Data Safe was enabled, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeEnabled() {
        return timeEnabled;
    }

    /**
     * The current state of Data Safe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of Data Safe.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The Oracle Data Safe's NAT Gateway IP Address.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataSafeNatGatewayIpAddress")
    private final String dataSafeNatGatewayIpAddress;

    /**
     * The Oracle Data Safe's NAT Gateway IP Address.
     *
     * @return the value
     **/
    public String getDataSafeNatGatewayIpAddress() {
        return dataSafeNatGatewayIpAddress;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("globalSettings")
    private final GlobalSettings globalSettings;

    public GlobalSettings getGlobalSettings() {
        return globalSettings;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
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
        sb.append("DataSafeConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeEnabled=").append(String.valueOf(this.timeEnabled));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", dataSafeNatGatewayIpAddress=")
                .append(String.valueOf(this.dataSafeNatGatewayIpAddress));
        sb.append(", globalSettings=").append(String.valueOf(this.globalSettings));
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
        if (!(o instanceof DataSafeConfiguration)) {
            return false;
        }

        DataSafeConfiguration other = (DataSafeConfiguration) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.url, other.url)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeEnabled, other.timeEnabled)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(
                        this.dataSafeNatGatewayIpAddress, other.dataSafeNatGatewayIpAddress)
                && java.util.Objects.equals(this.globalSettings, other.globalSettings)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.timeEnabled == null ? 43 : this.timeEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.dataSafeNatGatewayIpAddress == null
                                ? 43
                                : this.dataSafeNatGatewayIpAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.globalSettings == null ? 43 : this.globalSettings.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
