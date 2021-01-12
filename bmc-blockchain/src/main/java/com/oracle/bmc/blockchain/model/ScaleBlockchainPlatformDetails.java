/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * Scale operation details for a blockchain platform. The scale operation payload has multiple options
 * - Add one or more Ordering Service Node (addOsns)
 * - Add one or more Peers (addPeers)
 * - Add more replicas of CA, Console and Rest Proxy (addReplicas)
 * - Add more storage to the platform (addStorage)
 * - Modify the CPU allocation for Peer Nodes (modifyPeers)
 * - Remove one or more replicas of CA, Console and Rest Proxy (removeReplicas)
 * - Remove one or more Ordering Service Node (removeOsns)
 * - Remove one or more Peers (removePeers).
 * The scale operation payload must have at least one of the above options.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ScaleBlockchainPlatformDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ScaleBlockchainPlatformDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("addOsns")
        private java.util.List<CreateOsnDetails> addOsns;

        public Builder addOsns(java.util.List<CreateOsnDetails> addOsns) {
            this.addOsns = addOsns;
            this.__explicitlySet__.add("addOsns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("addReplicas")
        private ReplicaDetails addReplicas;

        public Builder addReplicas(ReplicaDetails addReplicas) {
            this.addReplicas = addReplicas;
            this.__explicitlySet__.add("addReplicas");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("addPeers")
        private java.util.List<CreatePeerDetails> addPeers;

        public Builder addPeers(java.util.List<CreatePeerDetails> addPeers) {
            this.addPeers = addPeers;
            this.__explicitlySet__.add("addPeers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("addStorage")
        private ScaleStorageDetails addStorage;

        public Builder addStorage(ScaleStorageDetails addStorage) {
            this.addStorage = addStorage;
            this.__explicitlySet__.add("addStorage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modifyPeers")
        private java.util.List<ModifyPeerDetails> modifyPeers;

        public Builder modifyPeers(java.util.List<ModifyPeerDetails> modifyPeers) {
            this.modifyPeers = modifyPeers;
            this.__explicitlySet__.add("modifyPeers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("removeReplicas")
        private ReplicaDetails removeReplicas;

        public Builder removeReplicas(ReplicaDetails removeReplicas) {
            this.removeReplicas = removeReplicas;
            this.__explicitlySet__.add("removeReplicas");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("removeOsns")
        private java.util.List<String> removeOsns;

        public Builder removeOsns(java.util.List<String> removeOsns) {
            this.removeOsns = removeOsns;
            this.__explicitlySet__.add("removeOsns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("removePeers")
        private java.util.List<String> removePeers;

        public Builder removePeers(java.util.List<String> removePeers) {
            this.removePeers = removePeers;
            this.__explicitlySet__.add("removePeers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScaleBlockchainPlatformDetails build() {
            ScaleBlockchainPlatformDetails __instance__ =
                    new ScaleBlockchainPlatformDetails(
                            addOsns,
                            addReplicas,
                            addPeers,
                            addStorage,
                            modifyPeers,
                            removeReplicas,
                            removeOsns,
                            removePeers);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScaleBlockchainPlatformDetails o) {
            Builder copiedBuilder =
                    addOsns(o.getAddOsns())
                            .addReplicas(o.getAddReplicas())
                            .addPeers(o.getAddPeers())
                            .addStorage(o.getAddStorage())
                            .modifyPeers(o.getModifyPeers())
                            .removeReplicas(o.getRemoveReplicas())
                            .removeOsns(o.getRemoveOsns())
                            .removePeers(o.getRemovePeers());

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
     * new OSNs to add
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addOsns")
    java.util.List<CreateOsnDetails> addOsns;

    @com.fasterxml.jackson.annotation.JsonProperty("addReplicas")
    ReplicaDetails addReplicas;

    /**
     * new Peers to add
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addPeers")
    java.util.List<CreatePeerDetails> addPeers;

    @com.fasterxml.jackson.annotation.JsonProperty("addStorage")
    ScaleStorageDetails addStorage;

    /**
     * modify ocpu allocation to existing Peers
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modifyPeers")
    java.util.List<ModifyPeerDetails> modifyPeers;

    @com.fasterxml.jackson.annotation.JsonProperty("removeReplicas")
    ReplicaDetails removeReplicas;

    /**
     * OSN id list to remove
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("removeOsns")
    java.util.List<String> removeOsns;

    /**
     * Peer id list to remove
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("removePeers")
    java.util.List<String> removePeers;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
