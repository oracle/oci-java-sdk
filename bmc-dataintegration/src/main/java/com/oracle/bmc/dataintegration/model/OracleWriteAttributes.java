/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Properties to configure when writing to an Oracle Database.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OracleWriteAttributes.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OracleWriteAttributes extends AbstractWriteAttribute {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("batchSize")
        private Integer batchSize;

        public Builder batchSize(Integer batchSize) {
            this.batchSize = batchSize;
            this.__explicitlySet__.add("batchSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isTruncate")
        private Boolean isTruncate;

        public Builder isTruncate(Boolean isTruncate) {
            this.isTruncate = isTruncate;
            this.__explicitlySet__.add("isTruncate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isolationLevel")
        private String isolationLevel;

        public Builder isolationLevel(String isolationLevel) {
            this.isolationLevel = isolationLevel;
            this.__explicitlySet__.add("isolationLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OracleWriteAttributes build() {
            OracleWriteAttributes __instance__ =
                    new OracleWriteAttributes(batchSize, isTruncate, isolationLevel);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OracleWriteAttributes o) {
            Builder copiedBuilder =
                    batchSize(o.getBatchSize())
                            .isTruncate(o.getIsTruncate())
                            .isolationLevel(o.getIsolationLevel());

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

    @Deprecated
    public OracleWriteAttributes(Integer batchSize, Boolean isTruncate, String isolationLevel) {
        super();
        this.batchSize = batchSize;
        this.isTruncate = isTruncate;
        this.isolationLevel = isolationLevel;
    }

    /**
     * The batch size for writing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("batchSize")
    private final Integer batchSize;

    public Integer getBatchSize() {
        return batchSize;
    }

    /**
     * Specifies whether to truncate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isTruncate")
    private final Boolean isTruncate;

    public Boolean getIsTruncate() {
        return isTruncate;
    }

    /**
     * Specifies the isolation level.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isolationLevel")
    private final String isolationLevel;

    public String getIsolationLevel() {
        return isolationLevel;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("OracleWriteAttributes(");
        sb.append("super=").append(super.toString());
        sb.append(", batchSize=").append(String.valueOf(this.batchSize));
        sb.append(", isTruncate=").append(String.valueOf(this.isTruncate));
        sb.append(", isolationLevel=").append(String.valueOf(this.isolationLevel));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OracleWriteAttributes)) {
            return false;
        }

        OracleWriteAttributes other = (OracleWriteAttributes) o;
        return java.util.Objects.equals(this.batchSize, other.batchSize)
                && java.util.Objects.equals(this.isTruncate, other.isTruncate)
                && java.util.Objects.equals(this.isolationLevel, other.isolationLevel)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.batchSize == null ? 43 : this.batchSize.hashCode());
        result = (result * PRIME) + (this.isTruncate == null ? 43 : this.isTruncate.hashCode());
        result =
                (result * PRIME)
                        + (this.isolationLevel == null ? 43 : this.isolationLevel.hashCode());
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
