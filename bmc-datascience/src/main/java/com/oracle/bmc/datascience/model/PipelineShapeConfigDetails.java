/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Details for the pipeline step run shape configuration. Specify only when a flex shape is
 * selected. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PipelineShapeConfigDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PipelineShapeConfigDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ocpus", "memoryInGBs"})
    public PipelineShapeConfigDetails(Float ocpus, Float memoryInGBs) {
        super();
        this.ocpus = ocpus;
        this.memoryInGBs = memoryInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A pipeline step run instance of type VM.Standard.E3.Flex allows the ocpu count to be
         * specified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
        private Float ocpus;

        /**
         * A pipeline step run instance of type VM.Standard.E3.Flex allows the ocpu count to be
         * specified.
         *
         * @param ocpus the value to set
         * @return this builder
         */
        public Builder ocpus(Float ocpus) {
            this.ocpus = ocpus;
            this.__explicitlySet__.add("ocpus");
            return this;
        }
        /**
         * A pipeline step run instance of type VM.Standard.E3.Flex allows memory to be specified.
         * This specifies the size of the memory in GBs.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
        private Float memoryInGBs;

        /**
         * A pipeline step run instance of type VM.Standard.E3.Flex allows memory to be specified.
         * This specifies the size of the memory in GBs.
         *
         * @param memoryInGBs the value to set
         * @return this builder
         */
        public Builder memoryInGBs(Float memoryInGBs) {
            this.memoryInGBs = memoryInGBs;
            this.__explicitlySet__.add("memoryInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PipelineShapeConfigDetails build() {
            PipelineShapeConfigDetails model =
                    new PipelineShapeConfigDetails(this.ocpus, this.memoryInGBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PipelineShapeConfigDetails model) {
            if (model.wasPropertyExplicitlySet("ocpus")) {
                this.ocpus(model.getOcpus());
            }
            if (model.wasPropertyExplicitlySet("memoryInGBs")) {
                this.memoryInGBs(model.getMemoryInGBs());
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
     * A pipeline step run instance of type VM.Standard.E3.Flex allows the ocpu count to be
     * specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
    private final Float ocpus;

    /**
     * A pipeline step run instance of type VM.Standard.E3.Flex allows the ocpu count to be
     * specified.
     *
     * @return the value
     */
    public Float getOcpus() {
        return ocpus;
    }

    /**
     * A pipeline step run instance of type VM.Standard.E3.Flex allows memory to be specified. This
     * specifies the size of the memory in GBs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
    private final Float memoryInGBs;

    /**
     * A pipeline step run instance of type VM.Standard.E3.Flex allows memory to be specified. This
     * specifies the size of the memory in GBs.
     *
     * @return the value
     */
    public Float getMemoryInGBs() {
        return memoryInGBs;
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
        sb.append("PipelineShapeConfigDetails(");
        sb.append("super=").append(super.toString());
        sb.append("ocpus=").append(String.valueOf(this.ocpus));
        sb.append(", memoryInGBs=").append(String.valueOf(this.memoryInGBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PipelineShapeConfigDetails)) {
            return false;
        }

        PipelineShapeConfigDetails other = (PipelineShapeConfigDetails) o;
        return java.util.Objects.equals(this.ocpus, other.ocpus)
                && java.util.Objects.equals(this.memoryInGBs, other.memoryInGBs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ocpus == null ? 43 : this.ocpus.hashCode());
        result = (result * PRIME) + (this.memoryInGBs == null ? 43 : this.memoryInGBs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
