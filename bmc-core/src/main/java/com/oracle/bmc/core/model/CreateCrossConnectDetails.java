/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
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
    builder = CreateCrossConnectDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateCrossConnectDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "crossConnectGroupId",
        "definedTags",
        "displayName",
        "farCrossConnectOrCrossConnectGroupId",
        "freeformTags",
        "locationName",
        "nearCrossConnectOrCrossConnectGroupId",
        "portSpeedShapeName",
        "customerReferenceName",
        "macsecProperties"
    })
    public CreateCrossConnectDetails(
            String compartmentId,
            String crossConnectGroupId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            String farCrossConnectOrCrossConnectGroupId,
            java.util.Map<String, String> freeformTags,
            String locationName,
            String nearCrossConnectOrCrossConnectGroupId,
            String portSpeedShapeName,
            String customerReferenceName,
            CreateMacsecProperties macsecProperties) {
        super();
        this.compartmentId = compartmentId;
        this.crossConnectGroupId = crossConnectGroupId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.farCrossConnectOrCrossConnectGroupId = farCrossConnectOrCrossConnectGroupId;
        this.freeformTags = freeformTags;
        this.locationName = locationName;
        this.nearCrossConnectOrCrossConnectGroupId = nearCrossConnectOrCrossConnectGroupId;
        this.portSpeedShapeName = portSpeedShapeName;
        this.customerReferenceName = customerReferenceName;
        this.macsecProperties = macsecProperties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to contain the cross-connect.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to contain the cross-connect.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cross-connect group to put this cross-connect in.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("crossConnectGroupId")
        private String crossConnectGroupId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cross-connect group to put this cross-connect in.
         *
         * @param crossConnectGroupId the value to set
         * @return this builder
         **/
        public Builder crossConnectGroupId(String crossConnectGroupId) {
            this.crossConnectGroupId = crossConnectGroupId;
            this.__explicitlySet__.add("crossConnectGroupId");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
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
         * If you already have an existing cross-connect or cross-connect group at this FastConnect
         * location, and you want this new cross-connect to be on a different router (for the
         * purposes of redundancy), provide the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of that existing cross-connect or
         * cross-connect group.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("farCrossConnectOrCrossConnectGroupId")
        private String farCrossConnectOrCrossConnectGroupId;

        /**
         * If you already have an existing cross-connect or cross-connect group at this FastConnect
         * location, and you want this new cross-connect to be on a different router (for the
         * purposes of redundancy), provide the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of that existing cross-connect or
         * cross-connect group.
         *
         * @param farCrossConnectOrCrossConnectGroupId the value to set
         * @return this builder
         **/
        public Builder farCrossConnectOrCrossConnectGroupId(
                String farCrossConnectOrCrossConnectGroupId) {
            this.farCrossConnectOrCrossConnectGroupId = farCrossConnectOrCrossConnectGroupId;
            this.__explicitlySet__.add("farCrossConnectOrCrossConnectGroupId");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * The name of the FastConnect location where this cross-connect will be installed.
         * To get a list of the available locations, see
         * {@link #listCrossConnectLocations(ListCrossConnectLocationsRequest) listCrossConnectLocations}.
         * <p>
         * Example: {@code CyrusOne, Chandler, AZ}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("locationName")
        private String locationName;

        /**
         * The name of the FastConnect location where this cross-connect will be installed.
         * To get a list of the available locations, see
         * {@link #listCrossConnectLocations(ListCrossConnectLocationsRequest) listCrossConnectLocations}.
         * <p>
         * Example: {@code CyrusOne, Chandler, AZ}
         *
         * @param locationName the value to set
         * @return this builder
         **/
        public Builder locationName(String locationName) {
            this.locationName = locationName;
            this.__explicitlySet__.add("locationName");
            return this;
        }
        /**
         * If you already have an existing cross-connect or cross-connect group at this FastConnect
         * location, and you want this new cross-connect to be on the same router, provide the
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of that existing cross-connect or cross-connect group.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nearCrossConnectOrCrossConnectGroupId")
        private String nearCrossConnectOrCrossConnectGroupId;

        /**
         * If you already have an existing cross-connect or cross-connect group at this FastConnect
         * location, and you want this new cross-connect to be on the same router, provide the
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of that existing cross-connect or cross-connect group.
         *
         * @param nearCrossConnectOrCrossConnectGroupId the value to set
         * @return this builder
         **/
        public Builder nearCrossConnectOrCrossConnectGroupId(
                String nearCrossConnectOrCrossConnectGroupId) {
            this.nearCrossConnectOrCrossConnectGroupId = nearCrossConnectOrCrossConnectGroupId;
            this.__explicitlySet__.add("nearCrossConnectOrCrossConnectGroupId");
            return this;
        }
        /**
         * The port speed for this cross-connect. To get a list of the available port speeds, see
         * {@link #listCrossconnectPortSpeedShapes(ListCrossconnectPortSpeedShapesRequest) listCrossconnectPortSpeedShapes}.
         * <p>
         * Example: {@code 10 Gbps}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("portSpeedShapeName")
        private String portSpeedShapeName;

        /**
         * The port speed for this cross-connect. To get a list of the available port speeds, see
         * {@link #listCrossconnectPortSpeedShapes(ListCrossconnectPortSpeedShapesRequest) listCrossconnectPortSpeedShapes}.
         * <p>
         * Example: {@code 10 Gbps}
         *
         * @param portSpeedShapeName the value to set
         * @return this builder
         **/
        public Builder portSpeedShapeName(String portSpeedShapeName) {
            this.portSpeedShapeName = portSpeedShapeName;
            this.__explicitlySet__.add("portSpeedShapeName");
            return this;
        }
        /**
         * A reference name or identifier for the physical fiber connection that this cross-connect
         * uses.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customerReferenceName")
        private String customerReferenceName;

        /**
         * A reference name or identifier for the physical fiber connection that this cross-connect
         * uses.
         *
         * @param customerReferenceName the value to set
         * @return this builder
         **/
        public Builder customerReferenceName(String customerReferenceName) {
            this.customerReferenceName = customerReferenceName;
            this.__explicitlySet__.add("customerReferenceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("macsecProperties")
        private CreateMacsecProperties macsecProperties;

        public Builder macsecProperties(CreateMacsecProperties macsecProperties) {
            this.macsecProperties = macsecProperties;
            this.__explicitlySet__.add("macsecProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateCrossConnectDetails build() {
            CreateCrossConnectDetails __instance__ =
                    new CreateCrossConnectDetails(
                            compartmentId,
                            crossConnectGroupId,
                            definedTags,
                            displayName,
                            farCrossConnectOrCrossConnectGroupId,
                            freeformTags,
                            locationName,
                            nearCrossConnectOrCrossConnectGroupId,
                            portSpeedShapeName,
                            customerReferenceName,
                            macsecProperties);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCrossConnectDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .crossConnectGroupId(o.getCrossConnectGroupId())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .farCrossConnectOrCrossConnectGroupId(
                                    o.getFarCrossConnectOrCrossConnectGroupId())
                            .freeformTags(o.getFreeformTags())
                            .locationName(o.getLocationName())
                            .nearCrossConnectOrCrossConnectGroupId(
                                    o.getNearCrossConnectOrCrossConnectGroupId())
                            .portSpeedShapeName(o.getPortSpeedShapeName())
                            .customerReferenceName(o.getCustomerReferenceName())
                            .macsecProperties(o.getMacsecProperties());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to contain the cross-connect.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to contain the cross-connect.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cross-connect group to put this cross-connect in.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("crossConnectGroupId")
    private final String crossConnectGroupId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cross-connect group to put this cross-connect in.
     *
     * @return the value
     **/
    public String getCrossConnectGroupId() {
        return crossConnectGroupId;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
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
     * If you already have an existing cross-connect or cross-connect group at this FastConnect
     * location, and you want this new cross-connect to be on a different router (for the
     * purposes of redundancy), provide the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of that existing cross-connect or
     * cross-connect group.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("farCrossConnectOrCrossConnectGroupId")
    private final String farCrossConnectOrCrossConnectGroupId;

    /**
     * If you already have an existing cross-connect or cross-connect group at this FastConnect
     * location, and you want this new cross-connect to be on a different router (for the
     * purposes of redundancy), provide the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of that existing cross-connect or
     * cross-connect group.
     *
     * @return the value
     **/
    public String getFarCrossConnectOrCrossConnectGroupId() {
        return farCrossConnectOrCrossConnectGroupId;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The name of the FastConnect location where this cross-connect will be installed.
     * To get a list of the available locations, see
     * {@link #listCrossConnectLocations(ListCrossConnectLocationsRequest) listCrossConnectLocations}.
     * <p>
     * Example: {@code CyrusOne, Chandler, AZ}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("locationName")
    private final String locationName;

    /**
     * The name of the FastConnect location where this cross-connect will be installed.
     * To get a list of the available locations, see
     * {@link #listCrossConnectLocations(ListCrossConnectLocationsRequest) listCrossConnectLocations}.
     * <p>
     * Example: {@code CyrusOne, Chandler, AZ}
     *
     * @return the value
     **/
    public String getLocationName() {
        return locationName;
    }

    /**
     * If you already have an existing cross-connect or cross-connect group at this FastConnect
     * location, and you want this new cross-connect to be on the same router, provide the
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of that existing cross-connect or cross-connect group.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nearCrossConnectOrCrossConnectGroupId")
    private final String nearCrossConnectOrCrossConnectGroupId;

    /**
     * If you already have an existing cross-connect or cross-connect group at this FastConnect
     * location, and you want this new cross-connect to be on the same router, provide the
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of that existing cross-connect or cross-connect group.
     *
     * @return the value
     **/
    public String getNearCrossConnectOrCrossConnectGroupId() {
        return nearCrossConnectOrCrossConnectGroupId;
    }

    /**
     * The port speed for this cross-connect. To get a list of the available port speeds, see
     * {@link #listCrossconnectPortSpeedShapes(ListCrossconnectPortSpeedShapesRequest) listCrossconnectPortSpeedShapes}.
     * <p>
     * Example: {@code 10 Gbps}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("portSpeedShapeName")
    private final String portSpeedShapeName;

    /**
     * The port speed for this cross-connect. To get a list of the available port speeds, see
     * {@link #listCrossconnectPortSpeedShapes(ListCrossconnectPortSpeedShapesRequest) listCrossconnectPortSpeedShapes}.
     * <p>
     * Example: {@code 10 Gbps}
     *
     * @return the value
     **/
    public String getPortSpeedShapeName() {
        return portSpeedShapeName;
    }

    /**
     * A reference name or identifier for the physical fiber connection that this cross-connect
     * uses.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerReferenceName")
    private final String customerReferenceName;

    /**
     * A reference name or identifier for the physical fiber connection that this cross-connect
     * uses.
     *
     * @return the value
     **/
    public String getCustomerReferenceName() {
        return customerReferenceName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("macsecProperties")
    private final CreateMacsecProperties macsecProperties;

    public CreateMacsecProperties getMacsecProperties() {
        return macsecProperties;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateCrossConnectDetails(");
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", crossConnectGroupId=").append(String.valueOf(this.crossConnectGroupId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", farCrossConnectOrCrossConnectGroupId=")
                .append(String.valueOf(this.farCrossConnectOrCrossConnectGroupId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", locationName=").append(String.valueOf(this.locationName));
        sb.append(", nearCrossConnectOrCrossConnectGroupId=")
                .append(String.valueOf(this.nearCrossConnectOrCrossConnectGroupId));
        sb.append(", portSpeedShapeName=").append(String.valueOf(this.portSpeedShapeName));
        sb.append(", customerReferenceName=").append(String.valueOf(this.customerReferenceName));
        sb.append(", macsecProperties=").append(String.valueOf(this.macsecProperties));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateCrossConnectDetails)) {
            return false;
        }

        CreateCrossConnectDetails other = (CreateCrossConnectDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.crossConnectGroupId, other.crossConnectGroupId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.farCrossConnectOrCrossConnectGroupId,
                        other.farCrossConnectOrCrossConnectGroupId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.locationName, other.locationName)
                && java.util.Objects.equals(
                        this.nearCrossConnectOrCrossConnectGroupId,
                        other.nearCrossConnectOrCrossConnectGroupId)
                && java.util.Objects.equals(this.portSpeedShapeName, other.portSpeedShapeName)
                && java.util.Objects.equals(this.customerReferenceName, other.customerReferenceName)
                && java.util.Objects.equals(this.macsecProperties, other.macsecProperties)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.crossConnectGroupId == null
                                ? 43
                                : this.crossConnectGroupId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.farCrossConnectOrCrossConnectGroupId == null
                                ? 43
                                : this.farCrossConnectOrCrossConnectGroupId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.locationName == null ? 43 : this.locationName.hashCode());
        result =
                (result * PRIME)
                        + (this.nearCrossConnectOrCrossConnectGroupId == null
                                ? 43
                                : this.nearCrossConnectOrCrossConnectGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.portSpeedShapeName == null
                                ? 43
                                : this.portSpeedShapeName.hashCode());
        result =
                (result * PRIME)
                        + (this.customerReferenceName == null
                                ? 43
                                : this.customerReferenceName.hashCode());
        result =
                (result * PRIME)
                        + (this.macsecProperties == null ? 43 : this.macsecProperties.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
