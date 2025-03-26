/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of unallocated resources of the Cloud Exadata infrastructure. Applies to Cloud Exadata infrastructure instances only.
 *
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
    builder = CloudExadataInfrastructureUnallocatedResources.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CloudExadataInfrastructureUnallocatedResources
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "cloudExadataInfrastructureId",
        "cloudExadataInfrastructureDisplayName",
        "localStorageInGbs",
        "ocpus",
        "memoryInGBs",
        "exadataStorageInTBs",
        "cloudAutonomousVmClusters"
    })
    public CloudExadataInfrastructureUnallocatedResources(
            String cloudExadataInfrastructureId,
            String cloudExadataInfrastructureDisplayName,
            Integer localStorageInGbs,
            Integer ocpus,
            Integer memoryInGBs,
            Double exadataStorageInTBs,
            java.util.List<CloudAutonomousVmClusterResourceDetails> cloudAutonomousVmClusters) {
        super();
        this.cloudExadataInfrastructureId = cloudExadataInfrastructureId;
        this.cloudExadataInfrastructureDisplayName = cloudExadataInfrastructureDisplayName;
        this.localStorageInGbs = localStorageInGbs;
        this.ocpus = ocpus;
        this.memoryInGBs = memoryInGBs;
        this.exadataStorageInTBs = exadataStorageInTBs;
        this.cloudAutonomousVmClusters = cloudAutonomousVmClusters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Cloud Exadata infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cloudExadataInfrastructureId")
        private String cloudExadataInfrastructureId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Cloud Exadata infrastructure.
         * @param cloudExadataInfrastructureId the value to set
         * @return this builder
         **/
        public Builder cloudExadataInfrastructureId(String cloudExadataInfrastructureId) {
            this.cloudExadataInfrastructureId = cloudExadataInfrastructureId;
            this.__explicitlySet__.add("cloudExadataInfrastructureId");
            return this;
        }
        /**
         * The user-friendly name for the Cloud Exadata infrastructure. The name does not need to be unique.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cloudExadataInfrastructureDisplayName")
        private String cloudExadataInfrastructureDisplayName;

        /**
         * The user-friendly name for the Cloud Exadata infrastructure. The name does not need to be unique.
         * @param cloudExadataInfrastructureDisplayName the value to set
         * @return this builder
         **/
        public Builder cloudExadataInfrastructureDisplayName(
                String cloudExadataInfrastructureDisplayName) {
            this.cloudExadataInfrastructureDisplayName = cloudExadataInfrastructureDisplayName;
            this.__explicitlySet__.add("cloudExadataInfrastructureDisplayName");
            return this;
        }
        /**
         * The minimum amount of unallocated storage available across all nodes in the infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("localStorageInGbs")
        private Integer localStorageInGbs;

        /**
         * The minimum amount of unallocated storage available across all nodes in the infrastructure.
         * @param localStorageInGbs the value to set
         * @return this builder
         **/
        public Builder localStorageInGbs(Integer localStorageInGbs) {
            this.localStorageInGbs = localStorageInGbs;
            this.__explicitlySet__.add("localStorageInGbs");
            return this;
        }
        /**
         * The minimum amount of unallocated ocpus available across all nodes in the infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
        private Integer ocpus;

        /**
         * The minimum amount of unallocated ocpus available across all nodes in the infrastructure.
         * @param ocpus the value to set
         * @return this builder
         **/
        public Builder ocpus(Integer ocpus) {
            this.ocpus = ocpus;
            this.__explicitlySet__.add("ocpus");
            return this;
        }
        /**
         * The minimum amount of unallocated memory available across all nodes in the infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
        private Integer memoryInGBs;

        /**
         * The minimum amount of unallocated memory available across all nodes in the infrastructure.
         * @param memoryInGBs the value to set
         * @return this builder
         **/
        public Builder memoryInGBs(Integer memoryInGBs) {
            this.memoryInGBs = memoryInGBs;
            this.__explicitlySet__.add("memoryInGBs");
            return this;
        }
        /**
         * Total unallocated exadata storage in the infrastructure in TBs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("exadataStorageInTBs")
        private Double exadataStorageInTBs;

        /**
         * Total unallocated exadata storage in the infrastructure in TBs.
         * @param exadataStorageInTBs the value to set
         * @return this builder
         **/
        public Builder exadataStorageInTBs(Double exadataStorageInTBs) {
            this.exadataStorageInTBs = exadataStorageInTBs;
            this.__explicitlySet__.add("exadataStorageInTBs");
            return this;
        }
        /**
         * The list of Cloud Autonomous VM Clusters on the Infrastructure and their associated unallocated resources details.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cloudAutonomousVmClusters")
        private java.util.List<CloudAutonomousVmClusterResourceDetails> cloudAutonomousVmClusters;

        /**
         * The list of Cloud Autonomous VM Clusters on the Infrastructure and their associated unallocated resources details.
         * @param cloudAutonomousVmClusters the value to set
         * @return this builder
         **/
        public Builder cloudAutonomousVmClusters(
                java.util.List<CloudAutonomousVmClusterResourceDetails> cloudAutonomousVmClusters) {
            this.cloudAutonomousVmClusters = cloudAutonomousVmClusters;
            this.__explicitlySet__.add("cloudAutonomousVmClusters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CloudExadataInfrastructureUnallocatedResources build() {
            CloudExadataInfrastructureUnallocatedResources model =
                    new CloudExadataInfrastructureUnallocatedResources(
                            this.cloudExadataInfrastructureId,
                            this.cloudExadataInfrastructureDisplayName,
                            this.localStorageInGbs,
                            this.ocpus,
                            this.memoryInGBs,
                            this.exadataStorageInTBs,
                            this.cloudAutonomousVmClusters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CloudExadataInfrastructureUnallocatedResources model) {
            if (model.wasPropertyExplicitlySet("cloudExadataInfrastructureId")) {
                this.cloudExadataInfrastructureId(model.getCloudExadataInfrastructureId());
            }
            if (model.wasPropertyExplicitlySet("cloudExadataInfrastructureDisplayName")) {
                this.cloudExadataInfrastructureDisplayName(
                        model.getCloudExadataInfrastructureDisplayName());
            }
            if (model.wasPropertyExplicitlySet("localStorageInGbs")) {
                this.localStorageInGbs(model.getLocalStorageInGbs());
            }
            if (model.wasPropertyExplicitlySet("ocpus")) {
                this.ocpus(model.getOcpus());
            }
            if (model.wasPropertyExplicitlySet("memoryInGBs")) {
                this.memoryInGBs(model.getMemoryInGBs());
            }
            if (model.wasPropertyExplicitlySet("exadataStorageInTBs")) {
                this.exadataStorageInTBs(model.getExadataStorageInTBs());
            }
            if (model.wasPropertyExplicitlySet("cloudAutonomousVmClusters")) {
                this.cloudAutonomousVmClusters(model.getCloudAutonomousVmClusters());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Cloud Exadata infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cloudExadataInfrastructureId")
    private final String cloudExadataInfrastructureId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Cloud Exadata infrastructure.
     * @return the value
     **/
    public String getCloudExadataInfrastructureId() {
        return cloudExadataInfrastructureId;
    }

    /**
     * The user-friendly name for the Cloud Exadata infrastructure. The name does not need to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cloudExadataInfrastructureDisplayName")
    private final String cloudExadataInfrastructureDisplayName;

    /**
     * The user-friendly name for the Cloud Exadata infrastructure. The name does not need to be unique.
     * @return the value
     **/
    public String getCloudExadataInfrastructureDisplayName() {
        return cloudExadataInfrastructureDisplayName;
    }

    /**
     * The minimum amount of unallocated storage available across all nodes in the infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("localStorageInGbs")
    private final Integer localStorageInGbs;

    /**
     * The minimum amount of unallocated storage available across all nodes in the infrastructure.
     * @return the value
     **/
    public Integer getLocalStorageInGbs() {
        return localStorageInGbs;
    }

    /**
     * The minimum amount of unallocated ocpus available across all nodes in the infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
    private final Integer ocpus;

    /**
     * The minimum amount of unallocated ocpus available across all nodes in the infrastructure.
     * @return the value
     **/
    public Integer getOcpus() {
        return ocpus;
    }

    /**
     * The minimum amount of unallocated memory available across all nodes in the infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
    private final Integer memoryInGBs;

    /**
     * The minimum amount of unallocated memory available across all nodes in the infrastructure.
     * @return the value
     **/
    public Integer getMemoryInGBs() {
        return memoryInGBs;
    }

    /**
     * Total unallocated exadata storage in the infrastructure in TBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exadataStorageInTBs")
    private final Double exadataStorageInTBs;

    /**
     * Total unallocated exadata storage in the infrastructure in TBs.
     * @return the value
     **/
    public Double getExadataStorageInTBs() {
        return exadataStorageInTBs;
    }

    /**
     * The list of Cloud Autonomous VM Clusters on the Infrastructure and their associated unallocated resources details.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cloudAutonomousVmClusters")
    private final java.util.List<CloudAutonomousVmClusterResourceDetails> cloudAutonomousVmClusters;

    /**
     * The list of Cloud Autonomous VM Clusters on the Infrastructure and their associated unallocated resources details.
     * @return the value
     **/
    public java.util.List<CloudAutonomousVmClusterResourceDetails> getCloudAutonomousVmClusters() {
        return cloudAutonomousVmClusters;
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
        sb.append("CloudExadataInfrastructureUnallocatedResources(");
        sb.append("super=").append(super.toString());
        sb.append("cloudExadataInfrastructureId=")
                .append(String.valueOf(this.cloudExadataInfrastructureId));
        sb.append(", cloudExadataInfrastructureDisplayName=")
                .append(String.valueOf(this.cloudExadataInfrastructureDisplayName));
        sb.append(", localStorageInGbs=").append(String.valueOf(this.localStorageInGbs));
        sb.append(", ocpus=").append(String.valueOf(this.ocpus));
        sb.append(", memoryInGBs=").append(String.valueOf(this.memoryInGBs));
        sb.append(", exadataStorageInTBs=").append(String.valueOf(this.exadataStorageInTBs));
        sb.append(", cloudAutonomousVmClusters=")
                .append(String.valueOf(this.cloudAutonomousVmClusters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CloudExadataInfrastructureUnallocatedResources)) {
            return false;
        }

        CloudExadataInfrastructureUnallocatedResources other =
                (CloudExadataInfrastructureUnallocatedResources) o;
        return java.util.Objects.equals(
                        this.cloudExadataInfrastructureId, other.cloudExadataInfrastructureId)
                && java.util.Objects.equals(
                        this.cloudExadataInfrastructureDisplayName,
                        other.cloudExadataInfrastructureDisplayName)
                && java.util.Objects.equals(this.localStorageInGbs, other.localStorageInGbs)
                && java.util.Objects.equals(this.ocpus, other.ocpus)
                && java.util.Objects.equals(this.memoryInGBs, other.memoryInGBs)
                && java.util.Objects.equals(this.exadataStorageInTBs, other.exadataStorageInTBs)
                && java.util.Objects.equals(
                        this.cloudAutonomousVmClusters, other.cloudAutonomousVmClusters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.cloudExadataInfrastructureId == null
                                ? 43
                                : this.cloudExadataInfrastructureId.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudExadataInfrastructureDisplayName == null
                                ? 43
                                : this.cloudExadataInfrastructureDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.localStorageInGbs == null ? 43 : this.localStorageInGbs.hashCode());
        result = (result * PRIME) + (this.ocpus == null ? 43 : this.ocpus.hashCode());
        result = (result * PRIME) + (this.memoryInGBs == null ? 43 : this.memoryInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.exadataStorageInTBs == null
                                ? 43
                                : this.exadataStorageInTBs.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudAutonomousVmClusters == null
                                ? 43
                                : this.cloudAutonomousVmClusters.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
