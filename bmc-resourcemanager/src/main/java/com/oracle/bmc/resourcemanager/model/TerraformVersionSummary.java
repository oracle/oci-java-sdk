/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * A Terraform version supported for use with stacks. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TerraformVersionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TerraformVersionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "isDefault"})
    public TerraformVersionSummary(String name, Boolean isDefault) {
        super();
        this.name = name;
        this.isDefault = isDefault;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A supported Terraform version. Example: {@code 0.12.x} */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A supported Terraform version. Example: {@code 0.12.x}
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Indicates whether this Terraform version is used by default in {@link
         * #createStack(CreateStackRequest) createStack}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        /**
         * Indicates whether this Terraform version is used by default in {@link
         * #createStack(CreateStackRequest) createStack}.
         *
         * @param isDefault the value to set
         * @return this builder
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TerraformVersionSummary build() {
            TerraformVersionSummary model = new TerraformVersionSummary(this.name, this.isDefault);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TerraformVersionSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("isDefault")) {
                this.isDefault(model.getIsDefault());
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

    /** A supported Terraform version. Example: {@code 0.12.x} */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A supported Terraform version. Example: {@code 0.12.x}
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Indicates whether this Terraform version is used by default in {@link
     * #createStack(CreateStackRequest) createStack}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final Boolean isDefault;

    /**
     * Indicates whether this Terraform version is used by default in {@link
     * #createStack(CreateStackRequest) createStack}.
     *
     * @return the value
     */
    public Boolean getIsDefault() {
        return isDefault;
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
        sb.append("TerraformVersionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TerraformVersionSummary)) {
            return false;
        }

        TerraformVersionSummary other = (TerraformVersionSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.isDefault, other.isDefault)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
