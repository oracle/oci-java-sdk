/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.artifacts.model;

/**
 * Container repository summary. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ContainerRepositorySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ContainerRepositorySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "id",
        "imageCount",
        "isPublic",
        "layerCount",
        "layersSizeInBytes",
        "lifecycleState",
        "timeCreated",
        "billableSizeInGBs"
    })
    public ContainerRepositorySummary(
            String compartmentId,
            String displayName,
            String id,
            Integer imageCount,
            Boolean isPublic,
            Integer layerCount,
            Long layersSizeInBytes,
            ContainerRepository.LifecycleState lifecycleState,
            java.util.Date timeCreated,
            Long billableSizeInGBs) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.id = id;
        this.imageCount = imageCount;
        this.isPublic = isPublic;
        this.layerCount = layerCount;
        this.layersSizeInBytes = layersSizeInBytes;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.billableSizeInGBs = billableSizeInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the compartment in which the container repository exists. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment in which the container repository exists.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The container repository name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The container repository name.
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
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the container repository.
         *
         * <p>Example: {@code ocid1.containerrepo.oc1..exampleuniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the container repository.
         *
         * <p>Example: {@code ocid1.containerrepo.oc1..exampleuniqueID}
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Total number of images. */
        @com.fasterxml.jackson.annotation.JsonProperty("imageCount")
        private Integer imageCount;

        /**
         * Total number of images.
         *
         * @param imageCount the value to set
         * @return this builder
         */
        public Builder imageCount(Integer imageCount) {
            this.imageCount = imageCount;
            this.__explicitlySet__.add("imageCount");
            return this;
        }
        /** Whether the repository is public. A public repository allows unauthenticated access. */
        @com.fasterxml.jackson.annotation.JsonProperty("isPublic")
        private Boolean isPublic;

        /**
         * Whether the repository is public. A public repository allows unauthenticated access.
         *
         * @param isPublic the value to set
         * @return this builder
         */
        public Builder isPublic(Boolean isPublic) {
            this.isPublic = isPublic;
            this.__explicitlySet__.add("isPublic");
            return this;
        }
        /** Total number of layers. */
        @com.fasterxml.jackson.annotation.JsonProperty("layerCount")
        private Integer layerCount;

        /**
         * Total number of layers.
         *
         * @param layerCount the value to set
         * @return this builder
         */
        public Builder layerCount(Integer layerCount) {
            this.layerCount = layerCount;
            this.__explicitlySet__.add("layerCount");
            return this;
        }
        /** Total storage in bytes consumed by layers. */
        @com.fasterxml.jackson.annotation.JsonProperty("layersSizeInBytes")
        private Long layersSizeInBytes;

        /**
         * Total storage in bytes consumed by layers.
         *
         * @param layersSizeInBytes the value to set
         * @return this builder
         */
        public Builder layersSizeInBytes(Long layersSizeInBytes) {
            this.layersSizeInBytes = layersSizeInBytes;
            this.__explicitlySet__.add("layersSizeInBytes");
            return this;
        }
        /** The current state of the container repository. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ContainerRepository.LifecycleState lifecycleState;

        /**
         * The current state of the container repository.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(ContainerRepository.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** An RFC 3339 timestamp indicating when the repository was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * An RFC 3339 timestamp indicating when the repository was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** Total storage size in GBs that will be charged. */
        @com.fasterxml.jackson.annotation.JsonProperty("billableSizeInGBs")
        private Long billableSizeInGBs;

        /**
         * Total storage size in GBs that will be charged.
         *
         * @param billableSizeInGBs the value to set
         * @return this builder
         */
        public Builder billableSizeInGBs(Long billableSizeInGBs) {
            this.billableSizeInGBs = billableSizeInGBs;
            this.__explicitlySet__.add("billableSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ContainerRepositorySummary build() {
            ContainerRepositorySummary model =
                    new ContainerRepositorySummary(
                            this.compartmentId,
                            this.displayName,
                            this.id,
                            this.imageCount,
                            this.isPublic,
                            this.layerCount,
                            this.layersSizeInBytes,
                            this.lifecycleState,
                            this.timeCreated,
                            this.billableSizeInGBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContainerRepositorySummary model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("imageCount")) {
                this.imageCount(model.getImageCount());
            }
            if (model.wasPropertyExplicitlySet("isPublic")) {
                this.isPublic(model.getIsPublic());
            }
            if (model.wasPropertyExplicitlySet("layerCount")) {
                this.layerCount(model.getLayerCount());
            }
            if (model.wasPropertyExplicitlySet("layersSizeInBytes")) {
                this.layersSizeInBytes(model.getLayersSizeInBytes());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("billableSizeInGBs")) {
                this.billableSizeInGBs(model.getBillableSizeInGBs());
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

    /** The OCID of the compartment in which the container repository exists. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment in which the container repository exists.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The container repository name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The container repository name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the container repository.
     *
     * <p>Example: {@code ocid1.containerrepo.oc1..exampleuniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the container repository.
     *
     * <p>Example: {@code ocid1.containerrepo.oc1..exampleuniqueID}
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Total number of images. */
    @com.fasterxml.jackson.annotation.JsonProperty("imageCount")
    private final Integer imageCount;

    /**
     * Total number of images.
     *
     * @return the value
     */
    public Integer getImageCount() {
        return imageCount;
    }

    /** Whether the repository is public. A public repository allows unauthenticated access. */
    @com.fasterxml.jackson.annotation.JsonProperty("isPublic")
    private final Boolean isPublic;

    /**
     * Whether the repository is public. A public repository allows unauthenticated access.
     *
     * @return the value
     */
    public Boolean getIsPublic() {
        return isPublic;
    }

    /** Total number of layers. */
    @com.fasterxml.jackson.annotation.JsonProperty("layerCount")
    private final Integer layerCount;

    /**
     * Total number of layers.
     *
     * @return the value
     */
    public Integer getLayerCount() {
        return layerCount;
    }

    /** Total storage in bytes consumed by layers. */
    @com.fasterxml.jackson.annotation.JsonProperty("layersSizeInBytes")
    private final Long layersSizeInBytes;

    /**
     * Total storage in bytes consumed by layers.
     *
     * @return the value
     */
    public Long getLayersSizeInBytes() {
        return layersSizeInBytes;
    }

    /** The current state of the container repository. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ContainerRepository.LifecycleState lifecycleState;

    /**
     * The current state of the container repository.
     *
     * @return the value
     */
    public ContainerRepository.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** An RFC 3339 timestamp indicating when the repository was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * An RFC 3339 timestamp indicating when the repository was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** Total storage size in GBs that will be charged. */
    @com.fasterxml.jackson.annotation.JsonProperty("billableSizeInGBs")
    private final Long billableSizeInGBs;

    /**
     * Total storage size in GBs that will be charged.
     *
     * @return the value
     */
    public Long getBillableSizeInGBs() {
        return billableSizeInGBs;
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
        sb.append("ContainerRepositorySummary(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", imageCount=").append(String.valueOf(this.imageCount));
        sb.append(", isPublic=").append(String.valueOf(this.isPublic));
        sb.append(", layerCount=").append(String.valueOf(this.layerCount));
        sb.append(", layersSizeInBytes=").append(String.valueOf(this.layersSizeInBytes));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", billableSizeInGBs=").append(String.valueOf(this.billableSizeInGBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContainerRepositorySummary)) {
            return false;
        }

        ContainerRepositorySummary other = (ContainerRepositorySummary) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.imageCount, other.imageCount)
                && java.util.Objects.equals(this.isPublic, other.isPublic)
                && java.util.Objects.equals(this.layerCount, other.layerCount)
                && java.util.Objects.equals(this.layersSizeInBytes, other.layersSizeInBytes)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.billableSizeInGBs, other.billableSizeInGBs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.imageCount == null ? 43 : this.imageCount.hashCode());
        result = (result * PRIME) + (this.isPublic == null ? 43 : this.isPublic.hashCode());
        result = (result * PRIME) + (this.layerCount == null ? 43 : this.layerCount.hashCode());
        result =
                (result * PRIME)
                        + (this.layersSizeInBytes == null ? 43 : this.layersSizeInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.billableSizeInGBs == null ? 43 : this.billableSizeInGBs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
