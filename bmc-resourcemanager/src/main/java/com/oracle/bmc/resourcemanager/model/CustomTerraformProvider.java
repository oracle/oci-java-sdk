/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Location information about custom Terraform providers for a stack. For more information, see
 * [Custom
 * Providers](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Concepts/resourcemanager.htm#features__custom-providers).
 * Note: Older stacks must be explicitly updated to use Terraform Registry ({@code
 * isThirdPartyProviderExperienceEnabled=true}). See {@link #updateStack(UpdateStackRequest)
 * updateStack}. For more information, see [Using Terraform Registry with Older
 * Stacks](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Tasks/update-stack-tf-reg.htm).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CustomTerraformProvider.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CustomTerraformProvider
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"region", "namespace", "bucketName"})
    public CustomTerraformProvider(String region, String namespace, String bucketName) {
        super();
        this.region = region;
        this.namespace = namespace;
        this.bucketName = bucketName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the region that contains the bucket you want. For information about regions,
         * see [Regions and Availability
         * Domains](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/regions.htm).
         * Example: {@code us-phoenix-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The name of the region that contains the bucket you want. For information about regions,
         * see [Regions and Availability
         * Domains](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/regions.htm).
         * Example: {@code us-phoenix-1}
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * The Object Storage namespace that contains the bucket you want. For information about
         * Object Storage namespaces, see [Understanding Object Storage
         * Namespaces](https://docs.cloud.oracle.com/iaas/Content/Object/Tasks/understandingnamespaces.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The Object Storage namespace that contains the bucket you want. For information about
         * Object Storage namespaces, see [Understanding Object Storage
         * Namespaces](https://docs.cloud.oracle.com/iaas/Content/Object/Tasks/understandingnamespaces.htm).
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * The name of the bucket that contains the binary files for the custom Terraform providers.
         * For information about buckets, see [Managing
         * Buckets](https://docs.cloud.oracle.com/iaas/Content/Object/Tasks/managingbuckets.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * The name of the bucket that contains the binary files for the custom Terraform providers.
         * For information about buckets, see [Managing
         * Buckets](https://docs.cloud.oracle.com/iaas/Content/Object/Tasks/managingbuckets.htm).
         *
         * @param bucketName the value to set
         * @return this builder
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CustomTerraformProvider build() {
            CustomTerraformProvider model =
                    new CustomTerraformProvider(this.region, this.namespace, this.bucketName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomTerraformProvider model) {
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
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
     * The name of the region that contains the bucket you want. For information about regions, see
     * [Regions and Availability
     * Domains](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/regions.htm). Example:
     * {@code us-phoenix-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The name of the region that contains the bucket you want. For information about regions, see
     * [Regions and Availability
     * Domains](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/regions.htm). Example:
     * {@code us-phoenix-1}
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /**
     * The Object Storage namespace that contains the bucket you want. For information about Object
     * Storage namespaces, see [Understanding Object Storage
     * Namespaces](https://docs.cloud.oracle.com/iaas/Content/Object/Tasks/understandingnamespaces.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The Object Storage namespace that contains the bucket you want. For information about Object
     * Storage namespaces, see [Understanding Object Storage
     * Namespaces](https://docs.cloud.oracle.com/iaas/Content/Object/Tasks/understandingnamespaces.htm).
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * The name of the bucket that contains the binary files for the custom Terraform providers. For
     * information about buckets, see [Managing
     * Buckets](https://docs.cloud.oracle.com/iaas/Content/Object/Tasks/managingbuckets.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * The name of the bucket that contains the binary files for the custom Terraform providers. For
     * information about buckets, see [Managing
     * Buckets](https://docs.cloud.oracle.com/iaas/Content/Object/Tasks/managingbuckets.htm).
     *
     * @return the value
     */
    public String getBucketName() {
        return bucketName;
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
        sb.append("CustomTerraformProvider(");
        sb.append("super=").append(super.toString());
        sb.append("region=").append(String.valueOf(this.region));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomTerraformProvider)) {
            return false;
        }

        CustomTerraformProvider other = (CustomTerraformProvider) o;
        return java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
