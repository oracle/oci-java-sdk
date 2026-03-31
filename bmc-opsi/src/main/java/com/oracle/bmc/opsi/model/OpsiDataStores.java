/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Logical grouping used for Ops Insights Data Store operations.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OpsiDataStores.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OpsiDataStores extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"opsiDataStores"})
    public OpsiDataStores(Object opsiDataStores) {
        super();
        this.opsiDataStores = opsiDataStores;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OPSI Data Store Object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("opsiDataStores")
        private Object opsiDataStores;

        /**
         * OPSI Data Store Object.
         * @param opsiDataStores the value to set
         * @return this builder
         **/
        public Builder opsiDataStores(Object opsiDataStores) {
            this.opsiDataStores = opsiDataStores;
            this.__explicitlySet__.add("opsiDataStores");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OpsiDataStores build() {
            OpsiDataStores model = new OpsiDataStores(this.opsiDataStores);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OpsiDataStores model) {
            if (model.wasPropertyExplicitlySet("opsiDataStores")) {
                this.opsiDataStores(model.getOpsiDataStores());
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
     * OPSI Data Store Object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("opsiDataStores")
    private final Object opsiDataStores;

    /**
     * OPSI Data Store Object.
     * @return the value
     **/
    public Object getOpsiDataStores() {
        return opsiDataStores;
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
        sb.append("OpsiDataStores(");
        sb.append("super=").append(super.toString());
        sb.append("opsiDataStores=").append(String.valueOf(this.opsiDataStores));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OpsiDataStores)) {
            return false;
        }

        OpsiDataStores other = (OpsiDataStores) o;
        return java.util.Objects.equals(this.opsiDataStores, other.opsiDataStores)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.opsiDataStores == null ? 43 : this.opsiDataStores.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
