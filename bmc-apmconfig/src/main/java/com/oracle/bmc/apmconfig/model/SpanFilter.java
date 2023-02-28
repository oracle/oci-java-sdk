/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig.model;

/**
 * A named setting that specifies the filter criteria to match a subset of the spans. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SpanFilter.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "configType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class SpanFilter extends Config {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
        private String updatedBy;

        public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            this.__explicitlySet__.add("updatedBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("etag")
        private String etag;

        public Builder etag(String etag) {
            this.etag = etag;
            this.__explicitlySet__.add("etag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /** The name by which a configuration entity is displayed to the end user. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name by which a configuration entity is displayed to the end user.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The string that defines the Span Filter expression. */
        @com.fasterxml.jackson.annotation.JsonProperty("filterText")
        private String filterText;

        /**
         * The string that defines the Span Filter expression.
         *
         * @param filterText the value to set
         * @return this builder
         */
        public Builder filterText(String filterText) {
            this.filterText = filterText;
            this.__explicitlySet__.add("filterText");
            return this;
        }
        /** The list of configuration items that reference the span filter. */
        @com.fasterxml.jackson.annotation.JsonProperty("inUseBy")
        private java.util.List<SpanFilterReference> inUseBy;

        /**
         * The list of configuration items that reference the span filter.
         *
         * @param inUseBy the value to set
         * @return this builder
         */
        public Builder inUseBy(java.util.List<SpanFilterReference> inUseBy) {
            this.inUseBy = inUseBy;
            this.__explicitlySet__.add("inUseBy");
            return this;
        }
        /** An optional string that describes what the span filter is intended or used for. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * An optional string that describes what the span filter is intended or used for.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SpanFilter build() {
            SpanFilter model =
                    new SpanFilter(
                            this.id,
                            this.timeCreated,
                            this.timeUpdated,
                            this.createdBy,
                            this.updatedBy,
                            this.etag,
                            this.freeformTags,
                            this.definedTags,
                            this.displayName,
                            this.filterText,
                            this.inUseBy,
                            this.description);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SpanFilter model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("updatedBy")) {
                this.updatedBy(model.getUpdatedBy());
            }
            if (model.wasPropertyExplicitlySet("etag")) {
                this.etag(model.getEtag());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("filterText")) {
                this.filterText(model.getFilterText());
            }
            if (model.wasPropertyExplicitlySet("inUseBy")) {
                this.inUseBy(model.getInUseBy());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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
    public SpanFilter(
            String id,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String createdBy,
            String updatedBy,
            String etag,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            String filterText,
            java.util.List<SpanFilterReference> inUseBy,
            String description) {
        super(id, timeCreated, timeUpdated, createdBy, updatedBy, etag, freeformTags, definedTags);
        this.displayName = displayName;
        this.filterText = filterText;
        this.inUseBy = inUseBy;
        this.description = description;
    }

    /** The name by which a configuration entity is displayed to the end user. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name by which a configuration entity is displayed to the end user.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The string that defines the Span Filter expression. */
    @com.fasterxml.jackson.annotation.JsonProperty("filterText")
    private final String filterText;

    /**
     * The string that defines the Span Filter expression.
     *
     * @return the value
     */
    public String getFilterText() {
        return filterText;
    }

    /** The list of configuration items that reference the span filter. */
    @com.fasterxml.jackson.annotation.JsonProperty("inUseBy")
    private final java.util.List<SpanFilterReference> inUseBy;

    /**
     * The list of configuration items that reference the span filter.
     *
     * @return the value
     */
    public java.util.List<SpanFilterReference> getInUseBy() {
        return inUseBy;
    }

    /** An optional string that describes what the span filter is intended or used for. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * An optional string that describes what the span filter is intended or used for.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
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
        sb.append("SpanFilter(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", filterText=").append(String.valueOf(this.filterText));
        sb.append(", inUseBy=").append(String.valueOf(this.inUseBy));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SpanFilter)) {
            return false;
        }

        SpanFilter other = (SpanFilter) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.filterText, other.filterText)
                && java.util.Objects.equals(this.inUseBy, other.inUseBy)
                && java.util.Objects.equals(this.description, other.description)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.filterText == null ? 43 : this.filterText.hashCode());
        result = (result * PRIME) + (this.inUseBy == null ? 43 : this.inUseBy.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        return result;
    }
}
