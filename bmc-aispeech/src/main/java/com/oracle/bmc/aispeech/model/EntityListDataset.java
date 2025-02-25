/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * Entity List Dataset
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = EntityListDataset.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "datasetType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class EntityListDataset extends CustomizationDatasetDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of sentences referencing 1 or more entityType matching those defined in the linked entityLists, used to improve accuracy by providing model training context of where/how an entity may appear in a sentence.
         * EntityTypes referenced in sentences should be written in all caps surrounded by angled braces (i.e "<PATIENT>" if entityType=patient)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("referenceExamples")
        private java.util.List<String> referenceExamples;

        /**
         * List of sentences referencing 1 or more entityType matching those defined in the linked entityLists, used to improve accuracy by providing model training context of where/how an entity may appear in a sentence.
         * EntityTypes referenced in sentences should be written in all caps surrounded by angled braces (i.e "<PATIENT>" if entityType=patient)
         *
         * @param referenceExamples the value to set
         * @return this builder
         **/
        public Builder referenceExamples(java.util.List<String> referenceExamples) {
            this.referenceExamples = referenceExamples;
            this.__explicitlySet__.add("referenceExamples");
            return this;
        }
        /**
         * Array of entityLists
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityList")
        private java.util.List<EntityList> entityList;

        /**
         * Array of entityLists
         * @param entityList the value to set
         * @return this builder
         **/
        public Builder entityList(java.util.List<EntityList> entityList) {
            this.entityList = entityList;
            this.__explicitlySet__.add("entityList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EntityListDataset build() {
            EntityListDataset model =
                    new EntityListDataset(this.referenceExamples, this.entityList);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EntityListDataset model) {
            if (model.wasPropertyExplicitlySet("referenceExamples")) {
                this.referenceExamples(model.getReferenceExamples());
            }
            if (model.wasPropertyExplicitlySet("entityList")) {
                this.entityList(model.getEntityList());
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
    public EntityListDataset(
            java.util.List<String> referenceExamples, java.util.List<EntityList> entityList) {
        super();
        this.referenceExamples = referenceExamples;
        this.entityList = entityList;
    }

    /**
     * List of sentences referencing 1 or more entityType matching those defined in the linked entityLists, used to improve accuracy by providing model training context of where/how an entity may appear in a sentence.
     * EntityTypes referenced in sentences should be written in all caps surrounded by angled braces (i.e "<PATIENT>" if entityType=patient)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referenceExamples")
    private final java.util.List<String> referenceExamples;

    /**
     * List of sentences referencing 1 or more entityType matching those defined in the linked entityLists, used to improve accuracy by providing model training context of where/how an entity may appear in a sentence.
     * EntityTypes referenced in sentences should be written in all caps surrounded by angled braces (i.e "<PATIENT>" if entityType=patient)
     *
     * @return the value
     **/
    public java.util.List<String> getReferenceExamples() {
        return referenceExamples;
    }

    /**
     * Array of entityLists
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityList")
    private final java.util.List<EntityList> entityList;

    /**
     * Array of entityLists
     * @return the value
     **/
    public java.util.List<EntityList> getEntityList() {
        return entityList;
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
        sb.append("EntityListDataset(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", referenceExamples=").append(String.valueOf(this.referenceExamples));
        sb.append(", entityList=").append(String.valueOf(this.entityList));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EntityListDataset)) {
            return false;
        }

        EntityListDataset other = (EntityListDataset) o;
        return java.util.Objects.equals(this.referenceExamples, other.referenceExamples)
                && java.util.Objects.equals(this.entityList, other.entityList)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.referenceExamples == null ? 43 : this.referenceExamples.hashCode());
        result = (result * PRIME) + (this.entityList == null ? 43 : this.entityList.hashCode());
        return result;
    }
}
