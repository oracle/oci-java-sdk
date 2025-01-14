/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * The Letter of Authority for the cross-connect. You must submit this letter when requesting
 * cabling for the cross-connect at the FastConnect location. <br>
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
        builder = LetterOfAuthority.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LetterOfAuthority
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "authorizedEntityName",
        "circuitType",
        "crossConnectId",
        "facilityLocation",
        "portName",
        "timeExpires",
        "timeIssued"
    })
    public LetterOfAuthority(
            String authorizedEntityName,
            CircuitType circuitType,
            String crossConnectId,
            String facilityLocation,
            String portName,
            java.util.Date timeExpires,
            java.util.Date timeIssued) {
        super();
        this.authorizedEntityName = authorizedEntityName;
        this.circuitType = circuitType;
        this.crossConnectId = crossConnectId;
        this.facilityLocation = facilityLocation;
        this.portName = portName;
        this.timeExpires = timeExpires;
        this.timeIssued = timeIssued;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the entity authorized by this Letter of Authority. */
        @com.fasterxml.jackson.annotation.JsonProperty("authorizedEntityName")
        private String authorizedEntityName;

        /**
         * The name of the entity authorized by this Letter of Authority.
         *
         * @param authorizedEntityName the value to set
         * @return this builder
         */
        public Builder authorizedEntityName(String authorizedEntityName) {
            this.authorizedEntityName = authorizedEntityName;
            this.__explicitlySet__.add("authorizedEntityName");
            return this;
        }
        /** The type of cross-connect fiber, termination, and optical specification. */
        @com.fasterxml.jackson.annotation.JsonProperty("circuitType")
        private CircuitType circuitType;

        /**
         * The type of cross-connect fiber, termination, and optical specification.
         *
         * @param circuitType the value to set
         * @return this builder
         */
        public Builder circuitType(CircuitType circuitType) {
            this.circuitType = circuitType;
            this.__explicitlySet__.add("circuitType");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the cross-connect.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("crossConnectId")
        private String crossConnectId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the cross-connect.
         *
         * @param crossConnectId the value to set
         * @return this builder
         */
        public Builder crossConnectId(String crossConnectId) {
            this.crossConnectId = crossConnectId;
            this.__explicitlySet__.add("crossConnectId");
            return this;
        }
        /** The address of the FastConnect location. */
        @com.fasterxml.jackson.annotation.JsonProperty("facilityLocation")
        private String facilityLocation;

        /**
         * The address of the FastConnect location.
         *
         * @param facilityLocation the value to set
         * @return this builder
         */
        public Builder facilityLocation(String facilityLocation) {
            this.facilityLocation = facilityLocation;
            this.__explicitlySet__.add("facilityLocation");
            return this;
        }
        /** The meet-me room port for this cross-connect. */
        @com.fasterxml.jackson.annotation.JsonProperty("portName")
        private String portName;

        /**
         * The meet-me room port for this cross-connect.
         *
         * @param portName the value to set
         * @return this builder
         */
        public Builder portName(String portName) {
            this.portName = portName;
            this.__explicitlySet__.add("portName");
            return this;
        }
        /**
         * The date and time when the Letter of Authority expires, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
        private java.util.Date timeExpires;

        /**
         * The date and time when the Letter of Authority expires, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeExpires the value to set
         * @return this builder
         */
        public Builder timeExpires(java.util.Date timeExpires) {
            this.timeExpires = timeExpires;
            this.__explicitlySet__.add("timeExpires");
            return this;
        }
        /**
         * The date and time the Letter of Authority was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeIssued")
        private java.util.Date timeIssued;

        /**
         * The date and time the Letter of Authority was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeIssued the value to set
         * @return this builder
         */
        public Builder timeIssued(java.util.Date timeIssued) {
            this.timeIssued = timeIssued;
            this.__explicitlySet__.add("timeIssued");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LetterOfAuthority build() {
            LetterOfAuthority model =
                    new LetterOfAuthority(
                            this.authorizedEntityName,
                            this.circuitType,
                            this.crossConnectId,
                            this.facilityLocation,
                            this.portName,
                            this.timeExpires,
                            this.timeIssued);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LetterOfAuthority model) {
            if (model.wasPropertyExplicitlySet("authorizedEntityName")) {
                this.authorizedEntityName(model.getAuthorizedEntityName());
            }
            if (model.wasPropertyExplicitlySet("circuitType")) {
                this.circuitType(model.getCircuitType());
            }
            if (model.wasPropertyExplicitlySet("crossConnectId")) {
                this.crossConnectId(model.getCrossConnectId());
            }
            if (model.wasPropertyExplicitlySet("facilityLocation")) {
                this.facilityLocation(model.getFacilityLocation());
            }
            if (model.wasPropertyExplicitlySet("portName")) {
                this.portName(model.getPortName());
            }
            if (model.wasPropertyExplicitlySet("timeExpires")) {
                this.timeExpires(model.getTimeExpires());
            }
            if (model.wasPropertyExplicitlySet("timeIssued")) {
                this.timeIssued(model.getTimeIssued());
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

    /** The name of the entity authorized by this Letter of Authority. */
    @com.fasterxml.jackson.annotation.JsonProperty("authorizedEntityName")
    private final String authorizedEntityName;

    /**
     * The name of the entity authorized by this Letter of Authority.
     *
     * @return the value
     */
    public String getAuthorizedEntityName() {
        return authorizedEntityName;
    }

    /** The type of cross-connect fiber, termination, and optical specification. */
    public enum CircuitType implements com.oracle.bmc.http.internal.BmcEnum {
        SingleModeLc("Single_mode_LC"),
        SingleModeSc("Single_mode_SC"),
        ;

        private final String value;
        private static java.util.Map<String, CircuitType> map;

        static {
            map = new java.util.HashMap<>();
            for (CircuitType v : CircuitType.values()) {
                map.put(v.getValue(), v);
            }
        }

        CircuitType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CircuitType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid CircuitType: " + key);
        }
    };
    /** The type of cross-connect fiber, termination, and optical specification. */
    @com.fasterxml.jackson.annotation.JsonProperty("circuitType")
    private final CircuitType circuitType;

    /**
     * The type of cross-connect fiber, termination, and optical specification.
     *
     * @return the value
     */
    public CircuitType getCircuitType() {
        return circuitType;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the cross-connect.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("crossConnectId")
    private final String crossConnectId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the cross-connect.
     *
     * @return the value
     */
    public String getCrossConnectId() {
        return crossConnectId;
    }

    /** The address of the FastConnect location. */
    @com.fasterxml.jackson.annotation.JsonProperty("facilityLocation")
    private final String facilityLocation;

    /**
     * The address of the FastConnect location.
     *
     * @return the value
     */
    public String getFacilityLocation() {
        return facilityLocation;
    }

    /** The meet-me room port for this cross-connect. */
    @com.fasterxml.jackson.annotation.JsonProperty("portName")
    private final String portName;

    /**
     * The meet-me room port for this cross-connect.
     *
     * @return the value
     */
    public String getPortName() {
        return portName;
    }

    /**
     * The date and time when the Letter of Authority expires, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
    private final java.util.Date timeExpires;

    /**
     * The date and time when the Letter of Authority expires, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeExpires() {
        return timeExpires;
    }

    /**
     * The date and time the Letter of Authority was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeIssued")
    private final java.util.Date timeIssued;

    /**
     * The date and time the Letter of Authority was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeIssued() {
        return timeIssued;
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
        sb.append("LetterOfAuthority(");
        sb.append("super=").append(super.toString());
        sb.append("authorizedEntityName=").append(String.valueOf(this.authorizedEntityName));
        sb.append(", circuitType=").append(String.valueOf(this.circuitType));
        sb.append(", crossConnectId=").append(String.valueOf(this.crossConnectId));
        sb.append(", facilityLocation=").append(String.valueOf(this.facilityLocation));
        sb.append(", portName=").append(String.valueOf(this.portName));
        sb.append(", timeExpires=").append(String.valueOf(this.timeExpires));
        sb.append(", timeIssued=").append(String.valueOf(this.timeIssued));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LetterOfAuthority)) {
            return false;
        }

        LetterOfAuthority other = (LetterOfAuthority) o;
        return java.util.Objects.equals(this.authorizedEntityName, other.authorizedEntityName)
                && java.util.Objects.equals(this.circuitType, other.circuitType)
                && java.util.Objects.equals(this.crossConnectId, other.crossConnectId)
                && java.util.Objects.equals(this.facilityLocation, other.facilityLocation)
                && java.util.Objects.equals(this.portName, other.portName)
                && java.util.Objects.equals(this.timeExpires, other.timeExpires)
                && java.util.Objects.equals(this.timeIssued, other.timeIssued)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.authorizedEntityName == null
                                ? 43
                                : this.authorizedEntityName.hashCode());
        result = (result * PRIME) + (this.circuitType == null ? 43 : this.circuitType.hashCode());
        result =
                (result * PRIME)
                        + (this.crossConnectId == null ? 43 : this.crossConnectId.hashCode());
        result =
                (result * PRIME)
                        + (this.facilityLocation == null ? 43 : this.facilityLocation.hashCode());
        result = (result * PRIME) + (this.portName == null ? 43 : this.portName.hashCode());
        result = (result * PRIME) + (this.timeExpires == null ? 43 : this.timeExpires.hashCode());
        result = (result * PRIME) + (this.timeIssued == null ? 43 : this.timeIssued.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
