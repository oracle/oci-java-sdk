/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * The information needed to obtain desired lineage.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FetchEntityLineageDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FetchEntityLineageDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "level",
        "direction",
        "isIntraLineage",
        "intraLineageObjectKey"
    })
    public FetchEntityLineageDetails(
            Integer level,
            LineageDirection direction,
            Boolean isIntraLineage,
            String intraLineageObjectKey) {
        super();
        this.level = level;
        this.direction = direction;
        this.isIntraLineage = isIntraLineage;
        this.intraLineageObjectKey = intraLineageObjectKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Object level at which the lineage is returned.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("level")
        private Integer level;

        /**
         * Object level at which the lineage is returned.
         *
         * @param level the value to set
         * @return this builder
         **/
        public Builder level(Integer level) {
            this.level = level;
            this.__explicitlySet__.add("level");
            return this;
        }
        /**
         * Direction of the lineage returned.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("direction")
        private LineageDirection direction;

        /**
         * Direction of the lineage returned.
         * @param direction the value to set
         * @return this builder
         **/
        public Builder direction(LineageDirection direction) {
            this.direction = direction;
            this.__explicitlySet__.add("direction");
            return this;
        }
        /**
         * Intra-lineages are drill down lineages. This field indicates whether all intra-lineages need to be
         * expanded inline in the lineage returned.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isIntraLineage")
        private Boolean isIntraLineage;

        /**
         * Intra-lineages are drill down lineages. This field indicates whether all intra-lineages need to be
         * expanded inline in the lineage returned.
         *
         * @param isIntraLineage the value to set
         * @return this builder
         **/
        public Builder isIntraLineage(Boolean isIntraLineage) {
            this.isIntraLineage = isIntraLineage;
            this.__explicitlySet__.add("isIntraLineage");
            return this;
        }
        /**
         * Unique object key for which intra-lineage needs to be fetched. Only drill-down lineage corresponding
         * to the object whose object key is passed is returned.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("intraLineageObjectKey")
        private String intraLineageObjectKey;

        /**
         * Unique object key for which intra-lineage needs to be fetched. Only drill-down lineage corresponding
         * to the object whose object key is passed is returned.
         *
         * @param intraLineageObjectKey the value to set
         * @return this builder
         **/
        public Builder intraLineageObjectKey(String intraLineageObjectKey) {
            this.intraLineageObjectKey = intraLineageObjectKey;
            this.__explicitlySet__.add("intraLineageObjectKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FetchEntityLineageDetails build() {
            FetchEntityLineageDetails model =
                    new FetchEntityLineageDetails(
                            this.level,
                            this.direction,
                            this.isIntraLineage,
                            this.intraLineageObjectKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FetchEntityLineageDetails model) {
            if (model.wasPropertyExplicitlySet("level")) {
                this.level(model.getLevel());
            }
            if (model.wasPropertyExplicitlySet("direction")) {
                this.direction(model.getDirection());
            }
            if (model.wasPropertyExplicitlySet("isIntraLineage")) {
                this.isIntraLineage(model.getIsIntraLineage());
            }
            if (model.wasPropertyExplicitlySet("intraLineageObjectKey")) {
                this.intraLineageObjectKey(model.getIntraLineageObjectKey());
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
     * Object level at which the lineage is returned.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("level")
    private final Integer level;

    /**
     * Object level at which the lineage is returned.
     *
     * @return the value
     **/
    public Integer getLevel() {
        return level;
    }

    /**
     * Direction of the lineage returned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("direction")
    private final LineageDirection direction;

    /**
     * Direction of the lineage returned.
     * @return the value
     **/
    public LineageDirection getDirection() {
        return direction;
    }

    /**
     * Intra-lineages are drill down lineages. This field indicates whether all intra-lineages need to be
     * expanded inline in the lineage returned.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIntraLineage")
    private final Boolean isIntraLineage;

    /**
     * Intra-lineages are drill down lineages. This field indicates whether all intra-lineages need to be
     * expanded inline in the lineage returned.
     *
     * @return the value
     **/
    public Boolean getIsIntraLineage() {
        return isIntraLineage;
    }

    /**
     * Unique object key for which intra-lineage needs to be fetched. Only drill-down lineage corresponding
     * to the object whose object key is passed is returned.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("intraLineageObjectKey")
    private final String intraLineageObjectKey;

    /**
     * Unique object key for which intra-lineage needs to be fetched. Only drill-down lineage corresponding
     * to the object whose object key is passed is returned.
     *
     * @return the value
     **/
    public String getIntraLineageObjectKey() {
        return intraLineageObjectKey;
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
        sb.append("FetchEntityLineageDetails(");
        sb.append("super=").append(super.toString());
        sb.append("level=").append(String.valueOf(this.level));
        sb.append(", direction=").append(String.valueOf(this.direction));
        sb.append(", isIntraLineage=").append(String.valueOf(this.isIntraLineage));
        sb.append(", intraLineageObjectKey=").append(String.valueOf(this.intraLineageObjectKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FetchEntityLineageDetails)) {
            return false;
        }

        FetchEntityLineageDetails other = (FetchEntityLineageDetails) o;
        return java.util.Objects.equals(this.level, other.level)
                && java.util.Objects.equals(this.direction, other.direction)
                && java.util.Objects.equals(this.isIntraLineage, other.isIntraLineage)
                && java.util.Objects.equals(this.intraLineageObjectKey, other.intraLineageObjectKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.level == null ? 43 : this.level.hashCode());
        result = (result * PRIME) + (this.direction == null ? 43 : this.direction.hashCode());
        result =
                (result * PRIME)
                        + (this.isIntraLineage == null ? 43 : this.isIntraLineage.hashCode());
        result =
                (result * PRIME)
                        + (this.intraLineageObjectKey == null
                                ? 43
                                : this.intraLineageObjectKey.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
