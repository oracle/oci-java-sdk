/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Details for detecting drift in a stack. <br>
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
        builder = DetectStackDriftDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DetectStackDriftDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"resourceAddresses", "isProviderUpgradeRequired"})
    public DetectStackDriftDetails(
            java.util.List<String> resourceAddresses, Boolean isProviderUpgradeRequired) {
        super();
        this.resourceAddresses = resourceAddresses;
        this.isProviderUpgradeRequired = isProviderUpgradeRequired;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The list of resources in the specified stack to detect drift for. Each resource is
         * identified by a resource address, which is a string derived from the resource type and
         * name specified in the stack's Terraform configuration plus an optional index. For
         * example, the resource address for the fourth Compute instance with the name
         * "test_instance" is oci_core_instance.test_instance[3]. For more details and examples of
         * resource addresses, see the Terraform documentation at [Resource
         * spec](https://www.terraform.io/docs/internals/resource-addressing.html#examples).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceAddresses")
        private java.util.List<String> resourceAddresses;

        /**
         * The list of resources in the specified stack to detect drift for. Each resource is
         * identified by a resource address, which is a string derived from the resource type and
         * name specified in the stack's Terraform configuration plus an optional index. For
         * example, the resource address for the fourth Compute instance with the name
         * "test_instance" is oci_core_instance.test_instance[3]. For more details and examples of
         * resource addresses, see the Terraform documentation at [Resource
         * spec](https://www.terraform.io/docs/internals/resource-addressing.html#examples).
         *
         * @param resourceAddresses the value to set
         * @return this builder
         */
        public Builder resourceAddresses(java.util.List<String> resourceAddresses) {
            this.resourceAddresses = resourceAddresses;
            this.__explicitlySet__.add("resourceAddresses");
            return this;
        }
        /**
         * Specifies whether or not to upgrade provider versions. Within the version constraints of
         * your Terraform configuration, use the latest versions available from the source of
         * Terraform providers. For more information about this option, see [Dependency Lock File
         * (terraform.io)](https://www.terraform.io/language/files/dependency-lock).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isProviderUpgradeRequired")
        private Boolean isProviderUpgradeRequired;

        /**
         * Specifies whether or not to upgrade provider versions. Within the version constraints of
         * your Terraform configuration, use the latest versions available from the source of
         * Terraform providers. For more information about this option, see [Dependency Lock File
         * (terraform.io)](https://www.terraform.io/language/files/dependency-lock).
         *
         * @param isProviderUpgradeRequired the value to set
         * @return this builder
         */
        public Builder isProviderUpgradeRequired(Boolean isProviderUpgradeRequired) {
            this.isProviderUpgradeRequired = isProviderUpgradeRequired;
            this.__explicitlySet__.add("isProviderUpgradeRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DetectStackDriftDetails build() {
            DetectStackDriftDetails model =
                    new DetectStackDriftDetails(
                            this.resourceAddresses, this.isProviderUpgradeRequired);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DetectStackDriftDetails model) {
            if (model.wasPropertyExplicitlySet("resourceAddresses")) {
                this.resourceAddresses(model.getResourceAddresses());
            }
            if (model.wasPropertyExplicitlySet("isProviderUpgradeRequired")) {
                this.isProviderUpgradeRequired(model.getIsProviderUpgradeRequired());
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
     * The list of resources in the specified stack to detect drift for. Each resource is identified
     * by a resource address, which is a string derived from the resource type and name specified in
     * the stack's Terraform configuration plus an optional index. For example, the resource address
     * for the fourth Compute instance with the name "test_instance" is
     * oci_core_instance.test_instance[3]. For more details and examples of resource addresses, see
     * the Terraform documentation at [Resource
     * spec](https://www.terraform.io/docs/internals/resource-addressing.html#examples).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceAddresses")
    private final java.util.List<String> resourceAddresses;

    /**
     * The list of resources in the specified stack to detect drift for. Each resource is identified
     * by a resource address, which is a string derived from the resource type and name specified in
     * the stack's Terraform configuration plus an optional index. For example, the resource address
     * for the fourth Compute instance with the name "test_instance" is
     * oci_core_instance.test_instance[3]. For more details and examples of resource addresses, see
     * the Terraform documentation at [Resource
     * spec](https://www.terraform.io/docs/internals/resource-addressing.html#examples).
     *
     * @return the value
     */
    public java.util.List<String> getResourceAddresses() {
        return resourceAddresses;
    }

    /**
     * Specifies whether or not to upgrade provider versions. Within the version constraints of your
     * Terraform configuration, use the latest versions available from the source of Terraform
     * providers. For more information about this option, see [Dependency Lock File
     * (terraform.io)](https://www.terraform.io/language/files/dependency-lock).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isProviderUpgradeRequired")
    private final Boolean isProviderUpgradeRequired;

    /**
     * Specifies whether or not to upgrade provider versions. Within the version constraints of your
     * Terraform configuration, use the latest versions available from the source of Terraform
     * providers. For more information about this option, see [Dependency Lock File
     * (terraform.io)](https://www.terraform.io/language/files/dependency-lock).
     *
     * @return the value
     */
    public Boolean getIsProviderUpgradeRequired() {
        return isProviderUpgradeRequired;
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
        sb.append("DetectStackDriftDetails(");
        sb.append("super=").append(super.toString());
        sb.append("resourceAddresses=").append(String.valueOf(this.resourceAddresses));
        sb.append(", isProviderUpgradeRequired=")
                .append(String.valueOf(this.isProviderUpgradeRequired));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetectStackDriftDetails)) {
            return false;
        }

        DetectStackDriftDetails other = (DetectStackDriftDetails) o;
        return java.util.Objects.equals(this.resourceAddresses, other.resourceAddresses)
                && java.util.Objects.equals(
                        this.isProviderUpgradeRequired, other.isProviderUpgradeRequired)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.resourceAddresses == null ? 43 : this.resourceAddresses.hashCode());
        result =
                (result * PRIME)
                        + (this.isProviderUpgradeRequired == null
                                ? 43
                                : this.isProviderUpgradeRequired.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
