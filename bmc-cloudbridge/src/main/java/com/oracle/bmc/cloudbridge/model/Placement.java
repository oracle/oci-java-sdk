/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * Describes the placement of an instance. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Placement.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Placement extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "affinity",
        "availabilityZone",
        "groupName",
        "hostKey",
        "hostResourceGroupArn",
        "partitionNumber",
        "spreadDomain",
        "tenancy"
    })
    public Placement(
            String affinity,
            String availabilityZone,
            String groupName,
            String hostKey,
            String hostResourceGroupArn,
            Integer partitionNumber,
            String spreadDomain,
            String tenancy) {
        super();
        this.affinity = affinity;
        this.availabilityZone = availabilityZone;
        this.groupName = groupName;
        this.hostKey = hostKey;
        this.hostResourceGroupArn = hostResourceGroupArn;
        this.partitionNumber = partitionNumber;
        this.spreadDomain = spreadDomain;
        this.tenancy = tenancy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The affinity setting for the instance on the Dedicated Host. */
        @com.fasterxml.jackson.annotation.JsonProperty("affinity")
        private String affinity;

        /**
         * The affinity setting for the instance on the Dedicated Host.
         *
         * @param affinity the value to set
         * @return this builder
         */
        public Builder affinity(String affinity) {
            this.affinity = affinity;
            this.__explicitlySet__.add("affinity");
            return this;
        }
        /** The Availability Zone of the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityZone")
        private String availabilityZone;

        /**
         * The Availability Zone of the instance.
         *
         * @param availabilityZone the value to set
         * @return this builder
         */
        public Builder availabilityZone(String availabilityZone) {
            this.availabilityZone = availabilityZone;
            this.__explicitlySet__.add("availabilityZone");
            return this;
        }
        /** The name of the placement group the instance is in. */
        @com.fasterxml.jackson.annotation.JsonProperty("groupName")
        private String groupName;

        /**
         * The name of the placement group the instance is in.
         *
         * @param groupName the value to set
         * @return this builder
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            this.__explicitlySet__.add("groupName");
            return this;
        }
        /** The ID of the Dedicated Host on which the instance resides. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostKey")
        private String hostKey;

        /**
         * The ID of the Dedicated Host on which the instance resides.
         *
         * @param hostKey the value to set
         * @return this builder
         */
        public Builder hostKey(String hostKey) {
            this.hostKey = hostKey;
            this.__explicitlySet__.add("hostKey");
            return this;
        }
        /** The ARN of the host resource group in which to launch the instances. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostResourceGroupArn")
        private String hostResourceGroupArn;

        /**
         * The ARN of the host resource group in which to launch the instances.
         *
         * @param hostResourceGroupArn the value to set
         * @return this builder
         */
        public Builder hostResourceGroupArn(String hostResourceGroupArn) {
            this.hostResourceGroupArn = hostResourceGroupArn;
            this.__explicitlySet__.add("hostResourceGroupArn");
            return this;
        }
        /** The number of the partition that the instance is in. */
        @com.fasterxml.jackson.annotation.JsonProperty("partitionNumber")
        private Integer partitionNumber;

        /**
         * The number of the partition that the instance is in.
         *
         * @param partitionNumber the value to set
         * @return this builder
         */
        public Builder partitionNumber(Integer partitionNumber) {
            this.partitionNumber = partitionNumber;
            this.__explicitlySet__.add("partitionNumber");
            return this;
        }
        /** Reserved for future use. */
        @com.fasterxml.jackson.annotation.JsonProperty("spreadDomain")
        private String spreadDomain;

        /**
         * Reserved for future use.
         *
         * @param spreadDomain the value to set
         * @return this builder
         */
        public Builder spreadDomain(String spreadDomain) {
            this.spreadDomain = spreadDomain;
            this.__explicitlySet__.add("spreadDomain");
            return this;
        }
        /** The tenancy of the instance (if the instance is running in a VPC). */
        @com.fasterxml.jackson.annotation.JsonProperty("tenancy")
        private String tenancy;

        /**
         * The tenancy of the instance (if the instance is running in a VPC).
         *
         * @param tenancy the value to set
         * @return this builder
         */
        public Builder tenancy(String tenancy) {
            this.tenancy = tenancy;
            this.__explicitlySet__.add("tenancy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Placement build() {
            Placement model =
                    new Placement(
                            this.affinity,
                            this.availabilityZone,
                            this.groupName,
                            this.hostKey,
                            this.hostResourceGroupArn,
                            this.partitionNumber,
                            this.spreadDomain,
                            this.tenancy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Placement model) {
            if (model.wasPropertyExplicitlySet("affinity")) {
                this.affinity(model.getAffinity());
            }
            if (model.wasPropertyExplicitlySet("availabilityZone")) {
                this.availabilityZone(model.getAvailabilityZone());
            }
            if (model.wasPropertyExplicitlySet("groupName")) {
                this.groupName(model.getGroupName());
            }
            if (model.wasPropertyExplicitlySet("hostKey")) {
                this.hostKey(model.getHostKey());
            }
            if (model.wasPropertyExplicitlySet("hostResourceGroupArn")) {
                this.hostResourceGroupArn(model.getHostResourceGroupArn());
            }
            if (model.wasPropertyExplicitlySet("partitionNumber")) {
                this.partitionNumber(model.getPartitionNumber());
            }
            if (model.wasPropertyExplicitlySet("spreadDomain")) {
                this.spreadDomain(model.getSpreadDomain());
            }
            if (model.wasPropertyExplicitlySet("tenancy")) {
                this.tenancy(model.getTenancy());
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

    /** The affinity setting for the instance on the Dedicated Host. */
    @com.fasterxml.jackson.annotation.JsonProperty("affinity")
    private final String affinity;

    /**
     * The affinity setting for the instance on the Dedicated Host.
     *
     * @return the value
     */
    public String getAffinity() {
        return affinity;
    }

    /** The Availability Zone of the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityZone")
    private final String availabilityZone;

    /**
     * The Availability Zone of the instance.
     *
     * @return the value
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /** The name of the placement group the instance is in. */
    @com.fasterxml.jackson.annotation.JsonProperty("groupName")
    private final String groupName;

    /**
     * The name of the placement group the instance is in.
     *
     * @return the value
     */
    public String getGroupName() {
        return groupName;
    }

    /** The ID of the Dedicated Host on which the instance resides. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostKey")
    private final String hostKey;

    /**
     * The ID of the Dedicated Host on which the instance resides.
     *
     * @return the value
     */
    public String getHostKey() {
        return hostKey;
    }

    /** The ARN of the host resource group in which to launch the instances. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostResourceGroupArn")
    private final String hostResourceGroupArn;

    /**
     * The ARN of the host resource group in which to launch the instances.
     *
     * @return the value
     */
    public String getHostResourceGroupArn() {
        return hostResourceGroupArn;
    }

    /** The number of the partition that the instance is in. */
    @com.fasterxml.jackson.annotation.JsonProperty("partitionNumber")
    private final Integer partitionNumber;

    /**
     * The number of the partition that the instance is in.
     *
     * @return the value
     */
    public Integer getPartitionNumber() {
        return partitionNumber;
    }

    /** Reserved for future use. */
    @com.fasterxml.jackson.annotation.JsonProperty("spreadDomain")
    private final String spreadDomain;

    /**
     * Reserved for future use.
     *
     * @return the value
     */
    public String getSpreadDomain() {
        return spreadDomain;
    }

    /** The tenancy of the instance (if the instance is running in a VPC). */
    @com.fasterxml.jackson.annotation.JsonProperty("tenancy")
    private final String tenancy;

    /**
     * The tenancy of the instance (if the instance is running in a VPC).
     *
     * @return the value
     */
    public String getTenancy() {
        return tenancy;
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
        sb.append("Placement(");
        sb.append("super=").append(super.toString());
        sb.append("affinity=").append(String.valueOf(this.affinity));
        sb.append(", availabilityZone=").append(String.valueOf(this.availabilityZone));
        sb.append(", groupName=").append(String.valueOf(this.groupName));
        sb.append(", hostKey=").append(String.valueOf(this.hostKey));
        sb.append(", hostResourceGroupArn=").append(String.valueOf(this.hostResourceGroupArn));
        sb.append(", partitionNumber=").append(String.valueOf(this.partitionNumber));
        sb.append(", spreadDomain=").append(String.valueOf(this.spreadDomain));
        sb.append(", tenancy=").append(String.valueOf(this.tenancy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Placement)) {
            return false;
        }

        Placement other = (Placement) o;
        return java.util.Objects.equals(this.affinity, other.affinity)
                && java.util.Objects.equals(this.availabilityZone, other.availabilityZone)
                && java.util.Objects.equals(this.groupName, other.groupName)
                && java.util.Objects.equals(this.hostKey, other.hostKey)
                && java.util.Objects.equals(this.hostResourceGroupArn, other.hostResourceGroupArn)
                && java.util.Objects.equals(this.partitionNumber, other.partitionNumber)
                && java.util.Objects.equals(this.spreadDomain, other.spreadDomain)
                && java.util.Objects.equals(this.tenancy, other.tenancy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.affinity == null ? 43 : this.affinity.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityZone == null ? 43 : this.availabilityZone.hashCode());
        result = (result * PRIME) + (this.groupName == null ? 43 : this.groupName.hashCode());
        result = (result * PRIME) + (this.hostKey == null ? 43 : this.hostKey.hashCode());
        result =
                (result * PRIME)
                        + (this.hostResourceGroupArn == null
                                ? 43
                                : this.hostResourceGroupArn.hashCode());
        result =
                (result * PRIME)
                        + (this.partitionNumber == null ? 43 : this.partitionNumber.hashCode());
        result = (result * PRIME) + (this.spreadDomain == null ? 43 : this.spreadDomain.hashCode());
        result = (result * PRIME) + (this.tenancy == null ? 43 : this.tenancy.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
