/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * The document response for health entity detect call. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = HealthEntityDocumentResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HealthEntityDocumentResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "entities",
        "relations",
        "resolvedEntities",
        "languageCode"
    })
    public HealthEntityDocumentResult(
            String key,
            java.util.List<HealthEntity> entities,
            java.util.List<RelationEntity> relations,
            java.util.Map<String, ResolvedEntities> resolvedEntities,
            String languageCode) {
        super();
        this.key = key;
        this.entities = entities;
        this.relations = relations;
        this.resolvedEntities = resolvedEntities;
        this.languageCode = languageCode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Document unique identifier defined by the user. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Document unique identifier defined by the user.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** List of detected entities. */
        @com.fasterxml.jackson.annotation.JsonProperty("entities")
        private java.util.List<HealthEntity> entities;

        /**
         * List of detected entities.
         *
         * @param entities the value to set
         * @return this builder
         */
        public Builder entities(java.util.List<HealthEntity> entities) {
            this.entities = entities;
            this.__explicitlySet__.add("entities");
            return this;
        }
        /** List of succeeded document response. */
        @com.fasterxml.jackson.annotation.JsonProperty("relations")
        private java.util.List<RelationEntity> relations;

        /**
         * List of succeeded document response.
         *
         * @param relations the value to set
         * @return this builder
         */
        public Builder relations(java.util.List<RelationEntity> relations) {
            this.relations = relations;
            this.__explicitlySet__.add("relations");
            return this;
        }
        /** Map of resolved entities by entity type */
        @com.fasterxml.jackson.annotation.JsonProperty("resolvedEntities")
        private java.util.Map<String, ResolvedEntities> resolvedEntities;

        /**
         * Map of resolved entities by entity type
         *
         * @param resolvedEntities the value to set
         * @return this builder
         */
        public Builder resolvedEntities(java.util.Map<String, ResolvedEntities> resolvedEntities) {
            this.resolvedEntities = resolvedEntities;
            this.__explicitlySet__.add("resolvedEntities");
            return this;
        }
        /**
         * Language code of the document. Please refer to respective model [API
         * documentation](https://docs.oracle.com/iaas/language/using/overview.htm) for supported
         * languages.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
        private String languageCode;

        /**
         * Language code of the document. Please refer to respective model [API
         * documentation](https://docs.oracle.com/iaas/language/using/overview.htm) for supported
         * languages.
         *
         * @param languageCode the value to set
         * @return this builder
         */
        public Builder languageCode(String languageCode) {
            this.languageCode = languageCode;
            this.__explicitlySet__.add("languageCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HealthEntityDocumentResult build() {
            HealthEntityDocumentResult model =
                    new HealthEntityDocumentResult(
                            this.key,
                            this.entities,
                            this.relations,
                            this.resolvedEntities,
                            this.languageCode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HealthEntityDocumentResult model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("entities")) {
                this.entities(model.getEntities());
            }
            if (model.wasPropertyExplicitlySet("relations")) {
                this.relations(model.getRelations());
            }
            if (model.wasPropertyExplicitlySet("resolvedEntities")) {
                this.resolvedEntities(model.getResolvedEntities());
            }
            if (model.wasPropertyExplicitlySet("languageCode")) {
                this.languageCode(model.getLanguageCode());
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

    /** Document unique identifier defined by the user. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Document unique identifier defined by the user.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** List of detected entities. */
    @com.fasterxml.jackson.annotation.JsonProperty("entities")
    private final java.util.List<HealthEntity> entities;

    /**
     * List of detected entities.
     *
     * @return the value
     */
    public java.util.List<HealthEntity> getEntities() {
        return entities;
    }

    /** List of succeeded document response. */
    @com.fasterxml.jackson.annotation.JsonProperty("relations")
    private final java.util.List<RelationEntity> relations;

    /**
     * List of succeeded document response.
     *
     * @return the value
     */
    public java.util.List<RelationEntity> getRelations() {
        return relations;
    }

    /** Map of resolved entities by entity type */
    @com.fasterxml.jackson.annotation.JsonProperty("resolvedEntities")
    private final java.util.Map<String, ResolvedEntities> resolvedEntities;

    /**
     * Map of resolved entities by entity type
     *
     * @return the value
     */
    public java.util.Map<String, ResolvedEntities> getResolvedEntities() {
        return resolvedEntities;
    }

    /**
     * Language code of the document. Please refer to respective model [API
     * documentation](https://docs.oracle.com/iaas/language/using/overview.htm) for supported
     * languages.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
    private final String languageCode;

    /**
     * Language code of the document. Please refer to respective model [API
     * documentation](https://docs.oracle.com/iaas/language/using/overview.htm) for supported
     * languages.
     *
     * @return the value
     */
    public String getLanguageCode() {
        return languageCode;
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
        sb.append("HealthEntityDocumentResult(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", entities=").append(String.valueOf(this.entities));
        sb.append(", relations=").append(String.valueOf(this.relations));
        sb.append(", resolvedEntities=").append(String.valueOf(this.resolvedEntities));
        sb.append(", languageCode=").append(String.valueOf(this.languageCode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HealthEntityDocumentResult)) {
            return false;
        }

        HealthEntityDocumentResult other = (HealthEntityDocumentResult) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.entities, other.entities)
                && java.util.Objects.equals(this.relations, other.relations)
                && java.util.Objects.equals(this.resolvedEntities, other.resolvedEntities)
                && java.util.Objects.equals(this.languageCode, other.languageCode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.entities == null ? 43 : this.entities.hashCode());
        result = (result * PRIME) + (this.relations == null ? 43 : this.relations.hashCode());
        result =
                (result * PRIME)
                        + (this.resolvedEntities == null ? 43 : this.resolvedEntities.hashCode());
        result = (result * PRIME) + (this.languageCode == null ? 43 : this.languageCode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
