/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * The document response for entities detect call.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = EntityDocumentResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class EntityDocumentResult {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "entities", "languageCode"})
    public EntityDocumentResult(
            String key, java.util.List<HierarchicalEntity> entities, String languageCode) {
        super();
        this.key = key;
        this.entities = entities;
        this.languageCode = languageCode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Document unique identifier defined by the user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Document unique identifier defined by the user.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * List of detected entities.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entities")
        private java.util.List<HierarchicalEntity> entities;

        /**
         * List of detected entities.
         * @param entities the value to set
         * @return this builder
         **/
        public Builder entities(java.util.List<HierarchicalEntity> entities) {
            this.entities = entities;
            this.__explicitlySet__.add("entities");
            return this;
        }
        /**
         * Language code as per [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) standard.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
        private String languageCode;

        /**
         * Language code as per [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) standard.
         * @param languageCode the value to set
         * @return this builder
         **/
        public Builder languageCode(String languageCode) {
            this.languageCode = languageCode;
            this.__explicitlySet__.add("languageCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EntityDocumentResult build() {
            EntityDocumentResult __instance__ =
                    new EntityDocumentResult(key, entities, languageCode);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EntityDocumentResult o) {
            Builder copiedBuilder =
                    key(o.getKey()).entities(o.getEntities()).languageCode(o.getLanguageCode());

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
     * Document unique identifier defined by the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Document unique identifier defined by the user.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * List of detected entities.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entities")
    private final java.util.List<HierarchicalEntity> entities;

    /**
     * List of detected entities.
     * @return the value
     **/
    public java.util.List<HierarchicalEntity> getEntities() {
        return entities;
    }

    /**
     * Language code as per [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) standard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
    private final String languageCode;

    /**
     * Language code as per [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) standard.
     * @return the value
     **/
    public String getLanguageCode() {
        return languageCode;
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
        sb.append("EntityDocumentResult(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", entities=").append(String.valueOf(this.entities));
        sb.append(", languageCode=").append(String.valueOf(this.languageCode));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EntityDocumentResult)) {
            return false;
        }

        EntityDocumentResult other = (EntityDocumentResult) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.entities, other.entities)
                && java.util.Objects.equals(this.languageCode, other.languageCode)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.entities == null ? 43 : this.entities.hashCode());
        result = (result * PRIME) + (this.languageCode == null ? 43 : this.languageCode.hashCode());
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
