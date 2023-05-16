/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Properties that are required to create a new Skill by cloning an existing Skill. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CloneSkillDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "kind")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CloneSkillDetails extends CreateSkillDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private String category;

        public Builder category(String category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("platformVersion")
        private String platformVersion;

        public Builder platformVersion(String platformVersion) {
            this.platformVersion = platformVersion;
            this.__explicitlySet__.add("platformVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("multilingualMode")
        private BotMultilingualMode multilingualMode;

        public Builder multilingualMode(BotMultilingualMode multilingualMode) {
            this.multilingualMode = multilingualMode;
            this.__explicitlySet__.add("multilingualMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("primaryLanguageTag")
        private String primaryLanguageTag;

        public Builder primaryLanguageTag(String primaryLanguageTag) {
            this.primaryLanguageTag = primaryLanguageTag;
            this.__explicitlySet__.add("primaryLanguageTag");
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
        /** The unique identifier of the Skill to clone. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique identifier of the Skill to clone.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The reource's name. The name can contain only letters, numbers, periods, and underscores.
         * The name must begin with a letter.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The reource's name. The name can contain only letters, numbers, periods, and underscores.
         * The name must begin with a letter.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The resource's display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The resource's display name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The resource's version. The version can only contain numbers, letters, periods,
         * underscores, dashes or spaces. The version must begin with a letter or a number.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The resource's version. The version can only contain numbers, letters, periods,
         * underscores, dashes or spaces. The version must begin with a letter or a number.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CloneSkillDetails build() {
            CloneSkillDetails model =
                    new CloneSkillDetails(
                            this.category,
                            this.description,
                            this.platformVersion,
                            this.multilingualMode,
                            this.primaryLanguageTag,
                            this.freeformTags,
                            this.definedTags,
                            this.id,
                            this.name,
                            this.displayName,
                            this.version);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CloneSkillDetails model) {
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("platformVersion")) {
                this.platformVersion(model.getPlatformVersion());
            }
            if (model.wasPropertyExplicitlySet("multilingualMode")) {
                this.multilingualMode(model.getMultilingualMode());
            }
            if (model.wasPropertyExplicitlySet("primaryLanguageTag")) {
                this.primaryLanguageTag(model.getPrimaryLanguageTag());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
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
    public CloneSkillDetails(
            String category,
            String description,
            String platformVersion,
            BotMultilingualMode multilingualMode,
            String primaryLanguageTag,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String id,
            String name,
            String displayName,
            String version) {
        super(
                category,
                description,
                platformVersion,
                multilingualMode,
                primaryLanguageTag,
                freeformTags,
                definedTags);
        this.id = id;
        this.name = name;
        this.displayName = displayName;
        this.version = version;
    }

    /** The unique identifier of the Skill to clone. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique identifier of the Skill to clone.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The reource's name. The name can contain only letters, numbers, periods, and underscores. The
     * name must begin with a letter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The reource's name. The name can contain only letters, numbers, periods, and underscores. The
     * name must begin with a letter.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The resource's display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The resource's display name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The resource's version. The version can only contain numbers, letters, periods, underscores,
     * dashes or spaces. The version must begin with a letter or a number.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The resource's version. The version can only contain numbers, letters, periods, underscores,
     * dashes or spaces. The version must begin with a letter or a number.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
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
        sb.append("CloneSkillDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CloneSkillDetails)) {
            return false;
        }

        CloneSkillDetails other = (CloneSkillDetails) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.version, other.version)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        return result;
    }
}
