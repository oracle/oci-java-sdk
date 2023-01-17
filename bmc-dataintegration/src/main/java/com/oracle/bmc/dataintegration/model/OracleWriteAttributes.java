/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
        /**
         * The batch size for writing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("batchSize")
        private Integer batchSize;

        /**
         * The batch size for writing.
         * @param batchSize the value to set
         * @return this builder
         **/
        public Builder batchSize(Integer batchSize) {
            this.batchSize = batchSize;
            this.__explicitlySet__.add("batchSize");
            return this;
        }
        /**
         * Specifies whether to truncate.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isTruncate")
        private Boolean isTruncate;

        /**
         * Specifies whether to truncate.
         * @param isTruncate the value to set
         * @return this builder
         **/
        public Builder isTruncate(Boolean isTruncate) {
            this.isTruncate = isTruncate;
            this.__explicitlySet__.add("isTruncate");
            return this;
        }
        /**
         * Specifies the isolation level.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isolationLevel")
        private String isolationLevel;

        /**
         * Specifies the isolation level.
         * @param isolationLevel the value to set
         * @return this builder
         **/
        public Builder isolationLevel(String isolationLevel) {
            this.isolationLevel = isolationLevel;
            this.__explicitlySet__.add("isolationLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OracleWriteAttributes build() {
            OracleWriteAttributes model =
                    new OracleWriteAttributes(this.batchSize, this.isTruncate, this.isolationLevel);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OracleWriteAttributes model) {
            if (model.wasPropertyExplicitlySet("batchSize")) {
                this.batchSize(model.getBatchSize());
            }
            if (model.wasPropertyExplicitlySet("isTruncate")) {
                this.isTruncate(model.getIsTruncate());
            }
            if (model.wasPropertyExplicitlySet("isolationLevel")) {
                this.isolationLevel(model.getIsolationLevel());
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

    /**
     * The batch size for writing.
     * @return the value
     **/
    public Integer getBatchSize() {
        return batchSize;
    }

    /**
     * Specifies whether to truncate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isTruncate")
    private final Boolean isTruncate;

    /**
     * Specifies whether to truncate.
     * @return the value
     **/
    public Boolean getIsTruncate() {
        return isTruncate;
    }

    /**
     * Specifies the isolation level.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isolationLevel")
    private final String isolationLevel;

    /**
     * Specifies the isolation level.
     * @return the value
     **/
    public String getIsolationLevel() {
        return isolationLevel;
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
        sb.append("OracleWriteAttributes(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", batchSize=").append(String.valueOf(this.batchSize));
        sb.append(", isTruncate=").append(String.valueOf(this.isTruncate));
        sb.append(", isolationLevel=").append(String.valueOf(this.isolationLevel));
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
                && super.equals(other);
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
        return result;
    }
}
