/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Version in OLVM <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OlvmVersion.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OlvmVersion extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "build",
        "comment",
        "description",
        "fullVersion",
        "id",
        "major",
        "minor",
        "name",
        "revision"
    })
    public OlvmVersion(
            Integer build,
            String comment,
            String description,
            String fullVersion,
            String id,
            Integer major,
            Integer minor,
            String name,
            Integer revision) {
        super();
        this.build = build;
        this.comment = comment;
        this.description = description;
        this.fullVersion = fullVersion;
        this.id = id;
        this.major = major;
        this.minor = minor;
        this.name = name;
        this.revision = revision;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Build number of this version */
        @com.fasterxml.jackson.annotation.JsonProperty("build")
        private Integer build;

        /**
         * Build number of this version
         *
         * @param build the value to set
         * @return this builder
         */
        public Builder build(Integer build) {
            this.build = build;
            this.__explicitlySet__.add("build");
            return this;
        }
        /** Free text containing comments about this object. */
        @com.fasterxml.jackson.annotation.JsonProperty("comment")
        private String comment;

        /**
         * Free text containing comments about this object.
         *
         * @param comment the value to set
         * @return this builder
         */
        public Builder comment(String comment) {
            this.comment = comment;
            this.__explicitlySet__.add("comment");
            return this;
        }
        /** A human-readable description in plain text. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A human-readable description in plain text.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Full version */
        @com.fasterxml.jackson.annotation.JsonProperty("fullVersion")
        private String fullVersion;

        /**
         * Full version
         *
         * @param fullVersion the value to set
         * @return this builder
         */
        public Builder fullVersion(String fullVersion) {
            this.fullVersion = fullVersion;
            this.__explicitlySet__.add("fullVersion");
            return this;
        }
        /** A unique identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * A unique identifier
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Major version */
        @com.fasterxml.jackson.annotation.JsonProperty("major")
        private Integer major;

        /**
         * Major version
         *
         * @param major the value to set
         * @return this builder
         */
        public Builder major(Integer major) {
            this.major = major;
            this.__explicitlySet__.add("major");
            return this;
        }
        /** Minor version */
        @com.fasterxml.jackson.annotation.JsonProperty("minor")
        private Integer minor;

        /**
         * Minor version
         *
         * @param minor the value to set
         * @return this builder
         */
        public Builder minor(Integer minor) {
            this.minor = minor;
            this.__explicitlySet__.add("minor");
            return this;
        }
        /** A human-readable name in plain text */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A human-readable name in plain text
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Revision number */
        @com.fasterxml.jackson.annotation.JsonProperty("revision")
        private Integer revision;

        /**
         * Revision number
         *
         * @param revision the value to set
         * @return this builder
         */
        public Builder revision(Integer revision) {
            this.revision = revision;
            this.__explicitlySet__.add("revision");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmVersion build() {
            OlvmVersion model =
                    new OlvmVersion(
                            this.build,
                            this.comment,
                            this.description,
                            this.fullVersion,
                            this.id,
                            this.major,
                            this.minor,
                            this.name,
                            this.revision);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmVersion model) {
            if (model.wasPropertyExplicitlySet("build")) {
                this.build(model.getBuild());
            }
            if (model.wasPropertyExplicitlySet("comment")) {
                this.comment(model.getComment());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("fullVersion")) {
                this.fullVersion(model.getFullVersion());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("major")) {
                this.major(model.getMajor());
            }
            if (model.wasPropertyExplicitlySet("minor")) {
                this.minor(model.getMinor());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
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

    /** Build number of this version */
    @com.fasterxml.jackson.annotation.JsonProperty("build")
    private final Integer build;

    /**
     * Build number of this version
     *
     * @return the value
     */
    public Integer getBuild() {
        return build;
    }

    /** Free text containing comments about this object. */
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    private final String comment;

    /**
     * Free text containing comments about this object.
     *
     * @return the value
     */
    public String getComment() {
        return comment;
    }

    /** A human-readable description in plain text. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A human-readable description in plain text.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Full version */
    @com.fasterxml.jackson.annotation.JsonProperty("fullVersion")
    private final String fullVersion;

    /**
     * Full version
     *
     * @return the value
     */
    public String getFullVersion() {
        return fullVersion;
    }

    /** A unique identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * A unique identifier
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Major version */
    @com.fasterxml.jackson.annotation.JsonProperty("major")
    private final Integer major;

    /**
     * Major version
     *
     * @return the value
     */
    public Integer getMajor() {
        return major;
    }

    /** Minor version */
    @com.fasterxml.jackson.annotation.JsonProperty("minor")
    private final Integer minor;

    /**
     * Minor version
     *
     * @return the value
     */
    public Integer getMinor() {
        return minor;
    }

    /** A human-readable name in plain text */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A human-readable name in plain text
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Revision number */
    @com.fasterxml.jackson.annotation.JsonProperty("revision")
    private final Integer revision;

    /**
     * Revision number
     *
     * @return the value
     */
    public Integer getRevision() {
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
        sb.append("OlvmVersion(");
        sb.append("super=").append(super.toString());
        sb.append("build=").append(String.valueOf(this.build));
        sb.append(", comment=").append(String.valueOf(this.comment));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", fullVersion=").append(String.valueOf(this.fullVersion));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", major=").append(String.valueOf(this.major));
        sb.append(", minor=").append(String.valueOf(this.minor));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", revision=").append(String.valueOf(this.revision));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmVersion)) {
            return false;
        }

        OlvmVersion other = (OlvmVersion) o;
        return java.util.Objects.equals(this.build, other.build)
                && java.util.Objects.equals(this.comment, other.comment)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.fullVersion, other.fullVersion)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.major, other.major)
                && java.util.Objects.equals(this.minor, other.minor)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.revision, other.revision)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.build == null ? 43 : this.build.hashCode());
        result = (result * PRIME) + (this.comment == null ? 43 : this.comment.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.fullVersion == null ? 43 : this.fullVersion.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.major == null ? 43 : this.major.hashCode());
        result = (result * PRIME) + (this.minor == null ? 43 : this.minor.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.revision == null ? 43 : this.revision.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
