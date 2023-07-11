/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Field information <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Field.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Field extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "isRequired", "format", "label", "language"})
    public Field(String name, Boolean isRequired, Format format, Label label, String language) {
        super();
        this.name = name;
        this.isRequired = isRequired;
        this.format = format;
        this.label = label;
        this.language = language;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The field name */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The field name
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The given field is requeired or not */
        @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
        private Boolean isRequired;

        /**
         * The given field is requeired or not
         *
         * @param isRequired the value to set
         * @return this builder
         */
        public Builder isRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            this.__explicitlySet__.add("isRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("format")
        private Format format;

        public Builder format(Format format) {
            this.format = format;
            this.__explicitlySet__.add("format");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("label")
        private Label label;

        public Builder label(Label label) {
            this.label = label;
            this.__explicitlySet__.add("label");
            return this;
        }
        /**
         * Locale code (rfc4646 format) of a forced language (e.g.: jp addresses require jp always)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("language")
        private String language;

        /**
         * Locale code (rfc4646 format) of a forced language (e.g.: jp addresses require jp always)
         *
         * @param language the value to set
         * @return this builder
         */
        public Builder language(String language) {
            this.language = language;
            this.__explicitlySet__.add("language");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Field build() {
            Field model =
                    new Field(this.name, this.isRequired, this.format, this.label, this.language);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Field model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("isRequired")) {
                this.isRequired(model.getIsRequired());
            }
            if (model.wasPropertyExplicitlySet("format")) {
                this.format(model.getFormat());
            }
            if (model.wasPropertyExplicitlySet("label")) {
                this.label(model.getLabel());
            }
            if (model.wasPropertyExplicitlySet("language")) {
                this.language(model.getLanguage());
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

    /** The field name */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The field name
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The given field is requeired or not */
    @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
    private final Boolean isRequired;

    /**
     * The given field is requeired or not
     *
     * @return the value
     */
    public Boolean getIsRequired() {
        return isRequired;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("format")
    private final Format format;

    public Format getFormat() {
        return format;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("label")
    private final Label label;

    public Label getLabel() {
        return label;
    }

    /** Locale code (rfc4646 format) of a forced language (e.g.: jp addresses require jp always) */
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    private final String language;

    /**
     * Locale code (rfc4646 format) of a forced language (e.g.: jp addresses require jp always)
     *
     * @return the value
     */
    public String getLanguage() {
        return language;
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
        sb.append("Field(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", isRequired=").append(String.valueOf(this.isRequired));
        sb.append(", format=").append(String.valueOf(this.format));
        sb.append(", label=").append(String.valueOf(this.label));
        sb.append(", language=").append(String.valueOf(this.language));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Field)) {
            return false;
        }

        Field other = (Field) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.isRequired, other.isRequired)
                && java.util.Objects.equals(this.format, other.format)
                && java.util.Objects.equals(this.label, other.label)
                && java.util.Objects.equals(this.language, other.language)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.isRequired == null ? 43 : this.isRequired.hashCode());
        result = (result * PRIME) + (this.format == null ? 43 : this.format.hashCode());
        result = (result * PRIME) + (this.label == null ? 43 : this.label.hashCode());
        result = (result * PRIME) + (this.language == null ? 43 : this.language.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
