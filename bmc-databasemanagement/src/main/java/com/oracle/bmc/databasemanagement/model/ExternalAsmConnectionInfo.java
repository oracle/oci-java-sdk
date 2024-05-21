/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details required to connect to an external ASM instance.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExternalAsmConnectionInfo.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "componentType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExternalAsmConnectionInfo extends ExternalDbSystemConnectionInfo {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("connectionString")
        private AsmConnectionString connectionString;

        public Builder connectionString(AsmConnectionString connectionString) {
            this.connectionString = connectionString;
            this.__explicitlySet__.add("connectionString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionCredentials")
        private AsmConnectionCredentials connectionCredentials;

        public Builder connectionCredentials(AsmConnectionCredentials connectionCredentials) {
            this.connectionCredentials = connectionCredentials;
            this.__explicitlySet__.add("connectionCredentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalAsmConnectionInfo build() {
            ExternalAsmConnectionInfo model =
                    new ExternalAsmConnectionInfo(
                            this.connectionString, this.connectionCredentials);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalAsmConnectionInfo model) {
            if (model.wasPropertyExplicitlySet("connectionString")) {
                this.connectionString(model.getConnectionString());
            }
            if (model.wasPropertyExplicitlySet("connectionCredentials")) {
                this.connectionCredentials(model.getConnectionCredentials());
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
    public ExternalAsmConnectionInfo(
            AsmConnectionString connectionString, AsmConnectionCredentials connectionCredentials) {
        super();
        this.connectionString = connectionString;
        this.connectionCredentials = connectionCredentials;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connectionString")
    private final AsmConnectionString connectionString;

    public AsmConnectionString getConnectionString() {
        return connectionString;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connectionCredentials")
    private final AsmConnectionCredentials connectionCredentials;

    public AsmConnectionCredentials getConnectionCredentials() {
        return connectionCredentials;
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
        sb.append("ExternalAsmConnectionInfo(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", connectionString=").append(String.valueOf(this.connectionString));
        sb.append(", connectionCredentials=").append(String.valueOf(this.connectionCredentials));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalAsmConnectionInfo)) {
            return false;
        }

        ExternalAsmConnectionInfo other = (ExternalAsmConnectionInfo) o;
        return java.util.Objects.equals(this.connectionString, other.connectionString)
                && java.util.Objects.equals(this.connectionCredentials, other.connectionCredentials)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.connectionString == null ? 43 : this.connectionString.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionCredentials == null
                                ? 43
                                : this.connectionCredentials.hashCode());
        return result;
    }
}
