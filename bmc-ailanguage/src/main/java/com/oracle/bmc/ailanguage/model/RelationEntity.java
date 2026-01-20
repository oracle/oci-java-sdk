/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * The relation entities details for health ner. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RelationEntity.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RelationEntity
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "subjectId", "objectId", "type", "score"})
    public RelationEntity(String id, String subjectId, String objectId, String type, Double score) {
        super();
        this.id = id;
        this.subjectId = subjectId;
        this.objectId = objectId;
        this.type = type;
        this.score = score;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** id of the relation */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * id of the relation
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Subject entity of the relation. eg,MEDICINE_NAME, EXAMINATION */
        @com.fasterxml.jackson.annotation.JsonProperty("subjectId")
        private String subjectId;

        /**
         * Subject entity of the relation. eg,MEDICINE_NAME, EXAMINATION
         *
         * @param subjectId the value to set
         * @return this builder
         */
        public Builder subjectId(String subjectId) {
            this.subjectId = subjectId;
            this.__explicitlySet__.add("subjectId");
            return this;
        }
        /** Object entity of the relation. eg, MEDICINE_DOSAGE, MEDICINE_DURATION, MEASUREMENT */
        @com.fasterxml.jackson.annotation.JsonProperty("objectId")
        private String objectId;

        /**
         * Object entity of the relation. eg, MEDICINE_DOSAGE, MEDICINE_DURATION, MEASUREMENT
         *
         * @param objectId the value to set
         * @return this builder
         */
        public Builder objectId(String objectId) {
            this.objectId = objectId;
            this.__explicitlySet__.add("objectId");
            return this;
        }
        /**
         * Type of relation between subject entity and object entity. eg,EXAMINATION_MEASUREMENT,
         * FREQUENCY, DOSAGE
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Type of relation between subject entity and object entity. eg,EXAMINATION_MEASUREMENT,
         * FREQUENCY, DOSAGE
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** Score or confidence for detected entity. */
        @com.fasterxml.jackson.annotation.JsonProperty("score")
        private Double score;

        /**
         * Score or confidence for detected entity.
         *
         * @param score the value to set
         * @return this builder
         */
        public Builder score(Double score) {
            this.score = score;
            this.__explicitlySet__.add("score");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RelationEntity build() {
            RelationEntity model =
                    new RelationEntity(
                            this.id, this.subjectId, this.objectId, this.type, this.score);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RelationEntity model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("subjectId")) {
                this.subjectId(model.getSubjectId());
            }
            if (model.wasPropertyExplicitlySet("objectId")) {
                this.objectId(model.getObjectId());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("score")) {
                this.score(model.getScore());
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

    /** id of the relation */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * id of the relation
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Subject entity of the relation. eg,MEDICINE_NAME, EXAMINATION */
    @com.fasterxml.jackson.annotation.JsonProperty("subjectId")
    private final String subjectId;

    /**
     * Subject entity of the relation. eg,MEDICINE_NAME, EXAMINATION
     *
     * @return the value
     */
    public String getSubjectId() {
        return subjectId;
    }

    /** Object entity of the relation. eg, MEDICINE_DOSAGE, MEDICINE_DURATION, MEASUREMENT */
    @com.fasterxml.jackson.annotation.JsonProperty("objectId")
    private final String objectId;

    /**
     * Object entity of the relation. eg, MEDICINE_DOSAGE, MEDICINE_DURATION, MEASUREMENT
     *
     * @return the value
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * Type of relation between subject entity and object entity. eg,EXAMINATION_MEASUREMENT,
     * FREQUENCY, DOSAGE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Type of relation between subject entity and object entity. eg,EXAMINATION_MEASUREMENT,
     * FREQUENCY, DOSAGE
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /** Score or confidence for detected entity. */
    @com.fasterxml.jackson.annotation.JsonProperty("score")
    private final Double score;

    /**
     * Score or confidence for detected entity.
     *
     * @return the value
     */
    public Double getScore() {
        return score;
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
        sb.append("RelationEntity(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", subjectId=").append(String.valueOf(this.subjectId));
        sb.append(", objectId=").append(String.valueOf(this.objectId));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", score=").append(String.valueOf(this.score));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RelationEntity)) {
            return false;
        }

        RelationEntity other = (RelationEntity) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.subjectId, other.subjectId)
                && java.util.Objects.equals(this.objectId, other.objectId)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.score, other.score)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.subjectId == null ? 43 : this.subjectId.hashCode());
        result = (result * PRIME) + (this.objectId == null ? 43 : this.objectId.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.score == null ? 43 : this.score.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
