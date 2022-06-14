/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ScaleBlockchainPlatformDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ScaleBlockchainPlatformDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "addOsns",
        "addReplicas",
        "addPeers",
        "addStorage",
        "modifyPeers",
        "removeReplicas",
        "removeOsns",
        "removePeers"
    })
    public ScaleBlockchainPlatformDetails(
            java.util.List<CreateOsnDetails> addOsns,
            ReplicaDetails addReplicas,
            java.util.List<CreatePeerDetails> addPeers,
            ScaleStorageDetails addStorage,
            java.util.List<ModifyPeerDetails> modifyPeers,
            ReplicaDetails removeReplicas,
            java.util.List<String> removeOsns,
            java.util.List<String> removePeers) {
        super();
        this.addOsns = addOsns;
        this.addReplicas = addReplicas;
        this.addPeers = addPeers;
        this.addStorage = addStorage;
        this.modifyPeers = modifyPeers;
        this.removeReplicas = removeReplicas;
        this.removeOsns = removeOsns;
        this.removePeers = removePeers;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * new OSNs to add
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("addOsns")
        private java.util.List<CreateOsnDetails> addOsns;

        /**
         * new OSNs to add
         * @param addOsns the value to set
         * @return this builder
         **/
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
        /**
         * new Peers to add
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("addPeers")
        private java.util.List<CreatePeerDetails> addPeers;

        /**
         * new Peers to add
         * @param addPeers the value to set
         * @return this builder
         **/
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
        /**
         * modify ocpu allocation to existing Peers
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modifyPeers")
        private java.util.List<ModifyPeerDetails> modifyPeers;

        /**
         * modify ocpu allocation to existing Peers
         * @param modifyPeers the value to set
         * @return this builder
         **/
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
        /**
         * OSN id list to remove
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("removeOsns")
        private java.util.List<String> removeOsns;

        /**
         * OSN id list to remove
         * @param removeOsns the value to set
         * @return this builder
         **/
        public Builder removeOsns(java.util.List<String> removeOsns) {
            this.removeOsns = removeOsns;
            this.__explicitlySet__.add("removeOsns");
            return this;
        }
        /**
         * Peer id list to remove
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("removePeers")
        private java.util.List<String> removePeers;

        /**
         * Peer id list to remove
         * @param removePeers the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * new OSNs to add
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addOsns")
    private final java.util.List<CreateOsnDetails> addOsns;

    /**
     * new OSNs to add
     * @return the value
     **/
    public java.util.List<CreateOsnDetails> getAddOsns() {
        return addOsns;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("addReplicas")
    private final ReplicaDetails addReplicas;

    public ReplicaDetails getAddReplicas() {
        return addReplicas;
    }

    /**
     * new Peers to add
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addPeers")
    private final java.util.List<CreatePeerDetails> addPeers;

    /**
     * new Peers to add
     * @return the value
     **/
    public java.util.List<CreatePeerDetails> getAddPeers() {
        return addPeers;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("addStorage")
    private final ScaleStorageDetails addStorage;

    public ScaleStorageDetails getAddStorage() {
        return addStorage;
    }

    /**
     * modify ocpu allocation to existing Peers
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modifyPeers")
    private final java.util.List<ModifyPeerDetails> modifyPeers;

    /**
     * modify ocpu allocation to existing Peers
     * @return the value
     **/
    public java.util.List<ModifyPeerDetails> getModifyPeers() {
        return modifyPeers;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("removeReplicas")
    private final ReplicaDetails removeReplicas;

    public ReplicaDetails getRemoveReplicas() {
        return removeReplicas;
    }

    /**
     * OSN id list to remove
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("removeOsns")
    private final java.util.List<String> removeOsns;

    /**
     * OSN id list to remove
     * @return the value
     **/
    public java.util.List<String> getRemoveOsns() {
        return removeOsns;
    }

    /**
     * Peer id list to remove
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("removePeers")
    private final java.util.List<String> removePeers;

    /**
     * Peer id list to remove
     * @return the value
     **/
    public java.util.List<String> getRemovePeers() {
        return removePeers;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ScaleBlockchainPlatformDetails(");
        sb.append("addOsns=").append(String.valueOf(this.addOsns));
        sb.append(", addReplicas=").append(String.valueOf(this.addReplicas));
        sb.append(", addPeers=").append(String.valueOf(this.addPeers));
        sb.append(", addStorage=").append(String.valueOf(this.addStorage));
        sb.append(", modifyPeers=").append(String.valueOf(this.modifyPeers));
        sb.append(", removeReplicas=").append(String.valueOf(this.removeReplicas));
        sb.append(", removeOsns=").append(String.valueOf(this.removeOsns));
        sb.append(", removePeers=").append(String.valueOf(this.removePeers));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScaleBlockchainPlatformDetails)) {
            return false;
        }

        ScaleBlockchainPlatformDetails other = (ScaleBlockchainPlatformDetails) o;
        return java.util.Objects.equals(this.addOsns, other.addOsns)
                && java.util.Objects.equals(this.addReplicas, other.addReplicas)
                && java.util.Objects.equals(this.addPeers, other.addPeers)
                && java.util.Objects.equals(this.addStorage, other.addStorage)
                && java.util.Objects.equals(this.modifyPeers, other.modifyPeers)
                && java.util.Objects.equals(this.removeReplicas, other.removeReplicas)
                && java.util.Objects.equals(this.removeOsns, other.removeOsns)
                && java.util.Objects.equals(this.removePeers, other.removePeers)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.addOsns == null ? 43 : this.addOsns.hashCode());
        result = (result * PRIME) + (this.addReplicas == null ? 43 : this.addReplicas.hashCode());
        result = (result * PRIME) + (this.addPeers == null ? 43 : this.addPeers.hashCode());
        result = (result * PRIME) + (this.addStorage == null ? 43 : this.addStorage.hashCode());
        result = (result * PRIME) + (this.modifyPeers == null ? 43 : this.modifyPeers.hashCode());
        result =
                (result * PRIME)
                        + (this.removeReplicas == null ? 43 : this.removeReplicas.hashCode());
        result = (result * PRIME) + (this.removeOsns == null ? 43 : this.removeOsns.hashCode());
        result = (result * PRIME) + (this.removePeers == null ? 43 : this.removePeers.hashCode());
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
