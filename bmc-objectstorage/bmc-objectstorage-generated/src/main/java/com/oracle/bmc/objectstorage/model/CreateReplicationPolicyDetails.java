/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * The details to create a replication policy.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateReplicationPolicyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateReplicationPolicyDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "destinationRegionName", "destinationBucketName"})
    public CreateReplicationPolicyDetails(
            String name, String destinationRegionName, String destinationBucketName) {
        super();
        this.name = name;
        this.destinationRegionName = destinationRegionName;
        this.destinationBucketName = destinationBucketName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the policy. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the policy. Avoid entering confidential information.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The destination region to replicate to, for example "us-ashburn-1".
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationRegionName")
        private String destinationRegionName;

        /**
         * The destination region to replicate to, for example "us-ashburn-1".
         * @param destinationRegionName the value to set
         * @return this builder
         **/
        public Builder destinationRegionName(String destinationRegionName) {
            this.destinationRegionName = destinationRegionName;
            this.__explicitlySet__.add("destinationRegionName");
            return this;
        }
        /**
         * The bucket to replicate to in the destination region. Replication policy creation does not automatically
         * create a destination bucket. Create the destination bucket before creating the policy.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationBucketName")
        private String destinationBucketName;

        /**
         * The bucket to replicate to in the destination region. Replication policy creation does not automatically
         * create a destination bucket. Create the destination bucket before creating the policy.
         *
         * @param destinationBucketName the value to set
         * @return this builder
         **/
        public Builder destinationBucketName(String destinationBucketName) {
            this.destinationBucketName = destinationBucketName;
            this.__explicitlySet__.add("destinationBucketName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateReplicationPolicyDetails build() {
            CreateReplicationPolicyDetails model =
                    new CreateReplicationPolicyDetails(
                            this.name, this.destinationRegionName, this.destinationBucketName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateReplicationPolicyDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("destinationRegionName")) {
                this.destinationRegionName(model.getDestinationRegionName());
            }
            if (model.wasPropertyExplicitlySet("destinationBucketName")) {
                this.destinationBucketName(model.getDestinationBucketName());
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
     * The name of the policy. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the policy. Avoid entering confidential information.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The destination region to replicate to, for example "us-ashburn-1".
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationRegionName")
    private final String destinationRegionName;

    /**
     * The destination region to replicate to, for example "us-ashburn-1".
     * @return the value
     **/
    public String getDestinationRegionName() {
        return destinationRegionName;
    }

    /**
     * The bucket to replicate to in the destination region. Replication policy creation does not automatically
     * create a destination bucket. Create the destination bucket before creating the policy.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationBucketName")
    private final String destinationBucketName;

    /**
     * The bucket to replicate to in the destination region. Replication policy creation does not automatically
     * create a destination bucket. Create the destination bucket before creating the policy.
     *
     * @return the value
     **/
    public String getDestinationBucketName() {
        return destinationBucketName;
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
        sb.append("CreateReplicationPolicyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", destinationRegionName=").append(String.valueOf(this.destinationRegionName));
        sb.append(", destinationBucketName=").append(String.valueOf(this.destinationBucketName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateReplicationPolicyDetails)) {
            return false;
        }

        CreateReplicationPolicyDetails other = (CreateReplicationPolicyDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.destinationRegionName, other.destinationRegionName)
                && java.util.Objects.equals(this.destinationBucketName, other.destinationBucketName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationRegionName == null
                                ? 43
                                : this.destinationRegionName.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationBucketName == null
                                ? 43
                                : this.destinationBucketName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
