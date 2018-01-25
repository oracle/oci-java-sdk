/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 *
 * <br/>
 * Note: This model distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a set of all
 * explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods
 * are implemented to take {@link #__explicitlySet__} into account. The constructor, on the other hand, does not
 * set {@link #__explicitlySet__} (since the constructor cannot distinguish explicit {@code null} from unset
 * {@code null}). As a consequence, objects should always be created or deserialized using the {@link Builder}.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateCrossConnectDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateCrossConnectDetails build() {
            CreateCrossConnectDetails __instance__ =
                    new CreateCrossConnectDetails(
                            compartmentId,
                            crossConnectGroupId,
                            displayName,
                            farCrossConnectOrCrossConnectGroupId,
                            locationName,
                            nearCrossConnectOrCrossConnectGroupId,
                            portSpeedShapeName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCrossConnectDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .crossConnectGroupId(o.getCrossConnectGroupId())
                            .displayName(o.getDisplayName())
                            .farCrossConnectOrCrossConnectGroupId(
                                    o.getFarCrossConnectOrCrossConnectGroupId())
                            .locationName(o.getLocationName())
                            .nearCrossConnectOrCrossConnectGroupId(
                                    o.getNearCrossConnectOrCrossConnectGroupId())
                            .portSpeedShapeName(o.getPortSpeedShapeName());

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

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
