/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Icon of virtual machine or template. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OlvmIcon.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OlvmIcon extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"comment", "data", "description", "id", "mediaType", "name"})
    public OlvmIcon(
            String comment,
            String data,
            String description,
            String id,
            String mediaType,
            String name) {
        super();
        this.comment = comment;
        this.data = data;
        this.description = description;
        this.id = id;
        this.mediaType = mediaType;
        this.name = name;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /** Base64 encode content of the icon file. */
        @com.fasterxml.jackson.annotation.JsonProperty("data")
        private String data;

        /**
         * Base64 encode content of the icon file.
         *
         * @param data the value to set
         * @return this builder
         */
        public Builder data(String data) {
            this.data = data;
            this.__explicitlySet__.add("data");
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
        /** A unique identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * A unique identifier.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Format of icon file. */
        @com.fasterxml.jackson.annotation.JsonProperty("mediaType")
        private String mediaType;

        /**
         * Format of icon file.
         *
         * @param mediaType the value to set
         * @return this builder
         */
        public Builder mediaType(String mediaType) {
            this.mediaType = mediaType;
            this.__explicitlySet__.add("mediaType");
            return this;
        }
        /** Name of the property. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the property.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmIcon build() {
            OlvmIcon model =
                    new OlvmIcon(
                            this.comment,
                            this.data,
                            this.description,
                            this.id,
                            this.mediaType,
                            this.name);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmIcon model) {
            if (model.wasPropertyExplicitlySet("comment")) {
                this.comment(model.getComment());
            }
            if (model.wasPropertyExplicitlySet("data")) {
                this.data(model.getData());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("mediaType")) {
                this.mediaType(model.getMediaType());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
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

    /** Base64 encode content of the icon file. */
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    private final String data;

    /**
     * Base64 encode content of the icon file.
     *
     * @return the value
     */
    public String getData() {
        return data;
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

    /** A unique identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * A unique identifier.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Format of icon file. */
    @com.fasterxml.jackson.annotation.JsonProperty("mediaType")
    private final String mediaType;

    /**
     * Format of icon file.
     *
     * @return the value
     */
    public String getMediaType() {
        return mediaType;
    }

    /** Name of the property. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the property.
     *
     * @return the value
     */
    public String getName() {
        return name;
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
        sb.append("OlvmIcon(");
        sb.append("super=").append(super.toString());
        sb.append("comment=").append(String.valueOf(this.comment));
        sb.append(", data=").append(String.valueOf(this.data));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", mediaType=").append(String.valueOf(this.mediaType));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmIcon)) {
            return false;
        }

        OlvmIcon other = (OlvmIcon) o;
        return java.util.Objects.equals(this.comment, other.comment)
                && java.util.Objects.equals(this.data, other.data)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.mediaType, other.mediaType)
                && java.util.Objects.equals(this.name, other.name)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.comment == null ? 43 : this.comment.hashCode());
        result = (result * PRIME) + (this.data == null ? 43 : this.data.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.mediaType == null ? 43 : this.mediaType.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
