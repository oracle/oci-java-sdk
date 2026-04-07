/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Details about a specific snap. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SnapSpecDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SnapSpecDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "channel",
        "isSigned",
        "mode",
        "name",
        "version",
        "revision"
    })
    public SnapSpecDetails(
            String channel,
            Boolean isSigned,
            SnapModes mode,
            String name,
            String version,
            String revision) {
        super();
        this.channel = channel;
        this.isSigned = isSigned;
        this.mode = mode;
        this.name = name;
        this.version = version;
        this.revision = revision;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The channel to install from (e.g. stable, edge, beta, candidate, or a custom channel).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("channel")
        private String channel;

        /**
         * The channel to install from (e.g. stable, edge, beta, candidate, or a custom channel).
         *
         * @param channel the value to set
         * @return this builder
         */
        public Builder channel(String channel) {
            this.channel = channel;
            this.__explicitlySet__.add("channel");
            return this;
        }
        /**
         * If true, allows installing snaps not signed by the Snap Store. E.g., snaps from local
         * file. Use with caution.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSigned")
        private Boolean isSigned;

        /**
         * If true, allows installing snaps not signed by the Snap Store. E.g., snaps from local
         * file. Use with caution.
         *
         * @param isSigned the value to set
         * @return this builder
         */
        public Builder isSigned(Boolean isSigned) {
            this.isSigned = isSigned;
            this.__explicitlySet__.add("isSigned");
            return this;
        }
        /** The modes for the snap. */
        @com.fasterxml.jackson.annotation.JsonProperty("mode")
        private SnapModes mode;

        /**
         * The modes for the snap.
         *
         * @param mode the value to set
         * @return this builder
         */
        public Builder mode(SnapModes mode) {
            this.mode = mode;
            this.__explicitlySet__.add("mode");
            return this;
        }
        /** The name of the snap to install. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the snap to install.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The version of the snap. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The version of the snap.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /** The revision to install. */
        @com.fasterxml.jackson.annotation.JsonProperty("revision")
        private String revision;

        /**
         * The revision to install.
         *
         * @param revision the value to set
         * @return this builder
         */
        public Builder revision(String revision) {
            this.revision = revision;
            this.__explicitlySet__.add("revision");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SnapSpecDetails build() {
            SnapSpecDetails model =
                    new SnapSpecDetails(
                            this.channel,
                            this.isSigned,
                            this.mode,
                            this.name,
                            this.version,
                            this.revision);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SnapSpecDetails model) {
            if (model.wasPropertyExplicitlySet("channel")) {
                this.channel(model.getChannel());
            }
            if (model.wasPropertyExplicitlySet("isSigned")) {
                this.isSigned(model.getIsSigned());
            }
            if (model.wasPropertyExplicitlySet("mode")) {
                this.mode(model.getMode());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("revision")) {
                this.revision(model.getRevision());
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

    /** The channel to install from (e.g. stable, edge, beta, candidate, or a custom channel). */
    @com.fasterxml.jackson.annotation.JsonProperty("channel")
    private final String channel;

    /**
     * The channel to install from (e.g. stable, edge, beta, candidate, or a custom channel).
     *
     * @return the value
     */
    public String getChannel() {
        return channel;
    }

    /**
     * If true, allows installing snaps not signed by the Snap Store. E.g., snaps from local file.
     * Use with caution.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSigned")
    private final Boolean isSigned;

    /**
     * If true, allows installing snaps not signed by the Snap Store. E.g., snaps from local file.
     * Use with caution.
     *
     * @return the value
     */
    public Boolean getIsSigned() {
        return isSigned;
    }

    /** The modes for the snap. */
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    private final SnapModes mode;

    /**
     * The modes for the snap.
     *
     * @return the value
     */
    public SnapModes getMode() {
        return mode;
    }

    /** The name of the snap to install. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the snap to install.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The version of the snap. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The version of the snap.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /** The revision to install. */
    @com.fasterxml.jackson.annotation.JsonProperty("revision")
    private final String revision;

    /**
     * The revision to install.
     *
     * @return the value
     */
    public String getRevision() {
        return revision;
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
        sb.append("SnapSpecDetails(");
        sb.append("super=").append(super.toString());
        sb.append("channel=").append(String.valueOf(this.channel));
        sb.append(", isSigned=").append(String.valueOf(this.isSigned));
        sb.append(", mode=").append(String.valueOf(this.mode));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", revision=").append(String.valueOf(this.revision));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SnapSpecDetails)) {
            return false;
        }

        SnapSpecDetails other = (SnapSpecDetails) o;
        return java.util.Objects.equals(this.channel, other.channel)
                && java.util.Objects.equals(this.isSigned, other.isSigned)
                && java.util.Objects.equals(this.mode, other.mode)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.revision, other.revision)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.channel == null ? 43 : this.channel.hashCode());
        result = (result * PRIME) + (this.isSigned == null ? 43 : this.isSigned.hashCode());
        result = (result * PRIME) + (this.mode == null ? 43 : this.mode.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.revision == null ? 43 : this.revision.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
