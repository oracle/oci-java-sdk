/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabasev26.model;

/**
 * Details required to create a distributed autonomous database catalog. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateAutonomousCatalogDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateAutonomousCatalogDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"originalReplica", "dataGuardReplicas"})
    public CreateAutonomousCatalogDetails(
            CreateAutonomousCatalogReplicaDetails originalReplica,
            java.util.List<CreateAutonomousCatalogReplicaDetails> dataGuardReplicas) {
        super();
        this.originalReplica = originalReplica;
        this.dataGuardReplicas = dataGuardReplicas;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("originalReplica")
        private CreateAutonomousCatalogReplicaDetails originalReplica;

        public Builder originalReplica(CreateAutonomousCatalogReplicaDetails originalReplica) {
            this.originalReplica = originalReplica;
            this.__explicitlySet__.add("originalReplica");
            return this;
        }
        /** Details required to create data guard replicas for the catalog. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataGuardReplicas")
        private java.util.List<CreateAutonomousCatalogReplicaDetails> dataGuardReplicas;

        /**
         * Details required to create data guard replicas for the catalog.
         *
         * @param dataGuardReplicas the value to set
         * @return this builder
         */
        public Builder dataGuardReplicas(
                java.util.List<CreateAutonomousCatalogReplicaDetails> dataGuardReplicas) {
            this.dataGuardReplicas = dataGuardReplicas;
            this.__explicitlySet__.add("dataGuardReplicas");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateAutonomousCatalogDetails build() {
            CreateAutonomousCatalogDetails model =
                    new CreateAutonomousCatalogDetails(
                            this.originalReplica, this.dataGuardReplicas);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAutonomousCatalogDetails model) {
            if (model.wasPropertyExplicitlySet("originalReplica")) {
                this.originalReplica(model.getOriginalReplica());
            }
            if (model.wasPropertyExplicitlySet("dataGuardReplicas")) {
                this.dataGuardReplicas(model.getDataGuardReplicas());
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

    @com.fasterxml.jackson.annotation.JsonProperty("originalReplica")
    private final CreateAutonomousCatalogReplicaDetails originalReplica;

    public CreateAutonomousCatalogReplicaDetails getOriginalReplica() {
        return originalReplica;
    }

    /** Details required to create data guard replicas for the catalog. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataGuardReplicas")
    private final java.util.List<CreateAutonomousCatalogReplicaDetails> dataGuardReplicas;

    /**
     * Details required to create data guard replicas for the catalog.
     *
     * @return the value
     */
    public java.util.List<CreateAutonomousCatalogReplicaDetails> getDataGuardReplicas() {
        return dataGuardReplicas;
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
        sb.append("CreateAutonomousCatalogDetails(");
        sb.append("super=").append(super.toString());
        sb.append("originalReplica=").append(String.valueOf(this.originalReplica));
        sb.append(", dataGuardReplicas=").append(String.valueOf(this.dataGuardReplicas));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAutonomousCatalogDetails)) {
            return false;
        }

        CreateAutonomousCatalogDetails other = (CreateAutonomousCatalogDetails) o;
        return java.util.Objects.equals(this.originalReplica, other.originalReplica)
                && java.util.Objects.equals(this.dataGuardReplicas, other.dataGuardReplicas)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.originalReplica == null ? 43 : this.originalReplica.hashCode());
        result =
                (result * PRIME)
                        + (this.dataGuardReplicas == null ? 43 : this.dataGuardReplicas.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
