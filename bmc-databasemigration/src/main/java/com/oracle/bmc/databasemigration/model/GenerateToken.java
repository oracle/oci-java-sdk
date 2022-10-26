/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * ODMS Agent token details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GenerateToken.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class GenerateToken extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"rptBlob"})
    public GenerateToken(String rptBlob) {
        super();
        this.rptBlob = rptBlob;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Resource Principals Token in serialized form. */
        @com.fasterxml.jackson.annotation.JsonProperty("rptBlob")
        private String rptBlob;

        /**
         * Resource Principals Token in serialized form.
         *
         * @param rptBlob the value to set
         * @return this builder
         */
        public Builder rptBlob(String rptBlob) {
            this.rptBlob = rptBlob;
            this.__explicitlySet__.add("rptBlob");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenerateToken build() {
            GenerateToken model = new GenerateToken(this.rptBlob);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenerateToken model) {
            if (model.wasPropertyExplicitlySet("rptBlob")) {
                this.rptBlob(model.getRptBlob());
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

    /** Resource Principals Token in serialized form. */
    @com.fasterxml.jackson.annotation.JsonProperty("rptBlob")
    private final String rptBlob;

    /**
     * Resource Principals Token in serialized form.
     *
     * @return the value
     */
    public String getRptBlob() {
        return rptBlob;
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
        sb.append("GenerateToken(");
        sb.append("super=").append(super.toString());
        sb.append("rptBlob=").append(String.valueOf(this.rptBlob));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenerateToken)) {
            return false;
        }

        GenerateToken other = (GenerateToken) o;
        return java.util.Objects.equals(this.rptBlob, other.rptBlob) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.rptBlob == null ? 43 : this.rptBlob.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
