/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * Hierarchical entity object
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = HierarchicalEntity.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HierarchicalEntity extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "metaInfo",
        "offset",
        "length",
        "text",
        "type",
        "subType",
        "score"
    })
    public HierarchicalEntity(
            MetaInfo metaInfo,
            Integer offset,
            Integer length,
            String text,
            String type,
            String subType,
            Double score) {
        super();
        this.metaInfo = metaInfo;
        this.offset = offset;
        this.length = length;
        this.text = text;
        this.type = type;
        this.subType = subType;
        this.score = score;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("metaInfo")
        private MetaInfo metaInfo;

        public Builder metaInfo(MetaInfo metaInfo) {
            this.metaInfo = metaInfo;
            this.__explicitlySet__.add("metaInfo");
            return this;
        }
        /**
         * The number of Unicode code points preceding this entity in the submitted text.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("offset")
        private Integer offset;

        /**
         * The number of Unicode code points preceding this entity in the submitted text.
         * @param offset the value to set
         * @return this builder
         **/
        public Builder offset(Integer offset) {
            this.offset = offset;
            this.__explicitlySet__.add("offset");
            return this;
        }
        /**
         * Length of entity text
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("length")
        private Integer length;

        /**
         * Length of entity text
         * @param length the value to set
         * @return this builder
         **/
        public Builder length(Integer length) {
            this.length = length;
            this.__explicitlySet__.add("length");
            return this;
        }
        /**
         * Entity text like name of person, location, and so on.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("text")
        private String text;

        /**
         * Entity text like name of person, location, and so on.
         * @param text the value to set
         * @return this builder
         **/
        public Builder text(String text) {
            this.text = text;
            this.__explicitlySet__.add("text");
            return this;
        }
        /**
         * Type of entity text like PER, LOC.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Type of entity text like PER, LOC.
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Sub-type of entity text like GPE for LOCATION type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subType")
        private String subType;

        /**
         * Sub-type of entity text like GPE for LOCATION type
         * @param subType the value to set
         * @return this builder
         **/
        public Builder subType(String subType) {
            this.subType = subType;
            this.__explicitlySet__.add("subType");
            return this;
        }
        /**
         * Score or confidence for detected entity.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("score")
        private Double score;

        /**
         * Score or confidence for detected entity.
         * @param score the value to set
         * @return this builder
         **/
        public Builder score(Double score) {
            this.score = score;
            this.__explicitlySet__.add("score");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HierarchicalEntity build() {
            HierarchicalEntity model =
                    new HierarchicalEntity(
                            this.metaInfo,
                            this.offset,
                            this.length,
                            this.text,
                            this.type,
                            this.subType,
                            this.score);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HierarchicalEntity model) {
            if (model.wasPropertyExplicitlySet("metaInfo")) {
                this.metaInfo(model.getMetaInfo());
            }
            if (model.wasPropertyExplicitlySet("offset")) {
                this.offset(model.getOffset());
            }
            if (model.wasPropertyExplicitlySet("length")) {
                this.length(model.getLength());
            }
            if (model.wasPropertyExplicitlySet("text")) {
                this.text(model.getText());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("subType")) {
                this.subType(model.getSubType());
            }
            if (model.wasPropertyExplicitlySet("score")) {
                this.score(model.getScore());
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

    @com.fasterxml.jackson.annotation.JsonProperty("metaInfo")
    private final MetaInfo metaInfo;

    public MetaInfo getMetaInfo() {
        return metaInfo;
    }

    /**
     * The number of Unicode code points preceding this entity in the submitted text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("offset")
    private final Integer offset;

    /**
     * The number of Unicode code points preceding this entity in the submitted text.
     * @return the value
     **/
    public Integer getOffset() {
        return offset;
    }

    /**
     * Length of entity text
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("length")
    private final Integer length;

    /**
     * Length of entity text
     * @return the value
     **/
    public Integer getLength() {
        return length;
    }

    /**
     * Entity text like name of person, location, and so on.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    private final String text;

    /**
     * Entity text like name of person, location, and so on.
     * @return the value
     **/
    public String getText() {
        return text;
    }

    /**
     * Type of entity text like PER, LOC.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Type of entity text like PER, LOC.
     * @return the value
     **/
    public String getType() {
        return type;
    }

    /**
     * Sub-type of entity text like GPE for LOCATION type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subType")
    private final String subType;

    /**
     * Sub-type of entity text like GPE for LOCATION type
     * @return the value
     **/
    public String getSubType() {
        return subType;
    }

    /**
     * Score or confidence for detected entity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("score")
    private final Double score;

    /**
     * Score or confidence for detected entity.
     * @return the value
     **/
    public Double getScore() {
        return score;
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
        sb.append("HierarchicalEntity(");
        sb.append("super=").append(super.toString());
        sb.append("metaInfo=").append(String.valueOf(this.metaInfo));
        sb.append(", offset=").append(String.valueOf(this.offset));
        sb.append(", length=").append(String.valueOf(this.length));
        sb.append(", text=").append(String.valueOf(this.text));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", subType=").append(String.valueOf(this.subType));
        sb.append(", score=").append(String.valueOf(this.score));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HierarchicalEntity)) {
            return false;
        }

        HierarchicalEntity other = (HierarchicalEntity) o;
        return java.util.Objects.equals(this.metaInfo, other.metaInfo)
                && java.util.Objects.equals(this.offset, other.offset)
                && java.util.Objects.equals(this.length, other.length)
                && java.util.Objects.equals(this.text, other.text)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.subType, other.subType)
                && java.util.Objects.equals(this.score, other.score)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.metaInfo == null ? 43 : this.metaInfo.hashCode());
        result = (result * PRIME) + (this.offset == null ? 43 : this.offset.hashCode());
        result = (result * PRIME) + (this.length == null ? 43 : this.length.hashCode());
        result = (result * PRIME) + (this.text == null ? 43 : this.text.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.subType == null ? 43 : this.subType.hashCode());
        result = (result * PRIME) + (this.score == null ? 43 : this.score.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
