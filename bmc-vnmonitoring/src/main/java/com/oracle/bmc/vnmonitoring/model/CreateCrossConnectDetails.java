/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateCrossConnectDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateCrossConnectDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "crossConnectGroupId",
        "displayName",
        "farCrossConnectOrCrossConnectGroupId",
        "locationName",
        "nearCrossConnectOrCrossConnectGroupId",
        "portSpeedShapeName"
    })
    public CreateCrossConnectDetails(
            String compartmentId,
            String crossConnectGroupId,
            String displayName,
            String farCrossConnectOrCrossConnectGroupId,
            String locationName,
            String nearCrossConnectOrCrossConnectGroupId,
            String portSpeedShapeName) {
        super();
        this.compartmentId = compartmentId;
        this.crossConnectGroupId = crossConnectGroupId;
        this.displayName = displayName;
        this.farCrossConnectOrCrossConnectGroupId = farCrossConnectOrCrossConnectGroupId;
        this.locationName = locationName;
        this.nearCrossConnectOrCrossConnectGroupId = nearCrossConnectOrCrossConnectGroupId;
        this.portSpeedShapeName = portSpeedShapeName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment to contain the cross-connect.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment to contain the cross-connect.
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
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the cross-connect group to put this cross-connect in.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("crossConnectGroupId")
        private String crossConnectGroupId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the cross-connect group to put this cross-connect in.
         *
         * @param crossConnectGroupId the value to set
         * @return this builder
         */
        public Builder crossConnectGroupId(String crossConnectGroupId) {
            this.crossConnectGroupId = crossConnectGroupId;
            this.__explicitlySet__.add("crossConnectGroupId");
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
         * If you already have an existing cross-connect or cross-connect group at this FastConnect
         * location, and you want this new cross-connect to be on a different router (for the
         * purposes of redundancy), provide the
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * that existing cross-connect or cross-connect group.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("farCrossConnectOrCrossConnectGroupId")
        private String farCrossConnectOrCrossConnectGroupId;

        /**
         * If you already have an existing cross-connect or cross-connect group at this FastConnect
         * location, and you want this new cross-connect to be on a different router (for the
         * purposes of redundancy), provide the
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * that existing cross-connect or cross-connect group.
         *
         * @param farCrossConnectOrCrossConnectGroupId the value to set
         * @return this builder
         */
        public Builder farCrossConnectOrCrossConnectGroupId(
                String farCrossConnectOrCrossConnectGroupId) {
            this.farCrossConnectOrCrossConnectGroupId = farCrossConnectOrCrossConnectGroupId;
            this.__explicitlySet__.add("farCrossConnectOrCrossConnectGroupId");
            return this;
        }
        /**
         * The name of the FastConnect location where this cross-connect will be installed. To get a
         * list of the available locations, see {@link
         * #listCrossConnectLocations(ListCrossConnectLocationsRequest) listCrossConnectLocations}.
         *
         * <p>Example: {@code CyrusOne, Chandler, AZ}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("locationName")
        private String locationName;

        /**
         * The name of the FastConnect location where this cross-connect will be installed. To get a
         * list of the available locations, see {@link
         * #listCrossConnectLocations(ListCrossConnectLocationsRequest) listCrossConnectLocations}.
         *
         * <p>Example: {@code CyrusOne, Chandler, AZ}
         *
         * @param locationName the value to set
         * @return this builder
         */
        public Builder locationName(String locationName) {
            this.locationName = locationName;
            this.__explicitlySet__.add("locationName");
            return this;
        }
        /**
         * If you already have an existing cross-connect or cross-connect group at this FastConnect
         * location, and you want this new cross-connect to be on the same router, provide the
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * that existing cross-connect or cross-connect group.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nearCrossConnectOrCrossConnectGroupId")
        private String nearCrossConnectOrCrossConnectGroupId;

        /**
         * If you already have an existing cross-connect or cross-connect group at this FastConnect
         * location, and you want this new cross-connect to be on the same router, provide the
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * that existing cross-connect or cross-connect group.
         *
         * @param nearCrossConnectOrCrossConnectGroupId the value to set
         * @return this builder
         */
        public Builder nearCrossConnectOrCrossConnectGroupId(
                String nearCrossConnectOrCrossConnectGroupId) {
            this.nearCrossConnectOrCrossConnectGroupId = nearCrossConnectOrCrossConnectGroupId;
            this.__explicitlySet__.add("nearCrossConnectOrCrossConnectGroupId");
            return this;
        }
        /**
         * The port speed for this cross-connect. To get a list of the available port speeds, see
         * {@link #listCrossconnectPortSpeedShapes(ListCrossconnectPortSpeedShapesRequest)
         * listCrossconnectPortSpeedShapes}.
         *
         * <p>Example: {@code 10 Gbps}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("portSpeedShapeName")
        private String portSpeedShapeName;

        /**
         * The port speed for this cross-connect. To get a list of the available port speeds, see
         * {@link #listCrossconnectPortSpeedShapes(ListCrossconnectPortSpeedShapesRequest)
         * listCrossconnectPortSpeedShapes}.
         *
         * <p>Example: {@code 10 Gbps}
         *
         * @param portSpeedShapeName the value to set
         * @return this builder
         */
        public Builder portSpeedShapeName(String portSpeedShapeName) {
            this.portSpeedShapeName = portSpeedShapeName;
            this.__explicitlySet__.add("portSpeedShapeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateCrossConnectDetails build() {
            CreateCrossConnectDetails model =
                    new CreateCrossConnectDetails(
                            this.compartmentId,
                            this.crossConnectGroupId,
                            this.displayName,
                            this.farCrossConnectOrCrossConnectGroupId,
                            this.locationName,
                            this.nearCrossConnectOrCrossConnectGroupId,
                            this.portSpeedShapeName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCrossConnectDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("crossConnectGroupId")) {
                this.crossConnectGroupId(model.getCrossConnectGroupId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("farCrossConnectOrCrossConnectGroupId")) {
                this.farCrossConnectOrCrossConnectGroupId(
                        model.getFarCrossConnectOrCrossConnectGroupId());
            }
            if (model.wasPropertyExplicitlySet("locationName")) {
                this.locationName(model.getLocationName());
            }
            if (model.wasPropertyExplicitlySet("nearCrossConnectOrCrossConnectGroupId")) {
                this.nearCrossConnectOrCrossConnectGroupId(
                        model.getNearCrossConnectOrCrossConnectGroupId());
            }
            if (model.wasPropertyExplicitlySet("portSpeedShapeName")) {
                this.portSpeedShapeName(model.getPortSpeedShapeName());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment to contain the cross-connect.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment to contain the cross-connect.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the cross-connect group to put this cross-connect in.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("crossConnectGroupId")
    private final String crossConnectGroupId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the cross-connect group to put this cross-connect in.
     *
     * @return the value
     */
    public String getCrossConnectGroupId() {
        return crossConnectGroupId;
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
     * If you already have an existing cross-connect or cross-connect group at this FastConnect
     * location, and you want this new cross-connect to be on a different router (for the purposes
     * of redundancy), provide the
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of that
     * existing cross-connect or cross-connect group.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("farCrossConnectOrCrossConnectGroupId")
    private final String farCrossConnectOrCrossConnectGroupId;

    /**
     * If you already have an existing cross-connect or cross-connect group at this FastConnect
     * location, and you want this new cross-connect to be on a different router (for the purposes
     * of redundancy), provide the
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of that
     * existing cross-connect or cross-connect group.
     *
     * @return the value
     */
    public String getFarCrossConnectOrCrossConnectGroupId() {
        return farCrossConnectOrCrossConnectGroupId;
    }

    /**
     * The name of the FastConnect location where this cross-connect will be installed. To get a
     * list of the available locations, see {@link
     * #listCrossConnectLocations(ListCrossConnectLocationsRequest) listCrossConnectLocations}.
     *
     * <p>Example: {@code CyrusOne, Chandler, AZ}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("locationName")
    private final String locationName;

    /**
     * The name of the FastConnect location where this cross-connect will be installed. To get a
     * list of the available locations, see {@link
     * #listCrossConnectLocations(ListCrossConnectLocationsRequest) listCrossConnectLocations}.
     *
     * <p>Example: {@code CyrusOne, Chandler, AZ}
     *
     * @return the value
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * If you already have an existing cross-connect or cross-connect group at this FastConnect
     * location, and you want this new cross-connect to be on the same router, provide the
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of that
     * existing cross-connect or cross-connect group.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nearCrossConnectOrCrossConnectGroupId")
    private final String nearCrossConnectOrCrossConnectGroupId;

    /**
     * If you already have an existing cross-connect or cross-connect group at this FastConnect
     * location, and you want this new cross-connect to be on the same router, provide the
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of that
     * existing cross-connect or cross-connect group.
     *
     * @return the value
     */
    public String getNearCrossConnectOrCrossConnectGroupId() {
        return nearCrossConnectOrCrossConnectGroupId;
    }

    /**
     * The port speed for this cross-connect. To get a list of the available port speeds, see {@link
     * #listCrossconnectPortSpeedShapes(ListCrossconnectPortSpeedShapesRequest)
     * listCrossconnectPortSpeedShapes}.
     *
     * <p>Example: {@code 10 Gbps}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("portSpeedShapeName")
    private final String portSpeedShapeName;

    /**
     * The port speed for this cross-connect. To get a list of the available port speeds, see {@link
     * #listCrossconnectPortSpeedShapes(ListCrossconnectPortSpeedShapesRequest)
     * listCrossconnectPortSpeedShapes}.
     *
     * <p>Example: {@code 10 Gbps}
     *
     * @return the value
     */
    public String getPortSpeedShapeName() {
        return portSpeedShapeName;
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
        sb.append("CreateCrossConnectDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", crossConnectGroupId=").append(String.valueOf(this.crossConnectGroupId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", farCrossConnectOrCrossConnectGroupId=")
                .append(String.valueOf(this.farCrossConnectOrCrossConnectGroupId));
        sb.append(", locationName=").append(String.valueOf(this.locationName));
        sb.append(", nearCrossConnectOrCrossConnectGroupId=")
                .append(String.valueOf(this.nearCrossConnectOrCrossConnectGroupId));
        sb.append(", portSpeedShapeName=").append(String.valueOf(this.portSpeedShapeName));
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
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.farCrossConnectOrCrossConnectGroupId,
                        other.farCrossConnectOrCrossConnectGroupId)
                && java.util.Objects.equals(this.locationName, other.locationName)
                && java.util.Objects.equals(
                        this.nearCrossConnectOrCrossConnectGroupId,
                        other.nearCrossConnectOrCrossConnectGroupId)
                && java.util.Objects.equals(this.portSpeedShapeName, other.portSpeedShapeName)
                && super.equals(other);
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.farCrossConnectOrCrossConnectGroupId == null
                                ? 43
                                : this.farCrossConnectOrCrossConnectGroupId.hashCode());
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
