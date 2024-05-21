/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Position and SQL Type of PL/SQL OUT parameter
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SqlOutParamDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlOutParamDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"outParamPosition", "outParamType"})
    public SqlOutParamDetails(Integer outParamPosition, SqlOutParamTypes outParamType) {
        super();
        this.outParamPosition = outParamPosition;
        this.outParamType = outParamType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Position of PL/SQL procedure OUT parameter
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("outParamPosition")
        private Integer outParamPosition;

        /**
         * Position of PL/SQL procedure OUT parameter
         * @param outParamPosition the value to set
         * @return this builder
         **/
        public Builder outParamPosition(Integer outParamPosition) {
            this.outParamPosition = outParamPosition;
            this.__explicitlySet__.add("outParamPosition");
            return this;
        }
        /**
         * SQL Type of PL/SQL procedure OUT parameter
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("outParamType")
        private SqlOutParamTypes outParamType;

        /**
         * SQL Type of PL/SQL procedure OUT parameter
         * @param outParamType the value to set
         * @return this builder
         **/
        public Builder outParamType(SqlOutParamTypes outParamType) {
            this.outParamType = outParamType;
            this.__explicitlySet__.add("outParamType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlOutParamDetails build() {
            SqlOutParamDetails model =
                    new SqlOutParamDetails(this.outParamPosition, this.outParamType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlOutParamDetails model) {
            if (model.wasPropertyExplicitlySet("outParamPosition")) {
                this.outParamPosition(model.getOutParamPosition());
            }
            if (model.wasPropertyExplicitlySet("outParamType")) {
                this.outParamType(model.getOutParamType());
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
     * Position of PL/SQL procedure OUT parameter
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("outParamPosition")
    private final Integer outParamPosition;

    /**
     * Position of PL/SQL procedure OUT parameter
     * @return the value
     **/
    public Integer getOutParamPosition() {
        return outParamPosition;
    }

    /**
     * SQL Type of PL/SQL procedure OUT parameter
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("outParamType")
    private final SqlOutParamTypes outParamType;

    /**
     * SQL Type of PL/SQL procedure OUT parameter
     * @return the value
     **/
    public SqlOutParamTypes getOutParamType() {
        return outParamType;
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
        sb.append("SqlOutParamDetails(");
        sb.append("super=").append(super.toString());
        sb.append("outParamPosition=").append(String.valueOf(this.outParamPosition));
        sb.append(", outParamType=").append(String.valueOf(this.outParamType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlOutParamDetails)) {
            return false;
        }

        SqlOutParamDetails other = (SqlOutParamDetails) o;
        return java.util.Objects.equals(this.outParamPosition, other.outParamPosition)
                && java.util.Objects.equals(this.outParamType, other.outParamType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.outParamPosition == null ? 43 : this.outParamPosition.hashCode());
        result = (result * PRIME) + (this.outParamType == null ? 43 : this.outParamType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
