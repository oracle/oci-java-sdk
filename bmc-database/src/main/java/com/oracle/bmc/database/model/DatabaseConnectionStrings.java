/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Connection strings to connect to an Oracle Database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DatabaseConnectionStrings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DatabaseConnectionStrings
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"cdbDefault", "cdbIpDefault", "allConnectionStrings"})
    public DatabaseConnectionStrings(
            String cdbDefault,
            String cdbIpDefault,
            java.util.Map<String, String> allConnectionStrings) {
        super();
        this.cdbDefault = cdbDefault;
        this.cdbIpDefault = cdbIpDefault;
        this.allConnectionStrings = allConnectionStrings;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Host name based CDB Connection String. */
        @com.fasterxml.jackson.annotation.JsonProperty("cdbDefault")
        private String cdbDefault;

        /**
         * Host name based CDB Connection String.
         *
         * @param cdbDefault the value to set
         * @return this builder
         */
        public Builder cdbDefault(String cdbDefault) {
            this.cdbDefault = cdbDefault;
            this.__explicitlySet__.add("cdbDefault");
            return this;
        }
        /** IP based CDB Connection String. */
        @com.fasterxml.jackson.annotation.JsonProperty("cdbIpDefault")
        private String cdbIpDefault;

        /**
         * IP based CDB Connection String.
         *
         * @param cdbIpDefault the value to set
         * @return this builder
         */
        public Builder cdbIpDefault(String cdbIpDefault) {
            this.cdbIpDefault = cdbIpDefault;
            this.__explicitlySet__.add("cdbIpDefault");
            return this;
        }
        /** All connection strings to use to connect to the Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("allConnectionStrings")
        private java.util.Map<String, String> allConnectionStrings;

        /**
         * All connection strings to use to connect to the Database.
         *
         * @param allConnectionStrings the value to set
         * @return this builder
         */
        public Builder allConnectionStrings(java.util.Map<String, String> allConnectionStrings) {
            this.allConnectionStrings = allConnectionStrings;
            this.__explicitlySet__.add("allConnectionStrings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseConnectionStrings build() {
            DatabaseConnectionStrings model =
                    new DatabaseConnectionStrings(
                            this.cdbDefault, this.cdbIpDefault, this.allConnectionStrings);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseConnectionStrings model) {
            if (model.wasPropertyExplicitlySet("cdbDefault")) {
                this.cdbDefault(model.getCdbDefault());
            }
            if (model.wasPropertyExplicitlySet("cdbIpDefault")) {
                this.cdbIpDefault(model.getCdbIpDefault());
            }
            if (model.wasPropertyExplicitlySet("allConnectionStrings")) {
                this.allConnectionStrings(model.getAllConnectionStrings());
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

    /** Host name based CDB Connection String. */
    @com.fasterxml.jackson.annotation.JsonProperty("cdbDefault")
    private final String cdbDefault;

    /**
     * Host name based CDB Connection String.
     *
     * @return the value
     */
    public String getCdbDefault() {
        return cdbDefault;
    }

    /** IP based CDB Connection String. */
    @com.fasterxml.jackson.annotation.JsonProperty("cdbIpDefault")
    private final String cdbIpDefault;

    /**
     * IP based CDB Connection String.
     *
     * @return the value
     */
    public String getCdbIpDefault() {
        return cdbIpDefault;
    }

    /** All connection strings to use to connect to the Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("allConnectionStrings")
    private final java.util.Map<String, String> allConnectionStrings;

    /**
     * All connection strings to use to connect to the Database.
     *
     * @return the value
     */
    public java.util.Map<String, String> getAllConnectionStrings() {
        return allConnectionStrings;
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
        sb.append("DatabaseConnectionStrings(");
        sb.append("super=").append(super.toString());
        sb.append("cdbDefault=").append(String.valueOf(this.cdbDefault));
        sb.append(", cdbIpDefault=").append(String.valueOf(this.cdbIpDefault));
        sb.append(", allConnectionStrings=").append(String.valueOf(this.allConnectionStrings));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseConnectionStrings)) {
            return false;
        }

        DatabaseConnectionStrings other = (DatabaseConnectionStrings) o;
        return java.util.Objects.equals(this.cdbDefault, other.cdbDefault)
                && java.util.Objects.equals(this.cdbIpDefault, other.cdbIpDefault)
                && java.util.Objects.equals(this.allConnectionStrings, other.allConnectionStrings)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.cdbDefault == null ? 43 : this.cdbDefault.hashCode());
        result = (result * PRIME) + (this.cdbIpDefault == null ? 43 : this.cdbIpDefault.hashCode());
        result =
                (result * PRIME)
                        + (this.allConnectionStrings == null
                                ? 43
                                : this.allConnectionStrings.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
