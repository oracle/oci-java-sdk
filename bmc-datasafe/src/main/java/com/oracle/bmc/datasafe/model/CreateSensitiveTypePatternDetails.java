/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details to create a new sensitive type with regular expressions.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateSensitiveTypePatternDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "entityType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateSensitiveTypePatternDetails extends CreateSensitiveTypeDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shortName")
        private String shortName;

        public Builder shortName(String shortName) {
            this.shortName = shortName;
            this.__explicitlySet__.add("shortName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentCategoryId")
        private String parentCategoryId;

        public Builder parentCategoryId(String parentCategoryId) {
            this.parentCategoryId = parentCategoryId;
            this.__explicitlySet__.add("parentCategoryId");
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
        /**
         * A regular expression to be used by data discovery for matching column names.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("namePattern")
        private String namePattern;

        /**
         * A regular expression to be used by data discovery for matching column names.
         * @param namePattern the value to set
         * @return this builder
         **/
        public Builder namePattern(String namePattern) {
            this.namePattern = namePattern;
            this.__explicitlySet__.add("namePattern");
            return this;
        }
        /**
         * A regular expression to be used by data discovery for matching column comments.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("commentPattern")
        private String commentPattern;

        /**
         * A regular expression to be used by data discovery for matching column comments.
         * @param commentPattern the value to set
         * @return this builder
         **/
        public Builder commentPattern(String commentPattern) {
            this.commentPattern = commentPattern;
            this.__explicitlySet__.add("commentPattern");
            return this;
        }
        /**
         * A regular expression to be used by data discovery for matching column data values.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataPattern")
        private String dataPattern;

        /**
         * A regular expression to be used by data discovery for matching column data values.
         * @param dataPattern the value to set
         * @return this builder
         **/
        public Builder dataPattern(String dataPattern) {
            this.dataPattern = dataPattern;
            this.__explicitlySet__.add("dataPattern");
            return this;
        }
        /**
         * The search type indicating how the column name, comment and data patterns should be used by data discovery.
         * [Learn more](https://docs.oracle.com/en/cloud/paas/data-safe/udscs/sensitive-types.html#GUID-1D1AD98E-B93F-4FF2-80AE-CB7D8A14F6CC).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("searchType")
        private SensitiveTypePattern.SearchType searchType;

        /**
         * The search type indicating how the column name, comment and data patterns should be used by data discovery.
         * [Learn more](https://docs.oracle.com/en/cloud/paas/data-safe/udscs/sensitive-types.html#GUID-1D1AD98E-B93F-4FF2-80AE-CB7D8A14F6CC).
         *
         * @param searchType the value to set
         * @return this builder
         **/
        public Builder searchType(SensitiveTypePattern.SearchType searchType) {
            this.searchType = searchType;
            this.__explicitlySet__.add("searchType");
            return this;
        }
        /**
         * The OCID of the library masking format that should be used to mask the sensitive columns associated with the sensitive type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultMaskingFormatId")
        private String defaultMaskingFormatId;

        /**
         * The OCID of the library masking format that should be used to mask the sensitive columns associated with the sensitive type.
         * @param defaultMaskingFormatId the value to set
         * @return this builder
         **/
        public Builder defaultMaskingFormatId(String defaultMaskingFormatId) {
            this.defaultMaskingFormatId = defaultMaskingFormatId;
            this.__explicitlySet__.add("defaultMaskingFormatId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSensitiveTypePatternDetails build() {
            CreateSensitiveTypePatternDetails model =
                    new CreateSensitiveTypePatternDetails(
                            this.displayName,
                            this.compartmentId,
                            this.shortName,
                            this.description,
                            this.parentCategoryId,
                            this.freeformTags,
                            this.definedTags,
                            this.namePattern,
                            this.commentPattern,
                            this.dataPattern,
                            this.searchType,
                            this.defaultMaskingFormatId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSensitiveTypePatternDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("shortName")) {
                this.shortName(model.getShortName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("parentCategoryId")) {
                this.parentCategoryId(model.getParentCategoryId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("namePattern")) {
                this.namePattern(model.getNamePattern());
            }
            if (model.wasPropertyExplicitlySet("commentPattern")) {
                this.commentPattern(model.getCommentPattern());
            }
            if (model.wasPropertyExplicitlySet("dataPattern")) {
                this.dataPattern(model.getDataPattern());
            }
            if (model.wasPropertyExplicitlySet("searchType")) {
                this.searchType(model.getSearchType());
            }
            if (model.wasPropertyExplicitlySet("defaultMaskingFormatId")) {
                this.defaultMaskingFormatId(model.getDefaultMaskingFormatId());
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

    @Deprecated
    public CreateSensitiveTypePatternDetails(
            String displayName,
            String compartmentId,
            String shortName,
            String description,
            String parentCategoryId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String namePattern,
            String commentPattern,
            String dataPattern,
            SensitiveTypePattern.SearchType searchType,
            String defaultMaskingFormatId) {
        super(
                displayName,
                compartmentId,
                shortName,
                description,
                parentCategoryId,
                freeformTags,
                definedTags);
        this.namePattern = namePattern;
        this.commentPattern = commentPattern;
        this.dataPattern = dataPattern;
        this.searchType = searchType;
        this.defaultMaskingFormatId = defaultMaskingFormatId;
    }

    /**
     * A regular expression to be used by data discovery for matching column names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namePattern")
    private final String namePattern;

    /**
     * A regular expression to be used by data discovery for matching column names.
     * @return the value
     **/
    public String getNamePattern() {
        return namePattern;
    }

    /**
     * A regular expression to be used by data discovery for matching column comments.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commentPattern")
    private final String commentPattern;

    /**
     * A regular expression to be used by data discovery for matching column comments.
     * @return the value
     **/
    public String getCommentPattern() {
        return commentPattern;
    }

    /**
     * A regular expression to be used by data discovery for matching column data values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataPattern")
    private final String dataPattern;

    /**
     * A regular expression to be used by data discovery for matching column data values.
     * @return the value
     **/
    public String getDataPattern() {
        return dataPattern;
    }

    /**
     * The search type indicating how the column name, comment and data patterns should be used by data discovery.
     * [Learn more](https://docs.oracle.com/en/cloud/paas/data-safe/udscs/sensitive-types.html#GUID-1D1AD98E-B93F-4FF2-80AE-CB7D8A14F6CC).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("searchType")
    private final SensitiveTypePattern.SearchType searchType;

    /**
     * The search type indicating how the column name, comment and data patterns should be used by data discovery.
     * [Learn more](https://docs.oracle.com/en/cloud/paas/data-safe/udscs/sensitive-types.html#GUID-1D1AD98E-B93F-4FF2-80AE-CB7D8A14F6CC).
     *
     * @return the value
     **/
    public SensitiveTypePattern.SearchType getSearchType() {
        return searchType;
    }

    /**
     * The OCID of the library masking format that should be used to mask the sensitive columns associated with the sensitive type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultMaskingFormatId")
    private final String defaultMaskingFormatId;

    /**
     * The OCID of the library masking format that should be used to mask the sensitive columns associated with the sensitive type.
     * @return the value
     **/
    public String getDefaultMaskingFormatId() {
        return defaultMaskingFormatId;
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
        sb.append("CreateSensitiveTypePatternDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", namePattern=").append(String.valueOf(this.namePattern));
        sb.append(", commentPattern=").append(String.valueOf(this.commentPattern));
        sb.append(", dataPattern=").append(String.valueOf(this.dataPattern));
        sb.append(", searchType=").append(String.valueOf(this.searchType));
        sb.append(", defaultMaskingFormatId=").append(String.valueOf(this.defaultMaskingFormatId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSensitiveTypePatternDetails)) {
            return false;
        }

        CreateSensitiveTypePatternDetails other = (CreateSensitiveTypePatternDetails) o;
        return java.util.Objects.equals(this.namePattern, other.namePattern)
                && java.util.Objects.equals(this.commentPattern, other.commentPattern)
                && java.util.Objects.equals(this.dataPattern, other.dataPattern)
                && java.util.Objects.equals(this.searchType, other.searchType)
                && java.util.Objects.equals(
                        this.defaultMaskingFormatId, other.defaultMaskingFormatId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.namePattern == null ? 43 : this.namePattern.hashCode());
        result =
                (result * PRIME)
                        + (this.commentPattern == null ? 43 : this.commentPattern.hashCode());
        result = (result * PRIME) + (this.dataPattern == null ? 43 : this.dataPattern.hashCode());
        result = (result * PRIME) + (this.searchType == null ? 43 : this.searchType.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultMaskingFormatId == null
                                ? 43
                                : this.defaultMaskingFormatId.hashCode());
        return result;
    }
}
