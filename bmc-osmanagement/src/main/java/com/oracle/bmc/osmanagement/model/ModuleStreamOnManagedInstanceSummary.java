/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * Summary information pertaining to a module stream on a managed instance <br>
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
        builder = ModuleStreamOnManagedInstanceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ModuleStreamOnManagedInstanceSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "moduleName",
        "streamName",
        "status",
        "profiles",
        "softwareSourceId",
        "timeModified"
    })
    public ModuleStreamOnManagedInstanceSummary(
            String moduleName,
            String streamName,
            Status status,
            java.util.List<ModuleStreamProfileOnManagedInstanceSummary> profiles,
            String softwareSourceId,
            java.util.Date timeModified) {
        super();
        this.moduleName = moduleName;
        this.streamName = streamName;
        this.status = status;
        this.profiles = profiles;
        this.softwareSourceId = softwareSourceId;
        this.timeModified = timeModified;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the module that contains the stream. */
        @com.fasterxml.jackson.annotation.JsonProperty("moduleName")
        private String moduleName;

        /**
         * The name of the module that contains the stream.
         *
         * @param moduleName the value to set
         * @return this builder
         */
        public Builder moduleName(String moduleName) {
            this.moduleName = moduleName;
            this.__explicitlySet__.add("moduleName");
            return this;
        }
        /** The name of the stream. */
        @com.fasterxml.jackson.annotation.JsonProperty("streamName")
        private String streamName;

        /**
         * The name of the stream.
         *
         * @param streamName the value to set
         * @return this builder
         */
        public Builder streamName(String streamName) {
            this.streamName = streamName;
            this.__explicitlySet__.add("streamName");
            return this;
        }
        /**
         * The status of the stream
         *
         * <p>A stream with the "ENABLED" status can be used as a source for installing profiles.
         * Streams with this status are also "ACTIVE".
         *
         * <p>A stream with the "DISABLED" status cannot be the source for installing profiles. To
         * install profiles and packages from this stream, it must be enabled.
         *
         * <p>A stream with the "ACTIVE" status can be used as a source for installing profiles. The
         * packages that comprise the stream are also used when a matching package is installed
         * directly. In general, a stream can have this status if it is the default stream for the
         * module and no stream has been explicitly enabled.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The status of the stream
         *
         * <p>A stream with the "ENABLED" status can be used as a source for installing profiles.
         * Streams with this status are also "ACTIVE".
         *
         * <p>A stream with the "DISABLED" status cannot be the source for installing profiles. To
         * install profiles and packages from this stream, it must be enabled.
         *
         * <p>A stream with the "ACTIVE" status can be used as a source for installing profiles. The
         * packages that comprise the stream are also used when a matching package is installed
         * directly. In general, a stream can have this status if it is the default stream for the
         * module and no stream has been explicitly enabled.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The set of profiles that the module stream contains. */
        @com.fasterxml.jackson.annotation.JsonProperty("profiles")
        private java.util.List<ModuleStreamProfileOnManagedInstanceSummary> profiles;

        /**
         * The set of profiles that the module stream contains.
         *
         * @param profiles the value to set
         * @return this builder
         */
        public Builder profiles(
                java.util.List<ModuleStreamProfileOnManagedInstanceSummary> profiles) {
            this.profiles = profiles;
            this.__explicitlySet__.add("profiles");
            return this;
        }
        /** The OCID of the software source that provides this module stream. */
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceId")
        private String softwareSourceId;

        /**
         * The OCID of the software source that provides this module stream.
         *
         * @param softwareSourceId the value to set
         * @return this builder
         */
        public Builder softwareSourceId(String softwareSourceId) {
            this.softwareSourceId = softwareSourceId;
            this.__explicitlySet__.add("softwareSourceId");
            return this;
        }
        /**
         * The date and time of the last status change for this profile, as described in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
        private java.util.Date timeModified;

        /**
         * The date and time of the last status change for this profile, as described in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         *
         * @param timeModified the value to set
         * @return this builder
         */
        public Builder timeModified(java.util.Date timeModified) {
            this.timeModified = timeModified;
            this.__explicitlySet__.add("timeModified");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModuleStreamOnManagedInstanceSummary build() {
            ModuleStreamOnManagedInstanceSummary model =
                    new ModuleStreamOnManagedInstanceSummary(
                            this.moduleName,
                            this.streamName,
                            this.status,
                            this.profiles,
                            this.softwareSourceId,
                            this.timeModified);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModuleStreamOnManagedInstanceSummary model) {
            if (model.wasPropertyExplicitlySet("moduleName")) {
                this.moduleName(model.getModuleName());
            }
            if (model.wasPropertyExplicitlySet("streamName")) {
                this.streamName(model.getStreamName());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("profiles")) {
                this.profiles(model.getProfiles());
            }
            if (model.wasPropertyExplicitlySet("softwareSourceId")) {
                this.softwareSourceId(model.getSoftwareSourceId());
            }
            if (model.wasPropertyExplicitlySet("timeModified")) {
                this.timeModified(model.getTimeModified());
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

    /** The name of the module that contains the stream. */
    @com.fasterxml.jackson.annotation.JsonProperty("moduleName")
    private final String moduleName;

    /**
     * The name of the module that contains the stream.
     *
     * @return the value
     */
    public String getModuleName() {
        return moduleName;
    }

    /** The name of the stream. */
    @com.fasterxml.jackson.annotation.JsonProperty("streamName")
    private final String streamName;

    /**
     * The name of the stream.
     *
     * @return the value
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * The status of the stream
     *
     * <p>A stream with the "ENABLED" status can be used as a source for installing profiles.
     * Streams with this status are also "ACTIVE".
     *
     * <p>A stream with the "DISABLED" status cannot be the source for installing profiles. To
     * install profiles and packages from this stream, it must be enabled.
     *
     * <p>A stream with the "ACTIVE" status can be used as a source for installing profiles. The
     * packages that comprise the stream are also used when a matching package is installed
     * directly. In general, a stream can have this status if it is the default stream for the
     * module and no stream has been explicitly enabled.
     */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        Active("ACTIVE"),

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
    /**
     * The status of the stream
     *
     * <p>A stream with the "ENABLED" status can be used as a source for installing profiles.
     * Streams with this status are also "ACTIVE".
     *
     * <p>A stream with the "DISABLED" status cannot be the source for installing profiles. To
     * install profiles and packages from this stream, it must be enabled.
     *
     * <p>A stream with the "ACTIVE" status can be used as a source for installing profiles. The
     * packages that comprise the stream are also used when a matching package is installed
     * directly. In general, a stream can have this status if it is the default stream for the
     * module and no stream has been explicitly enabled.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The status of the stream
     *
     * <p>A stream with the "ENABLED" status can be used as a source for installing profiles.
     * Streams with this status are also "ACTIVE".
     *
     * <p>A stream with the "DISABLED" status cannot be the source for installing profiles. To
     * install profiles and packages from this stream, it must be enabled.
     *
     * <p>A stream with the "ACTIVE" status can be used as a source for installing profiles. The
     * packages that comprise the stream are also used when a matching package is installed
     * directly. In general, a stream can have this status if it is the default stream for the
     * module and no stream has been explicitly enabled.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /** The set of profiles that the module stream contains. */
    @com.fasterxml.jackson.annotation.JsonProperty("profiles")
    private final java.util.List<ModuleStreamProfileOnManagedInstanceSummary> profiles;

    /**
     * The set of profiles that the module stream contains.
     *
     * @return the value
     */
    public java.util.List<ModuleStreamProfileOnManagedInstanceSummary> getProfiles() {
        return profiles;
    }

    /** The OCID of the software source that provides this module stream. */
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceId")
    private final String softwareSourceId;

    /**
     * The OCID of the software source that provides this module stream.
     *
     * @return the value
     */
    public String getSoftwareSourceId() {
        return softwareSourceId;
    }

    /**
     * The date and time of the last status change for this profile, as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
    private final java.util.Date timeModified;

    /**
     * The date and time of the last status change for this profile, as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     *
     * @return the value
     */
    public java.util.Date getTimeModified() {
        return timeModified;
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
        sb.append("ModuleStreamOnManagedInstanceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("moduleName=").append(String.valueOf(this.moduleName));
        sb.append(", streamName=").append(String.valueOf(this.streamName));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", profiles=").append(String.valueOf(this.profiles));
        sb.append(", softwareSourceId=").append(String.valueOf(this.softwareSourceId));
        sb.append(", timeModified=").append(String.valueOf(this.timeModified));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModuleStreamOnManagedInstanceSummary)) {
            return false;
        }

        ModuleStreamOnManagedInstanceSummary other = (ModuleStreamOnManagedInstanceSummary) o;
        return java.util.Objects.equals(this.moduleName, other.moduleName)
                && java.util.Objects.equals(this.streamName, other.streamName)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.profiles, other.profiles)
                && java.util.Objects.equals(this.softwareSourceId, other.softwareSourceId)
                && java.util.Objects.equals(this.timeModified, other.timeModified)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.moduleName == null ? 43 : this.moduleName.hashCode());
        result = (result * PRIME) + (this.streamName == null ? 43 : this.streamName.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.profiles == null ? 43 : this.profiles.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareSourceId == null ? 43 : this.softwareSourceId.hashCode());
        result = (result * PRIME) + (this.timeModified == null ? 43 : this.timeModified.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
