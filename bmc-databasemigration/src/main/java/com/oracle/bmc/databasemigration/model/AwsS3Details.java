/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * AWS S3 bucket details used for source Connection resources with RDS_ORACLE type.
 * Only supported for source Connection resources with RDS_ORACLE type.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AwsS3Details.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AwsS3Details {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "region"})
    public AwsS3Details(String name, String region) {
        super();
        this.name = name;
        this.region = region;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * S3 bucket name.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * S3 bucket name.
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * AWS region code where the S3 bucket is located.
         * Region code should match the documented available regions:
         * https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * AWS region code where the S3 bucket is located.
         * Region code should match the documented available regions:
         * https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions
         *
         * @param region the value to set
         * @return this builder
         **/
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwsS3Details build() {
            AwsS3Details __instance__ = new AwsS3Details(name, region);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwsS3Details o) {
            Builder copiedBuilder = name(o.getName()).region(o.getRegion());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * S3 bucket name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * S3 bucket name.
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * AWS region code where the S3 bucket is located.
     * Region code should match the documented available regions:
     * https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * AWS region code where the S3 bucket is located.
     * Region code should match the documented available regions:
     * https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions
     *
     * @return the value
     **/
    public String getRegion() {
        return region;
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
        sb.append("AwsS3Details(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwsS3Details)) {
            return false;
        }

        AwsS3Details other = (AwsS3Details) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
