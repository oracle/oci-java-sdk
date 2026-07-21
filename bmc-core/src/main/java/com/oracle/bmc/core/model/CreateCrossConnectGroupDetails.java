/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateCrossConnectGroupDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateCrossConnectGroupDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "definedTags",
        "displayName",
        "customerReferenceName",
        "freeformTags",
        "macsecProperties",
        "minimumLinks",
        "isInterfaceHoldTimerEnabled",
        "interfaceDownTimerValueInMilliseconds",
        "isQosEnabled"
    })
    public CreateCrossConnectGroupDetails(
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            String customerReferenceName,
            java.util.Map<String, String> freeformTags,
            CreateMacsecProperties macsecProperties,
            Integer minimumLinks,
            Boolean isInterfaceHoldTimerEnabled,
            Integer interfaceDownTimerValueInMilliseconds,
            Boolean isQosEnabled) {
        super();
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.customerReferenceName = customerReferenceName;
        this.freeformTags = freeformTags;
        this.macsecProperties = macsecProperties;
        this.minimumLinks = minimumLinks;
        this.isInterfaceHoldTimerEnabled = isInterfaceHoldTimerEnabled;
        this.interfaceDownTimerValueInMilliseconds = interfaceDownTimerValueInMilliseconds;
        this.isQosEnabled = isQosEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment to contain the cross-connect group.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment to contain the cross-connect group.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
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
         * A reference name or identifier for the physical fiber connection that this cross-connect
         * group uses.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("customerReferenceName")
        private String customerReferenceName;

        /**
         * A reference name or identifier for the physical fiber connection that this cross-connect
         * group uses.
         *
         * @param customerReferenceName the value to set
         * @return this builder
         */
        public Builder customerReferenceName(String customerReferenceName) {
            this.customerReferenceName = customerReferenceName;
            this.__explicitlySet__.add("customerReferenceName");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("macsecProperties")
        private CreateMacsecProperties macsecProperties;

        public Builder macsecProperties(CreateMacsecProperties macsecProperties) {
            this.macsecProperties = macsecProperties;
            this.__explicitlySet__.add("macsecProperties");
            return this;
        }
        /**
         * (Optional) Minimum number of active cross-connects required for the cross-connect group
         * to be considered operational. During create cross-connect-group operation this value can
         * only be set to 1 (If not specified, this value defaults to 1) and can be edited using the
         * update cross-connect group operation. Value must not exceed the total number of
         * cross-connects in the cross-connect group.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("minimumLinks")
        private Integer minimumLinks;

        /**
         * (Optional) Minimum number of active cross-connects required for the cross-connect group
         * to be considered operational. During create cross-connect-group operation this value can
         * only be set to 1 (If not specified, this value defaults to 1) and can be edited using the
         * update cross-connect group operation. Value must not exceed the total number of
         * cross-connects in the cross-connect group.
         *
         * @param minimumLinks the value to set
         * @return this builder
         */
        public Builder minimumLinks(Integer minimumLinks) {
            this.minimumLinks = minimumLinks;
            this.__explicitlySet__.add("minimumLinks");
            return this;
        }
        /** The flag to enable or disable the down timer for the interface. */
        @com.fasterxml.jackson.annotation.JsonProperty("isInterfaceHoldTimerEnabled")
        private Boolean isInterfaceHoldTimerEnabled;

        /**
         * The flag to enable or disable the down timer for the interface.
         *
         * @param isInterfaceHoldTimerEnabled the value to set
         * @return this builder
         */
        public Builder isInterfaceHoldTimerEnabled(Boolean isInterfaceHoldTimerEnabled) {
            this.isInterfaceHoldTimerEnabled = isInterfaceHoldTimerEnabled;
            this.__explicitlySet__.add("isInterfaceHoldTimerEnabled");
            return this;
        }
        /**
         * The duration of the interface down timer in milliseconds between 0 and 3000 in multiples
         * of 500.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("interfaceDownTimerValueInMilliseconds")
        private Integer interfaceDownTimerValueInMilliseconds;

        /**
         * The duration of the interface down timer in milliseconds between 0 and 3000 in multiples
         * of 500.
         *
         * @param interfaceDownTimerValueInMilliseconds the value to set
         * @return this builder
         */
        public Builder interfaceDownTimerValueInMilliseconds(
                Integer interfaceDownTimerValueInMilliseconds) {
            this.interfaceDownTimerValueInMilliseconds = interfaceDownTimerValueInMilliseconds;
            this.__explicitlySet__.add("interfaceDownTimerValueInMilliseconds");
            return this;
        }
        /**
         * (Optional) When true, restricts placement so cross-connects lands only on QoS-capable
         * devices. When false (default), placement may use any supported device. If no QoS-capable
         * devices are available in the selected location, the request fails.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isQosEnabled")
        private Boolean isQosEnabled;

        /**
         * (Optional) When true, restricts placement so cross-connects lands only on QoS-capable
         * devices. When false (default), placement may use any supported device. If no QoS-capable
         * devices are available in the selected location, the request fails.
         *
         * @param isQosEnabled the value to set
         * @return this builder
         */
        public Builder isQosEnabled(Boolean isQosEnabled) {
            this.isQosEnabled = isQosEnabled;
            this.__explicitlySet__.add("isQosEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateCrossConnectGroupDetails build() {
            CreateCrossConnectGroupDetails model =
                    new CreateCrossConnectGroupDetails(
                            this.compartmentId,
                            this.definedTags,
                            this.displayName,
                            this.customerReferenceName,
                            this.freeformTags,
                            this.macsecProperties,
                            this.minimumLinks,
                            this.isInterfaceHoldTimerEnabled,
                            this.interfaceDownTimerValueInMilliseconds,
                            this.isQosEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCrossConnectGroupDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("customerReferenceName")) {
                this.customerReferenceName(model.getCustomerReferenceName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("macsecProperties")) {
                this.macsecProperties(model.getMacsecProperties());
            }
            if (model.wasPropertyExplicitlySet("minimumLinks")) {
                this.minimumLinks(model.getMinimumLinks());
            }
            if (model.wasPropertyExplicitlySet("isInterfaceHoldTimerEnabled")) {
                this.isInterfaceHoldTimerEnabled(model.getIsInterfaceHoldTimerEnabled());
            }
            if (model.wasPropertyExplicitlySet("interfaceDownTimerValueInMilliseconds")) {
                this.interfaceDownTimerValueInMilliseconds(
                        model.getInterfaceDownTimerValueInMilliseconds());
            }
            if (model.wasPropertyExplicitlySet("isQosEnabled")) {
                this.isQosEnabled(model.getIsQosEnabled());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment to contain the cross-connect group.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment to contain the cross-connect group.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A reference name or identifier for the physical fiber connection that this cross-connect
     * group uses.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("customerReferenceName")
    private final String customerReferenceName;

    /**
     * A reference name or identifier for the physical fiber connection that this cross-connect
     * group uses.
     *
     * @return the value
     */
    public String getCustomerReferenceName() {
        return customerReferenceName;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("macsecProperties")
    private final CreateMacsecProperties macsecProperties;

    public CreateMacsecProperties getMacsecProperties() {
        return macsecProperties;
    }

    /**
     * (Optional) Minimum number of active cross-connects required for the cross-connect group to be
     * considered operational. During create cross-connect-group operation this value can only be
     * set to 1 (If not specified, this value defaults to 1) and can be edited using the update
     * cross-connect group operation. Value must not exceed the total number of cross-connects in
     * the cross-connect group.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minimumLinks")
    private final Integer minimumLinks;

    /**
     * (Optional) Minimum number of active cross-connects required for the cross-connect group to be
     * considered operational. During create cross-connect-group operation this value can only be
     * set to 1 (If not specified, this value defaults to 1) and can be edited using the update
     * cross-connect group operation. Value must not exceed the total number of cross-connects in
     * the cross-connect group.
     *
     * @return the value
     */
    public Integer getMinimumLinks() {
        return minimumLinks;
    }

    /** The flag to enable or disable the down timer for the interface. */
    @com.fasterxml.jackson.annotation.JsonProperty("isInterfaceHoldTimerEnabled")
    private final Boolean isInterfaceHoldTimerEnabled;

    /**
     * The flag to enable or disable the down timer for the interface.
     *
     * @return the value
     */
    public Boolean getIsInterfaceHoldTimerEnabled() {
        return isInterfaceHoldTimerEnabled;
    }

    /**
     * The duration of the interface down timer in milliseconds between 0 and 3000 in multiples of
     * 500.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("interfaceDownTimerValueInMilliseconds")
    private final Integer interfaceDownTimerValueInMilliseconds;

    /**
     * The duration of the interface down timer in milliseconds between 0 and 3000 in multiples of
     * 500.
     *
     * @return the value
     */
    public Integer getInterfaceDownTimerValueInMilliseconds() {
        return interfaceDownTimerValueInMilliseconds;
    }

    /**
     * (Optional) When true, restricts placement so cross-connects lands only on QoS-capable
     * devices. When false (default), placement may use any supported device. If no QoS-capable
     * devices are available in the selected location, the request fails.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isQosEnabled")
    private final Boolean isQosEnabled;

    /**
     * (Optional) When true, restricts placement so cross-connects lands only on QoS-capable
     * devices. When false (default), placement may use any supported device. If no QoS-capable
     * devices are available in the selected location, the request fails.
     *
     * @return the value
     */
    public Boolean getIsQosEnabled() {
        return isQosEnabled;
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
        sb.append("CreateCrossConnectGroupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", customerReferenceName=").append(String.valueOf(this.customerReferenceName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", macsecProperties=").append(String.valueOf(this.macsecProperties));
        sb.append(", minimumLinks=").append(String.valueOf(this.minimumLinks));
        sb.append(", isInterfaceHoldTimerEnabled=")
                .append(String.valueOf(this.isInterfaceHoldTimerEnabled));
        sb.append(", interfaceDownTimerValueInMilliseconds=")
                .append(String.valueOf(this.interfaceDownTimerValueInMilliseconds));
        sb.append(", isQosEnabled=").append(String.valueOf(this.isQosEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateCrossConnectGroupDetails)) {
            return false;
        }

        CreateCrossConnectGroupDetails other = (CreateCrossConnectGroupDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.customerReferenceName, other.customerReferenceName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.macsecProperties, other.macsecProperties)
                && java.util.Objects.equals(this.minimumLinks, other.minimumLinks)
                && java.util.Objects.equals(
                        this.isInterfaceHoldTimerEnabled, other.isInterfaceHoldTimerEnabled)
                && java.util.Objects.equals(
                        this.interfaceDownTimerValueInMilliseconds,
                        other.interfaceDownTimerValueInMilliseconds)
                && java.util.Objects.equals(this.isQosEnabled, other.isQosEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.customerReferenceName == null
                                ? 43
                                : this.customerReferenceName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result =
                (result * PRIME)
                        + (this.macsecProperties == null ? 43 : this.macsecProperties.hashCode());
        result = (result * PRIME) + (this.minimumLinks == null ? 43 : this.minimumLinks.hashCode());
        result =
                (result * PRIME)
                        + (this.isInterfaceHoldTimerEnabled == null
                                ? 43
                                : this.isInterfaceHoldTimerEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.interfaceDownTimerValueInMilliseconds == null
                                ? 43
                                : this.interfaceDownTimerValueInMilliseconds.hashCode());
        result = (result * PRIME) + (this.isQosEnabled == null ? 43 : this.isQosEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
