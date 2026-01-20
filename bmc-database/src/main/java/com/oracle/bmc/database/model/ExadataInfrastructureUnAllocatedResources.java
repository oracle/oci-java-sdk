/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Un allocated resources details of the Exadata Cloud@Customer infrastructure. Applies to Exadata
 * Cloud@Customer instances only. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExadataInfrastructureUnAllocatedResources.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExadataInfrastructureUnAllocatedResources
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "localStorageInGbs",
        "ocpus",
        "memoryInGBs",
        "exadataStorageInTBs",
        "autonomousVmClusters"
    })
    public ExadataInfrastructureUnAllocatedResources(
            String id,
            String displayName,
            Integer localStorageInGbs,
            Integer ocpus,
            Integer memoryInGBs,
            Double exadataStorageInTBs,
            java.util.List<AutonomousVmClusterResourceDetails> autonomousVmClusters) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.localStorageInGbs = localStorageInGbs;
        this.ocpus = ocpus;
        this.memoryInGBs = memoryInGBs;
        this.exadataStorageInTBs = exadataStorageInTBs;
        this.autonomousVmClusters = autonomousVmClusters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Exadata infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Exadata infrastructure.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The user-friendly name for the Exadata Cloud@Customer infrastructure. The name does not
         * need to be unique.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the Exadata Cloud@Customer infrastructure. The name does not
         * need to be unique.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The minimum amount of un allocated storage that is available across all nodes in the
         * infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("localStorageInGbs")
        private Integer localStorageInGbs;

        /**
         * The minimum amount of un allocated storage that is available across all nodes in the
         * infrastructure.
         *
         * @param localStorageInGbs the value to set
         * @return this builder
         */
        public Builder localStorageInGbs(Integer localStorageInGbs) {
            this.localStorageInGbs = localStorageInGbs;
            this.__explicitlySet__.add("localStorageInGbs");
            return this;
        }
        /**
         * The minimum amount of un allocated ocpus that is available across all nodes in the
         * infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
        private Integer ocpus;

        /**
         * The minimum amount of un allocated ocpus that is available across all nodes in the
         * infrastructure.
         *
         * @param ocpus the value to set
         * @return this builder
         */
        public Builder ocpus(Integer ocpus) {
            this.ocpus = ocpus;
            this.__explicitlySet__.add("ocpus");
            return this;
        }
        /**
         * The minimum amount of un allocated memory that is available across all nodes in the
         * infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
        private Integer memoryInGBs;

        /**
         * The minimum amount of un allocated memory that is available across all nodes in the
         * infrastructure.
         *
         * @param memoryInGBs the value to set
         * @return this builder
         */
        public Builder memoryInGBs(Integer memoryInGBs) {
            this.memoryInGBs = memoryInGBs;
            this.__explicitlySet__.add("memoryInGBs");
            return this;
        }
        /** Total unallocated exadata storage in the infrastructure in TBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("exadataStorageInTBs")
        private Double exadataStorageInTBs;

        /**
         * Total unallocated exadata storage in the infrastructure in TBs.
         *
         * @param exadataStorageInTBs the value to set
         * @return this builder
         */
        public Builder exadataStorageInTBs(Double exadataStorageInTBs) {
            this.exadataStorageInTBs = exadataStorageInTBs;
            this.__explicitlySet__.add("exadataStorageInTBs");
            return this;
        }
        /**
         * The list of Autonomous VM Clusters on the Infra and their associated unallocated
         * resources details
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousVmClusters")
        private java.util.List<AutonomousVmClusterResourceDetails> autonomousVmClusters;

        /**
         * The list of Autonomous VM Clusters on the Infra and their associated unallocated
         * resources details
         *
         * @param autonomousVmClusters the value to set
         * @return this builder
         */
        public Builder autonomousVmClusters(
                java.util.List<AutonomousVmClusterResourceDetails> autonomousVmClusters) {
            this.autonomousVmClusters = autonomousVmClusters;
            this.__explicitlySet__.add("autonomousVmClusters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExadataInfrastructureUnAllocatedResources build() {
            ExadataInfrastructureUnAllocatedResources model =
                    new ExadataInfrastructureUnAllocatedResources(
                            this.id,
                            this.displayName,
                            this.localStorageInGbs,
                            this.ocpus,
                            this.memoryInGBs,
                            this.exadataStorageInTBs,
                            this.autonomousVmClusters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExadataInfrastructureUnAllocatedResources model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
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
            if (model.wasPropertyExplicitlySet("autonomousVmClusters")) {
                this.autonomousVmClusters(model.getAutonomousVmClusters());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Exadata infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Exadata infrastructure.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The user-friendly name for the Exadata Cloud@Customer infrastructure. The name does not need
     * to be unique.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the Exadata Cloud@Customer infrastructure. The name does not need
     * to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The minimum amount of un allocated storage that is available across all nodes in the
     * infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("localStorageInGbs")
    private final Integer localStorageInGbs;

    /**
     * The minimum amount of un allocated storage that is available across all nodes in the
     * infrastructure.
     *
     * @return the value
     */
    public Integer getLocalStorageInGbs() {
        return localStorageInGbs;
    }

    /**
     * The minimum amount of un allocated ocpus that is available across all nodes in the
     * infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
    private final Integer ocpus;

    /**
     * The minimum amount of un allocated ocpus that is available across all nodes in the
     * infrastructure.
     *
     * @return the value
     */
    public Integer getOcpus() {
        return ocpus;
    }

    /**
     * The minimum amount of un allocated memory that is available across all nodes in the
     * infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
    private final Integer memoryInGBs;

    /**
     * The minimum amount of un allocated memory that is available across all nodes in the
     * infrastructure.
     *
     * @return the value
     */
    public Integer getMemoryInGBs() {
        return memoryInGBs;
    }

    /** Total unallocated exadata storage in the infrastructure in TBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("exadataStorageInTBs")
    private final Double exadataStorageInTBs;

    /**
     * Total unallocated exadata storage in the infrastructure in TBs.
     *
     * @return the value
     */
    public Double getExadataStorageInTBs() {
        return exadataStorageInTBs;
    }

    /**
     * The list of Autonomous VM Clusters on the Infra and their associated unallocated resources
     * details
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousVmClusters")
    private final java.util.List<AutonomousVmClusterResourceDetails> autonomousVmClusters;

    /**
     * The list of Autonomous VM Clusters on the Infra and their associated unallocated resources
     * details
     *
     * @return the value
     */
    public java.util.List<AutonomousVmClusterResourceDetails> getAutonomousVmClusters() {
        return autonomousVmClusters;
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
        sb.append("ExadataInfrastructureUnAllocatedResources(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", localStorageInGbs=").append(String.valueOf(this.localStorageInGbs));
        sb.append(", ocpus=").append(String.valueOf(this.ocpus));
        sb.append(", memoryInGBs=").append(String.valueOf(this.memoryInGBs));
        sb.append(", exadataStorageInTBs=").append(String.valueOf(this.exadataStorageInTBs));
        sb.append(", autonomousVmClusters=").append(String.valueOf(this.autonomousVmClusters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExadataInfrastructureUnAllocatedResources)) {
            return false;
        }

        ExadataInfrastructureUnAllocatedResources other =
                (ExadataInfrastructureUnAllocatedResources) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.localStorageInGbs, other.localStorageInGbs)
                && java.util.Objects.equals(this.ocpus, other.ocpus)
                && java.util.Objects.equals(this.memoryInGBs, other.memoryInGBs)
                && java.util.Objects.equals(this.exadataStorageInTBs, other.exadataStorageInTBs)
                && java.util.Objects.equals(this.autonomousVmClusters, other.autonomousVmClusters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
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
                        + (this.autonomousVmClusters == null
                                ? 43
                                : this.autonomousVmClusters.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
