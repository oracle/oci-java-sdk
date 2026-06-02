/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides summary information for a snap.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SnapSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SnapSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "name",
        "publisher",
        "revision",
        "storeUrl",
        "timeRefreshed",
        "version",
        "tracking"
    })
    public SnapSummary(
            String description,
            String name,
            String publisher,
            String revision,
            String storeUrl,
            java.util.Date timeRefreshed,
            String version,
            String tracking) {
        super();
        this.description = description;
        this.name = name;
        this.publisher = publisher;
        this.revision = revision;
        this.storeUrl = storeUrl;
        this.timeRefreshed = timeRefreshed;
        this.version = version;
        this.tracking = tracking;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The description of of snap.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of of snap.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The name of the snap.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the snap.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The publisher of the snap.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("publisher")
        private String publisher;

        /**
         * The publisher of the snap.
         * @param publisher the value to set
         * @return this builder
         **/
        public Builder publisher(String publisher) {
            this.publisher = publisher;
            this.__explicitlySet__.add("publisher");
            return this;
        }
        /**
         * The revision number of the snap channel.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("revision")
        private String revision;

        /**
         * The revision number of the snap channel.
         * @param revision the value to set
         * @return this builder
         **/
        public Builder revision(String revision) {
            this.revision = revision;
            this.__explicitlySet__.add("revision");
            return this;
        }
        /**
         * The snap's store url.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("storeUrl")
        private String storeUrl;

        /**
         * The snap's store url.
         * @param storeUrl the value to set
         * @return this builder
         **/
        public Builder storeUrl(String storeUrl) {
            this.storeUrl = storeUrl;
            this.__explicitlySet__.add("storeUrl");
            return this;
        }
        /**
         * The date and time of the snap's last refresh in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeRefreshed")
        private java.util.Date timeRefreshed;

        /**
         * The date and time of the snap's last refresh in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format.
         * @param timeRefreshed the value to set
         * @return this builder
         **/
        public Builder timeRefreshed(java.util.Date timeRefreshed) {
            this.timeRefreshed = timeRefreshed;
            this.__explicitlySet__.add("timeRefreshed");
            return this;
        }
        /**
         * The version of the snap.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The version of the snap.
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * The track this snap is following.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tracking")
        private String tracking;

        /**
         * The track this snap is following.
         * @param tracking the value to set
         * @return this builder
         **/
        public Builder tracking(String tracking) {
            this.tracking = tracking;
            this.__explicitlySet__.add("tracking");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SnapSummary build() {
            SnapSummary model =
                    new SnapSummary(
                            this.description,
                            this.name,
                            this.publisher,
                            this.revision,
                            this.storeUrl,
                            this.timeRefreshed,
                            this.version,
                            this.tracking);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SnapSummary model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("publisher")) {
                this.publisher(model.getPublisher());
            }
            if (model.wasPropertyExplicitlySet("revision")) {
                this.revision(model.getRevision());
            }
            if (model.wasPropertyExplicitlySet("storeUrl")) {
                this.storeUrl(model.getStoreUrl());
            }
            if (model.wasPropertyExplicitlySet("timeRefreshed")) {
                this.timeRefreshed(model.getTimeRefreshed());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("tracking")) {
                this.tracking(model.getTracking());
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
     * The description of of snap.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of of snap.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The name of the snap.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the snap.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The publisher of the snap.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    private final String publisher;

    /**
     * The publisher of the snap.
     * @return the value
     **/
    public String getPublisher() {
        return publisher;
    }

    /**
     * The revision number of the snap channel.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("revision")
    private final String revision;

    /**
     * The revision number of the snap channel.
     * @return the value
     **/
    public String getRevision() {
        return revision;
    }

    /**
     * The snap's store url.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storeUrl")
    private final String storeUrl;

    /**
     * The snap's store url.
     * @return the value
     **/
    public String getStoreUrl() {
        return storeUrl;
    }

    /**
     * The date and time of the snap's last refresh in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeRefreshed")
    private final java.util.Date timeRefreshed;

    /**
     * The date and time of the snap's last refresh in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format.
     * @return the value
     **/
    public java.util.Date getTimeRefreshed() {
        return timeRefreshed;
    }

    /**
     * The version of the snap.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The version of the snap.
     * @return the value
     **/
    public String getVersion() {
        return version;
    }

    /**
     * The track this snap is following.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tracking")
    private final String tracking;

    /**
     * The track this snap is following.
     * @return the value
     **/
    public String getTracking() {
        return tracking;
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
        sb.append("SnapSummary(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", publisher=").append(String.valueOf(this.publisher));
        sb.append(", revision=").append(String.valueOf(this.revision));
        sb.append(", storeUrl=").append(String.valueOf(this.storeUrl));
        sb.append(", timeRefreshed=").append(String.valueOf(this.timeRefreshed));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", tracking=").append(String.valueOf(this.tracking));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SnapSummary)) {
            return false;
        }

        SnapSummary other = (SnapSummary) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.publisher, other.publisher)
                && java.util.Objects.equals(this.revision, other.revision)
                && java.util.Objects.equals(this.storeUrl, other.storeUrl)
                && java.util.Objects.equals(this.timeRefreshed, other.timeRefreshed)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.tracking, other.tracking)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.publisher == null ? 43 : this.publisher.hashCode());
        result = (result * PRIME) + (this.revision == null ? 43 : this.revision.hashCode());
        result = (result * PRIME) + (this.storeUrl == null ? 43 : this.storeUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.timeRefreshed == null ? 43 : this.timeRefreshed.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.tracking == null ? 43 : this.tracking.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
