/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Link output. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LinkOutput.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LinkOutput extends BaseOutput {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("title")
        private String title;

        public Builder title(String title) {
            this.title = title;
            this.__explicitlySet__.add("title");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSensitive")
        private Boolean isSensitive;

        public Builder isSensitive(Boolean isSensitive) {
            this.isSensitive = isSensitive;
            this.__explicitlySet__.add("isSensitive");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("format")
        private String format;

        public Builder format(String format) {
            this.format = format;
            this.__explicitlySet__.add("format");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("visible")
        private String visible;

        public Builder visible(String visible) {
            this.visible = visible;
            this.__explicitlySet__.add("visible");
            return this;
        }
        /** Display label abel for the URL. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayText")
        private String displayText;

        /**
         * Display label abel for the URL.
         *
         * @param displayText the value to set
         * @return this builder
         */
        public Builder displayText(String displayText) {
            this.displayText = displayText;
            this.__explicitlySet__.add("displayText");
            return this;
        }
        /** URL/URI to display as a link. */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * URL/URI to display as a link.
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LinkOutput build() {
            LinkOutput model =
                    new LinkOutput(
                            this.title,
                            this.description,
                            this.isSensitive,
                            this.format,
                            this.visible,
                            this.displayText,
                            this.value);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LinkOutput model) {
            if (model.wasPropertyExplicitlySet("title")) {
                this.title(model.getTitle());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("isSensitive")) {
                this.isSensitive(model.getIsSensitive());
            }
            if (model.wasPropertyExplicitlySet("format")) {
                this.format(model.getFormat());
            }
            if (model.wasPropertyExplicitlySet("visible")) {
                this.visible(model.getVisible());
            }
            if (model.wasPropertyExplicitlySet("displayText")) {
                this.displayText(model.getDisplayText());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
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

    @Deprecated
    public LinkOutput(
            String title,
            String description,
            Boolean isSensitive,
            String format,
            String visible,
            String displayText,
            String value) {
        super(title, description, isSensitive, format, visible);
        this.displayText = displayText;
        this.value = value;
    }

    /** Display label abel for the URL. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayText")
    private final String displayText;

    /**
     * Display label abel for the URL.
     *
     * @return the value
     */
    public String getDisplayText() {
        return displayText;
    }

    /** URL/URI to display as a link. */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * URL/URI to display as a link.
     *
     * @return the value
     */
    public String getValue() {
        return value;
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
        sb.append("LinkOutput(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", displayText=").append(String.valueOf(this.displayText));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LinkOutput)) {
            return false;
        }

        LinkOutput other = (LinkOutput) o;
        return java.util.Objects.equals(this.displayText, other.displayText)
                && java.util.Objects.equals(this.value, other.value)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.displayText == null ? 43 : this.displayText.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        return result;
    }
}
