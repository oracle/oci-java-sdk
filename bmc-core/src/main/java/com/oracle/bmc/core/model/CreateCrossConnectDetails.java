/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = CreateCrossConnectDetails.Builder.class)
public class CreateCrossConnectDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("crossConnectGroupId")
        private String crossConnectGroupId;

        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("farCrossConnectOrCrossConnectGroupId")
        private String farCrossConnectOrCrossConnectGroupId;

        @JsonProperty("locationName")
        private String locationName;

        @JsonProperty("nearCrossConnectOrCrossConnectGroupId")
        private String nearCrossConnectOrCrossConnectGroupId;

        @JsonProperty("portSpeedShapeName")
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

        @JsonIgnore
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
    @JsonProperty("compartmentId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String compartmentId;

    /**
     * The OCID of the cross-connect group to put this cross-connect in.
     **/
    @JsonProperty("crossConnectGroupId")
    @Size(min = 1, max = 255)
    String crossConnectGroupId;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     **/
    @JsonProperty("displayName")
    @Size(min = 1, max = 255)
    String displayName;

    /**
     * If you already have an existing cross-connect or cross-connect group at this FastConnect
     * location, and you want this new cross-connect to be on a different router (for the
     * purposes of redundancy), provide the OCID of that existing cross-connect or
     * cross-connect group.
     *
     **/
    @JsonProperty("farCrossConnectOrCrossConnectGroupId")
    @Size(min = 1, max = 255)
    String farCrossConnectOrCrossConnectGroupId;

    /**
     * The name of the FastConnect location where this cross-connect will be installed.
     * To get a list of the available locations, see
     * {@link #listCrossConnectLocations(ListCrossConnectLocationsRequest) listCrossConnectLocations}.
     * <p>
     * Example: `CyrusOne, Chandler, AZ`
     *
     **/
    @JsonProperty("locationName")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String locationName;

    /**
     * If you already have an existing cross-connect or cross-connect group at this FastConnect
     * location, and you want this new cross-connect to be on the same router, provide the
     * OCID of that existing cross-connect or cross-connect group.
     *
     **/
    @JsonProperty("nearCrossConnectOrCrossConnectGroupId")
    @Size(min = 1, max = 255)
    String nearCrossConnectOrCrossConnectGroupId;

    /**
     * The port speed for this cross-connect. To get a list of the available port speeds, see
     * {@link #listCrossconnectPortSpeedShapes(ListCrossconnectPortSpeedShapesRequest) listCrossconnectPortSpeedShapes}.
     * <p>
     * Example: `10 Gbps`
     *
     **/
    @JsonProperty("portSpeedShapeName")
    @Valid
    @NotNull
    String portSpeedShapeName;
}
