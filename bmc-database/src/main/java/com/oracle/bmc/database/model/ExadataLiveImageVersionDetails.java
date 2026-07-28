/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details about the most recent live image version applied on the VM Cluster, if any. If a full OS update was applied, the fields would be blank.
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
    builder = ExadataLiveImageVersionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExadataLiveImageVersionDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "updateMode",
        "version",
        "hasPendingUpdates",
        "timeReleased"
    })
    public ExadataLiveImageVersionDetails(
            UpdateMode updateMode,
            String version,
            Boolean hasPendingUpdates,
            java.util.Date timeReleased) {
        super();
        this.updateMode = updateMode;
        this.version = version;
        this.hasPendingUpdates = hasPendingUpdates;
        this.timeReleased = timeReleased;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OS live update mode performed most recently on the VM Cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("updateMode")
        private UpdateMode updateMode;

        /**
         * The OS live update mode performed most recently on the VM Cluster.
         * @param updateMode the value to set
         * @return this builder
         **/
        public Builder updateMode(UpdateMode updateMode) {
            this.updateMode = updateMode;
            this.__explicitlySet__.add("updateMode");
            return this;
        }
        /**
         * Live Exadata Image Version of the Guest OS Update applied.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * Live Exadata Image Version of the Guest OS Update applied.
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * Indicates whether OS updates that require node reboot are pending after the previous online update was applied.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hasPendingUpdates")
        private Boolean hasPendingUpdates;

        /**
         * Indicates whether OS updates that require node reboot are pending after the previous online update was applied.
         *
         * @param hasPendingUpdates the value to set
         * @return this builder
         **/
        public Builder hasPendingUpdates(Boolean hasPendingUpdates) {
            this.hasPendingUpdates = hasPendingUpdates;
            this.__explicitlySet__.add("hasPendingUpdates");
            return this;
        }
        /**
         * The release date and time for the applied Live Exadata Image OS version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
        private java.util.Date timeReleased;

        /**
         * The release date and time for the applied Live Exadata Image OS version.
         * @param timeReleased the value to set
         * @return this builder
         **/
        public Builder timeReleased(java.util.Date timeReleased) {
            this.timeReleased = timeReleased;
            this.__explicitlySet__.add("timeReleased");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExadataLiveImageVersionDetails build() {
            ExadataLiveImageVersionDetails model =
                    new ExadataLiveImageVersionDetails(
                            this.updateMode,
                            this.version,
                            this.hasPendingUpdates,
                            this.timeReleased);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExadataLiveImageVersionDetails model) {
            if (model.wasPropertyExplicitlySet("updateMode")) {
                this.updateMode(model.getUpdateMode());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("hasPendingUpdates")) {
                this.hasPendingUpdates(model.getHasPendingUpdates());
            }
            if (model.wasPropertyExplicitlySet("timeReleased")) {
                this.timeReleased(model.getTimeReleased());
            }
            return this;
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
     * The OS live update mode performed most recently on the VM Cluster.
     **/
    public enum UpdateMode {
        OnlineHighcvss("ONLINE_HIGHCVSS"),
        OnlineAllcvss("ONLINE_ALLCVSS"),
        OnlineAllUpdates("ONLINE_ALL_UPDATES"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(UpdateMode.class);

        private final String value;
        private static java.util.Map<String, UpdateMode> map;

        static {
            map = new java.util.HashMap<>();
            for (UpdateMode v : UpdateMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        UpdateMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UpdateMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'UpdateMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The OS live update mode performed most recently on the VM Cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updateMode")
    private final UpdateMode updateMode;

    /**
     * The OS live update mode performed most recently on the VM Cluster.
     * @return the value
     **/
    public UpdateMode getUpdateMode() {
        return updateMode;
    }

    /**
     * Live Exadata Image Version of the Guest OS Update applied.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * Live Exadata Image Version of the Guest OS Update applied.
     * @return the value
     **/
    public String getVersion() {
        return version;
    }

    /**
     * Indicates whether OS updates that require node reboot are pending after the previous online update was applied.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hasPendingUpdates")
    private final Boolean hasPendingUpdates;

    /**
     * Indicates whether OS updates that require node reboot are pending after the previous online update was applied.
     *
     * @return the value
     **/
    public Boolean getHasPendingUpdates() {
        return hasPendingUpdates;
    }

    /**
     * The release date and time for the applied Live Exadata Image OS version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
    private final java.util.Date timeReleased;

    /**
     * The release date and time for the applied Live Exadata Image OS version.
     * @return the value
     **/
    public java.util.Date getTimeReleased() {
        return timeReleased;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ExadataLiveImageVersionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("updateMode=").append(String.valueOf(this.updateMode));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", hasPendingUpdates=").append(String.valueOf(this.hasPendingUpdates));
        sb.append(", timeReleased=").append(String.valueOf(this.timeReleased));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExadataLiveImageVersionDetails)) {
            return false;
        }

        ExadataLiveImageVersionDetails other = (ExadataLiveImageVersionDetails) o;
        return java.util.Objects.equals(this.updateMode, other.updateMode)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.hasPendingUpdates, other.hasPendingUpdates)
                && java.util.Objects.equals(this.timeReleased, other.timeReleased)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.updateMode == null ? 43 : this.updateMode.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.hasPendingUpdates == null ? 43 : this.hasPendingUpdates.hashCode());
        result = (result * PRIME) + (this.timeReleased == null ? 43 : this.timeReleased.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
