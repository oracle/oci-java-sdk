/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Full term relationship definition. Business term relationship between two terms in a business glossary.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TermRelationship.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TermRelationship {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "displayName",
        "description",
        "relatedTermKey",
        "relatedTermDisplayName",
        "relatedTermDescription",
        "relatedTermPath",
        "relatedTermGlossaryKey",
        "uri",
        "parentTermKey",
        "parentTermDisplayName",
        "parentTermDescription",
        "parentTermPath",
        "parentTermGlossaryKey",
        "timeCreated",
        "lifecycleState"
    })
    public TermRelationship(
            String key,
            String displayName,
            String description,
            String relatedTermKey,
            String relatedTermDisplayName,
            String relatedTermDescription,
            String relatedTermPath,
            String relatedTermGlossaryKey,
            String uri,
            String parentTermKey,
            String parentTermDisplayName,
            String parentTermDescription,
            String parentTermPath,
            String parentTermGlossaryKey,
            java.util.Date timeCreated,
            LifecycleState lifecycleState) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.relatedTermKey = relatedTermKey;
        this.relatedTermDisplayName = relatedTermDisplayName;
        this.relatedTermDescription = relatedTermDescription;
        this.relatedTermPath = relatedTermPath;
        this.relatedTermGlossaryKey = relatedTermGlossaryKey;
        this.uri = uri;
        this.parentTermKey = parentTermKey;
        this.parentTermDisplayName = parentTermDisplayName;
        this.parentTermDescription = parentTermDescription;
        this.parentTermPath = parentTermPath;
        this.parentTermGlossaryKey = parentTermGlossaryKey;
        this.timeCreated = timeCreated;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique term relationship key that is immutable.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Unique term relationship key that is immutable.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.This is the same as relationshipType for termRelationship
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.This is the same as relationshipType for termRelationship
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Detailed description of the term relationship usually defined at the time of creation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detailed description of the term relationship usually defined at the time of creation.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Unique id of the related term.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("relatedTermKey")
        private String relatedTermKey;

        /**
         * Unique id of the related term.
         * @param relatedTermKey the value to set
         * @return this builder
         **/
        public Builder relatedTermKey(String relatedTermKey) {
            this.relatedTermKey = relatedTermKey;
            this.__explicitlySet__.add("relatedTermKey");
            return this;
        }
        /**
         * Name of the related term.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("relatedTermDisplayName")
        private String relatedTermDisplayName;

        /**
         * Name of the related term.
         * @param relatedTermDisplayName the value to set
         * @return this builder
         **/
        public Builder relatedTermDisplayName(String relatedTermDisplayName) {
            this.relatedTermDisplayName = relatedTermDisplayName;
            this.__explicitlySet__.add("relatedTermDisplayName");
            return this;
        }
        /**
         * Description of the related term.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("relatedTermDescription")
        private String relatedTermDescription;

        /**
         * Description of the related term.
         * @param relatedTermDescription the value to set
         * @return this builder
         **/
        public Builder relatedTermDescription(String relatedTermDescription) {
            this.relatedTermDescription = relatedTermDescription;
            this.__explicitlySet__.add("relatedTermDescription");
            return this;
        }
        /**
         * Full path of the related term.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("relatedTermPath")
        private String relatedTermPath;

        /**
         * Full path of the related term.
         * @param relatedTermPath the value to set
         * @return this builder
         **/
        public Builder relatedTermPath(String relatedTermPath) {
            this.relatedTermPath = relatedTermPath;
            this.__explicitlySet__.add("relatedTermPath");
            return this;
        }
        /**
         * Glossary key of the related term.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("relatedTermGlossaryKey")
        private String relatedTermGlossaryKey;

        /**
         * Glossary key of the related term.
         * @param relatedTermGlossaryKey the value to set
         * @return this builder
         **/
        public Builder relatedTermGlossaryKey(String relatedTermGlossaryKey) {
            this.relatedTermGlossaryKey = relatedTermGlossaryKey;
            this.__explicitlySet__.add("relatedTermGlossaryKey");
            return this;
        }
        /**
         * URI to the term relationship instance in the API.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        /**
         * URI to the term relationship instance in the API.
         * @param uri the value to set
         * @return this builder
         **/
        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }
        /**
         * This relationships parent term key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parentTermKey")
        private String parentTermKey;

        /**
         * This relationships parent term key.
         * @param parentTermKey the value to set
         * @return this builder
         **/
        public Builder parentTermKey(String parentTermKey) {
            this.parentTermKey = parentTermKey;
            this.__explicitlySet__.add("parentTermKey");
            return this;
        }
        /**
         * Name of the parent term.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parentTermDisplayName")
        private String parentTermDisplayName;

        /**
         * Name of the parent term.
         * @param parentTermDisplayName the value to set
         * @return this builder
         **/
        public Builder parentTermDisplayName(String parentTermDisplayName) {
            this.parentTermDisplayName = parentTermDisplayName;
            this.__explicitlySet__.add("parentTermDisplayName");
            return this;
        }
        /**
         * Description of the parent term.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parentTermDescription")
        private String parentTermDescription;

        /**
         * Description of the parent term.
         * @param parentTermDescription the value to set
         * @return this builder
         **/
        public Builder parentTermDescription(String parentTermDescription) {
            this.parentTermDescription = parentTermDescription;
            this.__explicitlySet__.add("parentTermDescription");
            return this;
        }
        /**
         * Full path of the parent term.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parentTermPath")
        private String parentTermPath;

        /**
         * Full path of the parent term.
         * @param parentTermPath the value to set
         * @return this builder
         **/
        public Builder parentTermPath(String parentTermPath) {
            this.parentTermPath = parentTermPath;
            this.__explicitlySet__.add("parentTermPath");
            return this;
        }
        /**
         * Glossary key of the parent term.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parentTermGlossaryKey")
        private String parentTermGlossaryKey;

        /**
         * Glossary key of the parent term.
         * @param parentTermGlossaryKey the value to set
         * @return this builder
         **/
        public Builder parentTermGlossaryKey(String parentTermGlossaryKey) {
            this.parentTermGlossaryKey = parentTermGlossaryKey;
            this.__explicitlySet__.add("parentTermGlossaryKey");
            return this;
        }
        /**
         * The date and time the term relationship was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2019-03-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the term relationship was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2019-03-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * State of the term relationship.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * State of the term relationship.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TermRelationship build() {
            TermRelationship __instance__ =
                    new TermRelationship(
                            key,
                            displayName,
                            description,
                            relatedTermKey,
                            relatedTermDisplayName,
                            relatedTermDescription,
                            relatedTermPath,
                            relatedTermGlossaryKey,
                            uri,
                            parentTermKey,
                            parentTermDisplayName,
                            parentTermDescription,
                            parentTermPath,
                            parentTermGlossaryKey,
                            timeCreated,
                            lifecycleState);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TermRelationship o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .relatedTermKey(o.getRelatedTermKey())
                            .relatedTermDisplayName(o.getRelatedTermDisplayName())
                            .relatedTermDescription(o.getRelatedTermDescription())
                            .relatedTermPath(o.getRelatedTermPath())
                            .relatedTermGlossaryKey(o.getRelatedTermGlossaryKey())
                            .uri(o.getUri())
                            .parentTermKey(o.getParentTermKey())
                            .parentTermDisplayName(o.getParentTermDisplayName())
                            .parentTermDescription(o.getParentTermDescription())
                            .parentTermPath(o.getParentTermPath())
                            .parentTermGlossaryKey(o.getParentTermGlossaryKey())
                            .timeCreated(o.getTimeCreated())
                            .lifecycleState(o.getLifecycleState());

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
     * Unique term relationship key that is immutable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique term relationship key that is immutable.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.This is the same as relationshipType for termRelationship
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.This is the same as relationshipType for termRelationship
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Detailed description of the term relationship usually defined at the time of creation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed description of the term relationship usually defined at the time of creation.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Unique id of the related term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relatedTermKey")
    private final String relatedTermKey;

    /**
     * Unique id of the related term.
     * @return the value
     **/
    public String getRelatedTermKey() {
        return relatedTermKey;
    }

    /**
     * Name of the related term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relatedTermDisplayName")
    private final String relatedTermDisplayName;

    /**
     * Name of the related term.
     * @return the value
     **/
    public String getRelatedTermDisplayName() {
        return relatedTermDisplayName;
    }

    /**
     * Description of the related term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relatedTermDescription")
    private final String relatedTermDescription;

    /**
     * Description of the related term.
     * @return the value
     **/
    public String getRelatedTermDescription() {
        return relatedTermDescription;
    }

    /**
     * Full path of the related term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relatedTermPath")
    private final String relatedTermPath;

    /**
     * Full path of the related term.
     * @return the value
     **/
    public String getRelatedTermPath() {
        return relatedTermPath;
    }

    /**
     * Glossary key of the related term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relatedTermGlossaryKey")
    private final String relatedTermGlossaryKey;

    /**
     * Glossary key of the related term.
     * @return the value
     **/
    public String getRelatedTermGlossaryKey() {
        return relatedTermGlossaryKey;
    }

    /**
     * URI to the term relationship instance in the API.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

    /**
     * URI to the term relationship instance in the API.
     * @return the value
     **/
    public String getUri() {
        return uri;
    }

    /**
     * This relationships parent term key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentTermKey")
    private final String parentTermKey;

    /**
     * This relationships parent term key.
     * @return the value
     **/
    public String getParentTermKey() {
        return parentTermKey;
    }

    /**
     * Name of the parent term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentTermDisplayName")
    private final String parentTermDisplayName;

    /**
     * Name of the parent term.
     * @return the value
     **/
    public String getParentTermDisplayName() {
        return parentTermDisplayName;
    }

    /**
     * Description of the parent term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentTermDescription")
    private final String parentTermDescription;

    /**
     * Description of the parent term.
     * @return the value
     **/
    public String getParentTermDescription() {
        return parentTermDescription;
    }

    /**
     * Full path of the parent term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentTermPath")
    private final String parentTermPath;

    /**
     * Full path of the parent term.
     * @return the value
     **/
    public String getParentTermPath() {
        return parentTermPath;
    }

    /**
     * Glossary key of the parent term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentTermGlossaryKey")
    private final String parentTermGlossaryKey;

    /**
     * Glossary key of the parent term.
     * @return the value
     **/
    public String getParentTermGlossaryKey() {
        return parentTermGlossaryKey;
    }

    /**
     * The date and time the term relationship was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the term relationship was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * State of the term relationship.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * State of the term relationship.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("TermRelationship(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", relatedTermKey=").append(String.valueOf(this.relatedTermKey));
        sb.append(", relatedTermDisplayName=").append(String.valueOf(this.relatedTermDisplayName));
        sb.append(", relatedTermDescription=").append(String.valueOf(this.relatedTermDescription));
        sb.append(", relatedTermPath=").append(String.valueOf(this.relatedTermPath));
        sb.append(", relatedTermGlossaryKey=").append(String.valueOf(this.relatedTermGlossaryKey));
        sb.append(", uri=").append(String.valueOf(this.uri));
        sb.append(", parentTermKey=").append(String.valueOf(this.parentTermKey));
        sb.append(", parentTermDisplayName=").append(String.valueOf(this.parentTermDisplayName));
        sb.append(", parentTermDescription=").append(String.valueOf(this.parentTermDescription));
        sb.append(", parentTermPath=").append(String.valueOf(this.parentTermPath));
        sb.append(", parentTermGlossaryKey=").append(String.valueOf(this.parentTermGlossaryKey));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TermRelationship)) {
            return false;
        }

        TermRelationship other = (TermRelationship) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.relatedTermKey, other.relatedTermKey)
                && java.util.Objects.equals(
                        this.relatedTermDisplayName, other.relatedTermDisplayName)
                && java.util.Objects.equals(
                        this.relatedTermDescription, other.relatedTermDescription)
                && java.util.Objects.equals(this.relatedTermPath, other.relatedTermPath)
                && java.util.Objects.equals(
                        this.relatedTermGlossaryKey, other.relatedTermGlossaryKey)
                && java.util.Objects.equals(this.uri, other.uri)
                && java.util.Objects.equals(this.parentTermKey, other.parentTermKey)
                && java.util.Objects.equals(this.parentTermDisplayName, other.parentTermDisplayName)
                && java.util.Objects.equals(this.parentTermDescription, other.parentTermDescription)
                && java.util.Objects.equals(this.parentTermPath, other.parentTermPath)
                && java.util.Objects.equals(this.parentTermGlossaryKey, other.parentTermGlossaryKey)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.relatedTermKey == null ? 43 : this.relatedTermKey.hashCode());
        result =
                (result * PRIME)
                        + (this.relatedTermDisplayName == null
                                ? 43
                                : this.relatedTermDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.relatedTermDescription == null
                                ? 43
                                : this.relatedTermDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.relatedTermPath == null ? 43 : this.relatedTermPath.hashCode());
        result =
                (result * PRIME)
                        + (this.relatedTermGlossaryKey == null
                                ? 43
                                : this.relatedTermGlossaryKey.hashCode());
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
        result =
                (result * PRIME)
                        + (this.parentTermKey == null ? 43 : this.parentTermKey.hashCode());
        result =
                (result * PRIME)
                        + (this.parentTermDisplayName == null
                                ? 43
                                : this.parentTermDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.parentTermDescription == null
                                ? 43
                                : this.parentTermDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.parentTermPath == null ? 43 : this.parentTermPath.hashCode());
        result =
                (result * PRIME)
                        + (this.parentTermGlossaryKey == null
                                ? 43
                                : this.parentTermGlossaryKey.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
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
