/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * Information detailing the state of a module stream
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateModuleStreamDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateModuleStreamDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "streamName",
        "status",
        "timeModified",
        "softwareSourceName",
        "softwareSourceUrl",
        "isDefault",
        "profiles"
    })
    public UpdateModuleStreamDetails(
            String streamName,
            Status status,
            java.util.Date timeModified,
            String softwareSourceName,
            String softwareSourceUrl,
            Boolean isDefault,
            java.util.List<UpdateModuleStreamProfileDetails> profiles) {
        super();
        this.streamName = streamName;
        this.status = status;
        this.timeModified = timeModified;
        this.softwareSourceName = softwareSourceName;
        this.softwareSourceUrl = softwareSourceUrl;
        this.isDefault = isDefault;
        this.profiles = profiles;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the stream of the parent module
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("streamName")
        private String streamName;

        /**
         * The name of the stream of the parent module
         * @param streamName the value to set
         * @return this builder
         **/
        public Builder streamName(String streamName) {
            this.streamName = streamName;
            this.__explicitlySet__.add("streamName");
            return this;
        }
        /**
         * The status of the stream
         * <p>
         * A stream with the "ENABLED" status can be used as a source for installing
         * profiles.  Streams with this status are also "ACTIVE".
         * <p>
         * A stream with the "DISABLED" status cannot be the source for installing
         * profiles.  To install profiles and packages from this stream, it must be
         * enabled.
         * <p>
         * A stream with the "ACTIVE" status can be used as a source for installing
         * profiles.  The packages that comprise the stream are also used when a
         * matching package is installed directly.  In general, a stream can have
         * this status if it is the default stream for the module and no stream has
         * been explicitly enabled.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The status of the stream
         * <p>
         * A stream with the "ENABLED" status can be used as a source for installing
         * profiles.  Streams with this status are also "ACTIVE".
         * <p>
         * A stream with the "DISABLED" status cannot be the source for installing
         * profiles.  To install profiles and packages from this stream, it must be
         * enabled.
         * <p>
         * A stream with the "ACTIVE" status can be used as a source for installing
         * profiles.  The packages that comprise the stream are also used when a
         * matching package is installed directly.  In general, a stream can have
         * this status if it is the default stream for the module and no stream has
         * been explicitly enabled.
         *
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The date and time of the last status change for this object, as
         * described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339),
         * section 14.29.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
        private java.util.Date timeModified;

        /**
         * The date and time of the last status change for this object, as
         * described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339),
         * section 14.29.
         *
         * @param timeModified the value to set
         * @return this builder
         **/
        public Builder timeModified(java.util.Date timeModified) {
            this.timeModified = timeModified;
            this.__explicitlySet__.add("timeModified");
            return this;
        }
        /**
         * The name of the software source that publishes this stream.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceName")
        private String softwareSourceName;

        /**
         * The name of the software source that publishes this stream.
         * @param softwareSourceName the value to set
         * @return this builder
         **/
        public Builder softwareSourceName(String softwareSourceName) {
            this.softwareSourceName = softwareSourceName;
            this.__explicitlySet__.add("softwareSourceName");
            return this;
        }
        /**
         * The URL of the software source that publishes this stream.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceUrl")
        private String softwareSourceUrl;

        /**
         * The URL of the software source that publishes this stream.
         * @param softwareSourceUrl the value to set
         * @return this builder
         **/
        public Builder softwareSourceUrl(String softwareSourceUrl) {
            this.softwareSourceUrl = softwareSourceUrl;
            this.__explicitlySet__.add("softwareSourceUrl");
            return this;
        }
        /**
         * Indicates if the module stream is the default
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        /**
         * Indicates if the module stream is the default
         * @param isDefault the value to set
         * @return this builder
         **/
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }
        /**
         * The profiles of the stream
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("profiles")
        private java.util.List<UpdateModuleStreamProfileDetails> profiles;

        /**
         * The profiles of the stream
         * @param profiles the value to set
         * @return this builder
         **/
        public Builder profiles(java.util.List<UpdateModuleStreamProfileDetails> profiles) {
            this.profiles = profiles;
            this.__explicitlySet__.add("profiles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateModuleStreamDetails build() {
            UpdateModuleStreamDetails __instance__ =
                    new UpdateModuleStreamDetails(
                            streamName,
                            status,
                            timeModified,
                            softwareSourceName,
                            softwareSourceUrl,
                            isDefault,
                            profiles);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateModuleStreamDetails o) {
            Builder copiedBuilder =
                    streamName(o.getStreamName())
                            .status(o.getStatus())
                            .timeModified(o.getTimeModified())
                            .softwareSourceName(o.getSoftwareSourceName())
                            .softwareSourceUrl(o.getSoftwareSourceUrl())
                            .isDefault(o.getIsDefault())
                            .profiles(o.getProfiles());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The name of the stream of the parent module
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("streamName")
    private final String streamName;

    /**
     * The name of the stream of the parent module
     * @return the value
     **/
    public String getStreamName() {
        return streamName;
    }

    /**
     * The status of the stream
     * <p>
     * A stream with the "ENABLED" status can be used as a source for installing
     * profiles.  Streams with this status are also "ACTIVE".
     * <p>
     * A stream with the "DISABLED" status cannot be the source for installing
     * profiles.  To install profiles and packages from this stream, it must be
     * enabled.
     * <p>
     * A stream with the "ACTIVE" status can be used as a source for installing
     * profiles.  The packages that comprise the stream are also used when a
     * matching package is installed directly.  In general, a stream can have
     * this status if it is the default stream for the module and no stream has
     * been explicitly enabled.
     *
     **/
    public enum Status {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        Active("ACTIVE"),
        ;

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid Status: " + key);
        }
    };
    /**
     * The status of the stream
     * <p>
     * A stream with the "ENABLED" status can be used as a source for installing
     * profiles.  Streams with this status are also "ACTIVE".
     * <p>
     * A stream with the "DISABLED" status cannot be the source for installing
     * profiles.  To install profiles and packages from this stream, it must be
     * enabled.
     * <p>
     * A stream with the "ACTIVE" status can be used as a source for installing
     * profiles.  The packages that comprise the stream are also used when a
     * matching package is installed directly.  In general, a stream can have
     * this status if it is the default stream for the module and no stream has
     * been explicitly enabled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The status of the stream
     * <p>
     * A stream with the "ENABLED" status can be used as a source for installing
     * profiles.  Streams with this status are also "ACTIVE".
     * <p>
     * A stream with the "DISABLED" status cannot be the source for installing
     * profiles.  To install profiles and packages from this stream, it must be
     * enabled.
     * <p>
     * A stream with the "ACTIVE" status can be used as a source for installing
     * profiles.  The packages that comprise the stream are also used when a
     * matching package is installed directly.  In general, a stream can have
     * this status if it is the default stream for the module and no stream has
     * been explicitly enabled.
     *
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * The date and time of the last status change for this object, as
     * described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339),
     * section 14.29.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
    private final java.util.Date timeModified;

    /**
     * The date and time of the last status change for this object, as
     * described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339),
     * section 14.29.
     *
     * @return the value
     **/
    public java.util.Date getTimeModified() {
        return timeModified;
    }

    /**
     * The name of the software source that publishes this stream.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceName")
    private final String softwareSourceName;

    /**
     * The name of the software source that publishes this stream.
     * @return the value
     **/
    public String getSoftwareSourceName() {
        return softwareSourceName;
    }

    /**
     * The URL of the software source that publishes this stream.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceUrl")
    private final String softwareSourceUrl;

    /**
     * The URL of the software source that publishes this stream.
     * @return the value
     **/
    public String getSoftwareSourceUrl() {
        return softwareSourceUrl;
    }

    /**
     * Indicates if the module stream is the default
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final Boolean isDefault;

    /**
     * Indicates if the module stream is the default
     * @return the value
     **/
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * The profiles of the stream
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("profiles")
    private final java.util.List<UpdateModuleStreamProfileDetails> profiles;

    /**
     * The profiles of the stream
     * @return the value
     **/
    public java.util.List<UpdateModuleStreamProfileDetails> getProfiles() {
        return profiles;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateModuleStreamDetails(");
        sb.append("streamName=").append(String.valueOf(this.streamName));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", timeModified=").append(String.valueOf(this.timeModified));
        sb.append(", softwareSourceName=").append(String.valueOf(this.softwareSourceName));
        sb.append(", softwareSourceUrl=").append(String.valueOf(this.softwareSourceUrl));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append(", profiles=").append(String.valueOf(this.profiles));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateModuleStreamDetails)) {
            return false;
        }

        UpdateModuleStreamDetails other = (UpdateModuleStreamDetails) o;
        return java.util.Objects.equals(this.streamName, other.streamName)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeModified, other.timeModified)
                && java.util.Objects.equals(this.softwareSourceName, other.softwareSourceName)
                && java.util.Objects.equals(this.softwareSourceUrl, other.softwareSourceUrl)
                && java.util.Objects.equals(this.isDefault, other.isDefault)
                && java.util.Objects.equals(this.profiles, other.profiles)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.streamName == null ? 43 : this.streamName.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.timeModified == null ? 43 : this.timeModified.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareSourceName == null
                                ? 43
                                : this.softwareSourceName.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareSourceUrl == null ? 43 : this.softwareSourceUrl.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        result = (result * PRIME) + (this.profiles == null ? 43 : this.profiles.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
