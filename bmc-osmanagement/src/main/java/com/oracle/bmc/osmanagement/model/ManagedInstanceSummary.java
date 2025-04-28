/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * An OCI Compute instance that is being managed <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ManagedInstanceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagedInstanceSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "id",
        "lastCheckin",
        "lastBoot",
        "updatesAvailable",
        "compartmentId",
        "description",
        "status",
        "osFamily",
        "isRebootRequired"
    })
    public ManagedInstanceSummary(
            String displayName,
            String id,
            String lastCheckin,
            String lastBoot,
            Integer updatesAvailable,
            String compartmentId,
            String description,
            Status status,
            OsFamilies osFamily,
            Boolean isRebootRequired) {
        super();
        this.displayName = displayName;
        this.id = id;
        this.lastCheckin = lastCheckin;
        this.lastBoot = lastBoot;
        this.updatesAvailable = updatesAvailable;
        this.compartmentId = compartmentId;
        this.description = description;
        this.status = status;
        this.osFamily = osFamily;
        this.isRebootRequired = isRebootRequired;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** user settable name */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * user settable name
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** OCID for the managed instance */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * OCID for the managed instance
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Time at which the instance last checked in */
        @com.fasterxml.jackson.annotation.JsonProperty("lastCheckin")
        private String lastCheckin;

        /**
         * Time at which the instance last checked in
         *
         * @param lastCheckin the value to set
         * @return this builder
         */
        public Builder lastCheckin(String lastCheckin) {
            this.lastCheckin = lastCheckin;
            this.__explicitlySet__.add("lastCheckin");
            return this;
        }
        /** Time at which the instance last booted */
        @com.fasterxml.jackson.annotation.JsonProperty("lastBoot")
        private String lastBoot;

        /**
         * Time at which the instance last booted
         *
         * @param lastBoot the value to set
         * @return this builder
         */
        public Builder lastBoot(String lastBoot) {
            this.lastBoot = lastBoot;
            this.__explicitlySet__.add("lastBoot");
            return this;
        }
        /** Number of updates available to be installed */
        @com.fasterxml.jackson.annotation.JsonProperty("updatesAvailable")
        private Integer updatesAvailable;

        /**
         * Number of updates available to be installed
         *
         * @param updatesAvailable the value to set
         * @return this builder
         */
        public Builder updatesAvailable(Integer updatesAvailable) {
            this.updatesAvailable = updatesAvailable;
            this.__explicitlySet__.add("updatesAvailable");
            return this;
        }
        /** OCID for the Compartment */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID for the Compartment
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Information specified by the user about the managed instance */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Information specified by the user about the managed instance
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** status of the managed instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * status of the managed instance.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The Operating System type of the managed instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
        private OsFamilies osFamily;

        /**
         * The Operating System type of the managed instance.
         *
         * @param osFamily the value to set
         * @return this builder
         */
        public Builder osFamily(OsFamilies osFamily) {
            this.osFamily = osFamily;
            this.__explicitlySet__.add("osFamily");
            return this;
        }
        /** Indicates whether a reboot is required to complete installation of updates. */
        @com.fasterxml.jackson.annotation.JsonProperty("isRebootRequired")
        private Boolean isRebootRequired;

        /**
         * Indicates whether a reboot is required to complete installation of updates.
         *
         * @param isRebootRequired the value to set
         * @return this builder
         */
        public Builder isRebootRequired(Boolean isRebootRequired) {
            this.isRebootRequired = isRebootRequired;
            this.__explicitlySet__.add("isRebootRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedInstanceSummary build() {
            ManagedInstanceSummary model =
                    new ManagedInstanceSummary(
                            this.displayName,
                            this.id,
                            this.lastCheckin,
                            this.lastBoot,
                            this.updatesAvailable,
                            this.compartmentId,
                            this.description,
                            this.status,
                            this.osFamily,
                            this.isRebootRequired);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedInstanceSummary model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("lastCheckin")) {
                this.lastCheckin(model.getLastCheckin());
            }
            if (model.wasPropertyExplicitlySet("lastBoot")) {
                this.lastBoot(model.getLastBoot());
            }
            if (model.wasPropertyExplicitlySet("updatesAvailable")) {
                this.updatesAvailable(model.getUpdatesAvailable());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("osFamily")) {
                this.osFamily(model.getOsFamily());
            }
            if (model.wasPropertyExplicitlySet("isRebootRequired")) {
                this.isRebootRequired(model.getIsRebootRequired());
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

    /** user settable name */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * user settable name
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** OCID for the managed instance */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OCID for the managed instance
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Time at which the instance last checked in */
    @com.fasterxml.jackson.annotation.JsonProperty("lastCheckin")
    private final String lastCheckin;

    /**
     * Time at which the instance last checked in
     *
     * @return the value
     */
    public String getLastCheckin() {
        return lastCheckin;
    }

    /** Time at which the instance last booted */
    @com.fasterxml.jackson.annotation.JsonProperty("lastBoot")
    private final String lastBoot;

    /**
     * Time at which the instance last booted
     *
     * @return the value
     */
    public String getLastBoot() {
        return lastBoot;
    }

    /** Number of updates available to be installed */
    @com.fasterxml.jackson.annotation.JsonProperty("updatesAvailable")
    private final Integer updatesAvailable;

    /**
     * Number of updates available to be installed
     *
     * @return the value
     */
    public Integer getUpdatesAvailable() {
        return updatesAvailable;
    }

    /** OCID for the Compartment */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID for the Compartment
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Information specified by the user about the managed instance */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Information specified by the user about the managed instance
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** status of the managed instance. */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Normal("NORMAL"),
        Unreachable("UNREACHABLE"),
        Error("ERROR"),
        Warning("WARNING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** status of the managed instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * status of the managed instance.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /** The Operating System type of the managed instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
    private final OsFamilies osFamily;

    /**
     * The Operating System type of the managed instance.
     *
     * @return the value
     */
    public OsFamilies getOsFamily() {
        return osFamily;
    }

    /** Indicates whether a reboot is required to complete installation of updates. */
    @com.fasterxml.jackson.annotation.JsonProperty("isRebootRequired")
    private final Boolean isRebootRequired;

    /**
     * Indicates whether a reboot is required to complete installation of updates.
     *
     * @return the value
     */
    public Boolean getIsRebootRequired() {
        return isRebootRequired;
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
        sb.append("ManagedInstanceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", lastCheckin=").append(String.valueOf(this.lastCheckin));
        sb.append(", lastBoot=").append(String.valueOf(this.lastBoot));
        sb.append(", updatesAvailable=").append(String.valueOf(this.updatesAvailable));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", osFamily=").append(String.valueOf(this.osFamily));
        sb.append(", isRebootRequired=").append(String.valueOf(this.isRebootRequired));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagedInstanceSummary)) {
            return false;
        }

        ManagedInstanceSummary other = (ManagedInstanceSummary) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lastCheckin, other.lastCheckin)
                && java.util.Objects.equals(this.lastBoot, other.lastBoot)
                && java.util.Objects.equals(this.updatesAvailable, other.updatesAvailable)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
                && java.util.Objects.equals(this.isRebootRequired, other.isRebootRequired)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.lastCheckin == null ? 43 : this.lastCheckin.hashCode());
        result = (result * PRIME) + (this.lastBoot == null ? 43 : this.lastBoot.hashCode());
        result =
                (result * PRIME)
                        + (this.updatesAvailable == null ? 43 : this.updatesAvailable.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result =
                (result * PRIME)
                        + (this.isRebootRequired == null ? 43 : this.isRebootRequired.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
