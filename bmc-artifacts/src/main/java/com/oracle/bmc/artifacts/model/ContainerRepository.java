/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.artifacts.model;

/**
 * Container repository metadata. <br>
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
        builder = ContainerRepository.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ContainerRepository
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "createdBy",
        "displayName",
        "id",
        "imageCount",
        "isImmutable",
        "isPublic",
        "layerCount",
        "layersSizeInBytes",
        "lifecycleState",
        "readme",
        "timeCreated",
        "timeLastPushed",
        "billableSizeInGBs"
    })
    public ContainerRepository(
            String compartmentId,
            String createdBy,
            String displayName,
            String id,
            Integer imageCount,
            Boolean isImmutable,
            Boolean isPublic,
            Integer layerCount,
            Long layersSizeInBytes,
            LifecycleState lifecycleState,
            ContainerRepositoryReadme readme,
            java.util.Date timeCreated,
            java.util.Date timeLastPushed,
            Long billableSizeInGBs) {
        super();
        this.compartmentId = compartmentId;
        this.createdBy = createdBy;
        this.displayName = displayName;
        this.id = id;
        this.imageCount = imageCount;
        this.isImmutable = isImmutable;
        this.isPublic = isPublic;
        this.layerCount = layerCount;
        this.layersSizeInBytes = layersSizeInBytes;
        this.lifecycleState = lifecycleState;
        this.readme = readme;
        this.timeCreated = timeCreated;
        this.timeLastPushed = timeLastPushed;
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
        /** The id of the user or principal that created the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        /**
         * The id of the user or principal that created the resource.
         *
         * @param createdBy the value to set
         * @return this builder
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
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
        /**
         * Whether the repository is immutable. Images cannot be overwritten in an immutable
         * repository.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isImmutable")
        private Boolean isImmutable;

        /**
         * Whether the repository is immutable. Images cannot be overwritten in an immutable
         * repository.
         *
         * @param isImmutable the value to set
         * @return this builder
         */
        public Builder isImmutable(Boolean isImmutable) {
            this.isImmutable = isImmutable;
            this.__explicitlySet__.add("isImmutable");
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
        private LifecycleState lifecycleState;

        /**
         * The current state of the container repository.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("readme")
        private ContainerRepositoryReadme readme;

        public Builder readme(ContainerRepositoryReadme readme) {
            this.readme = readme;
            this.__explicitlySet__.add("readme");
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
        /** An RFC 3339 timestamp indicating when an image was last pushed to the repository. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastPushed")
        private java.util.Date timeLastPushed;

        /**
         * An RFC 3339 timestamp indicating when an image was last pushed to the repository.
         *
         * @param timeLastPushed the value to set
         * @return this builder
         */
        public Builder timeLastPushed(java.util.Date timeLastPushed) {
            this.timeLastPushed = timeLastPushed;
            this.__explicitlySet__.add("timeLastPushed");
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

        public ContainerRepository build() {
            ContainerRepository model =
                    new ContainerRepository(
                            this.compartmentId,
                            this.createdBy,
                            this.displayName,
                            this.id,
                            this.imageCount,
                            this.isImmutable,
                            this.isPublic,
                            this.layerCount,
                            this.layersSizeInBytes,
                            this.lifecycleState,
                            this.readme,
                            this.timeCreated,
                            this.timeLastPushed,
                            this.billableSizeInGBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContainerRepository model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
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
            if (model.wasPropertyExplicitlySet("isImmutable")) {
                this.isImmutable(model.getIsImmutable());
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
            if (model.wasPropertyExplicitlySet("readme")) {
                this.readme(model.getReadme());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeLastPushed")) {
                this.timeLastPushed(model.getTimeLastPushed());
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

    /** The id of the user or principal that created the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    /**
     * The id of the user or principal that created the resource.
     *
     * @return the value
     */
    public String getCreatedBy() {
        return createdBy;
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

    /**
     * Whether the repository is immutable. Images cannot be overwritten in an immutable repository.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isImmutable")
    private final Boolean isImmutable;

    /**
     * Whether the repository is immutable. Images cannot be overwritten in an immutable repository.
     *
     * @return the value
     */
    public Boolean getIsImmutable() {
        return isImmutable;
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
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Available("AVAILABLE"),
        Deleting("DELETING"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the container repository. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the container repository.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("readme")
    private final ContainerRepositoryReadme readme;

    public ContainerRepositoryReadme getReadme() {
        return readme;
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

    /** An RFC 3339 timestamp indicating when an image was last pushed to the repository. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastPushed")
    private final java.util.Date timeLastPushed;

    /**
     * An RFC 3339 timestamp indicating when an image was last pushed to the repository.
     *
     * @return the value
     */
    public java.util.Date getTimeLastPushed() {
        return timeLastPushed;
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
        sb.append("ContainerRepository(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", imageCount=").append(String.valueOf(this.imageCount));
        sb.append(", isImmutable=").append(String.valueOf(this.isImmutable));
        sb.append(", isPublic=").append(String.valueOf(this.isPublic));
        sb.append(", layerCount=").append(String.valueOf(this.layerCount));
        sb.append(", layersSizeInBytes=").append(String.valueOf(this.layersSizeInBytes));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", readme=").append(String.valueOf(this.readme));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeLastPushed=").append(String.valueOf(this.timeLastPushed));
        sb.append(", billableSizeInGBs=").append(String.valueOf(this.billableSizeInGBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContainerRepository)) {
            return false;
        }

        ContainerRepository other = (ContainerRepository) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.imageCount, other.imageCount)
                && java.util.Objects.equals(this.isImmutable, other.isImmutable)
                && java.util.Objects.equals(this.isPublic, other.isPublic)
                && java.util.Objects.equals(this.layerCount, other.layerCount)
                && java.util.Objects.equals(this.layersSizeInBytes, other.layersSizeInBytes)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.readme, other.readme)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeLastPushed, other.timeLastPushed)
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
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.imageCount == null ? 43 : this.imageCount.hashCode());
        result = (result * PRIME) + (this.isImmutable == null ? 43 : this.isImmutable.hashCode());
        result = (result * PRIME) + (this.isPublic == null ? 43 : this.isPublic.hashCode());
        result = (result * PRIME) + (this.layerCount == null ? 43 : this.layerCount.hashCode());
        result =
                (result * PRIME)
                        + (this.layersSizeInBytes == null ? 43 : this.layersSizeInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.readme == null ? 43 : this.readme.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastPushed == null ? 43 : this.timeLastPushed.hashCode());
        result =
                (result * PRIME)
                        + (this.billableSizeInGBs == null ? 43 : this.billableSizeInGBs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
