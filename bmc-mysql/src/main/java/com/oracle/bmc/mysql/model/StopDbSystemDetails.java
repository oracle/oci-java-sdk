/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * DB System shutdown parameters. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = StopDbSystemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class StopDbSystemDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"shutdownType"})
    public StopDbSystemDetails(InnoDbShutdownMode shutdownType) {
        super();
        this.shutdownType = shutdownType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The InnoDB shutdown mode to use, following the option
         * "[innodb_fast_shutdown](https://dev.mysql.com/doc/refman/en/innodb-parameters.html#sysvar_innodb_fast_shutdown)".
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shutdownType")
        private InnoDbShutdownMode shutdownType;

        /**
         * The InnoDB shutdown mode to use, following the option
         * "[innodb_fast_shutdown](https://dev.mysql.com/doc/refman/en/innodb-parameters.html#sysvar_innodb_fast_shutdown)".
         *
         * @param shutdownType the value to set
         * @return this builder
         */
        public Builder shutdownType(InnoDbShutdownMode shutdownType) {
            this.shutdownType = shutdownType;
            this.__explicitlySet__.add("shutdownType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StopDbSystemDetails build() {
            StopDbSystemDetails model = new StopDbSystemDetails(this.shutdownType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StopDbSystemDetails model) {
            if (model.wasPropertyExplicitlySet("shutdownType")) {
                this.shutdownType(model.getShutdownType());
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
     * The InnoDB shutdown mode to use, following the option
     * "[innodb_fast_shutdown](https://dev.mysql.com/doc/refman/en/innodb-parameters.html#sysvar_innodb_fast_shutdown)".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shutdownType")
    private final InnoDbShutdownMode shutdownType;

    /**
     * The InnoDB shutdown mode to use, following the option
     * "[innodb_fast_shutdown](https://dev.mysql.com/doc/refman/en/innodb-parameters.html#sysvar_innodb_fast_shutdown)".
     *
     * @return the value
     */
    public InnoDbShutdownMode getShutdownType() {
        return shutdownType;
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
        sb.append("StopDbSystemDetails(");
        sb.append("super=").append(super.toString());
        sb.append("shutdownType=").append(String.valueOf(this.shutdownType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StopDbSystemDetails)) {
            return false;
        }

        StopDbSystemDetails other = (StopDbSystemDetails) o;
        return java.util.Objects.equals(this.shutdownType, other.shutdownType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.shutdownType == null ? 43 : this.shutdownType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
