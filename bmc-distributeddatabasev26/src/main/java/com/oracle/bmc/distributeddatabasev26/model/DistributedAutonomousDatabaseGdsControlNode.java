/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabasev26.model;

/**
 * Details of Global Database Services Control(GDS CTL) instances for the Globally distributed autonomous database.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DistributedAutonomousDatabaseGdsControlNode.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DistributedAutonomousDatabaseGdsControlNode
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "subnetId",
        "availabilityDomain",
        "timeCreated",
        "timeUpdated",
        "supportingResourceId",
        "privateIp",
        "gdsControlNodeImageDetails",
        "metadata"
    })
    public DistributedAutonomousDatabaseGdsControlNode(
            String name,
            String subnetId,
            String availabilityDomain,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String supportingResourceId,
            String privateIp,
            DistributedAutonomousDatabaseGdsControlNodeImage gdsControlNodeImageDetails,
            DistributedAutonomousDbMetadata metadata) {
        super();
        this.name = name;
        this.subnetId = subnetId;
        this.availabilityDomain = availabilityDomain;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.supportingResourceId = supportingResourceId;
        this.privateIp = privateIp;
        this.gdsControlNodeImageDetails = gdsControlNodeImageDetails;
        this.metadata = metadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the Global Database Services Control instance
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the Global Database Services Control instance
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet associated with the Global Database Services Control instance.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet associated with the Global Database Services Control instance.
         *
         * @param subnetId the value to set
         * @return this builder
         **/
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * The name of the availability domain where the Global Database Services Control instance is located in.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The name of the availability domain where the Global Database Services Control instance is located in.
         * @param availabilityDomain the value to set
         * @return this builder
         **/
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The time the Global Database Services Control instance was created. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the Global Database Services Control instance was created. An RFC3339 formatted datetime string.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the Global Database Services Control instance was last updated. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the Global Database Services Control instance was last updated. An RFC3339 formatted datetime string.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The identifier of the underlying supporting resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("supportingResourceId")
        private String supportingResourceId;

        /**
         * The identifier of the underlying supporting resource.
         * @param supportingResourceId the value to set
         * @return this builder
         **/
        public Builder supportingResourceId(String supportingResourceId) {
            this.supportingResourceId = supportingResourceId;
            this.__explicitlySet__.add("supportingResourceId");
            return this;
        }
        /**
         * IP address of the Global Database Services Control instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
        private String privateIp;

        /**
         * IP address of the Global Database Services Control instance.
         * @param privateIp the value to set
         * @return this builder
         **/
        public Builder privateIp(String privateIp) {
            this.privateIp = privateIp;
            this.__explicitlySet__.add("privateIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("gdsControlNodeImageDetails")
        private DistributedAutonomousDatabaseGdsControlNodeImage gdsControlNodeImageDetails;

        public Builder gdsControlNodeImageDetails(
                DistributedAutonomousDatabaseGdsControlNodeImage gdsControlNodeImageDetails) {
            this.gdsControlNodeImageDetails = gdsControlNodeImageDetails;
            this.__explicitlySet__.add("gdsControlNodeImageDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private DistributedAutonomousDbMetadata metadata;

        public Builder metadata(DistributedAutonomousDbMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DistributedAutonomousDatabaseGdsControlNode build() {
            DistributedAutonomousDatabaseGdsControlNode model =
                    new DistributedAutonomousDatabaseGdsControlNode(
                            this.name,
                            this.subnetId,
                            this.availabilityDomain,
                            this.timeCreated,
                            this.timeUpdated,
                            this.supportingResourceId,
                            this.privateIp,
                            this.gdsControlNodeImageDetails,
                            this.metadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DistributedAutonomousDatabaseGdsControlNode model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("supportingResourceId")) {
                this.supportingResourceId(model.getSupportingResourceId());
            }
            if (model.wasPropertyExplicitlySet("privateIp")) {
                this.privateIp(model.getPrivateIp());
            }
            if (model.wasPropertyExplicitlySet("gdsControlNodeImageDetails")) {
                this.gdsControlNodeImageDetails(model.getGdsControlNodeImageDetails());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
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
     * Name of the Global Database Services Control instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the Global Database Services Control instance
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet associated with the Global Database Services Control instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet associated with the Global Database Services Control instance.
     *
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The name of the availability domain where the Global Database Services Control instance is located in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The name of the availability domain where the Global Database Services Control instance is located in.
     * @return the value
     **/
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The time the Global Database Services Control instance was created. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the Global Database Services Control instance was created. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the Global Database Services Control instance was last updated. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the Global Database Services Control instance was last updated. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The identifier of the underlying supporting resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportingResourceId")
    private final String supportingResourceId;

    /**
     * The identifier of the underlying supporting resource.
     * @return the value
     **/
    public String getSupportingResourceId() {
        return supportingResourceId;
    }

    /**
     * IP address of the Global Database Services Control instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
    private final String privateIp;

    /**
     * IP address of the Global Database Services Control instance.
     * @return the value
     **/
    public String getPrivateIp() {
        return privateIp;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("gdsControlNodeImageDetails")
    private final DistributedAutonomousDatabaseGdsControlNodeImage gdsControlNodeImageDetails;

    public DistributedAutonomousDatabaseGdsControlNodeImage getGdsControlNodeImageDetails() {
        return gdsControlNodeImageDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final DistributedAutonomousDbMetadata metadata;

    public DistributedAutonomousDbMetadata getMetadata() {
        return metadata;
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
        sb.append("DistributedAutonomousDatabaseGdsControlNode(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", supportingResourceId=").append(String.valueOf(this.supportingResourceId));
        sb.append(", privateIp=").append(String.valueOf(this.privateIp));
        sb.append(", gdsControlNodeImageDetails=")
                .append(String.valueOf(this.gdsControlNodeImageDetails));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DistributedAutonomousDatabaseGdsControlNode)) {
            return false;
        }

        DistributedAutonomousDatabaseGdsControlNode other =
                (DistributedAutonomousDatabaseGdsControlNode) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.supportingResourceId, other.supportingResourceId)
                && java.util.Objects.equals(this.privateIp, other.privateIp)
                && java.util.Objects.equals(
                        this.gdsControlNodeImageDetails, other.gdsControlNodeImageDetails)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.supportingResourceId == null
                                ? 43
                                : this.supportingResourceId.hashCode());
        result = (result * PRIME) + (this.privateIp == null ? 43 : this.privateIp.hashCode());
        result =
                (result * PRIME)
                        + (this.gdsControlNodeImageDetails == null
                                ? 43
                                : this.gdsControlNodeImageDetails.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
