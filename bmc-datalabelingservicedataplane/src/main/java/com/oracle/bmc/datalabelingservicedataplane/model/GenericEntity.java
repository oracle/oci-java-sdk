/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane.model;

/**
 * This is an extensible entity type for users, and the base entity type for some annotation
 * formats. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GenericEntity.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "entityType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GenericEntity extends Entity {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("documentEntityMetadata")
        private DocumentEntityMetadata documentEntityMetadata;

        public Builder documentEntityMetadata(DocumentEntityMetadata documentEntityMetadata) {
            this.documentEntityMetadata = documentEntityMetadata;
            this.__explicitlySet__.add("documentEntityMetadata");
            return this;
        }
        /** A collection of label entities. */
        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<Label> labels;

        /**
         * A collection of label entities.
         *
         * @param labels the value to set
         * @return this builder
         */
        public Builder labels(java.util.List<Label> labels) {
            this.labels = labels;
            this.__explicitlySet__.add("labels");
            return this;
        }
        /**
         * A simple key-value pair that is applied without any predefined name, type, or scope. It
         * exists for cross-compatibility only. For example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
        private java.util.Map<String, String> extendedMetadata;

        /**
         * A simple key-value pair that is applied without any predefined name, type, or scope. It
         * exists for cross-compatibility only. For example: {@code {"bar-key": "value"}}
         *
         * @param extendedMetadata the value to set
         * @return this builder
         */
        public Builder extendedMetadata(java.util.Map<String, String> extendedMetadata) {
            this.extendedMetadata = extendedMetadata;
            this.__explicitlySet__.add("extendedMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenericEntity build() {
            GenericEntity model =
                    new GenericEntity(
                            this.documentEntityMetadata, this.labels, this.extendedMetadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenericEntity model) {
            if (model.wasPropertyExplicitlySet("documentEntityMetadata")) {
                this.documentEntityMetadata(model.getDocumentEntityMetadata());
            }
            if (model.wasPropertyExplicitlySet("labels")) {
                this.labels(model.getLabels());
            }
            if (model.wasPropertyExplicitlySet("extendedMetadata")) {
                this.extendedMetadata(model.getExtendedMetadata());
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
    public GenericEntity(
            DocumentEntityMetadata documentEntityMetadata,
            java.util.List<Label> labels,
            java.util.Map<String, String> extendedMetadata) {
        super();
        this.documentEntityMetadata = documentEntityMetadata;
        this.labels = labels;
        this.extendedMetadata = extendedMetadata;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("documentEntityMetadata")
    private final DocumentEntityMetadata documentEntityMetadata;

    public DocumentEntityMetadata getDocumentEntityMetadata() {
        return documentEntityMetadata;
    }

    /** A collection of label entities. */
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    private final java.util.List<Label> labels;

    /**
     * A collection of label entities.
     *
     * @return the value
     */
    public java.util.List<Label> getLabels() {
        return labels;
    }

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. It
     * exists for cross-compatibility only. For example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
    private final java.util.Map<String, String> extendedMetadata;

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. It
     * exists for cross-compatibility only. For example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getExtendedMetadata() {
        return extendedMetadata;
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
        sb.append("GenericEntity(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", documentEntityMetadata=").append(String.valueOf(this.documentEntityMetadata));
        sb.append(", labels=").append(String.valueOf(this.labels));
        sb.append(", extendedMetadata=").append(String.valueOf(this.extendedMetadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenericEntity)) {
            return false;
        }

        GenericEntity other = (GenericEntity) o;
        return java.util.Objects.equals(this.documentEntityMetadata, other.documentEntityMetadata)
                && java.util.Objects.equals(this.labels, other.labels)
                && java.util.Objects.equals(this.extendedMetadata, other.extendedMetadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.documentEntityMetadata == null
                                ? 43
                                : this.documentEntityMetadata.hashCode());
        result = (result * PRIME) + (this.labels == null ? 43 : this.labels.hashCode());
        result =
                (result * PRIME)
                        + (this.extendedMetadata == null ? 43 : this.extendedMetadata.hashCode());
        return result;
    }
}
