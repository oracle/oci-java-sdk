/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane.model;

/**
 * This allows the labeler to apply label the highlighted text from OCR, this includes labelled and
 * unlabelled data. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = KeyValueSelectionEntity.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "entityType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class KeyValueSelectionEntity extends Entity {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Entity Name. */
        @com.fasterxml.jackson.annotation.JsonProperty("text")
        private String text;

        /**
         * Entity Name.
         *
         * @param text the value to set
         * @return this builder
         */
        public Builder text(String text) {
            this.text = text;
            this.__explicitlySet__.add("text");
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

        @com.fasterxml.jackson.annotation.JsonProperty("boundingPolygon")
        private BoundingPolygon boundingPolygon;

        public Builder boundingPolygon(BoundingPolygon boundingPolygon) {
            this.boundingPolygon = boundingPolygon;
            this.__explicitlySet__.add("boundingPolygon");
            return this;
        }
        /** Integer value. */
        @com.fasterxml.jackson.annotation.JsonProperty("rotation")
        private java.math.BigDecimal rotation;

        /**
         * Integer value.
         *
         * @param rotation the value to set
         * @return this builder
         */
        public Builder rotation(java.math.BigDecimal rotation) {
            this.rotation = rotation;
            this.__explicitlySet__.add("rotation");
            return this;
        }
        /** float value, score from OCR. */
        @com.fasterxml.jackson.annotation.JsonProperty("confidence")
        private Float confidence;

        /**
         * float value, score from OCR.
         *
         * @param confidence the value to set
         * @return this builder
         */
        public Builder confidence(Float confidence) {
            this.confidence = confidence;
            this.__explicitlySet__.add("confidence");
            return this;
        }
        /** Integer value. */
        @com.fasterxml.jackson.annotation.JsonProperty("pageNumber")
        private java.math.BigDecimal pageNumber;

        /**
         * Integer value.
         *
         * @param pageNumber the value to set
         * @return this builder
         */
        public Builder pageNumber(java.math.BigDecimal pageNumber) {
            this.pageNumber = pageNumber;
            this.__explicitlySet__.add("pageNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KeyValueSelectionEntity build() {
            KeyValueSelectionEntity model =
                    new KeyValueSelectionEntity(
                            this.text,
                            this.labels,
                            this.boundingPolygon,
                            this.rotation,
                            this.confidence,
                            this.pageNumber);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KeyValueSelectionEntity model) {
            if (model.wasPropertyExplicitlySet("text")) {
                this.text(model.getText());
            }
            if (model.wasPropertyExplicitlySet("labels")) {
                this.labels(model.getLabels());
            }
            if (model.wasPropertyExplicitlySet("boundingPolygon")) {
                this.boundingPolygon(model.getBoundingPolygon());
            }
            if (model.wasPropertyExplicitlySet("rotation")) {
                this.rotation(model.getRotation());
            }
            if (model.wasPropertyExplicitlySet("confidence")) {
                this.confidence(model.getConfidence());
            }
            if (model.wasPropertyExplicitlySet("pageNumber")) {
                this.pageNumber(model.getPageNumber());
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
    public KeyValueSelectionEntity(
            String text,
            java.util.List<Label> labels,
            BoundingPolygon boundingPolygon,
            java.math.BigDecimal rotation,
            Float confidence,
            java.math.BigDecimal pageNumber) {
        super();
        this.text = text;
        this.labels = labels;
        this.boundingPolygon = boundingPolygon;
        this.rotation = rotation;
        this.confidence = confidence;
        this.pageNumber = pageNumber;
    }

    /** Entity Name. */
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    private final String text;

    /**
     * Entity Name.
     *
     * @return the value
     */
    public String getText() {
        return text;
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

    @com.fasterxml.jackson.annotation.JsonProperty("boundingPolygon")
    private final BoundingPolygon boundingPolygon;

    public BoundingPolygon getBoundingPolygon() {
        return boundingPolygon;
    }

    /** Integer value. */
    @com.fasterxml.jackson.annotation.JsonProperty("rotation")
    private final java.math.BigDecimal rotation;

    /**
     * Integer value.
     *
     * @return the value
     */
    public java.math.BigDecimal getRotation() {
        return rotation;
    }

    /** float value, score from OCR. */
    @com.fasterxml.jackson.annotation.JsonProperty("confidence")
    private final Float confidence;

    /**
     * float value, score from OCR.
     *
     * @return the value
     */
    public Float getConfidence() {
        return confidence;
    }

    /** Integer value. */
    @com.fasterxml.jackson.annotation.JsonProperty("pageNumber")
    private final java.math.BigDecimal pageNumber;

    /**
     * Integer value.
     *
     * @return the value
     */
    public java.math.BigDecimal getPageNumber() {
        return pageNumber;
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
        sb.append("KeyValueSelectionEntity(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", text=").append(String.valueOf(this.text));
        sb.append(", labels=").append(String.valueOf(this.labels));
        sb.append(", boundingPolygon=").append(String.valueOf(this.boundingPolygon));
        sb.append(", rotation=").append(String.valueOf(this.rotation));
        sb.append(", confidence=").append(String.valueOf(this.confidence));
        sb.append(", pageNumber=").append(String.valueOf(this.pageNumber));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KeyValueSelectionEntity)) {
            return false;
        }

        KeyValueSelectionEntity other = (KeyValueSelectionEntity) o;
        return java.util.Objects.equals(this.text, other.text)
                && java.util.Objects.equals(this.labels, other.labels)
                && java.util.Objects.equals(this.boundingPolygon, other.boundingPolygon)
                && java.util.Objects.equals(this.rotation, other.rotation)
                && java.util.Objects.equals(this.confidence, other.confidence)
                && java.util.Objects.equals(this.pageNumber, other.pageNumber)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.text == null ? 43 : this.text.hashCode());
        result = (result * PRIME) + (this.labels == null ? 43 : this.labels.hashCode());
        result =
                (result * PRIME)
                        + (this.boundingPolygon == null ? 43 : this.boundingPolygon.hashCode());
        result = (result * PRIME) + (this.rotation == null ? 43 : this.rotation.hashCode());
        result = (result * PRIME) + (this.confidence == null ? 43 : this.confidence.hashCode());
        result = (result * PRIME) + (this.pageNumber == null ? 43 : this.pageNumber.hashCode());
        return result;
    }
}
