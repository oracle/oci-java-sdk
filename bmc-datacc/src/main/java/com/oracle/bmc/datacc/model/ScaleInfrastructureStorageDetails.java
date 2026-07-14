/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc.model;

/**
 * The scale option to be selected for the infrastructure. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ScaleInfrastructureStorageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ScaleInfrastructureStorageDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ssdConfigurationRequested"})
    public ScaleInfrastructureStorageDetails(ShapeEnum ssdConfigurationRequested) {
        super();
        this.ssdConfigurationRequested = ssdConfigurationRequested;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The scale option to be selected for the infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("ssdConfigurationRequested")
        private ShapeEnum ssdConfigurationRequested;

        /**
         * The scale option to be selected for the infrastructure.
         *
         * @param ssdConfigurationRequested the value to set
         * @return this builder
         */
        public Builder ssdConfigurationRequested(ShapeEnum ssdConfigurationRequested) {
            this.ssdConfigurationRequested = ssdConfigurationRequested;
            this.__explicitlySet__.add("ssdConfigurationRequested");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScaleInfrastructureStorageDetails build() {
            ScaleInfrastructureStorageDetails model =
                    new ScaleInfrastructureStorageDetails(this.ssdConfigurationRequested);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScaleInfrastructureStorageDetails model) {
            if (model.wasPropertyExplicitlySet("ssdConfigurationRequested")) {
                this.ssdConfigurationRequested(model.getSsdConfigurationRequested());
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

    /** The scale option to be selected for the infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("ssdConfigurationRequested")
    private final ShapeEnum ssdConfigurationRequested;

    /**
     * The scale option to be selected for the infrastructure.
     *
     * @return the value
     */
    public ShapeEnum getSsdConfigurationRequested() {
        return ssdConfigurationRequested;
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
        sb.append("ScaleInfrastructureStorageDetails(");
        sb.append("super=").append(super.toString());
        sb.append("ssdConfigurationRequested=")
                .append(String.valueOf(this.ssdConfigurationRequested));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScaleInfrastructureStorageDetails)) {
            return false;
        }

        ScaleInfrastructureStorageDetails other = (ScaleInfrastructureStorageDetails) o;
        return java.util.Objects.equals(
                        this.ssdConfigurationRequested, other.ssdConfigurationRequested)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.ssdConfigurationRequested == null
                                ? 43
                                : this.ssdConfigurationRequested.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
