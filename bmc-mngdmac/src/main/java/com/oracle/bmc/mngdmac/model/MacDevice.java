/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mngdmac.model;

/**
 * Represents a MacDevice resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250320")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MacDevice.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MacDevice extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "macOrderId",
        "serialNumber",
        "ipAddress",
        "lifecycleState",
        "shape",
        "timeCreated",
        "timeUpdated",
        "isMarkedDecom",
        "timeDecom"
    })
    public MacDevice(
            String id,
            String compartmentId,
            String macOrderId,
            String serialNumber,
            String ipAddress,
            LifecycleState lifecycleState,
            MacOrder.Shape shape,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            Boolean isMarkedDecom,
            java.util.Date timeDecom) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.macOrderId = macOrderId;
        this.serialNumber = serialNumber;
        this.ipAddress = ipAddress;
        this.lifecycleState = lifecycleState;
        this.shape = shape;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.isMarkedDecom = isMarkedDecom;
        this.timeDecom = timeDecom;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique ID of the MacDevice. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique ID of the MacDevice.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** OCID of the compartment to which the resource belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID of the compartment to which the resource belongs to.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The OCID of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("macOrderId")
        private String macOrderId;

        /**
         * The OCID of the resource.
         *
         * @param macOrderId the value to set
         * @return this builder
         */
        public Builder macOrderId(String macOrderId) {
            this.macOrderId = macOrderId;
            this.__explicitlySet__.add("macOrderId");
            return this;
        }
        /** The serial number of the MacDevice. */
        @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
        private String serialNumber;

        /**
         * The serial number of the MacDevice.
         *
         * @param serialNumber the value to set
         * @return this builder
         */
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            this.__explicitlySet__.add("serialNumber");
            return this;
        }
        /** The IP address assigned to the MacDevice. */
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * The IP address assigned to the MacDevice.
         *
         * @param ipAddress the value to set
         * @return this builder
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /** The current status of the MacDevice. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current status of the MacDevice.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The shape of the Mac. */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private MacOrder.Shape shape;

        /**
         * The shape of the Mac.
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(MacOrder.Shape shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /** The time this resource was created. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time this resource was created. An RFC3339 formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time this resource was last updated. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time this resource was last updated. An RFC3339 formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** A flag that indicates if this MacDevice is decommissioned. */
        @com.fasterxml.jackson.annotation.JsonProperty("isMarkedDecom")
        private Boolean isMarkedDecom;

        /**
         * A flag that indicates if this MacDevice is decommissioned.
         *
         * @param isMarkedDecom the value to set
         * @return this builder
         */
        public Builder isMarkedDecom(Boolean isMarkedDecom) {
            this.isMarkedDecom = isMarkedDecom;
            this.__explicitlySet__.add("isMarkedDecom");
            return this;
        }
        /**
         * An RFC3339-formatted datetime string containing the time this MacDevice was
         * decommissioned.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDecom")
        private java.util.Date timeDecom;

        /**
         * An RFC3339-formatted datetime string containing the time this MacDevice was
         * decommissioned.
         *
         * @param timeDecom the value to set
         * @return this builder
         */
        public Builder timeDecom(java.util.Date timeDecom) {
            this.timeDecom = timeDecom;
            this.__explicitlySet__.add("timeDecom");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MacDevice build() {
            MacDevice model =
                    new MacDevice(
                            this.id,
                            this.compartmentId,
                            this.macOrderId,
                            this.serialNumber,
                            this.ipAddress,
                            this.lifecycleState,
                            this.shape,
                            this.timeCreated,
                            this.timeUpdated,
                            this.isMarkedDecom,
                            this.timeDecom);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MacDevice model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("macOrderId")) {
                this.macOrderId(model.getMacOrderId());
            }
            if (model.wasPropertyExplicitlySet("serialNumber")) {
                this.serialNumber(model.getSerialNumber());
            }
            if (model.wasPropertyExplicitlySet("ipAddress")) {
                this.ipAddress(model.getIpAddress());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("isMarkedDecom")) {
                this.isMarkedDecom(model.getIsMarkedDecom());
            }
            if (model.wasPropertyExplicitlySet("timeDecom")) {
                this.timeDecom(model.getTimeDecom());
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

    /** The unique ID of the MacDevice. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique ID of the MacDevice.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** OCID of the compartment to which the resource belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID of the compartment to which the resource belongs to.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The OCID of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("macOrderId")
    private final String macOrderId;

    /**
     * The OCID of the resource.
     *
     * @return the value
     */
    public String getMacOrderId() {
        return macOrderId;
    }

    /** The serial number of the MacDevice. */
    @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
    private final String serialNumber;

    /**
     * The serial number of the MacDevice.
     *
     * @return the value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** The IP address assigned to the MacDevice. */
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * The IP address assigned to the MacDevice.
     *
     * @return the value
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /** The current status of the MacDevice. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        NeedsAttention("NEEDS_ATTENTION"),
        Deleting("DELETING"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current status of the MacDevice. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current status of the MacDevice.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The shape of the Mac. */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final MacOrder.Shape shape;

    /**
     * The shape of the Mac.
     *
     * @return the value
     */
    public MacOrder.Shape getShape() {
        return shape;
    }

    /** The time this resource was created. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time this resource was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time this resource was last updated. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time this resource was last updated. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** A flag that indicates if this MacDevice is decommissioned. */
    @com.fasterxml.jackson.annotation.JsonProperty("isMarkedDecom")
    private final Boolean isMarkedDecom;

    /**
     * A flag that indicates if this MacDevice is decommissioned.
     *
     * @return the value
     */
    public Boolean getIsMarkedDecom() {
        return isMarkedDecom;
    }

    /**
     * An RFC3339-formatted datetime string containing the time this MacDevice was decommissioned.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDecom")
    private final java.util.Date timeDecom;

    /**
     * An RFC3339-formatted datetime string containing the time this MacDevice was decommissioned.
     *
     * @return the value
     */
    public java.util.Date getTimeDecom() {
        return timeDecom;
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
        sb.append("MacDevice(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", macOrderId=").append(String.valueOf(this.macOrderId));
        sb.append(", serialNumber=").append(String.valueOf(this.serialNumber));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", isMarkedDecom=").append(String.valueOf(this.isMarkedDecom));
        sb.append(", timeDecom=").append(String.valueOf(this.timeDecom));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MacDevice)) {
            return false;
        }

        MacDevice other = (MacDevice) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.macOrderId, other.macOrderId)
                && java.util.Objects.equals(this.serialNumber, other.serialNumber)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.isMarkedDecom, other.isMarkedDecom)
                && java.util.Objects.equals(this.timeDecom, other.timeDecom)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.macOrderId == null ? 43 : this.macOrderId.hashCode());
        result = (result * PRIME) + (this.serialNumber == null ? 43 : this.serialNumber.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.isMarkedDecom == null ? 43 : this.isMarkedDecom.hashCode());
        result = (result * PRIME) + (this.timeDecom == null ? 43 : this.timeDecom.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
