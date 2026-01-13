/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Mapping rule for source and target schemas for the pipeline data replication. For example:
 * "{mappingType: INCLUDE, source: HR.*, target: HR.*}" for rule "Include HR.*" which will include
 * all the tables under HR schema. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MappingRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MappingRule extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"mappingType", "source", "target"})
    public MappingRule(MappingType mappingType, String source, String target) {
        super();
        this.mappingType = mappingType;
        this.source = source;
        this.target = target;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Defines the exclude/include rules of source and target schemas and tables when
         * replicating from source to target. This option applies when creating and updating a
         * pipeline.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mappingType")
        private MappingType mappingType;

        /**
         * Defines the exclude/include rules of source and target schemas and tables when
         * replicating from source to target. This option applies when creating and updating a
         * pipeline.
         *
         * @param mappingType the value to set
         * @return this builder
         */
        public Builder mappingType(MappingType mappingType) {
            this.mappingType = mappingType;
            this.__explicitlySet__.add("mappingType");
            return this;
        }
        /** The source schema/table combination for replication to target. */
        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private String source;

        /**
         * The source schema/table combination for replication to target.
         *
         * @param source the value to set
         * @return this builder
         */
        public Builder source(String source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }
        /** The target schema/table combination for replication from the source. */
        @com.fasterxml.jackson.annotation.JsonProperty("target")
        private String target;

        /**
         * The target schema/table combination for replication from the source.
         *
         * @param target the value to set
         * @return this builder
         */
        public Builder target(String target) {
            this.target = target;
            this.__explicitlySet__.add("target");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MappingRule build() {
            MappingRule model = new MappingRule(this.mappingType, this.source, this.target);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MappingRule model) {
            if (model.wasPropertyExplicitlySet("mappingType")) {
                this.mappingType(model.getMappingType());
            }
            if (model.wasPropertyExplicitlySet("source")) {
                this.source(model.getSource());
            }
            if (model.wasPropertyExplicitlySet("target")) {
                this.target(model.getTarget());
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

    /**
     * Defines the exclude/include rules of source and target schemas and tables when replicating
     * from source to target. This option applies when creating and updating a pipeline.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mappingType")
    private final MappingType mappingType;

    /**
     * Defines the exclude/include rules of source and target schemas and tables when replicating
     * from source to target. This option applies when creating and updating a pipeline.
     *
     * @return the value
     */
    public MappingType getMappingType() {
        return mappingType;
    }

    /** The source schema/table combination for replication to target. */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final String source;

    /**
     * The source schema/table combination for replication to target.
     *
     * @return the value
     */
    public String getSource() {
        return source;
    }

    /** The target schema/table combination for replication from the source. */
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    private final String target;

    /**
     * The target schema/table combination for replication from the source.
     *
     * @return the value
     */
    public String getTarget() {
        return target;
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
        sb.append("MappingRule(");
        sb.append("super=").append(super.toString());
        sb.append("mappingType=").append(String.valueOf(this.mappingType));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", target=").append(String.valueOf(this.target));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MappingRule)) {
            return false;
        }

        MappingRule other = (MappingRule) o;
        return java.util.Objects.equals(this.mappingType, other.mappingType)
                && java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.target, other.target)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.mappingType == null ? 43 : this.mappingType.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.target == null ? 43 : this.target.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
