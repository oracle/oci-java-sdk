/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Summary of an entity tag.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EntityTagSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class EntityTagSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "entityKey",
        "key",
        "timeCreated",
        "name",
        "uri",
        "termKey",
        "termPath",
        "termDescription",
        "glossaryKey",
        "lifecycleState"
    })
    public EntityTagSummary(
            String entityKey,
            String key,
            java.util.Date timeCreated,
            String name,
            String uri,
            String termKey,
            String termPath,
            String termDescription,
            String glossaryKey,
            LifecycleState lifecycleState) {
        super();
        this.entityKey = entityKey;
        this.key = key;
        this.timeCreated = timeCreated;
        this.name = name;
        this.uri = uri;
        this.termKey = termKey;
        this.termPath = termPath;
        this.termDescription = termDescription;
        this.glossaryKey = glossaryKey;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique key of the parent entity.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityKey")
        private String entityKey;

        /**
         * The unique key of the parent entity.
         * @param entityKey the value to set
         * @return this builder
         **/
        public Builder entityKey(String entityKey) {
            this.entityKey = entityKey;
            this.__explicitlySet__.add("entityKey");
            return this;
        }
        /**
         * Unique tag key that is immutable.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Unique tag key that is immutable.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The date and time the tag was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2019-03-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the tag was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
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
         * Name of the tag that matches the term name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the tag that matches the term name.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * URI to the tag instance in the API.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        /**
         * URI to the tag instance in the API.
         * @param uri the value to set
         * @return this builder
         **/
        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }
        /**
         * Unique key of the related term.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("termKey")
        private String termKey;

        /**
         * Unique key of the related term.
         * @param termKey the value to set
         * @return this builder
         **/
        public Builder termKey(String termKey) {
            this.termKey = termKey;
            this.__explicitlySet__.add("termKey");
            return this;
        }
        /**
         * Path of the related term.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("termPath")
        private String termPath;

        /**
         * Path of the related term.
         * @param termPath the value to set
         * @return this builder
         **/
        public Builder termPath(String termPath) {
            this.termPath = termPath;
            this.__explicitlySet__.add("termPath");
            return this;
        }
        /**
         * Description of the related term.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("termDescription")
        private String termDescription;

        /**
         * Description of the related term.
         * @param termDescription the value to set
         * @return this builder
         **/
        public Builder termDescription(String termDescription) {
            this.termDescription = termDescription;
            this.__explicitlySet__.add("termDescription");
            return this;
        }
        /**
         * Unique id of the parent glossary of the term.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("glossaryKey")
        private String glossaryKey;

        /**
         * Unique id of the parent glossary of the term.
         * @param glossaryKey the value to set
         * @return this builder
         **/
        public Builder glossaryKey(String glossaryKey) {
            this.glossaryKey = glossaryKey;
            this.__explicitlySet__.add("glossaryKey");
            return this;
        }
        /**
         * State of the Tag.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * State of the Tag.
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

        public EntityTagSummary build() {
            EntityTagSummary model =
                    new EntityTagSummary(
                            this.entityKey,
                            this.key,
                            this.timeCreated,
                            this.name,
                            this.uri,
                            this.termKey,
                            this.termPath,
                            this.termDescription,
                            this.glossaryKey,
                            this.lifecycleState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EntityTagSummary model) {
            if (model.wasPropertyExplicitlySet("entityKey")) {
                this.entityKey(model.getEntityKey());
            }
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("uri")) {
                this.uri(model.getUri());
            }
            if (model.wasPropertyExplicitlySet("termKey")) {
                this.termKey(model.getTermKey());
            }
            if (model.wasPropertyExplicitlySet("termPath")) {
                this.termPath(model.getTermPath());
            }
            if (model.wasPropertyExplicitlySet("termDescription")) {
                this.termDescription(model.getTermDescription());
            }
            if (model.wasPropertyExplicitlySet("glossaryKey")) {
                this.glossaryKey(model.getGlossaryKey());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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
     * The unique key of the parent entity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityKey")
    private final String entityKey;

    /**
     * The unique key of the parent entity.
     * @return the value
     **/
    public String getEntityKey() {
        return entityKey;
    }

    /**
     * Unique tag key that is immutable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique tag key that is immutable.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * The date and time the tag was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the tag was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Name of the tag that matches the term name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the tag that matches the term name.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * URI to the tag instance in the API.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

    /**
     * URI to the tag instance in the API.
     * @return the value
     **/
    public String getUri() {
        return uri;
    }

    /**
     * Unique key of the related term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("termKey")
    private final String termKey;

    /**
     * Unique key of the related term.
     * @return the value
     **/
    public String getTermKey() {
        return termKey;
    }

    /**
     * Path of the related term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("termPath")
    private final String termPath;

    /**
     * Path of the related term.
     * @return the value
     **/
    public String getTermPath() {
        return termPath;
    }

    /**
     * Description of the related term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("termDescription")
    private final String termDescription;

    /**
     * Description of the related term.
     * @return the value
     **/
    public String getTermDescription() {
        return termDescription;
    }

    /**
     * Unique id of the parent glossary of the term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("glossaryKey")
    private final String glossaryKey;

    /**
     * Unique id of the parent glossary of the term.
     * @return the value
     **/
    public String getGlossaryKey() {
        return glossaryKey;
    }

    /**
     * State of the Tag.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * State of the Tag.
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
        sb.append("EntityTagSummary(");
        sb.append("super=").append(super.toString());
        sb.append("entityKey=").append(String.valueOf(this.entityKey));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", uri=").append(String.valueOf(this.uri));
        sb.append(", termKey=").append(String.valueOf(this.termKey));
        sb.append(", termPath=").append(String.valueOf(this.termPath));
        sb.append(", termDescription=").append(String.valueOf(this.termDescription));
        sb.append(", glossaryKey=").append(String.valueOf(this.glossaryKey));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EntityTagSummary)) {
            return false;
        }

        EntityTagSummary other = (EntityTagSummary) o;
        return java.util.Objects.equals(this.entityKey, other.entityKey)
                && java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.uri, other.uri)
                && java.util.Objects.equals(this.termKey, other.termKey)
                && java.util.Objects.equals(this.termPath, other.termPath)
                && java.util.Objects.equals(this.termDescription, other.termDescription)
                && java.util.Objects.equals(this.glossaryKey, other.glossaryKey)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.entityKey == null ? 43 : this.entityKey.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
        result = (result * PRIME) + (this.termKey == null ? 43 : this.termKey.hashCode());
        result = (result * PRIME) + (this.termPath == null ? 43 : this.termPath.hashCode());
        result =
                (result * PRIME)
                        + (this.termDescription == null ? 43 : this.termDescription.hashCode());
        result = (result * PRIME) + (this.glossaryKey == null ? 43 : this.glossaryKey.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
