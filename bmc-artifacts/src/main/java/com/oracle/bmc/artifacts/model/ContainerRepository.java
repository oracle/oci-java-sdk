/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.artifacts.model;

/**
 * Container repository metadata.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ContainerRepository.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ContainerRepository {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("imageCount")
        private Integer imageCount;

        public Builder imageCount(Integer imageCount) {
            this.imageCount = imageCount;
            this.__explicitlySet__.add("imageCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isImmutable")
        private Boolean isImmutable;

        public Builder isImmutable(Boolean isImmutable) {
            this.isImmutable = isImmutable;
            this.__explicitlySet__.add("isImmutable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPublic")
        private Boolean isPublic;

        public Builder isPublic(Boolean isPublic) {
            this.isPublic = isPublic;
            this.__explicitlySet__.add("isPublic");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("layerCount")
        private Integer layerCount;

        public Builder layerCount(Integer layerCount) {
            this.layerCount = layerCount;
            this.__explicitlySet__.add("layerCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("layersSizeInBytes")
        private Long layersSizeInBytes;

        public Builder layersSizeInBytes(Long layersSizeInBytes) {
            this.layersSizeInBytes = layersSizeInBytes;
            this.__explicitlySet__.add("layersSizeInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

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

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLastPushed")
        private java.util.Date timeLastPushed;

        public Builder timeLastPushed(java.util.Date timeLastPushed) {
            this.timeLastPushed = timeLastPushed;
            this.__explicitlySet__.add("timeLastPushed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ContainerRepository build() {
            ContainerRepository __instance__ =
                    new ContainerRepository(
                            compartmentId,
                            createdBy,
                            displayName,
                            id,
                            imageCount,
                            isImmutable,
                            isPublic,
                            layerCount,
                            layersSizeInBytes,
                            lifecycleState,
                            readme,
                            timeCreated,
                            timeLastPushed);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContainerRepository o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .createdBy(o.getCreatedBy())
                            .displayName(o.getDisplayName())
                            .id(o.getId())
                            .imageCount(o.getImageCount())
                            .isImmutable(o.getIsImmutable())
                            .isPublic(o.getIsPublic())
                            .layerCount(o.getLayerCount())
                            .layersSizeInBytes(o.getLayersSizeInBytes())
                            .lifecycleState(o.getLifecycleState())
                            .readme(o.getReadme())
                            .timeCreated(o.getTimeCreated())
                            .timeLastPushed(o.getTimeLastPushed());

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

    /**
     * The OCID of the compartment in which the container repository exists.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The id of the user or principal that created the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    String createdBy;

    /**
     * The container repository name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the container repository.
     * <p>
     * Example: `ocid1.containerrepo.oc1..exampleuniqueID`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Total number of images.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageCount")
    Integer imageCount;

    /**
     * Whether the repository is immutable. Images cannot be overwritten in an immutable repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isImmutable")
    Boolean isImmutable;

    /**
     * Whether the repository is public. A public repository allows unauthenticated access.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPublic")
    Boolean isPublic;

    /**
     * Total number of layers.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("layerCount")
    Integer layerCount;

    /**
     * Total storage in bytes consumed by layers.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("layersSizeInBytes")
    Long layersSizeInBytes;
    /**
     * The current state of the container repository.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Available("AVAILABLE"),
        Deleting("DELETING"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * The current state of the container repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    @com.fasterxml.jackson.annotation.JsonProperty("readme")
    ContainerRepositoryReadme readme;

    /**
     * An RFC 3339 timestamp indicating when the repository was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * An RFC 3339 timestamp indicating when an image was last pushed to the repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastPushed")
    java.util.Date timeLastPushed;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
