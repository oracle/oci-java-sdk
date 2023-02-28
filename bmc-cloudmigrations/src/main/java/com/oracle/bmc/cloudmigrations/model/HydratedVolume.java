/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Description of the hydration server volume. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HydratedVolume.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class HydratedVolume
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"uuid", "volumeId", "volumeType", "unmodifiedVolumeId"})
    public HydratedVolume(
            String uuid, String volumeId, VolumeType volumeType, String unmodifiedVolumeId) {
        super();
        this.uuid = uuid;
        this.volumeId = volumeId;
        this.volumeType = volumeType;
        this.unmodifiedVolumeId = unmodifiedVolumeId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** ID of the vCenter disk obtained from Inventory. */
        @com.fasterxml.jackson.annotation.JsonProperty("uuid")
        private String uuid;

        /**
         * ID of the vCenter disk obtained from Inventory.
         *
         * @param uuid the value to set
         * @return this builder
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            this.__explicitlySet__.add("uuid");
            return this;
        }
        /** ID of the hydration server volume */
        @com.fasterxml.jackson.annotation.JsonProperty("volumeId")
        private String volumeId;

        /**
         * ID of the hydration server volume
         *
         * @param volumeId the value to set
         * @return this builder
         */
        public Builder volumeId(String volumeId) {
            this.volumeId = volumeId;
            this.__explicitlySet__.add("volumeId");
            return this;
        }
        /** The hydration server volume type */
        @com.fasterxml.jackson.annotation.JsonProperty("volumeType")
        private VolumeType volumeType;

        /**
         * The hydration server volume type
         *
         * @param volumeType the value to set
         * @return this builder
         */
        public Builder volumeType(VolumeType volumeType) {
            this.volumeType = volumeType;
            this.__explicitlySet__.add("volumeType");
            return this;
        }
        /** ID of the unmodified volume */
        @com.fasterxml.jackson.annotation.JsonProperty("unmodifiedVolumeId")
        private String unmodifiedVolumeId;

        /**
         * ID of the unmodified volume
         *
         * @param unmodifiedVolumeId the value to set
         * @return this builder
         */
        public Builder unmodifiedVolumeId(String unmodifiedVolumeId) {
            this.unmodifiedVolumeId = unmodifiedVolumeId;
            this.__explicitlySet__.add("unmodifiedVolumeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HydratedVolume build() {
            HydratedVolume model =
                    new HydratedVolume(
                            this.uuid, this.volumeId, this.volumeType, this.unmodifiedVolumeId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HydratedVolume model) {
            if (model.wasPropertyExplicitlySet("uuid")) {
                this.uuid(model.getUuid());
            }
            if (model.wasPropertyExplicitlySet("volumeId")) {
                this.volumeId(model.getVolumeId());
            }
            if (model.wasPropertyExplicitlySet("volumeType")) {
                this.volumeType(model.getVolumeType());
            }
            if (model.wasPropertyExplicitlySet("unmodifiedVolumeId")) {
                this.unmodifiedVolumeId(model.getUnmodifiedVolumeId());
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

    /** ID of the vCenter disk obtained from Inventory. */
    @com.fasterxml.jackson.annotation.JsonProperty("uuid")
    private final String uuid;

    /**
     * ID of the vCenter disk obtained from Inventory.
     *
     * @return the value
     */
    public String getUuid() {
        return uuid;
    }

    /** ID of the hydration server volume */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeId")
    private final String volumeId;

    /**
     * ID of the hydration server volume
     *
     * @return the value
     */
    public String getVolumeId() {
        return volumeId;
    }

    /** The hydration server volume type */
    public enum VolumeType implements com.oracle.bmc.http.internal.BmcEnum {
        Boot("BOOT"),
        Block("BLOCK"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(VolumeType.class);

        private final String value;
        private static java.util.Map<String, VolumeType> map;

        static {
            map = new java.util.HashMap<>();
            for (VolumeType v : VolumeType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        VolumeType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static VolumeType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'VolumeType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The hydration server volume type */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeType")
    private final VolumeType volumeType;

    /**
     * The hydration server volume type
     *
     * @return the value
     */
    public VolumeType getVolumeType() {
        return volumeType;
    }

    /** ID of the unmodified volume */
    @com.fasterxml.jackson.annotation.JsonProperty("unmodifiedVolumeId")
    private final String unmodifiedVolumeId;

    /**
     * ID of the unmodified volume
     *
     * @return the value
     */
    public String getUnmodifiedVolumeId() {
        return unmodifiedVolumeId;
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
        sb.append("HydratedVolume(");
        sb.append("super=").append(super.toString());
        sb.append("uuid=").append(String.valueOf(this.uuid));
        sb.append(", volumeId=").append(String.valueOf(this.volumeId));
        sb.append(", volumeType=").append(String.valueOf(this.volumeType));
        sb.append(", unmodifiedVolumeId=").append(String.valueOf(this.unmodifiedVolumeId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HydratedVolume)) {
            return false;
        }

        HydratedVolume other = (HydratedVolume) o;
        return java.util.Objects.equals(this.uuid, other.uuid)
                && java.util.Objects.equals(this.volumeId, other.volumeId)
                && java.util.Objects.equals(this.volumeType, other.volumeType)
                && java.util.Objects.equals(this.unmodifiedVolumeId, other.unmodifiedVolumeId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.uuid == null ? 43 : this.uuid.hashCode());
        result = (result * PRIME) + (this.volumeId == null ? 43 : this.volumeId.hashCode());
        result = (result * PRIME) + (this.volumeType == null ? 43 : this.volumeType.hashCode());
        result =
                (result * PRIME)
                        + (this.unmodifiedVolumeId == null
                                ? 43
                                : this.unmodifiedVolumeId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
