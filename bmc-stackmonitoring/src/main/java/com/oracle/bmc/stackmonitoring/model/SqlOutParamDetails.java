/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Position and SQL Type of PL/SQL OUT parameter <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SqlOutParamDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SqlOutParamDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"outParamPosition", "outParamType", "outParamName"})
    public SqlOutParamDetails(
            Integer outParamPosition, SqlOutParamTypes outParamType, String outParamName) {
        super();
        this.outParamPosition = outParamPosition;
        this.outParamType = outParamType;
        this.outParamName = outParamName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Position of PL/SQL procedure OUT parameter. The value of this property is ignored during
         * update, if "outParamType" is set to NO_OUT_PARAM value.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("outParamPosition")
        private Integer outParamPosition;

        /**
         * Position of PL/SQL procedure OUT parameter. The value of this property is ignored during
         * update, if "outParamType" is set to NO_OUT_PARAM value.
         *
         * @param outParamPosition the value to set
         * @return this builder
         */
        public Builder outParamPosition(Integer outParamPosition) {
            this.outParamPosition = outParamPosition;
            this.__explicitlySet__.add("outParamPosition");
            return this;
        }
        /**
         * SQL Type of PL/SQL procedure OUT parameter. During the update, to completely remove the
         * out parameter, use the value NO_OUT_PARAM. In that case, the value of "outParamPosition"
         * will be ignored.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("outParamType")
        private SqlOutParamTypes outParamType;

        /**
         * SQL Type of PL/SQL procedure OUT parameter. During the update, to completely remove the
         * out parameter, use the value NO_OUT_PARAM. In that case, the value of "outParamPosition"
         * will be ignored.
         *
         * @param outParamType the value to set
         * @return this builder
         */
        public Builder outParamType(SqlOutParamTypes outParamType) {
            this.outParamType = outParamType;
            this.__explicitlySet__.add("outParamType");
            return this;
        }
        /** Name of the Out Parameter */
        @com.fasterxml.jackson.annotation.JsonProperty("outParamName")
        private String outParamName;

        /**
         * Name of the Out Parameter
         *
         * @param outParamName the value to set
         * @return this builder
         */
        public Builder outParamName(String outParamName) {
            this.outParamName = outParamName;
            this.__explicitlySet__.add("outParamName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlOutParamDetails build() {
            SqlOutParamDetails model =
                    new SqlOutParamDetails(
                            this.outParamPosition, this.outParamType, this.outParamName);
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
            if (model.wasPropertyExplicitlySet("outParamName")) {
                this.outParamName(model.getOutParamName());
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
     * Position of PL/SQL procedure OUT parameter. The value of this property is ignored during
     * update, if "outParamType" is set to NO_OUT_PARAM value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("outParamPosition")
    private final Integer outParamPosition;

    /**
     * Position of PL/SQL procedure OUT parameter. The value of this property is ignored during
     * update, if "outParamType" is set to NO_OUT_PARAM value.
     *
     * @return the value
     */
    public Integer getOutParamPosition() {
        return outParamPosition;
    }

    /**
     * SQL Type of PL/SQL procedure OUT parameter. During the update, to completely remove the out
     * parameter, use the value NO_OUT_PARAM. In that case, the value of "outParamPosition" will be
     * ignored.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("outParamType")
    private final SqlOutParamTypes outParamType;

    /**
     * SQL Type of PL/SQL procedure OUT parameter. During the update, to completely remove the out
     * parameter, use the value NO_OUT_PARAM. In that case, the value of "outParamPosition" will be
     * ignored.
     *
     * @return the value
     */
    public SqlOutParamTypes getOutParamType() {
        return outParamType;
    }

    /** Name of the Out Parameter */
    @com.fasterxml.jackson.annotation.JsonProperty("outParamName")
    private final String outParamName;

    /**
     * Name of the Out Parameter
     *
     * @return the value
     */
    public String getOutParamName() {
        return outParamName;
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
        sb.append("SqlOutParamDetails(");
        sb.append("super=").append(super.toString());
        sb.append("outParamPosition=").append(String.valueOf(this.outParamPosition));
        sb.append(", outParamType=").append(String.valueOf(this.outParamType));
        sb.append(", outParamName=").append(String.valueOf(this.outParamName));
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
                && java.util.Objects.equals(this.outParamName, other.outParamName)
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
        result = (result * PRIME) + (this.outParamName == null ? 43 : this.outParamName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
