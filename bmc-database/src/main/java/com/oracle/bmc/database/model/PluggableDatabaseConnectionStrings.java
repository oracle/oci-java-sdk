/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Connection strings to connect to an Oracle Pluggable Database. <br>
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
        builder = PluggableDatabaseConnectionStrings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PluggableDatabaseConnectionStrings
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"pdbDefault", "pdbIpDefault", "allConnectionStrings"})
    public PluggableDatabaseConnectionStrings(
            String pdbDefault,
            String pdbIpDefault,
            java.util.Map<String, String> allConnectionStrings) {
        super();
        this.pdbDefault = pdbDefault;
        this.pdbIpDefault = pdbIpDefault;
        this.allConnectionStrings = allConnectionStrings;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A host name-based PDB connection string. */
        @com.fasterxml.jackson.annotation.JsonProperty("pdbDefault")
        private String pdbDefault;

        /**
         * A host name-based PDB connection string.
         *
         * @param pdbDefault the value to set
         * @return this builder
         */
        public Builder pdbDefault(String pdbDefault) {
            this.pdbDefault = pdbDefault;
            this.__explicitlySet__.add("pdbDefault");
            return this;
        }
        /** An IP-based PDB connection string. */
        @com.fasterxml.jackson.annotation.JsonProperty("pdbIpDefault")
        private String pdbIpDefault;

        /**
         * An IP-based PDB connection string.
         *
         * @param pdbIpDefault the value to set
         * @return this builder
         */
        public Builder pdbIpDefault(String pdbIpDefault) {
            this.pdbIpDefault = pdbIpDefault;
            this.__explicitlySet__.add("pdbIpDefault");
            return this;
        }
        /** All connection strings to use to connect to the pluggable database. */
        @com.fasterxml.jackson.annotation.JsonProperty("allConnectionStrings")
        private java.util.Map<String, String> allConnectionStrings;

        /**
         * All connection strings to use to connect to the pluggable database.
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

        public PluggableDatabaseConnectionStrings build() {
            PluggableDatabaseConnectionStrings model =
                    new PluggableDatabaseConnectionStrings(
                            this.pdbDefault, this.pdbIpDefault, this.allConnectionStrings);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PluggableDatabaseConnectionStrings model) {
            if (model.wasPropertyExplicitlySet("pdbDefault")) {
                this.pdbDefault(model.getPdbDefault());
            }
            if (model.wasPropertyExplicitlySet("pdbIpDefault")) {
                this.pdbIpDefault(model.getPdbIpDefault());
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

    /** A host name-based PDB connection string. */
    @com.fasterxml.jackson.annotation.JsonProperty("pdbDefault")
    private final String pdbDefault;

    /**
     * A host name-based PDB connection string.
     *
     * @return the value
     */
    public String getPdbDefault() {
        return pdbDefault;
    }

    /** An IP-based PDB connection string. */
    @com.fasterxml.jackson.annotation.JsonProperty("pdbIpDefault")
    private final String pdbIpDefault;

    /**
     * An IP-based PDB connection string.
     *
     * @return the value
     */
    public String getPdbIpDefault() {
        return pdbIpDefault;
    }

    /** All connection strings to use to connect to the pluggable database. */
    @com.fasterxml.jackson.annotation.JsonProperty("allConnectionStrings")
    private final java.util.Map<String, String> allConnectionStrings;

    /**
     * All connection strings to use to connect to the pluggable database.
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
        sb.append("PluggableDatabaseConnectionStrings(");
        sb.append("super=").append(super.toString());
        sb.append("pdbDefault=").append(String.valueOf(this.pdbDefault));
        sb.append(", pdbIpDefault=").append(String.valueOf(this.pdbIpDefault));
        sb.append(", allConnectionStrings=").append(String.valueOf(this.allConnectionStrings));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PluggableDatabaseConnectionStrings)) {
            return false;
        }

        PluggableDatabaseConnectionStrings other = (PluggableDatabaseConnectionStrings) o;
        return java.util.Objects.equals(this.pdbDefault, other.pdbDefault)
                && java.util.Objects.equals(this.pdbIpDefault, other.pdbIpDefault)
                && java.util.Objects.equals(this.allConnectionStrings, other.allConnectionStrings)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.pdbDefault == null ? 43 : this.pdbDefault.hashCode());
        result = (result * PRIME) + (this.pdbIpDefault == null ? 43 : this.pdbIpDefault.hashCode());
        result =
                (result * PRIME)
                        + (this.allConnectionStrings == null
                                ? 43
                                : this.allConnectionStrings.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
