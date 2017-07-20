/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateCrossConnectDetails.Builder.class
)
public class CreateCrossConnectDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        @com.fasterxml.jackson.annotation.JsonProperty("crossConnectGroupId")
        private String crossConnectGroupId;

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        @com.fasterxml.jackson.annotation.JsonProperty("farCrossConnectOrCrossConnectGroupId")
        private String farCrossConnectOrCrossConnectGroupId;

        @com.fasterxml.jackson.annotation.JsonProperty("locationName")
        private String locationName;

        @com.fasterxml.jackson.annotation.JsonProperty("nearCrossConnectOrCrossConnectGroupId")
        private String nearCrossConnectOrCrossConnectGroupId;

        @com.fasterxml.jackson.annotation.JsonProperty("portSpeedShapeName")
        private String portSpeedShapeName;

        public CreateCrossConnectDetails build() {
            return new CreateCrossConnectDetails(
                    compartmentId,
                    crossConnectGroupId,
                    displayName,
                    farCrossConnectOrCrossConnectGroupId,
                    locationName,
                    nearCrossConnectOrCrossConnectGroupId,
                    portSpeedShapeName);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCrossConnectDetails o) {
            return compartmentId(o.getCompartmentId())
                    .crossConnectGroupId(o.getCrossConnectGroupId())
                    .displayName(o.getDisplayName())
                    .farCrossConnectOrCrossConnectGroupId(
                            o.getFarCrossConnectOrCrossConnectGroupId())
                    .locationName(o.getLocationName())
                    .nearCrossConnectOrCrossConnectGroupId(
                            o.getNearCrossConnectOrCrossConnectGroupId())
                    .portSpeedShapeName(o.getPortSpeedShapeName());
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
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String compartmentId;

    /**
     * The OCID of the cross-connect group to put this cross-connect in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("crossConnectGroupId")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String crossConnectGroupId;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String displayName;

    /**
     * If you already have an existing cross-connect or cross-connect group at this FastConnect
     * location, and you want this new cross-connect to be on a different router (for the
     * purposes of redundancy), provide the OCID of that existing cross-connect or
     * cross-connect group.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("farCrossConnectOrCrossConnectGroupId")
    @javax.validation.constraints.Size(min = 1, max = 255)
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
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String locationName;

    /**
     * If you already have an existing cross-connect or cross-connect group at this FastConnect
     * location, and you want this new cross-connect to be on the same router, provide the
     * OCID of that existing cross-connect or cross-connect group.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nearCrossConnectOrCrossConnectGroupId")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String nearCrossConnectOrCrossConnectGroupId;

    /**
     * The port speed for this cross-connect. To get a list of the available port speeds, see
     * {@link #listCrossconnectPortSpeedShapes(ListCrossconnectPortSpeedShapesRequest) listCrossconnectPortSpeedShapes}.
     * <p>
     * Example: `10 Gbps`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("portSpeedShapeName")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String portSpeedShapeName;
}
