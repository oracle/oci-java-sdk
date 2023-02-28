/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The configuration details of an ASM. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExternalAsmConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ExternalAsmConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"initParameters"})
    public ExternalAsmConfiguration(java.util.List<ExternalAsmInstanceParameters> initParameters) {
        super();
        this.initParameters = initParameters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** An array of initialization parameters for the external ASM instances. */
        @com.fasterxml.jackson.annotation.JsonProperty("initParameters")
        private java.util.List<ExternalAsmInstanceParameters> initParameters;

        /**
         * An array of initialization parameters for the external ASM instances.
         *
         * @param initParameters the value to set
         * @return this builder
         */
        public Builder initParameters(
                java.util.List<ExternalAsmInstanceParameters> initParameters) {
            this.initParameters = initParameters;
            this.__explicitlySet__.add("initParameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalAsmConfiguration build() {
            ExternalAsmConfiguration model = new ExternalAsmConfiguration(this.initParameters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalAsmConfiguration model) {
            if (model.wasPropertyExplicitlySet("initParameters")) {
                this.initParameters(model.getInitParameters());
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

    /** An array of initialization parameters for the external ASM instances. */
    @com.fasterxml.jackson.annotation.JsonProperty("initParameters")
    private final java.util.List<ExternalAsmInstanceParameters> initParameters;

    /**
     * An array of initialization parameters for the external ASM instances.
     *
     * @return the value
     */
    public java.util.List<ExternalAsmInstanceParameters> getInitParameters() {
        return initParameters;
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
        sb.append("ExternalAsmConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("initParameters=").append(String.valueOf(this.initParameters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalAsmConfiguration)) {
            return false;
        }

        ExternalAsmConfiguration other = (ExternalAsmConfiguration) o;
        return java.util.Objects.equals(this.initParameters, other.initParameters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.initParameters == null ? 43 : this.initParameters.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
