/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateCrossConnectDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateCrossConnectDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("crossConnectGroupId")
        private String crossConnectGroupId;

        public Builder crossConnectGroupId(String crossConnectGroupId) {
            this.crossConnectGroupId = crossConnectGroupId;
            this.__explicitlySet__.add("crossConnectGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("farCrossConnectOrCrossConnectGroupId")
        private String farCrossConnectOrCrossConnectGroupId;

        public Builder farCrossConnectOrCrossConnectGroupId(
                String farCrossConnectOrCrossConnectGroupId) {
            this.farCrossConnectOrCrossConnectGroupId = farCrossConnectOrCrossConnectGroupId;
            this.__explicitlySet__.add("farCrossConnectOrCrossConnectGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("locationName")
        private String locationName;

        public Builder locationName(String locationName) {
            this.locationName = locationName;
            this.__explicitlySet__.add("locationName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nearCrossConnectOrCrossConnectGroupId")
        private String nearCrossConnectOrCrossConnectGroupId;

        public Builder nearCrossConnectOrCrossConnectGroupId(
                String nearCrossConnectOrCrossConnectGroupId) {
            this.nearCrossConnectOrCrossConnectGroupId = nearCrossConnectOrCrossConnectGroupId;
            this.__explicitlySet__.add("nearCrossConnectOrCrossConnectGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("portSpeedShapeName")
        private String portSpeedShapeName;

        public Builder portSpeedShapeName(String portSpeedShapeName) {
            this.portSpeedShapeName = portSpeedShapeName;
            this.__explicitlySet__.add("portSpeedShapeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customerReferenceName")
        private String customerReferenceName;

        public Builder customerReferenceName(String customerReferenceName) {
            this.customerReferenceName = customerReferenceName;
            this.__explicitlySet__.add("customerReferenceName");
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
                            customerReferenceName);
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
                            .customerReferenceName(o.getCustomerReferenceName());

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

    /**
     * The OCID of the compartment to contain the cross-connect.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The OCID of the cross-connect group to put this cross-connect in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("crossConnectGroupId")
    String crossConnectGroupId;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * If you already have an existing cross-connect or cross-connect group at this FastConnect
     * location, and you want this new cross-connect to be on a different router (for the
     * purposes of redundancy), provide the OCID of that existing cross-connect or
     * cross-connect group.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("farCrossConnectOrCrossConnectGroupId")
    String farCrossConnectOrCrossConnectGroupId;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * The name of the FastConnect location where this cross-connect will be installed.
     * To get a list of the available locations, see
     * {@link #listCrossConnectLocations(ListCrossConnectLocationsRequest) listCrossConnectLocations}.
     * <p>
     * Example: `CyrusOne, Chandler, AZ`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("locationName")
    String locationName;

    /**
     * If you already have an existing cross-connect or cross-connect group at this FastConnect
     * location, and you want this new cross-connect to be on the same router, provide the
     * OCID of that existing cross-connect or cross-connect group.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nearCrossConnectOrCrossConnectGroupId")
    String nearCrossConnectOrCrossConnectGroupId;

    /**
     * The port speed for this cross-connect. To get a list of the available port speeds, see
     * {@link #listCrossconnectPortSpeedShapes(ListCrossconnectPortSpeedShapesRequest) listCrossconnectPortSpeedShapes}.
     * <p>
     * Example: `10 Gbps`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("portSpeedShapeName")
    String portSpeedShapeName;

    /**
     * A reference name or identifier for the physical fiber connection that this cross-connect
     * uses.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerReferenceName")
    String customerReferenceName;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
